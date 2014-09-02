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

public class SysDicItemExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysDicItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysDicItemExample(SysDicItemExample example) {
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

        public Criteria andItemIdIsNull() {
            addCriterion("Item_Id is null");
            return this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("Item_Id is not null");
            return this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("Item_Id =", value, "itemId");
            return this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("Item_Id <>", value, "itemId");
            return this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("Item_Id >", value, "itemId");
            return this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("Item_Id >=", value, "itemId");
            return this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("Item_Id <", value, "itemId");
            return this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("Item_Id <=", value, "itemId");
            return this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("Item_Id like", value, "itemId");
            return this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("Item_Id not like", value, "itemId");
            return this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("Item_Id in", values, "itemId");
            return this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("Item_Id not in", values, "itemId");
            return this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("Item_Id between", value1, value2, "itemId");
            return this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("Item_Id not between", value1, value2, "itemId");
            return this;
        }

        public Criteria andDictionaryIdIsNull() {
            addCriterion("Dictionary_Id is null");
            return this;
        }

        public Criteria andDictionaryIdIsNotNull() {
            addCriterion("Dictionary_Id is not null");
            return this;
        }

        public Criteria andDictionaryIdEqualTo(String value) {
            addCriterion("Dictionary_Id =", value, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdNotEqualTo(String value) {
            addCriterion("Dictionary_Id <>", value, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdGreaterThan(String value) {
            addCriterion("Dictionary_Id >", value, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("Dictionary_Id >=", value, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdLessThan(String value) {
            addCriterion("Dictionary_Id <", value, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdLessThanOrEqualTo(String value) {
            addCriterion("Dictionary_Id <=", value, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdLike(String value) {
            addCriterion("Dictionary_Id like", value, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdNotLike(String value) {
            addCriterion("Dictionary_Id not like", value, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdIn(List<String> values) {
            addCriterion("Dictionary_Id in", values, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdNotIn(List<String> values) {
            addCriterion("Dictionary_Id not in", values, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdBetween(String value1, String value2) {
            addCriterion("Dictionary_Id between", value1, value2, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryIdNotBetween(String value1, String value2) {
            addCriterion("Dictionary_Id not between", value1, value2, "dictionaryId");
            return this;
        }

        public Criteria andDictionaryCodeIsNull() {
            addCriterion("Dictionary_Code is null");
            return this;
        }

        public Criteria andDictionaryCodeIsNotNull() {
            addCriterion("Dictionary_Code is not null");
            return this;
        }

        public Criteria andDictionaryCodeEqualTo(String value) {
            addCriterion("Dictionary_Code =", value, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeNotEqualTo(String value) {
            addCriterion("Dictionary_Code <>", value, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeGreaterThan(String value) {
            addCriterion("Dictionary_Code >", value, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Dictionary_Code >=", value, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeLessThan(String value) {
            addCriterion("Dictionary_Code <", value, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeLessThanOrEqualTo(String value) {
            addCriterion("Dictionary_Code <=", value, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeLike(String value) {
            addCriterion("Dictionary_Code like", value, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeNotLike(String value) {
            addCriterion("Dictionary_Code not like", value, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeIn(List<String> values) {
            addCriterion("Dictionary_Code in", values, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeNotIn(List<String> values) {
            addCriterion("Dictionary_Code not in", values, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeBetween(String value1, String value2) {
            addCriterion("Dictionary_Code between", value1, value2, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryCodeNotBetween(String value1, String value2) {
            addCriterion("Dictionary_Code not between", value1, value2, "dictionaryCode");
            return this;
        }

        public Criteria andDictionaryNameIsNull() {
            addCriterion("Dictionary_Name is null");
            return this;
        }

        public Criteria andDictionaryNameIsNotNull() {
            addCriterion("Dictionary_Name is not null");
            return this;
        }

        public Criteria andDictionaryNameEqualTo(String value) {
            addCriterion("Dictionary_Name =", value, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameNotEqualTo(String value) {
            addCriterion("Dictionary_Name <>", value, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameGreaterThan(String value) {
            addCriterion("Dictionary_Name >", value, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameGreaterThanOrEqualTo(String value) {
            addCriterion("Dictionary_Name >=", value, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameLessThan(String value) {
            addCriterion("Dictionary_Name <", value, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameLessThanOrEqualTo(String value) {
            addCriterion("Dictionary_Name <=", value, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameLike(String value) {
            addCriterion("Dictionary_Name like", value, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameNotLike(String value) {
            addCriterion("Dictionary_Name not like", value, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameIn(List<String> values) {
            addCriterion("Dictionary_Name in", values, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameNotIn(List<String> values) {
            addCriterion("Dictionary_Name not in", values, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameBetween(String value1, String value2) {
            addCriterion("Dictionary_Name between", value1, value2, "dictionaryName");
            return this;
        }

        public Criteria andDictionaryNameNotBetween(String value1, String value2) {
            addCriterion("Dictionary_Name not between", value1, value2, "dictionaryName");
            return this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("Item_Code is null");
            return this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("Item_Code is not null");
            return this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("Item_Code =", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("Item_Code <>", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("Item_Code >", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Item_Code >=", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("Item_Code <", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("Item_Code <=", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("Item_Code like", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("Item_Code not like", value, "itemCode");
            return this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("Item_Code in", values, "itemCode");
            return this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("Item_Code not in", values, "itemCode");
            return this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("Item_Code between", value1, value2, "itemCode");
            return this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("Item_Code not between", value1, value2, "itemCode");
            return this;
        }

        public Criteria andItemValueIsNull() {
            addCriterion("Item_Value is null");
            return this;
        }

        public Criteria andItemValueIsNotNull() {
            addCriterion("Item_Value is not null");
            return this;
        }

        public Criteria andItemValueEqualTo(String value) {
            addCriterion("Item_Value =", value, "itemValue");
            return this;
        }

        public Criteria andItemValueNotEqualTo(String value) {
            addCriterion("Item_Value <>", value, "itemValue");
            return this;
        }

        public Criteria andItemValueGreaterThan(String value) {
            addCriterion("Item_Value >", value, "itemValue");
            return this;
        }

        public Criteria andItemValueGreaterThanOrEqualTo(String value) {
            addCriterion("Item_Value >=", value, "itemValue");
            return this;
        }

        public Criteria andItemValueLessThan(String value) {
            addCriterion("Item_Value <", value, "itemValue");
            return this;
        }

        public Criteria andItemValueLessThanOrEqualTo(String value) {
            addCriterion("Item_Value <=", value, "itemValue");
            return this;
        }

        public Criteria andItemValueLike(String value) {
            addCriterion("Item_Value like", value, "itemValue");
            return this;
        }

        public Criteria andItemValueNotLike(String value) {
            addCriterion("Item_Value not like", value, "itemValue");
            return this;
        }

        public Criteria andItemValueIn(List<String> values) {
            addCriterion("Item_Value in", values, "itemValue");
            return this;
        }

        public Criteria andItemValueNotIn(List<String> values) {
            addCriterion("Item_Value not in", values, "itemValue");
            return this;
        }

        public Criteria andItemValueBetween(String value1, String value2) {
            addCriterion("Item_Value between", value1, value2, "itemValue");
            return this;
        }

        public Criteria andItemValueNotBetween(String value1, String value2) {
            addCriterion("Item_Value not between", value1, value2, "itemValue");
            return this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("Item_Desc is null");
            return this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("Item_Desc is not null");
            return this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("Item_Desc =", value, "itemDesc");
            return this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("Item_Desc <>", value, "itemDesc");
            return this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("Item_Desc >", value, "itemDesc");
            return this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("Item_Desc >=", value, "itemDesc");
            return this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("Item_Desc <", value, "itemDesc");
            return this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("Item_Desc <=", value, "itemDesc");
            return this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("Item_Desc like", value, "itemDesc");
            return this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("Item_Desc not like", value, "itemDesc");
            return this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("Item_Desc in", values, "itemDesc");
            return this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("Item_Desc not in", values, "itemDesc");
            return this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("Item_Desc between", value1, value2, "itemDesc");
            return this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("Item_Desc not between", value1, value2, "itemDesc");
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

        public Criteria andInternalCodeIsNull() {
            addCriterion("Internal_Code is null");
            return this;
        }

        public Criteria andInternalCodeIsNotNull() {
            addCriterion("Internal_Code is not null");
            return this;
        }

        public Criteria andInternalCodeEqualTo(String value) {
            addCriterion("Internal_Code =", value, "internalCode");
            return this;
        }

        public Criteria andInternalCodeNotEqualTo(String value) {
            addCriterion("Internal_Code <>", value, "internalCode");
            return this;
        }

        public Criteria andInternalCodeGreaterThan(String value) {
            addCriterion("Internal_Code >", value, "internalCode");
            return this;
        }

        public Criteria andInternalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Internal_Code >=", value, "internalCode");
            return this;
        }

        public Criteria andInternalCodeLessThan(String value) {
            addCriterion("Internal_Code <", value, "internalCode");
            return this;
        }

        public Criteria andInternalCodeLessThanOrEqualTo(String value) {
            addCriterion("Internal_Code <=", value, "internalCode");
            return this;
        }

        public Criteria andInternalCodeLike(String value) {
            addCriterion("Internal_Code like", value, "internalCode");
            return this;
        }

        public Criteria andInternalCodeNotLike(String value) {
            addCriterion("Internal_Code not like", value, "internalCode");
            return this;
        }

        public Criteria andInternalCodeIn(List<String> values) {
            addCriterion("Internal_Code in", values, "internalCode");
            return this;
        }

        public Criteria andInternalCodeNotIn(List<String> values) {
            addCriterion("Internal_Code not in", values, "internalCode");
            return this;
        }

        public Criteria andInternalCodeBetween(String value1, String value2) {
            addCriterion("Internal_Code between", value1, value2, "internalCode");
            return this;
        }

        public Criteria andInternalCodeNotBetween(String value1, String value2) {
            addCriterion("Internal_Code not between", value1, value2, "internalCode");
            return this;
        }
    }
}