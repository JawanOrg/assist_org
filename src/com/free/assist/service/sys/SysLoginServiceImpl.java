package com.free.assist.service.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SysUserDAO;
import com.free.assist.domain.SysUserExample;
import com.free.assist.service.BaseServiceImpl;

@Service("sysLoginService")
public class SysLoginServiceImpl extends BaseServiceImpl  implements ISysLoginService {
	private SysUserDAO sysUserDAO;

	@Autowired
	public void setSysUserDAO(SysUserDAO sysUserDAO) {
		this.sysUserDAO = sysUserDAO;
	}
	public List selectByExample(SysUserExample example) {
		return  this.sysUserDAO.selectByExample(example);
	}
	public int selectCountByExample(SysUserExample example) {
		return  this.sysUserDAO.countByExample(example);
	}

}
