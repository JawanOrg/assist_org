package com.free.assist.framework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.lang.StringUtils;

import com.free.assist.domain.SysServiceConfig;
import com.free.assist.domain.SysServiceConfigExample;
import com.free.assist.util.SpringContextUtil;
import com.free.assist.util.StringUtil;

public class SysTaskManager {
	public static int i = 0;
	public static HashMap<String, SysServiceConfig> sysHashMap = new HashMap<String, SysServiceConfig>();
	public static HashMap<String, SysTask> runningTask = new HashMap<String, SysTask>();
	public static HashMap<String, Timer> runningTimer = new HashMap<String, Timer>();

	public static void addSysTask(SysServiceConfig s) {
		SysTaskManager.sysHashMap.put(s.getServiceId(), s);
	}

	/**
	 * 加载配置服务
	 * 
	 * @param t
	 * @param s
	 */
	public static void addRunningTask(Timer t, SysTask s) {
		if (!SysTaskManager.runningTask.containsKey(s.getSysServiceConfig().getServiceId())) {
			SysServiceConfig sc = SysTaskManager.sysHashMap.get(s.getSysServiceConfig().getServiceId());
			sc.setRunMode("Y");
			SysTaskManager.sysHashMap.put(sc.getServiceId(), sc);
			SysTaskManager.runningTask.put(s.getSysServiceConfig().getServiceId(), s);
			SysTaskManager.runningTimer.put(s.getSysServiceConfig().getServiceId(), t);
		}
	}

	/**
	 * 停止后台服务 参数要求从SysTaskManager的sysHashMap读取
	 * 
	 * @param s
	 */
	public static void stopSysTask(SysServiceConfig s) {
		if (SysTaskManager.runningTask.containsKey(s.getServiceId())) {
			SysServiceConfig sc = SysTaskManager.sysHashMap.get(s.getServiceId());
			if (sc != null) {
				sc.setRunMode("N");
				Timer t = SysTaskManager.runningTimer.get(sc.getServiceId());
				if (t != null) {
					if (!SysTaskManager.runningTask.get(sc.getServiceId()).cancel()) {
						t.cancel();
					}
					SysTaskManager.runningTask.remove(s.getServiceId());
					SysTaskManager.runningTimer.remove(s.getServiceId());
				}
			}
		}
	}

	/**
	 * 启动后台服务 参数要求从SysTaskManager的sysHashMap读取
	 * 2009-12-15  x  修改：增加是否启动一次服务选项
	 * @param s
	 */
	public static void startSysTask(SysServiceConfig s) {
		try {
			Object[] args = new Object[] { s };
			Class c = Class.forName(s.getServiceClass());
			Class[] argsClass = new Class[1];
			argsClass[0] = args[0].getClass();
			Constructor cons = c.getConstructor();
			String springBeanName = StringUtil.toFirstLetterLowercase(StringUtils.substringAfterLast(s.getServiceClass(), "."));
			TimerTask obj = (TimerTask) SpringContextUtil.getBean(springBeanName, SysTask.class);
			Method setMethod = c.getMethod("setSysServiceConfig", SysServiceConfig.class);
			setMethod.invoke(obj, s);

			Timer timer = new Timer();
			String startRunonce = s.getStartRunonce();
			if("N".equals(startRunonce)) {
				timer.scheduleAtFixedRate(obj, 2000, s.getRunInterval() * 1000);
				SysTaskManager.addRunningTask(timer, (SysTask) obj);
			} else if("Y".equals(startRunonce)) {
				timer.schedule(obj, new Date());
				SysTaskManager.addRunningTask(timer, (SysTask) obj);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 在系统运行中，修改某个后台服务的间隔时间与默认启动选项(Y)，以及是否只启动一次(2009-12-15新增加服务选项)，这时需要先把系统中对应已经启动的后台服务停止，
	 * 然后再根据最新修改后的选项重新启动这个后台服务．
	 * @author  x :Oct 30, 2009
	 * 2009-12-15  x  修改：增加是否启动一次服务选项
	 * @param s
	 */
	public static void restartSysTaskOnSysRunning(SysServiceConfig s) {
		//将后台服务在运行系统中停止未删除掉
		if (SysTaskManager.runningTask.containsKey(s.getServiceId())) {
			Timer t = SysTaskManager.runningTimer.get(s.getServiceId());
			if (t != null) {
				if (!SysTaskManager.runningTask.get(s.getServiceId()).cancel()) {
					t.cancel();
				}
				SysTaskManager.runningTask.remove(s.getServiceId());
				SysTaskManager.runningTimer.remove(s.getServiceId());
			}
		}
		//根据最新的后台服务选项重新启动这个后台服务
		try {
			Object[] args = new Object[] { s };
			Class c = Class.forName(s.getServiceClass());
			Class[] argsClass = new Class[1];
			argsClass[0] = args[0].getClass();
			Constructor cons = c.getConstructor();
			String springBeanName = StringUtil.toFirstLetterLowercase(StringUtils.substringAfterLast(s.getServiceClass(), "."));
			TimerTask obj = (TimerTask) SpringContextUtil.getBean(springBeanName, SysTask.class);
			Method setMethod = c.getMethod("setSysServiceConfig", SysServiceConfig.class);
			setMethod.invoke(obj, s);

			Timer timer = new Timer();
			String startRunonce = s.getStartRunonce();
			if("N".equals(startRunonce)) {
				timer.scheduleAtFixedRate(obj, 2000, s.getRunInterval() * 1000);
				SysTaskManager.addRunningTask(timer, (SysTask) obj);
			} else if("Y".equals(startRunonce)) {
				timer.schedule(obj, new Date());
				SysTaskManager.addRunningTask(timer, (SysTask) obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 停止所有后台服务
	 */
	public static void stopAllSysTask() {

		Set<String> sett = SysTaskManager.runningTimer.keySet();
		for (String serviseId : sett) {
			Timer t = SysTaskManager.runningTimer.get(serviseId);
			if (!SysTaskManager.runningTask.get(serviseId).cancel()) {
				SysServiceConfig sc = SysTaskManager.sysHashMap.get(serviseId);
				sc.setRunMode("N");
				if (!SysTaskManager.runningTask.get(serviseId).cancel()) {
					t.cancel();
				}
			}
		}
		// SysTaskManager.sysHashMap.clear();
		SysTaskManager.runningTask.clear();
		SysTaskManager.runningTimer.clear();
	}
	
	/**
	 * 停止所有选中后台服务
	 * @author  x :Oct 22, 2009
	 */
	public static void stopAllSelectedSysTask(String ids) {
		if(ids!=null && !"".equals(ids)) {
			String[] selectedIds = ids.split(",");
			for(int i=0;i<selectedIds.length;i++) {
				Set<String> sett = SysTaskManager.runningTimer.keySet();
				for (String serviseId : sett) {
					//从所有后台服务中筛选出选中后台服务
					if(serviseId.equals(selectedIds[i])) {
						Timer t = SysTaskManager.runningTimer.get(serviseId);
						if(!SysTaskManager.runningTask.get(serviseId).cancel()) {
							SysServiceConfig sc = SysTaskManager.sysHashMap.get(serviseId);
							sc.setRunMode("N");
							sc.setIsDeleted("Y");
							if (!SysTaskManager.runningTask.get(serviseId).cancel()) {
								t.cancel();
							}
						} else {
							SysServiceConfig sc = SysTaskManager.sysHashMap.get(serviseId);
							sc.setRunMode("N");
							sc.setIsDeleted("Y");
						}
					}
				}
				SysTaskManager.runningTask.remove(selectedIds[i]);
				SysTaskManager.runningTimer.remove(selectedIds[i]);
			}
		}
	}

	/**
	 * 重新加载所有后台服务
	 */
	public static void restartAllSysTask() {
		if (SysTaskManager.runningTimer.size() > 0) {
			Set<String> sett = SysTaskManager.runningTimer.keySet();
			for (String serviseId : sett) {
				Timer t = SysTaskManager.runningTimer.get(serviseId);
				if (!SysTaskManager.runningTask.get(serviseId).cancel()) {
					SysServiceConfig sc = SysTaskManager.sysHashMap.get(serviseId);
					sc.setRunMode("N");
					t.cancel();
				}
			}
			// SysTaskManager.sysHashMap.clear();
			SysTaskManager.runningTask.clear();
			SysTaskManager.runningTimer.clear();
		}
		//SysTaskServiceImpl sysTaskServiceImpl = (SysTaskServiceImpl) SpringContextUtil.getBean("sysTaskServiceImpl", SysTaskServiceImpl.class);
		SysServiceConfigExample example = new SysServiceConfigExample();
		//List<SysServiceConfig> list = sysTaskServiceImpl.selectByExample(example);
//		if (!list.isEmpty()) {
//			for (SysServiceConfig s : list) {
//				SysTaskManager.addSysTask(s);
//			}
//			Set<String> set = SysTaskManager.sysHashMap.keySet();
//			for (String key : set) {
//				SysServiceConfig ss = SysTaskManager.sysHashMap.get(key);
//				if ("Y".equalsIgnoreCase(ss.getStartDefault())) {
//					SysTaskManager.startSysTask(ss);
//				}
//			}
//		}
	}
}
