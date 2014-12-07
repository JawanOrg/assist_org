/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusReleaseTrendsWithBLOBsExample;
import com.free.assist.domain.BusReleaseTrendsKey;
import com.free.assist.domain.BusReleaseTrendsWithBLOBs;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_RELEASE_TRENDS_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusReleaseTrendsKey
 * @see：com.free.assist.domain.BusReleaseTrends
 * @see：com.free.assist.domain.BusReleaseTrendsWithBLOBs
 * @see：com.free.assist.domain.BusReleaseTrendsExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-12-07 23:26:34 
 */
public class BusReleaseTrendsDAOImpl extends SpringBaseDAO<BusReleaseTrendsKey, BusReleaseTrendsWithBLOBs, BusReleaseTrendsWithBLOBsExample> implements BusReleaseTrendsDAO {

    public BusReleaseTrendsDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusReleaseTrendsWithBLOBs record, BusReleaseTrendsWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseTrends.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusReleaseTrendsWithBLOBs record, BusReleaseTrendsWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseTrends.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusReleaseTrendsWithBLOBsExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusReleaseTrendsWithBLOBsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}