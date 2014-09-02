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
 * <p>该实体对应数据库的表名为：t_sys_alarm。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_ALARM_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysAlarmKey
 * @see：com.regaltec.blocimp.domain.SysAlarm
 * @see：com.regaltec.blocimp.domain.SysAlarmExample
 * @see：com.regaltec.blocimp.dao.SysAlarmDAO
 * @see：com.regaltec.blocimp.dao.SysAlarmDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysAlarmKey implements Serializable {
    private String alarmId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="alarm_id", nullable=false, length=32)
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }
}