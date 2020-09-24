package com.h3c.mds.sysmgr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andHrlIdIsNull() {
            addCriterion("HRL_ID is null");
            return (Criteria) this;
        }

        public Criteria andHrlIdIsNotNull() {
            addCriterion("HRL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHrlIdEqualTo(Integer value) {
            addCriterion("HRL_ID =", value, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdNotEqualTo(Integer value) {
            addCriterion("HRL_ID <>", value, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdGreaterThan(Integer value) {
            addCriterion("HRL_ID >", value, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HRL_ID >=", value, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdLessThan(Integer value) {
            addCriterion("HRL_ID <", value, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdLessThanOrEqualTo(Integer value) {
            addCriterion("HRL_ID <=", value, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdIn(List<Integer> values) {
            addCriterion("HRL_ID in", values, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdNotIn(List<Integer> values) {
            addCriterion("HRL_ID not in", values, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdBetween(Integer value1, Integer value2) {
            addCriterion("HRL_ID between", value1, value2, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HRL_ID not between", value1, value2, "hrlId");
            return (Criteria) this;
        }

        public Criteria andHrlNameIsNull() {
            addCriterion("HRL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHrlNameIsNotNull() {
            addCriterion("HRL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHrlNameEqualTo(String value) {
            addCriterion("HRL_NAME =", value, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameNotEqualTo(String value) {
            addCriterion("HRL_NAME <>", value, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameGreaterThan(String value) {
            addCriterion("HRL_NAME >", value, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameGreaterThanOrEqualTo(String value) {
            addCriterion("HRL_NAME >=", value, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameLessThan(String value) {
            addCriterion("HRL_NAME <", value, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameLessThanOrEqualTo(String value) {
            addCriterion("HRL_NAME <=", value, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameLike(String value) {
            addCriterion("HRL_NAME like", value, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameNotLike(String value) {
            addCriterion("HRL_NAME not like", value, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameIn(List<String> values) {
            addCriterion("HRL_NAME in", values, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameNotIn(List<String> values) {
            addCriterion("HRL_NAME not in", values, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameBetween(String value1, String value2) {
            addCriterion("HRL_NAME between", value1, value2, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlNameNotBetween(String value1, String value2) {
            addCriterion("HRL_NAME not between", value1, value2, "hrlName");
            return (Criteria) this;
        }

        public Criteria andHrlCodeIsNull() {
            addCriterion("HRL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHrlCodeIsNotNull() {
            addCriterion("HRL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHrlCodeEqualTo(String value) {
            addCriterion("HRL_CODE =", value, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeNotEqualTo(String value) {
            addCriterion("HRL_CODE <>", value, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeGreaterThan(String value) {
            addCriterion("HRL_CODE >", value, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HRL_CODE >=", value, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeLessThan(String value) {
            addCriterion("HRL_CODE <", value, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeLessThanOrEqualTo(String value) {
            addCriterion("HRL_CODE <=", value, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeLike(String value) {
            addCriterion("HRL_CODE like", value, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeNotLike(String value) {
            addCriterion("HRL_CODE not like", value, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeIn(List<String> values) {
            addCriterion("HRL_CODE in", values, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeNotIn(List<String> values) {
            addCriterion("HRL_CODE not in", values, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeBetween(String value1, String value2) {
            addCriterion("HRL_CODE between", value1, value2, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCodeNotBetween(String value1, String value2) {
            addCriterion("HRL_CODE not between", value1, value2, "hrlCode");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserIsNull() {
            addCriterion("HRL_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserIsNotNull() {
            addCriterion("HRL_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserEqualTo(String value) {
            addCriterion("HRL_CREATE_USER =", value, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserNotEqualTo(String value) {
            addCriterion("HRL_CREATE_USER <>", value, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserGreaterThan(String value) {
            addCriterion("HRL_CREATE_USER >", value, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("HRL_CREATE_USER >=", value, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserLessThan(String value) {
            addCriterion("HRL_CREATE_USER <", value, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserLessThanOrEqualTo(String value) {
            addCriterion("HRL_CREATE_USER <=", value, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserLike(String value) {
            addCriterion("HRL_CREATE_USER like", value, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserNotLike(String value) {
            addCriterion("HRL_CREATE_USER not like", value, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserIn(List<String> values) {
            addCriterion("HRL_CREATE_USER in", values, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserNotIn(List<String> values) {
            addCriterion("HRL_CREATE_USER not in", values, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserBetween(String value1, String value2) {
            addCriterion("HRL_CREATE_USER between", value1, value2, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateUserNotBetween(String value1, String value2) {
            addCriterion("HRL_CREATE_USER not between", value1, value2, "hrlCreateUser");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateIsNull() {
            addCriterion("HRL_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateIsNotNull() {
            addCriterion("HRL_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateEqualTo(Date value) {
            addCriterion("HRL_CREATE_DATE =", value, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateNotEqualTo(Date value) {
            addCriterion("HRL_CREATE_DATE <>", value, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateGreaterThan(Date value) {
            addCriterion("HRL_CREATE_DATE >", value, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("HRL_CREATE_DATE >=", value, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateLessThan(Date value) {
            addCriterion("HRL_CREATE_DATE <", value, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("HRL_CREATE_DATE <=", value, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateIn(List<Date> values) {
            addCriterion("HRL_CREATE_DATE in", values, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateNotIn(List<Date> values) {
            addCriterion("HRL_CREATE_DATE not in", values, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateBetween(Date value1, Date value2) {
            addCriterion("HRL_CREATE_DATE between", value1, value2, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("HRL_CREATE_DATE not between", value1, value2, "hrlCreateDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserIsNull() {
            addCriterion("HRL_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserIsNotNull() {
            addCriterion("HRL_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserEqualTo(String value) {
            addCriterion("HRL_MODIFY_USER =", value, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserNotEqualTo(String value) {
            addCriterion("HRL_MODIFY_USER <>", value, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserGreaterThan(String value) {
            addCriterion("HRL_MODIFY_USER >", value, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("HRL_MODIFY_USER >=", value, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserLessThan(String value) {
            addCriterion("HRL_MODIFY_USER <", value, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserLessThanOrEqualTo(String value) {
            addCriterion("HRL_MODIFY_USER <=", value, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserLike(String value) {
            addCriterion("HRL_MODIFY_USER like", value, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserNotLike(String value) {
            addCriterion("HRL_MODIFY_USER not like", value, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserIn(List<String> values) {
            addCriterion("HRL_MODIFY_USER in", values, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserNotIn(List<String> values) {
            addCriterion("HRL_MODIFY_USER not in", values, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserBetween(String value1, String value2) {
            addCriterion("HRL_MODIFY_USER between", value1, value2, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyUserNotBetween(String value1, String value2) {
            addCriterion("HRL_MODIFY_USER not between", value1, value2, "hrlModifyUser");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateIsNull() {
            addCriterion("HRL_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateIsNotNull() {
            addCriterion("HRL_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateEqualTo(Date value) {
            addCriterion("HRL_MODIFY_DATE =", value, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateNotEqualTo(Date value) {
            addCriterion("HRL_MODIFY_DATE <>", value, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateGreaterThan(Date value) {
            addCriterion("HRL_MODIFY_DATE >", value, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("HRL_MODIFY_DATE >=", value, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateLessThan(Date value) {
            addCriterion("HRL_MODIFY_DATE <", value, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("HRL_MODIFY_DATE <=", value, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateIn(List<Date> values) {
            addCriterion("HRL_MODIFY_DATE in", values, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateNotIn(List<Date> values) {
            addCriterion("HRL_MODIFY_DATE not in", values, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateBetween(Date value1, Date value2) {
            addCriterion("HRL_MODIFY_DATE between", value1, value2, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andHrlModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("HRL_MODIFY_DATE not between", value1, value2, "hrlModifyDate");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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