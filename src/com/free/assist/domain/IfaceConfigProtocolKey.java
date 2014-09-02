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
 * <p>该实体对应数据库的表名为：t_iface_conf_protocol。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_PROTOCOL_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigProtocolKey
 * @see：com.regaltec.blocimp.domain.IfaceConfigProtocol
 * @see：com.regaltec.blocimp.domain.IfaceConfigProtocolExample
 * @see：com.regaltec.blocimp.dao.IfaceConfigProtocolDAO
 * @see：com.regaltec.blocimp.dao.IfaceConfigProtocolDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-04 22:01:28 
 */
public class IfaceConfigProtocolKey implements Serializable {
    private String protocolId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="PROTOCOL_ID", nullable=false, length=32)
    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }
}