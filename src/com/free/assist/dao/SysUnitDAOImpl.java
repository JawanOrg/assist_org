/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SysUnit;
import com.free.assist.domain.SysUnitExample;
import com.free.assist.domain.SysUnitKey;

/**
 * <p>
 * 该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator
 * Documentation</a>。
 * <p>
 * <p>
 * SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_UNIT_SqlMap.xml。
 * </p>
 * 
 * @see：com.regaltec.blocimp.domain.SysUnitKey
 * @see：com.regaltec.blocimp.domain.SysUnit
 * @see：com.regaltec.blocimp.domain.SysUnitExample
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