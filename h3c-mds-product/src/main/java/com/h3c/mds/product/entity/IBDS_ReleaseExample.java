package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_ReleaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_ReleaseExample() {
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
            addCriterion("projectno is null");
            return (Criteria) this;
        }

        public Criteria andProjectnoIsNotNull() {
            addCriterion("projectno is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnoEqualTo(String value) {
            addCriterion("projectno =", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotEqualTo(String value) {
            addCriterion("projectno <>", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoGreaterThan(String value) {
            addCriterion("projectno >", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoGreaterThanOrEqualTo(String value) {
            addCriterion("projectno >=", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLessThan(String value) {
            addCriterion("projectno <", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLessThanOrEqualTo(String value) {
            addCriterion("projectno <=", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLike(String value) {
            addCriterion("projectno like", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotLike(String value) {
            addCriterion("projectno not like", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoIn(List<String> values) {
            addCriterion("projectno in", values, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotIn(List<String> values) {
            addCriterion("projectno not in", values, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoBetween(String value1, String value2) {
            addCriterion("projectno between", value1, value2, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotBetween(String value1, String value2) {
            addCriterion("projectno not between", value1, value2, "projectno");
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

        public Criteria andProdifficultIsNull() {
            addCriterion("proDifficult is null");
            return (Criteria) this;
        }

        public Criteria andProdifficultIsNotNull() {
            addCriterion("proDifficult is not null");
            return (Criteria) this;
        }

        public Criteria andProdifficultEqualTo(String value) {
            addCriterion("proDifficult =", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultNotEqualTo(String value) {
            addCriterion("proDifficult <>", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultGreaterThan(String value) {
            addCriterion("proDifficult >", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultGreaterThanOrEqualTo(String value) {
            addCriterion("proDifficult >=", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultLessThan(String value) {
            addCriterion("proDifficult <", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultLessThanOrEqualTo(String value) {
            addCriterion("proDifficult <=", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultLike(String value) {
            addCriterion("proDifficult like", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultNotLike(String value) {
            addCriterion("proDifficult not like", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultIn(List<String> values) {
            addCriterion("proDifficult in", values, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultNotIn(List<String> values) {
            addCriterion("proDifficult not in", values, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultBetween(String value1, String value2) {
            addCriterion("proDifficult between", value1, value2, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultNotBetween(String value1, String value2) {
            addCriterion("proDifficult not between", value1, value2, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultIsNull() {
            addCriterion("harddiffcult is null");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultIsNotNull() {
            addCriterion("harddiffcult is not null");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultEqualTo(String value) {
            addCriterion("harddiffcult =", value, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultNotEqualTo(String value) {
            addCriterion("harddiffcult <>", value, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultGreaterThan(String value) {
            addCriterion("harddiffcult >", value, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultGreaterThanOrEqualTo(String value) {
            addCriterion("harddiffcult >=", value, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultLessThan(String value) {
            addCriterion("harddiffcult <", value, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultLessThanOrEqualTo(String value) {
            addCriterion("harddiffcult <=", value, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultLike(String value) {
            addCriterion("harddiffcult like", value, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultNotLike(String value) {
            addCriterion("harddiffcult not like", value, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultIn(List<String> values) {
            addCriterion("harddiffcult in", values, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultNotIn(List<String> values) {
            addCriterion("harddiffcult not in", values, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultBetween(String value1, String value2) {
            addCriterion("harddiffcult between", value1, value2, "harddiffcult");
            return (Criteria) this;
        }

        public Criteria andHarddiffcultNotBetween(String value1, String value2) {
            addCriterion("harddiffcult not between", value1, value2, "harddiffcult");
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

        public Criteria andFinpdtIdIsNull() {
            addCriterion("FINPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdIsNotNull() {
            addCriterion("FINPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdEqualTo(String value) {
            addCriterion("FINPDT_ID =", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdNotEqualTo(String value) {
            addCriterion("FINPDT_ID <>", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdGreaterThan(String value) {
            addCriterion("FINPDT_ID >", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("FINPDT_ID >=", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdLessThan(String value) {
            addCriterion("FINPDT_ID <", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdLessThanOrEqualTo(String value) {
            addCriterion("FINPDT_ID <=", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdLike(String value) {
            addCriterion("FINPDT_ID like", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdNotLike(String value) {
            addCriterion("FINPDT_ID not like", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdIn(List<String> values) {
            addCriterion("FINPDT_ID in", values, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdNotIn(List<String> values) {
            addCriterion("FINPDT_ID not in", values, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdBetween(String value1, String value2) {
            addCriterion("FINPDT_ID between", value1, value2, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdNotBetween(String value1, String value2) {
            addCriterion("FINPDT_ID not between", value1, value2, "finpdtId");
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

        public Criteria andFdrIsNull() {
            addCriterion("fdr is null");
            return (Criteria) this;
        }

        public Criteria andFdrIsNotNull() {
            addCriterion("fdr is not null");
            return (Criteria) this;
        }

        public Criteria andFdrEqualTo(String value) {
            addCriterion("fdr =", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrNotEqualTo(String value) {
            addCriterion("fdr <>", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrGreaterThan(String value) {
            addCriterion("fdr >", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrGreaterThanOrEqualTo(String value) {
            addCriterion("fdr >=", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrLessThan(String value) {
            addCriterion("fdr <", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrLessThanOrEqualTo(String value) {
            addCriterion("fdr <=", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrLike(String value) {
            addCriterion("fdr like", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrNotLike(String value) {
            addCriterion("fdr not like", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrIn(List<String> values) {
            addCriterion("fdr in", values, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrNotIn(List<String> values) {
            addCriterion("fdr not in", values, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrBetween(String value1, String value2) {
            addCriterion("fdr between", value1, value2, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrNotBetween(String value1, String value2) {
            addCriterion("fdr not between", value1, value2, "fdr");
            return (Criteria) this;
        }

        public Criteria andOutnetparterIsNull() {
            addCriterion("outnetparter is null");
            return (Criteria) this;
        }

        public Criteria andOutnetparterIsNotNull() {
            addCriterion("outnetparter is not null");
            return (Criteria) this;
        }

        public Criteria andOutnetparterEqualTo(String value) {
            addCriterion("outnetparter =", value, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterNotEqualTo(String value) {
            addCriterion("outnetparter <>", value, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterGreaterThan(String value) {
            addCriterion("outnetparter >", value, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterGreaterThanOrEqualTo(String value) {
            addCriterion("outnetparter >=", value, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterLessThan(String value) {
            addCriterion("outnetparter <", value, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterLessThanOrEqualTo(String value) {
            addCriterion("outnetparter <=", value, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterLike(String value) {
            addCriterion("outnetparter like", value, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterNotLike(String value) {
            addCriterion("outnetparter not like", value, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterIn(List<String> values) {
            addCriterion("outnetparter in", values, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterNotIn(List<String> values) {
            addCriterion("outnetparter not in", values, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterBetween(String value1, String value2) {
            addCriterion("outnetparter between", value1, value2, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andOutnetparterNotBetween(String value1, String value2) {
            addCriterion("outnetparter not between", value1, value2, "outnetparter");
            return (Criteria) this;
        }

        public Criteria andSeIsNull() {
            addCriterion("SE is null");
            return (Criteria) this;
        }

        public Criteria andSeIsNotNull() {
            addCriterion("SE is not null");
            return (Criteria) this;
        }

        public Criteria andSeEqualTo(String value) {
            addCriterion("SE =", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotEqualTo(String value) {
            addCriterion("SE <>", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeGreaterThan(String value) {
            addCriterion("SE >", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeGreaterThanOrEqualTo(String value) {
            addCriterion("SE >=", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeLessThan(String value) {
            addCriterion("SE <", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeLessThanOrEqualTo(String value) {
            addCriterion("SE <=", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeLike(String value) {
            addCriterion("SE like", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotLike(String value) {
            addCriterion("SE not like", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeIn(List<String> values) {
            addCriterion("SE in", values, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotIn(List<String> values) {
            addCriterion("SE not in", values, "se");
            return (Criteria) this;
        }

        public Criteria andSeBetween(String value1, String value2) {
            addCriterion("SE between", value1, value2, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotBetween(String value1, String value2) {
            addCriterion("SE not between", value1, value2, "se");
            return (Criteria) this;
        }

        public Criteria andSqaIdIsNull() {
            addCriterion("SQA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqaIdIsNotNull() {
            addCriterion("SQA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqaIdEqualTo(String value) {
            addCriterion("SQA_ID =", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdNotEqualTo(String value) {
            addCriterion("SQA_ID <>", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdGreaterThan(String value) {
            addCriterion("SQA_ID >", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdGreaterThanOrEqualTo(String value) {
            addCriterion("SQA_ID >=", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdLessThan(String value) {
            addCriterion("SQA_ID <", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdLessThanOrEqualTo(String value) {
            addCriterion("SQA_ID <=", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdLike(String value) {
            addCriterion("SQA_ID like", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdNotLike(String value) {
            addCriterion("SQA_ID not like", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdIn(List<String> values) {
            addCriterion("SQA_ID in", values, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdNotIn(List<String> values) {
            addCriterion("SQA_ID not in", values, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdBetween(String value1, String value2) {
            addCriterion("SQA_ID between", value1, value2, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdNotBetween(String value1, String value2) {
            addCriterion("SQA_ID not between", value1, value2, "sqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdIsNull() {
            addCriterion("HQA_ID is null");
            return (Criteria) this;
        }

        public Criteria andHqaIdIsNotNull() {
            addCriterion("HQA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHqaIdEqualTo(String value) {
            addCriterion("HQA_ID =", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdNotEqualTo(String value) {
            addCriterion("HQA_ID <>", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdGreaterThan(String value) {
            addCriterion("HQA_ID >", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdGreaterThanOrEqualTo(String value) {
            addCriterion("HQA_ID >=", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdLessThan(String value) {
            addCriterion("HQA_ID <", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdLessThanOrEqualTo(String value) {
            addCriterion("HQA_ID <=", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdLike(String value) {
            addCriterion("HQA_ID like", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdNotLike(String value) {
            addCriterion("HQA_ID not like", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdIn(List<String> values) {
            addCriterion("HQA_ID in", values, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdNotIn(List<String> values) {
            addCriterion("HQA_ID not in", values, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdBetween(String value1, String value2) {
            addCriterion("HQA_ID between", value1, value2, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdNotBetween(String value1, String value2) {
            addCriterion("HQA_ID not between", value1, value2, "hqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdIsNull() {
            addCriterion("TQA_ID is null");
            return (Criteria) this;
        }

        public Criteria andTqaIdIsNotNull() {
            addCriterion("TQA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTqaIdEqualTo(String value) {
            addCriterion("TQA_ID =", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdNotEqualTo(String value) {
            addCriterion("TQA_ID <>", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdGreaterThan(String value) {
            addCriterion("TQA_ID >", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdGreaterThanOrEqualTo(String value) {
            addCriterion("TQA_ID >=", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdLessThan(String value) {
            addCriterion("TQA_ID <", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdLessThanOrEqualTo(String value) {
            addCriterion("TQA_ID <=", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdLike(String value) {
            addCriterion("TQA_ID like", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdNotLike(String value) {
            addCriterion("TQA_ID not like", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdIn(List<String> values) {
            addCriterion("TQA_ID in", values, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdNotIn(List<String> values) {
            addCriterion("TQA_ID not in", values, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdBetween(String value1, String value2) {
            addCriterion("TQA_ID between", value1, value2, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdNotBetween(String value1, String value2) {
            addCriterion("TQA_ID not between", value1, value2, "tqaId");
            return (Criteria) this;
        }

        public Criteria andSofttestmngIsNull() {
            addCriterion("SOFTTESTMNG is null");
            return (Criteria) this;
        }

        public Criteria andSofttestmngIsNotNull() {
            addCriterion("SOFTTESTMNG is not null");
            return (Criteria) this;
        }

        public Criteria andSofttestmngEqualTo(String value) {
            addCriterion("SOFTTESTMNG =", value, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngNotEqualTo(String value) {
            addCriterion("SOFTTESTMNG <>", value, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngGreaterThan(String value) {
            addCriterion("SOFTTESTMNG >", value, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTTESTMNG >=", value, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngLessThan(String value) {
            addCriterion("SOFTTESTMNG <", value, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngLessThanOrEqualTo(String value) {
            addCriterion("SOFTTESTMNG <=", value, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngLike(String value) {
            addCriterion("SOFTTESTMNG like", value, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngNotLike(String value) {
            addCriterion("SOFTTESTMNG not like", value, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngIn(List<String> values) {
            addCriterion("SOFTTESTMNG in", values, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngNotIn(List<String> values) {
            addCriterion("SOFTTESTMNG not in", values, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngBetween(String value1, String value2) {
            addCriterion("SOFTTESTMNG between", value1, value2, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andSofttestmngNotBetween(String value1, String value2) {
            addCriterion("SOFTTESTMNG not between", value1, value2, "softtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngIsNull() {
            addCriterion("HARDTESTMNG is null");
            return (Criteria) this;
        }

        public Criteria andHardtestmngIsNotNull() {
            addCriterion("HARDTESTMNG is not null");
            return (Criteria) this;
        }

        public Criteria andHardtestmngEqualTo(String value) {
            addCriterion("HARDTESTMNG =", value, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngNotEqualTo(String value) {
            addCriterion("HARDTESTMNG <>", value, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngGreaterThan(String value) {
            addCriterion("HARDTESTMNG >", value, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngGreaterThanOrEqualTo(String value) {
            addCriterion("HARDTESTMNG >=", value, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngLessThan(String value) {
            addCriterion("HARDTESTMNG <", value, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngLessThanOrEqualTo(String value) {
            addCriterion("HARDTESTMNG <=", value, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngLike(String value) {
            addCriterion("HARDTESTMNG like", value, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngNotLike(String value) {
            addCriterion("HARDTESTMNG not like", value, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngIn(List<String> values) {
            addCriterion("HARDTESTMNG in", values, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngNotIn(List<String> values) {
            addCriterion("HARDTESTMNG not in", values, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngBetween(String value1, String value2) {
            addCriterion("HARDTESTMNG between", value1, value2, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andHardtestmngNotBetween(String value1, String value2) {
            addCriterion("HARDTESTMNG not between", value1, value2, "hardtestmng");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdIsNull() {
            addCriterion("SOFTPLAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdIsNotNull() {
            addCriterion("SOFTPLAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdEqualTo(String value) {
            addCriterion("SOFTPLAT_ID =", value, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdNotEqualTo(String value) {
            addCriterion("SOFTPLAT_ID <>", value, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdGreaterThan(String value) {
            addCriterion("SOFTPLAT_ID >", value, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTPLAT_ID >=", value, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdLessThan(String value) {
            addCriterion("SOFTPLAT_ID <", value, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdLessThanOrEqualTo(String value) {
            addCriterion("SOFTPLAT_ID <=", value, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdLike(String value) {
            addCriterion("SOFTPLAT_ID like", value, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdNotLike(String value) {
            addCriterion("SOFTPLAT_ID not like", value, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdIn(List<String> values) {
            addCriterion("SOFTPLAT_ID in", values, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdNotIn(List<String> values) {
            addCriterion("SOFTPLAT_ID not in", values, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdBetween(String value1, String value2) {
            addCriterion("SOFTPLAT_ID between", value1, value2, "softplatId");
            return (Criteria) this;
        }

        public Criteria andSoftplatIdNotBetween(String value1, String value2) {
            addCriterion("SOFTPLAT_ID not between", value1, value2, "softplatId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdIsNull() {
            addCriterion("NETMGPERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdIsNotNull() {
            addCriterion("NETMGPERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdEqualTo(String value) {
            addCriterion("NETMGPERSON_ID =", value, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdNotEqualTo(String value) {
            addCriterion("NETMGPERSON_ID <>", value, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdGreaterThan(String value) {
            addCriterion("NETMGPERSON_ID >", value, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("NETMGPERSON_ID >=", value, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdLessThan(String value) {
            addCriterion("NETMGPERSON_ID <", value, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdLessThanOrEqualTo(String value) {
            addCriterion("NETMGPERSON_ID <=", value, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdLike(String value) {
            addCriterion("NETMGPERSON_ID like", value, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdNotLike(String value) {
            addCriterion("NETMGPERSON_ID not like", value, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdIn(List<String> values) {
            addCriterion("NETMGPERSON_ID in", values, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdNotIn(List<String> values) {
            addCriterion("NETMGPERSON_ID not in", values, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdBetween(String value1, String value2) {
            addCriterion("NETMGPERSON_ID between", value1, value2, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgpersonIdNotBetween(String value1, String value2) {
            addCriterion("NETMGPERSON_ID not between", value1, value2, "netmgpersonId");
            return (Criteria) this;
        }

        public Criteria andNetmgnetIsNull() {
            addCriterion("NETMGNET is null");
            return (Criteria) this;
        }

        public Criteria andNetmgnetIsNotNull() {
            addCriterion("NETMGNET is not null");
            return (Criteria) this;
        }

        public Criteria andNetmgnetEqualTo(String value) {
            addCriterion("NETMGNET =", value, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetNotEqualTo(String value) {
            addCriterion("NETMGNET <>", value, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetGreaterThan(String value) {
            addCriterion("NETMGNET >", value, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetGreaterThanOrEqualTo(String value) {
            addCriterion("NETMGNET >=", value, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetLessThan(String value) {
            addCriterion("NETMGNET <", value, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetLessThanOrEqualTo(String value) {
            addCriterion("NETMGNET <=", value, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetLike(String value) {
            addCriterion("NETMGNET like", value, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetNotLike(String value) {
            addCriterion("NETMGNET not like", value, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetIn(List<String> values) {
            addCriterion("NETMGNET in", values, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetNotIn(List<String> values) {
            addCriterion("NETMGNET not in", values, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetBetween(String value1, String value2) {
            addCriterion("NETMGNET between", value1, value2, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andNetmgnetNotBetween(String value1, String value2) {
            addCriterion("NETMGNET not between", value1, value2, "netmgnet");
            return (Criteria) this;
        }

        public Criteria andBomIsNull() {
            addCriterion("bom is null");
            return (Criteria) this;
        }

        public Criteria andBomIsNotNull() {
            addCriterion("bom is not null");
            return (Criteria) this;
        }

        public Criteria andBomEqualTo(String value) {
            addCriterion("bom =", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotEqualTo(String value) {
            addCriterion("bom <>", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomGreaterThan(String value) {
            addCriterion("bom >", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomGreaterThanOrEqualTo(String value) {
            addCriterion("bom >=", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLessThan(String value) {
            addCriterion("bom <", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLessThanOrEqualTo(String value) {
            addCriterion("bom <=", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLike(String value) {
            addCriterion("bom like", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotLike(String value) {
            addCriterion("bom not like", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomIn(List<String> values) {
            addCriterion("bom in", values, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotIn(List<String> values) {
            addCriterion("bom not in", values, "bom");
            return (Criteria) this;
        }

        public Criteria andBomBetween(String value1, String value2) {
            addCriterion("bom between", value1, value2, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotBetween(String value1, String value2) {
            addCriterion("bom not between", value1, value2, "bom");
            return (Criteria) this;
        }

        public Criteria andColumn01IsNull() {
            addCriterion("Column01 is null");
            return (Criteria) this;
        }

        public Criteria andColumn01IsNotNull() {
            addCriterion("Column01 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn01EqualTo(String value) {
            addCriterion("Column01 =", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01NotEqualTo(String value) {
            addCriterion("Column01 <>", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01GreaterThan(String value) {
            addCriterion("Column01 >", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01GreaterThanOrEqualTo(String value) {
            addCriterion("Column01 >=", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01LessThan(String value) {
            addCriterion("Column01 <", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01LessThanOrEqualTo(String value) {
            addCriterion("Column01 <=", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01Like(String value) {
            addCriterion("Column01 like", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01NotLike(String value) {
            addCriterion("Column01 not like", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01In(List<String> values) {
            addCriterion("Column01 in", values, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01NotIn(List<String> values) {
            addCriterion("Column01 not in", values, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01Between(String value1, String value2) {
            addCriterion("Column01 between", value1, value2, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01NotBetween(String value1, String value2) {
            addCriterion("Column01 not between", value1, value2, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn02IsNull() {
            addCriterion("Column02 is null");
            return (Criteria) this;
        }

        public Criteria andColumn02IsNotNull() {
            addCriterion("Column02 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn02EqualTo(String value) {
            addCriterion("Column02 =", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02NotEqualTo(String value) {
            addCriterion("Column02 <>", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02GreaterThan(String value) {
            addCriterion("Column02 >", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02GreaterThanOrEqualTo(String value) {
            addCriterion("Column02 >=", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02LessThan(String value) {
            addCriterion("Column02 <", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02LessThanOrEqualTo(String value) {
            addCriterion("Column02 <=", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02Like(String value) {
            addCriterion("Column02 like", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02NotLike(String value) {
            addCriterion("Column02 not like", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02In(List<String> values) {
            addCriterion("Column02 in", values, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02NotIn(List<String> values) {
            addCriterion("Column02 not in", values, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02Between(String value1, String value2) {
            addCriterion("Column02 between", value1, value2, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02NotBetween(String value1, String value2) {
            addCriterion("Column02 not between", value1, value2, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn03IsNull() {
            addCriterion("Column03 is null");
            return (Criteria) this;
        }

        public Criteria andColumn03IsNotNull() {
            addCriterion("Column03 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn03EqualTo(String value) {
            addCriterion("Column03 =", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03NotEqualTo(String value) {
            addCriterion("Column03 <>", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03GreaterThan(String value) {
            addCriterion("Column03 >", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03GreaterThanOrEqualTo(String value) {
            addCriterion("Column03 >=", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03LessThan(String value) {
            addCriterion("Column03 <", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03LessThanOrEqualTo(String value) {
            addCriterion("Column03 <=", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03Like(String value) {
            addCriterion("Column03 like", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03NotLike(String value) {
            addCriterion("Column03 not like", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03In(List<String> values) {
            addCriterion("Column03 in", values, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03NotIn(List<String> values) {
            addCriterion("Column03 not in", values, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03Between(String value1, String value2) {
            addCriterion("Column03 between", value1, value2, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03NotBetween(String value1, String value2) {
            addCriterion("Column03 not between", value1, value2, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn04IsNull() {
            addCriterion("Column04 is null");
            return (Criteria) this;
        }

        public Criteria andColumn04IsNotNull() {
            addCriterion("Column04 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn04EqualTo(String value) {
            addCriterion("Column04 =", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04NotEqualTo(String value) {
            addCriterion("Column04 <>", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04GreaterThan(String value) {
            addCriterion("Column04 >", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04GreaterThanOrEqualTo(String value) {
            addCriterion("Column04 >=", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04LessThan(String value) {
            addCriterion("Column04 <", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04LessThanOrEqualTo(String value) {
            addCriterion("Column04 <=", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04Like(String value) {
            addCriterion("Column04 like", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04NotLike(String value) {
            addCriterion("Column04 not like", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04In(List<String> values) {
            addCriterion("Column04 in", values, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04NotIn(List<String> values) {
            addCriterion("Column04 not in", values, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04Between(String value1, String value2) {
            addCriterion("Column04 between", value1, value2, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04NotBetween(String value1, String value2) {
            addCriterion("Column04 not between", value1, value2, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn05IsNull() {
            addCriterion("Column05 is null");
            return (Criteria) this;
        }

        public Criteria andColumn05IsNotNull() {
            addCriterion("Column05 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn05EqualTo(String value) {
            addCriterion("Column05 =", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05NotEqualTo(String value) {
            addCriterion("Column05 <>", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05GreaterThan(String value) {
            addCriterion("Column05 >", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05GreaterThanOrEqualTo(String value) {
            addCriterion("Column05 >=", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05LessThan(String value) {
            addCriterion("Column05 <", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05LessThanOrEqualTo(String value) {
            addCriterion("Column05 <=", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05Like(String value) {
            addCriterion("Column05 like", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05NotLike(String value) {
            addCriterion("Column05 not like", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05In(List<String> values) {
            addCriterion("Column05 in", values, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05NotIn(List<String> values) {
            addCriterion("Column05 not in", values, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05Between(String value1, String value2) {
            addCriterion("Column05 between", value1, value2, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05NotBetween(String value1, String value2) {
            addCriterion("Column05 not between", value1, value2, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn06IsNull() {
            addCriterion("Column06 is null");
            return (Criteria) this;
        }

        public Criteria andColumn06IsNotNull() {
            addCriterion("Column06 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn06EqualTo(String value) {
            addCriterion("Column06 =", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06NotEqualTo(String value) {
            addCriterion("Column06 <>", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06GreaterThan(String value) {
            addCriterion("Column06 >", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06GreaterThanOrEqualTo(String value) {
            addCriterion("Column06 >=", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06LessThan(String value) {
            addCriterion("Column06 <", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06LessThanOrEqualTo(String value) {
            addCriterion("Column06 <=", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06Like(String value) {
            addCriterion("Column06 like", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06NotLike(String value) {
            addCriterion("Column06 not like", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06In(List<String> values) {
            addCriterion("Column06 in", values, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06NotIn(List<String> values) {
            addCriterion("Column06 not in", values, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06Between(String value1, String value2) {
            addCriterion("Column06 between", value1, value2, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06NotBetween(String value1, String value2) {
            addCriterion("Column06 not between", value1, value2, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn07IsNull() {
            addCriterion("Column07 is null");
            return (Criteria) this;
        }

        public Criteria andColumn07IsNotNull() {
            addCriterion("Column07 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn07EqualTo(String value) {
            addCriterion("Column07 =", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07NotEqualTo(String value) {
            addCriterion("Column07 <>", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07GreaterThan(String value) {
            addCriterion("Column07 >", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07GreaterThanOrEqualTo(String value) {
            addCriterion("Column07 >=", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07LessThan(String value) {
            addCriterion("Column07 <", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07LessThanOrEqualTo(String value) {
            addCriterion("Column07 <=", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07Like(String value) {
            addCriterion("Column07 like", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07NotLike(String value) {
            addCriterion("Column07 not like", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07In(List<String> values) {
            addCriterion("Column07 in", values, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07NotIn(List<String> values) {
            addCriterion("Column07 not in", values, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07Between(String value1, String value2) {
            addCriterion("Column07 between", value1, value2, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07NotBetween(String value1, String value2) {
            addCriterion("Column07 not between", value1, value2, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn08IsNull() {
            addCriterion("Column08 is null");
            return (Criteria) this;
        }

        public Criteria andColumn08IsNotNull() {
            addCriterion("Column08 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn08EqualTo(String value) {
            addCriterion("Column08 =", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08NotEqualTo(String value) {
            addCriterion("Column08 <>", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08GreaterThan(String value) {
            addCriterion("Column08 >", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08GreaterThanOrEqualTo(String value) {
            addCriterion("Column08 >=", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08LessThan(String value) {
            addCriterion("Column08 <", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08LessThanOrEqualTo(String value) {
            addCriterion("Column08 <=", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08Like(String value) {
            addCriterion("Column08 like", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08NotLike(String value) {
            addCriterion("Column08 not like", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08In(List<String> values) {
            addCriterion("Column08 in", values, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08NotIn(List<String> values) {
            addCriterion("Column08 not in", values, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08Between(String value1, String value2) {
            addCriterion("Column08 between", value1, value2, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08NotBetween(String value1, String value2) {
            addCriterion("Column08 not between", value1, value2, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn09IsNull() {
            addCriterion("Column09 is null");
            return (Criteria) this;
        }

        public Criteria andColumn09IsNotNull() {
            addCriterion("Column09 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn09EqualTo(String value) {
            addCriterion("Column09 =", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09NotEqualTo(String value) {
            addCriterion("Column09 <>", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09GreaterThan(String value) {
            addCriterion("Column09 >", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09GreaterThanOrEqualTo(String value) {
            addCriterion("Column09 >=", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09LessThan(String value) {
            addCriterion("Column09 <", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09LessThanOrEqualTo(String value) {
            addCriterion("Column09 <=", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09Like(String value) {
            addCriterion("Column09 like", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09NotLike(String value) {
            addCriterion("Column09 not like", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09In(List<String> values) {
            addCriterion("Column09 in", values, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09NotIn(List<String> values) {
            addCriterion("Column09 not in", values, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09Between(String value1, String value2) {
            addCriterion("Column09 between", value1, value2, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09NotBetween(String value1, String value2) {
            addCriterion("Column09 not between", value1, value2, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNull() {
            addCriterion("Column10 is null");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNotNull() {
            addCriterion("Column10 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn10EqualTo(String value) {
            addCriterion("Column10 =", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotEqualTo(String value) {
            addCriterion("Column10 <>", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThan(String value) {
            addCriterion("Column10 >", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThanOrEqualTo(String value) {
            addCriterion("Column10 >=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThan(String value) {
            addCriterion("Column10 <", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThanOrEqualTo(String value) {
            addCriterion("Column10 <=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Like(String value) {
            addCriterion("Column10 like", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotLike(String value) {
            addCriterion("Column10 not like", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10In(List<String> values) {
            addCriterion("Column10 in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotIn(List<String> values) {
            addCriterion("Column10 not in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Between(String value1, String value2) {
            addCriterion("Column10 between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotBetween(String value1, String value2) {
            addCriterion("Column10 not between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("MODIFY_DATE =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("MODIFY_DATE <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("MODIFY_DATE >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("MODIFY_DATE <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("MODIFY_DATE in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("MODIFY_DATE not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE not between", value1, value2, "modifyDate");
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