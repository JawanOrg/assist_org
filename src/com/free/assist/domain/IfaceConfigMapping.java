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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_conf_mapping��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_MAPPING_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigMappingKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigMapping
 * @see��com.regaltec.blocimp.domain.IfaceConfigMappingExample
 * @see��com.regaltec.blocimp.dao.IfaceConfigMappingDAO
 * @see��com.regaltec.blocimp.dao.IfaceConfigMappingDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-28 22:51:59 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_conf_mapping")
public class IfaceConfigMapping extends IfaceConfigMappingKey implements Serializable {

    private String sourcePid;

    private String sourceId;

    private String sourceSn;

    private String sourceName;

    private String resultPid;

    private String resultId;

    private String resultSn;

    private String resultName;

    private String available;

    private Date updateDate;

    private String updateUser;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Transient
    public String getSourcePid() {
        return sourcePid;
    }

    public void setSourcePid(String sourcePid) {
        this.sourcePid = sourcePid;
    }

    @javax.persistence.Column(name="SOURCE_ID", nullable=false, length=32)
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @javax.persistence.Transient
    public String getSourceSn() {
        return sourceSn;
    }

    public void setSourceSn(String sourceSn) {
        this.sourceSn = sourceSn;
    }

    @javax.persistence.Transient
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @javax.persistence.Transient
    public String getResultPid() {
        return resultPid;
    }

    public void setResultPid(String resultPid) {
        this.resultPid = resultPid;
    }

    @javax.persistence.Column(name="RESULT_ID", nullable=false, length=32)
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    @javax.persistence.Transient
    public String getResultSn() {
        return resultSn;
    }

    public void setResultSn(String resultSn) {
        this.resultSn = resultSn;
    }

    @javax.persistence.Transient
    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=true, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @javax.persistence.Column(name="UPDATE_ON", nullable=false)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @javax.persistence.Column(name="UPDATE_BY", nullable=true, length=32)
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}