package com.free.assist.web.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicConfigExample.Criteria;
import com.free.assist.service.sys.ISysDicService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysDicConfigAction")
public class SysDicConfigAction extends BaseAction {
	@Autowired private ISysDicService sysDicService;

	
	/**
	 * ��ת�������ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicConfigManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/dic/sysDicConfigManager.jsp");
	}
	
	/**
	 * ��ת����ѯҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicConfigSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/dic/sysDicConfigSrch.jsp");
	}
	
	
	/**
	 * ��ת����������ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicConfigAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		//String DictionaryId=StringUtil.nullToEmptyOfObject(request.getParameter("DictionaryId"));

		return new ActionForward("/jsp/sys/dic/toSysDicConfigAdd.jsp");
	}
	
	/**
	 * ��ת���鿴ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicConfigView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String DictionaryId=StringUtil.nullToEmptyOfObject(request.getParameter("DictionaryId"));

		SysDicConfig hma = new SysDicConfig();
		
		return new ActionForward("/jsp/sys/dic/sysDicConfigView.jsp");
	}
	
	
	/**
	 * ��ת���޸�ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysDicConfigEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String DictionaryId=StringUtil.nullToEmptyOfObject(request.getParameter("DictionaryId"));

		SysDicConfig hma = new SysDicConfig();
		
		return new ActionForward("/jsp/sys/dic/sysDicConfigEdit.jsp");
	}
	
	/**
	 *  DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String addDataSysDicConfig(SysDicConfigActionForm form) throws Exception {
		SysDicConfig xi = new SysDicConfig();
		ObjectUtil.copyObjectToObject(form, xi);
		xi.setIsValid("Y");
		return this.sysDicService.addDataSysDicConfig(xi);
	}
	
	/**
	 * DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String updateDataSysDicConfig(SysDicConfigActionForm form) throws Exception {
		SysDicConfig xi = new SysDicConfig();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysDicService.updateDataSysDicConfig(xi);
	}
	
	/**
	 *  DWR����--ɾ��ָ�������ļ�¼
	 * @param ids--��¼��������ͨ�� ���ŷָ�
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String deleteDataSysDicConfig(String ids) throws Exception {
		return this.sysDicService.deleteDataSysDicConfig(ids);
	}
	
	/**
	 *  DWR����--��ȡ��һ�м�¼�Ķ���
	 * @param id--��¼����
	 * @return 
	 * @throws Exception
	 */
	public SysDicConfig getDataSysDicConfig(String id) throws Exception {
		SysDicConfig xi = new SysDicConfig();
		xi.setDictionaryId(id);
		xi = (SysDicConfig) this.sysDicService.selectByPrimaryKey(xi);
		return xi;
	}
	/**
	 * DWR����--�����б�ҳ����ַ���
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public String getSysDicConfigList(SysDicConfigActionForm form) throws Exception {
		SysDicConfigExample ex=new SysDicConfigExample();
		Criteria criteria = ex.createCriteria();
		if(form!=null) {
			if(form.getDictionaryName()!=null && !"".equals(form.getDictionaryName())) {
				criteria.andDictionaryNameEqualTo(form.getDictionaryName().trim());
			}
			if(form.getDictionaryCode()!=null && !"".equals(form.getDictionaryCode())) {
				criteria.andDictionaryCodeEqualTo(form.getDictionaryCode().trim());
			}
		}
		criteria.andIsValidEqualTo("Y");
		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		List list=this.sysDicService.selectByExample(ex,ex.getSkipResults(),ex.getMaxResults());
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("ajaxPage", list);
		return wctx.forwardToString("/jsp/sys/dic/sysDicConfigList.jsp");
	}
	
	public ActionForward showSysDicItemByDictionaryId(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String dictionaryId = request.getParameter("dictionaryId");
		return new ActionForward("/jsp/sys/dic/sysDicItemSrchByDicId.jsp?dictionaryId="+dictionaryId);
	}
	
}
