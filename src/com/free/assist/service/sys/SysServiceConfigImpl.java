package com.free.assist.service.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.free.assist.dao.SysServiceConfigDAO;
import com.free.assist.domain.SysServiceConfig;
import com.free.assist.domain.SysServiceConfigExample;
import com.free.assist.service.BaseServiceImpl;

@Service("sysServiceConfig")
public class SysServiceConfigImpl extends BaseServiceImpl implements ISysServiceConfig {
	
	@Resource private SysServiceConfigDAO sysServiceConfigDAO;
	
	public List<SysServiceConfig> selectByExample(SysServiceConfigExample example) {
		List<SysServiceConfig> list = sysServiceConfigDAO.selectByExample(example, example.getSkipResults(), example.getMaxResults());
		if(list!=null) {
			return list;
		}
		return null;
	}

}
