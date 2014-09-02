/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SuptCheck;
import com.free.assist.domain.SuptCheckExample;
import com.free.assist.domain.SuptCheckKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_CHECK_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptCheckKey
 * @see��com.regaltec.blocimp.domain.SuptCheck
 * @see��com.regaltec.blocimp.domain.SuptCheckExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SuptCheckDAOImpl extends SpringBaseDAO<SuptCheckKey, SuptCheck, SuptCheckExample> implements SuptCheckDAO {

    public SuptCheckDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptCheck record, SuptCheckExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptCheck.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptCheck record, SuptCheckExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptCheck.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptCheckExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptCheckExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	public List<SuptCheck> selectFaceByExample(SuptCheckExample example) {
		List list = getSqlMapClientTemplate().queryForList("SuptCheck.ibatorgenerated_selectFaceByExample", example);
        return list;
	}
}