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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_conf_system��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_SYSTEM_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystemKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystem
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystemExample
 * @see��com.regaltec.blocimp.dao.IfaceConfigSystemDAO
 * @see��com.regaltec.blocimp.dao.IfaceConfigSystemDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-03 15:44:14 
 */
public class IfaceConfigSystemKey implements Serializable {
    private String applicationId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="APPLICATION_ID", nullable=false, length=32)
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}