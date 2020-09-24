package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.List;

public class IBDS_RDProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_RDProductExample() {
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

        public Criteria andProductIsNull() {
            addCriterion("PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("PRODUCT =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("PRODUCT <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("PRODUCT >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("PRODUCT <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("PRODUCT like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("PRODUCT not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("PRODUCT in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("PRODUCT not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("PRODUCT between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("PRODUCT not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andEngproductIsNull() {
            addCriterion("engPRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andEngproductIsNotNull() {
            addCriterion("engPRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andEngproductEqualTo(String value) {
            addCriterion("engPRODUCT =", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductNotEqualTo(String value) {
            addCriterion("engPRODUCT <>", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductGreaterThan(String value) {
            addCriterion("engPRODUCT >", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductGreaterThanOrEqualTo(String value) {
            addCriterion("engPRODUCT >=", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductLessThan(String value) {
            addCriterion("engPRODUCT <", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductLessThanOrEqualTo(String value) {
            addCriterion("engPRODUCT <=", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductLike(String value) {
            addCriterion("engPRODUCT like", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductNotLike(String value) {
            addCriterion("engPRODUCT not like", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductIn(List<String> values) {
            addCriterion("engPRODUCT in", values, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductNotIn(List<String> values) {
            addCriterion("engPRODUCT not in", values, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductBetween(String value1, String value2) {
            addCriterion("engPRODUCT between", value1, value2, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductNotBetween(String value1, String value2) {
            addCriterion("engPRODUCT not between", value1, value2, "engproduct");
            return (Criteria) this;
        }

        public Criteria andProductoldIsNull() {
            addCriterion("PRODUCTOld is null");
            return (Criteria) this;
        }

        public Criteria andProductoldIsNotNull() {
            addCriterion("PRODUCTOld is not null");
            return (Criteria) this;
        }

        public Criteria andProductoldEqualTo(String value) {
            addCriterion("PRODUCTOld =", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldNotEqualTo(String value) {
            addCriterion("PRODUCTOld <>", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldGreaterThan(String value) {
            addCriterion("PRODUCTOld >", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTOld >=", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldLessThan(String value) {
            addCriterion("PRODUCTOld <", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTOld <=", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldLike(String value) {
            addCriterion("PRODUCTOld like", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldNotLike(String value) {
            addCriterion("PRODUCTOld not like", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldIn(List<String> values) {
            addCriterion("PRODUCTOld in", values, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldNotIn(List<String> values) {
            addCriterion("PRODUCTOld not in", values, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldBetween(String value1, String value2) {
            addCriterion("PRODUCTOld between", value1, value2, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldNotBetween(String value1, String value2) {
            addCriterion("PRODUCTOld not between", value1, value2, "productold");
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

        public Criteria andProductcoacodeIsNull() {
            addCriterion("PRODUCTCOACode is null");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeIsNotNull() {
            addCriterion("PRODUCTCOACode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeEqualTo(String value) {
            addCriterion("PRODUCTCOACode =", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeNotEqualTo(String value) {
            addCriterion("PRODUCTCOACode <>", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeGreaterThan(String value) {
            addCriterion("PRODUCTCOACode >", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTCOACode >=", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeLessThan(String value) {
            addCriterion("PRODUCTCOACode <", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTCOACode <=", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeLike(String value) {
            addCriterion("PRODUCTCOACode like", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeNotLike(String value) {
            addCriterion("PRODUCTCOACode not like", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeIn(List<String> values) {
            addCriterion("PRODUCTCOACode in", values, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeNotIn(List<String> values) {
            addCriterion("PRODUCTCOACode not in", values, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeBetween(String value1, String value2) {
            addCriterion("PRODUCTCOACode between", value1, value2, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCTCOACode not between", value1, value2, "productcoacode");
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

        public Criteria andProducttypenoIsNull() {
            addCriterion("PRODUCTTypeNo is null");
            return (Criteria) this;
        }

        public Criteria andProducttypenoIsNotNull() {
            addCriterion("PRODUCTTypeNo is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypenoEqualTo(String value) {
            addCriterion("PRODUCTTypeNo =", value, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoNotEqualTo(String value) {
            addCriterion("PRODUCTTypeNo <>", value, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoGreaterThan(String value) {
            addCriterion("PRODUCTTypeNo >", value, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTTypeNo >=", value, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoLessThan(String value) {
            addCriterion("PRODUCTTypeNo <", value, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTTypeNo <=", value, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoLike(String value) {
            addCriterion("PRODUCTTypeNo like", value, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoNotLike(String value) {
            addCriterion("PRODUCTTypeNo not like", value, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoIn(List<String> values) {
            addCriterion("PRODUCTTypeNo in", values, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoNotIn(List<String> values) {
            addCriterion("PRODUCTTypeNo not in", values, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoBetween(String value1, String value2) {
            addCriterion("PRODUCTTypeNo between", value1, value2, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andProducttypenoNotBetween(String value1, String value2) {
            addCriterion("PRODUCTTypeNo not between", value1, value2, "producttypeno");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingIsNull() {
            addCriterion("IfOfficialNaming is null");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingIsNotNull() {
            addCriterion("IfOfficialNaming is not null");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingEqualTo(String value) {
            addCriterion("IfOfficialNaming =", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingNotEqualTo(String value) {
            addCriterion("IfOfficialNaming <>", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingGreaterThan(String value) {
            addCriterion("IfOfficialNaming >", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingGreaterThanOrEqualTo(String value) {
            addCriterion("IfOfficialNaming >=", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingLessThan(String value) {
            addCriterion("IfOfficialNaming <", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingLessThanOrEqualTo(String value) {
            addCriterion("IfOfficialNaming <=", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingLike(String value) {
            addCriterion("IfOfficialNaming like", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingNotLike(String value) {
            addCriterion("IfOfficialNaming not like", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingIn(List<String> values) {
            addCriterion("IfOfficialNaming in", values, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingNotIn(List<String> values) {
            addCriterion("IfOfficialNaming not in", values, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingBetween(String value1, String value2) {
            addCriterion("IfOfficialNaming between", value1, value2, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingNotBetween(String value1, String value2) {
            addCriterion("IfOfficialNaming not between", value1, value2, "ifofficialnaming");
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