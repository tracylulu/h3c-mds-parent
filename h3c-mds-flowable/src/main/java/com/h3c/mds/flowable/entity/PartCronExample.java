package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.List;

public class PartCronExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartCronExample() {
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

        public Criteria andCronIdIsNull() {
            addCriterion("cron_id is null");
            return (Criteria) this;
        }

        public Criteria andCronIdIsNotNull() {
            addCriterion("cron_id is not null");
            return (Criteria) this;
        }

        public Criteria andCronIdEqualTo(Integer value) {
            addCriterion("cron_id =", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotEqualTo(Integer value) {
            addCriterion("cron_id <>", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdGreaterThan(Integer value) {
            addCriterion("cron_id >", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cron_id >=", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdLessThan(Integer value) {
            addCriterion("cron_id <", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdLessThanOrEqualTo(Integer value) {
            addCriterion("cron_id <=", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdIn(List<Integer> values) {
            addCriterion("cron_id in", values, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotIn(List<Integer> values) {
            addCriterion("cron_id not in", values, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdBetween(Integer value1, Integer value2) {
            addCriterion("cron_id between", value1, value2, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cron_id not between", value1, value2, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronTypeIsNull() {
            addCriterion("cron_type is null");
            return (Criteria) this;
        }

        public Criteria andCronTypeIsNotNull() {
            addCriterion("cron_type is not null");
            return (Criteria) this;
        }

        public Criteria andCronTypeEqualTo(String value) {
            addCriterion("cron_type =", value, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeNotEqualTo(String value) {
            addCriterion("cron_type <>", value, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeGreaterThan(String value) {
            addCriterion("cron_type >", value, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cron_type >=", value, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeLessThan(String value) {
            addCriterion("cron_type <", value, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeLessThanOrEqualTo(String value) {
            addCriterion("cron_type <=", value, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeLike(String value) {
            addCriterion("cron_type like", value, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeNotLike(String value) {
            addCriterion("cron_type not like", value, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeIn(List<String> values) {
            addCriterion("cron_type in", values, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeNotIn(List<String> values) {
            addCriterion("cron_type not in", values, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeBetween(String value1, String value2) {
            addCriterion("cron_type between", value1, value2, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronTypeNotBetween(String value1, String value2) {
            addCriterion("cron_type not between", value1, value2, "cronType");
            return (Criteria) this;
        }

        public Criteria andCronIsNull() {
            addCriterion("cron is null");
            return (Criteria) this;
        }

        public Criteria andCronIsNotNull() {
            addCriterion("cron is not null");
            return (Criteria) this;
        }

        public Criteria andCronEqualTo(String value) {
            addCriterion("cron =", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotEqualTo(String value) {
            addCriterion("cron <>", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThan(String value) {
            addCriterion("cron >", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThanOrEqualTo(String value) {
            addCriterion("cron >=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThan(String value) {
            addCriterion("cron <", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThanOrEqualTo(String value) {
            addCriterion("cron <=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLike(String value) {
            addCriterion("cron like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotLike(String value) {
            addCriterion("cron not like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronIn(List<String> values) {
            addCriterion("cron in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotIn(List<String> values) {
            addCriterion("cron not in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronBetween(String value1, String value2) {
            addCriterion("cron between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotBetween(String value1, String value2) {
            addCriterion("cron not between", value1, value2, "cron");
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