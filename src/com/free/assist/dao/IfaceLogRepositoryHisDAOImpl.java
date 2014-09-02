/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceLogRepositoryHis;
import com.free.assist.domain.IfaceLogRepositoryHisExample;
import com.free.assist.domain.IfaceLogRepositoryHisKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_HIS_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryHisKey
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryHis
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryHisExample
 * @autor ibator
 * @version 1.2.1
 * @date 2010-01-06 16:06:41 
 */
public class IfaceLogRepositoryHisDAOImpl extends SpringBaseDAO<IfaceLogRepositoryHisKey, IfaceLogRepositoryHis, IfaceLogRepositoryHisExample> implements IfaceLogRepositoryHisDAO {

    public IfaceLogRepositoryHisDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceLogRepositoryHis record, IfaceLogRepositoryHisExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogRepositoryHis.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceLogRepositoryHis record, IfaceLogRepositoryHisExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogRepositoryHis.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceLogRepositoryHisExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceLogRepositoryHisExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}