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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_conf_declare��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_DECLARE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigDeclareKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigDeclare
 * @see��com.regaltec.blocimp.domain.IfaceConfigDeclareExample
 * @see��com.regaltec.blocimp.dao.IfaceConfigDeclareDAO
 * @see��com.regaltec.blocimp.dao.IfaceConfigDeclareDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-30 14:35:16 
 */
public class IfaceConfigDeclareKey implements Serializable {
    private String declareId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="DECLARE_ID", nullable=false, length=32)
    public String getDeclareId() {
        return declareId;
    }

    public void setDeclareId(String declareId) {
        this.declareId = declareId;
    }
}