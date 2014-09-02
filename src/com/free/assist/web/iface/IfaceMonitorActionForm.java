package com.free.assist.web.iface;

import com.free.assist.web.BaseForm;

public class IfaceMonitorActionForm extends BaseForm {
	
	private String minuteRange;
	private String successful;
	
	
	public String getMinuteRange() {
		return minuteRange;
	}
	public void setMinuteRange(String minuteRange) {
		this.minuteRange = minuteRange;
	}
	public String getSuccessful() {
		return successful;
	}
	public void setSuccessful(String successful) {
		this.successful = successful;
	}
	

	private String applicationId;
	private String methodName;
	private String createdBegin;
	private String createdEnd;
	
	
	private String type;
	private String description;
	private String eventId;
	private String relateId;

	private String repositoryId;
	
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getCreatedBegin() {
		return createdBegin;
	}
	public void setCreatedBegin(String createdBegin) {
		this.createdBegin = createdBegin;
	}
	public String getCreatedEnd() {
		return createdEnd;
	}
	public void setCreatedEnd(String createdEnd) {
		this.createdEnd = createdEnd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getRelateId() {
		return relateId;
	}
	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}
	
	public String getRepositoryId() {
		return repositoryId;
	}
	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}
	
	
	
}
