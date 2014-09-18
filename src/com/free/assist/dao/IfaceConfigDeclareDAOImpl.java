/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceConfigDeclare;
import com.free.assist.domain.IfaceConfigDeclareExample;
import com.free.assist.domain.IfaceConfigDeclareKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_IFACE_CONF_DECLARE_SqlMap.xml。</p>
 * @see：com.free.assist.domain.IfaceConfigDeclareKey
 * @see：com.free.assist.domain.IfaceConfigDeclare
 * @see：com.free.assist.domain.IfaceConfigDeclareExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class IfaceConfigDeclareDAOImpl extends SpringBaseDAO<IfaceConfigDeclareKey, IfaceConfigDeclare, IfaceConfigDeclareExample> implements IfaceConfigDeclareDAO {

    public IfaceConfigDeclareDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceConfigDeclare record, IfaceConfigDeclareExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigDeclare.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceConfigDeclare record, IfaceConfigDeclareExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigDeclare.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceConfigDeclareExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceConfigDeclareExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}