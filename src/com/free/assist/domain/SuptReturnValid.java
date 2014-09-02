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
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-05 16:24:06 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_return_valid")
public class SuptReturnValid extends SuptReturnValidKey implements Serializable {
    private String operName;

    private String opernamePath;

    private String operpathFrom;

    private String fieldName;

    private String fieldPath;

    private String fieldpathFrom;

    private String prikeyName;

    private String prikeyPath;

    private String prikeyFrom;

    private String cimpFaceId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="oper_name", nullable=true, length=32)
    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @javax.persistence.Column(name="opername_path", nullable=true, length=32)
    public String getOpernamePath() {
        return opernamePath;
    }

    public void setOpernamePath(String opernamePath) {
        this.opernamePath = opernamePath;
    }

    @javax.persistence.Column(name="operpath_from", nullable=true, length=100)
    public String getOperpathFrom() {
        return operpathFrom;
    }

    public void setOperpathFrom(String operpathFrom) {
        this.operpathFrom = operpathFrom;
    }

    @javax.persistence.Column(name="field_name", nullable=true)
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @javax.persistence.Column(name="field_path", nullable=true)
    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    @javax.persistence.Column(name="fieldpath_from", nullable=true, length=32)
    public String getFieldpathFrom() {
        return fieldpathFrom;
    }

    public void setFieldpathFrom(String fieldpathFrom) {
        this.fieldpathFrom = fieldpathFrom;
    }

    @javax.persistence.Column(name="prikey_name", nullable=true, length=200)
    public String getPrikeyName() {
        return prikeyName;
    }

    public void setPrikeyName(String prikeyName) {
        this.prikeyName = prikeyName;
    }

    @javax.persistence.Column(name="prikey_path", nullable=true, length=200)
    public String getPrikeyPath() {
        return prikeyPath;
    }

    public void setPrikeyPath(String prikeyPath) {
        this.prikeyPath = prikeyPath;
    }

    @javax.persistence.Column(name="prikey_from", nullable=true, length=32)
    public String getPrikeyFrom() {
        return prikeyFrom;
    }

    public void setPrikeyFrom(String prikeyFrom) {
        this.prikeyFrom = prikeyFrom;
    }

    @javax.persistence.Column(name="cimp_face_id", nullable=true, length=32)
    public String getCimpFaceId() {
        return cimpFaceId;
    }

    public void setCimpFaceId(String cimpFaceId) {
        this.cimpFaceId = cimpFaceId;
    }
}