/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptQueryItemValue;
import com.free.assist.domain.SuptQueryItemValueExample;
import com.free.assist.domain.SuptQueryItemValueKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_QUERY_ITEM_VALUE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptQueryItemValueKey
 * @see��com.regaltec.blocimp.domain.SuptQueryItemValue
 * @see��com.regaltec.blocimp.domain.SuptQueryItemValueExample
 * @autor ibator
 * @version 1.2.1
 * @date 2010-03-17 14:50:27 
 */
public class SuptQueryItemValueDAOImpl extends SpringBaseDAO<SuptQueryItemValueKey, SuptQueryItemValue, SuptQueryItemValueExample> implements SuptQueryItemValueDAO {

    public SuptQueryItemValueDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptQueryItemValue record, SuptQueryItemValueExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptQueryItemValue.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptQueryItemValue record, SuptQueryItemValueExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptQueryItemValue.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptQueryItemValueExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptQueryItemValueExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}