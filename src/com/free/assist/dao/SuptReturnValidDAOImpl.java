/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptReturnValid;
import com.free.assist.domain.SuptReturnValidExample;
import com.free.assist.domain.SuptReturnValidKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_RETURN_VALID_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptReturnValidKey
 * @see：com.regaltec.blocimp.domain.SuptReturnValid
 * @see：com.regaltec.blocimp.domain.SuptReturnValidExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-05 16:24:06 
 */
public class SuptReturnValidDAOImpl extends SpringBaseDAO<SuptReturnValidKey, SuptReturnValid, SuptReturnValidExample> implements SuptReturnValidDAO {

    public SuptReturnValidDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptReturnValid record, SuptReturnValidExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptReturnValid.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptReturnValid record, SuptReturnValidExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptReturnValid.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptReturnValidExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptReturnValidExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}