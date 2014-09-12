package com.free.assist.service.sys;

import java.util.List;

import com.free.assist.domain.SysUnit;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserUnit;
import com.free.assist.service.BaseService;

public interface ISysUnitService extends BaseService{
	public String addDataSysUnit(SysUnit sto) throws Exception;
	public String updateDataSysUnit(SysUnit sto) throws Exception;
	public String deleteDataSysUnit(String ids) throws Exception ;
	
	public String addDataSysUser(SysUser sto) throws Exception;
	public String updateDataSysUser(SysUser sto) throws Exception;
	public String deleteDataSysUser(String ids) throws Exception ;
	
	public String addDataSysUserUnit(SysUserUnit sto) throws Exception;
	public String updateDataSysUserUnit(SysUserUnit sto) throws Exception;
	public String deleteDataSysUserUnit(String unitId,String ids) throws Exception ;
}
