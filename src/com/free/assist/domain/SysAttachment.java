/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_sys_attachment。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_ATTACHMENT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysAttachmentKey
 * @see：com.regaltec.blocimp.domain.SysAttachment
 * @see：com.regaltec.blocimp.domain.SysAttachmentExample
 * @see：com.regaltec.blocimp.dao.SysAttachmentDAO
 * @see：com.regaltec.blocimp.dao.SysAttachmentDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_attachment")
public class SysAttachment extends SysAttachmentKey implements Serializable {
    private String displayName;

    private String storePath;

    private Date createDate;

    private String creatorId;

    private String busiId;

    private String bigType;

    private String smallType;

    private Date uploadTime;

    private String fileType;

    private Integer fileSize;

    private String actionId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="DISPLAY_NAME", nullable=true, length=128)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @javax.persistence.Column(name="store_path", nullable=true, length=256)
    public String getStorePath() {
        return storePath;
    }

    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    @javax.persistence.Column(name="Create_Date", nullable=true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Column(name="Creator_Id", nullable=true, length=32)
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @javax.persistence.Column(name="BUSI_ID", nullable=true, length=32)
    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId;
    }

    @javax.persistence.Column(name="big_type", nullable=true, length=32)
    public String getBigType() {
        return bigType;
    }

    public void setBigType(String bigType) {
        this.bigType = bigType;
    }

    @javax.persistence.Column(name="small_type", nullable=true, length=32)
    public String getSmallType() {
        return smallType;
    }

    public void setSmallType(String smallType) {
        this.smallType = smallType;
    }

    @javax.persistence.Column(name="upload_time", nullable=true)
    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    @javax.persistence.Column(name="file_type", nullable=true, length=32)
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @javax.persistence.Column(name="file_size", nullable=true)
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @javax.persistence.Column(name="action_id", nullable=true, length=32)
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}