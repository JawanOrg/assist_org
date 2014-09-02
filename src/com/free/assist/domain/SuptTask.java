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
 * <p>该实体对应数据库的表名为：T_SUPT_TASK。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_TASK_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptTaskKey
 * @see：com.free.assist.domain.SuptTask
 * @see：com.free.assist.domain.SuptTaskExample
 * @see：com.free.assist.dao.SuptTaskDAO
 * @see：com.free.assist.dao.SuptTaskDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-07 14:45:44 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="T_SUPT_TASK")
public class SuptTask extends SuptTaskKey implements Serializable {
    private String businessType;

    private String billId;

    private String taskSn;

    private String taskStatus;

    private String taskIdSon;

    private String taskIdParent;

    private String creator;

    private Date createTime;

    private Date finishTime;

    private String isFinish;

    private String isRedo;

    private String dealObjectId;

    private String dealObjectType;

    private String dealObjectGroup;

    private String remark;

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

    @javax.persistence.Column(name="TASK_SN", nullable=false, length=32)
    public String getTaskSn() {
        return taskSn;
    }

    public void setTaskSn(String taskSn) {
        this.taskSn = taskSn;
    }

    @javax.persistence.Column(name="TASK_STATUS", nullable=true, length=32)
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @javax.persistence.Column(name="TASK_ID_SON", nullable=true, length=32)
    public String getTaskIdSon() {
        return taskIdSon;
    }

    public void setTaskIdSon(String taskIdSon) {
        this.taskIdSon = taskIdSon;
    }

    @javax.persistence.Column(name="TASK_ID_PARENT", nullable=true, length=32)
    public String getTaskIdParent() {
        return taskIdParent;
    }

    public void setTaskIdParent(String taskIdParent) {
        this.taskIdParent = taskIdParent;
    }

    @javax.persistence.Column(name="CREATOR", nullable=false, length=32)
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @javax.persistence.Column(name="CREATE_TIME", nullable=false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @javax.persistence.Column(name="FINISH_TIME", nullable=true)
    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @javax.persistence.Column(name="IS_FINISH", nullable=false, length=1)
    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish;
    }

    @javax.persistence.Column(name="IS_REDO", nullable=false, length=1)
    public String getIsRedo() {
        return isRedo;
    }

    public void setIsRedo(String isRedo) {
        this.isRedo = isRedo;
    }

    @javax.persistence.Column(name="DEAL_OBJECT_ID", nullable=false, length=32)
    public String getDealObjectId() {
        return dealObjectId;
    }

    public void setDealObjectId(String dealObjectId) {
        this.dealObjectId = dealObjectId;
    }

    @javax.persistence.Column(name="DEAL_OBJECT_TYPE", nullable=false, length=32)
    public String getDealObjectType() {
        return dealObjectType;
    }

    public void setDealObjectType(String dealObjectType) {
        this.dealObjectType = dealObjectType;
    }

    @javax.persistence.Column(name="DEAL_OBJECT_GROUP", nullable=false, length=32)
    public String getDealObjectGroup() {
        return dealObjectGroup;
    }

    public void setDealObjectGroup(String dealObjectGroup) {
        this.dealObjectGroup = dealObjectGroup;
    }

    @javax.persistence.Column(name="REMARK", nullable=true, length=2000)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}