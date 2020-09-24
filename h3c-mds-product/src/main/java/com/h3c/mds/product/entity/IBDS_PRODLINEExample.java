package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_PRODLINEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_PRODLINEExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andEngprodlineIsNull() {
            addCriterion("engPRODLINE is null");
            return (Criteria) this;
        }

        public Criteria andEngprodlineIsNotNull() {
            addCriterion("engPRODLINE is not null");
            return (Criteria) this;
        }

        public Criteria andEngprodlineEqualTo(String value) {
            addCriterion("engPRODLINE =", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineNotEqualTo(String value) {
            addCriterion("engPRODLINE <>", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineGreaterThan(String value) {
            addCriterion("engPRODLINE >", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineGreaterThanOrEqualTo(String value) {
            addCriterion("engPRODLINE >=", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineLessThan(String value) {
            addCriterion("engPRODLINE <", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineLessThanOrEqualTo(String value) {
            addCriterion("engPRODLINE <=", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineLike(String value) {
            addCriterion("engPRODLINE like", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineNotLike(String value) {
            addCriterion("engPRODLINE not like", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineIn(List<String> values) {
            addCriterion("engPRODLINE in", values, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineNotIn(List<String> values) {
            addCriterion("engPRODLINE not in", values, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineBetween(String value1, String value2) {
            addCriterion("engPRODLINE between", value1, value2, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineNotBetween(String value1, String value2) {
            addCriterion("engPRODLINE not between", value1, value2, "engprodline");
            return (Criteria) this;
        }

        public Criteria andProdlineoldIsNull() {
            addCriterion("PRODLINEOld is null");
            return (Criteria) this;
        }

        public Criteria andProdlineoldIsNotNull() {
            addCriterion("PRODLINEOld is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineoldEqualTo(String value) {
            addCriterion("PRODLINEOld =", value, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldNotEqualTo(String value) {
            addCriterion("PRODLINEOld <>", value, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldGreaterThan(String value) {
            addCriterion("PRODLINEOld >", value, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINEOld >=", value, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldLessThan(String value) {
            addCriterion("PRODLINEOld <", value, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldLessThanOrEqualTo(String value) {
            addCriterion("PRODLINEOld <=", value, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldLike(String value) {
            addCriterion("PRODLINEOld like", value, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldNotLike(String value) {
            addCriterion("PRODLINEOld not like", value, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldIn(List<String> values) {
            addCriterion("PRODLINEOld in", values, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldNotIn(List<String> values) {
            addCriterion("PRODLINEOld not in", values, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldBetween(String value1, String value2) {
            addCriterion("PRODLINEOld between", value1, value2, "prodlineold");
            return (Criteria) this;
        }

        public Criteria andProdlineoldNotBetween(String value1, String value2) {
            addCriterion("PRODLINEOld not between", value1, value2, "prodlineold");
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

        public Criteria andFldcpxzjIsNull() {
            addCriterion("fldcpxzj is null");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjIsNotNull() {
            addCriterion("fldcpxzj is not null");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjEqualTo(String value) {
            addCriterion("fldcpxzj =", value, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjNotEqualTo(String value) {
            addCriterion("fldcpxzj <>", value, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjGreaterThan(String value) {
            addCriterion("fldcpxzj >", value, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjGreaterThanOrEqualTo(String value) {
            addCriterion("fldcpxzj >=", value, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjLessThan(String value) {
            addCriterion("fldcpxzj <", value, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjLessThanOrEqualTo(String value) {
            addCriterion("fldcpxzj <=", value, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjLike(String value) {
            addCriterion("fldcpxzj like", value, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjNotLike(String value) {
            addCriterion("fldcpxzj not like", value, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjIn(List<String> values) {
            addCriterion("fldcpxzj in", values, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjNotIn(List<String> values) {
            addCriterion("fldcpxzj not in", values, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjBetween(String value1, String value2) {
            addCriterion("fldcpxzj between", value1, value2, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andFldcpxzjNotBetween(String value1, String value2) {
            addCriterion("fldcpxzj not between", value1, value2, "fldcpxzj");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdIsNull() {
            addCriterion("Quality_Director_ID is null");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdIsNotNull() {
            addCriterion("Quality_Director_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdEqualTo(String value) {
            addCriterion("Quality_Director_ID =", value, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdNotEqualTo(String value) {
            addCriterion("Quality_Director_ID <>", value, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdGreaterThan(String value) {
            addCriterion("Quality_Director_ID >", value, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdGreaterThanOrEqualTo(String value) {
            addCriterion("Quality_Director_ID >=", value, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdLessThan(String value) {
            addCriterion("Quality_Director_ID <", value, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdLessThanOrEqualTo(String value) {
            addCriterion("Quality_Director_ID <=", value, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdLike(String value) {
            addCriterion("Quality_Director_ID like", value, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdNotLike(String value) {
            addCriterion("Quality_Director_ID not like", value, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdIn(List<String> values) {
            addCriterion("Quality_Director_ID in", values, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdNotIn(List<String> values) {
            addCriterion("Quality_Director_ID not in", values, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdBetween(String value1, String value2) {
            addCriterion("Quality_Director_ID between", value1, value2, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andQualityDirectorIdNotBetween(String value1, String value2) {
            addCriterion("Quality_Director_ID not between", value1, value2, "qualityDirectorId");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupIsNull() {
            addCriterion("PL_CCB_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupIsNotNull() {
            addCriterion("PL_CCB_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupEqualTo(String value) {
            addCriterion("PL_CCB_GROUP =", value, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupNotEqualTo(String value) {
            addCriterion("PL_CCB_GROUP <>", value, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupGreaterThan(String value) {
            addCriterion("PL_CCB_GROUP >", value, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PL_CCB_GROUP >=", value, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupLessThan(String value) {
            addCriterion("PL_CCB_GROUP <", value, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupLessThanOrEqualTo(String value) {
            addCriterion("PL_CCB_GROUP <=", value, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupLike(String value) {
            addCriterion("PL_CCB_GROUP like", value, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupNotLike(String value) {
            addCriterion("PL_CCB_GROUP not like", value, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupIn(List<String> values) {
            addCriterion("PL_CCB_GROUP in", values, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupNotIn(List<String> values) {
            addCriterion("PL_CCB_GROUP not in", values, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupBetween(String value1, String value2) {
            addCriterion("PL_CCB_GROUP between", value1, value2, "plCcbGroup");
            return (Criteria) this;
        }

        public Criteria andPlCcbGroupNotBetween(String value1, String value2) {
            addCriterion("PL_CCB_GROUP not between", value1, value2, "plCcbGroup");
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

        public Criteria andQualityMngerIdIsNull() {
            addCriterion("Quality_Mnger_ID is null");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdIsNotNull() {
            addCriterion("Quality_Mnger_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdEqualTo(String value) {
            addCriterion("Quality_Mnger_ID =", value, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdNotEqualTo(String value) {
            addCriterion("Quality_Mnger_ID <>", value, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdGreaterThan(String value) {
            addCriterion("Quality_Mnger_ID >", value, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdGreaterThanOrEqualTo(String value) {
            addCriterion("Quality_Mnger_ID >=", value, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdLessThan(String value) {
            addCriterion("Quality_Mnger_ID <", value, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdLessThanOrEqualTo(String value) {
            addCriterion("Quality_Mnger_ID <=", value, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdLike(String value) {
            addCriterion("Quality_Mnger_ID like", value, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdNotLike(String value) {
            addCriterion("Quality_Mnger_ID not like", value, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdIn(List<String> values) {
            addCriterion("Quality_Mnger_ID in", values, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdNotIn(List<String> values) {
            addCriterion("Quality_Mnger_ID not in", values, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdBetween(String value1, String value2) {
            addCriterion("Quality_Mnger_ID between", value1, value2, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andQualityMngerIdNotBetween(String value1, String value2) {
            addCriterion("Quality_Mnger_ID not between", value1, value2, "qualityMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdIsNull() {
            addCriterion("Test_Mnger_ID is null");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdIsNotNull() {
            addCriterion("Test_Mnger_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdEqualTo(String value) {
            addCriterion("Test_Mnger_ID =", value, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdNotEqualTo(String value) {
            addCriterion("Test_Mnger_ID <>", value, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdGreaterThan(String value) {
            addCriterion("Test_Mnger_ID >", value, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdGreaterThanOrEqualTo(String value) {
            addCriterion("Test_Mnger_ID >=", value, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdLessThan(String value) {
            addCriterion("Test_Mnger_ID <", value, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdLessThanOrEqualTo(String value) {
            addCriterion("Test_Mnger_ID <=", value, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdLike(String value) {
            addCriterion("Test_Mnger_ID like", value, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdNotLike(String value) {
            addCriterion("Test_Mnger_ID not like", value, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdIn(List<String> values) {
            addCriterion("Test_Mnger_ID in", values, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdNotIn(List<String> values) {
            addCriterion("Test_Mnger_ID not in", values, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdBetween(String value1, String value2) {
            addCriterion("Test_Mnger_ID between", value1, value2, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andTestMngerIdNotBetween(String value1, String value2) {
            addCriterion("Test_Mnger_ID not between", value1, value2, "testMngerId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdIsNull() {
            addCriterion("CMOLeader_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdIsNotNull() {
            addCriterion("CMOLeader_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdEqualTo(String value) {
            addCriterion("CMOLeader_ID =", value, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdNotEqualTo(String value) {
            addCriterion("CMOLeader_ID <>", value, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdGreaterThan(String value) {
            addCriterion("CMOLeader_ID >", value, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("CMOLeader_ID >=", value, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdLessThan(String value) {
            addCriterion("CMOLeader_ID <", value, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdLessThanOrEqualTo(String value) {
            addCriterion("CMOLeader_ID <=", value, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdLike(String value) {
            addCriterion("CMOLeader_ID like", value, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdNotLike(String value) {
            addCriterion("CMOLeader_ID not like", value, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdIn(List<String> values) {
            addCriterion("CMOLeader_ID in", values, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdNotIn(List<String> values) {
            addCriterion("CMOLeader_ID not in", values, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdBetween(String value1, String value2) {
            addCriterion("CMOLeader_ID between", value1, value2, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andCmoleaderIdNotBetween(String value1, String value2) {
            addCriterion("CMOLeader_ID not between", value1, value2, "cmoleaderId");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpIsNull() {
            addCriterion("PrjMarketP is null");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpIsNotNull() {
            addCriterion("PrjMarketP is not null");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpEqualTo(String value) {
            addCriterion("PrjMarketP =", value, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpNotEqualTo(String value) {
            addCriterion("PrjMarketP <>", value, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpGreaterThan(String value) {
            addCriterion("PrjMarketP >", value, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpGreaterThanOrEqualTo(String value) {
            addCriterion("PrjMarketP >=", value, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpLessThan(String value) {
            addCriterion("PrjMarketP <", value, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpLessThanOrEqualTo(String value) {
            addCriterion("PrjMarketP <=", value, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpLike(String value) {
            addCriterion("PrjMarketP like", value, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpNotLike(String value) {
            addCriterion("PrjMarketP not like", value, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpIn(List<String> values) {
            addCriterion("PrjMarketP in", values, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpNotIn(List<String> values) {
            addCriterion("PrjMarketP not in", values, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpBetween(String value1, String value2) {
            addCriterion("PrjMarketP between", value1, value2, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPrjmarketpNotBetween(String value1, String value2) {
            addCriterion("PrjMarketP not between", value1, value2, "prjmarketp");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryIsNull() {
            addCriterion("PL_CCB_SECRETARY is null");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryIsNotNull() {
            addCriterion("PL_CCB_SECRETARY is not null");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryEqualTo(String value) {
            addCriterion("PL_CCB_SECRETARY =", value, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryNotEqualTo(String value) {
            addCriterion("PL_CCB_SECRETARY <>", value, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryGreaterThan(String value) {
            addCriterion("PL_CCB_SECRETARY >", value, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryGreaterThanOrEqualTo(String value) {
            addCriterion("PL_CCB_SECRETARY >=", value, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryLessThan(String value) {
            addCriterion("PL_CCB_SECRETARY <", value, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryLessThanOrEqualTo(String value) {
            addCriterion("PL_CCB_SECRETARY <=", value, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryLike(String value) {
            addCriterion("PL_CCB_SECRETARY like", value, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryNotLike(String value) {
            addCriterion("PL_CCB_SECRETARY not like", value, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryIn(List<String> values) {
            addCriterion("PL_CCB_SECRETARY in", values, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryNotIn(List<String> values) {
            addCriterion("PL_CCB_SECRETARY not in", values, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryBetween(String value1, String value2) {
            addCriterion("PL_CCB_SECRETARY between", value1, value2, "plCcbSecretary");
            return (Criteria) this;
        }

        public Criteria andPlCcbSecretaryNotBetween(String value1, String value2) {
            addCriterion("PL_CCB_SECRETARY not between", value1, value2, "plCcbSecretary");
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

        public Criteria andPlOrderIsNull() {
            addCriterion("PL_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andPlOrderIsNotNull() {
            addCriterion("PL_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andPlOrderEqualTo(Integer value) {
            addCriterion("PL_ORDER =", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotEqualTo(Integer value) {
            addCriterion("PL_ORDER <>", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderGreaterThan(Integer value) {
            addCriterion("PL_ORDER >", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PL_ORDER >=", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderLessThan(Integer value) {
            addCriterion("PL_ORDER <", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderLessThanOrEqualTo(Integer value) {
            addCriterion("PL_ORDER <=", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderIn(List<Integer> values) {
            addCriterion("PL_ORDER in", values, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotIn(List<Integer> values) {
            addCriterion("PL_ORDER not in", values, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderBetween(Integer value1, Integer value2) {
            addCriterion("PL_ORDER between", value1, value2, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("PL_ORDER not between", value1, value2, "plOrder");
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