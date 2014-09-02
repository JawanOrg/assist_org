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
 * <p>该实体对应数据库的表名为：t_supt_query_item_value。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_QUERY_ITEM_VALUE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptQueryItemValueKey
 * @see：com.regaltec.blocimp.domain.SuptQueryItemValue
 * @see：com.regaltec.blocimp.domain.SuptQueryItemValueExample
 * @see：com.regaltec.blocimp.dao.SuptQueryItemValueDAO
 * @see：com.regaltec.blocimp.dao.SuptQueryItemValueDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2010-03-17 14:50:27 
 */
public class SuptQueryItemValueKey implements Serializable {
    private String itemCode;

    private String moduleCode;

    private String userId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="ITEM_CODE", nullable=false, length=255)
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @javax.persistence.Column(name="MODULE_CODE", nullable=false, length=100)
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    @javax.persistence.Column(name="USER_ID", nullable=false, length=100)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}