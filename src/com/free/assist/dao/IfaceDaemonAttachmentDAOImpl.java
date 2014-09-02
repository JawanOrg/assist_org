/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.IfaceDaemonAttachment;
import com.free.assist.domain.IfaceDaemonAttachmentExample;
import com.free.assist.domain.IfaceDaemonAttachmentKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_DAEMON_ATTACHMENT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceDaemonAttachmentKey
 * @see：com.regaltec.blocimp.domain.IfaceDaemonAttachment
 * @see：com.regaltec.blocimp.domain.IfaceDaemonAttachmentExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-11 16:56:10 
 */
public class IfaceDaemonAttachmentDAOImpl extends SpringBaseDAO<IfaceDaemonAttachmentKey, IfaceDaemonAttachment, IfaceDaemonAttachmentExample> implements IfaceDaemonAttachmentDAO {

    public IfaceDaemonAttachmentDAOImpl() {
        super();
    }

    public int updateByExampleSelective(IfaceDaemonAttachment record, IfaceDaemonAttachmentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceDaemonAttachment.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(IfaceDaemonAttachment record, IfaceDaemonAttachmentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("IfaceDaemonAttachment.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends IfaceDaemonAttachmentExample {
        private Object record;

        public UpdateByExampleParms(Object record, IfaceDaemonAttachmentExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}