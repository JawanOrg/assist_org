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
 * <p>该实体对应数据库的表名为：t_supt_return。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_RETURN_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptReturnKey
 * @see：com.regaltec.blocimp.domain.SuptReturn
 * @see：com.regaltec.blocimp.domain.SuptReturnExample
 * @see：com.regaltec.blocimp.dao.SuptReturnDAO
 * @see：com.regaltec.blocimp.dao.SuptReturnDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-04 08:57:49 
 */
public class SuptReturnKey implements Serializable {
    private String returnId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="return_id", nullable=false, length=32)
    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
}