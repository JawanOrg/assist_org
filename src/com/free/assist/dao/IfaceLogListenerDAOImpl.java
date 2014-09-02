/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceLogListener;
import com.free.assist.domain.IfaceLogListenerExample;
import com.free.assist.domain.IfaceLogListenerKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_LISTENER_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogListenerKey
 * @see：com.regaltec.blocimp.domain.IfaceLogListener
 * @see：com.regaltec.blocimp.domain.IfaceLogListenerExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-28 23:51:59 
 */
public class IfaceLogListenerDAOImpl extends SpringBaseDAO<IfaceLogListenerKey, IfaceLogListener, IfaceLogListenerExample> implements IfaceLogListenerDAO {

    public IfaceLogListenerDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceLogListener record, IfaceLogListenerExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogListener.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceLogListener record, IfaceLogListenerExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogListener.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceLogListenerExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceLogListenerExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}