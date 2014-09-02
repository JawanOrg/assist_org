/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SuptTaskExample;
import com.free.assist.domain.SuptTaskKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_TASK_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptTaskKey
 * @see：com.free.assist.domain.SuptTask
 * @see：com.free.assist.domain.SuptTaskExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-07 14:45:44 
 */
public class SuptTaskDAOImpl extends SpringBaseDAO<SuptTaskKey, SuptTask, SuptTaskExample> implements SuptTaskDAO {

    public SuptTaskDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptTask record, SuptTaskExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTask.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptTask record, SuptTaskExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTask.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptTaskExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptTaskExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}