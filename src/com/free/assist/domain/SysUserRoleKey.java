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
 * <p>该实体对应数据库的表名为：t_sys_user_role。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_USER_ROLE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysUserRoleKey
 * @see：com.regaltec.blocimp.domain.SysUserRoleExample
 * @see：com.regaltec.blocimp.dao.SysUserRoleDAO
 * @see：com.regaltec.blocimp.dao.SysUserRoleDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysUserRoleKey implements Serializable {
    private String roleId;

    private String userId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Role_Id", nullable=false, length=32)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @javax.persistence.Column(name="User_Id", nullable=false, length=32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}