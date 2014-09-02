package com.free.assist.service.sys;

import java.util.List;

import com.free.assist.domain.SysServiceConfigExample;
import com.free.assist.service.BaseService;

public interface ISysServiceConfig extends BaseService {
	
	public List selectByExample(SysServiceConfigExample example);

}
