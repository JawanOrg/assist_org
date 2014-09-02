/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain.vo;

import java.io.Serializable;

/**
 * @author ����
 * @version 1
 * @date 2009-10-13 08:39:15
 */
public class TraceRecordDTO implements Serializable {

	private static final long serialVersionUID = 20091013L;

	protected String applicationId;
	
	protected String relateId;

	protected String methodName;
	
	protected String parentId;
	
	protected String repositoryId; //����
	
	protected String traceIndicator;
	
	protected String traceText;
	
	protected boolean tryAgain;
	
	protected String xmlDocument;

	public TraceRecordDTO() {
	}
	
	public TraceRecordDTO(String applicationId, String methodName, String traceIndicator, String traceText, String xmlDocument, String relateId, String parentId, boolean tryAgain) {
		this.applicationId = applicationId;
		this.methodName = methodName;
		this.traceIndicator = traceIndicator;
		this.traceText = traceText;
		this.xmlDocument = xmlDocument;
		this.relateId = relateId;
		this.parentId = parentId;
		this.tryAgain = tryAgain;
	}

	/**
	 * <p>ϵͳ��ʶ</p>
	 * @return
	 */
	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * <p>һ�ε����й��õı�ʶ</p>
	 * @return
	 */
	public String getRelateId() {
		return relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	/**
	 * <p>��������</p>
	 * @return
	 */
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * <p>������ʶ</p>
	 * @return
	 */
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * <p>����</p>
	 * @return repositoryId
	 */
	public String getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}

	/**
	 * <p>��־��¼�ȼ�</p>
	 * @return return 'ERROR' when exception��other return 'INFO'��
	 */
	public String getTraceIndicator() {
		return traceIndicator;
	}

	public void setTraceIndicator(String traceIndicator) {
		this.traceIndicator = traceIndicator;
	}

	/**
	 * <p>��������</p>
	 * @return
	 */
	public String getTraceText() {
		return traceText;
	}

	/**
	 * <p>���ô�������</p>
	 */
	public void setTraceText(String traceText) {
		this.traceText = traceText;
	}

	public boolean getTryAgain() {
		return tryAgain;
	}

	public void setTryAgain(boolean tryAgain) {
		this.tryAgain = tryAgain;
	}

	/**
	 * <p>��������</p>
	 * @return
	 */
	public String getXmlDocument() {
		return xmlDocument;
	}

	/**
	 * <p>���ù�������</p>
	 */
	public void setXmlDocument(String xmlDocument) {
		this.xmlDocument = xmlDocument;
	}
}
