/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_iface_conf_system。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_SYSTEM_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigSystemKey
 * @see：com.regaltec.blocimp.domain.IfaceConfigSystem
 * @see：com.regaltec.blocimp.domain.IfaceConfigSystemExample
 * @see：com.regaltec.blocimp.dao.IfaceConfigSystemDAO
 * @see：com.regaltec.blocimp.dao.IfaceConfigSystemDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-03 15:44:14 
 */
public class IfaceConfigSystemKey implements Serializable {
    private String applicationId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="APPLICATION_ID", nullable=false, length=32)
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}