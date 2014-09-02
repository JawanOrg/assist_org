package com.free.assist.service.iface;

import java.util.List;

import com.free.assist.domain.IfaceConfCacheExample;
import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigInstanceKey;
import com.free.assist.service.BaseService;

public interface IfaceConfigCacheService extends BaseService {
	
	public void paserXML(String xmlStr);
	
	public List selectByExample(IfaceConfCacheExample example);
	
	public void insertIfaceConfigInstanceBySelective(IfaceConfigInstance ifaceConfigInstance);
	
	public int deleteIfaceConfigInstance(IfaceConfigInstanceKey key);

}
