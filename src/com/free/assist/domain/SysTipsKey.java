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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_tips��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_TIPS_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysTipsKey
 * @see��com.regaltec.blocimp.domain.SysTips
 * @see��com.regaltec.blocimp.domain.SysTipsExample
 * @see��com.regaltec.blocimp.dao.SysTipsDAO
 * @see��com.regaltec.blocimp.dao.SysTipsDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-29 19:14:56 
 */
public class SysTipsKey implements Serializable {
    private String tipId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="tip_id", nullable=false, length=50)
    public String getTipId() {
        return tipId;
    }

    public void setTipId(String tipId) {
        this.tipId = tipId;
    }
}