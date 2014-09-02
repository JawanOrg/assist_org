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
 * <p>该实体对应数据库的表名为：t_sys_parameter_conf。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_PARAMETER_CONF_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysParameterConfKey
 * @see：com.regaltec.blocimp.domain.SysParameterConf
 * @see：com.regaltec.blocimp.domain.SysParameterConfExample
 * @see：com.regaltec.blocimp.dao.SysParameterConfDAO
 * @see：com.regaltec.blocimp.dao.SysParameterConfDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-02 10:30:47 
 */
public class SysParameterConfKey implements Serializable {
    private String parId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="PAR_ID", nullable=false, length=32)
    public String getParId() {
        return parId;
    }

    public void setParId(String parId) {
        this.parId = parId;
    }
}