package com.h3c.mds.sysmgr.entity;

import java.util.ArrayList;
import java.util.List;

public class UserRoleRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRoleRelationExample() {
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

        public Criteria andHurrIdIsNull() {
            addCriterion("HURR_ID is null");
            return (Criteria) this;
        }

        public Criteria andHurrIdIsNotNull() {
            addCriterion("HURR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHurrIdEqualTo(Integer value) {
            addCriterion("HURR_ID =", value, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdNotEqualTo(Integer value) {
            addCriterion("HURR_ID <>", value, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdGreaterThan(Integer value) {
            addCriterion("HURR_ID >", value, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HURR_ID >=", value, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdLessThan(Integer value) {
            addCriterion("HURR_ID <", value, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdLessThanOrEqualTo(Integer value) {
            addCriterion("HURR_ID <=", value, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdIn(List<Integer> values) {
            addCriterion("HURR_ID in", values, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdNotIn(List<Integer> values) {
            addCriterion("HURR_ID not in", values, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdBetween(Integer value1, Integer value2) {
            addCriterion("HURR_ID between", value1, value2, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HURR_ID not between", value1, value2, "hurrId");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeIsNull() {
            addCriterion("HURR_HUL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeIsNotNull() {
            addCriterion("HURR_HUL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeEqualTo(String value) {
            addCriterion("HURR_HUL_CODE =", value, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeNotEqualTo(String value) {
            addCriterion("HURR_HUL_CODE <>", value, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeGreaterThan(String value) {
            addCriterion("HURR_HUL_CODE >", value, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HURR_HUL_CODE >=", value, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeLessThan(String value) {
            addCriterion("HURR_HUL_CODE <", value, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeLessThanOrEqualTo(String value) {
            addCriterion("HURR_HUL_CODE <=", value, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeLike(String value) {
            addCriterion("HURR_HUL_CODE like", value, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeNotLike(String value) {
            addCriterion("HURR_HUL_CODE not like", value, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeIn(List<String> values) {
            addCriterion("HURR_HUL_CODE in", values, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeNotIn(List<String> values) {
            addCriterion("HURR_HUL_CODE not in", values, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeBetween(String value1, String value2) {
            addCriterion("HURR_HUL_CODE between", value1, value2, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHulCodeNotBetween(String value1, String value2) {
            addCriterion("HURR_HUL_CODE not between", value1, value2, "hurrHulCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeIsNull() {
            addCriterion("HURR_HRL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeIsNotNull() {
            addCriterion("HURR_HRL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeEqualTo(String value) {
            addCriterion("HURR_HRL_CODE =", value, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeNotEqualTo(String value) {
            addCriterion("HURR_HRL_CODE <>", value, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeGreaterThan(String value) {
            addCriterion("HURR_HRL_CODE >", value, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HURR_HRL_CODE >=", value, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeLessThan(String value) {
            addCriterion("HURR_HRL_CODE <", value, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeLessThanOrEqualTo(String value) {
            addCriterion("HURR_HRL_CODE <=", value, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeLike(String value) {
            addCriterion("HURR_HRL_CODE like", value, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeNotLike(String value) {
            addCriterion("HURR_HRL_CODE not like", value, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeIn(List<String> values) {
            addCriterion("HURR_HRL_CODE in", values, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeNotIn(List<String> values) {
            addCriterion("HURR_HRL_CODE not in", values, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeBetween(String value1, String value2) {
            addCriterion("HURR_HRL_CODE between", value1, value2, "hurrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHurrHrlCodeNotBetween(String value1, String value2) {
            addCriterion("HURR_HRL_CODE not between", value1, value2, "hurrHrlCode");
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