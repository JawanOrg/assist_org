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
 * <p>该实体对应数据库的表名为：t_supt_check。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_CHECK_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptCheckKey
 * @see：com.regaltec.blocimp.domain.SuptCheck
 * @see：com.regaltec.blocimp.domain.SuptCheckExample
 * @see：com.regaltec.blocimp.dao.SuptCheckDAO
 * @see：com.regaltec.blocimp.dao.SuptCheckDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_check")
public class SuptCheck extends SuptCheckKey implements Serializable {
    private String cimpFaceId;

    private String fieldName;

    private String isNull;

    private String dataType;

    private String fieldLegth;

    private String format;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="cimp_face_id", nullable=true, length=32)
    public String getCimpFaceId() {
        return cimpFaceId;
    }

    public void setCimpFaceId(String cimpFaceId) {
        this.cimpFaceId = cimpFaceId;
    }

    @javax.persistence.Column(name="field_name", nullable=true, length=32)
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @javax.persistence.Column(name="is_null", nullable=true, length=1)
    public String getIsNull() {
        return isNull;
    }

    public void setIsNull(String isNull) {
        this.isNull = isNull;
    }

    @javax.persistence.Column(name="data_type", nullable=true, length=32)
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @javax.persistence.Column(name="field_legth", nullable=true, length=8)
    public String getFieldLegth() {
        return fieldLegth;
    }

    public void setFieldLegth(String fieldLegth) {
        this.fieldLegth = fieldLegth;
    }

    @javax.persistence.Column(name="format", nullable=true, length=200)
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}