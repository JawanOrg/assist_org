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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_tips��</p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_TIPS_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysTipsKey
 * @see��com.regaltec.blocimp.domain.SysTips
 * @see��com.regaltec.blocimp.domain.SysTipsWithBLOBs
 * @see��com.regaltec.blocimp.domain.SysTipsExample
 * @see��com.regaltec.blocimp.dao.SysTipsDAO
 * @see��com.regaltec.blocimp.dao.SysTipsDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-29 14:15:59 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_tips")
public class SysTipsWithBLOBs extends SysTips implements Serializable {
    private String tipContext;

    private String tipContextAttach;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="tip_context", nullable=true)
    public String getTipContext() {
        return tipContext;
    }

    public void setTipContext(String tipContext) {
        this.tipContext = tipContext;
    }

    @javax.persistence.Column(name="tip_context_attach", nullable=true)
    public String getTipContextAttach() {
        return tipContextAttach;
    }

    public void setTipContextAttach(String tipContextAttach) {
        this.tipContextAttach = tipContextAttach;
    }
}