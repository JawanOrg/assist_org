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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_face_trigger��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_FACE_TRIGGER_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptFaceTriggerKey
 * @see��com.regaltec.blocimp.domain.SuptFaceTrigger
 * @see��com.regaltec.blocimp.domain.SuptFaceTriggerExample
 * @see��com.regaltec.blocimp.dao.SuptFaceTriggerDAO
 * @see��com.regaltec.blocimp.dao.SuptFaceTriggerDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-12-17 15:53:18 
 */
public class SuptFaceTriggerKey implements Serializable {
    private String triggerId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="TRIGGER_ID", nullable=false, length=32)
    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }
}