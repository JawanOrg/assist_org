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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_repository_his��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_REPOSITORY_HIS_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryHisKey
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryHis
 * @see��com.regaltec.blocimp.domain.IfaceLogRepositoryHisExample
 * @see��com.regaltec.blocimp.dao.IfaceLogRepositoryHisDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogRepositoryHisDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2010-01-06 16:06:41 
 */
public class IfaceLogRepositoryHisKey implements Serializable {
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