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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_daemon_document��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_DAEMON_DOCUMENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceDaemonDocumentKey
 * @see��com.regaltec.blocimp.domain.IfaceDaemonDocument
 * @see��com.regaltec.blocimp.domain.IfaceDaemonDocumentExample
 * @see��com.regaltec.blocimp.dao.IfaceDaemonDocumentDAO
 * @see��com.regaltec.blocimp.dao.IfaceDaemonDocumentDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-08 17:20:10 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_daemon_document")
public class IfaceDaemonDocument extends IfaceDaemonDocumentKey implements Serializable {
    private String relateId;

    private String inputXML;

    private String resultXML;

    private Integer runCount;

    private String available;

    private Date createOn;

    private Date updateOn;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="RELATE_ID", nullable=true, length=32)
    public String getRelateId() {
        return relateId;
    }

    public void setRelateId(String relateId) {
        this.relateId = relateId;
    }

    @javax.persistence.Column(name="INPUT_XML", nullable=true)
    public String getInputXML() {
        return inputXML;
    }

    public void setInputXML(String inputXML) {
        this.inputXML = inputXML;
    }

    @javax.persistence.Column(name="RESULT_XML", nullable=true)
    public String getResultXML() {
        return resultXML;
    }

    public void setResultXML(String resultXML) {
        this.resultXML = resultXML;
    }

    @javax.persistence.Column(name="RUN_COUNT", nullable=true)
    public Integer getRunCount() {
        return runCount;
    }

    public void setRunCount(Integer runCount) {
        this.runCount = runCount;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=true, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=false)
    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    @javax.persistence.Column(name="UPDATE_ON", nullable=false)
    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }
}