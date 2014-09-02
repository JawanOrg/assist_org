/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptValueList;
import com.free.assist.domain.SuptValueListExample;
import com.free.assist.domain.SuptValueListKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_VALUE_LIST_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptValueListKey
 * @see：com.regaltec.blocimp.domain.SuptValueList
 * @see：com.regaltec.blocimp.domain.SuptValueListExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-21 09:55:40 
 */
public class SuptValueListDAOImpl extends SpringBaseDAO<SuptValueListKey, SuptValueList, SuptValueListExample> implements SuptValueListDAO {

    public SuptValueListDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptValueList record, SuptValueListExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptValueList.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptValueList record, SuptValueListExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptValueList.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptValueListExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptValueListExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}