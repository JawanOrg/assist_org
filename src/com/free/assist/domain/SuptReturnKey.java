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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_return��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_RETURN_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptReturnKey
 * @see��com.regaltec.blocimp.domain.SuptReturn
 * @see��com.regaltec.blocimp.domain.SuptReturnExample
 * @see��com.regaltec.blocimp.dao.SuptReturnDAO
 * @see��com.regaltec.blocimp.dao.SuptReturnDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-04 08:57:49 
 */
public class SuptReturnKey implements Serializable {
    private String returnId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="return_id", nullable=false, length=32)
    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
}