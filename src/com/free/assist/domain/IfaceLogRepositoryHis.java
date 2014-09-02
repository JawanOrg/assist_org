/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_iface_log_repository_his。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_HIS_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryHisKey
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryHis
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryHisExample
 * @see：com.regaltec.blocimp.dao.IfaceLogRepositoryHisDAO
 * @see：com.regaltec.blocimp.dao.IfaceLogRepositoryHisDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2010-01-06 16:06:41 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_repository_his")
public class IfaceLogRepositoryHis extends IfaceLogRepositoryHisKey implements Serializable {
    private String relateId;

    private Integer sequenceId;

    private String applicationId;
    
    private String applicationName;

    private String orderSn;

    private String methodName;

    private String traceIndicator;

    private String traceLevel;

    private String traceText;

    private String xmlDocument;

    private String parentId;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="RELATE_ID", nullable=true, length=32)
    public String getRelateId() {
        return relateId;
    }

    public void setRelateId(String relateId) {
        this.relateId = relateId;
    }

    @javax.persistence.Column(name="SEQUENCE_ID", nullable=true)
    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    @javax.persistence.Column(name="APPLICATION_ID", nullable=true, length=32)
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @javax.persistence.Transient
    public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	@javax.persistence.Column(name="ORDER_SN", nullable=true, length=40)
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @javax.persistence.Column(name="METHOD_NAME", nullable=true, length=32)
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @javax.persistence.Column(name="TRACE_INDICATOR", nullable=true, length=8)
    public String getTraceIndicator() {
        return traceIndicator;
    }

    public void setTraceIndicator(String traceIndicator) {
        this.traceIndicator = traceIndicator;
    }

    @javax.persistence.Column(name="TRACE_LEVEL", nullable=true, length=6)
    public String getTraceLevel() {
        return traceLevel;
    }

    public void setTraceLevel(String traceLevel) {
        this.traceLevel = traceLevel;
    }

    @javax.persistence.Column(name="TRACE_TEXT", nullable=true)
    public String getTraceText() {
        return traceText;
    }

    public void setTraceText(String traceText) {
        this.traceText = traceText;
    }

    @javax.persistence.Column(name="XML_DOCUMENT", nullable=true)
    public String getXmlDocument() {
        return xmlDocument;
    }

    public void setXmlDocument(String xmlDocument) {
        this.xmlDocument = xmlDocument;
    }

    @javax.persistence.Column(name="PARENT_ID", nullable=true, length=32)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}