package com.free.assist.web.sys;

import java.util.Date;

import com.free.assist.web.BaseForm;

public class SysTipActionForm extends BaseForm {
	private String tipLabel;

    private Date createDate;

    private String tipModuleId;
    
    private String tipContext;
    
    private String tipId;

	public String getTipId() {
		return tipId;
	}

	public void setTipId(String tipId) {
		this.tipId = tipId;
	}

	public String getTipContext() {
		return tipContext;
	}

	public void setTipContext(String tipContext) {
		this.tipContext = tipContext;
	}

	public String getTipLabel() {
		return tipLabel;
	}

	public void setTipLabel(String tipLabel) {
		this.tipLabel = tipLabel;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getTipModuleId() {
		return tipModuleId;
	}

	public void setTipModuleId(String tipModuleId) {
		this.tipModuleId = tipModuleId;
	}
    
    
}
