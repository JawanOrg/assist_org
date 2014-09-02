/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain.vo;

import java.io.Serializable;

/**
 * @author 李猛
 * @version 1
 * @date 2009-10-13 08:39:15
 */
public class TraceRecordDTO implements Serializable {

	private static final long serialVersionUID = 20091013L;

	protected String applicationId;
	
	protected String relateId;

	protected String methodName;
	
	protected String parentId;
	
	protected String repositoryId; //主键
	
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
	 * <p>系统标识</p>
	 * @return
	 */
	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * <p>一次调用中共用的标识</p>
	 * @return
	 */
	public String getRelateId() {
		return relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	/**
	 * <p>方法名称</p>
	 * @return
	 */
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * <p>关联标识</p>
	 * @return
	 */
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * <p>主键</p>
	 * @return repositoryId
	 */
	public String getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}

	/**
	 * <p>日志记录等级</p>
	 * @return return 'ERROR' when exception，other return 'INFO'。
	 */
	public String getTraceIndicator() {
		return traceIndicator;
	}

	public void setTraceIndicator(String traceIndicator) {
		this.traceIndicator = traceIndicator;
	}

	/**
	 * <p>错误内容</p>
	 * @return
	 */
	public String getTraceText() {
		return traceText;
	}

	/**
	 * <p>设置错误内容</p>
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
	 * <p>工单内容</p>
	 * @return
	 */
	public String getXmlDocument() {
		return xmlDocument;
	}

	/**
	 * <p>设置工单内容</p>
	 */
	public void setXmlDocument(String xmlDocument) {
		this.xmlDocument = xmlDocument;
	}
}
