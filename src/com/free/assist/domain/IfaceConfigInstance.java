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
import java.util.List;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：v_iface_conf_instance。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.V_IFACE_CONF_INSTANCE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceConfigInstance
 * @see：com.regaltec.blocimp.domain.IfaceConfigInstanceExample
 * @see：com.regaltec.blocimp.dao.IfaceConfigInstanceDAO
 * @see：com.regaltec.blocimp.dao.IfaceConfigInstanceDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-30 15:20:08 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_conf_instance")
public class IfaceConfigInstance extends IfaceConfigInstanceKey implements Serializable {
    private String applicationId;

    private String applicationSn;

    private String applicationName;

    private String declareId;

    private String declareSn;

    private String declareName;

    private String instanceId;

    private String instanceSn;

    private String instanceName;

    private Integer priorityId;

    private String parentId;

    private String parentSn;

    private String cascadeId;

    private String cascadeSn;

    private String structSn;

    private String available;

    private Date updateDate;

    private String updateUser;
    
    private String mappingId;
    
    private String mappingSn;
    
    private String mappingName;

    private List<IfaceConfigInstance> childrenList;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="APPLICATION_ID", nullable=false, length=32)
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @javax.persistence.Transient
    public String getApplicationSn() {
        return applicationSn;
    }

    public void setApplicationSn(String applicationSn) {
        this.applicationSn = applicationSn;
    }

    @javax.persistence.Transient
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @javax.persistence.Column(name="DECLARE_ID", nullable=false, length=32)
    public String getDeclareId() {
        return declareId;
    }

    public void setDeclareId(String declareId) {
        this.declareId = declareId;
    }

    @javax.persistence.Transient
    public String getDeclareSn() {
        return declareSn;
    }

    public void setDeclareSn(String declareSn) {
        this.declareSn = declareSn;
    }

    @javax.persistence.Transient
    public String getDeclareName() {
        return declareName;
    }

    public void setDeclareName(String declareName) {
        this.declareName = declareName;
    }

    @javax.persistence.Column(name="INSTANCE_ID", nullable=false, length=32)
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @javax.persistence.Column(name="INSTANCE_SN", nullable=false, length=45)
    public String getInstanceSn() {
        return instanceSn;
    }

    public void setInstanceSn(String instanceSn) {
        this.instanceSn = instanceSn;
    }

    @javax.persistence.Column(name="INSTANCE_NAME", nullable=false, length=200)
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @javax.persistence.Column(name="PRIORITY_ID", nullable=false)
    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    @javax.persistence.Column(name="PARENT_ID", nullable=false, length=32)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @javax.persistence.Transient
    public String getParentSn() {
        return parentSn;
    }

    public void setParentSn(String parentSn) {
        this.parentSn = parentSn;
    }

    @javax.persistence.Column(name="CASCADE_ID", nullable=false, length=2)
    public String getCascadeId() {
        return cascadeId;
    }

    public void setCascadeId(String cascadeId) {
        this.cascadeId = cascadeId;
    }

    @javax.persistence.Transient
    public String getCascadeSn() {
        return cascadeSn;
    }

    public void setCascadeSn(String cascadeSn) {
        this.cascadeSn = cascadeSn;
    }

    @javax.persistence.Column(name="STRUCT_SN", nullable=true, length=200)
    public String getStructSn() {
        return structSn;
    }

    public void setStructSn(String structSn) {
        this.structSn = structSn;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=false, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
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

    @javax.persistence.Transient
    public String getMappingId() {
		return mappingId;
	}

	public void setMappingId(String mappingId) {
		this.mappingId = mappingId;
	}

	@javax.persistence.Transient
    public String getMappingSn() {
		return mappingSn;
	}

	public void setMappingSn(String mappingSn) {
		this.mappingSn = mappingSn;
	}

	@javax.persistence.Transient
	public String getMappingName() {
		return mappingName;
	}

	public void setMappingName(String mappingName) {
		this.mappingName = mappingName;
	}

    @javax.persistence.Transient
	public List<IfaceConfigInstance> getChildren() {
		return childrenList;
	}

	public void setChildren(List<IfaceConfigInstance> childrenList) {
		this.childrenList = childrenList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IfaceConfigInstance [applicationName=");
		builder.append(applicationName);
		builder.append(", applicationSn=");
		builder.append(applicationSn);
		builder.append(", declareName=");
		builder.append(declareName);
		builder.append(", declareSn=");
		builder.append(declareSn);
		builder.append(", instanceName=");
		builder.append(instanceName);
		builder.append(", instanceSn=");
		builder.append(instanceSn);
		builder.append(", mappingName=");
		builder.append(mappingName);
		builder.append(", mappingSn=");
		builder.append(mappingSn);
		builder.append(", structSn=");
		builder.append(structSn);
		builder.append("]");
		return builder.toString();
	}
}