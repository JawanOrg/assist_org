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
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticElementKey implements Serializable {
    private String elementid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="elementId", nullable=false, length=32)
    public String getElementid() {
        return elementid;
    }

    public void setElementid(String elementid) {
        this.elementid = elementid;
    }
}