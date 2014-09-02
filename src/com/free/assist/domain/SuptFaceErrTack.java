/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：t_supt_face_errtack。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_FACE_ERRTACK_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptFaceErrTackKey
 * @see：com.regaltec.blocimp.domain.SuptFaceErrTack
 * @see：com.regaltec.blocimp.domain.SuptFaceErrTackExample
 * @see：com.regaltec.blocimp.dao.SuptFaceErrTackDAO
 * @see：com.regaltec.blocimp.dao.SuptFaceErrTackDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-10-12 14:09:43 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_face_errtack")
public class SuptFaceErrTack extends SuptFaceErrTackKey implements Serializable {
    private String cimpFaceId;

    private String errBusiness;

    private String errType;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="cimp_face_id", nullable=true, length=32)
    public String getCimpFaceId() {
        return cimpFaceId;
    }

    public void setCimpFaceId(String cimpFaceId) {
        this.cimpFaceId = cimpFaceId;
    }

    @javax.persistence.Column(name="err_business", nullable=true, length=32)
    public String getErrBusiness() {
        return errBusiness;
    }

    public void setErrBusiness(String errBusiness) {
        this.errBusiness = errBusiness;
    }

    @javax.persistence.Column(name="err_type", nullable=true, length=32)
    public String getErrType() {
        return errType;
    }

    public void setErrType(String errType) {
        this.errType = errType;
    }
}