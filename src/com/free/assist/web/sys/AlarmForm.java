package com.free.assist.web.sys;

import com.free.assist.web.BaseForm;

public class AlarmForm extends BaseForm{
	private String alarmId;
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

	public String getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getAlarmMode() {
		return alarmMode;
	}

	public void setAlarmMode(String alarmMode) {
		this.alarmMode = alarmMode;
	}

	public String getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public Integer getAlarmTimes() {
		return alarmTimes;
	}

	public void setAlarmTimes(Integer alarmTimes) {
		this.alarmTimes = alarmTimes;
	}

	public String getAlarmContent() {
		return alarmContent;
	}

	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}

	public String getIsClear() {
		return isClear;
	}

	public void setIsClear(String isClear) {
		this.isClear = isClear;
	}

	public String getTempId() {
		return tempId;
	}

	public void setTempId(String tempId) {
		this.tempId = tempId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getAlarmObject() {
		return alarmObject;
	}

	public void setAlarmObject(String alarmObject) {
		this.alarmObject = alarmObject;
	}

	public String getAlarmPersonStation() {
		return alarmPersonStation;
	}

	public void setAlarmPersonStation(String alarmPersonStation) {
		this.alarmPersonStation = alarmPersonStation;
	}

	public String getLinkPage() {
		return linkPage;
	}

	public void setLinkPage(String linkPage) {
		this.linkPage = linkPage;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


}
