package com.free.assist.web.iface;

import com.free.assist.web.BaseForm;

public class IfaceConfigCacheActionForm extends BaseForm {
	
	private String rootId;

	private String responseCode;

    private String responseInfo;

    private String sysCode;

    private String sysCodename;

    private String itemId;

    private String itemName;

    private String parentItemId;

    private String changetype;

    private String serialNumber;

	public String getRootId() {
		return rootId;
	}

	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseInfo() {
		return responseInfo;
	}

	public void setResponseInfo(String responseInfo) {
		this.responseInfo = responseInfo;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getSysCodename() {
		return sysCodename;
	}

	public void setSysCodename(String sysCodename) {
		this.sysCodename = sysCodename;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getParentItemId() {
		return parentItemId;
	}

	public void setParentItemId(String parentItemId) {
		this.parentItemId = parentItemId;
	}

	public String getChangetype() {
		return changetype;
	}

	public void setChangetype(String changetype) {
		this.changetype = changetype;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
}
