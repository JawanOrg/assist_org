/*
 * <p>标题: 中国电信OSS公共接口平台</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 天讯瑞达通信技术有限公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsExample;
import com.free.assist.domain.BusReleaseTrendsKey;
import com.free.assist.dao.SpringBaseDAO;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_RELEASE_TRENDS_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusReleaseTrendsKey
 * @see：com.free.assist.domain.BusReleaseTrends
 * @see：com.free.assist.domain.BusReleaseTrendsExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-06 15:26:42 
 */
public class BusReleaseTrendsDAOImpl extends SpringBaseDAO<BusReleaseTrendsKey, BusReleaseTrends, BusReleaseTrendsExample> implements BusReleaseTrendsDAO {

    public BusReleaseTrendsDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusReleaseTrends record, BusReleaseTrendsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseTrends.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusReleaseTrends record, BusReleaseTrendsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseTrends.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusReleaseTrendsExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusReleaseTrendsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}