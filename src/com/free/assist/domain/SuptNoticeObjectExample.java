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

public class SuptNoticeObjectExample extends BaseExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptNoticeObjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptNoticeObjectExample(SuptNoticeObjectExample example) {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("NOTICE_ID is null");
            return this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("NOTICE_ID is not null");
            return this;
        }

        public Criteria andNoticeIdEqualTo(String value) {
            addCriterion("NOTICE_ID =", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdNotEqualTo(String value) {
            addCriterion("NOTICE_ID <>", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdGreaterThan(String value) {
            addCriterion("NOTICE_ID >", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_ID >=", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdLessThan(String value) {
            addCriterion("NOTICE_ID <", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_ID <=", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdLike(String value) {
            addCriterion("NOTICE_ID like", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdNotLike(String value) {
            addCriterion("NOTICE_ID not like", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdIn(List<String> values) {
            addCriterion("NOTICE_ID in", values, "noticeId");
            return this;
        }

        public Criteria andNoticeIdNotIn(List<String> values) {
            addCriterion("NOTICE_ID not in", values, "noticeId");
            return this;
        }

        public Criteria andNoticeIdBetween(String value1, String value2) {
            addCriterion("NOTICE_ID between", value1, value2, "noticeId");
            return this;
        }

        public Criteria andNoticeIdNotBetween(String value1, String value2) {
            addCriterion("NOTICE_ID not between", value1, value2, "noticeId");
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

        public Criteria andObjectTypeIsNull() {
            addCriterion("OBJECT_TYPE is null");
            return this;
        }

        public Criteria andObjectTypeIsNotNull() {
            addCriterion("OBJECT_TYPE is not null");
            return this;
        }

        public Criteria andObjectTypeEqualTo(String value) {
            addCriterion("OBJECT_TYPE =", value, "objectType");
            return this;
        }

        public Criteria andObjectTypeNotEqualTo(String value) {
            addCriterion("OBJECT_TYPE <>", value, "objectType");
            return this;
        }

        public Criteria andObjectTypeGreaterThan(String value) {
            addCriterion("OBJECT_TYPE >", value, "objectType");
            return this;
        }

        public Criteria andObjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_TYPE >=", value, "objectType");
            return this;
        }

        public Criteria andObjectTypeLessThan(String value) {
            addCriterion("OBJECT_TYPE <", value, "objectType");
            return this;
        }

        public Criteria andObjectTypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_TYPE <=", value, "objectType");
            return this;
        }

        public Criteria andObjectTypeLike(String value) {
            addCriterion("OBJECT_TYPE like", value, "objectType");
            return this;
        }

        public Criteria andObjectTypeNotLike(String value) {
            addCriterion("OBJECT_TYPE not like", value, "objectType");
            return this;
        }

        public Criteria andObjectTypeIn(List<String> values) {
            addCriterion("OBJECT_TYPE in", values, "objectType");
            return this;
        }

        public Criteria andObjectTypeNotIn(List<String> values) {
            addCriterion("OBJECT_TYPE not in", values, "objectType");
            return this;
        }

        public Criteria andObjectTypeBetween(String value1, String value2) {
            addCriterion("OBJECT_TYPE between", value1, value2, "objectType");
            return this;
        }

        public Criteria andObjectTypeNotBetween(String value1, String value2) {
            addCriterion("OBJECT_TYPE not between", value1, value2, "objectType");
            return this;
        }

        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_ID is null");
            return this;
        }

        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_ID is not null");
            return this;
        }

        public Criteria andObjectIdEqualTo(String value) {
            addCriterion("OBJECT_ID =", value, "objectId");
            return this;
        }

        public Criteria andObjectIdNotEqualTo(String value) {
            addCriterion("OBJECT_ID <>", value, "objectId");
            return this;
        }

        public Criteria andObjectIdGreaterThan(String value) {
            addCriterion("OBJECT_ID >", value, "objectId");
            return this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_ID >=", value, "objectId");
            return this;
        }

        public Criteria andObjectIdLessThan(String value) {
            addCriterion("OBJECT_ID <", value, "objectId");
            return this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_ID <=", value, "objectId");
            return this;
        }

        public Criteria andObjectIdLike(String value) {
            addCriterion("OBJECT_ID like", value, "objectId");
            return this;
        }

        public Criteria andObjectIdNotLike(String value) {
            addCriterion("OBJECT_ID not like", value, "objectId");
            return this;
        }

        public Criteria andObjectIdIn(List<String> values) {
            addCriterion("OBJECT_ID in", values, "objectId");
            return this;
        }

        public Criteria andObjectIdNotIn(List<String> values) {
            addCriterion("OBJECT_ID not in", values, "objectId");
            return this;
        }

        public Criteria andObjectIdBetween(String value1, String value2) {
            addCriterion("OBJECT_ID between", value1, value2, "objectId");
            return this;
        }

        public Criteria andObjectIdNotBetween(String value1, String value2) {
            addCriterion("OBJECT_ID not between", value1, value2, "objectId");
            return this;
        }

        public Criteria andNoticeContentIsNull() {
            addCriterion("NOTICE_CONTENT is null");
            return this;
        }

        public Criteria andNoticeContentIsNotNull() {
            addCriterion("NOTICE_CONTENT is not null");
            return this;
        }

        public Criteria andNoticeContentEqualTo(String value) {
            addCriterion("NOTICE_CONTENT =", value, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentNotEqualTo(String value) {
            addCriterion("NOTICE_CONTENT <>", value, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentGreaterThan(String value) {
            addCriterion("NOTICE_CONTENT >", value, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_CONTENT >=", value, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentLessThan(String value) {
            addCriterion("NOTICE_CONTENT <", value, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_CONTENT <=", value, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentLike(String value) {
            addCriterion("NOTICE_CONTENT like", value, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentNotLike(String value) {
            addCriterion("NOTICE_CONTENT not like", value, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentIn(List<String> values) {
            addCriterion("NOTICE_CONTENT in", values, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentNotIn(List<String> values) {
            addCriterion("NOTICE_CONTENT not in", values, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentBetween(String value1, String value2) {
            addCriterion("NOTICE_CONTENT between", value1, value2, "noticeContent");
            return this;
        }

        public Criteria andNoticeContentNotBetween(String value1, String value2) {
            addCriterion("NOTICE_CONTENT not between", value1, value2, "noticeContent");
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

        public Criteria andReceiverIsNull() {
            addCriterion("RECEIVER is null");
            return this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("RECEIVER is not null");
            return this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("RECEIVER =", value, "receiver");
            return this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("RECEIVER <>", value, "receiver");
            return this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("RECEIVER >", value, "receiver");
            return this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER >=", value, "receiver");
            return this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("RECEIVER <", value, "receiver");
            return this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER <=", value, "receiver");
            return this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("RECEIVER like", value, "receiver");
            return this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("RECEIVER not like", value, "receiver");
            return this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("RECEIVER in", values, "receiver");
            return this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("RECEIVER not in", values, "receiver");
            return this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("RECEIVER between", value1, value2, "receiver");
            return this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("RECEIVER not between", value1, value2, "receiver");
            return this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("RECEIVE_TIME is null");
            return this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("RECEIVE_TIME is not null");
            return this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("RECEIVE_TIME =", value, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <>", value, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("RECEIVE_TIME >", value, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME >=", value, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("RECEIVE_TIME <", value, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_TIME <=", value, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("RECEIVE_TIME in", values, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("RECEIVE_TIME not in", values, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME between", value1, value2, "receiveTime");
            return this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_TIME not between", value1, value2, "receiveTime");
            return this;
        }

        public Criteria andReplyTimesIsNull() {
            addCriterion("REPLY_TIMES is null");
            return this;
        }

        public Criteria andReplyTimesIsNotNull() {
            addCriterion("REPLY_TIMES is not null");
            return this;
        }

        public Criteria andReplyTimesEqualTo(Short value) {
            addCriterion("REPLY_TIMES =", value, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesNotEqualTo(Short value) {
            addCriterion("REPLY_TIMES <>", value, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesGreaterThan(Short value) {
            addCriterion("REPLY_TIMES >", value, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("REPLY_TIMES >=", value, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesLessThan(Short value) {
            addCriterion("REPLY_TIMES <", value, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesLessThanOrEqualTo(Short value) {
            addCriterion("REPLY_TIMES <=", value, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesIn(List<Short> values) {
            addCriterion("REPLY_TIMES in", values, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesNotIn(List<Short> values) {
            addCriterion("REPLY_TIMES not in", values, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesBetween(Short value1, Short value2) {
            addCriterion("REPLY_TIMES between", value1, value2, "replyTimes");
            return this;
        }

        public Criteria andReplyTimesNotBetween(Short value1, Short value2) {
            addCriterion("REPLY_TIMES not between", value1, value2, "replyTimes");
            return this;
        }
    }
}