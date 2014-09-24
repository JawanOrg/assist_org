
package com.free.assist.domain;

import java.io.Serializable;
import java.util.Date;


@javax.persistence.Entity
@javax.persistence.Table(name="JFORUM_TOPICS")
public class ForumTopics extends ForumTopicsKey implements Serializable {
    private Long forumId;

    private String topicTitle;

    private Long userId;

    private Date topicTime;

    private Long topicViews;

    private Long topicReplies;

    private Long topicStatus;

    private Long topicVoteId;

    private Long topicType;

    private Long topicFirstPostId;

    private Long topicLastPostId;

    private Long topicMovedId;

    private Long moderated;
    
    private String createUserName;
    private String replyUserName;
    private Date replyTime;

    private static final long serialVersionUID = 1L;

    @javax.persistence.Column(name="FORUM_ID", nullable=false)
    public Long getForumId() {
        return forumId;
    }

    public void setForumId(Long forumId) {
        this.forumId = forumId;
    }

    @javax.persistence.Column(name="TOPIC_TITLE", nullable=false, length=100)
    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    @javax.persistence.Column(name="USER_ID", nullable=false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @javax.persistence.Column(name="TOPIC_TIME", nullable=false)
    public Date getTopicTime() {
        return topicTime;
    }

    public void setTopicTime(Date topicTime) {
        this.topicTime = topicTime;
    }

    @javax.persistence.Column(name="TOPIC_VIEWS", nullable=true)
    public Long getTopicViews() {
        return topicViews;
    }

    public void setTopicViews(Long topicViews) {
        this.topicViews = topicViews;
    }

    @javax.persistence.Column(name="TOPIC_REPLIES", nullable=true)
    public Long getTopicReplies() {
        return topicReplies;
    }

    public void setTopicReplies(Long topicReplies) {
        this.topicReplies = topicReplies;
    }

    @javax.persistence.Column(name="TOPIC_STATUS", nullable=true)
    public Long getTopicStatus() {
        return topicStatus;
    }

    public void setTopicStatus(Long topicStatus) {
        this.topicStatus = topicStatus;
    }

    @javax.persistence.Column(name="TOPIC_VOTE_ID", nullable=true)
    public Long getTopicVoteId() {
        return topicVoteId;
    }

    public void setTopicVoteId(Long topicVoteId) {
        this.topicVoteId = topicVoteId;
    }

    @javax.persistence.Column(name="TOPIC_TYPE", nullable=true)
    public Long getTopicType() {
        return topicType;
    }

    public void setTopicType(Long topicType) {
        this.topicType = topicType;
    }

    @javax.persistence.Column(name="TOPIC_FIRST_POST_ID", nullable=true)
    public Long getTopicFirstPostId() {
        return topicFirstPostId;
    }

    public void setTopicFirstPostId(Long topicFirstPostId) {
        this.topicFirstPostId = topicFirstPostId;
    }

    @javax.persistence.Column(name="TOPIC_LAST_POST_ID", nullable=false)
    public Long getTopicLastPostId() {
        return topicLastPostId;
    }

    public void setTopicLastPostId(Long topicLastPostId) {
        this.topicLastPostId = topicLastPostId;
    }

    @javax.persistence.Column(name="TOPIC_MOVED_ID", nullable=true)
    public Long getTopicMovedId() {
        return topicMovedId;
    }

    public void setTopicMovedId(Long topicMovedId) {
        this.topicMovedId = topicMovedId;
    }

    @javax.persistence.Column(name="MODERATED", nullable=true)
    public Long getModerated() {
        return moderated;
    }

    public void setModerated(Long moderated) {
        this.moderated = moderated;
    }

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getReplyUserName() {
		return replyUserName;
	}

	public void setReplyUserName(String replyUserName) {
		this.replyUserName = replyUserName;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
}