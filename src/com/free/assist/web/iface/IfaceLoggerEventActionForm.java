/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.web.iface;

import com.free.assist.web.BaseForm;

/**
 * @author 李猛
 * @version 1
 * @date 2009-12-09 11:34:29
 */
public class IfaceLoggerEventActionForm extends BaseForm {

	private static final long serialVersionUID = 20091209L;
	
	private String eventId;
	
	private String relateId;
	
	private String document;
	
	private String type;
	
	private String successful;
	
	private String historical;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getRelateId() {
		return relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSuccessful() {
		return successful;
	}

	public void setSuccessful(String successful) {
		this.successful = successful;
	}

	public String getHistorical() {
		return historical;
	}

	public void setHistorical(String historical) {
		this.historical = historical;
	}

}
