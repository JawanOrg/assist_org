/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;
/**
 * <p>ͨ��DAO�Ľӿ�</p>
 * @author ����
 * @version 1
 * @date 2009-09-23 19:51:46
 */
public interface BaseDAO<KEY, ENTITY, EXAMPLE> {

	int countByExample(EXAMPLE example);

    int deleteByExample(EXAMPLE example);

    int deleteByPrimaryKey(KEY key);

    void insert(ENTITY record);

    void insertSelective(ENTITY record);

    List<ENTITY> selectByExample(EXAMPLE example);
    
    //List<ENTITY> selectByExample(EXAMPLE example, int skipResults, int maxResults);

    ENTITY selectByPrimaryKey(KEY key);

    int updateByExampleSelective(ENTITY record, EXAMPLE example);

    int updateByExample(ENTITY record, EXAMPLE example);

    int updateByPrimaryKeySelective(ENTITY record);

    int updateByPrimaryKey(ENTITY record);    
   
}

