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

public class SuptTaticGroupExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptTaticGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptTaticGroupExample(SuptTaticGroupExample example) {
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

        public Criteria andTaticgoupidIsNull() {
            addCriterion("taticGoupId is null");
            return this;
        }

        public Criteria andTaticgoupidIsNotNull() {
            addCriterion("taticGoupId is not null");
            return this;
        }

        public Criteria andTaticgoupidEqualTo(String value) {
            addCriterion("taticGoupId =", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotEqualTo(String value) {
            addCriterion("taticGoupId <>", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidGreaterThan(String value) {
            addCriterion("taticGoupId >", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidGreaterThanOrEqualTo(String value) {
            addCriterion("taticGoupId >=", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLessThan(String value) {
            addCriterion("taticGoupId <", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLessThanOrEqualTo(String value) {
            addCriterion("taticGoupId <=", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLike(String value) {
            addCriterion("taticGoupId like", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotLike(String value) {
            addCriterion("taticGoupId not like", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidIn(List<String> values) {
            addCriterion("taticGoupId in", values, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotIn(List<String> values) {
            addCriterion("taticGoupId not in", values, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidBetween(String value1, String value2) {
            addCriterion("taticGoupId between", value1, value2, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotBetween(String value1, String value2) {
            addCriterion("taticGoupId not between", value1, value2, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupnameIsNull() {
            addCriterion("taticGoupName is null");
            return this;
        }

        public Criteria andTaticgoupnameIsNotNull() {
            addCriterion("taticGoupName is not null");
            return this;
        }

        public Criteria andTaticgoupnameEqualTo(String value) {
            addCriterion("taticGoupName =", value, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameNotEqualTo(String value) {
            addCriterion("taticGoupName <>", value, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameGreaterThan(String value) {
            addCriterion("taticGoupName >", value, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameGreaterThanOrEqualTo(String value) {
            addCriterion("taticGoupName >=", value, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameLessThan(String value) {
            addCriterion("taticGoupName <", value, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameLessThanOrEqualTo(String value) {
            addCriterion("taticGoupName <=", value, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameLike(String value) {
            addCriterion("taticGoupName like", value, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameNotLike(String value) {
            addCriterion("taticGoupName not like", value, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameIn(List<String> values) {
            addCriterion("taticGoupName in", values, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameNotIn(List<String> values) {
            addCriterion("taticGoupName not in", values, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameBetween(String value1, String value2) {
            addCriterion("taticGoupName between", value1, value2, "taticgoupname");
            return this;
        }

        public Criteria andTaticgoupnameNotBetween(String value1, String value2) {
            addCriterion("taticGoupName not between", value1, value2, "taticgoupname");
            return this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("priority =", value, "priority");
            return this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("priority <>", value, "priority");
            return this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("priority >", value, "priority");
            return this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("priority >=", value, "priority");
            return this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("priority <", value, "priority");
            return this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("priority <=", value, "priority");
            return this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("priority like", value, "priority");
            return this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("priority not like", value, "priority");
            return this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("priority in", values, "priority");
            return this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("priority not in", values, "priority");
            return this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("priority between", value1, value2, "priority");
            return this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return this;
        }
        public Criteria andTatictypeIsNull() {
            addCriterion("tatictype is null");
            return this;
        }

        public Criteria andTatictypeIsNotNull() {
            addCriterion("tatictype is not null");
            return this;
        }

        public Criteria andTatictypeEqualTo(String value) {
            addCriterion("tatictype =", value, "tatictype");
            return this;
        }

        public Criteria andTatictypeNotEqualTo(String value) {
            addCriterion("tatictype <>", value, "tatictype");
            return this;
        }

        public Criteria andTatictypeGreaterThan(String value) {
            addCriterion("tatictype >", value, "tatictype");
            return this;
        }

        public Criteria andTatictypeGreaterThanOrEqualTo(String value) {
            addCriterion("tatictype >=", value, "tatictype");
            return this;
        }

        public Criteria andTatictypeLessThan(String value) {
            addCriterion("tatictype <", value, "tatictype");
            return this;
        }

        public Criteria andTatictypeLessThanOrEqualTo(String value) {
            addCriterion("tatictype <=", value, "tatictype");
            return this;
        }

        public Criteria andTatictypeLike(String value) {
            addCriterion("tatictype like", value, "tatictype");
            return this;
        }

        public Criteria andTatictypeNotLike(String value) {
            addCriterion("tatictype not like", value, "tatictype");
            return this;
        }

        public Criteria andTatictypeIn(List<String> values) {
            addCriterion("tatictype in", values, "tatictype");
            return this;
        }

        public Criteria andTatictypeNotIn(List<String> values) {
            addCriterion("tatictype not in", values, "tatictype");
            return this;
        }

        public Criteria andTatictypeBetween(String value1, String value2) {
            addCriterion("tatictype between", value1, value2, "tatictype");
            return this;
        }

        public Criteria andTatictypeNotBetween(String value1, String value2) {
            addCriterion("tatictype not between", value1, value2, "tatictype");
            return this;
        }
    }
}