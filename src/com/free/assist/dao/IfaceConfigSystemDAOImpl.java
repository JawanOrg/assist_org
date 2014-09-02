/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.IfaceConfigSystemKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_SYSTEM_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigSystemKey
 * @see：com.regaltec.blocimp.domain.IfaceConfigSystem
 * @see：com.regaltec.blocimp.domain.IfaceConfigSystemExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-03 15:44:14 
 */
public class IfaceConfigSystemDAOImpl extends SpringBaseDAO<IfaceConfigSystemKey, IfaceConfigSystem, IfaceConfigSystemExample> implements IfaceConfigSystemDAO {

    public IfaceConfigSystemDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceConfigSystem record, IfaceConfigSystemExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigSystem.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceConfigSystem record, IfaceConfigSystemExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigSystem.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceConfigSystemExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceConfigSystemExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}