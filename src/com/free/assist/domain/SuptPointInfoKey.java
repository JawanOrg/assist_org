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
 * <p>该实体对应数据库的表名为：T_SUPT_POINT_INFO。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_POINT_INFO_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptPointInfoKey
 * @see：com.free.assist.domain.SuptPointInfo
 * @see：com.free.assist.domain.SuptPointInfoExample
 * @see：com.free.assist.dao.SuptPointInfoDAO
 * @see：com.free.assist.dao.SuptPointInfoDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2014-02-13 16:14:05 
 */
public class SuptPointInfoKey implements Serializable {
    private String pointId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="POINT_ID", nullable=false, length=32)
    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }
}