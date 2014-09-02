package com.free.assist.web.sys;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SuptTaticElement;
import com.free.assist.domain.SysAlarm;
import com.free.assist.domain.SysAlarmExample;
import com.free.assist.domain.SysUser;
import com.free.assist.service.sys.ISysLoginService;
import com.free.assist.util.Helper;
import com.free.assist.web.BaseAction;

@Controller("/sys/alarmAction")
public class AlarmAction  extends BaseAction{
	private ISysLoginService sysLoginService;

	@Autowired
	public void setSysLoginService(ISysLoginService sysLoginService) {
		this.sysLoginService = sysLoginService;
	}


	/**
	 * 告警初始化
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward init(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ActionForward("/jsp/sys/alarm/alarmQuery.jsp");
	}

	/**
	 * 查询告警
	 * @param form
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String alarmList(AlarmForm form) throws ServletException, IOException {
		SysUser currentUser=(SysUser)super.getSessionByDWR().getAttribute("currentUser");
		SysAlarmExample ex = new SysAlarmExample();
		List<SysAlarm> alarmList = this.sysLoginService.selectByExample(ex);
		WebContext wctx = WebContextFactory.get();
		HttpServletRequest request = wctx.getHttpServletRequest();
		request.setAttribute("alarmList", alarmList);
		return wctx.forwardToString("/jsp/sys/alarm/alarmList.jsp");
	}

	/**
	 * 清楚告警
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String delAlarm(String  checkids) throws ServletException, IOException {
		String s="";
		String[] tokens=Helper.split(checkids, "|");
		for(int i=0;i<tokens.length;i++){
			SysAlarm model = new SysAlarm();
			model.setAlarmId(tokens[i]);
			this.sysLoginService.deleteByPrimaryKey(model);
		}
		return s;
	}


}
