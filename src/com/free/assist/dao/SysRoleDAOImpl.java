/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysRole;
import com.free.assist.domain.SysRoleExample;
import com.free.assist.domain.SysRoleKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_ROLE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysRoleKey
 * @see��com.regaltec.blocimp.domain.SysRole
 * @see��com.regaltec.blocimp.domain.SysRoleExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-15 10:48:20 
 */
public class SysRoleDAOImpl extends SpringBaseDAO<SysRoleKey, SysRole, SysRoleExample> implements SysRoleDAO {

    public SysRoleDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysRole record, SysRoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysRole.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysRole record, SysRoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysRole.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysRoleExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysRoleExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}