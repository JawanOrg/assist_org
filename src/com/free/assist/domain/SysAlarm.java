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
 * <p>该实体对应数据库的表名为：t_sys_alarm。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_ALARM_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysAlarmKey
 * @see：com.regaltec.blocimp.domain.SysAlarm
 * @see：com.regaltec.blocimp.domain.SysAlarmExample
 * @see：com.regaltec.blocimp.dao.SysAlarmDAO
 * @see：com.regaltec.blocimp.dao.SysAlarmDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_alarm")
public class SysAlarm extends SysAlarmKey implements Serializable {
    private String businessId;

    private String alarmMode;

    private String alarmType;

    private Integer alarmTimes;

    private String alarmContent;

    private String isClear;

    private String tempId;

    private String taskId;

    private String alarmObject;

    private String alarmPersonStation;

    private String linkPage;

    private String remark;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="BUSINESS_ID", nullable=false, length=32)
    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    @javax.persistence.Column(name="alarm_mode", nullable=true, length=20)
    public String getAlarmMode() {
        return alarmMode;
    }

    public void setAlarmMode(String alarmMode) {
        this.alarmMode = alarmMode;
    }

    @javax.persistence.Column(name="alarm_type", nullable=true, length=20)
    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    @javax.persistence.Column(name="alarm_times", nullable=true)
    public Integer getAlarmTimes() {
        return alarmTimes;
    }

    public void setAlarmTimes(Integer alarmTimes) {
        this.alarmTimes = alarmTimes;
    }

    @javax.persistence.Column(name="alarm_content", nullable=true, length=256)
    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
    }

    @javax.persistence.Column(name="is_clear", nullable=true, length=10)
    public String getIsClear() {
        return isClear;
    }

    public void setIsClear(String isClear) {
        this.isClear = isClear;
    }

    @javax.persistence.Column(name="temp_id", nullable=true, length=32)
    public String getTempId() {
        return tempId;
    }

    public void setTempId(String tempId) {
        this.tempId = tempId;
    }

    @javax.persistence.Column(name="task_id", nullable=true, length=32)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @javax.persistence.Column(name="alarm_object", nullable=true, length=32)
    public String getAlarmObject() {
        return alarmObject;
    }

    public void setAlarmObject(String alarmObject) {
        this.alarmObject = alarmObject;
    }

    @javax.persistence.Column(name="ALARM_PERSON_STATION", nullable=true, length=32)
    public String getAlarmPersonStation() {
        return alarmPersonStation;
    }

    public void setAlarmPersonStation(String alarmPersonStation) {
        this.alarmPersonStation = alarmPersonStation;
    }

    @javax.persistence.Column(name="LINK_PAGE", nullable=true, length=100)
    public String getLinkPage() {
        return linkPage;
    }

    public void setLinkPage(String linkPage) {
        this.linkPage = linkPage;
    }

    @javax.persistence.Column(name="remark", nullable=true, length=50)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}