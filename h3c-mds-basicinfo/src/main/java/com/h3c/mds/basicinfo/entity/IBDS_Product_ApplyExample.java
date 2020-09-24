package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_Product_ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_Product_ApplyExample() {
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

        public Criteria andPmIdIsNull() {
            addCriterion("PM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("PM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(String value) {
            addCriterion("PM_ID =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(String value) {
            addCriterion("PM_ID <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(String value) {
            addCriterion("PM_ID >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(String value) {
            addCriterion("PM_ID >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(String value) {
            addCriterion("PM_ID <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(String value) {
            addCriterion("PM_ID <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLike(String value) {
            addCriterion("PM_ID like", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotLike(String value) {
            addCriterion("PM_ID not like", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<String> values) {
            addCriterion("PM_ID in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<String> values) {
            addCriterion("PM_ID not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(String value1, String value2) {
            addCriterion("PM_ID between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(String value1, String value2) {
            addCriterion("PM_ID not between", value1, value2, "pmId");
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

        public Criteria andPdeIdIsNull() {
            addCriterion("PDE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPdeIdIsNotNull() {
            addCriterion("PDE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPdeIdEqualTo(String value) {
            addCriterion("PDE_ID =", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdNotEqualTo(String value) {
            addCriterion("PDE_ID <>", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdGreaterThan(String value) {
            addCriterion("PDE_ID >", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PDE_ID >=", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdLessThan(String value) {
            addCriterion("PDE_ID <", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdLessThanOrEqualTo(String value) {
            addCriterion("PDE_ID <=", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdLike(String value) {
            addCriterion("PDE_ID like", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdNotLike(String value) {
            addCriterion("PDE_ID not like", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdIn(List<String> values) {
            addCriterion("PDE_ID in", values, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdNotIn(List<String> values) {
            addCriterion("PDE_ID not in", values, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdBetween(String value1, String value2) {
            addCriterion("PDE_ID between", value1, value2, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdNotBetween(String value1, String value2) {
            addCriterion("PDE_ID not between", value1, value2, "pdeId");
            return (Criteria) this;
        }

        public Criteria andProductoldnoIsNull() {
            addCriterion("PRODUCTOldNo is null");
            return (Criteria) this;
        }

        public Criteria andProductoldnoIsNotNull() {
            addCriterion("PRODUCTOldNo is not null");
            return (Criteria) this;
        }

        public Criteria andProductoldnoEqualTo(String value) {
            addCriterion("PRODUCTOldNo =", value, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoNotEqualTo(String value) {
            addCriterion("PRODUCTOldNo <>", value, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoGreaterThan(String value) {
            addCriterion("PRODUCTOldNo >", value, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTOldNo >=", value, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoLessThan(String value) {
            addCriterion("PRODUCTOldNo <", value, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTOldNo <=", value, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoLike(String value) {
            addCriterion("PRODUCTOldNo like", value, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoNotLike(String value) {
            addCriterion("PRODUCTOldNo not like", value, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoIn(List<String> values) {
            addCriterion("PRODUCTOldNo in", values, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoNotIn(List<String> values) {
            addCriterion("PRODUCTOldNo not in", values, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoBetween(String value1, String value2) {
            addCriterion("PRODUCTOldNo between", value1, value2, "productoldno");
            return (Criteria) this;
        }

        public Criteria andProductoldnoNotBetween(String value1, String value2) {
            addCriterion("PRODUCTOldNo not between", value1, value2, "productoldno");
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

        public Criteria andEngproductoldIsNull() {
            addCriterion("engPRODUCTOld is null");
            return (Criteria) this;
        }

        public Criteria andEngproductoldIsNotNull() {
            addCriterion("engPRODUCTOld is not null");
            return (Criteria) this;
        }

        public Criteria andEngproductoldEqualTo(String value) {
            addCriterion("engPRODUCTOld =", value, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldNotEqualTo(String value) {
            addCriterion("engPRODUCTOld <>", value, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldGreaterThan(String value) {
            addCriterion("engPRODUCTOld >", value, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldGreaterThanOrEqualTo(String value) {
            addCriterion("engPRODUCTOld >=", value, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldLessThan(String value) {
            addCriterion("engPRODUCTOld <", value, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldLessThanOrEqualTo(String value) {
            addCriterion("engPRODUCTOld <=", value, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldLike(String value) {
            addCriterion("engPRODUCTOld like", value, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldNotLike(String value) {
            addCriterion("engPRODUCTOld not like", value, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldIn(List<String> values) {
            addCriterion("engPRODUCTOld in", values, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldNotIn(List<String> values) {
            addCriterion("engPRODUCTOld not in", values, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldBetween(String value1, String value2) {
            addCriterion("engPRODUCTOld between", value1, value2, "engproductold");
            return (Criteria) this;
        }

        public Criteria andEngproductoldNotBetween(String value1, String value2) {
            addCriterion("engPRODUCTOld not between", value1, value2, "engproductold");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeIsNull() {
            addCriterion("PRODUCTNameChange is null");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeIsNotNull() {
            addCriterion("PRODUCTNameChange is not null");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeEqualTo(String value) {
            addCriterion("PRODUCTNameChange =", value, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeNotEqualTo(String value) {
            addCriterion("PRODUCTNameChange <>", value, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeGreaterThan(String value) {
            addCriterion("PRODUCTNameChange >", value, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNameChange >=", value, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeLessThan(String value) {
            addCriterion("PRODUCTNameChange <", value, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNameChange <=", value, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeLike(String value) {
            addCriterion("PRODUCTNameChange like", value, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeNotLike(String value) {
            addCriterion("PRODUCTNameChange not like", value, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeIn(List<String> values) {
            addCriterion("PRODUCTNameChange in", values, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeNotIn(List<String> values) {
            addCriterion("PRODUCTNameChange not in", values, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeBetween(String value1, String value2) {
            addCriterion("PRODUCTNameChange between", value1, value2, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andProductnamechangeNotBetween(String value1, String value2) {
            addCriterion("PRODUCTNameChange not between", value1, value2, "productnamechange");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowIsNull() {
            addCriterion("IfDelBelow is null");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowIsNotNull() {
            addCriterion("IfDelBelow is not null");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowEqualTo(String value) {
            addCriterion("IfDelBelow =", value, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowNotEqualTo(String value) {
            addCriterion("IfDelBelow <>", value, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowGreaterThan(String value) {
            addCriterion("IfDelBelow >", value, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowGreaterThanOrEqualTo(String value) {
            addCriterion("IfDelBelow >=", value, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowLessThan(String value) {
            addCriterion("IfDelBelow <", value, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowLessThanOrEqualTo(String value) {
            addCriterion("IfDelBelow <=", value, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowLike(String value) {
            addCriterion("IfDelBelow like", value, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowNotLike(String value) {
            addCriterion("IfDelBelow not like", value, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowIn(List<String> values) {
            addCriterion("IfDelBelow in", values, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowNotIn(List<String> values) {
            addCriterion("IfDelBelow not in", values, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowBetween(String value1, String value2) {
            addCriterion("IfDelBelow between", value1, value2, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andIfdelbelowNotBetween(String value1, String value2) {
            addCriterion("IfDelBelow not between", value1, value2, "ifdelbelow");
            return (Criteria) this;
        }

        public Criteria andAppytypeIsNull() {
            addCriterion("AppyType is null");
            return (Criteria) this;
        }

        public Criteria andAppytypeIsNotNull() {
            addCriterion("AppyType is not null");
            return (Criteria) this;
        }

        public Criteria andAppytypeEqualTo(String value) {
            addCriterion("AppyType =", value, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeNotEqualTo(String value) {
            addCriterion("AppyType <>", value, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeGreaterThan(String value) {
            addCriterion("AppyType >", value, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeGreaterThanOrEqualTo(String value) {
            addCriterion("AppyType >=", value, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeLessThan(String value) {
            addCriterion("AppyType <", value, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeLessThanOrEqualTo(String value) {
            addCriterion("AppyType <=", value, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeLike(String value) {
            addCriterion("AppyType like", value, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeNotLike(String value) {
            addCriterion("AppyType not like", value, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeIn(List<String> values) {
            addCriterion("AppyType in", values, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeNotIn(List<String> values) {
            addCriterion("AppyType not in", values, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeBetween(String value1, String value2) {
            addCriterion("AppyType between", value1, value2, "appytype");
            return (Criteria) this;
        }

        public Criteria andAppytypeNotBetween(String value1, String value2) {
            addCriterion("AppyType not between", value1, value2, "appytype");
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