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

public class IfaceLogRepairMixedExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceLogRepairMixedExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andRepairIdIsNull() {
            addCriterion("REPAIR_ID is null");
            return this;
        }

        public Criteria andRepairIdIsNotNull() {
            addCriterion("REPAIR_ID is not null");
            return this;
        }

        public Criteria andRepairIdEqualTo(String value) {
            addCriterion("REPAIR_ID =", value, "repairId");
            return this;
        }

        public Criteria andRepairIdNotEqualTo(String value) {
            addCriterion("REPAIR_ID <>", value, "repairId");
            return this;
        }

        public Criteria andRepairIdGreaterThan(String value) {
            addCriterion("REPAIR_ID >", value, "repairId");
            return this;
        }

        public Criteria andRepairIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_ID >=", value, "repairId");
            return this;
        }

        public Criteria andRepairIdLessThan(String value) {
            addCriterion("REPAIR_ID <", value, "repairId");
            return this;
        }

        public Criteria andRepairIdLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_ID <=", value, "repairId");
            return this;
        }

        public Criteria andRepairIdLike(String value) {
            addCriterion("REPAIR_ID like", value, "repairId");
            return this;
        }

        public Criteria andRepairIdNotLike(String value) {
            addCriterion("REPAIR_ID not like", value, "repairId");
            return this;
        }

        public Criteria andRepairIdIn(List<String> values) {
            addCriterion("REPAIR_ID in", values, "repairId");
            return this;
        }

        public Criteria andRepairIdNotIn(List<String> values) {
            addCriterion("REPAIR_ID not in", values, "repairId");
            return this;
        }

        public Criteria andRepairIdBetween(String value1, String value2) {
            addCriterion("REPAIR_ID between", value1, value2, "repairId");
            return this;
        }

        public Criteria andRepairIdNotBetween(String value1, String value2) {
            addCriterion("REPAIR_ID not between", value1, value2, "repairId");
            return this;
        }

        public Criteria andRepositoryIdIsNull() {
            addCriterion("REPOSITORY_ID is null");
            return this;
        }

        public Criteria andRepositoryIdIsNotNull() {
            addCriterion("REPOSITORY_ID is not null");
            return this;
        }

        public Criteria andRepositoryIdEqualTo(String value) {
            addCriterion("REPOSITORY_ID =", value, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdNotEqualTo(String value) {
            addCriterion("REPOSITORY_ID <>", value, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdGreaterThan(String value) {
            addCriterion("REPOSITORY_ID >", value, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPOSITORY_ID >=", value, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdLessThan(String value) {
            addCriterion("REPOSITORY_ID <", value, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdLessThanOrEqualTo(String value) {
            addCriterion("REPOSITORY_ID <=", value, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdLike(String value) {
            addCriterion("REPOSITORY_ID like", value, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdNotLike(String value) {
            addCriterion("REPOSITORY_ID not like", value, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdIn(List<String> values) {
            addCriterion("REPOSITORY_ID in", values, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdNotIn(List<String> values) {
            addCriterion("REPOSITORY_ID not in", values, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdBetween(String value1, String value2) {
            addCriterion("REPOSITORY_ID between", value1, value2, "repositoryId");
            return this;
        }

        public Criteria andRepositoryIdNotBetween(String value1, String value2) {
            addCriterion("REPOSITORY_ID not between", value1, value2, "repositoryId");
            return this;
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

        public Criteria andMethodNameIsNull() {
            addCriterion("METHOD_NAME is null");
            return this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("METHOD_NAME is not null");
            return this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("METHOD_NAME =", value, "methodName");
            return this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("METHOD_NAME <>", value, "methodName");
            return this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("METHOD_NAME >", value, "methodName");
            return this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME >=", value, "methodName");
            return this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("METHOD_NAME <", value, "methodName");
            return this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME <=", value, "methodName");
            return this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("METHOD_NAME like", value, "methodName");
            return this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("METHOD_NAME not like", value, "methodName");
            return this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("METHOD_NAME in", values, "methodName");
            return this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("METHOD_NAME not in", values, "methodName");
            return this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("METHOD_NAME between", value1, value2, "methodName");
            return this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("METHOD_NAME not between", value1, value2, "methodName");
            return this;
        }

        public Criteria andTraceIndicatorIsNull() {
            addCriterion("TRACE_INDICATOR is null");
            return this;
        }

        public Criteria andTraceIndicatorIsNotNull() {
            addCriterion("TRACE_INDICATOR is not null");
            return this;
        }

        public Criteria andTraceIndicatorEqualTo(String value) {
            addCriterion("TRACE_INDICATOR =", value, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorNotEqualTo(String value) {
            addCriterion("TRACE_INDICATOR <>", value, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorGreaterThan(String value) {
            addCriterion("TRACE_INDICATOR >", value, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorGreaterThanOrEqualTo(String value) {
            addCriterion("TRACE_INDICATOR >=", value, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorLessThan(String value) {
            addCriterion("TRACE_INDICATOR <", value, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorLessThanOrEqualTo(String value) {
            addCriterion("TRACE_INDICATOR <=", value, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorLike(String value) {
            addCriterion("TRACE_INDICATOR like", value, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorNotLike(String value) {
            addCriterion("TRACE_INDICATOR not like", value, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorIn(List<String> values) {
            addCriterion("TRACE_INDICATOR in", values, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorNotIn(List<String> values) {
            addCriterion("TRACE_INDICATOR not in", values, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorBetween(String value1, String value2) {
            addCriterion("TRACE_INDICATOR between", value1, value2, "traceIndicator");
            return this;
        }

        public Criteria andTraceIndicatorNotBetween(String value1, String value2) {
            addCriterion("TRACE_INDICATOR not between", value1, value2, "traceIndicator");
            return this;
        }

        public Criteria andTraceLevelIsNull() {
            addCriterion("TRACE_LEVEL is null");
            return this;
        }

        public Criteria andTraceLevelIsNotNull() {
            addCriterion("TRACE_LEVEL is not null");
            return this;
        }

        public Criteria andTraceLevelEqualTo(String value) {
            addCriterion("TRACE_LEVEL =", value, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelNotEqualTo(String value) {
            addCriterion("TRACE_LEVEL <>", value, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelGreaterThan(String value) {
            addCriterion("TRACE_LEVEL >", value, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelGreaterThanOrEqualTo(String value) {
            addCriterion("TRACE_LEVEL >=", value, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelLessThan(String value) {
            addCriterion("TRACE_LEVEL <", value, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelLessThanOrEqualTo(String value) {
            addCriterion("TRACE_LEVEL <=", value, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelLike(String value) {
            addCriterion("TRACE_LEVEL like", value, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelNotLike(String value) {
            addCriterion("TRACE_LEVEL not like", value, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelIn(List<String> values) {
            addCriterion("TRACE_LEVEL in", values, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelNotIn(List<String> values) {
            addCriterion("TRACE_LEVEL not in", values, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelBetween(String value1, String value2) {
            addCriterion("TRACE_LEVEL between", value1, value2, "traceLevel");
            return this;
        }

        public Criteria andTraceLevelNotBetween(String value1, String value2) {
            addCriterion("TRACE_LEVEL not between", value1, value2, "traceLevel");
            return this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
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

        public Criteria andFaultCauseIsNull() {
            addCriterion("FAULT_CAUSE is null");
            return this;
        }

        public Criteria andFaultCauseIsNotNull() {
            addCriterion("FAULT_CAUSE is not null");
            return this;
        }

        public Criteria andFaultCauseEqualTo(String value) {
            addCriterion("FAULT_CAUSE =", value, "faultCause");
            return this;
        }

        public Criteria andFaultCauseNotEqualTo(String value) {
            addCriterion("FAULT_CAUSE <>", value, "faultCause");
            return this;
        }

        public Criteria andFaultCauseGreaterThan(String value) {
            addCriterion("FAULT_CAUSE >", value, "faultCause");
            return this;
        }

        public Criteria andFaultCauseGreaterThanOrEqualTo(String value) {
            addCriterion("FAULT_CAUSE >=", value, "faultCause");
            return this;
        }

        public Criteria andFaultCauseLessThan(String value) {
            addCriterion("FAULT_CAUSE <", value, "faultCause");
            return this;
        }

        public Criteria andFaultCauseLessThanOrEqualTo(String value) {
            addCriterion("FAULT_CAUSE <=", value, "faultCause");
            return this;
        }

        public Criteria andFaultCauseLike(String value) {
            addCriterion("FAULT_CAUSE like", value, "faultCause");
            return this;
        }

        public Criteria andFaultCauseNotLike(String value) {
            addCriterion("FAULT_CAUSE not like", value, "faultCause");
            return this;
        }

        public Criteria andFaultCauseIn(List<String> values) {
            addCriterion("FAULT_CAUSE in", values, "faultCause");
            return this;
        }

        public Criteria andFaultCauseNotIn(List<String> values) {
            addCriterion("FAULT_CAUSE not in", values, "faultCause");
            return this;
        }

        public Criteria andFaultCauseBetween(String value1, String value2) {
            addCriterion("FAULT_CAUSE between", value1, value2, "faultCause");
            return this;
        }

        public Criteria andFaultCauseNotBetween(String value1, String value2) {
            addCriterion("FAULT_CAUSE not between", value1, value2, "faultCause");
            return this;
        }

        public Criteria andRepairUserIsNull() {
            addCriterion("REPAIR_BY is null");
            return this;
        }

        public Criteria andRepairUserIsNotNull() {
            addCriterion("REPAIR_BY is not null");
            return this;
        }

        public Criteria andRepairUserEqualTo(String value) {
            addCriterion("REPAIR_BY =", value, "repairUser");
            return this;
        }

        public Criteria andRepairUserNotEqualTo(String value) {
            addCriterion("REPAIR_BY <>", value, "repairUser");
            return this;
        }

        public Criteria andRepairUserGreaterThan(String value) {
            addCriterion("REPAIR_BY >", value, "repairUser");
            return this;
        }

        public Criteria andRepairUserGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_BY >=", value, "repairUser");
            return this;
        }

        public Criteria andRepairUserLessThan(String value) {
            addCriterion("REPAIR_BY <", value, "repairUser");
            return this;
        }

        public Criteria andRepairUserLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_BY <=", value, "repairUser");
            return this;
        }

        public Criteria andRepairUserLike(String value) {
            addCriterion("REPAIR_BY like", value, "repairUser");
            return this;
        }

        public Criteria andRepairUserNotLike(String value) {
            addCriterion("REPAIR_BY not like", value, "repairUser");
            return this;
        }

        public Criteria andRepairUserIn(List<String> values) {
            addCriterion("REPAIR_BY in", values, "repairUser");
            return this;
        }

        public Criteria andRepairUserNotIn(List<String> values) {
            addCriterion("REPAIR_BY not in", values, "repairUser");
            return this;
        }

        public Criteria andRepairUserBetween(String value1, String value2) {
            addCriterion("REPAIR_BY between", value1, value2, "repairUser");
            return this;
        }

        public Criteria andRepairUserNotBetween(String value1, String value2) {
            addCriterion("REPAIR_BY not between", value1, value2, "repairUser");
            return this;
        }

        public Criteria andRepairDateIsNull() {
            addCriterion("REPAIR_ON is null");
            return this;
        }

        public Criteria andRepairDateIsNotNull() {
            addCriterion("REPAIR_ON is not null");
            return this;
        }

        public Criteria andRepairDateEqualTo(Date value) {
            addCriterion("REPAIR_ON =", value, "repairDate");
            return this;
        }

        public Criteria andRepairDateNotEqualTo(Date value) {
            addCriterion("REPAIR_ON <>", value, "repairDate");
            return this;
        }

        public Criteria andRepairDateGreaterThan(Date value) {
            addCriterion("REPAIR_ON >", value, "repairDate");
            return this;
        }

        public Criteria andRepairDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPAIR_ON >=", value, "repairDate");
            return this;
        }

        public Criteria andRepairDateLessThan(Date value) {
            addCriterion("REPAIR_ON <", value, "repairDate");
            return this;
        }

        public Criteria andRepairDateLessThanOrEqualTo(Date value) {
            addCriterion("REPAIR_ON <=", value, "repairDate");
            return this;
        }

        public Criteria andRepairDateIn(List<Date> values) {
            addCriterion("REPAIR_ON in", values, "repairDate");
            return this;
        }

        public Criteria andRepairDateNotIn(List<Date> values) {
            addCriterion("REPAIR_ON not in", values, "repairDate");
            return this;
        }

        public Criteria andRepairDateBetween(Date value1, Date value2) {
            addCriterion("REPAIR_ON between", value1, value2, "repairDate");
            return this;
        }

        public Criteria andRepairDateNotBetween(Date value1, Date value2) {
            addCriterion("REPAIR_ON not between", value1, value2, "repairDate");
            return this;
        }

        public Criteria andCommitDateIsNull() {
            addCriterion("COMMIT_ON is null");
            return this;
        }

        public Criteria andCommitDateIsNotNull() {
            addCriterion("COMMIT_ON is not null");
            return this;
        }

        public Criteria andCommitDateEqualTo(Date value) {
            addCriterion("COMMIT_ON =", value, "commitDate");
            return this;
        }

        public Criteria andCommitDateNotEqualTo(Date value) {
            addCriterion("COMMIT_ON <>", value, "commitDate");
            return this;
        }

        public Criteria andCommitDateGreaterThan(Date value) {
            addCriterion("COMMIT_ON >", value, "commitDate");
            return this;
        }

        public Criteria andCommitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("COMMIT_ON >=", value, "commitDate");
            return this;
        }

        public Criteria andCommitDateLessThan(Date value) {
            addCriterion("COMMIT_ON <", value, "commitDate");
            return this;
        }

        public Criteria andCommitDateLessThanOrEqualTo(Date value) {
            addCriterion("COMMIT_ON <=", value, "commitDate");
            return this;
        }

        public Criteria andCommitDateIn(List<Date> values) {
            addCriterion("COMMIT_ON in", values, "commitDate");
            return this;
        }

        public Criteria andCommitDateNotIn(List<Date> values) {
            addCriterion("COMMIT_ON not in", values, "commitDate");
            return this;
        }

        public Criteria andCommitDateBetween(Date value1, Date value2) {
            addCriterion("COMMIT_ON between", value1, value2, "commitDate");
            return this;
        }

        public Criteria andCommitDateNotBetween(Date value1, Date value2) {
            addCriterion("COMMIT_ON not between", value1, value2, "commitDate");
            return this;
        }

        public Criteria andCommitUserIsNull() {
            addCriterion("COMMIT_BY is null");
            return this;
        }

        public Criteria andCommitUserIsNotNull() {
            addCriterion("COMMIT_BY is not null");
            return this;
        }

        public Criteria andCommitUserEqualTo(String value) {
            addCriterion("COMMIT_BY =", value, "commitUser");
            return this;
        }

        public Criteria andCommitUserNotEqualTo(String value) {
            addCriterion("COMMIT_BY <>", value, "commitUser");
            return this;
        }

        public Criteria andCommitUserGreaterThan(String value) {
            addCriterion("COMMIT_BY >", value, "commitUser");
            return this;
        }

        public Criteria andCommitUserGreaterThanOrEqualTo(String value) {
            addCriterion("COMMIT_BY >=", value, "commitUser");
            return this;
        }

        public Criteria andCommitUserLessThan(String value) {
            addCriterion("COMMIT_BY <", value, "commitUser");
            return this;
        }

        public Criteria andCommitUserLessThanOrEqualTo(String value) {
            addCriterion("COMMIT_BY <=", value, "commitUser");
            return this;
        }

        public Criteria andCommitUserLike(String value) {
            addCriterion("COMMIT_BY like", value, "commitUser");
            return this;
        }

        public Criteria andCommitUserNotLike(String value) {
            addCriterion("COMMIT_BY not like", value, "commitUser");
            return this;
        }

        public Criteria andCommitUserIn(List<String> values) {
            addCriterion("COMMIT_BY in", values, "commitUser");
            return this;
        }

        public Criteria andCommitUserNotIn(List<String> values) {
            addCriterion("COMMIT_BY not in", values, "commitUser");
            return this;
        }

        public Criteria andCommitUserBetween(String value1, String value2) {
            addCriterion("COMMIT_BY between", value1, value2, "commitUser");
            return this;
        }

        public Criteria andCommitUserNotBetween(String value1, String value2) {
            addCriterion("COMMIT_BY not between", value1, value2, "commitUser");
            return this;
        }
    }
}