/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_supt_value_list。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_VALUE_LIST_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptValueListKey
 * @see：com.regaltec.blocimp.domain.SuptValueList
 * @see：com.regaltec.blocimp.domain.SuptValueListExample
 * @see：com.regaltec.blocimp.dao.SuptValueListDAO
 * @see：com.regaltec.blocimp.dao.SuptValueListDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-21 09:55:40 
 */
public class SuptValueListKey implements Serializable {
    private String orderId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="order_id", nullable=false, length=32)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}