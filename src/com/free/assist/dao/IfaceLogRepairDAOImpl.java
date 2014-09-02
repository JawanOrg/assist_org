/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.IfaceLogRepairExample;
import com.free.assist.domain.IfaceLogRepairKey;
import com.free.assist.domain.IfaceLogRepairMixedExample;
import com.free.assist.domain.IfaceLogRepairMixedWithBLOBs;
import com.free.assist.domain.IfaceLogRepairWithBLOBs;
import com.free.assist.util.Pager;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPAIR_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairKey
 * @see：com.regaltec.blocimp.domain.IfaceLogRepair
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairWithBLOBs
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class IfaceLogRepairDAOImpl extends SpringBaseDAO<IfaceLogRepairKey, IfaceLogRepairWithBLOBs, IfaceLogRepairExample> implements IfaceLogRepairDAO {

    public IfaceLogRepairDAOImpl() {
        super();
    }

    @Override
	public IfaceLogRepairWithBLOBs selectByPrimaryKey(IfaceLogRepairKey key) {
    	IfaceLogRepairMixedWithBLOBs ifaceLogRepairMixedWithBLOBs = (IfaceLogRepairMixedWithBLOBs) getSqlMapClientTemplate().queryForObject("IfaceLogRepairMixedWithBLOBs.ibatorgenerated_selectByPrimaryKey", key);
		return ifaceLogRepairMixedWithBLOBs;
	}
    
    public List<IfaceLogRepairMixedWithBLOBs> selectByExample(IfaceLogRepairMixedExample example, int skipResults, int maxResults) {
    	int totalRecords = countByExample(example);
    	if (skipResults > totalRecords) {
    		skipResults = totalRecords - maxResults;
    	}
    	if (skipResults == -1 || maxResults == -1) {
    		List<IfaceLogRepairMixedWithBLOBs> result = getSqlMapClientTemplate().queryForList("IfaceLogRepairMixedWithBLOBs.ibatorgenerated_selectByExampleWithBLOBs", example);
    		return result;
    	} else {
    		List<IfaceLogRepairMixedWithBLOBs> result = getSqlMapClientTemplate().queryForList("IfaceLogRepairMixedWithBLOBs.ibatorgenerated_selectByExampleWithBLOBs", example, skipResults, maxResults);
            return new Pager<IfaceLogRepairMixedWithBLOBs>(skipResults, maxResults, result, totalRecords);
    	}
    }

	public int countByExample(IfaceLogRepairMixedExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"IfaceLogRepairMixedWithBLOBs.ibatorgenerated_countByExample", example);
		return count;
	}

	public List<IfaceLogRepairMixedWithBLOBs> selectByExample(IfaceLogRepairMixedExample example) {
		List<IfaceLogRepairMixedWithBLOBs> result = getSqlMapClientTemplate().queryForList(
				"IfaceLogRepairMixedWithBLOBs.ibatorgenerated_selectByExampleWithBLOBs", example);
		return result;
	}

	public int updateByExampleSelective(IfaceLogRepairWithBLOBs record, IfaceLogRepairExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("IfaceLogRepair.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	public int updateByExample(IfaceLogRepairWithBLOBs record, IfaceLogRepairExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("IfaceLogRepair.ibatorgenerated_updateByExampleWithBLOBs", parms);
		return rows;
	}
	
    private static class UpdateByExampleParms extends IfaceLogRepairExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceLogRepairExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}