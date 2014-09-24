/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：JFORUM_TOPICS。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.JFORUM_TOPICS_SqlMap.xml。</p>
 * @see：com.free.assist.domain.ForumTopicsKey
 * @see：com.free.assist.domain.ForumTopics
 * @see：com.free.assist.domain.ForumTopicsExample
 * @see：com.free.assist.dao.ForumTopicsDAO
 * @see：com.free.assist.dao.ForumTopicsDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2014-09-24 16:43:58 
 */
public class ForumTopicsKey implements Serializable {
    private Long topicId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="TOPIC_ID", nullable=false)
    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }
}