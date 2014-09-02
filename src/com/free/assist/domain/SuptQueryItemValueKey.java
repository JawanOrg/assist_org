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
 * @autor ibator1
 * @version 1.2.1
 * @date 2010-03-17 14:50:27 
 */
public class SuptQueryItemValueKey implements Serializable {
    private String itemCode;

    private String moduleCode;

    private String userId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="ITEM_CODE", nullable=false, length=255)
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @javax.persistence.Column(name="MODULE_CODE", nullable=false, length=100)
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    @javax.persistence.Column(name="USER_ID", nullable=false, length=100)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}