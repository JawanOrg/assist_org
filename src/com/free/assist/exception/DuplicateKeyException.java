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
 * @date 2009-10-17 ����10:47:50
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
