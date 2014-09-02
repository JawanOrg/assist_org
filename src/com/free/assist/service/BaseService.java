package com.free.assist.service;

import java.util.Date;
import java.util.List;

import com.free.assist.domain.BaseExample;
import com.free.assist.util.Pager;

/**
 * @author ภ๎รอ
 * @date 2009-09-23 15:57:34
 */
public interface BaseService {
	public int deleteByExample(Object example) throws RuntimeException;

	public int deleteByPrimaryKey(Object object) throws RuntimeException;

	public void insert(Object object) throws RuntimeException;

	@SuppressWarnings("unchecked")
	public List selectByExample(Object example) throws RuntimeException;
	
	public Pager selectPageByExample(BaseExample example) throws RuntimeException;

	public Object selectByPrimaryKey(Object object) throws RuntimeException;

	public Integer selectCountByExample(Object example) throws RuntimeException;

	public int updateByPrimaryKey(Object object) throws RuntimeException;

	public int updateByPrimaryKeySelective(Object object) throws RuntimeException;

	public Date getSysDate() throws RuntimeException;

	public String buildGUID() throws RuntimeException;

	public String buildSequence() throws RuntimeException;
}
