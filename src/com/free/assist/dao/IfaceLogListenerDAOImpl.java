/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceLogListener;
import com.free.assist.domain.IfaceLogListenerExample;
import com.free.assist.domain.IfaceLogListenerKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_LISTENER_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogListenerKey
 * @see��com.regaltec.blocimp.domain.IfaceLogListener
 * @see��com.regaltec.blocimp.domain.IfaceLogListenerExample
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