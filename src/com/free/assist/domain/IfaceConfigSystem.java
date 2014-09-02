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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_conf_system��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_SYSTEM_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystemKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystem
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystemExample
 * @see��com.regaltec.blocimp.dao.IfaceConfigSystemDAO
 * @see��com.regaltec.blocimp.dao.IfaceConfigSystemDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-03 15:44:14 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_conf_system")
public class IfaceConfigSystem extends IfaceConfigSystemKey implements Serializable {
    private String applicationSn;

    private String applicationName;

    private String available;

    private Date createDate;

    private Date updateDate;

    private String updateUser;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="APPLICATION_SN", nullable=false, length=200)
    public String getApplicationSn() {
        return applicationSn;
    }

    public void setApplicationSn(String applicationSn) {
        this.applicationSn = applicationSn;
    }

    @javax.persistence.Column(name="APPLICATION_NAME", nullable=false, length=200)
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=false, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Column(name="UPDATE_ON", nullable=false)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @javax.persistence.Column(name="UPDATE_BY", nullable=false, length=32)
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}