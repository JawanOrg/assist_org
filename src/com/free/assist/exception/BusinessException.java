package com.free.assist.exception;

public class BusinessException extends Exception {

	private static final long serialVersionUID = -1570784813764141997L;

	public BusinessException() {
		super("ҵ��������쳣����");
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

}
