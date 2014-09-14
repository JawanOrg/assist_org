/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusReleaseNews;
import com.free.assist.domain.BusReleaseNewsExample;
import com.free.assist.domain.BusReleaseNewsKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_RELEASE_NEWS_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusReleaseNewsKey
 * @see：com.free.assist.domain.BusReleaseNews
 * @see：com.free.assist.domain.BusReleaseNewsExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-09-14 22:17:58 
 */
public class BusReleaseNewsDAOImpl extends SpringBaseDAO<BusReleaseNewsKey, BusReleaseNews, BusReleaseNewsExample> implements BusReleaseNewsDAO {

    public BusReleaseNewsDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusReleaseNews record, BusReleaseNewsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseNews.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusReleaseNews record, BusReleaseNewsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusReleaseNews.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusReleaseNewsExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusReleaseNewsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}