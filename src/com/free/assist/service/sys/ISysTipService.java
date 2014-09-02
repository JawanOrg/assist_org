package com.free.assist.service.sys;

import java.util.List;

import com.free.assist.domain.SysTipsExample;
import com.free.assist.service.BaseService;

public interface ISysTipService extends BaseService {
	
	public List selectPageListByExample(SysTipsExample example);

}
