/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptTaticRelation;
import com.free.assist.domain.SuptTaticRelationExample;
import com.free.assist.domain.SuptTaticRelationKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_RELATION_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTaticRelationKey
 * @see��com.regaltec.blocimp.domain.SuptTaticRelation
 * @see��com.regaltec.blocimp.domain.SuptTaticRelationExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticRelationDAOImpl extends SpringBaseDAO<SuptTaticRelationKey, SuptTaticRelation, SuptTaticRelationExample> implements SuptTaticRelationDAO {

    public SuptTaticRelationDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptTaticRelation record, SuptTaticRelationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTaticRelation.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptTaticRelation record, SuptTaticRelationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTaticRelation.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptTaticRelationExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptTaticRelationExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}