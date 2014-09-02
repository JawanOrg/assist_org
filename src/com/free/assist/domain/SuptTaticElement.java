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
 * <p>该实体对应数据库的表名为：t_supt_tactic_element。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_ELEMENT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptTaticElementKey
 * @see：com.regaltec.blocimp.domain.SuptTaticElement
 * @see：com.regaltec.blocimp.domain.SuptTaticElementExample
 * @see：com.regaltec.blocimp.dao.SuptTaticElementDAO
 * @see：com.regaltec.blocimp.dao.SuptTaticElementDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_tactic_element")
public class SuptTaticElement extends SuptTaticElementKey implements Serializable {
    private String elementname;

    private String elementcode;

    private String sourcetype;

    private String sqlstr;

    private String spare1;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="elementName", nullable=false, length=64)
    public String getElementname() {
        return elementname;
    }

    public void setElementname(String elementname) {
        this.elementname = elementname;
    }

    @javax.persistence.Column(name="elementCode", nullable=false, length=64)
    public String getElementcode() {
        return elementcode;
    }

    public void setElementcode(String elementcode) {
        this.elementcode = elementcode;
    }

    @javax.persistence.Column(name="sourceType", nullable=true, length=10)
    public String getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype;
    }

    @javax.persistence.Column(name="sqlStr", nullable=true, length=256)
    public String getSqlstr() {
        return sqlstr;
    }

    public void setSqlstr(String sqlstr) {
        this.sqlstr = sqlstr;
    }

    @javax.persistence.Column(name="spare1", nullable=true, length=50)
    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }
}