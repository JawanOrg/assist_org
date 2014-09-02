/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptFaceTrigger;
import com.free.assist.domain.SuptFaceTriggerExample;
import com.free.assist.domain.SuptFaceTriggerKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_FACE_TRIGGER_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptFaceTriggerKey
 * @see：com.regaltec.blocimp.domain.SuptFaceTrigger
 * @see：com.regaltec.blocimp.domain.SuptFaceTriggerExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-17 15:53:18 
 */
public class SuptFaceTriggerDAOImpl extends SpringBaseDAO<SuptFaceTriggerKey, SuptFaceTrigger, SuptFaceTriggerExample> implements SuptFaceTriggerDAO {

    public SuptFaceTriggerDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptFaceTrigger record, SuptFaceTriggerExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptFaceTrigger.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptFaceTrigger record, SuptFaceTriggerExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptFaceTrigger.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptFaceTriggerExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptFaceTriggerExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}