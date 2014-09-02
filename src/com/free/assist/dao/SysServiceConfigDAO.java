/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SysServiceConfig;
import com.free.assist.domain.SysServiceConfigExample;
import com.free.assist.domain.SysServiceConfigKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>继承了泛类，泛类能改名重复的代码，提高开发及维护的效率，同时一些不通用的接口方法，可以在该接口里定义。</p>
 * @see: com.regaltec.blocimp.dao.SysServiceConfigDAOImpl
 * @see：com.regaltec.blocimp.domain.SysServiceConfigKey
 * @see：com.regaltec.blocimp.domain.SysServiceConfig
 * @see：com.regaltec.blocimp.domain.SysServiceConfigExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public interface SysServiceConfigDAO extends BaseDAO<SysServiceConfigKey, SysServiceConfig, SysServiceConfigExample> {

	public List selectByExample(SysServiceConfigExample example, int skipResults, int maxResults);
}