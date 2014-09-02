/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptTaticInstance;
import com.free.assist.domain.SuptTaticInstanceExample;
import com.free.assist.domain.SuptTaticInstanceKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_INSTANCE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTaticInstanceKey
 * @see��com.regaltec.blocimp.domain.SuptTaticInstance
 * @see��com.regaltec.blocimp.domain.SuptTaticInstanceExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticInstanceDAOImpl extends SpringBaseDAO<SuptTaticInstanceKey, SuptTaticInstance, SuptTaticInstanceExample> implements SuptTaticInstanceDAO {

    public SuptTaticInstanceDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptTaticInstance record, SuptTaticInstanceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTaticInstance.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptTaticInstance record, SuptTaticInstanceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptTaticInstance.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptTaticInstanceExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptTaticInstanceExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}