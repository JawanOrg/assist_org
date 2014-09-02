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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_value_list��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_VALUE_LIST_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptValueListKey
 * @see��com.regaltec.blocimp.domain.SuptValueList
 * @see��com.regaltec.blocimp.domain.SuptValueListExample
 * @see��com.regaltec.blocimp.dao.SuptValueListDAO
 * @see��com.regaltec.blocimp.dao.SuptValueListDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-21 09:55:40 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_value_list")
public class SuptValueList extends SuptValueListKey implements Serializable {
    private String billId;

    private String depenNode;

    private String values;

    private Date createDate;

    private String createUser;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="bill_id", nullable=true, length=32)
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @javax.persistence.Column(name="depen_node", nullable=true, length=32)
    public String getDepenNode() {
        return depenNode;
    }

    public void setDepenNode(String depenNode) {
        this.depenNode = depenNode;
    }

    @javax.persistence.Column(name="values", nullable=true, length=32)
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @javax.persistence.Column(name="create_date", nullable=true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Column(name="create_user", nullable=true, length=32)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}