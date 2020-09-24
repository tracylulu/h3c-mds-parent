package com.h3c.mds.finance.entity;

import java.util.ArrayList;
import java.util.List;

public class FProjectProductRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FProjectProductRelExample() {
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

        public Criteria andFProjnoIsNull() {
            addCriterion("f_projno is null");
            return (Criteria) this;
        }

        public Criteria andFProjnoIsNotNull() {
            addCriterion("f_projno is not null");
            return (Criteria) this;
        }

        public Criteria andFProjnoEqualTo(String value) {
            addCriterion("f_projno =", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoNotEqualTo(String value) {
            addCriterion("f_projno <>", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoGreaterThan(String value) {
            addCriterion("f_projno >", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_projno >=", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoLessThan(String value) {
            addCriterion("f_projno <", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoLessThanOrEqualTo(String value) {
            addCriterion("f_projno <=", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoLike(String value) {
            addCriterion("f_projno like", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoNotLike(String value) {
            addCriterion("f_projno not like", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoIn(List<String> values) {
            addCriterion("f_projno in", values, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoNotIn(List<String> values) {
            addCriterion("f_projno not in", values, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoBetween(String value1, String value2) {
            addCriterion("f_projno between", value1, value2, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoNotBetween(String value1, String value2) {
            addCriterion("f_projno not between", value1, value2, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIsNull() {
            addCriterion("f_product_code is null");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIsNotNull() {
            addCriterion("f_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andFProductCodeEqualTo(String value) {
            addCriterion("f_product_code =", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotEqualTo(String value) {
            addCriterion("f_product_code <>", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeGreaterThan(String value) {
            addCriterion("f_product_code >", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_product_code >=", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLessThan(String value) {
            addCriterion("f_product_code <", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLessThanOrEqualTo(String value) {
            addCriterion("f_product_code <=", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLike(String value) {
            addCriterion("f_product_code like", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotLike(String value) {
            addCriterion("f_product_code not like", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIn(List<String> values) {
            addCriterion("f_product_code in", values, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotIn(List<String> values) {
            addCriterion("f_product_code not in", values, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeBetween(String value1, String value2) {
            addCriterion("f_product_code between", value1, value2, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotBetween(String value1, String value2) {
            addCriterion("f_product_code not between", value1, value2, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
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

        public Criteria andFOldProductCodeIsNull() {
            addCriterion("f_old_product_code is null");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeIsNotNull() {
            addCriterion("f_old_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeEqualTo(String value) {
            addCriterion("f_old_product_code =", value, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeNotEqualTo(String value) {
            addCriterion("f_old_product_code <>", value, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeGreaterThan(String value) {
            addCriterion("f_old_product_code >", value, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_product_code >=", value, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeLessThan(String value) {
            addCriterion("f_old_product_code <", value, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeLessThanOrEqualTo(String value) {
            addCriterion("f_old_product_code <=", value, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeLike(String value) {
            addCriterion("f_old_product_code like", value, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeNotLike(String value) {
            addCriterion("f_old_product_code not like", value, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeIn(List<String> values) {
            addCriterion("f_old_product_code in", values, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeNotIn(List<String> values) {
            addCriterion("f_old_product_code not in", values, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeBetween(String value1, String value2) {
            addCriterion("f_old_product_code between", value1, value2, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldProductCodeNotBetween(String value1, String value2) {
            addCriterion("f_old_product_code not between", value1, value2, "fOldProductCode");
            return (Criteria) this;
        }

        public Criteria andFOldRateIsNull() {
            addCriterion("f_old_rate is null");
            return (Criteria) this;
        }

        public Criteria andFOldRateIsNotNull() {
            addCriterion("f_old_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFOldRateEqualTo(String value) {
            addCriterion("f_old_rate =", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotEqualTo(String value) {
            addCriterion("f_old_rate <>", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateGreaterThan(String value) {
            addCriterion("f_old_rate >", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_rate >=", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateLessThan(String value) {
            addCriterion("f_old_rate <", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateLessThanOrEqualTo(String value) {
            addCriterion("f_old_rate <=", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateLike(String value) {
            addCriterion("f_old_rate like", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotLike(String value) {
            addCriterion("f_old_rate not like", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateIn(List<String> values) {
            addCriterion("f_old_rate in", values, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotIn(List<String> values) {
            addCriterion("f_old_rate not in", values, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateBetween(String value1, String value2) {
            addCriterion("f_old_rate between", value1, value2, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotBetween(String value1, String value2) {
            addCriterion("f_old_rate not between", value1, value2, "fOldRate");
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