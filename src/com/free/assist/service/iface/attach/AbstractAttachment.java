/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface.attach;

import java.io.InputStream;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ����
 * @version 1
 * @date 2009-11-9 ����10:10:55
 */
public abstract class AbstractAttachment {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	protected URL locationUrl;
	
	public AbstractAttachment(URL locationUrl) {
		this.locationUrl = locationUrl;
	}
	
	public abstract InputStream getInputStream();

	public String getFileNameWithPath() {
		return locationUrl.getPath();
	}

}