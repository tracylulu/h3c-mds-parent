package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_BversionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_BversionExample() {
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

        public Criteria andBversionnoIsNull() {
            addCriterion("bversionno is null");
            return (Criteria) this;
        }

        public Criteria andBversionnoIsNotNull() {
            addCriterion("bversionno is not null");
            return (Criteria) this;
        }

        public Criteria andBversionnoEqualTo(String value) {
            addCriterion("bversionno =", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotEqualTo(String value) {
            addCriterion("bversionno <>", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThan(String value) {
            addCriterion("bversionno >", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThanOrEqualTo(String value) {
            addCriterion("bversionno >=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThan(String value) {
            addCriterion("bversionno <", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThanOrEqualTo(String value) {
            addCriterion("bversionno <=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLike(String value) {
            addCriterion("bversionno like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotLike(String value) {
            addCriterion("bversionno not like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoIn(List<String> values) {
            addCriterion("bversionno in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotIn(List<String> values) {
            addCriterion("bversionno not in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoBetween(String value1, String value2) {
            addCriterion("bversionno between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotBetween(String value1, String value2) {
            addCriterion("bversionno not between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversioncnameIsNull() {
            addCriterion("bversioncname is null");
            return (Criteria) this;
        }

        public Criteria andBversioncnameIsNotNull() {
            addCriterion("bversioncname is not null");
            return (Criteria) this;
        }

        public Criteria andBversioncnameEqualTo(String value) {
            addCriterion("bversioncname =", value, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameNotEqualTo(String value) {
            addCriterion("bversioncname <>", value, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameGreaterThan(String value) {
            addCriterion("bversioncname >", value, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameGreaterThanOrEqualTo(String value) {
            addCriterion("bversioncname >=", value, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameLessThan(String value) {
            addCriterion("bversioncname <", value, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameLessThanOrEqualTo(String value) {
            addCriterion("bversioncname <=", value, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameLike(String value) {
            addCriterion("bversioncname like", value, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameNotLike(String value) {
            addCriterion("bversioncname not like", value, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameIn(List<String> values) {
            addCriterion("bversioncname in", values, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameNotIn(List<String> values) {
            addCriterion("bversioncname not in", values, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameBetween(String value1, String value2) {
            addCriterion("bversioncname between", value1, value2, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversioncnameNotBetween(String value1, String value2) {
            addCriterion("bversioncname not between", value1, value2, "bversioncname");
            return (Criteria) this;
        }

        public Criteria andBversionoldIsNull() {
            addCriterion("bversionold is null");
            return (Criteria) this;
        }

        public Criteria andBversionoldIsNotNull() {
            addCriterion("bversionold is not null");
            return (Criteria) this;
        }

        public Criteria andBversionoldEqualTo(String value) {
            addCriterion("bversionold =", value, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldNotEqualTo(String value) {
            addCriterion("bversionold <>", value, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldGreaterThan(String value) {
            addCriterion("bversionold >", value, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldGreaterThanOrEqualTo(String value) {
            addCriterion("bversionold >=", value, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldLessThan(String value) {
            addCriterion("bversionold <", value, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldLessThanOrEqualTo(String value) {
            addCriterion("bversionold <=", value, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldLike(String value) {
            addCriterion("bversionold like", value, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldNotLike(String value) {
            addCriterion("bversionold not like", value, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldIn(List<String> values) {
            addCriterion("bversionold in", values, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldNotIn(List<String> values) {
            addCriterion("bversionold not in", values, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldBetween(String value1, String value2) {
            addCriterion("bversionold between", value1, value2, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionoldNotBetween(String value1, String value2) {
            addCriterion("bversionold not between", value1, value2, "bversionold");
            return (Criteria) this;
        }

        public Criteria andBversionenameIsNull() {
            addCriterion("bversionename is null");
            return (Criteria) this;
        }

        public Criteria andBversionenameIsNotNull() {
            addCriterion("bversionename is not null");
            return (Criteria) this;
        }

        public Criteria andBversionenameEqualTo(String value) {
            addCriterion("bversionename =", value, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameNotEqualTo(String value) {
            addCriterion("bversionename <>", value, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameGreaterThan(String value) {
            addCriterion("bversionename >", value, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameGreaterThanOrEqualTo(String value) {
            addCriterion("bversionename >=", value, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameLessThan(String value) {
            addCriterion("bversionename <", value, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameLessThanOrEqualTo(String value) {
            addCriterion("bversionename <=", value, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameLike(String value) {
            addCriterion("bversionename like", value, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameNotLike(String value) {
            addCriterion("bversionename not like", value, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameIn(List<String> values) {
            addCriterion("bversionename in", values, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameNotIn(List<String> values) {
            addCriterion("bversionename not in", values, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameBetween(String value1, String value2) {
            addCriterion("bversionename between", value1, value2, "bversionename");
            return (Criteria) this;
        }

        public Criteria andBversionenameNotBetween(String value1, String value2) {
            addCriterion("bversionename not between", value1, value2, "bversionename");
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

        public Criteria andBversionmatchIsNull() {
            addCriterion("bversionMatch is null");
            return (Criteria) this;
        }

        public Criteria andBversionmatchIsNotNull() {
            addCriterion("bversionMatch is not null");
            return (Criteria) this;
        }

        public Criteria andBversionmatchEqualTo(String value) {
            addCriterion("bversionMatch =", value, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchNotEqualTo(String value) {
            addCriterion("bversionMatch <>", value, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchGreaterThan(String value) {
            addCriterion("bversionMatch >", value, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchGreaterThanOrEqualTo(String value) {
            addCriterion("bversionMatch >=", value, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchLessThan(String value) {
            addCriterion("bversionMatch <", value, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchLessThanOrEqualTo(String value) {
            addCriterion("bversionMatch <=", value, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchLike(String value) {
            addCriterion("bversionMatch like", value, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchNotLike(String value) {
            addCriterion("bversionMatch not like", value, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchIn(List<String> values) {
            addCriterion("bversionMatch in", values, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchNotIn(List<String> values) {
            addCriterion("bversionMatch not in", values, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchBetween(String value1, String value2) {
            addCriterion("bversionMatch between", value1, value2, "bversionmatch");
            return (Criteria) this;
        }

        public Criteria andBversionmatchNotBetween(String value1, String value2) {
            addCriterion("bversionMatch not between", value1, value2, "bversionmatch");
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

        public Criteria andSeIsNull() {
            addCriterion("se is null");
            return (Criteria) this;
        }

        public Criteria andSeIsNotNull() {
            addCriterion("se is not null");
            return (Criteria) this;
        }

        public Criteria andSeEqualTo(String value) {
            addCriterion("se =", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotEqualTo(String value) {
            addCriterion("se <>", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeGreaterThan(String value) {
            addCriterion("se >", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeGreaterThanOrEqualTo(String value) {
            addCriterion("se >=", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeLessThan(String value) {
            addCriterion("se <", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeLessThanOrEqualTo(String value) {
            addCriterion("se <=", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeLike(String value) {
            addCriterion("se like", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotLike(String value) {
            addCriterion("se not like", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeIn(List<String> values) {
            addCriterion("se in", values, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotIn(List<String> values) {
            addCriterion("se not in", values, "se");
            return (Criteria) this;
        }

        public Criteria andSeBetween(String value1, String value2) {
            addCriterion("se between", value1, value2, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotBetween(String value1, String value2) {
            addCriterion("se not between", value1, value2, "se");
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

        public Criteria andProjectstatusIsNull() {
            addCriterion("ProjectStatus is null");
            return (Criteria) this;
        }

        public Criteria andProjectstatusIsNotNull() {
            addCriterion("ProjectStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProjectstatusEqualTo(String value) {
            addCriterion("ProjectStatus =", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusNotEqualTo(String value) {
            addCriterion("ProjectStatus <>", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusGreaterThan(String value) {
            addCriterion("ProjectStatus >", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectStatus >=", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusLessThan(String value) {
            addCriterion("ProjectStatus <", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusLessThanOrEqualTo(String value) {
            addCriterion("ProjectStatus <=", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusLike(String value) {
            addCriterion("ProjectStatus like", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusNotLike(String value) {
            addCriterion("ProjectStatus not like", value, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusIn(List<String> values) {
            addCriterion("ProjectStatus in", values, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusNotIn(List<String> values) {
            addCriterion("ProjectStatus not in", values, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusBetween(String value1, String value2) {
            addCriterion("ProjectStatus between", value1, value2, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andProjectstatusNotBetween(String value1, String value2) {
            addCriterion("ProjectStatus not between", value1, value2, "projectstatus");
            return (Criteria) this;
        }

        public Criteria andPackIsNull() {
            addCriterion("Pack is null");
            return (Criteria) this;
        }

        public Criteria andPackIsNotNull() {
            addCriterion("Pack is not null");
            return (Criteria) this;
        }

        public Criteria andPackEqualTo(String value) {
            addCriterion("Pack =", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotEqualTo(String value) {
            addCriterion("Pack <>", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThan(String value) {
            addCriterion("Pack >", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThanOrEqualTo(String value) {
            addCriterion("Pack >=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThan(String value) {
            addCriterion("Pack <", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThanOrEqualTo(String value) {
            addCriterion("Pack <=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLike(String value) {
            addCriterion("Pack like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotLike(String value) {
            addCriterion("Pack not like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackIn(List<String> values) {
            addCriterion("Pack in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotIn(List<String> values) {
            addCriterion("Pack not in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackBetween(String value1, String value2) {
            addCriterion("Pack between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotBetween(String value1, String value2) {
            addCriterion("Pack not between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andHardpackIsNull() {
            addCriterion("HardPack is null");
            return (Criteria) this;
        }

        public Criteria andHardpackIsNotNull() {
            addCriterion("HardPack is not null");
            return (Criteria) this;
        }

        public Criteria andHardpackEqualTo(String value) {
            addCriterion("HardPack =", value, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackNotEqualTo(String value) {
            addCriterion("HardPack <>", value, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackGreaterThan(String value) {
            addCriterion("HardPack >", value, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackGreaterThanOrEqualTo(String value) {
            addCriterion("HardPack >=", value, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackLessThan(String value) {
            addCriterion("HardPack <", value, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackLessThanOrEqualTo(String value) {
            addCriterion("HardPack <=", value, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackLike(String value) {
            addCriterion("HardPack like", value, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackNotLike(String value) {
            addCriterion("HardPack not like", value, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackIn(List<String> values) {
            addCriterion("HardPack in", values, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackNotIn(List<String> values) {
            addCriterion("HardPack not in", values, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackBetween(String value1, String value2) {
            addCriterion("HardPack between", value1, value2, "hardpack");
            return (Criteria) this;
        }

        public Criteria andHardpackNotBetween(String value1, String value2) {
            addCriterion("HardPack not between", value1, value2, "hardpack");
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