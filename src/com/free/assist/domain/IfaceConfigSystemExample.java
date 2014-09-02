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

public class IfaceConfigSystemExample extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceConfigSystemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceConfigSystemExample(IfaceConfigSystemExample example) {
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

        public Criteria andApplicationIdIsNull() {
            addCriterion("APPLICATION_ID is null");
            return this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("APPLICATION_ID is not null");
            return this;
        }

        public Criteria andApplicationIdEqualTo(String value) {
            addCriterion("APPLICATION_ID =", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotEqualTo(String value) {
            addCriterion("APPLICATION_ID <>", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdGreaterThan(String value) {
            addCriterion("APPLICATION_ID >", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_ID >=", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLessThan(String value) {
            addCriterion("APPLICATION_ID <", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_ID <=", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLike(String value) {
            addCriterion("APPLICATION_ID like", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotLike(String value) {
            addCriterion("APPLICATION_ID not like", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdIn(List<String> values) {
            addCriterion("APPLICATION_ID in", values, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotIn(List<String> values) {
            addCriterion("APPLICATION_ID not in", values, "applicationId");
            return this;
        }

        public Criteria andApplicationIdBetween(String value1, String value2) {
            addCriterion("APPLICATION_ID between", value1, value2, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_ID not between", value1, value2, "applicationId");
            return this;
        }

        public Criteria andApplicationSnIsNull() {
            addCriterion("APPLICATION_SN is null");
            return this;
        }

        public Criteria andApplicationSnIsNotNull() {
            addCriterion("APPLICATION_SN is not null");
            return this;
        }

        public Criteria andApplicationSnEqualTo(String value) {
            addCriterion("APPLICATION_SN =", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnNotEqualTo(String value) {
            addCriterion("APPLICATION_SN <>", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnGreaterThan(String value) {
            addCriterion("APPLICATION_SN >", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_SN >=", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnLessThan(String value) {
            addCriterion("APPLICATION_SN <", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_SN <=", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnLike(String value) {
            addCriterion("APPLICATION_SN like", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnNotLike(String value) {
            addCriterion("APPLICATION_SN not like", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnIn(List<String> values) {
            addCriterion("APPLICATION_SN in", values, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnNotIn(List<String> values) {
            addCriterion("APPLICATION_SN not in", values, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnBetween(String value1, String value2) {
            addCriterion("APPLICATION_SN between", value1, value2, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_SN not between", value1, value2, "applicationSn");
            return this;
        }

        public Criteria andApplicationNameIsNull() {
            addCriterion("APPLICATION_NAME is null");
            return this;
        }

        public Criteria andApplicationNameIsNotNull() {
            addCriterion("APPLICATION_NAME is not null");
            return this;
        }

        public Criteria andApplicationNameEqualTo(String value) {
            addCriterion("APPLICATION_NAME =", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotEqualTo(String value) {
            addCriterion("APPLICATION_NAME <>", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameGreaterThan(String value) {
            addCriterion("APPLICATION_NAME >", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NAME >=", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLessThan(String value) {
            addCriterion("APPLICATION_NAME <", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NAME <=", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLike(String value) {
            addCriterion("APPLICATION_NAME like", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotLike(String value) {
            addCriterion("APPLICATION_NAME not like", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameIn(List<String> values) {
            addCriterion("APPLICATION_NAME in", values, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotIn(List<String> values) {
            addCriterion("APPLICATION_NAME not in", values, "applicationName");
            return this;
        }

        public Criteria andApplicationNameBetween(String value1, String value2) {
            addCriterion("APPLICATION_NAME between", value1, value2, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_NAME not between", value1, value2, "applicationName");
            return this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("IS_AVAILABLE is null");
            return this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("IS_AVAILABLE is not null");
            return this;
        }

        public Criteria andAvailableEqualTo(String value) {
            addCriterion("IS_AVAILABLE =", value, "available");
            return this;
        }

        public Criteria andAvailableNotEqualTo(String value) {
            addCriterion("IS_AVAILABLE <>", value, "available");
            return this;
        }

        public Criteria andAvailableGreaterThan(String value) {
            addCriterion("IS_AVAILABLE >", value, "available");
            return this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE >=", value, "available");
            return this;
        }

        public Criteria andAvailableLessThan(String value) {
            addCriterion("IS_AVAILABLE <", value, "available");
            return this;
        }

        public Criteria andAvailableLessThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE <=", value, "available");
            return this;
        }

        public Criteria andAvailableLike(String value) {
            addCriterion("IS_AVAILABLE like", value, "available");
            return this;
        }

        public Criteria andAvailableNotLike(String value) {
            addCriterion("IS_AVAILABLE not like", value, "available");
            return this;
        }

        public Criteria andAvailableIn(List<String> values) {
            addCriterion("IS_AVAILABLE in", values, "available");
            return this;
        }

        public Criteria andAvailableNotIn(List<String> values) {
            addCriterion("IS_AVAILABLE not in", values, "available");
            return this;
        }

        public Criteria andAvailableBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE between", value1, value2, "available");
            return this;
        }

        public Criteria andAvailableNotBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE not between", value1, value2, "available");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_ON is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_ON is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_ON =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_ON <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_ON >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_ON <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_ON in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_ON not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON not between", value1, value2, "createDate");
            return this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_ON is null");
            return this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_ON is not null");
            return this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_ON =", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_ON <>", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_ON >", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON >=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_ON <", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON <=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_ON in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_ON not in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON between", value1, value2, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON not between", value1, value2, "updateDate");
            return this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_BY is null");
            return this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateUser");
            return this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateUser");
            return this;
        }
    }
}