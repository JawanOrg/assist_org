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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_dic_config��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_DIC_CONFIG_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysDicConfigKey
 * @see��com.regaltec.blocimp.domain.SysDicConfig
 * @see��com.regaltec.blocimp.domain.SysDicConfigExample
 * @see��com.regaltec.blocimp.dao.SysDicConfigDAO
 * @see��com.regaltec.blocimp.dao.SysDicConfigDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_dic_config")
public class SysDicConfig extends SysDicConfigKey implements Serializable {
    private String dictionaryName;

    private String dictionaryCode;

    private String isValid;

    private String remark;
    
    private String isValidName;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Dictionary_Name", nullable=false, length=64)
    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    @javax.persistence.Column(name="Dictionary_Code", nullable=true, length=64)
    public String getDictionaryCode() {
        return dictionaryCode;
    }

    public void setDictionaryCode(String dictionaryCode) {
        this.dictionaryCode = dictionaryCode;
    }

    @javax.persistence.Column(name="Is_Valid", nullable=true, length=1)
    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @javax.persistence.Column(name="remark", nullable=true, length=250)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public String getIsValidName() {
		return isValidName;
	}

	public void setIsValidName(String isValidName) {
		this.isValidName = isValidName;
	}
}