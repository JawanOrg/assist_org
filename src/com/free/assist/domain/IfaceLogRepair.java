/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_iface_log_repair。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPAIR_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairKey
 * @see：com.regaltec.blocimp.domain.IfaceLogRepair
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairWithBLOBs
 * @see：com.regaltec.blocimp.domain.IfaceLogRepairExample
 * @see：com.regaltec.blocimp.dao.IfaceLogRepairDAO
 * @see：com.regaltec.blocimp.dao.IfaceLogRepairDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class IfaceLogRepair extends IfaceLogRepairKey implements Serializable {
    private String repositoryId;

    private String faultCause;

    private String repairUser;

    private Date repairDate;

    private Date commitDate;

    private String commitUser;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="REPOSITORY_ID", nullable=false, length=45)
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    @javax.persistence.Column(name="FAULT_CAUSE", nullable=false, length=45)
    public String getFaultCause() {
        return faultCause;
    }

    public void setFaultCause(String faultCause) {
        this.faultCause = faultCause;
    }

    @javax.persistence.Column(name="REPAIR_BY", nullable=false, length=200)
    public String getRepairUser() {
        return repairUser;
    }

    public void setRepairUser(String repairUser) {
        this.repairUser = repairUser;
    }

    @javax.persistence.Column(name="REPAIR_ON", nullable=false)
    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    @javax.persistence.Column(name="COMMIT_ON", nullable=false)
    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    @javax.persistence.Column(name="COMMIT_BY", nullable=false, length=32)
    public String getCommitUser() {
        return commitUser;
    }

    public void setCommitUser(String commitUser) {
        this.commitUser = commitUser;
    }
}