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

public class SysRoleExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysRoleExample(SysRoleExample example) {
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

        public Criteria andRolenameIsNull() {
            addCriterion("RoleName is null");
            return this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("RoleName is not null");
            return this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("RoleName =", value, "rolename");
            return this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("RoleName <>", value, "rolename");
            return this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("RoleName >", value, "rolename");
            return this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("RoleName >=", value, "rolename");
            return this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("RoleName <", value, "rolename");
            return this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("RoleName <=", value, "rolename");
            return this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("RoleName like", value, "rolename");
            return this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("RoleName not like", value, "rolename");
            return this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("RoleName in", values, "rolename");
            return this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("RoleName not in", values, "rolename");
            return this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("RoleName between", value1, value2, "rolename");
            return this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("RoleName not between", value1, value2, "rolename");
            return this;
        }

        public Criteria andRoledescIsNull() {
            addCriterion("RoleDesc is null");
            return this;
        }

        public Criteria andRoledescIsNotNull() {
            addCriterion("RoleDesc is not null");
            return this;
        }

        public Criteria andRoledescEqualTo(String value) {
            addCriterion("RoleDesc =", value, "roledesc");
            return this;
        }

        public Criteria andRoledescNotEqualTo(String value) {
            addCriterion("RoleDesc <>", value, "roledesc");
            return this;
        }

        public Criteria andRoledescGreaterThan(String value) {
            addCriterion("RoleDesc >", value, "roledesc");
            return this;
        }

        public Criteria andRoledescGreaterThanOrEqualTo(String value) {
            addCriterion("RoleDesc >=", value, "roledesc");
            return this;
        }

        public Criteria andRoledescLessThan(String value) {
            addCriterion("RoleDesc <", value, "roledesc");
            return this;
        }

        public Criteria andRoledescLessThanOrEqualTo(String value) {
            addCriterion("RoleDesc <=", value, "roledesc");
            return this;
        }

        public Criteria andRoledescLike(String value) {
            addCriterion("RoleDesc like", value, "roledesc");
            return this;
        }

        public Criteria andRoledescNotLike(String value) {
            addCriterion("RoleDesc not like", value, "roledesc");
            return this;
        }

        public Criteria andRoledescIn(List<String> values) {
            addCriterion("RoleDesc in", values, "roledesc");
            return this;
        }

        public Criteria andRoledescNotIn(List<String> values) {
            addCriterion("RoleDesc not in", values, "roledesc");
            return this;
        }

        public Criteria andRoledescBetween(String value1, String value2) {
            addCriterion("RoleDesc between", value1, value2, "roledesc");
            return this;
        }

        public Criteria andRoledescNotBetween(String value1, String value2) {
            addCriterion("RoleDesc not between", value1, value2, "roledesc");
            return this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("Is_Valid is null");
            return this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("Is_Valid is not null");
            return this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("Is_Valid =", value, "isValid");
            return this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("Is_Valid <>", value, "isValid");
            return this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("Is_Valid >", value, "isValid");
            return this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("Is_Valid >=", value, "isValid");
            return this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("Is_Valid <", value, "isValid");
            return this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("Is_Valid <=", value, "isValid");
            return this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("Is_Valid like", value, "isValid");
            return this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("Is_Valid not like", value, "isValid");
            return this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("Is_Valid in", values, "isValid");
            return this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("Is_Valid not in", values, "isValid");
            return this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("Is_Valid between", value1, value2, "isValid");
            return this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("Is_Valid not between", value1, value2, "isValid");
            return this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("Sort_Order is null");
            return this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("Sort_Order is not null");
            return this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("Sort_Order =", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("Sort_Order <>", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("Sort_Order >", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sort_Order >=", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("Sort_Order <", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("Sort_Order <=", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("Sort_Order in", values, "sortOrder");
            return this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("Sort_Order not in", values, "sortOrder");
            return this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("Sort_Order between", value1, value2, "sortOrder");
            return this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("Sort_Order not between", value1, value2, "sortOrder");
            return this;
        }
    }
}