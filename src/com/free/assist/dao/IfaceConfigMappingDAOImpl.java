/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceConfigMapping;
import com.free.assist.domain.IfaceConfigMappingExample;
import com.free.assist.domain.IfaceConfigMappingKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.V_IFACE_CONF_MAPPING_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigMapping
 * @see：com.regaltec.blocimp.domain.IfaceConfigMappingExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-28 22:51:59 
 */
public class IfaceConfigMappingDAOImpl extends SpringBaseDAO<IfaceConfigMappingKey, IfaceConfigMapping, IfaceConfigMappingExample> implements IfaceConfigMappingDAO {

    public IfaceConfigMappingDAOImpl() {
        super();
    }
    
    public int updateByExampleSelective(IfaceConfigMapping record, IfaceConfigMappingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigMapping.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceConfigMapping record, IfaceConfigMappingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigMapping.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceConfigMappingExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceConfigMappingExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}