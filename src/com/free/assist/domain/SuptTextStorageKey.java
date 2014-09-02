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
 * <p>该实体对应数据库的表名为：t_supt_text_storage。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_TEXT_STORAGE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptTextStorageKey
 * @see：com.regaltec.blocimp.domain.SuptTextStorage
 * @see：com.regaltec.blocimp.domain.SuptTextStorageExample
 * @see：com.regaltec.blocimp.dao.SuptTextStorageDAO
 * @see：com.regaltec.blocimp.dao.SuptTextStorageDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-29 17:41:14 
 */
public class SuptTextStorageKey implements Serializable {
    private String storageId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="STORAGE_ID", nullable=false, length=32)
    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }
}