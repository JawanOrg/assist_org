/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigProtocolExample;
import com.free.assist.domain.IfaceConfigProtocolKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_IFACE_CONF_PROTOCOL_SqlMap.xml。</p>
 * @see：com.free.assist.domain.IfaceConfigProtocolKey
 * @see：com.free.assist.domain.IfaceConfigProtocol
 * @see：com.free.assist.domain.IfaceConfigProtocolExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-04 22:01:28 
 */
public class IfaceConfigProtocolDAOImpl extends SpringBaseDAO<IfaceConfigProtocolKey, IfaceConfigProtocol, IfaceConfigProtocolExample> implements IfaceConfigProtocolDAO {

    public IfaceConfigProtocolDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceConfigProtocol record, IfaceConfigProtocolExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigProtocol.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceConfigProtocol record, IfaceConfigProtocolExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigProtocol.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceConfigProtocolExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceConfigProtocolExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}