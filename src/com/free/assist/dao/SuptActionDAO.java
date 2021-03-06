/*
 * <p>标题: 中国电信OSS公共接口平台</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 天讯瑞达通信技术有限公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptActionExample;
import com.free.assist.domain.SuptActionKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>继承了泛类，泛类能改名重复的代码，提高开发及维护的效率，同时一些不通用的接口方法，可以在该接口里定义。</p>
 * @see: com.free.assist.dao.SuptActionDAOImpl
 * @see：com.free.assist.domain.SuptActionKey
 * @see：com.free.assist.domain.SuptAction
 * @see：com.free.assist.domain.SuptActionExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-07 13:48:52 
 */
public interface SuptActionDAO extends BaseDAO<SuptActionKey, SuptAction, SuptActionExample> {
}