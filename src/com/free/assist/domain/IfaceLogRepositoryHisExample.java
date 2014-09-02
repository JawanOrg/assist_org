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

public class IfaceLogRepositoryHisExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceLogRepositoryHisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceLogRepositoryHisExample(IfaceLogRepositoryHisExample example) {
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

        public Criteria andRelateIdIsNull() {
            addCriterion("RELATE_ID is null");
            return this;
        }

        public Criteria andRelateIdIsNotNull() {
            addCriterion("RELATE_ID is not null");
            return this;
        }

        public Criteria andRelateIdEqualTo(String value) {
            addCriterion("RELATE_ID =", value, "relateId");
            return this;
        }

        public Criteria andRelateIdNotEqualTo(String value) {
            addCriterion("RELATE_ID <>", value, "relateId");
            return this;
        }

        public Criteria andRelateIdGreaterThan(String value) {
            addCriterion("RELATE_ID >", value, "relateId");
            return this;
        }

        public Criteria andRelateIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELATE_ID >=", value, "relateId");
            return this;
        }

        public Criteria andRelateIdLessThan(String value) {
            addCriterion("RELATE_ID <", value, "relateId");
            return this;
        }

        public Criteria andRelateIdLessThanOrEqualTo(String value) {
            addCriterion("RELATE_ID <=", value, "relateId");
            return this;
        }

        public Criteria andRelateIdLike(String value) {
            addCriterion("RELATE_ID like", value, "relateId");
            return this;
        }

        public Criteria andRelateIdNotLike(String value) {
            addCriterion("RELATE_ID not like", value, "relateId");
            return this;
        }

        public Criteria andRelateIdIn(List<String> values) {
            addCriterion("RELATE_ID in", values, "relateId");
            return this;
        }

        public Criteria andRelateIdNotIn(List<String> values) {
            addCriterion("RELATE_ID not in", values, "relateId");
            return this;
        }

        public Criteria andRelateIdBetween(String value1, String value2) {
            addCriterion("RELATE_ID between", value1, value2, "relateId");
            return this;
        }

        public Criteria andRelateIdNotBetween(String value1, String value2) {
            addCriterion("RELATE_ID not between", value1, value2, "relateId");
            return this;
        }

        public Criteria andSequenceIdIsNull() {
            addCriterion("SEQUENCE_ID is null");
            return this;
        }

        public Criteria andSequenceIdIsNotNull() {
            addCriterion("SEQUENCE_ID is not null");
            return this;
        }

        public Criteria andSequenceIdEqualTo(Integer value) {
            addCriterion("SEQUENCE_ID =", value, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdNotEqualTo(Integer value) {
            addCriterion("SEQUENCE_ID <>", value, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdGreaterThan(Integer value) {
            addCriterion("SEQUENCE_ID >", value, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE_ID >=", value, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdLessThan(Integer value) {
            addCriterion("SEQUENCE_ID <", value, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdLessThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE_ID <=", value, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdIn(List<Integer> values) {
            addCriterion("SEQUENCE_ID in", values, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdNotIn(List<Integer> values) {
            addCriterion("SEQUENCE_ID not in", values, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE_ID between", value1, value2, "sequenceId");
            return this;
        }

        public Criteria andSequenceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE_ID not between", value1, value2, "sequenceId");
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

        public Criteria andOrderSnIsNull() {
            addCriterion("ORDER_SN is null");
            return this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("ORDER_SN is not null");
            return this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("ORDER_SN =", value, "orderSn");
            return this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("ORDER_SN <>", value, "orderSn");
            return this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("ORDER_SN >", value, "orderSn");
            return this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SN >=", value, "orderSn");
            return this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("ORDER_SN <", value, "orderSn");
            return this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SN <=", value, "orderSn");
            return this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("ORDER_SN like", value, "orderSn");
            return this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("ORDER_SN not like", value, "orderSn");
            return this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("ORDER_SN in", values, "orderSn");
            return this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("ORDER_SN not in", values, "orderSn");
            return this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("ORDER_SN between", value1, value2, "orderSn");
            return this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("ORDER_SN not between", value1, value2, "orderSn");
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

        public Criteria andTraceTextIsNull() {
            addCriterion("TRACE_TEXT is null");
            return this;
        }

        public Criteria andTraceTextIsNotNull() {
            addCriterion("TRACE_TEXT is not null");
            return this;
        }

        public Criteria andTraceTextEqualTo(String value) {
            addCriterion("TRACE_TEXT =", value, "traceText");
            return this;
        }

        public Criteria andTraceTextNotEqualTo(String value) {
            addCriterion("TRACE_TEXT <>", value, "traceText");
            return this;
        }

        public Criteria andTraceTextGreaterThan(String value) {
            addCriterion("TRACE_TEXT >", value, "traceText");
            return this;
        }

        public Criteria andTraceTextGreaterThanOrEqualTo(String value) {
            addCriterion("TRACE_TEXT >=", value, "traceText");
            return this;
        }

        public Criteria andTraceTextLessThan(String value) {
            addCriterion("TRACE_TEXT <", value, "traceText");
            return this;
        }

        public Criteria andTraceTextLessThanOrEqualTo(String value) {
            addCriterion("TRACE_TEXT <=", value, "traceText");
            return this;
        }

        public Criteria andTraceTextLike(String value) {
            addCriterion("TRACE_TEXT like", value, "traceText");
            return this;
        }

        public Criteria andTraceTextNotLike(String value) {
            addCriterion("TRACE_TEXT not like", value, "traceText");
            return this;
        }

        public Criteria andTraceTextIn(List<String> values) {
            addCriterion("TRACE_TEXT in", values, "traceText");
            return this;
        }

        public Criteria andTraceTextNotIn(List<String> values) {
            addCriterion("TRACE_TEXT not in", values, "traceText");
            return this;
        }

        public Criteria andTraceTextBetween(String value1, String value2) {
            addCriterion("TRACE_TEXT between", value1, value2, "traceText");
            return this;
        }

        public Criteria andTraceTextNotBetween(String value1, String value2) {
            addCriterion("TRACE_TEXT not between", value1, value2, "traceText");
            return this;
        }

        public Criteria andXmlDocumentIsNull() {
            addCriterion("XML_DOCUMENT is null");
            return this;
        }

        public Criteria andXmlDocumentIsNotNull() {
            addCriterion("XML_DOCUMENT is not null");
            return this;
        }

        public Criteria andXmlDocumentEqualTo(String value) {
            addCriterion("XML_DOCUMENT =", value, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentNotEqualTo(String value) {
            addCriterion("XML_DOCUMENT <>", value, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentGreaterThan(String value) {
            addCriterion("XML_DOCUMENT >", value, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentGreaterThanOrEqualTo(String value) {
            addCriterion("XML_DOCUMENT >=", value, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentLessThan(String value) {
            addCriterion("XML_DOCUMENT <", value, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentLessThanOrEqualTo(String value) {
            addCriterion("XML_DOCUMENT <=", value, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentLike(String value) {
            addCriterion("XML_DOCUMENT like", value, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentNotLike(String value) {
            addCriterion("XML_DOCUMENT not like", value, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentIn(List<String> values) {
            addCriterion("XML_DOCUMENT in", values, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentNotIn(List<String> values) {
            addCriterion("XML_DOCUMENT not in", values, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentBetween(String value1, String value2) {
            addCriterion("XML_DOCUMENT between", value1, value2, "xmlDocument");
            return this;
        }

        public Criteria andXmlDocumentNotBetween(String value1, String value2) {
            addCriterion("XML_DOCUMENT not between", value1, value2, "xmlDocument");
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
    }
}