/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_listener��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_LISTENER_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogListenerKey
 * @see��com.regaltec.blocimp.domain.IfaceLogListener
 * @see��com.regaltec.blocimp.domain.IfaceLogListenerExample
 * @see��com.regaltec.blocimp.dao.IfaceLogListenerDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogListenerDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-29 23:38:50 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_listener")
public class IfaceLogListener extends IfaceLogListenerKey implements Serializable {
	
	public static String LISTENER_TYPE_EMAIL = "E-MAIL";
	
    private String listenerType;

    private String listenerName;

    private String listenerSign;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="LISTENER_TYPE", nullable=false, length=8)
    public String getListenerType() {
        return listenerType;
    }

    public void setListenerType(String listenerType) {
        this.listenerType = listenerType;
    }

    @javax.persistence.Column(name="LISTENER_NAME", nullable=true, length=45)
    public String getListenerName() {
        return listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
    }

    @javax.persistence.Column(name="LISTENER_SIGN", nullable=false, length=200)
    public String getListenerSign() {
        return listenerSign;
    }

    public void setListenerSign(String listenerSign) {
        this.listenerSign = listenerSign;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}