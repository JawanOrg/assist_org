/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysAttachment;
import com.free.assist.domain.SysAttachmentExample;
import com.free.assist.domain.SysAttachmentKey;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_ATTACHMENT_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysAttachmentKey
 * @see��com.regaltec.blocimp.domain.SysAttachment
 * @see��com.regaltec.blocimp.domain.SysAttachmentExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysAttachmentDAOImpl extends SpringBaseDAO<SysAttachmentKey, SysAttachment, SysAttachmentExample> implements SysAttachmentDAO {

    public SysAttachmentDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysAttachment record, SysAttachmentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysAttachment.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysAttachment record, SysAttachmentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysAttachment.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysAttachmentExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysAttachmentExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}