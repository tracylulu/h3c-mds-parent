package com.h3c.mds.finance.entity;

import java.util.ArrayList;
import java.util.List;

public class FProdViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FProdViewExample() {
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

        public Criteria andProdlineIdIsNull() {
            addCriterion("PRODLINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdlineIdIsNotNull() {
            addCriterion("PRODLINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineIdEqualTo(Integer value) {
            addCriterion("PRODLINE_ID =", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdNotEqualTo(Integer value) {
            addCriterion("PRODLINE_ID <>", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdGreaterThan(Integer value) {
            addCriterion("PRODLINE_ID >", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODLINE_ID >=", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdLessThan(Integer value) {
            addCriterion("PRODLINE_ID <", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODLINE_ID <=", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdIn(List<Integer> values) {
            addCriterion("PRODLINE_ID in", values, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdNotIn(List<Integer> values) {
            addCriterion("PRODLINE_ID not in", values, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODLINE_ID between", value1, value2, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODLINE_ID not between", value1, value2, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineNoIsNull() {
            addCriterion("PRODLINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andProdlineNoIsNotNull() {
            addCriterion("PRODLINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineNoEqualTo(String value) {
            addCriterion("PRODLINE_NO =", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoNotEqualTo(String value) {
            addCriterion("PRODLINE_NO <>", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoGreaterThan(String value) {
            addCriterion("PRODLINE_NO >", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE_NO >=", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoLessThan(String value) {
            addCriterion("PRODLINE_NO <", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE_NO <=", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoLike(String value) {
            addCriterion("PRODLINE_NO like", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoNotLike(String value) {
            addCriterion("PRODLINE_NO not like", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoIn(List<String> values) {
            addCriterion("PRODLINE_NO in", values, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoNotIn(List<String> values) {
            addCriterion("PRODLINE_NO not in", values, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoBetween(String value1, String value2) {
            addCriterion("PRODLINE_NO between", value1, value2, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoNotBetween(String value1, String value2) {
            addCriterion("PRODLINE_NO not between", value1, value2, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineDescIsNull() {
            addCriterion("PRODLINE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProdlineDescIsNotNull() {
            addCriterion("PRODLINE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEqualTo(String value) {
            addCriterion("PRODLINE_DESC =", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescNotEqualTo(String value) {
            addCriterion("PRODLINE_DESC <>", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescGreaterThan(String value) {
            addCriterion("PRODLINE_DESC >", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE_DESC >=", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescLessThan(String value) {
            addCriterion("PRODLINE_DESC <", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE_DESC <=", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescLike(String value) {
            addCriterion("PRODLINE_DESC like", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescNotLike(String value) {
            addCriterion("PRODLINE_DESC not like", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescIn(List<String> values) {
            addCriterion("PRODLINE_DESC in", values, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescNotIn(List<String> values) {
            addCriterion("PRODLINE_DESC not in", values, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescBetween(String value1, String value2) {
            addCriterion("PRODLINE_DESC between", value1, value2, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescNotBetween(String value1, String value2) {
            addCriterion("PRODLINE_DESC not between", value1, value2, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdNoIsNull() {
            addCriterion("PROD_NO is null");
            return (Criteria) this;
        }

        public Criteria andProdNoIsNotNull() {
            addCriterion("PROD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProdNoEqualTo(String value) {
            addCriterion("PROD_NO =", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotEqualTo(String value) {
            addCriterion("PROD_NO <>", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoGreaterThan(String value) {
            addCriterion("PROD_NO >", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_NO >=", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoLessThan(String value) {
            addCriterion("PROD_NO <", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoLessThanOrEqualTo(String value) {
            addCriterion("PROD_NO <=", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoLike(String value) {
            addCriterion("PROD_NO like", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotLike(String value) {
            addCriterion("PROD_NO not like", value, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoIn(List<String> values) {
            addCriterion("PROD_NO in", values, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotIn(List<String> values) {
            addCriterion("PROD_NO not in", values, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoBetween(String value1, String value2) {
            addCriterion("PROD_NO between", value1, value2, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNoNotBetween(String value1, String value2) {
            addCriterion("PROD_NO not between", value1, value2, "prodNo");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("PROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("PROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("PROD_NAME =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("PROD_NAME <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("PROD_NAME >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_NAME >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("PROD_NAME <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("PROD_NAME <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("PROD_NAME like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("PROD_NAME not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("PROD_NAME in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("PROD_NAME not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("PROD_NAME between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("PROD_NAME not between", value1, value2, "prodName");
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