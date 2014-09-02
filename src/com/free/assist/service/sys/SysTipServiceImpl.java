package com.free.assist.service.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.free.assist.dao.SysTipsDAO;
import com.free.assist.domain.SysTipsExample;
import com.free.assist.service.BaseServiceImpl;
@Service("sysTipServiceImpl")
public class SysTipServiceImpl extends BaseServiceImpl implements ISysTipService {
	
	@Resource private SysTipsDAO sysTipsDAO;
	
	public List selectPageListByExample(SysTipsExample example) {
		return this.sysTipsDAO.selectByExample(example);
	}

}
