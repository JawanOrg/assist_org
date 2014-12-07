/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusLinePipeKnowledgeWithBLOBsExample;
import com.free.assist.domain.BusLinePipeKnowledgeKey;
import com.free.assist.domain.BusLinePipeKnowledgeWithBLOBs;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_LINEPIPE_KNOWLEDGE_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusLinePipeKnowledgeKey
 * @see：com.free.assist.domain.BusLinePipeKnowledge
 * @see：com.free.assist.domain.BusLinePipeKnowledgeWithBLOBs
 * @see：com.free.assist.domain.BusLinePipeKnowledgeExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-12-08 15:25:15 
 */
public class BusLinePipeKnowledgeDAOImpl extends SpringBaseDAO<BusLinePipeKnowledgeKey, BusLinePipeKnowledgeWithBLOBs, BusLinePipeKnowledgeWithBLOBsExample> implements BusLinePipeKnowledgeDAO {

    public BusLinePipeKnowledgeDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusLinePipeKnowledgeWithBLOBs record, BusLinePipeKnowledgeWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeKnowledge.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusLinePipeKnowledgeWithBLOBs record, BusLinePipeKnowledgeWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeKnowledge.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusLinePipeKnowledgeWithBLOBsExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusLinePipeKnowledgeWithBLOBsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}