/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_sys_attachment。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_ATTACHMENT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysAttachmentKey
 * @see：com.regaltec.blocimp.domain.SysAttachment
 * @see：com.regaltec.blocimp.domain.SysAttachmentExample
 * @see：com.regaltec.blocimp.dao.SysAttachmentDAO
 * @see：com.regaltec.blocimp.dao.SysAttachmentDAOImpl
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