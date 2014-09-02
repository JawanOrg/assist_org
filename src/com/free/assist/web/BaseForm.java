package com.free.assist.web;

import org.apache.struts.action.ActionForm;

public abstract class BaseForm extends ActionForm {

	private static final long serialVersionUID = 20091009L;

	/**
	 * ��ǰҳ��(��ҳʱʹ��)
	 */
	protected int skipResults;

	/**
	 * ҳ����ʾ�ļ�¼��(��ҳʱʹ��)
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
			throw new IllegalStateException("ÿҳ��������С�ڵ����㣡");
		}
		this.maxResults = maxResults;
	}

	public void setSkipResults(int skipResults) {
		if (skipResults < 0) {
			throw new IllegalStateException("��ʼ������Ϊ������");
		}
		this.skipResults = skipResults;
	}

	public int getSkipResults() {
		return skipResults;
	}
}
