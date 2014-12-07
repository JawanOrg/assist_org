/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusReleaseNewsWithBLOBsExample;
import com.free.assist.domain.BusReleaseNewsKey;
import com.free.assist.domain.BusReleaseNewsWithBLOBs;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_RELEASE_NEWS_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusReleaseNewsKey
 * @see：com.free.assist.domain.BusReleaseNews
 * @see：com.free.assist.domain.BusReleaseNewsWithBLOBs
 * @see：com.free.assist.domain.BusReleaseNewsExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-12-07 11:28:01 
 */
public class BusReleaseNewsDAOImpl extends SpringBaseDAO<BusReleaseNewsKey, BusReleaseNewsWithBLOBs, BusReleaseNewsWithBLOBsExample> implements BusReleaseNewsDAO {

    public BusReleaseNewsDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusReleaseNewsWithBLOBs record, BusReleaseNewsWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseNewsWithBLOBs.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusReleaseNewsWithBLOBs record, BusReleaseNewsWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseNewsWithBLOBs.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusReleaseNewsWithBLOBsExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusReleaseNewsWithBLOBsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}