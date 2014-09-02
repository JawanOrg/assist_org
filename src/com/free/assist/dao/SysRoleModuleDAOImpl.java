/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysRoleModule;
import com.free.assist.domain.SysRoleModuleExample;
import com.free.assist.domain.SysRoleModuleKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_ROLE_MODULE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysRoleModuleKey
 * @see��com.regaltec.blocimp.domain.SysRoleModuleExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysRoleModuleDAOImpl extends SpringBaseDAO<SysRoleModuleKey, SysRoleModule, SysRoleModuleExample> implements SysRoleModuleDAO {

    public SysRoleModuleDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysRoleModule record, SysRoleModuleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysRoleModule.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysRoleModule record, SysRoleModuleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysRoleModule.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysRoleModuleExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysRoleModuleExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}