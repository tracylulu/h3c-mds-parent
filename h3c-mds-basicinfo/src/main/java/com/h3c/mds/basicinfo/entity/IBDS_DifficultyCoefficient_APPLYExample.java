package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_DifficultyCoefficient_APPLYExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_DifficultyCoefficient_APPLYExample() {
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