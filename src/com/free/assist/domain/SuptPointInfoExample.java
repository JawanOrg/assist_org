/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuptPointInfoExample  extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptPointInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptPointInfoExample(SuptPointInfoExample example) {
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

        public Criteria andPointIdIsNull() {
            addCriterion("POINT_ID is null");
            return this;
        }

        public Criteria andPointIdIsNotNull() {
            addCriterion("POINT_ID is not null");
            return this;
        }

        public Criteria andPointIdEqualTo(String value) {
            addCriterion("POINT_ID =", value, "pointId");
            return this;
        }

        public Criteria andPointIdNotEqualTo(String value) {
            addCriterion("POINT_ID <>", value, "pointId");
            return this;
        }

        public Criteria andPointIdGreaterThan(String value) {
            addCriterion("POINT_ID >", value, "pointId");
            return this;
        }

        public Criteria andPointIdGreaterThanOrEqualTo(String value) {
            addCriterion("POINT_ID >=", value, "pointId");
            return this;
        }

        public Criteria andPointIdLessThan(String value) {
            addCriterion("POINT_ID <", value, "pointId");
            return this;
        }

        public Criteria andPointIdLessThanOrEqualTo(String value) {
            addCriterion("POINT_ID <=", value, "pointId");
            return this;
        }

        public Criteria andPointIdLike(String value) {
            addCriterion("POINT_ID like", value, "pointId");
            return this;
        }

        public Criteria andPointIdNotLike(String value) {
            addCriterion("POINT_ID not like", value, "pointId");
            return this;
        }

        public Criteria andPointIdIn(List<String> values) {
            addCriterion("POINT_ID in", values, "pointId");
            return this;
        }

        public Criteria andPointIdNotIn(List<String> values) {
            addCriterion("POINT_ID not in", values, "pointId");
            return this;
        }

        public Criteria andPointIdBetween(String value1, String value2) {
            addCriterion("POINT_ID between", value1, value2, "pointId");
            return this;
        }

        public Criteria andPointIdNotBetween(String value1, String value2) {
            addCriterion("POINT_ID not between", value1, value2, "pointId");
            return this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("LATITUDE =", value, "latitude");
            return this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("LATITUDE >", value, "latitude");
            return this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("LATITUDE <", value, "latitude");
            return this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("LATITUDE like", value, "latitude");
            return this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("LATITUDE not like", value, "latitude");
            return this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return this;
        }

        public Criteria andPointTypeIsNull() {
            addCriterion("POINT_TYPE is null");
            return this;
        }

        public Criteria andPointTypeIsNotNull() {
            addCriterion("POINT_TYPE is not null");
            return this;
        }

        public Criteria andPointTypeEqualTo(String value) {
            addCriterion("POINT_TYPE =", value, "pointType");
            return this;
        }

        public Criteria andPointTypeNotEqualTo(String value) {
            addCriterion("POINT_TYPE <>", value, "pointType");
            return this;
        }

        public Criteria andPointTypeGreaterThan(String value) {
            addCriterion("POINT_TYPE >", value, "pointType");
            return this;
        }

        public Criteria andPointTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POINT_TYPE >=", value, "pointType");
            return this;
        }

        public Criteria andPointTypeLessThan(String value) {
            addCriterion("POINT_TYPE <", value, "pointType");
            return this;
        }

        public Criteria andPointTypeLessThanOrEqualTo(String value) {
            addCriterion("POINT_TYPE <=", value, "pointType");
            return this;
        }

        public Criteria andPointTypeLike(String value) {
            addCriterion("POINT_TYPE like", value, "pointType");
            return this;
        }

        public Criteria andPointTypeNotLike(String value) {
            addCriterion("POINT_TYPE not like", value, "pointType");
            return this;
        }

        public Criteria andPointTypeIn(List<String> values) {
            addCriterion("POINT_TYPE in", values, "pointType");
            return this;
        }

        public Criteria andPointTypeNotIn(List<String> values) {
            addCriterion("POINT_TYPE not in", values, "pointType");
            return this;
        }

        public Criteria andPointTypeBetween(String value1, String value2) {
            addCriterion("POINT_TYPE between", value1, value2, "pointType");
            return this;
        }

        public Criteria andPointTypeNotBetween(String value1, String value2) {
            addCriterion("POINT_TYPE not between", value1, value2, "pointType");
            return this;
        }

        public Criteria andImageTypeIsNull() {
            addCriterion("IMAGE_TYPE is null");
            return this;
        }

        public Criteria andImageTypeIsNotNull() {
            addCriterion("IMAGE_TYPE is not null");
            return this;
        }

        public Criteria andImageTypeEqualTo(String value) {
            addCriterion("IMAGE_TYPE =", value, "imageType");
            return this;
        }

        public Criteria andImageTypeNotEqualTo(String value) {
            addCriterion("IMAGE_TYPE <>", value, "imageType");
            return this;
        }

        public Criteria andImageTypeGreaterThan(String value) {
            addCriterion("IMAGE_TYPE >", value, "imageType");
            return this;
        }

        public Criteria andImageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_TYPE >=", value, "imageType");
            return this;
        }

        public Criteria andImageTypeLessThan(String value) {
            addCriterion("IMAGE_TYPE <", value, "imageType");
            return this;
        }

        public Criteria andImageTypeLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_TYPE <=", value, "imageType");
            return this;
        }

        public Criteria andImageTypeLike(String value) {
            addCriterion("IMAGE_TYPE like", value, "imageType");
            return this;
        }

        public Criteria andImageTypeNotLike(String value) {
            addCriterion("IMAGE_TYPE not like", value, "imageType");
            return this;
        }

        public Criteria andImageTypeIn(List<String> values) {
            addCriterion("IMAGE_TYPE in", values, "imageType");
            return this;
        }

        public Criteria andImageTypeNotIn(List<String> values) {
            addCriterion("IMAGE_TYPE not in", values, "imageType");
            return this;
        }

        public Criteria andImageTypeBetween(String value1, String value2) {
            addCriterion("IMAGE_TYPE between", value1, value2, "imageType");
            return this;
        }

        public Criteria andImageTypeNotBetween(String value1, String value2) {
            addCriterion("IMAGE_TYPE not between", value1, value2, "imageType");
            return this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("GRADE =", value, "grade");
            return this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("GRADE <>", value, "grade");
            return this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("GRADE >", value, "grade");
            return this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE >=", value, "grade");
            return this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("GRADE <", value, "grade");
            return this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE <=", value, "grade");
            return this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("GRADE in", values, "grade");
            return this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("GRADE not in", values, "grade");
            return this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return this;
        }
    }
}