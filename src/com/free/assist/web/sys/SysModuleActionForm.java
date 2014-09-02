package com.free.assist.web.sys;

import java.util.List;

import com.free.assist.domain.SysModule;
import com.free.assist.web.BaseForm;

public class SysModuleActionForm extends BaseForm{

    private String moduleId;
    
    private String moduleName;

    private String moduleDesc;

    private String parentModuleid;

    private String isValid;

    private String isLeaf;

    private Integer sortOrder;

    private String moduleUrl;

    List<SysModule>    SysModuleList;

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }
    
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

    public String getParentModuleid() {
        return parentModuleid;
    }

    public void setParentModuleid(String parentModuleid) {
        this.parentModuleid = parentModuleid;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

	public List<SysModule> getSysModuleList() {
		return SysModuleList;
	}

	public void setSysModuleList(List<SysModule> sysModuleList) {
		SysModuleList = sysModuleList;
	}


}