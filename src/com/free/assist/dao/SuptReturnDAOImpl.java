/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptReturn;
import com.free.assist.domain.SuptReturnExample;
import com.free.assist.domain.SuptReturnKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_RETURN_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptReturnKey
 * @see��com.regaltec.blocimp.domain.SuptReturn
 * @see��com.regaltec.blocimp.domain.SuptReturnExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-04 08:57:49 
 */
public class SuptReturnDAOImpl extends SpringBaseDAO<SuptReturnKey, SuptReturn, SuptReturnExample> implements SuptReturnDAO {

    public SuptReturnDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptReturn record, SuptReturnExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptReturn.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptReturn record, SuptReturnExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptReturn.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptReturnExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptReturnExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}