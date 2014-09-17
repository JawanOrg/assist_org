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

import com.free.assist.domain.BusLinePipeKnowledge;
import com.free.assist.domain.BusLinePipeKnowledgeExample;
import com.free.assist.domain.BusLinePipeKnowledgeKey;
import com.free.assist.domain.BusReleaseNews;
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
		BusLinePipeKnowledgeExample ex = new BusLinePipeKnowledgeExample();
		com.free.assist.domain.BusLinePipeKnowledgeExample.Criteria cr = ex.createCriteria();
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
		List<BusReleaseNews> linePipeList = commonOperateService.selectPageByExample(ex);
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
		BusLinePipeKnowledge knowledge = new BusLinePipeKnowledge();
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
		BusLinePipeKnowledge linePipe = (BusLinePipeKnowledge) commonOperateService.selectByPrimaryKey(key);
		request.setAttribute("theTitle", linePipe.getTheTitle());
		request.setAttribute("knowledgeContent", linePipe.getKnowledgeContent());
		request.setAttribute("contentId", linePipe.getContentId());
		return new ActionForward("/jsp/linePipe/knowledgeModify.jsp");
	}

	public String modifyKnowledge(LinePipeForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeKnowledge knowledge = new BusLinePipeKnowledge();
		knowledge.setContentId(form.getContentId());
		knowledge.setTheTitle(form.getTheTitle());
		knowledge.setKnowledgeContent(form.getLinePipeContent());
		knowledge.setPublisher(currentUser.getUserId());
		commonOperateService.updateByPrimaryKeySelective(knowledge);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public String deleteKnowledge(LinePipeForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusLinePipeKnowledge knowledge = new BusLinePipeKnowledge();
		knowledge.setContentId(form.getContentId());
		knowledge.setPublisher(currentUser.getUserId());
		knowledge.setBillStatus(Constant.S_LINEPIPE_DELETED);
		commonOperateService.updateByPrimaryKeySelective(knowledge);
		return Constant.OPERATE_RESULT_SUCCESS;
	}
}
