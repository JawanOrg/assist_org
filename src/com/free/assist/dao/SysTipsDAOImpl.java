/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysTips;
import com.free.assist.domain.SysTipsExample;
import com.free.assist.domain.SysTipsKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_TIPS_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysTipsKey
 * @see��com.regaltec.blocimp.domain.SysTips
 * @see��com.regaltec.blocimp.domain.SysTipsExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-29 19:14:56 
 */
public class SysTipsDAOImpl extends SpringBaseDAO<SysTipsKey, SysTips, SysTipsExample> implements SysTipsDAO {

    public SysTipsDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysTips record, SysTipsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysTips.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysTips record, SysTipsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysTips.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysTipsExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysTipsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}