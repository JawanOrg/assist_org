/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.List;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_sys_role。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_ROLE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysRoleKey
 * @see：com.regaltec.blocimp.domain.SysRole
 * @see：com.regaltec.blocimp.domain.SysRoleExample
 * @see：com.regaltec.blocimp.dao.SysRoleDAO
 * @see：com.regaltec.blocimp.dao.SysRoleDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-15 10:48:20 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_role")
public class SysRole extends SysRoleKey implements Serializable {
    private String rolename;

    private String isValid;

    private Integer sortOrder;
    
    private String roledesc;
    
    private String postCheckIds;
    
    private String userCheckIds;
 
    List<SysRole>    SysRoleList;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="RoleName", nullable=false, length=64)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @javax.persistence.Column(name="RoleDesc", nullable=true, length=128)
    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    @javax.persistence.Column(name="Is_Valid", nullable=true, length=1)
    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @javax.persistence.Column(name="Sort_Order", nullable=true)
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

	public List<SysRole> getSysRoleList() {
		return SysRoleList;
	}

	public void setSysRoleList(List<SysRole> sysRoleList) {
		SysRoleList = sysRoleList;
	}

	public String getPostCheckIds() {
		return postCheckIds;
	}

	public void setPostCheckIds(String postCheckIds) {
		this.postCheckIds = postCheckIds;
	}

	public String getUserCheckIds() {
		return userCheckIds;
	}

	public void setUserCheckIds(String userCheckIds) {
		this.userCheckIds = userCheckIds;
	}

}