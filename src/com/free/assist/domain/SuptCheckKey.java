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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_check��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_CHECK_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptCheckKey
 * @see��com.regaltec.blocimp.domain.SuptCheck
 * @see��com.regaltec.blocimp.domain.SuptCheckExample
 * @see��com.regaltec.blocimp.dao.SuptCheckDAO
 * @see��com.regaltec.blocimp.dao.SuptCheckDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SuptCheckKey extends SuptFace implements Serializable {
    private String checkId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="check_id", nullable=false, length=32)
    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }
}