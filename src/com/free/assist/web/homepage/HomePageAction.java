package com.free.assist.web.homepage;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.BusLinePipeKnow;
import com.free.assist.domain.BusLinePipeKnowExample;
import com.free.assist.domain.BusLinePipeKnowledge;
import com.free.assist.domain.BusLinePipeKnowledgeExample;
import com.free.assist.domain.BusLinePipeKnowledgeKey;
import com.free.assist.domain.BusLinePipeRule;
import com.free.assist.domain.BusLinePipeRuleExample;
import com.free.assist.domain.BusReleaseNews;
import com.free.assist.domain.BusReleaseNewsExample;
import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsExample;
import com.free.assist.domain.BusReleaseTrendsKey;
import com.free.assist.domain.ForumTopics;
import com.free.assist.domain.ForumTopicsExample;
import com.free.assist.service.business.DynamicOperateService;
import com.free.assist.web.BaseAction;

@Controller("/homepage/homePageAction")
public class HomePageAction extends BaseAction {
	@Resource
	private DynamicOperateService dynamicOperateService;

	/**
	 * 获取首页展示数据
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryAllPortalData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		// 取得施工动态
		BusReleaseTrendsExample ex = new BusReleaseTrendsExample();
		ex.setOrderByClause(" create_time desc");
		ex.setFromNumber(0);
		ex.setToNumber(6);
		List<BusReleaseTrends> trendsList = dynamicOperateService.selectByExample(ex);
		request.setAttribute("trendsList", trendsList);

		// 取得管道常识
		BusLinePipeKnowledgeExample exKnowledge = new BusLinePipeKnowledgeExample();
		exKnowledge.setOrderByClause(" create_time desc");
		exKnowledge.setFromNumber(0);
		exKnowledge.setToNumber(5);
		List<BusLinePipeKnowledge> knowledgeList = dynamicOperateService.selectByExample(exKnowledge);
		request.setAttribute("knowledgeList", knowledgeList);

		// 取得管线识别
		BusLinePipeKnowExample exKnow = new BusLinePipeKnowExample();
		exKnow.setOrderByClause(" create_time desc");
		exKnow.setFromNumber(0);
		exKnow.setToNumber(5);
		List<BusLinePipeKnow> knowList = dynamicOperateService.selectByExample(exKnow);
		request.setAttribute("knowList", knowList);

		// 取得管线法规
		BusLinePipeRuleExample exRule = new BusLinePipeRuleExample();
		exRule.setOrderByClause(" create_time desc");
		exRule.setFromNumber(0);
		exRule.setToNumber(5);
		List<BusLinePipeRule> ruleList = dynamicOperateService.selectByExample(exRule);
		request.setAttribute("ruleList", ruleList);

		// 取得新闻动态
		BusReleaseNewsExample exNews = new BusReleaseNewsExample();
		exNews.setOrderByClause(" create_time desc");
		exNews.setFromNumber(0);
		exNews.setToNumber(10);
		List<BusReleaseNews> newsList = dynamicOperateService.selectByExample(exNews);
		request.setAttribute("newsList", newsList);

		// 取得论坛列表
		ForumTopicsExample exForum = new ForumTopicsExample();
		exForum.setOrderByClause(" TOPIC_TIME desc ");
		exForum.setFromNumber(0);
		exForum.setToNumber(5);
		List<ForumTopics> topicList = dynamicOperateService.selectByExample(exForum);
		request.setAttribute("topicList", topicList);

		return new ActionForward("/jsp/portal/homePage.jsp");
	}

	/**
	 * 获取首页施工动态
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryMoreDynamic(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusReleaseTrendsExample ex = new BusReleaseTrendsExample();
		ex.setOrderByClause(" create_time desc");
		List<BusReleaseTrends> trendsList = dynamicOperateService.selectByExample(ex);
		request.setAttribute("trendsList", trendsList);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/moreDynamic.jsp");
	}

	/**
	 * 获取首页施工动态详情
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryDetailDynamic(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusReleaseTrendsKey key = new BusReleaseTrendsKey();
		key.setBillId(request.getParameter("billId"));
		BusReleaseTrends trends = (BusReleaseTrends) dynamicOperateService.selectByPrimaryKey(key);
		request.setAttribute("trends", trends);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/detailDynamic.jsp");
	}

	/**
	 * 获取首页管道常识
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryMorePipeKnowledge(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		BusLinePipeKnowledgeExample exKnowledge = new BusLinePipeKnowledgeExample();
		exKnowledge.setOrderByClause(" create_time desc");
		List<BusLinePipeKnowledge> knowledgeList = dynamicOperateService.selectByExample(exKnowledge);
		request.setAttribute("knowledgeList", knowledgeList);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/morePipeKnowledge.jsp");
	}

	/**
	 * 获取首页施工管道常识
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward queryDetailPipeKnowledge(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		BusLinePipeKnowledgeKey key = new BusLinePipeKnowledgeKey();
		key.setContentId(request.getParameter("billId"));
		BusLinePipeKnowledge pipeKnowledge = (BusLinePipeKnowledge) dynamicOperateService.selectByPrimaryKey(key);
		request.setAttribute("pipeKnowledge", pipeKnowledge);

		this.queryRightData(request);
		return new ActionForward("/jsp/portal/detailPipeKnowledge.jsp");
	}

	private void queryRightData(HttpServletRequest request) {
		// 取得管道常识
		BusLinePipeKnowledgeExample exKnowledge = new BusLinePipeKnowledgeExample();
		exKnowledge.setOrderByClause(" create_time desc");
		exKnowledge.setFromNumber(0);
		exKnowledge.setToNumber(5);
		List<BusLinePipeKnowledge> knowledgeList = dynamicOperateService.selectByExample(exKnowledge);
		request.setAttribute("knowledgeList", knowledgeList);

		// 取得管线识别
		BusLinePipeKnowExample exKnow = new BusLinePipeKnowExample();
		exKnow.setOrderByClause(" create_time desc");
		exKnow.setFromNumber(0);
		exKnow.setToNumber(5);
		List<BusLinePipeKnow> knowList = dynamicOperateService.selectByExample(exKnow);
		request.setAttribute("knowList", knowList);

		// 取得管线法规
		BusLinePipeRuleExample exRule = new BusLinePipeRuleExample();
		exRule.setOrderByClause(" create_time desc");
		exRule.setFromNumber(0);
		exRule.setToNumber(5);
		List<BusLinePipeRule> ruleList = dynamicOperateService.selectByExample(exRule);
		request.setAttribute("ruleList", ruleList);
	}

}
