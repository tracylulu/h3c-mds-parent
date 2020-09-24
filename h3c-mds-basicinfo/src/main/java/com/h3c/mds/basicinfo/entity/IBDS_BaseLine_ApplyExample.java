package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_BaseLine_ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_BaseLine_ApplyExample() {
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

        public Criteria andBversionnoIsNull() {
            addCriterion("BVERSIONNo is null");
            return (Criteria) this;
        }

        public Criteria andBversionnoIsNotNull() {
            addCriterion("BVERSIONNo is not null");
            return (Criteria) this;
        }

        public Criteria andBversionnoEqualTo(String value) {
            addCriterion("BVERSIONNo =", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotEqualTo(String value) {
            addCriterion("BVERSIONNo <>", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThan(String value) {
            addCriterion("BVERSIONNo >", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThanOrEqualTo(String value) {
            addCriterion("BVERSIONNo >=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThan(String value) {
            addCriterion("BVERSIONNo <", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThanOrEqualTo(String value) {
            addCriterion("BVERSIONNo <=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLike(String value) {
            addCriterion("BVERSIONNo like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotLike(String value) {
            addCriterion("BVERSIONNo not like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoIn(List<String> values) {
            addCriterion("BVERSIONNo in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotIn(List<String> values) {
            addCriterion("BVERSIONNo not in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoBetween(String value1, String value2) {
            addCriterion("BVERSIONNo between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotBetween(String value1, String value2) {
            addCriterion("BVERSIONNo not between", value1, value2, "bversionno");
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

        public Criteria andBaselineoldnoIsNull() {
            addCriterion("BASELINEOldNo is null");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoIsNotNull() {
            addCriterion("BASELINEOldNo is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoEqualTo(String value) {
            addCriterion("BASELINEOldNo =", value, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoNotEqualTo(String value) {
            addCriterion("BASELINEOldNo <>", value, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoGreaterThan(String value) {
            addCriterion("BASELINEOldNo >", value, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINEOldNo >=", value, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoLessThan(String value) {
            addCriterion("BASELINEOldNo <", value, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoLessThanOrEqualTo(String value) {
            addCriterion("BASELINEOldNo <=", value, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoLike(String value) {
            addCriterion("BASELINEOldNo like", value, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoNotLike(String value) {
            addCriterion("BASELINEOldNo not like", value, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoIn(List<String> values) {
            addCriterion("BASELINEOldNo in", values, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoNotIn(List<String> values) {
            addCriterion("BASELINEOldNo not in", values, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoBetween(String value1, String value2) {
            addCriterion("BASELINEOldNo between", value1, value2, "baselineoldno");
            return (Criteria) this;
        }

        public Criteria andBaselineoldnoNotBetween(String value1, String value2) {
            addCriterion("BASELINEOldNo not between", value1, value2, "baselineoldno");
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

        public Criteria andEngbaselineoldIsNull() {
            addCriterion("engBASELINEOld is null");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldIsNotNull() {
            addCriterion("engBASELINEOld is not null");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldEqualTo(String value) {
            addCriterion("engBASELINEOld =", value, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldNotEqualTo(String value) {
            addCriterion("engBASELINEOld <>", value, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldGreaterThan(String value) {
            addCriterion("engBASELINEOld >", value, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldGreaterThanOrEqualTo(String value) {
            addCriterion("engBASELINEOld >=", value, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldLessThan(String value) {
            addCriterion("engBASELINEOld <", value, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldLessThanOrEqualTo(String value) {
            addCriterion("engBASELINEOld <=", value, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldLike(String value) {
            addCriterion("engBASELINEOld like", value, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldNotLike(String value) {
            addCriterion("engBASELINEOld not like", value, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldIn(List<String> values) {
            addCriterion("engBASELINEOld in", values, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldNotIn(List<String> values) {
            addCriterion("engBASELINEOld not in", values, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldBetween(String value1, String value2) {
            addCriterion("engBASELINEOld between", value1, value2, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoldNotBetween(String value1, String value2) {
            addCriterion("engBASELINEOld not between", value1, value2, "engbaselineold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldIsNull() {
            addCriterion("BASELINEOutOld is null");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldIsNotNull() {
            addCriterion("BASELINEOutOld is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldEqualTo(String value) {
            addCriterion("BASELINEOutOld =", value, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldNotEqualTo(String value) {
            addCriterion("BASELINEOutOld <>", value, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldGreaterThan(String value) {
            addCriterion("BASELINEOutOld >", value, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINEOutOld >=", value, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldLessThan(String value) {
            addCriterion("BASELINEOutOld <", value, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldLessThanOrEqualTo(String value) {
            addCriterion("BASELINEOutOld <=", value, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldLike(String value) {
            addCriterion("BASELINEOutOld like", value, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldNotLike(String value) {
            addCriterion("BASELINEOutOld not like", value, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldIn(List<String> values) {
            addCriterion("BASELINEOutOld in", values, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldNotIn(List<String> values) {
            addCriterion("BASELINEOutOld not in", values, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldBetween(String value1, String value2) {
            addCriterion("BASELINEOutOld between", value1, value2, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andBaselineoutoldNotBetween(String value1, String value2) {
            addCriterion("BASELINEOutOld not between", value1, value2, "baselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldIsNull() {
            addCriterion("engBASELINEOutOld is null");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldIsNotNull() {
            addCriterion("engBASELINEOutOld is not null");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldEqualTo(String value) {
            addCriterion("engBASELINEOutOld =", value, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldNotEqualTo(String value) {
            addCriterion("engBASELINEOutOld <>", value, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldGreaterThan(String value) {
            addCriterion("engBASELINEOutOld >", value, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldGreaterThanOrEqualTo(String value) {
            addCriterion("engBASELINEOutOld >=", value, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldLessThan(String value) {
            addCriterion("engBASELINEOutOld <", value, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldLessThanOrEqualTo(String value) {
            addCriterion("engBASELINEOutOld <=", value, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldLike(String value) {
            addCriterion("engBASELINEOutOld like", value, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldNotLike(String value) {
            addCriterion("engBASELINEOutOld not like", value, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldIn(List<String> values) {
            addCriterion("engBASELINEOutOld in", values, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldNotIn(List<String> values) {
            addCriterion("engBASELINEOutOld not in", values, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldBetween(String value1, String value2) {
            addCriterion("engBASELINEOutOld between", value1, value2, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andEngbaselineoutoldNotBetween(String value1, String value2) {
            addCriterion("engBASELINEOutOld not between", value1, value2, "engbaselineoutold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldIsNull() {
            addCriterion("ParentItemNoOld is null");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldIsNotNull() {
            addCriterion("ParentItemNoOld is not null");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldEqualTo(String value) {
            addCriterion("ParentItemNoOld =", value, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldNotEqualTo(String value) {
            addCriterion("ParentItemNoOld <>", value, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldGreaterThan(String value) {
            addCriterion("ParentItemNoOld >", value, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldGreaterThanOrEqualTo(String value) {
            addCriterion("ParentItemNoOld >=", value, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldLessThan(String value) {
            addCriterion("ParentItemNoOld <", value, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldLessThanOrEqualTo(String value) {
            addCriterion("ParentItemNoOld <=", value, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldLike(String value) {
            addCriterion("ParentItemNoOld like", value, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldNotLike(String value) {
            addCriterion("ParentItemNoOld not like", value, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldIn(List<String> values) {
            addCriterion("ParentItemNoOld in", values, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldNotIn(List<String> values) {
            addCriterion("ParentItemNoOld not in", values, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldBetween(String value1, String value2) {
            addCriterion("ParentItemNoOld between", value1, value2, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andParentitemnooldNotBetween(String value1, String value2) {
            addCriterion("ParentItemNoOld not between", value1, value2, "parentitemnoold");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldIsNull() {
            addCriterion("BASELINE_1_Old is null");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldIsNotNull() {
            addCriterion("BASELINE_1_Old is not null");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldEqualTo(String value) {
            addCriterion("BASELINE_1_Old =", value, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldNotEqualTo(String value) {
            addCriterion("BASELINE_1_Old <>", value, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldGreaterThan(String value) {
            addCriterion("BASELINE_1_Old >", value, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldGreaterThanOrEqualTo(String value) {
            addCriterion("BASELINE_1_Old >=", value, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldLessThan(String value) {
            addCriterion("BASELINE_1_Old <", value, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldLessThanOrEqualTo(String value) {
            addCriterion("BASELINE_1_Old <=", value, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldLike(String value) {
            addCriterion("BASELINE_1_Old like", value, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldNotLike(String value) {
            addCriterion("BASELINE_1_Old not like", value, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldIn(List<String> values) {
            addCriterion("BASELINE_1_Old in", values, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldNotIn(List<String> values) {
            addCriterion("BASELINE_1_Old not in", values, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldBetween(String value1, String value2) {
            addCriterion("BASELINE_1_Old between", value1, value2, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andBaseline1OldNotBetween(String value1, String value2) {
            addCriterion("BASELINE_1_Old not between", value1, value2, "baseline1Old");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNull() {
            addCriterion("PROCESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNotNull() {
            addCriterion("PROCESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeEqualTo(String value) {
            addCriterion("PROCESS_CODE =", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotEqualTo(String value) {
            addCriterion("PROCESS_CODE <>", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThan(String value) {
            addCriterion("PROCESS_CODE >", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_CODE >=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThan(String value) {
            addCriterion("PROCESS_CODE <", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_CODE <=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLike(String value) {
            addCriterion("PROCESS_CODE like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotLike(String value) {
            addCriterion("PROCESS_CODE not like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIn(List<String> values) {
            addCriterion("PROCESS_CODE in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotIn(List<String> values) {
            addCriterion("PROCESS_CODE not in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeBetween(String value1, String value2) {
            addCriterion("PROCESS_CODE between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotBetween(String value1, String value2) {
            addCriterion("PROCESS_CODE not between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNull() {
            addCriterion("ApplyType is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNotNull() {
            addCriterion("ApplyType is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeEqualTo(String value) {
            addCriterion("ApplyType =", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotEqualTo(String value) {
            addCriterion("ApplyType <>", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThan(String value) {
            addCriterion("ApplyType >", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyType >=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThan(String value) {
            addCriterion("ApplyType <", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThanOrEqualTo(String value) {
            addCriterion("ApplyType <=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLike(String value) {
            addCriterion("ApplyType like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotLike(String value) {
            addCriterion("ApplyType not like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeIn(List<String> values) {
            addCriterion("ApplyType in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotIn(List<String> values) {
            addCriterion("ApplyType not in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeBetween(String value1, String value2) {
            addCriterion("ApplyType between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotBetween(String value1, String value2) {
            addCriterion("ApplyType not between", value1, value2, "applytype");
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