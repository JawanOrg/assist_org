/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.List;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_supt_tactic_instance。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_INSTANCE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptTaticInstanceKey
 * @see：com.regaltec.blocimp.domain.SuptTaticInstance
 * @see：com.regaltec.blocimp.domain.SuptTaticInstanceExample
 * @see：com.regaltec.blocimp.dao.SuptTaticInstanceDAO
 * @see：com.regaltec.blocimp.dao.SuptTaticInstanceDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:43:29
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_tactic_instance")
public class SuptTaticInstance extends SuptTaticInstanceKey implements Serializable {
    private String taticgoupid;

    private String interfacecode;

    private String dispatchobject;

    private String ismore;

    private String rowrecordid;

    private String elementid;

    private String elevalue1;

    private String elevalue2;

    private String elevalue3;

    private String matchingRule;

    private String xmlNodename;

    private String sourcetype;

    private String sqlstr;

    private String changeElement;

    private String resulttype;

   private  List<SuptTaticInstance> elementInstanceList;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="taticGoupId", nullable=true, length=64)
    public String getTaticgoupid() {
        return taticgoupid;
    }

    public void setTaticgoupid(String taticgoupid) {
        this.taticgoupid = taticgoupid;
    }

    @javax.persistence.Column(name="interfaceCode", nullable=true, length=100)
    public String getInterfacecode() {
        return interfacecode;
    }

    public void setInterfacecode(String interfacecode) {
        this.interfacecode = interfacecode;
    }

    @javax.persistence.Column(name="dispatchObject", nullable=true, length=64)
    public String getDispatchobject() {
        return dispatchobject;
    }

    public void setDispatchobject(String dispatchobject) {
        this.dispatchobject = dispatchobject;
    }

    @javax.persistence.Column(name="isMore", nullable=true, length=10)
    public String getIsmore() {
        return ismore;
    }

    public void setIsmore(String ismore) {
        this.ismore = ismore;
    }

    @javax.persistence.Column(name="rowRecordId", nullable=true, length=64)
    public String getRowrecordid() {
        return rowrecordid;
    }

    public void setRowrecordid(String rowrecordid) {
        this.rowrecordid = rowrecordid;
    }

    @javax.persistence.Column(name="elementId", nullable=true, length=64)
    public String getElementid() {
        return elementid;
    }

    public void setElementid(String elementid) {
        this.elementid = elementid;
    }

    @javax.persistence.Column(name="eleValue1", nullable=true, length=100)
    public String getElevalue1() {
        return elevalue1;
    }

    public void setElevalue1(String elevalue1) {
        this.elevalue1 = elevalue1;
    }

    @javax.persistence.Column(name="eleValue2", nullable=true, length=100)
    public String getElevalue2() {
        return elevalue2;
    }

    public void setElevalue2(String elevalue2) {
        this.elevalue2 = elevalue2;
    }

    @javax.persistence.Column(name="eleValue3", nullable=true, length=100)
    public String getElevalue3() {
        return elevalue3;
    }

    public void setElevalue3(String elevalue3) {
        this.elevalue3 = elevalue3;
    }

    @javax.persistence.Column(name="matching_rule", nullable=true, length=100)
    public String getMatchingRule() {
        return matchingRule;
    }

    public void setMatchingRule(String matchingRule) {
        this.matchingRule = matchingRule;
    }

    @javax.persistence.Column(name="xml_nodeName", nullable=true, length=100)
    public String getXmlNodename() {
        return xmlNodename;
    }

    public void setXmlNodename(String xmlNodename) {
        this.xmlNodename = xmlNodename;
    }

	public List<SuptTaticInstance> getElementInstanceList() {
		return elementInstanceList;
	}

	public void setElementInstanceList(List<SuptTaticInstance> elementInstanceList) {
		this.elementInstanceList = elementInstanceList;
	}

	public String getSourcetype() {
		return sourcetype;
	}

	public void setSourcetype(String sourcetype) {
		this.sourcetype = sourcetype;
	}

	public String getSqlstr() {
		return sqlstr;
	}

	public void setSqlstr(String sqlstr) {
		this.sqlstr = sqlstr;
	}

	public String getChangeElement() {
		return changeElement;
	}

	public void setChangeElement(String changeElement) {
		this.changeElement = changeElement;
	}

	public String getResulttype() {
		return resulttype;
	}

	public void setResulttype(String resulttype) {
		this.resulttype = resulttype;
	}



}