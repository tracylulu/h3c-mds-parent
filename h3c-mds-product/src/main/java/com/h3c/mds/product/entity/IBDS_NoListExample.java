package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.List;

public class IBDS_NoListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_NoListExample() {
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

        public Criteria andInfonameIsNull() {
            addCriterion("InfoName is null");
            return (Criteria) this;
        }

        public Criteria andInfonameIsNotNull() {
            addCriterion("InfoName is not null");
            return (Criteria) this;
        }

        public Criteria andInfonameEqualTo(String value) {
            addCriterion("InfoName =", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotEqualTo(String value) {
            addCriterion("InfoName <>", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameGreaterThan(String value) {
            addCriterion("InfoName >", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameGreaterThanOrEqualTo(String value) {
            addCriterion("InfoName >=", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLessThan(String value) {
            addCriterion("InfoName <", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLessThanOrEqualTo(String value) {
            addCriterion("InfoName <=", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLike(String value) {
            addCriterion("InfoName like", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotLike(String value) {
            addCriterion("InfoName not like", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameIn(List<String> values) {
            addCriterion("InfoName in", values, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotIn(List<String> values) {
            addCriterion("InfoName not in", values, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameBetween(String value1, String value2) {
            addCriterion("InfoName between", value1, value2, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotBetween(String value1, String value2) {
            addCriterion("InfoName not between", value1, value2, "infoname");
            return (Criteria) this;
        }

        public Criteria andCodemarkIsNull() {
            addCriterion("CodeMark is null");
            return (Criteria) this;
        }

        public Criteria andCodemarkIsNotNull() {
            addCriterion("CodeMark is not null");
            return (Criteria) this;
        }

        public Criteria andCodemarkEqualTo(String value) {
            addCriterion("CodeMark =", value, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkNotEqualTo(String value) {
            addCriterion("CodeMark <>", value, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkGreaterThan(String value) {
            addCriterion("CodeMark >", value, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CodeMark >=", value, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkLessThan(String value) {
            addCriterion("CodeMark <", value, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkLessThanOrEqualTo(String value) {
            addCriterion("CodeMark <=", value, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkLike(String value) {
            addCriterion("CodeMark like", value, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkNotLike(String value) {
            addCriterion("CodeMark not like", value, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkIn(List<String> values) {
            addCriterion("CodeMark in", values, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkNotIn(List<String> values) {
            addCriterion("CodeMark not in", values, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkBetween(String value1, String value2) {
            addCriterion("CodeMark between", value1, value2, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodemarkNotBetween(String value1, String value2) {
            addCriterion("CodeMark not between", value1, value2, "codemark");
            return (Criteria) this;
        }

        public Criteria andCodelengthIsNull() {
            addCriterion("CodeLength is null");
            return (Criteria) this;
        }

        public Criteria andCodelengthIsNotNull() {
            addCriterion("CodeLength is not null");
            return (Criteria) this;
        }

        public Criteria andCodelengthEqualTo(Integer value) {
            addCriterion("CodeLength =", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotEqualTo(Integer value) {
            addCriterion("CodeLength <>", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthGreaterThan(Integer value) {
            addCriterion("CodeLength >", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("CodeLength >=", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthLessThan(Integer value) {
            addCriterion("CodeLength <", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthLessThanOrEqualTo(Integer value) {
            addCriterion("CodeLength <=", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthIn(List<Integer> values) {
            addCriterion("CodeLength in", values, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotIn(List<Integer> values) {
            addCriterion("CodeLength not in", values, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthBetween(Integer value1, Integer value2) {
            addCriterion("CodeLength between", value1, value2, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotBetween(Integer value1, Integer value2) {
            addCriterion("CodeLength not between", value1, value2, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelastIsNull() {
            addCriterion("CodeLast is null");
            return (Criteria) this;
        }

        public Criteria andCodelastIsNotNull() {
            addCriterion("CodeLast is not null");
            return (Criteria) this;
        }

        public Criteria andCodelastEqualTo(String value) {
            addCriterion("CodeLast =", value, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastNotEqualTo(String value) {
            addCriterion("CodeLast <>", value, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastGreaterThan(String value) {
            addCriterion("CodeLast >", value, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastGreaterThanOrEqualTo(String value) {
            addCriterion("CodeLast >=", value, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastLessThan(String value) {
            addCriterion("CodeLast <", value, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastLessThanOrEqualTo(String value) {
            addCriterion("CodeLast <=", value, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastLike(String value) {
            addCriterion("CodeLast like", value, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastNotLike(String value) {
            addCriterion("CodeLast not like", value, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastIn(List<String> values) {
            addCriterion("CodeLast in", values, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastNotIn(List<String> values) {
            addCriterion("CodeLast not in", values, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastBetween(String value1, String value2) {
            addCriterion("CodeLast between", value1, value2, "codelast");
            return (Criteria) this;
        }

        public Criteria andCodelastNotBetween(String value1, String value2) {
            addCriterion("CodeLast not between", value1, value2, "codelast");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("Flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Flag not between", value1, value2, "flag");
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