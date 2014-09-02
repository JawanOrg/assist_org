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

public class SuptCheckExample extends BaseExample {
    protected String orderByClause;
    
    protected String beforeOrSQL;

    protected List<Criteria> oredCriteria;

    public SuptCheckExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptCheckExample(SuptCheckExample example) {
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

        public Criteria andCheckIdIsNull() {
            addCriterion("check_id is null");
            return this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("check_id is not null");
            return this;
        }

        public Criteria andCheckIdEqualTo(String value) {
            addCriterion("check_id =", value, "checkId");
            return this;
        }

        public Criteria andCheckIdNotEqualTo(String value) {
            addCriterion("check_id <>", value, "checkId");
            return this;
        }

        public Criteria andCheckIdGreaterThan(String value) {
            addCriterion("check_id >", value, "checkId");
            return this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_id >=", value, "checkId");
            return this;
        }

        public Criteria andCheckIdLessThan(String value) {
            addCriterion("check_id <", value, "checkId");
            return this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(String value) {
            addCriterion("check_id <=", value, "checkId");
            return this;
        }

        public Criteria andCheckIdLike(String value) {
            addCriterion("check_id like", value, "checkId");
            return this;
        }

        public Criteria andCheckIdNotLike(String value) {
            addCriterion("check_id not like", value, "checkId");
            return this;
        }

        public Criteria andCheckIdIn(List<String> values) {
            addCriterion("check_id in", values, "checkId");
            return this;
        }

        public Criteria andCheckIdNotIn(List<String> values) {
            addCriterion("check_id not in", values, "checkId");
            return this;
        }

        public Criteria andCheckIdBetween(String value1, String value2) {
            addCriterion("check_id between", value1, value2, "checkId");
            return this;
        }

        public Criteria andCheckIdNotBetween(String value1, String value2) {
            addCriterion("check_id not between", value1, value2, "checkId");
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

        public Criteria andIsNullIsNull() {
            addCriterion("is_null is null");
            return this;
        }

        public Criteria andIsNullIsNotNull() {
            addCriterion("is_null is not null");
            return this;
        }

        public Criteria andIsNullEqualTo(String value) {
            addCriterion("is_null =", value, "isNull");
            return this;
        }

        public Criteria andIsNullNotEqualTo(String value) {
            addCriterion("is_null <>", value, "isNull");
            return this;
        }

        public Criteria andIsNullGreaterThan(String value) {
            addCriterion("is_null >", value, "isNull");
            return this;
        }

        public Criteria andIsNullGreaterThanOrEqualTo(String value) {
            addCriterion("is_null >=", value, "isNull");
            return this;
        }

        public Criteria andIsNullLessThan(String value) {
            addCriterion("is_null <", value, "isNull");
            return this;
        }

        public Criteria andIsNullLessThanOrEqualTo(String value) {
            addCriterion("is_null <=", value, "isNull");
            return this;
        }

        public Criteria andIsNullLike(String value) {
            addCriterion("is_null like", value, "isNull");
            return this;
        }

        public Criteria andIsNullNotLike(String value) {
            addCriterion("is_null not like", value, "isNull");
            return this;
        }

        public Criteria andIsNullIn(List<String> values) {
            addCriterion("is_null in", values, "isNull");
            return this;
        }

        public Criteria andIsNullNotIn(List<String> values) {
            addCriterion("is_null not in", values, "isNull");
            return this;
        }

        public Criteria andIsNullBetween(String value1, String value2) {
            addCriterion("is_null between", value1, value2, "isNull");
            return this;
        }

        public Criteria andIsNullNotBetween(String value1, String value2) {
            addCriterion("is_null not between", value1, value2, "isNull");
            return this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return this;
        }

        public Criteria andFieldLegthIsNull() {
            addCriterion("field_legth is null");
            return this;
        }

        public Criteria andFieldLegthIsNotNull() {
            addCriterion("field_legth is not null");
            return this;
        }

        public Criteria andFieldLegthEqualTo(String value) {
            addCriterion("field_legth =", value, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthNotEqualTo(String value) {
            addCriterion("field_legth <>", value, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthGreaterThan(String value) {
            addCriterion("field_legth >", value, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthGreaterThanOrEqualTo(String value) {
            addCriterion("field_legth >=", value, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthLessThan(String value) {
            addCriterion("field_legth <", value, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthLessThanOrEqualTo(String value) {
            addCriterion("field_legth <=", value, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthLike(String value) {
            addCriterion("field_legth like", value, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthNotLike(String value) {
            addCriterion("field_legth not like", value, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthIn(List<String> values) {
            addCriterion("field_legth in", values, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthNotIn(List<String> values) {
            addCriterion("field_legth not in", values, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthBetween(String value1, String value2) {
            addCriterion("field_legth between", value1, value2, "fieldLegth");
            return this;
        }

        public Criteria andFieldLegthNotBetween(String value1, String value2) {
            addCriterion("field_legth not between", value1, value2, "fieldLegth");
            return this;
        }

        public Criteria andFormatIsNull() {
            addCriterion("format is null");
            return this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("format is not null");
            return this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("format =", value, "format");
            return this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("format <>", value, "format");
            return this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("format >", value, "format");
            return this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("format >=", value, "format");
            return this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("format <", value, "format");
            return this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("format <=", value, "format");
            return this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("format like", value, "format");
            return this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("format not like", value, "format");
            return this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("format in", values, "format");
            return this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("format not in", values, "format");
            return this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("format between", value1, value2, "format");
            return this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("format not between", value1, value2, "format");
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