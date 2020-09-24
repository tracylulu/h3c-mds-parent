package com.h3c.mds.finance.entity;

import java.util.ArrayList;
import java.util.List;

public class FProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FProductExample() {
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

        public Criteria andFproductnoIsNull() {
            addCriterion("FPRODUCTNo is null");
            return (Criteria) this;
        }

        public Criteria andFproductnoIsNotNull() {
            addCriterion("FPRODUCTNo is not null");
            return (Criteria) this;
        }

        public Criteria andFproductnoEqualTo(String value) {
            addCriterion("FPRODUCTNo =", value, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoNotEqualTo(String value) {
            addCriterion("FPRODUCTNo <>", value, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoGreaterThan(String value) {
            addCriterion("FPRODUCTNo >", value, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoGreaterThanOrEqualTo(String value) {
            addCriterion("FPRODUCTNo >=", value, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoLessThan(String value) {
            addCriterion("FPRODUCTNo <", value, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoLessThanOrEqualTo(String value) {
            addCriterion("FPRODUCTNo <=", value, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoLike(String value) {
            addCriterion("FPRODUCTNo like", value, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoNotLike(String value) {
            addCriterion("FPRODUCTNo not like", value, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoIn(List<String> values) {
            addCriterion("FPRODUCTNo in", values, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoNotIn(List<String> values) {
            addCriterion("FPRODUCTNo not in", values, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoBetween(String value1, String value2) {
            addCriterion("FPRODUCTNo between", value1, value2, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductnoNotBetween(String value1, String value2) {
            addCriterion("FPRODUCTNo not between", value1, value2, "fproductno");
            return (Criteria) this;
        }

        public Criteria andFproductIsNull() {
            addCriterion("FPRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andFproductIsNotNull() {
            addCriterion("FPRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andFproductEqualTo(String value) {
            addCriterion("FPRODUCT =", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductNotEqualTo(String value) {
            addCriterion("FPRODUCT <>", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductGreaterThan(String value) {
            addCriterion("FPRODUCT >", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductGreaterThanOrEqualTo(String value) {
            addCriterion("FPRODUCT >=", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductLessThan(String value) {
            addCriterion("FPRODUCT <", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductLessThanOrEqualTo(String value) {
            addCriterion("FPRODUCT <=", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductLike(String value) {
            addCriterion("FPRODUCT like", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductNotLike(String value) {
            addCriterion("FPRODUCT not like", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductIn(List<String> values) {
            addCriterion("FPRODUCT in", values, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductNotIn(List<String> values) {
            addCriterion("FPRODUCT not in", values, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductBetween(String value1, String value2) {
            addCriterion("FPRODUCT between", value1, value2, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductNotBetween(String value1, String value2) {
            addCriterion("FPRODUCT not between", value1, value2, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductoldIsNull() {
            addCriterion("FPRODUCTOld is null");
            return (Criteria) this;
        }

        public Criteria andFproductoldIsNotNull() {
            addCriterion("FPRODUCTOld is not null");
            return (Criteria) this;
        }

        public Criteria andFproductoldEqualTo(String value) {
            addCriterion("FPRODUCTOld =", value, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldNotEqualTo(String value) {
            addCriterion("FPRODUCTOld <>", value, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldGreaterThan(String value) {
            addCriterion("FPRODUCTOld >", value, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldGreaterThanOrEqualTo(String value) {
            addCriterion("FPRODUCTOld >=", value, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldLessThan(String value) {
            addCriterion("FPRODUCTOld <", value, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldLessThanOrEqualTo(String value) {
            addCriterion("FPRODUCTOld <=", value, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldLike(String value) {
            addCriterion("FPRODUCTOld like", value, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldNotLike(String value) {
            addCriterion("FPRODUCTOld not like", value, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldIn(List<String> values) {
            addCriterion("FPRODUCTOld in", values, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldNotIn(List<String> values) {
            addCriterion("FPRODUCTOld not in", values, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldBetween(String value1, String value2) {
            addCriterion("FPRODUCTOld between", value1, value2, "fproductold");
            return (Criteria) this;
        }

        public Criteria andFproductoldNotBetween(String value1, String value2) {
            addCriterion("FPRODUCTOld not between", value1, value2, "fproductold");
            return (Criteria) this;
        }

        public Criteria andEngfproductIsNull() {
            addCriterion("engFPRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andEngfproductIsNotNull() {
            addCriterion("engFPRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andEngfproductEqualTo(String value) {
            addCriterion("engFPRODUCT =", value, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductNotEqualTo(String value) {
            addCriterion("engFPRODUCT <>", value, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductGreaterThan(String value) {
            addCriterion("engFPRODUCT >", value, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductGreaterThanOrEqualTo(String value) {
            addCriterion("engFPRODUCT >=", value, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductLessThan(String value) {
            addCriterion("engFPRODUCT <", value, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductLessThanOrEqualTo(String value) {
            addCriterion("engFPRODUCT <=", value, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductLike(String value) {
            addCriterion("engFPRODUCT like", value, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductNotLike(String value) {
            addCriterion("engFPRODUCT not like", value, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductIn(List<String> values) {
            addCriterion("engFPRODUCT in", values, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductNotIn(List<String> values) {
            addCriterion("engFPRODUCT not in", values, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductBetween(String value1, String value2) {
            addCriterion("engFPRODUCT between", value1, value2, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andEngfproductNotBetween(String value1, String value2) {
            addCriterion("engFPRODUCT not between", value1, value2, "engfproduct");
            return (Criteria) this;
        }

        public Criteria andIfplanIsNull() {
            addCriterion("IfPlan is null");
            return (Criteria) this;
        }

        public Criteria andIfplanIsNotNull() {
            addCriterion("IfPlan is not null");
            return (Criteria) this;
        }

        public Criteria andIfplanEqualTo(String value) {
            addCriterion("IfPlan =", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotEqualTo(String value) {
            addCriterion("IfPlan <>", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanGreaterThan(String value) {
            addCriterion("IfPlan >", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanGreaterThanOrEqualTo(String value) {
            addCriterion("IfPlan >=", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLessThan(String value) {
            addCriterion("IfPlan <", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLessThanOrEqualTo(String value) {
            addCriterion("IfPlan <=", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLike(String value) {
            addCriterion("IfPlan like", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotLike(String value) {
            addCriterion("IfPlan not like", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanIn(List<String> values) {
            addCriterion("IfPlan in", values, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotIn(List<String> values) {
            addCriterion("IfPlan not in", values, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanBetween(String value1, String value2) {
            addCriterion("IfPlan between", value1, value2, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotBetween(String value1, String value2) {
            addCriterion("IfPlan not between", value1, value2, "ifplan");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeIsNull() {
            addCriterion("FPRODUCTCOACode is null");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeIsNotNull() {
            addCriterion("FPRODUCTCOACode is not null");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeEqualTo(String value) {
            addCriterion("FPRODUCTCOACode =", value, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeNotEqualTo(String value) {
            addCriterion("FPRODUCTCOACode <>", value, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeGreaterThan(String value) {
            addCriterion("FPRODUCTCOACode >", value, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeGreaterThanOrEqualTo(String value) {
            addCriterion("FPRODUCTCOACode >=", value, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeLessThan(String value) {
            addCriterion("FPRODUCTCOACode <", value, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeLessThanOrEqualTo(String value) {
            addCriterion("FPRODUCTCOACode <=", value, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeLike(String value) {
            addCriterion("FPRODUCTCOACode like", value, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeNotLike(String value) {
            addCriterion("FPRODUCTCOACode not like", value, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeIn(List<String> values) {
            addCriterion("FPRODUCTCOACode in", values, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeNotIn(List<String> values) {
            addCriterion("FPRODUCTCOACode not in", values, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeBetween(String value1, String value2) {
            addCriterion("FPRODUCTCOACode between", value1, value2, "fproductcoacode");
            return (Criteria) this;
        }

        public Criteria andFproductcoacodeNotBetween(String value1, String value2) {
            addCriterion("FPRODUCTCOACode not between", value1, value2, "fproductcoacode");
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

        public Criteria andBomIsNull() {
            addCriterion("BOM is null");
            return (Criteria) this;
        }

        public Criteria andBomIsNotNull() {
            addCriterion("BOM is not null");
            return (Criteria) this;
        }

        public Criteria andBomEqualTo(String value) {
            addCriterion("BOM =", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotEqualTo(String value) {
            addCriterion("BOM <>", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomGreaterThan(String value) {
            addCriterion("BOM >", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomGreaterThanOrEqualTo(String value) {
            addCriterion("BOM >=", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLessThan(String value) {
            addCriterion("BOM <", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLessThanOrEqualTo(String value) {
            addCriterion("BOM <=", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLike(String value) {
            addCriterion("BOM like", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotLike(String value) {
            addCriterion("BOM not like", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomIn(List<String> values) {
            addCriterion("BOM in", values, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotIn(List<String> values) {
            addCriterion("BOM not in", values, "bom");
            return (Criteria) this;
        }

        public Criteria andBomBetween(String value1, String value2) {
            addCriterion("BOM between", value1, value2, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotBetween(String value1, String value2) {
            addCriterion("BOM not between", value1, value2, "bom");
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

        public Criteria andFproductmatchIsNull() {
            addCriterion("FPRODUCTMatch is null");
            return (Criteria) this;
        }

        public Criteria andFproductmatchIsNotNull() {
            addCriterion("FPRODUCTMatch is not null");
            return (Criteria) this;
        }

        public Criteria andFproductmatchEqualTo(String value) {
            addCriterion("FPRODUCTMatch =", value, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchNotEqualTo(String value) {
            addCriterion("FPRODUCTMatch <>", value, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchGreaterThan(String value) {
            addCriterion("FPRODUCTMatch >", value, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchGreaterThanOrEqualTo(String value) {
            addCriterion("FPRODUCTMatch >=", value, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchLessThan(String value) {
            addCriterion("FPRODUCTMatch <", value, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchLessThanOrEqualTo(String value) {
            addCriterion("FPRODUCTMatch <=", value, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchLike(String value) {
            addCriterion("FPRODUCTMatch like", value, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchNotLike(String value) {
            addCriterion("FPRODUCTMatch not like", value, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchIn(List<String> values) {
            addCriterion("FPRODUCTMatch in", values, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchNotIn(List<String> values) {
            addCriterion("FPRODUCTMatch not in", values, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchBetween(String value1, String value2) {
            addCriterion("FPRODUCTMatch between", value1, value2, "fproductmatch");
            return (Criteria) this;
        }

        public Criteria andFproductmatchNotBetween(String value1, String value2) {
            addCriterion("FPRODUCTMatch not between", value1, value2, "fproductmatch");
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