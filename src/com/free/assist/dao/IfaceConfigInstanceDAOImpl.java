/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigInstanceExample;
import com.free.assist.domain.IfaceConfigInstanceKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_INSTANCE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigInstanceKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigInstance
 * @see��com.regaltec.blocimp.domain.IfaceConfigInstanceExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class IfaceConfigInstanceDAOImpl extends SpringBaseDAO<IfaceConfigInstanceKey, IfaceConfigInstance, IfaceConfigInstanceExample> implements IfaceConfigInstanceDAO {

    public IfaceConfigInstanceDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceConfigInstance record, IfaceConfigInstanceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigInstance.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceConfigInstance record, IfaceConfigInstanceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigInstance.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceConfigInstanceExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceConfigInstanceExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}