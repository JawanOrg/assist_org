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
 * <p>该实体对应数据库的表名为：t_supt_tactic_group。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_TACTIC_GROUP_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptTaticGroupKey
 * @see：com.regaltec.blocimp.domain.SuptTaticGroup
 * @see：com.regaltec.blocimp.domain.SuptTaticGroupExample
 * @see：com.regaltec.blocimp.dao.SuptTaticGroupDAO
 * @see：com.regaltec.blocimp.dao.SuptTaticGroupDAOImpl
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