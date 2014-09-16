package com.free.assist.web.homepage;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsExample;
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
}
