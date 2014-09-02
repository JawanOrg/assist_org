/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptFaceErrTack;
import com.free.assist.domain.SuptFaceErrTackExample;
import com.free.assist.domain.SuptFaceErrTackKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_FACE_ERRTACK_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptFaceErrTackKey
 * @see：com.regaltec.blocimp.domain.SuptFaceErrTack
 * @see：com.regaltec.blocimp.domain.SuptFaceErrTackExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-12 14:09:43 
 */
public class SuptFaceErrTackDAOImpl extends SpringBaseDAO<SuptFaceErrTackKey, SuptFaceErrTack, SuptFaceErrTackExample> implements SuptFaceErrTackDAO {

    public SuptFaceErrTackDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptFaceErrTack record, SuptFaceErrTackExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptFaceErrTack.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptFaceErrTack record, SuptFaceErrTackExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptFaceErrTack.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptFaceErrTackExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptFaceErrTackExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}