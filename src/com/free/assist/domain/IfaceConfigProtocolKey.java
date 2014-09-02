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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_conf_protocol��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_PROTOCOL_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigProtocolKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigProtocol
 * @see��com.regaltec.blocimp.domain.IfaceConfigProtocolExample
 * @see��com.regaltec.blocimp.dao.IfaceConfigProtocolDAO
 * @see��com.regaltec.blocimp.dao.IfaceConfigProtocolDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-04 22:01:28 
 */
public class IfaceConfigProtocolKey implements Serializable {
    private String protocolId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="PROTOCOL_ID", nullable=false, length=32)
    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }
}