/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.IfaceLogEvent;
import com.free.assist.domain.IfaceLogEventExample;
import com.free.assist.domain.IfaceLogEventKey;
import com.free.assist.domain.IfaceLogEventMonitor;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_EVENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogEventKey
 * @see��com.regaltec.blocimp.domain.IfaceLogEvent
 * @see��com.regaltec.blocimp.domain.IfaceLogEventExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-07 20:02:03 
 */
public class IfaceLogEventDAOImpl extends SpringBaseDAO<IfaceLogEventKey, IfaceLogEvent, IfaceLogEventExample> implements IfaceLogEventDAO {

    public IfaceLogEventDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceLogEvent record, IfaceLogEventExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogEvent.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceLogEvent record, IfaceLogEventExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogEvent.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceLogEventExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceLogEventExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
    
	public List<IfaceLogEventMonitor> selectIfaceLogEventMonitorByExample(IfaceLogEventExample example) {
		List<IfaceLogEventMonitor> list = getSqlMapClientTemplate().queryForList("IfaceLogEvent.manual_selectIfaceLogEventMonitorByExample", example);
        return list;
	}
}