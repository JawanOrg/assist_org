/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptTaticGroup;
import com.free.assist.domain.SuptTaticGroupExample;
import com.free.assist.domain.SuptTaticGroupKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_GROUP_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptTaticGroupKey
 * @see：com.regaltec.blocimp.domain.SuptTaticGroup
 * @see：com.regaltec.blocimp.domain.SuptTaticGroupExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticGroupDAOImpl extends SpringBaseDAO<SuptTaticGroupKey, SuptTaticGroup, SuptTaticGroupExample> implements SuptTaticGroupDAO {

    public SuptTaticGroupDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptTaticGroup record, SuptTaticGroupExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTaticGroup.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptTaticGroup record, SuptTaticGroupExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTaticGroup.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptTaticGroupExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptTaticGroupExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}