/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.daemon;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.IfaceLogRepositoryDAO;
import com.free.assist.service.BaseServiceImpl;

/**
 * <p>该类使用spring的annotation(@Service)会报错。</p>
 * @author 李猛
 * @version 1
 * @date 2009-11-8 下午05:36:39
 */
public class HistoryArchiveTask extends BaseServiceImpl {

	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public void execute() {
		
	}

	@Resource private IfaceLogRepositoryDAO ifaceLogRepositoryDAO;
}
