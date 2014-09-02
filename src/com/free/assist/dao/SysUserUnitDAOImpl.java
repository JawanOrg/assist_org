/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysUserUnit;
import com.free.assist.domain.SysUserUnitExample;
import com.free.assist.domain.SysUserUnitKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_USER_UNIT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysUserUnitKey
 * @see��com.regaltec.blocimp.domain.SysUserUnit
 * @see��com.regaltec.blocimp.domain.SysUserUnitExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-16 10:08:20 
 */
public class SysUserUnitDAOImpl extends SpringBaseDAO<SysUserUnitKey, SysUserUnit, SysUserUnitExample> implements SysUserUnitDAO {

    public SysUserUnitDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysUserUnit record, SysUserUnitExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysUserUnit.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysUserUnit record, SysUserUnitExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysUserUnit.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysUserUnitExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysUserUnitExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}