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
 * <p>该实体对应数据库的表名为：t_sys_unit。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_UNIT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysUnitKey
 * @see：com.regaltec.blocimp.domain.SysUnit
 * @see：com.regaltec.blocimp.domain.SysUnitExample
 * @see：com.regaltec.blocimp.dao.SysUnitDAO
 * @see：com.regaltec.blocimp.dao.SysUnitDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_unit")
public class SysUnit extends SysUnitKey implements Serializable {
    private String unitType;

    private String unitName;

    private String unitDes;

    private String parentUnitid;

    private String phone;

    private String isValid;

    private Integer sortOrder;

    private String remark;
    
    private String childCount;
    
    private String parentName;

    private String isValidName;
    
    private String unitTypeName;
    
    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Unit_type", nullable=true, length=1)
    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @javax.persistence.Column(name="Unit_Name", nullable=true, length=100)
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @javax.persistence.Column(name="Unit_Des", nullable=true, length=100)
    public String getUnitDes() {
        return unitDes;
    }

    public void setUnitDes(String unitDes) {
        this.unitDes = unitDes;
    }

    @javax.persistence.Column(name="Parent_UnitId", nullable=true, length=32)
    public String getParentUnitid() {
        return parentUnitid;
    }

    public void setParentUnitid(String parentUnitid) {
        this.parentUnitid = parentUnitid;
    }

    @javax.persistence.Column(name="Phone", nullable=true, length=16)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @javax.persistence.Column(name="Is_Valid", nullable=true, length=1)
    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @javax.persistence.Column(name="Sort_Order", nullable=true)
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @javax.persistence.Column(name="Remark", nullable=true, length=250)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public String getChildCount() {
		return childCount;
	}

	public void setChildCount(String childCount) {
		this.childCount = childCount;
	}
	
	public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

	public String getIsValidName() {
		return isValidName;
	}

	public void setIsValidName(String isValidName) {
		this.isValidName = isValidName;
	}

	public String getUnitTypeName() {
		return unitTypeName;
	}

	public void setUnitTypeName(String unitTypeName) {
		this.unitTypeName = unitTypeName;
	}
}