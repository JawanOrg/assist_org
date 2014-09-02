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

public class SuptTaticElementExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptTaticElementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptTaticElementExample(SuptTaticElementExample example) {
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

        public Criteria andElementnameIsNull() {
            addCriterion("elementName is null");
            return this;
        }

        public Criteria andElementnameIsNotNull() {
            addCriterion("elementName is not null");
            return this;
        }

        public Criteria andElementnameEqualTo(String value) {
            addCriterion("elementName =", value, "elementname");
            return this;
        }

        public Criteria andElementnameNotEqualTo(String value) {
            addCriterion("elementName <>", value, "elementname");
            return this;
        }

        public Criteria andElementnameGreaterThan(String value) {
            addCriterion("elementName >", value, "elementname");
            return this;
        }

        public Criteria andElementnameGreaterThanOrEqualTo(String value) {
            addCriterion("elementName >=", value, "elementname");
            return this;
        }

        public Criteria andElementnameLessThan(String value) {
            addCriterion("elementName <", value, "elementname");
            return this;
        }

        public Criteria andElementnameLessThanOrEqualTo(String value) {
            addCriterion("elementName <=", value, "elementname");
            return this;
        }

        public Criteria andElementnameLike(String value) {
            addCriterion("elementName like", value, "elementname");
            return this;
        }

        public Criteria andElementnameNotLike(String value) {
            addCriterion("elementName not like", value, "elementname");
            return this;
        }

        public Criteria andElementnameIn(List<String> values) {
            addCriterion("elementName in", values, "elementname");
            return this;
        }

        public Criteria andElementnameNotIn(List<String> values) {
            addCriterion("elementName not in", values, "elementname");
            return this;
        }

        public Criteria andElementnameBetween(String value1, String value2) {
            addCriterion("elementName between", value1, value2, "elementname");
            return this;
        }

        public Criteria andElementnameNotBetween(String value1, String value2) {
            addCriterion("elementName not between", value1, value2, "elementname");
            return this;
        }

        public Criteria andElementcodeIsNull() {
            addCriterion("elementCode is null");
            return this;
        }

        public Criteria andElementcodeIsNotNull() {
            addCriterion("elementCode is not null");
            return this;
        }

        public Criteria andElementcodeEqualTo(String value) {
            addCriterion("elementCode =", value, "elementcode");
            return this;
        }

        public Criteria andElementcodeNotEqualTo(String value) {
            addCriterion("elementCode <>", value, "elementcode");
            return this;
        }

        public Criteria andElementcodeGreaterThan(String value) {
            addCriterion("elementCode >", value, "elementcode");
            return this;
        }

        public Criteria andElementcodeGreaterThanOrEqualTo(String value) {
            addCriterion("elementCode >=", value, "elementcode");
            return this;
        }

        public Criteria andElementcodeLessThan(String value) {
            addCriterion("elementCode <", value, "elementcode");
            return this;
        }

        public Criteria andElementcodeLessThanOrEqualTo(String value) {
            addCriterion("elementCode <=", value, "elementcode");
            return this;
        }

        public Criteria andElementcodeLike(String value) {
            addCriterion("elementCode like", value, "elementcode");
            return this;
        }

        public Criteria andElementcodeNotLike(String value) {
            addCriterion("elementCode not like", value, "elementcode");
            return this;
        }

        public Criteria andElementcodeIn(List<String> values) {
            addCriterion("elementCode in", values, "elementcode");
            return this;
        }

        public Criteria andElementcodeNotIn(List<String> values) {
            addCriterion("elementCode not in", values, "elementcode");
            return this;
        }

        public Criteria andElementcodeBetween(String value1, String value2) {
            addCriterion("elementCode between", value1, value2, "elementcode");
            return this;
        }

        public Criteria andElementcodeNotBetween(String value1, String value2) {
            addCriterion("elementCode not between", value1, value2, "elementcode");
            return this;
        }

        public Criteria andSourcetypeIsNull() {
            addCriterion("sourceType is null");
            return this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("sourceType is not null");
            return this;
        }

        public Criteria andSourcetypeEqualTo(String value) {
            addCriterion("sourceType =", value, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeNotEqualTo(String value) {
            addCriterion("sourceType <>", value, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeGreaterThan(String value) {
            addCriterion("sourceType >", value, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("sourceType >=", value, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeLessThan(String value) {
            addCriterion("sourceType <", value, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(String value) {
            addCriterion("sourceType <=", value, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeLike(String value) {
            addCriterion("sourceType like", value, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeNotLike(String value) {
            addCriterion("sourceType not like", value, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeIn(List<String> values) {
            addCriterion("sourceType in", values, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeNotIn(List<String> values) {
            addCriterion("sourceType not in", values, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeBetween(String value1, String value2) {
            addCriterion("sourceType between", value1, value2, "sourcetype");
            return this;
        }

        public Criteria andSourcetypeNotBetween(String value1, String value2) {
            addCriterion("sourceType not between", value1, value2, "sourcetype");
            return this;
        }

        public Criteria andSqlstrIsNull() {
            addCriterion("sqlStr is null");
            return this;
        }

        public Criteria andSqlstrIsNotNull() {
            addCriterion("sqlStr is not null");
            return this;
        }

        public Criteria andSqlstrEqualTo(String value) {
            addCriterion("sqlStr =", value, "sqlstr");
            return this;
        }

        public Criteria andSqlstrNotEqualTo(String value) {
            addCriterion("sqlStr <>", value, "sqlstr");
            return this;
        }

        public Criteria andSqlstrGreaterThan(String value) {
            addCriterion("sqlStr >", value, "sqlstr");
            return this;
        }

        public Criteria andSqlstrGreaterThanOrEqualTo(String value) {
            addCriterion("sqlStr >=", value, "sqlstr");
            return this;
        }

        public Criteria andSqlstrLessThan(String value) {
            addCriterion("sqlStr <", value, "sqlstr");
            return this;
        }

        public Criteria andSqlstrLessThanOrEqualTo(String value) {
            addCriterion("sqlStr <=", value, "sqlstr");
            return this;
        }

        public Criteria andSqlstrLike(String value) {
            addCriterion("sqlStr like", value, "sqlstr");
            return this;
        }

        public Criteria andSqlstrNotLike(String value) {
            addCriterion("sqlStr not like", value, "sqlstr");
            return this;
        }

        public Criteria andSqlstrIn(List<String> values) {
            addCriterion("sqlStr in", values, "sqlstr");
            return this;
        }

        public Criteria andSqlstrNotIn(List<String> values) {
            addCriterion("sqlStr not in", values, "sqlstr");
            return this;
        }

        public Criteria andSqlstrBetween(String value1, String value2) {
            addCriterion("sqlStr between", value1, value2, "sqlstr");
            return this;
        }

        public Criteria andSqlstrNotBetween(String value1, String value2) {
            addCriterion("sqlStr not between", value1, value2, "sqlstr");
            return this;
        }

        public Criteria andSpare1IsNull() {
            addCriterion("spare1 is null");
            return this;
        }

        public Criteria andSpare1IsNotNull() {
            addCriterion("spare1 is not null");
            return this;
        }

        public Criteria andSpare1EqualTo(String value) {
            addCriterion("spare1 =", value, "spare1");
            return this;
        }

        public Criteria andSpare1NotEqualTo(String value) {
            addCriterion("spare1 <>", value, "spare1");
            return this;
        }

        public Criteria andSpare1GreaterThan(String value) {
            addCriterion("spare1 >", value, "spare1");
            return this;
        }

        public Criteria andSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("spare1 >=", value, "spare1");
            return this;
        }

        public Criteria andSpare1LessThan(String value) {
            addCriterion("spare1 <", value, "spare1");
            return this;
        }

        public Criteria andSpare1LessThanOrEqualTo(String value) {
            addCriterion("spare1 <=", value, "spare1");
            return this;
        }

        public Criteria andSpare1Like(String value) {
            addCriterion("spare1 like", value, "spare1");
            return this;
        }

        public Criteria andSpare1NotLike(String value) {
            addCriterion("spare1 not like", value, "spare1");
            return this;
        }

        public Criteria andSpare1In(List<String> values) {
            addCriterion("spare1 in", values, "spare1");
            return this;
        }

        public Criteria andSpare1NotIn(List<String> values) {
            addCriterion("spare1 not in", values, "spare1");
            return this;
        }

        public Criteria andSpare1Between(String value1, String value2) {
            addCriterion("spare1 between", value1, value2, "spare1");
            return this;
        }

        public Criteria andSpare1NotBetween(String value1, String value2) {
            addCriterion("spare1 not between", value1, value2, "spare1");
            return this;
        }
    }
}