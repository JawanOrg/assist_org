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
 * <p>该实体对应数据库的表名为：t_iface_log_repository。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryKey
 * @see：com.regaltec.blocimp.domain.IfaceLogRepository
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryWithBLOBs
 * @see：com.regaltec.blocimp.domain.IfaceLogRepositoryExample
 * @see：com.regaltec.blocimp.dao.IfaceLogRepositoryDAO
 * @see：com.regaltec.blocimp.dao.IfaceLogRepositoryDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-29 09:34:48 
 */
public class IfaceLogRepositoryKey implements Serializable {
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