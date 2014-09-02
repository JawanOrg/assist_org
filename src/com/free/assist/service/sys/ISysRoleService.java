package com.free.assist.service.sys;

import java.util.List;

import com.free.assist.domain.SysModule;
import com.free.assist.domain.SysModuleExample;
import com.free.assist.domain.SysRole;
import com.free.assist.domain.SysRoleModule;
import com.free.assist.domain.SysRoleModuleExample;
import com.free.assist.domain.SysRoleModuleKey;
import com.free.assist.domain.SysUnitRoleExample;
import com.free.assist.domain.SysUserRoleExample;
import com.free.assist.service.BaseService;

public interface ISysRoleService extends BaseService{
	public String addDataSysRole(SysRole sto) throws Exception;
	public String updateDataSysRole(SysRole sto) throws Exception;
	public String deleteDataSysRole(String ids) throws Exception ;
	
	public String addDataSysModule(SysModule sto) throws Exception;
	public String updateDataSysModule(SysModule sto) throws Exception;
	public String deleteDataSysModule(String ids) throws Exception ;
	public int countChildrenDataSysModule(SysModuleExample smEX);
	
	public String addDataSysRoleModule(SysRoleModule sto) throws Exception;
	public String updateDataSysRoleModule(SysRoleModule sto, String ResultOfshowModalDialog) throws Exception;
	public String deleteDataSysRoleModule(String roleId) throws Exception ;	
	public List selectDataSysRoleModule(SysRoleModuleExample example) throws RuntimeException ;
	
	public String makeModuleTreeXMLWithType(List nodeList, String roleId) ;
	public String makeUserUnitTreeWithType(List unitNodeList, List userNodeList, String roleId);
	
	public List selectDataSysUnitRole(SysUnitRoleExample example)throws RuntimeException ;
	public List selectDataSysUserRole(SysUserRoleExample example)throws RuntimeException ;
}
