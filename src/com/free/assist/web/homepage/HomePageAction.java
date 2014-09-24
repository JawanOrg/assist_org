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
import com.free.assist.domain.BusLinePipeRule;
import com.free.assist.domain.BusLinePipeRuleExample;
import com.free.assist.domain.BusReleaseNews;
import com.free.assist.domain.BusReleaseNewsExample;
import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsExample;
import com.free.assist.domain.ForumTopics;
import com.free.assist.domain.ForumTopicsExample;
import com.free.assist.service.business.DynamicOperateService;
import com.free.assist.web.BaseAction;

@Controller("/homepage/homePageAction")
public class HomePageAction extends BaseAction {
	@Resource
	private DynamicOperateService dynamicOperateService;

	/**
	 * ��ȡ��ҳչʾ����
	 * 
	 * @param form
	 * @return
	 * @throws Exception
	 */
	public ActionForward getData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		// ȡ��ʩ����̬
		BusReleaseTrendsExample ex = new BusReleaseTrendsExample();
		ex.setOrderByClause(" create_time desc");
		ex.setFromNumber(0);
		ex.setToNumber(6);
		List<BusReleaseTrends> trendsList = dynamicOperateService.selectByExample(ex);
		request.setAttribute("trendsList", trendsList);

		// ȡ�ùܵ���ʶ
		BusLinePipeKnowledgeExample exKnowledge = new BusLinePipeKnowledgeExample();
		;
		exKnowledge.setOrderByClause(" create_time desc");
		exKnowledge.setFromNumber(0);
		exKnowledge.setToNumber(5);
		List<BusLinePipeKnowledge> knowledgeList = dynamicOperateService.selectByExample(exKnowledge);
		request.setAttribute("knowledgeList", knowledgeList);

		// ȡ�ù���ʶ��
		BusLinePipeKnowExample exKnow = new BusLinePipeKnowExample();
		exKnow.setOrderByClause(" create_time desc");
		exKnow.setFromNumber(0);
		exKnow.setToNumber(5);
		List<BusLinePipeKnow> knowList = dynamicOperateService.selectByExample(exKnow);
		request.setAttribute("knowList", knowList);

		// ȡ�ù��߷���
		BusLinePipeRuleExample exRule = new BusLinePipeRuleExample();
		exRule.setOrderByClause(" create_time desc");
		exRule.setFromNumber(0);
		exRule.setToNumber(5);
		List<BusLinePipeRule> ruleList = dynamicOperateService.selectByExample(exRule);
		request.setAttribute("ruleList", ruleList);

		// ȡ�����Ŷ�̬
		BusReleaseNewsExample exNews = new BusReleaseNewsExample();
		exNews.setOrderByClause(" create_time desc");
		exNews.setFromNumber(0);
		exNews.setToNumber(10);
		List<BusReleaseNews> newsList = dynamicOperateService.selectByExample(exNews);
		request.setAttribute("newsList", newsList);

		// ȡ����̳�б�
		ForumTopicsExample exForum = new ForumTopicsExample();
		exForum.setOrderByClause(" TOPIC_TIME desc ");
		exForum.setFromNumber(0);
		exForum.setToNumber(5);
		List<ForumTopics> topicList = dynamicOperateService.selectByExample(exForum);
		request.setAttribute("topicList", topicList);

		return new ActionForward("/jsp/common/homeData.jsp");
	}

}
