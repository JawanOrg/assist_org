/*
 * <p>标题: 中国电信OSS公共接口平台</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 天讯瑞达通信技术有限公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：T_SUPT_ACTION。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_ACTION_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptActionKey
 * @see：com.free.assist.domain.SuptAction
 * @see：com.free.assist.domain.SuptActionExample
 * @see：com.free.assist.dao.SuptActionDAO
 * @see：com.free.assist.dao.SuptActionDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2014-01-07 13:48:52 
 */
public class SuptActionKey implements Serializable {
    private String actionId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="ACTION_ID", nullable=false, length=32)
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}