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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_conf_mapping��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_MAPPING_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigMappingKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigMapping
 * @see��com.regaltec.blocimp.domain.IfaceConfigMappingExample
 * @see��com.regaltec.blocimp.dao.IfaceConfigMappingDAO
 * @see��com.regaltec.blocimp.dao.IfaceConfigMappingDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-28 22:46:47 
 */
public class IfaceConfigMappingKey implements Serializable {
    private String mappingId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="MAPPING_ID", nullable=false, length=32)
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }
}