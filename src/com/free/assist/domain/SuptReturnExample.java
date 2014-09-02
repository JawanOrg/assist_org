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

public class SuptReturnExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptReturnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptReturnExample(SuptReturnExample example) {
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

        public Criteria andReturnIdIsNull() {
            addCriterion("return_id is null");
            return this;
        }

        public Criteria andReturnIdIsNotNull() {
            addCriterion("return_id is not null");
            return this;
        }

        public Criteria andReturnIdEqualTo(String value) {
            addCriterion("return_id =", value, "returnId");
            return this;
        }

        public Criteria andReturnIdNotEqualTo(String value) {
            addCriterion("return_id <>", value, "returnId");
            return this;
        }

        public Criteria andReturnIdGreaterThan(String value) {
            addCriterion("return_id >", value, "returnId");
            return this;
        }

        public Criteria andReturnIdGreaterThanOrEqualTo(String value) {
            addCriterion("return_id >=", value, "returnId");
            return this;
        }

        public Criteria andReturnIdLessThan(String value) {
            addCriterion("return_id <", value, "returnId");
            return this;
        }

        public Criteria andReturnIdLessThanOrEqualTo(String value) {
            addCriterion("return_id <=", value, "returnId");
            return this;
        }

        public Criteria andReturnIdLike(String value) {
            addCriterion("return_id like", value, "returnId");
            return this;
        }

        public Criteria andReturnIdNotLike(String value) {
            addCriterion("return_id not like", value, "returnId");
            return this;
        }

        public Criteria andReturnIdIn(List<String> values) {
            addCriterion("return_id in", values, "returnId");
            return this;
        }

        public Criteria andReturnIdNotIn(List<String> values) {
            addCriterion("return_id not in", values, "returnId");
            return this;
        }

        public Criteria andReturnIdBetween(String value1, String value2) {
            addCriterion("return_id between", value1, value2, "returnId");
            return this;
        }

        public Criteria andReturnIdNotBetween(String value1, String value2) {
            addCriterion("return_id not between", value1, value2, "returnId");
            return this;
        }

        public Criteria andMethodIdIsNull() {
            addCriterion("method_id is null");
            return this;
        }

        public Criteria andMethodIdIsNotNull() {
            addCriterion("method_id is not null");
            return this;
        }

        public Criteria andMethodIdEqualTo(String value) {
            addCriterion("method_id =", value, "methodId");
            return this;
        }

        public Criteria andMethodIdNotEqualTo(String value) {
            addCriterion("method_id <>", value, "methodId");
            return this;
        }

        public Criteria andMethodIdGreaterThan(String value) {
            addCriterion("method_id >", value, "methodId");
            return this;
        }

        public Criteria andMethodIdGreaterThanOrEqualTo(String value) {
            addCriterion("method_id >=", value, "methodId");
            return this;
        }

        public Criteria andMethodIdLessThan(String value) {
            addCriterion("method_id <", value, "methodId");
            return this;
        }

        public Criteria andMethodIdLessThanOrEqualTo(String value) {
            addCriterion("method_id <=", value, "methodId");
            return this;
        }

        public Criteria andMethodIdLike(String value) {
            addCriterion("method_id like", value, "methodId");
            return this;
        }

        public Criteria andMethodIdNotLike(String value) {
            addCriterion("method_id not like", value, "methodId");
            return this;
        }

        public Criteria andMethodIdIn(List<String> values) {
            addCriterion("method_id in", values, "methodId");
            return this;
        }

        public Criteria andMethodIdNotIn(List<String> values) {
            addCriterion("method_id not in", values, "methodId");
            return this;
        }

        public Criteria andMethodIdBetween(String value1, String value2) {
            addCriterion("method_id between", value1, value2, "methodId");
            return this;
        }

        public Criteria andMethodIdNotBetween(String value1, String value2) {
            addCriterion("method_id not between", value1, value2, "methodId");
            return this;
        }

        public Criteria andWorkitemIdIsNull() {
            addCriterion("workItem_id is null");
            return this;
        }

        public Criteria andWorkitemIdIsNotNull() {
            addCriterion("workItem_id is not null");
            return this;
        }

        public Criteria andWorkitemIdEqualTo(String value) {
            addCriterion("workItem_id =", value, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdNotEqualTo(String value) {
            addCriterion("workItem_id <>", value, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdGreaterThan(String value) {
            addCriterion("workItem_id >", value, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdGreaterThanOrEqualTo(String value) {
            addCriterion("workItem_id >=", value, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdLessThan(String value) {
            addCriterion("workItem_id <", value, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdLessThanOrEqualTo(String value) {
            addCriterion("workItem_id <=", value, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdLike(String value) {
            addCriterion("workItem_id like", value, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdNotLike(String value) {
            addCriterion("workItem_id not like", value, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdIn(List<String> values) {
            addCriterion("workItem_id in", values, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdNotIn(List<String> values) {
            addCriterion("workItem_id not in", values, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdBetween(String value1, String value2) {
            addCriterion("workItem_id between", value1, value2, "workitemId");
            return this;
        }

        public Criteria andWorkitemIdNotBetween(String value1, String value2) {
            addCriterion("workItem_id not between", value1, value2, "workitemId");
            return this;
        }

        public Criteria andOldworkIdIsNull() {
            addCriterion("oldwork_id is null");
            return this;
        }

        public Criteria andOldworkIdIsNotNull() {
            addCriterion("oldwork_id is not null");
            return this;
        }

        public Criteria andOldworkIdEqualTo(String value) {
            addCriterion("oldwork_id =", value, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdNotEqualTo(String value) {
            addCriterion("oldwork_id <>", value, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdGreaterThan(String value) {
            addCriterion("oldwork_id >", value, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdGreaterThanOrEqualTo(String value) {
            addCriterion("oldwork_id >=", value, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdLessThan(String value) {
            addCriterion("oldwork_id <", value, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdLessThanOrEqualTo(String value) {
            addCriterion("oldwork_id <=", value, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdLike(String value) {
            addCriterion("oldwork_id like", value, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdNotLike(String value) {
            addCriterion("oldwork_id not like", value, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdIn(List<String> values) {
            addCriterion("oldwork_id in", values, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdNotIn(List<String> values) {
            addCriterion("oldwork_id not in", values, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdBetween(String value1, String value2) {
            addCriterion("oldwork_id between", value1, value2, "oldworkId");
            return this;
        }

        public Criteria andOldworkIdNotBetween(String value1, String value2) {
            addCriterion("oldwork_id not between", value1, value2, "oldworkId");
            return this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userID =", value, "userid");
            return this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userID <>", value, "userid");
            return this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userID >", value, "userid");
            return this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userid");
            return this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userID <", value, "userid");
            return this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userid");
            return this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userID like", value, "userid");
            return this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userID not like", value, "userid");
            return this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userID in", values, "userid");
            return this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userID not in", values, "userid");
            return this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userid");
            return this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return this;
        }
    }
}