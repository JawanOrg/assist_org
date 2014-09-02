/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李猛
 * @version 2
 * @date 2009-09-24 13:51:34
 */
public class Pager<T> extends ArrayList<T> {

	private static final long serialVersionUID = 20091008L;

	private int skipResults;

	private int maxResults;
	
	private int totalRecords;
	
	private int totalPages;
	
	private int pageNumber;

	public Pager(int skipResults, int maxResults, List<T> pageElement, int totalRecords) {
		super(pageElement);
		this.skipResults = skipResults;
		this.maxResults = maxResults;
		this.totalRecords = totalRecords;
		this.pageNumber = skipResults / maxResults + 1;
		if (totalRecords % maxResults == 0) {
			this.totalPages = totalRecords / maxResults;
		} else {
			this.totalPages = totalRecords / maxResults + 1;
		}
	}

	public int getMaxResults() {
		return maxResults;
	}

	public int getSkipResults() {
		return skipResults;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public int getTotalPages() {
		return totalPages;
	}
	/** 
	 * 取该页当前页码,页码从1开始. 
	 */  
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * 该页是否有下一页
	 */
	public boolean hasNextPage() {
		return pageNumber < totalPages;
	}
	
	/**
	 * 该页是否有上一页
	 */
	public boolean hasPreviousPage() {
		return pageNumber > 1 && pageNumber <= totalRecords;
	}
	
	public boolean isNotEmpty() {
		if (totalRecords > 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFirstPage() {
		return pageNumber == 1;
	}
	
	public boolean isLastPage() {
		return pageNumber == totalPages;
	}
}
