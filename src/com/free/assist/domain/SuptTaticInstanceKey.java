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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_tactic_instance��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_INSTANCE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTaticInstanceKey
 * @see��com.regaltec.blocimp.domain.SuptTaticInstance
 * @see��com.regaltec.blocimp.domain.SuptTaticInstanceExample
 * @see��com.regaltec.blocimp.dao.SuptTaticInstanceDAO
 * @see��com.regaltec.blocimp.dao.SuptTaticInstanceDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticInstanceKey implements Serializable {
    private String taticinstanceid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="taticInstanceId", nullable=false, length=64)
    public String getTaticinstanceid() {
        return taticinstanceid;
    }

    public void setTaticinstanceid(String taticinstanceid) {
        this.taticinstanceid = taticinstanceid;
    }
}