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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_tactic_group��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_GROUP_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTaticGroupKey
 * @see��com.regaltec.blocimp.domain.SuptTaticGroup
 * @see��com.regaltec.blocimp.domain.SuptTaticGroupExample
 * @see��com.regaltec.blocimp.dao.SuptTaticGroupDAO
 * @see��com.regaltec.blocimp.dao.SuptTaticGroupDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticGroupKey implements Serializable {
    private String taticgoupid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="taticGoupId", nullable=false, length=64)
    public String getTaticgoupid() {
        return taticgoupid;
    }

    public void setTaticgoupid(String taticgoupid) {
        this.taticgoupid = taticgoupid;
    }
}