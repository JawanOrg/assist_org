/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_repository��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogRepository
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryExample
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryKey
 * @see��com.regaltec.blocimp.dao.IfaceLogRepositoryDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogRepositoryDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-05 08:37:54 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_iface_log_repository")
public class IfaceMonitor implements Serializable {

    private String applicationId;

    private String applicationSn;

    private String applicationName;

    private String methodName;

    private String cimpName;

    private Integer repoCount;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationSn() {
		return applicationSn;
	}

	public void setApplicationSn(String applicationSn) {
		this.applicationSn = applicationSn;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getCimpName() {
		return cimpName;
	}

	public void setCimpName(String cimpName) {
		this.cimpName = cimpName;
	}

	public Integer getRepoCount() {
		return repoCount;
	}

	public void setRepoCount(Integer repoCount) {
		this.repoCount = repoCount;
	}

}