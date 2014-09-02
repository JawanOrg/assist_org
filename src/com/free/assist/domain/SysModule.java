/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.List;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_sys_module。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_MODULE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysModuleKey
 * @see：com.regaltec.blocimp.domain.SysModule
 * @see：com.regaltec.blocimp.domain.SysModuleExample
 * @see：com.regaltec.blocimp.dao.SysModuleDAO
 * @see：com.regaltec.blocimp.dao.SysModuleDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_module")
public class SysModule extends SysModuleKey implements Serializable {
    private String moduleName;

    private String moduleDesc;

    private String parentModuleid;

    private String isValid;

    private String isLeaf;

    private Integer sortOrder;

    private String moduleUrl;
    
    private String  parentName;
    
    private String  isValidName;
    
    private String childCount;

    List<SysModule>    SysModuleList;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Module_Name", nullable=true, length=255)
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @javax.persistence.Column(name="Module_Desc", nullable=true, length=255)
    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

    @javax.persistence.Column(name="Parent_ModuleId", nullable=true, length=32)
    public String getParentModuleid() {
        return parentModuleid;
    }

    public void setParentModuleid(String parentModuleid) {
        this.parentModuleid = parentModuleid;
    }

    @javax.persistence.Column(name="Is_Valid", nullable=false, length=1)
    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @javax.persistence.Column(name="Is_Leaf", nullable=false, length=1)
    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    @javax.persistence.Column(name="Sort_Order", nullable=true)
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @javax.persistence.Column(name="Module_Url", nullable=true, length=255)
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

	public String getChildCount() {
		return childCount;
	}

	public void setChildCount(String childCount) {
		this.childCount = childCount;
	}


}