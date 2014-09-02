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

public class IfaceConfigProtocolExample extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public IfaceConfigProtocolExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected IfaceConfigProtocolExample(IfaceConfigProtocolExample example) {
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

        public Criteria andProtocolIdIsNull() {
            addCriterion("PROTOCOL_ID is null");
            return this;
        }

        public Criteria andProtocolIdIsNotNull() {
            addCriterion("PROTOCOL_ID is not null");
            return this;
        }

        public Criteria andProtocolIdEqualTo(String value) {
            addCriterion("PROTOCOL_ID =", value, "protocolId");
            return this;
        }

        public Criteria andProtocolIdNotEqualTo(String value) {
            addCriterion("PROTOCOL_ID <>", value, "protocolId");
            return this;
        }

        public Criteria andProtocolIdGreaterThan(String value) {
            addCriterion("PROTOCOL_ID >", value, "protocolId");
            return this;
        }

        public Criteria andProtocolIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_ID >=", value, "protocolId");
            return this;
        }

        public Criteria andProtocolIdLessThan(String value) {
            addCriterion("PROTOCOL_ID <", value, "protocolId");
            return this;
        }

        public Criteria andProtocolIdLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_ID <=", value, "protocolId");
            return this;
        }

        public Criteria andProtocolIdLike(String value) {
            addCriterion("PROTOCOL_ID like", value, "protocolId");
            return this;
        }

        public Criteria andProtocolIdNotLike(String value) {
            addCriterion("PROTOCOL_ID not like", value, "protocolId");
            return this;
        }

        public Criteria andProtocolIdIn(List<String> values) {
            addCriterion("PROTOCOL_ID in", values, "protocolId");
            return this;
        }

        public Criteria andProtocolIdNotIn(List<String> values) {
            addCriterion("PROTOCOL_ID not in", values, "protocolId");
            return this;
        }

        public Criteria andProtocolIdBetween(String value1, String value2) {
            addCriterion("PROTOCOL_ID between", value1, value2, "protocolId");
            return this;
        }

        public Criteria andProtocolIdNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL_ID not between", value1, value2, "protocolId");
            return this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("APPLICATION_ID is null");
            return this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("APPLICATION_ID is not null");
            return this;
        }

        public Criteria andApplicationIdEqualTo(String value) {
            addCriterion("APPLICATION_ID =", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotEqualTo(String value) {
            addCriterion("APPLICATION_ID <>", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdGreaterThan(String value) {
            addCriterion("APPLICATION_ID >", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_ID >=", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLessThan(String value) {
            addCriterion("APPLICATION_ID <", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_ID <=", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdLike(String value) {
            addCriterion("APPLICATION_ID like", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotLike(String value) {
            addCriterion("APPLICATION_ID not like", value, "applicationId");
            return this;
        }

        public Criteria andApplicationIdIn(List<String> values) {
            addCriterion("APPLICATION_ID in", values, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotIn(List<String> values) {
            addCriterion("APPLICATION_ID not in", values, "applicationId");
            return this;
        }

        public Criteria andApplicationIdBetween(String value1, String value2) {
            addCriterion("APPLICATION_ID between", value1, value2, "applicationId");
            return this;
        }

        public Criteria andApplicationIdNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_ID not between", value1, value2, "applicationId");
            return this;
        }

        public Criteria andApplicationSnIsNull() {
            addCriterion("APPLICATION_SN is null");
            return this;
        }

        public Criteria andApplicationSnIsNotNull() {
            addCriterion("APPLICATION_SN is not null");
            return this;
        }

        public Criteria andApplicationSnEqualTo(String value) {
            addCriterion("APPLICATION_SN =", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnNotEqualTo(String value) {
            addCriterion("APPLICATION_SN <>", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnGreaterThan(String value) {
            addCriterion("APPLICATION_SN >", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_SN >=", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnLessThan(String value) {
            addCriterion("APPLICATION_SN <", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_SN <=", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnLike(String value) {
            addCriterion("APPLICATION_SN like", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnNotLike(String value) {
            addCriterion("APPLICATION_SN not like", value, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnIn(List<String> values) {
            addCriterion("APPLICATION_SN in", values, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnNotIn(List<String> values) {
            addCriterion("APPLICATION_SN not in", values, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnBetween(String value1, String value2) {
            addCriterion("APPLICATION_SN between", value1, value2, "applicationSn");
            return this;
        }

        public Criteria andApplicationSnNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_SN not between", value1, value2, "applicationSn");
            return this;
        }

        public Criteria andApplicationNameIsNull() {
            addCriterion("APPLICATION_NAME is null");
            return this;
        }

        public Criteria andApplicationNameIsNotNull() {
            addCriterion("APPLICATION_NAME is not null");
            return this;
        }

        public Criteria andApplicationNameEqualTo(String value) {
            addCriterion("APPLICATION_NAME =", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotEqualTo(String value) {
            addCriterion("APPLICATION_NAME <>", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameGreaterThan(String value) {
            addCriterion("APPLICATION_NAME >", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NAME >=", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLessThan(String value) {
            addCriterion("APPLICATION_NAME <", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NAME <=", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameLike(String value) {
            addCriterion("APPLICATION_NAME like", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotLike(String value) {
            addCriterion("APPLICATION_NAME not like", value, "applicationName");
            return this;
        }

        public Criteria andApplicationNameIn(List<String> values) {
            addCriterion("APPLICATION_NAME in", values, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotIn(List<String> values) {
            addCriterion("APPLICATION_NAME not in", values, "applicationName");
            return this;
        }

        public Criteria andApplicationNameBetween(String value1, String value2) {
            addCriterion("APPLICATION_NAME between", value1, value2, "applicationName");
            return this;
        }

        public Criteria andApplicationNameNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_NAME not between", value1, value2, "applicationName");
            return this;
        }

        public Criteria andServeTypeIsNull() {
            addCriterion("SERVE_TYPE is null");
            return this;
        }

        public Criteria andServeTypeIsNotNull() {
            addCriterion("SERVE_TYPE is not null");
            return this;
        }

        public Criteria andServeTypeEqualTo(String value) {
            addCriterion("SERVE_TYPE =", value, "serveType");
            return this;
        }

        public Criteria andServeTypeNotEqualTo(String value) {
            addCriterion("SERVE_TYPE <>", value, "serveType");
            return this;
        }

        public Criteria andServeTypeGreaterThan(String value) {
            addCriterion("SERVE_TYPE >", value, "serveType");
            return this;
        }

        public Criteria andServeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVE_TYPE >=", value, "serveType");
            return this;
        }

        public Criteria andServeTypeLessThan(String value) {
            addCriterion("SERVE_TYPE <", value, "serveType");
            return this;
        }

        public Criteria andServeTypeLessThanOrEqualTo(String value) {
            addCriterion("SERVE_TYPE <=", value, "serveType");
            return this;
        }

        public Criteria andServeTypeLike(String value) {
            addCriterion("SERVE_TYPE like", value, "serveType");
            return this;
        }

        public Criteria andServeTypeNotLike(String value) {
            addCriterion("SERVE_TYPE not like", value, "serveType");
            return this;
        }

        public Criteria andServeTypeIn(List<String> values) {
            addCriterion("SERVE_TYPE in", values, "serveType");
            return this;
        }

        public Criteria andServeTypeNotIn(List<String> values) {
            addCriterion("SERVE_TYPE not in", values, "serveType");
            return this;
        }

        public Criteria andServeTypeBetween(String value1, String value2) {
            addCriterion("SERVE_TYPE between", value1, value2, "serveType");
            return this;
        }

        public Criteria andServeTypeNotBetween(String value1, String value2) {
            addCriterion("SERVE_TYPE not between", value1, value2, "serveType");
            return this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "phoneNumber");
            return this;
        }

        public Criteria andEmailAddressIsNull() {
            addCriterion("EMAIL_ADDRESS is null");
            return this;
        }

        public Criteria andEmailAddressIsNotNull() {
            addCriterion("EMAIL_ADDRESS is not null");
            return this;
        }

        public Criteria andEmailAddressEqualTo(String value) {
            addCriterion("EMAIL_ADDRESS =", value, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressNotEqualTo(String value) {
            addCriterion("EMAIL_ADDRESS <>", value, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressGreaterThan(String value) {
            addCriterion("EMAIL_ADDRESS >", value, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_ADDRESS >=", value, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressLessThan(String value) {
            addCriterion("EMAIL_ADDRESS <", value, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_ADDRESS <=", value, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressLike(String value) {
            addCriterion("EMAIL_ADDRESS like", value, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressNotLike(String value) {
            addCriterion("EMAIL_ADDRESS not like", value, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressIn(List<String> values) {
            addCriterion("EMAIL_ADDRESS in", values, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressNotIn(List<String> values) {
            addCriterion("EMAIL_ADDRESS not in", values, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressBetween(String value1, String value2) {
            addCriterion("EMAIL_ADDRESS between", value1, value2, "emailAddress");
            return this;
        }

        public Criteria andEmailAddressNotBetween(String value1, String value2) {
            addCriterion("EMAIL_ADDRESS not between", value1, value2, "emailAddress");
            return this;
        }

        public Criteria andInterfaceNameIsNull() {
            addCriterion("INTERFACE_NAME is null");
            return this;
        }

        public Criteria andInterfaceNameIsNotNull() {
            addCriterion("INTERFACE_NAME is not null");
            return this;
        }

        public Criteria andInterfaceNameEqualTo(String value) {
            addCriterion("INTERFACE_NAME =", value, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameNotEqualTo(String value) {
            addCriterion("INTERFACE_NAME <>", value, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameGreaterThan(String value) {
            addCriterion("INTERFACE_NAME >", value, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("INTERFACE_NAME >=", value, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameLessThan(String value) {
            addCriterion("INTERFACE_NAME <", value, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameLessThanOrEqualTo(String value) {
            addCriterion("INTERFACE_NAME <=", value, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameLike(String value) {
            addCriterion("INTERFACE_NAME like", value, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameNotLike(String value) {
            addCriterion("INTERFACE_NAME not like", value, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameIn(List<String> values) {
            addCriterion("INTERFACE_NAME in", values, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameNotIn(List<String> values) {
            addCriterion("INTERFACE_NAME not in", values, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameBetween(String value1, String value2) {
            addCriterion("INTERFACE_NAME between", value1, value2, "interfaceName");
            return this;
        }

        public Criteria andInterfaceNameNotBetween(String value1, String value2) {
            addCriterion("INTERFACE_NAME not between", value1, value2, "interfaceName");
            return this;
        }

        public Criteria andProtocolNameIsNull() {
            addCriterion("PROTOCOL_NAME is null");
            return this;
        }

        public Criteria andProtocolNameIsNotNull() {
            addCriterion("PROTOCOL_NAME is not null");
            return this;
        }

        public Criteria andProtocolNameEqualTo(String value) {
            addCriterion("PROTOCOL_NAME =", value, "protocolName");
            return this;
        }

        public Criteria andProtocolNameNotEqualTo(String value) {
            addCriterion("PROTOCOL_NAME <>", value, "protocolName");
            return this;
        }

        public Criteria andProtocolNameGreaterThan(String value) {
            addCriterion("PROTOCOL_NAME >", value, "protocolName");
            return this;
        }

        public Criteria andProtocolNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_NAME >=", value, "protocolName");
            return this;
        }

        public Criteria andProtocolNameLessThan(String value) {
            addCriterion("PROTOCOL_NAME <", value, "protocolName");
            return this;
        }

        public Criteria andProtocolNameLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_NAME <=", value, "protocolName");
            return this;
        }

        public Criteria andProtocolNameLike(String value) {
            addCriterion("PROTOCOL_NAME like", value, "protocolName");
            return this;
        }

        public Criteria andProtocolNameNotLike(String value) {
            addCriterion("PROTOCOL_NAME not like", value, "protocolName");
            return this;
        }

        public Criteria andProtocolNameIn(List<String> values) {
            addCriterion("PROTOCOL_NAME in", values, "protocolName");
            return this;
        }

        public Criteria andProtocolNameNotIn(List<String> values) {
            addCriterion("PROTOCOL_NAME not in", values, "protocolName");
            return this;
        }

        public Criteria andProtocolNameBetween(String value1, String value2) {
            addCriterion("PROTOCOL_NAME between", value1, value2, "protocolName");
            return this;
        }

        public Criteria andProtocolNameNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL_NAME not between", value1, value2, "protocolName");
            return this;
        }

        public Criteria andRemoteHostIsNull() {
            addCriterion("REMOTE_HOST is null");
            return this;
        }

        public Criteria andRemoteHostIsNotNull() {
            addCriterion("REMOTE_HOST is not null");
            return this;
        }

        public Criteria andRemoteHostEqualTo(String value) {
            addCriterion("REMOTE_HOST =", value, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostNotEqualTo(String value) {
            addCriterion("REMOTE_HOST <>", value, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostGreaterThan(String value) {
            addCriterion("REMOTE_HOST >", value, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostGreaterThanOrEqualTo(String value) {
            addCriterion("REMOTE_HOST >=", value, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostLessThan(String value) {
            addCriterion("REMOTE_HOST <", value, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostLessThanOrEqualTo(String value) {
            addCriterion("REMOTE_HOST <=", value, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostLike(String value) {
            addCriterion("REMOTE_HOST like", value, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostNotLike(String value) {
            addCriterion("REMOTE_HOST not like", value, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostIn(List<String> values) {
            addCriterion("REMOTE_HOST in", values, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostNotIn(List<String> values) {
            addCriterion("REMOTE_HOST not in", values, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostBetween(String value1, String value2) {
            addCriterion("REMOTE_HOST between", value1, value2, "remoteHost");
            return this;
        }

        public Criteria andRemoteHostNotBetween(String value1, String value2) {
            addCriterion("REMOTE_HOST not between", value1, value2, "remoteHost");
            return this;
        }

        public Criteria andRemotePortIsNull() {
            addCriterion("REMOTE_PORT is null");
            return this;
        }

        public Criteria andRemotePortIsNotNull() {
            addCriterion("REMOTE_PORT is not null");
            return this;
        }

        public Criteria andRemotePortEqualTo(Integer value) {
            addCriterion("REMOTE_PORT =", value, "remotePort");
            return this;
        }

        public Criteria andRemotePortNotEqualTo(Integer value) {
            addCriterion("REMOTE_PORT <>", value, "remotePort");
            return this;
        }

        public Criteria andRemotePortGreaterThan(Integer value) {
            addCriterion("REMOTE_PORT >", value, "remotePort");
            return this;
        }

        public Criteria andRemotePortGreaterThanOrEqualTo(Integer value) {
            addCriterion("REMOTE_PORT >=", value, "remotePort");
            return this;
        }

        public Criteria andRemotePortLessThan(Integer value) {
            addCriterion("REMOTE_PORT <", value, "remotePort");
            return this;
        }

        public Criteria andRemotePortLessThanOrEqualTo(Integer value) {
            addCriterion("REMOTE_PORT <=", value, "remotePort");
            return this;
        }

        public Criteria andRemotePortIn(List<Integer> values) {
            addCriterion("REMOTE_PORT in", values, "remotePort");
            return this;
        }

        public Criteria andRemotePortNotIn(List<Integer> values) {
            addCriterion("REMOTE_PORT not in", values, "remotePort");
            return this;
        }

        public Criteria andRemotePortBetween(Integer value1, Integer value2) {
            addCriterion("REMOTE_PORT between", value1, value2, "remotePort");
            return this;
        }

        public Criteria andRemotePortNotBetween(Integer value1, Integer value2) {
            addCriterion("REMOTE_PORT not between", value1, value2, "remotePort");
            return this;
        }

        public Criteria andAuthAccountIsNull() {
            addCriterion("AUTH_ACCOUNT is null");
            return this;
        }

        public Criteria andAuthAccountIsNotNull() {
            addCriterion("AUTH_ACCOUNT is not null");
            return this;
        }

        public Criteria andAuthAccountEqualTo(String value) {
            addCriterion("AUTH_ACCOUNT =", value, "authAccount");
            return this;
        }

        public Criteria andAuthAccountNotEqualTo(String value) {
            addCriterion("AUTH_ACCOUNT <>", value, "authAccount");
            return this;
        }

        public Criteria andAuthAccountGreaterThan(String value) {
            addCriterion("AUTH_ACCOUNT >", value, "authAccount");
            return this;
        }

        public Criteria andAuthAccountGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_ACCOUNT >=", value, "authAccount");
            return this;
        }

        public Criteria andAuthAccountLessThan(String value) {
            addCriterion("AUTH_ACCOUNT <", value, "authAccount");
            return this;
        }

        public Criteria andAuthAccountLessThanOrEqualTo(String value) {
            addCriterion("AUTH_ACCOUNT <=", value, "authAccount");
            return this;
        }

        public Criteria andAuthAccountLike(String value) {
            addCriterion("AUTH_ACCOUNT like", value, "authAccount");
            return this;
        }

        public Criteria andAuthAccountNotLike(String value) {
            addCriterion("AUTH_ACCOUNT not like", value, "authAccount");
            return this;
        }

        public Criteria andAuthAccountIn(List<String> values) {
            addCriterion("AUTH_ACCOUNT in", values, "authAccount");
            return this;
        }

        public Criteria andAuthAccountNotIn(List<String> values) {
            addCriterion("AUTH_ACCOUNT not in", values, "authAccount");
            return this;
        }

        public Criteria andAuthAccountBetween(String value1, String value2) {
            addCriterion("AUTH_ACCOUNT between", value1, value2, "authAccount");
            return this;
        }

        public Criteria andAuthAccountNotBetween(String value1, String value2) {
            addCriterion("AUTH_ACCOUNT not between", value1, value2, "authAccount");
            return this;
        }

        public Criteria andAuthPasswordIsNull() {
            addCriterion("AUTH_PASSWORD is null");
            return this;
        }

        public Criteria andAuthPasswordIsNotNull() {
            addCriterion("AUTH_PASSWORD is not null");
            return this;
        }

        public Criteria andAuthPasswordEqualTo(String value) {
            addCriterion("AUTH_PASSWORD =", value, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordNotEqualTo(String value) {
            addCriterion("AUTH_PASSWORD <>", value, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordGreaterThan(String value) {
            addCriterion("AUTH_PASSWORD >", value, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_PASSWORD >=", value, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordLessThan(String value) {
            addCriterion("AUTH_PASSWORD <", value, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordLessThanOrEqualTo(String value) {
            addCriterion("AUTH_PASSWORD <=", value, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordLike(String value) {
            addCriterion("AUTH_PASSWORD like", value, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordNotLike(String value) {
            addCriterion("AUTH_PASSWORD not like", value, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordIn(List<String> values) {
            addCriterion("AUTH_PASSWORD in", values, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordNotIn(List<String> values) {
            addCriterion("AUTH_PASSWORD not in", values, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordBetween(String value1, String value2) {
            addCriterion("AUTH_PASSWORD between", value1, value2, "authPassword");
            return this;
        }

        public Criteria andAuthPasswordNotBetween(String value1, String value2) {
            addCriterion("AUTH_PASSWORD not between", value1, value2, "authPassword");
            return this;
        }

        public Criteria andProviderNameIsNull() {
            addCriterion("PROVIDER_NAME is null");
            return this;
        }

        public Criteria andProviderNameIsNotNull() {
            addCriterion("PROVIDER_NAME is not null");
            return this;
        }

        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("PROVIDER_NAME =", value, "providerName");
            return this;
        }

        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("PROVIDER_NAME <>", value, "providerName");
            return this;
        }

        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("PROVIDER_NAME >", value, "providerName");
            return this;
        }

        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_NAME >=", value, "providerName");
            return this;
        }

        public Criteria andProviderNameLessThan(String value) {
            addCriterion("PROVIDER_NAME <", value, "providerName");
            return this;
        }

        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_NAME <=", value, "providerName");
            return this;
        }

        public Criteria andProviderNameLike(String value) {
            addCriterion("PROVIDER_NAME like", value, "providerName");
            return this;
        }

        public Criteria andProviderNameNotLike(String value) {
            addCriterion("PROVIDER_NAME not like", value, "providerName");
            return this;
        }

        public Criteria andProviderNameIn(List<String> values) {
            addCriterion("PROVIDER_NAME in", values, "providerName");
            return this;
        }

        public Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("PROVIDER_NAME not in", values, "providerName");
            return this;
        }

        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("PROVIDER_NAME between", value1, value2, "providerName");
            return this;
        }

        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_NAME not between", value1, value2, "providerName");
            return this;
        }

        public Criteria andJndiNameIsNull() {
            addCriterion("JNDI_NAME is null");
            return this;
        }

        public Criteria andJndiNameIsNotNull() {
            addCriterion("JNDI_NAME is not null");
            return this;
        }

        public Criteria andJndiNameEqualTo(String value) {
            addCriterion("JNDI_NAME =", value, "jndiName");
            return this;
        }

        public Criteria andJndiNameNotEqualTo(String value) {
            addCriterion("JNDI_NAME <>", value, "jndiName");
            return this;
        }

        public Criteria andJndiNameGreaterThan(String value) {
            addCriterion("JNDI_NAME >", value, "jndiName");
            return this;
        }

        public Criteria andJndiNameGreaterThanOrEqualTo(String value) {
            addCriterion("JNDI_NAME >=", value, "jndiName");
            return this;
        }

        public Criteria andJndiNameLessThan(String value) {
            addCriterion("JNDI_NAME <", value, "jndiName");
            return this;
        }

        public Criteria andJndiNameLessThanOrEqualTo(String value) {
            addCriterion("JNDI_NAME <=", value, "jndiName");
            return this;
        }

        public Criteria andJndiNameLike(String value) {
            addCriterion("JNDI_NAME like", value, "jndiName");
            return this;
        }

        public Criteria andJndiNameNotLike(String value) {
            addCriterion("JNDI_NAME not like", value, "jndiName");
            return this;
        }

        public Criteria andJndiNameIn(List<String> values) {
            addCriterion("JNDI_NAME in", values, "jndiName");
            return this;
        }

        public Criteria andJndiNameNotIn(List<String> values) {
            addCriterion("JNDI_NAME not in", values, "jndiName");
            return this;
        }

        public Criteria andJndiNameBetween(String value1, String value2) {
            addCriterion("JNDI_NAME between", value1, value2, "jndiName");
            return this;
        }

        public Criteria andJndiNameNotBetween(String value1, String value2) {
            addCriterion("JNDI_NAME not between", value1, value2, "jndiName");
            return this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("DESTINATION is null");
            return this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("DESTINATION is not null");
            return this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("DESTINATION =", value, "destination");
            return this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("DESTINATION <>", value, "destination");
            return this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("DESTINATION >", value, "destination");
            return this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("DESTINATION >=", value, "destination");
            return this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("DESTINATION <", value, "destination");
            return this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("DESTINATION <=", value, "destination");
            return this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("DESTINATION like", value, "destination");
            return this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("DESTINATION not like", value, "destination");
            return this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("DESTINATION in", values, "destination");
            return this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("DESTINATION not in", values, "destination");
            return this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("DESTINATION between", value1, value2, "destination");
            return this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("DESTINATION not between", value1, value2, "destination");
            return this;
        }

        public Criteria andWsdlAddrIsNull() {
            addCriterion("WSDL_ADDR is null");
            return this;
        }

        public Criteria andWsdlAddrIsNotNull() {
            addCriterion("WSDL_ADDR is not null");
            return this;
        }

        public Criteria andWsdlAddrEqualTo(String value) {
            addCriterion("WSDL_ADDR =", value, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrNotEqualTo(String value) {
            addCriterion("WSDL_ADDR <>", value, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrGreaterThan(String value) {
            addCriterion("WSDL_ADDR >", value, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("WSDL_ADDR >=", value, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrLessThan(String value) {
            addCriterion("WSDL_ADDR <", value, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrLessThanOrEqualTo(String value) {
            addCriterion("WSDL_ADDR <=", value, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrLike(String value) {
            addCriterion("WSDL_ADDR like", value, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrNotLike(String value) {
            addCriterion("WSDL_ADDR not like", value, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrIn(List<String> values) {
            addCriterion("WSDL_ADDR in", values, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrNotIn(List<String> values) {
            addCriterion("WSDL_ADDR not in", values, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrBetween(String value1, String value2) {
            addCriterion("WSDL_ADDR between", value1, value2, "wsdlAddr");
            return this;
        }

        public Criteria andWsdlAddrNotBetween(String value1, String value2) {
            addCriterion("WSDL_ADDR not between", value1, value2, "wsdlAddr");
            return this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return this;
        }

        public Criteria andPortNameIsNull() {
            addCriterion("PORT_NAME is null");
            return this;
        }

        public Criteria andPortNameIsNotNull() {
            addCriterion("PORT_NAME is not null");
            return this;
        }

        public Criteria andPortNameEqualTo(String value) {
            addCriterion("PORT_NAME =", value, "portName");
            return this;
        }

        public Criteria andPortNameNotEqualTo(String value) {
            addCriterion("PORT_NAME <>", value, "portName");
            return this;
        }

        public Criteria andPortNameGreaterThan(String value) {
            addCriterion("PORT_NAME >", value, "portName");
            return this;
        }

        public Criteria andPortNameGreaterThanOrEqualTo(String value) {
            addCriterion("PORT_NAME >=", value, "portName");
            return this;
        }

        public Criteria andPortNameLessThan(String value) {
            addCriterion("PORT_NAME <", value, "portName");
            return this;
        }

        public Criteria andPortNameLessThanOrEqualTo(String value) {
            addCriterion("PORT_NAME <=", value, "portName");
            return this;
        }

        public Criteria andPortNameLike(String value) {
            addCriterion("PORT_NAME like", value, "portName");
            return this;
        }

        public Criteria andPortNameNotLike(String value) {
            addCriterion("PORT_NAME not like", value, "portName");
            return this;
        }

        public Criteria andPortNameIn(List<String> values) {
            addCriterion("PORT_NAME in", values, "portName");
            return this;
        }

        public Criteria andPortNameNotIn(List<String> values) {
            addCriterion("PORT_NAME not in", values, "portName");
            return this;
        }

        public Criteria andPortNameBetween(String value1, String value2) {
            addCriterion("PORT_NAME between", value1, value2, "portName");
            return this;
        }

        public Criteria andPortNameNotBetween(String value1, String value2) {
            addCriterion("PORT_NAME not between", value1, value2, "portName");
            return this;
        }

        public Criteria andNameSpaceIsNull() {
            addCriterion("NAME_SPACE is null");
            return this;
        }

        public Criteria andNameSpaceIsNotNull() {
            addCriterion("NAME_SPACE is not null");
            return this;
        }

        public Criteria andNameSpaceEqualTo(String value) {
            addCriterion("NAME_SPACE =", value, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceNotEqualTo(String value) {
            addCriterion("NAME_SPACE <>", value, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceGreaterThan(String value) {
            addCriterion("NAME_SPACE >", value, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_SPACE >=", value, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceLessThan(String value) {
            addCriterion("NAME_SPACE <", value, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceLessThanOrEqualTo(String value) {
            addCriterion("NAME_SPACE <=", value, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceLike(String value) {
            addCriterion("NAME_SPACE like", value, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceNotLike(String value) {
            addCriterion("NAME_SPACE not like", value, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceIn(List<String> values) {
            addCriterion("NAME_SPACE in", values, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceNotIn(List<String> values) {
            addCriterion("NAME_SPACE not in", values, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceBetween(String value1, String value2) {
            addCriterion("NAME_SPACE between", value1, value2, "nameSpace");
            return this;
        }

        public Criteria andNameSpaceNotBetween(String value1, String value2) {
            addCriterion("NAME_SPACE not between", value1, value2, "nameSpace");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_ON is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_ON is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_ON =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_ON <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_ON >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_ON <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_ON <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_ON in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_ON not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_ON not between", value1, value2, "createDate");
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
    }
}