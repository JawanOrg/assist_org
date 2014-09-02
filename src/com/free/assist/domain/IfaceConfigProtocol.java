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
 * <p>该实体对应数据库的表名为：t_iface_conf_protocol。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_PROTOCOL_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigProtocolKey
 * @see：com.regaltec.blocimp.domain.IfaceConfigProtocol
 * @see：com.regaltec.blocimp.domain.IfaceConfigProtocolExample
 * @see：com.regaltec.blocimp.dao.IfaceConfigProtocolDAO
 * @see：com.regaltec.blocimp.dao.IfaceConfigProtocolDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-04 22:08:06 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_conf_protocol")
public class IfaceConfigProtocol extends IfaceConfigProtocolKey implements Serializable {
	
	public static String PROTOCOL_NAME_WS = "ws";
	
	public static String PROTOCOL_NAME_DB = "db";
	
	public static String PROTOCOL_NAME_FTP = "ftp";
	
	public static String PROTOCOL_NAME_JMS = "jms";
	
	public static String PROTOCOL_NAME_NIO = "nio";
	
    private String protocolId;

    private String applicationId;

    private String applicationSn;

    private String applicationName;

    private String serveType;

    private String userName;

    private String phoneNumber;

    private String emailAddress;

    private String interfaceName;

    private String protocolName;

    private String remoteHost;

    private Integer remotePort;

    private String authAccount;

    private String authPassword;

    private String providerName;

    private String jndiName;

    private String destination;

    private String wsdlAddr;

    private String serviceName;

    private String portName;

    private String nameSpace;

    private String available;

    private Date createDate;

    private Date updateDate;

    private String updateUser;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="PROTOCOL_ID", nullable=false, length=32)
    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    @javax.persistence.Column(name="APPLICATION_ID", nullable=false, length=32)
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @javax.persistence.Column(name="APPLICATION_SN", nullable=false, length=200)
    public String getApplicationSn() {
        return applicationSn;
    }

    public void setApplicationSn(String applicationSn) {
        this.applicationSn = applicationSn;
    }

    @javax.persistence.Column(name="APPLICATION_NAME", nullable=false, length=200)
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @javax.persistence.Column(name="SERVE_TYPE", nullable=false, length=50)
    public String getServeType() {
        return serveType;
    }

    public void setServeType(String serveType) {
        this.serveType = serveType;
    }

    @javax.persistence.Column(name="USER_NAME", nullable=true, length=200)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @javax.persistence.Column(name="PHONE_NUMBER", nullable=true, length=200)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @javax.persistence.Column(name="EMAIL_ADDRESS", nullable=true, length=200)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @javax.persistence.Column(name="INTERFACE_NAME", nullable=true, length=100)
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    @javax.persistence.Column(name="PROTOCOL_NAME", nullable=false, length=4)
    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    @javax.persistence.Column(name="REMOTE_HOST", nullable=true, length=200)
    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    @javax.persistence.Column(name="REMOTE_PORT", nullable=true)
    public Integer getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(Integer remotePort) {
        this.remotePort = remotePort;
    }

    @javax.persistence.Column(name="AUTH_ACCOUNT", nullable=true, length=200)
    public String getAuthAccount() {
        return authAccount;
    }

    public void setAuthAccount(String authAccount) {
        this.authAccount = authAccount;
    }

    @javax.persistence.Column(name="AUTH_PASSWORD", nullable=true, length=200)
    public String getAuthPassword() {
        return authPassword;
    }

    public void setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
    }

    @javax.persistence.Column(name="PROVIDER_NAME", nullable=true, length=200)
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @javax.persistence.Column(name="JNDI_NAME", nullable=true, length=200)
    public String getJndiName() {
        return jndiName;
    }

    public void setJndiName(String jndiName) {
        this.jndiName = jndiName;
    }

    @javax.persistence.Column(name="DESTINATION", nullable=true, length=200)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @javax.persistence.Column(name="WSDL_ADDR", nullable=true, length=200)
    public String getWsdlAddr() {
        return wsdlAddr;
    }

    public void setWsdlAddr(String wsdlAddr) {
        this.wsdlAddr = wsdlAddr;
    }

    @javax.persistence.Column(name="SERVICE_NAME", nullable=true, length=200)
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @javax.persistence.Column(name="PORT_NAME", nullable=true, length=200)
    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    @javax.persistence.Column(name="NAME_SPACE", nullable=true, length=255)
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=true, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Column(name="UPDATE_ON", nullable=false)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @javax.persistence.Column(name="UPDATE_BY", nullable=true, length=32)
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}