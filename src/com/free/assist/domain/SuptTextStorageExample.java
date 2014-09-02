/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuptTextStorageExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptTextStorageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptTextStorageExample(SuptTextStorageExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
    }

    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andStorageIdIsNull() {
            addCriterion("STORAGE_ID is null");
            return this;
        }

        public Criteria andStorageIdIsNotNull() {
            addCriterion("STORAGE_ID is not null");
            return this;
        }

        public Criteria andStorageIdEqualTo(String value) {
            addCriterion("STORAGE_ID =", value, "storageId");
            return this;
        }

        public Criteria andStorageIdNotEqualTo(String value) {
            addCriterion("STORAGE_ID <>", value, "storageId");
            return this;
        }

        public Criteria andStorageIdGreaterThan(String value) {
            addCriterion("STORAGE_ID >", value, "storageId");
            return this;
        }

        public Criteria andStorageIdGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_ID >=", value, "storageId");
            return this;
        }

        public Criteria andStorageIdLessThan(String value) {
            addCriterion("STORAGE_ID <", value, "storageId");
            return this;
        }

        public Criteria andStorageIdLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_ID <=", value, "storageId");
            return this;
        }

        public Criteria andStorageIdLike(String value) {
            addCriterion("STORAGE_ID like", value, "storageId");
            return this;
        }

        public Criteria andStorageIdNotLike(String value) {
            addCriterion("STORAGE_ID not like", value, "storageId");
            return this;
        }

        public Criteria andStorageIdIn(List<String> values) {
            addCriterion("STORAGE_ID in", values, "storageId");
            return this;
        }

        public Criteria andStorageIdNotIn(List<String> values) {
            addCriterion("STORAGE_ID not in", values, "storageId");
            return this;
        }

        public Criteria andStorageIdBetween(String value1, String value2) {
            addCriterion("STORAGE_ID between", value1, value2, "storageId");
            return this;
        }

        public Criteria andStorageIdNotBetween(String value1, String value2) {
            addCriterion("STORAGE_ID not between", value1, value2, "storageId");
            return this;
        }

        public Criteria andModuleSnIsNull() {
            addCriterion("MODULE_SN is null");
            return this;
        }

        public Criteria andModuleSnIsNotNull() {
            addCriterion("MODULE_SN is not null");
            return this;
        }

        public Criteria andModuleSnEqualTo(String value) {
            addCriterion("MODULE_SN =", value, "moduleSn");
            return this;
        }

        public Criteria andModuleSnNotEqualTo(String value) {
            addCriterion("MODULE_SN <>", value, "moduleSn");
            return this;
        }

        public Criteria andModuleSnGreaterThan(String value) {
            addCriterion("MODULE_SN >", value, "moduleSn");
            return this;
        }

        public Criteria andModuleSnGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_SN >=", value, "moduleSn");
            return this;
        }

        public Criteria andModuleSnLessThan(String value) {
            addCriterion("MODULE_SN <", value, "moduleSn");
            return this;
        }

        public Criteria andModuleSnLessThanOrEqualTo(String value) {
            addCriterion("MODULE_SN <=", value, "moduleSn");
            return this;
        }

        public Criteria andModuleSnLike(String value) {
            addCriterion("MODULE_SN like", value, "moduleSn");
            return this;
        }

        public Criteria andModuleSnNotLike(String value) {
            addCriterion("MODULE_SN not like", value, "moduleSn");
            return this;
        }

        public Criteria andModuleSnIn(List<String> values) {
            addCriterion("MODULE_SN in", values, "moduleSn");
            return this;
        }

        public Criteria andModuleSnNotIn(List<String> values) {
            addCriterion("MODULE_SN not in", values, "moduleSn");
            return this;
        }

        public Criteria andModuleSnBetween(String value1, String value2) {
            addCriterion("MODULE_SN between", value1, value2, "moduleSn");
            return this;
        }

        public Criteria andModuleSnNotBetween(String value1, String value2) {
            addCriterion("MODULE_SN not between", value1, value2, "moduleSn");
            return this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return this;
        }

        public Criteria andStorageTextIsNull() {
            addCriterion("STORAGE_TEXT is null");
            return this;
        }

        public Criteria andStorageTextIsNotNull() {
            addCriterion("STORAGE_TEXT is not null");
            return this;
        }

        public Criteria andStorageTextEqualTo(String value) {
            addCriterion("STORAGE_TEXT =", value, "storageText");
            return this;
        }

        public Criteria andStorageTextNotEqualTo(String value) {
            addCriterion("STORAGE_TEXT <>", value, "storageText");
            return this;
        }

        public Criteria andStorageTextGreaterThan(String value) {
            addCriterion("STORAGE_TEXT >", value, "storageText");
            return this;
        }

        public Criteria andStorageTextGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_TEXT >=", value, "storageText");
            return this;
        }

        public Criteria andStorageTextLessThan(String value) {
            addCriterion("STORAGE_TEXT <", value, "storageText");
            return this;
        }

        public Criteria andStorageTextLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_TEXT <=", value, "storageText");
            return this;
        }

        public Criteria andStorageTextLike(String value) {
            addCriterion("STORAGE_TEXT like", value, "storageText");
            return this;
        }

        public Criteria andStorageTextNotLike(String value) {
            addCriterion("STORAGE_TEXT not like", value, "storageText");
            return this;
        }

        public Criteria andStorageTextIn(List<String> values) {
            addCriterion("STORAGE_TEXT in", values, "storageText");
            return this;
        }

        public Criteria andStorageTextNotIn(List<String> values) {
            addCriterion("STORAGE_TEXT not in", values, "storageText");
            return this;
        }

        public Criteria andStorageTextBetween(String value1, String value2) {
            addCriterion("STORAGE_TEXT between", value1, value2, "storageText");
            return this;
        }

        public Criteria andStorageTextNotBetween(String value1, String value2) {
            addCriterion("STORAGE_TEXT not between", value1, value2, "storageText");
            return this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("READ_COUNT is null");
            return this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("READ_COUNT is not null");
            return this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("READ_COUNT =", value, "readCount");
            return this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("READ_COUNT <>", value, "readCount");
            return this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("READ_COUNT >", value, "readCount");
            return this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("READ_COUNT >=", value, "readCount");
            return this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("READ_COUNT <", value, "readCount");
            return this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("READ_COUNT <=", value, "readCount");
            return this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("READ_COUNT in", values, "readCount");
            return this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("READ_COUNT not in", values, "readCount");
            return this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("READ_COUNT between", value1, value2, "readCount");
            return this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("READ_COUNT not between", value1, value2, "readCount");
            return this;
        }

        public Criteria andAttributeBakIsNull() {
            addCriterion("ATTRIBUTE_BAK is null");
            return this;
        }

        public Criteria andAttributeBakIsNotNull() {
            addCriterion("ATTRIBUTE_BAK is not null");
            return this;
        }

        public Criteria andAttributeBakEqualTo(String value) {
            addCriterion("ATTRIBUTE_BAK =", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakNotEqualTo(String value) {
            addCriterion("ATTRIBUTE_BAK <>", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakGreaterThan(String value) {
            addCriterion("ATTRIBUTE_BAK >", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakGreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_BAK >=", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakLessThan(String value) {
            addCriterion("ATTRIBUTE_BAK <", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakLessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_BAK <=", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakLike(String value) {
            addCriterion("ATTRIBUTE_BAK like", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakNotLike(String value) {
            addCriterion("ATTRIBUTE_BAK not like", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakIn(List<String> values) {
            addCriterion("ATTRIBUTE_BAK in", values, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakNotIn(List<String> values) {
            addCriterion("ATTRIBUTE_BAK not in", values, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_BAK between", value1, value2, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakNotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_BAK not between", value1, value2, "attributeBak");
            return this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("IS_AVAILABLE is null");
            return this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("IS_AVAILABLE is not null");
            return this;
        }

        public Criteria andAvailableEqualTo(String value) {
            addCriterion("IS_AVAILABLE =", value, "available");
            return this;
        }

        public Criteria andAvailableNotEqualTo(String value) {
            addCriterion("IS_AVAILABLE <>", value, "available");
            return this;
        }

        public Criteria andAvailableGreaterThan(String value) {
            addCriterion("IS_AVAILABLE >", value, "available");
            return this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE >=", value, "available");
            return this;
        }

        public Criteria andAvailableLessThan(String value) {
            addCriterion("IS_AVAILABLE <", value, "available");
            return this;
        }

        public Criteria andAvailableLessThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE <=", value, "available");
            return this;
        }

        public Criteria andAvailableLike(String value) {
            addCriterion("IS_AVAILABLE like", value, "available");
            return this;
        }

        public Criteria andAvailableNotLike(String value) {
            addCriterion("IS_AVAILABLE not like", value, "available");
            return this;
        }

        public Criteria andAvailableIn(List<String> values) {
            addCriterion("IS_AVAILABLE in", values, "available");
            return this;
        }

        public Criteria andAvailableNotIn(List<String> values) {
            addCriterion("IS_AVAILABLE not in", values, "available");
            return this;
        }

        public Criteria andAvailableBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE between", value1, value2, "available");
            return this;
        }

        public Criteria andAvailableNotBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE not between", value1, value2, "available");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_ON is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_ON is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_ON =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_ON <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_ON >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_ON <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_ON in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_ON not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON not between", value1, value2, "createDate");
            return this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_ON is null");
            return this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_ON is not null");
            return this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_ON =", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_ON <>", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_ON >", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON >=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_ON <", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON <=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_ON in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_ON not in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON between", value1, value2, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON not between", value1, value2, "updateDate");
            return this;
        }
    }
}