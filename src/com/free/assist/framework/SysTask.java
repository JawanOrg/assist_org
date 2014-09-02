package com.free.assist.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.free.assist.domain.SysServiceConfig;

public class SysTask extends java.util.TimerTask {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public SysServiceConfig sysServiceConfig;

	public SysServiceConfig getSysServiceConfig() {
		return sysServiceConfig;
	}

	public void setSysServiceConfig(SysServiceConfig sysServiceConfig) {
		this.sysServiceConfig = sysServiceConfig;
	}

	public SysTask() {
		super();
	}

	public boolean isException = false;

	public void setException(boolean isException) {
		this.isException = isException;
	}

	public boolean isException() {
		return isException;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String exceptionMsg = "";

	@Override
	public void run() {
		System.out.println("=================");
	}
	public void errorHandler(){
		//System.out.println();
	}
}
