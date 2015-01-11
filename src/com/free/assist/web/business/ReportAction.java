package com.free.assist.web.business;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.BusReleaseTrendsWithBLOBs;
import com.free.assist.domain.BusReleaseTrendsWithBLOBsExample;
import com.free.assist.service.business.DynamicOperateService;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.web.BaseAction;

@Controller("/business/reportAction")
public class ReportAction extends BaseAction {
	@Resource
	private DynamicOperateService dynamicOperateService;
	@Resource
	private CommonOperateService commonOperateService;

	public String projectCollect(ReportForm form) throws Exception {
		BusReleaseTrendsWithBLOBsExample ex = new BusReleaseTrendsWithBLOBsExample();
		com.free.assist.domain.BusReleaseTrendsWithBLOBsExample.Criteria cr = ex
				.createCriteria();

		List<BusReleaseTrendsWithBLOBs> trendsList = commonOperateService
				.selectByExampleWithBLOBs(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("trendsList", trendsList);
		return wctx.forwardToString("/jsp/report/projectCollectList.jsp");
	}
}
