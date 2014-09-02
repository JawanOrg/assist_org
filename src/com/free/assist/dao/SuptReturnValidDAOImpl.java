/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptReturnValid;
import com.free.assist.domain.SuptReturnValidExample;
import com.free.assist.domain.SuptReturnValidKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_RETURN_VALID_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptReturnValidKey
 * @see��com.regaltec.blocimp.domain.SuptReturnValid
 * @see��com.regaltec.blocimp.domain.SuptReturnValidExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-05 16:24:06 
 */
public class SuptReturnValidDAOImpl extends SpringBaseDAO<SuptReturnValidKey, SuptReturnValid, SuptReturnValidExample> implements SuptReturnValidDAO {

    public SuptReturnValidDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptReturnValid record, SuptReturnValidExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptReturnValid.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptReturnValid record, SuptReturnValidExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptReturnValid.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptReturnValidExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptReturnValidExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}