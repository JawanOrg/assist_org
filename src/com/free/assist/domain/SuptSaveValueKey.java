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
 * <p>该实体对应数据库的表名为：t_supt_save_value。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_SAVE_VALUE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptSaveValueKey
 * @see：com.regaltec.blocimp.domain.SuptSaveValue
 * @see：com.regaltec.blocimp.domain.SuptSaveValueExample
 * @see：com.regaltec.blocimp.dao.SuptSaveValueDAO
 * @see：com.regaltec.blocimp.dao.SuptSaveValueDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-05 15:32:01 
 */
public class SuptSaveValueKey implements Serializable {
    private String savaId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="sava_id", nullable=false, length=32)
    public String getSavaId() {
        return savaId;
    }

    public void setSavaId(String savaId) {
        this.savaId = savaId;
    }
}