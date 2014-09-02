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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_iface_group_relation��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_IFACE_GROUP_RELATION_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelationKey
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelation
 * @see��com.regaltec.blocimp.domain.SuptIfaceGroupRelationExample
 * @see��com.regaltec.blocimp.dao.SuptIfaceGroupRelationDAO
 * @see��com.regaltec.blocimp.dao.SuptIfaceGroupRelationDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-09 09:55:02
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_iface_group_relation")
public class SuptIfaceGroupRelation extends SuptIfaceGroupRelationKey implements Serializable {
    private String interfacecode;

    private String taticgoupid;

    private String priority;

    private String remark;

    private String taticgoupName;

    private String tatictype;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="interfaceCode", nullable=false, length=64)
    public String getInterfacecode() {
        return interfacecode;
    }

    public void setInterfacecode(String interfacecode) {
        this.interfacecode = interfacecode;
    }

    @javax.persistence.Column(name="taticGoupId", nullable=false, length=64)
    public String getTaticgoupid() {
        return taticgoupid;
    }

    public void setTaticgoupid(String taticgoupid) {
        this.taticgoupid = taticgoupid;
    }

    @javax.persistence.Column(name="priority", nullable=true, length=10)
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @javax.persistence.Column(name="remark", nullable=true, length=255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public String getTaticgoupName() {
		return taticgoupName;
	}

	public void setTaticgoupName(String taticgoupName) {
		this.taticgoupName = taticgoupName;
	}

	public String getTatictype() {
		return tatictype;
	}

	public void setTatictype(String tatictype) {
		this.tatictype = tatictype;
	}
}