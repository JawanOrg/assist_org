package com.free.assist.web.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.free.assist.domain.SysServiceConfig;
import com.free.assist.domain.SysServiceConfigExample;
import com.free.assist.framework.SysTask;
import com.free.assist.framework.SysTaskManager;
import com.free.assist.service.sys.ISysTaskService;
import com.free.assist.util.ObjectUtil;
import com.free.assist.web.BaseAction;

@Controller("/sys/sysTaskAction")
public class SysTaskAction extends BaseAction {
//	private ISysTaskService sysTaskServiceImpl;
//
//	@Autowired
//	public void setSysTaskServiceImpl(ISysTaskService sysTaskServiceImpl) {
//		this.sysTaskServiceImpl = sysTaskServiceImpl;
//	}

	public ActionForward newSysTaskIndex(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ActionForward("/jsp/systask/newSysTask.jsp");
	}

	public ActionForward initRunningAndStopTaskIndex(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<SysServiceConfig> runningTaskList = new ArrayList<SysServiceConfig>();
		HashMap<String, SysTask> runningTask = SysTaskManager.runningTask;
		Set<String> set = runningTask.keySet();
		for (String id : set) {
			SysTask st = runningTask.get(id);
			runningTaskList.add(st.getSysServiceConfig());
		}
		request.setAttribute("runningTaskList", runningTaskList);

		List<SysServiceConfig> stopTaskList = new ArrayList<SysServiceConfig>();
		HashMap<String, SysServiceConfig> sysHashMap = SysTaskManager.sysHashMap;
		Set<String> set2 = sysHashMap.keySet();
		for (String id : set2) {
			SysServiceConfig sc = sysHashMap.get(id);
			if (!"Y".equalsIgnoreCase(sc.getRunMode()))
				stopTaskList.add(sc);
		}
		request.setAttribute("stopTaskList", stopTaskList);

		return new ActionForward("/jsp/systask/sysTaskMananger.jsp");
	}

	public String stopTask(String serviceId) {
		SysServiceConfig sc = SysTaskManager.sysHashMap.get(serviceId);
		sc.setServiceId(serviceId);
		SysTaskManager.stopSysTask(sc);
		return serviceId;
	}

	public String startTask(String serviceId) {
//		SysServiceConfig sysServiceConfig = null;
//		if (serviceId != null && !"".equals(serviceId)) {
//			SysServiceConfig key = new SysServiceConfig();
//			key.setServiceId(serviceId.trim());
//			sysServiceConfig = (SysServiceConfig) sysTaskServiceImpl
//					.selectByPrimaryKey(key);
//		}
//		SysServiceConfig sc = SysTaskManager.sysHashMap.get(serviceId);
//		if (sysServiceConfig != null) {
//			ObjectUtil.copyObjectToObject(sysServiceConfig, sc);
//		}
//		sc.setServiceId(serviceId);
//		sc.setRunMode("Y");
//		SysTaskManager.startSysTask(sc);
		return serviceId;
	}

	public String newSysTask(SysServiceConfig sc) throws Exception {
//		SysServiceConfigExample example = new SysServiceConfigExample();
//		if (sc != null && sc.getServiceClass() != null
//				&& !"".equals(sc.getServiceClass())) {
//			example.createCriteria()
//					.andServiceClassEqualTo(sc.getServiceClass().trim())
//					.andIsDeletedEqualTo("N");
//			List list = sysTaskServiceImpl.selectByExample(example);
//			if (list != null && list.size() >= 1) {
//				return "failure";
//			}
//		}
//		this.sysTaskServiceImpl.insert(sc);
//		SysTaskManager.addSysTask(sc);
//		if ("Y".equalsIgnoreCase(sc.getStartDefault())) {
//			SysTaskManager.startSysTask(sc);
//		}
		return "";
	}

	public void reLoadAllSysTask() {
		SysTaskManager.restartAllSysTask();
	}

	public void stopAllSysTask() {
		SysTaskManager.stopAllSysTask();
	}
}
