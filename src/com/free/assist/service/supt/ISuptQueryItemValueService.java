package com.free.assist.service.supt;

import com.free.assist.service.BaseService;

public interface ISuptQueryItemValueService extends BaseService {
	
	public void setFormQueryItemValue(String userId,String moduleCode,Object form,Class fieldsObjClass) throws Exception;
	
	public void getFormQueryItemValue(String userId,String moduleCode,Object form) throws Exception, NoSuchFieldException;
	
}
