/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusLinePipeKnowWithBLOBsExample extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public BusLinePipeKnowWithBLOBsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected BusLinePipeKnowWithBLOBsExample(BusLinePipeKnowWithBLOBsExample example) {
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

        public Criteria andContentIdIsNull() {
            addCriterion("CONTENT_ID is null");
            return this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("CONTENT_ID is not null");
            return this;
        }

        public Criteria andContentIdEqualTo(String value) {
            addCriterion("CONTENT_ID =", value, "contentId");
            return this;
        }

        public Criteria andContentIdNotEqualTo(String value) {
            addCriterion("CONTENT_ID <>", value, "contentId");
            return this;
        }

        public Criteria andContentIdGreaterThan(String value) {
            addCriterion("CONTENT_ID >", value, "contentId");
            return this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_ID >=", value, "contentId");
            return this;
        }

        public Criteria andContentIdLessThan(String value) {
            addCriterion("CONTENT_ID <", value, "contentId");
            return this;
        }

        public Criteria andContentIdLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_ID <=", value, "contentId");
            return this;
        }

        public Criteria andContentIdLike(String value) {
            addCriterion("CONTENT_ID like", value, "contentId");
            return this;
        }

        public Criteria andContentIdNotLike(String value) {
            addCriterion("CONTENT_ID not like", value, "contentId");
            return this;
        }

        public Criteria andContentIdIn(List<String> values) {
            addCriterion("CONTENT_ID in", values, "contentId");
            return this;
        }

        public Criteria andContentIdNotIn(List<String> values) {
            addCriterion("CONTENT_ID not in", values, "contentId");
            return this;
        }

        public Criteria andContentIdBetween(String value1, String value2) {
            addCriterion("CONTENT_ID between", value1, value2, "contentId");
            return this;
        }

        public Criteria andContentIdNotBetween(String value1, String value2) {
            addCriterion("CONTENT_ID not between", value1, value2, "contentId");
            return this;
        }

        public Criteria andTheTitleIsNull() {
            addCriterion("THE_TITLE is null");
            return this;
        }

        public Criteria andTheTitleIsNotNull() {
            addCriterion("THE_TITLE is not null");
            return this;
        }

        public Criteria andTheTitleEqualTo(String value) {
            addCriterion("THE_TITLE =", value, "theTitle");
            return this;
        }

        public Criteria andTheTitleNotEqualTo(String value) {
            addCriterion("THE_TITLE <>", value, "theTitle");
            return this;
        }

        public Criteria andTheTitleGreaterThan(String value) {
            addCriterion("THE_TITLE >", value, "theTitle");
            return this;
        }

        public Criteria andTheTitleGreaterThanOrEqualTo(String value) {
            addCriterion("THE_TITLE >=", value, "theTitle");
            return this;
        }

        public Criteria andTheTitleLessThan(String value) {
            addCriterion("THE_TITLE <", value, "theTitle");
            return this;
        }

        public Criteria andTheTitleLessThanOrEqualTo(String value) {
            addCriterion("THE_TITLE <=", value, "theTitle");
            return this;
        }

        public Criteria andTheTitleLike(String value) {
            addCriterion("THE_TITLE like", value, "theTitle");
            return this;
        }

        public Criteria andTheTitleNotLike(String value) {
            addCriterion("THE_TITLE not like", value, "theTitle");
            return this;
        }

        public Criteria andTheTitleIn(List<String> values) {
            addCriterion("THE_TITLE in", values, "theTitle");
            return this;
        }

        public Criteria andTheTitleNotIn(List<String> values) {
            addCriterion("THE_TITLE not in", values, "theTitle");
            return this;
        }

        public Criteria andTheTitleBetween(String value1, String value2) {
            addCriterion("THE_TITLE between", value1, value2, "theTitle");
            return this;
        }

        public Criteria andTheTitleNotBetween(String value1, String value2) {
            addCriterion("THE_TITLE not between", value1, value2, "theTitle");
            return this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return this;
        }

        public Criteria andCreateDeptIsNull() {
            addCriterion("CREATE_DEPT is null");
            return this;
        }

        public Criteria andCreateDeptIsNotNull() {
            addCriterion("CREATE_DEPT is not null");
            return this;
        }

        public Criteria andCreateDeptEqualTo(String value) {
            addCriterion("CREATE_DEPT =", value, "createDept");
            return this;
        }

        public Criteria andCreateDeptNotEqualTo(String value) {
            addCriterion("CREATE_DEPT <>", value, "createDept");
            return this;
        }

        public Criteria andCreateDeptGreaterThan(String value) {
            addCriterion("CREATE_DEPT >", value, "createDept");
            return this;
        }

        public Criteria andCreateDeptGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DEPT >=", value, "createDept");
            return this;
        }

        public Criteria andCreateDeptLessThan(String value) {
            addCriterion("CREATE_DEPT <", value, "createDept");
            return this;
        }

        public Criteria andCreateDeptLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DEPT <=", value, "createDept");
            return this;
        }

        public Criteria andCreateDeptLike(String value) {
            addCriterion("CREATE_DEPT like", value, "createDept");
            return this;
        }

        public Criteria andCreateDeptNotLike(String value) {
            addCriterion("CREATE_DEPT not like", value, "createDept");
            return this;
        }

        public Criteria andCreateDeptIn(List<String> values) {
            addCriterion("CREATE_DEPT in", values, "createDept");
            return this;
        }

        public Criteria andCreateDeptNotIn(List<String> values) {
            addCriterion("CREATE_DEPT not in", values, "createDept");
            return this;
        }

        public Criteria andCreateDeptBetween(String value1, String value2) {
            addCriterion("CREATE_DEPT between", value1, value2, "createDept");
            return this;
        }

        public Criteria andCreateDeptNotBetween(String value1, String value2) {
            addCriterion("CREATE_DEPT not between", value1, value2, "createDept");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("BILL_STATUS is null");
            return this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("BILL_STATUS is not null");
            return this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("BILL_STATUS =", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("BILL_STATUS <>", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("BILL_STATUS >", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_STATUS >=", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("BILL_STATUS <", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("BILL_STATUS <=", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("BILL_STATUS like", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("BILL_STATUS not like", value, "billStatus");
            return this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("BILL_STATUS in", values, "billStatus");
            return this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("BILL_STATUS not in", values, "billStatus");
            return this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("BILL_STATUS between", value1, value2, "billStatus");
            return this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("BILL_STATUS not between", value1, value2, "billStatus");
            return this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("PUBLISHER is null");
            return this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("PUBLISHER is not null");
            return this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("PUBLISHER =", value, "publisher");
            return this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("PUBLISHER <>", value, "publisher");
            return this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("PUBLISHER >", value, "publisher");
            return this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISHER >=", value, "publisher");
            return this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("PUBLISHER <", value, "publisher");
            return this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("PUBLISHER <=", value, "publisher");
            return this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("PUBLISHER like", value, "publisher");
            return this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("PUBLISHER not like", value, "publisher");
            return this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("PUBLISHER in", values, "publisher");
            return this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("PUBLISHER not in", values, "publisher");
            return this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("PUBLISHER between", value1, value2, "publisher");
            return this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("PUBLISHER not between", value1, value2, "publisher");
            return this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("AUDITOR is null");
            return this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("AUDITOR is not null");
            return this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("AUDITOR =", value, "auditor");
            return this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("AUDITOR <>", value, "auditor");
            return this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("AUDITOR >", value, "auditor");
            return this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITOR >=", value, "auditor");
            return this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("AUDITOR <", value, "auditor");
            return this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("AUDITOR <=", value, "auditor");
            return this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("AUDITOR like", value, "auditor");
            return this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("AUDITOR not like", value, "auditor");
            return this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("AUDITOR in", values, "auditor");
            return this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("AUDITOR not in", values, "auditor");
            return this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("AUDITOR between", value1, value2, "auditor");
            return this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("AUDITOR not between", value1, value2, "auditor");
            return this;
        }

        public Criteria andKnowContentIsNull() {
            addCriterion("KNOW_CONTENT is null");
            return this;
        }

        public Criteria andKnowContentIsNotNull() {
            addCriterion("KNOW_CONTENT is not null");
            return this;
        }

        public Criteria andKnowContentEqualTo(String value) {
            addCriterion("KNOW_CONTENT =", value, "knowContent");
            return this;
        }

        public Criteria andKnowContentNotEqualTo(String value) {
            addCriterion("KNOW_CONTENT <>", value, "knowContent");
            return this;
        }

        public Criteria andKnowContentGreaterThan(String value) {
            addCriterion("KNOW_CONTENT >", value, "knowContent");
            return this;
        }

        public Criteria andKnowContentGreaterThanOrEqualTo(String value) {
            addCriterion("KNOW_CONTENT >=", value, "knowContent");
            return this;
        }

        public Criteria andKnowContentLessThan(String value) {
            addCriterion("KNOW_CONTENT <", value, "knowContent");
            return this;
        }

        public Criteria andKnowContentLessThanOrEqualTo(String value) {
            addCriterion("KNOW_CONTENT <=", value, "knowContent");
            return this;
        }

        public Criteria andKnowContentLike(String value) {
            addCriterion("KNOW_CONTENT like", value, "knowContent");
            return this;
        }

        public Criteria andKnowContentNotLike(String value) {
            addCriterion("KNOW_CONTENT not like", value, "knowContent");
            return this;
        }

        public Criteria andKnowContentIn(List<String> values) {
            addCriterion("KNOW_CONTENT in", values, "knowContent");
            return this;
        }

        public Criteria andKnowContentNotIn(List<String> values) {
            addCriterion("KNOW_CONTENT not in", values, "knowContent");
            return this;
        }

        public Criteria andKnowContentBetween(String value1, String value2) {
            addCriterion("KNOW_CONTENT between", value1, value2, "knowContent");
            return this;
        }

        public Criteria andKnowContentNotBetween(String value1, String value2) {
            addCriterion("KNOW_CONTENT not between", value1, value2, "knowContent");
            return this;
        }
    }
}