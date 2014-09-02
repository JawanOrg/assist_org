/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface.attach;

import java.io.InputStream;

/**
 * @author 李猛
 * @version 1
 * @date 2009-11-8 下午08:34:41
 */
public interface Attachment {
	
	public InputStream getInputStream();
	
	public String getFileNameWithPath();
}
