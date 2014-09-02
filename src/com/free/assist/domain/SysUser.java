/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_sys_user。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_USER_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysUserKey
 * @see：com.regaltec.blocimp.domain.SysUser
 * @see：com.regaltec.blocimp.domain.SysUserExample
 * @see：com.regaltec.blocimp.dao.SysUserDAO
 * @see：com.regaltec.blocimp.dao.SysUserDAOImpl
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