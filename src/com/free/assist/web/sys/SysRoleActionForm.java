
package com.free.assist.web.sys;

import com.free.assist.web.BaseForm;


public class SysRoleActionForm extends BaseForm{
	
    private String roleid;
	
    private String rolename;

    private String isValid;

    private String sortOrder;
    
    private String roledesc;
    
    private String postCheckIds;
    
    private String userCheckIds;

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getRoledesc() {
		return roledesc;
	}

	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}

	public String getPostCheckIds() {
		return postCheckIds;
	}

	public void setPostCheckIds(String postCheckIds) {
		this.postCheckIds = postCheckIds;
	}

	public String getUserCheckIds() {
		return userCheckIds;
	}

	public void setUserCheckIds(String userCheckIds) {
		this.userCheckIds = userCheckIds;
	}
}