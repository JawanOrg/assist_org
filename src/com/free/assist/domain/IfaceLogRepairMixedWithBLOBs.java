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
 * <p>该实体对应数据库的表名为：v_iface_log_repair。</p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.V_IFACE_LOG_REPAIR_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairMixed
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairMixedWithBLOBs
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairMixedExample
 * @see：com.regaltec.blocimp.dao.IfaceLogRepairMixedDAO
 * @see：com.regaltec.blocimp.dao.IfaceLogRepairMixedDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-29 09:34:48 
 */
public class IfaceLogRepairMixedWithBLOBs extends IfaceLogRepairWithBLOBs implements Serializable {

	private static final long serialVersionUID = 1L;

    private String traceText;

    private String xmlDocument;

    private String applicationId;

    private String applicationSn;

    private String applicationName;

    private String methodName;

    private String traceIndicator;

    private String traceLevel;

    private String parentId;

    private Date createDate;

    @javax.persistence.Column(name="APPLICATION_ID", nullable=false, length=32)
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @javax.persistence.Column(name="APPLICATION_SN", nullable=true, length=200)
    public String getApplicationSn() {
        return applicationSn;
    }

    public void setApplicationSn(String applicationSn) {
        this.applicationSn = applicationSn;
    }

    @javax.persistence.Column(name="APPLICATION_NAME", nullable=true, length=200)
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @javax.persistence.Column(name="METHOD_NAME", nullable=false, length=32)
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

    @javax.persistence.Column(name="PARENT_ID", nullable=false, length=32)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
}