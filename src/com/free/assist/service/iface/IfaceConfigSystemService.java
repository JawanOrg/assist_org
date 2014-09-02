package com.free.assist.service.iface;

import java.util.List;

import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigProtocolExample;
import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.service.BaseService;

public interface IfaceConfigSystemService extends BaseService {
	
	public List selectByExample(IfaceConfigSystemExample example);
	
	public List selectByExample(IfaceConfigProtocolExample example);
	
	public void insertBySelective(IfaceConfigSystem record);
	
	public void insertIfaceConfigProtocolRecord(IfaceConfigProtocol record);
	

}
