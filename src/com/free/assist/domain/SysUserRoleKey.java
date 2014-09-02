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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_user_role��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_USER_ROLE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysUserRoleKey
 * @see��com.regaltec.blocimp.domain.SysUserRoleExample
 * @see��com.regaltec.blocimp.dao.SysUserRoleDAO
 * @see��com.regaltec.blocimp.dao.SysUserRoleDAOImpl
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