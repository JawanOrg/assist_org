package com.free.assist.web.iface;

import com.free.assist.web.BaseForm;

public class IfaceLoggerFaultActionForm extends BaseForm {
	
	private String applicationName;
	
	private String faultCause;
	
	private String repairUser;
	
	private String repairDate;
	
	private String repairId;
	
	private String faultDescription;
	
	private String repositoryId;

	public String getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}

	public String getFaultDescription() {
		return faultDescription;
	}

	public void setFaultDescription(String faultDescription) {
		this.faultDescription = faultDescription;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getFaultCause() {
		return faultCause;
	}

	public void setFaultCause(String faultCause) {
		this.faultCause = faultCause;
	}

	public String getRepairUser() {
		return repairUser;
	}

	public void setRepairUser(String repairUser) {
		this.repairUser = repairUser;
	}

	public String getRepairDate() {
		return repairDate;
	}

	public void setRepairDate(String repairDate) {
		this.repairDate = repairDate;
	}

	public String getRepairId() {
		return repairId;
	}

	public void setRepairId(String repairId) {
		this.repairId = repairId;
	}
	

}
