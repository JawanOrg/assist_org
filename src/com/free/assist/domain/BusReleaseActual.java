/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：T_BUS_RELEASE_ACTUAL。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_RELEASE_ACTUAL_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusReleaseActualKey
 * @see：com.free.assist.domain.BusReleaseActual
 * @see：com.free.assist.domain.BusReleaseActualExample
 * @see：com.free.assist.dao.BusReleaseActualDAO
 * @see：com.free.assist.dao.BusReleaseActualDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2015-01-15 16:51:19 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="T_BUS_RELEASE_ACTUAL")
public class BusReleaseActual extends BusReleaseActualKey implements Serializable {
    private String billSn;

    private String creator;

    private String createDept;

    private Date createTime;

    private String address;

    private String actualContent;

    private String billStatus;

    private String publisher;

    private String auditor;

    private BigDecimal longitude;

    private BigDecimal latitude;
    
    private String noticeObjectNames;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="BILL_SN", nullable=false, length=32)
    public String getBillSn() {
        return billSn;
    }

    public void setBillSn(String billSn) {
        this.billSn = billSn;
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

    @javax.persistence.Column(name="ADDRESS", nullable=false, length=200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @javax.persistence.Column(name="ACTUAL_CONTENT", nullable=true, length=4000)
    public String getActualContent() {
        return actualContent;
    }

    public void setActualContent(String actualContent) {
        this.actualContent = actualContent;
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

    @javax.persistence.Column(name="LONGITUDE", nullable=true)
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @javax.persistence.Column(name="LATITUDE", nullable=true)
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

	public String getNoticeObjectNames() {
		return noticeObjectNames;
	}

	public void setNoticeObjectNames(String noticeObjectNames) {
		this.noticeObjectNames = noticeObjectNames;
	}
}