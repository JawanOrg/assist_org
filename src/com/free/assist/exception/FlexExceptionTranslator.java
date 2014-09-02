/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.exception;

import org.springframework.flex.core.ExceptionTranslator;

import flex.messaging.MessageException;

/**
 * @author ����
 * @version 1
 * @date 2009-10-18 ����08:28:42
 */
public class FlexExceptionTranslator implements ExceptionTranslator {

	/* (non-Javadoc)
	 * @see org.springframework.flex.core.ExceptionTranslator#handles(java.lang.Class)
	 */
	public boolean handles(Class<?> cls) {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.springframework.flex.core.ExceptionTranslator#translate(java.lang.Throwable)
	 */
	public MessageException translate(Throwable throwable) {
		MessageException me = new MessageException();
		me.setMessage(throwable.getMessage());
		me.setDetails(me.toString());
		me.setRootCause(throwable);
		return me;
	}

}
