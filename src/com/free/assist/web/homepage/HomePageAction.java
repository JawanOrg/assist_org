package com.free.assist.web.homepage;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
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
import com.free.assist.domain.SysModule;
import com.free.assist.domain.SysModuleExample;
import com.free.assist.domain.SysRoleModuleExample;
import com.free.assist.domain.SysRoleModuleKey;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserRoleExample;
import com.free.assist.domain.SysUserRoleKey;
import com.free.assist.service.business.DynamicOperateService;
import com.free.assist.web.BaseAction;

@Controller("/business/homePageAction")
public class HomePageAction extends BaseAction {
	@Resource
	private DynamicOperateService dynamicOperateService;

	public String querySimilarly(HomePageForm form) throws Exception {
		BusReleaseTrendsExample ex = new BusReleaseTrendsExample();
		com.free.assist.domain.BusReleaseTrendsExample.Criteria cr = ex.createCriteria();
		cr.andTheTitleLike("%" + form.getTheTitle() + "%");
		ex.setOrderByClause(" create_time desc ");
		List<BusReleaseTrends> trendsList = dynamicOperateService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("trendsList", trendsList);
		return wctx.forwardToString("/jsp/dynamic/trendsList.jsp");
	}
	
	/**
	 * 获取首页展示数据
	 * @param form 
	 * @return
	 * @throws Exception
	 */
	public ActionForward getData(ActionMapping mapping,ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
        // 取得施工动态
        BusReleaseTrendsExample ex = new BusReleaseTrendsExample();
        ex.setOrderByClause(" create_time desc");
        ex.setFromNumber(0);
        ex.setToNumber(6);
        List<BusReleaseTrends> trendsList = dynamicOperateService.selectByExample(ex);
        request.setAttribute("trendsList", trendsList);
        

        // 取得管道常识
        BusLinePipeKnowledgeExample exKnowledge = new BusLinePipeKnowledgeExample();;
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
        
		return new ActionForward("/jsp/common/homeData.jsp");
	}

}
