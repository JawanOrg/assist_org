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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_daemon_attachment��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_DAEMON_ATTACHMENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceDaemonAttachmentKey
 * @see��com.regaltec.blocimp.domain.IfaceDaemonAttachment
 * @see��com.regaltec.blocimp.domain.IfaceDaemonAttachmentExample
 * @see��com.regaltec.blocimp.dao.IfaceDaemonAttachmentDAO
 * @see��com.regaltec.blocimp.dao.IfaceDaemonAttachmentDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-11 16:56:10 
 */
public class IfaceDaemonAttachmentKey implements Serializable {
    private String attachmentId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="ATTACHMENT_ID", nullable=false, length=32)
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
}