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

import com.free.assist.domain.BusLinePipeKnowWithBLOBsExample;
import com.free.assist.domain.BusLinePipeKnowKey;
import com.free.assist.domain.BusLinePipeKnowWithBLOBs;
import com.free.assist.domain.BusLinePipeKnowledgeWithBLOBsExample;
import com.free.assist.domain.BusLinePipeKnowledgeKey;
import com.free.assist.domain.BusLinePipeKnowledgeWithBLOBs;
import com.free.assist.domain.BusLinePipeRuleWithBLOBsExample;
import com.free.assist.domain.BusLinePipeRuleKey;
import com.free.assist.domain.BusLinePipeRuleWithBLOBs;
import com.free.assist.domain.SysUser;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.util.Constant;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;

@Controller("/business/linePipeAction")
public class LinePipeAction extends BaseAction {
	@Resource
	private CommonOperateService commonOperateService;

	public String queryKnowledge(LinePipeForm form) throws Exception {
		BusLinePipeKnowledgeWithBLOBsExample ex = new BusLinePipeKnowledgeWithBLOBsExample();
		com.free.assist.domain.BusLinePipeKnowledgeWithBLOBsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getTheTitle())) {
			cr.andTheTitleLike("%" + form.getTheTitle() + "%");
		}
		if (StringUtils.isNotBlank(form.getLinePipeContent())) {
			cr.andKnowledgeContentLike("%" + form.getLinePipeContent() + "%");
		}
		cr.andBillStatusEqualTo(Constant.S_LINEPIPE_NORMAL);
		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		ex.setOrderByClause(" create_time desc ");
		@SuppressWarnings("unchecked")
		List<BusLinePipeKnowledgeWithBLOBs> linePipeList = commonOperateService.selectPageByExampleWithBLOBs(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("linePipeList", linePipeList);
		return wctx.forwardToString("/jsp/linePipe/knowledgeList.jsp");
	}

	public ActionForward addKnowledgeInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ActionForward("/jsp/linePipe/knowledgeAdd.jsp");
	}

	public String addKnowledge(LinePipeForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeKnowledgeWithBLOBs knowledge = new BusLinePipeKnowledgeWithBLOBs();
		knowledge.setTheTitle(form.getTheTitle());
		knowledge.setKnowledgeContent(form.getLinePipeContent());
		knowledge.setCreator(currentUser.getUserId());
		knowledge.setCreateDept(currentUser.getUnitId());
		knowledge.setCreateTime(commonOperateService.getSysDate());
		knowledge.setBillStatus(Constant.S_LINEPIPE_NORMAL);
		commonOperateService.insert(knowledge);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public ActionForward modifyKnowledgeInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String contentId = StringUtil.nullToEmptyOfObject(request.getParameter("contentId"));
		BusLinePipeKnowledgeKey key = new BusLinePipeKnowledgeKey();
		key.setContentId(contentId);
		BusLinePipeKnowledgeWithBLOBs linePipe = (BusLinePipeKnowledgeWithBLOBs) commonOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("theTitle", linePipe.getTheTitle());
		request.setAttribute("knowledgeContent", linePipe.getKnowledgeContent());
		request.setAttribute("contentId", linePipe.getContentId());
		return new ActionForward("/jsp/linePipe/knowledgeModify.jsp");
	}

	public String modifyKnowledge(LinePipeForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeKnowledgeWithBLOBs knowledge = new BusLinePipeKnowledgeWithBLOBs();
		knowledge.setContentId(form.getContentId());
		knowledge.setTheTitle(form.getTheTitle());
		knowledge.setKnowledgeContent(form.getLinePipeContent());
		knowledge.setPublisher(currentUser.getUserId());
		commonOperateService.updateByPrimaryKeySelective(knowledge);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public String deleteKnowledge(String contentId) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeKnowledgeWithBLOBs knowledge = new BusLinePipeKnowledgeWithBLOBs();
		knowledge.setContentId(contentId);
		knowledge.setPublisher(currentUser.getUserId());
		knowledge.setBillStatus(Constant.S_LINEPIPE_DELETED);
		commonOperateService.updateByPrimaryKeySelective(knowledge);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public String queryKnow(LinePipeForm form) throws Exception {
		BusLinePipeKnowWithBLOBsExample ex = new BusLinePipeKnowWithBLOBsExample();
		com.free.assist.domain.BusLinePipeKnowWithBLOBsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getTheTitle())) {
			cr.andTheTitleLike("%" + form.getTheTitle() + "%");
		}
		if (StringUtils.isNotBlank(form.getLinePipeContent())) {
			cr.andKnowContentLike("%" + form.getLinePipeContent() + "%");
		}
		cr.andBillStatusEqualTo(Constant.S_LINEPIPE_NORMAL);
		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		ex.setOrderByClause(" create_time desc ");
		@SuppressWarnings("unchecked")
		List<BusLinePipeKnowWithBLOBs> linePipeList = commonOperateService.selectPageByExampleWithBLOBs(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("linePipeList", linePipeList);
		return wctx.forwardToString("/jsp/linePipe/knowList.jsp");
	}

	public ActionForward addKnowInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ActionForward("/jsp/linePipe/knowAdd.jsp");
	}

	public String addKnow(LinePipeForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeKnowWithBLOBs know = new BusLinePipeKnowWithBLOBs();
		know.setTheTitle(form.getTheTitle());
		know.setKnowContent(form.getLinePipeContent());
		know.setCreator(currentUser.getUserId());
		know.setCreateDept(currentUser.getUnitId());
		know.setCreateTime(commonOperateService.getSysDate());
		know.setBillStatus(Constant.S_LINEPIPE_NORMAL);
		commonOperateService.insert(know);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public ActionForward modifyKnowInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String contentId = StringUtil.nullToEmptyOfObject(request.getParameter("contentId"));
		BusLinePipeKnowKey key = new BusLinePipeKnowKey();
		key.setContentId(contentId);
		BusLinePipeKnowWithBLOBs linePipe = (BusLinePipeKnowWithBLOBs) commonOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("theTitle", linePipe.getTheTitle());
		request.setAttribute("knowContent", linePipe.getKnowContent());
		request.setAttribute("contentId", linePipe.getContentId());
		return new ActionForward("/jsp/linePipe/knowModify.jsp");
	}

	public String modifyKnow(LinePipeForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeKnowWithBLOBs know = new BusLinePipeKnowWithBLOBs();
		know.setContentId(form.getContentId());
		know.setTheTitle(form.getTheTitle());
		know.setKnowContent(form.getLinePipeContent());
		know.setPublisher(currentUser.getUserId());
		commonOperateService.updateByPrimaryKeySelective(know);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public String deleteKnow(String contentId) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeKnowWithBLOBs know = new BusLinePipeKnowWithBLOBs();
		know.setContentId(contentId);
		know.setPublisher(currentUser.getUserId());
		know.setBillStatus(Constant.S_LINEPIPE_DELETED);
		commonOperateService.updateByPrimaryKeySelective(know);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public String queryRule(LinePipeForm form) throws Exception {
		BusLinePipeRuleWithBLOBsExample ex = new BusLinePipeRuleWithBLOBsExample();
		com.free.assist.domain.BusLinePipeRuleWithBLOBsExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getTheTitle())) {
			cr.andTheTitleLike("%" + form.getTheTitle() + "%");
		}
		if (StringUtils.isNotBlank(form.getLinePipeContent())) {
			cr.andRoleContentLike("%" + form.getLinePipeContent() + "%");
		}
		cr.andBillStatusEqualTo(Constant.S_LINEPIPE_NORMAL);
		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		ex.setOrderByClause(" create_time desc ");
		@SuppressWarnings("unchecked")
		List<BusLinePipeRuleWithBLOBs> linePipeList = commonOperateService.selectPageByExampleWithBLOBs(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("linePipeList", linePipeList);
		return wctx.forwardToString("/jsp/linePipe/ruleList.jsp");
	}

	public ActionForward addRuleInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ActionForward("/jsp/linePipe/ruleAdd.jsp");
	}

	public String addRule(LinePipeForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeRuleWithBLOBs rule = new BusLinePipeRuleWithBLOBs();
		rule.setTheTitle(form.getTheTitle());
		rule.setRoleContent(form.getLinePipeContent());
		rule.setCreator(currentUser.getUserId());
		rule.setCreateDept(currentUser.getUnitId());
		rule.setCreateTime(commonOperateService.getSysDate());
		rule.setBillStatus(Constant.S_LINEPIPE_NORMAL);
		commonOperateService.insert(rule);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public ActionForward modifyRuleInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String contentId = StringUtil.nullToEmptyOfObject(request.getParameter("contentId"));
		BusLinePipeRuleKey key = new BusLinePipeRuleKey();
		key.setContentId(contentId);
		BusLinePipeRuleWithBLOBs linePipe = (BusLinePipeRuleWithBLOBs) commonOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("theTitle", linePipe.getTheTitle());
		request.setAttribute("roleContent", linePipe.getRoleContent());
		request.setAttribute("contentId", linePipe.getContentId());
		return new ActionForward("/jsp/linePipe/ruleModify.jsp");
	}

	public String modifyRule(LinePipeForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeRuleWithBLOBs rule = new BusLinePipeRuleWithBLOBs();
		rule.setContentId(form.getContentId());
		rule.setTheTitle(form.getTheTitle());
		rule.setRoleContent(form.getLinePipeContent());
		rule.setPublisher(currentUser.getUserId());
		commonOperateService.updateByPrimaryKeySelective(rule);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public String deleteRule(String contentId) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeRuleWithBLOBs rule = new BusLinePipeRuleWithBLOBs();
		rule.setContentId(contentId);
		rule.setPublisher(currentUser.getUserId());
		rule.setBillStatus(Constant.S_LINEPIPE_DELETED);
		commonOperateService.updateByPrimaryKeySelective(rule);
		return Constant.OPERATE_RESULT_SUCCESS;
	}
}
