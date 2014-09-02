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

public class SysAttachmentExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysAttachmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysAttachmentExample(SysAttachmentExample example) {
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

        public Criteria andAttachmentIdIsNull() {
            addCriterion("Attachment_Id is null");
            return this;
        }

        public Criteria andAttachmentIdIsNotNull() {
            addCriterion("Attachment_Id is not null");
            return this;
        }

        public Criteria andAttachmentIdEqualTo(String value) {
            addCriterion("Attachment_Id =", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdNotEqualTo(String value) {
            addCriterion("Attachment_Id <>", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdGreaterThan(String value) {
            addCriterion("Attachment_Id >", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("Attachment_Id >=", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdLessThan(String value) {
            addCriterion("Attachment_Id <", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdLessThanOrEqualTo(String value) {
            addCriterion("Attachment_Id <=", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdLike(String value) {
            addCriterion("Attachment_Id like", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdNotLike(String value) {
            addCriterion("Attachment_Id not like", value, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdIn(List<String> values) {
            addCriterion("Attachment_Id in", values, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdNotIn(List<String> values) {
            addCriterion("Attachment_Id not in", values, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdBetween(String value1, String value2) {
            addCriterion("Attachment_Id between", value1, value2, "attachmentId");
            return this;
        }

        public Criteria andAttachmentIdNotBetween(String value1, String value2) {
            addCriterion("Attachment_Id not between", value1, value2, "attachmentId");
            return this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("DISPLAY_NAME is null");
            return this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("DISPLAY_NAME is not null");
            return this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("DISPLAY_NAME =", value, "displayName");
            return this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("DISPLAY_NAME <>", value, "displayName");
            return this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("DISPLAY_NAME >", value, "displayName");
            return this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAY_NAME >=", value, "displayName");
            return this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("DISPLAY_NAME <", value, "displayName");
            return this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("DISPLAY_NAME <=", value, "displayName");
            return this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("DISPLAY_NAME like", value, "displayName");
            return this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("DISPLAY_NAME not like", value, "displayName");
            return this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("DISPLAY_NAME in", values, "displayName");
            return this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("DISPLAY_NAME not in", values, "displayName");
            return this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("DISPLAY_NAME between", value1, value2, "displayName");
            return this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("DISPLAY_NAME not between", value1, value2, "displayName");
            return this;
        }

        public Criteria andStorePathIsNull() {
            addCriterion("store_path is null");
            return this;
        }

        public Criteria andStorePathIsNotNull() {
            addCriterion("store_path is not null");
            return this;
        }

        public Criteria andStorePathEqualTo(String value) {
            addCriterion("store_path =", value, "storePath");
            return this;
        }

        public Criteria andStorePathNotEqualTo(String value) {
            addCriterion("store_path <>", value, "storePath");
            return this;
        }

        public Criteria andStorePathGreaterThan(String value) {
            addCriterion("store_path >", value, "storePath");
            return this;
        }

        public Criteria andStorePathGreaterThanOrEqualTo(String value) {
            addCriterion("store_path >=", value, "storePath");
            return this;
        }

        public Criteria andStorePathLessThan(String value) {
            addCriterion("store_path <", value, "storePath");
            return this;
        }

        public Criteria andStorePathLessThanOrEqualTo(String value) {
            addCriterion("store_path <=", value, "storePath");
            return this;
        }

        public Criteria andStorePathLike(String value) {
            addCriterion("store_path like", value, "storePath");
            return this;
        }

        public Criteria andStorePathNotLike(String value) {
            addCriterion("store_path not like", value, "storePath");
            return this;
        }

        public Criteria andStorePathIn(List<String> values) {
            addCriterion("store_path in", values, "storePath");
            return this;
        }

        public Criteria andStorePathNotIn(List<String> values) {
            addCriterion("store_path not in", values, "storePath");
            return this;
        }

        public Criteria andStorePathBetween(String value1, String value2) {
            addCriterion("store_path between", value1, value2, "storePath");
            return this;
        }

        public Criteria andStorePathNotBetween(String value1, String value2) {
            addCriterion("store_path not between", value1, value2, "storePath");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("Create_Date is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("Create_Date is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("Create_Date =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Create_Date <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Create_Date >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Create_Date >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("Create_Date <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Create_Date <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("Create_Date in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Create_Date not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Create_Date between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Create_Date not between", value1, value2, "createDate");
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

        public Criteria andBusiIdIsNull() {
            addCriterion("BUSI_ID is null");
            return this;
        }

        public Criteria andBusiIdIsNotNull() {
            addCriterion("BUSI_ID is not null");
            return this;
        }

        public Criteria andBusiIdEqualTo(String value) {
            addCriterion("BUSI_ID =", value, "busiId");
            return this;
        }

        public Criteria andBusiIdNotEqualTo(String value) {
            addCriterion("BUSI_ID <>", value, "busiId");
            return this;
        }

        public Criteria andBusiIdGreaterThan(String value) {
            addCriterion("BUSI_ID >", value, "busiId");
            return this;
        }

        public Criteria andBusiIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_ID >=", value, "busiId");
            return this;
        }

        public Criteria andBusiIdLessThan(String value) {
            addCriterion("BUSI_ID <", value, "busiId");
            return this;
        }

        public Criteria andBusiIdLessThanOrEqualTo(String value) {
            addCriterion("BUSI_ID <=", value, "busiId");
            return this;
        }

        public Criteria andBusiIdLike(String value) {
            addCriterion("BUSI_ID like", value, "busiId");
            return this;
        }

        public Criteria andBusiIdNotLike(String value) {
            addCriterion("BUSI_ID not like", value, "busiId");
            return this;
        }

        public Criteria andBusiIdIn(List<String> values) {
            addCriterion("BUSI_ID in", values, "busiId");
            return this;
        }

        public Criteria andBusiIdNotIn(List<String> values) {
            addCriterion("BUSI_ID not in", values, "busiId");
            return this;
        }

        public Criteria andBusiIdBetween(String value1, String value2) {
            addCriterion("BUSI_ID between", value1, value2, "busiId");
            return this;
        }

        public Criteria andBusiIdNotBetween(String value1, String value2) {
            addCriterion("BUSI_ID not between", value1, value2, "busiId");
            return this;
        }

        public Criteria andBigTypeIsNull() {
            addCriterion("big_type is null");
            return this;
        }

        public Criteria andBigTypeIsNotNull() {
            addCriterion("big_type is not null");
            return this;
        }

        public Criteria andBigTypeEqualTo(String value) {
            addCriterion("big_type =", value, "bigType");
            return this;
        }

        public Criteria andBigTypeNotEqualTo(String value) {
            addCriterion("big_type <>", value, "bigType");
            return this;
        }

        public Criteria andBigTypeGreaterThan(String value) {
            addCriterion("big_type >", value, "bigType");
            return this;
        }

        public Criteria andBigTypeGreaterThanOrEqualTo(String value) {
            addCriterion("big_type >=", value, "bigType");
            return this;
        }

        public Criteria andBigTypeLessThan(String value) {
            addCriterion("big_type <", value, "bigType");
            return this;
        }

        public Criteria andBigTypeLessThanOrEqualTo(String value) {
            addCriterion("big_type <=", value, "bigType");
            return this;
        }

        public Criteria andBigTypeLike(String value) {
            addCriterion("big_type like", value, "bigType");
            return this;
        }

        public Criteria andBigTypeNotLike(String value) {
            addCriterion("big_type not like", value, "bigType");
            return this;
        }

        public Criteria andBigTypeIn(List<String> values) {
            addCriterion("big_type in", values, "bigType");
            return this;
        }

        public Criteria andBigTypeNotIn(List<String> values) {
            addCriterion("big_type not in", values, "bigType");
            return this;
        }

        public Criteria andBigTypeBetween(String value1, String value2) {
            addCriterion("big_type between", value1, value2, "bigType");
            return this;
        }

        public Criteria andBigTypeNotBetween(String value1, String value2) {
            addCriterion("big_type not between", value1, value2, "bigType");
            return this;
        }

        public Criteria andSmallTypeIsNull() {
            addCriterion("small_type is null");
            return this;
        }

        public Criteria andSmallTypeIsNotNull() {
            addCriterion("small_type is not null");
            return this;
        }

        public Criteria andSmallTypeEqualTo(String value) {
            addCriterion("small_type =", value, "smallType");
            return this;
        }

        public Criteria andSmallTypeNotEqualTo(String value) {
            addCriterion("small_type <>", value, "smallType");
            return this;
        }

        public Criteria andSmallTypeGreaterThan(String value) {
            addCriterion("small_type >", value, "smallType");
            return this;
        }

        public Criteria andSmallTypeGreaterThanOrEqualTo(String value) {
            addCriterion("small_type >=", value, "smallType");
            return this;
        }

        public Criteria andSmallTypeLessThan(String value) {
            addCriterion("small_type <", value, "smallType");
            return this;
        }

        public Criteria andSmallTypeLessThanOrEqualTo(String value) {
            addCriterion("small_type <=", value, "smallType");
            return this;
        }

        public Criteria andSmallTypeLike(String value) {
            addCriterion("small_type like", value, "smallType");
            return this;
        }

        public Criteria andSmallTypeNotLike(String value) {
            addCriterion("small_type not like", value, "smallType");
            return this;
        }

        public Criteria andSmallTypeIn(List<String> values) {
            addCriterion("small_type in", values, "smallType");
            return this;
        }

        public Criteria andSmallTypeNotIn(List<String> values) {
            addCriterion("small_type not in", values, "smallType");
            return this;
        }

        public Criteria andSmallTypeBetween(String value1, String value2) {
            addCriterion("small_type between", value1, value2, "smallType");
            return this;
        }

        public Criteria andSmallTypeNotBetween(String value1, String value2) {
            addCriterion("small_type not between", value1, value2, "smallType");
            return this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterionForJDBCDate("upload_time =", value, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("upload_time <>", value, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("upload_time >", value, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upload_time >=", value, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterionForJDBCDate("upload_time <", value, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upload_time <=", value, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterionForJDBCDate("upload_time in", values, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("upload_time not in", values, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upload_time between", value1, value2, "uploadTime");
            return this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upload_time not between", value1, value2, "uploadTime");
            return this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("file_size =", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("file_size <>", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("file_size >", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_size >=", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("file_size <", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("file_size <=", value, "fileSize");
            return this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("file_size in", values, "fileSize");
            return this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("file_size not in", values, "fileSize");
            return this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return this;
        }

        public Criteria andActionIdIsNull() {
            addCriterion("action_id is null");
            return this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("action_id is not null");
            return this;
        }

        public Criteria andActionIdEqualTo(String value) {
            addCriterion("action_id =", value, "actionId");
            return this;
        }

        public Criteria andActionIdNotEqualTo(String value) {
            addCriterion("action_id <>", value, "actionId");
            return this;
        }

        public Criteria andActionIdGreaterThan(String value) {
            addCriterion("action_id >", value, "actionId");
            return this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(String value) {
            addCriterion("action_id >=", value, "actionId");
            return this;
        }

        public Criteria andActionIdLessThan(String value) {
            addCriterion("action_id <", value, "actionId");
            return this;
        }

        public Criteria andActionIdLessThanOrEqualTo(String value) {
            addCriterion("action_id <=", value, "actionId");
            return this;
        }

        public Criteria andActionIdLike(String value) {
            addCriterion("action_id like", value, "actionId");
            return this;
        }

        public Criteria andActionIdNotLike(String value) {
            addCriterion("action_id not like", value, "actionId");
            return this;
        }

        public Criteria andActionIdIn(List<String> values) {
            addCriterion("action_id in", values, "actionId");
            return this;
        }

        public Criteria andActionIdNotIn(List<String> values) {
            addCriterion("action_id not in", values, "actionId");
            return this;
        }

        public Criteria andActionIdBetween(String value1, String value2) {
            addCriterion("action_id between", value1, value2, "actionId");
            return this;
        }

        public Criteria andActionIdNotBetween(String value1, String value2) {
            addCriterion("action_id not between", value1, value2, "actionId");
            return this;
        }
    }
}