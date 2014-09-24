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

public class ForumTopicsExample  extends BaseExample{
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public ForumTopicsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected ForumTopicsExample(ForumTopicsExample example) {
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

        public Criteria andTopicIdIsNull() {
            addCriterion("TOPIC_ID is null");
            return this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("TOPIC_ID is not null");
            return this;
        }

        public Criteria andTopicIdEqualTo(Long value) {
            addCriterion("TOPIC_ID =", value, "topicId");
            return this;
        }

        public Criteria andTopicIdNotEqualTo(Long value) {
            addCriterion("TOPIC_ID <>", value, "topicId");
            return this;
        }

        public Criteria andTopicIdGreaterThan(Long value) {
            addCriterion("TOPIC_ID >", value, "topicId");
            return this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_ID >=", value, "topicId");
            return this;
        }

        public Criteria andTopicIdLessThan(Long value) {
            addCriterion("TOPIC_ID <", value, "topicId");
            return this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_ID <=", value, "topicId");
            return this;
        }

        public Criteria andTopicIdIn(List<Long> values) {
            addCriterion("TOPIC_ID in", values, "topicId");
            return this;
        }

        public Criteria andTopicIdNotIn(List<Long> values) {
            addCriterion("TOPIC_ID not in", values, "topicId");
            return this;
        }

        public Criteria andTopicIdBetween(Long value1, Long value2) {
            addCriterion("TOPIC_ID between", value1, value2, "topicId");
            return this;
        }

        public Criteria andTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_ID not between", value1, value2, "topicId");
            return this;
        }

        public Criteria andForumIdIsNull() {
            addCriterion("FORUM_ID is null");
            return this;
        }

        public Criteria andForumIdIsNotNull() {
            addCriterion("FORUM_ID is not null");
            return this;
        }

        public Criteria andForumIdEqualTo(Long value) {
            addCriterion("FORUM_ID =", value, "forumId");
            return this;
        }

        public Criteria andForumIdNotEqualTo(Long value) {
            addCriterion("FORUM_ID <>", value, "forumId");
            return this;
        }

        public Criteria andForumIdGreaterThan(Long value) {
            addCriterion("FORUM_ID >", value, "forumId");
            return this;
        }

        public Criteria andForumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FORUM_ID >=", value, "forumId");
            return this;
        }

        public Criteria andForumIdLessThan(Long value) {
            addCriterion("FORUM_ID <", value, "forumId");
            return this;
        }

        public Criteria andForumIdLessThanOrEqualTo(Long value) {
            addCriterion("FORUM_ID <=", value, "forumId");
            return this;
        }

        public Criteria andForumIdIn(List<Long> values) {
            addCriterion("FORUM_ID in", values, "forumId");
            return this;
        }

        public Criteria andForumIdNotIn(List<Long> values) {
            addCriterion("FORUM_ID not in", values, "forumId");
            return this;
        }

        public Criteria andForumIdBetween(Long value1, Long value2) {
            addCriterion("FORUM_ID between", value1, value2, "forumId");
            return this;
        }

        public Criteria andForumIdNotBetween(Long value1, Long value2) {
            addCriterion("FORUM_ID not between", value1, value2, "forumId");
            return this;
        }

        public Criteria andTopicTitleIsNull() {
            addCriterion("TOPIC_TITLE is null");
            return this;
        }

        public Criteria andTopicTitleIsNotNull() {
            addCriterion("TOPIC_TITLE is not null");
            return this;
        }

        public Criteria andTopicTitleEqualTo(String value) {
            addCriterion("TOPIC_TITLE =", value, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleNotEqualTo(String value) {
            addCriterion("TOPIC_TITLE <>", value, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleGreaterThan(String value) {
            addCriterion("TOPIC_TITLE >", value, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TOPIC_TITLE >=", value, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleLessThan(String value) {
            addCriterion("TOPIC_TITLE <", value, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleLessThanOrEqualTo(String value) {
            addCriterion("TOPIC_TITLE <=", value, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleLike(String value) {
            addCriterion("TOPIC_TITLE like", value, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleNotLike(String value) {
            addCriterion("TOPIC_TITLE not like", value, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleIn(List<String> values) {
            addCriterion("TOPIC_TITLE in", values, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleNotIn(List<String> values) {
            addCriterion("TOPIC_TITLE not in", values, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleBetween(String value1, String value2) {
            addCriterion("TOPIC_TITLE between", value1, value2, "topicTitle");
            return this;
        }

        public Criteria andTopicTitleNotBetween(String value1, String value2) {
            addCriterion("TOPIC_TITLE not between", value1, value2, "topicTitle");
            return this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return this;
        }

        public Criteria andTopicTimeIsNull() {
            addCriterion("TOPIC_TIME is null");
            return this;
        }

        public Criteria andTopicTimeIsNotNull() {
            addCriterion("TOPIC_TIME is not null");
            return this;
        }

        public Criteria andTopicTimeEqualTo(Date value) {
            addCriterion("TOPIC_TIME =", value, "topicTime");
            return this;
        }

        public Criteria andTopicTimeNotEqualTo(Date value) {
            addCriterion("TOPIC_TIME <>", value, "topicTime");
            return this;
        }

        public Criteria andTopicTimeGreaterThan(Date value) {
            addCriterion("TOPIC_TIME >", value, "topicTime");
            return this;
        }

        public Criteria andTopicTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TOPIC_TIME >=", value, "topicTime");
            return this;
        }

        public Criteria andTopicTimeLessThan(Date value) {
            addCriterion("TOPIC_TIME <", value, "topicTime");
            return this;
        }

        public Criteria andTopicTimeLessThanOrEqualTo(Date value) {
            addCriterion("TOPIC_TIME <=", value, "topicTime");
            return this;
        }

        public Criteria andTopicTimeIn(List<Date> values) {
            addCriterion("TOPIC_TIME in", values, "topicTime");
            return this;
        }

        public Criteria andTopicTimeNotIn(List<Date> values) {
            addCriterion("TOPIC_TIME not in", values, "topicTime");
            return this;
        }

        public Criteria andTopicTimeBetween(Date value1, Date value2) {
            addCriterion("TOPIC_TIME between", value1, value2, "topicTime");
            return this;
        }

        public Criteria andTopicTimeNotBetween(Date value1, Date value2) {
            addCriterion("TOPIC_TIME not between", value1, value2, "topicTime");
            return this;
        }

        public Criteria andTopicViewsIsNull() {
            addCriterion("TOPIC_VIEWS is null");
            return this;
        }

        public Criteria andTopicViewsIsNotNull() {
            addCriterion("TOPIC_VIEWS is not null");
            return this;
        }

        public Criteria andTopicViewsEqualTo(Long value) {
            addCriterion("TOPIC_VIEWS =", value, "topicViews");
            return this;
        }

        public Criteria andTopicViewsNotEqualTo(Long value) {
            addCriterion("TOPIC_VIEWS <>", value, "topicViews");
            return this;
        }

        public Criteria andTopicViewsGreaterThan(Long value) {
            addCriterion("TOPIC_VIEWS >", value, "topicViews");
            return this;
        }

        public Criteria andTopicViewsGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_VIEWS >=", value, "topicViews");
            return this;
        }

        public Criteria andTopicViewsLessThan(Long value) {
            addCriterion("TOPIC_VIEWS <", value, "topicViews");
            return this;
        }

        public Criteria andTopicViewsLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_VIEWS <=", value, "topicViews");
            return this;
        }

        public Criteria andTopicViewsIn(List<Long> values) {
            addCriterion("TOPIC_VIEWS in", values, "topicViews");
            return this;
        }

        public Criteria andTopicViewsNotIn(List<Long> values) {
            addCriterion("TOPIC_VIEWS not in", values, "topicViews");
            return this;
        }

        public Criteria andTopicViewsBetween(Long value1, Long value2) {
            addCriterion("TOPIC_VIEWS between", value1, value2, "topicViews");
            return this;
        }

        public Criteria andTopicViewsNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_VIEWS not between", value1, value2, "topicViews");
            return this;
        }

        public Criteria andTopicRepliesIsNull() {
            addCriterion("TOPIC_REPLIES is null");
            return this;
        }

        public Criteria andTopicRepliesIsNotNull() {
            addCriterion("TOPIC_REPLIES is not null");
            return this;
        }

        public Criteria andTopicRepliesEqualTo(Long value) {
            addCriterion("TOPIC_REPLIES =", value, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesNotEqualTo(Long value) {
            addCriterion("TOPIC_REPLIES <>", value, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesGreaterThan(Long value) {
            addCriterion("TOPIC_REPLIES >", value, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_REPLIES >=", value, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesLessThan(Long value) {
            addCriterion("TOPIC_REPLIES <", value, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_REPLIES <=", value, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesIn(List<Long> values) {
            addCriterion("TOPIC_REPLIES in", values, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesNotIn(List<Long> values) {
            addCriterion("TOPIC_REPLIES not in", values, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesBetween(Long value1, Long value2) {
            addCriterion("TOPIC_REPLIES between", value1, value2, "topicReplies");
            return this;
        }

        public Criteria andTopicRepliesNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_REPLIES not between", value1, value2, "topicReplies");
            return this;
        }

        public Criteria andTopicStatusIsNull() {
            addCriterion("TOPIC_STATUS is null");
            return this;
        }

        public Criteria andTopicStatusIsNotNull() {
            addCriterion("TOPIC_STATUS is not null");
            return this;
        }

        public Criteria andTopicStatusEqualTo(Long value) {
            addCriterion("TOPIC_STATUS =", value, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusNotEqualTo(Long value) {
            addCriterion("TOPIC_STATUS <>", value, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusGreaterThan(Long value) {
            addCriterion("TOPIC_STATUS >", value, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_STATUS >=", value, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusLessThan(Long value) {
            addCriterion("TOPIC_STATUS <", value, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_STATUS <=", value, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusIn(List<Long> values) {
            addCriterion("TOPIC_STATUS in", values, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusNotIn(List<Long> values) {
            addCriterion("TOPIC_STATUS not in", values, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusBetween(Long value1, Long value2) {
            addCriterion("TOPIC_STATUS between", value1, value2, "topicStatus");
            return this;
        }

        public Criteria andTopicStatusNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_STATUS not between", value1, value2, "topicStatus");
            return this;
        }

        public Criteria andTopicVoteIdIsNull() {
            addCriterion("TOPIC_VOTE_ID is null");
            return this;
        }

        public Criteria andTopicVoteIdIsNotNull() {
            addCriterion("TOPIC_VOTE_ID is not null");
            return this;
        }

        public Criteria andTopicVoteIdEqualTo(Long value) {
            addCriterion("TOPIC_VOTE_ID =", value, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdNotEqualTo(Long value) {
            addCriterion("TOPIC_VOTE_ID <>", value, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdGreaterThan(Long value) {
            addCriterion("TOPIC_VOTE_ID >", value, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_VOTE_ID >=", value, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdLessThan(Long value) {
            addCriterion("TOPIC_VOTE_ID <", value, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_VOTE_ID <=", value, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdIn(List<Long> values) {
            addCriterion("TOPIC_VOTE_ID in", values, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdNotIn(List<Long> values) {
            addCriterion("TOPIC_VOTE_ID not in", values, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdBetween(Long value1, Long value2) {
            addCriterion("TOPIC_VOTE_ID between", value1, value2, "topicVoteId");
            return this;
        }

        public Criteria andTopicVoteIdNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_VOTE_ID not between", value1, value2, "topicVoteId");
            return this;
        }

        public Criteria andTopicTypeIsNull() {
            addCriterion("TOPIC_TYPE is null");
            return this;
        }

        public Criteria andTopicTypeIsNotNull() {
            addCriterion("TOPIC_TYPE is not null");
            return this;
        }

        public Criteria andTopicTypeEqualTo(Long value) {
            addCriterion("TOPIC_TYPE =", value, "topicType");
            return this;
        }

        public Criteria andTopicTypeNotEqualTo(Long value) {
            addCriterion("TOPIC_TYPE <>", value, "topicType");
            return this;
        }

        public Criteria andTopicTypeGreaterThan(Long value) {
            addCriterion("TOPIC_TYPE >", value, "topicType");
            return this;
        }

        public Criteria andTopicTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_TYPE >=", value, "topicType");
            return this;
        }

        public Criteria andTopicTypeLessThan(Long value) {
            addCriterion("TOPIC_TYPE <", value, "topicType");
            return this;
        }

        public Criteria andTopicTypeLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_TYPE <=", value, "topicType");
            return this;
        }

        public Criteria andTopicTypeIn(List<Long> values) {
            addCriterion("TOPIC_TYPE in", values, "topicType");
            return this;
        }

        public Criteria andTopicTypeNotIn(List<Long> values) {
            addCriterion("TOPIC_TYPE not in", values, "topicType");
            return this;
        }

        public Criteria andTopicTypeBetween(Long value1, Long value2) {
            addCriterion("TOPIC_TYPE between", value1, value2, "topicType");
            return this;
        }

        public Criteria andTopicTypeNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_TYPE not between", value1, value2, "topicType");
            return this;
        }

        public Criteria andTopicFirstPostIdIsNull() {
            addCriterion("TOPIC_FIRST_POST_ID is null");
            return this;
        }

        public Criteria andTopicFirstPostIdIsNotNull() {
            addCriterion("TOPIC_FIRST_POST_ID is not null");
            return this;
        }

        public Criteria andTopicFirstPostIdEqualTo(Long value) {
            addCriterion("TOPIC_FIRST_POST_ID =", value, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdNotEqualTo(Long value) {
            addCriterion("TOPIC_FIRST_POST_ID <>", value, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdGreaterThan(Long value) {
            addCriterion("TOPIC_FIRST_POST_ID >", value, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_FIRST_POST_ID >=", value, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdLessThan(Long value) {
            addCriterion("TOPIC_FIRST_POST_ID <", value, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_FIRST_POST_ID <=", value, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdIn(List<Long> values) {
            addCriterion("TOPIC_FIRST_POST_ID in", values, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdNotIn(List<Long> values) {
            addCriterion("TOPIC_FIRST_POST_ID not in", values, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdBetween(Long value1, Long value2) {
            addCriterion("TOPIC_FIRST_POST_ID between", value1, value2, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicFirstPostIdNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_FIRST_POST_ID not between", value1, value2, "topicFirstPostId");
            return this;
        }

        public Criteria andTopicLastPostIdIsNull() {
            addCriterion("TOPIC_LAST_POST_ID is null");
            return this;
        }

        public Criteria andTopicLastPostIdIsNotNull() {
            addCriterion("TOPIC_LAST_POST_ID is not null");
            return this;
        }

        public Criteria andTopicLastPostIdEqualTo(Long value) {
            addCriterion("TOPIC_LAST_POST_ID =", value, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdNotEqualTo(Long value) {
            addCriterion("TOPIC_LAST_POST_ID <>", value, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdGreaterThan(Long value) {
            addCriterion("TOPIC_LAST_POST_ID >", value, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_LAST_POST_ID >=", value, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdLessThan(Long value) {
            addCriterion("TOPIC_LAST_POST_ID <", value, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_LAST_POST_ID <=", value, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdIn(List<Long> values) {
            addCriterion("TOPIC_LAST_POST_ID in", values, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdNotIn(List<Long> values) {
            addCriterion("TOPIC_LAST_POST_ID not in", values, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdBetween(Long value1, Long value2) {
            addCriterion("TOPIC_LAST_POST_ID between", value1, value2, "topicLastPostId");
            return this;
        }

        public Criteria andTopicLastPostIdNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_LAST_POST_ID not between", value1, value2, "topicLastPostId");
            return this;
        }

        public Criteria andTopicMovedIdIsNull() {
            addCriterion("TOPIC_MOVED_ID is null");
            return this;
        }

        public Criteria andTopicMovedIdIsNotNull() {
            addCriterion("TOPIC_MOVED_ID is not null");
            return this;
        }

        public Criteria andTopicMovedIdEqualTo(Long value) {
            addCriterion("TOPIC_MOVED_ID =", value, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdNotEqualTo(Long value) {
            addCriterion("TOPIC_MOVED_ID <>", value, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdGreaterThan(Long value) {
            addCriterion("TOPIC_MOVED_ID >", value, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TOPIC_MOVED_ID >=", value, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdLessThan(Long value) {
            addCriterion("TOPIC_MOVED_ID <", value, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdLessThanOrEqualTo(Long value) {
            addCriterion("TOPIC_MOVED_ID <=", value, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdIn(List<Long> values) {
            addCriterion("TOPIC_MOVED_ID in", values, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdNotIn(List<Long> values) {
            addCriterion("TOPIC_MOVED_ID not in", values, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdBetween(Long value1, Long value2) {
            addCriterion("TOPIC_MOVED_ID between", value1, value2, "topicMovedId");
            return this;
        }

        public Criteria andTopicMovedIdNotBetween(Long value1, Long value2) {
            addCriterion("TOPIC_MOVED_ID not between", value1, value2, "topicMovedId");
            return this;
        }

        public Criteria andModeratedIsNull() {
            addCriterion("MODERATED is null");
            return this;
        }

        public Criteria andModeratedIsNotNull() {
            addCriterion("MODERATED is not null");
            return this;
        }

        public Criteria andModeratedEqualTo(Long value) {
            addCriterion("MODERATED =", value, "moderated");
            return this;
        }

        public Criteria andModeratedNotEqualTo(Long value) {
            addCriterion("MODERATED <>", value, "moderated");
            return this;
        }

        public Criteria andModeratedGreaterThan(Long value) {
            addCriterion("MODERATED >", value, "moderated");
            return this;
        }

        public Criteria andModeratedGreaterThanOrEqualTo(Long value) {
            addCriterion("MODERATED >=", value, "moderated");
            return this;
        }

        public Criteria andModeratedLessThan(Long value) {
            addCriterion("MODERATED <", value, "moderated");
            return this;
        }

        public Criteria andModeratedLessThanOrEqualTo(Long value) {
            addCriterion("MODERATED <=", value, "moderated");
            return this;
        }

        public Criteria andModeratedIn(List<Long> values) {
            addCriterion("MODERATED in", values, "moderated");
            return this;
        }

        public Criteria andModeratedNotIn(List<Long> values) {
            addCriterion("MODERATED not in", values, "moderated");
            return this;
        }

        public Criteria andModeratedBetween(Long value1, Long value2) {
            addCriterion("MODERATED between", value1, value2, "moderated");
            return this;
        }

        public Criteria andModeratedNotBetween(Long value1, Long value2) {
            addCriterion("MODERATED not between", value1, value2, "moderated");
            return this;
        }
    }
}