/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface.attach;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.springframework.util.FileCopyUtils;

/**
 * @author ����
 * @version 1
 * @date 2009-11-08 20:37:06
 */
public class HttpAttachment extends AbstractAttachment implements Attachment {

	public HttpAttachment(URL locationUrl) {
		super(locationUrl);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.framework.io.Attachment#getInputStream()
	 */
	@Override
	public InputStream getInputStream() {
		InputStream inputStream = null;
		try {
			InputStream is = locationUrl.openStream();
			byte[] buf = FileCopyUtils.copyToByteArray(is);
			inputStream = new ByteArrayInputStream(buf);
		} catch (IOException e) {
			logger.error("unexpected exception:", e);
		}
		return inputStream;
	}

}
