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

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_event��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_EVENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogEventKey
 * @see��com.regaltec.blocimp.domain.IfaceLogEvent
 * @see��com.regaltec.blocimp.domain.IfaceLogEventExample
 * @see��com.regaltec.blocimp.dao.IfaceLogEventDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogEventDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-08 19:30:47 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_event")
public class IfaceLogEvent extends IfaceLogEventKey implements Serializable {

	public static String EVENT_TYPE_TRACE = "TRACE";
	
	public static String EVENT_TYPE_FAULT = "FAULT";

    private String relateId;

    private String type;

    private String description;

    private String document;

    private String successful;

    private Date created;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="RELATE_ID", nullable=true, length=32)
    public String getRelateId() {
        return relateId;
    }

    public void setRelateId(String relateId) {
        this.relateId = relateId;
    }

    @javax.persistence.Column(name="TYPE", nullable=true, length=45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @javax.persistence.Column(name="DESCRIPTION", nullable=true)
    public String getDescription() {
        return description;
    }

    public IfaceLogEvent setDescription(String description) {
        this.description = description;
        return this;
    }

    @javax.persistence.Column(name="DOCUMENT", nullable=true)
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @javax.persistence.Column(name="SUCCESSFUL", nullable=true, length=1)
    public String getSuccessful() {
        return successful;
    }

    public void setSuccessful(String successful) {
        this.successful = successful;
    }

    @javax.persistence.Column(name="CREATED", nullable=true)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}