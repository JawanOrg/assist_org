/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.IfaceLogRepository;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.IfaceLogRepositoryKey;
import com.free.assist.domain.IfaceMonitor;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryKey
 * @see��com.regaltec.blocimp.domain.IfaceLogRepository
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-05 08:24:50 
 */
public class IfaceLogRepositoryDAOImpl extends SpringBaseDAO<IfaceLogRepositoryKey, IfaceLogRepository, IfaceLogRepositoryExample> implements IfaceLogRepositoryDAO {

    public IfaceLogRepositoryDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceLogRepository record, IfaceLogRepositoryExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogRepository.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceLogRepository record, IfaceLogRepositoryExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceLogRepository.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceLogRepositoryExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceLogRepositoryExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
    
    public List<IfaceMonitor> selectIfaceMonitorByExample(IfaceLogRepositoryExample example) {
        List<IfaceMonitor> list = getSqlMapClientTemplate().queryForList("IfaceLogRepository.manual_selectIfaceMonitorByExample", example);
        return list;
    }
}