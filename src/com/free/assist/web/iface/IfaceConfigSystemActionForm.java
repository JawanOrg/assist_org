package com.free.assist.web.iface;

import java.util.Date;

import com.free.assist.web.BaseForm;

public class IfaceConfigSystemActionForm extends BaseForm {
	
	private String applicationSn;

    private String applicationName;

    private String available;

    private Date createDate;

    private Date updateDate;

    private String updateUser;
    
    private String applicationId;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationSn() {
		return applicationSn;
	}

	public void setApplicationSn(String applicationSn) {
		this.applicationSn = applicationSn;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
