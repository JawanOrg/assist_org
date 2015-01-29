package com.free.assist.web.business;

import java.math.BigDecimal;
import java.util.Date;

import com.free.assist.web.BaseForm;

public class ActualForm extends BaseForm {
	private static final long serialVersionUID = -3146008114750822597L;

	private String billId;

	private String billSn;

	private String creator;

	private String createDept;

	private Date createTime;

	private String address;

	private String actualContent;

	private String billStatus;

	private String publisher;

	private String auditor;

	private BigDecimal longitude;

	private BigDecimal latitude;
	
	private String noticeObjects;

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBillSn() {
		return billSn;
	}

	public void setBillSn(String billSn) {
		this.billSn = billSn;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getActualContent() {
		return actualContent;
	}

	public void setActualContent(String actualContent) {
		this.actualContent = actualContent;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
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

	public String getNoticeObjects() {
		return noticeObjects;
	}

	public void setNoticeObjects(String noticeObjects) {
		this.noticeObjects = noticeObjects;
	}
}
