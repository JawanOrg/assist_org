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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_background_conf��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_BACKGROUND_CONF_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptBackgroundConfKey
 * @see��com.regaltec.blocimp.domain.SuptBackgroundConf
 * @see��com.regaltec.blocimp.domain.SuptBackgroundConfExample
 * @see��com.regaltec.blocimp.dao.SuptBackgroundConfDAO
 * @see��com.regaltec.blocimp.dao.SuptBackgroundConfDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2010-05-17 10:20:42 
 */
public class SuptBackgroundConfKey implements Serializable {
    private String backgroundType;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="BACKGROUND_TYPE", nullable=false, length=32)
    public String getBackgroundType() {
        return backgroundType;
    }

    public void setBackgroundType(String backgroundType) {
        this.backgroundType = backgroundType;
    }
}