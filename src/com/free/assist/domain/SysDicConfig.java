/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_sys_dic_config。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_DIC_CONFIG_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysDicConfigKey
 * @see：com.regaltec.blocimp.domain.SysDicConfig
 * @see：com.regaltec.blocimp.domain.SysDicConfigExample
 * @see：com.regaltec.blocimp.dao.SysDicConfigDAO
 * @see：com.regaltec.blocimp.dao.SysDicConfigDAOImpl
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