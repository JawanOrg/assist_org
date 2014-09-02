package com.free.assist.web;

import org.apache.struts.action.ActionForm;

public abstract class BaseForm extends ActionForm {

	private static final long serialVersionUID = 20091009L;

	/**
	 * 当前页码(分页时使用)
	 */
	protected int skipResults;

	/**
	 * 页面显示的记录数(分页时使用)
	 */
	protected int maxResults;

	public BaseForm() {
		skipResults = 0;
		 maxResults = 15;
	}

	public int getPageNumber() {
		if (skipResults == 0) {
			return 1;
		}
		return (int)Math.ceil((float)skipResults/(float)maxResults);
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		if (maxResults <= 0) {
			throw new IllegalStateException("每页数量不能小于等于零！");
		}
		this.maxResults = maxResults;
	}

	public void setSkipResults(int skipResults) {
		if (skipResults < 0) {
			throw new IllegalStateException("起始数不能为负数！");
		}
		this.skipResults = skipResults;
	}

	public int getSkipResults() {
		return skipResults;
	}
}
