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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_iface_group_relation��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_IFACE_GROUP_RELATION_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelationKey
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelation
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelationExample
 * @see��com.regaltec.blocimp.dao.SuptIfaceGroupRelationDAO
 * @see��com.regaltec.blocimp.dao.SuptIfaceGroupRelationDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-09 09:55:02 
 */
public class SuptIfaceGroupRelationKey implements Serializable {
    private String ifaceGroupId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="iface_Group_Id", nullable=false, length=64)
    public String getIfaceGroupId() {
        return ifaceGroupId;
    }

    public void setIfaceGroupId(String ifaceGroupId) {
        this.ifaceGroupId = ifaceGroupId;
    }
}