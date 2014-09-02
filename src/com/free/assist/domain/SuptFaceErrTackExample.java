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

public class SuptFaceErrTackExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptFaceErrTackExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptFaceErrTackExample(SuptFaceErrTackExample example) {
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

        public Criteria andErrIdIsNull() {
            addCriterion("err_id is null");
            return this;
        }

        public Criteria andErrIdIsNotNull() {
            addCriterion("err_id is not null");
            return this;
        }

        public Criteria andErrIdEqualTo(String value) {
            addCriterion("err_id =", value, "errId");
            return this;
        }

        public Criteria andErrIdNotEqualTo(String value) {
            addCriterion("err_id <>", value, "errId");
            return this;
        }

        public Criteria andErrIdGreaterThan(String value) {
            addCriterion("err_id >", value, "errId");
            return this;
        }

        public Criteria andErrIdGreaterThanOrEqualTo(String value) {
            addCriterion("err_id >=", value, "errId");
            return this;
        }

        public Criteria andErrIdLessThan(String value) {
            addCriterion("err_id <", value, "errId");
            return this;
        }

        public Criteria andErrIdLessThanOrEqualTo(String value) {
            addCriterion("err_id <=", value, "errId");
            return this;
        }

        public Criteria andErrIdLike(String value) {
            addCriterion("err_id like", value, "errId");
            return this;
        }

        public Criteria andErrIdNotLike(String value) {
            addCriterion("err_id not like", value, "errId");
            return this;
        }

        public Criteria andErrIdIn(List<String> values) {
            addCriterion("err_id in", values, "errId");
            return this;
        }

        public Criteria andErrIdNotIn(List<String> values) {
            addCriterion("err_id not in", values, "errId");
            return this;
        }

        public Criteria andErrIdBetween(String value1, String value2) {
            addCriterion("err_id between", value1, value2, "errId");
            return this;
        }

        public Criteria andErrIdNotBetween(String value1, String value2) {
            addCriterion("err_id not between", value1, value2, "errId");
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

        public Criteria andErrBusinessIsNull() {
            addCriterion("err_business is null");
            return this;
        }

        public Criteria andErrBusinessIsNotNull() {
            addCriterion("err_business is not null");
            return this;
        }

        public Criteria andErrBusinessEqualTo(String value) {
            addCriterion("err_business =", value, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessNotEqualTo(String value) {
            addCriterion("err_business <>", value, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessGreaterThan(String value) {
            addCriterion("err_business >", value, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("err_business >=", value, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessLessThan(String value) {
            addCriterion("err_business <", value, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessLessThanOrEqualTo(String value) {
            addCriterion("err_business <=", value, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessLike(String value) {
            addCriterion("err_business like", value, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessNotLike(String value) {
            addCriterion("err_business not like", value, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessIn(List<String> values) {
            addCriterion("err_business in", values, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessNotIn(List<String> values) {
            addCriterion("err_business not in", values, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessBetween(String value1, String value2) {
            addCriterion("err_business between", value1, value2, "errBusiness");
            return this;
        }

        public Criteria andErrBusinessNotBetween(String value1, String value2) {
            addCriterion("err_business not between", value1, value2, "errBusiness");
            return this;
        }

        public Criteria andErrTypeIsNull() {
            addCriterion("err_type is null");
            return this;
        }

        public Criteria andErrTypeIsNotNull() {
            addCriterion("err_type is not null");
            return this;
        }

        public Criteria andErrTypeEqualTo(String value) {
            addCriterion("err_type =", value, "errType");
            return this;
        }

        public Criteria andErrTypeNotEqualTo(String value) {
            addCriterion("err_type <>", value, "errType");
            return this;
        }

        public Criteria andErrTypeGreaterThan(String value) {
            addCriterion("err_type >", value, "errType");
            return this;
        }

        public Criteria andErrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("err_type >=", value, "errType");
            return this;
        }

        public Criteria andErrTypeLessThan(String value) {
            addCriterion("err_type <", value, "errType");
            return this;
        }

        public Criteria andErrTypeLessThanOrEqualTo(String value) {
            addCriterion("err_type <=", value, "errType");
            return this;
        }

        public Criteria andErrTypeLike(String value) {
            addCriterion("err_type like", value, "errType");
            return this;
        }

        public Criteria andErrTypeNotLike(String value) {
            addCriterion("err_type not like", value, "errType");
            return this;
        }

        public Criteria andErrTypeIn(List<String> values) {
            addCriterion("err_type in", values, "errType");
            return this;
        }

        public Criteria andErrTypeNotIn(List<String> values) {
            addCriterion("err_type not in", values, "errType");
            return this;
        }

        public Criteria andErrTypeBetween(String value1, String value2) {
            addCriterion("err_type between", value1, value2, "errType");
            return this;
        }

        public Criteria andErrTypeNotBetween(String value1, String value2) {
            addCriterion("err_type not between", value1, value2, "errType");
            return this;
        }
    }
}