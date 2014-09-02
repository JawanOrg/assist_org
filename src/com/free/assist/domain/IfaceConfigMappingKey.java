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
 * <p>该实体对应数据库的表名为：t_iface_conf_mapping。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_MAPPING_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigMappingKey
 * @see：com.regaltec.blocimp.domain.IfaceConfigMapping
 * @see：com.regaltec.blocimp.domain.IfaceConfigMappingExample
 * @see：com.regaltec.blocimp.dao.IfaceConfigMappingDAO
 * @see：com.regaltec.blocimp.dao.IfaceConfigMappingDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-28 22:46:47 
 */
public class IfaceConfigMappingKey implements Serializable {
    private String mappingId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="MAPPING_ID", nullable=false, length=32)
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }
}