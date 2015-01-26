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

import com.free.assist.domain.BusReleaseActual;
import com.free.assist.domain.BusReleaseActualExample;
import com.free.assist.domain.BusReleaseActualKey;
import com.free.assist.domain.SysUser;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.util.Constant;
import com.free.assist.util.ObjectUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;

@Controller("/business/actualAction")
public class ActualAction extends BaseAction {
	@Resource
	private CommonOperateService commonOperateService;

	public String queryActual(ActualForm form) throws Exception {
		BusReleaseActualExample ex = new BusReleaseActualExample();
		com.free.assist.domain.BusReleaseActualExample.Criteria cr = ex.createCriteria();
		if (StringUtils.isNotBlank(form.getAddress())) {
			cr.andAddressLike("%" + form.getAddress() + "%");
		}
		cr.andBillStatusEqualTo(Constant.S_ACTUAL_NORMAL);
		ex.setSkipResults(form.getSkipResults());
		ex.setMaxResults(form.getMaxResults());
		ex.setOrderByClause(" create_time desc ");
		@SuppressWarnings("unchecked")
		List<BusReleaseActual> actualList = commonOperateService.selectPageByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("actualList", actualList);
		return wctx.forwardToString("/jsp/actual/actualList.jsp");
	}

	public ActionForward addActualInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ActionForward("/jsp/actual/actualAdd.jsp");
	}

	public String addActual(ActualForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusReleaseActual actual = new BusReleaseActual();
		ObjectUtil.copyObjectToObject(form, actual);
		actual.setCreator(currentUser.getUserId());
		actual.setCreateDept(currentUser.getUnitId());
		actual.setCreateTime(commonOperateService.getSysDate());
		actual.setBillStatus(Constant.S_ACTUAL_NORMAL);
		commonOperateService.insert(actual);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public ActionForward modifyActualInit(ActionMapping mapping, ActionForm actionform, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String billId = StringUtil.nullToEmptyOfObject(request.getParameter("billId"));
		BusReleaseActualKey key = new BusReleaseActualKey();
		key.setBillId(billId);
		BusReleaseActual actual = (BusReleaseActual) commonOperateService.selectByPrimaryKey(key);
		request.setAttribute("address", actual.getAddress());
		request.setAttribute("actualContent", actual.getActualContent());
		request.setAttribute("billId", actual.getBillId());
		return new ActionForward("/jsp/actual/actualModify.jsp");
	}

	public String modifyActual(ActualForm form) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusReleaseActual actual = new BusReleaseActual();
		ObjectUtil.copyObjectToObject(form, actual);
		actual.setPublisher(currentUser.getUserId());
		commonOperateService.updateByPrimaryKeySelective(actual);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public String deleteActual(String billId) throws Exception {
		SysUser currentUser = (SysUser) super.getSessionByDWR().getAttribute("currentUser");
		BusReleaseActual actual = new BusReleaseActual();
		actual.setBillId(billId);
		actual.setPublisher(currentUser.getUserId());
		actual.setBillStatus(Constant.S_ACTUAL_DELETED);
		commonOperateService.updateByPrimaryKeySelective(actual);
		return Constant.OPERATE_RESULT_SUCCESS;
	}
}
