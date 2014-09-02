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

public class SuptTaticInstanceExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptTaticInstanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptTaticInstanceExample(SuptTaticInstanceExample example) {
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

        public Criteria andTaticinstanceidIsNull() {
            addCriterion("taticInstanceId is null");
            return this;
        }

        public Criteria andTaticinstanceidIsNotNull() {
            addCriterion("taticInstanceId is not null");
            return this;
        }

        public Criteria andTaticinstanceidEqualTo(String value) {
            addCriterion("taticInstanceId =", value, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidNotEqualTo(String value) {
            addCriterion("taticInstanceId <>", value, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidGreaterThan(String value) {
            addCriterion("taticInstanceId >", value, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("taticInstanceId >=", value, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidLessThan(String value) {
            addCriterion("taticInstanceId <", value, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidLessThanOrEqualTo(String value) {
            addCriterion("taticInstanceId <=", value, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidLike(String value) {
            addCriterion("taticInstanceId like", value, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidNotLike(String value) {
            addCriterion("taticInstanceId not like", value, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidIn(List<String> values) {
            addCriterion("taticInstanceId in", values, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidNotIn(List<String> values) {
            addCriterion("taticInstanceId not in", values, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidBetween(String value1, String value2) {
            addCriterion("taticInstanceId between", value1, value2, "taticinstanceid");
            return this;
        }

        public Criteria andTaticinstanceidNotBetween(String value1, String value2) {
            addCriterion("taticInstanceId not between", value1, value2, "taticinstanceid");
            return this;
        }

        public Criteria andTaticgoupidIsNull() {
            addCriterion("taticGoupId is null");
            return this;
        }

        public Criteria andTaticgoupidIsNotNull() {
            addCriterion("taticGoupId is not null");
            return this;
        }

        public Criteria andTaticgoupidEqualTo(String value) {
            addCriterion("taticGoupId =", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotEqualTo(String value) {
            addCriterion("taticGoupId <>", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidGreaterThan(String value) {
            addCriterion("taticGoupId >", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidGreaterThanOrEqualTo(String value) {
            addCriterion("taticGoupId >=", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLessThan(String value) {
            addCriterion("taticGoupId <", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLessThanOrEqualTo(String value) {
            addCriterion("taticGoupId <=", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidLike(String value) {
            addCriterion("taticGoupId like", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotLike(String value) {
            addCriterion("taticGoupId not like", value, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidIn(List<String> values) {
            addCriterion("taticGoupId in", values, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotIn(List<String> values) {
            addCriterion("taticGoupId not in", values, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidBetween(String value1, String value2) {
            addCriterion("taticGoupId between", value1, value2, "taticgoupid");
            return this;
        }

        public Criteria andTaticgoupidNotBetween(String value1, String value2) {
            addCriterion("taticGoupId not between", value1, value2, "taticgoupid");
            return this;
        }

        public Criteria andInterfacecodeIsNull() {
            addCriterion("interfaceCode is null");
            return this;
        }

        public Criteria andInterfacecodeIsNotNull() {
            addCriterion("interfaceCode is not null");
            return this;
        }

        public Criteria andInterfacecodeEqualTo(String value) {
            addCriterion("interfaceCode =", value, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeNotEqualTo(String value) {
            addCriterion("interfaceCode <>", value, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeGreaterThan(String value) {
            addCriterion("interfaceCode >", value, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeGreaterThanOrEqualTo(String value) {
            addCriterion("interfaceCode >=", value, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeLessThan(String value) {
            addCriterion("interfaceCode <", value, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeLessThanOrEqualTo(String value) {
            addCriterion("interfaceCode <=", value, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeLike(String value) {
            addCriterion("interfaceCode like", value, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeNotLike(String value) {
            addCriterion("interfaceCode not like", value, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeIn(List<String> values) {
            addCriterion("interfaceCode in", values, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeNotIn(List<String> values) {
            addCriterion("interfaceCode not in", values, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeBetween(String value1, String value2) {
            addCriterion("interfaceCode between", value1, value2, "interfacecode");
            return this;
        }

        public Criteria andInterfacecodeNotBetween(String value1, String value2) {
            addCriterion("interfaceCode not between", value1, value2, "interfacecode");
            return this;
        }

        public Criteria andDispatchobjectIsNull() {
            addCriterion("dispatchObject is null");
            return this;
        }

        public Criteria andDispatchobjectIsNotNull() {
            addCriterion("dispatchObject is not null");
            return this;
        }

        public Criteria andDispatchobjectEqualTo(String value) {
            addCriterion("dispatchObject =", value, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectNotEqualTo(String value) {
            addCriterion("dispatchObject <>", value, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectGreaterThan(String value) {
            addCriterion("dispatchObject >", value, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectGreaterThanOrEqualTo(String value) {
            addCriterion("dispatchObject >=", value, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectLessThan(String value) {
            addCriterion("dispatchObject <", value, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectLessThanOrEqualTo(String value) {
            addCriterion("dispatchObject <=", value, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectLike(String value) {
            addCriterion("dispatchObject like", value, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectNotLike(String value) {
            addCriterion("dispatchObject not like", value, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectIn(List<String> values) {
            addCriterion("dispatchObject in", values, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectNotIn(List<String> values) {
            addCriterion("dispatchObject not in", values, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectBetween(String value1, String value2) {
            addCriterion("dispatchObject between", value1, value2, "dispatchobject");
            return this;
        }

        public Criteria andDispatchobjectNotBetween(String value1, String value2) {
            addCriterion("dispatchObject not between", value1, value2, "dispatchobject");
            return this;
        }

        public Criteria andIsmoreIsNull() {
            addCriterion("isMore is null");
            return this;
        }

        public Criteria andIsmoreIsNotNull() {
            addCriterion("isMore is not null");
            return this;
        }

        public Criteria andIsmoreEqualTo(String value) {
            addCriterion("isMore =", value, "ismore");
            return this;
        }

        public Criteria andIsmoreNotEqualTo(String value) {
            addCriterion("isMore <>", value, "ismore");
            return this;
        }

        public Criteria andIsmoreGreaterThan(String value) {
            addCriterion("isMore >", value, "ismore");
            return this;
        }

        public Criteria andIsmoreGreaterThanOrEqualTo(String value) {
            addCriterion("isMore >=", value, "ismore");
            return this;
        }

        public Criteria andIsmoreLessThan(String value) {
            addCriterion("isMore <", value, "ismore");
            return this;
        }

        public Criteria andIsmoreLessThanOrEqualTo(String value) {
            addCriterion("isMore <=", value, "ismore");
            return this;
        }

        public Criteria andIsmoreLike(String value) {
            addCriterion("isMore like", value, "ismore");
            return this;
        }

        public Criteria andIsmoreNotLike(String value) {
            addCriterion("isMore not like", value, "ismore");
            return this;
        }

        public Criteria andIsmoreIn(List<String> values) {
            addCriterion("isMore in", values, "ismore");
            return this;
        }

        public Criteria andIsmoreNotIn(List<String> values) {
            addCriterion("isMore not in", values, "ismore");
            return this;
        }

        public Criteria andIsmoreBetween(String value1, String value2) {
            addCriterion("isMore between", value1, value2, "ismore");
            return this;
        }

        public Criteria andIsmoreNotBetween(String value1, String value2) {
            addCriterion("isMore not between", value1, value2, "ismore");
            return this;
        }

        public Criteria andRowrecordidIsNull() {
            addCriterion("rowRecordId is null");
            return this;
        }

        public Criteria andRowrecordidIsNotNull() {
            addCriterion("rowRecordId is not null");
            return this;
        }

        public Criteria andRowrecordidEqualTo(String value) {
            addCriterion("rowRecordId =", value, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidNotEqualTo(String value) {
            addCriterion("rowRecordId <>", value, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidGreaterThan(String value) {
            addCriterion("rowRecordId >", value, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidGreaterThanOrEqualTo(String value) {
            addCriterion("rowRecordId >=", value, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidLessThan(String value) {
            addCriterion("rowRecordId <", value, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidLessThanOrEqualTo(String value) {
            addCriterion("rowRecordId <=", value, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidLike(String value) {
            addCriterion("rowRecordId like", value, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidNotLike(String value) {
            addCriterion("rowRecordId not like", value, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidIn(List<String> values) {
            addCriterion("rowRecordId in", values, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidNotIn(List<String> values) {
            addCriterion("rowRecordId not in", values, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidBetween(String value1, String value2) {
            addCriterion("rowRecordId between", value1, value2, "rowrecordid");
            return this;
        }

        public Criteria andRowrecordidNotBetween(String value1, String value2) {
            addCriterion("rowRecordId not between", value1, value2, "rowrecordid");
            return this;
        }

        public Criteria andElementidIsNull() {
            addCriterion("elementId is null");
            return this;
        }

        public Criteria andElementidIsNotNull() {
            addCriterion("elementId is not null");
            return this;
        }

        public Criteria andElementidEqualTo(String value) {
            addCriterion("elementId =", value, "elementid");
            return this;
        }

        public Criteria andElementidNotEqualTo(String value) {
            addCriterion("elementId <>", value, "elementid");
            return this;
        }

        public Criteria andElementidGreaterThan(String value) {
            addCriterion("elementId >", value, "elementid");
            return this;
        }

        public Criteria andElementidGreaterThanOrEqualTo(String value) {
            addCriterion("elementId >=", value, "elementid");
            return this;
        }

        public Criteria andElementidLessThan(String value) {
            addCriterion("elementId <", value, "elementid");
            return this;
        }

        public Criteria andElementidLessThanOrEqualTo(String value) {
            addCriterion("elementId <=", value, "elementid");
            return this;
        }

        public Criteria andElementidLike(String value) {
            addCriterion("elementId like", value, "elementid");
            return this;
        }

        public Criteria andElementidNotLike(String value) {
            addCriterion("elementId not like", value, "elementid");
            return this;
        }

        public Criteria andElementidIn(List<String> values) {
            addCriterion("elementId in", values, "elementid");
            return this;
        }

        public Criteria andElementidNotIn(List<String> values) {
            addCriterion("elementId not in", values, "elementid");
            return this;
        }

        public Criteria andElementidBetween(String value1, String value2) {
            addCriterion("elementId between", value1, value2, "elementid");
            return this;
        }

        public Criteria andElementidNotBetween(String value1, String value2) {
            addCriterion("elementId not between", value1, value2, "elementid");
            return this;
        }

        public Criteria andElevalue1IsNull() {
            addCriterion("eleValue1 is null");
            return this;
        }

        public Criteria andElevalue1IsNotNull() {
            addCriterion("eleValue1 is not null");
            return this;
        }

        public Criteria andElevalue1EqualTo(String value) {
            addCriterion("eleValue1 =", value, "elevalue1");
            return this;
        }

        public Criteria andElevalue1NotEqualTo(String value) {
            addCriterion("eleValue1 <>", value, "elevalue1");
            return this;
        }

        public Criteria andElevalue1GreaterThan(String value) {
            addCriterion("eleValue1 >", value, "elevalue1");
            return this;
        }

        public Criteria andElevalue1GreaterThanOrEqualTo(String value) {
            addCriterion("eleValue1 >=", value, "elevalue1");
            return this;
        }

        public Criteria andElevalue1LessThan(String value) {
            addCriterion("eleValue1 <", value, "elevalue1");
            return this;
        }

        public Criteria andElevalue1LessThanOrEqualTo(String value) {
            addCriterion("eleValue1 <=", value, "elevalue1");
            return this;
        }

        public Criteria andElevalue1Like(String value) {
            addCriterion("eleValue1 like", value, "elevalue1");
            return this;
        }

        public Criteria andElevalue1NotLike(String value) {
            addCriterion("eleValue1 not like", value, "elevalue1");
            return this;
        }

        public Criteria andElevalue1In(List<String> values) {
            addCriterion("eleValue1 in", values, "elevalue1");
            return this;
        }

        public Criteria andElevalue1NotIn(List<String> values) {
            addCriterion("eleValue1 not in", values, "elevalue1");
            return this;
        }

        public Criteria andElevalue1Between(String value1, String value2) {
            addCriterion("eleValue1 between", value1, value2, "elevalue1");
            return this;
        }

        public Criteria andElevalue1NotBetween(String value1, String value2) {
            addCriterion("eleValue1 not between", value1, value2, "elevalue1");
            return this;
        }

        public Criteria andElevalue2IsNull() {
            addCriterion("eleValue2 is null");
            return this;
        }

        public Criteria andElevalue2IsNotNull() {
            addCriterion("eleValue2 is not null");
            return this;
        }

        public Criteria andElevalue2EqualTo(String value) {
            addCriterion("eleValue2 =", value, "elevalue2");
            return this;
        }

        public Criteria andElevalue2NotEqualTo(String value) {
            addCriterion("eleValue2 <>", value, "elevalue2");
            return this;
        }

        public Criteria andElevalue2GreaterThan(String value) {
            addCriterion("eleValue2 >", value, "elevalue2");
            return this;
        }

        public Criteria andElevalue2GreaterThanOrEqualTo(String value) {
            addCriterion("eleValue2 >=", value, "elevalue2");
            return this;
        }

        public Criteria andElevalue2LessThan(String value) {
            addCriterion("eleValue2 <", value, "elevalue2");
            return this;
        }

        public Criteria andElevalue2LessThanOrEqualTo(String value) {
            addCriterion("eleValue2 <=", value, "elevalue2");
            return this;
        }

        public Criteria andElevalue2Like(String value) {
            addCriterion("eleValue2 like", value, "elevalue2");
            return this;
        }

        public Criteria andElevalue2NotLike(String value) {
            addCriterion("eleValue2 not like", value, "elevalue2");
            return this;
        }

        public Criteria andElevalue2In(List<String> values) {
            addCriterion("eleValue2 in", values, "elevalue2");
            return this;
        }

        public Criteria andElevalue2NotIn(List<String> values) {
            addCriterion("eleValue2 not in", values, "elevalue2");
            return this;
        }

        public Criteria andElevalue2Between(String value1, String value2) {
            addCriterion("eleValue2 between", value1, value2, "elevalue2");
            return this;
        }

        public Criteria andElevalue2NotBetween(String value1, String value2) {
            addCriterion("eleValue2 not between", value1, value2, "elevalue2");
            return this;
        }

        public Criteria andElevalue3IsNull() {
            addCriterion("eleValue3 is null");
            return this;
        }

        public Criteria andElevalue3IsNotNull() {
            addCriterion("eleValue3 is not null");
            return this;
        }

        public Criteria andElevalue3EqualTo(String value) {
            addCriterion("eleValue3 =", value, "elevalue3");
            return this;
        }

        public Criteria andElevalue3NotEqualTo(String value) {
            addCriterion("eleValue3 <>", value, "elevalue3");
            return this;
        }

        public Criteria andElevalue3GreaterThan(String value) {
            addCriterion("eleValue3 >", value, "elevalue3");
            return this;
        }

        public Criteria andElevalue3GreaterThanOrEqualTo(String value) {
            addCriterion("eleValue3 >=", value, "elevalue3");
            return this;
        }

        public Criteria andElevalue3LessThan(String value) {
            addCriterion("eleValue3 <", value, "elevalue3");
            return this;
        }

        public Criteria andElevalue3LessThanOrEqualTo(String value) {
            addCriterion("eleValue3 <=", value, "elevalue3");
            return this;
        }

        public Criteria andElevalue3Like(String value) {
            addCriterion("eleValue3 like", value, "elevalue3");
            return this;
        }

        public Criteria andElevalue3NotLike(String value) {
            addCriterion("eleValue3 not like", value, "elevalue3");
            return this;
        }

        public Criteria andElevalue3In(List<String> values) {
            addCriterion("eleValue3 in", values, "elevalue3");
            return this;
        }

        public Criteria andElevalue3NotIn(List<String> values) {
            addCriterion("eleValue3 not in", values, "elevalue3");
            return this;
        }

        public Criteria andElevalue3Between(String value1, String value2) {
            addCriterion("eleValue3 between", value1, value2, "elevalue3");
            return this;
        }

        public Criteria andElevalue3NotBetween(String value1, String value2) {
            addCriterion("eleValue3 not between", value1, value2, "elevalue3");
            return this;
        }

        public Criteria andMatchingRuleIsNull() {
            addCriterion("matching_rule is null");
            return this;
        }

        public Criteria andMatchingRuleIsNotNull() {
            addCriterion("matching_rule is not null");
            return this;
        }

        public Criteria andMatchingRuleEqualTo(String value) {
            addCriterion("matching_rule =", value, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleNotEqualTo(String value) {
            addCriterion("matching_rule <>", value, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleGreaterThan(String value) {
            addCriterion("matching_rule >", value, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleGreaterThanOrEqualTo(String value) {
            addCriterion("matching_rule >=", value, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleLessThan(String value) {
            addCriterion("matching_rule <", value, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleLessThanOrEqualTo(String value) {
            addCriterion("matching_rule <=", value, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleLike(String value) {
            addCriterion("matching_rule like", value, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleNotLike(String value) {
            addCriterion("matching_rule not like", value, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleIn(List<String> values) {
            addCriterion("matching_rule in", values, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleNotIn(List<String> values) {
            addCriterion("matching_rule not in", values, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleBetween(String value1, String value2) {
            addCriterion("matching_rule between", value1, value2, "matchingRule");
            return this;
        }

        public Criteria andMatchingRuleNotBetween(String value1, String value2) {
            addCriterion("matching_rule not between", value1, value2, "matchingRule");
            return this;
        }

        public Criteria andXmlNodenameIsNull() {
            addCriterion("xml_nodeName is null");
            return this;
        }

        public Criteria andXmlNodenameIsNotNull() {
            addCriterion("xml_nodeName is not null");
            return this;
        }

        public Criteria andXmlNodenameEqualTo(String value) {
            addCriterion("xml_nodeName =", value, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameNotEqualTo(String value) {
            addCriterion("xml_nodeName <>", value, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameGreaterThan(String value) {
            addCriterion("xml_nodeName >", value, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameGreaterThanOrEqualTo(String value) {
            addCriterion("xml_nodeName >=", value, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameLessThan(String value) {
            addCriterion("xml_nodeName <", value, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameLessThanOrEqualTo(String value) {
            addCriterion("xml_nodeName <=", value, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameLike(String value) {
            addCriterion("xml_nodeName like", value, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameNotLike(String value) {
            addCriterion("xml_nodeName not like", value, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameIn(List<String> values) {
            addCriterion("xml_nodeName in", values, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameNotIn(List<String> values) {
            addCriterion("xml_nodeName not in", values, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameBetween(String value1, String value2) {
            addCriterion("xml_nodeName between", value1, value2, "xmlNodename");
            return this;
        }

        public Criteria andXmlNodenameNotBetween(String value1, String value2) {
            addCriterion("xml_nodeName not between", value1, value2, "xmlNodename");
            return this;
        }

        public Criteria andChangeElementIsNull() {
            addCriterion("change_element is null");
            return this;
        }

        public Criteria andChangeElementIsNotNull() {
            addCriterion("change_element is not null");
            return this;
        }

        public Criteria andChangeElementEqualTo(String value) {
            addCriterion("change_element =", value, "changeElement");
            return this;
        }

        public Criteria andChangeElementNotEqualTo(String value) {
            addCriterion("change_element <>", value, "changeElement");
            return this;
        }

        public Criteria andChangeElementGreaterThan(String value) {
            addCriterion("change_element >", value, "changeElement");
            return this;
        }

        public Criteria andChangeElementGreaterThanOrEqualTo(String value) {
            addCriterion("change_element >=", value, "changeElement");
            return this;
        }

        public Criteria andChangeElementLessThan(String value) {
            addCriterion("change_element <", value, "changeElement");
            return this;
        }

        public Criteria andChangeElementLessThanOrEqualTo(String value) {
            addCriterion("change_element <=", value, "changeElement");
            return this;
        }

        public Criteria andChangeElementLike(String value) {
            addCriterion("change_element like", value, "changeElement");
            return this;
        }

        public Criteria andChangeElementNotLike(String value) {
            addCriterion("change_element not like", value, "changeElement");
            return this;
        }

        public Criteria andChangeElementIn(List<String> values) {
            addCriterion("change_element in", values, "changeElement");
            return this;
        }

        public Criteria andChangeElementNotIn(List<String> values) {
            addCriterion("change_element not in", values, "changeElement");
            return this;
        }

        public Criteria andChangeElementBetween(String value1, String value2) {
            addCriterion("change_element between", value1, value2, "changeElement");
            return this;
        }

        public Criteria andChangeElementNotBetween(String value1, String value2) {
            addCriterion("change_element not between", value1, value2, "changeElement");
            return this;
        }

        public Criteria andResulttypeIsNull() {
            addCriterion("resulttype is null");
            return this;
        }

        public Criteria andResulttypeIsNotNull() {
            addCriterion("resulttype is not null");
            return this;
        }

        public Criteria andResulttypeEqualTo(String value) {
            addCriterion("resulttype =", value, "resulttype");
            return this;
        }

        public Criteria andResulttypeNotEqualTo(String value) {
            addCriterion("resulttype <>", value, "resulttype");
            return this;
        }

        public Criteria andResulttypeGreaterThan(String value) {
            addCriterion("resulttype >", value, "resulttype");
            return this;
        }

        public Criteria andResulttypeGreaterThanOrEqualTo(String value) {
            addCriterion("resulttype >=", value, "resulttype");
            return this;
        }

        public Criteria andResulttypeLessThan(String value) {
            addCriterion("resulttype <", value, "resulttype");
            return this;
        }

        public Criteria andResulttypeLessThanOrEqualTo(String value) {
            addCriterion("resulttype <=", value, "resulttype");
            return this;
        }

        public Criteria andResulttypeLike(String value) {
            addCriterion("resulttype like", value, "resulttype");
            return this;
        }

        public Criteria andResulttypeNotLike(String value) {
            addCriterion("resulttype not like", value, "resulttype");
            return this;
        }

        public Criteria andResulttypeIn(List<String> values) {
            addCriterion("resulttype in", values, "resulttype");
            return this;
        }

        public Criteria andResulttypeNotIn(List<String> values) {
            addCriterion("resulttype not in", values, "resulttype");
            return this;
        }

        public Criteria andResulttypeBetween(String value1, String value2) {
            addCriterion("resulttype between", value1, value2, "resulttype");
            return this;
        }

        public Criteria andResulttypeNotBetween(String value1, String value2) {
            addCriterion("resulttype not between", value1, value2, "resulttype");
            return this;
        }
    }
}