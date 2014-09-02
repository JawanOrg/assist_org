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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_query_item_value��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_QUERY_ITEM_VALUE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptQueryItemValueKey
 * @see��com.regaltec.blocimp.domain.SuptQueryItemValue
 * @see��com.regaltec.blocimp.domain.SuptQueryItemValueExample
 * @see��com.regaltec.blocimp.dao.SuptQueryItemValueDAO
 * @see��com.regaltec.blocimp.dao.SuptQueryItemValueDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2010-03-17 14:50:27 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_query_item_value")
public class SuptQueryItemValue extends SuptQueryItemValueKey implements Serializable {
    private String itemValue;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="ITEM_VALUE", nullable=false, length=255)
    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }
}