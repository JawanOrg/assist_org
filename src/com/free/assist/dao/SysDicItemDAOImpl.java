/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.domain.SysDicItemKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_DIC_ITEM_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysDicItemKey
 * @see��com.regaltec.blocimp.domain.SysDicItem
 * @see��com.regaltec.blocimp.domain.SysDicItemExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysDicItemDAOImpl extends SpringBaseDAO<SysDicItemKey, SysDicItem, SysDicItemExample> implements SysDicItemDAO {

    public SysDicItemDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysDicItem record, SysDicItemExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysDicItem.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysDicItem record, SysDicItemExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysDicItem.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysDicItemExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysDicItemExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}