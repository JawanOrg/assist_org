/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceLogStrategy;
import com.free.assist.domain.IfaceLogStrategyExample;
import com.free.assist.domain.IfaceLogStrategyKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_STRATEGY_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogStrategyKey
 * @see��com.regaltec.blocimp.domain.IfaceLogStrategy
 * @see��com.regaltec.blocimp.domain.IfaceLogStrategyExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-28 23:51:59 
 */
public class IfaceLogStrategyDAOImpl extends SpringBaseDAO<IfaceLogStrategyKey, IfaceLogStrategy, IfaceLogStrategyExample> implements IfaceLogStrategyDAO {

    public IfaceLogStrategyDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceLogStrategy record, IfaceLogStrategyExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogStrategy.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceLogStrategy record, IfaceLogStrategyExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogStrategy.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceLogStrategyExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceLogStrategyExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}