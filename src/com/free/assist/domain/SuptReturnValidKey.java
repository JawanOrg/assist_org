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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_return_valid��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_RETURN_VALID_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptReturnValidKey
 * @see��com.regaltec.blocimp.domain.SuptReturnValid
 * @see��com.regaltec.blocimp.domain.SuptReturnValidExample
 * @see��com.regaltec.blocimp.dao.SuptReturnValidDAO
 * @see��com.regaltec.blocimp.dao.SuptReturnValidDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-05 16:24:06 
 */
public class SuptReturnValidKey implements Serializable {
    private String returnValidId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="return_valid_id", nullable=false, length=32)
    public String getReturnValidId() {
        return returnValidId;
    }

    public void setReturnValidId(String returnValidId) {
        this.returnValidId = returnValidId;
    }
}