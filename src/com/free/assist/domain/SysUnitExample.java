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

public class SysUnitExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysUnitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysUnitExample(SysUnitExample example) {
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

        public Criteria andUnitIdIsNull() {
            addCriterion("Unit_Id is null");
            return this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("Unit_Id is not null");
            return this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("Unit_Id =", value, "unitId");
            return this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("Unit_Id <>", value, "unitId");
            return this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("Unit_Id >", value, "unitId");
            return this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("Unit_Id >=", value, "unitId");
            return this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("Unit_Id <", value, "unitId");
            return this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("Unit_Id <=", value, "unitId");
            return this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("Unit_Id like", value, "unitId");
            return this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("Unit_Id not like", value, "unitId");
            return this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("Unit_Id in", values, "unitId");
            return this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("Unit_Id not in", values, "unitId");
            return this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("Unit_Id between", value1, value2, "unitId");
            return this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("Unit_Id not between", value1, value2, "unitId");
            return this;
        }

        public Criteria andUnitTypeIsNull() {
            addCriterion("Unit_type is null");
            return this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("Unit_type is not null");
            return this;
        }

        public Criteria andUnitTypeEqualTo(String value) {
            addCriterion("Unit_type =", value, "unitType");
            return this;
        }

        public Criteria andUnitTypeNotEqualTo(String value) {
            addCriterion("Unit_type <>", value, "unitType");
            return this;
        }

        public Criteria andUnitTypeGreaterThan(String value) {
            addCriterion("Unit_type >", value, "unitType");
            return this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Unit_type >=", value, "unitType");
            return this;
        }

        public Criteria andUnitTypeLessThan(String value) {
            addCriterion("Unit_type <", value, "unitType");
            return this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("Unit_type <=", value, "unitType");
            return this;
        }

        public Criteria andUnitTypeLike(String value) {
            addCriterion("Unit_type like", value, "unitType");
            return this;
        }

        public Criteria andUnitTypeNotLike(String value) {
            addCriterion("Unit_type not like", value, "unitType");
            return this;
        }

        public Criteria andUnitTypeIn(List<String> values) {
            addCriterion("Unit_type in", values, "unitType");
            return this;
        }

        public Criteria andUnitTypeNotIn(List<String> values) {
            addCriterion("Unit_type not in", values, "unitType");
            return this;
        }

        public Criteria andUnitTypeBetween(String value1, String value2) {
            addCriterion("Unit_type between", value1, value2, "unitType");
            return this;
        }

        public Criteria andUnitTypeNotBetween(String value1, String value2) {
            addCriterion("Unit_type not between", value1, value2, "unitType");
            return this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("Unit_Name is null");
            return this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("Unit_Name is not null");
            return this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("Unit_Name =", value, "unitName");
            return this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("Unit_Name <>", value, "unitName");
            return this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("Unit_Name >", value, "unitName");
            return this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("Unit_Name >=", value, "unitName");
            return this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("Unit_Name <", value, "unitName");
            return this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("Unit_Name <=", value, "unitName");
            return this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("Unit_Name like", value, "unitName");
            return this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("Unit_Name not like", value, "unitName");
            return this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("Unit_Name in", values, "unitName");
            return this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("Unit_Name not in", values, "unitName");
            return this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("Unit_Name between", value1, value2, "unitName");
            return this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("Unit_Name not between", value1, value2, "unitName");
            return this;
        }

        public Criteria andUnitDesIsNull() {
            addCriterion("Unit_Des is null");
            return this;
        }

        public Criteria andUnitDesIsNotNull() {
            addCriterion("Unit_Des is not null");
            return this;
        }

        public Criteria andUnitDesEqualTo(String value) {
            addCriterion("Unit_Des =", value, "unitDes");
            return this;
        }

        public Criteria andUnitDesNotEqualTo(String value) {
            addCriterion("Unit_Des <>", value, "unitDes");
            return this;
        }

        public Criteria andUnitDesGreaterThan(String value) {
            addCriterion("Unit_Des >", value, "unitDes");
            return this;
        }

        public Criteria andUnitDesGreaterThanOrEqualTo(String value) {
            addCriterion("Unit_Des >=", value, "unitDes");
            return this;
        }

        public Criteria andUnitDesLessThan(String value) {
            addCriterion("Unit_Des <", value, "unitDes");
            return this;
        }

        public Criteria andUnitDesLessThanOrEqualTo(String value) {
            addCriterion("Unit_Des <=", value, "unitDes");
            return this;
        }

        public Criteria andUnitDesLike(String value) {
            addCriterion("Unit_Des like", value, "unitDes");
            return this;
        }

        public Criteria andUnitDesNotLike(String value) {
            addCriterion("Unit_Des not like", value, "unitDes");
            return this;
        }

        public Criteria andUnitDesIn(List<String> values) {
            addCriterion("Unit_Des in", values, "unitDes");
            return this;
        }

        public Criteria andUnitDesNotIn(List<String> values) {
            addCriterion("Unit_Des not in", values, "unitDes");
            return this;
        }

        public Criteria andUnitDesBetween(String value1, String value2) {
            addCriterion("Unit_Des between", value1, value2, "unitDes");
            return this;
        }

        public Criteria andUnitDesNotBetween(String value1, String value2) {
            addCriterion("Unit_Des not between", value1, value2, "unitDes");
            return this;
        }

        public Criteria andParentUnitidIsNull() {
            addCriterion("Parent_UnitId is null");
            return this;
        }

        public Criteria andParentUnitidIsNotNull() {
            addCriterion("Parent_UnitId is not null");
            return this;
        }

        public Criteria andParentUnitidEqualTo(String value) {
            addCriterion("Parent_UnitId =", value, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidNotEqualTo(String value) {
            addCriterion("Parent_UnitId <>", value, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidGreaterThan(String value) {
            addCriterion("Parent_UnitId >", value, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("Parent_UnitId >=", value, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidLessThan(String value) {
            addCriterion("Parent_UnitId <", value, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidLessThanOrEqualTo(String value) {
            addCriterion("Parent_UnitId <=", value, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidLike(String value) {
            addCriterion("Parent_UnitId like", value, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidNotLike(String value) {
            addCriterion("Parent_UnitId not like", value, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidIn(List<String> values) {
            addCriterion("Parent_UnitId in", values, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidNotIn(List<String> values) {
            addCriterion("Parent_UnitId not in", values, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidBetween(String value1, String value2) {
            addCriterion("Parent_UnitId between", value1, value2, "parentUnitid");
            return this;
        }

        public Criteria andParentUnitidNotBetween(String value1, String value2) {
            addCriterion("Parent_UnitId not between", value1, value2, "parentUnitid");
            return this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("Is_Valid is null");
            return this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("Is_Valid is not null");
            return this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("Is_Valid =", value, "isValid");
            return this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("Is_Valid <>", value, "isValid");
            return this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("Is_Valid >", value, "isValid");
            return this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("Is_Valid >=", value, "isValid");
            return this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("Is_Valid <", value, "isValid");
            return this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("Is_Valid <=", value, "isValid");
            return this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("Is_Valid like", value, "isValid");
            return this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("Is_Valid not like", value, "isValid");
            return this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("Is_Valid in", values, "isValid");
            return this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("Is_Valid not in", values, "isValid");
            return this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("Is_Valid between", value1, value2, "isValid");
            return this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("Is_Valid not between", value1, value2, "isValid");
            return this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("Sort_Order is null");
            return this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("Sort_Order is not null");
            return this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("Sort_Order =", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("Sort_Order <>", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("Sort_Order >", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sort_Order >=", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("Sort_Order <", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("Sort_Order <=", value, "sortOrder");
            return this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("Sort_Order in", values, "sortOrder");
            return this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("Sort_Order not in", values, "sortOrder");
            return this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("Sort_Order between", value1, value2, "sortOrder");
            return this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("Sort_Order not between", value1, value2, "sortOrder");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return this;
        }
    }
}