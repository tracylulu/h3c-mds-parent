package com.h3c.mds.sysmgr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserGroupExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNotesgroupIsNull() {
            addCriterion("NotesGroup is null");
            return (Criteria) this;
        }

        public Criteria andNotesgroupIsNotNull() {
            addCriterion("NotesGroup is not null");
            return (Criteria) this;
        }

        public Criteria andNotesgroupEqualTo(String value) {
            addCriterion("NotesGroup =", value, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupNotEqualTo(String value) {
            addCriterion("NotesGroup <>", value, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupGreaterThan(String value) {
            addCriterion("NotesGroup >", value, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupGreaterThanOrEqualTo(String value) {
            addCriterion("NotesGroup >=", value, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupLessThan(String value) {
            addCriterion("NotesGroup <", value, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupLessThanOrEqualTo(String value) {
            addCriterion("NotesGroup <=", value, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupLike(String value) {
            addCriterion("NotesGroup like", value, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupNotLike(String value) {
            addCriterion("NotesGroup not like", value, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupIn(List<String> values) {
            addCriterion("NotesGroup in", values, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupNotIn(List<String> values) {
            addCriterion("NotesGroup not in", values, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupBetween(String value1, String value2) {
            addCriterion("NotesGroup between", value1, value2, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andNotesgroupNotBetween(String value1, String value2) {
            addCriterion("NotesGroup not between", value1, value2, "notesgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupIsNull() {
            addCriterion("AdmpGroup is null");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupIsNotNull() {
            addCriterion("AdmpGroup is not null");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupEqualTo(String value) {
            addCriterion("AdmpGroup =", value, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupNotEqualTo(String value) {
            addCriterion("AdmpGroup <>", value, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupGreaterThan(String value) {
            addCriterion("AdmpGroup >", value, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupGreaterThanOrEqualTo(String value) {
            addCriterion("AdmpGroup >=", value, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupLessThan(String value) {
            addCriterion("AdmpGroup <", value, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupLessThanOrEqualTo(String value) {
            addCriterion("AdmpGroup <=", value, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupLike(String value) {
            addCriterion("AdmpGroup like", value, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupNotLike(String value) {
            addCriterion("AdmpGroup not like", value, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupIn(List<String> values) {
            addCriterion("AdmpGroup in", values, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupNotIn(List<String> values) {
            addCriterion("AdmpGroup not in", values, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupBetween(String value1, String value2) {
            addCriterion("AdmpGroup between", value1, value2, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andAdmpgroupNotBetween(String value1, String value2) {
            addCriterion("AdmpGroup not between", value1, value2, "admpgroup");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeIsNull() {
            addCriterion("GroupUserCode is null");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeIsNotNull() {
            addCriterion("GroupUserCode is not null");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeEqualTo(String value) {
            addCriterion("GroupUserCode =", value, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeNotEqualTo(String value) {
            addCriterion("GroupUserCode <>", value, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeGreaterThan(String value) {
            addCriterion("GroupUserCode >", value, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeGreaterThanOrEqualTo(String value) {
            addCriterion("GroupUserCode >=", value, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeLessThan(String value) {
            addCriterion("GroupUserCode <", value, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeLessThanOrEqualTo(String value) {
            addCriterion("GroupUserCode <=", value, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeLike(String value) {
            addCriterion("GroupUserCode like", value, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeNotLike(String value) {
            addCriterion("GroupUserCode not like", value, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeIn(List<String> values) {
            addCriterion("GroupUserCode in", values, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeNotIn(List<String> values) {
            addCriterion("GroupUserCode not in", values, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeBetween(String value1, String value2) {
            addCriterion("GroupUserCode between", value1, value2, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andGroupusercodeNotBetween(String value1, String value2) {
            addCriterion("GroupUserCode not between", value1, value2, "groupusercode");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CreateUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CreateUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CreateUser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CreateUser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CreateUser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CreateUser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CreateUser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CreateUser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CreateUser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CreateUser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CreateUser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CreateUser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CreateUser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CreateUser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNull() {
            addCriterion("ModifyUser is null");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNotNull() {
            addCriterion("ModifyUser is not null");
            return (Criteria) this;
        }

        public Criteria andModifyuserEqualTo(String value) {
            addCriterion("ModifyUser =", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotEqualTo(String value) {
            addCriterion("ModifyUser <>", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThan(String value) {
            addCriterion("ModifyUser >", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyUser >=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThan(String value) {
            addCriterion("ModifyUser <", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThanOrEqualTo(String value) {
            addCriterion("ModifyUser <=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLike(String value) {
            addCriterion("ModifyUser like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotLike(String value) {
            addCriterion("ModifyUser not like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserIn(List<String> values) {
            addCriterion("ModifyUser in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotIn(List<String> values) {
            addCriterion("ModifyUser not in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserBetween(String value1, String value2) {
            addCriterion("ModifyUser between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotBetween(String value1, String value2) {
            addCriterion("ModifyUser not between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("ModifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
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