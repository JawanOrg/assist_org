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
 * <p>该实体对应数据库的表名为：t_iface_daemon_attachment。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_DAEMON_ATTACHMENT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceDaemonAttachmentKey
 * @see：com.regaltec.blocimp.domain.IfaceDaemonAttachment
 * @see：com.regaltec.blocimp.domain.IfaceDaemonAttachmentExample
 * @see：com.regaltec.blocimp.dao.IfaceDaemonAttachmentDAO
 * @see：com.regaltec.blocimp.dao.IfaceDaemonAttachmentDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-11 16:56:10 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_daemon_attachment")
public class IfaceDaemonAttachment extends IfaceDaemonAttachmentKey implements Serializable {
    private String hostId;

    private String hostLocation;

    private String siteId;

    private String siteLocation;

    private Integer runCount;

    private String available;

    private Date createOn;

    private Date updateOn;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="HOST_ID", nullable=true, length=100)
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    @javax.persistence.Column(name="HOST_LOCATION", nullable=true, length=200)
    public String getHostLocation() {
        return hostLocation;
    }

    public void setHostLocation(String hostLocation) {
        this.hostLocation = hostLocation;
    }

    @javax.persistence.Column(name="SITE_ID", nullable=true, length=100)
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @javax.persistence.Column(name="SITE_LOCATION", nullable=true, length=200)
    public String getSiteLocation() {
        return siteLocation;
    }

    public void setSiteLocation(String siteLocation) {
        this.siteLocation = siteLocation;
    }

    @javax.persistence.Column(name="RUN_COUNT", nullable=true)
    public Integer getRunCount() {
        return runCount;
    }

    public void setRunCount(Integer runCount) {
        this.runCount = runCount;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=true, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=false)
    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    @javax.persistence.Column(name="UPDATE_ON", nullable=false)
    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }
}