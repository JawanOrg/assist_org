/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_value_list��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_VALUE_LIST_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptValueListKey
 * @see��com.regaltec.blocimp.domain.SuptValueList
 * @see��com.regaltec.blocimp.domain.SuptValueListExample
 * @see��com.regaltec.blocimp.dao.SuptValueListDAO
 * @see��com.regaltec.blocimp.dao.SuptValueListDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-21 09:55:40 
 */
public class SuptValueListKey implements Serializable {
    private String orderId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="order_id", nullable=false, length=32)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}