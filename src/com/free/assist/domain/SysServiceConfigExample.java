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

public class SysServiceConfigExample extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysServiceConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysServiceConfigExample(SysServiceConfigExample example) {
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

        public Criteria andServiceIdIsNull() {
            addCriterion("Service_Id is null");
            return this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("Service_Id is not null");
            return this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("Service_Id =", value, "serviceId");
            return this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("Service_Id <>", value, "serviceId");
            return this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("Service_Id >", value, "serviceId");
            return this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("Service_Id >=", value, "serviceId");
            return this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("Service_Id <", value, "serviceId");
            return this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("Service_Id <=", value, "serviceId");
            return this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("Service_Id like", value, "serviceId");
            return this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("Service_Id not like", value, "serviceId");
            return this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("Service_Id in", values, "serviceId");
            return this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("Service_Id not in", values, "serviceId");
            return this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("Service_Id between", value1, value2, "serviceId");
            return this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("Service_Id not between", value1, value2, "serviceId");
            return this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("Service_Name is null");
            return this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("Service_Name is not null");
            return this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("Service_Name =", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("Service_Name <>", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("Service_Name >", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("Service_Name >=", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("Service_Name <", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("Service_Name <=", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("Service_Name like", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("Service_Name not like", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("Service_Name in", values, "serviceName");
            return this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("Service_Name not in", values, "serviceName");
            return this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("Service_Name between", value1, value2, "serviceName");
            return this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("Service_Name not between", value1, value2, "serviceName");
            return this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("Service_Type is null");
            return this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("Service_Type is not null");
            return this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("Service_Type =", value, "serviceType");
            return this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("Service_Type <>", value, "serviceType");
            return this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("Service_Type >", value, "serviceType");
            return this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Service_Type >=", value, "serviceType");
            return this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("Service_Type <", value, "serviceType");
            return this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("Service_Type <=", value, "serviceType");
            return this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("Service_Type like", value, "serviceType");
            return this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("Service_Type not like", value, "serviceType");
            return this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("Service_Type in", values, "serviceType");
            return this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("Service_Type not in", values, "serviceType");
            return this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("Service_Type between", value1, value2, "serviceType");
            return this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("Service_Type not between", value1, value2, "serviceType");
            return this;
        }

        public Criteria andServiceClassIsNull() {
            addCriterion("Service_Class is null");
            return this;
        }

        public Criteria andServiceClassIsNotNull() {
            addCriterion("Service_Class is not null");
            return this;
        }

        public Criteria andServiceClassEqualTo(String value) {
            addCriterion("Service_Class =", value, "serviceClass");
            return this;
        }

        public Criteria andServiceClassNotEqualTo(String value) {
            addCriterion("Service_Class <>", value, "serviceClass");
            return this;
        }

        public Criteria andServiceClassGreaterThan(String value) {
            addCriterion("Service_Class >", value, "serviceClass");
            return this;
        }

        public Criteria andServiceClassGreaterThanOrEqualTo(String value) {
            addCriterion("Service_Class >=", value, "serviceClass");
            return this;
        }

        public Criteria andServiceClassLessThan(String value) {
            addCriterion("Service_Class <", value, "serviceClass");
            return this;
        }

        public Criteria andServiceClassLessThanOrEqualTo(String value) {
            addCriterion("Service_Class <=", value, "serviceClass");
            return this;
        }

        public Criteria andServiceClassLike(String value) {
            addCriterion("Service_Class like", value, "serviceClass");
            return this;
        }

        public Criteria andServiceClassNotLike(String value) {
            addCriterion("Service_Class not like", value, "serviceClass");
            return this;
        }

        public Criteria andServiceClassIn(List<String> values) {
            addCriterion("Service_Class in", values, "serviceClass");
            return this;
        }

        public Criteria andServiceClassNotIn(List<String> values) {
            addCriterion("Service_Class not in", values, "serviceClass");
            return this;
        }

        public Criteria andServiceClassBetween(String value1, String value2) {
            addCriterion("Service_Class between", value1, value2, "serviceClass");
            return this;
        }

        public Criteria andServiceClassNotBetween(String value1, String value2) {
            addCriterion("Service_Class not between", value1, value2, "serviceClass");
            return this;
        }

        public Criteria andServiceDescIsNull() {
            addCriterion("Service_Desc is null");
            return this;
        }

        public Criteria andServiceDescIsNotNull() {
            addCriterion("Service_Desc is not null");
            return this;
        }

        public Criteria andServiceDescEqualTo(String value) {
            addCriterion("Service_Desc =", value, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescNotEqualTo(String value) {
            addCriterion("Service_Desc <>", value, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescGreaterThan(String value) {
            addCriterion("Service_Desc >", value, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescGreaterThanOrEqualTo(String value) {
            addCriterion("Service_Desc >=", value, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescLessThan(String value) {
            addCriterion("Service_Desc <", value, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescLessThanOrEqualTo(String value) {
            addCriterion("Service_Desc <=", value, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescLike(String value) {
            addCriterion("Service_Desc like", value, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescNotLike(String value) {
            addCriterion("Service_Desc not like", value, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescIn(List<String> values) {
            addCriterion("Service_Desc in", values, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescNotIn(List<String> values) {
            addCriterion("Service_Desc not in", values, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescBetween(String value1, String value2) {
            addCriterion("Service_Desc between", value1, value2, "serviceDesc");
            return this;
        }

        public Criteria andServiceDescNotBetween(String value1, String value2) {
            addCriterion("Service_Desc not between", value1, value2, "serviceDesc");
            return this;
        }

        public Criteria andServiceHostnameIsNull() {
            addCriterion("Service_HostName is null");
            return this;
        }

        public Criteria andServiceHostnameIsNotNull() {
            addCriterion("Service_HostName is not null");
            return this;
        }

        public Criteria andServiceHostnameEqualTo(String value) {
            addCriterion("Service_HostName =", value, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameNotEqualTo(String value) {
            addCriterion("Service_HostName <>", value, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameGreaterThan(String value) {
            addCriterion("Service_HostName >", value, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("Service_HostName >=", value, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameLessThan(String value) {
            addCriterion("Service_HostName <", value, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameLessThanOrEqualTo(String value) {
            addCriterion("Service_HostName <=", value, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameLike(String value) {
            addCriterion("Service_HostName like", value, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameNotLike(String value) {
            addCriterion("Service_HostName not like", value, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameIn(List<String> values) {
            addCriterion("Service_HostName in", values, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameNotIn(List<String> values) {
            addCriterion("Service_HostName not in", values, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameBetween(String value1, String value2) {
            addCriterion("Service_HostName between", value1, value2, "serviceHostname");
            return this;
        }

        public Criteria andServiceHostnameNotBetween(String value1, String value2) {
            addCriterion("Service_HostName not between", value1, value2, "serviceHostname");
            return this;
        }

        public Criteria andWsUrlIsNull() {
            addCriterion("WS_URL is null");
            return this;
        }

        public Criteria andWsUrlIsNotNull() {
            addCriterion("WS_URL is not null");
            return this;
        }

        public Criteria andWsUrlEqualTo(String value) {
            addCriterion("WS_URL =", value, "wsUrl");
            return this;
        }

        public Criteria andWsUrlNotEqualTo(String value) {
            addCriterion("WS_URL <>", value, "wsUrl");
            return this;
        }

        public Criteria andWsUrlGreaterThan(String value) {
            addCriterion("WS_URL >", value, "wsUrl");
            return this;
        }

        public Criteria andWsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("WS_URL >=", value, "wsUrl");
            return this;
        }

        public Criteria andWsUrlLessThan(String value) {
            addCriterion("WS_URL <", value, "wsUrl");
            return this;
        }

        public Criteria andWsUrlLessThanOrEqualTo(String value) {
            addCriterion("WS_URL <=", value, "wsUrl");
            return this;
        }

        public Criteria andWsUrlLike(String value) {
            addCriterion("WS_URL like", value, "wsUrl");
            return this;
        }

        public Criteria andWsUrlNotLike(String value) {
            addCriterion("WS_URL not like", value, "wsUrl");
            return this;
        }

        public Criteria andWsUrlIn(List<String> values) {
            addCriterion("WS_URL in", values, "wsUrl");
            return this;
        }

        public Criteria andWsUrlNotIn(List<String> values) {
            addCriterion("WS_URL not in", values, "wsUrl");
            return this;
        }

        public Criteria andWsUrlBetween(String value1, String value2) {
            addCriterion("WS_URL between", value1, value2, "wsUrl");
            return this;
        }

        public Criteria andWsUrlNotBetween(String value1, String value2) {
            addCriterion("WS_URL not between", value1, value2, "wsUrl");
            return this;
        }

        public Criteria andRunModeIsNull() {
            addCriterion("Run_Mode is null");
            return this;
        }

        public Criteria andRunModeIsNotNull() {
            addCriterion("Run_Mode is not null");
            return this;
        }

        public Criteria andRunModeEqualTo(String value) {
            addCriterion("Run_Mode =", value, "runMode");
            return this;
        }

        public Criteria andRunModeNotEqualTo(String value) {
            addCriterion("Run_Mode <>", value, "runMode");
            return this;
        }

        public Criteria andRunModeGreaterThan(String value) {
            addCriterion("Run_Mode >", value, "runMode");
            return this;
        }

        public Criteria andRunModeGreaterThanOrEqualTo(String value) {
            addCriterion("Run_Mode >=", value, "runMode");
            return this;
        }

        public Criteria andRunModeLessThan(String value) {
            addCriterion("Run_Mode <", value, "runMode");
            return this;
        }

        public Criteria andRunModeLessThanOrEqualTo(String value) {
            addCriterion("Run_Mode <=", value, "runMode");
            return this;
        }

        public Criteria andRunModeLike(String value) {
            addCriterion("Run_Mode like", value, "runMode");
            return this;
        }

        public Criteria andRunModeNotLike(String value) {
            addCriterion("Run_Mode not like", value, "runMode");
            return this;
        }

        public Criteria andRunModeIn(List<String> values) {
            addCriterion("Run_Mode in", values, "runMode");
            return this;
        }

        public Criteria andRunModeNotIn(List<String> values) {
            addCriterion("Run_Mode not in", values, "runMode");
            return this;
        }

        public Criteria andRunModeBetween(String value1, String value2) {
            addCriterion("Run_Mode between", value1, value2, "runMode");
            return this;
        }

        public Criteria andRunModeNotBetween(String value1, String value2) {
            addCriterion("Run_Mode not between", value1, value2, "runMode");
            return this;
        }

        public Criteria andRunIntervalIsNull() {
            addCriterion("Run_Interval is null");
            return this;
        }

        public Criteria andRunIntervalIsNotNull() {
            addCriterion("Run_Interval is not null");
            return this;
        }

        public Criteria andRunIntervalEqualTo(Integer value) {
            addCriterion("Run_Interval =", value, "runInterval");
            return this;
        }

        public Criteria andRunIntervalNotEqualTo(Integer value) {
            addCriterion("Run_Interval <>", value, "runInterval");
            return this;
        }

        public Criteria andRunIntervalGreaterThan(Integer value) {
            addCriterion("Run_Interval >", value, "runInterval");
            return this;
        }

        public Criteria andRunIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("Run_Interval >=", value, "runInterval");
            return this;
        }

        public Criteria andRunIntervalLessThan(Integer value) {
            addCriterion("Run_Interval <", value, "runInterval");
            return this;
        }

        public Criteria andRunIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("Run_Interval <=", value, "runInterval");
            return this;
        }

        public Criteria andRunIntervalIn(List<Integer> values) {
            addCriterion("Run_Interval in", values, "runInterval");
            return this;
        }

        public Criteria andRunIntervalNotIn(List<Integer> values) {
            addCriterion("Run_Interval not in", values, "runInterval");
            return this;
        }

        public Criteria andRunIntervalBetween(Integer value1, Integer value2) {
            addCriterion("Run_Interval between", value1, value2, "runInterval");
            return this;
        }

        public Criteria andRunIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("Run_Interval not between", value1, value2, "runInterval");
            return this;
        }

        public Criteria andRunParameterIsNull() {
            addCriterion("Run_Parameter is null");
            return this;
        }

        public Criteria andRunParameterIsNotNull() {
            addCriterion("Run_Parameter is not null");
            return this;
        }

        public Criteria andRunParameterEqualTo(String value) {
            addCriterion("Run_Parameter =", value, "runParameter");
            return this;
        }

        public Criteria andRunParameterNotEqualTo(String value) {
            addCriterion("Run_Parameter <>", value, "runParameter");
            return this;
        }

        public Criteria andRunParameterGreaterThan(String value) {
            addCriterion("Run_Parameter >", value, "runParameter");
            return this;
        }

        public Criteria andRunParameterGreaterThanOrEqualTo(String value) {
            addCriterion("Run_Parameter >=", value, "runParameter");
            return this;
        }

        public Criteria andRunParameterLessThan(String value) {
            addCriterion("Run_Parameter <", value, "runParameter");
            return this;
        }

        public Criteria andRunParameterLessThanOrEqualTo(String value) {
            addCriterion("Run_Parameter <=", value, "runParameter");
            return this;
        }

        public Criteria andRunParameterLike(String value) {
            addCriterion("Run_Parameter like", value, "runParameter");
            return this;
        }

        public Criteria andRunParameterNotLike(String value) {
            addCriterion("Run_Parameter not like", value, "runParameter");
            return this;
        }

        public Criteria andRunParameterIn(List<String> values) {
            addCriterion("Run_Parameter in", values, "runParameter");
            return this;
        }

        public Criteria andRunParameterNotIn(List<String> values) {
            addCriterion("Run_Parameter not in", values, "runParameter");
            return this;
        }

        public Criteria andRunParameterBetween(String value1, String value2) {
            addCriterion("Run_Parameter between", value1, value2, "runParameter");
            return this;
        }

        public Criteria andRunParameterNotBetween(String value1, String value2) {
            addCriterion("Run_Parameter not between", value1, value2, "runParameter");
            return this;
        }

        public Criteria andStartDefaultIsNull() {
            addCriterion("Start_Default is null");
            return this;
        }

        public Criteria andStartDefaultIsNotNull() {
            addCriterion("Start_Default is not null");
            return this;
        }

        public Criteria andStartDefaultEqualTo(String value) {
            addCriterion("Start_Default =", value, "startDefault");
            return this;
        }

        public Criteria andStartDefaultNotEqualTo(String value) {
            addCriterion("Start_Default <>", value, "startDefault");
            return this;
        }

        public Criteria andStartDefaultGreaterThan(String value) {
            addCriterion("Start_Default >", value, "startDefault");
            return this;
        }

        public Criteria andStartDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("Start_Default >=", value, "startDefault");
            return this;
        }

        public Criteria andStartDefaultLessThan(String value) {
            addCriterion("Start_Default <", value, "startDefault");
            return this;
        }

        public Criteria andStartDefaultLessThanOrEqualTo(String value) {
            addCriterion("Start_Default <=", value, "startDefault");
            return this;
        }

        public Criteria andStartDefaultLike(String value) {
            addCriterion("Start_Default like", value, "startDefault");
            return this;
        }

        public Criteria andStartDefaultNotLike(String value) {
            addCriterion("Start_Default not like", value, "startDefault");
            return this;
        }

        public Criteria andStartDefaultIn(List<String> values) {
            addCriterion("Start_Default in", values, "startDefault");
            return this;
        }

        public Criteria andStartDefaultNotIn(List<String> values) {
            addCriterion("Start_Default not in", values, "startDefault");
            return this;
        }

        public Criteria andStartDefaultBetween(String value1, String value2) {
            addCriterion("Start_Default between", value1, value2, "startDefault");
            return this;
        }

        public Criteria andStartDefaultNotBetween(String value1, String value2) {
            addCriterion("Start_Default not between", value1, value2, "startDefault");
            return this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("Is_Deleted is null");
            return this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("Is_Deleted is not null");
            return this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("Is_Deleted =", value, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("Is_Deleted <>", value, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("Is_Deleted >", value, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("Is_Deleted >=", value, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("Is_Deleted <", value, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("Is_Deleted <=", value, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("Is_Deleted like", value, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("Is_Deleted not like", value, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("Is_Deleted in", values, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("Is_Deleted not in", values, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("Is_Deleted between", value1, value2, "isDeleted");
            return this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("Is_Deleted not between", value1, value2, "isDeleted");
            return this;
        }

        public Criteria andStartRunonceIsNull() {
            addCriterion("Start_RunOnce is null");
            return this;
        }

        public Criteria andStartRunonceIsNotNull() {
            addCriterion("Start_RunOnce is not null");
            return this;
        }

        public Criteria andStartRunonceEqualTo(String value) {
            addCriterion("Start_RunOnce =", value, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceNotEqualTo(String value) {
            addCriterion("Start_RunOnce <>", value, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceGreaterThan(String value) {
            addCriterion("Start_RunOnce >", value, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceGreaterThanOrEqualTo(String value) {
            addCriterion("Start_RunOnce >=", value, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceLessThan(String value) {
            addCriterion("Start_RunOnce <", value, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceLessThanOrEqualTo(String value) {
            addCriterion("Start_RunOnce <=", value, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceLike(String value) {
            addCriterion("Start_RunOnce like", value, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceNotLike(String value) {
            addCriterion("Start_RunOnce not like", value, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceIn(List<String> values) {
            addCriterion("Start_RunOnce in", values, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceNotIn(List<String> values) {
            addCriterion("Start_RunOnce not in", values, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceBetween(String value1, String value2) {
            addCriterion("Start_RunOnce between", value1, value2, "startRunonce");
            return this;
        }

        public Criteria andStartRunonceNotBetween(String value1, String value2) {
            addCriterion("Start_RunOnce not between", value1, value2, "startRunonce");
            return this;
        }
    }
}