package com.free.assist.web.homepage;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.BusLinePipeKnowKey;
import com.free.assist.domain.BusLinePipeKnowWithBLOBs;
import com.free.assist.domain.BusLinePipeKnowWithBLOBsExample;
import com.free.assist.domain.BusLinePipeKnowledgeKey;
import com.free.assist.domain.BusLinePipeKnowledgeWithBLOBs;
import com.free.assist.domain.BusLinePipeKnowledgeWithBLOBsExample;
import com.free.assist.domain.BusLinePipeRuleKey;
import com.free.assist.domain.BusLinePipeRuleWithBLOBs;
import com.free.assist.domain.BusLinePipeRuleWithBLOBsExample;
import com.free.assist.domain.BusReleaseNewsKey;
import com.free.assist.domain.BusReleaseNewsWithBLOBs;
import com.free.assist.domain.BusReleaseNewsWithBLOBsExample;
import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsKey;
import com.free.assist.domain.BusReleaseTrendsWithBLOBs;
import com.free.assist.domain.BusReleaseTrendsWithBLOBsExample;
import com.free.assist.domain.ForumTopics;
import com.free.assist.domain.ForumTopicsExample;
import com.free.assist.service.business.DynamicOperateService;
import com.free.assist.web.BaseAction;

@Controller("/homepage/homePageAction")
public class HomePageAction extends BaseAction {
	@Resource
	private DynamicOperateService dynamicOperateService;

	/**
	 * ��ȡ��ҳչʾ���
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryAllPortalData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		// ȡ��ʩ����̬
		BusReleaseTrendsWithBLOBsExample ex = new BusReleaseTrendsWithBLOBsExample();
		ex.setOrderByClause(" create_time desc");
		ex.setFromNumber(0);
		ex.setToNumber(6);
		List<BusReleaseTrends> trendsList = dynamicOperateService.selectByExampleWithBLOBs(ex);
		request.setAttribute("trendsList", trendsList);

		// ȡ�ùܵ���ʶ
		BusLinePipeKnowledgeWithBLOBsExample exKnowledge = new BusLinePipeKnowledgeWithBLOBsExample();
		exKnowledge.setOrderByClause(" create_time desc");
		exKnowledge.setFromNumber(0);
		exKnowledge.setToNumber(5);
		List<BusLinePipeKnowledgeWithBLOBs> knowledgeList = dynamicOperateService.selectByExampleWithBLOBs(exKnowledge);
		request.setAttribute("knowledgeList", knowledgeList);

		// ȡ�ù���ʶ��
		BusLinePipeKnowWithBLOBsExample exKnow = new BusLinePipeKnowWithBLOBsExample();
		exKnow.setOrderByClause(" create_time desc");
		exKnow.setFromNumber(0);
		exKnow.setToNumber(5);
		List<BusLinePipeKnowWithBLOBs> knowList = dynamicOperateService.selectByExampleWithBLOBs(exKnow);
		request.setAttribute("knowList", knowList);

		// ȡ�ù��߷���
		BusLinePipeRuleWithBLOBsExample exRule = new BusLinePipeRuleWithBLOBsExample();
		exRule.setOrderByClause(" create_time desc");
		exRule.setFromNumber(0);
		exRule.setToNumber(5);
		List<BusLinePipeRuleWithBLOBs> ruleList = dynamicOperateService.selectByExampleWithBLOBs(exRule);
		request.setAttribute("ruleList", ruleList);

		// ȡ�����Ŷ�̬
		BusReleaseNewsWithBLOBsExample exNews = new BusReleaseNewsWithBLOBsExample();
		exNews.setOrderByClause(" create_time desc");
		exNews.setFromNumber(0);
		exNews.setToNumber(10);
		List<BusReleaseNewsWithBLOBs> newsList = dynamicOperateService.selectByExampleWithBLOBs(exNews);
		request.setAttribute("newsList", newsList);

		// ȡ����̳�б�
		ForumTopicsExample exForum = new ForumTopicsExample();
		exForum.setOrderByClause(" TOPIC_TIME desc ");
		exForum.setFromNumber(0);
		exForum.setToNumber(5);
		List<ForumTopics> topicList = dynamicOperateService.selectByExample(exForum);
		request.setAttribute("topicList", topicList);

		return new ActionForward("/jsp/portal/homePage.jsp");
	}

	/**
	 * ��ȡ��ҳʩ����̬
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryMoreDynamic(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusReleaseTrendsWithBLOBsExample ex = new BusReleaseTrendsWithBLOBsExample();
		ex.setOrderByClause(" create_time desc");
		List<BusReleaseTrendsWithBLOBs> trendsList = dynamicOperateService.selectByExampleWithBLOBs(ex);
		request.setAttribute("trendsList", trendsList);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/moreDynamic.jsp");
	}

	/**
	 * ��ȡ��ҳʩ����̬����
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryDetailDynamic(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusReleaseTrendsKey key = new BusReleaseTrendsKey();
		key.setBillId(request.getParameter("billId"));
		BusReleaseTrendsWithBLOBs trends = (BusReleaseTrendsWithBLOBs) dynamicOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("trends", trends);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/detailDynamic.jsp");
	}

	/**
	 * ��ȡ��ҳ�ܵ���ʶ
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryMorePipeKnowledge(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		BusLinePipeKnowledgeWithBLOBsExample exKnowledge = new BusLinePipeKnowledgeWithBLOBsExample();
		exKnowledge.setOrderByClause(" create_time desc");
		List<BusLinePipeKnowledgeWithBLOBs> knowledgeList = dynamicOperateService.selectByExampleWithBLOBs(exKnowledge);
		request.setAttribute("knowledgeList", knowledgeList);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/morePipeKnowledge.jsp");
	}

	/**
	 * ��ȡ��ҳʩ���ܵ���ʶ
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryDetailPipeKnowledge(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusLinePipeKnowledgeKey key = new BusLinePipeKnowledgeKey();
		key.setContentId(request.getParameter("billId"));
		BusLinePipeKnowledgeWithBLOBs pipeKnowledge = (BusLinePipeKnowledgeWithBLOBs) dynamicOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("pipeKnowledge", pipeKnowledge);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/detailPipeKnowledge.jsp");
	}

	private void queryRightData(HttpServletRequest request) {
		// ȡ�ùܵ���ʶ
		BusLinePipeKnowledgeWithBLOBsExample exKnowledge = new BusLinePipeKnowledgeWithBLOBsExample();
		exKnowledge.setOrderByClause(" create_time desc");
		exKnowledge.setFromNumber(0);
		exKnowledge.setToNumber(5);
		List<BusLinePipeKnowledgeWithBLOBs> knowledgeList = dynamicOperateService.selectByExampleWithBLOBs(exKnowledge);
		request.setAttribute("knowledgeList", knowledgeList);

		// ȡ�ù���ʶ��
		BusLinePipeKnowWithBLOBsExample exKnow = new BusLinePipeKnowWithBLOBsExample();
		exKnow.setOrderByClause(" create_time desc");
		exKnow.setFromNumber(0);
		exKnow.setToNumber(5);
		List<BusLinePipeKnowWithBLOBs> knowList = dynamicOperateService.selectByExampleWithBLOBs(exKnow);
		request.setAttribute("knowList", knowList);

		// ȡ�ù��߷���
		BusLinePipeRuleWithBLOBsExample exRule = new BusLinePipeRuleWithBLOBsExample();
		exRule.setOrderByClause(" create_time desc");
		exRule.setFromNumber(0);
		exRule.setToNumber(5);
		List<BusLinePipeRuleWithBLOBs> ruleList = dynamicOperateService.selectByExampleWithBLOBs(exRule);
		request.setAttribute("ruleList", ruleList);
	}

	public ActionForward queryMorePipeKnow(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		BusLinePipeKnowWithBLOBsExample exKnowledge = new BusLinePipeKnowWithBLOBsExample();
		exKnowledge.setOrderByClause(" create_time desc");
		List<BusLinePipeKnowWithBLOBs> knowList = dynamicOperateService.selectByExampleWithBLOBs(exKnowledge);
		request.setAttribute("knowList", knowList);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/morePipeKnow.jsp");
	}

	public ActionForward queryDetailPipeKnow(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusLinePipeKnowKey key = new BusLinePipeKnowKey();
		key.setContentId(request.getParameter("billId"));
		BusLinePipeKnowWithBLOBs pipeKnow = (BusLinePipeKnowWithBLOBs) dynamicOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("pipeKnow", pipeKnow);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/detailPipeKnow.jsp");
	}

	public ActionForward queryMorePipeRule(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		BusLinePipeRuleWithBLOBsExample exKnowledge = new BusLinePipeRuleWithBLOBsExample();
		exKnowledge.setOrderByClause(" create_time desc");
		List<BusLinePipeRuleWithBLOBs> ruleList = dynamicOperateService.selectByExampleWithBLOBs(exKnowledge);
		request.setAttribute("ruleList", ruleList);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/morePipeRule.jsp");
	}

	public ActionForward queryDetailPipeRule(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusLinePipeRuleKey key = new BusLinePipeRuleKey();
		key.setContentId(request.getParameter("billId"));
		BusLinePipeRuleWithBLOBs pipeRule = (BusLinePipeRuleWithBLOBs) dynamicOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("pipeRule", pipeRule);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/detailPipeRule.jsp");
	}

	public ActionForward queryMoreNews(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		BusReleaseNewsWithBLOBsExample exKnowledge = new BusReleaseNewsWithBLOBsExample();
		exKnowledge.setOrderByClause(" create_time desc");
		List<BusReleaseNewsWithBLOBs> newsList = dynamicOperateService.selectByExampleWithBLOBs(exKnowledge);
		request.setAttribute("newsList", newsList);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/moreNews.jsp");
	}

	public ActionForward queryDetailNews(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusReleaseNewsKey key = new BusReleaseNewsKey();
		key.setBillId(request.getParameter("billId"));
		BusReleaseNewsWithBLOBs news = (BusReleaseNewsWithBLOBs) dynamicOperateService.selectByPrimaryKeyWithBLOBs(key);
		request.setAttribute("news", news);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/detailNews.jsp");
	}

}
