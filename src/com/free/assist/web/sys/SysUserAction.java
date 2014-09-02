package com.free.assist.web.sys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserExample;
import com.free.assist.service.sys.ISysUnitService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysUserAction")
public class SysUserAction extends BaseAction {
	@Autowired private ISysUnitService sysUnitService;

	
	/**
	 * 跳转到表的主页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUserManager.jsp");
	}
	
	/**
	 * 跳转到查询页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUserSrch.jsp");
	}
	
	
	/**
	 * 跳转到新增输入页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String userId=StringUtil.nullToEmptyOfObject(request.getParameter("userId"));

		return new ActionForward("/jsp/sys/unit/sysUserAdd.jsp");
	}
	
	/**
	 * 跳转到查看页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String userId=StringUtil.nullToEmptyOfObject(request.getParameter("userId"));

		SysUser hma = new SysUser();
		
		return new ActionForward("/jsp/sys/unit/sysUserView.jsp");
	}
	
	
	/**
	 * 跳转到修改页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String userId=StringUtil.nullToEmptyOfObject(request.getParameter("userId"));

		SysUser hma = new SysUser();
		
		return new ActionForward("/jsp/sys/unit/sysUserEdit.jsp");
	}
	
	/**
	 *  DWR函数--新增一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysUser(SysUserActionForm form) throws Exception {
		SysUser xi = new SysUser();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysUnitService.addDataSysUser(xi);
	}
	
	/**
	 * DWR函数--保存一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysUser(SysUserActionForm form) throws Exception {
		SysUser xi = new SysUser();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysUnitService.updateDataSysUser(xi);
	}
	
	/**
	 *  DWR函数--删除指定主键的记录
	 * @param ids--记录的主键，通过 ，号分隔
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysUser(String ids) throws Exception {
		return this.sysUnitService.deleteDataSysUser(ids);
	}
	
	/**
	 *  DWR函数--获取表一行记录的对象
	 * @param id--记录主键
	 * @return 
	 * @throws Exception
	 */
	public SysUser getDataSysUser(String id) throws Exception {
		SysUser xi = new SysUser();
		xi.setUserId(id);
		xi = (SysUser) this.sysUnitService.selectByPrimaryKey(xi);
		return xi;
	}
	/**
	 * DWR函数--返回列表页面的字符串
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public String getSysUserList(SysUserActionForm form) throws Exception {
		SysUserExample ex=new SysUserExample();
		List list=this.sysUnitService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("ajaxPage", list);
		return wctx.forwardToString("/jsp/sys/unit/sysUserList.jsp");
	}
}
