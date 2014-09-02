/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;

import com.free.assist.domain.SysServiceConfig;
import com.free.assist.domain.SysServiceConfigExample;
import com.free.assist.domain.SysServiceConfigKey;
import com.free.assist.util.Pager;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_SERVICE_CONFIG_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysServiceConfigKey
 * @see��com.regaltec.blocimp.domain.SysServiceConfig
 * @see��com.regaltec.blocimp.domain.SysServiceConfigExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysServiceConfigDAOImpl extends SpringBaseDAO<SysServiceConfigKey, SysServiceConfig, SysServiceConfigExample> implements SysServiceConfigDAO {

    public SysServiceConfigDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysServiceConfig record, SysServiceConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysServiceConfig.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysServiceConfig record, SysServiceConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysServiceConfig.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysServiceConfigExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysServiceConfigExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
    
    public List<SysServiceConfig> selectByExample(SysServiceConfigExample example, int skipResults, int maxResults) {
    	int totalRecords = countByExample(example);
    	if (skipResults > totalRecords) {
    		skipResults = totalRecords - maxResults;
    	}
    	if (skipResults == -1 || maxResults == -1) {
    		List result = getSqlMapClientTemplate().queryForList("SysServiceConfig.ibatorgenerated_selectByExample", example);
    		return result;
    	} else {
    		List result = getSqlMapClientTemplate().queryForList("SysServiceConfig.ibatorgenerated_selectByExample", example,skipResults,maxResults);
            return new Pager<SysServiceConfig>(skipResults, maxResults, result, totalRecords);
    	}
    }
    
    
}