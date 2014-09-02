/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SuptPointInfo;
import com.free.assist.domain.SuptPointInfoExample;
import com.free.assist.domain.SuptPointInfoKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_POINT_INFO_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptPointInfoKey
 * @see：com.free.assist.domain.SuptPointInfo
 * @see：com.free.assist.domain.SuptPointInfoExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-02-13 16:14:05 
 */
public class SuptPointInfoDAOImpl extends SpringBaseDAO<SuptPointInfoKey, SuptPointInfo, SuptPointInfoExample> implements SuptPointInfoDAO {

    public SuptPointInfoDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SuptPointInfo record, SuptPointInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptPointInfo.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SuptPointInfo record, SuptPointInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SuptPointInfo.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SuptPointInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, SuptPointInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}