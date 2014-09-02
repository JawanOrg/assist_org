package com.free.assist.framework;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.config.ModuleConfig;

import com.free.assist.domain.SysServiceConfigExample;

public class AppStartStrutsPlugIn implements org.apache.struts.action.PlugIn {

	public static String serviceHostName = "";

	public String getServiceHostName() {
		return serviceHostName;
	}

	public void setServiceHostName(String serviceHostName) {
		this.serviceHostName = serviceHostName;
	}

	public void destroy() {
		//System.out.println("=====停止系统后台进程=====");
	}

	public void init(ActionServlet arg0, ModuleConfig arg1) throws ServletException {
		//System.out.println("=====初始化系统后台进程=====");
		//SysTaskServiceImpl sysTaskServiceImpl = (SysTaskServiceImpl) SpringContextUtil.getBean("sysTaskServiceImpl", SysTaskServiceImpl.class);
		//SysServiceConfigExample example = new SysServiceConfigExample();
		//example.createCriteria().andStartDefaultEqualTo("Y");
		//作用：用来判断系统服务配置不是被删除掉的．
		//example.createCriteria().andIsDeletedEqualTo("N");
		//List<SysServiceConfig> list = sysTaskServiceImpl.selectByExample(example);
//		if (!list.isEmpty()) {
//			for (SysServiceConfig s : list) {
//				//s.setRunMode("Y");
//				SysTaskManager.addSysTask(s);
//			}
//			Set<String> set = SysTaskManager.sysHashMap.keySet();
//			for (String key : set) {
//				SysServiceConfig ss = SysTaskManager.sysHashMap.get(key);
////				if ("Y".equalsIgnoreCase(ss.getStartDefault())
////						&& (ss.getServiceHostname() == null || "".equals(ss.getServiceHostname()) || "ALL".equalsIgnoreCase(ss.getServiceHostname()) || this.serviceHostName == null || this.serviceHostName.equalsIgnoreCase(ss
////								.getServiceHostname()))) {
////					SysTaskManager.startSysTask(ss);
////				}
//				if ("Y".equalsIgnoreCase(ss.getStartDefault())) {
//					SysTaskManager.startSysTask(ss);
//				}
////				if ("Y".equalsIgnoreCase(ss.getStartDefault())) {
////					SysTaskManager.startSysTask(ss);
////				}
//			}
//		}
	}
}
