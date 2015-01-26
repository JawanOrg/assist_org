/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: ��˾</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusReleaseActual;
import com.free.assist.domain.BusReleaseActualExample;
import com.free.assist.domain.BusReleaseActualKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.free.assist.dao.xml.T_BUS_RELEASE_ACTUAL_SqlMap.xml��</p>
 * @see��com.free.assist.domain.BusReleaseActualKey
 * @see��com.free.assist.domain.BusReleaseActual
 * @see��com.free.assist.domain.BusReleaseActualExample
 * @autor ibator
 * @version 1.2.1
 * @date 2015-01-15 16:51:19 
 */
public class BusReleaseActualDAOImpl extends SpringBaseDAO<BusReleaseActualKey, BusReleaseActual, BusReleaseActualExample> implements BusReleaseActualDAO {

    public BusReleaseActualDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusReleaseActual record, BusReleaseActualExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseActual.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusReleaseActual record, BusReleaseActualExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseActual.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusReleaseActualExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusReleaseActualExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}