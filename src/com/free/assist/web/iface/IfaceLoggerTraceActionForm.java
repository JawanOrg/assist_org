package com.free.assist.web.iface;

import com.free.assist.web.BaseForm;

public class IfaceLoggerTraceActionForm extends BaseForm {
	
	private static final long serialVersionUID = 20091210L;
	
	private String repositoryId;

	private String relateId;
	
	private String applicationName;
	
	private String traceLevel;
	
	private String createOnStart;
	
	private String createOnEnd;
	
	private String keySearch;
	
	private String methodName;
	
	private String traceText;
	
	private String xmlDocument;
	
	private String isArchived;

	public String getIsArchived() {
		return isArchived;
	}

	public void setIsArchived(String isArchived) {
		this.isArchived = isArchived;
	}

	public String getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}

	public String getRelateId() {
		return relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	public String getTraceText() {
		return traceText;
	}

	public void setTraceText(String traceText) {
		this.traceText = traceText;
	}

	public String getXmlDocument() {
		return xmlDocument;
	}

	public void setXmlDocument(String xmlDocument) {
		this.xmlDocument = xmlDocument;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getKeySearch() {
		return keySearch;
	}

	public void setKeySearch(String keySearch) {
		this.keySearch = keySearch;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getTraceLevel() {
		return traceLevel;
	}

	public void setTraceLevel(String traceLevel) {
		this.traceLevel = traceLevel;
	}

	public String getCreateOnStart() {
		return createOnStart;
	}

	public void setCreateOnStart(String createOnStart) {
		this.createOnStart = createOnStart;
	}

	public String getCreateOnEnd() {
		return createOnEnd;
	}

	public void setCreateOnEnd(String createOnEnd) {
		this.createOnEnd = createOnEnd;
	}
	
	

}
