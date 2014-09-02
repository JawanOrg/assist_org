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

public class SuptReturnValidExample extends BaseExample {
    protected String orderByClause;
    
    protected String beforeOrSQL;

    protected List<Criteria> oredCriteria;

    public SuptReturnValidExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptReturnValidExample(SuptReturnValidExample example) {
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

        public Criteria andReturnValidIdIsNull() {
            addCriterion("return_valid_id is null");
            return this;
        }

        public Criteria andReturnValidIdIsNotNull() {
            addCriterion("return_valid_id is not null");
            return this;
        }

        public Criteria andReturnValidIdEqualTo(String value) {
            addCriterion("return_valid_id =", value, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdNotEqualTo(String value) {
            addCriterion("return_valid_id <>", value, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdGreaterThan(String value) {
            addCriterion("return_valid_id >", value, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdGreaterThanOrEqualTo(String value) {
            addCriterion("return_valid_id >=", value, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdLessThan(String value) {
            addCriterion("return_valid_id <", value, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdLessThanOrEqualTo(String value) {
            addCriterion("return_valid_id <=", value, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdLike(String value) {
            addCriterion("return_valid_id like", value, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdNotLike(String value) {
            addCriterion("return_valid_id not like", value, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdIn(List<String> values) {
            addCriterion("return_valid_id in", values, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdNotIn(List<String> values) {
            addCriterion("return_valid_id not in", values, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdBetween(String value1, String value2) {
            addCriterion("return_valid_id between", value1, value2, "returnValidId");
            return this;
        }

        public Criteria andReturnValidIdNotBetween(String value1, String value2) {
            addCriterion("return_valid_id not between", value1, value2, "returnValidId");
            return this;
        }

        public Criteria andOperNameIsNull() {
            addCriterion("oper_name is null");
            return this;
        }

        public Criteria andOperNameIsNotNull() {
            addCriterion("oper_name is not null");
            return this;
        }

        public Criteria andOperNameEqualTo(String value) {
            addCriterion("oper_name =", value, "operName");
            return this;
        }

        public Criteria andOperNameNotEqualTo(String value) {
            addCriterion("oper_name <>", value, "operName");
            return this;
        }

        public Criteria andOperNameGreaterThan(String value) {
            addCriterion("oper_name >", value, "operName");
            return this;
        }

        public Criteria andOperNameGreaterThanOrEqualTo(String value) {
            addCriterion("oper_name >=", value, "operName");
            return this;
        }

        public Criteria andOperNameLessThan(String value) {
            addCriterion("oper_name <", value, "operName");
            return this;
        }

        public Criteria andOperNameLessThanOrEqualTo(String value) {
            addCriterion("oper_name <=", value, "operName");
            return this;
        }

        public Criteria andOperNameLike(String value) {
            addCriterion("oper_name like", value, "operName");
            return this;
        }

        public Criteria andOperNameNotLike(String value) {
            addCriterion("oper_name not like", value, "operName");
            return this;
        }

        public Criteria andOperNameIn(List<String> values) {
            addCriterion("oper_name in", values, "operName");
            return this;
        }

        public Criteria andOperNameNotIn(List<String> values) {
            addCriterion("oper_name not in", values, "operName");
            return this;
        }

        public Criteria andOperNameBetween(String value1, String value2) {
            addCriterion("oper_name between", value1, value2, "operName");
            return this;
        }

        public Criteria andOperNameNotBetween(String value1, String value2) {
            addCriterion("oper_name not between", value1, value2, "operName");
            return this;
        }

        public Criteria andOpernamePathIsNull() {
            addCriterion("opername_path is null");
            return this;
        }

        public Criteria andOpernamePathIsNotNull() {
            addCriterion("opername_path is not null");
            return this;
        }

        public Criteria andOpernamePathEqualTo(String value) {
            addCriterion("opername_path =", value, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathNotEqualTo(String value) {
            addCriterion("opername_path <>", value, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathGreaterThan(String value) {
            addCriterion("opername_path >", value, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathGreaterThanOrEqualTo(String value) {
            addCriterion("opername_path >=", value, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathLessThan(String value) {
            addCriterion("opername_path <", value, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathLessThanOrEqualTo(String value) {
            addCriterion("opername_path <=", value, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathLike(String value) {
            addCriterion("opername_path like", value, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathNotLike(String value) {
            addCriterion("opername_path not like", value, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathIn(List<String> values) {
            addCriterion("opername_path in", values, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathNotIn(List<String> values) {
            addCriterion("opername_path not in", values, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathBetween(String value1, String value2) {
            addCriterion("opername_path between", value1, value2, "opernamePath");
            return this;
        }

        public Criteria andOpernamePathNotBetween(String value1, String value2) {
            addCriterion("opername_path not between", value1, value2, "opernamePath");
            return this;
        }

        public Criteria andOperpathFromIsNull() {
            addCriterion("operpath_from is null");
            return this;
        }

        public Criteria andOperpathFromIsNotNull() {
            addCriterion("operpath_from is not null");
            return this;
        }

        public Criteria andOperpathFromEqualTo(String value) {
            addCriterion("operpath_from =", value, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromNotEqualTo(String value) {
            addCriterion("operpath_from <>", value, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromGreaterThan(String value) {
            addCriterion("operpath_from >", value, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromGreaterThanOrEqualTo(String value) {
            addCriterion("operpath_from >=", value, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromLessThan(String value) {
            addCriterion("operpath_from <", value, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromLessThanOrEqualTo(String value) {
            addCriterion("operpath_from <=", value, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromLike(String value) {
            addCriterion("operpath_from like", value, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromNotLike(String value) {
            addCriterion("operpath_from not like", value, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromIn(List<String> values) {
            addCriterion("operpath_from in", values, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromNotIn(List<String> values) {
            addCriterion("operpath_from not in", values, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromBetween(String value1, String value2) {
            addCriterion("operpath_from between", value1, value2, "operpathFrom");
            return this;
        }

        public Criteria andOperpathFromNotBetween(String value1, String value2) {
            addCriterion("operpath_from not between", value1, value2, "operpathFrom");
            return this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("field_name is null");
            return this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("field_name is not null");
            return this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("field_name =", value, "fieldName");
            return this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("field_name <>", value, "fieldName");
            return this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("field_name >", value, "fieldName");
            return this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("field_name >=", value, "fieldName");
            return this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("field_name <", value, "fieldName");
            return this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("field_name <=", value, "fieldName");
            return this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("field_name like", value, "fieldName");
            return this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("field_name not like", value, "fieldName");
            return this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("field_name in", values, "fieldName");
            return this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("field_name not in", values, "fieldName");
            return this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("field_name between", value1, value2, "fieldName");
            return this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("field_name not between", value1, value2, "fieldName");
            return this;
        }

        public Criteria andFieldPathIsNull() {
            addCriterion("field_path is null");
            return this;
        }

        public Criteria andFieldPathIsNotNull() {
            addCriterion("field_path is not null");
            return this;
        }

        public Criteria andFieldPathEqualTo(String value) {
            addCriterion("field_path =", value, "fieldPath");
            return this;
        }

        public Criteria andFieldPathNotEqualTo(String value) {
            addCriterion("field_path <>", value, "fieldPath");
            return this;
        }

        public Criteria andFieldPathGreaterThan(String value) {
            addCriterion("field_path >", value, "fieldPath");
            return this;
        }

        public Criteria andFieldPathGreaterThanOrEqualTo(String value) {
            addCriterion("field_path >=", value, "fieldPath");
            return this;
        }

        public Criteria andFieldPathLessThan(String value) {
            addCriterion("field_path <", value, "fieldPath");
            return this;
        }

        public Criteria andFieldPathLessThanOrEqualTo(String value) {
            addCriterion("field_path <=", value, "fieldPath");
            return this;
        }

        public Criteria andFieldPathLike(String value) {
            addCriterion("field_path like", value, "fieldPath");
            return this;
        }

        public Criteria andFieldPathNotLike(String value) {
            addCriterion("field_path not like", value, "fieldPath");
            return this;
        }

        public Criteria andFieldPathIn(List<String> values) {
            addCriterion("field_path in", values, "fieldPath");
            return this;
        }

        public Criteria andFieldPathNotIn(List<String> values) {
            addCriterion("field_path not in", values, "fieldPath");
            return this;
        }

        public Criteria andFieldPathBetween(String value1, String value2) {
            addCriterion("field_path between", value1, value2, "fieldPath");
            return this;
        }

        public Criteria andFieldPathNotBetween(String value1, String value2) {
            addCriterion("field_path not between", value1, value2, "fieldPath");
            return this;
        }

        public Criteria andFieldpathFromIsNull() {
            addCriterion("fieldpath_from is null");
            return this;
        }

        public Criteria andFieldpathFromIsNotNull() {
            addCriterion("fieldpath_from is not null");
            return this;
        }

        public Criteria andFieldpathFromEqualTo(String value) {
            addCriterion("fieldpath_from =", value, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromNotEqualTo(String value) {
            addCriterion("fieldpath_from <>", value, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromGreaterThan(String value) {
            addCriterion("fieldpath_from >", value, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromGreaterThanOrEqualTo(String value) {
            addCriterion("fieldpath_from >=", value, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromLessThan(String value) {
            addCriterion("fieldpath_from <", value, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromLessThanOrEqualTo(String value) {
            addCriterion("fieldpath_from <=", value, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromLike(String value) {
            addCriterion("fieldpath_from like", value, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromNotLike(String value) {
            addCriterion("fieldpath_from not like", value, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromIn(List<String> values) {
            addCriterion("fieldpath_from in", values, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromNotIn(List<String> values) {
            addCriterion("fieldpath_from not in", values, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromBetween(String value1, String value2) {
            addCriterion("fieldpath_from between", value1, value2, "fieldpathFrom");
            return this;
        }

        public Criteria andFieldpathFromNotBetween(String value1, String value2) {
            addCriterion("fieldpath_from not between", value1, value2, "fieldpathFrom");
            return this;
        }

        public Criteria andPrikeyNameIsNull() {
            addCriterion("prikey_name is null");
            return this;
        }

        public Criteria andPrikeyNameIsNotNull() {
            addCriterion("prikey_name is not null");
            return this;
        }

        public Criteria andPrikeyNameEqualTo(String value) {
            addCriterion("prikey_name =", value, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameNotEqualTo(String value) {
            addCriterion("prikey_name <>", value, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameGreaterThan(String value) {
            addCriterion("prikey_name >", value, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameGreaterThanOrEqualTo(String value) {
            addCriterion("prikey_name >=", value, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameLessThan(String value) {
            addCriterion("prikey_name <", value, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameLessThanOrEqualTo(String value) {
            addCriterion("prikey_name <=", value, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameLike(String value) {
            addCriterion("prikey_name like", value, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameNotLike(String value) {
            addCriterion("prikey_name not like", value, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameIn(List<String> values) {
            addCriterion("prikey_name in", values, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameNotIn(List<String> values) {
            addCriterion("prikey_name not in", values, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameBetween(String value1, String value2) {
            addCriterion("prikey_name between", value1, value2, "prikeyName");
            return this;
        }

        public Criteria andPrikeyNameNotBetween(String value1, String value2) {
            addCriterion("prikey_name not between", value1, value2, "prikeyName");
            return this;
        }

        public Criteria andPrikeyPathIsNull() {
            addCriterion("prikey_path is null");
            return this;
        }

        public Criteria andPrikeyPathIsNotNull() {
            addCriterion("prikey_path is not null");
            return this;
        }

        public Criteria andPrikeyPathEqualTo(String value) {
            addCriterion("prikey_path =", value, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathNotEqualTo(String value) {
            addCriterion("prikey_path <>", value, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathGreaterThan(String value) {
            addCriterion("prikey_path >", value, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathGreaterThanOrEqualTo(String value) {
            addCriterion("prikey_path >=", value, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathLessThan(String value) {
            addCriterion("prikey_path <", value, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathLessThanOrEqualTo(String value) {
            addCriterion("prikey_path <=", value, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathLike(String value) {
            addCriterion("prikey_path like", value, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathNotLike(String value) {
            addCriterion("prikey_path not like", value, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathIn(List<String> values) {
            addCriterion("prikey_path in", values, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathNotIn(List<String> values) {
            addCriterion("prikey_path not in", values, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathBetween(String value1, String value2) {
            addCriterion("prikey_path between", value1, value2, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyPathNotBetween(String value1, String value2) {
            addCriterion("prikey_path not between", value1, value2, "prikeyPath");
            return this;
        }

        public Criteria andPrikeyFromIsNull() {
            addCriterion("prikey_from is null");
            return this;
        }

        public Criteria andPrikeyFromIsNotNull() {
            addCriterion("prikey_from is not null");
            return this;
        }

        public Criteria andPrikeyFromEqualTo(String value) {
            addCriterion("prikey_from =", value, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromNotEqualTo(String value) {
            addCriterion("prikey_from <>", value, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromGreaterThan(String value) {
            addCriterion("prikey_from >", value, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromGreaterThanOrEqualTo(String value) {
            addCriterion("prikey_from >=", value, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromLessThan(String value) {
            addCriterion("prikey_from <", value, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromLessThanOrEqualTo(String value) {
            addCriterion("prikey_from <=", value, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromLike(String value) {
            addCriterion("prikey_from like", value, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromNotLike(String value) {
            addCriterion("prikey_from not like", value, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromIn(List<String> values) {
            addCriterion("prikey_from in", values, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromNotIn(List<String> values) {
            addCriterion("prikey_from not in", values, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromBetween(String value1, String value2) {
            addCriterion("prikey_from between", value1, value2, "prikeyFrom");
            return this;
        }

        public Criteria andPrikeyFromNotBetween(String value1, String value2) {
            addCriterion("prikey_from not between", value1, value2, "prikeyFrom");
            return this;
        }

        public Criteria andCimpFaceIdIsNull() {
            addCriterion("cimp_face_id is null");
            return this;
        }

        public Criteria andCimpFaceIdIsNotNull() {
            addCriterion("cimp_face_id is not null");
            return this;
        }

        public Criteria andCimpFaceIdEqualTo(String value) {
            addCriterion("cimp_face_id =", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotEqualTo(String value) {
            addCriterion("cimp_face_id <>", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdGreaterThan(String value) {
            addCriterion("cimp_face_id >", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("cimp_face_id >=", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLessThan(String value) {
            addCriterion("cimp_face_id <", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLessThanOrEqualTo(String value) {
            addCriterion("cimp_face_id <=", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdLike(String value) {
            addCriterion("cimp_face_id like", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotLike(String value) {
            addCriterion("cimp_face_id not like", value, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdIn(List<String> values) {
            addCriterion("cimp_face_id in", values, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotIn(List<String> values) {
            addCriterion("cimp_face_id not in", values, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdBetween(String value1, String value2) {
            addCriterion("cimp_face_id between", value1, value2, "cimpFaceId");
            return this;
        }

        public Criteria andCimpFaceIdNotBetween(String value1, String value2) {
            addCriterion("cimp_face_id not between", value1, value2, "cimpFaceId");
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