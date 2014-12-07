/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusLinePipeRuleWithBLOBsExample;
import com.free.assist.domain.BusLinePipeRuleKey;
import com.free.assist.domain.BusLinePipeRuleWithBLOBs;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_LINEPIPE_RULE_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusLinePipeRuleKey
 * @see：com.free.assist.domain.BusLinePipeRule
 * @see：com.free.assist.domain.BusLinePipeRuleWithBLOBs
 * @see：com.free.assist.domain.BusLinePipeRuleExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-12-08 15:25:15 
 */
public class BusLinePipeRuleDAOImpl extends SpringBaseDAO<BusLinePipeRuleKey, BusLinePipeRuleWithBLOBs, BusLinePipeRuleWithBLOBsExample> implements BusLinePipeRuleDAO {

    public BusLinePipeRuleDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusLinePipeRuleWithBLOBs record, BusLinePipeRuleWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeRule.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusLinePipeRuleWithBLOBs record, BusLinePipeRuleWithBLOBsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeRule.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusLinePipeRuleWithBLOBsExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusLinePipeRuleWithBLOBsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}