/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.exception;

/**
 * @author ����
 * @version 1
 * @date 2009-10-24 ����09:30:55
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
