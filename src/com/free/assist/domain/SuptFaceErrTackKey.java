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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_face_errtack��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_FACE_ERRTACK_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptFaceErrTackKey
 * @see��com.regaltec.blocimp.domain.SuptFaceErrTack
 * @see��com.regaltec.blocimp.domain.SuptFaceErrTackExample
 * @see��com.regaltec.blocimp.dao.SuptFaceErrTackDAO
 * @see��com.regaltec.blocimp.dao.SuptFaceErrTackDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-12 14:09:43 
 */
public class SuptFaceErrTackKey implements Serializable {
    private String errId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="err_id", nullable=false, length=32)
    public String getErrId() {
        return errId;
    }

    public void setErrId(String errId) {
        this.errId = errId;
    }
}