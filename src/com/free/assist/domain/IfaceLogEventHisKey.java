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
 * <p>该实体对应数据库的表名为：t_iface_log_event_his。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_EVENT_HIS_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogEventHisKey
 * @see：com.regaltec.blocimp.domain.IfaceLogEventHis
 * @see：com.regaltec.blocimp.domain.IfaceLogEventHisExample
 * @see：com.regaltec.blocimp.dao.IfaceLogEventHisDAO
 * @see：com.regaltec.blocimp.dao.IfaceLogEventHisDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2010-01-18 13:13:28 
 */
public class IfaceLogEventHisKey implements Serializable {
    private String eventId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="EVENT_ID", nullable=false, length=32)
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}