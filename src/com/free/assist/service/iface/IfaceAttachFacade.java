/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.net.MalformedURLException;

import com.free.assist.domain.IfaceDaemonAttachment;
import com.free.assist.service.BaseService;
import com.free.assist.service.iface.attach.Attachment;

/**
 * @author ����
 * @version 1
 * @date 2009-11-9 ����10:36:38
 */
public interface IfaceAttachFacade extends BaseService {

	public abstract Attachment getAttachment(IfaceDaemonAttachment ifaceDaemonAttachment) throws MalformedURLException;

	public abstract void replicate(Attachment attachment, String applicationId, String fileNameWithPath);

}