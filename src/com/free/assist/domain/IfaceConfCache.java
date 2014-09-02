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
 * <p>该实体对应数据库的表名为：t_iface_conf_cache。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_CACHE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfCacheKey
 * @see：com.regaltec.blocimp.domain.IfaceConfCache
 * @see：com.regaltec.blocimp.domain.IfaceConfCacheExample
 * @see：com.regaltec.blocimp.dao.IfaceConfCacheDAO
 * @see：com.regaltec.blocimp.dao.IfaceConfCacheDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-03 13:36:35 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_conf_cache")
public class IfaceConfCache extends IfaceConfCacheKey implements Serializable {
    private String responseCode;

    private String responseInfo;

    private String sysCode;

    private String sysCodename;

    private String itemId;

    private String itemName;

    private String parentItemId;

    private String changetype;

    private String serialNumber;

    private String isAvailable;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="RESPONSE_CODE", nullable=true, length=1)
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    @javax.persistence.Column(name="RESPONSE_INFO", nullable=true, length=500)
    public String getResponseInfo() {
        return responseInfo;
    }

    public void setResponseInfo(String responseInfo) {
        this.responseInfo = responseInfo;
    }

    @javax.persistence.Column(name="SYS_CODE", nullable=true, length=200)
    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    @javax.persistence.Column(name="SYS_CODENAME", nullable=true, length=200)
    public String getSysCodename() {
        return sysCodename;
    }

    public void setSysCodename(String sysCodename) {
        this.sysCodename = sysCodename;
    }

    @javax.persistence.Column(name="ITEM_ID", nullable=true, length=45)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @javax.persistence.Column(name="ITEM_NAME", nullable=true, length=200)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @javax.persistence.Column(name="PARENT_ITEM_ID", nullable=true, length=32)
    public String getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId;
    }

    @javax.persistence.Column(name="CHANGETYPE", nullable=true, length=32)
    public String getChangetype() {
        return changetype;
    }

    public void setChangetype(String changetype) {
        this.changetype = changetype;
    }

    @javax.persistence.Column(name="SERIAL_NUMBER", nullable=true, length=32)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=true, length=1)
    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }
}