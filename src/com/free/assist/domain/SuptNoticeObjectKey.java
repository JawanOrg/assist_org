/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: ��˾</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��T_SUPT_NOTICE_OBJECT��
 * <p>SQLӳ���ļ�·��Ϊ��com.free.assist.dao.xml.T_SUPT_NOTICE_OBJECT_SqlMap.xml��</p>
 * @see��com.free.assist.domain.SuptNoticeObjectKey
 * @see��com.free.assist.domain.SuptNoticeObject
 * @see��com.free.assist.domain.SuptNoticeObjectExample
 * @see��com.free.assist.dao.SuptNoticeObjectDAO
 * @see��com.free.assist.dao.SuptNoticeObjectDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2015-01-15 16:51:19 
 */
public class SuptNoticeObjectKey implements Serializable {
    private String noticeId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="NOTICE_ID", nullable=false, length=32)
    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }
}