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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_unit_role��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_UNIT_ROLE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysUnitRoleKey
 * @see��com.regaltec.blocimp.domain.SysUnitRoleExample
 * @see��com.regaltec.blocimp.dao.SysUnitRoleDAO
 * @see��com.regaltec.blocimp.dao.SysUnitRoleDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysUnitRoleKey implements Serializable {
    private String roleId;

    private String unitId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Role_Id", nullable=false, length=32)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @javax.persistence.Column(name="Unit_Id", nullable=false, length=32)
    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }
}