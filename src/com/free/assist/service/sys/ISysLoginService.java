package com.free.assist.service.sys;

import java.util.List;

import com.free.assist.domain.SysUserExample;
import com.free.assist.service.BaseService;

public interface ISysLoginService extends BaseService{

	public List selectByExample(SysUserExample example) ;

	public int selectCountByExample(SysUserExample example);

}
