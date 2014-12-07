package com.free.assist.service;

import java.util.Date;
import java.util.List;

import com.free.assist.domain.BaseExample;
import com.free.assist.util.Pager;

/**
 * @author ����
 * @date 2009-09-23 15:57:34
 */
public interface BaseService {
	int deleteByExample(Object example) throws RuntimeException;

	int deleteByPrimaryKey(Object object) throws RuntimeException;

	void insert(Object object) throws RuntimeException;

	List selectByExample(Object example) throws RuntimeException;

	List selectByExampleWithBLOBs(Object example) throws RuntimeException;

	Pager selectPageByExample(BaseExample example) throws RuntimeException;

	Pager selectPageByExampleWithBLOBs(BaseExample example) throws RuntimeException;

	Object selectByPrimaryKey(Object object) throws RuntimeException;

	Object selectByPrimaryKeyWithBLOBs(Object object) throws RuntimeException;

	Integer selectCountByExample(Object example) throws RuntimeException;

	int updateByPrimaryKey(Object object) throws RuntimeException;

	int updateByPrimaryKeySelective(Object object) throws RuntimeException;

	Date getSysDate() throws RuntimeException;

	String buildGUID() throws RuntimeException;

	String buildSequence() throws RuntimeException;
}
