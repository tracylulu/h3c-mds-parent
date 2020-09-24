package com.h3c.mds.sysmgr.entity;

import java.util.ArrayList;
import java.util.List;

public class RoleResourceRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleResourceRelationExample() {
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

        public Criteria andHrrrIdIsNull() {
            addCriterion("HRRR_ID is null");
            return (Criteria) this;
        }

        public Criteria andHrrrIdIsNotNull() {
            addCriterion("HRRR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHrrrIdEqualTo(Integer value) {
            addCriterion("HRRR_ID =", value, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdNotEqualTo(Integer value) {
            addCriterion("HRRR_ID <>", value, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdGreaterThan(Integer value) {
            addCriterion("HRRR_ID >", value, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HRRR_ID >=", value, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdLessThan(Integer value) {
            addCriterion("HRRR_ID <", value, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdLessThanOrEqualTo(Integer value) {
            addCriterion("HRRR_ID <=", value, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdIn(List<Integer> values) {
            addCriterion("HRRR_ID in", values, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdNotIn(List<Integer> values) {
            addCriterion("HRRR_ID not in", values, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdBetween(Integer value1, Integer value2) {
            addCriterion("HRRR_ID between", value1, value2, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HRRR_ID not between", value1, value2, "hrrrId");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeIsNull() {
            addCriterion("HRRR_HRL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeIsNotNull() {
            addCriterion("HRRR_HRL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeEqualTo(String value) {
            addCriterion("HRRR_HRL_CODE =", value, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeNotEqualTo(String value) {
            addCriterion("HRRR_HRL_CODE <>", value, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeGreaterThan(String value) {
            addCriterion("HRRR_HRL_CODE >", value, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HRRR_HRL_CODE >=", value, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeLessThan(String value) {
            addCriterion("HRRR_HRL_CODE <", value, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeLessThanOrEqualTo(String value) {
            addCriterion("HRRR_HRL_CODE <=", value, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeLike(String value) {
            addCriterion("HRRR_HRL_CODE like", value, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeNotLike(String value) {
            addCriterion("HRRR_HRL_CODE not like", value, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeIn(List<String> values) {
            addCriterion("HRRR_HRL_CODE in", values, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeNotIn(List<String> values) {
            addCriterion("HRRR_HRL_CODE not in", values, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeBetween(String value1, String value2) {
            addCriterion("HRRR_HRL_CODE between", value1, value2, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHrlCodeNotBetween(String value1, String value2) {
            addCriterion("HRRR_HRL_CODE not between", value1, value2, "hrrrHrlCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeIsNull() {
            addCriterion("HRRR_HRES_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeIsNotNull() {
            addCriterion("HRRR_HRES_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeEqualTo(String value) {
            addCriterion("HRRR_HRES_CODE =", value, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeNotEqualTo(String value) {
            addCriterion("HRRR_HRES_CODE <>", value, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeGreaterThan(String value) {
            addCriterion("HRRR_HRES_CODE >", value, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HRRR_HRES_CODE >=", value, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeLessThan(String value) {
            addCriterion("HRRR_HRES_CODE <", value, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeLessThanOrEqualTo(String value) {
            addCriterion("HRRR_HRES_CODE <=", value, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeLike(String value) {
            addCriterion("HRRR_HRES_CODE like", value, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeNotLike(String value) {
            addCriterion("HRRR_HRES_CODE not like", value, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeIn(List<String> values) {
            addCriterion("HRRR_HRES_CODE in", values, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeNotIn(List<String> values) {
            addCriterion("HRRR_HRES_CODE not in", values, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeBetween(String value1, String value2) {
            addCriterion("HRRR_HRES_CODE between", value1, value2, "hrrrHresCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHresCodeNotBetween(String value1, String value2) {
            addCriterion("HRRR_HRES_CODE not between", value1, value2, "hrrrHresCode");
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