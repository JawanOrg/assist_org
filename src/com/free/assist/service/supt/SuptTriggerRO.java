/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.supt;

import java.util.List;

import javax.annotation.Resource;

import com.free.assist.dao.SuptFaceTriggerDAO;
import com.free.assist.domain.SuptFaceTrigger;
import com.free.assist.domain.SuptFaceTriggerExample;

/**
 * @author ����
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
