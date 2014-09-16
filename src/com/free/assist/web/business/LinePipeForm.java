package com.free.assist.web.business;

import java.math.BigDecimal;
import java.util.Date;

import com.free.assist.web.BaseForm;

public class LinePipeForm extends BaseForm {
    private static final long serialVersionUID = 5736557871593793428L;

    private String billId;

    private String billSn;

    private String theTitle;

    private String city;

    private String community;

    private String road;

    private String numberPlate;

    private String repairTime;

    private String scenePersonName;

    private String scenePersonPhone;

    private String testPlanRemark;

    private String repairType;

    private String repairContent;

    private String creator;

    private String createDept;

    private String createTime;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String billStatus;

    private String isNeedGovernment;

    private String publisher;

    private String auditor;
    
    private String auditResult;
    private String auditSuggestion;
    private String taskId;

    public String getBillSn() {
        return billSn;
    }

    public void setBillSn(String billSn) {
        this.billSn = billSn;
    }

    public String getTheTitle() {
        return theTitle;
    }

    public void setTheTitle(String theTitle) {
        this.theTitle = theTitle;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(String repairTime) {
        this.repairTime = repairTime;
    }

    public String getScenePersonName() {
        return scenePersonName;
    }

    public void setScenePersonName(String scenePersonName) {
        this.scenePersonName = scenePersonName;
    }

    public String getScenePersonPhone() {
        return scenePersonPhone;
    }

    public void setScenePersonPhone(String scenePersonPhone) {
        this.scenePersonPhone = scenePersonPhone;
    }

    public String getTestPlanRemark() {
        return testPlanRemark;
    }

    public void setTestPlanRemark(String testPlanRemark) {
        this.testPlanRemark = testPlanRemark;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getIsNeedGovernment() {
        return isNeedGovernment;
    }

    public void setIsNeedGovernment(String isNeedGovernment) {
        this.isNeedGovernment = isNeedGovernment;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

    public String getAuditSuggestion() {
        return auditSuggestion;
    }

    public void setAuditSuggestion(String auditSuggestion) {
        this.auditSuggestion = auditSuggestion;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
