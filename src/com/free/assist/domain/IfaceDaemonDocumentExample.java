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

public class IfaceDaemonDocumentExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceDaemonDocumentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceDaemonDocumentExample(IfaceDaemonDocumentExample example) {
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

        public Criteria andTextIdIsNull() {
            addCriterion("TEXT_ID is null");
            return this;
        }

        public Criteria andTextIdIsNotNull() {
            addCriterion("TEXT_ID is not null");
            return this;
        }

        public Criteria andTextIdEqualTo(String value) {
            addCriterion("TEXT_ID =", value, "textId");
            return this;
        }

        public Criteria andTextIdNotEqualTo(String value) {
            addCriterion("TEXT_ID <>", value, "textId");
            return this;
        }

        public Criteria andTextIdGreaterThan(String value) {
            addCriterion("TEXT_ID >", value, "textId");
            return this;
        }

        public Criteria andTextIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT_ID >=", value, "textId");
            return this;
        }

        public Criteria andTextIdLessThan(String value) {
            addCriterion("TEXT_ID <", value, "textId");
            return this;
        }

        public Criteria andTextIdLessThanOrEqualTo(String value) {
            addCriterion("TEXT_ID <=", value, "textId");
            return this;
        }

        public Criteria andTextIdLike(String value) {
            addCriterion("TEXT_ID like", value, "textId");
            return this;
        }

        public Criteria andTextIdNotLike(String value) {
            addCriterion("TEXT_ID not like", value, "textId");
            return this;
        }

        public Criteria andTextIdIn(List<String> values) {
            addCriterion("TEXT_ID in", values, "textId");
            return this;
        }

        public Criteria andTextIdNotIn(List<String> values) {
            addCriterion("TEXT_ID not in", values, "textId");
            return this;
        }

        public Criteria andTextIdBetween(String value1, String value2) {
            addCriterion("TEXT_ID between", value1, value2, "textId");
            return this;
        }

        public Criteria andTextIdNotBetween(String value1, String value2) {
            addCriterion("TEXT_ID not between", value1, value2, "textId");
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

        public Criteria andInputXMLIsNull() {
            addCriterion("INPUT_XML is null");
            return this;
        }

        public Criteria andInputXMLIsNotNull() {
            addCriterion("INPUT_XML is not null");
            return this;
        }

        public Criteria andInputXMLEqualTo(String value) {
            addCriterion("INPUT_XML =", value, "inputXML");
            return this;
        }

        public Criteria andInputXMLNotEqualTo(String value) {
            addCriterion("INPUT_XML <>", value, "inputXML");
            return this;
        }

        public Criteria andInputXMLGreaterThan(String value) {
            addCriterion("INPUT_XML >", value, "inputXML");
            return this;
        }

        public Criteria andInputXMLGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_XML >=", value, "inputXML");
            return this;
        }

        public Criteria andInputXMLLessThan(String value) {
            addCriterion("INPUT_XML <", value, "inputXML");
            return this;
        }

        public Criteria andInputXMLLessThanOrEqualTo(String value) {
            addCriterion("INPUT_XML <=", value, "inputXML");
            return this;
        }

        public Criteria andInputXMLLike(String value) {
            addCriterion("INPUT_XML like", value, "inputXML");
            return this;
        }

        public Criteria andInputXMLNotLike(String value) {
            addCriterion("INPUT_XML not like", value, "inputXML");
            return this;
        }

        public Criteria andInputXMLIn(List<String> values) {
            addCriterion("INPUT_XML in", values, "inputXML");
            return this;
        }

        public Criteria andInputXMLNotIn(List<String> values) {
            addCriterion("INPUT_XML not in", values, "inputXML");
            return this;
        }

        public Criteria andInputXMLBetween(String value1, String value2) {
            addCriterion("INPUT_XML between", value1, value2, "inputXML");
            return this;
        }

        public Criteria andInputXMLNotBetween(String value1, String value2) {
            addCriterion("INPUT_XML not between", value1, value2, "inputXML");
            return this;
        }

        public Criteria andResultXMLIsNull() {
            addCriterion("RESULT_XML is null");
            return this;
        }

        public Criteria andResultXMLIsNotNull() {
            addCriterion("RESULT_XML is not null");
            return this;
        }

        public Criteria andResultXMLEqualTo(String value) {
            addCriterion("RESULT_XML =", value, "resultXML");
            return this;
        }

        public Criteria andResultXMLNotEqualTo(String value) {
            addCriterion("RESULT_XML <>", value, "resultXML");
            return this;
        }

        public Criteria andResultXMLGreaterThan(String value) {
            addCriterion("RESULT_XML >", value, "resultXML");
            return this;
        }

        public Criteria andResultXMLGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_XML >=", value, "resultXML");
            return this;
        }

        public Criteria andResultXMLLessThan(String value) {
            addCriterion("RESULT_XML <", value, "resultXML");
            return this;
        }

        public Criteria andResultXMLLessThanOrEqualTo(String value) {
            addCriterion("RESULT_XML <=", value, "resultXML");
            return this;
        }

        public Criteria andResultXMLLike(String value) {
            addCriterion("RESULT_XML like", value, "resultXML");
            return this;
        }

        public Criteria andResultXMLNotLike(String value) {
            addCriterion("RESULT_XML not like", value, "resultXML");
            return this;
        }

        public Criteria andResultXMLIn(List<String> values) {
            addCriterion("RESULT_XML in", values, "resultXML");
            return this;
        }

        public Criteria andResultXMLNotIn(List<String> values) {
            addCriterion("RESULT_XML not in", values, "resultXML");
            return this;
        }

        public Criteria andResultXMLBetween(String value1, String value2) {
            addCriterion("RESULT_XML between", value1, value2, "resultXML");
            return this;
        }

        public Criteria andResultXMLNotBetween(String value1, String value2) {
            addCriterion("RESULT_XML not between", value1, value2, "resultXML");
            return this;
        }

        public Criteria andRunCountIsNull() {
            addCriterion("RUN_COUNT is null");
            return this;
        }

        public Criteria andRunCountIsNotNull() {
            addCriterion("RUN_COUNT is not null");
            return this;
        }

        public Criteria andRunCountEqualTo(Integer value) {
            addCriterion("RUN_COUNT =", value, "runCount");
            return this;
        }

        public Criteria andRunCountNotEqualTo(Integer value) {
            addCriterion("RUN_COUNT <>", value, "runCount");
            return this;
        }

        public Criteria andRunCountGreaterThan(Integer value) {
            addCriterion("RUN_COUNT >", value, "runCount");
            return this;
        }

        public Criteria andRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RUN_COUNT >=", value, "runCount");
            return this;
        }

        public Criteria andRunCountLessThan(Integer value) {
            addCriterion("RUN_COUNT <", value, "runCount");
            return this;
        }

        public Criteria andRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("RUN_COUNT <=", value, "runCount");
            return this;
        }

        public Criteria andRunCountIn(List<Integer> values) {
            addCriterion("RUN_COUNT in", values, "runCount");
            return this;
        }

        public Criteria andRunCountNotIn(List<Integer> values) {
            addCriterion("RUN_COUNT not in", values, "runCount");
            return this;
        }

        public Criteria andRunCountBetween(Integer value1, Integer value2) {
            addCriterion("RUN_COUNT between", value1, value2, "runCount");
            return this;
        }

        public Criteria andRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("RUN_COUNT not between", value1, value2, "runCount");
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

        public Criteria andCreateOnIsNull() {
            addCriterion("CREATE_ON is null");
            return this;
        }

        public Criteria andCreateOnIsNotNull() {
            addCriterion("CREATE_ON is not null");
            return this;
        }

        public Criteria andCreateOnEqualTo(Date value) {
            addCriterion("CREATE_ON =", value, "createOn");
            return this;
        }

        public Criteria andCreateOnNotEqualTo(Date value) {
            addCriterion("CREATE_ON <>", value, "createOn");
            return this;
        }

        public Criteria andCreateOnGreaterThan(Date value) {
            addCriterion("CREATE_ON >", value, "createOn");
            return this;
        }

        public Criteria andCreateOnGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON >=", value, "createOn");
            return this;
        }

        public Criteria andCreateOnLessThan(Date value) {
            addCriterion("CREATE_ON <", value, "createOn");
            return this;
        }

        public Criteria andCreateOnLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON <=", value, "createOn");
            return this;
        }

        public Criteria andCreateOnIn(List<Date> values) {
            addCriterion("CREATE_ON in", values, "createOn");
            return this;
        }

        public Criteria andCreateOnNotIn(List<Date> values) {
            addCriterion("CREATE_ON not in", values, "createOn");
            return this;
        }

        public Criteria andCreateOnBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON between", value1, value2, "createOn");
            return this;
        }

        public Criteria andCreateOnNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON not between", value1, value2, "createOn");
            return this;
        }

        public Criteria andUpdateOnIsNull() {
            addCriterion("UPDATE_ON is null");
            return this;
        }

        public Criteria andUpdateOnIsNotNull() {
            addCriterion("UPDATE_ON is not null");
            return this;
        }

        public Criteria andUpdateOnEqualTo(Date value) {
            addCriterion("UPDATE_ON =", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnNotEqualTo(Date value) {
            addCriterion("UPDATE_ON <>", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnGreaterThan(Date value) {
            addCriterion("UPDATE_ON >", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON >=", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnLessThan(Date value) {
            addCriterion("UPDATE_ON <", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON <=", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnIn(List<Date> values) {
            addCriterion("UPDATE_ON in", values, "updateOn");
            return this;
        }

        public Criteria andUpdateOnNotIn(List<Date> values) {
            addCriterion("UPDATE_ON not in", values, "updateOn");
            return this;
        }

        public Criteria andUpdateOnBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON between", value1, value2, "updateOn");
            return this;
        }

        public Criteria andUpdateOnNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON not between", value1, value2, "updateOn");
            return this;
        }
    }
}