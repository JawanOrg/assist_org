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

public class SuptTaskExample  extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SuptTaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SuptTaskExample(SuptTaskExample example) {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
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

        public Criteria andTaskSnIsNull() {
            addCriterion("TASK_SN is null");
            return this;
        }

        public Criteria andTaskSnIsNotNull() {
            addCriterion("TASK_SN is not null");
            return this;
        }

        public Criteria andTaskSnEqualTo(String value) {
            addCriterion("TASK_SN =", value, "taskSn");
            return this;
        }

        public Criteria andTaskSnNotEqualTo(String value) {
            addCriterion("TASK_SN <>", value, "taskSn");
            return this;
        }

        public Criteria andTaskSnGreaterThan(String value) {
            addCriterion("TASK_SN >", value, "taskSn");
            return this;
        }

        public Criteria andTaskSnGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_SN >=", value, "taskSn");
            return this;
        }

        public Criteria andTaskSnLessThan(String value) {
            addCriterion("TASK_SN <", value, "taskSn");
            return this;
        }

        public Criteria andTaskSnLessThanOrEqualTo(String value) {
            addCriterion("TASK_SN <=", value, "taskSn");
            return this;
        }

        public Criteria andTaskSnLike(String value) {
            addCriterion("TASK_SN like", value, "taskSn");
            return this;
        }

        public Criteria andTaskSnNotLike(String value) {
            addCriterion("TASK_SN not like", value, "taskSn");
            return this;
        }

        public Criteria andTaskSnIn(List<String> values) {
            addCriterion("TASK_SN in", values, "taskSn");
            return this;
        }

        public Criteria andTaskSnNotIn(List<String> values) {
            addCriterion("TASK_SN not in", values, "taskSn");
            return this;
        }

        public Criteria andTaskSnBetween(String value1, String value2) {
            addCriterion("TASK_SN between", value1, value2, "taskSn");
            return this;
        }

        public Criteria andTaskSnNotBetween(String value1, String value2) {
            addCriterion("TASK_SN not between", value1, value2, "taskSn");
            return this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("TASK_STATUS is null");
            return this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("TASK_STATUS is not null");
            return this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("TASK_STATUS =", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("TASK_STATUS <>", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("TASK_STATUS >", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS >=", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("TASK_STATUS <", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS <=", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("TASK_STATUS like", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("TASK_STATUS not like", value, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("TASK_STATUS in", values, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("TASK_STATUS not in", values, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("TASK_STATUS between", value1, value2, "taskStatus");
            return this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS not between", value1, value2, "taskStatus");
            return this;
        }

        public Criteria andTaskIdSonIsNull() {
            addCriterion("TASK_ID_SON is null");
            return this;
        }

        public Criteria andTaskIdSonIsNotNull() {
            addCriterion("TASK_ID_SON is not null");
            return this;
        }

        public Criteria andTaskIdSonEqualTo(String value) {
            addCriterion("TASK_ID_SON =", value, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonNotEqualTo(String value) {
            addCriterion("TASK_ID_SON <>", value, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonGreaterThan(String value) {
            addCriterion("TASK_ID_SON >", value, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID_SON >=", value, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonLessThan(String value) {
            addCriterion("TASK_ID_SON <", value, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID_SON <=", value, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonLike(String value) {
            addCriterion("TASK_ID_SON like", value, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonNotLike(String value) {
            addCriterion("TASK_ID_SON not like", value, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonIn(List<String> values) {
            addCriterion("TASK_ID_SON in", values, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonNotIn(List<String> values) {
            addCriterion("TASK_ID_SON not in", values, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonBetween(String value1, String value2) {
            addCriterion("TASK_ID_SON between", value1, value2, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdSonNotBetween(String value1, String value2) {
            addCriterion("TASK_ID_SON not between", value1, value2, "taskIdSon");
            return this;
        }

        public Criteria andTaskIdParentIsNull() {
            addCriterion("TASK_ID_PARENT is null");
            return this;
        }

        public Criteria andTaskIdParentIsNotNull() {
            addCriterion("TASK_ID_PARENT is not null");
            return this;
        }

        public Criteria andTaskIdParentEqualTo(String value) {
            addCriterion("TASK_ID_PARENT =", value, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentNotEqualTo(String value) {
            addCriterion("TASK_ID_PARENT <>", value, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentGreaterThan(String value) {
            addCriterion("TASK_ID_PARENT >", value, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID_PARENT >=", value, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentLessThan(String value) {
            addCriterion("TASK_ID_PARENT <", value, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID_PARENT <=", value, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentLike(String value) {
            addCriterion("TASK_ID_PARENT like", value, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentNotLike(String value) {
            addCriterion("TASK_ID_PARENT not like", value, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentIn(List<String> values) {
            addCriterion("TASK_ID_PARENT in", values, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentNotIn(List<String> values) {
            addCriterion("TASK_ID_PARENT not in", values, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentBetween(String value1, String value2) {
            addCriterion("TASK_ID_PARENT between", value1, value2, "taskIdParent");
            return this;
        }

        public Criteria andTaskIdParentNotBetween(String value1, String value2) {
            addCriterion("TASK_ID_PARENT not between", value1, value2, "taskIdParent");
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

        public Criteria andFinishTimeIsNull() {
            addCriterion("FINISH_TIME is null");
            return this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("FINISH_TIME is not null");
            return this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("FINISH_TIME =", value, "finishTime");
            return this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("FINISH_TIME <>", value, "finishTime");
            return this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("FINISH_TIME >", value, "finishTime");
            return this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINISH_TIME >=", value, "finishTime");
            return this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("FINISH_TIME <", value, "finishTime");
            return this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINISH_TIME <=", value, "finishTime");
            return this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("FINISH_TIME in", values, "finishTime");
            return this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("FINISH_TIME not in", values, "finishTime");
            return this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("FINISH_TIME between", value1, value2, "finishTime");
            return this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINISH_TIME not between", value1, value2, "finishTime");
            return this;
        }

        public Criteria andIsFinishIsNull() {
            addCriterion("IS_FINISH is null");
            return this;
        }

        public Criteria andIsFinishIsNotNull() {
            addCriterion("IS_FINISH is not null");
            return this;
        }

        public Criteria andIsFinishEqualTo(String value) {
            addCriterion("IS_FINISH =", value, "isFinish");
            return this;
        }

        public Criteria andIsFinishNotEqualTo(String value) {
            addCriterion("IS_FINISH <>", value, "isFinish");
            return this;
        }

        public Criteria andIsFinishGreaterThan(String value) {
            addCriterion("IS_FINISH >", value, "isFinish");
            return this;
        }

        public Criteria andIsFinishGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FINISH >=", value, "isFinish");
            return this;
        }

        public Criteria andIsFinishLessThan(String value) {
            addCriterion("IS_FINISH <", value, "isFinish");
            return this;
        }

        public Criteria andIsFinishLessThanOrEqualTo(String value) {
            addCriterion("IS_FINISH <=", value, "isFinish");
            return this;
        }

        public Criteria andIsFinishLike(String value) {
            addCriterion("IS_FINISH like", value, "isFinish");
            return this;
        }

        public Criteria andIsFinishNotLike(String value) {
            addCriterion("IS_FINISH not like", value, "isFinish");
            return this;
        }

        public Criteria andIsFinishIn(List<String> values) {
            addCriterion("IS_FINISH in", values, "isFinish");
            return this;
        }

        public Criteria andIsFinishNotIn(List<String> values) {
            addCriterion("IS_FINISH not in", values, "isFinish");
            return this;
        }

        public Criteria andIsFinishBetween(String value1, String value2) {
            addCriterion("IS_FINISH between", value1, value2, "isFinish");
            return this;
        }

        public Criteria andIsFinishNotBetween(String value1, String value2) {
            addCriterion("IS_FINISH not between", value1, value2, "isFinish");
            return this;
        }

        public Criteria andIsRedoIsNull() {
            addCriterion("IS_REDO is null");
            return this;
        }

        public Criteria andIsRedoIsNotNull() {
            addCriterion("IS_REDO is not null");
            return this;
        }

        public Criteria andIsRedoEqualTo(String value) {
            addCriterion("IS_REDO =", value, "isRedo");
            return this;
        }

        public Criteria andIsRedoNotEqualTo(String value) {
            addCriterion("IS_REDO <>", value, "isRedo");
            return this;
        }

        public Criteria andIsRedoGreaterThan(String value) {
            addCriterion("IS_REDO >", value, "isRedo");
            return this;
        }

        public Criteria andIsRedoGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REDO >=", value, "isRedo");
            return this;
        }

        public Criteria andIsRedoLessThan(String value) {
            addCriterion("IS_REDO <", value, "isRedo");
            return this;
        }

        public Criteria andIsRedoLessThanOrEqualTo(String value) {
            addCriterion("IS_REDO <=", value, "isRedo");
            return this;
        }

        public Criteria andIsRedoLike(String value) {
            addCriterion("IS_REDO like", value, "isRedo");
            return this;
        }

        public Criteria andIsRedoNotLike(String value) {
            addCriterion("IS_REDO not like", value, "isRedo");
            return this;
        }

        public Criteria andIsRedoIn(List<String> values) {
            addCriterion("IS_REDO in", values, "isRedo");
            return this;
        }

        public Criteria andIsRedoNotIn(List<String> values) {
            addCriterion("IS_REDO not in", values, "isRedo");
            return this;
        }

        public Criteria andIsRedoBetween(String value1, String value2) {
            addCriterion("IS_REDO between", value1, value2, "isRedo");
            return this;
        }

        public Criteria andIsRedoNotBetween(String value1, String value2) {
            addCriterion("IS_REDO not between", value1, value2, "isRedo");
            return this;
        }

        public Criteria andDealObjectIdIsNull() {
            addCriterion("DEAL_OBJECT_ID is null");
            return this;
        }

        public Criteria andDealObjectIdIsNotNull() {
            addCriterion("DEAL_OBJECT_ID is not null");
            return this;
        }

        public Criteria andDealObjectIdEqualTo(String value) {
            addCriterion("DEAL_OBJECT_ID =", value, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdNotEqualTo(String value) {
            addCriterion("DEAL_OBJECT_ID <>", value, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdGreaterThan(String value) {
            addCriterion("DEAL_OBJECT_ID >", value, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_OBJECT_ID >=", value, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdLessThan(String value) {
            addCriterion("DEAL_OBJECT_ID <", value, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdLessThanOrEqualTo(String value) {
            addCriterion("DEAL_OBJECT_ID <=", value, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdLike(String value) {
            addCriterion("DEAL_OBJECT_ID like", value, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdNotLike(String value) {
            addCriterion("DEAL_OBJECT_ID not like", value, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdIn(List<String> values) {
            addCriterion("DEAL_OBJECT_ID in", values, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdNotIn(List<String> values) {
            addCriterion("DEAL_OBJECT_ID not in", values, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdBetween(String value1, String value2) {
            addCriterion("DEAL_OBJECT_ID between", value1, value2, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectIdNotBetween(String value1, String value2) {
            addCriterion("DEAL_OBJECT_ID not between", value1, value2, "dealObjectId");
            return this;
        }

        public Criteria andDealObjectTypeIsNull() {
            addCriterion("DEAL_OBJECT_TYPE is null");
            return this;
        }

        public Criteria andDealObjectTypeIsNotNull() {
            addCriterion("DEAL_OBJECT_TYPE is not null");
            return this;
        }

        public Criteria andDealObjectTypeEqualTo(String value) {
            addCriterion("DEAL_OBJECT_TYPE =", value, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeNotEqualTo(String value) {
            addCriterion("DEAL_OBJECT_TYPE <>", value, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeGreaterThan(String value) {
            addCriterion("DEAL_OBJECT_TYPE >", value, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_OBJECT_TYPE >=", value, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeLessThan(String value) {
            addCriterion("DEAL_OBJECT_TYPE <", value, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeLessThanOrEqualTo(String value) {
            addCriterion("DEAL_OBJECT_TYPE <=", value, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeLike(String value) {
            addCriterion("DEAL_OBJECT_TYPE like", value, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeNotLike(String value) {
            addCriterion("DEAL_OBJECT_TYPE not like", value, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeIn(List<String> values) {
            addCriterion("DEAL_OBJECT_TYPE in", values, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeNotIn(List<String> values) {
            addCriterion("DEAL_OBJECT_TYPE not in", values, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeBetween(String value1, String value2) {
            addCriterion("DEAL_OBJECT_TYPE between", value1, value2, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectTypeNotBetween(String value1, String value2) {
            addCriterion("DEAL_OBJECT_TYPE not between", value1, value2, "dealObjectType");
            return this;
        }

        public Criteria andDealObjectGroupIsNull() {
            addCriterion("DEAL_OBJECT_GROUP is null");
            return this;
        }

        public Criteria andDealObjectGroupIsNotNull() {
            addCriterion("DEAL_OBJECT_GROUP is not null");
            return this;
        }

        public Criteria andDealObjectGroupEqualTo(String value) {
            addCriterion("DEAL_OBJECT_GROUP =", value, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupNotEqualTo(String value) {
            addCriterion("DEAL_OBJECT_GROUP <>", value, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupGreaterThan(String value) {
            addCriterion("DEAL_OBJECT_GROUP >", value, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_OBJECT_GROUP >=", value, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupLessThan(String value) {
            addCriterion("DEAL_OBJECT_GROUP <", value, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupLessThanOrEqualTo(String value) {
            addCriterion("DEAL_OBJECT_GROUP <=", value, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupLike(String value) {
            addCriterion("DEAL_OBJECT_GROUP like", value, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupNotLike(String value) {
            addCriterion("DEAL_OBJECT_GROUP not like", value, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupIn(List<String> values) {
            addCriterion("DEAL_OBJECT_GROUP in", values, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupNotIn(List<String> values) {
            addCriterion("DEAL_OBJECT_GROUP not in", values, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupBetween(String value1, String value2) {
            addCriterion("DEAL_OBJECT_GROUP between", value1, value2, "dealObjectGroup");
            return this;
        }

        public Criteria andDealObjectGroupNotBetween(String value1, String value2) {
            addCriterion("DEAL_OBJECT_GROUP not between", value1, value2, "dealObjectGroup");
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