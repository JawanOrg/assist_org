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
		log.error("���ַ����쳣==�ࣺ" + m.getDeclaringClass().getName() + "==������" + m.getName());
		//TODO ��̨����ֹͣ�澯 ����
		//TODO ֪ͨ�������Ӹ澯��ID���Ѿ�ֹͣ��
		SysTaskManager.stopSysTask(((SysTask) target).getSysServiceConfig());
	}

	public void afterReturning(Object returnValue, Method m, Object[] args, Object target) throws Throwable {
		SysTask st = (SysTask) target;
		if (st.isException) {
			//TODO ����ʧ�ܸ澯 �ж��Ƿ���Ҫֹͣ�������ж�timertask�Ƿ�cancel����
			//TODO �澯 ���� ��
			//TODO ֪ͨ�������Ӹ澯��ID,�Ƿ��Ѿ�ֹͣ�ȡ�
			log.error("����ִ�����==�ࣺ" + m.getDeclaringClass().getName() + "==������" + m.getName() + "�����쳣�������쳣��Ϣ��" + st.getExceptionMsg());
			st.errorHandler();
			st.setExceptionMsg("");
			st.setException(false);
		}else{
			log.debug("����ִ�����==�ࣺ" + m.getDeclaringClass().getName() + "==������" + m.getName() + "�����쳣����");
		}
	}

	// x 
	public void before(Method paramMethod, Object[] paramArrayOfObject,
			Object paramObject) throws Throwable {
		log.debug("����ִ��ǰ����ִ���������������:---------doornotdo----------------");
	}
}