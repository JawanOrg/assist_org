package com.free.assist.web.sys;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.free.assist.domain.SysRole;
import com.free.assist.domain.SysRoleExample;
import com.free.assist.service.sys.ISysRoleService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysRoleAction")
public class SysRoleAction extends BaseAction {
	@Autowired private ISysRoleService sysRoleService;

	
	/**
	 * 跳转到表的主页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysRoleManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/role/sysRoleManager.jsp");
	}
	
	/**
	 * 跳转到查询页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysRoleSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/role/sysRoleSrch.jsp");
	}
	
	
	/**
	 * 跳转到新增输入页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysRoleAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		//String RoleId=StringUtil.nullToEmptyOfObject(request.getParameter("RoleId"));

		return new ActionForward("/jsp/sys/role/sysRoleModuleAdd.jsp");
	}
	
	/**
	 * 跳转到查看页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysRoleView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String RoleId=StringUtil.nullToEmptyOfObject(request.getParameter("RoleId"));

		SysRole hma = new SysRole();
		
		return new ActionForward("/jsp/sys/role/sysRoleView.jsp");
	}
	
	
	/**
	 * 跳转到修改页面
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysRoleEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String RoleId=StringUtil.nullToEmptyOfObject(request.getParameter("RoleId"));

		SysRole hma = new SysRole();
		
		return new ActionForward("/jsp/sys/role/sysRoleEdit.jsp");
	}
	
	/**
	 *  DWR函数--新增一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysRole(SysRoleActionForm form) throws Exception {
		SysRole xi = new SysRole();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysRoleService.addDataSysRole(xi);
	}
	
	/**
	 * DWR函数--保存一条记录
	 * @param form
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysRole(SysRoleActionForm form) throws Exception {
		SysRole xi = new SysRole();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysRoleService.updateDataSysRole(xi);
	}
	
	/**
	 *  DWR函数--删除指定主键的记录
	 * @param ids--记录的主键，通过 ，号分隔
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysRole(String ids) throws Exception {
		return this.sysRoleService.deleteDataSysRole(ids);
	}
	
	/**
	 *  DWR函数--获取表一行记录的对象
	 * @param id--记录主键
	 * @return 
	 * @throws Exception
	 */
	public SysRole getDataSysRole(String id) throws Exception {
		SysRole xi = new SysRole();
		xi.setRoleid(id);
		xi = (SysRole) this.sysRoleService.selectByPrimaryKey(xi);
		return xi;
	}
	/**
	 * DWR函数--返回列表页面的字符串
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public String getSysRoleList(SysRoleActionForm form) throws Exception {
		SysRoleExample ex=new SysRoleExample();
		List list=this.sysRoleService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("ajaxPage", list);
		return wctx.forwardToString("/jsp/sys/role/sysRoleList.jsp");
	}
}
