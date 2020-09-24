package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.List;

public class IBDSNotesReleaseTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDSNotesReleaseTempExample() {
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

        public Criteria andFldbversion1IsNull() {
            addCriterion("fldBversion_1 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion1IsNotNull() {
            addCriterion("fldBversion_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion1EqualTo(String value) {
            addCriterion("fldBversion_1 =", value, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1NotEqualTo(String value) {
            addCriterion("fldBversion_1 <>", value, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1GreaterThan(String value) {
            addCriterion("fldBversion_1 >", value, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_1 >=", value, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1LessThan(String value) {
            addCriterion("fldBversion_1 <", value, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_1 <=", value, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1Like(String value) {
            addCriterion("fldBversion_1 like", value, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1NotLike(String value) {
            addCriterion("fldBversion_1 not like", value, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1In(List<String> values) {
            addCriterion("fldBversion_1 in", values, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1NotIn(List<String> values) {
            addCriterion("fldBversion_1 not in", values, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1Between(String value1, String value2) {
            addCriterion("fldBversion_1 between", value1, value2, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion1NotBetween(String value1, String value2) {
            addCriterion("fldBversion_1 not between", value1, value2, "fldbversion1");
            return (Criteria) this;
        }

        public Criteria andFldbversion2IsNull() {
            addCriterion("fldBversion_2 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion2IsNotNull() {
            addCriterion("fldBversion_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion2EqualTo(String value) {
            addCriterion("fldBversion_2 =", value, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2NotEqualTo(String value) {
            addCriterion("fldBversion_2 <>", value, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2GreaterThan(String value) {
            addCriterion("fldBversion_2 >", value, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_2 >=", value, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2LessThan(String value) {
            addCriterion("fldBversion_2 <", value, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_2 <=", value, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2Like(String value) {
            addCriterion("fldBversion_2 like", value, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2NotLike(String value) {
            addCriterion("fldBversion_2 not like", value, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2In(List<String> values) {
            addCriterion("fldBversion_2 in", values, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2NotIn(List<String> values) {
            addCriterion("fldBversion_2 not in", values, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2Between(String value1, String value2) {
            addCriterion("fldBversion_2 between", value1, value2, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion2NotBetween(String value1, String value2) {
            addCriterion("fldBversion_2 not between", value1, value2, "fldbversion2");
            return (Criteria) this;
        }

        public Criteria andFldbversion3IsNull() {
            addCriterion("fldBversion_3 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion3IsNotNull() {
            addCriterion("fldBversion_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion3EqualTo(String value) {
            addCriterion("fldBversion_3 =", value, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3NotEqualTo(String value) {
            addCriterion("fldBversion_3 <>", value, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3GreaterThan(String value) {
            addCriterion("fldBversion_3 >", value, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_3 >=", value, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3LessThan(String value) {
            addCriterion("fldBversion_3 <", value, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_3 <=", value, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3Like(String value) {
            addCriterion("fldBversion_3 like", value, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3NotLike(String value) {
            addCriterion("fldBversion_3 not like", value, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3In(List<String> values) {
            addCriterion("fldBversion_3 in", values, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3NotIn(List<String> values) {
            addCriterion("fldBversion_3 not in", values, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3Between(String value1, String value2) {
            addCriterion("fldBversion_3 between", value1, value2, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion3NotBetween(String value1, String value2) {
            addCriterion("fldBversion_3 not between", value1, value2, "fldbversion3");
            return (Criteria) this;
        }

        public Criteria andFldbversion4IsNull() {
            addCriterion("fldBversion_4 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion4IsNotNull() {
            addCriterion("fldBversion_4 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion4EqualTo(String value) {
            addCriterion("fldBversion_4 =", value, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4NotEqualTo(String value) {
            addCriterion("fldBversion_4 <>", value, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4GreaterThan(String value) {
            addCriterion("fldBversion_4 >", value, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_4 >=", value, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4LessThan(String value) {
            addCriterion("fldBversion_4 <", value, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_4 <=", value, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4Like(String value) {
            addCriterion("fldBversion_4 like", value, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4NotLike(String value) {
            addCriterion("fldBversion_4 not like", value, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4In(List<String> values) {
            addCriterion("fldBversion_4 in", values, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4NotIn(List<String> values) {
            addCriterion("fldBversion_4 not in", values, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4Between(String value1, String value2) {
            addCriterion("fldBversion_4 between", value1, value2, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbversion4NotBetween(String value1, String value2) {
            addCriterion("fldBversion_4 not between", value1, value2, "fldbversion4");
            return (Criteria) this;
        }

        public Criteria andFldbver1IsNull() {
            addCriterion("fldBver_1 is null");
            return (Criteria) this;
        }

        public Criteria andFldbver1IsNotNull() {
            addCriterion("fldBver_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbver1EqualTo(String value) {
            addCriterion("fldBver_1 =", value, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1NotEqualTo(String value) {
            addCriterion("fldBver_1 <>", value, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1GreaterThan(String value) {
            addCriterion("fldBver_1 >", value, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1GreaterThanOrEqualTo(String value) {
            addCriterion("fldBver_1 >=", value, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1LessThan(String value) {
            addCriterion("fldBver_1 <", value, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1LessThanOrEqualTo(String value) {
            addCriterion("fldBver_1 <=", value, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1Like(String value) {
            addCriterion("fldBver_1 like", value, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1NotLike(String value) {
            addCriterion("fldBver_1 not like", value, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1In(List<String> values) {
            addCriterion("fldBver_1 in", values, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1NotIn(List<String> values) {
            addCriterion("fldBver_1 not in", values, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1Between(String value1, String value2) {
            addCriterion("fldBver_1 between", value1, value2, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbver1NotBetween(String value1, String value2) {
            addCriterion("fldBver_1 not between", value1, value2, "fldbver1");
            return (Criteria) this;
        }

        public Criteria andFldbversion5IsNull() {
            addCriterion("fldBversion_5 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion5IsNotNull() {
            addCriterion("fldBversion_5 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion5EqualTo(String value) {
            addCriterion("fldBversion_5 =", value, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5NotEqualTo(String value) {
            addCriterion("fldBversion_5 <>", value, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5GreaterThan(String value) {
            addCriterion("fldBversion_5 >", value, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_5 >=", value, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5LessThan(String value) {
            addCriterion("fldBversion_5 <", value, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_5 <=", value, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5Like(String value) {
            addCriterion("fldBversion_5 like", value, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5NotLike(String value) {
            addCriterion("fldBversion_5 not like", value, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5In(List<String> values) {
            addCriterion("fldBversion_5 in", values, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5NotIn(List<String> values) {
            addCriterion("fldBversion_5 not in", values, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5Between(String value1, String value2) {
            addCriterion("fldBversion_5 between", value1, value2, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion5NotBetween(String value1, String value2) {
            addCriterion("fldBversion_5 not between", value1, value2, "fldbversion5");
            return (Criteria) this;
        }

        public Criteria andFldbversion6IsNull() {
            addCriterion("fldBversion_6 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion6IsNotNull() {
            addCriterion("fldBversion_6 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion6EqualTo(String value) {
            addCriterion("fldBversion_6 =", value, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6NotEqualTo(String value) {
            addCriterion("fldBversion_6 <>", value, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6GreaterThan(String value) {
            addCriterion("fldBversion_6 >", value, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_6 >=", value, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6LessThan(String value) {
            addCriterion("fldBversion_6 <", value, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_6 <=", value, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6Like(String value) {
            addCriterion("fldBversion_6 like", value, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6NotLike(String value) {
            addCriterion("fldBversion_6 not like", value, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6In(List<String> values) {
            addCriterion("fldBversion_6 in", values, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6NotIn(List<String> values) {
            addCriterion("fldBversion_6 not in", values, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6Between(String value1, String value2) {
            addCriterion("fldBversion_6 between", value1, value2, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion6NotBetween(String value1, String value2) {
            addCriterion("fldBversion_6 not between", value1, value2, "fldbversion6");
            return (Criteria) this;
        }

        public Criteria andFldbversion7IsNull() {
            addCriterion("fldBversion_7 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion7IsNotNull() {
            addCriterion("fldBversion_7 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion7EqualTo(String value) {
            addCriterion("fldBversion_7 =", value, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7NotEqualTo(String value) {
            addCriterion("fldBversion_7 <>", value, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7GreaterThan(String value) {
            addCriterion("fldBversion_7 >", value, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_7 >=", value, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7LessThan(String value) {
            addCriterion("fldBversion_7 <", value, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_7 <=", value, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7Like(String value) {
            addCriterion("fldBversion_7 like", value, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7NotLike(String value) {
            addCriterion("fldBversion_7 not like", value, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7In(List<String> values) {
            addCriterion("fldBversion_7 in", values, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7NotIn(List<String> values) {
            addCriterion("fldBversion_7 not in", values, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7Between(String value1, String value2) {
            addCriterion("fldBversion_7 between", value1, value2, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion7NotBetween(String value1, String value2) {
            addCriterion("fldBversion_7 not between", value1, value2, "fldbversion7");
            return (Criteria) this;
        }

        public Criteria andFldbversion8IsNull() {
            addCriterion("fldBversion_8 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion8IsNotNull() {
            addCriterion("fldBversion_8 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion8EqualTo(String value) {
            addCriterion("fldBversion_8 =", value, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8NotEqualTo(String value) {
            addCriterion("fldBversion_8 <>", value, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8GreaterThan(String value) {
            addCriterion("fldBversion_8 >", value, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_8 >=", value, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8LessThan(String value) {
            addCriterion("fldBversion_8 <", value, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_8 <=", value, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8Like(String value) {
            addCriterion("fldBversion_8 like", value, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8NotLike(String value) {
            addCriterion("fldBversion_8 not like", value, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8In(List<String> values) {
            addCriterion("fldBversion_8 in", values, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8NotIn(List<String> values) {
            addCriterion("fldBversion_8 not in", values, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8Between(String value1, String value2) {
            addCriterion("fldBversion_8 between", value1, value2, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion8NotBetween(String value1, String value2) {
            addCriterion("fldBversion_8 not between", value1, value2, "fldbversion8");
            return (Criteria) this;
        }

        public Criteria andFldbversion9IsNull() {
            addCriterion("fldBversion_9 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion9IsNotNull() {
            addCriterion("fldBversion_9 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion9EqualTo(String value) {
            addCriterion("fldBversion_9 =", value, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9NotEqualTo(String value) {
            addCriterion("fldBversion_9 <>", value, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9GreaterThan(String value) {
            addCriterion("fldBversion_9 >", value, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_9 >=", value, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9LessThan(String value) {
            addCriterion("fldBversion_9 <", value, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_9 <=", value, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9Like(String value) {
            addCriterion("fldBversion_9 like", value, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9NotLike(String value) {
            addCriterion("fldBversion_9 not like", value, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9In(List<String> values) {
            addCriterion("fldBversion_9 in", values, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9NotIn(List<String> values) {
            addCriterion("fldBversion_9 not in", values, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9Between(String value1, String value2) {
            addCriterion("fldBversion_9 between", value1, value2, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion9NotBetween(String value1, String value2) {
            addCriterion("fldBversion_9 not between", value1, value2, "fldbversion9");
            return (Criteria) this;
        }

        public Criteria andFldbversion10IsNull() {
            addCriterion("fldBversion_10 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion10IsNotNull() {
            addCriterion("fldBversion_10 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion10EqualTo(String value) {
            addCriterion("fldBversion_10 =", value, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10NotEqualTo(String value) {
            addCriterion("fldBversion_10 <>", value, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10GreaterThan(String value) {
            addCriterion("fldBversion_10 >", value, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_10 >=", value, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10LessThan(String value) {
            addCriterion("fldBversion_10 <", value, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_10 <=", value, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10Like(String value) {
            addCriterion("fldBversion_10 like", value, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10NotLike(String value) {
            addCriterion("fldBversion_10 not like", value, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10In(List<String> values) {
            addCriterion("fldBversion_10 in", values, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10NotIn(List<String> values) {
            addCriterion("fldBversion_10 not in", values, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10Between(String value1, String value2) {
            addCriterion("fldBversion_10 between", value1, value2, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion10NotBetween(String value1, String value2) {
            addCriterion("fldBversion_10 not between", value1, value2, "fldbversion10");
            return (Criteria) this;
        }

        public Criteria andFldbversion11IsNull() {
            addCriterion("fldBversion_11 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion11IsNotNull() {
            addCriterion("fldBversion_11 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion11EqualTo(String value) {
            addCriterion("fldBversion_11 =", value, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11NotEqualTo(String value) {
            addCriterion("fldBversion_11 <>", value, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11GreaterThan(String value) {
            addCriterion("fldBversion_11 >", value, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_11 >=", value, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11LessThan(String value) {
            addCriterion("fldBversion_11 <", value, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_11 <=", value, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11Like(String value) {
            addCriterion("fldBversion_11 like", value, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11NotLike(String value) {
            addCriterion("fldBversion_11 not like", value, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11In(List<String> values) {
            addCriterion("fldBversion_11 in", values, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11NotIn(List<String> values) {
            addCriterion("fldBversion_11 not in", values, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11Between(String value1, String value2) {
            addCriterion("fldBversion_11 between", value1, value2, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion11NotBetween(String value1, String value2) {
            addCriterion("fldBversion_11 not between", value1, value2, "fldbversion11");
            return (Criteria) this;
        }

        public Criteria andFldbversion12IsNull() {
            addCriterion("fldBversion_12 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion12IsNotNull() {
            addCriterion("fldBversion_12 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion12EqualTo(String value) {
            addCriterion("fldBversion_12 =", value, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12NotEqualTo(String value) {
            addCriterion("fldBversion_12 <>", value, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12GreaterThan(String value) {
            addCriterion("fldBversion_12 >", value, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_12 >=", value, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12LessThan(String value) {
            addCriterion("fldBversion_12 <", value, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_12 <=", value, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12Like(String value) {
            addCriterion("fldBversion_12 like", value, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12NotLike(String value) {
            addCriterion("fldBversion_12 not like", value, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12In(List<String> values) {
            addCriterion("fldBversion_12 in", values, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12NotIn(List<String> values) {
            addCriterion("fldBversion_12 not in", values, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12Between(String value1, String value2) {
            addCriterion("fldBversion_12 between", value1, value2, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion12NotBetween(String value1, String value2) {
            addCriterion("fldBversion_12 not between", value1, value2, "fldbversion12");
            return (Criteria) this;
        }

        public Criteria andFldbversion13IsNull() {
            addCriterion("fldBversion_13 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion13IsNotNull() {
            addCriterion("fldBversion_13 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion13EqualTo(String value) {
            addCriterion("fldBversion_13 =", value, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13NotEqualTo(String value) {
            addCriterion("fldBversion_13 <>", value, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13GreaterThan(String value) {
            addCriterion("fldBversion_13 >", value, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_13 >=", value, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13LessThan(String value) {
            addCriterion("fldBversion_13 <", value, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_13 <=", value, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13Like(String value) {
            addCriterion("fldBversion_13 like", value, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13NotLike(String value) {
            addCriterion("fldBversion_13 not like", value, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13In(List<String> values) {
            addCriterion("fldBversion_13 in", values, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13NotIn(List<String> values) {
            addCriterion("fldBversion_13 not in", values, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13Between(String value1, String value2) {
            addCriterion("fldBversion_13 between", value1, value2, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion13NotBetween(String value1, String value2) {
            addCriterion("fldBversion_13 not between", value1, value2, "fldbversion13");
            return (Criteria) this;
        }

        public Criteria andFldbversion14IsNull() {
            addCriterion("fldBversion_14 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion14IsNotNull() {
            addCriterion("fldBversion_14 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion14EqualTo(String value) {
            addCriterion("fldBversion_14 =", value, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14NotEqualTo(String value) {
            addCriterion("fldBversion_14 <>", value, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14GreaterThan(String value) {
            addCriterion("fldBversion_14 >", value, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_14 >=", value, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14LessThan(String value) {
            addCriterion("fldBversion_14 <", value, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_14 <=", value, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14Like(String value) {
            addCriterion("fldBversion_14 like", value, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14NotLike(String value) {
            addCriterion("fldBversion_14 not like", value, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14In(List<String> values) {
            addCriterion("fldBversion_14 in", values, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14NotIn(List<String> values) {
            addCriterion("fldBversion_14 not in", values, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14Between(String value1, String value2) {
            addCriterion("fldBversion_14 between", value1, value2, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion14NotBetween(String value1, String value2) {
            addCriterion("fldBversion_14 not between", value1, value2, "fldbversion14");
            return (Criteria) this;
        }

        public Criteria andFldbversion15IsNull() {
            addCriterion("fldBversion_15 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion15IsNotNull() {
            addCriterion("fldBversion_15 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion15EqualTo(String value) {
            addCriterion("fldBversion_15 =", value, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15NotEqualTo(String value) {
            addCriterion("fldBversion_15 <>", value, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15GreaterThan(String value) {
            addCriterion("fldBversion_15 >", value, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_15 >=", value, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15LessThan(String value) {
            addCriterion("fldBversion_15 <", value, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_15 <=", value, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15Like(String value) {
            addCriterion("fldBversion_15 like", value, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15NotLike(String value) {
            addCriterion("fldBversion_15 not like", value, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15In(List<String> values) {
            addCriterion("fldBversion_15 in", values, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15NotIn(List<String> values) {
            addCriterion("fldBversion_15 not in", values, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15Between(String value1, String value2) {
            addCriterion("fldBversion_15 between", value1, value2, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion15NotBetween(String value1, String value2) {
            addCriterion("fldBversion_15 not between", value1, value2, "fldbversion15");
            return (Criteria) this;
        }

        public Criteria andFldbversion16IsNull() {
            addCriterion("fldBversion_16 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion16IsNotNull() {
            addCriterion("fldBversion_16 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion16EqualTo(String value) {
            addCriterion("fldBversion_16 =", value, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16NotEqualTo(String value) {
            addCriterion("fldBversion_16 <>", value, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16GreaterThan(String value) {
            addCriterion("fldBversion_16 >", value, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_16 >=", value, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16LessThan(String value) {
            addCriterion("fldBversion_16 <", value, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_16 <=", value, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16Like(String value) {
            addCriterion("fldBversion_16 like", value, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16NotLike(String value) {
            addCriterion("fldBversion_16 not like", value, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16In(List<String> values) {
            addCriterion("fldBversion_16 in", values, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16NotIn(List<String> values) {
            addCriterion("fldBversion_16 not in", values, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16Between(String value1, String value2) {
            addCriterion("fldBversion_16 between", value1, value2, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion16NotBetween(String value1, String value2) {
            addCriterion("fldBversion_16 not between", value1, value2, "fldbversion16");
            return (Criteria) this;
        }

        public Criteria andFldbversion17IsNull() {
            addCriterion("fldBversion_17 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion17IsNotNull() {
            addCriterion("fldBversion_17 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion17EqualTo(String value) {
            addCriterion("fldBversion_17 =", value, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17NotEqualTo(String value) {
            addCriterion("fldBversion_17 <>", value, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17GreaterThan(String value) {
            addCriterion("fldBversion_17 >", value, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_17 >=", value, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17LessThan(String value) {
            addCriterion("fldBversion_17 <", value, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_17 <=", value, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17Like(String value) {
            addCriterion("fldBversion_17 like", value, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17NotLike(String value) {
            addCriterion("fldBversion_17 not like", value, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17In(List<String> values) {
            addCriterion("fldBversion_17 in", values, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17NotIn(List<String> values) {
            addCriterion("fldBversion_17 not in", values, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17Between(String value1, String value2) {
            addCriterion("fldBversion_17 between", value1, value2, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion17NotBetween(String value1, String value2) {
            addCriterion("fldBversion_17 not between", value1, value2, "fldbversion17");
            return (Criteria) this;
        }

        public Criteria andFldbversion18IsNull() {
            addCriterion("fldBversion_18 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion18IsNotNull() {
            addCriterion("fldBversion_18 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion18EqualTo(String value) {
            addCriterion("fldBversion_18 =", value, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18NotEqualTo(String value) {
            addCriterion("fldBversion_18 <>", value, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18GreaterThan(String value) {
            addCriterion("fldBversion_18 >", value, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_18 >=", value, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18LessThan(String value) {
            addCriterion("fldBversion_18 <", value, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_18 <=", value, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18Like(String value) {
            addCriterion("fldBversion_18 like", value, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18NotLike(String value) {
            addCriterion("fldBversion_18 not like", value, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18In(List<String> values) {
            addCriterion("fldBversion_18 in", values, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18NotIn(List<String> values) {
            addCriterion("fldBversion_18 not in", values, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18Between(String value1, String value2) {
            addCriterion("fldBversion_18 between", value1, value2, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion18NotBetween(String value1, String value2) {
            addCriterion("fldBversion_18 not between", value1, value2, "fldbversion18");
            return (Criteria) this;
        }

        public Criteria andFldbversion19IsNull() {
            addCriterion("fldBversion_19 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion19IsNotNull() {
            addCriterion("fldBversion_19 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion19EqualTo(String value) {
            addCriterion("fldBversion_19 =", value, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19NotEqualTo(String value) {
            addCriterion("fldBversion_19 <>", value, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19GreaterThan(String value) {
            addCriterion("fldBversion_19 >", value, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_19 >=", value, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19LessThan(String value) {
            addCriterion("fldBversion_19 <", value, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_19 <=", value, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19Like(String value) {
            addCriterion("fldBversion_19 like", value, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19NotLike(String value) {
            addCriterion("fldBversion_19 not like", value, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19In(List<String> values) {
            addCriterion("fldBversion_19 in", values, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19NotIn(List<String> values) {
            addCriterion("fldBversion_19 not in", values, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19Between(String value1, String value2) {
            addCriterion("fldBversion_19 between", value1, value2, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion19NotBetween(String value1, String value2) {
            addCriterion("fldBversion_19 not between", value1, value2, "fldbversion19");
            return (Criteria) this;
        }

        public Criteria andFldbversion20IsNull() {
            addCriterion("fldBversion_20 is null");
            return (Criteria) this;
        }

        public Criteria andFldbversion20IsNotNull() {
            addCriterion("fldBversion_20 is not null");
            return (Criteria) this;
        }

        public Criteria andFldbversion20EqualTo(String value) {
            addCriterion("fldBversion_20 =", value, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20NotEqualTo(String value) {
            addCriterion("fldBversion_20 <>", value, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20GreaterThan(String value) {
            addCriterion("fldBversion_20 >", value, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20GreaterThanOrEqualTo(String value) {
            addCriterion("fldBversion_20 >=", value, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20LessThan(String value) {
            addCriterion("fldBversion_20 <", value, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20LessThanOrEqualTo(String value) {
            addCriterion("fldBversion_20 <=", value, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20Like(String value) {
            addCriterion("fldBversion_20 like", value, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20NotLike(String value) {
            addCriterion("fldBversion_20 not like", value, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20In(List<String> values) {
            addCriterion("fldBversion_20 in", values, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20NotIn(List<String> values) {
            addCriterion("fldBversion_20 not in", values, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20Between(String value1, String value2) {
            addCriterion("fldBversion_20 between", value1, value2, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andFldbversion20NotBetween(String value1, String value2) {
            addCriterion("fldBversion_20 not between", value1, value2, "fldbversion20");
            return (Criteria) this;
        }

        public Criteria andReleasenoIsNull() {
            addCriterion("RELEASENo is null");
            return (Criteria) this;
        }

        public Criteria andReleasenoIsNotNull() {
            addCriterion("RELEASENo is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenoEqualTo(String value) {
            addCriterion("RELEASENo =", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoNotEqualTo(String value) {
            addCriterion("RELEASENo <>", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoGreaterThan(String value) {
            addCriterion("RELEASENo >", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASENo >=", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoLessThan(String value) {
            addCriterion("RELEASENo <", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoLessThanOrEqualTo(String value) {
            addCriterion("RELEASENo <=", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoLike(String value) {
            addCriterion("RELEASENo like", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoNotLike(String value) {
            addCriterion("RELEASENo not like", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoIn(List<String> values) {
            addCriterion("RELEASENo in", values, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoNotIn(List<String> values) {
            addCriterion("RELEASENo not in", values, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoBetween(String value1, String value2) {
            addCriterion("RELEASENo between", value1, value2, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoNotBetween(String value1, String value2) {
            addCriterion("RELEASENo not between", value1, value2, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNull() {
            addCriterion("RELEASE is null");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNotNull() {
            addCriterion("RELEASE is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseEqualTo(String value) {
            addCriterion("RELEASE =", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotEqualTo(String value) {
            addCriterion("RELEASE <>", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThan(String value) {
            addCriterion("RELEASE >", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE >=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThan(String value) {
            addCriterion("RELEASE <", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThanOrEqualTo(String value) {
            addCriterion("RELEASE <=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLike(String value) {
            addCriterion("RELEASE like", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotLike(String value) {
            addCriterion("RELEASE not like", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseIn(List<String> values) {
            addCriterion("RELEASE in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotIn(List<String> values) {
            addCriterion("RELEASE not in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseBetween(String value1, String value2) {
            addCriterion("RELEASE between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotBetween(String value1, String value2) {
            addCriterion("RELEASE not between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andPIsNull() {
            addCriterion("P is null");
            return (Criteria) this;
        }

        public Criteria andPIsNotNull() {
            addCriterion("P is not null");
            return (Criteria) this;
        }

        public Criteria andPEqualTo(String value) {
            addCriterion("P =", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotEqualTo(String value) {
            addCriterion("P <>", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThan(String value) {
            addCriterion("P >", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThanOrEqualTo(String value) {
            addCriterion("P >=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThan(String value) {
            addCriterion("P <", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThanOrEqualTo(String value) {
            addCriterion("P <=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLike(String value) {
            addCriterion("P like", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotLike(String value) {
            addCriterion("P not like", value, "p");
            return (Criteria) this;
        }

        public Criteria andPIn(List<String> values) {
            addCriterion("P in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPNotIn(List<String> values) {
            addCriterion("P not in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPBetween(String value1, String value2) {
            addCriterion("P between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andPNotBetween(String value1, String value2) {
            addCriterion("P not between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andVIsNull() {
            addCriterion("V is null");
            return (Criteria) this;
        }

        public Criteria andVIsNotNull() {
            addCriterion("V is not null");
            return (Criteria) this;
        }

        public Criteria andVEqualTo(String value) {
            addCriterion("V =", value, "v");
            return (Criteria) this;
        }

        public Criteria andVNotEqualTo(String value) {
            addCriterion("V <>", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThan(String value) {
            addCriterion("V >", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThanOrEqualTo(String value) {
            addCriterion("V >=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThan(String value) {
            addCriterion("V <", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThanOrEqualTo(String value) {
            addCriterion("V <=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLike(String value) {
            addCriterion("V like", value, "v");
            return (Criteria) this;
        }

        public Criteria andVNotLike(String value) {
            addCriterion("V not like", value, "v");
            return (Criteria) this;
        }

        public Criteria andVIn(List<String> values) {
            addCriterion("V in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVNotIn(List<String> values) {
            addCriterion("V not in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVBetween(String value1, String value2) {
            addCriterion("V between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andVNotBetween(String value1, String value2) {
            addCriterion("V not between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andRIsNull() {
            addCriterion("R is null");
            return (Criteria) this;
        }

        public Criteria andRIsNotNull() {
            addCriterion("R is not null");
            return (Criteria) this;
        }

        public Criteria andREqualTo(String value) {
            addCriterion("R =", value, "r");
            return (Criteria) this;
        }

        public Criteria andRNotEqualTo(String value) {
            addCriterion("R <>", value, "r");
            return (Criteria) this;
        }

        public Criteria andRGreaterThan(String value) {
            addCriterion("R >", value, "r");
            return (Criteria) this;
        }

        public Criteria andRGreaterThanOrEqualTo(String value) {
            addCriterion("R >=", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLessThan(String value) {
            addCriterion("R <", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLessThanOrEqualTo(String value) {
            addCriterion("R <=", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLike(String value) {
            addCriterion("R like", value, "r");
            return (Criteria) this;
        }

        public Criteria andRNotLike(String value) {
            addCriterion("R not like", value, "r");
            return (Criteria) this;
        }

        public Criteria andRIn(List<String> values) {
            addCriterion("R in", values, "r");
            return (Criteria) this;
        }

        public Criteria andRNotIn(List<String> values) {
            addCriterion("R not in", values, "r");
            return (Criteria) this;
        }

        public Criteria andRBetween(String value1, String value2) {
            addCriterion("R between", value1, value2, "r");
            return (Criteria) this;
        }

        public Criteria andRNotBetween(String value1, String value2) {
            addCriterion("R not between", value1, value2, "r");
            return (Criteria) this;
        }

        public Criteria andReleaseoldIsNull() {
            addCriterion("RELEASEOld is null");
            return (Criteria) this;
        }

        public Criteria andReleaseoldIsNotNull() {
            addCriterion("RELEASEOld is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseoldEqualTo(String value) {
            addCriterion("RELEASEOld =", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldNotEqualTo(String value) {
            addCriterion("RELEASEOld <>", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldGreaterThan(String value) {
            addCriterion("RELEASEOld >", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASEOld >=", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldLessThan(String value) {
            addCriterion("RELEASEOld <", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldLessThanOrEqualTo(String value) {
            addCriterion("RELEASEOld <=", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldLike(String value) {
            addCriterion("RELEASEOld like", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldNotLike(String value) {
            addCriterion("RELEASEOld not like", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldIn(List<String> values) {
            addCriterion("RELEASEOld in", values, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldNotIn(List<String> values) {
            addCriterion("RELEASEOld not in", values, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldBetween(String value1, String value2) {
            addCriterion("RELEASEOld between", value1, value2, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldNotBetween(String value1, String value2) {
            addCriterion("RELEASEOld not between", value1, value2, "releaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseIsNull() {
            addCriterion("engRELEASE is null");
            return (Criteria) this;
        }

        public Criteria andEngreleaseIsNotNull() {
            addCriterion("engRELEASE is not null");
            return (Criteria) this;
        }

        public Criteria andEngreleaseEqualTo(String value) {
            addCriterion("engRELEASE =", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseNotEqualTo(String value) {
            addCriterion("engRELEASE <>", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseGreaterThan(String value) {
            addCriterion("engRELEASE >", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseGreaterThanOrEqualTo(String value) {
            addCriterion("engRELEASE >=", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseLessThan(String value) {
            addCriterion("engRELEASE <", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseLessThanOrEqualTo(String value) {
            addCriterion("engRELEASE <=", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseLike(String value) {
            addCriterion("engRELEASE like", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseNotLike(String value) {
            addCriterion("engRELEASE not like", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseIn(List<String> values) {
            addCriterion("engRELEASE in", values, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseNotIn(List<String> values) {
            addCriterion("engRELEASE not in", values, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseBetween(String value1, String value2) {
            addCriterion("engRELEASE between", value1, value2, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseNotBetween(String value1, String value2) {
            addCriterion("engRELEASE not between", value1, value2, "engrelease");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoIsNull() {
            addCriterion("PLIPMTNo is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoIsNotNull() {
            addCriterion("PLIPMTNo is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoEqualTo(String value) {
            addCriterion("PLIPMTNo =", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoNotEqualTo(String value) {
            addCriterion("PLIPMTNo <>", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoGreaterThan(String value) {
            addCriterion("PLIPMTNo >", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMTNo >=", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoLessThan(String value) {
            addCriterion("PLIPMTNo <", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoLessThanOrEqualTo(String value) {
            addCriterion("PLIPMTNo <=", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoLike(String value) {
            addCriterion("PLIPMTNo like", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoNotLike(String value) {
            addCriterion("PLIPMTNo not like", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoIn(List<String> values) {
            addCriterion("PLIPMTNo in", values, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoNotIn(List<String> values) {
            addCriterion("PLIPMTNo not in", values, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoBetween(String value1, String value2) {
            addCriterion("PLIPMTNo between", value1, value2, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoNotBetween(String value1, String value2) {
            addCriterion("PLIPMTNo not between", value1, value2, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIsNull() {
            addCriterion("PRODLINENo is null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIsNotNull() {
            addCriterion("PRODLINENo is not null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoEqualTo(String value) {
            addCriterion("PRODLINENo =", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotEqualTo(String value) {
            addCriterion("PRODLINENo <>", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThan(String value) {
            addCriterion("PRODLINENo >", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINENo >=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThan(String value) {
            addCriterion("PRODLINENo <", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThanOrEqualTo(String value) {
            addCriterion("PRODLINENo <=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLike(String value) {
            addCriterion("PRODLINENo like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotLike(String value) {
            addCriterion("PRODLINENo not like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIn(List<String> values) {
            addCriterion("PRODLINENo in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotIn(List<String> values) {
            addCriterion("PRODLINENo not in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoBetween(String value1, String value2) {
            addCriterion("PRODLINENo between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotBetween(String value1, String value2) {
            addCriterion("PRODLINENo not between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("ProductNO is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("ProductNO is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("ProductNO =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("ProductNO <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("ProductNO >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("ProductNO >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("ProductNO <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("ProductNO <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("ProductNO like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("ProductNO not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("ProductNO in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("ProductNO not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("ProductNO between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("ProductNO not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNull() {
            addCriterion("VersionNo is null");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNotNull() {
            addCriterion("VersionNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnoEqualTo(String value) {
            addCriterion("VersionNo =", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotEqualTo(String value) {
            addCriterion("VersionNo <>", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThan(String value) {
            addCriterion("VersionNo >", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThanOrEqualTo(String value) {
            addCriterion("VersionNo >=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThan(String value) {
            addCriterion("VersionNo <", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThanOrEqualTo(String value) {
            addCriterion("VersionNo <=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLike(String value) {
            addCriterion("VersionNo like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotLike(String value) {
            addCriterion("VersionNo not like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoIn(List<String> values) {
            addCriterion("VersionNo in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotIn(List<String> values) {
            addCriterion("VersionNo not in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoBetween(String value1, String value2) {
            addCriterion("VersionNo between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotBetween(String value1, String value2) {
            addCriterion("VersionNo not between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andPdtnoIsNull() {
            addCriterion("PDTNo is null");
            return (Criteria) this;
        }

        public Criteria andPdtnoIsNotNull() {
            addCriterion("PDTNo is not null");
            return (Criteria) this;
        }

        public Criteria andPdtnoEqualTo(String value) {
            addCriterion("PDTNo =", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotEqualTo(String value) {
            addCriterion("PDTNo <>", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoGreaterThan(String value) {
            addCriterion("PDTNo >", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoGreaterThanOrEqualTo(String value) {
            addCriterion("PDTNo >=", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLessThan(String value) {
            addCriterion("PDTNo <", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLessThanOrEqualTo(String value) {
            addCriterion("PDTNo <=", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLike(String value) {
            addCriterion("PDTNo like", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotLike(String value) {
            addCriterion("PDTNo not like", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoIn(List<String> values) {
            addCriterion("PDTNo in", values, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotIn(List<String> values) {
            addCriterion("PDTNo not in", values, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoBetween(String value1, String value2) {
            addCriterion("PDTNo between", value1, value2, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotBetween(String value1, String value2) {
            addCriterion("PDTNo not between", value1, value2, "pdtno");
            return (Criteria) this;
        }

        public Criteria andProjectnoIsNull() {
            addCriterion("PROJECTNo is null");
            return (Criteria) this;
        }

        public Criteria andProjectnoIsNotNull() {
            addCriterion("PROJECTNo is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnoEqualTo(String value) {
            addCriterion("PROJECTNo =", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotEqualTo(String value) {
            addCriterion("PROJECTNo <>", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoGreaterThan(String value) {
            addCriterion("PROJECTNo >", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTNo >=", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLessThan(String value) {
            addCriterion("PROJECTNo <", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLessThanOrEqualTo(String value) {
            addCriterion("PROJECTNo <=", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLike(String value) {
            addCriterion("PROJECTNo like", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotLike(String value) {
            addCriterion("PROJECTNo not like", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoIn(List<String> values) {
            addCriterion("PROJECTNo in", values, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotIn(List<String> values) {
            addCriterion("PROJECTNo not in", values, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoBetween(String value1, String value2) {
            addCriterion("PROJECTNo between", value1, value2, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotBetween(String value1, String value2) {
            addCriterion("PROJECTNo not between", value1, value2, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeIsNull() {
            addCriterion("PROJECTCOACode is null");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeIsNotNull() {
            addCriterion("PROJECTCOACode is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeEqualTo(String value) {
            addCriterion("PROJECTCOACode =", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeNotEqualTo(String value) {
            addCriterion("PROJECTCOACode <>", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeGreaterThan(String value) {
            addCriterion("PROJECTCOACode >", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTCOACode >=", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeLessThan(String value) {
            addCriterion("PROJECTCOACode <", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECTCOACode <=", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeLike(String value) {
            addCriterion("PROJECTCOACode like", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeNotLike(String value) {
            addCriterion("PROJECTCOACode not like", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeIn(List<String> values) {
            addCriterion("PROJECTCOACode in", values, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeNotIn(List<String> values) {
            addCriterion("PROJECTCOACode not in", values, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeBetween(String value1, String value2) {
            addCriterion("PROJECTCOACode between", value1, value2, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeNotBetween(String value1, String value2) {
            addCriterion("PROJECTCOACode not between", value1, value2, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("PROJECT =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("PROJECT <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("PROJECT >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("PROJECT <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("PROJECT <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("PROJECT like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("PROJECT not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("PROJECT in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("PROJECT not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("PROJECT between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("PROJECT not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andEngprojectIsNull() {
            addCriterion("engPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andEngprojectIsNotNull() {
            addCriterion("engPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andEngprojectEqualTo(String value) {
            addCriterion("engPROJECT =", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotEqualTo(String value) {
            addCriterion("engPROJECT <>", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectGreaterThan(String value) {
            addCriterion("engPROJECT >", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectGreaterThanOrEqualTo(String value) {
            addCriterion("engPROJECT >=", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLessThan(String value) {
            addCriterion("engPROJECT <", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLessThanOrEqualTo(String value) {
            addCriterion("engPROJECT <=", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLike(String value) {
            addCriterion("engPROJECT like", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotLike(String value) {
            addCriterion("engPROJECT not like", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectIn(List<String> values) {
            addCriterion("engPROJECT in", values, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotIn(List<String> values) {
            addCriterion("engPROJECT not in", values, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectBetween(String value1, String value2) {
            addCriterion("engPROJECT between", value1, value2, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotBetween(String value1, String value2) {
            addCriterion("engPROJECT not between", value1, value2, "engproject");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareIsNull() {
            addCriterion("RELEASENo_Software is null");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareIsNotNull() {
            addCriterion("RELEASENo_Software is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareEqualTo(String value) {
            addCriterion("RELEASENo_Software =", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareNotEqualTo(String value) {
            addCriterion("RELEASENo_Software <>", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareGreaterThan(String value) {
            addCriterion("RELEASENo_Software >", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASENo_Software >=", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareLessThan(String value) {
            addCriterion("RELEASENo_Software <", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareLessThanOrEqualTo(String value) {
            addCriterion("RELEASENo_Software <=", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareLike(String value) {
            addCriterion("RELEASENo_Software like", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareNotLike(String value) {
            addCriterion("RELEASENo_Software not like", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareIn(List<String> values) {
            addCriterion("RELEASENo_Software in", values, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareNotIn(List<String> values) {
            addCriterion("RELEASENo_Software not in", values, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareBetween(String value1, String value2) {
            addCriterion("RELEASENo_Software between", value1, value2, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareNotBetween(String value1, String value2) {
            addCriterion("RELEASENo_Software not between", value1, value2, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andProjectstatusIsNull() {
            addCriterion("PROJECTStatus is null");
            return (Criteria) this;
        }

        public Criteria andProjectstatusIsNotNull() {
            addCriterion("PROJECTStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProjectstatusEqualTo(String value) {
            addCriterion("PROJECTStatus =", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusNotEqualTo(String value) {
            addCriterion("PROJECTStatus <>", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusGreaterThan(String value) {
            addCriterion("PROJECTStatus >", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTStatus >=", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusLessThan(String value) {
            addCriterion("PROJECTStatus <", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusLessThanOrEqualTo(String value) {
            addCriterion("PROJECTStatus <=", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusLike(String value) {
            addCriterion("PROJECTStatus like", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusNotLike(String value) {
            addCriterion("PROJECTStatus not like", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusIn(List<String> values) {
            addCriterion("PROJECTStatus in", values, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusNotIn(List<String> values) {
            addCriterion("PROJECTStatus not in", values, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusBetween(String value1, String value2) {
            addCriterion("PROJECTStatus between", value1, value2, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusNotBetween(String value1, String value2) {
            addCriterion("PROJECTStatus not between", value1, value2, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andMatchIsNull() {
            addCriterion("Match is null");
            return (Criteria) this;
        }

        public Criteria andMatchIsNotNull() {
            addCriterion("Match is not null");
            return (Criteria) this;
        }

        public Criteria andMatchEqualTo(String value) {
            addCriterion("Match =", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotEqualTo(String value) {
            addCriterion("Match <>", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchGreaterThan(String value) {
            addCriterion("Match >", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchGreaterThanOrEqualTo(String value) {
            addCriterion("Match >=", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLessThan(String value) {
            addCriterion("Match <", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLessThanOrEqualTo(String value) {
            addCriterion("Match <=", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLike(String value) {
            addCriterion("Match like", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotLike(String value) {
            addCriterion("Match not like", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchIn(List<String> values) {
            addCriterion("Match in", values, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotIn(List<String> values) {
            addCriterion("Match not in", values, "match");
            return (Criteria) this;
        }

        public Criteria andMatchBetween(String value1, String value2) {
            addCriterion("Match between", value1, value2, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotBetween(String value1, String value2) {
            addCriterion("Match not between", value1, value2, "match");
            return (Criteria) this;
        }

        public Criteria andReleasematchIsNull() {
            addCriterion("RELEASEMatch is null");
            return (Criteria) this;
        }

        public Criteria andReleasematchIsNotNull() {
            addCriterion("RELEASEMatch is not null");
            return (Criteria) this;
        }

        public Criteria andReleasematchEqualTo(String value) {
            addCriterion("RELEASEMatch =", value, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchNotEqualTo(String value) {
            addCriterion("RELEASEMatch <>", value, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchGreaterThan(String value) {
            addCriterion("RELEASEMatch >", value, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASEMatch >=", value, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchLessThan(String value) {
            addCriterion("RELEASEMatch <", value, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchLessThanOrEqualTo(String value) {
            addCriterion("RELEASEMatch <=", value, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchLike(String value) {
            addCriterion("RELEASEMatch like", value, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchNotLike(String value) {
            addCriterion("RELEASEMatch not like", value, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchIn(List<String> values) {
            addCriterion("RELEASEMatch in", values, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchNotIn(List<String> values) {
            addCriterion("RELEASEMatch not in", values, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchBetween(String value1, String value2) {
            addCriterion("RELEASEMatch between", value1, value2, "releasematch");
            return (Criteria) this;
        }

        public Criteria andReleasematchNotBetween(String value1, String value2) {
            addCriterion("RELEASEMatch not between", value1, value2, "releasematch");
            return (Criteria) this;
        }

        public Criteria andProddataidIsNull() {
            addCriterion("ProdDataID is null");
            return (Criteria) this;
        }

        public Criteria andProddataidIsNotNull() {
            addCriterion("ProdDataID is not null");
            return (Criteria) this;
        }

        public Criteria andProddataidEqualTo(String value) {
            addCriterion("ProdDataID =", value, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidNotEqualTo(String value) {
            addCriterion("ProdDataID <>", value, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidGreaterThan(String value) {
            addCriterion("ProdDataID >", value, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidGreaterThanOrEqualTo(String value) {
            addCriterion("ProdDataID >=", value, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidLessThan(String value) {
            addCriterion("ProdDataID <", value, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidLessThanOrEqualTo(String value) {
            addCriterion("ProdDataID <=", value, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidLike(String value) {
            addCriterion("ProdDataID like", value, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidNotLike(String value) {
            addCriterion("ProdDataID not like", value, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidIn(List<String> values) {
            addCriterion("ProdDataID in", values, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidNotIn(List<String> values) {
            addCriterion("ProdDataID not in", values, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidBetween(String value1, String value2) {
            addCriterion("ProdDataID between", value1, value2, "proddataid");
            return (Criteria) this;
        }

        public Criteria andProddataidNotBetween(String value1, String value2) {
            addCriterion("ProdDataID not between", value1, value2, "proddataid");
            return (Criteria) this;
        }

        public Criteria andPopIdIsNull() {
            addCriterion("POP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPopIdIsNotNull() {
            addCriterion("POP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPopIdEqualTo(String value) {
            addCriterion("POP_ID =", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotEqualTo(String value) {
            addCriterion("POP_ID <>", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdGreaterThan(String value) {
            addCriterion("POP_ID >", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdGreaterThanOrEqualTo(String value) {
            addCriterion("POP_ID >=", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdLessThan(String value) {
            addCriterion("POP_ID <", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdLessThanOrEqualTo(String value) {
            addCriterion("POP_ID <=", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdLike(String value) {
            addCriterion("POP_ID like", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotLike(String value) {
            addCriterion("POP_ID not like", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdIn(List<String> values) {
            addCriterion("POP_ID in", values, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotIn(List<String> values) {
            addCriterion("POP_ID not in", values, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdBetween(String value1, String value2) {
            addCriterion("POP_ID between", value1, value2, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotBetween(String value1, String value2) {
            addCriterion("POP_ID not between", value1, value2, "popId");
            return (Criteria) this;
        }

        public Criteria andCmoIdIsNull() {
            addCriterion("CMO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmoIdIsNotNull() {
            addCriterion("CMO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmoIdEqualTo(String value) {
            addCriterion("CMO_ID =", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdNotEqualTo(String value) {
            addCriterion("CMO_ID <>", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdGreaterThan(String value) {
            addCriterion("CMO_ID >", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdGreaterThanOrEqualTo(String value) {
            addCriterion("CMO_ID >=", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdLessThan(String value) {
            addCriterion("CMO_ID <", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdLessThanOrEqualTo(String value) {
            addCriterion("CMO_ID <=", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdLike(String value) {
            addCriterion("CMO_ID like", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdNotLike(String value) {
            addCriterion("CMO_ID not like", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdIn(List<String> values) {
            addCriterion("CMO_ID in", values, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdNotIn(List<String> values) {
            addCriterion("CMO_ID not in", values, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdBetween(String value1, String value2) {
            addCriterion("CMO_ID between", value1, value2, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdNotBetween(String value1, String value2) {
            addCriterion("CMO_ID not between", value1, value2, "cmoId");
            return (Criteria) this;
        }

        public Criteria andTestingMngerIsNull() {
            addCriterion("Testing_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andTestingMngerIsNotNull() {
            addCriterion("Testing_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andTestingMngerEqualTo(String value) {
            addCriterion("Testing_Mnger =", value, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerNotEqualTo(String value) {
            addCriterion("Testing_Mnger <>", value, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerGreaterThan(String value) {
            addCriterion("Testing_Mnger >", value, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Testing_Mnger >=", value, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerLessThan(String value) {
            addCriterion("Testing_Mnger <", value, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerLessThanOrEqualTo(String value) {
            addCriterion("Testing_Mnger <=", value, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerLike(String value) {
            addCriterion("Testing_Mnger like", value, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerNotLike(String value) {
            addCriterion("Testing_Mnger not like", value, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerIn(List<String> values) {
            addCriterion("Testing_Mnger in", values, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerNotIn(List<String> values) {
            addCriterion("Testing_Mnger not in", values, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerBetween(String value1, String value2) {
            addCriterion("Testing_Mnger between", value1, value2, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTestingMngerNotBetween(String value1, String value2) {
            addCriterion("Testing_Mnger not between", value1, value2, "testingMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerIsNull() {
            addCriterion("TechSupport_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerIsNotNull() {
            addCriterion("TechSupport_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerEqualTo(String value) {
            addCriterion("TechSupport_Mnger =", value, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerNotEqualTo(String value) {
            addCriterion("TechSupport_Mnger <>", value, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerGreaterThan(String value) {
            addCriterion("TechSupport_Mnger >", value, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerGreaterThanOrEqualTo(String value) {
            addCriterion("TechSupport_Mnger >=", value, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerLessThan(String value) {
            addCriterion("TechSupport_Mnger <", value, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerLessThanOrEqualTo(String value) {
            addCriterion("TechSupport_Mnger <=", value, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerLike(String value) {
            addCriterion("TechSupport_Mnger like", value, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerNotLike(String value) {
            addCriterion("TechSupport_Mnger not like", value, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerIn(List<String> values) {
            addCriterion("TechSupport_Mnger in", values, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerNotIn(List<String> values) {
            addCriterion("TechSupport_Mnger not in", values, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerBetween(String value1, String value2) {
            addCriterion("TechSupport_Mnger between", value1, value2, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andTechsupportMngerNotBetween(String value1, String value2) {
            addCriterion("TechSupport_Mnger not between", value1, value2, "techsupportMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerIsNull() {
            addCriterion("Product_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andProductMngerIsNotNull() {
            addCriterion("Product_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andProductMngerEqualTo(String value) {
            addCriterion("Product_Mnger =", value, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerNotEqualTo(String value) {
            addCriterion("Product_Mnger <>", value, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerGreaterThan(String value) {
            addCriterion("Product_Mnger >", value, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Product_Mnger >=", value, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerLessThan(String value) {
            addCriterion("Product_Mnger <", value, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerLessThanOrEqualTo(String value) {
            addCriterion("Product_Mnger <=", value, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerLike(String value) {
            addCriterion("Product_Mnger like", value, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerNotLike(String value) {
            addCriterion("Product_Mnger not like", value, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerIn(List<String> values) {
            addCriterion("Product_Mnger in", values, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerNotIn(List<String> values) {
            addCriterion("Product_Mnger not in", values, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerBetween(String value1, String value2) {
            addCriterion("Product_Mnger between", value1, value2, "productMnger");
            return (Criteria) this;
        }

        public Criteria andProductMngerNotBetween(String value1, String value2) {
            addCriterion("Product_Mnger not between", value1, value2, "productMnger");
            return (Criteria) this;
        }

        public Criteria andMarkettmIsNull() {
            addCriterion("MarketTM is null");
            return (Criteria) this;
        }

        public Criteria andMarkettmIsNotNull() {
            addCriterion("MarketTM is not null");
            return (Criteria) this;
        }

        public Criteria andMarkettmEqualTo(String value) {
            addCriterion("MarketTM =", value, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmNotEqualTo(String value) {
            addCriterion("MarketTM <>", value, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmGreaterThan(String value) {
            addCriterion("MarketTM >", value, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmGreaterThanOrEqualTo(String value) {
            addCriterion("MarketTM >=", value, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmLessThan(String value) {
            addCriterion("MarketTM <", value, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmLessThanOrEqualTo(String value) {
            addCriterion("MarketTM <=", value, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmLike(String value) {
            addCriterion("MarketTM like", value, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmNotLike(String value) {
            addCriterion("MarketTM not like", value, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmIn(List<String> values) {
            addCriterion("MarketTM in", values, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmNotIn(List<String> values) {
            addCriterion("MarketTM not in", values, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmBetween(String value1, String value2) {
            addCriterion("MarketTM between", value1, value2, "markettm");
            return (Criteria) this;
        }

        public Criteria andMarkettmNotBetween(String value1, String value2) {
            addCriterion("MarketTM not between", value1, value2, "markettm");
            return (Criteria) this;
        }

        public Criteria andSoftmgIsNull() {
            addCriterion("softmg is null");
            return (Criteria) this;
        }

        public Criteria andSoftmgIsNotNull() {
            addCriterion("softmg is not null");
            return (Criteria) this;
        }

        public Criteria andSoftmgEqualTo(String value) {
            addCriterion("softmg =", value, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgNotEqualTo(String value) {
            addCriterion("softmg <>", value, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgGreaterThan(String value) {
            addCriterion("softmg >", value, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgGreaterThanOrEqualTo(String value) {
            addCriterion("softmg >=", value, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgLessThan(String value) {
            addCriterion("softmg <", value, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgLessThanOrEqualTo(String value) {
            addCriterion("softmg <=", value, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgLike(String value) {
            addCriterion("softmg like", value, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgNotLike(String value) {
            addCriterion("softmg not like", value, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgIn(List<String> values) {
            addCriterion("softmg in", values, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgNotIn(List<String> values) {
            addCriterion("softmg not in", values, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgBetween(String value1, String value2) {
            addCriterion("softmg between", value1, value2, "softmg");
            return (Criteria) this;
        }

        public Criteria andSoftmgNotBetween(String value1, String value2) {
            addCriterion("softmg not between", value1, value2, "softmg");
            return (Criteria) this;
        }

        public Criteria andHardmgIsNull() {
            addCriterion("hardmg is null");
            return (Criteria) this;
        }

        public Criteria andHardmgIsNotNull() {
            addCriterion("hardmg is not null");
            return (Criteria) this;
        }

        public Criteria andHardmgEqualTo(String value) {
            addCriterion("hardmg =", value, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgNotEqualTo(String value) {
            addCriterion("hardmg <>", value, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgGreaterThan(String value) {
            addCriterion("hardmg >", value, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgGreaterThanOrEqualTo(String value) {
            addCriterion("hardmg >=", value, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgLessThan(String value) {
            addCriterion("hardmg <", value, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgLessThanOrEqualTo(String value) {
            addCriterion("hardmg <=", value, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgLike(String value) {
            addCriterion("hardmg like", value, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgNotLike(String value) {
            addCriterion("hardmg not like", value, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgIn(List<String> values) {
            addCriterion("hardmg in", values, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgNotIn(List<String> values) {
            addCriterion("hardmg not in", values, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgBetween(String value1, String value2) {
            addCriterion("hardmg between", value1, value2, "hardmg");
            return (Criteria) this;
        }

        public Criteria andHardmgNotBetween(String value1, String value2) {
            addCriterion("hardmg not between", value1, value2, "hardmg");
            return (Criteria) this;
        }

        public Criteria andFldpdeIsNull() {
            addCriterion("fldPDE is null");
            return (Criteria) this;
        }

        public Criteria andFldpdeIsNotNull() {
            addCriterion("fldPDE is not null");
            return (Criteria) this;
        }

        public Criteria andFldpdeEqualTo(String value) {
            addCriterion("fldPDE =", value, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeNotEqualTo(String value) {
            addCriterion("fldPDE <>", value, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeGreaterThan(String value) {
            addCriterion("fldPDE >", value, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeGreaterThanOrEqualTo(String value) {
            addCriterion("fldPDE >=", value, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeLessThan(String value) {
            addCriterion("fldPDE <", value, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeLessThanOrEqualTo(String value) {
            addCriterion("fldPDE <=", value, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeLike(String value) {
            addCriterion("fldPDE like", value, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeNotLike(String value) {
            addCriterion("fldPDE not like", value, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeIn(List<String> values) {
            addCriterion("fldPDE in", values, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeNotIn(List<String> values) {
            addCriterion("fldPDE not in", values, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeBetween(String value1, String value2) {
            addCriterion("fldPDE between", value1, value2, "fldpde");
            return (Criteria) this;
        }

        public Criteria andFldpdeNotBetween(String value1, String value2) {
            addCriterion("fldPDE not between", value1, value2, "fldpde");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdIsNull() {
            addCriterion("RNDPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdIsNotNull() {
            addCriterion("RNDPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdEqualTo(String value) {
            addCriterion("RNDPDT_ID =", value, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdNotEqualTo(String value) {
            addCriterion("RNDPDT_ID <>", value, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdGreaterThan(String value) {
            addCriterion("RNDPDT_ID >", value, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("RNDPDT_ID >=", value, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdLessThan(String value) {
            addCriterion("RNDPDT_ID <", value, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdLessThanOrEqualTo(String value) {
            addCriterion("RNDPDT_ID <=", value, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdLike(String value) {
            addCriterion("RNDPDT_ID like", value, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdNotLike(String value) {
            addCriterion("RNDPDT_ID not like", value, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdIn(List<String> values) {
            addCriterion("RNDPDT_ID in", values, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdNotIn(List<String> values) {
            addCriterion("RNDPDT_ID not in", values, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdBetween(String value1, String value2) {
            addCriterion("RNDPDT_ID between", value1, value2, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andRndpdtIdNotBetween(String value1, String value2) {
            addCriterion("RNDPDT_ID not between", value1, value2, "rndpdtId");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerIsNull() {
            addCriterion("Oversea_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerIsNotNull() {
            addCriterion("Oversea_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerEqualTo(String value) {
            addCriterion("Oversea_Mnger =", value, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerNotEqualTo(String value) {
            addCriterion("Oversea_Mnger <>", value, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerGreaterThan(String value) {
            addCriterion("Oversea_Mnger >", value, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Oversea_Mnger >=", value, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerLessThan(String value) {
            addCriterion("Oversea_Mnger <", value, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerLessThanOrEqualTo(String value) {
            addCriterion("Oversea_Mnger <=", value, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerLike(String value) {
            addCriterion("Oversea_Mnger like", value, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerNotLike(String value) {
            addCriterion("Oversea_Mnger not like", value, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerIn(List<String> values) {
            addCriterion("Oversea_Mnger in", values, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerNotIn(List<String> values) {
            addCriterion("Oversea_Mnger not in", values, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerBetween(String value1, String value2) {
            addCriterion("Oversea_Mnger between", value1, value2, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andOverseaMngerNotBetween(String value1, String value2) {
            addCriterion("Oversea_Mnger not between", value1, value2, "overseaMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerIsNull() {
            addCriterion("PilotProduction_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerIsNotNull() {
            addCriterion("PilotProduction_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerEqualTo(String value) {
            addCriterion("PilotProduction_Mnger =", value, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerNotEqualTo(String value) {
            addCriterion("PilotProduction_Mnger <>", value, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerGreaterThan(String value) {
            addCriterion("PilotProduction_Mnger >", value, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerGreaterThanOrEqualTo(String value) {
            addCriterion("PilotProduction_Mnger >=", value, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerLessThan(String value) {
            addCriterion("PilotProduction_Mnger <", value, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerLessThanOrEqualTo(String value) {
            addCriterion("PilotProduction_Mnger <=", value, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerLike(String value) {
            addCriterion("PilotProduction_Mnger like", value, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerNotLike(String value) {
            addCriterion("PilotProduction_Mnger not like", value, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerIn(List<String> values) {
            addCriterion("PilotProduction_Mnger in", values, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerNotIn(List<String> values) {
            addCriterion("PilotProduction_Mnger not in", values, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerBetween(String value1, String value2) {
            addCriterion("PilotProduction_Mnger between", value1, value2, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andPilotproductionMngerNotBetween(String value1, String value2) {
            addCriterion("PilotProduction_Mnger not between", value1, value2, "pilotproductionMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerIsNull() {
            addCriterion("OMC_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andOmcMngerIsNotNull() {
            addCriterion("OMC_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andOmcMngerEqualTo(String value) {
            addCriterion("OMC_Mnger =", value, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerNotEqualTo(String value) {
            addCriterion("OMC_Mnger <>", value, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerGreaterThan(String value) {
            addCriterion("OMC_Mnger >", value, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerGreaterThanOrEqualTo(String value) {
            addCriterion("OMC_Mnger >=", value, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerLessThan(String value) {
            addCriterion("OMC_Mnger <", value, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerLessThanOrEqualTo(String value) {
            addCriterion("OMC_Mnger <=", value, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerLike(String value) {
            addCriterion("OMC_Mnger like", value, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerNotLike(String value) {
            addCriterion("OMC_Mnger not like", value, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerIn(List<String> values) {
            addCriterion("OMC_Mnger in", values, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerNotIn(List<String> values) {
            addCriterion("OMC_Mnger not in", values, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerBetween(String value1, String value2) {
            addCriterion("OMC_Mnger between", value1, value2, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andOmcMngerNotBetween(String value1, String value2) {
            addCriterion("OMC_Mnger not between", value1, value2, "omcMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerIsNull() {
            addCriterion("System_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andSystemMngerIsNotNull() {
            addCriterion("System_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andSystemMngerEqualTo(String value) {
            addCriterion("System_Mnger =", value, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerNotEqualTo(String value) {
            addCriterion("System_Mnger <>", value, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerGreaterThan(String value) {
            addCriterion("System_Mnger >", value, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerGreaterThanOrEqualTo(String value) {
            addCriterion("System_Mnger >=", value, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerLessThan(String value) {
            addCriterion("System_Mnger <", value, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerLessThanOrEqualTo(String value) {
            addCriterion("System_Mnger <=", value, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerLike(String value) {
            addCriterion("System_Mnger like", value, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerNotLike(String value) {
            addCriterion("System_Mnger not like", value, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerIn(List<String> values) {
            addCriterion("System_Mnger in", values, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerNotIn(List<String> values) {
            addCriterion("System_Mnger not in", values, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerBetween(String value1, String value2) {
            addCriterion("System_Mnger between", value1, value2, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andSystemMngerNotBetween(String value1, String value2) {
            addCriterion("System_Mnger not between", value1, value2, "systemMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIsNull() {
            addCriterion("Quality_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIsNotNull() {
            addCriterion("Quality_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andQualityMngerEqualTo(String value) {
            addCriterion("Quality_Mnger =", value, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerNotEqualTo(String value) {
            addCriterion("Quality_Mnger <>", value, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerGreaterThan(String value) {
            addCriterion("Quality_Mnger >", value, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Quality_Mnger >=", value, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerLessThan(String value) {
            addCriterion("Quality_Mnger <", value, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerLessThanOrEqualTo(String value) {
            addCriterion("Quality_Mnger <=", value, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerLike(String value) {
            addCriterion("Quality_Mnger like", value, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerNotLike(String value) {
            addCriterion("Quality_Mnger not like", value, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIn(List<String> values) {
            addCriterion("Quality_Mnger in", values, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerNotIn(List<String> values) {
            addCriterion("Quality_Mnger not in", values, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerBetween(String value1, String value2) {
            addCriterion("Quality_Mnger between", value1, value2, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andQualityMngerNotBetween(String value1, String value2) {
            addCriterion("Quality_Mnger not between", value1, value2, "qualityMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerIsNull() {
            addCriterion("Equipment_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerIsNotNull() {
            addCriterion("Equipment_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerEqualTo(String value) {
            addCriterion("Equipment_Mnger =", value, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerNotEqualTo(String value) {
            addCriterion("Equipment_Mnger <>", value, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerGreaterThan(String value) {
            addCriterion("Equipment_Mnger >", value, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Equipment_Mnger >=", value, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerLessThan(String value) {
            addCriterion("Equipment_Mnger <", value, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerLessThanOrEqualTo(String value) {
            addCriterion("Equipment_Mnger <=", value, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerLike(String value) {
            addCriterion("Equipment_Mnger like", value, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerNotLike(String value) {
            addCriterion("Equipment_Mnger not like", value, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerIn(List<String> values) {
            addCriterion("Equipment_Mnger in", values, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerNotIn(List<String> values) {
            addCriterion("Equipment_Mnger not in", values, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerBetween(String value1, String value2) {
            addCriterion("Equipment_Mnger between", value1, value2, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andEquipmentMngerNotBetween(String value1, String value2) {
            addCriterion("Equipment_Mnger not between", value1, value2, "equipmentMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerIsNull() {
            addCriterion("Documents_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerIsNotNull() {
            addCriterion("Documents_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerEqualTo(String value) {
            addCriterion("Documents_Mnger =", value, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerNotEqualTo(String value) {
            addCriterion("Documents_Mnger <>", value, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerGreaterThan(String value) {
            addCriterion("Documents_Mnger >", value, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Documents_Mnger >=", value, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerLessThan(String value) {
            addCriterion("Documents_Mnger <", value, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerLessThanOrEqualTo(String value) {
            addCriterion("Documents_Mnger <=", value, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerLike(String value) {
            addCriterion("Documents_Mnger like", value, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerNotLike(String value) {
            addCriterion("Documents_Mnger not like", value, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerIn(List<String> values) {
            addCriterion("Documents_Mnger in", values, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerNotIn(List<String> values) {
            addCriterion("Documents_Mnger not in", values, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerBetween(String value1, String value2) {
            addCriterion("Documents_Mnger between", value1, value2, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andDocumentsMngerNotBetween(String value1, String value2) {
            addCriterion("Documents_Mnger not between", value1, value2, "documentsMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerIsNull() {
            addCriterion("Purchase_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerIsNotNull() {
            addCriterion("Purchase_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerEqualTo(String value) {
            addCriterion("Purchase_Mnger =", value, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerNotEqualTo(String value) {
            addCriterion("Purchase_Mnger <>", value, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerGreaterThan(String value) {
            addCriterion("Purchase_Mnger >", value, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Purchase_Mnger >=", value, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerLessThan(String value) {
            addCriterion("Purchase_Mnger <", value, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerLessThanOrEqualTo(String value) {
            addCriterion("Purchase_Mnger <=", value, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerLike(String value) {
            addCriterion("Purchase_Mnger like", value, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerNotLike(String value) {
            addCriterion("Purchase_Mnger not like", value, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerIn(List<String> values) {
            addCriterion("Purchase_Mnger in", values, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerNotIn(List<String> values) {
            addCriterion("Purchase_Mnger not in", values, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerBetween(String value1, String value2) {
            addCriterion("Purchase_Mnger between", value1, value2, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andPurchaseMngerNotBetween(String value1, String value2) {
            addCriterion("Purchase_Mnger not between", value1, value2, "purchaseMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerIsNull() {
            addCriterion("Sales_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andSalesMngerIsNotNull() {
            addCriterion("Sales_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andSalesMngerEqualTo(String value) {
            addCriterion("Sales_Mnger =", value, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerNotEqualTo(String value) {
            addCriterion("Sales_Mnger <>", value, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerGreaterThan(String value) {
            addCriterion("Sales_Mnger >", value, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Sales_Mnger >=", value, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerLessThan(String value) {
            addCriterion("Sales_Mnger <", value, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerLessThanOrEqualTo(String value) {
            addCriterion("Sales_Mnger <=", value, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerLike(String value) {
            addCriterion("Sales_Mnger like", value, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerNotLike(String value) {
            addCriterion("Sales_Mnger not like", value, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerIn(List<String> values) {
            addCriterion("Sales_Mnger in", values, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerNotIn(List<String> values) {
            addCriterion("Sales_Mnger not in", values, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerBetween(String value1, String value2) {
            addCriterion("Sales_Mnger between", value1, value2, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andSalesMngerNotBetween(String value1, String value2) {
            addCriterion("Sales_Mnger not between", value1, value2, "salesMnger");
            return (Criteria) this;
        }

        public Criteria andPppdtIdIsNull() {
            addCriterion("PPPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPppdtIdIsNotNull() {
            addCriterion("PPPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPppdtIdEqualTo(String value) {
            addCriterion("PPPDT_ID =", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdNotEqualTo(String value) {
            addCriterion("PPPDT_ID <>", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdGreaterThan(String value) {
            addCriterion("PPPDT_ID >", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("PPPDT_ID >=", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdLessThan(String value) {
            addCriterion("PPPDT_ID <", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdLessThanOrEqualTo(String value) {
            addCriterion("PPPDT_ID <=", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdLike(String value) {
            addCriterion("PPPDT_ID like", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdNotLike(String value) {
            addCriterion("PPPDT_ID not like", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdIn(List<String> values) {
            addCriterion("PPPDT_ID in", values, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdNotIn(List<String> values) {
            addCriterion("PPPDT_ID not in", values, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdBetween(String value1, String value2) {
            addCriterion("PPPDT_ID between", value1, value2, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdNotBetween(String value1, String value2) {
            addCriterion("PPPDT_ID not between", value1, value2, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerIsNull() {
            addCriterion("Manufacture_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerIsNotNull() {
            addCriterion("Manufacture_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerEqualTo(String value) {
            addCriterion("Manufacture_Mnger =", value, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerNotEqualTo(String value) {
            addCriterion("Manufacture_Mnger <>", value, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerGreaterThan(String value) {
            addCriterion("Manufacture_Mnger >", value, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerGreaterThanOrEqualTo(String value) {
            addCriterion("Manufacture_Mnger >=", value, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerLessThan(String value) {
            addCriterion("Manufacture_Mnger <", value, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerLessThanOrEqualTo(String value) {
            addCriterion("Manufacture_Mnger <=", value, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerLike(String value) {
            addCriterion("Manufacture_Mnger like", value, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerNotLike(String value) {
            addCriterion("Manufacture_Mnger not like", value, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerIn(List<String> values) {
            addCriterion("Manufacture_Mnger in", values, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerNotIn(List<String> values) {
            addCriterion("Manufacture_Mnger not in", values, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerBetween(String value1, String value2) {
            addCriterion("Manufacture_Mnger between", value1, value2, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andManufactureMngerNotBetween(String value1, String value2) {
            addCriterion("Manufacture_Mnger not between", value1, value2, "manufactureMnger");
            return (Criteria) this;
        }

        public Criteria andFfIdIsNull() {
            addCriterion("FF_ID is null");
            return (Criteria) this;
        }

        public Criteria andFfIdIsNotNull() {
            addCriterion("FF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFfIdEqualTo(String value) {
            addCriterion("FF_ID =", value, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdNotEqualTo(String value) {
            addCriterion("FF_ID <>", value, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdGreaterThan(String value) {
            addCriterion("FF_ID >", value, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdGreaterThanOrEqualTo(String value) {
            addCriterion("FF_ID >=", value, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdLessThan(String value) {
            addCriterion("FF_ID <", value, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdLessThanOrEqualTo(String value) {
            addCriterion("FF_ID <=", value, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdLike(String value) {
            addCriterion("FF_ID like", value, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdNotLike(String value) {
            addCriterion("FF_ID not like", value, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdIn(List<String> values) {
            addCriterion("FF_ID in", values, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdNotIn(List<String> values) {
            addCriterion("FF_ID not in", values, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdBetween(String value1, String value2) {
            addCriterion("FF_ID between", value1, value2, "ffId");
            return (Criteria) this;
        }

        public Criteria andFfIdNotBetween(String value1, String value2) {
            addCriterion("FF_ID not between", value1, value2, "ffId");
            return (Criteria) this;
        }

        

        public Criteria andReadersIsNull() {
            addCriterion("Readers is null");
            return (Criteria) this;
        }

        public Criteria andReadersIsNotNull() {
            addCriterion("Readers is not null");
            return (Criteria) this;
        }

        public Criteria andReadersEqualTo(String value) {
            addCriterion("Readers =", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotEqualTo(String value) {
            addCriterion("Readers <>", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersGreaterThan(String value) {
            addCriterion("Readers >", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersGreaterThanOrEqualTo(String value) {
            addCriterion("Readers >=", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLessThan(String value) {
            addCriterion("Readers <", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLessThanOrEqualTo(String value) {
            addCriterion("Readers <=", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLike(String value) {
            addCriterion("Readers like", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotLike(String value) {
            addCriterion("Readers not like", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersIn(List<String> values) {
            addCriterion("Readers in", values, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotIn(List<String> values) {
            addCriterion("Readers not in", values, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersBetween(String value1, String value2) {
            addCriterion("Readers between", value1, value2, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotBetween(String value1, String value2) {
            addCriterion("Readers not between", value1, value2, "readers");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
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