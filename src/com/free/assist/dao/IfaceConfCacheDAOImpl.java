/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceConfCache;
import com.free.assist.domain.IfaceConfCacheExample;
import com.free.assist.domain.IfaceConfCacheKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_CACHE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfCacheKey
 * @see��com.regaltec.blocimp.domain.IfaceConfCache
 * @see��com.regaltec.blocimp.domain.IfaceConfCacheExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-03 13:36:35 
 */
public class IfaceConfCacheDAOImpl extends SpringBaseDAO<IfaceConfCacheKey, IfaceConfCache, IfaceConfCacheExample> implements IfaceConfCacheDAO {

    public IfaceConfCacheDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceConfCache record, IfaceConfCacheExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfCache.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceConfCache record, IfaceConfCacheExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfCache.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceConfCacheExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceConfCacheExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}