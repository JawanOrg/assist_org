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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_attachment��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_ATTACHMENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysAttachmentKey
 * @see��com.regaltec.blocimp.domain.SysAttachment
 * @see��com.regaltec.blocimp.domain.SysAttachmentExample
 * @see��com.regaltec.blocimp.dao.SysAttachmentDAO
 * @see��com.regaltec.blocimp.dao.SysAttachmentDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysAttachmentKey implements Serializable {
    private String attachmentId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="Attachment_Id", nullable=false, length=32)
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
}