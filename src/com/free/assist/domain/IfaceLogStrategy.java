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
 * <p>该实体对应数据库的表名为：t_iface_log_strategy。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_IFACE_LOG_STRATEGY_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.IfaceLogStrategyKey
 * @see：com.regaltec.blocimp.domain.IfaceLogStrategy
 * @see：com.regaltec.blocimp.domain.IfaceLogStrategyExample
 * @see：com.regaltec.blocimp.dao.IfaceLogStrategyDAO
 * @see：com.regaltec.blocimp.dao.IfaceLogStrategyDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-28 23:51:59 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_strategy")
public class IfaceLogStrategy extends IfaceLogStrategyKey implements Serializable {
    private String timeEnable;

    private Date timeUpper;

    private Date timeLower;

    private String weekEnable;

    private String weekSetting;

    private String dateEnable;

    private String dateSetting;

    private String monthEnable;

    private String monthSetting;

    private Date updateDate;

    private String updateUser;

    private String available;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="TIME_ENABLE", nullable=true, length=1)
    public String getTimeEnable() {
        return timeEnable;
    }

    public void setTimeEnable(String timeEnable) {
        this.timeEnable = timeEnable;
    }

    @javax.persistence.Column(name="TIME_UPPER", nullable=true)
    public Date getTimeUpper() {
        return timeUpper;
    }

    public void setTimeUpper(Date timeUpper) {
        this.timeUpper = timeUpper;
    }

    @javax.persistence.Column(name="TIME_LOWER", nullable=true)
    public Date getTimeLower() {
        return timeLower;
    }

    public void setTimeLower(Date timeLower) {
        this.timeLower = timeLower;
    }

    @javax.persistence.Column(name="WEEK_ENABLE", nullable=true, length=1)
    public String getWeekEnable() {
        return weekEnable;
    }

    public void setWeekEnable(String weekEnable) {
        this.weekEnable = weekEnable;
    }

    @javax.persistence.Column(name="WEEK_SETTING", nullable=true, length=200)
    public String getWeekSetting() {
        return weekSetting;
    }

    public void setWeekSetting(String weekSetting) {
        this.weekSetting = weekSetting;
    }

    @javax.persistence.Column(name="DATE_ENABLE", nullable=true, length=1)
    public String getDateEnable() {
        return dateEnable;
    }

    public void setDateEnable(String dateEnable) {
        this.dateEnable = dateEnable;
    }

    @javax.persistence.Column(name="DATE_SETTING", nullable=true, length=200)
    public String getDateSetting() {
        return dateSetting;
    }

    public void setDateSetting(String dateSetting) {
        this.dateSetting = dateSetting;
    }

    @javax.persistence.Column(name="MONTH_ENABLE", nullable=true, length=1)
    public String getMonthEnable() {
        return monthEnable;
    }

    public void setMonthEnable(String monthEnable) {
        this.monthEnable = monthEnable;
    }

    @javax.persistence.Column(name="MONTH_SETTING", nullable=true, length=200)
    public String getMonthSetting() {
        return monthSetting;
    }

    public void setMonthSetting(String monthSetting) {
        this.monthSetting = monthSetting;
    }

    @javax.persistence.Column(name="UPDATE_ON", nullable=true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @javax.persistence.Column(name="UPDATE_BY", nullable=true, length=32)
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @javax.persistence.Column(name="IS_AVAILABLE", nullable=true, length=1)
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}