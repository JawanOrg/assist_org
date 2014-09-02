/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysModule;
import com.free.assist.domain.SysModuleExample;
import com.free.assist.domain.SysModuleKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_MODULE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysModuleKey
 * @see��com.regaltec.blocimp.domain.SysModule
 * @see��com.regaltec.blocimp.domain.SysModuleExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysModuleDAOImpl extends SpringBaseDAO<SysModuleKey, SysModule, SysModuleExample> implements SysModuleDAO {

    public SysModuleDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysModule record, SysModuleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysModule.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysModule record, SysModuleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysModule.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysModuleExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysModuleExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}