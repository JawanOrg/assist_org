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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_repository��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryKey
 * @see��com.regaltec.blocimp.domain.IfaceLogRepository
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryWithBLOBs
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryExample
 * @see��com.regaltec.blocimp.dao.IfaceLogRepositoryDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogRepositoryDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-29 09:34:48 
 */
public class IfaceLogRepositoryKey implements Serializable {
    private String repositoryId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="REPOSITORY_ID", nullable=false, length=32)
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }
}