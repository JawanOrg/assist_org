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

public class SysAlarmExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysAlarmExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysAlarmExample(SysAlarmExample example) {
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

        public Criteria andAlarmIdIsNull() {
            addCriterion("alarm_id is null");
            return this;
        }

        public Criteria andAlarmIdIsNotNull() {
            addCriterion("alarm_id is not null");
            return this;
        }

        public Criteria andAlarmIdEqualTo(String value) {
            addCriterion("alarm_id =", value, "alarmId");
            return this;
        }

        public Criteria andAlarmIdNotEqualTo(String value) {
            addCriterion("alarm_id <>", value, "alarmId");
            return this;
        }

        public Criteria andAlarmIdGreaterThan(String value) {
            addCriterion("alarm_id >", value, "alarmId");
            return this;
        }

        public Criteria andAlarmIdGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_id >=", value, "alarmId");
            return this;
        }

        public Criteria andAlarmIdLessThan(String value) {
            addCriterion("alarm_id <", value, "alarmId");
            return this;
        }

        public Criteria andAlarmIdLessThanOrEqualTo(String value) {
            addCriterion("alarm_id <=", value, "alarmId");
            return this;
        }

        public Criteria andAlarmIdLike(String value) {
            addCriterion("alarm_id like", value, "alarmId");
            return this;
        }

        public Criteria andAlarmIdNotLike(String value) {
            addCriterion("alarm_id not like", value, "alarmId");
            return this;
        }

        public Criteria andAlarmIdIn(List<String> values) {
            addCriterion("alarm_id in", values, "alarmId");
            return this;
        }

        public Criteria andAlarmIdNotIn(List<String> values) {
            addCriterion("alarm_id not in", values, "alarmId");
            return this;
        }

        public Criteria andAlarmIdBetween(String value1, String value2) {
            addCriterion("alarm_id between", value1, value2, "alarmId");
            return this;
        }

        public Criteria andAlarmIdNotBetween(String value1, String value2) {
            addCriterion("alarm_id not between", value1, value2, "alarmId");
            return this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("BUSINESS_ID is null");
            return this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("BUSINESS_ID is not null");
            return this;
        }

        public Criteria andBusinessIdEqualTo(String value) {
            addCriterion("BUSINESS_ID =", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdNotEqualTo(String value) {
            addCriterion("BUSINESS_ID <>", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdGreaterThan(String value) {
            addCriterion("BUSINESS_ID >", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ID >=", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdLessThan(String value) {
            addCriterion("BUSINESS_ID <", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ID <=", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdLike(String value) {
            addCriterion("BUSINESS_ID like", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdNotLike(String value) {
            addCriterion("BUSINESS_ID not like", value, "businessId");
            return this;
        }

        public Criteria andBusinessIdIn(List<String> values) {
            addCriterion("BUSINESS_ID in", values, "businessId");
            return this;
        }

        public Criteria andBusinessIdNotIn(List<String> values) {
            addCriterion("BUSINESS_ID not in", values, "businessId");
            return this;
        }

        public Criteria andBusinessIdBetween(String value1, String value2) {
            addCriterion("BUSINESS_ID between", value1, value2, "businessId");
            return this;
        }

        public Criteria andBusinessIdNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_ID not between", value1, value2, "businessId");
            return this;
        }

        public Criteria andAlarmModeIsNull() {
            addCriterion("alarm_mode is null");
            return this;
        }

        public Criteria andAlarmModeIsNotNull() {
            addCriterion("alarm_mode is not null");
            return this;
        }

        public Criteria andAlarmModeEqualTo(String value) {
            addCriterion("alarm_mode =", value, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeNotEqualTo(String value) {
            addCriterion("alarm_mode <>", value, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeGreaterThan(String value) {
            addCriterion("alarm_mode >", value, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_mode >=", value, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeLessThan(String value) {
            addCriterion("alarm_mode <", value, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeLessThanOrEqualTo(String value) {
            addCriterion("alarm_mode <=", value, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeLike(String value) {
            addCriterion("alarm_mode like", value, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeNotLike(String value) {
            addCriterion("alarm_mode not like", value, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeIn(List<String> values) {
            addCriterion("alarm_mode in", values, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeNotIn(List<String> values) {
            addCriterion("alarm_mode not in", values, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeBetween(String value1, String value2) {
            addCriterion("alarm_mode between", value1, value2, "alarmMode");
            return this;
        }

        public Criteria andAlarmModeNotBetween(String value1, String value2) {
            addCriterion("alarm_mode not between", value1, value2, "alarmMode");
            return this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarm_type is null");
            return this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarm_type is not null");
            return this;
        }

        public Criteria andAlarmTypeEqualTo(String value) {
            addCriterion("alarm_type =", value, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeNotEqualTo(String value) {
            addCriterion("alarm_type <>", value, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeGreaterThan(String value) {
            addCriterion("alarm_type >", value, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_type >=", value, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeLessThan(String value) {
            addCriterion("alarm_type <", value, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(String value) {
            addCriterion("alarm_type <=", value, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeLike(String value) {
            addCriterion("alarm_type like", value, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeNotLike(String value) {
            addCriterion("alarm_type not like", value, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeIn(List<String> values) {
            addCriterion("alarm_type in", values, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeNotIn(List<String> values) {
            addCriterion("alarm_type not in", values, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeBetween(String value1, String value2) {
            addCriterion("alarm_type between", value1, value2, "alarmType");
            return this;
        }

        public Criteria andAlarmTypeNotBetween(String value1, String value2) {
            addCriterion("alarm_type not between", value1, value2, "alarmType");
            return this;
        }

        public Criteria andAlarmTimesIsNull() {
            addCriterion("alarm_times is null");
            return this;
        }

        public Criteria andAlarmTimesIsNotNull() {
            addCriterion("alarm_times is not null");
            return this;
        }

        public Criteria andAlarmTimesEqualTo(Integer value) {
            addCriterion("alarm_times =", value, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesNotEqualTo(Integer value) {
            addCriterion("alarm_times <>", value, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesGreaterThan(Integer value) {
            addCriterion("alarm_times >", value, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_times >=", value, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesLessThan(Integer value) {
            addCriterion("alarm_times <", value, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_times <=", value, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesIn(List<Integer> values) {
            addCriterion("alarm_times in", values, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesNotIn(List<Integer> values) {
            addCriterion("alarm_times not in", values, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesBetween(Integer value1, Integer value2) {
            addCriterion("alarm_times between", value1, value2, "alarmTimes");
            return this;
        }

        public Criteria andAlarmTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_times not between", value1, value2, "alarmTimes");
            return this;
        }

        public Criteria andAlarmContentIsNull() {
            addCriterion("alarm_content is null");
            return this;
        }

        public Criteria andAlarmContentIsNotNull() {
            addCriterion("alarm_content is not null");
            return this;
        }

        public Criteria andAlarmContentEqualTo(String value) {
            addCriterion("alarm_content =", value, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentNotEqualTo(String value) {
            addCriterion("alarm_content <>", value, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentGreaterThan(String value) {
            addCriterion("alarm_content >", value, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_content >=", value, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentLessThan(String value) {
            addCriterion("alarm_content <", value, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentLessThanOrEqualTo(String value) {
            addCriterion("alarm_content <=", value, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentLike(String value) {
            addCriterion("alarm_content like", value, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentNotLike(String value) {
            addCriterion("alarm_content not like", value, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentIn(List<String> values) {
            addCriterion("alarm_content in", values, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentNotIn(List<String> values) {
            addCriterion("alarm_content not in", values, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentBetween(String value1, String value2) {
            addCriterion("alarm_content between", value1, value2, "alarmContent");
            return this;
        }

        public Criteria andAlarmContentNotBetween(String value1, String value2) {
            addCriterion("alarm_content not between", value1, value2, "alarmContent");
            return this;
        }

        public Criteria andIsClearIsNull() {
            addCriterion("is_clear is null");
            return this;
        }

        public Criteria andIsClearIsNotNull() {
            addCriterion("is_clear is not null");
            return this;
        }

        public Criteria andIsClearEqualTo(String value) {
            addCriterion("is_clear =", value, "isClear");
            return this;
        }

        public Criteria andIsClearNotEqualTo(String value) {
            addCriterion("is_clear <>", value, "isClear");
            return this;
        }

        public Criteria andIsClearGreaterThan(String value) {
            addCriterion("is_clear >", value, "isClear");
            return this;
        }

        public Criteria andIsClearGreaterThanOrEqualTo(String value) {
            addCriterion("is_clear >=", value, "isClear");
            return this;
        }

        public Criteria andIsClearLessThan(String value) {
            addCriterion("is_clear <", value, "isClear");
            return this;
        }

        public Criteria andIsClearLessThanOrEqualTo(String value) {
            addCriterion("is_clear <=", value, "isClear");
            return this;
        }

        public Criteria andIsClearLike(String value) {
            addCriterion("is_clear like", value, "isClear");
            return this;
        }

        public Criteria andIsClearNotLike(String value) {
            addCriterion("is_clear not like", value, "isClear");
            return this;
        }

        public Criteria andIsClearIn(List<String> values) {
            addCriterion("is_clear in", values, "isClear");
            return this;
        }

        public Criteria andIsClearNotIn(List<String> values) {
            addCriterion("is_clear not in", values, "isClear");
            return this;
        }

        public Criteria andIsClearBetween(String value1, String value2) {
            addCriterion("is_clear between", value1, value2, "isClear");
            return this;
        }

        public Criteria andIsClearNotBetween(String value1, String value2) {
            addCriterion("is_clear not between", value1, value2, "isClear");
            return this;
        }

        public Criteria andTempIdIsNull() {
            addCriterion("temp_id is null");
            return this;
        }

        public Criteria andTempIdIsNotNull() {
            addCriterion("temp_id is not null");
            return this;
        }

        public Criteria andTempIdEqualTo(String value) {
            addCriterion("temp_id =", value, "tempId");
            return this;
        }

        public Criteria andTempIdNotEqualTo(String value) {
            addCriterion("temp_id <>", value, "tempId");
            return this;
        }

        public Criteria andTempIdGreaterThan(String value) {
            addCriterion("temp_id >", value, "tempId");
            return this;
        }

        public Criteria andTempIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_id >=", value, "tempId");
            return this;
        }

        public Criteria andTempIdLessThan(String value) {
            addCriterion("temp_id <", value, "tempId");
            return this;
        }

        public Criteria andTempIdLessThanOrEqualTo(String value) {
            addCriterion("temp_id <=", value, "tempId");
            return this;
        }

        public Criteria andTempIdLike(String value) {
            addCriterion("temp_id like", value, "tempId");
            return this;
        }

        public Criteria andTempIdNotLike(String value) {
            addCriterion("temp_id not like", value, "tempId");
            return this;
        }

        public Criteria andTempIdIn(List<String> values) {
            addCriterion("temp_id in", values, "tempId");
            return this;
        }

        public Criteria andTempIdNotIn(List<String> values) {
            addCriterion("temp_id not in", values, "tempId");
            return this;
        }

        public Criteria andTempIdBetween(String value1, String value2) {
            addCriterion("temp_id between", value1, value2, "tempId");
            return this;
        }

        public Criteria andTempIdNotBetween(String value1, String value2) {
            addCriterion("temp_id not between", value1, value2, "tempId");
            return this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return this;
        }

        public Criteria andAlarmObjectIsNull() {
            addCriterion("alarm_object is null");
            return this;
        }

        public Criteria andAlarmObjectIsNotNull() {
            addCriterion("alarm_object is not null");
            return this;
        }

        public Criteria andAlarmObjectEqualTo(String value) {
            addCriterion("alarm_object =", value, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectNotEqualTo(String value) {
            addCriterion("alarm_object <>", value, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectGreaterThan(String value) {
            addCriterion("alarm_object >", value, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_object >=", value, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectLessThan(String value) {
            addCriterion("alarm_object <", value, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectLessThanOrEqualTo(String value) {
            addCriterion("alarm_object <=", value, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectLike(String value) {
            addCriterion("alarm_object like", value, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectNotLike(String value) {
            addCriterion("alarm_object not like", value, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectIn(List<String> values) {
            addCriterion("alarm_object in", values, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectNotIn(List<String> values) {
            addCriterion("alarm_object not in", values, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectBetween(String value1, String value2) {
            addCriterion("alarm_object between", value1, value2, "alarmObject");
            return this;
        }

        public Criteria andAlarmObjectNotBetween(String value1, String value2) {
            addCriterion("alarm_object not between", value1, value2, "alarmObject");
            return this;
        }

        public Criteria andAlarmPersonStationIsNull() {
            addCriterion("ALARM_PERSON_STATION is null");
            return this;
        }

        public Criteria andAlarmPersonStationIsNotNull() {
            addCriterion("ALARM_PERSON_STATION is not null");
            return this;
        }

        public Criteria andAlarmPersonStationEqualTo(String value) {
            addCriterion("ALARM_PERSON_STATION =", value, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationNotEqualTo(String value) {
            addCriterion("ALARM_PERSON_STATION <>", value, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationGreaterThan(String value) {
            addCriterion("ALARM_PERSON_STATION >", value, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationGreaterThanOrEqualTo(String value) {
            addCriterion("ALARM_PERSON_STATION >=", value, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationLessThan(String value) {
            addCriterion("ALARM_PERSON_STATION <", value, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationLessThanOrEqualTo(String value) {
            addCriterion("ALARM_PERSON_STATION <=", value, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationLike(String value) {
            addCriterion("ALARM_PERSON_STATION like", value, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationNotLike(String value) {
            addCriterion("ALARM_PERSON_STATION not like", value, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationIn(List<String> values) {
            addCriterion("ALARM_PERSON_STATION in", values, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationNotIn(List<String> values) {
            addCriterion("ALARM_PERSON_STATION not in", values, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationBetween(String value1, String value2) {
            addCriterion("ALARM_PERSON_STATION between", value1, value2, "alarmPersonStation");
            return this;
        }

        public Criteria andAlarmPersonStationNotBetween(String value1, String value2) {
            addCriterion("ALARM_PERSON_STATION not between", value1, value2, "alarmPersonStation");
            return this;
        }

        public Criteria andLinkPageIsNull() {
            addCriterion("LINK_PAGE is null");
            return this;
        }

        public Criteria andLinkPageIsNotNull() {
            addCriterion("LINK_PAGE is not null");
            return this;
        }

        public Criteria andLinkPageEqualTo(String value) {
            addCriterion("LINK_PAGE =", value, "linkPage");
            return this;
        }

        public Criteria andLinkPageNotEqualTo(String value) {
            addCriterion("LINK_PAGE <>", value, "linkPage");
            return this;
        }

        public Criteria andLinkPageGreaterThan(String value) {
            addCriterion("LINK_PAGE >", value, "linkPage");
            return this;
        }

        public Criteria andLinkPageGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_PAGE >=", value, "linkPage");
            return this;
        }

        public Criteria andLinkPageLessThan(String value) {
            addCriterion("LINK_PAGE <", value, "linkPage");
            return this;
        }

        public Criteria andLinkPageLessThanOrEqualTo(String value) {
            addCriterion("LINK_PAGE <=", value, "linkPage");
            return this;
        }

        public Criteria andLinkPageLike(String value) {
            addCriterion("LINK_PAGE like", value, "linkPage");
            return this;
        }

        public Criteria andLinkPageNotLike(String value) {
            addCriterion("LINK_PAGE not like", value, "linkPage");
            return this;
        }

        public Criteria andLinkPageIn(List<String> values) {
            addCriterion("LINK_PAGE in", values, "linkPage");
            return this;
        }

        public Criteria andLinkPageNotIn(List<String> values) {
            addCriterion("LINK_PAGE not in", values, "linkPage");
            return this;
        }

        public Criteria andLinkPageBetween(String value1, String value2) {
            addCriterion("LINK_PAGE between", value1, value2, "linkPage");
            return this;
        }

        public Criteria andLinkPageNotBetween(String value1, String value2) {
            addCriterion("LINK_PAGE not between", value1, value2, "linkPage");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return this;
        }
    }
}