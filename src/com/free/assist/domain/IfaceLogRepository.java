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
 * <p>该实体对应数据库的表名为：t_iface_log_repository。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogRepository
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryExample
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryKey
 * @see：com.regaltec.blocimp.dao.IfaceLogRepositoryDAO
 * @see：com.regaltec.blocimp.dao.IfaceLogRepositoryDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-05 08:37:54 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_repository")
public class IfaceLogRepository extends IfaceLogRepositoryKey implements Serializable {

    private String relateId;

    private Integer sequenceId;

    private String applicationId;

    private String applicationSn;

    private String applicationName;

    private String methodName;

    private String traceIndicator;

    private String traceLevel;

    private String traceText;

    private String xmlDocument;

    private String parentId;

    private String temporary1;

    private String temporary2;

    private String temporary3;

    private String temporary4;

    private String temporary5;

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
    public String getApplicationSn() {
        return applicationSn;
    }

    public void setApplicationSn(String applicationSn) {
        this.applicationSn = applicationSn;
    }

    @javax.persistence.Transient
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
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

    @javax.persistence.Column(name="TRACE_LEVEL", nullable=false, length=6)
    public String getTraceLevel() {
        return traceLevel;
    }

    public void setTraceLevel(String traceLevel) {
        this.traceLevel = traceLevel;
    }

    @javax.persistence.Column(name="TRACE_TEXT", nullable=false)
    public String getTraceText() {
        return traceText;
    }

    public void setTraceText(String traceText) {
        this.traceText = traceText;
    }

    @javax.persistence.Column(name="XML_DOCUMENT", nullable=false)
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

    @javax.persistence.Column(name="TEMPORARY1", nullable=true, length=32)
    public String getTemporary1() {
        return temporary1;
    }

    public void setTemporary1(String temporary1) {
        this.temporary1 = temporary1;
    }

    @javax.persistence.Column(name="TEMPORARY2", nullable=true, length=32)
    public String getTemporary2() {
        return temporary2;
    }

    public void setTemporary2(String temporary2) {
        this.temporary2 = temporary2;
    }

    @javax.persistence.Column(name="TEMPORARY3", nullable=true, length=32)
    public String getTemporary3() {
        return temporary3;
    }

    public void setTemporary3(String temporary3) {
        this.temporary3 = temporary3;
    }

    @javax.persistence.Column(name="TEMPORARY4", nullable=true, length=32)
    public String getTemporary4() {
        return temporary4;
    }

    public void setTemporary4(String temporary4) {
        this.temporary4 = temporary4;
    }

    @javax.persistence.Column(name="TEMPORARY5", nullable=true, length=32)
    public String getTemporary5() {
        return temporary5;
    }

    public void setTemporary5(String temporary5) {
        this.temporary5 = temporary5;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}