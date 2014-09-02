package com.free.assist.web.sys;

import com.free.assist.web.BaseForm;

public class SysServiceConfigActionForm extends BaseForm {
	
	private String serviceId;
	
	private String serviceName;

    private String serviceType;

    private String serviceClass;

    private String serviceDesc;

    private String serviceHostname;

    private String wsUrl;

    private String runMode;

    private Integer runInterval;

    private String runParameter;

    private String startDefault;
    
    private String startRunonce;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceClass() {
		return serviceClass;
	}

	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	public String getServiceDesc() {
		return serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getServiceHostname() {
		return serviceHostname;
	}

	public void setServiceHostname(String serviceHostname) {
		this.serviceHostname = serviceHostname;
	}

	public String getWsUrl() {
		return wsUrl;
	}

	public void setWsUrl(String wsUrl) {
		this.wsUrl = wsUrl;
	}

	public String getRunMode() {
		return runMode;
	}

	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}

	public Integer getRunInterval() {
		return runInterval;
	}

	public void setRunInterval(Integer runInterval) {
		this.runInterval = runInterval;
	}

	public String getRunParameter() {
		return runParameter;
	}

	public void setRunParameter(String runParameter) {
		this.runParameter = runParameter;
	}

	public String getStartDefault() {
		return startDefault;
	}

	public void setStartDefault(String startDefault) {
		this.startDefault = startDefault;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getStartRunonce() {
		return startRunonce;
	}

	public void setStartRunonce(String startRunonce) {
		this.startRunonce = startRunonce;
	}
    
    

}
