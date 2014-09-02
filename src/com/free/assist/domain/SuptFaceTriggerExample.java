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

public class SuptFaceTriggerExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptFaceTriggerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptFaceTriggerExample(SuptFaceTriggerExample example) {
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

        public Criteria andTriggerIdIsNull() {
            addCriterion("TRIGGER_ID is null");
            return this;
        }

        public Criteria andTriggerIdIsNotNull() {
            addCriterion("TRIGGER_ID is not null");
            return this;
        }

        public Criteria andTriggerIdEqualTo(String value) {
            addCriterion("TRIGGER_ID =", value, "triggerId");
            return this;
        }

        public Criteria andTriggerIdNotEqualTo(String value) {
            addCriterion("TRIGGER_ID <>", value, "triggerId");
            return this;
        }

        public Criteria andTriggerIdGreaterThan(String value) {
            addCriterion("TRIGGER_ID >", value, "triggerId");
            return this;
        }

        public Criteria andTriggerIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_ID >=", value, "triggerId");
            return this;
        }

        public Criteria andTriggerIdLessThan(String value) {
            addCriterion("TRIGGER_ID <", value, "triggerId");
            return this;
        }

        public Criteria andTriggerIdLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_ID <=", value, "triggerId");
            return this;
        }

        public Criteria andTriggerIdLike(String value) {
            addCriterion("TRIGGER_ID like", value, "triggerId");
            return this;
        }

        public Criteria andTriggerIdNotLike(String value) {
            addCriterion("TRIGGER_ID not like", value, "triggerId");
            return this;
        }

        public Criteria andTriggerIdIn(List<String> values) {
            addCriterion("TRIGGER_ID in", values, "triggerId");
            return this;
        }

        public Criteria andTriggerIdNotIn(List<String> values) {
            addCriterion("TRIGGER_ID not in", values, "triggerId");
            return this;
        }

        public Criteria andTriggerIdBetween(String value1, String value2) {
            addCriterion("TRIGGER_ID between", value1, value2, "triggerId");
            return this;
        }

        public Criteria andTriggerIdNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_ID not between", value1, value2, "triggerId");
            return this;
        }

        public Criteria andPortIdIsNull() {
            addCriterion("PORT_ID is null");
            return this;
        }

        public Criteria andPortIdIsNotNull() {
            addCriterion("PORT_ID is not null");
            return this;
        }

        public Criteria andPortIdEqualTo(String value) {
            addCriterion("PORT_ID =", value, "portId");
            return this;
        }

        public Criteria andPortIdNotEqualTo(String value) {
            addCriterion("PORT_ID <>", value, "portId");
            return this;
        }

        public Criteria andPortIdGreaterThan(String value) {
            addCriterion("PORT_ID >", value, "portId");
            return this;
        }

        public Criteria andPortIdGreaterThanOrEqualTo(String value) {
            addCriterion("PORT_ID >=", value, "portId");
            return this;
        }

        public Criteria andPortIdLessThan(String value) {
            addCriterion("PORT_ID <", value, "portId");
            return this;
        }

        public Criteria andPortIdLessThanOrEqualTo(String value) {
            addCriterion("PORT_ID <=", value, "portId");
            return this;
        }

        public Criteria andPortIdLike(String value) {
            addCriterion("PORT_ID like", value, "portId");
            return this;
        }

        public Criteria andPortIdNotLike(String value) {
            addCriterion("PORT_ID not like", value, "portId");
            return this;
        }

        public Criteria andPortIdIn(List<String> values) {
            addCriterion("PORT_ID in", values, "portId");
            return this;
        }

        public Criteria andPortIdNotIn(List<String> values) {
            addCriterion("PORT_ID not in", values, "portId");
            return this;
        }

        public Criteria andPortIdBetween(String value1, String value2) {
            addCriterion("PORT_ID between", value1, value2, "portId");
            return this;
        }

        public Criteria andPortIdNotBetween(String value1, String value2) {
            addCriterion("PORT_ID not between", value1, value2, "portId");
            return this;
        }

        public Criteria andReturnCodeIsNull() {
            addCriterion("RETURN_CODE is null");
            return this;
        }

        public Criteria andReturnCodeIsNotNull() {
            addCriterion("RETURN_CODE is not null");
            return this;
        }

        public Criteria andReturnCodeEqualTo(String value) {
            addCriterion("RETURN_CODE =", value, "returnCode");
            return this;
        }

        public Criteria andReturnCodeNotEqualTo(String value) {
            addCriterion("RETURN_CODE <>", value, "returnCode");
            return this;
        }

        public Criteria andReturnCodeGreaterThan(String value) {
            addCriterion("RETURN_CODE >", value, "returnCode");
            return this;
        }

        public Criteria andReturnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_CODE >=", value, "returnCode");
            return this;
        }

        public Criteria andReturnCodeLessThan(String value) {
            addCriterion("RETURN_CODE <", value, "returnCode");
            return this;
        }

        public Criteria andReturnCodeLessThanOrEqualTo(String value) {
            addCriterion("RETURN_CODE <=", value, "returnCode");
            return this;
        }

        public Criteria andReturnCodeLike(String value) {
            addCriterion("RETURN_CODE like", value, "returnCode");
            return this;
        }

        public Criteria andReturnCodeNotLike(String value) {
            addCriterion("RETURN_CODE not like", value, "returnCode");
            return this;
        }

        public Criteria andReturnCodeIn(List<String> values) {
            addCriterion("RETURN_CODE in", values, "returnCode");
            return this;
        }

        public Criteria andReturnCodeNotIn(List<String> values) {
            addCriterion("RETURN_CODE not in", values, "returnCode");
            return this;
        }

        public Criteria andReturnCodeBetween(String value1, String value2) {
            addCriterion("RETURN_CODE between", value1, value2, "returnCode");
            return this;
        }

        public Criteria andReturnCodeNotBetween(String value1, String value2) {
            addCriterion("RETURN_CODE not between", value1, value2, "returnCode");
            return this;
        }

        public Criteria andTriggerNameIsNull() {
            addCriterion("TRIGGER_NAME is null");
            return this;
        }

        public Criteria andTriggerNameIsNotNull() {
            addCriterion("TRIGGER_NAME is not null");
            return this;
        }

        public Criteria andTriggerNameEqualTo(String value) {
            addCriterion("TRIGGER_NAME =", value, "triggerName");
            return this;
        }

        public Criteria andTriggerNameNotEqualTo(String value) {
            addCriterion("TRIGGER_NAME <>", value, "triggerName");
            return this;
        }

        public Criteria andTriggerNameGreaterThan(String value) {
            addCriterion("TRIGGER_NAME >", value, "triggerName");
            return this;
        }

        public Criteria andTriggerNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_NAME >=", value, "triggerName");
            return this;
        }

        public Criteria andTriggerNameLessThan(String value) {
            addCriterion("TRIGGER_NAME <", value, "triggerName");
            return this;
        }

        public Criteria andTriggerNameLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_NAME <=", value, "triggerName");
            return this;
        }

        public Criteria andTriggerNameLike(String value) {
            addCriterion("TRIGGER_NAME like", value, "triggerName");
            return this;
        }

        public Criteria andTriggerNameNotLike(String value) {
            addCriterion("TRIGGER_NAME not like", value, "triggerName");
            return this;
        }

        public Criteria andTriggerNameIn(List<String> values) {
            addCriterion("TRIGGER_NAME in", values, "triggerName");
            return this;
        }

        public Criteria andTriggerNameNotIn(List<String> values) {
            addCriterion("TRIGGER_NAME not in", values, "triggerName");
            return this;
        }

        public Criteria andTriggerNameBetween(String value1, String value2) {
            addCriterion("TRIGGER_NAME between", value1, value2, "triggerName");
            return this;
        }

        public Criteria andTriggerNameNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_NAME not between", value1, value2, "triggerName");
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
    }
}