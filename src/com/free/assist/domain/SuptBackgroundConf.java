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
 * <p>
 * 该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator
 * Documentation</a>。
 * <p>
 * <p>
 * 该实体对应数据库的表名为：t_supt_background_conf。
 * <p>
 * SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_BACKGROUND_CONF_SqlMap.xml。
 * </p>
 *
 * @see：com.regaltec.blocimp.domain.SuptBackgroundConfKey
 * @see：com.regaltec.blocimp.domain.SuptBackgroundConf
 * @see：com.regaltec.blocimp.domain.SuptBackgroundConfExample
 * @see：com.regaltec.blocimp.dao.SuptBackgroundConfDAO
 * @see：com.regaltec.blocimp.dao.SuptBackgroundConfDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2010-05-17 10:20:42
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_supt_background_conf")
public class SuptBackgroundConf extends SuptBackgroundConfKey implements Serializable {
	private String backgroundTypeDesc;

	private Integer execInterval;

	private Date lastRunTime;

	private Date nextRunTime;

	private String isValid;

	private String isNormal;

	private String spare1;

	private String spare2;

	private String spare3;

	private Date currentTime;

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	private static final long serialVersionUID = 1L;

	@javax.persistence.Column(name = "BACKGROUND_TYPE_DESC", nullable = true, length = 100)
	public String getBackgroundTypeDesc() {
		return backgroundTypeDesc;
	}

	public void setBackgroundTypeDesc(String backgroundTypeDesc) {
		this.backgroundTypeDesc = backgroundTypeDesc;
	}

	@javax.persistence.Column(name = "EXEC_INTERVAL", nullable = true)
	public Integer getExecInterval() {
		return execInterval;
	}

	public void setExecInterval(Integer execInterval) {
		this.execInterval = execInterval;
	}

	@javax.persistence.Column(name = "LAST_RUN_TIME", nullable = true)
	public Date getLastRunTime() {
		return lastRunTime;
	}

	public void setLastRunTime(Date lastRunTime) {
		this.lastRunTime = lastRunTime;
	}

	@javax.persistence.Column(name = "NEXT_RUN_TIME", nullable = true)
	public Date getNextRunTime() {
		return nextRunTime;
	}

	public void setNextRunTime(Date nextRunTime) {
		this.nextRunTime = nextRunTime;
	}

	@javax.persistence.Column(name = "IS_VALID", nullable = true, length = 1)
	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	@javax.persistence.Column(name = "IS_NORMAL", nullable = true, length = 1)
	public String getIsNormal() {
		return isNormal;
	}

	public void setIsNormal(String isNormal) {
		this.isNormal = isNormal;
	}

	@javax.persistence.Column(name = "SPARE1", nullable = true, length = 32)
	public String getSpare1() {
		return spare1;
	}

	public void setSpare1(String spare1) {
		this.spare1 = spare1;
	}

	@javax.persistence.Column(name = "SPARE2", nullable = true, length = 32)
	public String getSpare2() {
		return spare2;
	}

	public void setSpare2(String spare2) {
		this.spare2 = spare2;
	}

	@javax.persistence.Column(name = "SPARE3", nullable = true, length = 32)
	public String getSpare3() {
		return spare3;
	}

	public void setSpare3(String spare3) {
		this.spare3 = spare3;
	}
}