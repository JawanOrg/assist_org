package com.free.assist.web.business;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsExample;
import com.free.assist.domain.BusReleaseTrendsKey;
import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptActionExample;
import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SuptAttachExample;
import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SuptTaskExample;
import com.free.assist.domain.SysUser;
import com.free.assist.service.business.DynamicOperateService;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.util.ChartHelper;
import com.free.assist.util.Constant;
import com.free.assist.util.MapUtil;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;

@Controller("/business/dynamicAction")
public class DynamicAction extends BaseAction {
	@Resource
	private DynamicOperateService dynamicOperateService;
	@Resource
	private CommonOperateService commonOperateService;

	public ActionForward init(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("billId", dynamicOperateService.buildGUID());
		return new ActionForward("/jsp/dynamic/create.jsp");
	}

	public String accept(DynamicForm form) throws Exception {
		if (Constant.REPAIR_TYPE_EMERGENCY.equals(form.getRepairType())) {
			form.setIsNeedGovernment(null);
		}
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusReleaseTrends busRelease = new BusReleaseTrends();
		ObjectUtil.copyObjectToObject(form, busRelease);
		SuptAction action = new SuptAction(currentUser);
		return dynamicOperateService.create(busRelease, action);
	}

	public String querySimilarly(DynamicForm form) throws Exception {
		BusReleaseTrendsExample ex = new BusReleaseTrendsExample();
		com.free.assist.domain.BusReleaseTrendsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getRoad()) && StringUtils.isNotBlank(form.getTheTitle())) {
			cr.andRoadLike("%" + form.getRoad() + "%");
		} else if (StringUtils.isBlank(form.getRoad()) && StringUtils.isNotBlank(form.getTheTitle())) {
			cr.andTheTitleLike("%" + form.getTheTitle() + "%");
		}
		if (StringUtils.isNotBlank(form.getCity())) {
			cr.andCityEqualTo(form.getCity());
		}
		if (StringUtils.isNotBlank(form.getCommunity())) {
			cr.andCommunityEqualTo(form.getCommunity());
		}
		List<BusReleaseTrends> trendsList = commonOperateService.query(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("trendsList", trendsList);
		return wctx.forwardToString("/jsp/dynamic/trendsList.jsp");
	}

	public String queryRemind(DynamicForm form) throws Exception {
		BusReleaseTrendsExample ex = new BusReleaseTrendsExample();
		com.free.assist.domain.BusReleaseTrendsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getCity())) {
			cr.andCityEqualTo(form.getCity());
		}
		if (StringUtils.isNotBlank(form.getBillSn())) {
			cr.andBillSnLike("%" + form.getBillSn() + "%");
		}
		if (StringUtils.isNotBlank(form.getBillStatus())) {
			cr.andBillStatusEqualTo(form.getBillStatus());
		}
		if (StringUtils.isNotBlank(form.getCity())) {
			cr.andCityEqualTo(form.getCity());
		}
		if (StringUtils.isNotBlank(form.getCommunity())) {
			cr.andCommunityEqualTo(form.getCommunity());
		}
		if (StringUtils.isNotBlank(form.getRoad())) {
			cr.andRoadLike("%" + form.getRoad() + "%");
		}
		cr.andTaskDealObjectIdEqualTo(((SysUser) super.getSessionByDWR().getAttribute("currentUser")).getUserId());

		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		ex.setOrderByClause(" create_time desc ");
		@SuppressWarnings("unchecked")
		List<BusReleaseTrends> trendsList = commonOperateService.selectPageByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("trendsList", trendsList);
		return wctx.forwardToString("/jsp/dynamic/remindList.jsp");
	}

	public ActionForward detail(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		BusReleaseTrendsKey key = new BusReleaseTrendsKey();
		key.setBillId(billId);
		BusReleaseTrends trends = commonOperateService.queryByKey(key);
		request.setAttribute("trends", trends);

		SuptTaskExample taskEx = new SuptTaskExample();
		taskEx.createCriteria().andBillIdEqualTo(billId).andIsFinishEqualTo(Constant.FLAG_NO);
		taskEx.setOrderByClause(" create_time ");
		List<SuptTask> taskList = commonOperateService.queryTask(taskEx);
		request.setAttribute("taskList", taskList);

		SuptActionExample actionEx = new SuptActionExample();
		actionEx.createCriteria().andBillIdEqualTo(billId);
		actionEx.setOrderByClause(" operate_time ");
		List<SuptAction> actionList = commonOperateService.queryActions(actionEx);
		request.setAttribute("actionList", actionList);

		SuptAttachExample attachEx = new SuptAttachExample();
		attachEx.createCriteria().andBillIdEqualTo(billId).andIsDeleteEqualTo(Constant.FLAG_NO);
		actionEx.setOrderByClause(" create_time ");
		@SuppressWarnings("unchecked")
		List<SuptAttach> attachList = commonOperateService.selectByExample(attachEx);
		request.setAttribute("attachList", attachList);
		return new ActionForward("/jsp/dynamic/trendsDetail.jsp");
	}

	public ActionForward auditInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		String taskId = StringUtil.nullToEmptyOfObject(request.getParameter("taskId"));
		String billSn = StringUtil.nullToEmptyOfObject(request.getParameter("billSn"));
		request.setAttribute("billId", billId);
		request.setAttribute("billSn", billSn);
		request.setAttribute("taskId", taskId);
		return new ActionForward("/jsp/dynamic/audit.jsp");
	}

	public String audit(DynamicForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		SuptAction action = new SuptAction(currentUser);
		action.setBillId(form.getBillId());
		action.setTaskId(form.getTaskId());
		if (Constant.FLAG_NO.equals(form.getAuditResult())) {
			action.setActionType(Constant.OP_AUDIT_NOTAGREE);
		} else if (Constant.FLAG_YES.equals(form.getAuditResult())) {
			action.setActionType(Constant.OP_AUDIT_AGREE);
		}
		action.setRemark(form.getAuditSuggestion());
		return dynamicOperateService.audit(action);
	}

	public ActionForward releaseInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		String taskId = StringUtil.nullToEmptyOfObject(request.getParameter("taskId"));
		String billSn = StringUtil.nullToEmptyOfObject(request.getParameter("billSn"));
		request.setAttribute("billId", billId);
		request.setAttribute("billSn", billSn);
		request.setAttribute("taskId", taskId);
		return new ActionForward("/jsp/dynamic/release.jsp");
	}

	public String release(DynamicForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		SuptAction action = new SuptAction(currentUser);
		action.setBillId(form.getBillId());
		action.setTaskId(form.getTaskId());
		if (Constant.FLAG_NO.equals(form.getAuditResult())) {
			action.setActionType(Constant.OP_RELEASE_NOTAGREE);
		} else if (Constant.FLAG_YES.equals(form.getAuditResult())) {
			action.setActionType(Constant.OP_RELEASE_AGREE);
		}
		action.setRemark(form.getAuditSuggestion());
		return dynamicOperateService.release(action);
	}

	public ActionForward writeSuggestionInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		String taskId = StringUtil.nullToEmptyOfObject(request.getParameter("taskId"));
		String billSn = StringUtil.nullToEmptyOfObject(request.getParameter("billSn"));
		request.setAttribute("billId", billId);
		request.setAttribute("billSn", billSn);
		request.setAttribute("taskId", taskId);
		return new ActionForward("/jsp/dynamic/writeSuggestion.jsp");
	}

	public String writeSuggestion(DynamicForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		SuptAction action = new SuptAction(currentUser);
		action.setBillId(form.getBillId());
		action.setTaskId(form.getTaskId());
		action.setRemark(form.getAuditSuggestion());
		return dynamicOperateService.writeSuggestion(action);
	}

	public ActionForward finishWorkInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		String taskId = StringUtil.nullToEmptyOfObject(request.getParameter("taskId"));
		String billSn = StringUtil.nullToEmptyOfObject(request.getParameter("billSn"));
		request.setAttribute("billId", billId);
		request.setAttribute("billSn", billSn);
		request.setAttribute("taskId", taskId);
		return new ActionForward("/jsp/dynamic/finishWork.jsp");
	}

	public String finishWork(DynamicForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		SuptAction action = new SuptAction(currentUser);
		action.setBillId(form.getBillId());
		action.setTaskId(form.getTaskId());
		action.setRemark(form.getAuditSuggestion());
		return dynamicOperateService.finishWork(action);
	}

	public ActionForward showChart(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		BusReleaseTrendsKey key = new BusReleaseTrendsKey();
		key.setBillId(billId);
		BusReleaseTrends trends = commonOperateService.queryByKey(key);

		SuptTaskExample taskEx = new SuptTaskExample();
		taskEx.createCriteria().andBillIdEqualTo(billId);
		List<SuptTask> taskList = commonOperateService.queryTask(taskEx);

		String xmlStr = ChartHelper.buildXml(trends, taskList);
		String chartStr = ChartHelper.buildPageCode(xmlStr);
		request.setAttribute("chartStr", chartStr);
		return new ActionForward("/jsp/dynamic/chart.jsp");
	}

	public String queryComprehensive(DynamicForm form) throws Exception {
		BusReleaseTrendsExample ex = new BusReleaseTrendsExample();
		com.free.assist.domain.BusReleaseTrendsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getCity())) {
			cr.andCityEqualTo(form.getCity());
		}
		if (StringUtils.isNotBlank(form.getBillSn())) {
			cr.andBillSnLike("%" + form.getBillSn() + "%");
		}
		if (StringUtils.isNotBlank(form.getBillStatus())) {
			cr.andBillStatusEqualTo(form.getBillStatus());
		}
		if (StringUtils.isNotBlank(form.getCity())) {
			cr.andCityEqualTo(form.getCity());
		}
		if (StringUtils.isNotBlank(form.getCommunity())) {
			cr.andCommunityEqualTo(form.getCommunity());
		}
		if (StringUtils.isNotBlank(form.getRoad())) {
			cr.andRoadLike("%" + form.getRoad() + "%");
		}
		cr.andTaskDealObjectIdExists(((SysUser) super.getSessionByDWR().getAttribute("currentUser")).getUserId());

		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		ex.setOrderByClause(" create_time desc ");
		@SuppressWarnings("unchecked")
		List<BusReleaseTrends> trendsList = commonOperateService.selectPageByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("trendsList", trendsList);
		return wctx.forwardToString("/jsp/dynamic/remindList.jsp");
	}
}
