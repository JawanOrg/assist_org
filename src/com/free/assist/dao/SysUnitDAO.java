/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SysUnit;
import com.free.assist.domain.SysUnitExample;
import com.free.assist.domain.SysUnitKey;

/**
 * <p>
 * ���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator
 * Documentation</a>��
 * <p>
 * <p>
 * �̳��˷��࣬�����ܸ����ظ��Ĵ��룬��߿�����ά����Ч�ʣ�ͬʱһЩ��ͨ�õĽӿڷ����������ڸýӿ��ﶨ�塣
 * </p>
 * 
 * @see: com.regaltec.blocimp.dao.SysUnitDAOImpl
 * @see��com.regaltec.blocimp.domain.SysUnitKey
 * @see��com.regaltec.blocimp.domain.SysUnit
 * @see��com.regaltec.blocimp.domain.SysUnitExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08
 */
public interface SysUnitDAO extends BaseDAO<SysUnitKey, SysUnit, SysUnitExample> {
	List<SysUnit> selectByUserId(String userId);
}