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
import com.free.assist.domain.SuptCheckOut;
import com.free.assist.domain.SuptCheckOutExample;
import com.free.assist.domain.SuptCheckOutKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>�̳��˷��࣬�����ܸ����ظ��Ĵ��룬��߿�����ά����Ч�ʣ�ͬʱһЩ��ͨ�õĽӿڷ����������ڸýӿ��ﶨ�塣</p>
 * @see: com.regaltec.blocimp.dao.SuptCheckOutDAOImpl
 * @see��com.regaltec.blocimp.domain.SuptCheckOutKey
 * @see��com.regaltec.blocimp.domain.SuptCheckOut
 * @see��com.regaltec.blocimp.domain.SuptCheckOutExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:30:09 
 */
public interface SuptCheckOutDAO extends BaseDAO<SuptCheckOutKey, SuptCheckOut, SuptCheckOutExample> {

	List<SuptCheckOut> selectCheckOutByExample(SuptCheckOutExample example);
}