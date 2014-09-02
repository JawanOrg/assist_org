/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysAlarm;
import com.free.assist.domain.SysAlarmExample;
import com.free.assist.domain.SysAlarmKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_ALARM_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysAlarmKey
 * @see��com.regaltec.blocimp.domain.SysAlarm
 * @see��com.regaltec.blocimp.domain.SysAlarmExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysAlarmDAOImpl extends SpringBaseDAO<SysAlarmKey, SysAlarm, SysAlarmExample> implements SysAlarmDAO {

    public SysAlarmDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysAlarm record, SysAlarmExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysAlarm.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysAlarm record, SysAlarmExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysAlarm.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysAlarmExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysAlarmExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}