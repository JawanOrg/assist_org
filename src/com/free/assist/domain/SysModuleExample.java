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

public class SysModuleExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysModuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysModuleExample(SysModuleExample example) {
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

        public Criteria andModuleIdIsNull() {
            addCriterion("Module_Id is null");
            return this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("Module_Id is not null");
            return this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("Module_Id =", value, "moduleId");
            return this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("Module_Id <>", value, "moduleId");
            return this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("Module_Id >", value, "moduleId");
            return this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("Module_Id >=", value, "moduleId");
            return this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("Module_Id <", value, "moduleId");
            return this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("Module_Id <=", value, "moduleId");
            return this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("Module_Id like", value, "moduleId");
            return this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("Module_Id not like", value, "moduleId");
            return this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("Module_Id in", values, "moduleId");
            return this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("Module_Id not in", values, "moduleId");
            return this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("Module_Id between", value1, value2, "moduleId");
            return this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("Module_Id not between", value1, value2, "moduleId");
            return this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("Module_Name is null");
            return this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("Module_Name is not null");
            return this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("Module_Name =", value, "moduleName");
            return this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("Module_Name <>", value, "moduleName");
            return this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("Module_Name >", value, "moduleName");
            return this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("Module_Name >=", value, "moduleName");
            return this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("Module_Name <", value, "moduleName");
            return this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("Module_Name <=", value, "moduleName");
            return this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("Module_Name like", value, "moduleName");
            return this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("Module_Name not like", value, "moduleName");
            return this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("Module_Name in", values, "moduleName");
            return this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("Module_Name not in", values, "moduleName");
            return this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("Module_Name between", value1, value2, "moduleName");
            return this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("Module_Name not between", value1, value2, "moduleName");
            return this;
        }

        public Criteria andModuleDescIsNull() {
            addCriterion("Module_Desc is null");
            return this;
        }

        public Criteria andModuleDescIsNotNull() {
            addCriterion("Module_Desc is not null");
            return this;
        }

        public Criteria andModuleDescEqualTo(String value) {
            addCriterion("Module_Desc =", value, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescNotEqualTo(String value) {
            addCriterion("Module_Desc <>", value, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescGreaterThan(String value) {
            addCriterion("Module_Desc >", value, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescGreaterThanOrEqualTo(String value) {
            addCriterion("Module_Desc >=", value, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescLessThan(String value) {
            addCriterion("Module_Desc <", value, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescLessThanOrEqualTo(String value) {
            addCriterion("Module_Desc <=", value, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescLike(String value) {
            addCriterion("Module_Desc like", value, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescNotLike(String value) {
            addCriterion("Module_Desc not like", value, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescIn(List<String> values) {
            addCriterion("Module_Desc in", values, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescNotIn(List<String> values) {
            addCriterion("Module_Desc not in", values, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescBetween(String value1, String value2) {
            addCriterion("Module_Desc between", value1, value2, "moduleDesc");
            return this;
        }

        public Criteria andModuleDescNotBetween(String value1, String value2) {
            addCriterion("Module_Desc not between", value1, value2, "moduleDesc");
            return this;
        }

        public Criteria andParentModuleidIsNull() {
            addCriterion("Parent_ModuleId is null");
            return this;
        }

        public Criteria andParentModuleidIsNotNull() {
            addCriterion("Parent_ModuleId is not null");
            return this;
        }

        public Criteria andParentModuleidEqualTo(String value) {
            addCriterion("Parent_ModuleId =", value, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidNotEqualTo(String value) {
            addCriterion("Parent_ModuleId <>", value, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidGreaterThan(String value) {
            addCriterion("Parent_ModuleId >", value, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidGreaterThanOrEqualTo(String value) {
            addCriterion("Parent_ModuleId >=", value, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidLessThan(String value) {
            addCriterion("Parent_ModuleId <", value, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidLessThanOrEqualTo(String value) {
            addCriterion("Parent_ModuleId <=", value, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidLike(String value) {
            addCriterion("Parent_ModuleId like", value, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidNotLike(String value) {
            addCriterion("Parent_ModuleId not like", value, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidIn(List<String> values) {
            addCriterion("Parent_ModuleId in", values, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidNotIn(List<String> values) {
            addCriterion("Parent_ModuleId not in", values, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidBetween(String value1, String value2) {
            addCriterion("Parent_ModuleId between", value1, value2, "parentModuleid");
            return this;
        }

        public Criteria andParentModuleidNotBetween(String value1, String value2) {
            addCriterion("Parent_ModuleId not between", value1, value2, "parentModuleid");
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

        public Criteria andIsLeafIsNull() {
            addCriterion("Is_Leaf is null");
            return this;
        }

        public Criteria andIsLeafIsNotNull() {
            addCriterion("Is_Leaf is not null");
            return this;
        }

        public Criteria andIsLeafEqualTo(String value) {
            addCriterion("Is_Leaf =", value, "isLeaf");
            return this;
        }

        public Criteria andIsLeafNotEqualTo(String value) {
            addCriterion("Is_Leaf <>", value, "isLeaf");
            return this;
        }

        public Criteria andIsLeafGreaterThan(String value) {
            addCriterion("Is_Leaf >", value, "isLeaf");
            return this;
        }

        public Criteria andIsLeafGreaterThanOrEqualTo(String value) {
            addCriterion("Is_Leaf >=", value, "isLeaf");
            return this;
        }

        public Criteria andIsLeafLessThan(String value) {
            addCriterion("Is_Leaf <", value, "isLeaf");
            return this;
        }

        public Criteria andIsLeafLessThanOrEqualTo(String value) {
            addCriterion("Is_Leaf <=", value, "isLeaf");
            return this;
        }

        public Criteria andIsLeafLike(String value) {
            addCriterion("Is_Leaf like", value, "isLeaf");
            return this;
        }

        public Criteria andIsLeafNotLike(String value) {
            addCriterion("Is_Leaf not like", value, "isLeaf");
            return this;
        }

        public Criteria andIsLeafIn(List<String> values) {
            addCriterion("Is_Leaf in", values, "isLeaf");
            return this;
        }

        public Criteria andIsLeafNotIn(List<String> values) {
            addCriterion("Is_Leaf not in", values, "isLeaf");
            return this;
        }

        public Criteria andIsLeafBetween(String value1, String value2) {
            addCriterion("Is_Leaf between", value1, value2, "isLeaf");
            return this;
        }

        public Criteria andIsLeafNotBetween(String value1, String value2) {
            addCriterion("Is_Leaf not between", value1, value2, "isLeaf");
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

        public Criteria andModuleUrlIsNull() {
            addCriterion("Module_Url is null");
            return this;
        }

        public Criteria andModuleUrlIsNotNull() {
            addCriterion("Module_Url is not null");
            return this;
        }

        public Criteria andModuleUrlEqualTo(String value) {
            addCriterion("Module_Url =", value, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlNotEqualTo(String value) {
            addCriterion("Module_Url <>", value, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlGreaterThan(String value) {
            addCriterion("Module_Url >", value, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Module_Url >=", value, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlLessThan(String value) {
            addCriterion("Module_Url <", value, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlLessThanOrEqualTo(String value) {
            addCriterion("Module_Url <=", value, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlLike(String value) {
            addCriterion("Module_Url like", value, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlNotLike(String value) {
            addCriterion("Module_Url not like", value, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlIn(List<String> values) {
            addCriterion("Module_Url in", values, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlNotIn(List<String> values) {
            addCriterion("Module_Url not in", values, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlBetween(String value1, String value2) {
            addCriterion("Module_Url between", value1, value2, "moduleUrl");
            return this;
        }

        public Criteria andModuleUrlNotBetween(String value1, String value2) {
            addCriterion("Module_Url not between", value1, value2, "moduleUrl");
            return this;
        }
    }
}