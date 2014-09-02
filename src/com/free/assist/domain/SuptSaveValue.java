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
 * <p>该实体对应数据库的表名为：t_supt_save_value。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_SAVE_VALUE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptSaveValueKey
 * @see：com.regaltec.blocimp.domain.SuptSaveValue
 * @see：com.regaltec.blocimp.domain.SuptSaveValueExample
 * @see：com.regaltec.blocimp.dao.SuptSaveValueDAO
 * @see：com.regaltec.blocimp.dao.SuptSaveValueDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-11-14 14:19:56 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="t_supt_save_value")
public class SuptSaveValue extends SuptSaveValueKey implements Serializable {
    private String retnAppid;

    private String subsheetid;

    private String sheetStreamNo;

    private String circuitNo;

    private String localKey1;

    private String localKey2;

    private String workitemid;

    private String operuserid;

    private String trunkName;

    private String hireFrom;

    private String back1;

    private String back2;

    private String back3;

    private String back4;

    private String back5;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="retn_appID", nullable=true, length=32)
    public String getRetnAppid() {
        return retnAppid;
    }

    public void setRetnAppid(String retnAppid) {
        this.retnAppid = retnAppid;
    }

    @javax.persistence.Column(name="subSheetId", nullable=true, length=32)
    public String getSubsheetid() {
        return subsheetid;
    }

    public void setSubsheetid(String subsheetid) {
        this.subsheetid = subsheetid;
    }

    @javax.persistence.Column(name="sheet_stream_no", nullable=true, length=32)
    public String getSheetStreamNo() {
        return sheetStreamNo;
    }

    public void setSheetStreamNo(String sheetStreamNo) {
        this.sheetStreamNo = sheetStreamNo;
    }

    @javax.persistence.Column(name="CIRCUIT_NO", nullable=true, length=100)
    public String getCircuitNo() {
        return circuitNo;
    }

    public void setCircuitNo(String circuitNo) {
        this.circuitNo = circuitNo;
    }

    @javax.persistence.Column(name="LOCAL_KEY1", nullable=true, length=100)
    public String getLocalKey1() {
        return localKey1;
    }

    public void setLocalKey1(String localKey1) {
        this.localKey1 = localKey1;
    }

    @javax.persistence.Column(name="LOCAL_KEY2", nullable=true, length=100)
    public String getLocalKey2() {
        return localKey2;
    }

    public void setLocalKey2(String localKey2) {
        this.localKey2 = localKey2;
    }

    @javax.persistence.Column(name="workItemID", nullable=true, length=32)
    public String getWorkitemid() {
        return workitemid;
    }

    public void setWorkitemid(String workitemid) {
        this.workitemid = workitemid;
    }

    @javax.persistence.Column(name="operUserID", nullable=true)
    public String getOperuserid() {
        return operuserid;
    }

    public void setOperuserid(String operuserid) {
        this.operuserid = operuserid;
    }

    @javax.persistence.Column(name="trunk_name", nullable=true, length=32)
    public String getTrunkName() {
        return trunkName;
    }

    public void setTrunkName(String trunkName) {
        this.trunkName = trunkName;
    }

    @javax.persistence.Column(name="hire_from", nullable=true, length=32)
    public String getHireFrom() {
        return hireFrom;
    }

    public void setHireFrom(String hireFrom) {
        this.hireFrom = hireFrom;
    }

    @javax.persistence.Column(name="back1", nullable=true, length=32)
    public String getBack1() {
        return back1;
    }

    public void setBack1(String back1) {
        this.back1 = back1;
    }

    @javax.persistence.Column(name="back2", nullable=true, length=32)
    public String getBack2() {
        return back2;
    }

    public void setBack2(String back2) {
        this.back2 = back2;
    }

    @javax.persistence.Column(name="back3", nullable=true, length=32)
    public String getBack3() {
        return back3;
    }

    public void setBack3(String back3) {
        this.back3 = back3;
    }

    @javax.persistence.Column(name="back4", nullable=true, length=32)
    public String getBack4() {
        return back4;
    }

    public void setBack4(String back4) {
        this.back4 = back4;
    }

    @javax.persistence.Column(name="back5", nullable=true, length=32)
    public String getBack5() {
        return back5;
    }

    public void setBack5(String back5) {
        this.back5 = back5;
    }
}