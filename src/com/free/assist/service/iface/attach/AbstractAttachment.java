/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface.attach;

import java.io.InputStream;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 李猛
 * @version 1
 * @date 2009-11-9 下午10:10:55
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