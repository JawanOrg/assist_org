/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicConfigKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_DIC_CONFIG_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysDicConfigKey
 * @see：com.regaltec.blocimp.domain.SysDicConfig
 * @see：com.regaltec.blocimp.domain.SysDicConfigExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysDicConfigDAOImpl extends SpringBaseDAO<SysDicConfigKey, SysDicConfig, SysDicConfigExample> implements SysDicConfigDAO {

    public SysDicConfigDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysDicConfig record, SysDicConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysDicConfig.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysDicConfig record, SysDicConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysDicConfig.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysDicConfigExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysDicConfigExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}