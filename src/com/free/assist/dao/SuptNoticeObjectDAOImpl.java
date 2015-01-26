/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: ��˾</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptNoticeObject;
import com.free.assist.domain.SuptNoticeObjectExample;
import com.free.assist.domain.SuptNoticeObjectKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.free.assist.dao.xml.T_SUPT_NOTICE_OBJECT_SqlMap.xml��</p>
 * @see��com.free.assist.domain.SuptNoticeObjectKey
 * @see��com.free.assist.domain.SuptNoticeObject
 * @see��com.free.assist.domain.SuptNoticeObjectExample
 * @autor ibator
 * @version 1.2.1
 * @date 2015-01-15 16:51:19 
 */
public class SuptNoticeObjectDAOImpl extends SpringBaseDAO<SuptNoticeObjectKey, SuptNoticeObject, SuptNoticeObjectExample> implements SuptNoticeObjectDAO {

    public SuptNoticeObjectDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptNoticeObject record, SuptNoticeObjectExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptNoticeObject.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptNoticeObject record, SuptNoticeObjectExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptNoticeObject.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptNoticeObjectExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptNoticeObjectExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}