package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeatureViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeatureViewExample() {
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

        public Criteria andFeaturenoIsNull() {
            addCriterion("FEATURENo is null");
            return (Criteria) this;
        }

        public Criteria andFeaturenoIsNotNull() {
            addCriterion("FEATURENo is not null");
            return (Criteria) this;
        }

        public Criteria andFeaturenoEqualTo(String value) {
            addCriterion("FEATURENo =", value, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoNotEqualTo(String value) {
            addCriterion("FEATURENo <>", value, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoGreaterThan(String value) {
            addCriterion("FEATURENo >", value, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoGreaterThanOrEqualTo(String value) {
            addCriterion("FEATURENo >=", value, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoLessThan(String value) {
            addCriterion("FEATURENo <", value, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoLessThanOrEqualTo(String value) {
            addCriterion("FEATURENo <=", value, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoLike(String value) {
            addCriterion("FEATURENo like", value, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoNotLike(String value) {
            addCriterion("FEATURENo not like", value, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoIn(List<String> values) {
            addCriterion("FEATURENo in", values, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoNotIn(List<String> values) {
            addCriterion("FEATURENo not in", values, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoBetween(String value1, String value2) {
            addCriterion("FEATURENo between", value1, value2, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeaturenoNotBetween(String value1, String value2) {
            addCriterion("FEATURENo not between", value1, value2, "featureno");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNull() {
            addCriterion("FEATURE is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("FEATURE is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("FEATURE =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("FEATURE <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("FEATURE >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("FEATURE >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("FEATURE <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("FEATURE <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("FEATURE like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("FEATURE not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("FEATURE in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("FEATURE not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("FEATURE between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("FEATURE not between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureoldIsNull() {
            addCriterion("FEATUREOld is null");
            return (Criteria) this;
        }

        public Criteria andFeatureoldIsNotNull() {
            addCriterion("FEATUREOld is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureoldEqualTo(String value) {
            addCriterion("FEATUREOld =", value, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldNotEqualTo(String value) {
            addCriterion("FEATUREOld <>", value, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldGreaterThan(String value) {
            addCriterion("FEATUREOld >", value, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldGreaterThanOrEqualTo(String value) {
            addCriterion("FEATUREOld >=", value, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldLessThan(String value) {
            addCriterion("FEATUREOld <", value, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldLessThanOrEqualTo(String value) {
            addCriterion("FEATUREOld <=", value, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldLike(String value) {
            addCriterion("FEATUREOld like", value, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldNotLike(String value) {
            addCriterion("FEATUREOld not like", value, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldIn(List<String> values) {
            addCriterion("FEATUREOld in", values, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldNotIn(List<String> values) {
            addCriterion("FEATUREOld not in", values, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldBetween(String value1, String value2) {
            addCriterion("FEATUREOld between", value1, value2, "featureold");
            return (Criteria) this;
        }

        public Criteria andFeatureoldNotBetween(String value1, String value2) {
            addCriterion("FEATUREOld not between", value1, value2, "featureold");
            return (Criteria) this;
        }

        public Criteria andEngfeatureIsNull() {
            addCriterion("engFEATURE is null");
            return (Criteria) this;
        }

        public Criteria andEngfeatureIsNotNull() {
            addCriterion("engFEATURE is not null");
            return (Criteria) this;
        }

        public Criteria andEngfeatureEqualTo(String value) {
            addCriterion("engFEATURE =", value, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureNotEqualTo(String value) {
            addCriterion("engFEATURE <>", value, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureGreaterThan(String value) {
            addCriterion("engFEATURE >", value, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureGreaterThanOrEqualTo(String value) {
            addCriterion("engFEATURE >=", value, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureLessThan(String value) {
            addCriterion("engFEATURE <", value, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureLessThanOrEqualTo(String value) {
            addCriterion("engFEATURE <=", value, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureLike(String value) {
            addCriterion("engFEATURE like", value, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureNotLike(String value) {
            addCriterion("engFEATURE not like", value, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureIn(List<String> values) {
            addCriterion("engFEATURE in", values, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureNotIn(List<String> values) {
            addCriterion("engFEATURE not in", values, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureBetween(String value1, String value2) {
            addCriterion("engFEATURE between", value1, value2, "engfeature");
            return (Criteria) this;
        }

        public Criteria andEngfeatureNotBetween(String value1, String value2) {
            addCriterion("engFEATURE not between", value1, value2, "engfeature");
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
            addCriterion("Product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("Product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("Product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("Product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("Product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("Product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("Product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("Product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("Product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("Product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("Product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("Product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("Product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("Product not between", value1, value2, "product");
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

        public Criteria andPlipmtIsNull() {
            addCriterion("plipmt is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtIsNotNull() {
            addCriterion("plipmt is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtEqualTo(String value) {
            addCriterion("plipmt =", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotEqualTo(String value) {
            addCriterion("plipmt <>", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtGreaterThan(String value) {
            addCriterion("plipmt >", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtGreaterThanOrEqualTo(String value) {
            addCriterion("plipmt >=", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLessThan(String value) {
            addCriterion("plipmt <", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLessThanOrEqualTo(String value) {
            addCriterion("plipmt <=", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLike(String value) {
            addCriterion("plipmt like", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotLike(String value) {
            addCriterion("plipmt not like", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtIn(List<String> values) {
            addCriterion("plipmt in", values, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotIn(List<String> values) {
            addCriterion("plipmt not in", values, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtBetween(String value1, String value2) {
            addCriterion("plipmt between", value1, value2, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotBetween(String value1, String value2) {
            addCriterion("plipmt not between", value1, value2, "plipmt");
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

        public Criteria andPlipmtOrderEqualTo(Integer value) {
            addCriterion("plipmt_order =", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotEqualTo(Integer value) {
            addCriterion("plipmt_order <>", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderGreaterThan(Integer value) {
            addCriterion("plipmt_order >", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("plipmt_order >=", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLessThan(Integer value) {
            addCriterion("plipmt_order <", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLessThanOrEqualTo(Integer value) {
            addCriterion("plipmt_order <=", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIn(List<Integer> values) {
            addCriterion("plipmt_order in", values, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotIn(List<Integer> values) {
            addCriterion("plipmt_order not in", values, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderBetween(Integer value1, Integer value2) {
            addCriterion("plipmt_order between", value1, value2, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotBetween(Integer value1, Integer value2) {
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