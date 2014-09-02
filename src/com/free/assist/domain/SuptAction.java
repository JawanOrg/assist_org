/*
 * <p>标题: 中国电信OSS公共接口平台</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 天讯瑞达通信技术有限公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：T_SUPT_ACTION。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_ACTION_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptActionKey
 * @see：com.free.assist.domain.SuptAction
 * @see：com.free.assist.domain.SuptActionExample
 * @see：com.free.assist.dao.SuptActionDAO
 * @see：com.free.assist.dao.SuptActionDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-07 13:48:52 
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_SUPT_ACTION")
public class SuptAction extends SuptActionKey implements Serializable {

    @Deprecated
    private SuptAction() {

    }

    public SuptAction(SysUser userVO) {
        this.userVO = userVO;
    }

    private SysUser userVO;

    private String businessType;

    private String billId;

    private String taskId;

    private String billStatus;

    private String taskStatus;

    private String actionType;

    private String preActionId;

    private String agentor;

    private String agentorGroup;

    private String operateMachineInfo;

    private String operateWay;

    private String operateDept;

    private String notifyMode;

    private String notifyType;

    private String notifyContent;

    private String notifyOtherPhones;

    private String links;

    private String remark;

    private String operator;

    private Date operateTime;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name = "BUSINESS_TYPE", nullable = false, length = 32)
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @javax.persistence.Column(name = "BILL_ID", nullable = false, length = 32)
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @javax.persistence.Column(name = "TASK_ID", nullable = true, length = 32)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @javax.persistence.Column(name = "BILL_STATUS", nullable = false, length = 32)
    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    @javax.persistence.Column(name = "TASK_STATUS", nullable = true, length = 32)
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @javax.persistence.Column(name = "ACTION_TYPE", nullable = false, length = 32)
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @javax.persistence.Column(name = "PRE_ACTION_ID", nullable = true, length = 32)
    public String getPreActionId() {
        return preActionId;
    }

    public void setPreActionId(String preActionId) {
        this.preActionId = preActionId;
    }

    @javax.persistence.Column(name = "AGENTOR", nullable = true, length = 32)
    public String getAgentor() {
        return agentor;
    }

    public void setAgentor(String agentor) {
        this.agentor = agentor;
    }

    @javax.persistence.Column(name = "AGENTOR_GROUP", nullable = true, length = 32)
    public String getAgentorGroup() {
        return agentorGroup;
    }

    public void setAgentorGroup(String agentorGroup) {
        this.agentorGroup = agentorGroup;
    }

    @javax.persistence.Column(name = "OPERATE_MACHINE_INFO", nullable = true, length = 200)
    public String getOperateMachineInfo() {
        return operateMachineInfo;
    }

    public void setOperateMachineInfo(String operateMachineInfo) {
        this.operateMachineInfo = operateMachineInfo;
    }

    @javax.persistence.Column(name = "OPERATE_WAY", nullable = true, length = 32)
    public String getOperateWay() {
        return operateWay;
    }

    public void setOperateWay(String operateWay) {
        this.operateWay = operateWay;
    }

    @javax.persistence.Column(name = "OPERATE_DEPT", nullable = true, length = 32)
    public String getOperateDept() {
        return operateDept;
    }

    public void setOperateDept(String operateDept) {
        this.operateDept = operateDept;
    }

    @javax.persistence.Column(name = "NOTIFY_MODE", nullable = true, length = 32)
    public String getNotifyMode() {
        return notifyMode;
    }

    public void setNotifyMode(String notifyMode) {
        this.notifyMode = notifyMode;
    }

    @javax.persistence.Column(name = "NOTIFY_TYPE", nullable = true, length = 32)
    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    @javax.persistence.Column(name = "NOTIFY_CONTENT", nullable = true, length = 2000)
    public String getNotifyContent() {
        return notifyContent;
    }

    public void setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent;
    }

    @javax.persistence.Column(name = "NOTIFY_OTHER_PHONES", nullable = true, length = 200)
    public String getNotifyOtherPhones() {
        return notifyOtherPhones;
    }

    public void setNotifyOtherPhones(String notifyOtherPhones) {
        this.notifyOtherPhones = notifyOtherPhones;
    }

    @javax.persistence.Column(name = "LINKS", nullable = true, length = 200)
    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    @javax.persistence.Column(name = "REMARK", nullable = true, length = 4000)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @javax.persistence.Column(name = "OPERATOR", nullable = false, length = 32)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @javax.persistence.Column(name = "OPERATE_TIME", nullable = false)
    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public SysUser getUserVO() {
        return userVO;
    }

    public void setUserVO(SysUser userVO) {
        this.userVO = userVO;
    }
}
