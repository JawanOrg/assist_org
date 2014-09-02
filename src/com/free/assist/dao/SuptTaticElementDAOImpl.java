/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptTaticElement;
import com.free.assist.domain.SuptTaticElementExample;
import com.free.assist.domain.SuptTaticElementKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_ELEMENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTaticElementKey
 * @see��com.regaltec.blocimp.domain.SuptTaticElement
 * @see��com.regaltec.blocimp.domain.SuptTaticElementExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticElementDAOImpl extends SpringBaseDAO<SuptTaticElementKey, SuptTaticElement, SuptTaticElementExample> implements SuptTaticElementDAO {

    public SuptTaticElementDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptTaticElement record, SuptTaticElementExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTaticElement.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptTaticElement record, SuptTaticElementExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTaticElement.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptTaticElementExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptTaticElementExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}