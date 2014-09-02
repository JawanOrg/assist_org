/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：T_SUPT_TASK。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_TASK_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptTaskKey
 * @see：com.free.assist.domain.SuptTask
 * @see：com.free.assist.domain.SuptTaskExample
 * @see：com.free.assist.dao.SuptTaskDAO
 * @see：com.free.assist.dao.SuptTaskDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2014-01-07 14:45:44 
 */
public class SuptTaskKey implements Serializable {
    private String taskId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="TASK_ID", nullable=false, length=32)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}