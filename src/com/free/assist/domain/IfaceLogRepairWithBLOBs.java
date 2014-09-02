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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_repair��</p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPAIR_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogRepairKey
 * @see��com.regaltec.blocimp.domain.IfaceLogRepair
 * @see��com.regaltec.blocimp.domain.IfaceLogRepairWithBLOBs
 * @see��com.regaltec.blocimp.domain.IfaceLogRepairExample
 * @see��com.regaltec.blocimp.dao.IfaceLogRepairDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogRepairDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_repair")
public class IfaceLogRepairWithBLOBs extends IfaceLogRepair implements Serializable {
    private String faultDescription;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="FAULT_DESCRIPTION", nullable=false)
    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }
}