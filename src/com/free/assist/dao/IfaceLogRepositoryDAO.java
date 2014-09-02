/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.IfaceLogRepository;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.IfaceLogRepositoryKey;
import com.free.assist.domain.IfaceMonitor;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>�̳��˷��࣬�����ܸ����ظ��Ĵ��룬��߿�����ά����Ч�ʣ�ͬʱһЩ��ͨ�õĽӿڷ����������ڸýӿ��ﶨ�塣</p>
 * @see: com.regaltec.blocimp.dao.IfaceLogRepositoryDAOImpl
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryKey
 * @see��com.regaltec.blocimp.domain.IfaceLogRepository
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryWithBLOBs
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 16:57:05 
 */
public interface IfaceLogRepositoryDAO extends BaseDAO<IfaceLogRepositoryKey, IfaceLogRepository, IfaceLogRepositoryExample> {
	 public List<IfaceMonitor> selectIfaceMonitorByExample(IfaceLogRepositoryExample example);
}