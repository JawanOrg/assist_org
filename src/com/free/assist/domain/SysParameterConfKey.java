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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_sys_parameter_conf��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SYS_PARAMETER_CONF_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SysParameterConfKey
 * @see��com.regaltec.blocimp.domain.SysParameterConf
 * @see��com.regaltec.blocimp.domain.SysParameterConfExample
 * @see��com.regaltec.blocimp.dao.SysParameterConfDAO
 * @see��com.regaltec.blocimp.dao.SysParameterConfDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-02 10:30:47 
 */
public class SysParameterConfKey implements Serializable {
    private String parId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="PAR_ID", nullable=false, length=32)
    public String getParId() {
        return parId;
    }

    public void setParId(String parId) {
        this.parId = parId;
    }
}