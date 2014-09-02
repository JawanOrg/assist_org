/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IfaceConfCacheExample extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceConfCacheExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceConfCacheExample(IfaceConfCacheExample example) {
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

        public Criteria andRootIdIsNull() {
            addCriterion("ROOT_ID is null");
            return this;
        }

        public Criteria andRootIdIsNotNull() {
            addCriterion("ROOT_ID is not null");
            return this;
        }

        public Criteria andRootIdEqualTo(String value) {
            addCriterion("ROOT_ID =", value, "rootId");
            return this;
        }

        public Criteria andRootIdNotEqualTo(String value) {
            addCriterion("ROOT_ID <>", value, "rootId");
            return this;
        }

        public Criteria andRootIdGreaterThan(String value) {
            addCriterion("ROOT_ID >", value, "rootId");
            return this;
        }

        public Criteria andRootIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROOT_ID >=", value, "rootId");
            return this;
        }

        public Criteria andRootIdLessThan(String value) {
            addCriterion("ROOT_ID <", value, "rootId");
            return this;
        }

        public Criteria andRootIdLessThanOrEqualTo(String value) {
            addCriterion("ROOT_ID <=", value, "rootId");
            return this;
        }

        public Criteria andRootIdLike(String value) {
            addCriterion("ROOT_ID like", value, "rootId");
            return this;
        }

        public Criteria andRootIdNotLike(String value) {
            addCriterion("ROOT_ID not like", value, "rootId");
            return this;
        }

        public Criteria andRootIdIn(List<String> values) {
            addCriterion("ROOT_ID in", values, "rootId");
            return this;
        }

        public Criteria andRootIdNotIn(List<String> values) {
            addCriterion("ROOT_ID not in", values, "rootId");
            return this;
        }

        public Criteria andRootIdBetween(String value1, String value2) {
            addCriterion("ROOT_ID between", value1, value2, "rootId");
            return this;
        }

        public Criteria andRootIdNotBetween(String value1, String value2) {
            addCriterion("ROOT_ID not between", value1, value2, "rootId");
            return this;
        }

        public Criteria andResponseCodeIsNull() {
            addCriterion("RESPONSE_CODE is null");
            return this;
        }

        public Criteria andResponseCodeIsNotNull() {
            addCriterion("RESPONSE_CODE is not null");
            return this;
        }

        public Criteria andResponseCodeEqualTo(String value) {
            addCriterion("RESPONSE_CODE =", value, "responseCode");
            return this;
        }

        public Criteria andResponseCodeNotEqualTo(String value) {
            addCriterion("RESPONSE_CODE <>", value, "responseCode");
            return this;
        }

        public Criteria andResponseCodeGreaterThan(String value) {
            addCriterion("RESPONSE_CODE >", value, "responseCode");
            return this;
        }

        public Criteria andResponseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSE_CODE >=", value, "responseCode");
            return this;
        }

        public Criteria andResponseCodeLessThan(String value) {
            addCriterion("RESPONSE_CODE <", value, "responseCode");
            return this;
        }

        public Criteria andResponseCodeLessThanOrEqualTo(String value) {
            addCriterion("RESPONSE_CODE <=", value, "responseCode");
            return this;
        }

        public Criteria andResponseCodeLike(String value) {
            addCriterion("RESPONSE_CODE like", value, "responseCode");
            return this;
        }

        public Criteria andResponseCodeNotLike(String value) {
            addCriterion("RESPONSE_CODE not like", value, "responseCode");
            return this;
        }

        public Criteria andResponseCodeIn(List<String> values) {
            addCriterion("RESPONSE_CODE in", values, "responseCode");
            return this;
        }

        public Criteria andResponseCodeNotIn(List<String> values) {
            addCriterion("RESPONSE_CODE not in", values, "responseCode");
            return this;
        }

        public Criteria andResponseCodeBetween(String value1, String value2) {
            addCriterion("RESPONSE_CODE between", value1, value2, "responseCode");
            return this;
        }

        public Criteria andResponseCodeNotBetween(String value1, String value2) {
            addCriterion("RESPONSE_CODE not between", value1, value2, "responseCode");
            return this;
        }

        public Criteria andResponseInfoIsNull() {
            addCriterion("RESPONSE_INFO is null");
            return this;
        }

        public Criteria andResponseInfoIsNotNull() {
            addCriterion("RESPONSE_INFO is not null");
            return this;
        }

        public Criteria andResponseInfoEqualTo(String value) {
            addCriterion("RESPONSE_INFO =", value, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoNotEqualTo(String value) {
            addCriterion("RESPONSE_INFO <>", value, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoGreaterThan(String value) {
            addCriterion("RESPONSE_INFO >", value, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSE_INFO >=", value, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoLessThan(String value) {
            addCriterion("RESPONSE_INFO <", value, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoLessThanOrEqualTo(String value) {
            addCriterion("RESPONSE_INFO <=", value, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoLike(String value) {
            addCriterion("RESPONSE_INFO like", value, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoNotLike(String value) {
            addCriterion("RESPONSE_INFO not like", value, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoIn(List<String> values) {
            addCriterion("RESPONSE_INFO in", values, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoNotIn(List<String> values) {
            addCriterion("RESPONSE_INFO not in", values, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoBetween(String value1, String value2) {
            addCriterion("RESPONSE_INFO between", value1, value2, "responseInfo");
            return this;
        }

        public Criteria andResponseInfoNotBetween(String value1, String value2) {
            addCriterion("RESPONSE_INFO not between", value1, value2, "responseInfo");
            return this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("SYS_CODE is null");
            return this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("SYS_CODE is not null");
            return this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("SYS_CODE =", value, "sysCode");
            return this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("SYS_CODE <>", value, "sysCode");
            return this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("SYS_CODE >", value, "sysCode");
            return this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_CODE >=", value, "sysCode");
            return this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("SYS_CODE <", value, "sysCode");
            return this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_CODE <=", value, "sysCode");
            return this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("SYS_CODE like", value, "sysCode");
            return this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("SYS_CODE not like", value, "sysCode");
            return this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("SYS_CODE in", values, "sysCode");
            return this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("SYS_CODE not in", values, "sysCode");
            return this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("SYS_CODE between", value1, value2, "sysCode");
            return this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_CODE not between", value1, value2, "sysCode");
            return this;
        }

        public Criteria andSysCodenameIsNull() {
            addCriterion("SYS_CODENAME is null");
            return this;
        }

        public Criteria andSysCodenameIsNotNull() {
            addCriterion("SYS_CODENAME is not null");
            return this;
        }

        public Criteria andSysCodenameEqualTo(String value) {
            addCriterion("SYS_CODENAME =", value, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameNotEqualTo(String value) {
            addCriterion("SYS_CODENAME <>", value, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameGreaterThan(String value) {
            addCriterion("SYS_CODENAME >", value, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_CODENAME >=", value, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameLessThan(String value) {
            addCriterion("SYS_CODENAME <", value, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameLessThanOrEqualTo(String value) {
            addCriterion("SYS_CODENAME <=", value, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameLike(String value) {
            addCriterion("SYS_CODENAME like", value, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameNotLike(String value) {
            addCriterion("SYS_CODENAME not like", value, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameIn(List<String> values) {
            addCriterion("SYS_CODENAME in", values, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameNotIn(List<String> values) {
            addCriterion("SYS_CODENAME not in", values, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameBetween(String value1, String value2) {
            addCriterion("SYS_CODENAME between", value1, value2, "sysCodename");
            return this;
        }

        public Criteria andSysCodenameNotBetween(String value1, String value2) {
            addCriterion("SYS_CODENAME not between", value1, value2, "sysCodename");
            return this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("ITEM_ID like", value, "itemId");
            return this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("ITEM_ID not like", value, "itemId");
            return this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return this;
        }

        public Criteria andParentItemIdIsNull() {
            addCriterion("PARENT_ITEM_ID is null");
            return this;
        }

        public Criteria andParentItemIdIsNotNull() {
            addCriterion("PARENT_ITEM_ID is not null");
            return this;
        }

        public Criteria andParentItemIdEqualTo(String value) {
            addCriterion("PARENT_ITEM_ID =", value, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdNotEqualTo(String value) {
            addCriterion("PARENT_ITEM_ID <>", value, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdGreaterThan(String value) {
            addCriterion("PARENT_ITEM_ID >", value, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ITEM_ID >=", value, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdLessThan(String value) {
            addCriterion("PARENT_ITEM_ID <", value, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ITEM_ID <=", value, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdLike(String value) {
            addCriterion("PARENT_ITEM_ID like", value, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdNotLike(String value) {
            addCriterion("PARENT_ITEM_ID not like", value, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdIn(List<String> values) {
            addCriterion("PARENT_ITEM_ID in", values, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdNotIn(List<String> values) {
            addCriterion("PARENT_ITEM_ID not in", values, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdBetween(String value1, String value2) {
            addCriterion("PARENT_ITEM_ID between", value1, value2, "parentItemId");
            return this;
        }

        public Criteria andParentItemIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ITEM_ID not between", value1, value2, "parentItemId");
            return this;
        }

        public Criteria andChangetypeIsNull() {
            addCriterion("CHANGETYPE is null");
            return this;
        }

        public Criteria andChangetypeIsNotNull() {
            addCriterion("CHANGETYPE is not null");
            return this;
        }

        public Criteria andChangetypeEqualTo(String value) {
            addCriterion("CHANGETYPE =", value, "changetype");
            return this;
        }

        public Criteria andChangetypeNotEqualTo(String value) {
            addCriterion("CHANGETYPE <>", value, "changetype");
            return this;
        }

        public Criteria andChangetypeGreaterThan(String value) {
            addCriterion("CHANGETYPE >", value, "changetype");
            return this;
        }

        public Criteria andChangetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGETYPE >=", value, "changetype");
            return this;
        }

        public Criteria andChangetypeLessThan(String value) {
            addCriterion("CHANGETYPE <", value, "changetype");
            return this;
        }

        public Criteria andChangetypeLessThanOrEqualTo(String value) {
            addCriterion("CHANGETYPE <=", value, "changetype");
            return this;
        }

        public Criteria andChangetypeLike(String value) {
            addCriterion("CHANGETYPE like", value, "changetype");
            return this;
        }

        public Criteria andChangetypeNotLike(String value) {
            addCriterion("CHANGETYPE not like", value, "changetype");
            return this;
        }

        public Criteria andChangetypeIn(List<String> values) {
            addCriterion("CHANGETYPE in", values, "changetype");
            return this;
        }

        public Criteria andChangetypeNotIn(List<String> values) {
            addCriterion("CHANGETYPE not in", values, "changetype");
            return this;
        }

        public Criteria andChangetypeBetween(String value1, String value2) {
            addCriterion("CHANGETYPE between", value1, value2, "changetype");
            return this;
        }

        public Criteria andChangetypeNotBetween(String value1, String value2) {
            addCriterion("CHANGETYPE not between", value1, value2, "changetype");
            return this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("SERIAL_NUMBER is null");
            return this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("SERIAL_NUMBER is not null");
            return this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("SERIAL_NUMBER =", value, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("SERIAL_NUMBER <>", value, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("SERIAL_NUMBER >", value, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_NUMBER >=", value, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("SERIAL_NUMBER <", value, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_NUMBER <=", value, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("SERIAL_NUMBER like", value, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("SERIAL_NUMBER not like", value, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("SERIAL_NUMBER in", values, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("SERIAL_NUMBER not in", values, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("SERIAL_NUMBER between", value1, value2, "serialNumber");
            return this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("SERIAL_NUMBER not between", value1, value2, "serialNumber");
            return this;
        }

        public Criteria andIsAvailableIsNull() {
            addCriterion("IS_AVAILABLE is null");
            return this;
        }

        public Criteria andIsAvailableIsNotNull() {
            addCriterion("IS_AVAILABLE is not null");
            return this;
        }

        public Criteria andIsAvailableEqualTo(String value) {
            addCriterion("IS_AVAILABLE =", value, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableNotEqualTo(String value) {
            addCriterion("IS_AVAILABLE <>", value, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableGreaterThan(String value) {
            addCriterion("IS_AVAILABLE >", value, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE >=", value, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableLessThan(String value) {
            addCriterion("IS_AVAILABLE <", value, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableLessThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE <=", value, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableLike(String value) {
            addCriterion("IS_AVAILABLE like", value, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableNotLike(String value) {
            addCriterion("IS_AVAILABLE not like", value, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableIn(List<String> values) {
            addCriterion("IS_AVAILABLE in", values, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableNotIn(List<String> values) {
            addCriterion("IS_AVAILABLE not in", values, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE between", value1, value2, "isAvailable");
            return this;
        }

        public Criteria andIsAvailableNotBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE not between", value1, value2, "isAvailable");
            return this;
        }
    }
}