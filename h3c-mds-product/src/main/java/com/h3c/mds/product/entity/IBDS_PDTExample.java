package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_PDTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_PDTExample() {
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
            addCriterion("engPDT is null");
            return (Criteria) this;
        }

        public Criteria andEngpdtIsNotNull() {
            addCriterion("engPDT is not null");
            return (Criteria) this;
        }

        public Criteria andEngpdtEqualTo(String value) {
            addCriterion("engPDT =", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtNotEqualTo(String value) {
            addCriterion("engPDT <>", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtGreaterThan(String value) {
            addCriterion("engPDT >", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtGreaterThanOrEqualTo(String value) {
            addCriterion("engPDT >=", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtLessThan(String value) {
            addCriterion("engPDT <", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtLessThanOrEqualTo(String value) {
            addCriterion("engPDT <=", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtLike(String value) {
            addCriterion("engPDT like", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtNotLike(String value) {
            addCriterion("engPDT not like", value, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtIn(List<String> values) {
            addCriterion("engPDT in", values, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtNotIn(List<String> values) {
            addCriterion("engPDT not in", values, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtBetween(String value1, String value2) {
            addCriterion("engPDT between", value1, value2, "engpdt");
            return (Criteria) this;
        }

        public Criteria andEngpdtNotBetween(String value1, String value2) {
            addCriterion("engPDT not between", value1, value2, "engpdt");
            return (Criteria) this;
        }

        public Criteria andPdtoldIsNull() {
            addCriterion("PDTOld is null");
            return (Criteria) this;
        }

        public Criteria andPdtoldIsNotNull() {
            addCriterion("PDTOld is not null");
            return (Criteria) this;
        }

        public Criteria andPdtoldEqualTo(String value) {
            addCriterion("PDTOld =", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldNotEqualTo(String value) {
            addCriterion("PDTOld <>", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldGreaterThan(String value) {
            addCriterion("PDTOld >", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldGreaterThanOrEqualTo(String value) {
            addCriterion("PDTOld >=", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldLessThan(String value) {
            addCriterion("PDTOld <", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldLessThanOrEqualTo(String value) {
            addCriterion("PDTOld <=", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldLike(String value) {
            addCriterion("PDTOld like", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldNotLike(String value) {
            addCriterion("PDTOld not like", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldIn(List<String> values) {
            addCriterion("PDTOld in", values, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldNotIn(List<String> values) {
            addCriterion("PDTOld not in", values, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldBetween(String value1, String value2) {
            addCriterion("PDTOld between", value1, value2, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldNotBetween(String value1, String value2) {
            addCriterion("PDTOld not between", value1, value2, "pdtold");
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

        public Criteria andPdtManagerIsNull() {
            addCriterion("PDT_Manager is null");
            return (Criteria) this;
        }

        public Criteria andPdtManagerIsNotNull() {
            addCriterion("PDT_Manager is not null");
            return (Criteria) this;
        }

        public Criteria andPdtManagerEqualTo(String value) {
            addCriterion("PDT_Manager =", value, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerNotEqualTo(String value) {
            addCriterion("PDT_Manager <>", value, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerGreaterThan(String value) {
            addCriterion("PDT_Manager >", value, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_Manager >=", value, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerLessThan(String value) {
            addCriterion("PDT_Manager <", value, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerLessThanOrEqualTo(String value) {
            addCriterion("PDT_Manager <=", value, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerLike(String value) {
            addCriterion("PDT_Manager like", value, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerNotLike(String value) {
            addCriterion("PDT_Manager not like", value, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerIn(List<String> values) {
            addCriterion("PDT_Manager in", values, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerNotIn(List<String> values) {
            addCriterion("PDT_Manager not in", values, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerBetween(String value1, String value2) {
            addCriterion("PDT_Manager between", value1, value2, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andPdtManagerNotBetween(String value1, String value2) {
            addCriterion("PDT_Manager not between", value1, value2, "pdtManager");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdIsNull() {
            addCriterion("CMJKR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdIsNotNull() {
            addCriterion("CMJKR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdEqualTo(String value) {
            addCriterion("CMJKR_ID =", value, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdNotEqualTo(String value) {
            addCriterion("CMJKR_ID <>", value, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdGreaterThan(String value) {
            addCriterion("CMJKR_ID >", value, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdGreaterThanOrEqualTo(String value) {
            addCriterion("CMJKR_ID >=", value, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdLessThan(String value) {
            addCriterion("CMJKR_ID <", value, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdLessThanOrEqualTo(String value) {
            addCriterion("CMJKR_ID <=", value, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdLike(String value) {
            addCriterion("CMJKR_ID like", value, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdNotLike(String value) {
            addCriterion("CMJKR_ID not like", value, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdIn(List<String> values) {
            addCriterion("CMJKR_ID in", values, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdNotIn(List<String> values) {
            addCriterion("CMJKR_ID not in", values, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdBetween(String value1, String value2) {
            addCriterion("CMJKR_ID between", value1, value2, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andCmjkrIdNotBetween(String value1, String value2) {
            addCriterion("CMJKR_ID not between", value1, value2, "cmjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdIsNull() {
            addCriterion("SCJKR_ID is null");
            return (Criteria) this;
        }

        public Criteria andScjkrIdIsNotNull() {
            addCriterion("SCJKR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScjkrIdEqualTo(String value) {
            addCriterion("SCJKR_ID =", value, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdNotEqualTo(String value) {
            addCriterion("SCJKR_ID <>", value, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdGreaterThan(String value) {
            addCriterion("SCJKR_ID >", value, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCJKR_ID >=", value, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdLessThan(String value) {
            addCriterion("SCJKR_ID <", value, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdLessThanOrEqualTo(String value) {
            addCriterion("SCJKR_ID <=", value, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdLike(String value) {
            addCriterion("SCJKR_ID like", value, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdNotLike(String value) {
            addCriterion("SCJKR_ID not like", value, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdIn(List<String> values) {
            addCriterion("SCJKR_ID in", values, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdNotIn(List<String> values) {
            addCriterion("SCJKR_ID not in", values, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdBetween(String value1, String value2) {
            addCriterion("SCJKR_ID between", value1, value2, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andScjkrIdNotBetween(String value1, String value2) {
            addCriterion("SCJKR_ID not between", value1, value2, "scjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdIsNull() {
            addCriterion("HCJKR_ID is null");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdIsNotNull() {
            addCriterion("HCJKR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdEqualTo(String value) {
            addCriterion("HCJKR_ID =", value, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdNotEqualTo(String value) {
            addCriterion("HCJKR_ID <>", value, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdGreaterThan(String value) {
            addCriterion("HCJKR_ID >", value, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdGreaterThanOrEqualTo(String value) {
            addCriterion("HCJKR_ID >=", value, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdLessThan(String value) {
            addCriterion("HCJKR_ID <", value, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdLessThanOrEqualTo(String value) {
            addCriterion("HCJKR_ID <=", value, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdLike(String value) {
            addCriterion("HCJKR_ID like", value, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdNotLike(String value) {
            addCriterion("HCJKR_ID not like", value, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdIn(List<String> values) {
            addCriterion("HCJKR_ID in", values, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdNotIn(List<String> values) {
            addCriterion("HCJKR_ID not in", values, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdBetween(String value1, String value2) {
            addCriterion("HCJKR_ID between", value1, value2, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andHcjkrIdNotBetween(String value1, String value2) {
            addCriterion("HCJKR_ID not between", value1, value2, "hcjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdIsNull() {
            addCriterion("AbroadJKR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdIsNotNull() {
            addCriterion("AbroadJKR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdEqualTo(String value) {
            addCriterion("AbroadJKR_ID =", value, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdNotEqualTo(String value) {
            addCriterion("AbroadJKR_ID <>", value, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdGreaterThan(String value) {
            addCriterion("AbroadJKR_ID >", value, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdGreaterThanOrEqualTo(String value) {
            addCriterion("AbroadJKR_ID >=", value, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdLessThan(String value) {
            addCriterion("AbroadJKR_ID <", value, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdLessThanOrEqualTo(String value) {
            addCriterion("AbroadJKR_ID <=", value, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdLike(String value) {
            addCriterion("AbroadJKR_ID like", value, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdNotLike(String value) {
            addCriterion("AbroadJKR_ID not like", value, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdIn(List<String> values) {
            addCriterion("AbroadJKR_ID in", values, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdNotIn(List<String> values) {
            addCriterion("AbroadJKR_ID not in", values, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdBetween(String value1, String value2) {
            addCriterion("AbroadJKR_ID between", value1, value2, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andAbroadjkrIdNotBetween(String value1, String value2) {
            addCriterion("AbroadJKR_ID not between", value1, value2, "abroadjkrId");
            return (Criteria) this;
        }

        public Criteria andOrderdecomIsNull() {
            addCriterion("OrderDecom is null");
            return (Criteria) this;
        }

        public Criteria andOrderdecomIsNotNull() {
            addCriterion("OrderDecom is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdecomEqualTo(String value) {
            addCriterion("OrderDecom =", value, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomNotEqualTo(String value) {
            addCriterion("OrderDecom <>", value, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomGreaterThan(String value) {
            addCriterion("OrderDecom >", value, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomGreaterThanOrEqualTo(String value) {
            addCriterion("OrderDecom >=", value, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomLessThan(String value) {
            addCriterion("OrderDecom <", value, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomLessThanOrEqualTo(String value) {
            addCriterion("OrderDecom <=", value, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomLike(String value) {
            addCriterion("OrderDecom like", value, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomNotLike(String value) {
            addCriterion("OrderDecom not like", value, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomIn(List<String> values) {
            addCriterion("OrderDecom in", values, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomNotIn(List<String> values) {
            addCriterion("OrderDecom not in", values, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomBetween(String value1, String value2) {
            addCriterion("OrderDecom between", value1, value2, "orderdecom");
            return (Criteria) this;
        }

        public Criteria andOrderdecomNotBetween(String value1, String value2) {
            addCriterion("OrderDecom not between", value1, value2, "orderdecom");
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

        public Criteria andPdtGroupIsNull() {
            addCriterion("PDT_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPdtGroupIsNotNull() {
            addCriterion("PDT_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPdtGroupEqualTo(String value) {
            addCriterion("PDT_GROUP =", value, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupNotEqualTo(String value) {
            addCriterion("PDT_GROUP <>", value, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupGreaterThan(String value) {
            addCriterion("PDT_GROUP >", value, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_GROUP >=", value, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupLessThan(String value) {
            addCriterion("PDT_GROUP <", value, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupLessThanOrEqualTo(String value) {
            addCriterion("PDT_GROUP <=", value, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupLike(String value) {
            addCriterion("PDT_GROUP like", value, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupNotLike(String value) {
            addCriterion("PDT_GROUP not like", value, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupIn(List<String> values) {
            addCriterion("PDT_GROUP in", values, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupNotIn(List<String> values) {
            addCriterion("PDT_GROUP not in", values, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupBetween(String value1, String value2) {
            addCriterion("PDT_GROUP between", value1, value2, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andPdtGroupNotBetween(String value1, String value2) {
            addCriterion("PDT_GROUP not between", value1, value2, "pdtGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupIsNull() {
            addCriterion("RND_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andRndGroupIsNotNull() {
            addCriterion("RND_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andRndGroupEqualTo(String value) {
            addCriterion("RND_GROUP =", value, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupNotEqualTo(String value) {
            addCriterion("RND_GROUP <>", value, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupGreaterThan(String value) {
            addCriterion("RND_GROUP >", value, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupGreaterThanOrEqualTo(String value) {
            addCriterion("RND_GROUP >=", value, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupLessThan(String value) {
            addCriterion("RND_GROUP <", value, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupLessThanOrEqualTo(String value) {
            addCriterion("RND_GROUP <=", value, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupLike(String value) {
            addCriterion("RND_GROUP like", value, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupNotLike(String value) {
            addCriterion("RND_GROUP not like", value, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupIn(List<String> values) {
            addCriterion("RND_GROUP in", values, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupNotIn(List<String> values) {
            addCriterion("RND_GROUP not in", values, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupBetween(String value1, String value2) {
            addCriterion("RND_GROUP between", value1, value2, "rndGroup");
            return (Criteria) this;
        }

        public Criteria andRndGroupNotBetween(String value1, String value2) {
            addCriterion("RND_GROUP not between", value1, value2, "rndGroup");
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

        public Criteria andLpdtIdIsNull() {
            addCriterion("LPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLpdtIdIsNotNull() {
            addCriterion("LPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLpdtIdEqualTo(String value) {
            addCriterion("LPDT_ID =", value, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdNotEqualTo(String value) {
            addCriterion("LPDT_ID <>", value, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdGreaterThan(String value) {
            addCriterion("LPDT_ID >", value, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("LPDT_ID >=", value, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdLessThan(String value) {
            addCriterion("LPDT_ID <", value, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdLessThanOrEqualTo(String value) {
            addCriterion("LPDT_ID <=", value, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdLike(String value) {
            addCriterion("LPDT_ID like", value, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdNotLike(String value) {
            addCriterion("LPDT_ID not like", value, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdIn(List<String> values) {
            addCriterion("LPDT_ID in", values, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdNotIn(List<String> values) {
            addCriterion("LPDT_ID not in", values, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdBetween(String value1, String value2) {
            addCriterion("LPDT_ID between", value1, value2, "lpdtId");
            return (Criteria) this;
        }

        public Criteria andLpdtIdNotBetween(String value1, String value2) {
            addCriterion("LPDT_ID not between", value1, value2, "lpdtId");
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

        public Criteria andMktpdtIdIsNull() {
            addCriterion("MKTPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdIsNotNull() {
            addCriterion("MKTPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdEqualTo(String value) {
            addCriterion("MKTPDT_ID =", value, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdNotEqualTo(String value) {
            addCriterion("MKTPDT_ID <>", value, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdGreaterThan(String value) {
            addCriterion("MKTPDT_ID >", value, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("MKTPDT_ID >=", value, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdLessThan(String value) {
            addCriterion("MKTPDT_ID <", value, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdLessThanOrEqualTo(String value) {
            addCriterion("MKTPDT_ID <=", value, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdLike(String value) {
            addCriterion("MKTPDT_ID like", value, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdNotLike(String value) {
            addCriterion("MKTPDT_ID not like", value, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdIn(List<String> values) {
            addCriterion("MKTPDT_ID in", values, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdNotIn(List<String> values) {
            addCriterion("MKTPDT_ID not in", values, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdBetween(String value1, String value2) {
            addCriterion("MKTPDT_ID between", value1, value2, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andMktpdtIdNotBetween(String value1, String value2) {
            addCriterion("MKTPDT_ID not between", value1, value2, "mktpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdIsNull() {
            addCriterion("FINPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdIsNotNull() {
            addCriterion("FINPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdEqualTo(String value) {
            addCriterion("FINPDT_ID =", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdNotEqualTo(String value) {
            addCriterion("FINPDT_ID <>", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdGreaterThan(String value) {
            addCriterion("FINPDT_ID >", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("FINPDT_ID >=", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdLessThan(String value) {
            addCriterion("FINPDT_ID <", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdLessThanOrEqualTo(String value) {
            addCriterion("FINPDT_ID <=", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdLike(String value) {
            addCriterion("FINPDT_ID like", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdNotLike(String value) {
            addCriterion("FINPDT_ID not like", value, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdIn(List<String> values) {
            addCriterion("FINPDT_ID in", values, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdNotIn(List<String> values) {
            addCriterion("FINPDT_ID not in", values, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdBetween(String value1, String value2) {
            addCriterion("FINPDT_ID between", value1, value2, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andFinpdtIdNotBetween(String value1, String value2) {
            addCriterion("FINPDT_ID not between", value1, value2, "finpdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdIsNull() {
            addCriterion("PROPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPropdtIdIsNotNull() {
            addCriterion("PROPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPropdtIdEqualTo(String value) {
            addCriterion("PROPDT_ID =", value, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdNotEqualTo(String value) {
            addCriterion("PROPDT_ID <>", value, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdGreaterThan(String value) {
            addCriterion("PROPDT_ID >", value, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROPDT_ID >=", value, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdLessThan(String value) {
            addCriterion("PROPDT_ID <", value, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdLessThanOrEqualTo(String value) {
            addCriterion("PROPDT_ID <=", value, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdLike(String value) {
            addCriterion("PROPDT_ID like", value, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdNotLike(String value) {
            addCriterion("PROPDT_ID not like", value, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdIn(List<String> values) {
            addCriterion("PROPDT_ID in", values, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdNotIn(List<String> values) {
            addCriterion("PROPDT_ID not in", values, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdBetween(String value1, String value2) {
            addCriterion("PROPDT_ID between", value1, value2, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPropdtIdNotBetween(String value1, String value2) {
            addCriterion("PROPDT_ID not between", value1, value2, "propdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdIsNull() {
            addCriterion("PPPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPppdtIdIsNotNull() {
            addCriterion("PPPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPppdtIdEqualTo(String value) {
            addCriterion("PPPDT_ID =", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdNotEqualTo(String value) {
            addCriterion("PPPDT_ID <>", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdGreaterThan(String value) {
            addCriterion("PPPDT_ID >", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("PPPDT_ID >=", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdLessThan(String value) {
            addCriterion("PPPDT_ID <", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdLessThanOrEqualTo(String value) {
            addCriterion("PPPDT_ID <=", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdLike(String value) {
            addCriterion("PPPDT_ID like", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdNotLike(String value) {
            addCriterion("PPPDT_ID not like", value, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdIn(List<String> values) {
            addCriterion("PPPDT_ID in", values, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdNotIn(List<String> values) {
            addCriterion("PPPDT_ID not in", values, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdBetween(String value1, String value2) {
            addCriterion("PPPDT_ID between", value1, value2, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andPppdtIdNotBetween(String value1, String value2) {
            addCriterion("PPPDT_ID not between", value1, value2, "pppdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdIsNull() {
            addCriterion("MFGPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdIsNotNull() {
            addCriterion("MFGPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdEqualTo(String value) {
            addCriterion("MFGPDT_ID =", value, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdNotEqualTo(String value) {
            addCriterion("MFGPDT_ID <>", value, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdGreaterThan(String value) {
            addCriterion("MFGPDT_ID >", value, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("MFGPDT_ID >=", value, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdLessThan(String value) {
            addCriterion("MFGPDT_ID <", value, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdLessThanOrEqualTo(String value) {
            addCriterion("MFGPDT_ID <=", value, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdLike(String value) {
            addCriterion("MFGPDT_ID like", value, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdNotLike(String value) {
            addCriterion("MFGPDT_ID not like", value, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdIn(List<String> values) {
            addCriterion("MFGPDT_ID in", values, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdNotIn(List<String> values) {
            addCriterion("MFGPDT_ID not in", values, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdBetween(String value1, String value2) {
            addCriterion("MFGPDT_ID between", value1, value2, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andMfgpdtIdNotBetween(String value1, String value2) {
            addCriterion("MFGPDT_ID not between", value1, value2, "mfgpdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdIsNull() {
            addCriterion("TSPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTspdtIdIsNotNull() {
            addCriterion("TSPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTspdtIdEqualTo(String value) {
            addCriterion("TSPDT_ID =", value, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdNotEqualTo(String value) {
            addCriterion("TSPDT_ID <>", value, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdGreaterThan(String value) {
            addCriterion("TSPDT_ID >", value, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("TSPDT_ID >=", value, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdLessThan(String value) {
            addCriterion("TSPDT_ID <", value, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdLessThanOrEqualTo(String value) {
            addCriterion("TSPDT_ID <=", value, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdLike(String value) {
            addCriterion("TSPDT_ID like", value, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdNotLike(String value) {
            addCriterion("TSPDT_ID not like", value, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdIn(List<String> values) {
            addCriterion("TSPDT_ID in", values, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdNotIn(List<String> values) {
            addCriterion("TSPDT_ID not in", values, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdBetween(String value1, String value2) {
            addCriterion("TSPDT_ID between", value1, value2, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andTspdtIdNotBetween(String value1, String value2) {
            addCriterion("TSPDT_ID not between", value1, value2, "tspdtId");
            return (Criteria) this;
        }

        public Criteria andPqaIdIsNull() {
            addCriterion("PQA_ID is null");
            return (Criteria) this;
        }

        public Criteria andPqaIdIsNotNull() {
            addCriterion("PQA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPqaIdEqualTo(String value) {
            addCriterion("PQA_ID =", value, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdNotEqualTo(String value) {
            addCriterion("PQA_ID <>", value, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdGreaterThan(String value) {
            addCriterion("PQA_ID >", value, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdGreaterThanOrEqualTo(String value) {
            addCriterion("PQA_ID >=", value, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdLessThan(String value) {
            addCriterion("PQA_ID <", value, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdLessThanOrEqualTo(String value) {
            addCriterion("PQA_ID <=", value, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdLike(String value) {
            addCriterion("PQA_ID like", value, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdNotLike(String value) {
            addCriterion("PQA_ID not like", value, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdIn(List<String> values) {
            addCriterion("PQA_ID in", values, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdNotIn(List<String> values) {
            addCriterion("PQA_ID not in", values, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdBetween(String value1, String value2) {
            addCriterion("PQA_ID between", value1, value2, "pqaId");
            return (Criteria) this;
        }

        public Criteria andPqaIdNotBetween(String value1, String value2) {
            addCriterion("PQA_ID not between", value1, value2, "pqaId");
            return (Criteria) this;
        }

        public Criteria andTeIdIsNull() {
            addCriterion("TE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeIdIsNotNull() {
            addCriterion("TE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeIdEqualTo(String value) {
            addCriterion("TE_ID =", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotEqualTo(String value) {
            addCriterion("TE_ID <>", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdGreaterThan(String value) {
            addCriterion("TE_ID >", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TE_ID >=", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLessThan(String value) {
            addCriterion("TE_ID <", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLessThanOrEqualTo(String value) {
            addCriterion("TE_ID <=", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLike(String value) {
            addCriterion("TE_ID like", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotLike(String value) {
            addCriterion("TE_ID not like", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdIn(List<String> values) {
            addCriterion("TE_ID in", values, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotIn(List<String> values) {
            addCriterion("TE_ID not in", values, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdBetween(String value1, String value2) {
            addCriterion("TE_ID between", value1, value2, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotBetween(String value1, String value2) {
            addCriterion("TE_ID not between", value1, value2, "teId");
            return (Criteria) this;
        }

        public Criteria andTdIdIsNull() {
            addCriterion("TD_ID is null");
            return (Criteria) this;
        }

        public Criteria andTdIdIsNotNull() {
            addCriterion("TD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTdIdEqualTo(String value) {
            addCriterion("TD_ID =", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotEqualTo(String value) {
            addCriterion("TD_ID <>", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdGreaterThan(String value) {
            addCriterion("TD_ID >", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdGreaterThanOrEqualTo(String value) {
            addCriterion("TD_ID >=", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdLessThan(String value) {
            addCriterion("TD_ID <", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdLessThanOrEqualTo(String value) {
            addCriterion("TD_ID <=", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdLike(String value) {
            addCriterion("TD_ID like", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotLike(String value) {
            addCriterion("TD_ID not like", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdIn(List<String> values) {
            addCriterion("TD_ID in", values, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotIn(List<String> values) {
            addCriterion("TD_ID not in", values, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdBetween(String value1, String value2) {
            addCriterion("TD_ID between", value1, value2, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotBetween(String value1, String value2) {
            addCriterion("TD_ID not between", value1, value2, "tdId");
            return (Criteria) this;
        }

        public Criteria andFaIdIsNull() {
            addCriterion("FA_ID is null");
            return (Criteria) this;
        }

        public Criteria andFaIdIsNotNull() {
            addCriterion("FA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFaIdEqualTo(String value) {
            addCriterion("FA_ID =", value, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdNotEqualTo(String value) {
            addCriterion("FA_ID <>", value, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdGreaterThan(String value) {
            addCriterion("FA_ID >", value, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdGreaterThanOrEqualTo(String value) {
            addCriterion("FA_ID >=", value, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdLessThan(String value) {
            addCriterion("FA_ID <", value, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdLessThanOrEqualTo(String value) {
            addCriterion("FA_ID <=", value, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdLike(String value) {
            addCriterion("FA_ID like", value, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdNotLike(String value) {
            addCriterion("FA_ID not like", value, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdIn(List<String> values) {
            addCriterion("FA_ID in", values, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdNotIn(List<String> values) {
            addCriterion("FA_ID not in", values, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdBetween(String value1, String value2) {
            addCriterion("FA_ID between", value1, value2, "faId");
            return (Criteria) this;
        }

        public Criteria andFaIdNotBetween(String value1, String value2) {
            addCriterion("FA_ID not between", value1, value2, "faId");
            return (Criteria) this;
        }

        public Criteria andSeIdIsNull() {
            addCriterion("SE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeIdIsNotNull() {
            addCriterion("SE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeIdEqualTo(String value) {
            addCriterion("SE_ID =", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotEqualTo(String value) {
            addCriterion("SE_ID <>", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThan(String value) {
            addCriterion("SE_ID >", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SE_ID >=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThan(String value) {
            addCriterion("SE_ID <", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThanOrEqualTo(String value) {
            addCriterion("SE_ID <=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLike(String value) {
            addCriterion("SE_ID like", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotLike(String value) {
            addCriterion("SE_ID not like", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdIn(List<String> values) {
            addCriterion("SE_ID in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotIn(List<String> values) {
            addCriterion("SE_ID not in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdBetween(String value1, String value2) {
            addCriterion("SE_ID between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotBetween(String value1, String value2) {
            addCriterion("SE_ID not between", value1, value2, "seId");
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

        public Criteria andNmjkrIdIsNull() {
            addCriterion("NMJKR_ID is null");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdIsNotNull() {
            addCriterion("NMJKR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdEqualTo(String value) {
            addCriterion("NMJKR_ID =", value, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdNotEqualTo(String value) {
            addCriterion("NMJKR_ID <>", value, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdGreaterThan(String value) {
            addCriterion("NMJKR_ID >", value, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdGreaterThanOrEqualTo(String value) {
            addCriterion("NMJKR_ID >=", value, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdLessThan(String value) {
            addCriterion("NMJKR_ID <", value, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdLessThanOrEqualTo(String value) {
            addCriterion("NMJKR_ID <=", value, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdLike(String value) {
            addCriterion("NMJKR_ID like", value, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdNotLike(String value) {
            addCriterion("NMJKR_ID not like", value, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdIn(List<String> values) {
            addCriterion("NMJKR_ID in", values, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdNotIn(List<String> values) {
            addCriterion("NMJKR_ID not in", values, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdBetween(String value1, String value2) {
            addCriterion("NMJKR_ID between", value1, value2, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andNmjkrIdNotBetween(String value1, String value2) {
            addCriterion("NMJKR_ID not between", value1, value2, "nmjkrId");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerIsNull() {
            addCriterion("SOFTWARE_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerIsNotNull() {
            addCriterion("SOFTWARE_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerEqualTo(String value) {
            addCriterion("SOFTWARE_MANAGER =", value, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerNotEqualTo(String value) {
            addCriterion("SOFTWARE_MANAGER <>", value, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerGreaterThan(String value) {
            addCriterion("SOFTWARE_MANAGER >", value, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTWARE_MANAGER >=", value, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerLessThan(String value) {
            addCriterion("SOFTWARE_MANAGER <", value, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerLessThanOrEqualTo(String value) {
            addCriterion("SOFTWARE_MANAGER <=", value, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerLike(String value) {
            addCriterion("SOFTWARE_MANAGER like", value, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerNotLike(String value) {
            addCriterion("SOFTWARE_MANAGER not like", value, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerIn(List<String> values) {
            addCriterion("SOFTWARE_MANAGER in", values, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerNotIn(List<String> values) {
            addCriterion("SOFTWARE_MANAGER not in", values, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerBetween(String value1, String value2) {
            addCriterion("SOFTWARE_MANAGER between", value1, value2, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareManagerNotBetween(String value1, String value2) {
            addCriterion("SOFTWARE_MANAGER not between", value1, value2, "softwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerIsNull() {
            addCriterion("HARDWARE_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerIsNotNull() {
            addCriterion("HARDWARE_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerEqualTo(String value) {
            addCriterion("HARDWARE_MANAGER =", value, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerNotEqualTo(String value) {
            addCriterion("HARDWARE_MANAGER <>", value, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerGreaterThan(String value) {
            addCriterion("HARDWARE_MANAGER >", value, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerGreaterThanOrEqualTo(String value) {
            addCriterion("HARDWARE_MANAGER >=", value, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerLessThan(String value) {
            addCriterion("HARDWARE_MANAGER <", value, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerLessThanOrEqualTo(String value) {
            addCriterion("HARDWARE_MANAGER <=", value, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerLike(String value) {
            addCriterion("HARDWARE_MANAGER like", value, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerNotLike(String value) {
            addCriterion("HARDWARE_MANAGER not like", value, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerIn(List<String> values) {
            addCriterion("HARDWARE_MANAGER in", values, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerNotIn(List<String> values) {
            addCriterion("HARDWARE_MANAGER not in", values, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerBetween(String value1, String value2) {
            addCriterion("HARDWARE_MANAGER between", value1, value2, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andHardwareManagerNotBetween(String value1, String value2) {
            addCriterion("HARDWARE_MANAGER not between", value1, value2, "hardwareManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerIsNull() {
            addCriterion("EQUIPMENT_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerIsNotNull() {
            addCriterion("EQUIPMENT_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerEqualTo(String value) {
            addCriterion("EQUIPMENT_MANAGER =", value, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerNotEqualTo(String value) {
            addCriterion("EQUIPMENT_MANAGER <>", value, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerGreaterThan(String value) {
            addCriterion("EQUIPMENT_MANAGER >", value, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_MANAGER >=", value, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerLessThan(String value) {
            addCriterion("EQUIPMENT_MANAGER <", value, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_MANAGER <=", value, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerLike(String value) {
            addCriterion("EQUIPMENT_MANAGER like", value, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerNotLike(String value) {
            addCriterion("EQUIPMENT_MANAGER not like", value, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerIn(List<String> values) {
            addCriterion("EQUIPMENT_MANAGER in", values, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerNotIn(List<String> values) {
            addCriterion("EQUIPMENT_MANAGER not in", values, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_MANAGER between", value1, value2, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andEquipmentManagerNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_MANAGER not between", value1, value2, "equipmentManager");
            return (Criteria) this;
        }

        public Criteria andSqaIdIsNull() {
            addCriterion("SQA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqaIdIsNotNull() {
            addCriterion("SQA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqaIdEqualTo(String value) {
            addCriterion("SQA_ID =", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdNotEqualTo(String value) {
            addCriterion("SQA_ID <>", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdGreaterThan(String value) {
            addCriterion("SQA_ID >", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdGreaterThanOrEqualTo(String value) {
            addCriterion("SQA_ID >=", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdLessThan(String value) {
            addCriterion("SQA_ID <", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdLessThanOrEqualTo(String value) {
            addCriterion("SQA_ID <=", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdLike(String value) {
            addCriterion("SQA_ID like", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdNotLike(String value) {
            addCriterion("SQA_ID not like", value, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdIn(List<String> values) {
            addCriterion("SQA_ID in", values, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdNotIn(List<String> values) {
            addCriterion("SQA_ID not in", values, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdBetween(String value1, String value2) {
            addCriterion("SQA_ID between", value1, value2, "sqaId");
            return (Criteria) this;
        }

        public Criteria andSqaIdNotBetween(String value1, String value2) {
            addCriterion("SQA_ID not between", value1, value2, "sqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdIsNull() {
            addCriterion("HQA_ID is null");
            return (Criteria) this;
        }

        public Criteria andHqaIdIsNotNull() {
            addCriterion("HQA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHqaIdEqualTo(String value) {
            addCriterion("HQA_ID =", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdNotEqualTo(String value) {
            addCriterion("HQA_ID <>", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdGreaterThan(String value) {
            addCriterion("HQA_ID >", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdGreaterThanOrEqualTo(String value) {
            addCriterion("HQA_ID >=", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdLessThan(String value) {
            addCriterion("HQA_ID <", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdLessThanOrEqualTo(String value) {
            addCriterion("HQA_ID <=", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdLike(String value) {
            addCriterion("HQA_ID like", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdNotLike(String value) {
            addCriterion("HQA_ID not like", value, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdIn(List<String> values) {
            addCriterion("HQA_ID in", values, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdNotIn(List<String> values) {
            addCriterion("HQA_ID not in", values, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdBetween(String value1, String value2) {
            addCriterion("HQA_ID between", value1, value2, "hqaId");
            return (Criteria) this;
        }

        public Criteria andHqaIdNotBetween(String value1, String value2) {
            addCriterion("HQA_ID not between", value1, value2, "hqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdIsNull() {
            addCriterion("TQA_ID is null");
            return (Criteria) this;
        }

        public Criteria andTqaIdIsNotNull() {
            addCriterion("TQA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTqaIdEqualTo(String value) {
            addCriterion("TQA_ID =", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdNotEqualTo(String value) {
            addCriterion("TQA_ID <>", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdGreaterThan(String value) {
            addCriterion("TQA_ID >", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdGreaterThanOrEqualTo(String value) {
            addCriterion("TQA_ID >=", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdLessThan(String value) {
            addCriterion("TQA_ID <", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdLessThanOrEqualTo(String value) {
            addCriterion("TQA_ID <=", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdLike(String value) {
            addCriterion("TQA_ID like", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdNotLike(String value) {
            addCriterion("TQA_ID not like", value, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdIn(List<String> values) {
            addCriterion("TQA_ID in", values, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdNotIn(List<String> values) {
            addCriterion("TQA_ID not in", values, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdBetween(String value1, String value2) {
            addCriterion("TQA_ID between", value1, value2, "tqaId");
            return (Criteria) this;
        }

        public Criteria andTqaIdNotBetween(String value1, String value2) {
            addCriterion("TQA_ID not between", value1, value2, "tqaId");
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

        public Criteria andSoftwareTestManagerIsNull() {
            addCriterion("SOFTWARE_TEST_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerIsNotNull() {
            addCriterion("SOFTWARE_TEST_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerEqualTo(String value) {
            addCriterion("SOFTWARE_TEST_MANAGER =", value, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerNotEqualTo(String value) {
            addCriterion("SOFTWARE_TEST_MANAGER <>", value, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerGreaterThan(String value) {
            addCriterion("SOFTWARE_TEST_MANAGER >", value, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTWARE_TEST_MANAGER >=", value, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerLessThan(String value) {
            addCriterion("SOFTWARE_TEST_MANAGER <", value, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerLessThanOrEqualTo(String value) {
            addCriterion("SOFTWARE_TEST_MANAGER <=", value, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerLike(String value) {
            addCriterion("SOFTWARE_TEST_MANAGER like", value, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerNotLike(String value) {
            addCriterion("SOFTWARE_TEST_MANAGER not like", value, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerIn(List<String> values) {
            addCriterion("SOFTWARE_TEST_MANAGER in", values, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerNotIn(List<String> values) {
            addCriterion("SOFTWARE_TEST_MANAGER not in", values, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerBetween(String value1, String value2) {
            addCriterion("SOFTWARE_TEST_MANAGER between", value1, value2, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andSoftwareTestManagerNotBetween(String value1, String value2) {
            addCriterion("SOFTWARE_TEST_MANAGER not between", value1, value2, "softwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerIsNull() {
            addCriterion("HARDWARE_TEST_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerIsNotNull() {
            addCriterion("HARDWARE_TEST_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerEqualTo(String value) {
            addCriterion("HARDWARE_TEST_MANAGER =", value, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerNotEqualTo(String value) {
            addCriterion("HARDWARE_TEST_MANAGER <>", value, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerGreaterThan(String value) {
            addCriterion("HARDWARE_TEST_MANAGER >", value, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerGreaterThanOrEqualTo(String value) {
            addCriterion("HARDWARE_TEST_MANAGER >=", value, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerLessThan(String value) {
            addCriterion("HARDWARE_TEST_MANAGER <", value, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerLessThanOrEqualTo(String value) {
            addCriterion("HARDWARE_TEST_MANAGER <=", value, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerLike(String value) {
            addCriterion("HARDWARE_TEST_MANAGER like", value, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerNotLike(String value) {
            addCriterion("HARDWARE_TEST_MANAGER not like", value, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerIn(List<String> values) {
            addCriterion("HARDWARE_TEST_MANAGER in", values, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerNotIn(List<String> values) {
            addCriterion("HARDWARE_TEST_MANAGER not in", values, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerBetween(String value1, String value2) {
            addCriterion("HARDWARE_TEST_MANAGER between", value1, value2, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andHardwareTestManagerNotBetween(String value1, String value2) {
            addCriterion("HARDWARE_TEST_MANAGER not between", value1, value2, "hardwareTestManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerIsNull() {
            addCriterion("MARKET_TECHNICAL_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerIsNotNull() {
            addCriterion("MARKET_TECHNICAL_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerEqualTo(String value) {
            addCriterion("MARKET_TECHNICAL_MANAGER =", value, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerNotEqualTo(String value) {
            addCriterion("MARKET_TECHNICAL_MANAGER <>", value, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerGreaterThan(String value) {
            addCriterion("MARKET_TECHNICAL_MANAGER >", value, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerGreaterThanOrEqualTo(String value) {
            addCriterion("MARKET_TECHNICAL_MANAGER >=", value, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerLessThan(String value) {
            addCriterion("MARKET_TECHNICAL_MANAGER <", value, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerLessThanOrEqualTo(String value) {
            addCriterion("MARKET_TECHNICAL_MANAGER <=", value, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerLike(String value) {
            addCriterion("MARKET_TECHNICAL_MANAGER like", value, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerNotLike(String value) {
            addCriterion("MARKET_TECHNICAL_MANAGER not like", value, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerIn(List<String> values) {
            addCriterion("MARKET_TECHNICAL_MANAGER in", values, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerNotIn(List<String> values) {
            addCriterion("MARKET_TECHNICAL_MANAGER not in", values, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerBetween(String value1, String value2) {
            addCriterion("MARKET_TECHNICAL_MANAGER between", value1, value2, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andMarketTechnicalManagerNotBetween(String value1, String value2) {
            addCriterion("MARKET_TECHNICAL_MANAGER not between", value1, value2, "marketTechnicalManager");
            return (Criteria) this;
        }

        public Criteria andNetworkSeIsNull() {
            addCriterion("NETWORK_SE is null");
            return (Criteria) this;
        }

        public Criteria andNetworkSeIsNotNull() {
            addCriterion("NETWORK_SE is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkSeEqualTo(String value) {
            addCriterion("NETWORK_SE =", value, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeNotEqualTo(String value) {
            addCriterion("NETWORK_SE <>", value, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeGreaterThan(String value) {
            addCriterion("NETWORK_SE >", value, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_SE >=", value, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeLessThan(String value) {
            addCriterion("NETWORK_SE <", value, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_SE <=", value, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeLike(String value) {
            addCriterion("NETWORK_SE like", value, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeNotLike(String value) {
            addCriterion("NETWORK_SE not like", value, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeIn(List<String> values) {
            addCriterion("NETWORK_SE in", values, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeNotIn(List<String> values) {
            addCriterion("NETWORK_SE not in", values, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeBetween(String value1, String value2) {
            addCriterion("NETWORK_SE between", value1, value2, "networkSe");
            return (Criteria) this;
        }

        public Criteria andNetworkSeNotBetween(String value1, String value2) {
            addCriterion("NETWORK_SE not between", value1, value2, "networkSe");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonIsNull() {
            addCriterion("SOFTWARE_INTERFATE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonIsNotNull() {
            addCriterion("SOFTWARE_INTERFATE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonEqualTo(String value) {
            addCriterion("SOFTWARE_INTERFATE_PERSON =", value, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonNotEqualTo(String value) {
            addCriterion("SOFTWARE_INTERFATE_PERSON <>", value, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonGreaterThan(String value) {
            addCriterion("SOFTWARE_INTERFATE_PERSON >", value, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTWARE_INTERFATE_PERSON >=", value, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonLessThan(String value) {
            addCriterion("SOFTWARE_INTERFATE_PERSON <", value, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonLessThanOrEqualTo(String value) {
            addCriterion("SOFTWARE_INTERFATE_PERSON <=", value, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonLike(String value) {
            addCriterion("SOFTWARE_INTERFATE_PERSON like", value, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonNotLike(String value) {
            addCriterion("SOFTWARE_INTERFATE_PERSON not like", value, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonIn(List<String> values) {
            addCriterion("SOFTWARE_INTERFATE_PERSON in", values, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonNotIn(List<String> values) {
            addCriterion("SOFTWARE_INTERFATE_PERSON not in", values, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonBetween(String value1, String value2) {
            addCriterion("SOFTWARE_INTERFATE_PERSON between", value1, value2, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andSoftwareInterfatePersonNotBetween(String value1, String value2) {
            addCriterion("SOFTWARE_INTERFATE_PERSON not between", value1, value2, "softwareInterfatePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonIsNull() {
            addCriterion("TECHNICAL_INTERFACE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonIsNotNull() {
            addCriterion("TECHNICAL_INTERFACE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonEqualTo(String value) {
            addCriterion("TECHNICAL_INTERFACE_PERSON =", value, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonNotEqualTo(String value) {
            addCriterion("TECHNICAL_INTERFACE_PERSON <>", value, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonGreaterThan(String value) {
            addCriterion("TECHNICAL_INTERFACE_PERSON >", value, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonGreaterThanOrEqualTo(String value) {
            addCriterion("TECHNICAL_INTERFACE_PERSON >=", value, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonLessThan(String value) {
            addCriterion("TECHNICAL_INTERFACE_PERSON <", value, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonLessThanOrEqualTo(String value) {
            addCriterion("TECHNICAL_INTERFACE_PERSON <=", value, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonLike(String value) {
            addCriterion("TECHNICAL_INTERFACE_PERSON like", value, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonNotLike(String value) {
            addCriterion("TECHNICAL_INTERFACE_PERSON not like", value, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonIn(List<String> values) {
            addCriterion("TECHNICAL_INTERFACE_PERSON in", values, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonNotIn(List<String> values) {
            addCriterion("TECHNICAL_INTERFACE_PERSON not in", values, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonBetween(String value1, String value2) {
            addCriterion("TECHNICAL_INTERFACE_PERSON between", value1, value2, "technicalInterfacePerson");
            return (Criteria) this;
        }

        public Criteria andTechnicalInterfacePersonNotBetween(String value1, String value2) {
            addCriterion("TECHNICAL_INTERFACE_PERSON not between", value1, value2, "technicalInterfacePerson");
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