/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: ��˾</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��T_BUS_RELEASE_ACTUAL��
 * <p>SQLӳ���ļ�·��Ϊ��com.free.assist.dao.xml.T_BUS_RELEASE_ACTUAL_SqlMap.xml��</p>
 * @see��com.free.assist.domain.BusReleaseActualKey
 * @see��com.free.assist.domain.BusReleaseActual
 * @see��com.free.assist.domain.BusReleaseActualExample
 * @see��com.free.assist.dao.BusReleaseActualDAO
 * @see��com.free.assist.dao.BusReleaseActualDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2015-01-15 16:51:19 
 */
public class BusReleaseActualKey implements Serializable {
    private String billId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="BILL_ID", nullable=false, length=32)
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
}