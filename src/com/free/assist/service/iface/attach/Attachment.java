/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface.attach;

import java.io.InputStream;

/**
 * @author ����
 * @version 1
 * @date 2009-11-8 ����08:34:41
 */
public interface Attachment {
	
	public InputStream getInputStream();
	
	public String getFileNameWithPath();
}
