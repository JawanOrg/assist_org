/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptReturn;
import com.free.assist.domain.SuptReturnExample;
import com.free.assist.domain.SuptReturnKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_RETURN_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptReturnKey
 * @see：com.regaltec.blocimp.domain.SuptReturn
 * @see：com.regaltec.blocimp.domain.SuptReturnExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-04 08:57:49 
 */
public class SuptReturnDAOImpl extends SpringBaseDAO<SuptReturnKey, SuptReturn, SuptReturnExample> implements SuptReturnDAO {

    public SuptReturnDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptReturn record, SuptReturnExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptReturn.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptReturn record, SuptReturnExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptReturn.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptReturnExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptReturnExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}