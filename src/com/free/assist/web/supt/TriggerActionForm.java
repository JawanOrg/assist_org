/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.web.supt;

import java.util.Date;

import com.free.assist.web.BaseForm;

/**
 * @author ����
 * @version 1
 * @date 2009-12-17 13:48:12
 */
public class TriggerActionForm extends BaseForm {

	private static final long serialVersionUID = 20091217L;
	
	private String triggerId;
	
	private String portId;

    private String returnCode;

    private String triggerName;

    private Date createDate;

	public String getTriggerId() {
		return triggerId;
	}

	public void setTriggerId(String triggerId) {
		this.triggerId = triggerId;
	}

	public String getPortId() {
		return portId;
	}

	public void setPortId(String portId) {
		this.portId = portId;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TriggerActionForm [createDate=");
		builder.append(createDate);
		builder.append(", portId=");
		builder.append(portId);
		builder.append(", returnCode=");
		builder.append(returnCode);
		builder.append(", triggerId=");
		builder.append(triggerId);
		builder.append(", triggerName=");
		builder.append(triggerName);
		builder.append("]");
		return builder.toString();
	}

}
