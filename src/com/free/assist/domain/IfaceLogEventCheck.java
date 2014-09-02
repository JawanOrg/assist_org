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

@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_event")
public class IfaceLogEventCheck implements Serializable {
	
    private String strNowTime;
    private int logEventCount;
    
	public String getStrNowTime() {
		return strNowTime;
	}
	public void setStrNowTime(String strNowTime) {
		this.strNowTime = strNowTime;
	}
	public int getLogEventCount() {
		return logEventCount;
	}
	public void setLogEventCount(int logEventCount) {
		this.logEventCount = logEventCount;
	}
    
}