/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.List;

/**
 * <p>���ļ�ʹ��ibator�������ɣ�ibatorʹ�÷��������<a href="http://ibatis.apache.org">Ibator Documentation</a>��<p>
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_supt_tactic_group��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_GROUP_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.SuptTaticGroupKey
 * @see��com.regaltec.blocimp.domain.SuptTaticGroup
 * @see��com.regaltec.blocimp.domain.SuptTaticGroupExample
 * @see��com.regaltec.blocimp.dao.SuptTaticGroupDAO
 * @see��com.regaltec.blocimp.dao.SuptTaticGroupDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 17:43:29
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_tactic_group")
public class SuptTaticGroup extends SuptTaticGroupKey implements Serializable {
    private String taticgoupname;

    private String priority;

    private String remark;

    private String tatictype;

    private List<SuptTaticElement> taticElementList;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="taticGoupName", nullable=true, length=200)
    public String getTaticgoupname() {
        return taticgoupname;
    }

    public void setTaticgoupname(String taticgoupname) {
        this.taticgoupname = taticgoupname;
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

	public List<SuptTaticElement> getTaticElementList() {
		return taticElementList;
	}

	public void setTaticElementList(List<SuptTaticElement> taticElementList) {
		this.taticElementList = taticElementList;
	}

	public String getTatictype() {
		return tatictype;
	}

	public void setTatictype(String tatictype) {
		this.tatictype = tatictype;
	}

}