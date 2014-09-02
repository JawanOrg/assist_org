/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.IfaceLogRepairExample;
import com.free.assist.domain.IfaceLogRepairKey;
import com.free.assist.domain.IfaceLogRepairMixedExample;
import com.free.assist.domain.IfaceLogRepairMixedWithBLOBs;
import com.free.assist.domain.IfaceLogRepairWithBLOBs;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>继承了泛类，泛类能改名重复的代码，提高开发及维护的效率，同时一些不通用的接口方法，可以在该接口里定义。</p>
 * @see: com.regaltec.blocimp.dao.IfaceLogRepairDAOImpl
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairKey
 * @see：com.regaltec.blocimp.domain.IfaceLogRepair
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairWithBLOBs
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public interface IfaceLogRepairDAO extends BaseDAO<IfaceLogRepairKey, IfaceLogRepairWithBLOBs, IfaceLogRepairExample> {

	public int countByExample(IfaceLogRepairMixedExample example);

	public List<IfaceLogRepairMixedWithBLOBs> selectByExample(IfaceLogRepairMixedExample example);
	
	public List<IfaceLogRepairMixedWithBLOBs> selectByExample(IfaceLogRepairMixedExample example, int skipResults, int maxResults);
}