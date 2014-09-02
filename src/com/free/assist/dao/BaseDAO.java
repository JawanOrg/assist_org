/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import java.util.List;
/**
 * <p>通用DAO的接口</p>
 * @author 李猛
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

