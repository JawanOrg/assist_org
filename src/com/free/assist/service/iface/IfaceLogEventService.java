/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface;

import com.free.assist.domain.IfaceLogEvent;
import com.free.assist.service.BaseService;

/**
 * @author ����
 * @version 1
 * @date 2009-12-7 ����05:38:50
 */
public interface IfaceLogEventService extends BaseService {

	public IfaceLogEvent begin(String inputXML);
	
	public void end(IfaceLogEvent ifaceLogEvent);
}
