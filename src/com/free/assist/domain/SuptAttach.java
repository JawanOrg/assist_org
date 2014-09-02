/*
 * <p>鏍囬: 鍗忎綔绠＄悊绯荤粺</p>
 * <p>鎻忚堪: ...</p>
 * <p>鐗堟潈: Copyright (c) 2009</p>
 * <p>鍏徃: 鍏徃</p>
 * <p>缃戝潃锛歨ttp://www.free.cn/
 */
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>璇ユ枃浠朵娇鐢╥bator宸ュ叿鐢熸垚锛宨bator浣跨敤鏂规硶鍙祻瑙�a href="http://ibatis.apache.org">Ibator Documentation</a>銆�p>
 * <p>璇ュ疄浣撳搴旀暟鎹簱鐨勮〃鍚嶄负锛歍_SUPT_ATTACH銆�
 * <p>SQL鏄犲皠鏂囦欢璺緞涓猴細com.free.assist.dao.xml.T_SUPT_ATTACH_SqlMap.xml銆�/p>
 * @see锛歝om.free.assist.domain.SuptAttachKey
 * @see锛歝om.free.assist.domain.SuptAttach
 * @see锛歝om.free.assist.domain.SuptAttachExample
 * @see锛歝om.free.assist.dao.SuptAttachDAO
 * @see锛歝om.free.assist.dao.SuptAttachDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2014-01-15 14:34:36 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="T_SUPT_ATTACH")
public class SuptAttach extends SuptAttachKey implements Serializable {
    private String businessType;

    private String billId;

    private String actionId;

    private String creator;

    private Date createTime;

    private String isDelete;

    private String fileName;

    private String extendName;

    private Long fileSize;

    private String ftpPath;

    private String shareTypeView;

    private String shareTypeWrite;

    private String remark;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="BUSINESS_TYPE", nullable=false, length=32)
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @javax.persistence.Column(name="BILL_ID", nullable=false, length=32)
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @javax.persistence.Column(name="ACTION_ID", nullable=true, length=32)
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    @javax.persistence.Column(name="CREATOR", nullable=false, length=32)
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @javax.persistence.Column(name="CREATE_TIME", nullable=false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @javax.persistence.Column(name="IS_DELETE", nullable=false, length=1)
    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @javax.persistence.Column(name="FILE_NAME", nullable=false, length=200)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @javax.persistence.Column(name="EXTEND_NAME", nullable=false, length=10)
    public String getExtendName() {
        return extendName;
    }

    public void setExtendName(String extendName) {
        this.extendName = extendName;
    }

    @javax.persistence.Column(name="FILE_SIZE", nullable=false)
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @javax.persistence.Column(name="FTP_PATH", nullable=false, length=200)
    public String getFtpPath() {
        return ftpPath;
    }

    public void setFtpPath(String ftpPath) {
        this.ftpPath = ftpPath;
    }

    @javax.persistence.Column(name="SHARE_TYPE_VIEW", nullable=true, length=32)
    public String getShareTypeView() {
        return shareTypeView;
    }

    public void setShareTypeView(String shareTypeView) {
        this.shareTypeView = shareTypeView;
    }

    @javax.persistence.Column(name="SHARE_TYPE_WRITE", nullable=true, length=32)
    public String getShareTypeWrite() {
        return shareTypeWrite;
    }

    public void setShareTypeWrite(String shareTypeWrite) {
        this.shareTypeWrite = shareTypeWrite;
    }

    @javax.persistence.Column(name="REMARK", nullable=true, length=2000)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}