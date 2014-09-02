/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysParameterConf;
import com.free.assist.domain.SysParameterConfExample;
import com.free.assist.domain.SysParameterConfKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_PARAMETER_CONF_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysParameterConfKey
 * @see��com.regaltec.blocimp.domain.SysParameterConf
 * @see��com.regaltec.blocimp.domain.SysParameterConfExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-02 10:30:47 
 */
public class SysParameterConfDAOImpl extends SpringBaseDAO<SysParameterConfKey, SysParameterConf, SysParameterConfExample> implements SysParameterConfDAO {

    public SysParameterConfDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysParameterConf record, SysParameterConfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysParameterConf.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysParameterConf record, SysParameterConfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysParameterConf.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysParameterConfExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysParameterConfExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}