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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_event��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_EVENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogEventKey
 * @see��com.regaltec.blocimp.domain.IfaceLogEvent
 * @see��com.regaltec.blocimp.domain.IfaceLogEventExample
 * @see��com.regaltec.blocimp.dao.IfaceLogEventDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogEventDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-12-07 20:02:03 
 */
public class IfaceLogEventKey implements Serializable {
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