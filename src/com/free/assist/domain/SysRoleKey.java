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
 * <p>该实体对应数据库的表名为：t_sys_role。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_ROLE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysRoleKey
 * @see：com.regaltec.blocimp.domain.SysRole
 * @see：com.regaltec.blocimp.domain.SysRoleExample
 * @see：com.regaltec.blocimp.dao.SysRoleDAO
 * @see：com.regaltec.blocimp.dao.SysRoleDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-15 10:48:20 
 */
public class SysRoleKey implements Serializable {
    private String roleid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="RoleId", nullable=false, length=32)
    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}