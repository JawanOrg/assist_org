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

public class IfaceLogStrategyExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceLogStrategyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceLogStrategyExample(IfaceLogStrategyExample example) {
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

        public Criteria andStrategyIdIsNull() {
            addCriterion("STRATEGY_ID is null");
            return this;
        }

        public Criteria andStrategyIdIsNotNull() {
            addCriterion("STRATEGY_ID is not null");
            return this;
        }

        public Criteria andStrategyIdEqualTo(String value) {
            addCriterion("STRATEGY_ID =", value, "strategyId");
            return this;
        }

        public Criteria andStrategyIdNotEqualTo(String value) {
            addCriterion("STRATEGY_ID <>", value, "strategyId");
            return this;
        }

        public Criteria andStrategyIdGreaterThan(String value) {
            addCriterion("STRATEGY_ID >", value, "strategyId");
            return this;
        }

        public Criteria andStrategyIdGreaterThanOrEqualTo(String value) {
            addCriterion("STRATEGY_ID >=", value, "strategyId");
            return this;
        }

        public Criteria andStrategyIdLessThan(String value) {
            addCriterion("STRATEGY_ID <", value, "strategyId");
            return this;
        }

        public Criteria andStrategyIdLessThanOrEqualTo(String value) {
            addCriterion("STRATEGY_ID <=", value, "strategyId");
            return this;
        }

        public Criteria andStrategyIdLike(String value) {
            addCriterion("STRATEGY_ID like", value, "strategyId");
            return this;
        }

        public Criteria andStrategyIdNotLike(String value) {
            addCriterion("STRATEGY_ID not like", value, "strategyId");
            return this;
        }

        public Criteria andStrategyIdIn(List<String> values) {
            addCriterion("STRATEGY_ID in", values, "strategyId");
            return this;
        }

        public Criteria andStrategyIdNotIn(List<String> values) {
            addCriterion("STRATEGY_ID not in", values, "strategyId");
            return this;
        }

        public Criteria andStrategyIdBetween(String value1, String value2) {
            addCriterion("STRATEGY_ID between", value1, value2, "strategyId");
            return this;
        }

        public Criteria andStrategyIdNotBetween(String value1, String value2) {
            addCriterion("STRATEGY_ID not between", value1, value2, "strategyId");
            return this;
        }

        public Criteria andTimeEnableIsNull() {
            addCriterion("TIME_ENABLE is null");
            return this;
        }

        public Criteria andTimeEnableIsNotNull() {
            addCriterion("TIME_ENABLE is not null");
            return this;
        }

        public Criteria andTimeEnableEqualTo(String value) {
            addCriterion("TIME_ENABLE =", value, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableNotEqualTo(String value) {
            addCriterion("TIME_ENABLE <>", value, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableGreaterThan(String value) {
            addCriterion("TIME_ENABLE >", value, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_ENABLE >=", value, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableLessThan(String value) {
            addCriterion("TIME_ENABLE <", value, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableLessThanOrEqualTo(String value) {
            addCriterion("TIME_ENABLE <=", value, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableLike(String value) {
            addCriterion("TIME_ENABLE like", value, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableNotLike(String value) {
            addCriterion("TIME_ENABLE not like", value, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableIn(List<String> values) {
            addCriterion("TIME_ENABLE in", values, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableNotIn(List<String> values) {
            addCriterion("TIME_ENABLE not in", values, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableBetween(String value1, String value2) {
            addCriterion("TIME_ENABLE between", value1, value2, "timeEnable");
            return this;
        }

        public Criteria andTimeEnableNotBetween(String value1, String value2) {
            addCriterion("TIME_ENABLE not between", value1, value2, "timeEnable");
            return this;
        }

        public Criteria andTimeUpperIsNull() {
            addCriterion("TIME_UPPER is null");
            return this;
        }

        public Criteria andTimeUpperIsNotNull() {
            addCriterion("TIME_UPPER is not null");
            return this;
        }

        public Criteria andTimeUpperEqualTo(Date value) {
            addCriterion("TIME_UPPER =", value, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperNotEqualTo(Date value) {
            addCriterion("TIME_UPPER <>", value, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperGreaterThan(Date value) {
            addCriterion("TIME_UPPER >", value, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_UPPER >=", value, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperLessThan(Date value) {
            addCriterion("TIME_UPPER <", value, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperLessThanOrEqualTo(Date value) {
            addCriterion("TIME_UPPER <=", value, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperIn(List<Date> values) {
            addCriterion("TIME_UPPER in", values, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperNotIn(List<Date> values) {
            addCriterion("TIME_UPPER not in", values, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperBetween(Date value1, Date value2) {
            addCriterion("TIME_UPPER between", value1, value2, "timeUpper");
            return this;
        }

        public Criteria andTimeUpperNotBetween(Date value1, Date value2) {
            addCriterion("TIME_UPPER not between", value1, value2, "timeUpper");
            return this;
        }

        public Criteria andTimeLowerIsNull() {
            addCriterion("TIME_LOWER is null");
            return this;
        }

        public Criteria andTimeLowerIsNotNull() {
            addCriterion("TIME_LOWER is not null");
            return this;
        }

        public Criteria andTimeLowerEqualTo(Date value) {
            addCriterion("TIME_LOWER =", value, "timeLower");
            return this;
        }

        public Criteria andTimeLowerNotEqualTo(Date value) {
            addCriterion("TIME_LOWER <>", value, "timeLower");
            return this;
        }

        public Criteria andTimeLowerGreaterThan(Date value) {
            addCriterion("TIME_LOWER >", value, "timeLower");
            return this;
        }

        public Criteria andTimeLowerGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_LOWER >=", value, "timeLower");
            return this;
        }

        public Criteria andTimeLowerLessThan(Date value) {
            addCriterion("TIME_LOWER <", value, "timeLower");
            return this;
        }

        public Criteria andTimeLowerLessThanOrEqualTo(Date value) {
            addCriterion("TIME_LOWER <=", value, "timeLower");
            return this;
        }

        public Criteria andTimeLowerIn(List<Date> values) {
            addCriterion("TIME_LOWER in", values, "timeLower");
            return this;
        }

        public Criteria andTimeLowerNotIn(List<Date> values) {
            addCriterion("TIME_LOWER not in", values, "timeLower");
            return this;
        }

        public Criteria andTimeLowerBetween(Date value1, Date value2) {
            addCriterion("TIME_LOWER between", value1, value2, "timeLower");
            return this;
        }

        public Criteria andTimeLowerNotBetween(Date value1, Date value2) {
            addCriterion("TIME_LOWER not between", value1, value2, "timeLower");
            return this;
        }

        public Criteria andWeekEnableIsNull() {
            addCriterion("WEEK_ENABLE is null");
            return this;
        }

        public Criteria andWeekEnableIsNotNull() {
            addCriterion("WEEK_ENABLE is not null");
            return this;
        }

        public Criteria andWeekEnableEqualTo(String value) {
            addCriterion("WEEK_ENABLE =", value, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableNotEqualTo(String value) {
            addCriterion("WEEK_ENABLE <>", value, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableGreaterThan(String value) {
            addCriterion("WEEK_ENABLE >", value, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableGreaterThanOrEqualTo(String value) {
            addCriterion("WEEK_ENABLE >=", value, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableLessThan(String value) {
            addCriterion("WEEK_ENABLE <", value, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableLessThanOrEqualTo(String value) {
            addCriterion("WEEK_ENABLE <=", value, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableLike(String value) {
            addCriterion("WEEK_ENABLE like", value, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableNotLike(String value) {
            addCriterion("WEEK_ENABLE not like", value, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableIn(List<String> values) {
            addCriterion("WEEK_ENABLE in", values, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableNotIn(List<String> values) {
            addCriterion("WEEK_ENABLE not in", values, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableBetween(String value1, String value2) {
            addCriterion("WEEK_ENABLE between", value1, value2, "weekEnable");
            return this;
        }

        public Criteria andWeekEnableNotBetween(String value1, String value2) {
            addCriterion("WEEK_ENABLE not between", value1, value2, "weekEnable");
            return this;
        }

        public Criteria andWeekSettingIsNull() {
            addCriterion("WEEK_SETTING is null");
            return this;
        }

        public Criteria andWeekSettingIsNotNull() {
            addCriterion("WEEK_SETTING is not null");
            return this;
        }

        public Criteria andWeekSettingEqualTo(String value) {
            addCriterion("WEEK_SETTING =", value, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingNotEqualTo(String value) {
            addCriterion("WEEK_SETTING <>", value, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingGreaterThan(String value) {
            addCriterion("WEEK_SETTING >", value, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingGreaterThanOrEqualTo(String value) {
            addCriterion("WEEK_SETTING >=", value, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingLessThan(String value) {
            addCriterion("WEEK_SETTING <", value, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingLessThanOrEqualTo(String value) {
            addCriterion("WEEK_SETTING <=", value, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingLike(String value) {
            addCriterion("WEEK_SETTING like", value, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingNotLike(String value) {
            addCriterion("WEEK_SETTING not like", value, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingIn(List<String> values) {
            addCriterion("WEEK_SETTING in", values, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingNotIn(List<String> values) {
            addCriterion("WEEK_SETTING not in", values, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingBetween(String value1, String value2) {
            addCriterion("WEEK_SETTING between", value1, value2, "weekSetting");
            return this;
        }

        public Criteria andWeekSettingNotBetween(String value1, String value2) {
            addCriterion("WEEK_SETTING not between", value1, value2, "weekSetting");
            return this;
        }

        public Criteria andDateEnableIsNull() {
            addCriterion("DATE_ENABLE is null");
            return this;
        }

        public Criteria andDateEnableIsNotNull() {
            addCriterion("DATE_ENABLE is not null");
            return this;
        }

        public Criteria andDateEnableEqualTo(String value) {
            addCriterion("DATE_ENABLE =", value, "dateEnable");
            return this;
        }

        public Criteria andDateEnableNotEqualTo(String value) {
            addCriterion("DATE_ENABLE <>", value, "dateEnable");
            return this;
        }

        public Criteria andDateEnableGreaterThan(String value) {
            addCriterion("DATE_ENABLE >", value, "dateEnable");
            return this;
        }

        public Criteria andDateEnableGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_ENABLE >=", value, "dateEnable");
            return this;
        }

        public Criteria andDateEnableLessThan(String value) {
            addCriterion("DATE_ENABLE <", value, "dateEnable");
            return this;
        }

        public Criteria andDateEnableLessThanOrEqualTo(String value) {
            addCriterion("DATE_ENABLE <=", value, "dateEnable");
            return this;
        }

        public Criteria andDateEnableLike(String value) {
            addCriterion("DATE_ENABLE like", value, "dateEnable");
            return this;
        }

        public Criteria andDateEnableNotLike(String value) {
            addCriterion("DATE_ENABLE not like", value, "dateEnable");
            return this;
        }

        public Criteria andDateEnableIn(List<String> values) {
            addCriterion("DATE_ENABLE in", values, "dateEnable");
            return this;
        }

        public Criteria andDateEnableNotIn(List<String> values) {
            addCriterion("DATE_ENABLE not in", values, "dateEnable");
            return this;
        }

        public Criteria andDateEnableBetween(String value1, String value2) {
            addCriterion("DATE_ENABLE between", value1, value2, "dateEnable");
            return this;
        }

        public Criteria andDateEnableNotBetween(String value1, String value2) {
            addCriterion("DATE_ENABLE not between", value1, value2, "dateEnable");
            return this;
        }

        public Criteria andDateSettingIsNull() {
            addCriterion("DATE_SETTING is null");
            return this;
        }

        public Criteria andDateSettingIsNotNull() {
            addCriterion("DATE_SETTING is not null");
            return this;
        }

        public Criteria andDateSettingEqualTo(String value) {
            addCriterion("DATE_SETTING =", value, "dateSetting");
            return this;
        }

        public Criteria andDateSettingNotEqualTo(String value) {
            addCriterion("DATE_SETTING <>", value, "dateSetting");
            return this;
        }

        public Criteria andDateSettingGreaterThan(String value) {
            addCriterion("DATE_SETTING >", value, "dateSetting");
            return this;
        }

        public Criteria andDateSettingGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_SETTING >=", value, "dateSetting");
            return this;
        }

        public Criteria andDateSettingLessThan(String value) {
            addCriterion("DATE_SETTING <", value, "dateSetting");
            return this;
        }

        public Criteria andDateSettingLessThanOrEqualTo(String value) {
            addCriterion("DATE_SETTING <=", value, "dateSetting");
            return this;
        }

        public Criteria andDateSettingLike(String value) {
            addCriterion("DATE_SETTING like", value, "dateSetting");
            return this;
        }

        public Criteria andDateSettingNotLike(String value) {
            addCriterion("DATE_SETTING not like", value, "dateSetting");
            return this;
        }

        public Criteria andDateSettingIn(List<String> values) {
            addCriterion("DATE_SETTING in", values, "dateSetting");
            return this;
        }

        public Criteria andDateSettingNotIn(List<String> values) {
            addCriterion("DATE_SETTING not in", values, "dateSetting");
            return this;
        }

        public Criteria andDateSettingBetween(String value1, String value2) {
            addCriterion("DATE_SETTING between", value1, value2, "dateSetting");
            return this;
        }

        public Criteria andDateSettingNotBetween(String value1, String value2) {
            addCriterion("DATE_SETTING not between", value1, value2, "dateSetting");
            return this;
        }

        public Criteria andMonthEnableIsNull() {
            addCriterion("MONTH_ENABLE is null");
            return this;
        }

        public Criteria andMonthEnableIsNotNull() {
            addCriterion("MONTH_ENABLE is not null");
            return this;
        }

        public Criteria andMonthEnableEqualTo(String value) {
            addCriterion("MONTH_ENABLE =", value, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableNotEqualTo(String value) {
            addCriterion("MONTH_ENABLE <>", value, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableGreaterThan(String value) {
            addCriterion("MONTH_ENABLE >", value, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH_ENABLE >=", value, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableLessThan(String value) {
            addCriterion("MONTH_ENABLE <", value, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableLessThanOrEqualTo(String value) {
            addCriterion("MONTH_ENABLE <=", value, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableLike(String value) {
            addCriterion("MONTH_ENABLE like", value, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableNotLike(String value) {
            addCriterion("MONTH_ENABLE not like", value, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableIn(List<String> values) {
            addCriterion("MONTH_ENABLE in", values, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableNotIn(List<String> values) {
            addCriterion("MONTH_ENABLE not in", values, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableBetween(String value1, String value2) {
            addCriterion("MONTH_ENABLE between", value1, value2, "monthEnable");
            return this;
        }

        public Criteria andMonthEnableNotBetween(String value1, String value2) {
            addCriterion("MONTH_ENABLE not between", value1, value2, "monthEnable");
            return this;
        }

        public Criteria andMonthSettingIsNull() {
            addCriterion("MONTH_SETTING is null");
            return this;
        }

        public Criteria andMonthSettingIsNotNull() {
            addCriterion("MONTH_SETTING is not null");
            return this;
        }

        public Criteria andMonthSettingEqualTo(String value) {
            addCriterion("MONTH_SETTING =", value, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingNotEqualTo(String value) {
            addCriterion("MONTH_SETTING <>", value, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingGreaterThan(String value) {
            addCriterion("MONTH_SETTING >", value, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH_SETTING >=", value, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingLessThan(String value) {
            addCriterion("MONTH_SETTING <", value, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingLessThanOrEqualTo(String value) {
            addCriterion("MONTH_SETTING <=", value, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingLike(String value) {
            addCriterion("MONTH_SETTING like", value, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingNotLike(String value) {
            addCriterion("MONTH_SETTING not like", value, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingIn(List<String> values) {
            addCriterion("MONTH_SETTING in", values, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingNotIn(List<String> values) {
            addCriterion("MONTH_SETTING not in", values, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingBetween(String value1, String value2) {
            addCriterion("MONTH_SETTING between", value1, value2, "monthSetting");
            return this;
        }

        public Criteria andMonthSettingNotBetween(String value1, String value2) {
            addCriterion("MONTH_SETTING not between", value1, value2, "monthSetting");
            return this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_ON is null");
            return this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_ON is not null");
            return this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_ON =", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_ON <>", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_ON >", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON >=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_ON <", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_ON <=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_ON in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_ON not in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON between", value1, value2, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_ON not between", value1, value2, "updateDate");
            return this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_BY is null");
            return this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateUser");
            return this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateUser");
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
    }
}