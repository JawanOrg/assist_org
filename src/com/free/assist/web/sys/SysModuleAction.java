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

import com.free.assist.domain.SysModule;
import com.free.assist.domain.SysModuleExample;
import com.free.assist.domain.SysUnit;
import com.free.assist.service.sys.ISysRoleService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysModuleAction")
public class SysModuleAction extends BaseAction {
	@Autowired private ISysRoleService sysRoleService;

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
		
		String parentId=StringUtil.nullToEmptyOfObject(request.getParameter("id"));

		parentId = (parentId == null ? "0" : parentId);
		parentId = (parentId.equals("")? "0" : parentId);
		List nodeList=null;
		
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
			sb.append(this.makeTreeXMLWithType(nodeList));
		}
		sb.append("</tree>");
		out.println(sb.toString());
		//System.out.println("\n\n\n"+sb.toString()+"\n\n\n");
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
			SysModule model = (SysModule) obj;
			sb.append("<item child=\"" + model.getChildCount() + "\" text=\"" + model.getModuleName() + "\" id=\"" + model.getModuleId() + "\"></item>");
		}
		return sb.toString();
	}
		
	/**
	 * ��ת�������ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysModuleManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/role/sysModuleManager.jsp");
	}
	
	/**
	 * ��ת����ѯҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysModuleSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/role/sysModuleSrch.jsp");
	}
	
	
	/**
	 * ��ת����������ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysModuleAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
			    String moduleId=StringUtil.nullToEmptyOfObject(request.getParameter("moduleId"));
	
				SysModuleExample ex=new SysModuleExample();
				ex.createCriteria().andParentModuleidEqualTo("0");
				List<SysModule> list = this.sysRoleService.selectByExample(ex);
				request.setAttribute("list", list);
				if(moduleId.equals("-1")||moduleId.equals("")||moduleId.equals("0"))
				{
					request.setAttribute("parentModuleid", "0");
				} else { 
					SysModule hma = new SysModule();
					hma.setModuleId(moduleId);
					hma = (SysModule) this.sysRoleService.selectByPrimaryKey(hma);
					if(hma!=null) {
						request.setAttribute("parentModuleid",hma.getModuleId());
						//request.setAttribute("parentName", hma.getModuleName());
					}	
				}
		return new ActionForward("/jsp/sys/role/sysModuleAdd.jsp");
	}
	
	/**
	 * ��ת���鿴ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysModuleView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String moduleId=StringUtil.nullToEmptyOfObject(request.getParameter("moduleId"));

		SysModule hma = new SysModule();
		hma.setModuleId(moduleId);
		hma = (SysModule) this.sysRoleService.selectByPrimaryKey(hma);
		if(hma!=null) {
			if(StringUtil.nullToEmptyOfObject(hma.getParentName()).length()==0)
			{
				request.setAttribute("parentName", "----");
			} else {
				request.setAttribute("parentName", hma.getParentName());
			}
			request.setAttribute("parentModuleid","");
			request.setAttribute("sysModule", hma);
		}		
		return new ActionForward("/jsp/sys/role/sysModuleView.jsp");
	}
	
	
	/**
	 * ��ת���޸�ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysModuleEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String moduleId=StringUtil.nullToEmptyOfObject(request.getParameter("moduleId"));

		SysModule hma = new SysModule();
		hma.setModuleId(moduleId);
		hma = (SysModule) this.sysRoleService.selectByPrimaryKey(hma);
		SysModuleExample ex=new SysModuleExample();
		ex.createCriteria().andParentModuleidEqualTo("0").andModuleIdNotEqualTo(moduleId);
		List<SysModule> list = this.sysRoleService.selectByExample(ex);
		
		SysModuleExample smEx=new SysModuleExample();
		smEx.createCriteria().andParentModuleidEqualTo(moduleId);
		int childrenCount = this.sysRoleService.countChildrenDataSysModule(smEx);
		if(hma!=null) {
			if(StringUtil.nullToEmptyOfObject(hma.getParentName()).length()==0)
			{
				request.setAttribute("parentName", "----");
			} else {
				request.setAttribute("parentName", hma.getParentName());
			}
			//request.setAttribute("parentModuleid","");
			request.setAttribute("sysModule", hma);
		    request.setAttribute("list", list);
		    request.setAttribute("childrenCount", childrenCount);
		}		
		return new ActionForward("/jsp/sys/role/sysModuleEdit.jsp");
	}
	
	/**
	 *  DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String addDataSysModule(SysModuleActionForm form) throws Exception {
		SysModule xi = new SysModule();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysRoleService.addDataSysModule(xi);
	}
	
	/**
	 * DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String updateDataSysModule(SysModuleActionForm form) throws Exception {
		SysModule xi = new SysModule();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysRoleService.updateDataSysModule(xi);
	}
	
	/**
	 *  DWR����--ɾ��ָ�������ļ�¼
	 * @param ids--��¼��������ͨ�� ���ŷָ�
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String deleteDataSysModule(String ids) throws Exception {
		return this.sysRoleService.deleteDataSysModule(ids);
	}
	
	/**
	 *  DWR����--��ȡ��һ�м�¼�Ķ���
	 * @param id--��¼����
	 * @return 
	 * @throws Exception
	 */
	public SysModule getDataSysModule(String id) throws Exception {
		SysModule xi = new SysModule();
		xi.setModuleId(id);
		xi = (SysModule) this.sysRoleService.selectByPrimaryKey(xi);
		return xi;
	}
	/**
	 * DWR����--�����б�ҳ����ַ���
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public String getSysModuleList(SysModuleActionForm form) throws Exception {
		SysModuleExample ex=new SysModuleExample();
		List list=this.sysRoleService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("ajaxPage", list);
		return wctx.forwardToString("/jsp/sys/role/sysModuleList.jsp");
	}
	
	public List getSysParentModuleList()throws Exception{
		SysModuleExample ex=new SysModuleExample();
		ex.createCriteria().andParentModuleidEqualTo("0");
		List<SysModule> list = this.sysRoleService.selectByExample(ex);
		return list;
	}
}
