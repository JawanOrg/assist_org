/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.supt;

import java.util.List;

import javax.annotation.Resource;

import com.free.assist.dao.SuptFaceTriggerDAO;
import com.free.assist.domain.SuptFaceTrigger;
import com.free.assist.domain.SuptFaceTriggerExample;

/**
 * @author 李猛
 * @version 1
 * @date 2009-12-17 14:31:37
 */
public class SuptTriggerRO {
	
	public void addTrigger() {
		
	}
	
	public void delTrigger() {
		
	}
	
	public List<SuptFaceTrigger> getTriggerList(String methodId) {
		SuptFaceTriggerExample example = new SuptFaceTriggerExample();
		//example.createCriteria().andMethodIdEqualTo(methodId);
		return suptFaceTriggerDAO.selectByExample(example);
	}

	@Resource private SuptFaceTriggerDAO suptFaceTriggerDAO;
}
