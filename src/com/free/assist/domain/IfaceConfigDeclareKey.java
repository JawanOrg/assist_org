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
 * <p>该实体对应数据库的表名为：t_iface_conf_declare。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_DECLARE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigDeclareKey
 * @see：com.regaltec.blocimp.domain.IfaceConfigDeclare
 * @see：com.regaltec.blocimp.domain.IfaceConfigDeclareExample
 * @see：com.regaltec.blocimp.dao.IfaceConfigDeclareDAO
 * @see：com.regaltec.blocimp.dao.IfaceConfigDeclareDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-30 14:35:16 
 */
public class IfaceConfigDeclareKey implements Serializable {
    private String declareId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="DECLARE_ID", nullable=false, length=32)
    public String getDeclareId() {
        return declareId;
    }

    public void setDeclareId(String declareId) {
        this.declareId = declareId;
    }
}