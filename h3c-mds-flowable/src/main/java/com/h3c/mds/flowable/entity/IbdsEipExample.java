package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.List;

public class IbdsEipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IbdsEipExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
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
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSubjectIsNull() {
            addCriterion("SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("SUBJECT =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("SUBJECT <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("SUBJECT >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("SUBJECT <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("SUBJECT like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("SUBJECT not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("SUBJECT in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("SUBJECT not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("SUBJECT between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("SUBJECT not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNull() {
            addCriterion("ADD_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNotNull() {
            addCriterion("ADD_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdEqualTo(String value) {
            addCriterion("ADD_USER_ID =", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotEqualTo(String value) {
            addCriterion("ADD_USER_ID <>", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThan(String value) {
            addCriterion("ADD_USER_ID >", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_USER_ID >=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThan(String value) {
            addCriterion("ADD_USER_ID <", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThanOrEqualTo(String value) {
            addCriterion("ADD_USER_ID <=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLike(String value) {
            addCriterion("ADD_USER_ID like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotLike(String value) {
            addCriterion("ADD_USER_ID not like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIn(List<String> values) {
            addCriterion("ADD_USER_ID in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotIn(List<String> values) {
            addCriterion("ADD_USER_ID not in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdBetween(String value1, String value2) {
            addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotBetween(String value1, String value2) {
            addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIsNull() {
            addCriterion("ADD_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIsNotNull() {
            addCriterion("ADD_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserNameEqualTo(String value) {
            addCriterion("ADD_USER_NAME =", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotEqualTo(String value) {
            addCriterion("ADD_USER_NAME <>", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameGreaterThan(String value) {
            addCriterion("ADD_USER_NAME >", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_USER_NAME >=", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLessThan(String value) {
            addCriterion("ADD_USER_NAME <", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLessThanOrEqualTo(String value) {
            addCriterion("ADD_USER_NAME <=", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLike(String value) {
            addCriterion("ADD_USER_NAME like", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotLike(String value) {
            addCriterion("ADD_USER_NAME not like", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIn(List<String> values) {
            addCriterion("ADD_USER_NAME in", values, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotIn(List<String> values) {
            addCriterion("ADD_USER_NAME not in", values, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameBetween(String value1, String value2) {
            addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotBetween(String value1, String value2) {
            addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(String value) {
            addCriterion("APPLY_TIME =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(String value) {
            addCriterion("APPLY_TIME <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(String value) {
            addCriterion("APPLY_TIME >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TIME >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(String value) {
            addCriterion("APPLY_TIME <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TIME <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLike(String value) {
            addCriterion("APPLY_TIME like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotLike(String value) {
            addCriterion("APPLY_TIME not like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<String> values) {
            addCriterion("APPLY_TIME in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<String> values) {
            addCriterion("APPLY_TIME not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(String value1, String value2) {
            addCriterion("APPLY_TIME between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TIME not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("AUTHOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("AUTHOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(String value) {
            addCriterion("AUTHOR_ID =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(String value) {
            addCriterion("AUTHOR_ID <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(String value) {
            addCriterion("AUTHOR_ID >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR_ID >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(String value) {
            addCriterion("AUTHOR_ID <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR_ID <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLike(String value) {
            addCriterion("AUTHOR_ID like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotLike(String value) {
            addCriterion("AUTHOR_ID not like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<String> values) {
            addCriterion("AUTHOR_ID in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<String> values) {
            addCriterion("AUTHOR_ID not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(String value1, String value2) {
            addCriterion("AUTHOR_ID between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(String value1, String value2) {
            addCriterion("AUTHOR_ID not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNull() {
            addCriterion("AUTHOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("AUTHOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("AUTHOR_NAME =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("AUTHOR_NAME <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("AUTHOR_NAME >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR_NAME >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("AUTHOR_NAME <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR_NAME <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("AUTHOR_NAME like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("AUTHOR_NAME not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("AUTHOR_NAME in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("AUTHOR_NAME not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("AUTHOR_NAME between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("AUTHOR_NAME not between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("SYSTEM_ID like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("SYSTEM_ID not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andDocunIdIsNull() {
            addCriterion("DOCUN_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocunIdIsNotNull() {
            addCriterion("DOCUN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocunIdEqualTo(String value) {
            addCriterion("DOCUN_ID =", value, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdNotEqualTo(String value) {
            addCriterion("DOCUN_ID <>", value, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdGreaterThan(String value) {
            addCriterion("DOCUN_ID >", value, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUN_ID >=", value, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdLessThan(String value) {
            addCriterion("DOCUN_ID <", value, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdLessThanOrEqualTo(String value) {
            addCriterion("DOCUN_ID <=", value, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdLike(String value) {
            addCriterion("DOCUN_ID like", value, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdNotLike(String value) {
            addCriterion("DOCUN_ID not like", value, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdIn(List<String> values) {
            addCriterion("DOCUN_ID in", values, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdNotIn(List<String> values) {
            addCriterion("DOCUN_ID not in", values, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdBetween(String value1, String value2) {
            addCriterion("DOCUN_ID between", value1, value2, "docunId");
            return (Criteria) this;
        }

        public Criteria andDocunIdNotBetween(String value1, String value2) {
            addCriterion("DOCUN_ID not between", value1, value2, "docunId");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("APP_ID =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("APP_ID <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("APP_ID >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("APP_ID >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("APP_ID <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("APP_ID <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("APP_ID like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("APP_ID not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("APP_ID in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("APP_ID not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("APP_ID between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("APP_ID not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("PROCESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("PROCESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("PROCESS_ID =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("PROCESS_ID <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("PROCESS_ID >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("PROCESS_ID <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("PROCESS_ID like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("PROCESS_ID not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("PROCESS_ID in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("PROCESS_ID not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("PROCESS_ID between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_ID not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNull() {
            addCriterion("PROCESS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("PROCESS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("PROCESS_NAME =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("PROCESS_NAME <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("PROCESS_NAME >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_NAME >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("PROCESS_NAME <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_NAME <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("PROCESS_NAME like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("PROCESS_NAME not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("PROCESS_NAME in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("PROCESS_NAME not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("PROCESS_NAME between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("PROCESS_NAME not between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEndUserIdIsNull() {
            addCriterion("END_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andEndUserIdIsNotNull() {
            addCriterion("END_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEndUserIdEqualTo(String value) {
            addCriterion("END_USER_ID =", value, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdNotEqualTo(String value) {
            addCriterion("END_USER_ID <>", value, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdGreaterThan(String value) {
            addCriterion("END_USER_ID >", value, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("END_USER_ID >=", value, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdLessThan(String value) {
            addCriterion("END_USER_ID <", value, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdLessThanOrEqualTo(String value) {
            addCriterion("END_USER_ID <=", value, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdLike(String value) {
            addCriterion("END_USER_ID like", value, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdNotLike(String value) {
            addCriterion("END_USER_ID not like", value, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdIn(List<String> values) {
            addCriterion("END_USER_ID in", values, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdNotIn(List<String> values) {
            addCriterion("END_USER_ID not in", values, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdBetween(String value1, String value2) {
            addCriterion("END_USER_ID between", value1, value2, "endUserId");
            return (Criteria) this;
        }

        public Criteria andEndUserIdNotBetween(String value1, String value2) {
            addCriterion("END_USER_ID not between", value1, value2, "endUserId");
            return (Criteria) this;
        }

        public Criteria andAssignerIsNull() {
            addCriterion("ASSIGNER is null");
            return (Criteria) this;
        }

        public Criteria andAssignerIsNotNull() {
            addCriterion("ASSIGNER is not null");
            return (Criteria) this;
        }

        public Criteria andAssignerEqualTo(String value) {
            addCriterion("ASSIGNER =", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotEqualTo(String value) {
            addCriterion("ASSIGNER <>", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerGreaterThan(String value) {
            addCriterion("ASSIGNER >", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNER >=", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLessThan(String value) {
            addCriterion("ASSIGNER <", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNER <=", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLike(String value) {
            addCriterion("ASSIGNER like", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotLike(String value) {
            addCriterion("ASSIGNER not like", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerIn(List<String> values) {
            addCriterion("ASSIGNER in", values, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotIn(List<String> values) {
            addCriterion("ASSIGNER not in", values, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerBetween(String value1, String value2) {
            addCriterion("ASSIGNER between", value1, value2, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotBetween(String value1, String value2) {
            addCriterion("ASSIGNER not between", value1, value2, "assigner");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("NODE_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("NODE_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("NODE_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("NODE_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("NODE_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("NODE_ID like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("NODE_ID not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("NODE_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("NODE_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("NODE_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("NODE_ID not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNull() {
            addCriterion("NODE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNotNull() {
            addCriterion("NODE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNameEqualTo(String value) {
            addCriterion("NODE_NAME =", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotEqualTo(String value) {
            addCriterion("NODE_NAME <>", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThan(String value) {
            addCriterion("NODE_NAME >", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_NAME >=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThan(String value) {
            addCriterion("NODE_NAME <", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThanOrEqualTo(String value) {
            addCriterion("NODE_NAME <=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLike(String value) {
            addCriterion("NODE_NAME like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotLike(String value) {
            addCriterion("NODE_NAME not like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameIn(List<String> values) {
            addCriterion("NODE_NAME in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotIn(List<String> values) {
            addCriterion("NODE_NAME not in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameBetween(String value1, String value2) {
            addCriterion("NODE_NAME between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotBetween(String value1, String value2) {
            addCriterion("NODE_NAME not between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andTimesTampIsNull() {
            addCriterion("TIMES_TAMP is null");
            return (Criteria) this;
        }

        public Criteria andTimesTampIsNotNull() {
            addCriterion("TIMES_TAMP is not null");
            return (Criteria) this;
        }

        public Criteria andTimesTampEqualTo(String value) {
            addCriterion("TIMES_TAMP =", value, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampNotEqualTo(String value) {
            addCriterion("TIMES_TAMP <>", value, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampGreaterThan(String value) {
            addCriterion("TIMES_TAMP >", value, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampGreaterThanOrEqualTo(String value) {
            addCriterion("TIMES_TAMP >=", value, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampLessThan(String value) {
            addCriterion("TIMES_TAMP <", value, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampLessThanOrEqualTo(String value) {
            addCriterion("TIMES_TAMP <=", value, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampLike(String value) {
            addCriterion("TIMES_TAMP like", value, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampNotLike(String value) {
            addCriterion("TIMES_TAMP not like", value, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampIn(List<String> values) {
            addCriterion("TIMES_TAMP in", values, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampNotIn(List<String> values) {
            addCriterion("TIMES_TAMP not in", values, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampBetween(String value1, String value2) {
            addCriterion("TIMES_TAMP between", value1, value2, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andTimesTampNotBetween(String value1, String value2) {
            addCriterion("TIMES_TAMP not between", value1, value2, "timesTamp");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeIsNull() {
            addCriterion("ACCEPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeIsNotNull() {
            addCriterion("ACCEPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeEqualTo(String value) {
            addCriterion("ACCEPT_TYPE =", value, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeNotEqualTo(String value) {
            addCriterion("ACCEPT_TYPE <>", value, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeGreaterThan(String value) {
            addCriterion("ACCEPT_TYPE >", value, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPT_TYPE >=", value, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeLessThan(String value) {
            addCriterion("ACCEPT_TYPE <", value, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCEPT_TYPE <=", value, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeLike(String value) {
            addCriterion("ACCEPT_TYPE like", value, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeNotLike(String value) {
            addCriterion("ACCEPT_TYPE not like", value, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeIn(List<String> values) {
            addCriterion("ACCEPT_TYPE in", values, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeNotIn(List<String> values) {
            addCriterion("ACCEPT_TYPE not in", values, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeBetween(String value1, String value2) {
            addCriterion("ACCEPT_TYPE between", value1, value2, "acceptType");
            return (Criteria) this;
        }

        public Criteria andAcceptTypeNotBetween(String value1, String value2) {
            addCriterion("ACCEPT_TYPE not between", value1, value2, "acceptType");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIsNull() {
            addCriterion("REDIRECT_URL is null");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIsNotNull() {
            addCriterion("REDIRECT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlEqualTo(String value) {
            addCriterion("REDIRECT_URL =", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotEqualTo(String value) {
            addCriterion("REDIRECT_URL <>", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlGreaterThan(String value) {
            addCriterion("REDIRECT_URL >", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("REDIRECT_URL >=", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLessThan(String value) {
            addCriterion("REDIRECT_URL <", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLessThanOrEqualTo(String value) {
            addCriterion("REDIRECT_URL <=", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLike(String value) {
            addCriterion("REDIRECT_URL like", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotLike(String value) {
            addCriterion("REDIRECT_URL not like", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIn(List<String> values) {
            addCriterion("REDIRECT_URL in", values, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotIn(List<String> values) {
            addCriterion("REDIRECT_URL not in", values, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlBetween(String value1, String value2) {
            addCriterion("REDIRECT_URL between", value1, value2, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotBetween(String value1, String value2) {
            addCriterion("REDIRECT_URL not between", value1, value2, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andIsBatchIsNull() {
            addCriterion("IS_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andIsBatchIsNotNull() {
            addCriterion("IS_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andIsBatchEqualTo(String value) {
            addCriterion("IS_BATCH =", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotEqualTo(String value) {
            addCriterion("IS_BATCH <>", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchGreaterThan(String value) {
            addCriterion("IS_BATCH >", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BATCH >=", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchLessThan(String value) {
            addCriterion("IS_BATCH <", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchLessThanOrEqualTo(String value) {
            addCriterion("IS_BATCH <=", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchLike(String value) {
            addCriterion("IS_BATCH like", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotLike(String value) {
            addCriterion("IS_BATCH not like", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchIn(List<String> values) {
            addCriterion("IS_BATCH in", values, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotIn(List<String> values) {
            addCriterion("IS_BATCH not in", values, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchBetween(String value1, String value2) {
            addCriterion("IS_BATCH between", value1, value2, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotBetween(String value1, String value2) {
            addCriterion("IS_BATCH not between", value1, value2, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsSmsIsNull() {
            addCriterion("IS_SMS is null");
            return (Criteria) this;
        }

        public Criteria andIsSmsIsNotNull() {
            addCriterion("IS_SMS is not null");
            return (Criteria) this;
        }

        public Criteria andIsSmsEqualTo(String value) {
            addCriterion("IS_SMS =", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsNotEqualTo(String value) {
            addCriterion("IS_SMS <>", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsGreaterThan(String value) {
            addCriterion("IS_SMS >", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SMS >=", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsLessThan(String value) {
            addCriterion("IS_SMS <", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsLessThanOrEqualTo(String value) {
            addCriterion("IS_SMS <=", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsLike(String value) {
            addCriterion("IS_SMS like", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsNotLike(String value) {
            addCriterion("IS_SMS not like", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsIn(List<String> values) {
            addCriterion("IS_SMS in", values, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsNotIn(List<String> values) {
            addCriterion("IS_SMS not in", values, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsBetween(String value1, String value2) {
            addCriterion("IS_SMS between", value1, value2, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsNotBetween(String value1, String value2) {
            addCriterion("IS_SMS not between", value1, value2, "isSms");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlIsNull() {
            addCriterion("APPLICATION_URL is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlIsNotNull() {
            addCriterion("APPLICATION_URL is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlEqualTo(String value) {
            addCriterion("APPLICATION_URL =", value, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlNotEqualTo(String value) {
            addCriterion("APPLICATION_URL <>", value, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlGreaterThan(String value) {
            addCriterion("APPLICATION_URL >", value, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_URL >=", value, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlLessThan(String value) {
            addCriterion("APPLICATION_URL <", value, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_URL <=", value, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlLike(String value) {
            addCriterion("APPLICATION_URL like", value, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlNotLike(String value) {
            addCriterion("APPLICATION_URL not like", value, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlIn(List<String> values) {
            addCriterion("APPLICATION_URL in", values, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlNotIn(List<String> values) {
            addCriterion("APPLICATION_URL not in", values, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlBetween(String value1, String value2) {
            addCriterion("APPLICATION_URL between", value1, value2, "applicationUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationUrlNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_URL not between", value1, value2, "applicationUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}