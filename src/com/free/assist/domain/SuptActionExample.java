/*
 * <p>标题: 中国电信OSS公共接口平台</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 天讯瑞达通信技术有限公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuptActionExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptActionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptActionExample(SuptActionExample example) {
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

        public Criteria andActionIdIsNull() {
            addCriterion("ACTION_ID is null");
            return this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("ACTION_ID is not null");
            return this;
        }

        public Criteria andActionIdEqualTo(String value) {
            addCriterion("ACTION_ID =", value, "actionId");
            return this;
        }

        public Criteria andActionIdNotEqualTo(String value) {
            addCriterion("ACTION_ID <>", value, "actionId");
            return this;
        }

        public Criteria andActionIdGreaterThan(String value) {
            addCriterion("ACTION_ID >", value, "actionId");
            return this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_ID >=", value, "actionId");
            return this;
        }

        public Criteria andActionIdLessThan(String value) {
            addCriterion("ACTION_ID <", value, "actionId");
            return this;
        }

        public Criteria andActionIdLessThanOrEqualTo(String value) {
            addCriterion("ACTION_ID <=", value, "actionId");
            return this;
        }

        public Criteria andActionIdLike(String value) {
            addCriterion("ACTION_ID like", value, "actionId");
            return this;
        }

        public Criteria andActionIdNotLike(String value) {
            addCriterion("ACTION_ID not like", value, "actionId");
            return this;
        }

        public Criteria andActionIdIn(List<String> values) {
            addCriterion("ACTION_ID in", values, "actionId");
            return this;
        }

        public Criteria andActionIdNotIn(List<String> values) {
            addCriterion("ACTION_ID not in", values, "actionId");
            return this;
        }

        public Criteria andActionIdBetween(String value1, String value2) {
            addCriterion("ACTION_ID between", value1, value2, "actionId");
            return this;
        }

        public Criteria andActionIdNotBetween(String value1, String value2) {
            addCriterion("ACTION_ID not between", value1, value2, "actionId");
            return this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("BILL_ID is null");
            return this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("BILL_ID is not null");
            return this;
        }

        public Criteria andBillIdEqualTo(String value) {
            addCriterion("BILL_ID =", value, "billId");
            return this;
        }

        public Criteria andBillIdNotEqualTo(String value) {
            addCriterion("BILL_ID <>", value, "billId");
            return this;
        }

        public Criteria andBillIdGreaterThan(String value) {
            addCriterion("BILL_ID >", value, "billId");
            return this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_ID >=", value, "billId");
            return this;
        }

        public Criteria andBillIdLessThan(String value) {
            addCriterion("BILL_ID <", value, "billId");
            return this;
        }

        public Criteria andBillIdLessThanOrEqualTo(String value) {
            addCriterion("BILL_ID <=", value, "billId");
            return this;
        }

        public Criteria andBillIdLike(String value) {
            addCriterion("BILL_ID like", value, "billId");
            return this;
        }

        public Criteria andBillIdNotLike(String value) {
            addCriterion("BILL_ID not like", value, "billId");
            return this;
        }

        public Criteria andBillIdIn(List<String> values) {
            addCriterion("BILL_ID in", values, "billId");
            return this;
        }

        public Criteria andBillIdNotIn(List<String> values) {
            addCriterion("BILL_ID not in", values, "billId");
            return this;
        }

        public Criteria andBillIdBetween(String value1, String value2) {
            addCriterion("BILL_ID between", value1, value2, "billId");
            return this;
        }

        public Criteria andBillIdNotBetween(String value1, String value2) {
            addCriterion("BILL_ID not between", value1, value2, "billId");
            return this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("BILL_STATUS is null");
            return this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("BILL_STATUS is not null");
            return this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("BILL_STATUS =", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("BILL_STATUS <>", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("BILL_STATUS >", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_STATUS >=", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("BILL_STATUS <", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("BILL_STATUS <=", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("BILL_STATUS like", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("BILL_STATUS not like", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("BILL_STATUS in", values, "billStatus");
            return this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("BILL_STATUS not in", values, "billStatus");
            return this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("BILL_STATUS between", value1, value2, "billStatus");
            return this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("BILL_STATUS not between", value1, value2, "billStatus");
            return this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("TASK_STATUS is null");
            return this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("TASK_STATUS is not null");
            return this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("TASK_STATUS =", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("TASK_STATUS <>", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("TASK_STATUS >", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS >=", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("TASK_STATUS <", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS <=", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("TASK_STATUS like", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("TASK_STATUS not like", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("TASK_STATUS in", values, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("TASK_STATUS not in", values, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("TASK_STATUS between", value1, value2, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS not between", value1, value2, "taskStatus");
            return this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("ACTION_TYPE is null");
            return this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("ACTION_TYPE is not null");
            return this;
        }

        public Criteria andActionTypeEqualTo(String value) {
            addCriterion("ACTION_TYPE =", value, "actionType");
            return this;
        }

        public Criteria andActionTypeNotEqualTo(String value) {
            addCriterion("ACTION_TYPE <>", value, "actionType");
            return this;
        }

        public Criteria andActionTypeGreaterThan(String value) {
            addCriterion("ACTION_TYPE >", value, "actionType");
            return this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_TYPE >=", value, "actionType");
            return this;
        }

        public Criteria andActionTypeLessThan(String value) {
            addCriterion("ACTION_TYPE <", value, "actionType");
            return this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(String value) {
            addCriterion("ACTION_TYPE <=", value, "actionType");
            return this;
        }

        public Criteria andActionTypeLike(String value) {
            addCriterion("ACTION_TYPE like", value, "actionType");
            return this;
        }

        public Criteria andActionTypeNotLike(String value) {
            addCriterion("ACTION_TYPE not like", value, "actionType");
            return this;
        }

        public Criteria andActionTypeIn(List<String> values) {
            addCriterion("ACTION_TYPE in", values, "actionType");
            return this;
        }

        public Criteria andActionTypeNotIn(List<String> values) {
            addCriterion("ACTION_TYPE not in", values, "actionType");
            return this;
        }

        public Criteria andActionTypeBetween(String value1, String value2) {
            addCriterion("ACTION_TYPE between", value1, value2, "actionType");
            return this;
        }

        public Criteria andActionTypeNotBetween(String value1, String value2) {
            addCriterion("ACTION_TYPE not between", value1, value2, "actionType");
            return this;
        }

        public Criteria andPreActionIdIsNull() {
            addCriterion("PRE_ACTION_ID is null");
            return this;
        }

        public Criteria andPreActionIdIsNotNull() {
            addCriterion("PRE_ACTION_ID is not null");
            return this;
        }

        public Criteria andPreActionIdEqualTo(String value) {
            addCriterion("PRE_ACTION_ID =", value, "preActionId");
            return this;
        }

        public Criteria andPreActionIdNotEqualTo(String value) {
            addCriterion("PRE_ACTION_ID <>", value, "preActionId");
            return this;
        }

        public Criteria andPreActionIdGreaterThan(String value) {
            addCriterion("PRE_ACTION_ID >", value, "preActionId");
            return this;
        }

        public Criteria andPreActionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_ACTION_ID >=", value, "preActionId");
            return this;
        }

        public Criteria andPreActionIdLessThan(String value) {
            addCriterion("PRE_ACTION_ID <", value, "preActionId");
            return this;
        }

        public Criteria andPreActionIdLessThanOrEqualTo(String value) {
            addCriterion("PRE_ACTION_ID <=", value, "preActionId");
            return this;
        }

        public Criteria andPreActionIdLike(String value) {
            addCriterion("PRE_ACTION_ID like", value, "preActionId");
            return this;
        }

        public Criteria andPreActionIdNotLike(String value) {
            addCriterion("PRE_ACTION_ID not like", value, "preActionId");
            return this;
        }

        public Criteria andPreActionIdIn(List<String> values) {
            addCriterion("PRE_ACTION_ID in", values, "preActionId");
            return this;
        }

        public Criteria andPreActionIdNotIn(List<String> values) {
            addCriterion("PRE_ACTION_ID not in", values, "preActionId");
            return this;
        }

        public Criteria andPreActionIdBetween(String value1, String value2) {
            addCriterion("PRE_ACTION_ID between", value1, value2, "preActionId");
            return this;
        }

        public Criteria andPreActionIdNotBetween(String value1, String value2) {
            addCriterion("PRE_ACTION_ID not between", value1, value2, "preActionId");
            return this;
        }

        public Criteria andAgentorIsNull() {
            addCriterion("AGENTOR is null");
            return this;
        }

        public Criteria andAgentorIsNotNull() {
            addCriterion("AGENTOR is not null");
            return this;
        }

        public Criteria andAgentorEqualTo(String value) {
            addCriterion("AGENTOR =", value, "agentor");
            return this;
        }

        public Criteria andAgentorNotEqualTo(String value) {
            addCriterion("AGENTOR <>", value, "agentor");
            return this;
        }

        public Criteria andAgentorGreaterThan(String value) {
            addCriterion("AGENTOR >", value, "agentor");
            return this;
        }

        public Criteria andAgentorGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTOR >=", value, "agentor");
            return this;
        }

        public Criteria andAgentorLessThan(String value) {
            addCriterion("AGENTOR <", value, "agentor");
            return this;
        }

        public Criteria andAgentorLessThanOrEqualTo(String value) {
            addCriterion("AGENTOR <=", value, "agentor");
            return this;
        }

        public Criteria andAgentorLike(String value) {
            addCriterion("AGENTOR like", value, "agentor");
            return this;
        }

        public Criteria andAgentorNotLike(String value) {
            addCriterion("AGENTOR not like", value, "agentor");
            return this;
        }

        public Criteria andAgentorIn(List<String> values) {
            addCriterion("AGENTOR in", values, "agentor");
            return this;
        }

        public Criteria andAgentorNotIn(List<String> values) {
            addCriterion("AGENTOR not in", values, "agentor");
            return this;
        }

        public Criteria andAgentorBetween(String value1, String value2) {
            addCriterion("AGENTOR between", value1, value2, "agentor");
            return this;
        }

        public Criteria andAgentorNotBetween(String value1, String value2) {
            addCriterion("AGENTOR not between", value1, value2, "agentor");
            return this;
        }

        public Criteria andAgentorGroupIsNull() {
            addCriterion("AGENTOR_GROUP is null");
            return this;
        }

        public Criteria andAgentorGroupIsNotNull() {
            addCriterion("AGENTOR_GROUP is not null");
            return this;
        }

        public Criteria andAgentorGroupEqualTo(String value) {
            addCriterion("AGENTOR_GROUP =", value, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupNotEqualTo(String value) {
            addCriterion("AGENTOR_GROUP <>", value, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupGreaterThan(String value) {
            addCriterion("AGENTOR_GROUP >", value, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTOR_GROUP >=", value, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupLessThan(String value) {
            addCriterion("AGENTOR_GROUP <", value, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupLessThanOrEqualTo(String value) {
            addCriterion("AGENTOR_GROUP <=", value, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupLike(String value) {
            addCriterion("AGENTOR_GROUP like", value, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupNotLike(String value) {
            addCriterion("AGENTOR_GROUP not like", value, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupIn(List<String> values) {
            addCriterion("AGENTOR_GROUP in", values, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupNotIn(List<String> values) {
            addCriterion("AGENTOR_GROUP not in", values, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupBetween(String value1, String value2) {
            addCriterion("AGENTOR_GROUP between", value1, value2, "agentorGroup");
            return this;
        }

        public Criteria andAgentorGroupNotBetween(String value1, String value2) {
            addCriterion("AGENTOR_GROUP not between", value1, value2, "agentorGroup");
            return this;
        }

        public Criteria andOperateMachineInfoIsNull() {
            addCriterion("OPERATE_MACHINE_INFO is null");
            return this;
        }

        public Criteria andOperateMachineInfoIsNotNull() {
            addCriterion("OPERATE_MACHINE_INFO is not null");
            return this;
        }

        public Criteria andOperateMachineInfoEqualTo(String value) {
            addCriterion("OPERATE_MACHINE_INFO =", value, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoNotEqualTo(String value) {
            addCriterion("OPERATE_MACHINE_INFO <>", value, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoGreaterThan(String value) {
            addCriterion("OPERATE_MACHINE_INFO >", value, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_MACHINE_INFO >=", value, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoLessThan(String value) {
            addCriterion("OPERATE_MACHINE_INFO <", value, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_MACHINE_INFO <=", value, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoLike(String value) {
            addCriterion("OPERATE_MACHINE_INFO like", value, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoNotLike(String value) {
            addCriterion("OPERATE_MACHINE_INFO not like", value, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoIn(List<String> values) {
            addCriterion("OPERATE_MACHINE_INFO in", values, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoNotIn(List<String> values) {
            addCriterion("OPERATE_MACHINE_INFO not in", values, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoBetween(String value1, String value2) {
            addCriterion("OPERATE_MACHINE_INFO between", value1, value2, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateMachineInfoNotBetween(String value1, String value2) {
            addCriterion("OPERATE_MACHINE_INFO not between", value1, value2, "operateMachineInfo");
            return this;
        }

        public Criteria andOperateWayIsNull() {
            addCriterion("OPERATE_WAY is null");
            return this;
        }

        public Criteria andOperateWayIsNotNull() {
            addCriterion("OPERATE_WAY is not null");
            return this;
        }

        public Criteria andOperateWayEqualTo(String value) {
            addCriterion("OPERATE_WAY =", value, "operateWay");
            return this;
        }

        public Criteria andOperateWayNotEqualTo(String value) {
            addCriterion("OPERATE_WAY <>", value, "operateWay");
            return this;
        }

        public Criteria andOperateWayGreaterThan(String value) {
            addCriterion("OPERATE_WAY >", value, "operateWay");
            return this;
        }

        public Criteria andOperateWayGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_WAY >=", value, "operateWay");
            return this;
        }

        public Criteria andOperateWayLessThan(String value) {
            addCriterion("OPERATE_WAY <", value, "operateWay");
            return this;
        }

        public Criteria andOperateWayLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_WAY <=", value, "operateWay");
            return this;
        }

        public Criteria andOperateWayLike(String value) {
            addCriterion("OPERATE_WAY like", value, "operateWay");
            return this;
        }

        public Criteria andOperateWayNotLike(String value) {
            addCriterion("OPERATE_WAY not like", value, "operateWay");
            return this;
        }

        public Criteria andOperateWayIn(List<String> values) {
            addCriterion("OPERATE_WAY in", values, "operateWay");
            return this;
        }

        public Criteria andOperateWayNotIn(List<String> values) {
            addCriterion("OPERATE_WAY not in", values, "operateWay");
            return this;
        }

        public Criteria andOperateWayBetween(String value1, String value2) {
            addCriterion("OPERATE_WAY between", value1, value2, "operateWay");
            return this;
        }

        public Criteria andOperateWayNotBetween(String value1, String value2) {
            addCriterion("OPERATE_WAY not between", value1, value2, "operateWay");
            return this;
        }

        public Criteria andOperateDeptIsNull() {
            addCriterion("OPERATE_DEPT is null");
            return this;
        }

        public Criteria andOperateDeptIsNotNull() {
            addCriterion("OPERATE_DEPT is not null");
            return this;
        }

        public Criteria andOperateDeptEqualTo(String value) {
            addCriterion("OPERATE_DEPT =", value, "operateDept");
            return this;
        }

        public Criteria andOperateDeptNotEqualTo(String value) {
            addCriterion("OPERATE_DEPT <>", value, "operateDept");
            return this;
        }

        public Criteria andOperateDeptGreaterThan(String value) {
            addCriterion("OPERATE_DEPT >", value, "operateDept");
            return this;
        }

        public Criteria andOperateDeptGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_DEPT >=", value, "operateDept");
            return this;
        }

        public Criteria andOperateDeptLessThan(String value) {
            addCriterion("OPERATE_DEPT <", value, "operateDept");
            return this;
        }

        public Criteria andOperateDeptLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_DEPT <=", value, "operateDept");
            return this;
        }

        public Criteria andOperateDeptLike(String value) {
            addCriterion("OPERATE_DEPT like", value, "operateDept");
            return this;
        }

        public Criteria andOperateDeptNotLike(String value) {
            addCriterion("OPERATE_DEPT not like", value, "operateDept");
            return this;
        }

        public Criteria andOperateDeptIn(List<String> values) {
            addCriterion("OPERATE_DEPT in", values, "operateDept");
            return this;
        }

        public Criteria andOperateDeptNotIn(List<String> values) {
            addCriterion("OPERATE_DEPT not in", values, "operateDept");
            return this;
        }

        public Criteria andOperateDeptBetween(String value1, String value2) {
            addCriterion("OPERATE_DEPT between", value1, value2, "operateDept");
            return this;
        }

        public Criteria andOperateDeptNotBetween(String value1, String value2) {
            addCriterion("OPERATE_DEPT not between", value1, value2, "operateDept");
            return this;
        }

        public Criteria andNotifyModeIsNull() {
            addCriterion("NOTIFY_MODE is null");
            return this;
        }

        public Criteria andNotifyModeIsNotNull() {
            addCriterion("NOTIFY_MODE is not null");
            return this;
        }

        public Criteria andNotifyModeEqualTo(String value) {
            addCriterion("NOTIFY_MODE =", value, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeNotEqualTo(String value) {
            addCriterion("NOTIFY_MODE <>", value, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeGreaterThan(String value) {
            addCriterion("NOTIFY_MODE >", value, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_MODE >=", value, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeLessThan(String value) {
            addCriterion("NOTIFY_MODE <", value, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_MODE <=", value, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeLike(String value) {
            addCriterion("NOTIFY_MODE like", value, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeNotLike(String value) {
            addCriterion("NOTIFY_MODE not like", value, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeIn(List<String> values) {
            addCriterion("NOTIFY_MODE in", values, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeNotIn(List<String> values) {
            addCriterion("NOTIFY_MODE not in", values, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeBetween(String value1, String value2) {
            addCriterion("NOTIFY_MODE between", value1, value2, "notifyMode");
            return this;
        }

        public Criteria andNotifyModeNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_MODE not between", value1, value2, "notifyMode");
            return this;
        }

        public Criteria andNotifyTypeIsNull() {
            addCriterion("NOTIFY_TYPE is null");
            return this;
        }

        public Criteria andNotifyTypeIsNotNull() {
            addCriterion("NOTIFY_TYPE is not null");
            return this;
        }

        public Criteria andNotifyTypeEqualTo(String value) {
            addCriterion("NOTIFY_TYPE =", value, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeNotEqualTo(String value) {
            addCriterion("NOTIFY_TYPE <>", value, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeGreaterThan(String value) {
            addCriterion("NOTIFY_TYPE >", value, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_TYPE >=", value, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeLessThan(String value) {
            addCriterion("NOTIFY_TYPE <", value, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_TYPE <=", value, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeLike(String value) {
            addCriterion("NOTIFY_TYPE like", value, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeNotLike(String value) {
            addCriterion("NOTIFY_TYPE not like", value, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeIn(List<String> values) {
            addCriterion("NOTIFY_TYPE in", values, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeNotIn(List<String> values) {
            addCriterion("NOTIFY_TYPE not in", values, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeBetween(String value1, String value2) {
            addCriterion("NOTIFY_TYPE between", value1, value2, "notifyType");
            return this;
        }

        public Criteria andNotifyTypeNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_TYPE not between", value1, value2, "notifyType");
            return this;
        }

        public Criteria andNotifyContentIsNull() {
            addCriterion("NOTIFY_CONTENT is null");
            return this;
        }

        public Criteria andNotifyContentIsNotNull() {
            addCriterion("NOTIFY_CONTENT is not null");
            return this;
        }

        public Criteria andNotifyContentEqualTo(String value) {
            addCriterion("NOTIFY_CONTENT =", value, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentNotEqualTo(String value) {
            addCriterion("NOTIFY_CONTENT <>", value, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentGreaterThan(String value) {
            addCriterion("NOTIFY_CONTENT >", value, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_CONTENT >=", value, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentLessThan(String value) {
            addCriterion("NOTIFY_CONTENT <", value, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_CONTENT <=", value, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentLike(String value) {
            addCriterion("NOTIFY_CONTENT like", value, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentNotLike(String value) {
            addCriterion("NOTIFY_CONTENT not like", value, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentIn(List<String> values) {
            addCriterion("NOTIFY_CONTENT in", values, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentNotIn(List<String> values) {
            addCriterion("NOTIFY_CONTENT not in", values, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentBetween(String value1, String value2) {
            addCriterion("NOTIFY_CONTENT between", value1, value2, "notifyContent");
            return this;
        }

        public Criteria andNotifyContentNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_CONTENT not between", value1, value2, "notifyContent");
            return this;
        }

        public Criteria andNotifyOtherPhonesIsNull() {
            addCriterion("NOTIFY_OTHER_PHONES is null");
            return this;
        }

        public Criteria andNotifyOtherPhonesIsNotNull() {
            addCriterion("NOTIFY_OTHER_PHONES is not null");
            return this;
        }

        public Criteria andNotifyOtherPhonesEqualTo(String value) {
            addCriterion("NOTIFY_OTHER_PHONES =", value, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesNotEqualTo(String value) {
            addCriterion("NOTIFY_OTHER_PHONES <>", value, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesGreaterThan(String value) {
            addCriterion("NOTIFY_OTHER_PHONES >", value, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_OTHER_PHONES >=", value, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesLessThan(String value) {
            addCriterion("NOTIFY_OTHER_PHONES <", value, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_OTHER_PHONES <=", value, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesLike(String value) {
            addCriterion("NOTIFY_OTHER_PHONES like", value, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesNotLike(String value) {
            addCriterion("NOTIFY_OTHER_PHONES not like", value, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesIn(List<String> values) {
            addCriterion("NOTIFY_OTHER_PHONES in", values, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesNotIn(List<String> values) {
            addCriterion("NOTIFY_OTHER_PHONES not in", values, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesBetween(String value1, String value2) {
            addCriterion("NOTIFY_OTHER_PHONES between", value1, value2, "notifyOtherPhones");
            return this;
        }

        public Criteria andNotifyOtherPhonesNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_OTHER_PHONES not between", value1, value2, "notifyOtherPhones");
            return this;
        }

        public Criteria andLinksIsNull() {
            addCriterion("LINKS is null");
            return this;
        }

        public Criteria andLinksIsNotNull() {
            addCriterion("LINKS is not null");
            return this;
        }

        public Criteria andLinksEqualTo(String value) {
            addCriterion("LINKS =", value, "links");
            return this;
        }

        public Criteria andLinksNotEqualTo(String value) {
            addCriterion("LINKS <>", value, "links");
            return this;
        }

        public Criteria andLinksGreaterThan(String value) {
            addCriterion("LINKS >", value, "links");
            return this;
        }

        public Criteria andLinksGreaterThanOrEqualTo(String value) {
            addCriterion("LINKS >=", value, "links");
            return this;
        }

        public Criteria andLinksLessThan(String value) {
            addCriterion("LINKS <", value, "links");
            return this;
        }

        public Criteria andLinksLessThanOrEqualTo(String value) {
            addCriterion("LINKS <=", value, "links");
            return this;
        }

        public Criteria andLinksLike(String value) {
            addCriterion("LINKS like", value, "links");
            return this;
        }

        public Criteria andLinksNotLike(String value) {
            addCriterion("LINKS not like", value, "links");
            return this;
        }

        public Criteria andLinksIn(List<String> values) {
            addCriterion("LINKS in", values, "links");
            return this;
        }

        public Criteria andLinksNotIn(List<String> values) {
            addCriterion("LINKS not in", values, "links");
            return this;
        }

        public Criteria andLinksBetween(String value1, String value2) {
            addCriterion("LINKS between", value1, value2, "links");
            return this;
        }

        public Criteria andLinksNotBetween(String value1, String value2) {
            addCriterion("LINKS not between", value1, value2, "links");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("OPERATE_TIME is null");
            return this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("OPERATE_TIME is not null");
            return this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("OPERATE_TIME =", value, "operateTime");
            return this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("OPERATE_TIME <>", value, "operateTime");
            return this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("OPERATE_TIME >", value, "operateTime");
            return this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME >=", value, "operateTime");
            return this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("OPERATE_TIME <", value, "operateTime");
            return this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME <=", value, "operateTime");
            return this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("OPERATE_TIME in", values, "operateTime");
            return this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("OPERATE_TIME not in", values, "operateTime");
            return this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME between", value1, value2, "operateTime");
            return this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME not between", value1, value2, "operateTime");
            return this;
        }
    }
}