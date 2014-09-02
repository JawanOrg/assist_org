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

public class IfaceLogListenerExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceLogListenerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceLogListenerExample(IfaceLogListenerExample example) {
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

        public Criteria andListenerIdIsNull() {
            addCriterion("LISTENER_ID is null");
            return this;
        }

        public Criteria andListenerIdIsNotNull() {
            addCriterion("LISTENER_ID is not null");
            return this;
        }

        public Criteria andListenerIdEqualTo(String value) {
            addCriterion("LISTENER_ID =", value, "listenerId");
            return this;
        }

        public Criteria andListenerIdNotEqualTo(String value) {
            addCriterion("LISTENER_ID <>", value, "listenerId");
            return this;
        }

        public Criteria andListenerIdGreaterThan(String value) {
            addCriterion("LISTENER_ID >", value, "listenerId");
            return this;
        }

        public Criteria andListenerIdGreaterThanOrEqualTo(String value) {
            addCriterion("LISTENER_ID >=", value, "listenerId");
            return this;
        }

        public Criteria andListenerIdLessThan(String value) {
            addCriterion("LISTENER_ID <", value, "listenerId");
            return this;
        }

        public Criteria andListenerIdLessThanOrEqualTo(String value) {
            addCriterion("LISTENER_ID <=", value, "listenerId");
            return this;
        }

        public Criteria andListenerIdLike(String value) {
            addCriterion("LISTENER_ID like", value, "listenerId");
            return this;
        }

        public Criteria andListenerIdNotLike(String value) {
            addCriterion("LISTENER_ID not like", value, "listenerId");
            return this;
        }

        public Criteria andListenerIdIn(List<String> values) {
            addCriterion("LISTENER_ID in", values, "listenerId");
            return this;
        }

        public Criteria andListenerIdNotIn(List<String> values) {
            addCriterion("LISTENER_ID not in", values, "listenerId");
            return this;
        }

        public Criteria andListenerIdBetween(String value1, String value2) {
            addCriterion("LISTENER_ID between", value1, value2, "listenerId");
            return this;
        }

        public Criteria andListenerIdNotBetween(String value1, String value2) {
            addCriterion("LISTENER_ID not between", value1, value2, "listenerId");
            return this;
        }

        public Criteria andListenerTypeIsNull() {
            addCriterion("LISTENER_TYPE is null");
            return this;
        }

        public Criteria andListenerTypeIsNotNull() {
            addCriterion("LISTENER_TYPE is not null");
            return this;
        }

        public Criteria andListenerTypeEqualTo(String value) {
            addCriterion("LISTENER_TYPE =", value, "listenerType");
            return this;
        }

        public Criteria andListenerTypeNotEqualTo(String value) {
            addCriterion("LISTENER_TYPE <>", value, "listenerType");
            return this;
        }

        public Criteria andListenerTypeGreaterThan(String value) {
            addCriterion("LISTENER_TYPE >", value, "listenerType");
            return this;
        }

        public Criteria andListenerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LISTENER_TYPE >=", value, "listenerType");
            return this;
        }

        public Criteria andListenerTypeLessThan(String value) {
            addCriterion("LISTENER_TYPE <", value, "listenerType");
            return this;
        }

        public Criteria andListenerTypeLessThanOrEqualTo(String value) {
            addCriterion("LISTENER_TYPE <=", value, "listenerType");
            return this;
        }

        public Criteria andListenerTypeLike(String value) {
            addCriterion("LISTENER_TYPE like", value, "listenerType");
            return this;
        }

        public Criteria andListenerTypeNotLike(String value) {
            addCriterion("LISTENER_TYPE not like", value, "listenerType");
            return this;
        }

        public Criteria andListenerTypeIn(List<String> values) {
            addCriterion("LISTENER_TYPE in", values, "listenerType");
            return this;
        }

        public Criteria andListenerTypeNotIn(List<String> values) {
            addCriterion("LISTENER_TYPE not in", values, "listenerType");
            return this;
        }

        public Criteria andListenerTypeBetween(String value1, String value2) {
            addCriterion("LISTENER_TYPE between", value1, value2, "listenerType");
            return this;
        }

        public Criteria andListenerTypeNotBetween(String value1, String value2) {
            addCriterion("LISTENER_TYPE not between", value1, value2, "listenerType");
            return this;
        }

        public Criteria andListenerNameIsNull() {
            addCriterion("LISTENER_NAME is null");
            return this;
        }

        public Criteria andListenerNameIsNotNull() {
            addCriterion("LISTENER_NAME is not null");
            return this;
        }

        public Criteria andListenerNameEqualTo(String value) {
            addCriterion("LISTENER_NAME =", value, "listenerName");
            return this;
        }

        public Criteria andListenerNameNotEqualTo(String value) {
            addCriterion("LISTENER_NAME <>", value, "listenerName");
            return this;
        }

        public Criteria andListenerNameGreaterThan(String value) {
            addCriterion("LISTENER_NAME >", value, "listenerName");
            return this;
        }

        public Criteria andListenerNameGreaterThanOrEqualTo(String value) {
            addCriterion("LISTENER_NAME >=", value, "listenerName");
            return this;
        }

        public Criteria andListenerNameLessThan(String value) {
            addCriterion("LISTENER_NAME <", value, "listenerName");
            return this;
        }

        public Criteria andListenerNameLessThanOrEqualTo(String value) {
            addCriterion("LISTENER_NAME <=", value, "listenerName");
            return this;
        }

        public Criteria andListenerNameLike(String value) {
            addCriterion("LISTENER_NAME like", value, "listenerName");
            return this;
        }

        public Criteria andListenerNameNotLike(String value) {
            addCriterion("LISTENER_NAME not like", value, "listenerName");
            return this;
        }

        public Criteria andListenerNameIn(List<String> values) {
            addCriterion("LISTENER_NAME in", values, "listenerName");
            return this;
        }

        public Criteria andListenerNameNotIn(List<String> values) {
            addCriterion("LISTENER_NAME not in", values, "listenerName");
            return this;
        }

        public Criteria andListenerNameBetween(String value1, String value2) {
            addCriterion("LISTENER_NAME between", value1, value2, "listenerName");
            return this;
        }

        public Criteria andListenerNameNotBetween(String value1, String value2) {
            addCriterion("LISTENER_NAME not between", value1, value2, "listenerName");
            return this;
        }

        public Criteria andListenerSignIsNull() {
            addCriterion("LISTENER_SIGN is null");
            return this;
        }

        public Criteria andListenerSignIsNotNull() {
            addCriterion("LISTENER_SIGN is not null");
            return this;
        }

        public Criteria andListenerSignEqualTo(String value) {
            addCriterion("LISTENER_SIGN =", value, "listenerSign");
            return this;
        }

        public Criteria andListenerSignNotEqualTo(String value) {
            addCriterion("LISTENER_SIGN <>", value, "listenerSign");
            return this;
        }

        public Criteria andListenerSignGreaterThan(String value) {
            addCriterion("LISTENER_SIGN >", value, "listenerSign");
            return this;
        }

        public Criteria andListenerSignGreaterThanOrEqualTo(String value) {
            addCriterion("LISTENER_SIGN >=", value, "listenerSign");
            return this;
        }

        public Criteria andListenerSignLessThan(String value) {
            addCriterion("LISTENER_SIGN <", value, "listenerSign");
            return this;
        }

        public Criteria andListenerSignLessThanOrEqualTo(String value) {
            addCriterion("LISTENER_SIGN <=", value, "listenerSign");
            return this;
        }

        public Criteria andListenerSignLike(String value) {
            addCriterion("LISTENER_SIGN like", value, "listenerSign");
            return this;
        }

        public Criteria andListenerSignNotLike(String value) {
            addCriterion("LISTENER_SIGN not like", value, "listenerSign");
            return this;
        }

        public Criteria andListenerSignIn(List<String> values) {
            addCriterion("LISTENER_SIGN in", values, "listenerSign");
            return this;
        }

        public Criteria andListenerSignNotIn(List<String> values) {
            addCriterion("LISTENER_SIGN not in", values, "listenerSign");
            return this;
        }

        public Criteria andListenerSignBetween(String value1, String value2) {
            addCriterion("LISTENER_SIGN between", value1, value2, "listenerSign");
            return this;
        }

        public Criteria andListenerSignNotBetween(String value1, String value2) {
            addCriterion("LISTENER_SIGN not between", value1, value2, "listenerSign");
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