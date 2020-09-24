package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_BaseObject_ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_BaseObject_ApplyExample() {
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

        public Criteria andSubsystemnoIsNull() {
            addCriterion("SUBSYSTEMNo is null");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoIsNotNull() {
            addCriterion("SUBSYSTEMNo is not null");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoEqualTo(String value) {
            addCriterion("SUBSYSTEMNo =", value, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoNotEqualTo(String value) {
            addCriterion("SUBSYSTEMNo <>", value, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoGreaterThan(String value) {
            addCriterion("SUBSYSTEMNo >", value, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSYSTEMNo >=", value, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoLessThan(String value) {
            addCriterion("SUBSYSTEMNo <", value, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoLessThanOrEqualTo(String value) {
            addCriterion("SUBSYSTEMNo <=", value, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoLike(String value) {
            addCriterion("SUBSYSTEMNo like", value, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoNotLike(String value) {
            addCriterion("SUBSYSTEMNo not like", value, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoIn(List<String> values) {
            addCriterion("SUBSYSTEMNo in", values, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoNotIn(List<String> values) {
            addCriterion("SUBSYSTEMNo not in", values, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoBetween(String value1, String value2) {
            addCriterion("SUBSYSTEMNo between", value1, value2, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andSubsystemnoNotBetween(String value1, String value2) {
            addCriterion("SUBSYSTEMNo not between", value1, value2, "subsystemno");
            return (Criteria) this;
        }

        public Criteria andModulenoIsNull() {
            addCriterion("MODULENo is null");
            return (Criteria) this;
        }

        public Criteria andModulenoIsNotNull() {
            addCriterion("MODULENo is not null");
            return (Criteria) this;
        }

        public Criteria andModulenoEqualTo(String value) {
            addCriterion("MODULENo =", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotEqualTo(String value) {
            addCriterion("MODULENo <>", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoGreaterThan(String value) {
            addCriterion("MODULENo >", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoGreaterThanOrEqualTo(String value) {
            addCriterion("MODULENo >=", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoLessThan(String value) {
            addCriterion("MODULENo <", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoLessThanOrEqualTo(String value) {
            addCriterion("MODULENo <=", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoLike(String value) {
            addCriterion("MODULENo like", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotLike(String value) {
            addCriterion("MODULENo not like", value, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoIn(List<String> values) {
            addCriterion("MODULENo in", values, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotIn(List<String> values) {
            addCriterion("MODULENo not in", values, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoBetween(String value1, String value2) {
            addCriterion("MODULENo between", value1, value2, "moduleno");
            return (Criteria) this;
        }

        public Criteria andModulenoNotBetween(String value1, String value2) {
            addCriterion("MODULENo not between", value1, value2, "moduleno");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewIsNull() {
            addCriterion("NumofFEATURENew is null");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewIsNotNull() {
            addCriterion("NumofFEATURENew is not null");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewEqualTo(String value) {
            addCriterion("NumofFEATURENew =", value, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewNotEqualTo(String value) {
            addCriterion("NumofFEATURENew <>", value, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewGreaterThan(String value) {
            addCriterion("NumofFEATURENew >", value, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewGreaterThanOrEqualTo(String value) {
            addCriterion("NumofFEATURENew >=", value, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewLessThan(String value) {
            addCriterion("NumofFEATURENew <", value, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewLessThanOrEqualTo(String value) {
            addCriterion("NumofFEATURENew <=", value, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewLike(String value) {
            addCriterion("NumofFEATURENew like", value, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewNotLike(String value) {
            addCriterion("NumofFEATURENew not like", value, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewIn(List<String> values) {
            addCriterion("NumofFEATURENew in", values, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewNotIn(List<String> values) {
            addCriterion("NumofFEATURENew not in", values, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewBetween(String value1, String value2) {
            addCriterion("NumofFEATURENew between", value1, value2, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andNumoffeaturenewNotBetween(String value1, String value2) {
            addCriterion("NumofFEATURENew not between", value1, value2, "numoffeaturenew");
            return (Criteria) this;
        }

        public Criteria andObjectnoIsNull() {
            addCriterion("ObjectNo is null");
            return (Criteria) this;
        }

        public Criteria andObjectnoIsNotNull() {
            addCriterion("ObjectNo is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnoEqualTo(String value) {
            addCriterion("ObjectNo =", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoNotEqualTo(String value) {
            addCriterion("ObjectNo <>", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoGreaterThan(String value) {
            addCriterion("ObjectNo >", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectNo >=", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoLessThan(String value) {
            addCriterion("ObjectNo <", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoLessThanOrEqualTo(String value) {
            addCriterion("ObjectNo <=", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoLike(String value) {
            addCriterion("ObjectNo like", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoNotLike(String value) {
            addCriterion("ObjectNo not like", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoIn(List<String> values) {
            addCriterion("ObjectNo in", values, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoNotIn(List<String> values) {
            addCriterion("ObjectNo not in", values, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoBetween(String value1, String value2) {
            addCriterion("ObjectNo between", value1, value2, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoNotBetween(String value1, String value2) {
            addCriterion("ObjectNo not between", value1, value2, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNull() {
            addCriterion("ObjectName is null");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNotNull() {
            addCriterion("ObjectName is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnameEqualTo(String value) {
            addCriterion("ObjectName =", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotEqualTo(String value) {
            addCriterion("ObjectName <>", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThan(String value) {
            addCriterion("ObjectName >", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectName >=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThan(String value) {
            addCriterion("ObjectName <", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThanOrEqualTo(String value) {
            addCriterion("ObjectName <=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLike(String value) {
            addCriterion("ObjectName like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotLike(String value) {
            addCriterion("ObjectName not like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameIn(List<String> values) {
            addCriterion("ObjectName in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotIn(List<String> values) {
            addCriterion("ObjectName not in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameBetween(String value1, String value2) {
            addCriterion("ObjectName between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotBetween(String value1, String value2) {
            addCriterion("ObjectName not between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andEngobjectIsNull() {
            addCriterion("engObject is null");
            return (Criteria) this;
        }

        public Criteria andEngobjectIsNotNull() {
            addCriterion("engObject is not null");
            return (Criteria) this;
        }

        public Criteria andEngobjectEqualTo(String value) {
            addCriterion("engObject =", value, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectNotEqualTo(String value) {
            addCriterion("engObject <>", value, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectGreaterThan(String value) {
            addCriterion("engObject >", value, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectGreaterThanOrEqualTo(String value) {
            addCriterion("engObject >=", value, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectLessThan(String value) {
            addCriterion("engObject <", value, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectLessThanOrEqualTo(String value) {
            addCriterion("engObject <=", value, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectLike(String value) {
            addCriterion("engObject like", value, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectNotLike(String value) {
            addCriterion("engObject not like", value, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectIn(List<String> values) {
            addCriterion("engObject in", values, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectNotIn(List<String> values) {
            addCriterion("engObject not in", values, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectBetween(String value1, String value2) {
            addCriterion("engObject between", value1, value2, "engobject");
            return (Criteria) this;
        }

        public Criteria andEngobjectNotBetween(String value1, String value2) {
            addCriterion("engObject not between", value1, value2, "engobject");
            return (Criteria) this;
        }

        public Criteria andObjectnooldIsNull() {
            addCriterion("ObjectNoOld is null");
            return (Criteria) this;
        }

        public Criteria andObjectnooldIsNotNull() {
            addCriterion("ObjectNoOld is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnooldEqualTo(String value) {
            addCriterion("ObjectNoOld =", value, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldNotEqualTo(String value) {
            addCriterion("ObjectNoOld <>", value, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldGreaterThan(String value) {
            addCriterion("ObjectNoOld >", value, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectNoOld >=", value, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldLessThan(String value) {
            addCriterion("ObjectNoOld <", value, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldLessThanOrEqualTo(String value) {
            addCriterion("ObjectNoOld <=", value, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldLike(String value) {
            addCriterion("ObjectNoOld like", value, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldNotLike(String value) {
            addCriterion("ObjectNoOld not like", value, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldIn(List<String> values) {
            addCriterion("ObjectNoOld in", values, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldNotIn(List<String> values) {
            addCriterion("ObjectNoOld not in", values, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldBetween(String value1, String value2) {
            addCriterion("ObjectNoOld between", value1, value2, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnooldNotBetween(String value1, String value2) {
            addCriterion("ObjectNoOld not between", value1, value2, "objectnoold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldIsNull() {
            addCriterion("ObjectNameOld is null");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldIsNotNull() {
            addCriterion("ObjectNameOld is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldEqualTo(String value) {
            addCriterion("ObjectNameOld =", value, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldNotEqualTo(String value) {
            addCriterion("ObjectNameOld <>", value, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldGreaterThan(String value) {
            addCriterion("ObjectNameOld >", value, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectNameOld >=", value, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldLessThan(String value) {
            addCriterion("ObjectNameOld <", value, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldLessThanOrEqualTo(String value) {
            addCriterion("ObjectNameOld <=", value, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldLike(String value) {
            addCriterion("ObjectNameOld like", value, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldNotLike(String value) {
            addCriterion("ObjectNameOld not like", value, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldIn(List<String> values) {
            addCriterion("ObjectNameOld in", values, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldNotIn(List<String> values) {
            addCriterion("ObjectNameOld not in", values, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldBetween(String value1, String value2) {
            addCriterion("ObjectNameOld between", value1, value2, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andObjectnameoldNotBetween(String value1, String value2) {
            addCriterion("ObjectNameOld not between", value1, value2, "objectnameold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldIsNull() {
            addCriterion("engObjectOld is null");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldIsNotNull() {
            addCriterion("engObjectOld is not null");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldEqualTo(String value) {
            addCriterion("engObjectOld =", value, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldNotEqualTo(String value) {
            addCriterion("engObjectOld <>", value, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldGreaterThan(String value) {
            addCriterion("engObjectOld >", value, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldGreaterThanOrEqualTo(String value) {
            addCriterion("engObjectOld >=", value, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldLessThan(String value) {
            addCriterion("engObjectOld <", value, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldLessThanOrEqualTo(String value) {
            addCriterion("engObjectOld <=", value, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldLike(String value) {
            addCriterion("engObjectOld like", value, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldNotLike(String value) {
            addCriterion("engObjectOld not like", value, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldIn(List<String> values) {
            addCriterion("engObjectOld in", values, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldNotIn(List<String> values) {
            addCriterion("engObjectOld not in", values, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldBetween(String value1, String value2) {
            addCriterion("engObjectOld between", value1, value2, "engobjectold");
            return (Criteria) this;
        }

        public Criteria andEngobjectoldNotBetween(String value1, String value2) {
            addCriterion("engObjectOld not between", value1, value2, "engobjectold");
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

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
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