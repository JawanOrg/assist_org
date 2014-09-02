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

import com.free.assist.domain.SysModuleExample;
import com.free.assist.domain.SysRole;
import com.free.assist.domain.SysRoleExample;
import com.free.assist.domain.SysRoleModule;
import com.free.assist.domain.SysUnit;
import com.free.assist.domain.SysUnitExample;
import com.free.assist.domain.SysUnitRole;
import com.free.assist.domain.SysUnitRoleExample;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserRole;
import com.free.assist.domain.SysUserRoleExample;
import com.free.assist.domain.SysUserUnit;
import com.free.assist.domain.SysUserUnitExample;
import com.free.assist.service.sys.ISysRoleService;
import com.free.assist.service.sys.ISysUnitService;
import com.free.assist.util.Helper;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysRoleModuleAction")
public class SysRoleModuleAction extends BaseAction {
	@Autowired private ISysRoleService sysRoleService;
	@Autowired private ISysUnitService sysUnitService;
	
	/**
	 * ���ݸ��ڵ�ȡ���ӽڵ��б� ������DHTML TREE��XML 
	 * @param mapping
	 * @param actionForm
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @throws RegaltecException
	 * @throws IOException
	 */
	public ActionForward showTreeWithType(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String parentId= StringUtil.nullToEmptyOfObject(request.getParameter("id"));

		List nodeList=null;
		
		SysRoleExample example=new SysRoleExample();
		example.setOrderByClause(" Sort_Order");
		
		nodeList = this.sysRoleService.selectByExample(example);
		
		response.setContentType("text/xml; charset=GBK");
		response.setHeader("Cache-Control", "no-cache");

		PrintWriter out = response.getWriter();
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version='1.0' encoding='GBK'?>\n");
		sb.append("<tree id=\"" + parentId + "\">");
		if (nodeList != null && nodeList.size() > 0) {
			sb.append(this.makeTreeXMLWithType(nodeList));
		}
		sb.append("</tree>");
		out.println(sb.toString());
		System.out.println("\n\n\n"+sb.toString()+"\n\n\n");
		return null;
	}

	/**
	 * �������ڵ��XML�ַ���
	 * @param nodeList
	 * @return
	 */
	private String makeTreeXMLWithType(List nodeList) {
		StringBuffer sb = new StringBuffer();
		for (Object obj : nodeList) {
			SysRole model = (SysRole) obj;
			sb.append("<item child=\"" + "0" + "\" text=\"" + model.getRolename() + "\" id=\"" + model.getRoleid() + "\"></item>");
		}
		return sb.toString();
	}
	
	/**
	 * ����ģ�鸸�ڵ�ȡ���ӽڵ��б� ������DHTML TREE��XML 
	 * @param mapping
	 * @param actionForm
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @throws RegaltecException
	 * @throws IOException
	 */
	public ActionForward showModuleTreeWithType(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String parentId= StringUtil.nullToEmptyOfObject(request.getParameter("id"));
		String roleId = StringUtil.nullToEmptyOfObject(request.getParameter("roleId"));

		parentId = (parentId == null ? "0" : parentId);
		parentId = (parentId.equals("")? "0" : parentId);
		List<SysRoleModule> nodeList=null;
		
		SysModuleExample example=new SysModuleExample();
		example.createCriteria().andParentModuleidEqualTo(parentId);
		example.setOrderByClause(" Sort_Order");
		
		nodeList = this.sysRoleService.selectByExample(example);
		
		response.setContentType("text/xml; charset=GBK");
		response.setHeader("Cache-Control", "no-cache");

		PrintWriter out = response.getWriter();
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version='1.0' encoding='GBK'?>\n");
		sb.append("<tree id=\"" + parentId + "\">");
		if (nodeList != null && nodeList.size() > 0) {
			sb.append(this.sysRoleService.makeModuleTreeXMLWithType(nodeList, roleId));
		}
		sb.append("</tree>");
		out.println(sb.toString());
		System.out.println("\n\n\n"+sb.toString()+"\n\n\n");
		return null;
	}

	
	/**
	 * ȡ��Ȩ�����λ��Ա��
	 *
	 * @param mapping
	 * @param actionForm
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	public ActionForward showUserUnitTreeWithType(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String roleId = StringUtil.nullToEmptyOfObject(request.getParameter("roleId"));
		String id = request.getParameter("id") == null ? "0" : request.getParameter("id");
		String[] ids = Helper.split(id, "|");
		String queryId = id;
		List unitNodeList = null;
		List userNodeList = null;
	//	String type = "";
		String parentType = "";
		if (ids.length >= 2) {
			parentType = ids[1];
			queryId = ids[0];
		}
		if (id.equals("0")) {
			SysUnitExample unitExample = new SysUnitExample();
			unitExample.createCriteria().andParentUnitidEqualTo("0").andIsValidEqualTo("Y");
			unitExample.setOrderByClause(" Sort_Order");
			unitNodeList = sysUnitService.selectByExample(unitExample);
		} else if (parentType.equals("application")) {
			SysUnitExample unitExample = new SysUnitExample();
			unitExample.createCriteria().andParentUnitidEqualTo(queryId).andIsValidEqualTo("Y");
			unitExample.setOrderByClause(" Sort_Order");			
			unitNodeList = sysUnitService.selectByExample(unitExample);
			SysUserUnitExample userUnitExample = new SysUserUnitExample();
			userUnitExample.createCriteria().andUnitIdEqualTo(queryId);
			userNodeList = sysUnitService.selectByExample(userUnitExample);
		} 
		response.setContentType("text/xml; charset=GBK");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version='1.0' encoding='GBK'?>\n");

		sb.append("<tree id=\"" + id + "\">");
		if ((unitNodeList != null && unitNodeList.size() > 0)||(userNodeList != null && userNodeList.size() > 0)) {
			sb.append(this.sysRoleService.makeUserUnitTreeWithType(unitNodeList, userNodeList, roleId));
		}
		sb.append("</tree>");
		out.println(sb.toString());
		System.out.println("\n\n\n"+sb.toString()+"\n\n\n");
		return null;
	}	
		
	/**
	 * ��ת�������ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserUnitManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUserUnitManager.jsp");
	}
	
	/**
	 * ��ת����ѯҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysUserUnitSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/unit/sysUserUnitSrch.jsp");
	}
	
	
	/**
	 * ��ת����������ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysRoleModuleAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/role/sysRoleModuleAdd.jsp");
	}
	
	/**
	 * ��ת���鿴ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysRoleModuleView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String roleId=StringUtil.nullToEmptyOfObject(request.getParameter("roleId"));
		
		SysUnitRoleExample surExample = new SysUnitRoleExample();
		surExample.createCriteria().andRoleIdEqualTo(roleId);
		List surList = this.sysRoleService.selectDataSysUnitRole(surExample);
		
		SysUserRoleExample suserrExample = new SysUserRoleExample();
		suserrExample.createCriteria().andRoleIdEqualTo(roleId);
		List suserrList = this.sysRoleService.selectDataSysUserRole(suserrExample);
		
		StringBuilder  checkNames = new StringBuilder();
		for(Object obj : surList){
			SysUnitRole model = (SysUnitRole) obj;
			SysUnit sut = new SysUnit();
			sut.setUnitId(model.getUnitId());
			sut = (SysUnit) this.sysUnitService.selectByPrimaryKey(sut);
			checkNames.append(sut.getUnitName()).append(",");
		}
		for(Object obj : suserrList){
			SysUserRole model = (SysUserRole) obj;
			SysUser sur = new SysUser();
			sur.setUserId(model.getUserId());
			sur = (SysUser) this.sysUnitService.selectByPrimaryKey(sur);
			checkNames.append(sur.getUserName()).append(",");
		}
		request.setAttribute("checkNames", checkNames.toString());
		
		
		
		SysRole hma = new SysRole();
		hma.setRoleid(roleId);
		hma = (SysRole) this.sysRoleService.selectByPrimaryKey(hma);
		if(hma!=null) {
			request.setAttribute("sysRole", hma);
		}
		return new ActionForward("/jsp/sys/role/sysRoleModuleView.jsp");
	}
	
	
	/**
	 * ��ת���޸�ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysRoleModuleEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String roleId=StringUtil.nullToEmptyOfObject(request.getParameter("roleId"));

		SysUnitRoleExample surExample = new SysUnitRoleExample();
		surExample.createCriteria().andRoleIdEqualTo(roleId);
		List surList = this.sysRoleService.selectDataSysUnitRole(surExample);
		
		SysUserRoleExample suserrExample = new SysUserRoleExample();
		suserrExample.createCriteria().andRoleIdEqualTo(roleId);
		List suserrList = this.sysRoleService.selectDataSysUserRole(suserrExample);
		
		StringBuilder  checkNames = new StringBuilder();
		for(Object obj : surList){
			SysUnitRole model = (SysUnitRole) obj;
			SysUnit sut = new SysUnit();
			sut.setUnitId(model.getUnitId());
			sut = (SysUnit) this.sysUnitService.selectByPrimaryKey(sut);
			checkNames.append(sut.getUnitName()).append(",");
		}
		for(Object obj : suserrList){
			SysUserRole model = (SysUserRole) obj;
			SysUser sur = new SysUser();
			sur.setUserId(model.getUserId());
			sur = (SysUser) this.sysUnitService.selectByPrimaryKey(sur);
			checkNames.append(sur.getUserName()).append(",");
		}
		request.setAttribute("checkNames", checkNames.toString());
		
		SysRole hma = new SysRole();
		hma.setRoleid(roleId);
		hma = (SysRole) this.sysRoleService.selectByPrimaryKey(hma);
		if(hma!=null) {
			request.setAttribute("sysRole", hma);
		}		
		return new ActionForward("/jsp/sys/role/sysRoleModuleEdit.jsp");
	}
	
	/**
	 *  DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String addDataSysRole(SysRoleModuleActionForm form) throws Exception {
		SysRole xi = new SysRole();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysRoleService.addDataSysRole(xi);
	}
	
	/**
	 * DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String updateDataSysRoleModule(SysRoleModuleActionForm form, String ResultOfshowModalDialog) throws Exception {
		SysRoleModule xi = new SysRoleModule();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysRoleService.updateDataSysRoleModule(xi,ResultOfshowModalDialog);
	}
	
	/**
	 *  DWR����--ɾ��ָ�������ļ�¼
	 * @param ids--��¼��������ͨ�� ���ŷָ�
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String deleteDataSysRoleModule(String roleId) throws Exception {
		return this.sysRoleService.deleteDataSysRoleModule(roleId);
	}
	
	/**
	 *  DWR����--��ȡ��һ�м�¼�Ķ���
	 * @param id--��¼����
	 * @return 
	 * @throws Exception
	 */
	public SysUserUnit getDataSysRole(String id) throws Exception {
		SysUserUnit xi = new SysUserUnit();
		return xi;
	}
	/**
	 * DWR����--�����б�ҳ����ַ���
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public String getSysUserUnitList(SysUserUnitActionForm form) throws Exception {
		String unitId=StringUtil.nullToEmptyOfObject(form.getUnitId());
		SysUserUnitExample ex=new SysUserUnitExample();
		ex.createCriteria().andUnitIdEqualTo(unitId);
		List list=this.sysRoleService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("ajaxPage", list);
		return wctx.forwardToString("/jsp/sys/unit/sysUserUnitList.jsp");
	}
}
