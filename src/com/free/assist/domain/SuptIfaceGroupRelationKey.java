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
 * <p>该实体对应数据库的表名为：t_supt_iface_group_relation。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_IFACE_GROUP_RELATION_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptIfaceGroupRelationKey
 * @see：com.regaltec.blocimp.domain.SuptIfaceGroupRelation
 * @see：com.regaltec.blocimp.domain.SuptIfaceGroupRelationExample
 * @see：com.regaltec.blocimp.dao.SuptIfaceGroupRelationDAO
 * @see：com.regaltec.blocimp.dao.SuptIfaceGroupRelationDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-09 09:55:02 
 */
public class SuptIfaceGroupRelationKey implements Serializable {
    private String ifaceGroupId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="iface_Group_Id", nullable=false, length=64)
    public String getIfaceGroupId() {
        return ifaceGroupId;
    }

    public void setIfaceGroupId(String ifaceGroupId) {
        this.ifaceGroupId = ifaceGroupId;
    }
}