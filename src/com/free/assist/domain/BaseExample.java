/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;


/**
 * @author ����
 * @version 1
 * @date 2009-10-09 12:16:19
 */
public abstract class BaseExample {

	protected int skipResults;
	
	protected int maxResults;

	public BaseExample() {
		this.skipResults = -1;
		this.maxResults = -1;
	}

	public int getSkipResults() {
		return skipResults;
	}

	public BaseExample setSkipResults(int skipResults) {
		this.skipResults = skipResults;
		return this;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public BaseExample setMaxResults(int maxResults) {
		this.maxResults = maxResults;
		return this;
	}
}
