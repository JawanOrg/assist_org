/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SysServiceConfig;
import com.free.assist.domain.SysServiceConfigExample;
import com.free.assist.domain.SysServiceConfigKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>�̳��˷��࣬�����ܸ����ظ��Ĵ��룬��߿�����ά����Ч�ʣ�ͬʱһЩ��ͨ�õĽӿڷ����������ڸýӿ��ﶨ�塣</p>
 * @see: com.regaltec.blocimp.dao.SysServiceConfigDAOImpl
 * @see��com.regaltec.blocimp.domain.SysServiceConfigKey
 * @see��com.regaltec.blocimp.domain.SysServiceConfig
 * @see��com.regaltec.blocimp.domain.SysServiceConfigExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public interface SysServiceConfigDAO extends BaseDAO<SysServiceConfigKey, SysServiceConfig, SysServiceConfigExample> {

	public List selectByExample(SysServiceConfigExample example, int skipResults, int maxResults);
}