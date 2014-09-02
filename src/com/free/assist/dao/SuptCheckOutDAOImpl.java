/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SuptCheckOut;
import com.free.assist.domain.SuptCheckOutExample;
import com.free.assist.domain.SuptCheckOutKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_CHECK_OUT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptCheckOutKey
 * @see：com.regaltec.blocimp.domain.SuptCheckOut
 * @see：com.regaltec.blocimp.domain.SuptCheckOutExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:30:09 
 */
public class SuptCheckOutDAOImpl extends SpringBaseDAO<SuptCheckOutKey, SuptCheckOut, SuptCheckOutExample> implements SuptCheckOutDAO {

    public SuptCheckOutDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptCheckOut record, SuptCheckOutExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptCheckOut.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptCheckOut record, SuptCheckOutExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptCheckOut.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptCheckOutExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptCheckOutExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	public List<SuptCheckOut> selectCheckOutByExample(
			SuptCheckOutExample example) {
		List list = getSqlMapClientTemplate().queryForList("SuptCheckOut.ibatorgenerated_selectCheckOutByExample", example);
        return list;
	}
}