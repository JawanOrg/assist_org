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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_listener��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_LISTENER_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogListenerKey
 * @see��com.regaltec.blocimp.domain.IfaceLogListener
 * @see��com.regaltec.blocimp.domain.IfaceLogListenerExample
 * @see��com.regaltec.blocimp.dao.IfaceLogListenerDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogListenerDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-28 23:51:59 
 */
public class IfaceLogListenerKey implements Serializable {
    private String listenerId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="LISTENER_ID", nullable=false, length=32)
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }
}