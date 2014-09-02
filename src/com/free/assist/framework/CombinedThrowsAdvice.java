package com.free.assist.framework;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class CombinedThrowsAdvice implements ThrowsAdvice, AfterReturningAdvice ,MethodBeforeAdvice  {
	public final Log log = LogFactory.getLog(getClass());
	public void afterThrowing(Method m, Object[] args, Object target, Throwable ex) {
		log.error("发现服务异常==类：" + m.getDeclaringClass().getName() + "==方法：" + m.getName());
		//TODO 后台服务停止告警 短信
		//TODO 通知内容增加告警表ID，已经停止。
		SysTaskManager.stopSysTask(((SysTask) target).getSysServiceConfig());
	}

	public void afterReturning(Object returnValue, Method m, Object[] args, Object target) throws Throwable {
		SysTask st = (SysTask) target;
		if (st.isException) {
			//TODO 服务失败告警 判断是否需要停止服务（先判断timertask是否cancel）。
			//TODO 告警 短信 。
			//TODO 通知内容增加告警表ID,是否已经停止等。
			log.error("服务执行完毕==类：" + m.getDeclaringClass().getName() + "==方法：" + m.getName() + "，有异常发生，异常信息：" + st.getExceptionMsg());
			st.errorHandler();
			st.setExceptionMsg("");
			st.setException(false);
		}else{
			log.debug("服务执行完毕==类：" + m.getDeclaringClass().getName() + "==方法：" + m.getName() + "，无异常发生");
		}
	}

	// x 
	public void before(Method paramMethod, Object[] paramArrayOfObject,
			Object paramObject) throws Throwable {
		log.debug("服务执行前，先执行这个测试拦截器:---------doornotdo----------------");
	}
}