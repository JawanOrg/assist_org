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
 * <p>该实体对应数据库的表名为：T_BUS_LINEPIPE_KNOW。</p>
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_BUS_LINEPIPE_KNOW_SqlMap.xml。</p>
 * @see：com.free.assist.domain.BusLinePipeKnowKey
 * @see：com.free.assist.domain.BusLinePipeKnow
 * @see：com.free.assist.domain.BusLinePipeKnowWithBLOBs
 * @see：com.free.assist.domain.BusLinePipeKnowExample
 * @see：com.free.assist.dao.BusLinePipeKnowDAO
 * @see：com.free.assist.dao.BusLinePipeKnowDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2014-12-08 15:25:15 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="T_BUS_LINEPIPE_KNOW")
public class BusLinePipeKnowWithBLOBs extends BusLinePipeKnow implements Serializable {
    private String knowContent;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="KNOW_CONTENT", nullable=false)
    public String getKnowContent() {
        return knowContent;
    }

    public void setKnowContent(String knowContent) {
        this.knowContent = knowContent;
    }
}