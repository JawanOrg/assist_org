/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.IfaceLogEvent;
import com.free.assist.domain.IfaceLogEventExample;
import com.free.assist.domain.IfaceLogEventKey;
import com.free.assist.domain.IfaceLogEventMonitor;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>�̳��˷��࣬�����ܸ����ظ��Ĵ��룬��߿�����ά����Ч�ʣ�ͬʱһЩ��ͨ�õĽӿڷ����������ڸýӿ��ﶨ�塣</p>
 * @see: com.regaltec.blocimp.dao.IfaceLogEventDAOImpl
 * @see��com.regaltec.blocimp.domain.IfaceLogEventKey
 * @see��com.regaltec.blocimp.domain.IfaceLogEvent
 * @see��com.regaltec.blocimp.domain.IfaceLogEventExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-07 20:02:03 
 */
public interface IfaceLogEventDAO extends BaseDAO<IfaceLogEventKey, IfaceLogEvent, IfaceLogEventExample> {
	public List<IfaceLogEventMonitor> selectIfaceLogEventMonitorByExample(IfaceLogEventExample example);
}