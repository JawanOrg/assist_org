/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.daemon;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.IfaceLogRepositoryDAO;
import com.free.assist.service.BaseServiceImpl;

/**
 * <p>����ʹ��spring��annotation(@Service)�ᱨ��</p>
 * @author ����
 * @version 1
 * @date 2009-11-8 ����05:36:39
 */
public class HistoryArchiveTask extends BaseServiceImpl {

	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public void execute() {
		
	}

	@Resource private IfaceLogRepositoryDAO ifaceLogRepositoryDAO;
}
