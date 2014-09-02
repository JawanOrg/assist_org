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
 * <p>该实体对应数据库的表名为：t_sys_user_unit。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_USER_UNIT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysUserUnitKey
 * @see：com.regaltec.blocimp.domain.SysUserUnit
 * @see：com.regaltec.blocimp.domain.SysUserUnitExample
 * @see：com.regaltec.blocimp.dao.SysUserUnitDAO
 * @see：com.regaltec.blocimp.dao.SysUserUnitDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-10-16 10:08:20 
 */
public class SysUserUnitKey extends SysUser implements Serializable {
    private String unitId;

    private String userId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Unit_Id", nullable=false, length=32)
    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    @javax.persistence.Column(name="User_Id", nullable=false, length=32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}