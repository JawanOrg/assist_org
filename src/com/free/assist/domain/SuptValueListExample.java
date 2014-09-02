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

public class SuptValueListExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptValueListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptValueListExample(SuptValueListExample example) {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("sv.order_id is null");
            return this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("sv.order_id is not null");
            return this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("sv.order_id =", value, "orderId");
            return this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("sv.order_id <>", value, "orderId");
            return this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("sv.order_id >", value, "orderId");
            return this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sv.order_id >=", value, "orderId");
            return this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("sv.order_id <", value, "orderId");
            return this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sv.order_id <=", value, "orderId");
            return this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("sv.order_id like", value, "orderId");
            return this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("sv.order_id not like", value, "orderId");
            return this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("sv.order_id in", values, "orderId");
            return this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("sv.order_id not in", values, "orderId");
            return this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("sv.order_id between", value1, value2, "orderId");
            return this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("sv.order_id not between", value1, value2, "orderId");
            return this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("sv.bill_id is null");
            return this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("sv.bill_id is not null");
            return this;
        }

        public Criteria andBillIdEqualTo(String value) {
            addCriterion("sv.bill_id =", value, "billId");
            return this;
        }

        public Criteria andBillIdNotEqualTo(String value) {
            addCriterion("sv.bill_id <>", value, "billId");
            return this;
        }

        public Criteria andBillIdGreaterThan(String value) {
            addCriterion("sv.bill_id >", value, "billId");
            return this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("sv.bill_id >=", value, "billId");
            return this;
        }

        public Criteria andBillIdLessThan(String value) {
            addCriterion("sv.bill_id <", value, "billId");
            return this;
        }

        public Criteria andBillIdLessThanOrEqualTo(String value) {
            addCriterion("sv.bill_id <=", value, "billId");
            return this;
        }

        public Criteria andBillIdLike(String value) {
            addCriterion("sv.bill_id like", value, "billId");
            return this;
        }

        public Criteria andBillIdNotLike(String value) {
            addCriterion("sv.bill_id not like", value, "billId");
            return this;
        }

        public Criteria andBillIdIn(List<String> values) {
            addCriterion("sv.bill_id in", values, "billId");
            return this;
        }

        public Criteria andBillIdNotIn(List<String> values) {
            addCriterion("sv.bill_id not in", values, "billId");
            return this;
        }

        public Criteria andBillIdBetween(String value1, String value2) {
            addCriterion("sv.bill_id between", value1, value2, "billId");
            return this;
        }

        public Criteria andBillIdNotBetween(String value1, String value2) {
            addCriterion("sv.bill_id not between", value1, value2, "billId");
            return this;
        }

        public Criteria andDepenNodeIsNull() {
            addCriterion("sv.depen_node is null");
            return this;
        }

        public Criteria andDepenNodeIsNotNull() {
            addCriterion("sv.depen_node is not null");
            return this;
        }

        public Criteria andDepenNodeEqualTo(String value) {
            addCriterion("sv.depen_node =", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeNotEqualTo(String value) {
            addCriterion("sv.depen_node <>", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeGreaterThan(String value) {
            addCriterion("sv.depen_node >", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeGreaterThanOrEqualTo(String value) {
            addCriterion("sv.depen_node >=", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeLessThan(String value) {
            addCriterion("sv.depen_node <", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeLessThanOrEqualTo(String value) {
            addCriterion("sv.depen_node <=", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeLike(String value) {
            addCriterion("sv.depen_node like", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeNotLike(String value) {
            addCriterion("sv.depen_node not like", value, "depenNode");
            return this;
        }

        public Criteria andDepenNodeIn(List<String> values) {
            addCriterion("sv.depen_node in", values, "depenNode");
            return this;
        }

        public Criteria andDepenNodeNotIn(List<String> values) {
            addCriterion("sv.depen_node not in", values, "depenNode");
            return this;
        }

        public Criteria andDepenNodeBetween(String value1, String value2) {
            addCriterion("sv.depen_node between", value1, value2, "depenNode");
            return this;
        }

        public Criteria andDepenNodeNotBetween(String value1, String value2) {
            addCriterion("sv.depen_node not between", value1, value2, "depenNode");
            return this;
        }

        public Criteria andValuesIsNull() {
            addCriterion("sv.values is null");
            return this;
        }

        public Criteria andValuesIsNotNull() {
            addCriterion("sv.values is not null");
            return this;
        }

        public Criteria andValuesEqualTo(String value) {
            addCriterion("sv.values =", value, "values");
            return this;
        }

        public Criteria andValuesNotEqualTo(String value) {
            addCriterion("sv.values <>", value, "values");
            return this;
        }

        public Criteria andValuesGreaterThan(String value) {
            addCriterion("sv.values >", value, "values");
            return this;
        }

        public Criteria andValuesGreaterThanOrEqualTo(String value) {
            addCriterion("sv.values >=", value, "values");
            return this;
        }

        public Criteria andValuesLessThan(String value) {
            addCriterion("sv.values <", value, "values");
            return this;
        }

        public Criteria andValuesLessThanOrEqualTo(String value) {
            addCriterion("sv.values <=", value, "values");
            return this;
        }

        public Criteria andValuesLike(String value) {
            addCriterion("sv.values like", value, "values");
            return this;
        }

        public Criteria andValuesNotLike(String value) {
            addCriterion("sv.values not like", value, "values");
            return this;
        }

        public Criteria andValuesIn(List<String> values) {
            addCriterion("sv.values in", values, "values");
            return this;
        }

        public Criteria andValuesNotIn(List<String> values) {
            addCriterion("sv.values not in", values, "values");
            return this;
        }

        public Criteria andValuesBetween(String value1, String value2) {
            addCriterion("sv.values between", value1, value2, "values");
            return this;
        }

        public Criteria andValuesNotBetween(String value1, String value2) {
            addCriterion("sv.values not between", value1, value2, "values");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("sv.create_date is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("sv.create_date is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("sv.create_date =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("sv.create_date <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("sv.create_date >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sv.create_date >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("sv.create_date <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("sv.create_date <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("sv.create_date in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("sv.create_date not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("sv.create_date between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("sv.create_date not between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("sv.create_user is null");
            return this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("sv.create_user is not null");
            return this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("sv.create_user =", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("sv.create_user <>", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("sv.create_user >", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("sv.create_user >=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("sv.create_user <", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("sv.create_user <=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("sv.create_user like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("sv.create_user not like", value, "createUser");
            return this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("sv.create_user in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("sv.create_user not in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("sv.create_user between", value1, value2, "createUser");
            return this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("sv.create_user not between", value1, value2, "createUser");
            return this;
        }
    }
}