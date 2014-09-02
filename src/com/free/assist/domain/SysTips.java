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
 * <p>该实体对应数据库的表名为：t_sys_tips。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_TIPS_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysTipsKey
 * @see：com.regaltec.blocimp.domain.SysTips
 * @see：com.regaltec.blocimp.domain.SysTipsExample
 * @see：com.regaltec.blocimp.dao.SysTipsDAO
 * @see：com.regaltec.blocimp.dao.SysTipsDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-29 19:14:56 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_tips")
public class SysTips extends SysTipsKey implements Serializable {
    private String tipLabel;

    private String tipContext;

    private Date createDate;

    private String tipContextAttach;

    private String tipModuleId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="tip_label", nullable=true, length=2000)
    public String getTipLabel() {
        return tipLabel;
    }

    public void setTipLabel(String tipLabel) {
        this.tipLabel = tipLabel;
    }

    @javax.persistence.Column(name="tip_context", nullable=true)
    public String getTipContext() {
        return tipContext;
    }

    public void setTipContext(String tipContext) {
        this.tipContext = tipContext;
    }

    @javax.persistence.Column(name="create_date", nullable=true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Column(name="tip_context_attach", nullable=true)
    public String getTipContextAttach() {
        return tipContextAttach;
    }

    public void setTipContextAttach(String tipContextAttach) {
        this.tipContextAttach = tipContextAttach;
    }

    @javax.persistence.Column(name="tip_module_id", nullable=true, length=50)
    public String getTipModuleId() {
        return tipModuleId;
    }

    public void setTipModuleId(String tipModuleId) {
        this.tipModuleId = tipModuleId;
    }
}