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
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-04 08:57:49 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_return")
public class SuptReturn extends SuptReturnKey implements Serializable {
    private String methodId;

    private String workitemId;

    private String oldworkId;

    private String userid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="method_id", nullable=true, length=32)
    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    @javax.persistence.Column(name="workItem_id", nullable=true, length=32)
    public String getWorkitemId() {
        return workitemId;
    }

    public void setWorkitemId(String workitemId) {
        this.workitemId = workitemId;
    }

    @javax.persistence.Column(name="oldwork_id", nullable=true, length=32)
    public String getOldworkId() {
        return oldworkId;
    }

    public void setOldworkId(String oldworkId) {
        this.oldworkId = oldworkId;
    }

    @javax.persistence.Column(name="userID", nullable=true, length=32)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}