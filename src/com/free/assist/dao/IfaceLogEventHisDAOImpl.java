/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceLogEventHis;
import com.free.assist.domain.IfaceLogEventHisExample;
import com.free.assist.domain.IfaceLogEventHisKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_EVENT_HIS_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogEventHisKey
 * @see：com.regaltec.blocimp.domain.IfaceLogEventHis
 * @see：com.regaltec.blocimp.domain.IfaceLogEventHisExample
 * @autor ibator
 * @version 1.2.1
 * @date 2010-01-18 13:13:28 
 */
public class IfaceLogEventHisDAOImpl extends SpringBaseDAO<IfaceLogEventHisKey, IfaceLogEventHis, IfaceLogEventHisExample> implements IfaceLogEventHisDAO {

    public IfaceLogEventHisDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceLogEventHis record, IfaceLogEventHisExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogEventHis.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceLogEventHis record, IfaceLogEventHisExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogEventHis.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceLogEventHisExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceLogEventHisExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}