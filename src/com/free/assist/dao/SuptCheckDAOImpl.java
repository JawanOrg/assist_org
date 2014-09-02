/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SuptCheck;
import com.free.assist.domain.SuptCheckExample;
import com.free.assist.domain.SuptCheckKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_CHECK_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptCheckKey
 * @see：com.regaltec.blocimp.domain.SuptCheck
 * @see：com.regaltec.blocimp.domain.SuptCheckExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SuptCheckDAOImpl extends SpringBaseDAO<SuptCheckKey, SuptCheck, SuptCheckExample> implements SuptCheckDAO {

    public SuptCheckDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptCheck record, SuptCheckExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptCheck.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptCheck record, SuptCheckExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptCheck.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptCheckExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptCheckExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	public List<SuptCheck> selectFaceByExample(SuptCheckExample example) {
		List list = getSqlMapClientTemplate().queryForList("SuptCheck.ibatorgenerated_selectFaceByExample", example);
        return list;
	}
}