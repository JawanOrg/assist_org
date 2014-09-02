/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.IfaceLogRepairExample;
import com.free.assist.domain.IfaceLogRepairKey;
import com.free.assist.domain.IfaceLogRepairMixedExample;
import com.free.assist.domain.IfaceLogRepairMixedWithBLOBs;
import com.free.assist.domain.IfaceLogRepairWithBLOBs;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>�̳��˷��࣬�����ܸ����ظ��Ĵ��룬��߿�����ά����Ч�ʣ�ͬʱһЩ��ͨ�õĽӿڷ����������ڸýӿ��ﶨ�塣</p>
 * @see: com.regaltec.blocimp.dao.IfaceLogRepairDAOImpl
 * @see��com.regaltec.blocimp.domain.IfaceLogRepairKey
 * @see��com.regaltec.blocimp.domain.IfaceLogRepair
 * @see��com.regaltec.blocimp.domain.IfaceLogRepairWithBLOBs
 * @see��com.regaltec.blocimp.domain.IfaceLogRepairExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public interface IfaceLogRepairDAO extends BaseDAO<IfaceLogRepairKey, IfaceLogRepairWithBLOBs, IfaceLogRepairExample> {

	public int countByExample(IfaceLogRepairMixedExample example);

	public List<IfaceLogRepairMixedWithBLOBs> selectByExample(IfaceLogRepairMixedExample example);
	
	public List<IfaceLogRepairMixedWithBLOBs> selectByExample(IfaceLogRepairMixedExample example, int skipResults, int maxResults);
}