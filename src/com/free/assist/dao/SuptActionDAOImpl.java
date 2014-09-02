/*
 * <p>标题: 中国电信OSS公共接口平台</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 天讯瑞达通信技术有限公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptActionExample;
import com.free.assist.domain.SuptActionKey;
import com.free.assist.dao.SpringBaseDAO;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_ACTION_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptActionKey
 * @see：com.free.assist.domain.SuptAction
 * @see：com.free.assist.domain.SuptActionExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-07 13:48:52 
 */
public class SuptActionDAOImpl extends SpringBaseDAO<SuptActionKey, SuptAction, SuptActionExample> implements SuptActionDAO {

    public SuptActionDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptAction record, SuptActionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptAction.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptAction record, SuptActionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptAction.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptActionExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptActionExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}