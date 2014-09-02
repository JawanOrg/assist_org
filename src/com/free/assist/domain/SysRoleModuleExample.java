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

public class SysRoleModuleExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysRoleModuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysRoleModuleExample(SysRoleModuleExample example) {
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

        public Criteria andRightidIsNull() {
            addCriterion("RightId is null");
            return this;
        }

        public Criteria andRightidIsNotNull() {
            addCriterion("RightId is not null");
            return this;
        }

        public Criteria andRightidEqualTo(String value) {
            addCriterion("RightId =", value, "rightid");
            return this;
        }

        public Criteria andRightidNotEqualTo(String value) {
            addCriterion("RightId <>", value, "rightid");
            return this;
        }

        public Criteria andRightidGreaterThan(String value) {
            addCriterion("RightId >", value, "rightid");
            return this;
        }

        public Criteria andRightidGreaterThanOrEqualTo(String value) {
            addCriterion("RightId >=", value, "rightid");
            return this;
        }

        public Criteria andRightidLessThan(String value) {
            addCriterion("RightId <", value, "rightid");
            return this;
        }

        public Criteria andRightidLessThanOrEqualTo(String value) {
            addCriterion("RightId <=", value, "rightid");
            return this;
        }

        public Criteria andRightidLike(String value) {
            addCriterion("RightId like", value, "rightid");
            return this;
        }

        public Criteria andRightidNotLike(String value) {
            addCriterion("RightId not like", value, "rightid");
            return this;
        }

        public Criteria andRightidIn(List<String> values) {
            addCriterion("RightId in", values, "rightid");
            return this;
        }

        public Criteria andRightidNotIn(List<String> values) {
            addCriterion("RightId not in", values, "rightid");
            return this;
        }

        public Criteria andRightidBetween(String value1, String value2) {
            addCriterion("RightId between", value1, value2, "rightid");
            return this;
        }

        public Criteria andRightidNotBetween(String value1, String value2) {
            addCriterion("RightId not between", value1, value2, "rightid");
            return this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("RoleId is null");
            return this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("RoleId is not null");
            return this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("RoleId =", value, "roleid");
            return this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("RoleId <>", value, "roleid");
            return this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("RoleId >", value, "roleid");
            return this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("RoleId >=", value, "roleid");
            return this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("RoleId <", value, "roleid");
            return this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("RoleId <=", value, "roleid");
            return this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("RoleId like", value, "roleid");
            return this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("RoleId not like", value, "roleid");
            return this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("RoleId in", values, "roleid");
            return this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("RoleId not in", values, "roleid");
            return this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("RoleId between", value1, value2, "roleid");
            return this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("RoleId not between", value1, value2, "roleid");
            return this;
        }
    }
}