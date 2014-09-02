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

public class SysUserRoleExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysUserRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysUserRoleExample(SysUserRoleExample example) {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("Role_Id is null");
            return this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("Role_Id is not null");
            return this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("Role_Id =", value, "roleId");
            return this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("Role_Id <>", value, "roleId");
            return this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("Role_Id >", value, "roleId");
            return this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("Role_Id >=", value, "roleId");
            return this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("Role_Id <", value, "roleId");
            return this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("Role_Id <=", value, "roleId");
            return this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("Role_Id like", value, "roleId");
            return this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("Role_Id not like", value, "roleId");
            return this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("Role_Id in", values, "roleId");
            return this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("Role_Id not in", values, "roleId");
            return this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("Role_Id between", value1, value2, "roleId");
            return this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("Role_Id not between", value1, value2, "roleId");
            return this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("User_Id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("User_Id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("User_Id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("User_Id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("User_Id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("User_Id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("User_Id like", value, "userId");
            return this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("User_Id not like", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("User_Id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("User_Id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
            return this;
        }
    }
}