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
 * <p>该实体对应数据库的表名为：t_supt_face_trigger。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_FACE_TRIGGER_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptFaceTriggerKey
 * @see：com.regaltec.blocimp.domain.SuptFaceTrigger
 * @see：com.regaltec.blocimp.domain.SuptFaceTriggerExample
 * @see：com.regaltec.blocimp.dao.SuptFaceTriggerDAO
 * @see：com.regaltec.blocimp.dao.SuptFaceTriggerDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-17 15:53:18 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_face_trigger")
public class SuptFaceTrigger extends SuptFaceTriggerKey implements Serializable {
    private String portId;

    private String returnCode;

    private String triggerName;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="PORT_ID", nullable=true, length=32)
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    @javax.persistence.Column(name="RETURN_CODE", nullable=true, length=45)
    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @javax.persistence.Column(name="TRIGGER_NAME", nullable=true, length=45)
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @javax.persistence.Column(name="CREATE_ON", nullable=true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}