/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SuptCheck;
import com.free.assist.domain.SuptCheckExample;
import com.free.assist.domain.SuptCheckKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>�̳��˷��࣬�����ܸ����ظ��Ĵ��룬��߿�����ά����Ч�ʣ�ͬʱһЩ��ͨ�õĽӿڷ����������ڸýӿ��ﶨ�塣</p>
 * @see: com.regaltec.blocimp.dao.SuptCheckDAOImpl
 * @see��com.regaltec.blocimp.domain.SuptCheckKey
 * @see��com.regaltec.blocimp.domain.SuptCheck
 * @see��com.regaltec.blocimp.domain.SuptCheckExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public interface SuptCheckDAO extends BaseDAO<SuptCheckKey, SuptCheck, SuptCheckExample> {
   
	 List<SuptCheck> selectFaceByExample(SuptCheckExample example);
}