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
 * <p>该实体对应数据库的表名为：t_sys_tips。</p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_TIPS_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysTipsKey
 * @see：com.regaltec.blocimp.domain.SysTips
 * @see：com.regaltec.blocimp.domain.SysTipsWithBLOBs
 * @see：com.regaltec.blocimp.domain.SysTipsExample
 * @see：com.regaltec.blocimp.dao.SysTipsDAO
 * @see：com.regaltec.blocimp.dao.SysTipsDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-29 14:15:59 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_tips")
public class SysTipsWithBLOBs extends SysTips implements Serializable {
    private String tipContext;

    private String tipContextAttach;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="tip_context", nullable=true)
    public String getTipContext() {
        return tipContext;
    }

    public void setTipContext(String tipContext) {
        this.tipContext = tipContext;
    }

    @javax.persistence.Column(name="tip_context_attach", nullable=true)
    public String getTipContextAttach() {
        return tipContextAttach;
    }

    public void setTipContextAttach(String tipContextAttach) {
        this.tipContextAttach = tipContextAttach;
    }
}