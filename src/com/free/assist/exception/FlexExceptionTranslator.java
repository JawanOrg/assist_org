/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.exception;

import org.springframework.flex.core.ExceptionTranslator;

import flex.messaging.MessageException;

/**
 * @author 李猛
 * @version 1
 * @date 2009-10-18 上午08:28:42
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
