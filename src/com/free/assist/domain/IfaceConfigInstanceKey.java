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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_conf_instance��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_INSTANCE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigInstanceKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigInstance
 * @see��com.regaltec.blocimp.domain.IfaceConfigInstanceExample
 * @see��com.regaltec.blocimp.dao.IfaceConfigInstanceDAO
 * @see��com.regaltec.blocimp.dao.IfaceConfigInstanceDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class IfaceConfigInstanceKey implements Serializable {
    private String instanceId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="INSTANCE_ID", nullable=false, length=32)
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
}