/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptSaveValue;
import com.free.assist.domain.SuptSaveValueExample;
import com.free.assist.domain.SuptSaveValueKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_SAVE_VALUE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptSaveValueKey
 * @see：com.regaltec.blocimp.domain.SuptSaveValue
 * @see：com.regaltec.blocimp.domain.SuptSaveValueExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-05 15:32:01 
 */
public class SuptSaveValueDAOImpl extends SpringBaseDAO<SuptSaveValueKey, SuptSaveValue, SuptSaveValueExample> implements SuptSaveValueDAO {

    public SuptSaveValueDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptSaveValue record, SuptSaveValueExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptSaveValue.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptSaveValue record, SuptSaveValueExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptSaveValue.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptSaveValueExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptSaveValueExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}