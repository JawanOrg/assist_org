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
 * <p>该实体对应数据库的表名为：t_supt_tactic_relation。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_RELATION_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptTaticRelationKey
 * @see：com.regaltec.blocimp.domain.SuptTaticRelation
 * @see：com.regaltec.blocimp.domain.SuptTaticRelationExample
 * @see：com.regaltec.blocimp.dao.SuptTaticRelationDAO
 * @see：com.regaltec.blocimp.dao.SuptTaticRelationDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 17:43:29
 */
public class SuptTaticRelationKey extends SuptTaticElement implements Serializable {
    private String tacticrelationid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="tacticRelationId", nullable=false, length=64)
    public String getTacticrelationid() {
        return tacticrelationid;
    }

    public void setTacticrelationid(String tacticrelationid) {
        this.tacticrelationid = tacticrelationid;
    }
}