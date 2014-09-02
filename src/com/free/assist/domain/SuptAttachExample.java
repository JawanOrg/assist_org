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

public class SuptAttachExample  extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptAttachExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptAttachExample(SuptAttachExample example) {
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

        public Criteria andAttachIdIsNull() {
            addCriterion("ATTACH_ID is null");
            return this;
        }

        public Criteria andAttachIdIsNotNull() {
            addCriterion("ATTACH_ID is not null");
            return this;
        }

        public Criteria andAttachIdEqualTo(String value) {
            addCriterion("ATTACH_ID =", value, "attachId");
            return this;
        }

        public Criteria andAttachIdNotEqualTo(String value) {
            addCriterion("ATTACH_ID <>", value, "attachId");
            return this;
        }

        public Criteria andAttachIdGreaterThan(String value) {
            addCriterion("ATTACH_ID >", value, "attachId");
            return this;
        }

        public Criteria andAttachIdGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_ID >=", value, "attachId");
            return this;
        }

        public Criteria andAttachIdLessThan(String value) {
            addCriterion("ATTACH_ID <", value, "attachId");
            return this;
        }

        public Criteria andAttachIdLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_ID <=", value, "attachId");
            return this;
        }

        public Criteria andAttachIdLike(String value) {
            addCriterion("ATTACH_ID like", value, "attachId");
            return this;
        }

        public Criteria andAttachIdNotLike(String value) {
            addCriterion("ATTACH_ID not like", value, "attachId");
            return this;
        }

        public Criteria andAttachIdIn(List<String> values) {
            addCriterion("ATTACH_ID in", values, "attachId");
            return this;
        }

        public Criteria andAttachIdNotIn(List<String> values) {
            addCriterion("ATTACH_ID not in", values, "attachId");
            return this;
        }

        public Criteria andAttachIdBetween(String value1, String value2) {
            addCriterion("ATTACH_ID between", value1, value2, "attachId");
            return this;
        }

        public Criteria andAttachIdNotBetween(String value1, String value2) {
            addCriterion("ATTACH_ID not between", value1, value2, "attachId");
            return this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return this;
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

        public Criteria andActionIdIsNull() {
            addCriterion("ACTION_ID is null");
            return this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("ACTION_ID is not null");
            return this;
        }

        public Criteria andActionIdEqualTo(String value) {
            addCriterion("ACTION_ID =", value, "actionId");
            return this;
        }

        public Criteria andActionIdNotEqualTo(String value) {
            addCriterion("ACTION_ID <>", value, "actionId");
            return this;
        }

        public Criteria andActionIdGreaterThan(String value) {
            addCriterion("ACTION_ID >", value, "actionId");
            return this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_ID >=", value, "actionId");
            return this;
        }

        public Criteria andActionIdLessThan(String value) {
            addCriterion("ACTION_ID <", value, "actionId");
            return this;
        }

        public Criteria andActionIdLessThanOrEqualTo(String value) {
            addCriterion("ACTION_ID <=", value, "actionId");
            return this;
        }

        public Criteria andActionIdLike(String value) {
            addCriterion("ACTION_ID like", value, "actionId");
            return this;
        }

        public Criteria andActionIdNotLike(String value) {
            addCriterion("ACTION_ID not like", value, "actionId");
            return this;
        }

        public Criteria andActionIdIn(List<String> values) {
            addCriterion("ACTION_ID in", values, "actionId");
            return this;
        }

        public Criteria andActionIdNotIn(List<String> values) {
            addCriterion("ACTION_ID not in", values, "actionId");
            return this;
        }

        public Criteria andActionIdBetween(String value1, String value2) {
            addCriterion("ACTION_ID between", value1, value2, "actionId");
            return this;
        }

        public Criteria andActionIdNotBetween(String value1, String value2) {
            addCriterion("ACTION_ID not between", value1, value2, "actionId");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("IS_DELETE like", value, "isDelete");
            return this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("IS_DELETE not like", value, "isDelete");
            return this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return this;
        }

        public Criteria andExtendNameIsNull() {
            addCriterion("EXTEND_NAME is null");
            return this;
        }

        public Criteria andExtendNameIsNotNull() {
            addCriterion("EXTEND_NAME is not null");
            return this;
        }

        public Criteria andExtendNameEqualTo(String value) {
            addCriterion("EXTEND_NAME =", value, "extendName");
            return this;
        }

        public Criteria andExtendNameNotEqualTo(String value) {
            addCriterion("EXTEND_NAME <>", value, "extendName");
            return this;
        }

        public Criteria andExtendNameGreaterThan(String value) {
            addCriterion("EXTEND_NAME >", value, "extendName");
            return this;
        }

        public Criteria andExtendNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_NAME >=", value, "extendName");
            return this;
        }

        public Criteria andExtendNameLessThan(String value) {
            addCriterion("EXTEND_NAME <", value, "extendName");
            return this;
        }

        public Criteria andExtendNameLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_NAME <=", value, "extendName");
            return this;
        }

        public Criteria andExtendNameLike(String value) {
            addCriterion("EXTEND_NAME like", value, "extendName");
            return this;
        }

        public Criteria andExtendNameNotLike(String value) {
            addCriterion("EXTEND_NAME not like", value, "extendName");
            return this;
        }

        public Criteria andExtendNameIn(List<String> values) {
            addCriterion("EXTEND_NAME in", values, "extendName");
            return this;
        }

        public Criteria andExtendNameNotIn(List<String> values) {
            addCriterion("EXTEND_NAME not in", values, "extendName");
            return this;
        }

        public Criteria andExtendNameBetween(String value1, String value2) {
            addCriterion("EXTEND_NAME between", value1, value2, "extendName");
            return this;
        }

        public Criteria andExtendNameNotBetween(String value1, String value2) {
            addCriterion("EXTEND_NAME not between", value1, value2, "extendName");
            return this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("FILE_SIZE is null");
            return this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("FILE_SIZE is not null");
            return this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("FILE_SIZE =", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("FILE_SIZE <>", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("FILE_SIZE >", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILE_SIZE >=", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("FILE_SIZE <", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("FILE_SIZE <=", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("FILE_SIZE in", values, "fileSize");
            return this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("FILE_SIZE not in", values, "fileSize");
            return this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("FILE_SIZE between", value1, value2, "fileSize");
            return this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("FILE_SIZE not between", value1, value2, "fileSize");
            return this;
        }

        public Criteria andFtpPathIsNull() {
            addCriterion("FTP_PATH is null");
            return this;
        }

        public Criteria andFtpPathIsNotNull() {
            addCriterion("FTP_PATH is not null");
            return this;
        }

        public Criteria andFtpPathEqualTo(String value) {
            addCriterion("FTP_PATH =", value, "ftpPath");
            return this;
        }

        public Criteria andFtpPathNotEqualTo(String value) {
            addCriterion("FTP_PATH <>", value, "ftpPath");
            return this;
        }

        public Criteria andFtpPathGreaterThan(String value) {
            addCriterion("FTP_PATH >", value, "ftpPath");
            return this;
        }

        public Criteria andFtpPathGreaterThanOrEqualTo(String value) {
            addCriterion("FTP_PATH >=", value, "ftpPath");
            return this;
        }

        public Criteria andFtpPathLessThan(String value) {
            addCriterion("FTP_PATH <", value, "ftpPath");
            return this;
        }

        public Criteria andFtpPathLessThanOrEqualTo(String value) {
            addCriterion("FTP_PATH <=", value, "ftpPath");
            return this;
        }

        public Criteria andFtpPathLike(String value) {
            addCriterion("FTP_PATH like", value, "ftpPath");
            return this;
        }

        public Criteria andFtpPathNotLike(String value) {
            addCriterion("FTP_PATH not like", value, "ftpPath");
            return this;
        }

        public Criteria andFtpPathIn(List<String> values) {
            addCriterion("FTP_PATH in", values, "ftpPath");
            return this;
        }

        public Criteria andFtpPathNotIn(List<String> values) {
            addCriterion("FTP_PATH not in", values, "ftpPath");
            return this;
        }

        public Criteria andFtpPathBetween(String value1, String value2) {
            addCriterion("FTP_PATH between", value1, value2, "ftpPath");
            return this;
        }

        public Criteria andFtpPathNotBetween(String value1, String value2) {
            addCriterion("FTP_PATH not between", value1, value2, "ftpPath");
            return this;
        }

        public Criteria andShareTypeViewIsNull() {
            addCriterion("SHARE_TYPE_VIEW is null");
            return this;
        }

        public Criteria andShareTypeViewIsNotNull() {
            addCriterion("SHARE_TYPE_VIEW is not null");
            return this;
        }

        public Criteria andShareTypeViewEqualTo(String value) {
            addCriterion("SHARE_TYPE_VIEW =", value, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewNotEqualTo(String value) {
            addCriterion("SHARE_TYPE_VIEW <>", value, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewGreaterThan(String value) {
            addCriterion("SHARE_TYPE_VIEW >", value, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_TYPE_VIEW >=", value, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewLessThan(String value) {
            addCriterion("SHARE_TYPE_VIEW <", value, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewLessThanOrEqualTo(String value) {
            addCriterion("SHARE_TYPE_VIEW <=", value, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewLike(String value) {
            addCriterion("SHARE_TYPE_VIEW like", value, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewNotLike(String value) {
            addCriterion("SHARE_TYPE_VIEW not like", value, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewIn(List<String> values) {
            addCriterion("SHARE_TYPE_VIEW in", values, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewNotIn(List<String> values) {
            addCriterion("SHARE_TYPE_VIEW not in", values, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewBetween(String value1, String value2) {
            addCriterion("SHARE_TYPE_VIEW between", value1, value2, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeViewNotBetween(String value1, String value2) {
            addCriterion("SHARE_TYPE_VIEW not between", value1, value2, "shareTypeView");
            return this;
        }

        public Criteria andShareTypeWriteIsNull() {
            addCriterion("SHARE_TYPE_WRITE is null");
            return this;
        }

        public Criteria andShareTypeWriteIsNotNull() {
            addCriterion("SHARE_TYPE_WRITE is not null");
            return this;
        }

        public Criteria andShareTypeWriteEqualTo(String value) {
            addCriterion("SHARE_TYPE_WRITE =", value, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteNotEqualTo(String value) {
            addCriterion("SHARE_TYPE_WRITE <>", value, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteGreaterThan(String value) {
            addCriterion("SHARE_TYPE_WRITE >", value, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_TYPE_WRITE >=", value, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteLessThan(String value) {
            addCriterion("SHARE_TYPE_WRITE <", value, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteLessThanOrEqualTo(String value) {
            addCriterion("SHARE_TYPE_WRITE <=", value, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteLike(String value) {
            addCriterion("SHARE_TYPE_WRITE like", value, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteNotLike(String value) {
            addCriterion("SHARE_TYPE_WRITE not like", value, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteIn(List<String> values) {
            addCriterion("SHARE_TYPE_WRITE in", values, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteNotIn(List<String> values) {
            addCriterion("SHARE_TYPE_WRITE not in", values, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteBetween(String value1, String value2) {
            addCriterion("SHARE_TYPE_WRITE between", value1, value2, "shareTypeWrite");
            return this;
        }

        public Criteria andShareTypeWriteNotBetween(String value1, String value2) {
            addCriterion("SHARE_TYPE_WRITE not between", value1, value2, "shareTypeWrite");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return this;
        }
    }
}