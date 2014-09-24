/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.ForumTopics;
import com.free.assist.domain.ForumTopicsExample;
import com.free.assist.domain.ForumTopicsKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.JFORUM_TOPICS_SqlMap.xml。</p>
 * @see：com.free.assist.domain.ForumTopicsKey
 * @see：com.free.assist.domain.ForumTopics
 * @see：com.free.assist.domain.ForumTopicsExample
 * @autor ibator
 * @version 1.2.1
 * @date 2014-09-24 16:43:58 
 */
public class ForumTopicsDAOImpl extends SpringBaseDAO<ForumTopicsKey, ForumTopics, ForumTopicsExample> implements ForumTopicsDAO {

    public ForumTopicsDAOImpl() {
        super();
    }

    public int updateByExampleSelective(ForumTopics record, ForumTopicsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("ForumTopics.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(ForumTopics record, ForumTopicsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("ForumTopics.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends ForumTopicsExample {
        private Object record;

        public UpdateByExampleParms(Object record, ForumTopicsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}