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
 * <p>该实体对应数据库的表名为：T_SUPT_NOTICE_OBJECT。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_NOTICE_OBJECT_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptNoticeObjectKey
 * @see：com.free.assist.domain.SuptNoticeObject
 * @see：com.free.assist.domain.SuptNoticeObjectExample
 * @see：com.free.assist.dao.SuptNoticeObjectDAO
 * @see：com.free.assist.dao.SuptNoticeObjectDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2015-01-15 16:51:19 
 */
public class SuptNoticeObjectKey implements Serializable {
    private String noticeId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="NOTICE_ID", nullable=false, length=32)
    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }
}