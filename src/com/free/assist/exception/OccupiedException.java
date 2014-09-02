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
 * @date 2009-10-24 上午09:30:55
 */
public class OccupiedException extends RuntimeException {

	private static final long serialVersionUID = 20091024L;

	/**
	 * 
	 */
	public OccupiedException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public OccupiedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public OccupiedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public OccupiedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
