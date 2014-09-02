/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigInstanceExample;
import com.free.assist.domain.IfaceConfigInstanceKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_INSTANCE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigInstanceKey
 * @see：com.regaltec.blocimp.domain.IfaceConfigInstance
 * @see：com.regaltec.blocimp.domain.IfaceConfigInstanceExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class IfaceConfigInstanceDAOImpl extends SpringBaseDAO<IfaceConfigInstanceKey, IfaceConfigInstance, IfaceConfigInstanceExample> implements IfaceConfigInstanceDAO {

    public IfaceConfigInstanceDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceConfigInstance record, IfaceConfigInstanceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigInstance.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceConfigInstance record, IfaceConfigInstanceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigInstance.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceConfigInstanceExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceConfigInstanceExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}