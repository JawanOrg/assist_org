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
 * <p>该实体对应数据库的表名为：T_BUS_RELEASE_NEWS。</p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_RELEASE_NEWS_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusReleaseNewsKey
 * @see：com.free.assist.domain.BusReleaseNews
 * @see：com.free.assist.domain.BusReleaseNewsWithBLOBs
 * @see：com.free.assist.domain.BusReleaseNewsExample
 * @see：com.free.assist.dao.BusReleaseNewsDAO
 * @see：com.free.assist.dao.BusReleaseNewsDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2014-12-07 11:28:01 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="T_BUS_RELEASE_NEWS")
public class BusReleaseNewsWithBLOBs extends BusReleaseNews implements Serializable {
    private String newsContent;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="NEWS_CONTENT", nullable=false)
    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}