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
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 17:43:29
 */
public class SuptTaticRelationKey extends SuptTaticElement implements Serializable {
    private String tacticrelationid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="tacticRelationId", nullable=false, length=64)
    public String getTacticrelationid() {
        return tacticrelationid;
    }

    public void setTacticrelationid(String tacticrelationid) {
        this.tacticrelationid = tacticrelationid;
    }
}