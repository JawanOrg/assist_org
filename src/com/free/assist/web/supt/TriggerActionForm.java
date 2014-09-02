/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.web.supt;

import java.util.Date;

import com.free.assist.web.BaseForm;

/**
 * @author 李猛
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
