/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptFace;
import com.free.assist.domain.SuptFaceExample;
import com.free.assist.domain.SuptFaceKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_FACE_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptFaceKey
 * @see��com.regaltec.blocimp.domain.SuptFace
 * @see��com.regaltec.blocimp.domain.SuptFaceExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-28 18:52:47 
 */
public class SuptFaceDAOImpl extends SpringBaseDAO<SuptFaceKey, SuptFace, SuptFaceExample> implements SuptFaceDAO {

    public SuptFaceDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptFace record, SuptFaceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptFace.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptFace record, SuptFaceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptFace.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptFaceExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptFaceExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}