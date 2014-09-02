/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceDaemonDocument;
import com.free.assist.domain.IfaceDaemonDocumentExample;
import com.free.assist.domain.IfaceDaemonDocumentKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_DAEMON_DOCUMENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceDaemonDocumentKey
 * @see��com.regaltec.blocimp.domain.IfaceDaemonDocument
 * @see��com.regaltec.blocimp.domain.IfaceDaemonDocumentExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-08 17:20:10 
 */
public class IfaceDaemonDocumentDAOImpl extends SpringBaseDAO<IfaceDaemonDocumentKey, IfaceDaemonDocument, IfaceDaemonDocumentExample> implements IfaceDaemonDocumentDAO {

    public IfaceDaemonDocumentDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceDaemonDocument record, IfaceDaemonDocumentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceDaemonDocument.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceDaemonDocument record, IfaceDaemonDocumentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceDaemonDocument.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceDaemonDocumentExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceDaemonDocumentExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}