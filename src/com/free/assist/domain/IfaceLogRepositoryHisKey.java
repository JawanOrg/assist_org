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
 * <p>该实体对应数据库的表名为：t_iface_log_repository_his。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_HIS_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryHisKey
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryHis
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryHisExample
 * @see：com.regaltec.blocimp.dao.IfaceLogRepositoryHisDAO
 * @see：com.regaltec.blocimp.dao.IfaceLogRepositoryHisDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2010-01-06 16:06:41 
 */
public class IfaceLogRepositoryHisKey implements Serializable {
    private String repositoryId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="REPOSITORY_ID", nullable=false, length=32)
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }
}