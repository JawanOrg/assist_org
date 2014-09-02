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
 * <p>该实体对应数据库的表名为：t_sys_dic_item。
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_DIC_ITEM_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysDicItemKey
 * @see：com.regaltec.blocimp.domain.SysDicItem
 * @see：com.regaltec.blocimp.domain.SysDicItemExample
 * @see：com.regaltec.blocimp.dao.SysDicItemDAO
 * @see：com.regaltec.blocimp.dao.SysDicItemDAOImpl
 * @autor ibator
 * @version 1.2.1
 * @date 2009-12-15 13:42:22 
 */
@javax.persistence.Entity
@javax.persistence.Table(name="v_sys_dic_item")
public class SysDicItem extends SysDicItemKey implements Serializable {

    private String dictionaryId;

    private String dictionaryCode;

    private String dictionaryName;

    private String itemCode;

    private String itemValue;

    private String itemDesc;

    private Integer sortOrder;

    private String internalCode;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="Dictionary_Id", nullable=false, length=32)
    public String getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(String dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    @javax.persistence.Transient
    public String getDictionaryCode() {
        return dictionaryCode;
    }

    public void setDictionaryCode(String dictionaryCode) {
        this.dictionaryCode = dictionaryCode;
    }

    @javax.persistence.Transient
    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    @javax.persistence.Column(name="Item_Code", nullable=true, length=64)
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @javax.persistence.Column(name="Item_Value", nullable=false, length=128)
    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    @javax.persistence.Column(name="Item_Desc", nullable=true, length=256)
    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    @javax.persistence.Column(name="Sort_Order", nullable=true)
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @javax.persistence.Column(name="Internal_Code", nullable=true, length=64)
    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SysDicItem [dictionaryCode=");
		builder.append(dictionaryCode);
		builder.append(", dictionaryId=");
		builder.append(dictionaryId);
		builder.append(", dictionaryName=");
		builder.append(dictionaryName);
		builder.append(", internalCode=");
		builder.append(internalCode);
		builder.append(", itemCode=");
		builder.append(itemCode);
		builder.append(", itemDesc=");
		builder.append(itemDesc);
		builder.append(", itemValue=");
		builder.append(itemValue);
		builder.append(", sortOrder=");
		builder.append(sortOrder);
		builder.append("]");
		return builder.toString();
	}
}