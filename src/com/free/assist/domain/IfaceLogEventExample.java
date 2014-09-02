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

public class IfaceLogEventExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceLogEventExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceLogEventExample(IfaceLogEventExample example) {
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

        public Criteria andEventIdIsNull() {
            addCriterion("EVENT_ID is null");
            return this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("EVENT_ID is not null");
            return this;
        }

        public Criteria andEventIdEqualTo(String value) {
            addCriterion("EVENT_ID =", value, "eventId");
            return this;
        }

        public Criteria andEventIdNotEqualTo(String value) {
            addCriterion("EVENT_ID <>", value, "eventId");
            return this;
        }

        public Criteria andEventIdGreaterThan(String value) {
            addCriterion("EVENT_ID >", value, "eventId");
            return this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_ID >=", value, "eventId");
            return this;
        }

        public Criteria andEventIdLessThan(String value) {
            addCriterion("EVENT_ID <", value, "eventId");
            return this;
        }

        public Criteria andEventIdLessThanOrEqualTo(String value) {
            addCriterion("EVENT_ID <=", value, "eventId");
            return this;
        }

        public Criteria andEventIdLike(String value) {
            addCriterion("EVENT_ID like", value, "eventId");
            return this;
        }

        public Criteria andEventIdNotLike(String value) {
            addCriterion("EVENT_ID not like", value, "eventId");
            return this;
        }

        public Criteria andEventIdIn(List<String> values) {
            addCriterion("EVENT_ID in", values, "eventId");
            return this;
        }

        public Criteria andEventIdNotIn(List<String> values) {
            addCriterion("EVENT_ID not in", values, "eventId");
            return this;
        }

        public Criteria andEventIdBetween(String value1, String value2) {
            addCriterion("EVENT_ID between", value1, value2, "eventId");
            return this;
        }

        public Criteria andEventIdNotBetween(String value1, String value2) {
            addCriterion("EVENT_ID not between", value1, value2, "eventId");
            return this;
        }

        public Criteria andRelateIdIsNull() {
            addCriterion("RELATE_ID is null");
            return this;
        }

        public Criteria andRelateIdIsNotNull() {
            addCriterion("RELATE_ID is not null");
            return this;
        }

        public Criteria andRelateIdEqualTo(String value) {
            addCriterion("RELATE_ID =", value, "relateId");
            return this;
        }

        public Criteria andRelateIdNotEqualTo(String value) {
            addCriterion("RELATE_ID <>", value, "relateId");
            return this;
        }

        public Criteria andRelateIdGreaterThan(String value) {
            addCriterion("RELATE_ID >", value, "relateId");
            return this;
        }

        public Criteria andRelateIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELATE_ID >=", value, "relateId");
            return this;
        }

        public Criteria andRelateIdLessThan(String value) {
            addCriterion("RELATE_ID <", value, "relateId");
            return this;
        }

        public Criteria andRelateIdLessThanOrEqualTo(String value) {
            addCriterion("RELATE_ID <=", value, "relateId");
            return this;
        }

        public Criteria andRelateIdLike(String value) {
            addCriterion("RELATE_ID like", value, "relateId");
            return this;
        }

        public Criteria andRelateIdNotLike(String value) {
            addCriterion("RELATE_ID not like", value, "relateId");
            return this;
        }

        public Criteria andRelateIdIn(List<String> values) {
            addCriterion("RELATE_ID in", values, "relateId");
            return this;
        }

        public Criteria andRelateIdNotIn(List<String> values) {
            addCriterion("RELATE_ID not in", values, "relateId");
            return this;
        }

        public Criteria andRelateIdBetween(String value1, String value2) {
            addCriterion("RELATE_ID between", value1, value2, "relateId");
            return this;
        }

        public Criteria andRelateIdNotBetween(String value1, String value2) {
            addCriterion("RELATE_ID not between", value1, value2, "relateId");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return this;
        }

        public Criteria andDocumentIsNull() {
            addCriterion("DOCUMENT is null");
            return this;
        }

        public Criteria andDocumentIsNotNull() {
            addCriterion("DOCUMENT is not null");
            return this;
        }

        public Criteria andDocumentEqualTo(String value) {
            addCriterion("DOCUMENT =", value, "document");
            return this;
        }

        public Criteria andDocumentNotEqualTo(String value) {
            addCriterion("DOCUMENT <>", value, "document");
            return this;
        }

        public Criteria andDocumentGreaterThan(String value) {
            addCriterion("DOCUMENT >", value, "document");
            return this;
        }

        public Criteria andDocumentGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT >=", value, "document");
            return this;
        }

        public Criteria andDocumentLessThan(String value) {
            addCriterion("DOCUMENT <", value, "document");
            return this;
        }

        public Criteria andDocumentLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT <=", value, "document");
            return this;
        }

        public Criteria andDocumentLike(String value) {
            addCriterion("DOCUMENT like", value, "document");
            return this;
        }

        public Criteria andDocumentNotLike(String value) {
            addCriterion("DOCUMENT not like", value, "document");
            return this;
        }

        public Criteria andDocumentIn(List<String> values) {
            addCriterion("DOCUMENT in", values, "document");
            return this;
        }

        public Criteria andDocumentNotIn(List<String> values) {
            addCriterion("DOCUMENT not in", values, "document");
            return this;
        }

        public Criteria andDocumentBetween(String value1, String value2) {
            addCriterion("DOCUMENT between", value1, value2, "document");
            return this;
        }

        public Criteria andDocumentNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT not between", value1, value2, "document");
            return this;
        }

        public Criteria andSuccessfulIsNull() {
            addCriterion("SUCCESSFUL_ is null");
            return this;
        }

        public Criteria andSuccessfulIsNotNull() {
            addCriterion("SUCCESSFUL_ is not null");
            return this;
        }

        public Criteria andSuccessfulEqualTo(String value) {
            addCriterion("SUCCESSFUL_ =", value, "successful");
            return this;
        }

        public Criteria andSuccessfulNotEqualTo(String value) {
            addCriterion("SUCCESSFUL_ <>", value, "successful");
            return this;
        }

        public Criteria andSuccessfulGreaterThan(String value) {
            addCriterion("SUCCESSFUL_ >", value, "successful");
            return this;
        }

        public Criteria andSuccessfulGreaterThanOrEqualTo(String value) {
            addCriterion("SUCCESSFUL_ >=", value, "successful");
            return this;
        }

        public Criteria andSuccessfulLessThan(String value) {
            addCriterion("SUCCESSFUL_ <", value, "successful");
            return this;
        }

        public Criteria andSuccessfulLessThanOrEqualTo(String value) {
            addCriterion("SUCCESSFUL_ <=", value, "successful");
            return this;
        }

        public Criteria andSuccessfulLike(String value) {
            addCriterion("SUCCESSFUL_ like", value, "successful");
            return this;
        }

        public Criteria andSuccessfulNotLike(String value) {
            addCriterion("SUCCESSFUL_ not like", value, "successful");
            return this;
        }

        public Criteria andSuccessfulIn(List<String> values) {
            addCriterion("SUCCESSFUL_ in", values, "successful");
            return this;
        }

        public Criteria andSuccessfulNotIn(List<String> values) {
            addCriterion("SUCCESSFUL_ not in", values, "successful");
            return this;
        }

        public Criteria andSuccessfulBetween(String value1, String value2) {
            addCriterion("SUCCESSFUL_ between", value1, value2, "successful");
            return this;
        }

        public Criteria andSuccessfulNotBetween(String value1, String value2) {
            addCriterion("SUCCESSFUL_ not between", value1, value2, "successful");
            return this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("CREATED is null");
            return this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("CREATED is not null");
            return this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("CREATED =", value, "created");
            return this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("CREATED <>", value, "created");
            return this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("CREATED >", value, "created");
            return this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED >=", value, "created");
            return this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("CREATED <", value, "created");
            return this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("CREATED <=", value, "created");
            return this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("CREATED in", values, "created");
            return this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("CREATED not in", values, "created");
            return this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("CREATED between", value1, value2, "created");
            return this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("CREATED not between", value1, value2, "created");
            return this;
        }

        public Criteria andInApplicationMethod(String applicationId,String methodName) {
            addCriterion("exists(select 1 from t_iface_log_repository " +
            		" 				 where t_iface_log_repository.RELATE_ID=t_iface_log_event.RELATE_ID " +
            		"  and t_iface_log_repository.APPLICATION_ID='" + applicationId + "'" +
            		"  and t_iface_log_repository.METHOD_NAME='" +  methodName +"')");
            return this;
        }

    }
}