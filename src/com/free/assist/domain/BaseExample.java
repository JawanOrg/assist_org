/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;


/**
 * @author 李猛
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
