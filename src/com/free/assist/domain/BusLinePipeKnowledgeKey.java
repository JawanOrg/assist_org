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
 * <p>该实体对应数据库的表名为：T_BUS_LINEPIPE_KNOWLEDGE。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_LINEPIPE_KNOWLEDGE_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusLinePipeKnowledgeKey
 * @see：com.free.assist.domain.BusLinePipeKnowledge
 * @see：com.free.assist.domain.BusLinePipeKnowledgeWithBLOBs
 * @see：com.free.assist.domain.BusLinePipeKnowledgeExample
 * @see：com.free.assist.dao.BusLinePipeKnowledgeDAO
 * @see：com.free.assist.dao.BusLinePipeKnowledgeDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2014-12-08 15:25:15 
 */
public class BusLinePipeKnowledgeKey implements Serializable {
    private String contentId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="CONTENT_ID", nullable=false, length=32)
    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
}