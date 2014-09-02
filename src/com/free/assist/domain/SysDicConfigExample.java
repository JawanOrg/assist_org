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

public class SysDicConfigExample extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysDicConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysDicConfigExample(SysDicConfigExample example) {
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return this;
        }
    }
}