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
 * <p>该实体对应数据库的表名为：t_supt_tactic_group。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_GROUP_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptTaticGroupKey
 * @see：com.regaltec.blocimp.domain.SuptTaticGroup
 * @see：com.regaltec.blocimp.domain.SuptTaticGroupExample
 * @see：com.regaltec.blocimp.dao.SuptTaticGroupDAO
 * @see：com.regaltec.blocimp.dao.SuptTaticGroupDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 17:43:29 
 */
public class SuptTaticGroupKey implements Serializable {
    private String taticgoupid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="taticGoupId", nullable=false, length=64)
    public String getTaticgoupid() {
        return taticgoupid;
    }

    public void setTaticgoupid(String taticgoupid) {
        this.taticgoupid = taticgoupid;
    }
}