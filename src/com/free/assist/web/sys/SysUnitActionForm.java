package com.free.assist.web.sys;

import com.free.assist.web.BaseForm;

public class SysUnitActionForm extends BaseForm{
	
	private String unitId;
	 
	private String unitType;

    private String unitName;

    private String unitDes;

    private String parentUnitid;

    private String phone;

    private String isValid;

    private Integer sortOrder;

    private String remark;
    
    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitDes() {
        return unitDes;
    }

    public void setUnitDes(String unitDes) {
        this.unitDes = unitDes;
    }

    public String getParentUnitid() {
        return parentUnitid;
    }

    public void setParentUnitid(String parentUnitid) {
        this.parentUnitid = parentUnitid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }  
}
