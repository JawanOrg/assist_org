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

public class IfaceConfigDeclareExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceConfigDeclareExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceConfigDeclareExample(IfaceConfigDeclareExample example) {
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

        public Criteria andDeclareIdIsNull() {
            addCriterion("DECLARE_ID is null");
            return this;
        }

        public Criteria andDeclareIdIsNotNull() {
            addCriterion("DECLARE_ID is not null");
            return this;
        }

        public Criteria andDeclareIdEqualTo(String value) {
            addCriterion("DECLARE_ID =", value, "declareId");
            return this;
        }

        public Criteria andDeclareIdNotEqualTo(String value) {
            addCriterion("DECLARE_ID <>", value, "declareId");
            return this;
        }

        public Criteria andDeclareIdGreaterThan(String value) {
            addCriterion("DECLARE_ID >", value, "declareId");
            return this;
        }

        public Criteria andDeclareIdGreaterThanOrEqualTo(String value) {
            addCriterion("DECLARE_ID >=", value, "declareId");
            return this;
        }

        public Criteria andDeclareIdLessThan(String value) {
            addCriterion("DECLARE_ID <", value, "declareId");
            return this;
        }

        public Criteria andDeclareIdLessThanOrEqualTo(String value) {
            addCriterion("DECLARE_ID <=", value, "declareId");
            return this;
        }

        public Criteria andDeclareIdLike(String value) {
            addCriterion("DECLARE_ID like", value, "declareId");
            return this;
        }

        public Criteria andDeclareIdNotLike(String value) {
            addCriterion("DECLARE_ID not like", value, "declareId");
            return this;
        }

        public Criteria andDeclareIdIn(List<String> values) {
            addCriterion("DECLARE_ID in", values, "declareId");
            return this;
        }

        public Criteria andDeclareIdNotIn(List<String> values) {
            addCriterion("DECLARE_ID not in", values, "declareId");
            return this;
        }

        public Criteria andDeclareIdBetween(String value1, String value2) {
            addCriterion("DECLARE_ID between", value1, value2, "declareId");
            return this;
        }

        public Criteria andDeclareIdNotBetween(String value1, String value2) {
            addCriterion("DECLARE_ID not between", value1, value2, "declareId");
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

        public Criteria andDeclareSnIsNull() {
            addCriterion("DECLARE_SN is null");
            return this;
        }

        public Criteria andDeclareSnIsNotNull() {
            addCriterion("DECLARE_SN is not null");
            return this;
        }

        public Criteria andDeclareSnEqualTo(String value) {
            addCriterion("DECLARE_SN =", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnNotEqualTo(String value) {
            addCriterion("DECLARE_SN <>", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnGreaterThan(String value) {
            addCriterion("DECLARE_SN >", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnGreaterThanOrEqualTo(String value) {
            addCriterion("DECLARE_SN >=", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnLessThan(String value) {
            addCriterion("DECLARE_SN <", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnLessThanOrEqualTo(String value) {
            addCriterion("DECLARE_SN <=", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnLike(String value) {
            addCriterion("DECLARE_SN like", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnNotLike(String value) {
            addCriterion("DECLARE_SN not like", value, "declareSn");
            return this;
        }

        public Criteria andDeclareSnIn(List<String> values) {
            addCriterion("DECLARE_SN in", values, "declareSn");
            return this;
        }

        public Criteria andDeclareSnNotIn(List<String> values) {
            addCriterion("DECLARE_SN not in", values, "declareSn");
            return this;
        }

        public Criteria andDeclareSnBetween(String value1, String value2) {
            addCriterion("DECLARE_SN between", value1, value2, "declareSn");
            return this;
        }

        public Criteria andDeclareSnNotBetween(String value1, String value2) {
            addCriterion("DECLARE_SN not between", value1, value2, "declareSn");
            return this;
        }

        public Criteria andDeclareNameIsNull() {
            addCriterion("DECLARE_NAME is null");
            return this;
        }

        public Criteria andDeclareNameIsNotNull() {
            addCriterion("DECLARE_NAME is not null");
            return this;
        }

        public Criteria andDeclareNameEqualTo(String value) {
            addCriterion("DECLARE_NAME =", value, "declareName");
            return this;
        }

        public Criteria andDeclareNameNotEqualTo(String value) {
            addCriterion("DECLARE_NAME <>", value, "declareName");
            return this;
        }

        public Criteria andDeclareNameGreaterThan(String value) {
            addCriterion("DECLARE_NAME >", value, "declareName");
            return this;
        }

        public Criteria andDeclareNameGreaterThanOrEqualTo(String value) {
            addCriterion("DECLARE_NAME >=", value, "declareName");
            return this;
        }

        public Criteria andDeclareNameLessThan(String value) {
            addCriterion("DECLARE_NAME <", value, "declareName");
            return this;
        }

        public Criteria andDeclareNameLessThanOrEqualTo(String value) {
            addCriterion("DECLARE_NAME <=", value, "declareName");
            return this;
        }

        public Criteria andDeclareNameLike(String value) {
            addCriterion("DECLARE_NAME like", value, "declareName");
            return this;
        }

        public Criteria andDeclareNameNotLike(String value) {
            addCriterion("DECLARE_NAME not like", value, "declareName");
            return this;
        }

        public Criteria andDeclareNameIn(List<String> values) {
            addCriterion("DECLARE_NAME in", values, "declareName");
            return this;
        }

        public Criteria andDeclareNameNotIn(List<String> values) {
            addCriterion("DECLARE_NAME not in", values, "declareName");
            return this;
        }

        public Criteria andDeclareNameBetween(String value1, String value2) {
            addCriterion("DECLARE_NAME between", value1, value2, "declareName");
            return this;
        }

        public Criteria andDeclareNameNotBetween(String value1, String value2) {
            addCriterion("DECLARE_NAME not between", value1, value2, "declareName");
            return this;
        }

        public Criteria andDeclareNoteIsNull() {
            addCriterion("DECLARE_NOTE is null");
            return this;
        }

        public Criteria andDeclareNoteIsNotNull() {
            addCriterion("DECLARE_NOTE is not null");
            return this;
        }

        public Criteria andDeclareNoteEqualTo(String value) {
            addCriterion("DECLARE_NOTE =", value, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteNotEqualTo(String value) {
            addCriterion("DECLARE_NOTE <>", value, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteGreaterThan(String value) {
            addCriterion("DECLARE_NOTE >", value, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteGreaterThanOrEqualTo(String value) {
            addCriterion("DECLARE_NOTE >=", value, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteLessThan(String value) {
            addCriterion("DECLARE_NOTE <", value, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteLessThanOrEqualTo(String value) {
            addCriterion("DECLARE_NOTE <=", value, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteLike(String value) {
            addCriterion("DECLARE_NOTE like", value, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteNotLike(String value) {
            addCriterion("DECLARE_NOTE not like", value, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteIn(List<String> values) {
            addCriterion("DECLARE_NOTE in", values, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteNotIn(List<String> values) {
            addCriterion("DECLARE_NOTE not in", values, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteBetween(String value1, String value2) {
            addCriterion("DECLARE_NOTE between", value1, value2, "declareNote");
            return this;
        }

        public Criteria andDeclareNoteNotBetween(String value1, String value2) {
            addCriterion("DECLARE_NOTE not between", value1, value2, "declareNote");
            return this;
        }

        public Criteria andStructureTypeIsNull() {
            addCriterion("STRUCTURE_TYPE is null");
            return this;
        }

        public Criteria andStructureTypeIsNotNull() {
            addCriterion("STRUCTURE_TYPE is not null");
            return this;
        }

        public Criteria andStructureTypeEqualTo(String value) {
            addCriterion("STRUCTURE_TYPE =", value, "structureType");
            return this;
        }

        public Criteria andStructureTypeNotEqualTo(String value) {
            addCriterion("STRUCTURE_TYPE <>", value, "structureType");
            return this;
        }

        public Criteria andStructureTypeGreaterThan(String value) {
            addCriterion("STRUCTURE_TYPE >", value, "structureType");
            return this;
        }

        public Criteria andStructureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STRUCTURE_TYPE >=", value, "structureType");
            return this;
        }

        public Criteria andStructureTypeLessThan(String value) {
            addCriterion("STRUCTURE_TYPE <", value, "structureType");
            return this;
        }

        public Criteria andStructureTypeLessThanOrEqualTo(String value) {
            addCriterion("STRUCTURE_TYPE <=", value, "structureType");
            return this;
        }

        public Criteria andStructureTypeLike(String value) {
            addCriterion("STRUCTURE_TYPE like", value, "structureType");
            return this;
        }

        public Criteria andStructureTypeNotLike(String value) {
            addCriterion("STRUCTURE_TYPE not like", value, "structureType");
            return this;
        }

        public Criteria andStructureTypeIn(List<String> values) {
            addCriterion("STRUCTURE_TYPE in", values, "structureType");
            return this;
        }

        public Criteria andStructureTypeNotIn(List<String> values) {
            addCriterion("STRUCTURE_TYPE not in", values, "structureType");
            return this;
        }

        public Criteria andStructureTypeBetween(String value1, String value2) {
            addCriterion("STRUCTURE_TYPE between", value1, value2, "structureType");
            return this;
        }

        public Criteria andStructureTypeNotBetween(String value1, String value2) {
            addCriterion("STRUCTURE_TYPE not between", value1, value2, "structureType");
            return this;
        }

        public Criteria andPriorityIdIsNull() {
            addCriterion("PRIORITY_ID is null");
            return this;
        }

        public Criteria andPriorityIdIsNotNull() {
            addCriterion("PRIORITY_ID is not null");
            return this;
        }

        public Criteria andPriorityIdEqualTo(Integer value) {
            addCriterion("PRIORITY_ID =", value, "priorityId");
            return this;
        }

        public Criteria andPriorityIdNotEqualTo(Integer value) {
            addCriterion("PRIORITY_ID <>", value, "priorityId");
            return this;
        }

        public Criteria andPriorityIdGreaterThan(Integer value) {
            addCriterion("PRIORITY_ID >", value, "priorityId");
            return this;
        }

        public Criteria andPriorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY_ID >=", value, "priorityId");
            return this;
        }

        public Criteria andPriorityIdLessThan(Integer value) {
            addCriterion("PRIORITY_ID <", value, "priorityId");
            return this;
        }

        public Criteria andPriorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY_ID <=", value, "priorityId");
            return this;
        }

        public Criteria andPriorityIdIn(List<Integer> values) {
            addCriterion("PRIORITY_ID in", values, "priorityId");
            return this;
        }

        public Criteria andPriorityIdNotIn(List<Integer> values) {
            addCriterion("PRIORITY_ID not in", values, "priorityId");
            return this;
        }

        public Criteria andPriorityIdBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY_ID between", value1, value2, "priorityId");
            return this;
        }

        public Criteria andPriorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY_ID not between", value1, value2, "priorityId");
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

        public Criteria andLocaleIdIsNull() {
            addCriterion("LOCALE_ID is null");
            return this;
        }

        public Criteria andLocaleIdIsNotNull() {
            addCriterion("LOCALE_ID is not null");
            return this;
        }

        public Criteria andLocaleIdEqualTo(String value) {
            addCriterion("LOCALE_ID =", value, "localeId");
            return this;
        }

        public Criteria andLocaleIdNotEqualTo(String value) {
            addCriterion("LOCALE_ID <>", value, "localeId");
            return this;
        }

        public Criteria andLocaleIdGreaterThan(String value) {
            addCriterion("LOCALE_ID >", value, "localeId");
            return this;
        }

        public Criteria andLocaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALE_ID >=", value, "localeId");
            return this;
        }

        public Criteria andLocaleIdLessThan(String value) {
            addCriterion("LOCALE_ID <", value, "localeId");
            return this;
        }

        public Criteria andLocaleIdLessThanOrEqualTo(String value) {
            addCriterion("LOCALE_ID <=", value, "localeId");
            return this;
        }

        public Criteria andLocaleIdLike(String value) {
            addCriterion("LOCALE_ID like", value, "localeId");
            return this;
        }

        public Criteria andLocaleIdNotLike(String value) {
            addCriterion("LOCALE_ID not like", value, "localeId");
            return this;
        }

        public Criteria andLocaleIdIn(List<String> values) {
            addCriterion("LOCALE_ID in", values, "localeId");
            return this;
        }

        public Criteria andLocaleIdNotIn(List<String> values) {
            addCriterion("LOCALE_ID not in", values, "localeId");
            return this;
        }

        public Criteria andLocaleIdBetween(String value1, String value2) {
            addCriterion("LOCALE_ID between", value1, value2, "localeId");
            return this;
        }

        public Criteria andLocaleIdNotBetween(String value1, String value2) {
            addCriterion("LOCALE_ID not between", value1, value2, "localeId");
            return this;
        }

        public Criteria andMatrixIsNull() {
            addCriterion("IS_MATRIX is null");
            return this;
        }

        public Criteria andMatrixIsNotNull() {
            addCriterion("IS_MATRIX is not null");
            return this;
        }

        public Criteria andMatrixEqualTo(String value) {
            addCriterion("IS_MATRIX =", value, "matrix");
            return this;
        }

        public Criteria andMatrixNotEqualTo(String value) {
            addCriterion("IS_MATRIX <>", value, "matrix");
            return this;
        }

        public Criteria andMatrixGreaterThan(String value) {
            addCriterion("IS_MATRIX >", value, "matrix");
            return this;
        }

        public Criteria andMatrixGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MATRIX >=", value, "matrix");
            return this;
        }

        public Criteria andMatrixLessThan(String value) {
            addCriterion("IS_MATRIX <", value, "matrix");
            return this;
        }

        public Criteria andMatrixLessThanOrEqualTo(String value) {
            addCriterion("IS_MATRIX <=", value, "matrix");
            return this;
        }

        public Criteria andMatrixLike(String value) {
            addCriterion("IS_MATRIX like", value, "matrix");
            return this;
        }

        public Criteria andMatrixNotLike(String value) {
            addCriterion("IS_MATRIX not like", value, "matrix");
            return this;
        }

        public Criteria andMatrixIn(List<String> values) {
            addCriterion("IS_MATRIX in", values, "matrix");
            return this;
        }

        public Criteria andMatrixNotIn(List<String> values) {
            addCriterion("IS_MATRIX not in", values, "matrix");
            return this;
        }

        public Criteria andMatrixBetween(String value1, String value2) {
            addCriterion("IS_MATRIX between", value1, value2, "matrix");
            return this;
        }

        public Criteria andMatrixNotBetween(String value1, String value2) {
            addCriterion("IS_MATRIX not between", value1, value2, "matrix");
            return this;
        }

        public Criteria andAttributeBakIsNull() {
            addCriterion("ATTRIBUTE_BAK is null");
            return this;
        }

        public Criteria andAttributeBakIsNotNull() {
            addCriterion("ATTRIBUTE_BAK is not null");
            return this;
        }

        public Criteria andAttributeBakEqualTo(String value) {
            addCriterion("ATTRIBUTE_BAK =", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakNotEqualTo(String value) {
            addCriterion("ATTRIBUTE_BAK <>", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakGreaterThan(String value) {
            addCriterion("ATTRIBUTE_BAK >", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakGreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_BAK >=", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakLessThan(String value) {
            addCriterion("ATTRIBUTE_BAK <", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakLessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_BAK <=", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakLike(String value) {
            addCriterion("ATTRIBUTE_BAK like", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakNotLike(String value) {
            addCriterion("ATTRIBUTE_BAK not like", value, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakIn(List<String> values) {
            addCriterion("ATTRIBUTE_BAK in", values, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakNotIn(List<String> values) {
            addCriterion("ATTRIBUTE_BAK not in", values, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_BAK between", value1, value2, "attributeBak");
            return this;
        }

        public Criteria andAttributeBakNotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_BAK not between", value1, value2, "attributeBak");
            return this;
        }

        public Criteria andCascadeIdIsNull() {
            addCriterion("CASCADE_ID is null");
            return this;
        }

        public Criteria andCascadeIdIsNotNull() {
            addCriterion("CASCADE_ID is not null");
            return this;
        }

        public Criteria andCascadeIdEqualTo(String value) {
            addCriterion("CASCADE_ID =", value, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdNotEqualTo(String value) {
            addCriterion("CASCADE_ID <>", value, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdGreaterThan(String value) {
            addCriterion("CASCADE_ID >", value, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CASCADE_ID >=", value, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdLessThan(String value) {
            addCriterion("CASCADE_ID <", value, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdLessThanOrEqualTo(String value) {
            addCriterion("CASCADE_ID <=", value, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdLike(String value) {
            addCriterion("CASCADE_ID like", value, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdNotLike(String value) {
            addCriterion("CASCADE_ID not like", value, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdIn(List<String> values) {
            addCriterion("CASCADE_ID in", values, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdNotIn(List<String> values) {
            addCriterion("CASCADE_ID not in", values, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdBetween(String value1, String value2) {
            addCriterion("CASCADE_ID between", value1, value2, "cascadeId");
            return this;
        }

        public Criteria andCascadeIdNotBetween(String value1, String value2) {
            addCriterion("CASCADE_ID not between", value1, value2, "cascadeId");
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

        public Criteria andStructSnIsNull() {
            addCriterion("STRUCT_SN is null");
            return this;
        }

        public Criteria andStructSnIsNotNull() {
            addCriterion("STRUCT_SN is not null");
            return this;
        }

        public Criteria andStructSnEqualTo(String value) {
            addCriterion("STRUCT_SN =", value, "structSn");
            return this;
        }

        public Criteria andStructSnNotEqualTo(String value) {
            addCriterion("STRUCT_SN <>", value, "structSn");
            return this;
        }

        public Criteria andStructSnGreaterThan(String value) {
            addCriterion("STRUCT_SN >", value, "structSn");
            return this;
        }

        public Criteria andStructSnGreaterThanOrEqualTo(String value) {
            addCriterion("STRUCT_SN >=", value, "structSn");
            return this;
        }

        public Criteria andStructSnLessThan(String value) {
            addCriterion("STRUCT_SN <", value, "structSn");
            return this;
        }

        public Criteria andStructSnLessThanOrEqualTo(String value) {
            addCriterion("STRUCT_SN <=", value, "structSn");
            return this;
        }

        public Criteria andStructSnLike(String value) {
            addCriterion("STRUCT_SN like", value, "structSn");
            return this;
        }

        public Criteria andStructSnNotLike(String value) {
            addCriterion("STRUCT_SN not like", value, "structSn");
            return this;
        }

        public Criteria andStructSnIn(List<String> values) {
            addCriterion("STRUCT_SN in", values, "structSn");
            return this;
        }

        public Criteria andStructSnNotIn(List<String> values) {
            addCriterion("STRUCT_SN not in", values, "structSn");
            return this;
        }

        public Criteria andStructSnBetween(String value1, String value2) {
            addCriterion("STRUCT_SN between", value1, value2, "structSn");
            return this;
        }

        public Criteria andStructSnNotBetween(String value1, String value2) {
            addCriterion("STRUCT_SN not between", value1, value2, "structSn");
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