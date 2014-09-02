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

public class SysUserUnitExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysUserUnitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysUserUnitExample(SysUserUnitExample example) {
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

        public Criteria andUnitIdIsNull() {
            addCriterion("Unit_Id is null");
            return this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("Unit_Id is not null");
            return this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("Unit_Id =", value, "unitId");
            return this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("Unit_Id <>", value, "unitId");
            return this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("Unit_Id >", value, "unitId");
            return this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("Unit_Id >=", value, "unitId");
            return this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("Unit_Id <", value, "unitId");
            return this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("Unit_Id <=", value, "unitId");
            return this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("Unit_Id like", value, "unitId");
            return this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("Unit_Id not like", value, "unitId");
            return this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("Unit_Id in", values, "unitId");
            return this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("Unit_Id not in", values, "unitId");
            return this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("Unit_Id between", value1, value2, "unitId");
            return this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("Unit_Id not between", value1, value2, "unitId");
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

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return this;
        }
    }
}