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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_dic_item��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_DIC_ITEM_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysDicItemKey
 * @see��com.regaltec.blocimp.domain.SysDicItem
 * @see��com.regaltec.blocimp.domain.SysDicItemExample
 * @see��com.regaltec.blocimp.dao.SysDicItemDAO
 * @see��com.regaltec.blocimp.dao.SysDicItemDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysDicItemKey implements Serializable {
    private String itemId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="Item_Id", nullable=false, length=32)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}