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
 * <p>该实体对应数据库的表名为：t_iface_conf_declare。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_CONF_DECLARE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigDeclareKey
 * @see：com.regaltec.blocimp.domain.IfaceConfigDeclare
 * @see：com.regaltec.blocimp.domain.IfaceConfigDeclareExample
 * @see：com.regaltec.blocimp.dao.IfaceConfigDeclareDAO
 * @see：com.regaltec.blocimp.dao.IfaceConfigDeclareDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-30 14:35:16 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_conf_declare")
public class IfaceConfigDeclare extends IfaceConfigDeclareKey implements Serializable {

	public static String STRUCTURE_TYPE_LINEAR = "linear";
	
	public static String STRUCTURE_TYPE_HIERARCHICAL = "hierarchical";
	
    private String applicationId;

    private String declareSn;

    private String declareName;

    private String declareNote;

    private String structureType;

    private Integer priorityId;

    private String available;

    private String localeId;

    private String matrix;

    private String attributeBak;

    private String cascadeId;

    private String parentId;

    private String structSn;

    private Date updateDate;

    private String updateUser;
    
    private java.util.List<IfaceConfigDeclare> childrenList;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="APPLICATION_ID", nullable=false, length=32)
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @javax.persistence.Column(name="DECLARE_SN", nullable=false, length=200)
    public String getDeclareSn() {
        return declareSn;
    }

    public void setDeclareSn(String declareSn) {
        this.declareSn = declareSn;
    }

    @javax.persistence.Column(name="DECLARE_NAME", nullable=false, length=200)
    public String getDeclareName() {
        return declareName;
    }

    public void setDeclareName(String declareName) {
        this.declareName = declareName;
    }

    @javax.persistence.Column(name="DECLARE_NOTE", nullable=true, length=255)
    public String getDeclareNote() {
        return declareNote;
    }

    public void setDeclareNote(String declareNote) {
        this.declareNote = declareNote;
    }

    @javax.persistence.Column(name="STRUCTURE_TYPE", nullable=false, length=12)
    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    @javax.persistence.Column(name="PRIORITY_ID", nullable=false)
    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=false, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @javax.persistence.Column(name="LOCALE_ID", nullable=true, length=32)
    public String getLocaleId() {
        return localeId;
    }

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    @javax.persistence.Column(name="IS_MATRIX", nullable=false, length=1)
    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    @javax.persistence.Column(name="ATTRIBUTE_BAK", nullable=true, length=200)
    public String getAttributeBak() {
        return attributeBak;
    }

    public void setAttributeBak(String attributeBak) {
        this.attributeBak = attributeBak;
    }

    @javax.persistence.Column(name="CASCADE_ID", nullable=true, length=32)
    public String getCascadeId() {
        return cascadeId;
    }

    public void setCascadeId(String cascadeId) {
        this.cascadeId = cascadeId;
    }

    @javax.persistence.Column(name="PARENT_ID", nullable=true, length=32)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @javax.persistence.Column(name="STRUCT_SN", nullable=true, length=200)
    public String getStructSn() {
        return structSn;
    }

    public void setStructSn(String structSn) {
        this.structSn = structSn;
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
        
    public java.util.List<IfaceConfigDeclare> getChildren() {
		return childrenList;
	}

	public void setChildren(java.util.List<IfaceConfigDeclare> children) {
		this.childrenList = children;
	}
}