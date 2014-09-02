/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.domain.IfaceConfigSystemKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_CONF_SYSTEM_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystemKey
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystem
 * @see��com.regaltec.blocimp.domain.IfaceConfigSystemExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-03 15:44:14 
 */
public class IfaceConfigSystemDAOImpl extends SpringBaseDAO<IfaceConfigSystemKey, IfaceConfigSystem, IfaceConfigSystemExample> implements IfaceConfigSystemDAO {

    public IfaceConfigSystemDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceConfigSystem record, IfaceConfigSystemExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigSystem.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceConfigSystem record, IfaceConfigSystemExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceConfigSystem.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceConfigSystemExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceConfigSystemExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}