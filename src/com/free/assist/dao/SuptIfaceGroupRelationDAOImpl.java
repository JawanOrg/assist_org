/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptIfaceGroupRelation;
import com.free.assist.domain.SuptIfaceGroupRelationExample;
import com.free.assist.domain.SuptIfaceGroupRelationKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_IFACE_GROUP_RELATION_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelationKey
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelation
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelationExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-09 09:55:02 
 */
public class SuptIfaceGroupRelationDAOImpl extends SpringBaseDAO<SuptIfaceGroupRelationKey, SuptIfaceGroupRelation, SuptIfaceGroupRelationExample> implements SuptIfaceGroupRelationDAO {

    public SuptIfaceGroupRelationDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptIfaceGroupRelation record, SuptIfaceGroupRelationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptIfaceGroupRelation.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptIfaceGroupRelation record, SuptIfaceGroupRelationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptIfaceGroupRelation.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptIfaceGroupRelationExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptIfaceGroupRelationExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}