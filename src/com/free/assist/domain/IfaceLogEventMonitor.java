/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_event")
public class IfaceLogEventMonitor implements Serializable {

    private String applicationId;

    private String applicationSn;

    private String applicationName;

    private String methodName;

    private String cimpName;

    private Integer logEventCount;
     
    private Date lastCreated;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationSn() {
		return applicationSn;
	}

	public void setApplicationSn(String applicationSn) {
		this.applicationSn = applicationSn;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getCimpName() {
		return cimpName;
	}

	public void setCimpName(String cimpName) {
		this.cimpName = cimpName;
	}

	public Integer getLogEventCount() {
		return logEventCount;
	}

	public void setLogEventCount(Integer logEventCount) {
		this.logEventCount = logEventCount;
	}

	public Date getLastCreated() {
		return lastCreated;
	}

	public void setLastCreated(Date lastCreated) {
		this.lastCreated = lastCreated;
	}
	

}