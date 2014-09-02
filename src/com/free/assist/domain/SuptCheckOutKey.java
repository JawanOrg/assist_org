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
 * <p>该实体对应数据库的表名为：t_supt_check_out。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SUPT_CHECK_OUT_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SuptCheckOutKey
 * @see：com.regaltec.blocimp.domain.SuptCheckOut
 * @see：com.regaltec.blocimp.domain.SuptCheckOutExample
 * @see：com.regaltec.blocimp.dao.SuptCheckOutDAO
 * @see：com.regaltec.blocimp.dao.SuptCheckOutDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-19 17:19:12 
 */
public class SuptCheckOutKey extends SuptFace implements Serializable {
    private String sendId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="send_id", nullable=false, length=32)
    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }
}