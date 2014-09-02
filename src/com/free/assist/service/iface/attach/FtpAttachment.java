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

import org.apache.commons.lang.StringUtils;

import com.free.assist.framework.io.FtpClientTemplate;


/**
 * @author 李猛
 * @version 1
 * @date 2009-11-8 下午10:26:50
 */
public class FtpAttachment extends AbstractAttachment implements Attachment {

	private FtpClientTemplate ftpClientTemplate;
	
	public FtpAttachment(URL locationUrl) {
		super(locationUrl);
		String host = locationUrl.getHost();
		int port = locationUrl.getPort();
		String userInfo = locationUrl.getUserInfo();
		String user = "";
		String password = "";
		if (StringUtils.isBlank(userInfo)) {
			user = "anonymous";
			password = "";
		} else {
			String[] userInfos = StringUtils.split(userInfo, ":");
			user = userInfos[0];
			if (userInfos.length > 1) {
				password = userInfos[1];
			}
		}
		this.ftpClientTemplate = new FtpClientTemplate(host, port, user, password, "GBK");
	}
	
	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.framework.io.Attachment#getInputStream()
	 */
	public InputStream getInputStream() {
		return ftpClientTemplate.fetch(locationUrl.getPath());
	}
}
