/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.BusLinePipeRule;
import com.free.assist.domain.BusLinePipeRuleExample;
import com.free.assist.domain.BusLinePipeRuleKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_LINEPIPE_RULE_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusLinePipeRuleKey
 * @see：com.free.assist.domain.BusLinePipeRule
 * @see：com.free.assist.domain.BusLinePipeRuleExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-09-16 13:57:20 
 */
public class BusLinePipeRuleDAOImpl extends SpringBaseDAO<BusLinePipeRuleKey, BusLinePipeRule, BusLinePipeRuleExample> implements BusLinePipeRuleDAO {

    public BusLinePipeRuleDAOImpl() {
        super();
    }

    public int updateByExampleSelective(BusLinePipeRule record, BusLinePipeRuleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeRule.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(BusLinePipeRule record, BusLinePipeRuleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("BusLinePipeRule.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends BusLinePipeRuleExample {
        private Object record;

        public UpdateByExampleParms(Object record, BusLinePipeRuleExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}