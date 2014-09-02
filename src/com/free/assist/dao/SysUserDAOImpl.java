/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserExample;
import com.free.assist.domain.SysUserKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_USER_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysUserKey
 * @see��com.regaltec.blocimp.domain.SysUser
 * @see��com.regaltec.blocimp.domain.SysUserExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysUserDAOImpl extends SpringBaseDAO<SysUserKey, SysUser, SysUserExample> implements SysUserDAO {

    public SysUserDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysUser.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysUser record, SysUserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysUser.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysUserExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysUserExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}