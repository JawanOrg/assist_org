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
 * <p>该实体对应数据库的表名为：T_BUS_LINEPIPE_KNOW。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_LINEPIPE_KNOW_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusLinePipeKnowKey
 * @see：com.free.assist.domain.BusLinePipeKnow
 * @see：com.free.assist.domain.BusLinePipeKnowWithBLOBs
 * @see：com.free.assist.domain.BusLinePipeKnowExample
 * @see：com.free.assist.dao.BusLinePipeKnowDAO
 * @see：com.free.assist.dao.BusLinePipeKnowDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2014-12-08 15:25:15 
 */
public class BusLinePipeKnow extends BusLinePipeKnowKey implements Serializable {
    private String theTitle;

    private String creator;

    private String createDept;

    private Date createTime;

    private String billStatus;

    private String publisher;

    private String auditor;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="THE_TITLE", nullable=false, length=200)
    public String getTheTitle() {
        return theTitle;
    }

    public void setTheTitle(String theTitle) {
        this.theTitle = theTitle;
    }

    @javax.persistence.Column(name="CREATOR", nullable=false, length=32)
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @javax.persistence.Column(name="CREATE_DEPT", nullable=false, length=32)
    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    @javax.persistence.Column(name="CREATE_TIME", nullable=false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @javax.persistence.Column(name="BILL_STATUS", nullable=false, length=32)
    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    @javax.persistence.Column(name="PUBLISHER", nullable=true, length=32)
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @javax.persistence.Column(name="AUDITOR", nullable=true, length=32)
    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }
}