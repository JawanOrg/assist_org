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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_tactic_element��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_ELEMENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTaticElementKey
 * @see��com.regaltec.blocimp.domain.SuptTaticElement
 * @see��com.regaltec.blocimp.domain.SuptTaticElementExample
 * @see��com.regaltec.blocimp.dao.SuptTaticElementDAO
 * @see��com.regaltec.blocimp.dao.SuptTaticElementDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticElementKey implements Serializable {
    private String elementid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="elementId", nullable=false, length=32)
    public String getElementid() {
        return elementid;
    }

    public void setElementid(String elementid) {
        this.elementid = elementid;
    }
}