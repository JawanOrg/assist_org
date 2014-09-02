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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_user��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_USER_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysUserKey
 * @see��com.regaltec.blocimp.domain.SysUser
 * @see��com.regaltec.blocimp.domain.SysUserExample
 * @see��com.regaltec.blocimp.dao.SysUserDAO
 * @see��com.regaltec.blocimp.dao.SysUserDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_user")
public class SysUser extends SysUserKey implements Serializable {
    private String loginName;

    private String loginPassword;

    private String userName;

    private String mobilePhone;

    private String isValid;

    private Date createDate;

    private String creatorId;

    private String remark;
    
    private String isValidName;

    private String creatorIdName;
    
    private String unitName;
    
    private String unitId;
    
    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Login_Name", nullable=false, length=32)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @javax.persistence.Column(name="login_Password", nullable=false, length=64)
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @javax.persistence.Column(name="User_Name", nullable=false, length=64)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @javax.persistence.Column(name="Mobile_Phone", nullable=true, length=32)
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @javax.persistence.Column(name="Is_Valid", nullable=false, length=1)
    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @javax.persistence.Column(name="Create_date", nullable=true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Column(name="Creator_Id", nullable=true, length=32)
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @javax.persistence.Column(name="Remark", nullable=true, length=255)
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

	public String getCreatorIdName() {
		return creatorIdName;
	}

	public void setCreatorIdName(String creatorIdName) {
		this.creatorIdName = creatorIdName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }
}