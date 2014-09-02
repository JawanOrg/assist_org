/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_alarm��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_ALARM_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysAlarmKey
 * @see��com.regaltec.blocimp.domain.SysAlarm
 * @see��com.regaltec.blocimp.domain.SysAlarmExample
 * @see��com.regaltec.blocimp.dao.SysAlarmDAO
 * @see��com.regaltec.blocimp.dao.SysAlarmDAOImpl
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