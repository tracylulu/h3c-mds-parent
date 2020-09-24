package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModuleVersionViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModuleVersionViewExample() {
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

        public Criteria andPlipmtIsNull() {
            addCriterion("PLIPMT is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtIsNotNull() {
            addCriterion("PLIPMT is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtEqualTo(String value) {
            addCriterion("PLIPMT =", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotEqualTo(String value) {
            addCriterion("PLIPMT <>", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtGreaterThan(String value) {
            addCriterion("PLIPMT >", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMT >=", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLessThan(String value) {
            addCriterion("PLIPMT <", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLessThanOrEqualTo(String value) {
            addCriterion("PLIPMT <=", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLike(String value) {
            addCriterion("PLIPMT like", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotLike(String value) {
            addCriterion("PLIPMT not like", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtIn(List<String> values) {
            addCriterion("PLIPMT in", values, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotIn(List<String> values) {
            addCriterion("PLIPMT not in", values, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtBetween(String value1, String value2) {
            addCriterion("PLIPMT between", value1, value2, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotBetween(String value1, String value2) {
            addCriterion("PLIPMT not between", value1, value2, "plipmt");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSubsystemIsNull() {
            addCriterion("SUBSYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andSubsystemIsNotNull() {
            addCriterion("SUBSYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andSubsystemEqualTo(String value) {
            addCriterion("SUBSYSTEM =", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemNotEqualTo(String value) {
            addCriterion("SUBSYSTEM <>", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemGreaterThan(String value) {
            addCriterion("SUBSYSTEM >", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSYSTEM >=", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemLessThan(String value) {
            addCriterion("SUBSYSTEM <", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemLessThanOrEqualTo(String value) {
            addCriterion("SUBSYSTEM <=", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemLike(String value) {
            addCriterion("SUBSYSTEM like", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemNotLike(String value) {
            addCriterion("SUBSYSTEM not like", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemIn(List<String> values) {
            addCriterion("SUBSYSTEM in", values, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemNotIn(List<String> values) {
            addCriterion("SUBSYSTEM not in", values, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemBetween(String value1, String value2) {
            addCriterion("SUBSYSTEM between", value1, value2, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemNotBetween(String value1, String value2) {
            addCriterion("SUBSYSTEM not between", value1, value2, "subsystem");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("MODULE is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("MODULE =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("MODULE <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("MODULE >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("MODULE <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("MODULE <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("MODULE like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("MODULE not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("MODULE in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("MODULE not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("MODULE between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("MODULE not between", value1, value2, "module");
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

        public Criteria andMdlvsnnoIsNull() {
            addCriterion("MDLVSNNo is null");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoIsNotNull() {
            addCriterion("MDLVSNNo is not null");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoEqualTo(String value) {
            addCriterion("MDLVSNNo =", value, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoNotEqualTo(String value) {
            addCriterion("MDLVSNNo <>", value, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoGreaterThan(String value) {
            addCriterion("MDLVSNNo >", value, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoGreaterThanOrEqualTo(String value) {
            addCriterion("MDLVSNNo >=", value, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoLessThan(String value) {
            addCriterion("MDLVSNNo <", value, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoLessThanOrEqualTo(String value) {
            addCriterion("MDLVSNNo <=", value, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoLike(String value) {
            addCriterion("MDLVSNNo like", value, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoNotLike(String value) {
            addCriterion("MDLVSNNo not like", value, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoIn(List<String> values) {
            addCriterion("MDLVSNNo in", values, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoNotIn(List<String> values) {
            addCriterion("MDLVSNNo not in", values, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoBetween(String value1, String value2) {
            addCriterion("MDLVSNNo between", value1, value2, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnnoNotBetween(String value1, String value2) {
            addCriterion("MDLVSNNo not between", value1, value2, "mdlvsnno");
            return (Criteria) this;
        }

        public Criteria andMdlvsnIsNull() {
            addCriterion("MDLVSN is null");
            return (Criteria) this;
        }

        public Criteria andMdlvsnIsNotNull() {
            addCriterion("MDLVSN is not null");
            return (Criteria) this;
        }

        public Criteria andMdlvsnEqualTo(String value) {
            addCriterion("MDLVSN =", value, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnNotEqualTo(String value) {
            addCriterion("MDLVSN <>", value, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnGreaterThan(String value) {
            addCriterion("MDLVSN >", value, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnGreaterThanOrEqualTo(String value) {
            addCriterion("MDLVSN >=", value, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnLessThan(String value) {
            addCriterion("MDLVSN <", value, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnLessThanOrEqualTo(String value) {
            addCriterion("MDLVSN <=", value, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnLike(String value) {
            addCriterion("MDLVSN like", value, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnNotLike(String value) {
            addCriterion("MDLVSN not like", value, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnIn(List<String> values) {
            addCriterion("MDLVSN in", values, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnNotIn(List<String> values) {
            addCriterion("MDLVSN not in", values, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnBetween(String value1, String value2) {
            addCriterion("MDLVSN between", value1, value2, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnNotBetween(String value1, String value2) {
            addCriterion("MDLVSN not between", value1, value2, "mdlvsn");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldIsNull() {
            addCriterion("MDLVSNOld is null");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldIsNotNull() {
            addCriterion("MDLVSNOld is not null");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldEqualTo(String value) {
            addCriterion("MDLVSNOld =", value, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldNotEqualTo(String value) {
            addCriterion("MDLVSNOld <>", value, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldGreaterThan(String value) {
            addCriterion("MDLVSNOld >", value, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldGreaterThanOrEqualTo(String value) {
            addCriterion("MDLVSNOld >=", value, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldLessThan(String value) {
            addCriterion("MDLVSNOld <", value, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldLessThanOrEqualTo(String value) {
            addCriterion("MDLVSNOld <=", value, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldLike(String value) {
            addCriterion("MDLVSNOld like", value, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldNotLike(String value) {
            addCriterion("MDLVSNOld not like", value, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldIn(List<String> values) {
            addCriterion("MDLVSNOld in", values, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldNotIn(List<String> values) {
            addCriterion("MDLVSNOld not in", values, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldBetween(String value1, String value2) {
            addCriterion("MDLVSNOld between", value1, value2, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andMdlvsnoldNotBetween(String value1, String value2) {
            addCriterion("MDLVSNOld not between", value1, value2, "mdlvsnold");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnIsNull() {
            addCriterion("engMDLVSN is null");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnIsNotNull() {
            addCriterion("engMDLVSN is not null");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnEqualTo(String value) {
            addCriterion("engMDLVSN =", value, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnNotEqualTo(String value) {
            addCriterion("engMDLVSN <>", value, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnGreaterThan(String value) {
            addCriterion("engMDLVSN >", value, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnGreaterThanOrEqualTo(String value) {
            addCriterion("engMDLVSN >=", value, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnLessThan(String value) {
            addCriterion("engMDLVSN <", value, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnLessThanOrEqualTo(String value) {
            addCriterion("engMDLVSN <=", value, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnLike(String value) {
            addCriterion("engMDLVSN like", value, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnNotLike(String value) {
            addCriterion("engMDLVSN not like", value, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnIn(List<String> values) {
            addCriterion("engMDLVSN in", values, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnNotIn(List<String> values) {
            addCriterion("engMDLVSN not in", values, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnBetween(String value1, String value2) {
            addCriterion("engMDLVSN between", value1, value2, "engmdlvsn");
            return (Criteria) this;
        }

        public Criteria andEngmdlvsnNotBetween(String value1, String value2) {
            addCriterion("engMDLVSN not between", value1, value2, "engmdlvsn");
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