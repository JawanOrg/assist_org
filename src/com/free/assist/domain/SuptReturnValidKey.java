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
 * <p>该实体对应数据库的表名为：t_supt_return_valid。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_RETURN_VALID_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptReturnValidKey
 * @see：com.regaltec.blocimp.domain.SuptReturnValid
 * @see：com.regaltec.blocimp.domain.SuptReturnValidExample
 * @see：com.regaltec.blocimp.dao.SuptReturnValidDAO
 * @see：com.regaltec.blocimp.dao.SuptReturnValidDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-05 16:24:06 
 */
public class SuptReturnValidKey implements Serializable {
    private String returnValidId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="return_valid_id", nullable=false, length=32)
    public String getReturnValidId() {
        return returnValidId;
    }

    public void setReturnValidId(String returnValidId) {
        this.returnValidId = returnValidId;
    }
}