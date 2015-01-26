/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: 公司</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusReleaseTrendsWithBLOBsExample  extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public BusReleaseTrendsWithBLOBsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected BusReleaseTrendsWithBLOBsExample(BusReleaseTrendsWithBLOBsExample example) {
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

        public Criteria andBillIdIsNull() {
            addCriterion("BILL_ID is null");
            return this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("BILL_ID is not null");
            return this;
        }

        public Criteria andBillIdEqualTo(String value) {
            addCriterion("BILL_ID =", value, "billId");
            return this;
        }

        public Criteria andBillIdNotEqualTo(String value) {
            addCriterion("BILL_ID <>", value, "billId");
            return this;
        }

        public Criteria andBillIdGreaterThan(String value) {
            addCriterion("BILL_ID >", value, "billId");
            return this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_ID >=", value, "billId");
            return this;
        }

        public Criteria andBillIdLessThan(String value) {
            addCriterion("BILL_ID <", value, "billId");
            return this;
        }

        public Criteria andBillIdLessThanOrEqualTo(String value) {
            addCriterion("BILL_ID <=", value, "billId");
            return this;
        }

        public Criteria andBillIdLike(String value) {
            addCriterion("BILL_ID like", value, "billId");
            return this;
        }

        public Criteria andBillIdNotLike(String value) {
            addCriterion("BILL_ID not like", value, "billId");
            return this;
        }

        public Criteria andBillIdIn(List<String> values) {
            addCriterion("BILL_ID in", values, "billId");
            return this;
        }

        public Criteria andBillIdNotIn(List<String> values) {
            addCriterion("BILL_ID not in", values, "billId");
            return this;
        }

        public Criteria andBillIdBetween(String value1, String value2) {
            addCriterion("BILL_ID between", value1, value2, "billId");
            return this;
        }

        public Criteria andBillIdNotBetween(String value1, String value2) {
            addCriterion("BILL_ID not between", value1, value2, "billId");
            return this;
        }

        public Criteria andBillSnIsNull() {
            addCriterion("BILL_SN is null");
            return this;
        }

        public Criteria andBillSnIsNotNull() {
            addCriterion("BILL_SN is not null");
            return this;
        }

        public Criteria andBillSnEqualTo(String value) {
            addCriterion("BILL_SN =", value, "billSn");
            return this;
        }

        public Criteria andBillSnNotEqualTo(String value) {
            addCriterion("BILL_SN <>", value, "billSn");
            return this;
        }

        public Criteria andBillSnGreaterThan(String value) {
            addCriterion("BILL_SN >", value, "billSn");
            return this;
        }

        public Criteria andBillSnGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_SN >=", value, "billSn");
            return this;
        }

        public Criteria andBillSnLessThan(String value) {
            addCriterion("BILL_SN <", value, "billSn");
            return this;
        }

        public Criteria andBillSnLessThanOrEqualTo(String value) {
            addCriterion("BILL_SN <=", value, "billSn");
            return this;
        }

        public Criteria andBillSnLike(String value) {
            addCriterion("BILL_SN like", value, "billSn");
            return this;
        }

        public Criteria andBillSnNotLike(String value) {
            addCriterion("BILL_SN not like", value, "billSn");
            return this;
        }

        public Criteria andBillSnIn(List<String> values) {
            addCriterion("BILL_SN in", values, "billSn");
            return this;
        }

        public Criteria andBillSnNotIn(List<String> values) {
            addCriterion("BILL_SN not in", values, "billSn");
            return this;
        }

        public Criteria andBillSnBetween(String value1, String value2) {
            addCriterion("BILL_SN between", value1, value2, "billSn");
            return this;
        }

        public Criteria andBillSnNotBetween(String value1, String value2) {
            addCriterion("BILL_SN not between", value1, value2, "billSn");
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

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("COMMUNITY is null");
            return this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("COMMUNITY is not null");
            return this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("COMMUNITY =", value, "community");
            return this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("COMMUNITY <>", value, "community");
            return this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("COMMUNITY >", value, "community");
            return this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITY >=", value, "community");
            return this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("COMMUNITY <", value, "community");
            return this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITY <=", value, "community");
            return this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("COMMUNITY like", value, "community");
            return this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("COMMUNITY not like", value, "community");
            return this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("COMMUNITY in", values, "community");
            return this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("COMMUNITY not in", values, "community");
            return this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("COMMUNITY between", value1, value2, "community");
            return this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("COMMUNITY not between", value1, value2, "community");
            return this;
        }

        public Criteria andRoadIsNull() {
            addCriterion("ROAD is null");
            return this;
        }

        public Criteria andRoadIsNotNull() {
            addCriterion("ROAD is not null");
            return this;
        }

        public Criteria andRoadEqualTo(String value) {
            addCriterion("ROAD =", value, "road");
            return this;
        }

        public Criteria andRoadNotEqualTo(String value) {
            addCriterion("ROAD <>", value, "road");
            return this;
        }

        public Criteria andRoadGreaterThan(String value) {
            addCriterion("ROAD >", value, "road");
            return this;
        }

        public Criteria andRoadGreaterThanOrEqualTo(String value) {
            addCriterion("ROAD >=", value, "road");
            return this;
        }

        public Criteria andRoadLessThan(String value) {
            addCriterion("ROAD <", value, "road");
            return this;
        }

        public Criteria andRoadLessThanOrEqualTo(String value) {
            addCriterion("ROAD <=", value, "road");
            return this;
        }

        public Criteria andRoadLike(String value) {
            addCriterion("ROAD like", value, "road");
            return this;
        }

        public Criteria andRoadNotLike(String value) {
            addCriterion("ROAD not like", value, "road");
            return this;
        }

        public Criteria andRoadIn(List<String> values) {
            addCriterion("ROAD in", values, "road");
            return this;
        }

        public Criteria andRoadNotIn(List<String> values) {
            addCriterion("ROAD not in", values, "road");
            return this;
        }

        public Criteria andRoadBetween(String value1, String value2) {
            addCriterion("ROAD between", value1, value2, "road");
            return this;
        }

        public Criteria andRoadNotBetween(String value1, String value2) {
            addCriterion("ROAD not between", value1, value2, "road");
            return this;
        }

        public Criteria andNumberPlateIsNull() {
            addCriterion("NUMBER_PLATE is null");
            return this;
        }

        public Criteria andNumberPlateIsNotNull() {
            addCriterion("NUMBER_PLATE is not null");
            return this;
        }

        public Criteria andNumberPlateEqualTo(String value) {
            addCriterion("NUMBER_PLATE =", value, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateNotEqualTo(String value) {
            addCriterion("NUMBER_PLATE <>", value, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateGreaterThan(String value) {
            addCriterion("NUMBER_PLATE >", value, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateGreaterThanOrEqualTo(String value) {
            addCriterion("NUMBER_PLATE >=", value, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateLessThan(String value) {
            addCriterion("NUMBER_PLATE <", value, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateLessThanOrEqualTo(String value) {
            addCriterion("NUMBER_PLATE <=", value, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateLike(String value) {
            addCriterion("NUMBER_PLATE like", value, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateNotLike(String value) {
            addCriterion("NUMBER_PLATE not like", value, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateIn(List<String> values) {
            addCriterion("NUMBER_PLATE in", values, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateNotIn(List<String> values) {
            addCriterion("NUMBER_PLATE not in", values, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateBetween(String value1, String value2) {
            addCriterion("NUMBER_PLATE between", value1, value2, "numberPlate");
            return this;
        }

        public Criteria andNumberPlateNotBetween(String value1, String value2) {
            addCriterion("NUMBER_PLATE not between", value1, value2, "numberPlate");
            return this;
        }

        public Criteria andRepairTimeIsNull() {
            addCriterion("REPAIR_TIME is null");
            return this;
        }

        public Criteria andRepairTimeIsNotNull() {
            addCriterion("REPAIR_TIME is not null");
            return this;
        }

        public Criteria andRepairTimeEqualTo(Date value) {
            addCriterion("REPAIR_TIME =", value, "repairTime");
            return this;
        }

        public Criteria andRepairTimeNotEqualTo(Date value) {
            addCriterion("REPAIR_TIME <>", value, "repairTime");
            return this;
        }

        public Criteria andRepairTimeGreaterThan(Date value) {
            addCriterion("REPAIR_TIME >", value, "repairTime");
            return this;
        }

        public Criteria andRepairTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REPAIR_TIME >=", value, "repairTime");
            return this;
        }

        public Criteria andRepairTimeLessThan(Date value) {
            addCriterion("REPAIR_TIME <", value, "repairTime");
            return this;
        }

        public Criteria andRepairTimeLessThanOrEqualTo(Date value) {
            addCriterion("REPAIR_TIME <=", value, "repairTime");
            return this;
        }

        public Criteria andRepairTimeIn(List<Date> values) {
            addCriterion("REPAIR_TIME in", values, "repairTime");
            return this;
        }

        public Criteria andRepairTimeNotIn(List<Date> values) {
            addCriterion("REPAIR_TIME not in", values, "repairTime");
            return this;
        }

        public Criteria andRepairTimeBetween(Date value1, Date value2) {
            addCriterion("REPAIR_TIME between", value1, value2, "repairTime");
            return this;
        }

        public Criteria andRepairTimeNotBetween(Date value1, Date value2) {
            addCriterion("REPAIR_TIME not between", value1, value2, "repairTime");
            return this;
        }

        public Criteria andScenePersonNameIsNull() {
            addCriterion("SCENE_PERSON_NAME is null");
            return this;
        }

        public Criteria andScenePersonNameIsNotNull() {
            addCriterion("SCENE_PERSON_NAME is not null");
            return this;
        }

        public Criteria andScenePersonNameEqualTo(String value) {
            addCriterion("SCENE_PERSON_NAME =", value, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameNotEqualTo(String value) {
            addCriterion("SCENE_PERSON_NAME <>", value, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameGreaterThan(String value) {
            addCriterion("SCENE_PERSON_NAME >", value, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCENE_PERSON_NAME >=", value, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameLessThan(String value) {
            addCriterion("SCENE_PERSON_NAME <", value, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameLessThanOrEqualTo(String value) {
            addCriterion("SCENE_PERSON_NAME <=", value, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameLike(String value) {
            addCriterion("SCENE_PERSON_NAME like", value, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameNotLike(String value) {
            addCriterion("SCENE_PERSON_NAME not like", value, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameIn(List<String> values) {
            addCriterion("SCENE_PERSON_NAME in", values, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameNotIn(List<String> values) {
            addCriterion("SCENE_PERSON_NAME not in", values, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameBetween(String value1, String value2) {
            addCriterion("SCENE_PERSON_NAME between", value1, value2, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonNameNotBetween(String value1, String value2) {
            addCriterion("SCENE_PERSON_NAME not between", value1, value2, "scenePersonName");
            return this;
        }

        public Criteria andScenePersonPhoneIsNull() {
            addCriterion("SCENE_PERSON_PHONE is null");
            return this;
        }

        public Criteria andScenePersonPhoneIsNotNull() {
            addCriterion("SCENE_PERSON_PHONE is not null");
            return this;
        }

        public Criteria andScenePersonPhoneEqualTo(String value) {
            addCriterion("SCENE_PERSON_PHONE =", value, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneNotEqualTo(String value) {
            addCriterion("SCENE_PERSON_PHONE <>", value, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneGreaterThan(String value) {
            addCriterion("SCENE_PERSON_PHONE >", value, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SCENE_PERSON_PHONE >=", value, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneLessThan(String value) {
            addCriterion("SCENE_PERSON_PHONE <", value, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("SCENE_PERSON_PHONE <=", value, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneLike(String value) {
            addCriterion("SCENE_PERSON_PHONE like", value, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneNotLike(String value) {
            addCriterion("SCENE_PERSON_PHONE not like", value, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneIn(List<String> values) {
            addCriterion("SCENE_PERSON_PHONE in", values, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneNotIn(List<String> values) {
            addCriterion("SCENE_PERSON_PHONE not in", values, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneBetween(String value1, String value2) {
            addCriterion("SCENE_PERSON_PHONE between", value1, value2, "scenePersonPhone");
            return this;
        }

        public Criteria andScenePersonPhoneNotBetween(String value1, String value2) {
            addCriterion("SCENE_PERSON_PHONE not between", value1, value2, "scenePersonPhone");
            return this;
        }

        public Criteria andTestPlanRemarkIsNull() {
            addCriterion("TEST_PLAN_REMARK is null");
            return this;
        }

        public Criteria andTestPlanRemarkIsNotNull() {
            addCriterion("TEST_PLAN_REMARK is not null");
            return this;
        }

        public Criteria andTestPlanRemarkEqualTo(String value) {
            addCriterion("TEST_PLAN_REMARK =", value, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkNotEqualTo(String value) {
            addCriterion("TEST_PLAN_REMARK <>", value, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkGreaterThan(String value) {
            addCriterion("TEST_PLAN_REMARK >", value, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_PLAN_REMARK >=", value, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkLessThan(String value) {
            addCriterion("TEST_PLAN_REMARK <", value, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkLessThanOrEqualTo(String value) {
            addCriterion("TEST_PLAN_REMARK <=", value, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkLike(String value) {
            addCriterion("TEST_PLAN_REMARK like", value, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkNotLike(String value) {
            addCriterion("TEST_PLAN_REMARK not like", value, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkIn(List<String> values) {
            addCriterion("TEST_PLAN_REMARK in", values, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkNotIn(List<String> values) {
            addCriterion("TEST_PLAN_REMARK not in", values, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkBetween(String value1, String value2) {
            addCriterion("TEST_PLAN_REMARK between", value1, value2, "testPlanRemark");
            return this;
        }

        public Criteria andTestPlanRemarkNotBetween(String value1, String value2) {
            addCriterion("TEST_PLAN_REMARK not between", value1, value2, "testPlanRemark");
            return this;
        }

        public Criteria andRepairTypeIsNull() {
            addCriterion("REPAIR_TYPE is null");
            return this;
        }

        public Criteria andRepairTypeIsNotNull() {
            addCriterion("REPAIR_TYPE is not null");
            return this;
        }

        public Criteria andRepairTypeEqualTo(String value) {
            addCriterion("REPAIR_TYPE =", value, "repairType");
            return this;
        }

        public Criteria andRepairTypeNotEqualTo(String value) {
            addCriterion("REPAIR_TYPE <>", value, "repairType");
            return this;
        }

        public Criteria andRepairTypeGreaterThan(String value) {
            addCriterion("REPAIR_TYPE >", value, "repairType");
            return this;
        }

        public Criteria andRepairTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_TYPE >=", value, "repairType");
            return this;
        }

        public Criteria andRepairTypeLessThan(String value) {
            addCriterion("REPAIR_TYPE <", value, "repairType");
            return this;
        }

        public Criteria andRepairTypeLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_TYPE <=", value, "repairType");
            return this;
        }

        public Criteria andRepairTypeLike(String value) {
            addCriterion("REPAIR_TYPE like", value, "repairType");
            return this;
        }

        public Criteria andRepairTypeNotLike(String value) {
            addCriterion("REPAIR_TYPE not like", value, "repairType");
            return this;
        }

        public Criteria andRepairTypeIn(List<String> values) {
            addCriterion("REPAIR_TYPE in", values, "repairType");
            return this;
        }

        public Criteria andRepairTypeNotIn(List<String> values) {
            addCriterion("REPAIR_TYPE not in", values, "repairType");
            return this;
        }

        public Criteria andRepairTypeBetween(String value1, String value2) {
            addCriterion("REPAIR_TYPE between", value1, value2, "repairType");
            return this;
        }

        public Criteria andRepairTypeNotBetween(String value1, String value2) {
            addCriterion("REPAIR_TYPE not between", value1, value2, "repairType");
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

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("LATITUDE =", value, "latitude");
            return this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("LATITUDE >", value, "latitude");
            return this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("LATITUDE <", value, "latitude");
            return this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
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

        public Criteria andIsNeedGovernmentIsNull() {
            addCriterion("IS_NEED_GOVERNMENT is null");
            return this;
        }

        public Criteria andIsNeedGovernmentIsNotNull() {
            addCriterion("IS_NEED_GOVERNMENT is not null");
            return this;
        }

        public Criteria andIsNeedGovernmentEqualTo(String value) {
            addCriterion("IS_NEED_GOVERNMENT =", value, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentNotEqualTo(String value) {
            addCriterion("IS_NEED_GOVERNMENT <>", value, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentGreaterThan(String value) {
            addCriterion("IS_NEED_GOVERNMENT >", value, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NEED_GOVERNMENT >=", value, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentLessThan(String value) {
            addCriterion("IS_NEED_GOVERNMENT <", value, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentLessThanOrEqualTo(String value) {
            addCriterion("IS_NEED_GOVERNMENT <=", value, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentLike(String value) {
            addCriterion("IS_NEED_GOVERNMENT like", value, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentNotLike(String value) {
            addCriterion("IS_NEED_GOVERNMENT not like", value, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentIn(List<String> values) {
            addCriterion("IS_NEED_GOVERNMENT in", values, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentNotIn(List<String> values) {
            addCriterion("IS_NEED_GOVERNMENT not in", values, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentBetween(String value1, String value2) {
            addCriterion("IS_NEED_GOVERNMENT between", value1, value2, "isNeedGovernment");
            return this;
        }

        public Criteria andIsNeedGovernmentNotBetween(String value1, String value2) {
            addCriterion("IS_NEED_GOVERNMENT not between", value1, value2, "isNeedGovernment");
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

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
            return this;
        }

        public Criteria andNativeNetIsNull() {
            addCriterion("NATIVE_NET is null");
            return this;
        }

        public Criteria andNativeNetIsNotNull() {
            addCriterion("NATIVE_NET is not null");
            return this;
        }

        public Criteria andNativeNetEqualTo(String value) {
            addCriterion("NATIVE_NET =", value, "nativeNet");
            return this;
        }

        public Criteria andNativeNetNotEqualTo(String value) {
            addCriterion("NATIVE_NET <>", value, "nativeNet");
            return this;
        }

        public Criteria andNativeNetGreaterThan(String value) {
            addCriterion("NATIVE_NET >", value, "nativeNet");
            return this;
        }

        public Criteria andNativeNetGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVE_NET >=", value, "nativeNet");
            return this;
        }

        public Criteria andNativeNetLessThan(String value) {
            addCriterion("NATIVE_NET <", value, "nativeNet");
            return this;
        }

        public Criteria andNativeNetLessThanOrEqualTo(String value) {
            addCriterion("NATIVE_NET <=", value, "nativeNet");
            return this;
        }

        public Criteria andNativeNetLike(String value) {
            addCriterion("NATIVE_NET like", value, "nativeNet");
            return this;
        }

        public Criteria andNativeNetNotLike(String value) {
            addCriterion("NATIVE_NET not like", value, "nativeNet");
            return this;
        }

        public Criteria andNativeNetIn(List<String> values) {
            addCriterion("NATIVE_NET in", values, "nativeNet");
            return this;
        }

        public Criteria andNativeNetNotIn(List<String> values) {
            addCriterion("NATIVE_NET not in", values, "nativeNet");
            return this;
        }

        public Criteria andNativeNetBetween(String value1, String value2) {
            addCriterion("NATIVE_NET between", value1, value2, "nativeNet");
            return this;
        }

        public Criteria andNativeNetNotBetween(String value1, String value2) {
            addCriterion("NATIVE_NET not between", value1, value2, "nativeNet");
            return this;
        }

		public Criteria andRepairContentIsNull() {
			addCriterion("REPAIR_CONTENT is null");
			return this;
		}

		public Criteria andRepairContentIsNotNull() {
			addCriterion("REPAIR_CONTENT is not null");
			return this;
		}

		public Criteria andRepairContentEqualTo(String value) {
			addCriterion("REPAIR_CONTENT =", value, "repairContent");
			return this;
		}

		public Criteria andRepairContentNotEqualTo(String value) {
			addCriterion("REPAIR_CONTENT <>", value, "repairContent");
			return this;
		}

		public Criteria andRepairContentGreaterThan(String value) {
			addCriterion("REPAIR_CONTENT >", value, "repairContent");
			return this;
		}

		public Criteria andRepairContentGreaterThanOrEqualTo(String value) {
			addCriterion("REPAIR_CONTENT >=", value, "repairContent");
			return this;
		}

		public Criteria andRepairContentLessThan(String value) {
			addCriterion("REPAIR_CONTENT <", value, "repairContent");
			return this;
		}

		public Criteria andRepairContentLessThanOrEqualTo(String value) {
			addCriterion("REPAIR_CONTENT <=", value, "repairContent");
			return this;
		}

		public Criteria andRepairContentLike(String value) {
			addCriterion("REPAIR_CONTENT like", value, "repairContent");
			return this;
		}

		public Criteria andRepairContentNotLike(String value) {
			addCriterion("REPAIR_CONTENT not like", value, "repairContent");
			return this;
		}

		public Criteria andRepairContentIn(List<String> values) {
			addCriterion("REPAIR_CONTENT in", values, "repairContent");
			return this;
		}

		public Criteria andRepairContentNotIn(List<String> values) {
			addCriterion("REPAIR_CONTENT not in", values, "repairContent");
			return this;
		}

		public Criteria andRepairContentBetween(String value1, String value2) {
			addCriterion("REPAIR_CONTENT between", value1, value2, "repairContent");
			return this;
		}

		public Criteria andRepairContentNotBetween(String value1, String value2) {
			addCriterion("REPAIR_CONTENT not between", value1, value2, "repairContent");
			return this;
		}

        public Criteria andRepairEndTimeIsNull() {
            addCriterion("REPAIR_END_TIME is null");
            return this;
        }

        public Criteria andRepairEndTimeIsNotNull() {
            addCriterion("REPAIR_END_TIME is not null");
            return this;
        }

        public Criteria andRepairEndTimeEqualTo(Date value) {
            addCriterion("REPAIR_END_TIME =", value, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeNotEqualTo(Date value) {
            addCriterion("REPAIR_END_TIME <>", value, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeGreaterThan(Date value) {
            addCriterion("REPAIR_END_TIME >", value, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REPAIR_END_TIME >=", value, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeLessThan(Date value) {
            addCriterion("REPAIR_END_TIME <", value, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("REPAIR_END_TIME <=", value, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeIn(List<Date> values) {
            addCriterion("REPAIR_END_TIME in", values, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeNotIn(List<Date> values) {
            addCriterion("REPAIR_END_TIME not in", values, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeBetween(Date value1, Date value2) {
            addCriterion("REPAIR_END_TIME between", value1, value2, "repairEndTime");
            return this;
        }

        public Criteria andRepairEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("REPAIR_END_TIME not between", value1, value2, "repairEndTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeIsNull() {
            addCriterion("REAL_REPAIR_BEGIN_TIME is null");
            return this;
        }

        public Criteria andRealRepairBeginTimeIsNotNull() {
            addCriterion("REAL_REPAIR_BEGIN_TIME is not null");
            return this;
        }

        public Criteria andRealRepairBeginTimeEqualTo(Date value) {
            addCriterion("REAL_REPAIR_BEGIN_TIME =", value, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeNotEqualTo(Date value) {
            addCriterion("REAL_REPAIR_BEGIN_TIME <>", value, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeGreaterThan(Date value) {
            addCriterion("REAL_REPAIR_BEGIN_TIME >", value, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REAL_REPAIR_BEGIN_TIME >=", value, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeLessThan(Date value) {
            addCriterion("REAL_REPAIR_BEGIN_TIME <", value, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("REAL_REPAIR_BEGIN_TIME <=", value, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeIn(List<Date> values) {
            addCriterion("REAL_REPAIR_BEGIN_TIME in", values, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeNotIn(List<Date> values) {
            addCriterion("REAL_REPAIR_BEGIN_TIME not in", values, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeBetween(Date value1, Date value2) {
            addCriterion("REAL_REPAIR_BEGIN_TIME between", value1, value2, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("REAL_REPAIR_BEGIN_TIME not between", value1, value2, "realRepairBeginTime");
            return this;
        }

        public Criteria andRealRepairEndTimeIsNull() {
            addCriterion("REAL_REPAIR_END_TIME is null");
            return this;
        }

        public Criteria andRealRepairEndTimeIsNotNull() {
            addCriterion("REAL_REPAIR_END_TIME is not null");
            return this;
        }

        public Criteria andRealRepairEndTimeEqualTo(Date value) {
            addCriterion("REAL_REPAIR_END_TIME =", value, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeNotEqualTo(Date value) {
            addCriterion("REAL_REPAIR_END_TIME <>", value, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeGreaterThan(Date value) {
            addCriterion("REAL_REPAIR_END_TIME >", value, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REAL_REPAIR_END_TIME >=", value, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeLessThan(Date value) {
            addCriterion("REAL_REPAIR_END_TIME <", value, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("REAL_REPAIR_END_TIME <=", value, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeIn(List<Date> values) {
            addCriterion("REAL_REPAIR_END_TIME in", values, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeNotIn(List<Date> values) {
            addCriterion("REAL_REPAIR_END_TIME not in", values, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeBetween(Date value1, Date value2) {
            addCriterion("REAL_REPAIR_END_TIME between", value1, value2, "realRepairEndTime");
            return this;
        }

        public Criteria andRealRepairEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("REAL_REPAIR_END_TIME not between", value1, value2, "realRepairEndTime");
            return this;
        }

        public Criteria andPositionAddressIsNull() {
            addCriterion("POSITION_ADDRESS is null");
            return this;
        }

        public Criteria andPositionAddressIsNotNull() {
            addCriterion("POSITION_ADDRESS is not null");
            return this;
        }

        public Criteria andPositionAddressEqualTo(String value) {
            addCriterion("POSITION_ADDRESS =", value, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressNotEqualTo(String value) {
            addCriterion("POSITION_ADDRESS <>", value, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressGreaterThan(String value) {
            addCriterion("POSITION_ADDRESS >", value, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_ADDRESS >=", value, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressLessThan(String value) {
            addCriterion("POSITION_ADDRESS <", value, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressLessThanOrEqualTo(String value) {
            addCriterion("POSITION_ADDRESS <=", value, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressLike(String value) {
            addCriterion("POSITION_ADDRESS like", value, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressNotLike(String value) {
            addCriterion("POSITION_ADDRESS not like", value, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressIn(List<String> values) {
            addCriterion("POSITION_ADDRESS in", values, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressNotIn(List<String> values) {
            addCriterion("POSITION_ADDRESS not in", values, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressBetween(String value1, String value2) {
            addCriterion("POSITION_ADDRESS between", value1, value2, "positionAddress");
            return this;
        }

        public Criteria andPositionAddressNotBetween(String value1, String value2) {
            addCriterion("POSITION_ADDRESS not between", value1, value2, "positionAddress");
            return this;
        }

        public Criteria andComeFromIsNull() {
            addCriterion("COME_FROM is null");
            return this;
        }

        public Criteria andComeFromIsNotNull() {
            addCriterion("COME_FROM is not null");
            return this;
        }

        public Criteria andComeFromEqualTo(String value) {
            addCriterion("COME_FROM =", value, "comeFrom");
            return this;
        }

        public Criteria andComeFromNotEqualTo(String value) {
            addCriterion("COME_FROM <>", value, "comeFrom");
            return this;
        }

        public Criteria andComeFromGreaterThan(String value) {
            addCriterion("COME_FROM >", value, "comeFrom");
            return this;
        }

        public Criteria andComeFromGreaterThanOrEqualTo(String value) {
            addCriterion("COME_FROM >=", value, "comeFrom");
            return this;
        }

        public Criteria andComeFromLessThan(String value) {
            addCriterion("COME_FROM <", value, "comeFrom");
            return this;
        }

        public Criteria andComeFromLessThanOrEqualTo(String value) {
            addCriterion("COME_FROM <=", value, "comeFrom");
            return this;
        }

        public Criteria andComeFromLike(String value) {
            addCriterion("COME_FROM like", value, "comeFrom");
            return this;
        }

        public Criteria andComeFromNotLike(String value) {
            addCriterion("COME_FROM not like", value, "comeFrom");
            return this;
        }

        public Criteria andComeFromIn(List<String> values) {
            addCriterion("COME_FROM in", values, "comeFrom");
            return this;
        }

        public Criteria andComeFromNotIn(List<String> values) {
            addCriterion("COME_FROM not in", values, "comeFrom");
            return this;
        }

        public Criteria andComeFromBetween(String value1, String value2) {
            addCriterion("COME_FROM between", value1, value2, "comeFrom");
            return this;
        }

        public Criteria andComeFromNotBetween(String value1, String value2) {
            addCriterion("COME_FROM not between", value1, value2, "comeFrom");
            return this;
        }

        public Criteria andDeptPersonNameIsNull() {
            addCriterion("DEPT_PERSON_NAME is null");
            return this;
        }

        public Criteria andDeptPersonNameIsNotNull() {
            addCriterion("DEPT_PERSON_NAME is not null");
            return this;
        }

        public Criteria andDeptPersonNameEqualTo(String value) {
            addCriterion("DEPT_PERSON_NAME =", value, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameNotEqualTo(String value) {
            addCriterion("DEPT_PERSON_NAME <>", value, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameGreaterThan(String value) {
            addCriterion("DEPT_PERSON_NAME >", value, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_PERSON_NAME >=", value, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameLessThan(String value) {
            addCriterion("DEPT_PERSON_NAME <", value, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_PERSON_NAME <=", value, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameLike(String value) {
            addCriterion("DEPT_PERSON_NAME like", value, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameNotLike(String value) {
            addCriterion("DEPT_PERSON_NAME not like", value, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameIn(List<String> values) {
            addCriterion("DEPT_PERSON_NAME in", values, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameNotIn(List<String> values) {
            addCriterion("DEPT_PERSON_NAME not in", values, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameBetween(String value1, String value2) {
            addCriterion("DEPT_PERSON_NAME between", value1, value2, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_PERSON_NAME not between", value1, value2, "deptPersonName");
            return this;
        }

        public Criteria andDeptPersonPhoneIsNull() {
            addCriterion("DEPT_PERSON_PHONE is null");
            return this;
        }

        public Criteria andDeptPersonPhoneIsNotNull() {
            addCriterion("DEPT_PERSON_PHONE is not null");
            return this;
        }

        public Criteria andDeptPersonPhoneEqualTo(String value) {
            addCriterion("DEPT_PERSON_PHONE =", value, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneNotEqualTo(String value) {
            addCriterion("DEPT_PERSON_PHONE <>", value, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneGreaterThan(String value) {
            addCriterion("DEPT_PERSON_PHONE >", value, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_PERSON_PHONE >=", value, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneLessThan(String value) {
            addCriterion("DEPT_PERSON_PHONE <", value, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("DEPT_PERSON_PHONE <=", value, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneLike(String value) {
            addCriterion("DEPT_PERSON_PHONE like", value, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneNotLike(String value) {
            addCriterion("DEPT_PERSON_PHONE not like", value, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneIn(List<String> values) {
            addCriterion("DEPT_PERSON_PHONE in", values, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneNotIn(List<String> values) {
            addCriterion("DEPT_PERSON_PHONE not in", values, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneBetween(String value1, String value2) {
            addCriterion("DEPT_PERSON_PHONE between", value1, value2, "deptPersonPhone");
            return this;
        }

        public Criteria andDeptPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("DEPT_PERSON_PHONE not between", value1, value2, "deptPersonPhone");
            return this;
        }

		public Criteria andTaskDealObjectIdEqualTo(String dealObjectId) {
			addCriterion("exists (select * from t_supt_task ta where ta.bill_id=t_bus_release_trends.bill_id and ta.deal_object_id='" + dealObjectId + "' and ta.is_finish='N')");
			return this;
		}

		public Criteria andTaskDealObjectIdExists(String dealObjectId) {
			addCriterion("exists (select * from t_supt_task ta where ta.bill_id=t_bus_release_trends.bill_id and ta.deal_object_id='" + dealObjectId + "')");
			return this;
		}
    }
}