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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_event_his��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_EVENT_HIS_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogEventHisKey
 * @see��com.regaltec.blocimp.domain.IfaceLogEventHis
 * @see��com.regaltec.blocimp.domain.IfaceLogEventHisExample
 * @see��com.regaltec.blocimp.dao.IfaceLogEventHisDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogEventHisDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2010-01-18 13:13:28 
 */
public class IfaceLogEventHisKey implements Serializable {
    private String eventId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="EVENT_ID", nullable=false, length=32)
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}