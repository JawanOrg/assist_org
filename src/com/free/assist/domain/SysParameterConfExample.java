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

public class SysParameterConfExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysParameterConfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysParameterConfExample(SysParameterConfExample example) {
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

        public Criteria andParIdIsNull() {
            addCriterion("PAR_ID is null");
            return this;
        }

        public Criteria andParIdIsNotNull() {
            addCriterion("PAR_ID is not null");
            return this;
        }

        public Criteria andParIdEqualTo(String value) {
            addCriterion("PAR_ID =", value, "parId");
            return this;
        }

        public Criteria andParIdNotEqualTo(String value) {
            addCriterion("PAR_ID <>", value, "parId");
            return this;
        }

        public Criteria andParIdGreaterThan(String value) {
            addCriterion("PAR_ID >", value, "parId");
            return this;
        }

        public Criteria andParIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAR_ID >=", value, "parId");
            return this;
        }

        public Criteria andParIdLessThan(String value) {
            addCriterion("PAR_ID <", value, "parId");
            return this;
        }

        public Criteria andParIdLessThanOrEqualTo(String value) {
            addCriterion("PAR_ID <=", value, "parId");
            return this;
        }

        public Criteria andParIdLike(String value) {
            addCriterion("PAR_ID like", value, "parId");
            return this;
        }

        public Criteria andParIdNotLike(String value) {
            addCriterion("PAR_ID not like", value, "parId");
            return this;
        }

        public Criteria andParIdIn(List<String> values) {
            addCriterion("PAR_ID in", values, "parId");
            return this;
        }

        public Criteria andParIdNotIn(List<String> values) {
            addCriterion("PAR_ID not in", values, "parId");
            return this;
        }

        public Criteria andParIdBetween(String value1, String value2) {
            addCriterion("PAR_ID between", value1, value2, "parId");
            return this;
        }

        public Criteria andParIdNotBetween(String value1, String value2) {
            addCriterion("PAR_ID not between", value1, value2, "parId");
            return this;
        }

        public Criteria andParNameIsNull() {
            addCriterion("PAR_NAME is null");
            return this;
        }

        public Criteria andParNameIsNotNull() {
            addCriterion("PAR_NAME is not null");
            return this;
        }

        public Criteria andParNameEqualTo(String value) {
            addCriterion("PAR_NAME =", value, "parName");
            return this;
        }

        public Criteria andParNameNotEqualTo(String value) {
            addCriterion("PAR_NAME <>", value, "parName");
            return this;
        }

        public Criteria andParNameGreaterThan(String value) {
            addCriterion("PAR_NAME >", value, "parName");
            return this;
        }

        public Criteria andParNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAR_NAME >=", value, "parName");
            return this;
        }

        public Criteria andParNameLessThan(String value) {
            addCriterion("PAR_NAME <", value, "parName");
            return this;
        }

        public Criteria andParNameLessThanOrEqualTo(String value) {
            addCriterion("PAR_NAME <=", value, "parName");
            return this;
        }

        public Criteria andParNameLike(String value) {
            addCriterion("PAR_NAME like", value, "parName");
            return this;
        }

        public Criteria andParNameNotLike(String value) {
            addCriterion("PAR_NAME not like", value, "parName");
            return this;
        }

        public Criteria andParNameIn(List<String> values) {
            addCriterion("PAR_NAME in", values, "parName");
            return this;
        }

        public Criteria andParNameNotIn(List<String> values) {
            addCriterion("PAR_NAME not in", values, "parName");
            return this;
        }

        public Criteria andParNameBetween(String value1, String value2) {
            addCriterion("PAR_NAME between", value1, value2, "parName");
            return this;
        }

        public Criteria andParNameNotBetween(String value1, String value2) {
            addCriterion("PAR_NAME not between", value1, value2, "parName");
            return this;
        }

        public Criteria andParValueIsNull() {
            addCriterion("PAR_VALUE is null");
            return this;
        }

        public Criteria andParValueIsNotNull() {
            addCriterion("PAR_VALUE is not null");
            return this;
        }

        public Criteria andParValueEqualTo(String value) {
            addCriterion("PAR_VALUE =", value, "parValue");
            return this;
        }

        public Criteria andParValueNotEqualTo(String value) {
            addCriterion("PAR_VALUE <>", value, "parValue");
            return this;
        }

        public Criteria andParValueGreaterThan(String value) {
            addCriterion("PAR_VALUE >", value, "parValue");
            return this;
        }

        public Criteria andParValueGreaterThanOrEqualTo(String value) {
            addCriterion("PAR_VALUE >=", value, "parValue");
            return this;
        }

        public Criteria andParValueLessThan(String value) {
            addCriterion("PAR_VALUE <", value, "parValue");
            return this;
        }

        public Criteria andParValueLessThanOrEqualTo(String value) {
            addCriterion("PAR_VALUE <=", value, "parValue");
            return this;
        }

        public Criteria andParValueLike(String value) {
            addCriterion("PAR_VALUE like", value, "parValue");
            return this;
        }

        public Criteria andParValueNotLike(String value) {
            addCriterion("PAR_VALUE not like", value, "parValue");
            return this;
        }

        public Criteria andParValueIn(List<String> values) {
            addCriterion("PAR_VALUE in", values, "parValue");
            return this;
        }

        public Criteria andParValueNotIn(List<String> values) {
            addCriterion("PAR_VALUE not in", values, "parValue");
            return this;
        }

        public Criteria andParValueBetween(String value1, String value2) {
            addCriterion("PAR_VALUE between", value1, value2, "parValue");
            return this;
        }

        public Criteria andParValueNotBetween(String value1, String value2) {
            addCriterion("PAR_VALUE not between", value1, value2, "parValue");
            return this;
        }

        public Criteria andParDescIsNull() {
            addCriterion("PAR_DESC is null");
            return this;
        }

        public Criteria andParDescIsNotNull() {
            addCriterion("PAR_DESC is not null");
            return this;
        }

        public Criteria andParDescEqualTo(String value) {
            addCriterion("PAR_DESC =", value, "parDesc");
            return this;
        }

        public Criteria andParDescNotEqualTo(String value) {
            addCriterion("PAR_DESC <>", value, "parDesc");
            return this;
        }

        public Criteria andParDescGreaterThan(String value) {
            addCriterion("PAR_DESC >", value, "parDesc");
            return this;
        }

        public Criteria andParDescGreaterThanOrEqualTo(String value) {
            addCriterion("PAR_DESC >=", value, "parDesc");
            return this;
        }

        public Criteria andParDescLessThan(String value) {
            addCriterion("PAR_DESC <", value, "parDesc");
            return this;
        }

        public Criteria andParDescLessThanOrEqualTo(String value) {
            addCriterion("PAR_DESC <=", value, "parDesc");
            return this;
        }

        public Criteria andParDescLike(String value) {
            addCriterion("PAR_DESC like", value, "parDesc");
            return this;
        }

        public Criteria andParDescNotLike(String value) {
            addCriterion("PAR_DESC not like", value, "parDesc");
            return this;
        }

        public Criteria andParDescIn(List<String> values) {
            addCriterion("PAR_DESC in", values, "parDesc");
            return this;
        }

        public Criteria andParDescNotIn(List<String> values) {
            addCriterion("PAR_DESC not in", values, "parDesc");
            return this;
        }

        public Criteria andParDescBetween(String value1, String value2) {
            addCriterion("PAR_DESC between", value1, value2, "parDesc");
            return this;
        }

        public Criteria andParDescNotBetween(String value1, String value2) {
            addCriterion("PAR_DESC not between", value1, value2, "parDesc");
            return this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("IS_VALID =", value, "isValid");
            return this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("IS_VALID >", value, "isValid");
            return this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("IS_VALID <", value, "isValid");
            return this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("IS_VALID like", value, "isValid");
            return this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("IS_VALID not like", value, "isValid");
            return this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return this;
        }
    }
}