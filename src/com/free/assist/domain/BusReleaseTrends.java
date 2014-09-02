/*
 * <p>标题: 中国电信OSS公共接口平台</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 天讯瑞达通信技术有限公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：T_BUS_RELEASE_TRENDS。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_RELEASE_TRENDS_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusReleaseTrendsKey
 * @see：com.free.assist.domain.BusReleaseTrends
 * @see：com.free.assist.domain.BusReleaseTrendsExample
 * @see：com.free.assist.dao.BusReleaseTrendsDAO
 * @see：com.free.assist.dao.BusReleaseTrendsDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-06 15:26:42 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="T_BUS_RELEASE_TRENDS")
public class BusReleaseTrends extends BusReleaseTrendsKey implements Serializable {
    private String billSn;

    private String theTitle;

    private String city;

    private String community;

    private String road;

    private String numberPlate;

    private Date repairTime;

    private String scenePersonName;

    private String scenePersonPhone;

    private String testPlanRemark;

    private String repairType;

    private String repairContent;

    private String creator;

    private String createDept;

    private Date createTime;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String billStatus;

    private String isNeedGovernment;

    private String publisher;

    private String auditor;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="BILL_SN", nullable=false, length=32)
    public String getBillSn() {
        return billSn;
    }

    public void setBillSn(String billSn) {
        this.billSn = billSn;
    }

    @javax.persistence.Column(name="THE_TITLE", nullable=false, length=200)
    public String getTheTitle() {
        return theTitle;
    }

    public void setTheTitle(String theTitle) {
        this.theTitle = theTitle;
    }

    @javax.persistence.Column(name="CITY", nullable=true, length=32)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @javax.persistence.Column(name="COMMUNITY", nullable=true, length=32)
    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    @javax.persistence.Column(name="ROAD", nullable=false, length=100)
    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @javax.persistence.Column(name="NUMBER_PLATE", nullable=true, length=32)
    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    @javax.persistence.Column(name="REPAIR_TIME", nullable=false)
    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    @javax.persistence.Column(name="SCENE_PERSON_NAME", nullable=false, length=32)
    public String getScenePersonName() {
        return scenePersonName;
    }

    public void setScenePersonName(String scenePersonName) {
        this.scenePersonName = scenePersonName;
    }

    @javax.persistence.Column(name="SCENE_PERSON_PHONE", nullable=false, length=32)
    public String getScenePersonPhone() {
        return scenePersonPhone;
    }

    public void setScenePersonPhone(String scenePersonPhone) {
        this.scenePersonPhone = scenePersonPhone;
    }

    @javax.persistence.Column(name="TEST_PLAN_REMARK", nullable=true, length=4000)
    public String getTestPlanRemark() {
        return testPlanRemark;
    }

    public void setTestPlanRemark(String testPlanRemark) {
        this.testPlanRemark = testPlanRemark;
    }

    @javax.persistence.Column(name="REPAIR_TYPE", nullable=false, length=32)
    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    @javax.persistence.Column(name="REPAIR_CONTENT", nullable=true, length=4000)
    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent;
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

    @javax.persistence.Column(name="BILL_STATUS", nullable=true, length=32)
    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    @javax.persistence.Column(name="IS_NEED_GOVERNMENT", nullable=true, length=1)
    public String getIsNeedGovernment() {
        return isNeedGovernment;
    }

    public void setIsNeedGovernment(String isNeedGovernment) {
        this.isNeedGovernment = isNeedGovernment;
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