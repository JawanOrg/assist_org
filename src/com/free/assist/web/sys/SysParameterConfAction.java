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

import com.free.assist.domain.SysParameterConf;
import com.free.assist.domain.SysParameterConfExample;
import com.free.assist.service.sys.ISysParameterConfService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;


@Controller("/sys/sysParameterConfAction")
public class SysParameterConfAction extends BaseAction {
	@Autowired private ISysParameterConfService sysParameterConfService;

	
	/**
	 * ��ת�������ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysParameterConfManager(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/par/sysParameterConfManager.jsp");
	}
	
	/**
	 * ��ת����ѯҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysParameterConfSrch(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) {
		return new ActionForward("/jsp/sys/par/sysParameterConfSrch.jsp");
	}
	
	
	/**
	 * ��ת����������ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysParameterConfAdd(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String parId=StringUtil.nullToEmptyOfObject(request.getParameter("parId"));
		
		if(parId.equals("-1")||parId.equals("")||parId.equals("0"))
		{

			request.setAttribute("parName", "");
			request.setAttribute("parValue", "");
			request.setAttribute("isValid", "");
			request.setAttribute("remark", "");
		} else {
			SysParameterConf hma = new SysParameterConf();
			hma.setParId(parId);
			hma = (SysParameterConf) this.sysParameterConfService.selectByPrimaryKey(hma);
			if(hma!=null) {
				request.setAttribute("parId", hma.getParId());
				request.setAttribute("parName", hma.getParName());
				request.setAttribute("parValue", hma.getParValue());
				request.setAttribute("isValid", hma.getIsValid());
				request.setAttribute("remark", hma.getParDesc());
			}
		}

		return new ActionForward("/jsp/sys/par/sysParameterConfAdd.jsp");
	}
	
	/**
	 * ��ת���鿴ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysParameterConfView(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String parId=StringUtil.nullToEmptyOfObject(request.getParameter("parId"));

		SysParameterConf hma = new SysParameterConf();
		hma.setParId(parId);
		hma = (SysParameterConf) this.sysParameterConfService.selectByPrimaryKey(hma);
		if(hma!=null) {
			
			request.setAttribute("parId", hma.getParId());
			request.setAttribute("parName", hma.getParName());
			request.setAttribute("parValue", hma.getParValue());
			request.setAttribute("isValid", hma.getIsValid());
			//request.setAttribute("isValidName", hma.getIsValidName());
			request.setAttribute("remark", hma.getParDesc());
		}		
		
		return new ActionForward("/jsp/sys/par/sysParameterConfView.jsp");
	}
	
	
	/**
	 * ��ת���޸�ҳ��
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toSysParameterConfEdit(ActionMapping mapping, ActionForm actionform, 
			HttpServletRequest request, HttpServletResponse response) {
		String parId=StringUtil.nullToEmptyOfObject(request.getParameter("parId"));

		SysParameterConf hma = new SysParameterConf();
		hma.setParId(parId);
		hma = (SysParameterConf) this.sysParameterConfService.selectByPrimaryKey(hma);
		request.setAttribute("sysParameterConf", hma);
		
		return new ActionForward("/jsp/sys/par/sysParameterConfEdit.jsp");
	}
	
	/**
	 *  DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String addDataSysParameterConf(SysParameterConfActionForm form) throws Exception {
		SysParameterConf xi = new SysParameterConf();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysParameterConfService.addDataSysParameterConf(xi);
	}
	
	/**
	 * DWR����--����һ����¼
	 * @param form
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String updateDataSysParameterConf(SysParameterConfActionForm form) throws Exception {
		SysParameterConf xi = new SysParameterConf();
		ObjectUtil.copyObjectToObject(form, xi);
		return this.sysParameterConfService.updateDataSysParameterConf(xi);
	}
	
	/**
	 *  DWR����--ɾ��ָ�������ļ�¼
	 * @param ids--��¼��������ͨ�� ���ŷָ�
	 * @return ������ʾ���ִ�Ϊ""��ʾ��ȷִ��
	 * @throws Exception
	 */
	public String deleteDataSysParameterConf(String ids) throws Exception {
		return this.sysParameterConfService.deleteDataSysParameterConf(ids);
	}
	
	/**
	 *  DWR����--��ȡ��һ�м�¼�Ķ���
	 * @param id--��¼����
	 * @return 
	 * @throws Exception
	 */
	public SysParameterConf getDataSysParameterConf(String id) throws Exception {
		SysParameterConf xi = new SysParameterConf();
		xi.setParId(id);
		xi = (SysParameterConf) this.sysParameterConfService.selectByPrimaryKey(xi);
		return xi;
	}
	/**
	 * DWR����--�����б�ҳ����ַ���
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public String getSysParameterConfList(SysParameterConfActionForm form) throws Exception {
		SysParameterConfExample ex=new SysParameterConfExample();
		List list=this.sysParameterConfService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("parameterList", list);
		return wctx.forwardToString("/jsp/sys/par/sysParameterConfList.jsp");
	}
}
