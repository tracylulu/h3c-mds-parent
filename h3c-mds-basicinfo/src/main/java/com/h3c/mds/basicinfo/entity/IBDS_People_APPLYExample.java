package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_People_APPLYExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_People_APPLYExample() {
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

        public Criteria andPinfotypeIsNull() {
            addCriterion("PInfoType is null");
            return (Criteria) this;
        }

        public Criteria andPinfotypeIsNotNull() {
            addCriterion("PInfoType is not null");
            return (Criteria) this;
        }

        public Criteria andPinfotypeEqualTo(String value) {
            addCriterion("PInfoType =", value, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeNotEqualTo(String value) {
            addCriterion("PInfoType <>", value, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeGreaterThan(String value) {
            addCriterion("PInfoType >", value, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeGreaterThanOrEqualTo(String value) {
            addCriterion("PInfoType >=", value, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeLessThan(String value) {
            addCriterion("PInfoType <", value, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeLessThanOrEqualTo(String value) {
            addCriterion("PInfoType <=", value, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeLike(String value) {
            addCriterion("PInfoType like", value, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeNotLike(String value) {
            addCriterion("PInfoType not like", value, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeIn(List<String> values) {
            addCriterion("PInfoType in", values, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeNotIn(List<String> values) {
            addCriterion("PInfoType not in", values, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeBetween(String value1, String value2) {
            addCriterion("PInfoType between", value1, value2, "pinfotype");
            return (Criteria) this;
        }

        public Criteria andPinfotypeNotBetween(String value1, String value2) {
            addCriterion("PInfoType not between", value1, value2, "pinfotype");
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

        public Criteria andEngplipmtIsNull() {
            addCriterion("EngPLIPMT is null");
            return (Criteria) this;
        }

        public Criteria andEngplipmtIsNotNull() {
            addCriterion("EngPLIPMT is not null");
            return (Criteria) this;
        }

        public Criteria andEngplipmtEqualTo(String value) {
            addCriterion("EngPLIPMT =", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtNotEqualTo(String value) {
            addCriterion("EngPLIPMT <>", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtGreaterThan(String value) {
            addCriterion("EngPLIPMT >", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtGreaterThanOrEqualTo(String value) {
            addCriterion("EngPLIPMT >=", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtLessThan(String value) {
            addCriterion("EngPLIPMT <", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtLessThanOrEqualTo(String value) {
            addCriterion("EngPLIPMT <=", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtLike(String value) {
            addCriterion("EngPLIPMT like", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtNotLike(String value) {
            addCriterion("EngPLIPMT not like", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtIn(List<String> values) {
            addCriterion("EngPLIPMT in", values, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtNotIn(List<String> values) {
            addCriterion("EngPLIPMT not in", values, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtBetween(String value1, String value2) {
            addCriterion("EngPLIPMT between", value1, value2, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtNotBetween(String value1, String value2) {
            addCriterion("EngPLIPMT not between", value1, value2, "engplipmt");
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
            addCriterion("EngPRODLINE is null");
            return (Criteria) this;
        }

        public Criteria andEngprodlineIsNotNull() {
            addCriterion("EngPRODLINE is not null");
            return (Criteria) this;
        }

        public Criteria andEngprodlineEqualTo(String value) {
            addCriterion("EngPRODLINE =", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineNotEqualTo(String value) {
            addCriterion("EngPRODLINE <>", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineGreaterThan(String value) {
            addCriterion("EngPRODLINE >", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineGreaterThanOrEqualTo(String value) {
            addCriterion("EngPRODLINE >=", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineLessThan(String value) {
            addCriterion("EngPRODLINE <", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineLessThanOrEqualTo(String value) {
            addCriterion("EngPRODLINE <=", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineLike(String value) {
            addCriterion("EngPRODLINE like", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineNotLike(String value) {
            addCriterion("EngPRODLINE not like", value, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineIn(List<String> values) {
            addCriterion("EngPRODLINE in", values, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineNotIn(List<String> values) {
            addCriterion("EngPRODLINE not in", values, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineBetween(String value1, String value2) {
            addCriterion("EngPRODLINE between", value1, value2, "engprodline");
            return (Criteria) this;
        }

        public Criteria andEngprodlineNotBetween(String value1, String value2) {
            addCriterion("EngPRODLINE not between", value1, value2, "engprodline");
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

        public Criteria andPdtIsNull() {
            addCriterion("PDT is null");
            return (Criteria) this;
        }

        public Criteria andPdtIsNotNull() {
            addCriterion("PDT is not null");
            return (Criteria) this;
        }

        public Criteria andPdtEqualTo(String value) {
            addCriterion("PDT =", value, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtNotEqualTo(String value) {
            addCriterion("PDT <>", value, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtGreaterThan(String value) {
            addCriterion("PDT >", value, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtGreaterThanOrEqualTo(String value) {
            addCriterion("PDT >=", value, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtLessThan(String value) {
            addCriterion("PDT <", value, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtLessThanOrEqualTo(String value) {
            addCriterion("PDT <=", value, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtLike(String value) {
            addCriterion("PDT like", value, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtNotLike(String value) {
            addCriterion("PDT not like", value, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtIn(List<String> values) {
            addCriterion("PDT in", values, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtNotIn(List<String> values) {
            addCriterion("PDT not in", values, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtBetween(String value1, String value2) {
            addCriterion("PDT between", value1, value2, "pdt");
            return (Criteria) this;
        }

        public Criteria andPdtNotBetween(String value1, String value2) {
            addCriterion("PDT not between", value1, value2, "pdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtIsNull() {
            addCriterion("EngPDT is null");
            return (Criteria) this;
        }

        public Criteria andEngpdtIsNotNull() {
            addCriterion("EngPDT is not null");
            return (Criteria) this;
        }

        public Criteria andEngpdtEqualTo(String value) {
            addCriterion("EngPDT =", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtNotEqualTo(String value) {
            addCriterion("EngPDT <>", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtGreaterThan(String value) {
            addCriterion("EngPDT >", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtGreaterThanOrEqualTo(String value) {
            addCriterion("EngPDT >=", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtLessThan(String value) {
            addCriterion("EngPDT <", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtLessThanOrEqualTo(String value) {
            addCriterion("EngPDT <=", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtLike(String value) {
            addCriterion("EngPDT like", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtNotLike(String value) {
            addCriterion("EngPDT not like", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtIn(List<String> values) {
            addCriterion("EngPDT in", values, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtNotIn(List<String> values) {
            addCriterion("EngPDT not in", values, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtBetween(String value1, String value2) {
            addCriterion("EngPDT between", value1, value2, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtNotBetween(String value1, String value2) {
            addCriterion("EngPDT not between", value1, value2, "engpdt");
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

        public Criteria andVersionIsNull() {
            addCriterion("Version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("Version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("Version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("Version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("Version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("Version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("Version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("Version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("Version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("Version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("Version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("Version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("Version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("Version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andEngversionIsNull() {
            addCriterion("EngVersion is null");
            return (Criteria) this;
        }

        public Criteria andEngversionIsNotNull() {
            addCriterion("EngVersion is not null");
            return (Criteria) this;
        }

        public Criteria andEngversionEqualTo(String value) {
            addCriterion("EngVersion =", value, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionNotEqualTo(String value) {
            addCriterion("EngVersion <>", value, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionGreaterThan(String value) {
            addCriterion("EngVersion >", value, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionGreaterThanOrEqualTo(String value) {
            addCriterion("EngVersion >=", value, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionLessThan(String value) {
            addCriterion("EngVersion <", value, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionLessThanOrEqualTo(String value) {
            addCriterion("EngVersion <=", value, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionLike(String value) {
            addCriterion("EngVersion like", value, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionNotLike(String value) {
            addCriterion("EngVersion not like", value, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionIn(List<String> values) {
            addCriterion("EngVersion in", values, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionNotIn(List<String> values) {
            addCriterion("EngVersion not in", values, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionBetween(String value1, String value2) {
            addCriterion("EngVersion between", value1, value2, "engversion");
            return (Criteria) this;
        }

        public Criteria andEngversionNotBetween(String value1, String value2) {
            addCriterion("EngVersion not between", value1, value2, "engversion");
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

        public Criteria andReleaseIsNull() {
            addCriterion("Release is null");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNotNull() {
            addCriterion("Release is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseEqualTo(String value) {
            addCriterion("Release =", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotEqualTo(String value) {
            addCriterion("Release <>", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThan(String value) {
            addCriterion("Release >", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThanOrEqualTo(String value) {
            addCriterion("Release >=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThan(String value) {
            addCriterion("Release <", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThanOrEqualTo(String value) {
            addCriterion("Release <=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLike(String value) {
            addCriterion("Release like", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotLike(String value) {
            addCriterion("Release not like", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseIn(List<String> values) {
            addCriterion("Release in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotIn(List<String> values) {
            addCriterion("Release not in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseBetween(String value1, String value2) {
            addCriterion("Release between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotBetween(String value1, String value2) {
            addCriterion("Release not between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andEngreleaseIsNull() {
            addCriterion("EngRelease is null");
            return (Criteria) this;
        }

        public Criteria andEngreleaseIsNotNull() {
            addCriterion("EngRelease is not null");
            return (Criteria) this;
        }

        public Criteria andEngreleaseEqualTo(String value) {
            addCriterion("EngRelease =", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseNotEqualTo(String value) {
            addCriterion("EngRelease <>", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseGreaterThan(String value) {
            addCriterion("EngRelease >", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseGreaterThanOrEqualTo(String value) {
            addCriterion("EngRelease >=", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseLessThan(String value) {
            addCriterion("EngRelease <", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseLessThanOrEqualTo(String value) {
            addCriterion("EngRelease <=", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseLike(String value) {
            addCriterion("EngRelease like", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseNotLike(String value) {
            addCriterion("EngRelease not like", value, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseIn(List<String> values) {
            addCriterion("EngRelease in", values, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseNotIn(List<String> values) {
            addCriterion("EngRelease not in", values, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseBetween(String value1, String value2) {
            addCriterion("EngRelease between", value1, value2, "engrelease");
            return (Criteria) this;
        }

        public Criteria andEngreleaseNotBetween(String value1, String value2) {
            addCriterion("EngRelease not between", value1, value2, "engrelease");
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

        public Criteria andIsipmtcheckIsNull() {
            addCriterion("IsIPMTCheck is null");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckIsNotNull() {
            addCriterion("IsIPMTCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckEqualTo(String value) {
            addCriterion("IsIPMTCheck =", value, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckNotEqualTo(String value) {
            addCriterion("IsIPMTCheck <>", value, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckGreaterThan(String value) {
            addCriterion("IsIPMTCheck >", value, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckGreaterThanOrEqualTo(String value) {
            addCriterion("IsIPMTCheck >=", value, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckLessThan(String value) {
            addCriterion("IsIPMTCheck <", value, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckLessThanOrEqualTo(String value) {
            addCriterion("IsIPMTCheck <=", value, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckLike(String value) {
            addCriterion("IsIPMTCheck like", value, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckNotLike(String value) {
            addCriterion("IsIPMTCheck not like", value, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckIn(List<String> values) {
            addCriterion("IsIPMTCheck in", values, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckNotIn(List<String> values) {
            addCriterion("IsIPMTCheck not in", values, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckBetween(String value1, String value2) {
            addCriterion("IsIPMTCheck between", value1, value2, "isipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIsipmtcheckNotBetween(String value1, String value2) {
            addCriterion("IsIPMTCheck not between", value1, value2, "isipmtcheck");
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

        public Criteria andBversionnoIsNull() {
            addCriterion("BVersionno is null");
            return (Criteria) this;
        }

        public Criteria andBversionnoIsNotNull() {
            addCriterion("BVersionno is not null");
            return (Criteria) this;
        }

        public Criteria andBversionnoEqualTo(String value) {
            addCriterion("BVersionno =", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotEqualTo(String value) {
            addCriterion("BVersionno <>", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThan(String value) {
            addCriterion("BVersionno >", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThanOrEqualTo(String value) {
            addCriterion("BVersionno >=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThan(String value) {
            addCriterion("BVersionno <", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThanOrEqualTo(String value) {
            addCriterion("BVersionno <=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLike(String value) {
            addCriterion("BVersionno like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotLike(String value) {
            addCriterion("BVersionno not like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoIn(List<String> values) {
            addCriterion("BVersionno in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotIn(List<String> values) {
            addCriterion("BVersionno not in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoBetween(String value1, String value2) {
            addCriterion("BVersionno between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotBetween(String value1, String value2) {
            addCriterion("BVersionno not between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionIsNull() {
            addCriterion("BVersion is null");
            return (Criteria) this;
        }

        public Criteria andBversionIsNotNull() {
            addCriterion("BVersion is not null");
            return (Criteria) this;
        }

        public Criteria andBversionEqualTo(String value) {
            addCriterion("BVersion =", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotEqualTo(String value) {
            addCriterion("BVersion <>", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionGreaterThan(String value) {
            addCriterion("BVersion >", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionGreaterThanOrEqualTo(String value) {
            addCriterion("BVersion >=", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLessThan(String value) {
            addCriterion("BVersion <", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLessThanOrEqualTo(String value) {
            addCriterion("BVersion <=", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLike(String value) {
            addCriterion("BVersion like", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotLike(String value) {
            addCriterion("BVersion not like", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionIn(List<String> values) {
            addCriterion("BVersion in", values, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotIn(List<String> values) {
            addCriterion("BVersion not in", values, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionBetween(String value1, String value2) {
            addCriterion("BVersion between", value1, value2, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotBetween(String value1, String value2) {
            addCriterion("BVersion not between", value1, value2, "bversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionIsNull() {
            addCriterion("EngBVersion is null");
            return (Criteria) this;
        }

        public Criteria andEngbversionIsNotNull() {
            addCriterion("EngBVersion is not null");
            return (Criteria) this;
        }

        public Criteria andEngbversionEqualTo(String value) {
            addCriterion("EngBVersion =", value, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionNotEqualTo(String value) {
            addCriterion("EngBVersion <>", value, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionGreaterThan(String value) {
            addCriterion("EngBVersion >", value, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionGreaterThanOrEqualTo(String value) {
            addCriterion("EngBVersion >=", value, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionLessThan(String value) {
            addCriterion("EngBVersion <", value, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionLessThanOrEqualTo(String value) {
            addCriterion("EngBVersion <=", value, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionLike(String value) {
            addCriterion("EngBVersion like", value, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionNotLike(String value) {
            addCriterion("EngBVersion not like", value, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionIn(List<String> values) {
            addCriterion("EngBVersion in", values, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionNotIn(List<String> values) {
            addCriterion("EngBVersion not in", values, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionBetween(String value1, String value2) {
            addCriterion("EngBVersion between", value1, value2, "engbversion");
            return (Criteria) this;
        }

        public Criteria andEngbversionNotBetween(String value1, String value2) {
            addCriterion("EngBVersion not between", value1, value2, "engbversion");
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