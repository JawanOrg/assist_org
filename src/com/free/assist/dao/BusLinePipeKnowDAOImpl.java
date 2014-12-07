/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusLinePipeKnowWithBLOBsExample;
import com.free.assist.domain.BusLinePipeKnowKey;
import com.free.assist.domain.BusLinePipeKnowWithBLOBs;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_LINEPIPE_KNOW_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusLinePipeKnowKey
 * @see：com.free.assist.domain.BusLinePipeKnow
 * @see：com.free.assist.domain.BusLinePipeKnowWithBLOBs
 * @see：com.free.assist.domain.BusLinePipeKnowExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-12-08 15:25:15 
 */
public class BusLinePipeKnowDAOImpl extends SpringBaseDAO<BusLinePipeKnowKey, BusLinePipeKnowWithBLOBs, BusLinePipeKnowWithBLOBsExample> implements BusLinePipeKnowDAO {

    public BusLinePipeKnowDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusLinePipeKnowWithBLOBs record, BusLinePipeKnowWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeKnow.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusLinePipeKnowWithBLOBs record, BusLinePipeKnowWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeKnow.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusLinePipeKnowWithBLOBsExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusLinePipeKnowWithBLOBsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}