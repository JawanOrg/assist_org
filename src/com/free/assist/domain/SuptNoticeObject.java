/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：T_SUPT_NOTICE_OBJECT。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_NOTICE_OBJECT_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptNoticeObjectKey
 * @see：com.free.assist.domain.SuptNoticeObject
 * @see：com.free.assist.domain.SuptNoticeObjectExample
 * @see：com.free.assist.dao.SuptNoticeObjectDAO
 * @see：com.free.assist.dao.SuptNoticeObjectDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2015-01-15 16:51:19 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="T_SUPT_NOTICE_OBJECT")
public class SuptNoticeObject extends SuptNoticeObjectKey implements Serializable {
    private String businessType;

    private String billId;

    private String objectType;

    private String objectId;

    private String noticeContent;

    private Date createTime;

    private String creator;

    private String receiver;

    private Date receiveTime;

    private int replyTimes;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="BUSINESS_TYPE", nullable=false, length=32)
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @javax.persistence.Column(name="BILL_ID", nullable=false, length=32)
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @javax.persistence.Column(name="OBJECT_TYPE", nullable=false, length=32)
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @javax.persistence.Column(name="OBJECT_ID", nullable=false, length=32)
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @javax.persistence.Column(name="NOTICE_CONTENT", nullable=false, length=200)
    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    @javax.persistence.Column(name="CREATE_TIME", nullable=false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @javax.persistence.Column(name="CREATOR", nullable=false, length=32)
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @javax.persistence.Column(name="RECEIVER", nullable=true, length=32)
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @javax.persistence.Column(name="RECEIVE_TIME", nullable=true)
    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    @javax.persistence.Column(name="REPLY_TIMES", nullable=false)
    public int getReplyTimes() {
        return replyTimes;
    }

    public void setReplyTimes(int replyTimes) {
        this.replyTimes = replyTimes;
    }
}