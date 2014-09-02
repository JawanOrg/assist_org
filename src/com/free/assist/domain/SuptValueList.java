/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_supt_value_list。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_VALUE_LIST_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptValueListKey
 * @see：com.regaltec.blocimp.domain.SuptValueList
 * @see：com.regaltec.blocimp.domain.SuptValueListExample
 * @see：com.regaltec.blocimp.dao.SuptValueListDAO
 * @see：com.regaltec.blocimp.dao.SuptValueListDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-21 09:55:40 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_value_list")
public class SuptValueList extends SuptValueListKey implements Serializable {
    private String billId;

    private String depenNode;

    private String values;

    private Date createDate;

    private String createUser;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="bill_id", nullable=true, length=32)
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @javax.persistence.Column(name="depen_node", nullable=true, length=32)
    public String getDepenNode() {
        return depenNode;
    }

    public void setDepenNode(String depenNode) {
        this.depenNode = depenNode;
    }

    @javax.persistence.Column(name="values", nullable=true, length=32)
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @javax.persistence.Column(name="create_date", nullable=true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Column(name="create_user", nullable=true, length=32)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}