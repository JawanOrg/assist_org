package com.free.assist.web.business;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.BusReleaseNews;
import com.free.assist.domain.BusReleaseNewsWithBLOBsExample;
import com.free.assist.domain.BusReleaseNewsKey;
import com.free.assist.domain.BusReleaseNewsWithBLOBs;
import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptActionExample;
import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SuptAttachExample;
import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SuptTaskExample;
import com.free.assist.domain.SysUser;
import com.free.assist.service.business.NewsOperateService;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.util.Constant;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;

@Controller("/business/newsAction")
public class NewsAction extends BaseAction {
	@Resource
	private NewsOperateService newsOperateService;
	@Resource
	private CommonOperateService commonOperateService;

	public ActionForward init(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("billId", newsOperateService.buildGUID());
		return new ActionForward("/jsp/news/create.jsp");
	}

	public String accept(NewsForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusReleaseNewsWithBLOBs busRelease = new BusReleaseNewsWithBLOBs();
		ObjectUtil.copyObjectToObject(form, busRelease);
		SuptAction action = new SuptAction(currentUser);
		return newsOperateService.create(busRelease, action);
	}

	public String querySimilarly(NewsForm form) throws Exception {
		BusReleaseNewsWithBLOBsExample ex = new BusReleaseNewsWithBLOBsExample();
		com.free.assist.domain.BusReleaseNewsWithBLOBsExample.Criteria cr = ex.createCriteria();
		cr.andTheTitleLike("%" + form.getTheTitle() + "%");
		List<BusReleaseNewsWithBLOBs> newsList = (List<BusReleaseNewsWithBLOBs>) commonOperateService.selectByExampleWithBLOBs(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("newsList", newsList);
		return wctx.forwardToString("/jsp/news/similarlyList.jsp");
	}

	public String queryRemind(NewsForm form) throws Exception {
		BusReleaseNewsWithBLOBsExample ex = new BusReleaseNewsWithBLOBsExample();
		com.free.assist.domain.BusReleaseNewsWithBLOBsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getTheTitle())) {
			cr.andTheTitleLike("%" + form.getTheTitle() + "%");
		}
		if (StringUtils.isNotBlank(form.getNewsContent())) {
			cr.andNewsContentLike("%" + form.getNewsContent() + "%");
		}
		if (StringUtils.isNotBlank(form.getBillStatus())) {
			cr.andBillStatusEqualTo(form.getBillStatus());
		}
		cr.andTaskDealObjectIdEqualTo(((SysUser) super.getSessionByDWR().getAttribute("currentUser")).getUserId());

		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		ex.setOrderByClause(" create_time desc ");
		@SuppressWarnings("unchecked")
		List<BusReleaseNews> newsList = commonOperateService.selectPageByExampleWithBLOBs(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("newsList", newsList);
		return wctx.forwardToString("/jsp/news/newsList.jsp");
	}

	public ActionForward detail(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		BusReleaseNewsKey key = new BusReleaseNewsKey();
		key.setBillId(billId);
		BusReleaseNewsWithBLOBs news = (BusReleaseNewsWithBLOBs) newsOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("news", news);

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
		return new ActionForward("/jsp/news/newsDetail.jsp");
	}

	public ActionForward auditInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		String taskId = StringUtil.nullToEmptyOfObject(request.getParameter("taskId"));
		String billSn = StringUtil.nullToEmptyOfObject(request.getParameter("billSn"));
		request.setAttribute("billId", billId);
		request.setAttribute("billSn", billSn);
		request.setAttribute("taskId", taskId);
		return new ActionForward("/jsp/news/audit.jsp");
	}

	public String audit(NewsForm form) throws Exception {
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
		return newsOperateService.audit(action);
	}

	public ActionForward releaseInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		String taskId = StringUtil.nullToEmptyOfObject(request.getParameter("taskId"));
		String billSn = StringUtil.nullToEmptyOfObject(request.getParameter("billSn"));
		request.setAttribute("billId", billId);
		request.setAttribute("billSn", billSn);
		request.setAttribute("taskId", taskId);
		return new ActionForward("/jsp/news/release.jsp");
	}

	public String release(NewsForm form) throws Exception {
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
		return newsOperateService.release(action);
	}

	public String queryComprehensive(NewsForm form) throws Exception {
		BusReleaseNewsWithBLOBsExample ex = new BusReleaseNewsWithBLOBsExample();
		com.free.assist.domain.BusReleaseNewsWithBLOBsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getTheTitle())) {
			cr.andTheTitleLike("%" + form.getTheTitle() + "%");
		}
		if (StringUtils.isNotBlank(form.getNewsContent())) {
			cr.andNewsContentLike("%" + form.getNewsContent() + "%");
		}
		if (StringUtils.isNotBlank(form.getBillStatus())) {
			cr.andBillStatusEqualTo(form.getBillStatus());
		}
		cr.andTaskDealObjectIdExists(((SysUser) super.getSessionByDWR().getAttribute("currentUser")).getUserId());

		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		ex.setOrderByClause(" create_time desc ");
		@SuppressWarnings("unchecked")
		List<BusReleaseNewsWithBLOBs> newsList = commonOperateService.selectPageByExampleWithBLOBs(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("newsList", newsList);
		return wctx.forwardToString("/jsp/news/newsList.jsp");
	}
}
