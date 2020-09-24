package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseLineViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseLineViewExample() {
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

        public Criteria andLIsNull() {
            addCriterion("L is null");
            return (Criteria) this;
        }

        public Criteria andLIsNotNull() {
            addCriterion("L is not null");
            return (Criteria) this;
        }

        public Criteria andLEqualTo(String value) {
            addCriterion("L =", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotEqualTo(String value) {
            addCriterion("L <>", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThan(String value) {
            addCriterion("L >", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThanOrEqualTo(String value) {
            addCriterion("L >=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThan(String value) {
            addCriterion("L <", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThanOrEqualTo(String value) {
            addCriterion("L <=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLike(String value) {
            addCriterion("L like", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotLike(String value) {
            addCriterion("L not like", value, "l");
            return (Criteria) this;
        }

        public Criteria andLIn(List<String> values) {
            addCriterion("L in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLNotIn(List<String> values) {
            addCriterion("L not in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLBetween(String value1, String value2) {
            addCriterion("L between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andLNotBetween(String value1, String value2) {
            addCriterion("L not between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("C is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("C is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(String value) {
            addCriterion("C =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(String value) {
            addCriterion("C <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(String value) {
            addCriterion("C >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(String value) {
            addCriterion("C >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(String value) {
            addCriterion("C <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(String value) {
            addCriterion("C <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLike(String value) {
            addCriterion("C like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotLike(String value) {
            addCriterion("C not like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<String> values) {
            addCriterion("C in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<String> values) {
            addCriterion("C not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(String value1, String value2) {
            addCriterion("C between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(String value1, String value2) {
            addCriterion("C not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andBIsNull() {
            addCriterion("B is null");
            return (Criteria) this;
        }

        public Criteria andBIsNotNull() {
            addCriterion("B is not null");
            return (Criteria) this;
        }

        public Criteria andBEqualTo(String value) {
            addCriterion("B =", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotEqualTo(String value) {
            addCriterion("B <>", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThan(String value) {
            addCriterion("B >", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThanOrEqualTo(String value) {
            addCriterion("B >=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThan(String value) {
            addCriterion("B <", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThanOrEqualTo(String value) {
            addCriterion("B <=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLike(String value) {
            addCriterion("B like", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotLike(String value) {
            addCriterion("B not like", value, "b");
            return (Criteria) this;
        }

        public Criteria andBIn(List<String> values) {
            addCriterion("B in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBNotIn(List<String> values) {
            addCriterion("B not in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBBetween(String value1, String value2) {
            addCriterion("B between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andBNotBetween(String value1, String value2) {
            addCriterion("B not between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andDIsNull() {
            addCriterion("D is null");
            return (Criteria) this;
        }

        public Criteria andDIsNotNull() {
            addCriterion("D is not null");
            return (Criteria) this;
        }

        public Criteria andDEqualTo(String value) {
            addCriterion("D =", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotEqualTo(String value) {
            addCriterion("D <>", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThan(String value) {
            addCriterion("D >", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThanOrEqualTo(String value) {
            addCriterion("D >=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThan(String value) {
            addCriterion("D <", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThanOrEqualTo(String value) {
            addCriterion("D <=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLike(String value) {
            addCriterion("D like", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotLike(String value) {
            addCriterion("D not like", value, "d");
            return (Criteria) this;
        }

        public Criteria andDIn(List<String> values) {
            addCriterion("D in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDNotIn(List<String> values) {
            addCriterion("D not in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDBetween(String value1, String value2) {
            addCriterion("D between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andDNotBetween(String value1, String value2) {
            addCriterion("D not between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andSpIsNull() {
            addCriterion("SP is null");
            return (Criteria) this;
        }

        public Criteria andSpIsNotNull() {
            addCriterion("SP is not null");
            return (Criteria) this;
        }

        public Criteria andSpEqualTo(String value) {
            addCriterion("SP =", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpNotEqualTo(String value) {
            addCriterion("SP <>", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpGreaterThan(String value) {
            addCriterion("SP >", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpGreaterThanOrEqualTo(String value) {
            addCriterion("SP >=", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpLessThan(String value) {
            addCriterion("SP <", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpLessThanOrEqualTo(String value) {
            addCriterion("SP <=", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpLike(String value) {
            addCriterion("SP like", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpNotLike(String value) {
            addCriterion("SP not like", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpIn(List<String> values) {
            addCriterion("SP in", values, "sp");
            return (Criteria) this;
        }

        public Criteria andSpNotIn(List<String> values) {
            addCriterion("SP not in", values, "sp");
            return (Criteria) this;
        }

        public Criteria andSpBetween(String value1, String value2) {
            addCriterion("SP between", value1, value2, "sp");
            return (Criteria) this;
        }

        public Criteria andSpNotBetween(String value1, String value2) {
            addCriterion("SP not between", value1, value2, "sp");
            return (Criteria) this;
        }

        public Criteria andBaselinenoIsNull() {
            addCriterion("BASELINENo is null");
            return (Criteria) this;
        }

        public Criteria andBaselinenoIsNotNull() {
            addCriterion("BASELINENo is not null");
            return (Criteria) this;
        }

        public Criteria andBaselinenoEqualTo(String value) {
            addCriterion("BASELINENo =", value, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoNotEqualTo(String value) {
            addCriterion("BASELINENo <>", value, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoGreaterThan(String value) {
            addCriterion("BASELINENo >", value, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINENo >=", value, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoLessThan(String value) {
            addCriterion("BASELINENo <", value, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoLessThanOrEqualTo(String value) {
            addCriterion("BASELINENo <=", value, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoLike(String value) {
            addCriterion("BASELINENo like", value, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoNotLike(String value) {
            addCriterion("BASELINENo not like", value, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoIn(List<String> values) {
            addCriterion("BASELINENo in", values, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoNotIn(List<String> values) {
            addCriterion("BASELINENo not in", values, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoBetween(String value1, String value2) {
            addCriterion("BASELINENo between", value1, value2, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselinenoNotBetween(String value1, String value2) {
            addCriterion("BASELINENo not between", value1, value2, "baselineno");
            return (Criteria) this;
        }

        public Criteria andBaselineIsNull() {
            addCriterion("BASELINE is null");
            return (Criteria) this;
        }

        public Criteria andBaselineIsNotNull() {
            addCriterion("BASELINE is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineEqualTo(String value) {
            addCriterion("BASELINE =", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineNotEqualTo(String value) {
            addCriterion("BASELINE <>", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineGreaterThan(String value) {
            addCriterion("BASELINE >", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE >=", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineLessThan(String value) {
            addCriterion("BASELINE <", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineLessThanOrEqualTo(String value) {
            addCriterion("BASELINE <=", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineLike(String value) {
            addCriterion("BASELINE like", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineNotLike(String value) {
            addCriterion("BASELINE not like", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineIn(List<String> values) {
            addCriterion("BASELINE in", values, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineNotIn(List<String> values) {
            addCriterion("BASELINE not in", values, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineBetween(String value1, String value2) {
            addCriterion("BASELINE between", value1, value2, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineNotBetween(String value1, String value2) {
            addCriterion("BASELINE not between", value1, value2, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineoldIsNull() {
            addCriterion("BASELINEOld is null");
            return (Criteria) this;
        }

        public Criteria andBaselineoldIsNotNull() {
            addCriterion("BASELINEOld is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineoldEqualTo(String value) {
            addCriterion("BASELINEOld =", value, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldNotEqualTo(String value) {
            addCriterion("BASELINEOld <>", value, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldGreaterThan(String value) {
            addCriterion("BASELINEOld >", value, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINEOld >=", value, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldLessThan(String value) {
            addCriterion("BASELINEOld <", value, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldLessThanOrEqualTo(String value) {
            addCriterion("BASELINEOld <=", value, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldLike(String value) {
            addCriterion("BASELINEOld like", value, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldNotLike(String value) {
            addCriterion("BASELINEOld not like", value, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldIn(List<String> values) {
            addCriterion("BASELINEOld in", values, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldNotIn(List<String> values) {
            addCriterion("BASELINEOld not in", values, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldBetween(String value1, String value2) {
            addCriterion("BASELINEOld between", value1, value2, "baselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoldNotBetween(String value1, String value2) {
            addCriterion("BASELINEOld not between", value1, value2, "baselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineIsNull() {
            addCriterion("engBASELINE is null");
            return (Criteria) this;
        }

        public Criteria andEngbaselineIsNotNull() {
            addCriterion("engBASELINE is not null");
            return (Criteria) this;
        }

        public Criteria andEngbaselineEqualTo(String value) {
            addCriterion("engBASELINE =", value, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineNotEqualTo(String value) {
            addCriterion("engBASELINE <>", value, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineGreaterThan(String value) {
            addCriterion("engBASELINE >", value, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineGreaterThanOrEqualTo(String value) {
            addCriterion("engBASELINE >=", value, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineLessThan(String value) {
            addCriterion("engBASELINE <", value, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineLessThanOrEqualTo(String value) {
            addCriterion("engBASELINE <=", value, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineLike(String value) {
            addCriterion("engBASELINE like", value, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineNotLike(String value) {
            addCriterion("engBASELINE not like", value, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineIn(List<String> values) {
            addCriterion("engBASELINE in", values, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineNotIn(List<String> values) {
            addCriterion("engBASELINE not in", values, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineBetween(String value1, String value2) {
            addCriterion("engBASELINE between", value1, value2, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andEngbaselineNotBetween(String value1, String value2) {
            addCriterion("engBASELINE not between", value1, value2, "engbaseline");
            return (Criteria) this;
        }

        public Criteria andBaseline1IsNull() {
            addCriterion("BASELINE_1 is null");
            return (Criteria) this;
        }

        public Criteria andBaseline1IsNotNull() {
            addCriterion("BASELINE_1 is not null");
            return (Criteria) this;
        }

        public Criteria andBaseline1EqualTo(String value) {
            addCriterion("BASELINE_1 =", value, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1NotEqualTo(String value) {
            addCriterion("BASELINE_1 <>", value, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1GreaterThan(String value) {
            addCriterion("BASELINE_1 >", value, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1GreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE_1 >=", value, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1LessThan(String value) {
            addCriterion("BASELINE_1 <", value, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1LessThanOrEqualTo(String value) {
            addCriterion("BASELINE_1 <=", value, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1Like(String value) {
            addCriterion("BASELINE_1 like", value, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1NotLike(String value) {
            addCriterion("BASELINE_1 not like", value, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1In(List<String> values) {
            addCriterion("BASELINE_1 in", values, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1NotIn(List<String> values) {
            addCriterion("BASELINE_1 not in", values, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1Between(String value1, String value2) {
            addCriterion("BASELINE_1 between", value1, value2, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaseline1NotBetween(String value1, String value2) {
            addCriterion("BASELINE_1 not between", value1, value2, "baseline1");
            return (Criteria) this;
        }

        public Criteria andBaselineoutIsNull() {
            addCriterion("BASELINEOut is null");
            return (Criteria) this;
        }

        public Criteria andBaselineoutIsNotNull() {
            addCriterion("BASELINEOut is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineoutEqualTo(String value) {
            addCriterion("BASELINEOut =", value, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutNotEqualTo(String value) {
            addCriterion("BASELINEOut <>", value, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutGreaterThan(String value) {
            addCriterion("BASELINEOut >", value, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINEOut >=", value, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutLessThan(String value) {
            addCriterion("BASELINEOut <", value, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutLessThanOrEqualTo(String value) {
            addCriterion("BASELINEOut <=", value, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutLike(String value) {
            addCriterion("BASELINEOut like", value, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutNotLike(String value) {
            addCriterion("BASELINEOut not like", value, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutIn(List<String> values) {
            addCriterion("BASELINEOut in", values, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutNotIn(List<String> values) {
            addCriterion("BASELINEOut not in", values, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutBetween(String value1, String value2) {
            addCriterion("BASELINEOut between", value1, value2, "baselineout");
            return (Criteria) this;
        }

        public Criteria andBaselineoutNotBetween(String value1, String value2) {
            addCriterion("BASELINEOut not between", value1, value2, "baselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutIsNull() {
            addCriterion("engBASELINEOut is null");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutIsNotNull() {
            addCriterion("engBASELINEOut is not null");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutEqualTo(String value) {
            addCriterion("engBASELINEOut =", value, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutNotEqualTo(String value) {
            addCriterion("engBASELINEOut <>", value, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutGreaterThan(String value) {
            addCriterion("engBASELINEOut >", value, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutGreaterThanOrEqualTo(String value) {
            addCriterion("engBASELINEOut >=", value, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutLessThan(String value) {
            addCriterion("engBASELINEOut <", value, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutLessThanOrEqualTo(String value) {
            addCriterion("engBASELINEOut <=", value, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutLike(String value) {
            addCriterion("engBASELINEOut like", value, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutNotLike(String value) {
            addCriterion("engBASELINEOut not like", value, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutIn(List<String> values) {
            addCriterion("engBASELINEOut in", values, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutNotIn(List<String> values) {
            addCriterion("engBASELINEOut not in", values, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutBetween(String value1, String value2) {
            addCriterion("engBASELINEOut between", value1, value2, "engbaselineout");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutNotBetween(String value1, String value2) {
            addCriterion("engBASELINEOut not between", value1, value2, "engbaselineout");
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
            addCriterion("PRODUCTNo is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("PRODUCTNo is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("PRODUCTNo =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("PRODUCTNo <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("PRODUCTNo >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNo >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("PRODUCTNo <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNo <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("PRODUCTNo like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("PRODUCTNo not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("PRODUCTNo in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("PRODUCTNo not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("PRODUCTNo between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("PRODUCTNo not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNull() {
            addCriterion("VERSIONNo is null");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNotNull() {
            addCriterion("VERSIONNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnoEqualTo(String value) {
            addCriterion("VERSIONNo =", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotEqualTo(String value) {
            addCriterion("VERSIONNo <>", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThan(String value) {
            addCriterion("VERSIONNo >", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThanOrEqualTo(String value) {
            addCriterion("VERSIONNo >=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThan(String value) {
            addCriterion("VERSIONNo <", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThanOrEqualTo(String value) {
            addCriterion("VERSIONNo <=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLike(String value) {
            addCriterion("VERSIONNo like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotLike(String value) {
            addCriterion("VERSIONNo not like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoIn(List<String> values) {
            addCriterion("VERSIONNo in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotIn(List<String> values) {
            addCriterion("VERSIONNo not in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoBetween(String value1, String value2) {
            addCriterion("VERSIONNo between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotBetween(String value1, String value2) {
            addCriterion("VERSIONNo not between", value1, value2, "versionno");
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

        public Criteria andParentitemnoIsNull() {
            addCriterion("ParentItemNo is null");
            return (Criteria) this;
        }

        public Criteria andParentitemnoIsNotNull() {
            addCriterion("ParentItemNo is not null");
            return (Criteria) this;
        }

        public Criteria andParentitemnoEqualTo(String value) {
            addCriterion("ParentItemNo =", value, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoNotEqualTo(String value) {
            addCriterion("ParentItemNo <>", value, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoGreaterThan(String value) {
            addCriterion("ParentItemNo >", value, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoGreaterThanOrEqualTo(String value) {
            addCriterion("ParentItemNo >=", value, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoLessThan(String value) {
            addCriterion("ParentItemNo <", value, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoLessThanOrEqualTo(String value) {
            addCriterion("ParentItemNo <=", value, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoLike(String value) {
            addCriterion("ParentItemNo like", value, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoNotLike(String value) {
            addCriterion("ParentItemNo not like", value, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoIn(List<String> values) {
            addCriterion("ParentItemNo in", values, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoNotIn(List<String> values) {
            addCriterion("ParentItemNo not in", values, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoBetween(String value1, String value2) {
            addCriterion("ParentItemNo between", value1, value2, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andParentitemnoNotBetween(String value1, String value2) {
            addCriterion("ParentItemNo not between", value1, value2, "parentitemno");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusIsNull() {
            addCriterion("BASELINEStatus is null");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusIsNotNull() {
            addCriterion("BASELINEStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusEqualTo(String value) {
            addCriterion("BASELINEStatus =", value, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusNotEqualTo(String value) {
            addCriterion("BASELINEStatus <>", value, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusGreaterThan(String value) {
            addCriterion("BASELINEStatus >", value, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINEStatus >=", value, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusLessThan(String value) {
            addCriterion("BASELINEStatus <", value, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusLessThanOrEqualTo(String value) {
            addCriterion("BASELINEStatus <=", value, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusLike(String value) {
            addCriterion("BASELINEStatus like", value, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusNotLike(String value) {
            addCriterion("BASELINEStatus not like", value, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusIn(List<String> values) {
            addCriterion("BASELINEStatus in", values, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusNotIn(List<String> values) {
            addCriterion("BASELINEStatus not in", values, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusBetween(String value1, String value2) {
            addCriterion("BASELINEStatus between", value1, value2, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinestatusNotBetween(String value1, String value2) {
            addCriterion("BASELINEStatus not between", value1, value2, "baselinestatus");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeIsNull() {
            addCriterion("BASELINEType is null");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeIsNotNull() {
            addCriterion("BASELINEType is not null");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeEqualTo(String value) {
            addCriterion("BASELINEType =", value, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeNotEqualTo(String value) {
            addCriterion("BASELINEType <>", value, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeGreaterThan(String value) {
            addCriterion("BASELINEType >", value, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINEType >=", value, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeLessThan(String value) {
            addCriterion("BASELINEType <", value, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeLessThanOrEqualTo(String value) {
            addCriterion("BASELINEType <=", value, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeLike(String value) {
            addCriterion("BASELINEType like", value, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeNotLike(String value) {
            addCriterion("BASELINEType not like", value, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeIn(List<String> values) {
            addCriterion("BASELINEType in", values, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeNotIn(List<String> values) {
            addCriterion("BASELINEType not in", values, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeBetween(String value1, String value2) {
            addCriterion("BASELINEType between", value1, value2, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselinetypeNotBetween(String value1, String value2) {
            addCriterion("BASELINEType not between", value1, value2, "baselinetype");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeIsNull() {
            addCriterion("BASELINE_IssueTime is null");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeIsNotNull() {
            addCriterion("BASELINE_IssueTime is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeEqualTo(Date value) {
            addCriterion("BASELINE_IssueTime =", value, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeNotEqualTo(Date value) {
            addCriterion("BASELINE_IssueTime <>", value, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeGreaterThan(Date value) {
            addCriterion("BASELINE_IssueTime >", value, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BASELINE_IssueTime >=", value, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeLessThan(Date value) {
            addCriterion("BASELINE_IssueTime <", value, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeLessThanOrEqualTo(Date value) {
            addCriterion("BASELINE_IssueTime <=", value, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeIn(List<Date> values) {
            addCriterion("BASELINE_IssueTime in", values, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeNotIn(List<Date> values) {
            addCriterion("BASELINE_IssueTime not in", values, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeBetween(Date value1, Date value2) {
            addCriterion("BASELINE_IssueTime between", value1, value2, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuetimeNotBetween(Date value1, Date value2) {
            addCriterion("BASELINE_IssueTime not between", value1, value2, "baselineIssuetime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeIsNull() {
            addCriterion("BASELINE_DisableTime is null");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeIsNotNull() {
            addCriterion("BASELINE_DisableTime is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeEqualTo(Date value) {
            addCriterion("BASELINE_DisableTime =", value, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeNotEqualTo(Date value) {
            addCriterion("BASELINE_DisableTime <>", value, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeGreaterThan(Date value) {
            addCriterion("BASELINE_DisableTime >", value, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BASELINE_DisableTime >=", value, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeLessThan(Date value) {
            addCriterion("BASELINE_DisableTime <", value, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeLessThanOrEqualTo(Date value) {
            addCriterion("BASELINE_DisableTime <=", value, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeIn(List<Date> values) {
            addCriterion("BASELINE_DisableTime in", values, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeNotIn(List<Date> values) {
            addCriterion("BASELINE_DisableTime not in", values, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeBetween(Date value1, Date value2) {
            addCriterion("BASELINE_DisableTime between", value1, value2, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineDisabletimeNotBetween(Date value1, Date value2) {
            addCriterion("BASELINE_DisableTime not between", value1, value2, "baselineDisabletime");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherIsNull() {
            addCriterion("BASELINE_usingLimitWhether is null");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherIsNotNull() {
            addCriterion("BASELINE_usingLimitWhether is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherEqualTo(String value) {
            addCriterion("BASELINE_usingLimitWhether =", value, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherNotEqualTo(String value) {
            addCriterion("BASELINE_usingLimitWhether <>", value, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherGreaterThan(String value) {
            addCriterion("BASELINE_usingLimitWhether >", value, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE_usingLimitWhether >=", value, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherLessThan(String value) {
            addCriterion("BASELINE_usingLimitWhether <", value, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherLessThanOrEqualTo(String value) {
            addCriterion("BASELINE_usingLimitWhether <=", value, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherLike(String value) {
            addCriterion("BASELINE_usingLimitWhether like", value, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherNotLike(String value) {
            addCriterion("BASELINE_usingLimitWhether not like", value, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherIn(List<String> values) {
            addCriterion("BASELINE_usingLimitWhether in", values, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherNotIn(List<String> values) {
            addCriterion("BASELINE_usingLimitWhether not in", values, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherBetween(String value1, String value2) {
            addCriterion("BASELINE_usingLimitWhether between", value1, value2, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUsinglimitwhetherNotBetween(String value1, String value2) {
            addCriterion("BASELINE_usingLimitWhether not between", value1, value2, "baselineUsinglimitwhether");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueIsNull() {
            addCriterion("BASELINE_UrgencyIssue is null");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueIsNotNull() {
            addCriterion("BASELINE_UrgencyIssue is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueEqualTo(String value) {
            addCriterion("BASELINE_UrgencyIssue =", value, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueNotEqualTo(String value) {
            addCriterion("BASELINE_UrgencyIssue <>", value, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueGreaterThan(String value) {
            addCriterion("BASELINE_UrgencyIssue >", value, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE_UrgencyIssue >=", value, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueLessThan(String value) {
            addCriterion("BASELINE_UrgencyIssue <", value, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueLessThanOrEqualTo(String value) {
            addCriterion("BASELINE_UrgencyIssue <=", value, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueLike(String value) {
            addCriterion("BASELINE_UrgencyIssue like", value, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueNotLike(String value) {
            addCriterion("BASELINE_UrgencyIssue not like", value, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueIn(List<String> values) {
            addCriterion("BASELINE_UrgencyIssue in", values, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueNotIn(List<String> values) {
            addCriterion("BASELINE_UrgencyIssue not in", values, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueBetween(String value1, String value2) {
            addCriterion("BASELINE_UrgencyIssue between", value1, value2, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUrgencyissueNotBetween(String value1, String value2) {
            addCriterion("BASELINE_UrgencyIssue not between", value1, value2, "baselineUrgencyissue");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeIsNull() {
            addCriterion("BASELINE_UsingRange is null");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeIsNotNull() {
            addCriterion("BASELINE_UsingRange is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeEqualTo(String value) {
            addCriterion("BASELINE_UsingRange =", value, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeNotEqualTo(String value) {
            addCriterion("BASELINE_UsingRange <>", value, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeGreaterThan(String value) {
            addCriterion("BASELINE_UsingRange >", value, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE_UsingRange >=", value, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeLessThan(String value) {
            addCriterion("BASELINE_UsingRange <", value, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeLessThanOrEqualTo(String value) {
            addCriterion("BASELINE_UsingRange <=", value, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeLike(String value) {
            addCriterion("BASELINE_UsingRange like", value, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeNotLike(String value) {
            addCriterion("BASELINE_UsingRange not like", value, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeIn(List<String> values) {
            addCriterion("BASELINE_UsingRange in", values, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeNotIn(List<String> values) {
            addCriterion("BASELINE_UsingRange not in", values, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeBetween(String value1, String value2) {
            addCriterion("BASELINE_UsingRange between", value1, value2, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineUsingrangeNotBetween(String value1, String value2) {
            addCriterion("BASELINE_UsingRange not between", value1, value2, "baselineUsingrange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeIsNull() {
            addCriterion("BASELINE_IssueRange is null");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeIsNotNull() {
            addCriterion("BASELINE_IssueRange is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeEqualTo(String value) {
            addCriterion("BASELINE_IssueRange =", value, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeNotEqualTo(String value) {
            addCriterion("BASELINE_IssueRange <>", value, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeGreaterThan(String value) {
            addCriterion("BASELINE_IssueRange >", value, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE_IssueRange >=", value, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeLessThan(String value) {
            addCriterion("BASELINE_IssueRange <", value, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeLessThanOrEqualTo(String value) {
            addCriterion("BASELINE_IssueRange <=", value, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeLike(String value) {
            addCriterion("BASELINE_IssueRange like", value, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeNotLike(String value) {
            addCriterion("BASELINE_IssueRange not like", value, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeIn(List<String> values) {
            addCriterion("BASELINE_IssueRange in", values, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeNotIn(List<String> values) {
            addCriterion("BASELINE_IssueRange not in", values, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeBetween(String value1, String value2) {
            addCriterion("BASELINE_IssueRange between", value1, value2, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuerangeNotBetween(String value1, String value2) {
            addCriterion("BASELINE_IssueRange not between", value1, value2, "baselineIssuerange");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleIsNull() {
            addCriterion("BASELINE_IssueStyle is null");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleIsNotNull() {
            addCriterion("BASELINE_IssueStyle is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleEqualTo(String value) {
            addCriterion("BASELINE_IssueStyle =", value, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleNotEqualTo(String value) {
            addCriterion("BASELINE_IssueStyle <>", value, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleGreaterThan(String value) {
            addCriterion("BASELINE_IssueStyle >", value, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE_IssueStyle >=", value, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleLessThan(String value) {
            addCriterion("BASELINE_IssueStyle <", value, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleLessThanOrEqualTo(String value) {
            addCriterion("BASELINE_IssueStyle <=", value, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleLike(String value) {
            addCriterion("BASELINE_IssueStyle like", value, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleNotLike(String value) {
            addCriterion("BASELINE_IssueStyle not like", value, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleIn(List<String> values) {
            addCriterion("BASELINE_IssueStyle in", values, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleNotIn(List<String> values) {
            addCriterion("BASELINE_IssueStyle not in", values, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleBetween(String value1, String value2) {
            addCriterion("BASELINE_IssueStyle between", value1, value2, "baselineIssuestyle");
            return (Criteria) this;
        }

        public Criteria andBaselineIssuestyleNotBetween(String value1, String value2) {
            addCriterion("BASELINE_IssueStyle not between", value1, value2, "baselineIssuestyle");
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

        public Criteria andCreatedUserIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(String value) {
            addCriterion("CREATED_USER =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(String value) {
            addCriterion("CREATED_USER <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(String value) {
            addCriterion("CREATED_USER >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(String value) {
            addCriterion("CREATED_USER <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLike(String value) {
            addCriterion("CREATED_USER like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotLike(String value) {
            addCriterion("CREATED_USER not like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<String> values) {
            addCriterion("CREATED_USER in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<String> values) {
            addCriterion("CREATED_USER not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(String value1, String value2) {
            addCriterion("CREATED_USER between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("MODIFY_USER =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("MODIFY_USER <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("MODIFY_USER >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("MODIFY_USER <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("MODIFY_USER like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("MODIFY_USER not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("MODIFY_USER in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("MODIFY_USER not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("MODIFY_USER between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("MODIFY_USER not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyDataIsNull() {
            addCriterion("MODIFY_DATA is null");
            return (Criteria) this;
        }

        public Criteria andModifyDataIsNotNull() {
            addCriterion("MODIFY_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDataEqualTo(Date value) {
            addCriterion("MODIFY_DATA =", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataNotEqualTo(Date value) {
            addCriterion("MODIFY_DATA <>", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataGreaterThan(Date value) {
            addCriterion("MODIFY_DATA >", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATA >=", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataLessThan(Date value) {
            addCriterion("MODIFY_DATA <", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATA <=", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataIn(List<Date> values) {
            addCriterion("MODIFY_DATA in", values, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataNotIn(List<Date> values) {
            addCriterion("MODIFY_DATA not in", values, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATA between", value1, value2, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATA not between", value1, value2, "modifyData");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNull() {
            addCriterion("STANDBY1 is null");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNotNull() {
            addCriterion("STANDBY1 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby1EqualTo(String value) {
            addCriterion("STANDBY1 =", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotEqualTo(String value) {
            addCriterion("STANDBY1 <>", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThan(String value) {
            addCriterion("STANDBY1 >", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY1 >=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThan(String value) {
            addCriterion("STANDBY1 <", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThanOrEqualTo(String value) {
            addCriterion("STANDBY1 <=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Like(String value) {
            addCriterion("STANDBY1 like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotLike(String value) {
            addCriterion("STANDBY1 not like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1In(List<String> values) {
            addCriterion("STANDBY1 in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotIn(List<String> values) {
            addCriterion("STANDBY1 not in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Between(String value1, String value2) {
            addCriterion("STANDBY1 between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotBetween(String value1, String value2) {
            addCriterion("STANDBY1 not between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNull() {
            addCriterion("STANDBY2 is null");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNotNull() {
            addCriterion("STANDBY2 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby2EqualTo(String value) {
            addCriterion("STANDBY2 =", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotEqualTo(String value) {
            addCriterion("STANDBY2 <>", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThan(String value) {
            addCriterion("STANDBY2 >", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY2 >=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThan(String value) {
            addCriterion("STANDBY2 <", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThanOrEqualTo(String value) {
            addCriterion("STANDBY2 <=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Like(String value) {
            addCriterion("STANDBY2 like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotLike(String value) {
            addCriterion("STANDBY2 not like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2In(List<String> values) {
            addCriterion("STANDBY2 in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotIn(List<String> values) {
            addCriterion("STANDBY2 not in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Between(String value1, String value2) {
            addCriterion("STANDBY2 between", value1, value2, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotBetween(String value1, String value2) {
            addCriterion("STANDBY2 not between", value1, value2, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby3IsNull() {
            addCriterion("STANDBY3 is null");
            return (Criteria) this;
        }

        public Criteria andStandby3IsNotNull() {
            addCriterion("STANDBY3 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby3EqualTo(String value) {
            addCriterion("STANDBY3 =", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotEqualTo(String value) {
            addCriterion("STANDBY3 <>", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3GreaterThan(String value) {
            addCriterion("STANDBY3 >", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY3 >=", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3LessThan(String value) {
            addCriterion("STANDBY3 <", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3LessThanOrEqualTo(String value) {
            addCriterion("STANDBY3 <=", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3Like(String value) {
            addCriterion("STANDBY3 like", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotLike(String value) {
            addCriterion("STANDBY3 not like", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3In(List<String> values) {
            addCriterion("STANDBY3 in", values, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotIn(List<String> values) {
            addCriterion("STANDBY3 not in", values, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3Between(String value1, String value2) {
            addCriterion("STANDBY3 between", value1, value2, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotBetween(String value1, String value2) {
            addCriterion("STANDBY3 not between", value1, value2, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby4IsNull() {
            addCriterion("STANDBY4 is null");
            return (Criteria) this;
        }

        public Criteria andStandby4IsNotNull() {
            addCriterion("STANDBY4 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby4EqualTo(String value) {
            addCriterion("STANDBY4 =", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotEqualTo(String value) {
            addCriterion("STANDBY4 <>", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4GreaterThan(String value) {
            addCriterion("STANDBY4 >", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY4 >=", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4LessThan(String value) {
            addCriterion("STANDBY4 <", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4LessThanOrEqualTo(String value) {
            addCriterion("STANDBY4 <=", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4Like(String value) {
            addCriterion("STANDBY4 like", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotLike(String value) {
            addCriterion("STANDBY4 not like", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4In(List<String> values) {
            addCriterion("STANDBY4 in", values, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotIn(List<String> values) {
            addCriterion("STANDBY4 not in", values, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4Between(String value1, String value2) {
            addCriterion("STANDBY4 between", value1, value2, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotBetween(String value1, String value2) {
            addCriterion("STANDBY4 not between", value1, value2, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby5IsNull() {
            addCriterion("STANDBY5 is null");
            return (Criteria) this;
        }

        public Criteria andStandby5IsNotNull() {
            addCriterion("STANDBY5 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby5EqualTo(String value) {
            addCriterion("STANDBY5 =", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotEqualTo(String value) {
            addCriterion("STANDBY5 <>", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5GreaterThan(String value) {
            addCriterion("STANDBY5 >", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY5 >=", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5LessThan(String value) {
            addCriterion("STANDBY5 <", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5LessThanOrEqualTo(String value) {
            addCriterion("STANDBY5 <=", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5Like(String value) {
            addCriterion("STANDBY5 like", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotLike(String value) {
            addCriterion("STANDBY5 not like", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5In(List<String> values) {
            addCriterion("STANDBY5 in", values, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotIn(List<String> values) {
            addCriterion("STANDBY5 not in", values, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5Between(String value1, String value2) {
            addCriterion("STANDBY5 between", value1, value2, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotBetween(String value1, String value2) {
            addCriterion("STANDBY5 not between", value1, value2, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby6IsNull() {
            addCriterion("STANDBY6 is null");
            return (Criteria) this;
        }

        public Criteria andStandby6IsNotNull() {
            addCriterion("STANDBY6 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby6EqualTo(String value) {
            addCriterion("STANDBY6 =", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6NotEqualTo(String value) {
            addCriterion("STANDBY6 <>", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6GreaterThan(String value) {
            addCriterion("STANDBY6 >", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY6 >=", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6LessThan(String value) {
            addCriterion("STANDBY6 <", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6LessThanOrEqualTo(String value) {
            addCriterion("STANDBY6 <=", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6Like(String value) {
            addCriterion("STANDBY6 like", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6NotLike(String value) {
            addCriterion("STANDBY6 not like", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6In(List<String> values) {
            addCriterion("STANDBY6 in", values, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6NotIn(List<String> values) {
            addCriterion("STANDBY6 not in", values, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6Between(String value1, String value2) {
            addCriterion("STANDBY6 between", value1, value2, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6NotBetween(String value1, String value2) {
            addCriterion("STANDBY6 not between", value1, value2, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby7IsNull() {
            addCriterion("STANDBY7 is null");
            return (Criteria) this;
        }

        public Criteria andStandby7IsNotNull() {
            addCriterion("STANDBY7 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby7EqualTo(String value) {
            addCriterion("STANDBY7 =", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7NotEqualTo(String value) {
            addCriterion("STANDBY7 <>", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7GreaterThan(String value) {
            addCriterion("STANDBY7 >", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY7 >=", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7LessThan(String value) {
            addCriterion("STANDBY7 <", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7LessThanOrEqualTo(String value) {
            addCriterion("STANDBY7 <=", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7Like(String value) {
            addCriterion("STANDBY7 like", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7NotLike(String value) {
            addCriterion("STANDBY7 not like", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7In(List<String> values) {
            addCriterion("STANDBY7 in", values, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7NotIn(List<String> values) {
            addCriterion("STANDBY7 not in", values, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7Between(String value1, String value2) {
            addCriterion("STANDBY7 between", value1, value2, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7NotBetween(String value1, String value2) {
            addCriterion("STANDBY7 not between", value1, value2, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby8IsNull() {
            addCriterion("STANDBY8 is null");
            return (Criteria) this;
        }

        public Criteria andStandby8IsNotNull() {
            addCriterion("STANDBY8 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby8EqualTo(String value) {
            addCriterion("STANDBY8 =", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8NotEqualTo(String value) {
            addCriterion("STANDBY8 <>", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8GreaterThan(String value) {
            addCriterion("STANDBY8 >", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY8 >=", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8LessThan(String value) {
            addCriterion("STANDBY8 <", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8LessThanOrEqualTo(String value) {
            addCriterion("STANDBY8 <=", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8Like(String value) {
            addCriterion("STANDBY8 like", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8NotLike(String value) {
            addCriterion("STANDBY8 not like", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8In(List<String> values) {
            addCriterion("STANDBY8 in", values, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8NotIn(List<String> values) {
            addCriterion("STANDBY8 not in", values, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8Between(String value1, String value2) {
            addCriterion("STANDBY8 between", value1, value2, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8NotBetween(String value1, String value2) {
            addCriterion("STANDBY8 not between", value1, value2, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby9IsNull() {
            addCriterion("STANDBY9 is null");
            return (Criteria) this;
        }

        public Criteria andStandby9IsNotNull() {
            addCriterion("STANDBY9 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby9EqualTo(String value) {
            addCriterion("STANDBY9 =", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9NotEqualTo(String value) {
            addCriterion("STANDBY9 <>", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9GreaterThan(String value) {
            addCriterion("STANDBY9 >", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY9 >=", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9LessThan(String value) {
            addCriterion("STANDBY9 <", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9LessThanOrEqualTo(String value) {
            addCriterion("STANDBY9 <=", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9Like(String value) {
            addCriterion("STANDBY9 like", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9NotLike(String value) {
            addCriterion("STANDBY9 not like", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9In(List<String> values) {
            addCriterion("STANDBY9 in", values, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9NotIn(List<String> values) {
            addCriterion("STANDBY9 not in", values, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9Between(String value1, String value2) {
            addCriterion("STANDBY9 between", value1, value2, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9NotBetween(String value1, String value2) {
            addCriterion("STANDBY9 not between", value1, value2, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby10IsNull() {
            addCriterion("STANDBY10 is null");
            return (Criteria) this;
        }

        public Criteria andStandby10IsNotNull() {
            addCriterion("STANDBY10 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby10EqualTo(String value) {
            addCriterion("STANDBY10 =", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10NotEqualTo(String value) {
            addCriterion("STANDBY10 <>", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10GreaterThan(String value) {
            addCriterion("STANDBY10 >", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY10 >=", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10LessThan(String value) {
            addCriterion("STANDBY10 <", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10LessThanOrEqualTo(String value) {
            addCriterion("STANDBY10 <=", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10Like(String value) {
            addCriterion("STANDBY10 like", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10NotLike(String value) {
            addCriterion("STANDBY10 not like", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10In(List<String> values) {
            addCriterion("STANDBY10 in", values, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10NotIn(List<String> values) {
            addCriterion("STANDBY10 not in", values, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10Between(String value1, String value2) {
            addCriterion("STANDBY10 between", value1, value2, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10NotBetween(String value1, String value2) {
            addCriterion("STANDBY10 not between", value1, value2, "standby10");
            return (Criteria) this;
        }

        public Criteria andProdlineIsNull() {
            addCriterion("PRODLINE is null");
            return (Criteria) this;
        }

        public Criteria andProdlineIsNotNull() {
            addCriterion("PRODLINE is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineEqualTo(String value) {
            addCriterion("PRODLINE =", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineNotEqualTo(String value) {
            addCriterion("PRODLINE <>", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineGreaterThan(String value) {
            addCriterion("PRODLINE >", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE >=", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineLessThan(String value) {
            addCriterion("PRODLINE <", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE <=", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineLike(String value) {
            addCriterion("PRODLINE like", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineNotLike(String value) {
            addCriterion("PRODLINE not like", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineIn(List<String> values) {
            addCriterion("PRODLINE in", values, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineNotIn(List<String> values) {
            addCriterion("PRODLINE not in", values, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineBetween(String value1, String value2) {
            addCriterion("PRODLINE between", value1, value2, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineNotBetween(String value1, String value2) {
            addCriterion("PRODLINE not between", value1, value2, "prodline");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNull() {
            addCriterion("release is null");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNotNull() {
            addCriterion("release is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseEqualTo(String value) {
            addCriterion("release =", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotEqualTo(String value) {
            addCriterion("release <>", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThan(String value) {
            addCriterion("release >", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThanOrEqualTo(String value) {
            addCriterion("release >=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThan(String value) {
            addCriterion("release <", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThanOrEqualTo(String value) {
            addCriterion("release <=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLike(String value) {
            addCriterion("release like", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotLike(String value) {
            addCriterion("release not like", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseIn(List<String> values) {
            addCriterion("release in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotIn(List<String> values) {
            addCriterion("release not in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseBetween(String value1, String value2) {
            addCriterion("release between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotBetween(String value1, String value2) {
            addCriterion("release not between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andParentitemIsNull() {
            addCriterion("ParentItem is null");
            return (Criteria) this;
        }

        public Criteria andParentitemIsNotNull() {
            addCriterion("ParentItem is not null");
            return (Criteria) this;
        }

        public Criteria andParentitemEqualTo(String value) {
            addCriterion("ParentItem =", value, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemNotEqualTo(String value) {
            addCriterion("ParentItem <>", value, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemGreaterThan(String value) {
            addCriterion("ParentItem >", value, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemGreaterThanOrEqualTo(String value) {
            addCriterion("ParentItem >=", value, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemLessThan(String value) {
            addCriterion("ParentItem <", value, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemLessThanOrEqualTo(String value) {
            addCriterion("ParentItem <=", value, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemLike(String value) {
            addCriterion("ParentItem like", value, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemNotLike(String value) {
            addCriterion("ParentItem not like", value, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemIn(List<String> values) {
            addCriterion("ParentItem in", values, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemNotIn(List<String> values) {
            addCriterion("ParentItem not in", values, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemBetween(String value1, String value2) {
            addCriterion("ParentItem between", value1, value2, "parentitem");
            return (Criteria) this;
        }

        public Criteria andParentitemNotBetween(String value1, String value2) {
            addCriterion("ParentItem not between", value1, value2, "parentitem");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameIsNull() {
            addCriterion("BASELINE_1Name is null");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameIsNotNull() {
            addCriterion("BASELINE_1Name is not null");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameEqualTo(String value) {
            addCriterion("BASELINE_1Name =", value, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameNotEqualTo(String value) {
            addCriterion("BASELINE_1Name <>", value, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameGreaterThan(String value) {
            addCriterion("BASELINE_1Name >", value, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE_1Name >=", value, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameLessThan(String value) {
            addCriterion("BASELINE_1Name <", value, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameLessThanOrEqualTo(String value) {
            addCriterion("BASELINE_1Name <=", value, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameLike(String value) {
            addCriterion("BASELINE_1Name like", value, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameNotLike(String value) {
            addCriterion("BASELINE_1Name not like", value, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameIn(List<String> values) {
            addCriterion("BASELINE_1Name in", values, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameNotIn(List<String> values) {
            addCriterion("BASELINE_1Name not in", values, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameBetween(String value1, String value2) {
            addCriterion("BASELINE_1Name between", value1, value2, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andBaseline1nameNotBetween(String value1, String value2) {
            addCriterion("BASELINE_1Name not between", value1, value2, "baseline1name");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIsNull() {
            addCriterion("plipmt_order is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIsNotNull() {
            addCriterion("plipmt_order is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderEqualTo(String value) {
            addCriterion("plipmt_order =", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotEqualTo(String value) {
            addCriterion("plipmt_order <>", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderGreaterThan(String value) {
            addCriterion("plipmt_order >", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderGreaterThanOrEqualTo(String value) {
            addCriterion("plipmt_order >=", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLessThan(String value) {
            addCriterion("plipmt_order <", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLessThanOrEqualTo(String value) {
            addCriterion("plipmt_order <=", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLike(String value) {
            addCriterion("plipmt_order like", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotLike(String value) {
            addCriterion("plipmt_order not like", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIn(List<String> values) {
            addCriterion("plipmt_order in", values, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotIn(List<String> values) {
            addCriterion("plipmt_order not in", values, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderBetween(String value1, String value2) {
            addCriterion("plipmt_order between", value1, value2, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotBetween(String value1, String value2) {
            addCriterion("plipmt_order not between", value1, value2, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderIsNull() {
            addCriterion("pl_order is null");
            return (Criteria) this;
        }

        public Criteria andPlOrderIsNotNull() {
            addCriterion("pl_order is not null");
            return (Criteria) this;
        }

        public Criteria andPlOrderEqualTo(Integer value) {
            addCriterion("pl_order =", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotEqualTo(Integer value) {
            addCriterion("pl_order <>", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderGreaterThan(Integer value) {
            addCriterion("pl_order >", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_order >=", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderLessThan(Integer value) {
            addCriterion("pl_order <", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pl_order <=", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderIn(List<Integer> values) {
            addCriterion("pl_order in", values, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotIn(List<Integer> values) {
            addCriterion("pl_order not in", values, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderBetween(Integer value1, Integer value2) {
            addCriterion("pl_order between", value1, value2, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_order not between", value1, value2, "plOrder");
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