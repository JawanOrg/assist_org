/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface;

import com.free.assist.domain.IfaceLogEvent;
import com.free.assist.service.BaseService;

/**
 * @author 李猛
 * @version 1
 * @date 2009-12-7 下午05:38:50
 */
public interface IfaceLogEventService extends BaseService {

	public IfaceLogEvent begin(String inputXML);
	
	public void end(IfaceLogEvent ifaceLogEvent);
}
