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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_tactic_relation��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_RELATION_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTaticRelationKey
 * @see��com.regaltec.blocimp.domain.SuptTaticRelation
 * @see��com.regaltec.blocimp.domain.SuptTaticRelationExample
 * @see��com.regaltec.blocimp.dao.SuptTaticRelationDAO
 * @see��com.regaltec.blocimp.dao.SuptTaticRelationDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_tactic_relation")
public class SuptTaticRelation extends SuptTaticRelationKey implements Serializable {
    private String taticgoupid;

    private String elementid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="taticGoupId", nullable=true, length=64)
    public String getTaticgoupid() {
        return taticgoupid;
    }

    public void setTaticgoupid(String taticgoupid) {
        this.taticgoupid = taticgoupid;
    }

    @javax.persistence.Column(name="elementId", nullable=true, length=64)
    public String getElementid() {
        return elementid;
    }

    public void setElementid(String elementid) {
        this.elementid = elementid;
    }
}