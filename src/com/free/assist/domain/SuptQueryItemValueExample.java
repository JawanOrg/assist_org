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

public class SuptQueryItemValueExample  extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptQueryItemValueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptQueryItemValueExample(SuptQueryItemValueExample example) {
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

        public Criteria andItemCodeIsNull() {
            addCriterion("ITEM_CODE is null");
            return this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("ITEM_CODE is not null");
            return this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("ITEM_CODE =", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("ITEM_CODE <>", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("ITEM_CODE >", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE >=", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("ITEM_CODE <", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE <=", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("ITEM_CODE like", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("ITEM_CODE not like", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("ITEM_CODE in", values, "itemCode");
            return this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("ITEM_CODE not in", values, "itemCode");
            return this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("ITEM_CODE between", value1, value2, "itemCode");
            return this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("ITEM_CODE not between", value1, value2, "itemCode");
            return this;
        }

        public Criteria andModuleCodeIsNull() {
            addCriterion("MODULE_CODE is null");
            return this;
        }

        public Criteria andModuleCodeIsNotNull() {
            addCriterion("MODULE_CODE is not null");
            return this;
        }

        public Criteria andModuleCodeEqualTo(String value) {
            addCriterion("MODULE_CODE =", value, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeNotEqualTo(String value) {
            addCriterion("MODULE_CODE <>", value, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeGreaterThan(String value) {
            addCriterion("MODULE_CODE >", value, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_CODE >=", value, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeLessThan(String value) {
            addCriterion("MODULE_CODE <", value, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeLessThanOrEqualTo(String value) {
            addCriterion("MODULE_CODE <=", value, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeLike(String value) {
            addCriterion("MODULE_CODE like", value, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeNotLike(String value) {
            addCriterion("MODULE_CODE not like", value, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeIn(List<String> values) {
            addCriterion("MODULE_CODE in", values, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeNotIn(List<String> values) {
            addCriterion("MODULE_CODE not in", values, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeBetween(String value1, String value2) {
            addCriterion("MODULE_CODE between", value1, value2, "moduleCode");
            return this;
        }

        public Criteria andModuleCodeNotBetween(String value1, String value2) {
            addCriterion("MODULE_CODE not between", value1, value2, "moduleCode");
            return this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return this;
        }

        public Criteria andItemValueIsNull() {
            addCriterion("ITEM_VALUE is null");
            return this;
        }

        public Criteria andItemValueIsNotNull() {
            addCriterion("ITEM_VALUE is not null");
            return this;
        }

        public Criteria andItemValueEqualTo(String value) {
            addCriterion("ITEM_VALUE =", value, "itemValue");
            return this;
        }

        public Criteria andItemValueNotEqualTo(String value) {
            addCriterion("ITEM_VALUE <>", value, "itemValue");
            return this;
        }

        public Criteria andItemValueGreaterThan(String value) {
            addCriterion("ITEM_VALUE >", value, "itemValue");
            return this;
        }

        public Criteria andItemValueGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_VALUE >=", value, "itemValue");
            return this;
        }

        public Criteria andItemValueLessThan(String value) {
            addCriterion("ITEM_VALUE <", value, "itemValue");
            return this;
        }

        public Criteria andItemValueLessThanOrEqualTo(String value) {
            addCriterion("ITEM_VALUE <=", value, "itemValue");
            return this;
        }

        public Criteria andItemValueLike(String value) {
            addCriterion("ITEM_VALUE like", value, "itemValue");
            return this;
        }

        public Criteria andItemValueNotLike(String value) {
            addCriterion("ITEM_VALUE not like", value, "itemValue");
            return this;
        }

        public Criteria andItemValueIn(List<String> values) {
            addCriterion("ITEM_VALUE in", values, "itemValue");
            return this;
        }

        public Criteria andItemValueNotIn(List<String> values) {
            addCriterion("ITEM_VALUE not in", values, "itemValue");
            return this;
        }

        public Criteria andItemValueBetween(String value1, String value2) {
            addCriterion("ITEM_VALUE between", value1, value2, "itemValue");
            return this;
        }

        public Criteria andItemValueNotBetween(String value1, String value2) {
            addCriterion("ITEM_VALUE not between", value1, value2, "itemValue");
            return this;
        }
    }
}