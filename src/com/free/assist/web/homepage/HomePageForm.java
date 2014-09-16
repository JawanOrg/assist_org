package com.free.assist.web.homepage;

import com.free.assist.web.BaseForm;

public class HomePageForm extends BaseForm {
	private static final long serialVersionUID = 5736557871593793428L;

	private String billSn;

	private String theTitle;

	public String getBillSn() {
		return billSn;
	}

	public void setBillSn(String billSn) {
		this.billSn = billSn;
	}

	public String getTheTitle() {
		return theTitle;
	}

	public void setTheTitle(String theTitle) {
		this.theTitle = theTitle;
	}
}
