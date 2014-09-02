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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SysUserExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysUserExample(SysUserExample example) {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("User_Id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("User_Id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("User_Id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("User_Id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("User_Id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("User_Id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("User_Id like", value, "userId");
            return this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("User_Id not like", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("User_Id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("User_Id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
            return this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("Login_Name is null");
            return this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("Login_Name is not null");
            return this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("Login_Name =", value, "loginName");
            return this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("Login_Name <>", value, "loginName");
            return this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("Login_Name >", value, "loginName");
            return this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("Login_Name >=", value, "loginName");
            return this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("Login_Name <", value, "loginName");
            return this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("Login_Name <=", value, "loginName");
            return this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("Login_Name like", value, "loginName");
            return this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("Login_Name not like", value, "loginName");
            return this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("Login_Name in", values, "loginName");
            return this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("Login_Name not in", values, "loginName");
            return this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("Login_Name between", value1, value2, "loginName");
            return this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("Login_Name not between", value1, value2, "loginName");
            return this;
        }

        public Criteria andLoginPasswordIsNull() {
            addCriterion("login_Password is null");
            return this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("login_Password is not null");
            return this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("login_Password =", value, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("login_Password <>", value, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("login_Password >", value, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("login_Password >=", value, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("login_Password <", value, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("login_Password <=", value, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("login_Password like", value, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("login_Password not like", value, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("login_Password in", values, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("login_Password not in", values, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("login_Password between", value1, value2, "loginPassword");
            return this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("login_Password not between", value1, value2, "loginPassword");
            return this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("User_Name is null");
            return this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_Name is not null");
            return this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_Name =", value, "userName");
            return this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_Name >", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_Name <", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "userName");
            return this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_Name like", value, "userName");
            return this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_Name not like", value, "userName");
            return this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_Name in", values, "userName");
            return this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "userName");
            return this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "userName");
            return this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("Mobile_Phone is null");
            return this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("Mobile_Phone is not null");
            return this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("Mobile_Phone =", value, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("Mobile_Phone <>", value, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("Mobile_Phone >", value, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile_Phone >=", value, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("Mobile_Phone <", value, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("Mobile_Phone <=", value, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("Mobile_Phone like", value, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("Mobile_Phone not like", value, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("Mobile_Phone in", values, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("Mobile_Phone not in", values, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("Mobile_Phone between", value1, value2, "mobilePhone");
            return this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("Mobile_Phone not between", value1, value2, "mobilePhone");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("Create_date is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("Create_date is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("Create_date =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Create_date <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Create_date >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Create_date >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("Create_date <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Create_date <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("Create_date in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Create_date not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Create_date between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Create_date not between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("Creator_Id is null");
            return this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("Creator_Id is not null");
            return this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("Creator_Id =", value, "creatorId");
            return this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("Creator_Id <>", value, "creatorId");
            return this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("Creator_Id >", value, "creatorId");
            return this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("Creator_Id >=", value, "creatorId");
            return this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("Creator_Id <", value, "creatorId");
            return this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("Creator_Id <=", value, "creatorId");
            return this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("Creator_Id like", value, "creatorId");
            return this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("Creator_Id not like", value, "creatorId");
            return this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("Creator_Id in", values, "creatorId");
            return this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("Creator_Id not in", values, "creatorId");
            return this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("Creator_Id between", value1, value2, "creatorId");
            return this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("Creator_Id not between", value1, value2, "creatorId");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return this;
        }
    }
}