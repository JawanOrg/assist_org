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
 * <p>��ʵ���Ӧ���ݿ�ı���Ϊ��t_iface_log_strategy��
 * <p>SQLӳ���ļ�·��Ϊ��com.regaltec.blocimp.dao.xml.T_IFACE_LOG_STRATEGY_SqlMap.xml��</p>
 * @see��com.regaltec.blocimp.domain.IfaceLogStrategyKey
 * @see��com.regaltec.blocimp.domain.IfaceLogStrategy
 * @see��com.regaltec.blocimp.domain.IfaceLogStrategyExample
 * @see��com.regaltec.blocimp.dao.IfaceLogStrategyDAO
 * @see��com.regaltec.blocimp.dao.IfaceLogStrategyDAOImpl
 * @autor ibator1
 * @version 1.2.1
 * @date 2009-11-28 23:51:59 
 */
public class IfaceLogStrategyKey implements Serializable {
    private String strategyId;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.Column(name="STRATEGY_ID", nullable=false, length=32)
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }
}