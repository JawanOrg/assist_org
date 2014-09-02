/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_text_storage��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TEXT_STORAGE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTextStorageKey
 * @see��com.regaltec.blocimp.domain.SuptTextStorage
 * @see��com.regaltec.blocimp.domain.SuptTextStorageExample
 * @see��com.regaltec.blocimp.dao.SuptTextStorageDAO
 * @see��com.regaltec.blocimp.dao.SuptTextStorageDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-29 17:41:14 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_text_storage")
public class SuptTextStorage extends SuptTextStorageKey implements Serializable {
	
	public static String MODULE_SN_WX = "wx";

	public static String MODULE_SN_KB = "kb";

    private String moduleSn;

    private String actionSn;

    private String storageText;

    private Integer readCount;

    private String attributeBak;

    private String available;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="MODULE_SN", nullable=true, length=100)
    public String getModuleSn() {
        return moduleSn;
    }

    public void setModuleSn(String moduleSn) {
        this.moduleSn = moduleSn;
    }

    @javax.persistence.Column(name="ACTION_SN", nullable=true, length=100)
    public String getActionSn() {
        return actionSn;
    }

    public void setActionSn(String actionSn) {
        this.actionSn = actionSn;
    }

    @javax.persistence.Column(name="STORAGE_TEXT", nullable=true)
    public String getStorageText() {
        return storageText;
    }

    public void setStorageText(String storageText) {
        this.storageText = storageText;
    }

    @javax.persistence.Column(name="READ_COUNT", nullable=true)
    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @javax.persistence.Column(name="ATTRIBUTE_BAK", nullable=true, length=100)
    public String getAttributeBak() {
        return attributeBak;
    }

    public void setAttributeBak(String attributeBak) {
        this.attributeBak = attributeBak;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=true, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Column(name="UPDATE_ON", nullable=true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}