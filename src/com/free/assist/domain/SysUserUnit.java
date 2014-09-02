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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_user_unit��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_USER_UNIT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysUserUnitKey
 * @see��com.regaltec.blocimp.domain.SysUserUnit
 * @see��com.regaltec.blocimp.domain.SysUserUnitExample
 * @see��com.regaltec.blocimp.dao.SysUserUnitDAO
 * @see��com.regaltec.blocimp.dao.SysUserUnitDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-16 10:08:20 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_user_unit")
public class SysUserUnit extends SysUserUnitKey implements Serializable {
    private String remark;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Remark", nullable=true, length=255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}