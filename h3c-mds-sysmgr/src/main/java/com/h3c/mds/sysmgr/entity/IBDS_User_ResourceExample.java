package com.h3c.mds.sysmgr.entity;

import java.util.ArrayList;
import java.util.List;

public class IBDS_User_ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_User_ResourceExample() {
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

        public Criteria andHrrrHulCodeIsNull() {
            addCriterion("HRRR_HUL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeIsNotNull() {
            addCriterion("HRRR_HUL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeEqualTo(String value) {
            addCriterion("HRRR_HUL_CODE =", value, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeNotEqualTo(String value) {
            addCriterion("HRRR_HUL_CODE <>", value, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeGreaterThan(String value) {
            addCriterion("HRRR_HUL_CODE >", value, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HRRR_HUL_CODE >=", value, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeLessThan(String value) {
            addCriterion("HRRR_HUL_CODE <", value, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeLessThanOrEqualTo(String value) {
            addCriterion("HRRR_HUL_CODE <=", value, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeLike(String value) {
            addCriterion("HRRR_HUL_CODE like", value, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeNotLike(String value) {
            addCriterion("HRRR_HUL_CODE not like", value, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeIn(List<String> values) {
            addCriterion("HRRR_HUL_CODE in", values, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeNotIn(List<String> values) {
            addCriterion("HRRR_HUL_CODE not in", values, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeBetween(String value1, String value2) {
            addCriterion("HRRR_HUL_CODE between", value1, value2, "hrrrHulCode");
            return (Criteria) this;
        }

        public Criteria andHrrrHulCodeNotBetween(String value1, String value2) {
            addCriterion("HRRR_HUL_CODE not between", value1, value2, "hrrrHulCode");
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