/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptBackgroundConf;
import com.free.assist.domain.SuptBackgroundConfExample;
import com.free.assist.domain.SuptBackgroundConfKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_BACKGROUND_CONF_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptBackgroundConfKey
 * @see：com.regaltec.blocimp.domain.SuptBackgroundConf
 * @see：com.regaltec.blocimp.domain.SuptBackgroundConfExample
 * @autor ibator
 * @version 1.2.1
 * @date 2010-05-17 10:20:42 
 */
public class SuptBackgroundConfDAOImpl extends SpringBaseDAO<SuptBackgroundConfKey, SuptBackgroundConf, SuptBackgroundConfExample> implements SuptBackgroundConfDAO {

    public SuptBackgroundConfDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptBackgroundConf record, SuptBackgroundConfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptBackgroundConf.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptBackgroundConf record, SuptBackgroundConfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptBackgroundConf.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptBackgroundConfExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptBackgroundConfExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}