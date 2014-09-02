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
	 * ��ת�������ҳ��
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
	 * ��ת����ѯҳ��
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
	 * ��ת����������ҳ��
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
	 * ��ת���鿴ҳ��
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
	 * ��ת���޸�ҳ��
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
	 *  DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String addDataSysUser(SysUserActionForm form) throws Exception {
		SysUser xi = new SysUser();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysUnitService.addDataSysUser(xi);
	}
	
	/**
	 * DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String updateDataSysUser(SysUserActionForm form) throws Exception {
		SysUser xi = new SysUser();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysUnitService.updateDataSysUser(xi);
	}
	
	/**
	 *  DWR����--ɾ��ָ�������ļ�¼
	 * @param ids--��¼��������ͨ�� ���ŷָ�
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String deleteDataSysUser(String ids) throws Exception {
		return this.sysUnitService.deleteDataSysUser(ids);
	}
	
	/**
	 *  DWR����--��ȡ��һ�м�¼�Ķ���
	 * @param id--��¼����
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
	 * DWR����--�����б�ҳ����ַ���
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
