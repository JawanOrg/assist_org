package com.free.assist.web.sys;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SysModule;
import com.free.assist.domain.SysModuleExample;
import com.free.assist.domain.SysRoleModuleExample;
import com.free.assist.domain.SysRoleModuleKey;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserExample;
import com.free.assist.domain.SysUserRoleExample;
import com.free.assist.domain.SysUserRoleKey;
import com.free.assist.service.sys.ISysLoginService;
import com.free.assist.util.MD5;
import com.free.assist.util.RandomValidateCode;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;

@Controller("/sys/loginAction")
public class LoginAction extends BaseAction {
	private ISysLoginService sysLoginService;

	@Autowired
	public void setSysLoginService(ISysLoginService sysLoginService) {
		this.sysLoginService = sysLoginService;
	}

	/**
	 * 校验，取得登陆信息
	 * 
	 * @param form
	 * @return
	 */
	public String checkin(LoginForm form) {
		String msg = "";
		HttpSession session = super.getSessionByDWR();
		if (form.getValidatecode() == null || form.getValidatecode().trim().length() == 0 || (session != null && session.getAttribute(RandomValidateCode.RANDOMCODEKEY) != null && !form.getValidatecode().trim().toUpperCase().equals(session.getAttribute(RandomValidateCode.RANDOMCODEKEY).toString()))) {
			msg = "验证码错误，请重新输入！";
		} else {
			SysUserExample ex = new SysUserExample();
			ex.createCriteria().andLoginPasswordEqualTo(MD5.encode(form.getLoginPassword())).andLoginNameEqualTo(form.getLoginName());
			List list = sysLoginService.selectByExample(ex);
			if (list == null || list.size() == 0) {
				msg = "用户名密码错误，请重新输入！";
			} else {
				SysUser user = (SysUser) list.get(0);
				session.setAttribute("currentUser", user);

			}
		}
		return msg;
	}

	/**
	 * 取得校验信息登陆界面
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward checkLogin(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		SysUser user = (SysUser) session.getAttribute("currentUser");
		if (user != null) {
			Cookie cookie = new Cookie("jforumSSOCookieNameUser", user.getUserId());
			cookie.setMaxAge(-1);
			cookie.setPath("/");
			response.addCookie(cookie);
			return new ActionForward("/jsp/common/homePage.jsp");
		} else {
			return new ActionForward("/index.jsp");
		}
	}

	/**
	 * 取得左边的拥有权限的模块菜单
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward showModule(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		SysUser currentUser = (SysUser) request.getSession().getAttribute("currentUser");
		List roleList = new ArrayList();
		if (!currentUser.getLoginName().equals("sa")) {
			SysUserRoleExample roleEx = new SysUserRoleExample();
			roleEx.createCriteria().andUserIdEqualTo(currentUser.getUserId());
			List<SysUserRoleKey> rolelist = sysLoginService.selectByExample(roleEx);
			List list = new ArrayList();
			list.add("-100000");
			for (SysUserRoleKey s : rolelist) {
				list.add(s.getRoleId());
			}
			SysRoleModuleExample roleModuleEx = new SysRoleModuleExample();
			roleModuleEx.createCriteria().andRoleidIn(list);
			List<SysRoleModuleKey> roleModuleList = sysLoginService.selectByExample(roleModuleEx);
			roleList.add("-100000");
			if (roleModuleList != null && roleModuleList.size() > 0) {
				for (SysRoleModuleKey d : roleModuleList) {
					roleList.add(d.getRightid());
				}
			}
		}
		// 取得顶层节点
		SysModuleExample ex = new SysModuleExample();
		if (!currentUser.getLoginName().equals("sa")) {
			ex.createCriteria().andParentModuleidEqualTo("0").andIsLeafEqualTo("N").andModuleIdIn(roleList).andIsValidEqualTo("Y");
		} else {
			ex.createCriteria().andParentModuleidEqualTo("0").andIsLeafEqualTo("N").andIsValidEqualTo("Y");
		}
		ex.setOrderByClause(" Sort_Order asc");
		List<SysModule> nodeModelList = sysLoginService.selectByExample(ex);
		StringBuilder stringBuilder = new StringBuilder("[");
		for (SysModule sm : nodeModelList) {
			stringBuilder.append("'").append(sm.getModuleName()).append("',");
			ex = new SysModuleExample();
			if (!currentUser.getLoginName().equals("sa")) {
				ex.createCriteria().andParentModuleidEqualTo(sm.getModuleId()).andIsLeafEqualTo("Y").andModuleIdIn(roleList).andIsValidEqualTo("Y");
			} else {
				ex.createCriteria().andParentModuleidEqualTo(sm.getModuleId()).andIsLeafEqualTo("Y").andIsValidEqualTo("Y");
			}
			ex.setOrderByClause(" Sort_Order asc");
			List leafList = sysLoginService.selectByExample(ex);
			sm.setSysModuleList(leafList);
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		stringBuilder.append("]");
		request.setAttribute("strModuleList", stringBuilder.toString());
		request.setAttribute("moduleList", nodeModelList);
		return new ActionForward("/jsp/common/left.jsp");
	}

	/**
	 * 修改密码
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String changePassWord(LoginForm form) {
		String msg = "";
		HttpSession session = super.getSessionByDWR();
		SysUser user = (SysUser) session.getAttribute("currentUser");
		String loginPassword = StringUtil.nullToEmptyOfObject(user.getLoginPassword());
		if (!loginPassword.equals(MD5.encode(form.getLoginPassword()))) {
			return "旧密码错误，请重新输入！";
		} else {
			user.setLoginPassword(MD5.encode(form.getNewPassword()));
			session.setAttribute("currentUser", user);
			SysUser newModel = new SysUser();
			newModel.setUserId(user.getUserId());
			newModel.setLoginPassword(MD5.encode(form.getNewPassword()));
			sysLoginService.updateByPrimaryKeySelective(newModel);
		}
		return msg;
	}

	public ActionForward logout(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Cookie cookie = new Cookie("jforumSSOCookieNameUser", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		return new ActionForward("/index.jsp");
	}
}
