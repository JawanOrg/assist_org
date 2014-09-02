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
 * <p>该实体对应数据库的表名为：t_supt_face。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_FACE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptFaceKey
 * @see：com.regaltec.blocimp.domain.SuptFace
 * @see：com.regaltec.blocimp.domain.SuptFaceExample
 * @see：com.regaltec.blocimp.dao.SuptFaceDAO
 * @see：com.regaltec.blocimp.dao.SuptFaceDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-12 15:22:43 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_face")
public class SuptFace extends SuptFaceKey implements Serializable {
    private String applicationId;

    private String methodName;

    private String cimpName;

    private String errorTake;

    private String outXml;

    private String inXml;

    private String paramater;

    private String backLimite;

    private String isautoTake;

    private String returnAppid;

    private String isValid;

    private String applicationName;

    private String returnAppname;

    private String exetMethodname;

    private String isSend;

    private String xmlstr;

    private String xmlNode;

    private String isReturnid;

    private String protocolType;

    private String isReturnvalue;

    private String isjudgebillsystem;

    private String needdealaction;

    private String notneeddealaction;

    private String actionpath;

    private String returnCodePath;

    private String keyPaths;

    private String billOfSystems;

    private String indicantNode;

    private String successValue;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="application_id", nullable=true, length=32)
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @javax.persistence.Column(name="method_name", nullable=true, length=32)
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @javax.persistence.Column(name="cimp_name", nullable=true, length=32)
    public String getCimpName() {
        return cimpName;
    }

    public void setCimpName(String cimpName) {
        this.cimpName = cimpName;
    }

    @javax.persistence.Column(name="error_take", nullable=true, length=32)
    public String getErrorTake() {
        return errorTake;
    }

    public void setErrorTake(String errorTake) {
        this.errorTake = errorTake;
    }

    @javax.persistence.Column(name="out_xml", nullable=true, length=200)
    public String getOutXml() {
        return outXml;
    }

    public void setOutXml(String outXml) {
        this.outXml = outXml;
    }

    @javax.persistence.Column(name="in_xml", nullable=true, length=200)
    public String getInXml() {
        return inXml;
    }

    public void setInXml(String inXml) {
        this.inXml = inXml;
    }

    @javax.persistence.Column(name="paramater", nullable=true, length=32)
    public String getParamater() {
        return paramater;
    }

    public void setParamater(String paramater) {
        this.paramater = paramater;
    }

    @javax.persistence.Column(name="back_limite", nullable=true, length=32)
    public String getBackLimite() {
        return backLimite;
    }

    public void setBackLimite(String backLimite) {
        this.backLimite = backLimite;
    }

    @javax.persistence.Column(name="isauto_take", nullable=true, length=1)
    public String getIsautoTake() {
        return isautoTake;
    }

    public void setIsautoTake(String isautoTake) {
        this.isautoTake = isautoTake;
    }

    @javax.persistence.Column(name="return_appid", nullable=true, length=32)
    public String getReturnAppid() {
        return returnAppid;
    }

    public void setReturnAppid(String returnAppid) {
        this.returnAppid = returnAppid;
    }

    @javax.persistence.Column(name="is_valid", nullable=true, length=1)
    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @javax.persistence.Column(name="application_name", nullable=true, length=100)
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @javax.persistence.Column(name="return_appname", nullable=true, length=100)
    public String getReturnAppname() {
        return returnAppname;
    }

    public void setReturnAppname(String returnAppname) {
        this.returnAppname = returnAppname;
    }

    @javax.persistence.Column(name="exet_methodname", nullable=true, length=32)
    public String getExetMethodname() {
        return exetMethodname;
    }

    public void setExetMethodname(String exetMethodname) {
        this.exetMethodname = exetMethodname;
    }

    @javax.persistence.Column(name="is_send", nullable=true, length=1)
    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    @javax.persistence.Column(name="xmlstr", nullable=true)
    public String getXmlstr() {
        return xmlstr;
    }

    public void setXmlstr(String xmlstr) {
        this.xmlstr = xmlstr;
    }

    @javax.persistence.Column(name="xml_node", nullable=true, length=255)
    public String getXmlNode() {
        return xmlNode;
    }

    public void setXmlNode(String xmlNode) {
        this.xmlNode = xmlNode;
    }

    @javax.persistence.Column(name="is_returnId", nullable=true, length=1)
    public String getIsReturnid() {
        return isReturnid;
    }

    public void setIsReturnid(String isReturnid) {
        this.isReturnid = isReturnid;
    }

    @javax.persistence.Column(name="PROTOCOL_TYPE", nullable=true, length=32)
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    @javax.persistence.Column(name="is_returnValue", nullable=true, length=1)
    public String getIsReturnvalue() {
        return isReturnvalue;
    }

    public void setIsReturnvalue(String isReturnvalue) {
        this.isReturnvalue = isReturnvalue;
    }

    @javax.persistence.Column(name="isJudgeBillSystem", nullable=true, length=32)
    public String getIsjudgebillsystem() {
        return isjudgebillsystem;
    }

    public void setIsjudgebillsystem(String isjudgebillsystem) {
        this.isjudgebillsystem = isjudgebillsystem;
    }

    @javax.persistence.Column(name="needDealAction", nullable=true, length=200)
    public String getNeeddealaction() {
        return needdealaction;
    }

    public void setNeeddealaction(String needdealaction) {
        this.needdealaction = needdealaction;
    }

    @javax.persistence.Column(name="notNeedDealAction", nullable=true, length=200)
    public String getNotneeddealaction() {
        return notneeddealaction;
    }

    public void setNotneeddealaction(String notneeddealaction) {
        this.notneeddealaction = notneeddealaction;
    }

    @javax.persistence.Column(name="actionPath", nullable=true, length=200)
    public String getActionpath() {
        return actionpath;
    }

    public void setActionpath(String actionpath) {
        this.actionpath = actionpath;
    }

    @javax.persistence.Column(name="return_Code_Path", nullable=true, length=200)
    public String getReturnCodePath() {
        return returnCodePath;
    }

    public void setReturnCodePath(String returnCodePath) {
        this.returnCodePath = returnCodePath;
    }

    @javax.persistence.Column(name="key_Paths", nullable=true, length=200)
    public String getKeyPaths() {
        return keyPaths;
    }

    public void setKeyPaths(String keyPaths) {
        this.keyPaths = keyPaths;
    }

    @javax.persistence.Column(name="bill_Of_Systems", nullable=true, length=200)
    public String getBillOfSystems() {
        return billOfSystems;
    }

    public void setBillOfSystems(String billOfSystems) {
        this.billOfSystems = billOfSystems;
    }

    @javax.persistence.Column(name="INDICANT_NODE", nullable=true, length=200)
    public String getIndicantNode() {
        return indicantNode;
    }

    public void setIndicantNode(String indicantNode) {
        this.indicantNode = indicantNode;
    }

    @javax.persistence.Column(name="SUCCESS_VALUE", nullable=true, length=40)
    public String getSuccessValue() {
        return successValue;
    }

    public void setSuccessValue(String successValue) {
        this.successValue = successValue;
    }
}