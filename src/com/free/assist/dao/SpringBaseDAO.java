/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.free.assist.domain.BaseExample;
import com.free.assist.util.Pager;

/**
 * <p>�������DAO���������Ƶģ����ǳ�ΪCRUD�Ĳ�������Ȼ��һЩORM�����Ѿ��н��������������ظ���
 * ibatis�����һЩ����ζ��������Լ��Ҳ�ܱ���һЩ������ظ��������ַ�����ȱ������ʧ�����Ͱ�ȫ��</p>
 * <p>����Ŀ�Ľ������������һ��Ԥ��������ʵ����Ķ����Ʊ�����sqlmap��namespaceֵҪһ�¡�</p>
 * @author ����
 * @version 1
 * @date 2009-09-23 13:25:14
 */
public abstract class SpringBaseDAO<KEY, ENTITY, EXAMPLE extends BaseExample> extends SqlMapClientDaoSupport implements BaseDAO<KEY, ENTITY, EXAMPLE> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	private Class<ENTITY> entityClass;

	@SuppressWarnings("unchecked")
	public SpringBaseDAO() {
        super();
        ParameterizedType pt = (ParameterizedType)getClass().getGenericSuperclass();
        entityClass = (Class<ENTITY>) pt.getActualTypeArguments()[1];
    }

    public int countByExample(EXAMPLE example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject(entityClass.getSimpleName() + ".ibatorgenerated_countByExample", example);
        return count;
    }

    public int deleteByExample(EXAMPLE example) {
        int rows = getSqlMapClientTemplate().delete(entityClass.getSimpleName() + ".ibatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(KEY key) {
        int rows = getSqlMapClientTemplate().delete(entityClass.getSimpleName() + ".ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    public void insert(ENTITY record) {
        getSqlMapClientTemplate().insert(entityClass.getSimpleName() + ".ibatorgenerated_insert", record);
    }

    public void insertSelective(ENTITY record) {
        getSqlMapClientTemplate().insert(entityClass.getSimpleName() + ".ibatorgenerated_insertSelective", record);
    }

    //@SuppressWarnings("unchecked")
    public List<ENTITY> selectByExample(EXAMPLE example) {
        List<ENTITY> list = getSqlMapClientTemplate().queryForList(entityClass.getSimpleName() + ".ibatorgenerated_selectByExample", example);
        return list;
    }
    
    @SuppressWarnings("unchecked")
    public Pager<ENTITY> selectPageByExample(EXAMPLE example) {
    	int skipResults = example.getSkipResults();
    	int maxResults = example.getMaxResults();
    	int totalRecords = countByExample(example);
    	if (skipResults > totalRecords) {
    		skipResults = totalRecords - example.getMaxResults();
    	}
    	List<ENTITY> result = getSqlMapClientTemplate().queryForList(entityClass.getSimpleName() + ".ibatorgenerated_selectByExample", example, skipResults, maxResults);
        return new Pager<ENTITY>(skipResults, maxResults, result, totalRecords);
    }

    /*@SuppressWarnings("unchecked")
    public PageControl<ENTITY> selectPageByExample(EXAMPLE example, int skipResults, int maxResults) {
    	int totalRows = countByExample(example);
    	if (skipResults > totalRows) {
    		skipResults = totalRows - maxResults;
    	}
    	List<ENTITY> result = getSqlMapClientTemplate().queryForList(entityClass.getSimpleName() + ".ibatorgenerated_selectByExample", example, skipResults, maxResults);
    	return new PageControl<ENTITY>(skipResults, maxResults, totalRows, result);
    }*/

    @SuppressWarnings("unchecked")
    public ENTITY selectByPrimaryKey(KEY key) {
        ENTITY record = (ENTITY) getSqlMapClientTemplate().queryForObject(entityClass.getSimpleName() + ".ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int updateByPrimaryKeySelective(ENTITY record) {
        int rows = getSqlMapClientTemplate().update(entityClass.getSimpleName() + ".ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(ENTITY record) {
        int rows = getSqlMapClientTemplate().update(entityClass.getSimpleName() + ".ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public abstract int updateByExampleSelective(ENTITY record, EXAMPLE example);

    public abstract int updateByExample(ENTITY record, EXAMPLE example);
        
}