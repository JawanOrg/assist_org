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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_dic_config��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_DIC_CONFIG_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysDicConfigKey
 * @see��com.regaltec.blocimp.domain.SysDicConfig
 * @see��com.regaltec.blocimp.domain.SysDicConfigExample
 * @see��com.regaltec.blocimp.dao.SysDicConfigDAO
 * @see��com.regaltec.blocimp.dao.SysDicConfigDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysDicConfigKey implements Serializable {
    private String dictionaryId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="Dictionary_Id", nullable=false, length=32)
    public String getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(String dictionaryId) {
        this.dictionaryId = dictionaryId;
    }
}