package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectProductRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectProductRelExample() {
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

        public Criteria andProjNoIsNull() {
            addCriterion("proj_no is null");
            return (Criteria) this;
        }

        public Criteria andProjNoIsNotNull() {
            addCriterion("proj_no is not null");
            return (Criteria) this;
        }

        public Criteria andProjNoEqualTo(String value) {
            addCriterion("proj_no =", value, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoNotEqualTo(String value) {
            addCriterion("proj_no <>", value, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoGreaterThan(String value) {
            addCriterion("proj_no >", value, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoGreaterThanOrEqualTo(String value) {
            addCriterion("proj_no >=", value, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoLessThan(String value) {
            addCriterion("proj_no <", value, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoLessThanOrEqualTo(String value) {
            addCriterion("proj_no <=", value, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoLike(String value) {
            addCriterion("proj_no like", value, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoNotLike(String value) {
            addCriterion("proj_no not like", value, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoIn(List<String> values) {
            addCriterion("proj_no in", values, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoNotIn(List<String> values) {
            addCriterion("proj_no not in", values, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoBetween(String value1, String value2) {
            addCriterion("proj_no between", value1, value2, "projNo");
            return (Criteria) this;
        }

        public Criteria andProjNoNotBetween(String value1, String value2) {
            addCriterion("proj_no not between", value1, value2, "projNo");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("PRODUCT_CODE like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andAplicantIsNull() {
            addCriterion("aplicant is null");
            return (Criteria) this;
        }

        public Criteria andAplicantIsNotNull() {
            addCriterion("aplicant is not null");
            return (Criteria) this;
        }

        public Criteria andAplicantEqualTo(String value) {
            addCriterion("aplicant =", value, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantNotEqualTo(String value) {
            addCriterion("aplicant <>", value, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantGreaterThan(String value) {
            addCriterion("aplicant >", value, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantGreaterThanOrEqualTo(String value) {
            addCriterion("aplicant >=", value, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantLessThan(String value) {
            addCriterion("aplicant <", value, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantLessThanOrEqualTo(String value) {
            addCriterion("aplicant <=", value, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantLike(String value) {
            addCriterion("aplicant like", value, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantNotLike(String value) {
            addCriterion("aplicant not like", value, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantIn(List<String> values) {
            addCriterion("aplicant in", values, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantNotIn(List<String> values) {
            addCriterion("aplicant not in", values, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantBetween(String value1, String value2) {
            addCriterion("aplicant between", value1, value2, "aplicant");
            return (Criteria) this;
        }

        public Criteria andAplicantNotBetween(String value1, String value2) {
            addCriterion("aplicant not between", value1, value2, "aplicant");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("applyDate is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("applyDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("applyDate =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("applyDate <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("applyDate >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("applyDate >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("applyDate <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("applyDate <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("applyDate in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("applyDate not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("applyDate between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("applyDate not between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andPdtnoIsNull() {
            addCriterion("pdtno is null");
            return (Criteria) this;
        }

        public Criteria andPdtnoIsNotNull() {
            addCriterion("pdtno is not null");
            return (Criteria) this;
        }

        public Criteria andPdtnoEqualTo(String value) {
            addCriterion("pdtno =", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotEqualTo(String value) {
            addCriterion("pdtno <>", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoGreaterThan(String value) {
            addCriterion("pdtno >", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoGreaterThanOrEqualTo(String value) {
            addCriterion("pdtno >=", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLessThan(String value) {
            addCriterion("pdtno <", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLessThanOrEqualTo(String value) {
            addCriterion("pdtno <=", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLike(String value) {
            addCriterion("pdtno like", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotLike(String value) {
            addCriterion("pdtno not like", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoIn(List<String> values) {
            addCriterion("pdtno in", values, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotIn(List<String> values) {
            addCriterion("pdtno not in", values, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoBetween(String value1, String value2) {
            addCriterion("pdtno between", value1, value2, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotBetween(String value1, String value2) {
            addCriterion("pdtno not between", value1, value2, "pdtno");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andPdtNameIsNull() {
            addCriterion("pdt_name is null");
            return (Criteria) this;
        }

        public Criteria andPdtNameIsNotNull() {
            addCriterion("pdt_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdtNameEqualTo(String value) {
            addCriterion("pdt_name =", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotEqualTo(String value) {
            addCriterion("pdt_name <>", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameGreaterThan(String value) {
            addCriterion("pdt_name >", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdt_name >=", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLessThan(String value) {
            addCriterion("pdt_name <", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLessThanOrEqualTo(String value) {
            addCriterion("pdt_name <=", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLike(String value) {
            addCriterion("pdt_name like", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotLike(String value) {
            addCriterion("pdt_name not like", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameIn(List<String> values) {
            addCriterion("pdt_name in", values, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotIn(List<String> values) {
            addCriterion("pdt_name not in", values, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameBetween(String value1, String value2) {
            addCriterion("pdt_name between", value1, value2, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotBetween(String value1, String value2) {
            addCriterion("pdt_name not between", value1, value2, "pdtName");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdIsNull() {
            addCriterion("project_code_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdIsNotNull() {
            addCriterion("project_code_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdEqualTo(Integer value) {
            addCriterion("project_code_id =", value, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdNotEqualTo(Integer value) {
            addCriterion("project_code_id <>", value, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdGreaterThan(Integer value) {
            addCriterion("project_code_id >", value, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_code_id >=", value, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdLessThan(Integer value) {
            addCriterion("project_code_id <", value, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_code_id <=", value, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdIn(List<Integer> values) {
            addCriterion("project_code_id in", values, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdNotIn(List<Integer> values) {
            addCriterion("project_code_id not in", values, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("project_code_id between", value1, value2, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_code_id not between", value1, value2, "projectCodeId");
            return (Criteria) this;
        }

        public Criteria andOldProductNameIsNull() {
            addCriterion("old_product_name is null");
            return (Criteria) this;
        }

        public Criteria andOldProductNameIsNotNull() {
            addCriterion("old_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEqualTo(String value) {
            addCriterion("old_product_name =", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameNotEqualTo(String value) {
            addCriterion("old_product_name <>", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameGreaterThan(String value) {
            addCriterion("old_product_name >", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_product_name >=", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameLessThan(String value) {
            addCriterion("old_product_name <", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameLessThanOrEqualTo(String value) {
            addCriterion("old_product_name <=", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameLike(String value) {
            addCriterion("old_product_name like", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameNotLike(String value) {
            addCriterion("old_product_name not like", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameIn(List<String> values) {
            addCriterion("old_product_name in", values, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameNotIn(List<String> values) {
            addCriterion("old_product_name not in", values, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameBetween(String value1, String value2) {
            addCriterion("old_product_name between", value1, value2, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameNotBetween(String value1, String value2) {
            addCriterion("old_product_name not between", value1, value2, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameIsNull() {
            addCriterion("old_pdt_name is null");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameIsNotNull() {
            addCriterion("old_pdt_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameEqualTo(String value) {
            addCriterion("old_pdt_name =", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameNotEqualTo(String value) {
            addCriterion("old_pdt_name <>", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameGreaterThan(String value) {
            addCriterion("old_pdt_name >", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_pdt_name >=", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameLessThan(String value) {
            addCriterion("old_pdt_name <", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameLessThanOrEqualTo(String value) {
            addCriterion("old_pdt_name <=", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameLike(String value) {
            addCriterion("old_pdt_name like", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameNotLike(String value) {
            addCriterion("old_pdt_name not like", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameIn(List<String> values) {
            addCriterion("old_pdt_name in", values, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameNotIn(List<String> values) {
            addCriterion("old_pdt_name not in", values, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameBetween(String value1, String value2) {
            addCriterion("old_pdt_name between", value1, value2, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameNotBetween(String value1, String value2) {
            addCriterion("old_pdt_name not between", value1, value2, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeIsNull() {
            addCriterion("old_product_code is null");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeIsNotNull() {
            addCriterion("old_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeEqualTo(String value) {
            addCriterion("old_product_code =", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeNotEqualTo(String value) {
            addCriterion("old_product_code <>", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeGreaterThan(String value) {
            addCriterion("old_product_code >", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("old_product_code >=", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeLessThan(String value) {
            addCriterion("old_product_code <", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeLessThanOrEqualTo(String value) {
            addCriterion("old_product_code <=", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeLike(String value) {
            addCriterion("old_product_code like", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeNotLike(String value) {
            addCriterion("old_product_code not like", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeIn(List<String> values) {
            addCriterion("old_product_code in", values, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeNotIn(List<String> values) {
            addCriterion("old_product_code not in", values, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeBetween(String value1, String value2) {
            addCriterion("old_product_code between", value1, value2, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeNotBetween(String value1, String value2) {
            addCriterion("old_product_code not between", value1, value2, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldRateIsNull() {
            addCriterion("old_rate is null");
            return (Criteria) this;
        }

        public Criteria andOldRateIsNotNull() {
            addCriterion("old_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOldRateEqualTo(String value) {
            addCriterion("old_rate =", value, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateNotEqualTo(String value) {
            addCriterion("old_rate <>", value, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateGreaterThan(String value) {
            addCriterion("old_rate >", value, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateGreaterThanOrEqualTo(String value) {
            addCriterion("old_rate >=", value, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateLessThan(String value) {
            addCriterion("old_rate <", value, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateLessThanOrEqualTo(String value) {
            addCriterion("old_rate <=", value, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateLike(String value) {
            addCriterion("old_rate like", value, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateNotLike(String value) {
            addCriterion("old_rate not like", value, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateIn(List<String> values) {
            addCriterion("old_rate in", values, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateNotIn(List<String> values) {
            addCriterion("old_rate not in", values, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateBetween(String value1, String value2) {
            addCriterion("old_rate between", value1, value2, "oldRate");
            return (Criteria) this;
        }

        public Criteria andOldRateNotBetween(String value1, String value2) {
            addCriterion("old_rate not between", value1, value2, "oldRate");
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