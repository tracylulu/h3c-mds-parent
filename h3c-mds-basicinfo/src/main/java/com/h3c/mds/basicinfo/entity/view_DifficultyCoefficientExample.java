package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class view_DifficultyCoefficientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public view_DifficultyCoefficientExample() {
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

        public Criteria andProcessCodeIsNull() {
            addCriterion("Process_Code is null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNotNull() {
            addCriterion("Process_Code is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeEqualTo(String value) {
            addCriterion("Process_Code =", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotEqualTo(String value) {
            addCriterion("Process_Code <>", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThan(String value) {
            addCriterion("Process_Code >", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Process_Code >=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThan(String value) {
            addCriterion("Process_Code <", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThanOrEqualTo(String value) {
            addCriterion("Process_Code <=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLike(String value) {
            addCriterion("Process_Code like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotLike(String value) {
            addCriterion("Process_Code not like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIn(List<String> values) {
            addCriterion("Process_Code in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotIn(List<String> values) {
            addCriterion("Process_Code not in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeBetween(String value1, String value2) {
            addCriterion("Process_Code between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotBetween(String value1, String value2) {
            addCriterion("Process_Code not between", value1, value2, "processCode");
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
            addCriterion("ProdLineNo is null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIsNotNull() {
            addCriterion("ProdLineNo is not null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoEqualTo(String value) {
            addCriterion("ProdLineNo =", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotEqualTo(String value) {
            addCriterion("ProdLineNo <>", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThan(String value) {
            addCriterion("ProdLineNo >", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("ProdLineNo >=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThan(String value) {
            addCriterion("ProdLineNo <", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThanOrEqualTo(String value) {
            addCriterion("ProdLineNo <=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLike(String value) {
            addCriterion("ProdLineNo like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotLike(String value) {
            addCriterion("ProdLineNo not like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIn(List<String> values) {
            addCriterion("ProdLineNo in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotIn(List<String> values) {
            addCriterion("ProdLineNo not in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoBetween(String value1, String value2) {
            addCriterion("ProdLineNo between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotBetween(String value1, String value2) {
            addCriterion("ProdLineNo not between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("ProductNo is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("ProductNo is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("ProductNo =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("ProductNo <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("ProductNo >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("ProductNo >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("ProductNo <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("ProductNo <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("ProductNo like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("ProductNo not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("ProductNo in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("ProductNo not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("ProductNo between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("ProductNo not between", value1, value2, "productno");
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

        public Criteria andReleasenoIsNull() {
            addCriterion("ReleaseNo is null");
            return (Criteria) this;
        }

        public Criteria andReleasenoIsNotNull() {
            addCriterion("ReleaseNo is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenoEqualTo(String value) {
            addCriterion("ReleaseNo =", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoNotEqualTo(String value) {
            addCriterion("ReleaseNo <>", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoGreaterThan(String value) {
            addCriterion("ReleaseNo >", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseNo >=", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoLessThan(String value) {
            addCriterion("ReleaseNo <", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoLessThanOrEqualTo(String value) {
            addCriterion("ReleaseNo <=", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoLike(String value) {
            addCriterion("ReleaseNo like", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoNotLike(String value) {
            addCriterion("ReleaseNo not like", value, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoIn(List<String> values) {
            addCriterion("ReleaseNo in", values, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoNotIn(List<String> values) {
            addCriterion("ReleaseNo not in", values, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoBetween(String value1, String value2) {
            addCriterion("ReleaseNo between", value1, value2, "releaseno");
            return (Criteria) this;
        }

        public Criteria andReleasenoNotBetween(String value1, String value2) {
            addCriterion("ReleaseNo not between", value1, value2, "releaseno");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryIsNull() {
            addCriterion("IPMTSecretary is null");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryIsNotNull() {
            addCriterion("IPMTSecretary is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryEqualTo(String value) {
            addCriterion("IPMTSecretary =", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryNotEqualTo(String value) {
            addCriterion("IPMTSecretary <>", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryGreaterThan(String value) {
            addCriterion("IPMTSecretary >", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryGreaterThanOrEqualTo(String value) {
            addCriterion("IPMTSecretary >=", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryLessThan(String value) {
            addCriterion("IPMTSecretary <", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryLessThanOrEqualTo(String value) {
            addCriterion("IPMTSecretary <=", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryLike(String value) {
            addCriterion("IPMTSecretary like", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryNotLike(String value) {
            addCriterion("IPMTSecretary not like", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryIn(List<String> values) {
            addCriterion("IPMTSecretary in", values, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryNotIn(List<String> values) {
            addCriterion("IPMTSecretary not in", values, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryBetween(String value1, String value2) {
            addCriterion("IPMTSecretary between", value1, value2, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryNotBetween(String value1, String value2) {
            addCriterion("IPMTSecretary not between", value1, value2, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andBversionnoIsNull() {
            addCriterion("BversionNo is null");
            return (Criteria) this;
        }

        public Criteria andBversionnoIsNotNull() {
            addCriterion("BversionNo is not null");
            return (Criteria) this;
        }

        public Criteria andBversionnoEqualTo(String value) {
            addCriterion("BversionNo =", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotEqualTo(String value) {
            addCriterion("BversionNo <>", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThan(String value) {
            addCriterion("BversionNo >", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThanOrEqualTo(String value) {
            addCriterion("BversionNo >=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThan(String value) {
            addCriterion("BversionNo <", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThanOrEqualTo(String value) {
            addCriterion("BversionNo <=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLike(String value) {
            addCriterion("BversionNo like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotLike(String value) {
            addCriterion("BversionNo not like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoIn(List<String> values) {
            addCriterion("BversionNo in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotIn(List<String> values) {
            addCriterion("BversionNo not in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoBetween(String value1, String value2) {
            addCriterion("BversionNo between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotBetween(String value1, String value2) {
            addCriterion("BversionNo not between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionIsNull() {
            addCriterion("Bversion is null");
            return (Criteria) this;
        }

        public Criteria andBversionIsNotNull() {
            addCriterion("Bversion is not null");
            return (Criteria) this;
        }

        public Criteria andBversionEqualTo(String value) {
            addCriterion("Bversion =", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotEqualTo(String value) {
            addCriterion("Bversion <>", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionGreaterThan(String value) {
            addCriterion("Bversion >", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionGreaterThanOrEqualTo(String value) {
            addCriterion("Bversion >=", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLessThan(String value) {
            addCriterion("Bversion <", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLessThanOrEqualTo(String value) {
            addCriterion("Bversion <=", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLike(String value) {
            addCriterion("Bversion like", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotLike(String value) {
            addCriterion("Bversion not like", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionIn(List<String> values) {
            addCriterion("Bversion in", values, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotIn(List<String> values) {
            addCriterion("Bversion not in", values, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionBetween(String value1, String value2) {
            addCriterion("Bversion between", value1, value2, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotBetween(String value1, String value2) {
            addCriterion("Bversion not between", value1, value2, "bversion");
            return (Criteria) this;
        }

        public Criteria andIspackIsNull() {
            addCriterion("isPack is null");
            return (Criteria) this;
        }

        public Criteria andIspackIsNotNull() {
            addCriterion("isPack is not null");
            return (Criteria) this;
        }

        public Criteria andIspackEqualTo(String value) {
            addCriterion("isPack =", value, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackNotEqualTo(String value) {
            addCriterion("isPack <>", value, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackGreaterThan(String value) {
            addCriterion("isPack >", value, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackGreaterThanOrEqualTo(String value) {
            addCriterion("isPack >=", value, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackLessThan(String value) {
            addCriterion("isPack <", value, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackLessThanOrEqualTo(String value) {
            addCriterion("isPack <=", value, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackLike(String value) {
            addCriterion("isPack like", value, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackNotLike(String value) {
            addCriterion("isPack not like", value, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackIn(List<String> values) {
            addCriterion("isPack in", values, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackNotIn(List<String> values) {
            addCriterion("isPack not in", values, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackBetween(String value1, String value2) {
            addCriterion("isPack between", value1, value2, "ispack");
            return (Criteria) this;
        }

        public Criteria andIspackNotBetween(String value1, String value2) {
            addCriterion("isPack not between", value1, value2, "ispack");
            return (Criteria) this;
        }

        public Criteria andProsnremarkIsNull() {
            addCriterion("ProSnRemark is null");
            return (Criteria) this;
        }

        public Criteria andProsnremarkIsNotNull() {
            addCriterion("ProSnRemark is not null");
            return (Criteria) this;
        }

        public Criteria andProsnremarkEqualTo(String value) {
            addCriterion("ProSnRemark =", value, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkNotEqualTo(String value) {
            addCriterion("ProSnRemark <>", value, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkGreaterThan(String value) {
            addCriterion("ProSnRemark >", value, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkGreaterThanOrEqualTo(String value) {
            addCriterion("ProSnRemark >=", value, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkLessThan(String value) {
            addCriterion("ProSnRemark <", value, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkLessThanOrEqualTo(String value) {
            addCriterion("ProSnRemark <=", value, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkLike(String value) {
            addCriterion("ProSnRemark like", value, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkNotLike(String value) {
            addCriterion("ProSnRemark not like", value, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkIn(List<String> values) {
            addCriterion("ProSnRemark in", values, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkNotIn(List<String> values) {
            addCriterion("ProSnRemark not in", values, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkBetween(String value1, String value2) {
            addCriterion("ProSnRemark between", value1, value2, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andProsnremarkNotBetween(String value1, String value2) {
            addCriterion("ProSnRemark not between", value1, value2, "prosnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkIsNull() {
            addCriterion("HardSnRemark is null");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkIsNotNull() {
            addCriterion("HardSnRemark is not null");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkEqualTo(String value) {
            addCriterion("HardSnRemark =", value, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkNotEqualTo(String value) {
            addCriterion("HardSnRemark <>", value, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkGreaterThan(String value) {
            addCriterion("HardSnRemark >", value, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkGreaterThanOrEqualTo(String value) {
            addCriterion("HardSnRemark >=", value, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkLessThan(String value) {
            addCriterion("HardSnRemark <", value, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkLessThanOrEqualTo(String value) {
            addCriterion("HardSnRemark <=", value, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkLike(String value) {
            addCriterion("HardSnRemark like", value, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkNotLike(String value) {
            addCriterion("HardSnRemark not like", value, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkIn(List<String> values) {
            addCriterion("HardSnRemark in", values, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkNotIn(List<String> values) {
            addCriterion("HardSnRemark not in", values, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkBetween(String value1, String value2) {
            addCriterion("HardSnRemark between", value1, value2, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andHardsnremarkNotBetween(String value1, String value2) {
            addCriterion("HardSnRemark not between", value1, value2, "hardsnremark");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialIsNull() {
            addCriterion("Prod_BasisMaterial is null");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialIsNotNull() {
            addCriterion("Prod_BasisMaterial is not null");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialEqualTo(String value) {
            addCriterion("Prod_BasisMaterial =", value, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialNotEqualTo(String value) {
            addCriterion("Prod_BasisMaterial <>", value, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialGreaterThan(String value) {
            addCriterion("Prod_BasisMaterial >", value, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialGreaterThanOrEqualTo(String value) {
            addCriterion("Prod_BasisMaterial >=", value, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialLessThan(String value) {
            addCriterion("Prod_BasisMaterial <", value, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialLessThanOrEqualTo(String value) {
            addCriterion("Prod_BasisMaterial <=", value, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialLike(String value) {
            addCriterion("Prod_BasisMaterial like", value, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialNotLike(String value) {
            addCriterion("Prod_BasisMaterial not like", value, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialIn(List<String> values) {
            addCriterion("Prod_BasisMaterial in", values, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialNotIn(List<String> values) {
            addCriterion("Prod_BasisMaterial not in", values, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialBetween(String value1, String value2) {
            addCriterion("Prod_BasisMaterial between", value1, value2, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialNotBetween(String value1, String value2) {
            addCriterion("Prod_BasisMaterial not between", value1, value2, "prodBasismaterial");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidIsNull() {
            addCriterion("Prod_BasisMaterialId is null");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidIsNotNull() {
            addCriterion("Prod_BasisMaterialId is not null");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidEqualTo(String value) {
            addCriterion("Prod_BasisMaterialId =", value, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidNotEqualTo(String value) {
            addCriterion("Prod_BasisMaterialId <>", value, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidGreaterThan(String value) {
            addCriterion("Prod_BasisMaterialId >", value, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidGreaterThanOrEqualTo(String value) {
            addCriterion("Prod_BasisMaterialId >=", value, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidLessThan(String value) {
            addCriterion("Prod_BasisMaterialId <", value, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidLessThanOrEqualTo(String value) {
            addCriterion("Prod_BasisMaterialId <=", value, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidLike(String value) {
            addCriterion("Prod_BasisMaterialId like", value, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidNotLike(String value) {
            addCriterion("Prod_BasisMaterialId not like", value, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidIn(List<String> values) {
            addCriterion("Prod_BasisMaterialId in", values, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidNotIn(List<String> values) {
            addCriterion("Prod_BasisMaterialId not in", values, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidBetween(String value1, String value2) {
            addCriterion("Prod_BasisMaterialId between", value1, value2, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andProdBasismaterialidNotBetween(String value1, String value2) {
            addCriterion("Prod_BasisMaterialId not between", value1, value2, "prodBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialIsNull() {
            addCriterion("Hard_BasisMaterial is null");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialIsNotNull() {
            addCriterion("Hard_BasisMaterial is not null");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialEqualTo(String value) {
            addCriterion("Hard_BasisMaterial =", value, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialNotEqualTo(String value) {
            addCriterion("Hard_BasisMaterial <>", value, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialGreaterThan(String value) {
            addCriterion("Hard_BasisMaterial >", value, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialGreaterThanOrEqualTo(String value) {
            addCriterion("Hard_BasisMaterial >=", value, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialLessThan(String value) {
            addCriterion("Hard_BasisMaterial <", value, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialLessThanOrEqualTo(String value) {
            addCriterion("Hard_BasisMaterial <=", value, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialLike(String value) {
            addCriterion("Hard_BasisMaterial like", value, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialNotLike(String value) {
            addCriterion("Hard_BasisMaterial not like", value, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialIn(List<String> values) {
            addCriterion("Hard_BasisMaterial in", values, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialNotIn(List<String> values) {
            addCriterion("Hard_BasisMaterial not in", values, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialBetween(String value1, String value2) {
            addCriterion("Hard_BasisMaterial between", value1, value2, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialNotBetween(String value1, String value2) {
            addCriterion("Hard_BasisMaterial not between", value1, value2, "hardBasismaterial");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidIsNull() {
            addCriterion("Hard_BasisMaterialId is null");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidIsNotNull() {
            addCriterion("Hard_BasisMaterialId is not null");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidEqualTo(String value) {
            addCriterion("Hard_BasisMaterialId =", value, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidNotEqualTo(String value) {
            addCriterion("Hard_BasisMaterialId <>", value, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidGreaterThan(String value) {
            addCriterion("Hard_BasisMaterialId >", value, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidGreaterThanOrEqualTo(String value) {
            addCriterion("Hard_BasisMaterialId >=", value, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidLessThan(String value) {
            addCriterion("Hard_BasisMaterialId <", value, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidLessThanOrEqualTo(String value) {
            addCriterion("Hard_BasisMaterialId <=", value, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidLike(String value) {
            addCriterion("Hard_BasisMaterialId like", value, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidNotLike(String value) {
            addCriterion("Hard_BasisMaterialId not like", value, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidIn(List<String> values) {
            addCriterion("Hard_BasisMaterialId in", values, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidNotIn(List<String> values) {
            addCriterion("Hard_BasisMaterialId not in", values, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidBetween(String value1, String value2) {
            addCriterion("Hard_BasisMaterialId between", value1, value2, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andHardBasismaterialidNotBetween(String value1, String value2) {
            addCriterion("Hard_BasisMaterialId not between", value1, value2, "hardBasismaterialid");
            return (Criteria) this;
        }

        public Criteria andCopytoIsNull() {
            addCriterion("copyto is null");
            return (Criteria) this;
        }

        public Criteria andCopytoIsNotNull() {
            addCriterion("copyto is not null");
            return (Criteria) this;
        }

        public Criteria andCopytoEqualTo(String value) {
            addCriterion("copyto =", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoNotEqualTo(String value) {
            addCriterion("copyto <>", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoGreaterThan(String value) {
            addCriterion("copyto >", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoGreaterThanOrEqualTo(String value) {
            addCriterion("copyto >=", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoLessThan(String value) {
            addCriterion("copyto <", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoLessThanOrEqualTo(String value) {
            addCriterion("copyto <=", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoLike(String value) {
            addCriterion("copyto like", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoNotLike(String value) {
            addCriterion("copyto not like", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoIn(List<String> values) {
            addCriterion("copyto in", values, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoNotIn(List<String> values) {
            addCriterion("copyto not in", values, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoBetween(String value1, String value2) {
            addCriterion("copyto between", value1, value2, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoNotBetween(String value1, String value2) {
            addCriterion("copyto not between", value1, value2, "copyto");
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

        public Criteria andCreatorIsNull() {
            addCriterion("Creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("Creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("Creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("Creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("Creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("Creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("Creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("Creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("Creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("Creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("Creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("Creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("Creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("Creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("Modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("Modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("Modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("Modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("Modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("Modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("Modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("Modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("Modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("Modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("Modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("Modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("Modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("Modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNull() {
            addCriterion("ProcessID is null");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNotNull() {
            addCriterion("ProcessID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessidEqualTo(Integer value) {
            addCriterion("ProcessID =", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotEqualTo(Integer value) {
            addCriterion("ProcessID <>", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThan(Integer value) {
            addCriterion("ProcessID >", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProcessID >=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThan(Integer value) {
            addCriterion("ProcessID <", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThanOrEqualTo(Integer value) {
            addCriterion("ProcessID <=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidIn(List<Integer> values) {
            addCriterion("ProcessID in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotIn(List<Integer> values) {
            addCriterion("ProcessID not in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidBetween(Integer value1, Integer value2) {
            addCriterion("ProcessID between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProcessID not between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNull() {
            addCriterion("APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNotNull() {
            addCriterion("APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeEqualTo(String value) {
            addCriterion("APPLY_CODE =", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotEqualTo(String value) {
            addCriterion("APPLY_CODE <>", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThan(String value) {
            addCriterion("APPLY_CODE >", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE >=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThan(String value) {
            addCriterion("APPLY_CODE <", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE <=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLike(String value) {
            addCriterion("APPLY_CODE like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotLike(String value) {
            addCriterion("APPLY_CODE not like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIn(List<String> values) {
            addCriterion("APPLY_CODE in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotIn(List<String> values) {
            addCriterion("APPLY_CODE not in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeBetween(String value1, String value2) {
            addCriterion("APPLY_CODE between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_CODE not between", value1, value2, "applyCode");
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

        public Criteria andHandlerIsNull() {
            addCriterion("Handler is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("Handler is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("Handler =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("Handler <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("Handler >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("Handler >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("Handler <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("Handler <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("Handler like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("Handler not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("Handler in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("Handler not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("Handler between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("Handler not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIsNull() {
            addCriterion("Instanse_ID is null");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIsNotNull() {
            addCriterion("Instanse_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanseIdEqualTo(String value) {
            addCriterion("Instanse_ID =", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotEqualTo(String value) {
            addCriterion("Instanse_ID <>", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdGreaterThan(String value) {
            addCriterion("Instanse_ID >", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdGreaterThanOrEqualTo(String value) {
            addCriterion("Instanse_ID >=", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLessThan(String value) {
            addCriterion("Instanse_ID <", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLessThanOrEqualTo(String value) {
            addCriterion("Instanse_ID <=", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLike(String value) {
            addCriterion("Instanse_ID like", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotLike(String value) {
            addCriterion("Instanse_ID not like", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIn(List<String> values) {
            addCriterion("Instanse_ID in", values, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotIn(List<String> values) {
            addCriterion("Instanse_ID not in", values, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdBetween(String value1, String value2) {
            addCriterion("Instanse_ID between", value1, value2, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotBetween(String value1, String value2) {
            addCriterion("Instanse_ID not between", value1, value2, "instanseId");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeIsNull() {
            addCriterion("CurrentNode is null");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeIsNotNull() {
            addCriterion("CurrentNode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeEqualTo(String value) {
            addCriterion("CurrentNode =", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeNotEqualTo(String value) {
            addCriterion("CurrentNode <>", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeGreaterThan(String value) {
            addCriterion("CurrentNode >", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeGreaterThanOrEqualTo(String value) {
            addCriterion("CurrentNode >=", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeLessThan(String value) {
            addCriterion("CurrentNode <", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeLessThanOrEqualTo(String value) {
            addCriterion("CurrentNode <=", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeLike(String value) {
            addCriterion("CurrentNode like", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeNotLike(String value) {
            addCriterion("CurrentNode not like", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeIn(List<String> values) {
            addCriterion("CurrentNode in", values, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeNotIn(List<String> values) {
            addCriterion("CurrentNode not in", values, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeBetween(String value1, String value2) {
            addCriterion("CurrentNode between", value1, value2, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeNotBetween(String value1, String value2) {
            addCriterion("CurrentNode not between", value1, value2, "currentnode");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNull() {
            addCriterion("STATUS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNotNull() {
            addCriterion("STATUS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDescEqualTo(String value) {
            addCriterion("STATUS_DESC =", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotEqualTo(String value) {
            addCriterion("STATUS_DESC <>", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThan(String value) {
            addCriterion("STATUS_DESC >", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_DESC >=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThan(String value) {
            addCriterion("STATUS_DESC <", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThanOrEqualTo(String value) {
            addCriterion("STATUS_DESC <=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLike(String value) {
            addCriterion("STATUS_DESC like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotLike(String value) {
            addCriterion("STATUS_DESC not like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescIn(List<String> values) {
            addCriterion("STATUS_DESC in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotIn(List<String> values) {
            addCriterion("STATUS_DESC not in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescBetween(String value1, String value2) {
            addCriterion("STATUS_DESC between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotBetween(String value1, String value2) {
            addCriterion("STATUS_DESC not between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andFirstSignIsNull() {
            addCriterion("First_Sign is null");
            return (Criteria) this;
        }

        public Criteria andFirstSignIsNotNull() {
            addCriterion("First_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSignEqualTo(String value) {
            addCriterion("First_Sign =", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotEqualTo(String value) {
            addCriterion("First_Sign <>", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignGreaterThan(String value) {
            addCriterion("First_Sign >", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignGreaterThanOrEqualTo(String value) {
            addCriterion("First_Sign >=", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLessThan(String value) {
            addCriterion("First_Sign <", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLessThanOrEqualTo(String value) {
            addCriterion("First_Sign <=", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLike(String value) {
            addCriterion("First_Sign like", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotLike(String value) {
            addCriterion("First_Sign not like", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignIn(List<String> values) {
            addCriterion("First_Sign in", values, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotIn(List<String> values) {
            addCriterion("First_Sign not in", values, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignBetween(String value1, String value2) {
            addCriterion("First_Sign between", value1, value2, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotBetween(String value1, String value2) {
            addCriterion("First_Sign not between", value1, value2, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNull() {
            addCriterion("First_Date is null");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNotNull() {
            addCriterion("First_Date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDateEqualTo(Date value) {
            addCriterion("First_Date =", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotEqualTo(Date value) {
            addCriterion("First_Date <>", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThan(Date value) {
            addCriterion("First_Date >", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThanOrEqualTo(Date value) {
            addCriterion("First_Date >=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThan(Date value) {
            addCriterion("First_Date <", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThanOrEqualTo(Date value) {
            addCriterion("First_Date <=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateIn(List<Date> values) {
            addCriterion("First_Date in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotIn(List<Date> values) {
            addCriterion("First_Date not in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateBetween(Date value1, Date value2) {
            addCriterion("First_Date between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotBetween(Date value1, Date value2) {
            addCriterion("First_Date not between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andMgnSignIsNull() {
            addCriterion("MGN_Sign is null");
            return (Criteria) this;
        }

        public Criteria andMgnSignIsNotNull() {
            addCriterion("MGN_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andMgnSignEqualTo(String value) {
            addCriterion("MGN_Sign =", value, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignNotEqualTo(String value) {
            addCriterion("MGN_Sign <>", value, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignGreaterThan(String value) {
            addCriterion("MGN_Sign >", value, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignGreaterThanOrEqualTo(String value) {
            addCriterion("MGN_Sign >=", value, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignLessThan(String value) {
            addCriterion("MGN_Sign <", value, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignLessThanOrEqualTo(String value) {
            addCriterion("MGN_Sign <=", value, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignLike(String value) {
            addCriterion("MGN_Sign like", value, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignNotLike(String value) {
            addCriterion("MGN_Sign not like", value, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignIn(List<String> values) {
            addCriterion("MGN_Sign in", values, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignNotIn(List<String> values) {
            addCriterion("MGN_Sign not in", values, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignBetween(String value1, String value2) {
            addCriterion("MGN_Sign between", value1, value2, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnSignNotBetween(String value1, String value2) {
            addCriterion("MGN_Sign not between", value1, value2, "mgnSign");
            return (Criteria) this;
        }

        public Criteria andMgnDateIsNull() {
            addCriterion("MGN_Date is null");
            return (Criteria) this;
        }

        public Criteria andMgnDateIsNotNull() {
            addCriterion("MGN_Date is not null");
            return (Criteria) this;
        }

        public Criteria andMgnDateEqualTo(Date value) {
            addCriterion("MGN_Date =", value, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateNotEqualTo(Date value) {
            addCriterion("MGN_Date <>", value, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateGreaterThan(Date value) {
            addCriterion("MGN_Date >", value, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MGN_Date >=", value, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateLessThan(Date value) {
            addCriterion("MGN_Date <", value, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateLessThanOrEqualTo(Date value) {
            addCriterion("MGN_Date <=", value, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateIn(List<Date> values) {
            addCriterion("MGN_Date in", values, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateNotIn(List<Date> values) {
            addCriterion("MGN_Date not in", values, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateBetween(Date value1, Date value2) {
            addCriterion("MGN_Date between", value1, value2, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnDateNotBetween(Date value1, Date value2) {
            addCriterion("MGN_Date not between", value1, value2, "mgnDate");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionIsNull() {
            addCriterion("MGN_Opinion is null");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionIsNotNull() {
            addCriterion("MGN_Opinion is not null");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionEqualTo(String value) {
            addCriterion("MGN_Opinion =", value, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionNotEqualTo(String value) {
            addCriterion("MGN_Opinion <>", value, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionGreaterThan(String value) {
            addCriterion("MGN_Opinion >", value, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("MGN_Opinion >=", value, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionLessThan(String value) {
            addCriterion("MGN_Opinion <", value, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionLessThanOrEqualTo(String value) {
            addCriterion("MGN_Opinion <=", value, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionLike(String value) {
            addCriterion("MGN_Opinion like", value, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionNotLike(String value) {
            addCriterion("MGN_Opinion not like", value, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionIn(List<String> values) {
            addCriterion("MGN_Opinion in", values, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionNotIn(List<String> values) {
            addCriterion("MGN_Opinion not in", values, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionBetween(String value1, String value2) {
            addCriterion("MGN_Opinion between", value1, value2, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnOpinionNotBetween(String value1, String value2) {
            addCriterion("MGN_Opinion not between", value1, value2, "mgnOpinion");
            return (Criteria) this;
        }

        public Criteria andMgnResultIsNull() {
            addCriterion("MGN_Result is null");
            return (Criteria) this;
        }

        public Criteria andMgnResultIsNotNull() {
            addCriterion("MGN_Result is not null");
            return (Criteria) this;
        }

        public Criteria andMgnResultEqualTo(String value) {
            addCriterion("MGN_Result =", value, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultNotEqualTo(String value) {
            addCriterion("MGN_Result <>", value, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultGreaterThan(String value) {
            addCriterion("MGN_Result >", value, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultGreaterThanOrEqualTo(String value) {
            addCriterion("MGN_Result >=", value, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultLessThan(String value) {
            addCriterion("MGN_Result <", value, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultLessThanOrEqualTo(String value) {
            addCriterion("MGN_Result <=", value, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultLike(String value) {
            addCriterion("MGN_Result like", value, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultNotLike(String value) {
            addCriterion("MGN_Result not like", value, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultIn(List<String> values) {
            addCriterion("MGN_Result in", values, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultNotIn(List<String> values) {
            addCriterion("MGN_Result not in", values, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultBetween(String value1, String value2) {
            addCriterion("MGN_Result between", value1, value2, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andMgnResultNotBetween(String value1, String value2) {
            addCriterion("MGN_Result not between", value1, value2, "mgnResult");
            return (Criteria) this;
        }

        public Criteria andQualitySignIsNull() {
            addCriterion("Quality_Sign is null");
            return (Criteria) this;
        }

        public Criteria andQualitySignIsNotNull() {
            addCriterion("Quality_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andQualitySignEqualTo(String value) {
            addCriterion("Quality_Sign =", value, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignNotEqualTo(String value) {
            addCriterion("Quality_Sign <>", value, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignGreaterThan(String value) {
            addCriterion("Quality_Sign >", value, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignGreaterThanOrEqualTo(String value) {
            addCriterion("Quality_Sign >=", value, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignLessThan(String value) {
            addCriterion("Quality_Sign <", value, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignLessThanOrEqualTo(String value) {
            addCriterion("Quality_Sign <=", value, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignLike(String value) {
            addCriterion("Quality_Sign like", value, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignNotLike(String value) {
            addCriterion("Quality_Sign not like", value, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignIn(List<String> values) {
            addCriterion("Quality_Sign in", values, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignNotIn(List<String> values) {
            addCriterion("Quality_Sign not in", values, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignBetween(String value1, String value2) {
            addCriterion("Quality_Sign between", value1, value2, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualitySignNotBetween(String value1, String value2) {
            addCriterion("Quality_Sign not between", value1, value2, "qualitySign");
            return (Criteria) this;
        }

        public Criteria andQualityDateIsNull() {
            addCriterion("Quality_Date is null");
            return (Criteria) this;
        }

        public Criteria andQualityDateIsNotNull() {
            addCriterion("Quality_Date is not null");
            return (Criteria) this;
        }

        public Criteria andQualityDateEqualTo(Date value) {
            addCriterion("Quality_Date =", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateNotEqualTo(Date value) {
            addCriterion("Quality_Date <>", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateGreaterThan(Date value) {
            addCriterion("Quality_Date >", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Quality_Date >=", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateLessThan(Date value) {
            addCriterion("Quality_Date <", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateLessThanOrEqualTo(Date value) {
            addCriterion("Quality_Date <=", value, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateIn(List<Date> values) {
            addCriterion("Quality_Date in", values, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateNotIn(List<Date> values) {
            addCriterion("Quality_Date not in", values, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateBetween(Date value1, Date value2) {
            addCriterion("Quality_Date between", value1, value2, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityDateNotBetween(Date value1, Date value2) {
            addCriterion("Quality_Date not between", value1, value2, "qualityDate");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionIsNull() {
            addCriterion("Quality_Opinion is null");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionIsNotNull() {
            addCriterion("Quality_Opinion is not null");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionEqualTo(String value) {
            addCriterion("Quality_Opinion =", value, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionNotEqualTo(String value) {
            addCriterion("Quality_Opinion <>", value, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionGreaterThan(String value) {
            addCriterion("Quality_Opinion >", value, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("Quality_Opinion >=", value, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionLessThan(String value) {
            addCriterion("Quality_Opinion <", value, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionLessThanOrEqualTo(String value) {
            addCriterion("Quality_Opinion <=", value, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionLike(String value) {
            addCriterion("Quality_Opinion like", value, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionNotLike(String value) {
            addCriterion("Quality_Opinion not like", value, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionIn(List<String> values) {
            addCriterion("Quality_Opinion in", values, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionNotIn(List<String> values) {
            addCriterion("Quality_Opinion not in", values, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionBetween(String value1, String value2) {
            addCriterion("Quality_Opinion between", value1, value2, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityOpinionNotBetween(String value1, String value2) {
            addCriterion("Quality_Opinion not between", value1, value2, "qualityOpinion");
            return (Criteria) this;
        }

        public Criteria andQualityResultIsNull() {
            addCriterion("Quality_Result is null");
            return (Criteria) this;
        }

        public Criteria andQualityResultIsNotNull() {
            addCriterion("Quality_Result is not null");
            return (Criteria) this;
        }

        public Criteria andQualityResultEqualTo(String value) {
            addCriterion("Quality_Result =", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultNotEqualTo(String value) {
            addCriterion("Quality_Result <>", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultGreaterThan(String value) {
            addCriterion("Quality_Result >", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultGreaterThanOrEqualTo(String value) {
            addCriterion("Quality_Result >=", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultLessThan(String value) {
            addCriterion("Quality_Result <", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultLessThanOrEqualTo(String value) {
            addCriterion("Quality_Result <=", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultLike(String value) {
            addCriterion("Quality_Result like", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultNotLike(String value) {
            addCriterion("Quality_Result not like", value, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultIn(List<String> values) {
            addCriterion("Quality_Result in", values, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultNotIn(List<String> values) {
            addCriterion("Quality_Result not in", values, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultBetween(String value1, String value2) {
            addCriterion("Quality_Result between", value1, value2, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andQualityResultNotBetween(String value1, String value2) {
            addCriterion("Quality_Result not between", value1, value2, "qualityResult");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIsNull() {
            addCriterion("IPMT_Sign is null");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIsNotNull() {
            addCriterion("IPMT_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtSignEqualTo(String value) {
            addCriterion("IPMT_Sign =", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotEqualTo(String value) {
            addCriterion("IPMT_Sign <>", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignGreaterThan(String value) {
            addCriterion("IPMT_Sign >", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Sign >=", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLessThan(String value) {
            addCriterion("IPMT_Sign <", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Sign <=", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLike(String value) {
            addCriterion("IPMT_Sign like", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotLike(String value) {
            addCriterion("IPMT_Sign not like", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIn(List<String> values) {
            addCriterion("IPMT_Sign in", values, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotIn(List<String> values) {
            addCriterion("IPMT_Sign not in", values, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignBetween(String value1, String value2) {
            addCriterion("IPMT_Sign between", value1, value2, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotBetween(String value1, String value2) {
            addCriterion("IPMT_Sign not between", value1, value2, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIsNull() {
            addCriterion("IPMT_Date is null");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIsNotNull() {
            addCriterion("IPMT_Date is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtDateEqualTo(Date value) {
            addCriterion("IPMT_Date =", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotEqualTo(Date value) {
            addCriterion("IPMT_Date <>", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateGreaterThan(Date value) {
            addCriterion("IPMT_Date >", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("IPMT_Date >=", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateLessThan(Date value) {
            addCriterion("IPMT_Date <", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateLessThanOrEqualTo(Date value) {
            addCriterion("IPMT_Date <=", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIn(List<Date> values) {
            addCriterion("IPMT_Date in", values, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotIn(List<Date> values) {
            addCriterion("IPMT_Date not in", values, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateBetween(Date value1, Date value2) {
            addCriterion("IPMT_Date between", value1, value2, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotBetween(Date value1, Date value2) {
            addCriterion("IPMT_Date not between", value1, value2, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIsNull() {
            addCriterion("IPMT_Opinion is null");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIsNotNull() {
            addCriterion("IPMT_Opinion is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionEqualTo(String value) {
            addCriterion("IPMT_Opinion =", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotEqualTo(String value) {
            addCriterion("IPMT_Opinion <>", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionGreaterThan(String value) {
            addCriterion("IPMT_Opinion >", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Opinion >=", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLessThan(String value) {
            addCriterion("IPMT_Opinion <", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Opinion <=", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLike(String value) {
            addCriterion("IPMT_Opinion like", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotLike(String value) {
            addCriterion("IPMT_Opinion not like", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIn(List<String> values) {
            addCriterion("IPMT_Opinion in", values, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotIn(List<String> values) {
            addCriterion("IPMT_Opinion not in", values, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionBetween(String value1, String value2) {
            addCriterion("IPMT_Opinion between", value1, value2, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotBetween(String value1, String value2) {
            addCriterion("IPMT_Opinion not between", value1, value2, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIsNull() {
            addCriterion("IPMT_Result is null");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIsNotNull() {
            addCriterion("IPMT_Result is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtResultEqualTo(String value) {
            addCriterion("IPMT_Result =", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotEqualTo(String value) {
            addCriterion("IPMT_Result <>", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultGreaterThan(String value) {
            addCriterion("IPMT_Result >", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Result >=", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLessThan(String value) {
            addCriterion("IPMT_Result <", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Result <=", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLike(String value) {
            addCriterion("IPMT_Result like", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotLike(String value) {
            addCriterion("IPMT_Result not like", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIn(List<String> values) {
            addCriterion("IPMT_Result in", values, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotIn(List<String> values) {
            addCriterion("IPMT_Result not in", values, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultBetween(String value1, String value2) {
            addCriterion("IPMT_Result between", value1, value2, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotBetween(String value1, String value2) {
            addCriterion("IPMT_Result not between", value1, value2, "ipmtResult");
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