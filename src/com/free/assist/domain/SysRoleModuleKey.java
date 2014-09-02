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
 * <p>该实体对应数据库的表名为：t_sys_role_module。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_ROLE_MODULE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysRoleModuleKey
 * @see：com.regaltec.blocimp.domain.SysRoleModuleExample
 * @see：com.regaltec.blocimp.dao.SysRoleModuleDAO
 * @see：com.regaltec.blocimp.dao.SysRoleModuleDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysRoleModuleKey extends SysRole implements Serializable {
    private String rightid;

    private String roleid;
    
    private  String checkids; 

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="RightId", nullable=false, length=32)
    public String getRightid() {
        return rightid;
    }

    public void setRightid(String rightid) {
        this.rightid = rightid;
    }

    @javax.persistence.Column(name="RoleId", nullable=false, length=32)
    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

	public String getCheckids() {
		return checkids;
	}

	public void setCheckids(String checkids) {
		this.checkids = checkids;
	}
}