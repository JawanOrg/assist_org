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

public class SuptTaticRelationExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptTaticRelationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptTaticRelationExample(SuptTaticRelationExample example) {
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

        public Criteria andTacticrelationidIsNull() {
            addCriterion("t_supt_tactic_relation.tacticRelationId is null");
            return this;
        }

        public Criteria andTacticrelationidIsNotNull() {
            addCriterion("t_supt_tactic_relation.tacticRelationId is not null");
            return this;
        }

        public Criteria andTacticrelationidEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.tacticRelationId =", value, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidNotEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.tacticRelationId <>", value, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidGreaterThan(String value) {
            addCriterion("t_supt_tactic_relation.tacticRelationId >", value, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidGreaterThanOrEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.tacticRelationId >=", value, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidLessThan(String value) {
            addCriterion("t_supt_tactic_relation.tacticRelationId <", value, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidLessThanOrEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.tacticRelationId <=", value, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidLike(String value) {
            addCriterion("t_supt_tactic_relation.tacticRelationId like", value, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidNotLike(String value) {
            addCriterion("t_supt_tactic_relation.tacticRelationId not like", value, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidIn(List<String> values) {
            addCriterion("t_supt_tactic_relation.tacticRelationId in", values, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidNotIn(List<String> values) {
            addCriterion("t_supt_tactic_relation.tacticRelationId not in", values, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidBetween(String value1, String value2) {
            addCriterion("t_supt_tactic_relation.tacticRelationId between", value1, value2, "tacticrelationid");
            return this;
        }

        public Criteria andTacticrelationidNotBetween(String value1, String value2) {
            addCriterion("t_supt_tactic_relation.tacticRelationId not between", value1, value2, "tacticrelationid");
            return this;
        }

        public Criteria andTaticgoupidIsNull() {
            addCriterion("t_supt_tactic_relation.taticGoupId is null");
            return this;
        }

        public Criteria andTaticgoupidIsNotNull() {
            addCriterion("t_supt_tactic_relation.taticGoupId is not null");
            return this;
        }

        public Criteria andTaticgoupidEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.taticGoupId =", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.taticGoupId <>", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidGreaterThan(String value) {
            addCriterion("t_supt_tactic_relation.taticGoupId >", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidGreaterThanOrEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.taticGoupId >=", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLessThan(String value) {
            addCriterion("t_supt_tactic_relation.taticGoupId <", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLessThanOrEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.taticGoupId <=", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLike(String value) {
            addCriterion("t_supt_tactic_relation.taticGoupId like", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotLike(String value) {
            addCriterion("t_supt_tactic_relation.taticGoupId not like", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidIn(List<String> values) {
            addCriterion("t_supt_tactic_relation.taticGoupId in", values, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotIn(List<String> values) {
            addCriterion("t_supt_tactic_relation.taticGoupId not in", values, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidBetween(String value1, String value2) {
            addCriterion("t_supt_tactic_relation.taticGoupId between", value1, value2, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotBetween(String value1, String value2) {
            addCriterion("t_supt_tactic_relation.taticGoupId not between", value1, value2, "taticgoupid");
            return this;
        }

        public Criteria andElementidIsNull() {
            addCriterion("t_supt_tactic_relation.elementId is null");
            return this;
        }

        public Criteria andElementidIsNotNull() {
            addCriterion("t_supt_tactic_relation.elementId is not null");
            return this;
        }

        public Criteria andElementidEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.elementId =", value, "elementid");
            return this;
        }

        public Criteria andElementidNotEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.elementId <>", value, "elementid");
            return this;
        }

        public Criteria andElementidGreaterThan(String value) {
            addCriterion("t_supt_tactic_relation.elementId >", value, "elementid");
            return this;
        }

        public Criteria andElementidGreaterThanOrEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.elementId >=", value, "elementid");
            return this;
        }

        public Criteria andElementidLessThan(String value) {
            addCriterion("t_supt_tactic_relation.elementId <", value, "elementid");
            return this;
        }

        public Criteria andElementidLessThanOrEqualTo(String value) {
            addCriterion("t_supt_tactic_relation.elementId <=", value, "elementid");
            return this;
        }

        public Criteria andElementidLike(String value) {
            addCriterion("t_supt_tactic_relation.elementId like", value, "elementid");
            return this;
        }

        public Criteria andElementidNotLike(String value) {
            addCriterion("t_supt_tactic_relation.elementId not like", value, "elementid");
            return this;
        }

        public Criteria andElementidIn(List<String> values) {
            addCriterion("t_supt_tactic_relation.elementId in", values, "elementid");
            return this;
        }

        public Criteria andElementidNotIn(List<String> values) {
            addCriterion("t_supt_tactic_relation.elementId not in", values, "elementid");
            return this;
        }

        public Criteria andElementidBetween(String value1, String value2) {
            addCriterion("t_supt_tactic_relation.elementId between", value1, value2, "elementid");
            return this;
        }

        public Criteria andElementidNotBetween(String value1, String value2) {
            addCriterion("t_supt_tactic_relation.elementId not between", value1, value2, "elementid");
            return this;
        }
    }
}