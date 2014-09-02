/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.net.MalformedURLException;

import com.free.assist.domain.IfaceDaemonAttachment;
import com.free.assist.service.BaseService;
import com.free.assist.service.iface.attach.Attachment;

/**
 * @author 李猛
 * @version 1
 * @date 2009-11-9 下午10:36:38
 */
public interface IfaceAttachFacade extends BaseService {

	public abstract Attachment getAttachment(IfaceDaemonAttachment ifaceDaemonAttachment) throws MalformedURLException;

	public abstract void replicate(Attachment attachment, String applicationId, String fileNameWithPath);

}