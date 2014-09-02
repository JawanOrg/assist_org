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

public class SuptFaceExample extends BaseExample {
    protected String orderByClause;

    protected String beforeOrSQL;

    protected List<Criteria> oredCriteria;

    public SuptFaceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptFaceExample(SuptFaceExample example) {
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

        public Criteria andCimpFaceIdIsNull() {
            addCriterion("sf.cimp_face_id is null");
            return this;
        }

        public Criteria andCimpFaceIdIsNotNull() {
            addCriterion("sf.cimp_face_id is not null");
            return this;
        }

        public Criteria andCimpFaceIdEqualTo(String value) {
            addCriterion("sf.cimp_face_id =", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotEqualTo(String value) {
            addCriterion("sf.cimp_face_id <>", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdGreaterThan(String value) {
            addCriterion("sf.cimp_face_id >", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("sf.cimp_face_id >=", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLessThan(String value) {
            addCriterion("sf.cimp_face_id <", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLessThanOrEqualTo(String value) {
            addCriterion("sf.cimp_face_id <=", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLike(String value) {
            addCriterion("sf.cimp_face_id like", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotLike(String value) {
            addCriterion("sf.cimp_face_id not like", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdIn(List<String> values) {
            addCriterion("sf.cimp_face_id in", values, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotIn(List<String> values) {
            addCriterion("sf.cimp_face_id not in", values, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdBetween(String value1, String value2) {
            addCriterion("sf.cimp_face_id between", value1, value2, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotBetween(String value1, String value2) {
            addCriterion("sf.cimp_face_id not between", value1, value2, "cimpFaceId");
            return this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("sf.application_id is null");
            return this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("sf.application_id is not null");
            return this;
        }

        public Criteria andApplicationIdEqualTo(String value) {
            addCriterion("sf.application_id =", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotEqualTo(String value) {
            addCriterion("sf.application_id <>", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdGreaterThan(String value) {
            addCriterion("sf.application_id >", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("sf.application_id >=", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLessThan(String value) {
            addCriterion("sf.application_id <", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("sf.application_id <=", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLike(String value) {
            addCriterion("sf.application_id like", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotLike(String value) {
            addCriterion("sf.application_id not like", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdIn(List<String> values) {
            addCriterion("sf.application_id in", values, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotIn(List<String> values) {
            addCriterion("sf.application_id not in", values, "applicationId");
            return this;
        }

        public Criteria andApplicationIdBetween(String value1, String value2) {
            addCriterion("sf.application_id between", value1, value2, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotBetween(String value1, String value2) {
            addCriterion("sf.application_id not between", value1, value2, "applicationId");
            return this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("sf.method_name is null");
            return this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("sf.method_name is not null");
            return this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("sf.method_name =", value, "methodName");
            return this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("sf.method_name <>", value, "methodName");
            return this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("sf.method_name >", value, "methodName");
            return this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("sf.method_name >=", value, "methodName");
            return this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("sf.method_name <", value, "methodName");
            return this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("sf.method_name <=", value, "methodName");
            return this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("sf.method_name like", value, "methodName");
            return this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("sf.method_name not like", value, "methodName");
            return this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("sf.method_name in", values, "methodName");
            return this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("sf.method_name not in", values, "methodName");
            return this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("sf.method_name between", value1, value2, "methodName");
            return this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("sf.method_name not between", value1, value2, "methodName");
            return this;
        }

        public Criteria andCimpNameIsNull() {
            addCriterion("sf.cimp_name is null");
            return this;
        }

        public Criteria andCimpNameIsNotNull() {
            addCriterion("sf.cimp_name is not null");
            return this;
        }

        public Criteria andCimpNameEqualTo(String value) {
            addCriterion("sf.cimp_name =", value, "cimpName");
            return this;
        }

        public Criteria andCimpNameNotEqualTo(String value) {
            addCriterion("sf.cimp_name <>", value, "cimpName");
            return this;
        }

        public Criteria andCimpNameGreaterThan(String value) {
            addCriterion("sf.cimp_name >", value, "cimpName");
            return this;
        }

        public Criteria andCimpNameGreaterThanOrEqualTo(String value) {
            addCriterion("sf.cimp_name >=", value, "cimpName");
            return this;
        }

        public Criteria andCimpNameLessThan(String value) {
            addCriterion("sf.cimp_name <", value, "cimpName");
            return this;
        }

        public Criteria andCimpNameLessThanOrEqualTo(String value) {
            addCriterion("sf.cimp_name <=", value, "cimpName");
            return this;
        }

        public Criteria andCimpNameLike(String value) {
            addCriterion("sf.cimp_name like", value, "cimpName");
            return this;
        }

        public Criteria andCimpNameNotLike(String value) {
            addCriterion("sf.cimp_name not like", value, "cimpName");
            return this;
        }

        public Criteria andCimpNameIn(List<String> values) {
            addCriterion("sf.cimp_name in", values, "cimpName");
            return this;
        }

        public Criteria andCimpNameNotIn(List<String> values) {
            addCriterion("sf.cimp_name not in", values, "cimpName");
            return this;
        }

        public Criteria andCimpNameBetween(String value1, String value2) {
            addCriterion("sf.cimp_name between", value1, value2, "cimpName");
            return this;
        }

        public Criteria andCimpNameNotBetween(String value1, String value2) {
            addCriterion("sf.cimp_name not between", value1, value2, "cimpName");
            return this;
        }

        public Criteria andErrorTakeIsNull() {
            addCriterion("sf.error_take is null");
            return this;
        }

        public Criteria andErrorTakeIsNotNull() {
            addCriterion("sf.error_take is not null");
            return this;
        }

        public Criteria andErrorTakeEqualTo(String value) {
            addCriterion("sf.error_take =", value, "errorTake");
            return this;
        }

        public Criteria andErrorTakeNotEqualTo(String value) {
            addCriterion("sf.error_take <>", value, "errorTake");
            return this;
        }

        public Criteria andErrorTakeGreaterThan(String value) {
            addCriterion("sf.error_take >", value, "errorTake");
            return this;
        }

        public Criteria andErrorTakeGreaterThanOrEqualTo(String value) {
            addCriterion("sf.error_take >=", value, "errorTake");
            return this;
        }

        public Criteria andErrorTakeLessThan(String value) {
            addCriterion("sf.error_take <", value, "errorTake");
            return this;
        }

        public Criteria andErrorTakeLessThanOrEqualTo(String value) {
            addCriterion("sf.error_take <=", value, "errorTake");
            return this;
        }

        public Criteria andErrorTakeLike(String value) {
            addCriterion("sf.error_take like", value, "errorTake");
            return this;
        }

        public Criteria andErrorTakeNotLike(String value) {
            addCriterion("sf.error_take not like", value, "errorTake");
            return this;
        }

        public Criteria andErrorTakeIn(List<String> values) {
            addCriterion("sf.error_take in", values, "errorTake");
            return this;
        }

        public Criteria andErrorTakeNotIn(List<String> values) {
            addCriterion("sf.error_take not in", values, "errorTake");
            return this;
        }

        public Criteria andErrorTakeBetween(String value1, String value2) {
            addCriterion("sf.error_take between", value1, value2, "errorTake");
            return this;
        }

        public Criteria andErrorTakeNotBetween(String value1, String value2) {
            addCriterion("sf.error_take not between", value1, value2, "errorTake");
            return this;
        }

        public Criteria andOutXmlIsNull() {
            addCriterion("sf.out_xml is null");
            return this;
        }

        public Criteria andOutXmlIsNotNull() {
            addCriterion("sf.out_xml is not null");
            return this;
        }

        public Criteria andOutXmlEqualTo(String value) {
            addCriterion("sf.out_xml =", value, "outXml");
            return this;
        }

        public Criteria andOutXmlNotEqualTo(String value) {
            addCriterion("sf.out_xml <>", value, "outXml");
            return this;
        }

        public Criteria andOutXmlGreaterThan(String value) {
            addCriterion("sf.out_xml >", value, "outXml");
            return this;
        }

        public Criteria andOutXmlGreaterThanOrEqualTo(String value) {
            addCriterion("sf.out_xml >=", value, "outXml");
            return this;
        }

        public Criteria andOutXmlLessThan(String value) {
            addCriterion("sf.out_xml <", value, "outXml");
            return this;
        }

        public Criteria andOutXmlLessThanOrEqualTo(String value) {
            addCriterion("sf.out_xml <=", value, "outXml");
            return this;
        }

        public Criteria andOutXmlLike(String value) {
            addCriterion("sf.out_xml like", value, "outXml");
            return this;
        }

        public Criteria andOutXmlNotLike(String value) {
            addCriterion("sf.out_xml not like", value, "outXml");
            return this;
        }

        public Criteria andOutXmlIn(List<String> values) {
            addCriterion("sf.out_xml in", values, "outXml");
            return this;
        }

        public Criteria andOutXmlNotIn(List<String> values) {
            addCriterion("sf.out_xml not in", values, "outXml");
            return this;
        }

        public Criteria andOutXmlBetween(String value1, String value2) {
            addCriterion("sf.out_xml between", value1, value2, "outXml");
            return this;
        }

        public Criteria andOutXmlNotBetween(String value1, String value2) {
            addCriterion("sf.out_xml not between", value1, value2, "outXml");
            return this;
        }

        public Criteria andInXmlIsNull() {
            addCriterion("sf.in_xml is null");
            return this;
        }

        public Criteria andInXmlIsNotNull() {
            addCriterion("sf.in_xml is not null");
            return this;
        }

        public Criteria andInXmlEqualTo(String value) {
            addCriterion("sf.in_xml =", value, "inXml");
            return this;
        }

        public Criteria andInXmlNotEqualTo(String value) {
            addCriterion("sf.in_xml <>", value, "inXml");
            return this;
        }

        public Criteria andInXmlGreaterThan(String value) {
            addCriterion("sf.in_xml >", value, "inXml");
            return this;
        }

        public Criteria andInXmlGreaterThanOrEqualTo(String value) {
            addCriterion("sf.in_xml >=", value, "inXml");
            return this;
        }

        public Criteria andInXmlLessThan(String value) {
            addCriterion("sf.in_xml <", value, "inXml");
            return this;
        }

        public Criteria andInXmlLessThanOrEqualTo(String value) {
            addCriterion("sf.in_xml <=", value, "inXml");
            return this;
        }

        public Criteria andInXmlLike(String value) {
            addCriterion("sf.in_xml like", value, "inXml");
            return this;
        }

        public Criteria andInXmlNotLike(String value) {
            addCriterion("sf.in_xml not like", value, "inXml");
            return this;
        }

        public Criteria andInXmlIn(List<String> values) {
            addCriterion("sf.in_xml in", values, "inXml");
            return this;
        }

        public Criteria andInXmlNotIn(List<String> values) {
            addCriterion("sf.in_xml not in", values, "inXml");
            return this;
        }

        public Criteria andInXmlBetween(String value1, String value2) {
            addCriterion("sf.in_xml between", value1, value2, "inXml");
            return this;
        }

        public Criteria andInXmlNotBetween(String value1, String value2) {
            addCriterion("sf.in_xml not between", value1, value2, "inXml");
            return this;
        }

        public Criteria andParamaterIsNull() {
            addCriterion("sf.paramater is null");
            return this;
        }

        public Criteria andParamaterIsNotNull() {
            addCriterion("sf.paramater is not null");
            return this;
        }

        public Criteria andParamaterEqualTo(String value) {
            addCriterion("sf.paramater =", value, "paramater");
            return this;
        }

        public Criteria andParamaterNotEqualTo(String value) {
            addCriterion("sf.paramater <>", value, "paramater");
            return this;
        }

        public Criteria andParamaterGreaterThan(String value) {
            addCriterion("sf.paramater >", value, "paramater");
            return this;
        }

        public Criteria andParamaterGreaterThanOrEqualTo(String value) {
            addCriterion("sf.paramater >=", value, "paramater");
            return this;
        }

        public Criteria andParamaterLessThan(String value) {
            addCriterion("sf.paramater <", value, "paramater");
            return this;
        }

        public Criteria andParamaterLessThanOrEqualTo(String value) {
            addCriterion("sf.paramater <=", value, "paramater");
            return this;
        }

        public Criteria andParamaterLike(String value) {
            addCriterion("sf.paramater like", value, "paramater");
            return this;
        }

        public Criteria andParamaterNotLike(String value) {
            addCriterion("sf.paramater not like", value, "paramater");
            return this;
        }

        public Criteria andParamaterIn(List<String> values) {
            addCriterion("sf.paramater in", values, "paramater");
            return this;
        }

        public Criteria andParamaterNotIn(List<String> values) {
            addCriterion("sf.paramater not in", values, "paramater");
            return this;
        }

        public Criteria andParamaterBetween(String value1, String value2) {
            addCriterion("sf.paramater between", value1, value2, "paramater");
            return this;
        }

        public Criteria andParamaterNotBetween(String value1, String value2) {
            addCriterion("sf.paramater not between", value1, value2, "paramater");
            return this;
        }

        public Criteria andBackLimiteIsNull() {
            addCriterion("sf.back_limite is null");
            return this;
        }

        public Criteria andBackLimiteIsNotNull() {
            addCriterion("sf.back_limite is not null");
            return this;
        }

        public Criteria andBackLimiteEqualTo(String value) {
            addCriterion("sf.back_limite =", value, "backLimite");
            return this;
        }

        public Criteria andBackLimiteNotEqualTo(String value) {
            addCriterion("sf.back_limite <>", value, "backLimite");
            return this;
        }

        public Criteria andBackLimiteGreaterThan(String value) {
            addCriterion("sf.back_limite >", value, "backLimite");
            return this;
        }

        public Criteria andBackLimiteGreaterThanOrEqualTo(String value) {
            addCriterion("sf.back_limite >=", value, "backLimite");
            return this;
        }

        public Criteria andBackLimiteLessThan(String value) {
            addCriterion("sf.back_limite <", value, "backLimite");
            return this;
        }

        public Criteria andBackLimiteLessThanOrEqualTo(String value) {
            addCriterion("sf.back_limite <=", value, "backLimite");
            return this;
        }

        public Criteria andBackLimiteLike(String value) {
            addCriterion("sf.back_limite like", value, "backLimite");
            return this;
        }

        public Criteria andBackLimiteNotLike(String value) {
            addCriterion("sf.back_limite not like", value, "backLimite");
            return this;
        }

        public Criteria andBackLimiteIn(List<String> values) {
            addCriterion("sf.back_limite in", values, "backLimite");
            return this;
        }

        public Criteria andBackLimiteNotIn(List<String> values) {
            addCriterion("sf.back_limite not in", values, "backLimite");
            return this;
        }

        public Criteria andBackLimiteBetween(String value1, String value2) {
            addCriterion("sf.back_limite between", value1, value2, "backLimite");
            return this;
        }

        public Criteria andBackLimiteNotBetween(String value1, String value2) {
            addCriterion("sf.back_limite not between", value1, value2, "backLimite");
            return this;
        }

        public Criteria andIsautoTakeIsNull() {
            addCriterion("sf.isauto_take is null");
            return this;
        }

        public Criteria andIsautoTakeIsNotNull() {
            addCriterion("sf.isauto_take is not null");
            return this;
        }

        public Criteria andIsautoTakeEqualTo(String value) {
            addCriterion("sf.isauto_take =", value, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeNotEqualTo(String value) {
            addCriterion("sf.isauto_take <>", value, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeGreaterThan(String value) {
            addCriterion("sf.isauto_take >", value, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeGreaterThanOrEqualTo(String value) {
            addCriterion("sf.isauto_take >=", value, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeLessThan(String value) {
            addCriterion("sf.isauto_take <", value, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeLessThanOrEqualTo(String value) {
            addCriterion("sf.isauto_take <=", value, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeLike(String value) {
            addCriterion("sf.isauto_take like", value, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeNotLike(String value) {
            addCriterion("sf.isauto_take not like", value, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeIn(List<String> values) {
            addCriterion("sf.isauto_take in", values, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeNotIn(List<String> values) {
            addCriterion("sf.isauto_take not in", values, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeBetween(String value1, String value2) {
            addCriterion("sf.isauto_take between", value1, value2, "isautoTake");
            return this;
        }

        public Criteria andIsautoTakeNotBetween(String value1, String value2) {
            addCriterion("sf.isauto_take not between", value1, value2, "isautoTake");
            return this;
        }

        public Criteria andReturnAppidIsNull() {
            addCriterion("sf.return_appid is null");
            return this;
        }

        public Criteria andReturnAppidIsNotNull() {
            addCriterion("sf.return_appid is not null");
            return this;
        }

        public Criteria andReturnAppidEqualTo(String value) {
            addCriterion("sf.return_appid =", value, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidNotEqualTo(String value) {
            addCriterion("sf.return_appid <>", value, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidGreaterThan(String value) {
            addCriterion("sf.return_appid >", value, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidGreaterThanOrEqualTo(String value) {
            addCriterion("sf.return_appid >=", value, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidLessThan(String value) {
            addCriterion("sf.return_appid <", value, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidLessThanOrEqualTo(String value) {
            addCriterion("sf.return_appid <=", value, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidLike(String value) {
            addCriterion("sf.return_appid like", value, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidNotLike(String value) {
            addCriterion("sf.return_appid not like", value, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidIn(List<String> values) {
            addCriterion("sf.return_appid in", values, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidNotIn(List<String> values) {
            addCriterion("sf.return_appid not in", values, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidBetween(String value1, String value2) {
            addCriterion("sf.return_appid between", value1, value2, "returnAppid");
            return this;
        }

        public Criteria andReturnAppidNotBetween(String value1, String value2) {
            addCriterion("sf.return_appid not between", value1, value2, "returnAppid");
            return this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("sf.is_valid is null");
            return this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("sf.is_valid is not null");
            return this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("sf.is_valid =", value, "isValid");
            return this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("sf.is_valid <>", value, "isValid");
            return this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("sf.is_valid >", value, "isValid");
            return this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("sf.is_valid >=", value, "isValid");
            return this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("sf.is_valid <", value, "isValid");
            return this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("sf.is_valid <=", value, "isValid");
            return this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("sf.is_valid like", value, "isValid");
            return this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("sf.is_valid not like", value, "isValid");
            return this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("sf.is_valid in", values, "isValid");
            return this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("sf.is_valid not in", values, "isValid");
            return this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("sf.is_valid between", value1, value2, "isValid");
            return this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("sf.is_valid not between", value1, value2, "isValid");
            return this;
        }

        public Criteria andApplicationNameIsNull() {
            addCriterion("sf.application_name is null");
            return this;
        }

        public Criteria andApplicationNameIsNotNull() {
            addCriterion("sf.application_name is not null");
            return this;
        }

        public Criteria andApplicationNameEqualTo(String value) {
            addCriterion("sf.application_name =", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotEqualTo(String value) {
            addCriterion("sf.application_name <>", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameGreaterThan(String value) {
            addCriterion("sf.application_name >", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("sf.application_name >=", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLessThan(String value) {
            addCriterion("sf.application_name <", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLessThanOrEqualTo(String value) {
            addCriterion("sf.application_name <=", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLike(String value) {
            addCriterion("sf.application_name like", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotLike(String value) {
            addCriterion("sf.application_name not like", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameIn(List<String> values) {
            addCriterion("sf.application_name in", values, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotIn(List<String> values) {
            addCriterion("sf.application_name not in", values, "applicationName");
            return this;
        }

        public Criteria andApplicationNameBetween(String value1, String value2) {
            addCriterion("sf.application_name between", value1, value2, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotBetween(String value1, String value2) {
            addCriterion("sf.application_name not between", value1, value2, "applicationName");
            return this;
        }

        public Criteria andReturnAppnameIsNull() {
            addCriterion("sf.return_appname is null");
            return this;
        }

        public Criteria andReturnAppnameIsNotNull() {
            addCriterion("sf.return_appname is not null");
            return this;
        }

        public Criteria andReturnAppnameEqualTo(String value) {
            addCriterion("sf.return_appname =", value, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameNotEqualTo(String value) {
            addCriterion("sf.return_appname <>", value, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameGreaterThan(String value) {
            addCriterion("sf.return_appname >", value, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("sf.return_appname >=", value, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameLessThan(String value) {
            addCriterion("sf.return_appname <", value, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameLessThanOrEqualTo(String value) {
            addCriterion("sf.return_appname <=", value, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameLike(String value) {
            addCriterion("sf.return_appname like", value, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameNotLike(String value) {
            addCriterion("sf.return_appname not like", value, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameIn(List<String> values) {
            addCriterion("sf.return_appname in", values, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameNotIn(List<String> values) {
            addCriterion("sf.return_appname not in", values, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameBetween(String value1, String value2) {
            addCriterion("sf.return_appname between", value1, value2, "returnAppname");
            return this;
        }

        public Criteria andReturnAppnameNotBetween(String value1, String value2) {
            addCriterion("sf.return_appname not between", value1, value2, "returnAppname");
            return this;
        }

        public Criteria andExetMethodnameIsNull() {
            addCriterion("sf.exet_methodname is null");
            return this;
        }

        public Criteria andExetMethodnameIsNotNull() {
            addCriterion("sf.exet_methodname is not null");
            return this;
        }

        public Criteria andExetMethodnameEqualTo(String value) {
            addCriterion("sf.exet_methodname =", value, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameNotEqualTo(String value) {
            addCriterion("sf.exet_methodname <>", value, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameGreaterThan(String value) {
            addCriterion("sf.exet_methodname >", value, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameGreaterThanOrEqualTo(String value) {
            addCriterion("sf.exet_methodname >=", value, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameLessThan(String value) {
            addCriterion("sf.exet_methodname <", value, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameLessThanOrEqualTo(String value) {
            addCriterion("sf.exet_methodname <=", value, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameLike(String value) {
            addCriterion("sf.exet_methodname like", value, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameNotLike(String value) {
            addCriterion("sf.exet_methodname not like", value, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameIn(List<String> values) {
            addCriterion("sf.exet_methodname in", values, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameNotIn(List<String> values) {
            addCriterion("sf.exet_methodname not in", values, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameBetween(String value1, String value2) {
            addCriterion("sf.exet_methodname between", value1, value2, "exetMethodname");
            return this;
        }

        public Criteria andExetMethodnameNotBetween(String value1, String value2) {
            addCriterion("sf.exet_methodname not between", value1, value2, "exetMethodname");
            return this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("sf.is_send is null");
            return this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("sf.is_send is not null");
            return this;
        }

        public Criteria andIsSendEqualTo(String value) {
            addCriterion("sf.is_send =", value, "isSend");
            return this;
        }

        public Criteria andIsSendNotEqualTo(String value) {
            addCriterion("sf.is_send <>", value, "isSend");
            return this;
        }

        public Criteria andIsSendGreaterThan(String value) {
            addCriterion("sf.is_send >", value, "isSend");
            return this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(String value) {
            addCriterion("sf.is_send >=", value, "isSend");
            return this;
        }

        public Criteria andIsSendLessThan(String value) {
            addCriterion("sf.is_send <", value, "isSend");
            return this;
        }

        public Criteria andIsSendLessThanOrEqualTo(String value) {
            addCriterion("sf.is_send <=", value, "isSend");
            return this;
        }

        public Criteria andIsSendLike(String value) {
            addCriterion("sf.is_send like", value, "isSend");
            return this;
        }

        public Criteria andIsSendNotLike(String value) {
            addCriterion("sf.is_send not like", value, "isSend");
            return this;
        }

        public Criteria andIsSendIn(List<String> values) {
            addCriterion("sf.is_send in", values, "isSend");
            return this;
        }

        public Criteria andIsSendNotIn(List<String> values) {
            addCriterion("sf.is_send not in", values, "isSend");
            return this;
        }

        public Criteria andIsSendBetween(String value1, String value2) {
            addCriterion("sf.is_send between", value1, value2, "isSend");
            return this;
        }

        public Criteria andIsSendNotBetween(String value1, String value2) {
            addCriterion("sf.is_send not between", value1, value2, "isSend");
            return this;
        }

        public Criteria andXmlstrIsNull() {
            addCriterion("sf.xmlstr is null");
            return this;
        }

        public Criteria andXmlstrIsNotNull() {
            addCriterion("sf.xmlstr is not null");
            return this;
        }

        public Criteria andXmlstrEqualTo(String value) {
            addCriterion("sf.xmlstr =", value, "xmlstr");
            return this;
        }

        public Criteria andXmlstrNotEqualTo(String value) {
            addCriterion("sf.xmlstr <>", value, "xmlstr");
            return this;
        }

        public Criteria andXmlstrGreaterThan(String value) {
            addCriterion("sf.xmlstr >", value, "xmlstr");
            return this;
        }

        public Criteria andXmlstrGreaterThanOrEqualTo(String value) {
            addCriterion("sf.xmlstr >=", value, "xmlstr");
            return this;
        }

        public Criteria andXmlstrLessThan(String value) {
            addCriterion("sf.xmlstr <", value, "xmlstr");
            return this;
        }

        public Criteria andXmlstrLessThanOrEqualTo(String value) {
            addCriterion("sf.xmlstr <=", value, "xmlstr");
            return this;
        }

        public Criteria andXmlstrLike(String value) {
            addCriterion("sf.xmlstr like", value, "xmlstr");
            return this;
        }

        public Criteria andXmlstrNotLike(String value) {
            addCriterion("sf.xmlstr not like", value, "xmlstr");
            return this;
        }

        public Criteria andXmlstrIn(List<String> values) {
            addCriterion("sf.xmlstr in", values, "xmlstr");
            return this;
        }

        public Criteria andXmlstrNotIn(List<String> values) {
            addCriterion("sf.xmlstr not in", values, "xmlstr");
            return this;
        }

        public Criteria andXmlstrBetween(String value1, String value2) {
            addCriterion("sf.xmlstr between", value1, value2, "xmlstr");
            return this;
        }

        public Criteria andXmlstrNotBetween(String value1, String value2) {
            addCriterion("sf.xmlstr not between", value1, value2, "xmlstr");
            return this;
        }

        public Criteria andXmlNodeIsNull() {
            addCriterion("sf.xml_node is null");
            return this;
        }

        public Criteria andXmlNodeIsNotNull() {
            addCriterion("sf.xml_node is not null");
            return this;
        }

        public Criteria andXmlNodeEqualTo(String value) {
            addCriterion("sf.xml_node =", value, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeNotEqualTo(String value) {
            addCriterion("sf.xml_node <>", value, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeGreaterThan(String value) {
            addCriterion("sf.xml_node >", value, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeGreaterThanOrEqualTo(String value) {
            addCriterion("sf.xml_node >=", value, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeLessThan(String value) {
            addCriterion("sf.xml_node <", value, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeLessThanOrEqualTo(String value) {
            addCriterion("sf.xml_node <=", value, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeLike(String value) {
            addCriterion("sf.xml_node like", value, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeNotLike(String value) {
            addCriterion("sf.xml_node not like", value, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeIn(List<String> values) {
            addCriterion("sf.xml_node in", values, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeNotIn(List<String> values) {
            addCriterion("sf.xml_node not in", values, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeBetween(String value1, String value2) {
            addCriterion("sf.xml_node between", value1, value2, "xmlNode");
            return this;
        }

        public Criteria andXmlNodeNotBetween(String value1, String value2) {
            addCriterion("sf.xml_node not between", value1, value2, "xmlNode");
            return this;
        }

        public Criteria andIsReturnidIsNull() {
            addCriterion("sf.is_returnId is null");
            return this;
        }

        public Criteria andIsReturnidIsNotNull() {
            addCriterion("sf.is_returnId is not null");
            return this;
        }

        public Criteria andIsReturnidEqualTo(String value) {
            addCriterion("sf.is_returnId =", value, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidNotEqualTo(String value) {
            addCriterion("sf.is_returnId <>", value, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidGreaterThan(String value) {
            addCriterion("sf.is_returnId >", value, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidGreaterThanOrEqualTo(String value) {
            addCriterion("sf.is_returnId >=", value, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidLessThan(String value) {
            addCriterion("sf.is_returnId <", value, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidLessThanOrEqualTo(String value) {
            addCriterion("sf.is_returnId <=", value, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidLike(String value) {
            addCriterion("sf.is_returnId like", value, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidNotLike(String value) {
            addCriterion("sf.is_returnId not like", value, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidIn(List<String> values) {
            addCriterion("sf.is_returnId in", values, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidNotIn(List<String> values) {
            addCriterion("sf.is_returnId not in", values, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidBetween(String value1, String value2) {
            addCriterion("sf.is_returnId between", value1, value2, "isReturnid");
            return this;
        }

        public Criteria andIsReturnidNotBetween(String value1, String value2) {
            addCriterion("sf.is_returnId not between", value1, value2, "isReturnid");
            return this;
        }

        public Criteria andProtocolTypeIsNull() {
            addCriterion("sf.PROTOCOL_TYPE is null");
            return this;
        }

        public Criteria andProtocolTypeIsNotNull() {
            addCriterion("sf.PROTOCOL_TYPE is not null");
            return this;
        }

        public Criteria andProtocolTypeEqualTo(String value) {
            addCriterion("sf.PROTOCOL_TYPE =", value, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeNotEqualTo(String value) {
            addCriterion("sf.PROTOCOL_TYPE <>", value, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeGreaterThan(String value) {
            addCriterion("sf.PROTOCOL_TYPE >", value, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sf.PROTOCOL_TYPE >=", value, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeLessThan(String value) {
            addCriterion("sf.PROTOCOL_TYPE <", value, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeLessThanOrEqualTo(String value) {
            addCriterion("sf.PROTOCOL_TYPE <=", value, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeLike(String value) {
            addCriterion("sf.PROTOCOL_TYPE like", value, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeNotLike(String value) {
            addCriterion("sf.PROTOCOL_TYPE not like", value, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeIn(List<String> values) {
            addCriterion("sf.PROTOCOL_TYPE in", values, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeNotIn(List<String> values) {
            addCriterion("sf.PROTOCOL_TYPE not in", values, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeBetween(String value1, String value2) {
            addCriterion("sf.PROTOCOL_TYPE between", value1, value2, "protocolType");
            return this;
        }

        public Criteria andProtocolTypeNotBetween(String value1, String value2) {
            addCriterion("sf.PROTOCOL_TYPE not between", value1, value2, "protocolType");
            return this;
        }

        public Criteria andIsReturnvalueIsNull() {
            addCriterion("sf.is_returnValue is null");
            return this;
        }

        public Criteria andIsReturnvalueIsNotNull() {
            addCriterion("sf.is_returnValue is not null");
            return this;
        }

        public Criteria andIsReturnvalueEqualTo(String value) {
            addCriterion("sf.is_returnValue =", value, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueNotEqualTo(String value) {
            addCriterion("sf.is_returnValue <>", value, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueGreaterThan(String value) {
            addCriterion("sf.is_returnValue >", value, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueGreaterThanOrEqualTo(String value) {
            addCriterion("sf.is_returnValue >=", value, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueLessThan(String value) {
            addCriterion("sf.is_returnValue <", value, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueLessThanOrEqualTo(String value) {
            addCriterion("sf.is_returnValue <=", value, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueLike(String value) {
            addCriterion("sf.is_returnValue like", value, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueNotLike(String value) {
            addCriterion("sf.is_returnValue not like", value, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueIn(List<String> values) {
            addCriterion("sf.is_returnValue in", values, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueNotIn(List<String> values) {
            addCriterion("sf.is_returnValue not in", values, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueBetween(String value1, String value2) {
            addCriterion("sf.is_returnValue between", value1, value2, "isReturnvalue");
            return this;
        }

        public Criteria andIsReturnvalueNotBetween(String value1, String value2) {
            addCriterion("sf.is_returnValue not between", value1, value2, "isReturnvalue");
            return this;
        }

        public Criteria andIsjudgebillsystemIsNull() {
            addCriterion("sf.isJudgeBillSystem is null");
            return this;
        }

        public Criteria andIsjudgebillsystemIsNotNull() {
            addCriterion("sf.isJudgeBillSystem is not null");
            return this;
        }

        public Criteria andIsjudgebillsystemEqualTo(String value) {
            addCriterion("sf.isJudgeBillSystem =", value, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemNotEqualTo(String value) {
            addCriterion("sf.isJudgeBillSystem <>", value, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemGreaterThan(String value) {
            addCriterion("sf.isJudgeBillSystem >", value, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemGreaterThanOrEqualTo(String value) {
            addCriterion("sf.isJudgeBillSystem >=", value, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemLessThan(String value) {
            addCriterion("sf.isJudgeBillSystem <", value, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemLessThanOrEqualTo(String value) {
            addCriterion("sf.isJudgeBillSystem <=", value, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemLike(String value) {
            addCriterion("sf.isJudgeBillSystem like", value, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemNotLike(String value) {
            addCriterion("sf.isJudgeBillSystem not like", value, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemIn(List<String> values) {
            addCriterion("sf.isJudgeBillSystem in", values, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemNotIn(List<String> values) {
            addCriterion("sf.isJudgeBillSystem not in", values, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemBetween(String value1, String value2) {
            addCriterion("sf.isJudgeBillSystem between", value1, value2, "isjudgebillsystem");
            return this;
        }

        public Criteria andIsjudgebillsystemNotBetween(String value1, String value2) {
            addCriterion("sf.isJudgeBillSystem not between", value1, value2, "isjudgebillsystem");
            return this;
        }

        public Criteria andNeeddealactionIsNull() {
            addCriterion("sf.needDealAction is null");
            return this;
        }

        public Criteria andNeeddealactionIsNotNull() {
            addCriterion("sf.needDealAction is not null");
            return this;
        }

        public Criteria andNeeddealactionEqualTo(String value) {
            addCriterion("sf.needDealAction =", value, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionNotEqualTo(String value) {
            addCriterion("sf.needDealAction <>", value, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionGreaterThan(String value) {
            addCriterion("sf.needDealAction >", value, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionGreaterThanOrEqualTo(String value) {
            addCriterion("sf.needDealAction >=", value, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionLessThan(String value) {
            addCriterion("sf.needDealAction <", value, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionLessThanOrEqualTo(String value) {
            addCriterion("sf.needDealAction <=", value, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionLike(String value) {
            addCriterion("sf.needDealAction like", value, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionNotLike(String value) {
            addCriterion("sf.needDealAction not like", value, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionIn(List<String> values) {
            addCriterion("sf.needDealAction in", values, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionNotIn(List<String> values) {
            addCriterion("sf.needDealAction not in", values, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionBetween(String value1, String value2) {
            addCriterion("sf.needDealAction between", value1, value2, "needdealaction");
            return this;
        }

        public Criteria andNeeddealactionNotBetween(String value1, String value2) {
            addCriterion("sf.needDealAction not between", value1, value2, "needdealaction");
            return this;
        }

        public Criteria andNotneeddealactionIsNull() {
            addCriterion("sf.notNeedDealAction is null");
            return this;
        }

        public Criteria andNotneeddealactionIsNotNull() {
            addCriterion("sf.notNeedDealAction is not null");
            return this;
        }

        public Criteria andNotneeddealactionEqualTo(String value) {
            addCriterion("sf.notNeedDealAction =", value, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionNotEqualTo(String value) {
            addCriterion("sf.notNeedDealAction <>", value, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionGreaterThan(String value) {
            addCriterion("sf.notNeedDealAction >", value, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionGreaterThanOrEqualTo(String value) {
            addCriterion("sf.notNeedDealAction >=", value, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionLessThan(String value) {
            addCriterion("sf.notNeedDealAction <", value, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionLessThanOrEqualTo(String value) {
            addCriterion("sf.notNeedDealAction <=", value, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionLike(String value) {
            addCriterion("sf.notNeedDealAction like", value, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionNotLike(String value) {
            addCriterion("sf.notNeedDealAction not like", value, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionIn(List<String> values) {
            addCriterion("sf.notNeedDealAction in", values, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionNotIn(List<String> values) {
            addCriterion("sf.notNeedDealAction not in", values, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionBetween(String value1, String value2) {
            addCriterion("sf.notNeedDealAction between", value1, value2, "notneeddealaction");
            return this;
        }

        public Criteria andNotneeddealactionNotBetween(String value1, String value2) {
            addCriterion("sf.notNeedDealAction not between", value1, value2, "notneeddealaction");
            return this;
        }

        public Criteria andActionpathIsNull() {
            addCriterion("sf.actionPath is null");
            return this;
        }

        public Criteria andActionpathIsNotNull() {
            addCriterion("sf.actionPath is not null");
            return this;
        }

        public Criteria andActionpathEqualTo(String value) {
            addCriterion("sf.actionPath =", value, "actionpath");
            return this;
        }

        public Criteria andActionpathNotEqualTo(String value) {
            addCriterion("sf.actionPath <>", value, "actionpath");
            return this;
        }

        public Criteria andActionpathGreaterThan(String value) {
            addCriterion("sf.actionPath >", value, "actionpath");
            return this;
        }

        public Criteria andActionpathGreaterThanOrEqualTo(String value) {
            addCriterion("sf.actionPath >=", value, "actionpath");
            return this;
        }

        public Criteria andActionpathLessThan(String value) {
            addCriterion("sf.actionPath <", value, "actionpath");
            return this;
        }

        public Criteria andActionpathLessThanOrEqualTo(String value) {
            addCriterion("sf.actionPath <=", value, "actionpath");
            return this;
        }

        public Criteria andActionpathLike(String value) {
            addCriterion("sf.actionPath like", value, "actionpath");
            return this;
        }

        public Criteria andActionpathNotLike(String value) {
            addCriterion("sf.actionPath not like", value, "actionpath");
            return this;
        }

        public Criteria andActionpathIn(List<String> values) {
            addCriterion("sf.actionPath in", values, "actionpath");
            return this;
        }

        public Criteria andActionpathNotIn(List<String> values) {
            addCriterion("sf.actionPath not in", values, "actionpath");
            return this;
        }

        public Criteria andActionpathBetween(String value1, String value2) {
            addCriterion("sf.actionPath between", value1, value2, "actionpath");
            return this;
        }

        public Criteria andActionpathNotBetween(String value1, String value2) {
            addCriterion("sf.actionPath not between", value1, value2, "actionpath");
            return this;
        }

        public Criteria andReturnCodePathIsNull() {
            addCriterion("sf.return_Code_Path is null");
            return this;
        }

        public Criteria andReturnCodePathIsNotNull() {
            addCriterion("sf.return_Code_Path is not null");
            return this;
        }

        public Criteria andReturnCodePathEqualTo(String value) {
            addCriterion("sf.return_Code_Path =", value, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathNotEqualTo(String value) {
            addCriterion("sf.return_Code_Path <>", value, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathGreaterThan(String value) {
            addCriterion("sf.return_Code_Path >", value, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathGreaterThanOrEqualTo(String value) {
            addCriterion("sf.return_Code_Path >=", value, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathLessThan(String value) {
            addCriterion("sf.return_Code_Path <", value, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathLessThanOrEqualTo(String value) {
            addCriterion("sf.return_Code_Path <=", value, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathLike(String value) {
            addCriterion("sf.return_Code_Path like", value, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathNotLike(String value) {
            addCriterion("sf.return_Code_Path not like", value, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathIn(List<String> values) {
            addCriterion("sf.return_Code_Path in", values, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathNotIn(List<String> values) {
            addCriterion("sf.return_Code_Path not in", values, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathBetween(String value1, String value2) {
            addCriterion("sf.return_Code_Path between", value1, value2, "returnCodePath");
            return this;
        }

        public Criteria andReturnCodePathNotBetween(String value1, String value2) {
            addCriterion("sf.return_Code_Path not between", value1, value2, "returnCodePath");
            return this;
        }

        public Criteria andKeyPathsIsNull() {
            addCriterion("sf.key_Paths is null");
            return this;
        }

        public Criteria andKeyPathsIsNotNull() {
            addCriterion("sf.key_Paths is not null");
            return this;
        }

        public Criteria andKeyPathsEqualTo(String value) {
            addCriterion("sf.key_Paths =", value, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsNotEqualTo(String value) {
            addCriterion("sf.key_Paths <>", value, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsGreaterThan(String value) {
            addCriterion("sf.key_Paths >", value, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsGreaterThanOrEqualTo(String value) {
            addCriterion("sf.key_Paths >=", value, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsLessThan(String value) {
            addCriterion("sf.key_Paths <", value, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsLessThanOrEqualTo(String value) {
            addCriterion("sf.key_Paths <=", value, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsLike(String value) {
            addCriterion("sf.key_Paths like", value, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsNotLike(String value) {
            addCriterion("sf.key_Paths not like", value, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsIn(List<String> values) {
            addCriterion("sf.key_Paths in", values, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsNotIn(List<String> values) {
            addCriterion("sf.key_Paths not in", values, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsBetween(String value1, String value2) {
            addCriterion("sf.key_Paths between", value1, value2, "keyPaths");
            return this;
        }

        public Criteria andKeyPathsNotBetween(String value1, String value2) {
            addCriterion("sf.key_Paths not between", value1, value2, "keyPaths");
            return this;
        }

        public Criteria andBillOfSystemsIsNull() {
            addCriterion("sf.bill_Of_Systems is null");
            return this;
        }

        public Criteria andBillOfSystemsIsNotNull() {
            addCriterion("sf.bill_Of_Systems is not null");
            return this;
        }

        public Criteria andBillOfSystemsEqualTo(String value) {
            addCriterion("sf.bill_Of_Systems =", value, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsNotEqualTo(String value) {
            addCriterion("sf.bill_Of_Systems <>", value, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsGreaterThan(String value) {
            addCriterion("sf.bill_Of_Systems >", value, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsGreaterThanOrEqualTo(String value) {
            addCriterion("sf.bill_Of_Systems >=", value, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsLessThan(String value) {
            addCriterion("sf.bill_Of_Systems <", value, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsLessThanOrEqualTo(String value) {
            addCriterion("sf.bill_Of_Systems <=", value, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsLike(String value) {
            addCriterion("sf.bill_Of_Systems like", value, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsNotLike(String value) {
            addCriterion("sf.bill_Of_Systems not like", value, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsIn(List<String> values) {
            addCriterion("sf.bill_Of_Systems in", values, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsNotIn(List<String> values) {
            addCriterion("sf.bill_Of_Systems not in", values, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsBetween(String value1, String value2) {
            addCriterion("sf.bill_Of_Systems between", value1, value2, "billOfSystems");
            return this;
        }

        public Criteria andBillOfSystemsNotBetween(String value1, String value2) {
            addCriterion("sf.bill_Of_Systems not between", value1, value2, "billOfSystems");
            return this;
        }

        public Criteria andIndicantNodeIsNull() {
            addCriterion("sf.INDICANT_NODE is null");
            return this;
        }

        public Criteria andIndicantNodeIsNotNull() {
            addCriterion("sf.INDICANT_NODE is not null");
            return this;
        }

        public Criteria andIndicantNodeEqualTo(String value) {
            addCriterion("sf.INDICANT_NODE =", value, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeNotEqualTo(String value) {
            addCriterion("sf.INDICANT_NODE <>", value, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeGreaterThan(String value) {
            addCriterion("sf.INDICANT_NODE >", value, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeGreaterThanOrEqualTo(String value) {
            addCriterion("sf.INDICANT_NODE >=", value, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeLessThan(String value) {
            addCriterion("sf.INDICANT_NODE <", value, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeLessThanOrEqualTo(String value) {
            addCriterion("sf.INDICANT_NODE <=", value, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeLike(String value) {
            addCriterion("sf.INDICANT_NODE like", value, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeNotLike(String value) {
            addCriterion("sf.INDICANT_NODE not like", value, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeIn(List<String> values) {
            addCriterion("sf.INDICANT_NODE in", values, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeNotIn(List<String> values) {
            addCriterion("sf.INDICANT_NODE not in", values, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeBetween(String value1, String value2) {
            addCriterion("sf.INDICANT_NODE between", value1, value2, "indicantNode");
            return this;
        }

        public Criteria andIndicantNodeNotBetween(String value1, String value2) {
            addCriterion("sf.INDICANT_NODE not between", value1, value2, "indicantNode");
            return this;
        }

        public Criteria andSuccessValueIsNull() {
            addCriterion("sf.SUCCESS_VALUE is null");
            return this;
        }

        public Criteria andSuccessValueIsNotNull() {
            addCriterion("sf.SUCCESS_VALUE is not null");
            return this;
        }

        public Criteria andSuccessValueEqualTo(String value) {
            addCriterion("sf.SUCCESS_VALUE =", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueNotEqualTo(String value) {
            addCriterion("sf.SUCCESS_VALUE <>", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueGreaterThan(String value) {
            addCriterion("sf.SUCCESS_VALUE >", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueGreaterThanOrEqualTo(String value) {
            addCriterion("sf.SUCCESS_VALUE >=", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueLessThan(String value) {
            addCriterion("sf.SUCCESS_VALUE <", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueLessThanOrEqualTo(String value) {
            addCriterion("sf.SUCCESS_VALUE <=", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueLike(String value) {
            addCriterion("sf.SUCCESS_VALUE like", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueNotLike(String value) {
            addCriterion("sf.SUCCESS_VALUE not like", value, "successValue");
            return this;
        }

        public Criteria andSuccessValueIn(List<String> values) {
            addCriterion("sf.SUCCESS_VALUE in", values, "successValue");
            return this;
        }

        public Criteria andSuccessValueNotIn(List<String> values) {
            addCriterion("sf.SUCCESS_VALUE not in", values, "successValue");
            return this;
        }

        public Criteria andSuccessValueBetween(String value1, String value2) {
            addCriterion("sf.SUCCESS_VALUE between", value1, value2, "successValue");
            return this;
        }

        public Criteria andSuccessValueNotBetween(String value1, String value2) {
            addCriterion("sf.SUCCESS_VALUE not between", value1, value2, "successValue");
            return this;
        }
    }

	public String getBeforeOrSQL() {
		return beforeOrSQL;
	}

	public void setBeforeOrSQL(String beforeOrSQL) {
		this.beforeOrSQL = beforeOrSQL;
	}
}