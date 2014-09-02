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
 * <p>该实体对应数据库的表名为：t_supt_check_out。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_CHECK_OUT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptCheckOutKey
 * @see：com.regaltec.blocimp.domain.SuptCheckOut
 * @see：com.regaltec.blocimp.domain.SuptCheckOutExample
 * @see：com.regaltec.blocimp.dao.SuptCheckOutDAO
 * @see：com.regaltec.blocimp.dao.SuptCheckOutDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-11 13:55:16 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_check_out")
public class SuptCheckOut extends SuptCheckOutKey implements Serializable {
    private String cimpFaceId;

    private String outNode;

    private String outIschidNode;

    private String outParentNode;

    private String outChidnodeOver;

    private String inNode;

    private String mappPatt;

    private String mappForData;

    private String mappForFormat;

    private String mappAftData;

    private String mappAftFormat;

    private Float orderId;

    private String joinName;

    private String joinEnable;

    private String depenNode;

    private String depenKey;

    private String isSimpsys;

    private String declareSn;

    private String isDoubuxml;

    private String doubuNum;

    private String doubuPar;

    private String doubuChi;

    private String mappingSn;

    private String appendChars;

    private String appendNodes;

    private String ignoreAbsent;

    private String serverId;

    private String pathIndicator;

    private String attachHome;

    private String fileNameNode;

    private String available;

    private String isAnnotate;

    private String successValue;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="cimp_face_id", nullable=true, length=32)
    public String getCimpFaceId() {
        return cimpFaceId;
    }

    public void setCimpFaceId(String cimpFaceId) {
        this.cimpFaceId = cimpFaceId;
    }

    @javax.persistence.Column(name="out_node", nullable=true, length=100)
    public String getOutNode() {
        return outNode;
    }

    public void setOutNode(String outNode) {
        this.outNode = outNode;
    }

    @javax.persistence.Column(name="out_ischid_node", nullable=true, length=1)
    public String getOutIschidNode() {
        return outIschidNode;
    }

    public void setOutIschidNode(String outIschidNode) {
        this.outIschidNode = outIschidNode;
    }

    @javax.persistence.Column(name="out_parent_node", nullable=true, length=100)
    public String getOutParentNode() {
        return outParentNode;
    }

    public void setOutParentNode(String outParentNode) {
        this.outParentNode = outParentNode;
    }

    @javax.persistence.Column(name="out_chidnode_over", nullable=true, length=1)
    public String getOutChidnodeOver() {
        return outChidnodeOver;
    }

    public void setOutChidnodeOver(String outChidnodeOver) {
        this.outChidnodeOver = outChidnodeOver;
    }

    @javax.persistence.Column(name="in_node", nullable=true)
    public String getInNode() {
        return inNode;
    }

    public void setInNode(String inNode) {
        this.inNode = inNode;
    }

    @javax.persistence.Column(name="mapp_patt", nullable=true, length=100)
    public String getMappPatt() {
        return mappPatt;
    }

    public void setMappPatt(String mappPatt) {
        this.mappPatt = mappPatt;
    }

    @javax.persistence.Column(name="mapp_for_data", nullable=true, length=100)
    public String getMappForData() {
        return mappForData;
    }

    public void setMappForData(String mappForData) {
        this.mappForData = mappForData;
    }

    @javax.persistence.Column(name="mapp_for_format", nullable=true, length=100)
    public String getMappForFormat() {
        return mappForFormat;
    }

    public void setMappForFormat(String mappForFormat) {
        this.mappForFormat = mappForFormat;
    }

    @javax.persistence.Column(name="mapp_aft_data", nullable=true, length=100)
    public String getMappAftData() {
        return mappAftData;
    }

    public void setMappAftData(String mappAftData) {
        this.mappAftData = mappAftData;
    }

    @javax.persistence.Column(name="mapp_aft_format", nullable=true, length=100)
    public String getMappAftFormat() {
        return mappAftFormat;
    }

    public void setMappAftFormat(String mappAftFormat) {
        this.mappAftFormat = mappAftFormat;
    }

    @javax.persistence.Column(name="order_id", nullable=true)
    public Float getOrderId() {
        return orderId;
    }

    public void setOrderId(Float orderId) {
        this.orderId = orderId;
    }

    @javax.persistence.Column(name="join_name", nullable=true, length=100)
    public String getJoinName() {
        return joinName;
    }

    public void setJoinName(String joinName) {
        this.joinName = joinName;
    }

    @javax.persistence.Column(name="JOIN_ENABLE", nullable=true, length=1)
    public String getJoinEnable() {
        return joinEnable;
    }

    public void setJoinEnable(String joinEnable) {
        this.joinEnable = joinEnable;
    }

    @javax.persistence.Column(name="depen_node", nullable=true, length=100)
    public String getDepenNode() {
        return depenNode;
    }

    public void setDepenNode(String depenNode) {
        this.depenNode = depenNode;
    }

    @javax.persistence.Column(name="depen_key", nullable=true, length=100)
    public String getDepenKey() {
        return depenKey;
    }

    public void setDepenKey(String depenKey) {
        this.depenKey = depenKey;
    }

    @javax.persistence.Column(name="is_simpsys", nullable=true, length=4)
    public String getIsSimpsys() {
        return isSimpsys;
    }

    public void setIsSimpsys(String isSimpsys) {
        this.isSimpsys = isSimpsys;
    }

    @javax.persistence.Column(name="declare_sn", nullable=true, length=100)
    public String getDeclareSn() {
        return declareSn;
    }

    public void setDeclareSn(String declareSn) {
        this.declareSn = declareSn;
    }

    @javax.persistence.Column(name="is_doubuxml", nullable=true, length=1)
    public String getIsDoubuxml() {
        return isDoubuxml;
    }

    public void setIsDoubuxml(String isDoubuxml) {
        this.isDoubuxml = isDoubuxml;
    }

    @javax.persistence.Column(name="doubu_num", nullable=true, length=100)
    public String getDoubuNum() {
        return doubuNum;
    }

    public void setDoubuNum(String doubuNum) {
        this.doubuNum = doubuNum;
    }

    @javax.persistence.Column(name="doubu_par", nullable=true, length=100)
    public String getDoubuPar() {
        return doubuPar;
    }

    public void setDoubuPar(String doubuPar) {
        this.doubuPar = doubuPar;
    }

    @javax.persistence.Column(name="doubu_chi", nullable=true, length=100)
    public String getDoubuChi() {
        return doubuChi;
    }

    public void setDoubuChi(String doubuChi) {
        this.doubuChi = doubuChi;
    }

    @javax.persistence.Column(name="mapping_sn", nullable=true, length=100)
    public String getMappingSn() {
        return mappingSn;
    }

    public void setMappingSn(String mappingSn) {
        this.mappingSn = mappingSn;
    }

    @javax.persistence.Column(name="APPEND_CHARS", nullable=true, length=45)
    public String getAppendChars() {
        return appendChars;
    }

    public void setAppendChars(String appendChars) {
        this.appendChars = appendChars;
    }

    @javax.persistence.Column(name="APPEND_NODES", nullable=true)
    public String getAppendNodes() {
        return appendNodes;
    }

    public void setAppendNodes(String appendNodes) {
        this.appendNodes = appendNodes;
    }

    @javax.persistence.Column(name="IGNORE_ABSENT", nullable=true, length=1)
    public String getIgnoreAbsent() {
        return ignoreAbsent;
    }

    public void setIgnoreAbsent(String ignoreAbsent) {
        this.ignoreAbsent = ignoreAbsent;
    }

    @javax.persistence.Column(name="SERVER_ID", nullable=true, length=32)
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @javax.persistence.Column(name="PATH_INDICATOR", nullable=true, length=1)
    public String getPathIndicator() {
        return pathIndicator;
    }

    public void setPathIndicator(String pathIndicator) {
        this.pathIndicator = pathIndicator;
    }

    @javax.persistence.Column(name="ATTACH_HOME", nullable=true, length=100)
    public String getAttachHome() {
        return attachHome;
    }

    public void setAttachHome(String attachHome) {
        this.attachHome = attachHome;
    }

    @javax.persistence.Column(name="FILE_NAME_NODE", nullable=true, length=100)
    public String getFileNameNode() {
        return fileNameNode;
    }

    public void setFileNameNode(String fileNameNode) {
        this.fileNameNode = fileNameNode;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=true, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @javax.persistence.Column(name="IS_ANNOTATE", nullable=true, length=1)
    public String getIsAnnotate() {
        return isAnnotate;
    }

    public void setIsAnnotate(String isAnnotate) {
        this.isAnnotate = isAnnotate;
    }

    @javax.persistence.Column(name="SUCCESS_VALUE", nullable=true, length=45)
    public String getSuccessValue() {
        return successValue;
    }

    public void setSuccessValue(String successValue) {
        this.successValue = successValue;
    }
}