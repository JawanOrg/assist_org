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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_role_module��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_ROLE_MODULE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysRoleModuleKey
 * @see��com.regaltec.blocimp.domain.SysRoleModuleExample
 * @see��com.regaltec.blocimp.dao.SysRoleModuleDAO
 * @see��com.regaltec.blocimp.dao.SysRoleModuleDAOImpl
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