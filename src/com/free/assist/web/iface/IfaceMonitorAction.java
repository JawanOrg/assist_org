package com.free.assist.web.iface;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.free.assist.domain.IfaceLogEvent;
import com.free.assist.domain.IfaceLogEventCheck;
import com.free.assist.domain.IfaceLogEventExample;
import com.free.assist.domain.IfaceLogEventMonitor;
import com.free.assist.domain.IfaceLogRepository;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.SuptBackgroundConf;
import com.free.assist.domain.SuptBackgroundConfExample;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.IfaceLogEventExample.Criteria;
import com.free.assist.service.iface.IfaceMonitorService;
import com.free.assist.service.supt.ISuptQueryItemValueService;
import com.free.assist.util.DateUtil;
import com.free.assist.util.StringUtil;
import com.free.assist.web.BaseAction;

@Controller("/iface/ifaceMonitorAction")
@SuppressWarnings("unchecked")
public class IfaceMonitorAction extends BaseAction {

	@Autowired
	private IfaceMonitorService ifaceMonitorService;
	@Autowired
	private ISuptQueryItemValueService suptQueryItemValueService;

	/**
	 * 跳转到查询页面
	 *
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toIfaceMonitorSrch(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception, NoSuchFieldException {

		IfaceMonitorActionForm form = (IfaceMonitorActionForm) actionForm;

		// get query item default value begin
		SysUser currentUser = (SysUser) request.getSession().getAttribute("currentUser");
		if (currentUser != null) {
			String userId = StringUtil.nullToEmptyOfObject(currentUser.getUserId());
			this.suptQueryItemValueService.getFormQueryItemValue(userId, this.getClass().getSimpleName(), form);
		}
		// get query item default value end

		String strMinuteRange = StringUtil.nullToEmptyOfObject(form.getMinuteRange());
		if (strMinuteRange.length() == 0) {
			strMinuteRange = "n30";
		}
		try {
			// 如果getMinuteRange是数字，说明保存的时间，否则保存的是时间范围列表的选项值
			String strRange = strMinuteRange.replace("-", "");
			int rangeNum = Integer.parseInt("-" + strRange);
			Date timeNow = this.ifaceMonitorService.getSysDate();
			Calendar calendarDate = Calendar.getInstance();
			calendarDate.setTime(timeNow);
			calendarDate.add(Calendar.MINUTE, rangeNum);
			Date dateCreatedBegin = calendarDate.getTime();
			String createdBegin = DateUtil.datetimeToString(dateCreatedBegin);
			request.setAttribute("createdBegin", createdBegin);
			form.setMinuteRange("");
		} catch (NumberFormatException e) {
		}
		return new ActionForward("/jsp/iface/monitor/ifaceMonitorSrch.jsp");
	}

	/**
	 *
	 * @author 李猛:mar 3, 2010
	 * @param form
	 * @return
	 * @throws IOException
	 * @throws ServletException
	 */
	public String getIfaceMonitorList(IfaceMonitorActionForm form) throws ServletException, IOException {
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();

		IfaceLogEventExample example = new IfaceLogEventExample();
		Criteria criteria = example.createCriteria();

		IfaceLogEventExample exampleFault = new IfaceLogEventExample();
		Criteria criteriaFault = exampleFault.createCriteria();

		if (form.getSuccessful() != null && !"".equals(form.getSuccessful())) {
			if (form.getSuccessful() != "NULL") {
				criteria.andSuccessfulEqualTo(form.getSuccessful());
			} else {
				criteria.andSuccessfulIsNull();
			}
		}

		Date timeNow = this.ifaceMonitorService.getSysDate();
		String createdEnd = DateUtil.datetimesToString(timeNow);
		request.setAttribute("createdEnd", createdEnd);

		Date dateCreatedBegin = null;
		if (form.getCreatedBegin() != null && form.getCreatedBegin().length() > 0) {
			dateCreatedBegin = DateUtil.stringToDatetime(form.getCreatedBegin());
			criteria.andCreatedGreaterThanOrEqualTo(dateCreatedBegin);
			criteriaFault.andCreatedGreaterThanOrEqualTo(dateCreatedBegin);
		} else {
			String strMinuteRange = StringUtil.nullToEmptyOfObject(form.getMinuteRange());
			if (strMinuteRange.length() == 0) {
				strMinuteRange = "n30";
			}
			if (strMinuteRange.length() > 1) {
				int rangeNum = -30;
				String firstChar = strMinuteRange.substring(0, 1);
				String restChar = strMinuteRange.substring(1, strMinuteRange.length());
				restChar = "-" + restChar;
				try {
					rangeNum = Integer.parseInt(restChar);
				} catch (NumberFormatException e) {
					rangeNum = -30;
					firstChar = "n";
				}
				Calendar calendarDate = Calendar.getInstance();
				calendarDate.setTime(timeNow);
				if (firstChar.equals("h")) {
					calendarDate.add(Calendar.HOUR, rangeNum);
				} else if (firstChar.equals("d")) {
					calendarDate.add(Calendar.DATE, rangeNum);
				} else if (firstChar.equals("w")) {
					calendarDate.add(Calendar.WEEK_OF_YEAR, rangeNum);
				} else if (firstChar.equals("m")) {
					calendarDate.add(Calendar.MONTH, rangeNum);
				} else if (firstChar.equals("y")) {
					calendarDate.add(Calendar.YEAR, rangeNum);
				} else {
					calendarDate.add(Calendar.MINUTE, rangeNum);
				}
				dateCreatedBegin = calendarDate.getTime();
			}
		}

		criteria.andCreatedGreaterThanOrEqualTo(dateCreatedBegin);
		criteriaFault.andCreatedGreaterThanOrEqualTo(dateCreatedBegin);

		example.setOrderByClause("APPLICATION_NAME,cimpName,logEventCount");
		List<IfaceLogEventMonitor> list = this.ifaceMonitorService.selectIfaceLogEventMonitorByExample(example);
		if (list != null && list.size() > 0) {
			request.setAttribute("ajaxPage", list);
		}

		String createdBegin = DateUtil.datetimesToString(dateCreatedBegin);
		request.setAttribute("createdBegin", createdBegin);

		int sumFault = 0;
		criteriaFault.andSuccessfulEqualTo("N");
		sumFault = this.ifaceMonitorService.selectCountByExample(exampleFault);
		request.setAttribute("sumFault", sumFault);

		return wctx.forwardToString("/jsp/iface/monitor/ifaceMonitorList.jsp");
	}

	public ActionForward saveQueryItemValue(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {
		SysUser currentUser = (SysUser) request.getSession().getAttribute("currentUser");
		if (currentUser != null) {
			String userId = StringUtil.nullToEmptyOfObject(currentUser.getUserId());

			IfaceMonitorActionForm saveForm = (IfaceMonitorActionForm) form;

			if (saveForm.getCreatedBegin() != null && saveForm.getCreatedBegin().length() > 0) {
				Date dateCreatedBegin = DateUtil.stringToDatetime(saveForm.getCreatedBegin());
				Date timeNow = this.ifaceMonitorService.getSysDate();
				long between = (timeNow.getTime() - dateCreatedBegin.getTime()) / (1000 * 60);
				int minute1 = (int) between;
				saveForm.setCreatedBegin("");
				saveForm.setMinuteRange(String.valueOf(minute1));
			}
			// 保存默认查询值
			try {
				this.suptQueryItemValueService.setFormQueryItemValue(userId, this.getClass().getSimpleName(), saveForm, IfaceMonitorActionForm.class);
			} catch (Exception e) {
				//
			}
		}
		return new ActionForward("/");
	}

	public IfaceLogEventCheck checkIfaceLogEventCheck(String strLastTime) {
		IfaceLogEventCheck obj = new IfaceLogEventCheck();
		obj.setLogEventCount(0);
		// 原用来进行业务接口异常告警，再改为各系统间异常告警
		// Date timeNow = this.ifaceMonitorService.getSysDate();
		// String strTimeNow = DateUtil.datetimesToString(timeNow);
		// obj.setStrNowTime(strTimeNow);

		// if (strLastTime != null && strLastTime.length() > 0) {
		// Date dateLastTime = DateUtil.stringToDateTime(strLastTime);
		// IfaceLogEventExample example = new IfaceLogEventExample();
		// Criteria criteria = example.createCriteria();
		// criteria.andCreatedGreaterThan(dateLastTime);
		// criteria.andSuccessfulEqualTo("N");
		// int count =
		// this.suptQueryItemValueService.selectCountByExample(example);
		// if (count > 0) {
		// obj.setLogEventCount(count);
		// }
		// }
		SuptBackgroundConfExample confExample = new SuptBackgroundConfExample();
		confExample.createCriteria().andIsValidEqualTo("T").andIsNormalEqualTo("F");
		Integer errorInterfaceNum = ifaceMonitorService.selectCountByExample(confExample);
		if (errorInterfaceNum != null && errorInterfaceNum > 0) {
			obj.setLogEventCount(errorInterfaceNum);
		}
		return obj;
	}

	/**
	 * 跳转到查询页面
	 *
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toIfaceMonitorLogEventList(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception, NoSuchFieldException {

		IfaceMonitorActionForm form = (IfaceMonitorActionForm) actionForm;
		IfaceLogEventExample example = new IfaceLogEventExample();
		Criteria criteria = example.createCriteria();

		if (form.getCreatedBegin() != null && !"".equals(form.getCreatedBegin())) {
			criteria.andCreatedGreaterThanOrEqualTo(DateUtil.stringToDateTime(form.getCreatedBegin()));
		}
		if (form.getCreatedEnd() != null && !"".equals(form.getCreatedEnd())) {
			criteria.andCreatedLessThanOrEqualTo(DateUtil.stringToDateTime(form.getCreatedEnd()));
		}
		if (form.getSuccessful() != null && !"".equals(form.getSuccessful())) {
			if (form.getSuccessful() != "NULL") {
				criteria.andSuccessfulEqualTo(form.getSuccessful());
			} else {
				criteria.andSuccessfulIsNull();
			}
		}

		String applicationId = StringUtil.nullToEmptyOfObject(form.getApplicationId());
		String methodName = StringUtil.nullToEmptyOfObject(form.getMethodName());
		criteria.andInApplicationMethod(applicationId, methodName);
		List<IfaceLogEvent> list = this.ifaceMonitorService.selectByExample(example);
		if (list != null && list.size() > 0) {
			request.setAttribute("ajaxPage", list);
		}
		return new ActionForward("/jsp/iface/monitor/ifaceMonitorLogEventList.jsp");
	}

	/**
	 * 跳转到查询页面
	 *
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward toIfaceLogRepositoryList(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception, NoSuchFieldException {
		IfaceMonitorActionForm form = (IfaceMonitorActionForm) actionForm;
		IfaceLogRepositoryExample example = new IfaceLogRepositoryExample();
		com.free.assist.domain.IfaceLogRepositoryExample.Criteria criteria = example.createCriteria();

		if (form.getRelateId() != null && !"".equals(form.getRelateId())) {
			criteria.andRelateIdEqualTo(form.getRelateId());
		}

		List<IfaceLogRepository> list = this.ifaceMonitorService.selectByExample(example);
		if (list != null && list.size() > 0) {
			request.setAttribute("ajaxPage", list);
		}
		example.setOrderByClause("SEQUENCE_ID,APPLICATION_NAME,METHOD_NAME,CREATE_ON");
		return new ActionForward("/jsp/iface/monitor/ifaceMonitorlogRepositoryList.jsp");
	}

	/**
	 * 各系统接口监控页面
	 *
	 * @param mapping
	 * @param actionform
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward initSysInterfaceList(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception, NoSuchFieldException {
		// 所有后台服务
		SuptBackgroundConfExample confExample = new SuptBackgroundConfExample();
		confExample.createCriteria().andIsValidEqualTo("T");// 有效，即需要监控
		confExample.setOrderByClause("BACKGROUND_TYPE_DESC");
		List<SuptBackgroundConf> confList = ifaceMonitorService.selectByExample(confExample);
		if (confList != null) {
			request.setAttribute("confList", confList);
		}
		return new ActionForward("/jsp/iface/monitor/sysInterfaceMonitor.jsp");
	}

}
