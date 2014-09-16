/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusLinePipeKnow;
import com.free.assist.domain.BusLinePipeKnowExample;
import com.free.assist.domain.BusLinePipeKnowKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_LINEPIPE_KNOW_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusLinePipeKnowKey
 * @see：com.free.assist.domain.BusLinePipeKnow
 * @see：com.free.assist.domain.BusLinePipeKnowExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-09-16 13:57:20 
 */
public class BusLinePipeKnowDAOImpl extends SpringBaseDAO<BusLinePipeKnowKey, BusLinePipeKnow, BusLinePipeKnowExample> implements BusLinePipeKnowDAO {

    public BusLinePipeKnowDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusLinePipeKnow record, BusLinePipeKnowExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeKnow.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusLinePipeKnow record, BusLinePipeKnowExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeKnow.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusLinePipeKnowExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusLinePipeKnowExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}