package com.free.assist.web.sys;

import com.free.assist.web.BaseForm;

public class SysParameterConfActionForm extends BaseForm{

	private String parId;
	
	private String parName;
	
    private String parValue;

    private String parDesc;

    private String isValid;

    public String getParName() {
        return parName;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }
    
    public String getParValue() {
        return parValue;
    }

    public void setParValue(String parValue) {
        this.parValue = parValue;
    }

    public String getParDesc() {
        return parDesc;
    }

    public void setParDesc(String parDesc) {
        this.parDesc = parDesc;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

	public String getParId() {
		return parId;
	}

	public void setParId(String parId) {
		this.parId = parId;
	}
}
