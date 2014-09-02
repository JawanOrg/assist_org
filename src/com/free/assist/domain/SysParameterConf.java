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
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-02 10:30:47 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_sys_parameter_conf")
public class SysParameterConf extends SysParameterConfKey implements Serializable {
    private String parName;

    private String parValue;

    private String parDesc;

    private String isValid;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="PAR_NAME", nullable=false, length=128)
    public String getParName() {
        return parName;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }

    @javax.persistence.Column(name="PAR_VALUE", nullable=true, length=120)
    public String getParValue() {
        return parValue;
    }

    public void setParValue(String parValue) {
        this.parValue = parValue;
    }

    @javax.persistence.Column(name="PAR_DESC", nullable=true, length=250)
    public String getParDesc() {
        return parDesc;
    }

    public void setParDesc(String parDesc) {
        this.parDesc = parDesc;
    }

    @javax.persistence.Column(name="IS_VALID", nullable=true, length=1)
    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}