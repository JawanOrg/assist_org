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

public class IfaceDaemonAttachmentExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceDaemonAttachmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceDaemonAttachmentExample(IfaceDaemonAttachmentExample example) {
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

        public Criteria andAttachmentIdIsNull() {
            addCriterion("ATTACHMENT_ID is null");
            return this;
        }

        public Criteria andAttachmentIdIsNotNull() {
            addCriterion("ATTACHMENT_ID is not null");
            return this;
        }

        public Criteria andAttachmentIdEqualTo(String value) {
            addCriterion("ATTACHMENT_ID =", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdNotEqualTo(String value) {
            addCriterion("ATTACHMENT_ID <>", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdGreaterThan(String value) {
            addCriterion("ATTACHMENT_ID >", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_ID >=", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdLessThan(String value) {
            addCriterion("ATTACHMENT_ID <", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_ID <=", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdLike(String value) {
            addCriterion("ATTACHMENT_ID like", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdNotLike(String value) {
            addCriterion("ATTACHMENT_ID not like", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdIn(List<String> values) {
            addCriterion("ATTACHMENT_ID in", values, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdNotIn(List<String> values) {
            addCriterion("ATTACHMENT_ID not in", values, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_ID between", value1, value2, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_ID not between", value1, value2, "attachmentId");
            return this;
        }

        public Criteria andHostIdIsNull() {
            addCriterion("HOST_ID is null");
            return this;
        }

        public Criteria andHostIdIsNotNull() {
            addCriterion("HOST_ID is not null");
            return this;
        }

        public Criteria andHostIdEqualTo(String value) {
            addCriterion("HOST_ID =", value, "hostId");
            return this;
        }

        public Criteria andHostIdNotEqualTo(String value) {
            addCriterion("HOST_ID <>", value, "hostId");
            return this;
        }

        public Criteria andHostIdGreaterThan(String value) {
            addCriterion("HOST_ID >", value, "hostId");
            return this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_ID >=", value, "hostId");
            return this;
        }

        public Criteria andHostIdLessThan(String value) {
            addCriterion("HOST_ID <", value, "hostId");
            return this;
        }

        public Criteria andHostIdLessThanOrEqualTo(String value) {
            addCriterion("HOST_ID <=", value, "hostId");
            return this;
        }

        public Criteria andHostIdLike(String value) {
            addCriterion("HOST_ID like", value, "hostId");
            return this;
        }

        public Criteria andHostIdNotLike(String value) {
            addCriterion("HOST_ID not like", value, "hostId");
            return this;
        }

        public Criteria andHostIdIn(List<String> values) {
            addCriterion("HOST_ID in", values, "hostId");
            return this;
        }

        public Criteria andHostIdNotIn(List<String> values) {
            addCriterion("HOST_ID not in", values, "hostId");
            return this;
        }

        public Criteria andHostIdBetween(String value1, String value2) {
            addCriterion("HOST_ID between", value1, value2, "hostId");
            return this;
        }

        public Criteria andHostIdNotBetween(String value1, String value2) {
            addCriterion("HOST_ID not between", value1, value2, "hostId");
            return this;
        }

        public Criteria andHostLocationIsNull() {
            addCriterion("HOST_LOCATION is null");
            return this;
        }

        public Criteria andHostLocationIsNotNull() {
            addCriterion("HOST_LOCATION is not null");
            return this;
        }

        public Criteria andHostLocationEqualTo(String value) {
            addCriterion("HOST_LOCATION =", value, "hostLocation");
            return this;
        }

        public Criteria andHostLocationNotEqualTo(String value) {
            addCriterion("HOST_LOCATION <>", value, "hostLocation");
            return this;
        }

        public Criteria andHostLocationGreaterThan(String value) {
            addCriterion("HOST_LOCATION >", value, "hostLocation");
            return this;
        }

        public Criteria andHostLocationGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_LOCATION >=", value, "hostLocation");
            return this;
        }

        public Criteria andHostLocationLessThan(String value) {
            addCriterion("HOST_LOCATION <", value, "hostLocation");
            return this;
        }

        public Criteria andHostLocationLessThanOrEqualTo(String value) {
            addCriterion("HOST_LOCATION <=", value, "hostLocation");
            return this;
        }

        public Criteria andHostLocationLike(String value) {
            addCriterion("HOST_LOCATION like", value, "hostLocation");
            return this;
        }

        public Criteria andHostLocationNotLike(String value) {
            addCriterion("HOST_LOCATION not like", value, "hostLocation");
            return this;
        }

        public Criteria andHostLocationIn(List<String> values) {
            addCriterion("HOST_LOCATION in", values, "hostLocation");
            return this;
        }

        public Criteria andHostLocationNotIn(List<String> values) {
            addCriterion("HOST_LOCATION not in", values, "hostLocation");
            return this;
        }

        public Criteria andHostLocationBetween(String value1, String value2) {
            addCriterion("HOST_LOCATION between", value1, value2, "hostLocation");
            return this;
        }

        public Criteria andHostLocationNotBetween(String value1, String value2) {
            addCriterion("HOST_LOCATION not between", value1, value2, "hostLocation");
            return this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("SITE_ID is null");
            return this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("SITE_ID is not null");
            return this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("SITE_ID =", value, "siteId");
            return this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("SITE_ID <>", value, "siteId");
            return this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("SITE_ID >", value, "siteId");
            return this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_ID >=", value, "siteId");
            return this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("SITE_ID <", value, "siteId");
            return this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("SITE_ID <=", value, "siteId");
            return this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("SITE_ID like", value, "siteId");
            return this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("SITE_ID not like", value, "siteId");
            return this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("SITE_ID in", values, "siteId");
            return this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("SITE_ID not in", values, "siteId");
            return this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("SITE_ID between", value1, value2, "siteId");
            return this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("SITE_ID not between", value1, value2, "siteId");
            return this;
        }

        public Criteria andSiteLocationIsNull() {
            addCriterion("SITE_LOCATION is null");
            return this;
        }

        public Criteria andSiteLocationIsNotNull() {
            addCriterion("SITE_LOCATION is not null");
            return this;
        }

        public Criteria andSiteLocationEqualTo(String value) {
            addCriterion("SITE_LOCATION =", value, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationNotEqualTo(String value) {
            addCriterion("SITE_LOCATION <>", value, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationGreaterThan(String value) {
            addCriterion("SITE_LOCATION >", value, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_LOCATION >=", value, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationLessThan(String value) {
            addCriterion("SITE_LOCATION <", value, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationLessThanOrEqualTo(String value) {
            addCriterion("SITE_LOCATION <=", value, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationLike(String value) {
            addCriterion("SITE_LOCATION like", value, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationNotLike(String value) {
            addCriterion("SITE_LOCATION not like", value, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationIn(List<String> values) {
            addCriterion("SITE_LOCATION in", values, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationNotIn(List<String> values) {
            addCriterion("SITE_LOCATION not in", values, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationBetween(String value1, String value2) {
            addCriterion("SITE_LOCATION between", value1, value2, "siteLocation");
            return this;
        }

        public Criteria andSiteLocationNotBetween(String value1, String value2) {
            addCriterion("SITE_LOCATION not between", value1, value2, "siteLocation");
            return this;
        }

        public Criteria andRunCountIsNull() {
            addCriterion("RUN_COUNT is null");
            return this;
        }

        public Criteria andRunCountIsNotNull() {
            addCriterion("RUN_COUNT is not null");
            return this;
        }

        public Criteria andRunCountEqualTo(Integer value) {
            addCriterion("RUN_COUNT =", value, "runCount");
            return this;
        }

        public Criteria andRunCountNotEqualTo(Integer value) {
            addCriterion("RUN_COUNT <>", value, "runCount");
            return this;
        }

        public Criteria andRunCountGreaterThan(Integer value) {
            addCriterion("RUN_COUNT >", value, "runCount");
            return this;
        }

        public Criteria andRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RUN_COUNT >=", value, "runCount");
            return this;
        }

        public Criteria andRunCountLessThan(Integer value) {
            addCriterion("RUN_COUNT <", value, "runCount");
            return this;
        }

        public Criteria andRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("RUN_COUNT <=", value, "runCount");
            return this;
        }

        public Criteria andRunCountIn(List<Integer> values) {
            addCriterion("RUN_COUNT in", values, "runCount");
            return this;
        }

        public Criteria andRunCountNotIn(List<Integer> values) {
            addCriterion("RUN_COUNT not in", values, "runCount");
            return this;
        }

        public Criteria andRunCountBetween(Integer value1, Integer value2) {
            addCriterion("RUN_COUNT between", value1, value2, "runCount");
            return this;
        }

        public Criteria andRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("RUN_COUNT not between", value1, value2, "runCount");
            return this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("IS_AVAILABLE is null");
            return this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("IS_AVAILABLE is not null");
            return this;
        }

        public Criteria andAvailableEqualTo(String value) {
            addCriterion("IS_AVAILABLE =", value, "available");
            return this;
        }

        public Criteria andAvailableNotEqualTo(String value) {
            addCriterion("IS_AVAILABLE <>", value, "available");
            return this;
        }

        public Criteria andAvailableGreaterThan(String value) {
            addCriterion("IS_AVAILABLE >", value, "available");
            return this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE >=", value, "available");
            return this;
        }

        public Criteria andAvailableLessThan(String value) {
            addCriterion("IS_AVAILABLE <", value, "available");
            return this;
        }

        public Criteria andAvailableLessThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE <=", value, "available");
            return this;
        }

        public Criteria andAvailableLike(String value) {
            addCriterion("IS_AVAILABLE like", value, "available");
            return this;
        }

        public Criteria andAvailableNotLike(String value) {
            addCriterion("IS_AVAILABLE not like", value, "available");
            return this;
        }

        public Criteria andAvailableIn(List<String> values) {
            addCriterion("IS_AVAILABLE in", values, "available");
            return this;
        }

        public Criteria andAvailableNotIn(List<String> values) {
            addCriterion("IS_AVAILABLE not in", values, "available");
            return this;
        }

        public Criteria andAvailableBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE between", value1, value2, "available");
            return this;
        }

        public Criteria andAvailableNotBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE not between", value1, value2, "available");
            return this;
        }

        public Criteria andCreateOnIsNull() {
            addCriterion("CREATE_ON is null");
            return this;
        }

        public Criteria andCreateOnIsNotNull() {
            addCriterion("CREATE_ON is not null");
            return this;
        }

        public Criteria andCreateOnEqualTo(Date value) {
            addCriterion("CREATE_ON =", value, "createOn");
            return this;
        }

        public Criteria andCreateOnNotEqualTo(Date value) {
            addCriterion("CREATE_ON <>", value, "createOn");
            return this;
        }

        public Criteria andCreateOnGreaterThan(Date value) {
            addCriterion("CREATE_ON >", value, "createOn");
            return this;
        }

        public Criteria andCreateOnGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON >=", value, "createOn");
            return this;
        }

        public Criteria andCreateOnLessThan(Date value) {
            addCriterion("CREATE_ON <", value, "createOn");
            return this;
        }

        public Criteria andCreateOnLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON <=", value, "createOn");
            return this;
        }

        public Criteria andCreateOnIn(List<Date> values) {
            addCriterion("CREATE_ON in", values, "createOn");
            return this;
        }

        public Criteria andCreateOnNotIn(List<Date> values) {
            addCriterion("CREATE_ON not in", values, "createOn");
            return this;
        }

        public Criteria andCreateOnBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON between", value1, value2, "createOn");
            return this;
        }

        public Criteria andCreateOnNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON not between", value1, value2, "createOn");
            return this;
        }

        public Criteria andUpdateOnIsNull() {
            addCriterion("UPDATE_ON is null");
            return this;
        }

        public Criteria andUpdateOnIsNotNull() {
            addCriterion("UPDATE_ON is not null");
            return this;
        }

        public Criteria andUpdateOnEqualTo(Date value) {
            addCriterion("UPDATE_ON =", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnNotEqualTo(Date value) {
            addCriterion("UPDATE_ON <>", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnGreaterThan(Date value) {
            addCriterion("UPDATE_ON >", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON >=", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnLessThan(Date value) {
            addCriterion("UPDATE_ON <", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON <=", value, "updateOn");
            return this;
        }

        public Criteria andUpdateOnIn(List<Date> values) {
            addCriterion("UPDATE_ON in", values, "updateOn");
            return this;
        }

        public Criteria andUpdateOnNotIn(List<Date> values) {
            addCriterion("UPDATE_ON not in", values, "updateOn");
            return this;
        }

        public Criteria andUpdateOnBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON between", value1, value2, "updateOn");
            return this;
        }

        public Criteria andUpdateOnNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON not between", value1, value2, "updateOn");
            return this;
        }
    }
}