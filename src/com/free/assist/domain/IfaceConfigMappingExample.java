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

public class IfaceConfigMappingExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceConfigMappingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public IfaceConfigMappingExample(IfaceConfigMappingExample example) {
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

        public Criteria andMappingIdIsNull() {
            addCriterion("MAPPING_ID is null");
            return this;
        }

        public Criteria andMappingIdIsNotNull() {
            addCriterion("MAPPING_ID is not null");
            return this;
        }

        public Criteria andMappingIdEqualTo(String value) {
            addCriterion("MAPPING_ID =", value, "mappingId");
            return this;
        }

        public Criteria andMappingIdNotEqualTo(String value) {
            addCriterion("MAPPING_ID <>", value, "mappingId");
            return this;
        }

        public Criteria andMappingIdGreaterThan(String value) {
            addCriterion("MAPPING_ID >", value, "mappingId");
            return this;
        }

        public Criteria andMappingIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAPPING_ID >=", value, "mappingId");
            return this;
        }

        public Criteria andMappingIdLessThan(String value) {
            addCriterion("MAPPING_ID <", value, "mappingId");
            return this;
        }

        public Criteria andMappingIdLessThanOrEqualTo(String value) {
            addCriterion("MAPPING_ID <=", value, "mappingId");
            return this;
        }

        public Criteria andMappingIdLike(String value) {
            addCriterion("MAPPING_ID like", value, "mappingId");
            return this;
        }

        public Criteria andMappingIdNotLike(String value) {
            addCriterion("MAPPING_ID not like", value, "mappingId");
            return this;
        }

        public Criteria andMappingIdIn(List<String> values) {
            addCriterion("MAPPING_ID in", values, "mappingId");
            return this;
        }

        public Criteria andMappingIdNotIn(List<String> values) {
            addCriterion("MAPPING_ID not in", values, "mappingId");
            return this;
        }

        public Criteria andMappingIdBetween(String value1, String value2) {
            addCriterion("MAPPING_ID between", value1, value2, "mappingId");
            return this;
        }

        public Criteria andMappingIdNotBetween(String value1, String value2) {
            addCriterion("MAPPING_ID not between", value1, value2, "mappingId");
            return this;
        }

        public Criteria andSourcePidIsNull() {
            addCriterion("SOURCE_PID is null");
            return this;
        }

        public Criteria andSourcePidIsNotNull() {
            addCriterion("SOURCE_PID is not null");
            return this;
        }

        public Criteria andSourcePidEqualTo(String value) {
            addCriterion("SOURCE_PID =", value, "sourcePid");
            return this;
        }

        public Criteria andSourcePidNotEqualTo(String value) {
            addCriterion("SOURCE_PID <>", value, "sourcePid");
            return this;
        }

        public Criteria andSourcePidGreaterThan(String value) {
            addCriterion("SOURCE_PID >", value, "sourcePid");
            return this;
        }

        public Criteria andSourcePidGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_PID >=", value, "sourcePid");
            return this;
        }

        public Criteria andSourcePidLessThan(String value) {
            addCriterion("SOURCE_PID <", value, "sourcePid");
            return this;
        }

        public Criteria andSourcePidLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_PID <=", value, "sourcePid");
            return this;
        }

        public Criteria andSourcePidLike(String value) {
            addCriterion("SOURCE_PID like", value, "sourcePid");
            return this;
        }

        public Criteria andSourcePidNotLike(String value) {
            addCriterion("SOURCE_PID not like", value, "sourcePid");
            return this;
        }

        public Criteria andSourcePidIn(List<String> values) {
            addCriterion("SOURCE_PID in", values, "sourcePid");
            return this;
        }

        public Criteria andSourcePidNotIn(List<String> values) {
            addCriterion("SOURCE_PID not in", values, "sourcePid");
            return this;
        }

        public Criteria andSourcePidBetween(String value1, String value2) {
            addCriterion("SOURCE_PID between", value1, value2, "sourcePid");
            return this;
        }

        public Criteria andSourcePidNotBetween(String value1, String value2) {
            addCriterion("SOURCE_PID not between", value1, value2, "sourcePid");
            return this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("SOURCE_ID is null");
            return this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("SOURCE_ID is not null");
            return this;
        }

        public Criteria andSourceIdEqualTo(String value) {
            addCriterion("SOURCE_ID =", value, "sourceId");
            return this;
        }

        public Criteria andSourceIdNotEqualTo(String value) {
            addCriterion("SOURCE_ID <>", value, "sourceId");
            return this;
        }

        public Criteria andSourceIdGreaterThan(String value) {
            addCriterion("SOURCE_ID >", value, "sourceId");
            return this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID >=", value, "sourceId");
            return this;
        }

        public Criteria andSourceIdLessThan(String value) {
            addCriterion("SOURCE_ID <", value, "sourceId");
            return this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID <=", value, "sourceId");
            return this;
        }

        public Criteria andSourceIdLike(String value) {
            addCriterion("SOURCE_ID like", value, "sourceId");
            return this;
        }

        public Criteria andSourceIdNotLike(String value) {
            addCriterion("SOURCE_ID not like", value, "sourceId");
            return this;
        }

        public Criteria andSourceIdIn(List<String> values) {
            addCriterion("SOURCE_ID in", values, "sourceId");
            return this;
        }

        public Criteria andSourceIdNotIn(List<String> values) {
            addCriterion("SOURCE_ID not in", values, "sourceId");
            return this;
        }

        public Criteria andSourceIdBetween(String value1, String value2) {
            addCriterion("SOURCE_ID between", value1, value2, "sourceId");
            return this;
        }

        public Criteria andSourceIdNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ID not between", value1, value2, "sourceId");
            return this;
        }

        public Criteria andSourceSnIsNull() {
            addCriterion("SOURCE_SN is null");
            return this;
        }

        public Criteria andSourceSnIsNotNull() {
            addCriterion("SOURCE_SN is not null");
            return this;
        }

        public Criteria andSourceSnEqualTo(String value) {
            addCriterion("SOURCE_SN =", value, "sourceSn");
            return this;
        }

        public Criteria andSourceSnNotEqualTo(String value) {
            addCriterion("SOURCE_SN <>", value, "sourceSn");
            return this;
        }

        public Criteria andSourceSnGreaterThan(String value) {
            addCriterion("SOURCE_SN >", value, "sourceSn");
            return this;
        }

        public Criteria andSourceSnGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_SN >=", value, "sourceSn");
            return this;
        }

        public Criteria andSourceSnLessThan(String value) {
            addCriterion("SOURCE_SN <", value, "sourceSn");
            return this;
        }

        public Criteria andSourceSnLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_SN <=", value, "sourceSn");
            return this;
        }

        public Criteria andSourceSnLike(String value) {
            addCriterion("SOURCE_SN like", value, "sourceSn");
            return this;
        }

        public Criteria andSourceSnNotLike(String value) {
            addCriterion("SOURCE_SN not like", value, "sourceSn");
            return this;
        }

        public Criteria andSourceSnIn(List<String> values) {
            addCriterion("SOURCE_SN in", values, "sourceSn");
            return this;
        }

        public Criteria andSourceSnNotIn(List<String> values) {
            addCriterion("SOURCE_SN not in", values, "sourceSn");
            return this;
        }

        public Criteria andSourceSnBetween(String value1, String value2) {
            addCriterion("SOURCE_SN between", value1, value2, "sourceSn");
            return this;
        }

        public Criteria andSourceSnNotBetween(String value1, String value2) {
            addCriterion("SOURCE_SN not between", value1, value2, "sourceSn");
            return this;
        }

        public Criteria andSourceNameIsNull() {
            addCriterion("SOURCE_NAME is null");
            return this;
        }

        public Criteria andSourceNameIsNotNull() {
            addCriterion("SOURCE_NAME is not null");
            return this;
        }

        public Criteria andSourceNameEqualTo(String value) {
            addCriterion("SOURCE_NAME =", value, "sourceName");
            return this;
        }

        public Criteria andSourceNameNotEqualTo(String value) {
            addCriterion("SOURCE_NAME <>", value, "sourceName");
            return this;
        }

        public Criteria andSourceNameGreaterThan(String value) {
            addCriterion("SOURCE_NAME >", value, "sourceName");
            return this;
        }

        public Criteria andSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_NAME >=", value, "sourceName");
            return this;
        }

        public Criteria andSourceNameLessThan(String value) {
            addCriterion("SOURCE_NAME <", value, "sourceName");
            return this;
        }

        public Criteria andSourceNameLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_NAME <=", value, "sourceName");
            return this;
        }

        public Criteria andSourceNameLike(String value) {
            addCriterion("SOURCE_NAME like", value, "sourceName");
            return this;
        }

        public Criteria andSourceNameNotLike(String value) {
            addCriterion("SOURCE_NAME not like", value, "sourceName");
            return this;
        }

        public Criteria andSourceNameIn(List<String> values) {
            addCriterion("SOURCE_NAME in", values, "sourceName");
            return this;
        }

        public Criteria andSourceNameNotIn(List<String> values) {
            addCriterion("SOURCE_NAME not in", values, "sourceName");
            return this;
        }

        public Criteria andSourceNameBetween(String value1, String value2) {
            addCriterion("SOURCE_NAME between", value1, value2, "sourceName");
            return this;
        }

        public Criteria andSourceNameNotBetween(String value1, String value2) {
            addCriterion("SOURCE_NAME not between", value1, value2, "sourceName");
            return this;
        }

        public Criteria andResultPidIsNull() {
            addCriterion("RESULT_PID is null");
            return this;
        }

        public Criteria andResultPidIsNotNull() {
            addCriterion("RESULT_PID is not null");
            return this;
        }

        public Criteria andResultPidEqualTo(String value) {
            addCriterion("RESULT_PID =", value, "resultPid");
            return this;
        }

        public Criteria andResultPidNotEqualTo(String value) {
            addCriterion("RESULT_PID <>", value, "resultPid");
            return this;
        }

        public Criteria andResultPidGreaterThan(String value) {
            addCriterion("RESULT_PID >", value, "resultPid");
            return this;
        }

        public Criteria andResultPidGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_PID >=", value, "resultPid");
            return this;
        }

        public Criteria andResultPidLessThan(String value) {
            addCriterion("RESULT_PID <", value, "resultPid");
            return this;
        }

        public Criteria andResultPidLessThanOrEqualTo(String value) {
            addCriterion("RESULT_PID <=", value, "resultPid");
            return this;
        }

        public Criteria andResultPidLike(String value) {
            addCriterion("RESULT_PID like", value, "resultPid");
            return this;
        }

        public Criteria andResultPidNotLike(String value) {
            addCriterion("RESULT_PID not like", value, "resultPid");
            return this;
        }

        public Criteria andResultPidIn(List<String> values) {
            addCriterion("RESULT_PID in", values, "resultPid");
            return this;
        }

        public Criteria andResultPidNotIn(List<String> values) {
            addCriterion("RESULT_PID not in", values, "resultPid");
            return this;
        }

        public Criteria andResultPidBetween(String value1, String value2) {
            addCriterion("RESULT_PID between", value1, value2, "resultPid");
            return this;
        }

        public Criteria andResultPidNotBetween(String value1, String value2) {
            addCriterion("RESULT_PID not between", value1, value2, "resultPid");
            return this;
        }

        public Criteria andResultIdIsNull() {
            addCriterion("RESULT_ID is null");
            return this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("RESULT_ID is not null");
            return this;
        }

        public Criteria andResultIdEqualTo(String value) {
            addCriterion("RESULT_ID =", value, "resultId");
            return this;
        }

        public Criteria andResultIdNotEqualTo(String value) {
            addCriterion("RESULT_ID <>", value, "resultId");
            return this;
        }

        public Criteria andResultIdGreaterThan(String value) {
            addCriterion("RESULT_ID >", value, "resultId");
            return this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_ID >=", value, "resultId");
            return this;
        }

        public Criteria andResultIdLessThan(String value) {
            addCriterion("RESULT_ID <", value, "resultId");
            return this;
        }

        public Criteria andResultIdLessThanOrEqualTo(String value) {
            addCriterion("RESULT_ID <=", value, "resultId");
            return this;
        }

        public Criteria andResultIdLike(String value) {
            addCriterion("RESULT_ID like", value, "resultId");
            return this;
        }

        public Criteria andResultIdNotLike(String value) {
            addCriterion("RESULT_ID not like", value, "resultId");
            return this;
        }

        public Criteria andResultIdIn(List<String> values) {
            addCriterion("RESULT_ID in", values, "resultId");
            return this;
        }

        public Criteria andResultIdNotIn(List<String> values) {
            addCriterion("RESULT_ID not in", values, "resultId");
            return this;
        }

        public Criteria andResultIdBetween(String value1, String value2) {
            addCriterion("RESULT_ID between", value1, value2, "resultId");
            return this;
        }

        public Criteria andResultIdNotBetween(String value1, String value2) {
            addCriterion("RESULT_ID not between", value1, value2, "resultId");
            return this;
        }

        public Criteria andResultSnIsNull() {
            addCriterion("RESULT_SN is null");
            return this;
        }

        public Criteria andResultSnIsNotNull() {
            addCriterion("RESULT_SN is not null");
            return this;
        }

        public Criteria andResultSnEqualTo(String value) {
            addCriterion("RESULT_SN =", value, "resultSn");
            return this;
        }

        public Criteria andResultSnNotEqualTo(String value) {
            addCriterion("RESULT_SN <>", value, "resultSn");
            return this;
        }

        public Criteria andResultSnGreaterThan(String value) {
            addCriterion("RESULT_SN >", value, "resultSn");
            return this;
        }

        public Criteria andResultSnGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_SN >=", value, "resultSn");
            return this;
        }

        public Criteria andResultSnLessThan(String value) {
            addCriterion("RESULT_SN <", value, "resultSn");
            return this;
        }

        public Criteria andResultSnLessThanOrEqualTo(String value) {
            addCriterion("RESULT_SN <=", value, "resultSn");
            return this;
        }

        public Criteria andResultSnLike(String value) {
            addCriterion("RESULT_SN like", value, "resultSn");
            return this;
        }

        public Criteria andResultSnNotLike(String value) {
            addCriterion("RESULT_SN not like", value, "resultSn");
            return this;
        }

        public Criteria andResultSnIn(List<String> values) {
            addCriterion("RESULT_SN in", values, "resultSn");
            return this;
        }

        public Criteria andResultSnNotIn(List<String> values) {
            addCriterion("RESULT_SN not in", values, "resultSn");
            return this;
        }

        public Criteria andResultSnBetween(String value1, String value2) {
            addCriterion("RESULT_SN between", value1, value2, "resultSn");
            return this;
        }

        public Criteria andResultSnNotBetween(String value1, String value2) {
            addCriterion("RESULT_SN not between", value1, value2, "resultSn");
            return this;
        }

        public Criteria andResultNameIsNull() {
            addCriterion("RESULT_NAME is null");
            return this;
        }

        public Criteria andResultNameIsNotNull() {
            addCriterion("RESULT_NAME is not null");
            return this;
        }

        public Criteria andResultNameEqualTo(String value) {
            addCriterion("RESULT_NAME =", value, "resultName");
            return this;
        }

        public Criteria andResultNameNotEqualTo(String value) {
            addCriterion("RESULT_NAME <>", value, "resultName");
            return this;
        }

        public Criteria andResultNameGreaterThan(String value) {
            addCriterion("RESULT_NAME >", value, "resultName");
            return this;
        }

        public Criteria andResultNameGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_NAME >=", value, "resultName");
            return this;
        }

        public Criteria andResultNameLessThan(String value) {
            addCriterion("RESULT_NAME <", value, "resultName");
            return this;
        }

        public Criteria andResultNameLessThanOrEqualTo(String value) {
            addCriterion("RESULT_NAME <=", value, "resultName");
            return this;
        }

        public Criteria andResultNameLike(String value) {
            addCriterion("RESULT_NAME like", value, "resultName");
            return this;
        }

        public Criteria andResultNameNotLike(String value) {
            addCriterion("RESULT_NAME not like", value, "resultName");
            return this;
        }

        public Criteria andResultNameIn(List<String> values) {
            addCriterion("RESULT_NAME in", values, "resultName");
            return this;
        }

        public Criteria andResultNameNotIn(List<String> values) {
            addCriterion("RESULT_NAME not in", values, "resultName");
            return this;
        }

        public Criteria andResultNameBetween(String value1, String value2) {
            addCriterion("RESULT_NAME between", value1, value2, "resultName");
            return this;
        }

        public Criteria andResultNameNotBetween(String value1, String value2) {
            addCriterion("RESULT_NAME not between", value1, value2, "resultName");
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
        
        public Criteria andCascadeSnEqualTo(String value) {
            addCriterion("CASCADE_SN =", value, "available");
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