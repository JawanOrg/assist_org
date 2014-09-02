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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_face��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_FACE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptFaceKey
 * @see��com.regaltec.blocimp.domain.SuptFace
 * @see��com.regaltec.blocimp.domain.SuptFaceExample
 * @see��com.regaltec.blocimp.dao.SuptFaceDAO
 * @see��com.regaltec.blocimp.dao.SuptFaceDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-12-12 15:22:43 
 */
public class SuptFaceKey implements Serializable {
    private String cimpFaceId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="cimp_face_id", nullable=false, length=32)
    public String getCimpFaceId() {
        return cimpFaceId;
    }

    public void setCimpFaceId(String cimpFaceId) {
        this.cimpFaceId = cimpFaceId;
    }
}