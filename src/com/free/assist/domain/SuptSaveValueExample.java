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

public class SuptSaveValueExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptSaveValueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptSaveValueExample(SuptSaveValueExample example) {
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

        public Criteria andSavaIdIsNull() {
            addCriterion("sava_id is null");
            return this;
        }

        public Criteria andSavaIdIsNotNull() {
            addCriterion("sava_id is not null");
            return this;
        }

        public Criteria andSavaIdEqualTo(String value) {
            addCriterion("sava_id =", value, "savaId");
            return this;
        }

        public Criteria andSavaIdNotEqualTo(String value) {
            addCriterion("sava_id <>", value, "savaId");
            return this;
        }

        public Criteria andSavaIdGreaterThan(String value) {
            addCriterion("sava_id >", value, "savaId");
            return this;
        }

        public Criteria andSavaIdGreaterThanOrEqualTo(String value) {
            addCriterion("sava_id >=", value, "savaId");
            return this;
        }

        public Criteria andSavaIdLessThan(String value) {
            addCriterion("sava_id <", value, "savaId");
            return this;
        }

        public Criteria andSavaIdLessThanOrEqualTo(String value) {
            addCriterion("sava_id <=", value, "savaId");
            return this;
        }

        public Criteria andSavaIdLike(String value) {
            addCriterion("sava_id like", value, "savaId");
            return this;
        }

        public Criteria andSavaIdNotLike(String value) {
            addCriterion("sava_id not like", value, "savaId");
            return this;
        }

        public Criteria andSavaIdIn(List<String> values) {
            addCriterion("sava_id in", values, "savaId");
            return this;
        }

        public Criteria andSavaIdNotIn(List<String> values) {
            addCriterion("sava_id not in", values, "savaId");
            return this;
        }

        public Criteria andSavaIdBetween(String value1, String value2) {
            addCriterion("sava_id between", value1, value2, "savaId");
            return this;
        }

        public Criteria andSavaIdNotBetween(String value1, String value2) {
            addCriterion("sava_id not between", value1, value2, "savaId");
            return this;
        }

        public Criteria andRetnAppidIsNull() {
            addCriterion("retn_appID is null");
            return this;
        }

        public Criteria andRetnAppidIsNotNull() {
            addCriterion("retn_appID is not null");
            return this;
        }

        public Criteria andRetnAppidEqualTo(String value) {
            addCriterion("retn_appID =", value, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidNotEqualTo(String value) {
            addCriterion("retn_appID <>", value, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidGreaterThan(String value) {
            addCriterion("retn_appID >", value, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidGreaterThanOrEqualTo(String value) {
            addCriterion("retn_appID >=", value, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidLessThan(String value) {
            addCriterion("retn_appID <", value, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidLessThanOrEqualTo(String value) {
            addCriterion("retn_appID <=", value, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidLike(String value) {
            addCriterion("retn_appID like", value, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidNotLike(String value) {
            addCriterion("retn_appID not like", value, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidIn(List<String> values) {
            addCriterion("retn_appID in", values, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidNotIn(List<String> values) {
            addCriterion("retn_appID not in", values, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidBetween(String value1, String value2) {
            addCriterion("retn_appID between", value1, value2, "retnAppid");
            return this;
        }

        public Criteria andRetnAppidNotBetween(String value1, String value2) {
            addCriterion("retn_appID not between", value1, value2, "retnAppid");
            return this;
        }

        public Criteria andSubsheetidIsNull() {
            addCriterion("subSheetId is null");
            return this;
        }

        public Criteria andSubsheetidIsNotNull() {
            addCriterion("subSheetId is not null");
            return this;
        }

        public Criteria andSubsheetidEqualTo(String value) {
            addCriterion("subSheetId =", value, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidNotEqualTo(String value) {
            addCriterion("subSheetId <>", value, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidGreaterThan(String value) {
            addCriterion("subSheetId >", value, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidGreaterThanOrEqualTo(String value) {
            addCriterion("subSheetId >=", value, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidLessThan(String value) {
            addCriterion("subSheetId <", value, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidLessThanOrEqualTo(String value) {
            addCriterion("subSheetId <=", value, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidLike(String value) {
            addCriterion("subSheetId like", value, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidNotLike(String value) {
            addCriterion("subSheetId not like", value, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidIn(List<String> values) {
            addCriterion("subSheetId in", values, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidNotIn(List<String> values) {
            addCriterion("subSheetId not in", values, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidBetween(String value1, String value2) {
            addCriterion("subSheetId between", value1, value2, "subsheetid");
            return this;
        }

        public Criteria andSubsheetidNotBetween(String value1, String value2) {
            addCriterion("subSheetId not between", value1, value2, "subsheetid");
            return this;
        }

        public Criteria andSheetStreamNoIsNull() {
            addCriterion("sheet_stream_no is null");
            return this;
        }

        public Criteria andSheetStreamNoIsNotNull() {
            addCriterion("sheet_stream_no is not null");
            return this;
        }

        public Criteria andSheetStreamNoEqualTo(String value) {
            addCriterion("sheet_stream_no =", value, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoNotEqualTo(String value) {
            addCriterion("sheet_stream_no <>", value, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoGreaterThan(String value) {
            addCriterion("sheet_stream_no >", value, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_stream_no >=", value, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoLessThan(String value) {
            addCriterion("sheet_stream_no <", value, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoLessThanOrEqualTo(String value) {
            addCriterion("sheet_stream_no <=", value, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoLike(String value) {
            addCriterion("sheet_stream_no like", value, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoNotLike(String value) {
            addCriterion("sheet_stream_no not like", value, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoIn(List<String> values) {
            addCriterion("sheet_stream_no in", values, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoNotIn(List<String> values) {
            addCriterion("sheet_stream_no not in", values, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoBetween(String value1, String value2) {
            addCriterion("sheet_stream_no between", value1, value2, "sheetStreamNo");
            return this;
        }

        public Criteria andSheetStreamNoNotBetween(String value1, String value2) {
            addCriterion("sheet_stream_no not between", value1, value2, "sheetStreamNo");
            return this;
        }

        public Criteria andCircuitNoIsNull() {
            addCriterion("CIRCUIT_NO is null");
            return this;
        }

        public Criteria andCircuitNoIsNotNull() {
            addCriterion("CIRCUIT_NO is not null");
            return this;
        }

        public Criteria andCircuitNoEqualTo(String value) {
            addCriterion("CIRCUIT_NO =", value, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoNotEqualTo(String value) {
            addCriterion("CIRCUIT_NO <>", value, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoGreaterThan(String value) {
            addCriterion("CIRCUIT_NO >", value, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoGreaterThanOrEqualTo(String value) {
            addCriterion("CIRCUIT_NO >=", value, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoLessThan(String value) {
            addCriterion("CIRCUIT_NO <", value, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoLessThanOrEqualTo(String value) {
            addCriterion("CIRCUIT_NO <=", value, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoLike(String value) {
            addCriterion("CIRCUIT_NO like", value, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoNotLike(String value) {
            addCriterion("CIRCUIT_NO not like", value, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoIn(List<String> values) {
            addCriterion("CIRCUIT_NO in", values, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoNotIn(List<String> values) {
            addCriterion("CIRCUIT_NO not in", values, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoBetween(String value1, String value2) {
            addCriterion("CIRCUIT_NO between", value1, value2, "circuitNo");
            return this;
        }

        public Criteria andCircuitNoNotBetween(String value1, String value2) {
            addCriterion("CIRCUIT_NO not between", value1, value2, "circuitNo");
            return this;
        }

        public Criteria andLocalKey1IsNull() {
            addCriterion("LOCAL_KEY1 is null");
            return this;
        }

        public Criteria andLocalKey1IsNotNull() {
            addCriterion("LOCAL_KEY1 is not null");
            return this;
        }

        public Criteria andLocalKey1EqualTo(String value) {
            addCriterion("LOCAL_KEY1 =", value, "localKey1");
            return this;
        }

        public Criteria andLocalKey1NotEqualTo(String value) {
            addCriterion("LOCAL_KEY1 <>", value, "localKey1");
            return this;
        }

        public Criteria andLocalKey1GreaterThan(String value) {
            addCriterion("LOCAL_KEY1 >", value, "localKey1");
            return this;
        }

        public Criteria andLocalKey1GreaterThanOrEqualTo(String value) {
            addCriterion("LOCAL_KEY1 >=", value, "localKey1");
            return this;
        }

        public Criteria andLocalKey1LessThan(String value) {
            addCriterion("LOCAL_KEY1 <", value, "localKey1");
            return this;
        }

        public Criteria andLocalKey1LessThanOrEqualTo(String value) {
            addCriterion("LOCAL_KEY1 <=", value, "localKey1");
            return this;
        }

        public Criteria andLocalKey1Like(String value) {
            addCriterion("LOCAL_KEY1 like", value, "localKey1");
            return this;
        }

        public Criteria andLocalKey1NotLike(String value) {
            addCriterion("LOCAL_KEY1 not like", value, "localKey1");
            return this;
        }

        public Criteria andLocalKey1In(List<String> values) {
            addCriterion("LOCAL_KEY1 in", values, "localKey1");
            return this;
        }

        public Criteria andLocalKey1NotIn(List<String> values) {
            addCriterion("LOCAL_KEY1 not in", values, "localKey1");
            return this;
        }

        public Criteria andLocalKey1Between(String value1, String value2) {
            addCriterion("LOCAL_KEY1 between", value1, value2, "localKey1");
            return this;
        }

        public Criteria andLocalKey1NotBetween(String value1, String value2) {
            addCriterion("LOCAL_KEY1 not between", value1, value2, "localKey1");
            return this;
        }

        public Criteria andLocalKey2IsNull() {
            addCriterion("LOCAL_KEY2 is null");
            return this;
        }

        public Criteria andLocalKey2IsNotNull() {
            addCriterion("LOCAL_KEY2 is not null");
            return this;
        }

        public Criteria andLocalKey2EqualTo(String value) {
            addCriterion("LOCAL_KEY2 =", value, "localKey2");
            return this;
        }

        public Criteria andLocalKey2NotEqualTo(String value) {
            addCriterion("LOCAL_KEY2 <>", value, "localKey2");
            return this;
        }

        public Criteria andLocalKey2GreaterThan(String value) {
            addCriterion("LOCAL_KEY2 >", value, "localKey2");
            return this;
        }

        public Criteria andLocalKey2GreaterThanOrEqualTo(String value) {
            addCriterion("LOCAL_KEY2 >=", value, "localKey2");
            return this;
        }

        public Criteria andLocalKey2LessThan(String value) {
            addCriterion("LOCAL_KEY2 <", value, "localKey2");
            return this;
        }

        public Criteria andLocalKey2LessThanOrEqualTo(String value) {
            addCriterion("LOCAL_KEY2 <=", value, "localKey2");
            return this;
        }

        public Criteria andLocalKey2Like(String value) {
            addCriterion("LOCAL_KEY2 like", value, "localKey2");
            return this;
        }

        public Criteria andLocalKey2NotLike(String value) {
            addCriterion("LOCAL_KEY2 not like", value, "localKey2");
            return this;
        }

        public Criteria andLocalKey2In(List<String> values) {
            addCriterion("LOCAL_KEY2 in", values, "localKey2");
            return this;
        }

        public Criteria andLocalKey2NotIn(List<String> values) {
            addCriterion("LOCAL_KEY2 not in", values, "localKey2");
            return this;
        }

        public Criteria andLocalKey2Between(String value1, String value2) {
            addCriterion("LOCAL_KEY2 between", value1, value2, "localKey2");
            return this;
        }

        public Criteria andLocalKey2NotBetween(String value1, String value2) {
            addCriterion("LOCAL_KEY2 not between", value1, value2, "localKey2");
            return this;
        }

        public Criteria andWorkitemidIsNull() {
            addCriterion("workItemID is null");
            return this;
        }

        public Criteria andWorkitemidIsNotNull() {
            addCriterion("workItemID is not null");
            return this;
        }

        public Criteria andWorkitemidEqualTo(String value) {
            addCriterion("workItemID =", value, "workitemid");
            return this;
        }

        public Criteria andWorkitemidNotEqualTo(String value) {
            addCriterion("workItemID <>", value, "workitemid");
            return this;
        }

        public Criteria andWorkitemidGreaterThan(String value) {
            addCriterion("workItemID >", value, "workitemid");
            return this;
        }

        public Criteria andWorkitemidGreaterThanOrEqualTo(String value) {
            addCriterion("workItemID >=", value, "workitemid");
            return this;
        }

        public Criteria andWorkitemidLessThan(String value) {
            addCriterion("workItemID <", value, "workitemid");
            return this;
        }

        public Criteria andWorkitemidLessThanOrEqualTo(String value) {
            addCriterion("workItemID <=", value, "workitemid");
            return this;
        }

        public Criteria andWorkitemidLike(String value) {
            addCriterion("workItemID like", value, "workitemid");
            return this;
        }

        public Criteria andWorkitemidNotLike(String value) {
            addCriterion("workItemID not like", value, "workitemid");
            return this;
        }

        public Criteria andWorkitemidIn(List<String> values) {
            addCriterion("workItemID in", values, "workitemid");
            return this;
        }

        public Criteria andWorkitemidNotIn(List<String> values) {
            addCriterion("workItemID not in", values, "workitemid");
            return this;
        }

        public Criteria andWorkitemidBetween(String value1, String value2) {
            addCriterion("workItemID between", value1, value2, "workitemid");
            return this;
        }

        public Criteria andWorkitemidNotBetween(String value1, String value2) {
            addCriterion("workItemID not between", value1, value2, "workitemid");
            return this;
        }

        public Criteria andOperuseridIsNull() {
            addCriterion("operUserID is null");
            return this;
        }

        public Criteria andOperuseridIsNotNull() {
            addCriterion("operUserID is not null");
            return this;
        }

        public Criteria andOperuseridEqualTo(String value) {
            addCriterion("operUserID =", value, "operuserid");
            return this;
        }

        public Criteria andOperuseridNotEqualTo(String value) {
            addCriterion("operUserID <>", value, "operuserid");
            return this;
        }

        public Criteria andOperuseridGreaterThan(String value) {
            addCriterion("operUserID >", value, "operuserid");
            return this;
        }

        public Criteria andOperuseridGreaterThanOrEqualTo(String value) {
            addCriterion("operUserID >=", value, "operuserid");
            return this;
        }

        public Criteria andOperuseridLessThan(String value) {
            addCriterion("operUserID <", value, "operuserid");
            return this;
        }

        public Criteria andOperuseridLessThanOrEqualTo(String value) {
            addCriterion("operUserID <=", value, "operuserid");
            return this;
        }

        public Criteria andOperuseridLike(String value) {
            addCriterion("operUserID like", value, "operuserid");
            return this;
        }

        public Criteria andOperuseridNotLike(String value) {
            addCriterion("operUserID not like", value, "operuserid");
            return this;
        }

        public Criteria andOperuseridIn(List<String> values) {
            addCriterion("operUserID in", values, "operuserid");
            return this;
        }

        public Criteria andOperuseridNotIn(List<String> values) {
            addCriterion("operUserID not in", values, "operuserid");
            return this;
        }

        public Criteria andOperuseridBetween(String value1, String value2) {
            addCriterion("operUserID between", value1, value2, "operuserid");
            return this;
        }

        public Criteria andOperuseridNotBetween(String value1, String value2) {
            addCriterion("operUserID not between", value1, value2, "operuserid");
            return this;
        }

        public Criteria andTrunkNameIsNull() {
            addCriterion("trunk_name is null");
            return this;
        }

        public Criteria andTrunkNameIsNotNull() {
            addCriterion("trunk_name is not null");
            return this;
        }

        public Criteria andTrunkNameEqualTo(String value) {
            addCriterion("trunk_name =", value, "trunkName");
            return this;
        }

        public Criteria andTrunkNameNotEqualTo(String value) {
            addCriterion("trunk_name <>", value, "trunkName");
            return this;
        }

        public Criteria andTrunkNameGreaterThan(String value) {
            addCriterion("trunk_name >", value, "trunkName");
            return this;
        }

        public Criteria andTrunkNameGreaterThanOrEqualTo(String value) {
            addCriterion("trunk_name >=", value, "trunkName");
            return this;
        }

        public Criteria andTrunkNameLessThan(String value) {
            addCriterion("trunk_name <", value, "trunkName");
            return this;
        }

        public Criteria andTrunkNameLessThanOrEqualTo(String value) {
            addCriterion("trunk_name <=", value, "trunkName");
            return this;
        }

        public Criteria andTrunkNameLike(String value) {
            addCriterion("trunk_name like", value, "trunkName");
            return this;
        }

        public Criteria andTrunkNameNotLike(String value) {
            addCriterion("trunk_name not like", value, "trunkName");
            return this;
        }

        public Criteria andTrunkNameIn(List<String> values) {
            addCriterion("trunk_name in", values, "trunkName");
            return this;
        }

        public Criteria andTrunkNameNotIn(List<String> values) {
            addCriterion("trunk_name not in", values, "trunkName");
            return this;
        }

        public Criteria andTrunkNameBetween(String value1, String value2) {
            addCriterion("trunk_name between", value1, value2, "trunkName");
            return this;
        }

        public Criteria andTrunkNameNotBetween(String value1, String value2) {
            addCriterion("trunk_name not between", value1, value2, "trunkName");
            return this;
        }

        public Criteria andHireFromIsNull() {
            addCriterion("hire_from is null");
            return this;
        }

        public Criteria andHireFromIsNotNull() {
            addCriterion("hire_from is not null");
            return this;
        }

        public Criteria andHireFromEqualTo(String value) {
            addCriterion("hire_from =", value, "hireFrom");
            return this;
        }

        public Criteria andHireFromNotEqualTo(String value) {
            addCriterion("hire_from <>", value, "hireFrom");
            return this;
        }

        public Criteria andHireFromGreaterThan(String value) {
            addCriterion("hire_from >", value, "hireFrom");
            return this;
        }

        public Criteria andHireFromGreaterThanOrEqualTo(String value) {
            addCriterion("hire_from >=", value, "hireFrom");
            return this;
        }

        public Criteria andHireFromLessThan(String value) {
            addCriterion("hire_from <", value, "hireFrom");
            return this;
        }

        public Criteria andHireFromLessThanOrEqualTo(String value) {
            addCriterion("hire_from <=", value, "hireFrom");
            return this;
        }

        public Criteria andHireFromLike(String value) {
            addCriterion("hire_from like", value, "hireFrom");
            return this;
        }

        public Criteria andHireFromNotLike(String value) {
            addCriterion("hire_from not like", value, "hireFrom");
            return this;
        }

        public Criteria andHireFromIn(List<String> values) {
            addCriterion("hire_from in", values, "hireFrom");
            return this;
        }

        public Criteria andHireFromNotIn(List<String> values) {
            addCriterion("hire_from not in", values, "hireFrom");
            return this;
        }

        public Criteria andHireFromBetween(String value1, String value2) {
            addCriterion("hire_from between", value1, value2, "hireFrom");
            return this;
        }

        public Criteria andHireFromNotBetween(String value1, String value2) {
            addCriterion("hire_from not between", value1, value2, "hireFrom");
            return this;
        }

        public Criteria andBack1IsNull() {
            addCriterion("back1 is null");
            return this;
        }

        public Criteria andBack1IsNotNull() {
            addCriterion("back1 is not null");
            return this;
        }

        public Criteria andBack1EqualTo(String value) {
            addCriterion("back1 =", value, "back1");
            return this;
        }

        public Criteria andBack1NotEqualTo(String value) {
            addCriterion("back1 <>", value, "back1");
            return this;
        }

        public Criteria andBack1GreaterThan(String value) {
            addCriterion("back1 >", value, "back1");
            return this;
        }

        public Criteria andBack1GreaterThanOrEqualTo(String value) {
            addCriterion("back1 >=", value, "back1");
            return this;
        }

        public Criteria andBack1LessThan(String value) {
            addCriterion("back1 <", value, "back1");
            return this;
        }

        public Criteria andBack1LessThanOrEqualTo(String value) {
            addCriterion("back1 <=", value, "back1");
            return this;
        }

        public Criteria andBack1Like(String value) {
            addCriterion("back1 like", value, "back1");
            return this;
        }

        public Criteria andBack1NotLike(String value) {
            addCriterion("back1 not like", value, "back1");
            return this;
        }

        public Criteria andBack1In(List<String> values) {
            addCriterion("back1 in", values, "back1");
            return this;
        }

        public Criteria andBack1NotIn(List<String> values) {
            addCriterion("back1 not in", values, "back1");
            return this;
        }

        public Criteria andBack1Between(String value1, String value2) {
            addCriterion("back1 between", value1, value2, "back1");
            return this;
        }

        public Criteria andBack1NotBetween(String value1, String value2) {
            addCriterion("back1 not between", value1, value2, "back1");
            return this;
        }

        public Criteria andBack2IsNull() {
            addCriterion("back2 is null");
            return this;
        }

        public Criteria andBack2IsNotNull() {
            addCriterion("back2 is not null");
            return this;
        }

        public Criteria andBack2EqualTo(String value) {
            addCriterion("back2 =", value, "back2");
            return this;
        }

        public Criteria andBack2NotEqualTo(String value) {
            addCriterion("back2 <>", value, "back2");
            return this;
        }

        public Criteria andBack2GreaterThan(String value) {
            addCriterion("back2 >", value, "back2");
            return this;
        }

        public Criteria andBack2GreaterThanOrEqualTo(String value) {
            addCriterion("back2 >=", value, "back2");
            return this;
        }

        public Criteria andBack2LessThan(String value) {
            addCriterion("back2 <", value, "back2");
            return this;
        }

        public Criteria andBack2LessThanOrEqualTo(String value) {
            addCriterion("back2 <=", value, "back2");
            return this;
        }

        public Criteria andBack2Like(String value) {
            addCriterion("back2 like", value, "back2");
            return this;
        }

        public Criteria andBack2NotLike(String value) {
            addCriterion("back2 not like", value, "back2");
            return this;
        }

        public Criteria andBack2In(List<String> values) {
            addCriterion("back2 in", values, "back2");
            return this;
        }

        public Criteria andBack2NotIn(List<String> values) {
            addCriterion("back2 not in", values, "back2");
            return this;
        }

        public Criteria andBack2Between(String value1, String value2) {
            addCriterion("back2 between", value1, value2, "back2");
            return this;
        }

        public Criteria andBack2NotBetween(String value1, String value2) {
            addCriterion("back2 not between", value1, value2, "back2");
            return this;
        }

        public Criteria andBack3IsNull() {
            addCriterion("back3 is null");
            return this;
        }

        public Criteria andBack3IsNotNull() {
            addCriterion("back3 is not null");
            return this;
        }

        public Criteria andBack3EqualTo(String value) {
            addCriterion("back3 =", value, "back3");
            return this;
        }

        public Criteria andBack3NotEqualTo(String value) {
            addCriterion("back3 <>", value, "back3");
            return this;
        }

        public Criteria andBack3GreaterThan(String value) {
            addCriterion("back3 >", value, "back3");
            return this;
        }

        public Criteria andBack3GreaterThanOrEqualTo(String value) {
            addCriterion("back3 >=", value, "back3");
            return this;
        }

        public Criteria andBack3LessThan(String value) {
            addCriterion("back3 <", value, "back3");
            return this;
        }

        public Criteria andBack3LessThanOrEqualTo(String value) {
            addCriterion("back3 <=", value, "back3");
            return this;
        }

        public Criteria andBack3Like(String value) {
            addCriterion("back3 like", value, "back3");
            return this;
        }

        public Criteria andBack3NotLike(String value) {
            addCriterion("back3 not like", value, "back3");
            return this;
        }

        public Criteria andBack3In(List<String> values) {
            addCriterion("back3 in", values, "back3");
            return this;
        }

        public Criteria andBack3NotIn(List<String> values) {
            addCriterion("back3 not in", values, "back3");
            return this;
        }

        public Criteria andBack3Between(String value1, String value2) {
            addCriterion("back3 between", value1, value2, "back3");
            return this;
        }

        public Criteria andBack3NotBetween(String value1, String value2) {
            addCriterion("back3 not between", value1, value2, "back3");
            return this;
        }

        public Criteria andBack4IsNull() {
            addCriterion("back4 is null");
            return this;
        }

        public Criteria andBack4IsNotNull() {
            addCriterion("back4 is not null");
            return this;
        }

        public Criteria andBack4EqualTo(String value) {
            addCriterion("back4 =", value, "back4");
            return this;
        }

        public Criteria andBack4NotEqualTo(String value) {
            addCriterion("back4 <>", value, "back4");
            return this;
        }

        public Criteria andBack4GreaterThan(String value) {
            addCriterion("back4 >", value, "back4");
            return this;
        }

        public Criteria andBack4GreaterThanOrEqualTo(String value) {
            addCriterion("back4 >=", value, "back4");
            return this;
        }

        public Criteria andBack4LessThan(String value) {
            addCriterion("back4 <", value, "back4");
            return this;
        }

        public Criteria andBack4LessThanOrEqualTo(String value) {
            addCriterion("back4 <=", value, "back4");
            return this;
        }

        public Criteria andBack4Like(String value) {
            addCriterion("back4 like", value, "back4");
            return this;
        }

        public Criteria andBack4NotLike(String value) {
            addCriterion("back4 not like", value, "back4");
            return this;
        }

        public Criteria andBack4In(List<String> values) {
            addCriterion("back4 in", values, "back4");
            return this;
        }

        public Criteria andBack4NotIn(List<String> values) {
            addCriterion("back4 not in", values, "back4");
            return this;
        }

        public Criteria andBack4Between(String value1, String value2) {
            addCriterion("back4 between", value1, value2, "back4");
            return this;
        }

        public Criteria andBack4NotBetween(String value1, String value2) {
            addCriterion("back4 not between", value1, value2, "back4");
            return this;
        }

        public Criteria andBack5IsNull() {
            addCriterion("back5 is null");
            return this;
        }

        public Criteria andBack5IsNotNull() {
            addCriterion("back5 is not null");
            return this;
        }

        public Criteria andBack5EqualTo(String value) {
            addCriterion("back5 =", value, "back5");
            return this;
        }

        public Criteria andBack5NotEqualTo(String value) {
            addCriterion("back5 <>", value, "back5");
            return this;
        }

        public Criteria andBack5GreaterThan(String value) {
            addCriterion("back5 >", value, "back5");
            return this;
        }

        public Criteria andBack5GreaterThanOrEqualTo(String value) {
            addCriterion("back5 >=", value, "back5");
            return this;
        }

        public Criteria andBack5LessThan(String value) {
            addCriterion("back5 <", value, "back5");
            return this;
        }

        public Criteria andBack5LessThanOrEqualTo(String value) {
            addCriterion("back5 <=", value, "back5");
            return this;
        }

        public Criteria andBack5Like(String value) {
            addCriterion("back5 like", value, "back5");
            return this;
        }

        public Criteria andBack5NotLike(String value) {
            addCriterion("back5 not like", value, "back5");
            return this;
        }

        public Criteria andBack5In(List<String> values) {
            addCriterion("back5 in", values, "back5");
            return this;
        }

        public Criteria andBack5NotIn(List<String> values) {
            addCriterion("back5 not in", values, "back5");
            return this;
        }

        public Criteria andBack5Between(String value1, String value2) {
            addCriterion("back5 between", value1, value2, "back5");
            return this;
        }

        public Criteria andBack5NotBetween(String value1, String value2) {
            addCriterion("back5 not between", value1, value2, "back5");
            return this;
        }
    }
}