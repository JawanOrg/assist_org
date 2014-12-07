package com.free.assist.dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.free.assist.domain.BaseExample;
import com.free.assist.util.Pager;

public class GenericDAO extends SqlMapClientDaoSupport {

	private final String BASE_NAMESPACE = "Base";

	public GenericDAO() {
		super();
	}

	public void insert(Object object) {
		super.getSqlMapClientTemplate().insert(object.getClass().getSimpleName() + ".ibatorgenerated_insert", object);
	}

	public int deleteByExample(Object example) {
		String className = example.getClass().getSimpleName();
		int i = className.lastIndexOf("Example");
		if (i > -1) {
			className = className.substring(0, i);
		}
		return super.getSqlMapClientTemplate().delete(className + ".ibatorgenerated_deleteByExample", example);
	}

	public int deleteByPrimaryKey(Object object) {
		return super.getSqlMapClientTemplate().delete(object.getClass().getSimpleName() + ".ibatorgenerated_deleteByPrimaryKey", object);
	}

	public List selectByExample(Object example) {
		String className = example.getClass().getSimpleName();
		int i = className.lastIndexOf("Example");
		if (i > -1) {
			className = className.substring(0, i);
		}
		return super.getSqlMapClientTemplate().queryForList(className + ".ibatorgenerated_selectByExample", example);
	}
	
	public List selectByExampleWithBLOBs(Object example) {
		String className = example.getClass().getSimpleName();
		int i = className.lastIndexOf("Example");
		if (i > -1) {
			className = className.substring(0, i);
		}
		return super.getSqlMapClientTemplate().queryForList(className + ".ibatorgenerated_selectByExampleWithBLOBs", example);
	}

	public Pager selectPageByExample(BaseExample example) {
		String className = example.getClass().getSimpleName();
		int i = className.lastIndexOf("Example");
		if (i > -1) {
			className = className.substring(0, i);
		}
		int skipResults = example.getSkipResults();
		int maxResults = example.getMaxResults();
		int totalRecords = selectCountByExample(example);
		if (skipResults > totalRecords) {
			skipResults = totalRecords - example.getMaxResults();
		}
		List result = getSqlMapClientTemplate().queryForList(className + ".ibatorgenerated_selectByExample", example, skipResults, maxResults);
		return new Pager(skipResults, maxResults, result, totalRecords);
	}

	public Pager selectPageByExampleWithBLOBs(BaseExample example) {
		String className = example.getClass().getSimpleName();
		int i = className.lastIndexOf("Example");
		if (i > -1) {
			className = className.substring(0, i);
		}
		int skipResults = example.getSkipResults();
		int maxResults = example.getMaxResults();
		int totalRecords = selectCountByExample(example);
		if (skipResults > totalRecords) {
			skipResults = totalRecords - example.getMaxResults();
		}
		List result = getSqlMapClientTemplate().queryForList(className + ".ibatorgenerated_selectByExampleWithBLOBs", example, skipResults, maxResults);
		return new Pager(skipResults, maxResults, result, totalRecords);
	}

	public Object selectByPrimaryKey(Object object) {
		String namespace = object.getClass().getSimpleName();
		if (namespace != null && namespace.endsWith("Key")) {
			namespace = namespace.substring(0, namespace.length() - 3);
		}
		return super.getSqlMapClientTemplate().queryForObject(namespace + ".ibatorgenerated_selectByPrimaryKey", object);
	}

	public Object selectByPrimaryKeyWithBLOBs(Object object) {
		String namespace = object.getClass().getSimpleName();
		if (namespace != null && namespace.endsWith("Key")) {
			namespace = namespace.substring(0, namespace.length() - 3);
		}
		return super.getSqlMapClientTemplate().queryForObject(namespace + "WithBLOBs.ibatorgenerated_selectByPrimaryKey", object);
	}

	public Integer selectCountByExample(Object example) {
		String className = example.getClass().getSimpleName();
		int i = className.lastIndexOf("Example");
		if (i > -1) {
			className = className.substring(0, i);
		}
		Integer total = (Integer) getSqlMapClientTemplate().queryForObject(className + ".ibatorgenerated_countByExample", example);
		return total;
	}

	public int updateByPrimaryKey(Object object) {
		return super.getSqlMapClientTemplate().update(object.getClass().getSimpleName() + ".ibatorgenerated_updateByPrimaryKey", object);
	}

	public int updateByPrimaryKeySelective(Object object) {
		return super.getSqlMapClientTemplate().update(object.getClass().getSimpleName() + ".ibatorgenerated_updateByPrimaryKeySelective", object);
	}

	public Date getSysDate() {
		Date date = (Date) getSqlMapClientTemplate().queryForObject(BASE_NAMESPACE + ".getSysDate");
		return date;
	}

	public String buildGUID() {
		String guid = (String) getSqlMapClientTemplate().queryForObject(BASE_NAMESPACE + ".getGUID");
		return guid;
	}
}