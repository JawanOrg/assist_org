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
 * SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_UNIT_SqlMap.xml��
 * </p>
 * 
 * @see��com.regaltec.blocimp.domain.SysUnitKey
 * @see��com.regaltec.blocimp.domain.SysUnit
 * @see��com.regaltec.blocimp.domain.SysUnitExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08
 */
public class SysUnitDAOImpl extends SpringBaseDAO<SysUnitKey, SysUnit, SysUnitExample> implements SysUnitDAO {

	public SysUnitDAOImpl() {
		super();
	}

	public int updateByExampleSelective(SysUnit record, SysUnitExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("SysUnit.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	public int updateByExample(SysUnit record, SysUnitExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("SysUnit.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	private static class UpdateByExampleParms extends SysUnitExample {
		private Object record;

		public UpdateByExampleParms(Object record, SysUnitExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}

	public List<SysUnit> selectByUserId(String userId) {
		return getSqlMapClientTemplate().queryForList("SysUnit.selectByUserId", userId);
	}
}