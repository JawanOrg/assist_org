package com.free.assist.exception;

public class SystemExceptioin extends Exception {

	private static final long serialVersionUID = -1724428991373368350L;

	public SystemExceptioin() {
		super("系统引起的异常错误");
	}

	public SystemExceptioin(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemExceptioin(String message) {
		super(message);
	}

	public SystemExceptioin(Throwable cause) {
		super(cause);
	}
}
