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
 * <p>该实体对应数据库的表名为：t_sys_service_config。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_SERVICE_CONFIG_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysServiceConfigKey
 * @see：com.regaltec.blocimp.domain.SysServiceConfig
 * @see：com.regaltec.blocimp.domain.SysServiceConfigExample
 * @see：com.regaltec.blocimp.dao.SysServiceConfigDAO
 * @see：com.regaltec.blocimp.dao.SysServiceConfigDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-15 14:05:04 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_service_config")
public class SysServiceConfig extends SysServiceConfigKey implements Serializable {
    private String serviceName;

    private String serviceType;

    private String serviceClass;

    private String serviceDesc;

    private String serviceHostname;

    private String wsUrl;

    private String runMode;

    private Integer runInterval;

    private String runParameter;

    private String startDefault;

    private String isDeleted;

    private String startRunonce;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Service_Name", nullable=false, length=64)
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @javax.persistence.Column(name="Service_Type", nullable=true, length=1)
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @javax.persistence.Column(name="Service_Class", nullable=true, length=255)
    public String getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    @javax.persistence.Column(name="Service_Desc", nullable=true, length=255)
    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    @javax.persistence.Column(name="Service_HostName", nullable=true, length=128)
    public String getServiceHostname() {
        return serviceHostname;
    }

    public void setServiceHostname(String serviceHostname) {
        this.serviceHostname = serviceHostname;
    }

    @javax.persistence.Column(name="WS_URL", nullable=true, length=255)
    public String getWsUrl() {
        return wsUrl;
    }

    public void setWsUrl(String wsUrl) {
        this.wsUrl = wsUrl;
    }

    @javax.persistence.Column(name="Run_Mode", nullable=false, length=1)
    public String getRunMode() {
        return runMode;
    }

    public void setRunMode(String runMode) {
        this.runMode = runMode;
    }

    @javax.persistence.Column(name="Run_Interval", nullable=false)
    public Integer getRunInterval() {
        return runInterval;
    }

    public void setRunInterval(Integer runInterval) {
        this.runInterval = runInterval;
    }

    @javax.persistence.Column(name="Run_Parameter", nullable=true, length=255)
    public String getRunParameter() {
        return runParameter;
    }

    public void setRunParameter(String runParameter) {
        this.runParameter = runParameter;
    }

    @javax.persistence.Column(name="Start_Default", nullable=true, length=1)
    public String getStartDefault() {
        return startDefault;
    }

    public void setStartDefault(String startDefault) {
        this.startDefault = startDefault;
    }

    @javax.persistence.Column(name="Is_Deleted", nullable=true, length=1)
    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @javax.persistence.Column(name="Start_RunOnce", nullable=true, length=1)
    public String getStartRunonce() {
        return startRunonce;
    }

    public void setStartRunonce(String startRunonce) {
        this.startRunonce = startRunonce;
    }
}