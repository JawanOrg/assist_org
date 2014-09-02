/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.exception;

/**
 * @author 李猛
 * @version 1
 * @date 2009-10-17 下午10:47:50
 */
public class DuplicateKeyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public DuplicateKeyException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public DuplicateKeyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public DuplicateKeyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DuplicateKeyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
