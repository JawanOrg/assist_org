/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SuptAttachExample;
import com.free.assist.domain.SuptAttachKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_ATTACH_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptAttachKey
 * @see：com.free.assist.domain.SuptAttach
 * @see：com.free.assist.domain.SuptAttachExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-15 14:34:37 
 */
public class SuptAttachDAOImpl extends SpringBaseDAO<SuptAttachKey, SuptAttach, SuptAttachExample> implements SuptAttachDAO {

    public SuptAttachDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptAttach record, SuptAttachExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptAttach.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptAttach record, SuptAttachExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptAttach.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptAttachExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptAttachExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}