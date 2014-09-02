/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����
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
	 * ȡ��ҳ��ǰҳ��,ҳ���1��ʼ. 
	 */  
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * ��ҳ�Ƿ�����һҳ
	 */
	public boolean hasNextPage() {
		return pageNumber < totalPages;
	}
	
	/**
	 * ��ҳ�Ƿ�����һҳ
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
