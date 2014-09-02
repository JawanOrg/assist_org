/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysTipsExample extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysTipsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysTipsExample(SysTipsExample example) {
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

        public Criteria andTipIdIsNull() {
            addCriterion("tip_id is null");
            return this;
        }

        public Criteria andTipIdIsNotNull() {
            addCriterion("tip_id is not null");
            return this;
        }

        public Criteria andTipIdEqualTo(String value) {
            addCriterion("tip_id =", value, "tipId");
            return this;
        }

        public Criteria andTipIdNotEqualTo(String value) {
            addCriterion("tip_id <>", value, "tipId");
            return this;
        }

        public Criteria andTipIdGreaterThan(String value) {
            addCriterion("tip_id >", value, "tipId");
            return this;
        }

        public Criteria andTipIdGreaterThanOrEqualTo(String value) {
            addCriterion("tip_id >=", value, "tipId");
            return this;
        }

        public Criteria andTipIdLessThan(String value) {
            addCriterion("tip_id <", value, "tipId");
            return this;
        }

        public Criteria andTipIdLessThanOrEqualTo(String value) {
            addCriterion("tip_id <=", value, "tipId");
            return this;
        }

        public Criteria andTipIdLike(String value) {
            addCriterion("tip_id like", value, "tipId");
            return this;
        }

        public Criteria andTipIdNotLike(String value) {
            addCriterion("tip_id not like", value, "tipId");
            return this;
        }

        public Criteria andTipIdIn(List<String> values) {
            addCriterion("tip_id in", values, "tipId");
            return this;
        }

        public Criteria andTipIdNotIn(List<String> values) {
            addCriterion("tip_id not in", values, "tipId");
            return this;
        }

        public Criteria andTipIdBetween(String value1, String value2) {
            addCriterion("tip_id between", value1, value2, "tipId");
            return this;
        }

        public Criteria andTipIdNotBetween(String value1, String value2) {
            addCriterion("tip_id not between", value1, value2, "tipId");
            return this;
        }

        public Criteria andTipLabelIsNull() {
            addCriterion("tip_label is null");
            return this;
        }

        public Criteria andTipLabelIsNotNull() {
            addCriterion("tip_label is not null");
            return this;
        }

        public Criteria andTipLabelEqualTo(String value) {
            addCriterion("tip_label =", value, "tipLabel");
            return this;
        }

        public Criteria andTipLabelNotEqualTo(String value) {
            addCriterion("tip_label <>", value, "tipLabel");
            return this;
        }

        public Criteria andTipLabelGreaterThan(String value) {
            addCriterion("tip_label >", value, "tipLabel");
            return this;
        }

        public Criteria andTipLabelGreaterThanOrEqualTo(String value) {
            addCriterion("tip_label >=", value, "tipLabel");
            return this;
        }

        public Criteria andTipLabelLessThan(String value) {
            addCriterion("tip_label <", value, "tipLabel");
            return this;
        }

        public Criteria andTipLabelLessThanOrEqualTo(String value) {
            addCriterion("tip_label <=", value, "tipLabel");
            return this;
        }

        public Criteria andTipLabelLike(String value) {
            addCriterion("tip_label like", value, "tipLabel");
            return this;
        }

        public Criteria andTipLabelNotLike(String value) {
            addCriterion("tip_label not like", value, "tipLabel");
            return this;
        }

        public Criteria andTipLabelIn(List<String> values) {
            addCriterion("tip_label in", values, "tipLabel");
            return this;
        }

        public Criteria andTipLabelNotIn(List<String> values) {
            addCriterion("tip_label not in", values, "tipLabel");
            return this;
        }

        public Criteria andTipLabelBetween(String value1, String value2) {
            addCriterion("tip_label between", value1, value2, "tipLabel");
            return this;
        }

        public Criteria andTipLabelNotBetween(String value1, String value2) {
            addCriterion("tip_label not between", value1, value2, "tipLabel");
            return this;
        }

        public Criteria andTipContextIsNull() {
            addCriterion("tip_context is null");
            return this;
        }

        public Criteria andTipContextIsNotNull() {
            addCriterion("tip_context is not null");
            return this;
        }

        public Criteria andTipContextEqualTo(String value) {
            addCriterion("tip_context =", value, "tipContext");
            return this;
        }

        public Criteria andTipContextNotEqualTo(String value) {
            addCriterion("tip_context <>", value, "tipContext");
            return this;
        }

        public Criteria andTipContextGreaterThan(String value) {
            addCriterion("tip_context >", value, "tipContext");
            return this;
        }

        public Criteria andTipContextGreaterThanOrEqualTo(String value) {
            addCriterion("tip_context >=", value, "tipContext");
            return this;
        }

        public Criteria andTipContextLessThan(String value) {
            addCriterion("tip_context <", value, "tipContext");
            return this;
        }

        public Criteria andTipContextLessThanOrEqualTo(String value) {
            addCriterion("tip_context <=", value, "tipContext");
            return this;
        }

        public Criteria andTipContextLike(String value) {
            addCriterion("tip_context like", value, "tipContext");
            return this;
        }

        public Criteria andTipContextNotLike(String value) {
            addCriterion("tip_context not like", value, "tipContext");
            return this;
        }

        public Criteria andTipContextIn(List<String> values) {
            addCriterion("tip_context in", values, "tipContext");
            return this;
        }

        public Criteria andTipContextNotIn(List<String> values) {
            addCriterion("tip_context not in", values, "tipContext");
            return this;
        }

        public Criteria andTipContextBetween(String value1, String value2) {
            addCriterion("tip_context between", value1, value2, "tipContext");
            return this;
        }

        public Criteria andTipContextNotBetween(String value1, String value2) {
            addCriterion("tip_context not between", value1, value2, "tipContext");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return this;
        }

        public Criteria andTipContextAttachIsNull() {
            addCriterion("tip_context_attach is null");
            return this;
        }

        public Criteria andTipContextAttachIsNotNull() {
            addCriterion("tip_context_attach is not null");
            return this;
        }

        public Criteria andTipContextAttachEqualTo(String value) {
            addCriterion("tip_context_attach =", value, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachNotEqualTo(String value) {
            addCriterion("tip_context_attach <>", value, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachGreaterThan(String value) {
            addCriterion("tip_context_attach >", value, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachGreaterThanOrEqualTo(String value) {
            addCriterion("tip_context_attach >=", value, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachLessThan(String value) {
            addCriterion("tip_context_attach <", value, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachLessThanOrEqualTo(String value) {
            addCriterion("tip_context_attach <=", value, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachLike(String value) {
            addCriterion("tip_context_attach like", value, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachNotLike(String value) {
            addCriterion("tip_context_attach not like", value, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachIn(List<String> values) {
            addCriterion("tip_context_attach in", values, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachNotIn(List<String> values) {
            addCriterion("tip_context_attach not in", values, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachBetween(String value1, String value2) {
            addCriterion("tip_context_attach between", value1, value2, "tipContextAttach");
            return this;
        }

        public Criteria andTipContextAttachNotBetween(String value1, String value2) {
            addCriterion("tip_context_attach not between", value1, value2, "tipContextAttach");
            return this;
        }

        public Criteria andTipModuleIdIsNull() {
            addCriterion("tip_module_id is null");
            return this;
        }

        public Criteria andTipModuleIdIsNotNull() {
            addCriterion("tip_module_id is not null");
            return this;
        }

        public Criteria andTipModuleIdEqualTo(String value) {
            addCriterion("tip_module_id =", value, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdNotEqualTo(String value) {
            addCriterion("tip_module_id <>", value, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdGreaterThan(String value) {
            addCriterion("tip_module_id >", value, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("tip_module_id >=", value, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdLessThan(String value) {
            addCriterion("tip_module_id <", value, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdLessThanOrEqualTo(String value) {
            addCriterion("tip_module_id <=", value, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdLike(String value) {
            addCriterion("tip_module_id like", value, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdNotLike(String value) {
            addCriterion("tip_module_id not like", value, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdIn(List<String> values) {
            addCriterion("tip_module_id in", values, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdNotIn(List<String> values) {
            addCriterion("tip_module_id not in", values, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdBetween(String value1, String value2) {
            addCriterion("tip_module_id between", value1, value2, "tipModuleId");
            return this;
        }

        public Criteria andTipModuleIdNotBetween(String value1, String value2) {
            addCriterion("tip_module_id not between", value1, value2, "tipModuleId");
            return this;
        }
    }
}