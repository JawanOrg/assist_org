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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_check_out��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_CHECK_OUT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptCheckOutKey
 * @see��com.regaltec.blocimp.domain.SuptCheckOut
 * @see��com.regaltec.blocimp.domain.SuptCheckOutExample
 * @see��com.regaltec.blocimp.dao.SuptCheckOutDAO
 * @see��com.regaltec.blocimp.dao.SuptCheckOutDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-19 17:19:12 
 */
public class SuptCheckOutKey extends SuptFace implements Serializable {
    private String sendId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="send_id", nullable=false, length=32)
    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }
}