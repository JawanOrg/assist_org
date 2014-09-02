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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_service_config��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_SERVICE_CONFIG_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysServiceConfigKey
 * @see��com.regaltec.blocimp.domain.SysServiceConfig
 * @see��com.regaltec.blocimp.domain.SysServiceConfigExample
 * @see��com.regaltec.blocimp.dao.SysServiceConfigDAO
 * @see��com.regaltec.blocimp.dao.SysServiceConfigDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysServiceConfigKey implements Serializable {
    private String serviceId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="Service_Id", nullable=false, length=32)
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}