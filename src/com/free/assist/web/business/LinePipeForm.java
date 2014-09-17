package com.free.assist.web.business;

import com.free.assist.web.BaseForm;

public class LinePipeForm extends BaseForm {
	private static final long serialVersionUID = 5736557871593793428L;

	private String contentId;

	private String theTitle;

	private String linePipeContent;

	private String creator;

	private String createDept;

	private String createTime;

	private String billStatus;

	public String getTheTitle() {
		return theTitle;
	}

	public void setTheTitle(String theTitle) {
		this.theTitle = theTitle;
	}

	public String getLinePipeContent() {
		return linePipeContent;
	}

	public void setLinePipeContent(String linePipeContent) {
		this.linePipeContent = linePipeContent;
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

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
}
