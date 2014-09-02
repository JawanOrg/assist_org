package com.free.assist.web.iface;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.IfaceLogRepairMixedExample;
import com.free.assist.domain.IfaceLogRepairMixedWithBLOBs;
import com.free.assist.domain.IfaceLogRepairWithBLOBs;
import com.free.assist.domain.IfaceLogRepairMixedExample.Criteria;
import com.free.assist.service.iface.IfaceLogFacade;
import com.free.assist.util.DateUtil;
import com.free.assist.web.BaseAction;

@Controller("/iface/ifaceLoggerFaultAction")
public class IfaceLoggerFaultAction extends BaseAction {
	
	@Resource private IfaceLogFacade ifaceLogFacade;

	/**
	 * 日志信息初始化
	 * @author  x :Oct 14, 2009
	 */
	public ActionForward ifaceLogFacadeInit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new ActionForward("/jsp/iface/ifaceLoggerFaultSrch.jsp");
	}
	
	public List<IfaceLogRepairMixedWithBLOBs> findDataRepair(IfaceLogRepairMixedExample example) {
		example.setSkipResults(example.getSkipResults());
		example.setMaxResults(example.getMaxResults());
		List<IfaceLogRepairMixedWithBLOBs> list = this.ifaceLogFacade.findRepair(example);
		return list;
	}
	
	/**
	 * 初始化时，根据查询条件列出日志管理信息列表
	 * @author gms:Sep 29, 2009
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getIfaceLogRepairList(IfaceLoggerFaultActionForm form) throws ServletException, IOException {
		IfaceLogRepairMixedExample example = new IfaceLogRepairMixedExample();
		Criteria criteria = example.createCriteria();
		if(form!=null) {
			//接口名称
			if(form.getApplicationName()!=null && !"".equals(form.getApplicationName())) {
				criteria.andApplicationNameEqualTo(form.getApplicationName().trim());
			}
			//故障原因
			if(form.getFaultCause()!=null && !"".equals(form.getFaultCause())) {
				criteria.andFaultCauseEqualTo(form.getFaultCause().trim());
			}
			//修复人
			if(form.getRepairUser()!=null && !"".equals(form.getRepairUser())) {
				criteria.andRepairUserEqualTo(form.getRepairUser().trim());
			}
		}
		example.setSkipResults(form.getSkipResults());
		example.setMaxResults(form.getMaxResults());
		List<IfaceLogRepairMixedWithBLOBs> list = this.findDataRepair(example);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		if(list!=null && list.size()>0) {
			request.setAttribute("ifaceLogRepairList", list);
		}
		
		return wctx.forwardToString("/jsp/iface/ifaceLoggerFaultList.jsp");
	}
	
	public String[] getIfaceApplicationNameList() {
		String strs[];
		String rntStrs[];
		IfaceConfigSystemExample ex = new IfaceConfigSystemExample();
		ex.createCriteria().andAvailableEqualTo("Y");
		//调用findApplication方法需要用到忽略记录行数和一页最大记录行数，建议重构一个重名方法
		ex.setSkipResults(0);
		ex.setMaxResults(100);
		List<IfaceConfigSystem> ifaceApplicationList = ifaceLogFacade.selectByExample(ex);
		if(ifaceApplicationList!=null && ifaceApplicationList.size()>0) {
			strs = new String[ifaceApplicationList.size()+1];
			for(int i=0;i<ifaceApplicationList.size();i++) {
				IfaceConfigSystem ifaceApplication = ifaceApplicationList.get(i);
				if(ifaceApplication.getApplicationName()!=null && !"".equals(ifaceApplication.getApplicationName())) {
					strs[i+1] = ifaceApplication.getApplicationName().trim();
				}
			}
			if(strs!=null) {
				strs[0] = "";
			}
			return strs;
		}
		return null;
	}
	
	/**
	 * 取得日志信息列表的其中一条详细情况
	 * @author gms:Sep 29, 2009
	 * @param repositoryId
	 * @return
	 */
	public IfaceLogRepairMixedWithBLOBs getIfaceLogTrace(String repositoryId) {
		IfaceLogRepairMixedExample example = new IfaceLogRepairMixedExample();
		if(repositoryId!=null && !"".equals(repositoryId)) {
			example.createCriteria().andRepositoryIdEqualTo(repositoryId.trim());
			List<IfaceLogRepairMixedWithBLOBs> list = this.findDataRepair(example);
			if(list!=null && list.size()==1) {
				IfaceLogRepairMixedWithBLOBs ifaceLogRepairMixedWithBLOBs = list.get(0);
				return ifaceLogRepairMixedWithBLOBs;
			}
		}
		
		return null;
	}
	
	/**
	 * 对日志信息列表中的一条详细情况进行更新操作
	 * @author gms:Sep 29, 2009
	 * @param form
	 */
	public void updateIfaceLogRepair(IfaceLoggerFaultActionForm form) {
		IfaceLogRepairWithBLOBs ifaceLogRepairWithBLOBs = new IfaceLogRepairWithBLOBs();
		if(form!=null) {
			//日志标识
			ifaceLogRepairWithBLOBs.setRepositoryId(form.getRepositoryId());
			//修复人
			ifaceLogRepairWithBLOBs.setRepairUser(form.getRepairUser());
			//修复时间
			ifaceLogRepairWithBLOBs.setRepairDate(DateUtil.toDateByFormat(form.getRepairDate(),"yyyy-MM-dd"));
			//故障原因
			ifaceLogRepairWithBLOBs.setFaultCause(form.getFaultCause());
			//故障描述
			ifaceLogRepairWithBLOBs.setFaultDescription(form.getFaultDescription());
			//修复标识
			ifaceLogRepairWithBLOBs.setRepairId(form.getRepairId());
		}
		this.ifaceLogFacade.repair(ifaceLogRepairWithBLOBs);
	}

}
