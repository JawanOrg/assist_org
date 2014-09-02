/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>该实体对应数据库的表名为：T_SUPT_POINT_INFO。
 * <p>SQL映射文件路径为：com.free.assist.dao.xml.T_SUPT_POINT_INFO_SqlMap.xml。</p>
 * @see：com.free.assist.domain.SuptPointInfoKey
 * @see：com.free.assist.domain.SuptPointInfo
 * @see：com.free.assist.domain.SuptPointInfoExample
 * @see：com.free.assist.dao.SuptPointInfoDAO
 * @see：com.free.assist.dao.SuptPointInfoDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2014-02-13 16:14:05 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="T_SUPT_POINT_INFO")
public class SuptPointInfo extends SuptPointInfoKey implements Serializable {
    private String longitude;

    private String latitude;

    private String pointType;

    private String imageType;

    private Integer grade;

    private String name;

    private String address;

    private String remark;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="LONGITUDE", nullable=false, length=32)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @javax.persistence.Column(name="LATITUDE", nullable=false, length=32)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @javax.persistence.Column(name="POINT_TYPE", nullable=false, length=32)
    public String getPointType() {
        return pointType;
    }

    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    @javax.persistence.Column(name="IMAGE_TYPE", nullable=false, length=50)
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @javax.persistence.Column(name="GRADE", nullable=false)
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @javax.persistence.Column(name="NAME", nullable=true, length=50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Column(name="ADDRESS", nullable=true, length=200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @javax.persistence.Column(name="REMARK", nullable=true, length=1000)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}