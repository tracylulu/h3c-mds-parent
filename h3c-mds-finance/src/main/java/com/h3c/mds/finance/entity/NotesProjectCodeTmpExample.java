package com.h3c.mds.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotesProjectCodeTmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotesProjectCodeTmpExample() {
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

        public Criteria andFObjcaNameIsNull() {
            addCriterion("f_objca_name is null");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameIsNotNull() {
            addCriterion("f_objca_name is not null");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameEqualTo(String value) {
            addCriterion("f_objca_name =", value, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameNotEqualTo(String value) {
            addCriterion("f_objca_name <>", value, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameGreaterThan(String value) {
            addCriterion("f_objca_name >", value, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_objca_name >=", value, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameLessThan(String value) {
            addCriterion("f_objca_name <", value, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameLessThanOrEqualTo(String value) {
            addCriterion("f_objca_name <=", value, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameLike(String value) {
            addCriterion("f_objca_name like", value, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameNotLike(String value) {
            addCriterion("f_objca_name not like", value, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameIn(List<String> values) {
            addCriterion("f_objca_name in", values, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameNotIn(List<String> values) {
            addCriterion("f_objca_name not in", values, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameBetween(String value1, String value2) {
            addCriterion("f_objca_name between", value1, value2, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFObjcaNameNotBetween(String value1, String value2) {
            addCriterion("f_objca_name not between", value1, value2, "fObjcaName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameIsNull() {
            addCriterion("f_pdt_name is null");
            return (Criteria) this;
        }

        public Criteria andFPdtNameIsNotNull() {
            addCriterion("f_pdt_name is not null");
            return (Criteria) this;
        }

        public Criteria andFPdtNameEqualTo(String value) {
            addCriterion("f_pdt_name =", value, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameNotEqualTo(String value) {
            addCriterion("f_pdt_name <>", value, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameGreaterThan(String value) {
            addCriterion("f_pdt_name >", value, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_pdt_name >=", value, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameLessThan(String value) {
            addCriterion("f_pdt_name <", value, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameLessThanOrEqualTo(String value) {
            addCriterion("f_pdt_name <=", value, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameLike(String value) {
            addCriterion("f_pdt_name like", value, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameNotLike(String value) {
            addCriterion("f_pdt_name not like", value, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameIn(List<String> values) {
            addCriterion("f_pdt_name in", values, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameNotIn(List<String> values) {
            addCriterion("f_pdt_name not in", values, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameBetween(String value1, String value2) {
            addCriterion("f_pdt_name between", value1, value2, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFPdtNameNotBetween(String value1, String value2) {
            addCriterion("f_pdt_name not between", value1, value2, "fPdtName");
            return (Criteria) this;
        }

        public Criteria andFProjnoIsNull() {
            addCriterion("f_projno is null");
            return (Criteria) this;
        }

        public Criteria andFProjnoIsNotNull() {
            addCriterion("f_projno is not null");
            return (Criteria) this;
        }

        public Criteria andFProjnoEqualTo(String value) {
            addCriterion("f_projno =", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoNotEqualTo(String value) {
            addCriterion("f_projno <>", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoGreaterThan(String value) {
            addCriterion("f_projno >", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_projno >=", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoLessThan(String value) {
            addCriterion("f_projno <", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoLessThanOrEqualTo(String value) {
            addCriterion("f_projno <=", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoLike(String value) {
            addCriterion("f_projno like", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoNotLike(String value) {
            addCriterion("f_projno not like", value, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoIn(List<String> values) {
            addCriterion("f_projno in", values, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoNotIn(List<String> values) {
            addCriterion("f_projno not in", values, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoBetween(String value1, String value2) {
            addCriterion("f_projno between", value1, value2, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnoNotBetween(String value1, String value2) {
            addCriterion("f_projno not between", value1, value2, "fProjno");
            return (Criteria) this;
        }

        public Criteria andFProjnameIsNull() {
            addCriterion("f_projname is null");
            return (Criteria) this;
        }

        public Criteria andFProjnameIsNotNull() {
            addCriterion("f_projname is not null");
            return (Criteria) this;
        }

        public Criteria andFProjnameEqualTo(String value) {
            addCriterion("f_projname =", value, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameNotEqualTo(String value) {
            addCriterion("f_projname <>", value, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameGreaterThan(String value) {
            addCriterion("f_projname >", value, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_projname >=", value, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameLessThan(String value) {
            addCriterion("f_projname <", value, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameLessThanOrEqualTo(String value) {
            addCriterion("f_projname <=", value, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameLike(String value) {
            addCriterion("f_projname like", value, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameNotLike(String value) {
            addCriterion("f_projname not like", value, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameIn(List<String> values) {
            addCriterion("f_projname in", values, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameNotIn(List<String> values) {
            addCriterion("f_projname not in", values, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameBetween(String value1, String value2) {
            addCriterion("f_projname between", value1, value2, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjnameNotBetween(String value1, String value2) {
            addCriterion("f_projname not between", value1, value2, "fProjname");
            return (Criteria) this;
        }

        public Criteria andFProjcodeIsNull() {
            addCriterion("f_projcode is null");
            return (Criteria) this;
        }

        public Criteria andFProjcodeIsNotNull() {
            addCriterion("f_projcode is not null");
            return (Criteria) this;
        }

        public Criteria andFProjcodeEqualTo(String value) {
            addCriterion("f_projcode =", value, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeNotEqualTo(String value) {
            addCriterion("f_projcode <>", value, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeGreaterThan(String value) {
            addCriterion("f_projcode >", value, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_projcode >=", value, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeLessThan(String value) {
            addCriterion("f_projcode <", value, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeLessThanOrEqualTo(String value) {
            addCriterion("f_projcode <=", value, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeLike(String value) {
            addCriterion("f_projcode like", value, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeNotLike(String value) {
            addCriterion("f_projcode not like", value, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeIn(List<String> values) {
            addCriterion("f_projcode in", values, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeNotIn(List<String> values) {
            addCriterion("f_projcode not in", values, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeBetween(String value1, String value2) {
            addCriterion("f_projcode between", value1, value2, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProjcodeNotBetween(String value1, String value2) {
            addCriterion("f_projcode not between", value1, value2, "fProjcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameIsNull() {
            addCriterion("f_productline_name is null");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameIsNotNull() {
            addCriterion("f_productline_name is not null");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameEqualTo(String value) {
            addCriterion("f_productline_name =", value, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameNotEqualTo(String value) {
            addCriterion("f_productline_name <>", value, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameGreaterThan(String value) {
            addCriterion("f_productline_name >", value, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_productline_name >=", value, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameLessThan(String value) {
            addCriterion("f_productline_name <", value, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameLessThanOrEqualTo(String value) {
            addCriterion("f_productline_name <=", value, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameLike(String value) {
            addCriterion("f_productline_name like", value, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameNotLike(String value) {
            addCriterion("f_productline_name not like", value, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameIn(List<String> values) {
            addCriterion("f_productline_name in", values, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameNotIn(List<String> values) {
            addCriterion("f_productline_name not in", values, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameBetween(String value1, String value2) {
            addCriterion("f_productline_name between", value1, value2, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameNotBetween(String value1, String value2) {
            addCriterion("f_productline_name not between", value1, value2, "fProductlineName");
            return (Criteria) this;
        }

        public Criteria andFVersionIsNull() {
            addCriterion("f_version is null");
            return (Criteria) this;
        }

        public Criteria andFVersionIsNotNull() {
            addCriterion("f_version is not null");
            return (Criteria) this;
        }

        public Criteria andFVersionEqualTo(String value) {
            addCriterion("f_version =", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionNotEqualTo(String value) {
            addCriterion("f_version <>", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionGreaterThan(String value) {
            addCriterion("f_version >", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionGreaterThanOrEqualTo(String value) {
            addCriterion("f_version >=", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionLessThan(String value) {
            addCriterion("f_version <", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionLessThanOrEqualTo(String value) {
            addCriterion("f_version <=", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionLike(String value) {
            addCriterion("f_version like", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionNotLike(String value) {
            addCriterion("f_version not like", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionIn(List<String> values) {
            addCriterion("f_version in", values, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionNotIn(List<String> values) {
            addCriterion("f_version not in", values, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionBetween(String value1, String value2) {
            addCriterion("f_version between", value1, value2, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionNotBetween(String value1, String value2) {
            addCriterion("f_version not between", value1, value2, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIsNull() {
            addCriterion("f_product_code is null");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIsNotNull() {
            addCriterion("f_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andFProductCodeEqualTo(String value) {
            addCriterion("f_product_code =", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotEqualTo(String value) {
            addCriterion("f_product_code <>", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeGreaterThan(String value) {
            addCriterion("f_product_code >", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_product_code >=", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLessThan(String value) {
            addCriterion("f_product_code <", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLessThanOrEqualTo(String value) {
            addCriterion("f_product_code <=", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLike(String value) {
            addCriterion("f_product_code like", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotLike(String value) {
            addCriterion("f_product_code not like", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIn(List<String> values) {
            addCriterion("f_product_code in", values, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotIn(List<String> values) {
            addCriterion("f_product_code not in", values, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeBetween(String value1, String value2) {
            addCriterion("f_product_code between", value1, value2, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotBetween(String value1, String value2) {
            addCriterion("f_product_code not between", value1, value2, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andProductNameCnIsNull() {
            addCriterion("PRODUCT_NAME_CN is null");
            return (Criteria) this;
        }

        public Criteria andProductNameCnIsNotNull() {
            addCriterion("PRODUCT_NAME_CN is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameCnEqualTo(String value) {
            addCriterion("PRODUCT_NAME_CN =", value, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME_CN <>", value, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnGreaterThan(String value) {
            addCriterion("PRODUCT_NAME_CN >", value, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME_CN >=", value, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnLessThan(String value) {
            addCriterion("PRODUCT_NAME_CN <", value, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME_CN <=", value, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnLike(String value) {
            addCriterion("PRODUCT_NAME_CN like", value, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnNotLike(String value) {
            addCriterion("PRODUCT_NAME_CN not like", value, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnIn(List<String> values) {
            addCriterion("PRODUCT_NAME_CN in", values, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME_CN not in", values, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME_CN between", value1, value2, "productNameCn");
            return (Criteria) this;
        }

        public Criteria andProductNameCnNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME_CN not between", value1, value2, "productNameCn");
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

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andFBizhongIsNull() {
            addCriterion("f_bizhong is null");
            return (Criteria) this;
        }

        public Criteria andFBizhongIsNotNull() {
            addCriterion("f_bizhong is not null");
            return (Criteria) this;
        }

        public Criteria andFBizhongEqualTo(BigDecimal value) {
            addCriterion("f_bizhong =", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongNotEqualTo(BigDecimal value) {
            addCriterion("f_bizhong <>", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongGreaterThan(BigDecimal value) {
            addCriterion("f_bizhong >", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("f_bizhong >=", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongLessThan(BigDecimal value) {
            addCriterion("f_bizhong <", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("f_bizhong <=", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongIn(List<BigDecimal> values) {
            addCriterion("f_bizhong in", values, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongNotIn(List<BigDecimal> values) {
            addCriterion("f_bizhong not in", values, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_bizhong between", value1, value2, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_bizhong not between", value1, value2, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongIsNull() {
            addCriterion("f_fbizhong is null");
            return (Criteria) this;
        }

        public Criteria andFFbizhongIsNotNull() {
            addCriterion("f_fbizhong is not null");
            return (Criteria) this;
        }

        public Criteria andFFbizhongEqualTo(BigDecimal value) {
            addCriterion("f_fbizhong =", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongNotEqualTo(BigDecimal value) {
            addCriterion("f_fbizhong <>", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongGreaterThan(BigDecimal value) {
            addCriterion("f_fbizhong >", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("f_fbizhong >=", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongLessThan(BigDecimal value) {
            addCriterion("f_fbizhong <", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("f_fbizhong <=", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongIn(List<BigDecimal> values) {
            addCriterion("f_fbizhong in", values, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongNotIn(List<BigDecimal> values) {
            addCriterion("f_fbizhong not in", values, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_fbizhong between", value1, value2, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_fbizhong not between", value1, value2, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("BeginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("BeginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("BeginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("BeginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BeginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("BeginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("BeginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("BeginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("BeginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("BeginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("BeginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andFProjmngIsNull() {
            addCriterion("f_projMng is null");
            return (Criteria) this;
        }

        public Criteria andFProjmngIsNotNull() {
            addCriterion("f_projMng is not null");
            return (Criteria) this;
        }

        public Criteria andFProjmngEqualTo(String value) {
            addCriterion("f_projMng =", value, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngNotEqualTo(String value) {
            addCriterion("f_projMng <>", value, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngGreaterThan(String value) {
            addCriterion("f_projMng >", value, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngGreaterThanOrEqualTo(String value) {
            addCriterion("f_projMng >=", value, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngLessThan(String value) {
            addCriterion("f_projMng <", value, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngLessThanOrEqualTo(String value) {
            addCriterion("f_projMng <=", value, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngLike(String value) {
            addCriterion("f_projMng like", value, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngNotLike(String value) {
            addCriterion("f_projMng not like", value, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngIn(List<String> values) {
            addCriterion("f_projMng in", values, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngNotIn(List<String> values) {
            addCriterion("f_projMng not in", values, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngBetween(String value1, String value2) {
            addCriterion("f_projMng between", value1, value2, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFProjmngNotBetween(String value1, String value2) {
            addCriterion("f_projMng not between", value1, value2, "fProjmng");
            return (Criteria) this;
        }

        public Criteria andFDeptIsNull() {
            addCriterion("f_dept is null");
            return (Criteria) this;
        }

        public Criteria andFDeptIsNotNull() {
            addCriterion("f_dept is not null");
            return (Criteria) this;
        }

        public Criteria andFDeptEqualTo(String value) {
            addCriterion("f_dept =", value, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptNotEqualTo(String value) {
            addCriterion("f_dept <>", value, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptGreaterThan(String value) {
            addCriterion("f_dept >", value, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptGreaterThanOrEqualTo(String value) {
            addCriterion("f_dept >=", value, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptLessThan(String value) {
            addCriterion("f_dept <", value, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptLessThanOrEqualTo(String value) {
            addCriterion("f_dept <=", value, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptLike(String value) {
            addCriterion("f_dept like", value, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptNotLike(String value) {
            addCriterion("f_dept not like", value, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptIn(List<String> values) {
            addCriterion("f_dept in", values, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptNotIn(List<String> values) {
            addCriterion("f_dept not in", values, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptBetween(String value1, String value2) {
            addCriterion("f_dept between", value1, value2, "fDept");
            return (Criteria) this;
        }

        public Criteria andFDeptNotBetween(String value1, String value2) {
            addCriterion("f_dept not between", value1, value2, "fDept");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeIsNull() {
            addCriterion("f_start_project_time is null");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeIsNotNull() {
            addCriterion("f_start_project_time is not null");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeEqualTo(Date value) {
            addCriterion("f_start_project_time =", value, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeNotEqualTo(Date value) {
            addCriterion("f_start_project_time <>", value, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeGreaterThan(Date value) {
            addCriterion("f_start_project_time >", value, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_start_project_time >=", value, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeLessThan(Date value) {
            addCriterion("f_start_project_time <", value, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeLessThanOrEqualTo(Date value) {
            addCriterion("f_start_project_time <=", value, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeIn(List<Date> values) {
            addCriterion("f_start_project_time in", values, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeNotIn(List<Date> values) {
            addCriterion("f_start_project_time not in", values, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeBetween(Date value1, Date value2) {
            addCriterion("f_start_project_time between", value1, value2, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFStartProjectTimeNotBetween(Date value1, Date value2) {
            addCriterion("f_start_project_time not between", value1, value2, "fStartProjectTime");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameIsNull() {
            addCriterion("f_assign_point_name is null");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameIsNotNull() {
            addCriterion("f_assign_point_name is not null");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameEqualTo(String value) {
            addCriterion("f_assign_point_name =", value, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameNotEqualTo(String value) {
            addCriterion("f_assign_point_name <>", value, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameGreaterThan(String value) {
            addCriterion("f_assign_point_name >", value, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_assign_point_name >=", value, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameLessThan(String value) {
            addCriterion("f_assign_point_name <", value, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameLessThanOrEqualTo(String value) {
            addCriterion("f_assign_point_name <=", value, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameLike(String value) {
            addCriterion("f_assign_point_name like", value, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameNotLike(String value) {
            addCriterion("f_assign_point_name not like", value, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameIn(List<String> values) {
            addCriterion("f_assign_point_name in", values, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameNotIn(List<String> values) {
            addCriterion("f_assign_point_name not in", values, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameBetween(String value1, String value2) {
            addCriterion("f_assign_point_name between", value1, value2, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNameNotBetween(String value1, String value2) {
            addCriterion("f_assign_point_name not between", value1, value2, "fAssignPointName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameIsNull() {
            addCriterion("f_old_objca_name is null");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameIsNotNull() {
            addCriterion("f_old_objca_name is not null");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameEqualTo(String value) {
            addCriterion("f_old_objca_name =", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameNotEqualTo(String value) {
            addCriterion("f_old_objca_name <>", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameGreaterThan(String value) {
            addCriterion("f_old_objca_name >", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_objca_name >=", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameLessThan(String value) {
            addCriterion("f_old_objca_name <", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameLessThanOrEqualTo(String value) {
            addCriterion("f_old_objca_name <=", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameLike(String value) {
            addCriterion("f_old_objca_name like", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameNotLike(String value) {
            addCriterion("f_old_objca_name not like", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameIn(List<String> values) {
            addCriterion("f_old_objca_name in", values, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameNotIn(List<String> values) {
            addCriterion("f_old_objca_name not in", values, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameBetween(String value1, String value2) {
            addCriterion("f_old_objca_name between", value1, value2, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameNotBetween(String value1, String value2) {
            addCriterion("f_old_objca_name not between", value1, value2, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameIsNull() {
            addCriterion("f_old_pdt_name is null");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameIsNotNull() {
            addCriterion("f_old_pdt_name is not null");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameEqualTo(String value) {
            addCriterion("f_old_pdt_name =", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameNotEqualTo(String value) {
            addCriterion("f_old_pdt_name <>", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameGreaterThan(String value) {
            addCriterion("f_old_pdt_name >", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_pdt_name >=", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameLessThan(String value) {
            addCriterion("f_old_pdt_name <", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameLessThanOrEqualTo(String value) {
            addCriterion("f_old_pdt_name <=", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameLike(String value) {
            addCriterion("f_old_pdt_name like", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameNotLike(String value) {
            addCriterion("f_old_pdt_name not like", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameIn(List<String> values) {
            addCriterion("f_old_pdt_name in", values, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameNotIn(List<String> values) {
            addCriterion("f_old_pdt_name not in", values, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameBetween(String value1, String value2) {
            addCriterion("f_old_pdt_name between", value1, value2, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameNotBetween(String value1, String value2) {
            addCriterion("f_old_pdt_name not between", value1, value2, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoIsNull() {
            addCriterion("f_old_projno is null");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoIsNotNull() {
            addCriterion("f_old_projno is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoEqualTo(String value) {
            addCriterion("f_old_projno =", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoNotEqualTo(String value) {
            addCriterion("f_old_projno <>", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoGreaterThan(String value) {
            addCriterion("f_old_projno >", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_projno >=", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoLessThan(String value) {
            addCriterion("f_old_projno <", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoLessThanOrEqualTo(String value) {
            addCriterion("f_old_projno <=", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoLike(String value) {
            addCriterion("f_old_projno like", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoNotLike(String value) {
            addCriterion("f_old_projno not like", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoIn(List<String> values) {
            addCriterion("f_old_projno in", values, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoNotIn(List<String> values) {
            addCriterion("f_old_projno not in", values, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoBetween(String value1, String value2) {
            addCriterion("f_old_projno between", value1, value2, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoNotBetween(String value1, String value2) {
            addCriterion("f_old_projno not between", value1, value2, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameIsNull() {
            addCriterion("f_old_projname is null");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameIsNotNull() {
            addCriterion("f_old_projname is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameEqualTo(String value) {
            addCriterion("f_old_projname =", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameNotEqualTo(String value) {
            addCriterion("f_old_projname <>", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameGreaterThan(String value) {
            addCriterion("f_old_projname >", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_projname >=", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameLessThan(String value) {
            addCriterion("f_old_projname <", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameLessThanOrEqualTo(String value) {
            addCriterion("f_old_projname <=", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameLike(String value) {
            addCriterion("f_old_projname like", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameNotLike(String value) {
            addCriterion("f_old_projname not like", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameIn(List<String> values) {
            addCriterion("f_old_projname in", values, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameNotIn(List<String> values) {
            addCriterion("f_old_projname not in", values, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameBetween(String value1, String value2) {
            addCriterion("f_old_projname between", value1, value2, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameNotBetween(String value1, String value2) {
            addCriterion("f_old_projname not between", value1, value2, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeIsNull() {
            addCriterion("f_old_projcode is null");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeIsNotNull() {
            addCriterion("f_old_projcode is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeEqualTo(String value) {
            addCriterion("f_old_projcode =", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeNotEqualTo(String value) {
            addCriterion("f_old_projcode <>", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeGreaterThan(String value) {
            addCriterion("f_old_projcode >", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_projcode >=", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeLessThan(String value) {
            addCriterion("f_old_projcode <", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeLessThanOrEqualTo(String value) {
            addCriterion("f_old_projcode <=", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeLike(String value) {
            addCriterion("f_old_projcode like", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeNotLike(String value) {
            addCriterion("f_old_projcode not like", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeIn(List<String> values) {
            addCriterion("f_old_projcode in", values, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeNotIn(List<String> values) {
            addCriterion("f_old_projcode not in", values, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeBetween(String value1, String value2) {
            addCriterion("f_old_projcode between", value1, value2, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeNotBetween(String value1, String value2) {
            addCriterion("f_old_projcode not between", value1, value2, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameIsNull() {
            addCriterion("f_old_productline_name is null");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameIsNotNull() {
            addCriterion("f_old_productline_name is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameEqualTo(String value) {
            addCriterion("f_old_productline_name =", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameNotEqualTo(String value) {
            addCriterion("f_old_productline_name <>", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameGreaterThan(String value) {
            addCriterion("f_old_productline_name >", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_productline_name >=", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameLessThan(String value) {
            addCriterion("f_old_productline_name <", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameLessThanOrEqualTo(String value) {
            addCriterion("f_old_productline_name <=", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameLike(String value) {
            addCriterion("f_old_productline_name like", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameNotLike(String value) {
            addCriterion("f_old_productline_name not like", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameIn(List<String> values) {
            addCriterion("f_old_productline_name in", values, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameNotIn(List<String> values) {
            addCriterion("f_old_productline_name not in", values, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameBetween(String value1, String value2) {
            addCriterion("f_old_productline_name between", value1, value2, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameNotBetween(String value1, String value2) {
            addCriterion("f_old_productline_name not between", value1, value2, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldVersionIsNull() {
            addCriterion("f_old_version is null");
            return (Criteria) this;
        }

        public Criteria andFOldVersionIsNotNull() {
            addCriterion("f_old_version is not null");
            return (Criteria) this;
        }

        public Criteria andFOldVersionEqualTo(String value) {
            addCriterion("f_old_version =", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionNotEqualTo(String value) {
            addCriterion("f_old_version <>", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionGreaterThan(String value) {
            addCriterion("f_old_version >", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_version >=", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionLessThan(String value) {
            addCriterion("f_old_version <", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionLessThanOrEqualTo(String value) {
            addCriterion("f_old_version <=", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionLike(String value) {
            addCriterion("f_old_version like", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionNotLike(String value) {
            addCriterion("f_old_version not like", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionIn(List<String> values) {
            addCriterion("f_old_version in", values, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionNotIn(List<String> values) {
            addCriterion("f_old_version not in", values, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionBetween(String value1, String value2) {
            addCriterion("f_old_version between", value1, value2, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionNotBetween(String value1, String value2) {
            addCriterion("f_old_version not between", value1, value2, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoIsNull() {
            addCriterion("f_old_productno is null");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoIsNotNull() {
            addCriterion("f_old_productno is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoEqualTo(String value) {
            addCriterion("f_old_productno =", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoNotEqualTo(String value) {
            addCriterion("f_old_productno <>", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoGreaterThan(String value) {
            addCriterion("f_old_productno >", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_productno >=", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoLessThan(String value) {
            addCriterion("f_old_productno <", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoLessThanOrEqualTo(String value) {
            addCriterion("f_old_productno <=", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoLike(String value) {
            addCriterion("f_old_productno like", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoNotLike(String value) {
            addCriterion("f_old_productno not like", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoIn(List<String> values) {
            addCriterion("f_old_productno in", values, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoNotIn(List<String> values) {
            addCriterion("f_old_productno not in", values, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoBetween(String value1, String value2) {
            addCriterion("f_old_productno between", value1, value2, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoNotBetween(String value1, String value2) {
            addCriterion("f_old_productno not between", value1, value2, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameIsNull() {
            addCriterion("f_old_productname is null");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameIsNotNull() {
            addCriterion("f_old_productname is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameEqualTo(String value) {
            addCriterion("f_old_productname =", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameNotEqualTo(String value) {
            addCriterion("f_old_productname <>", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameGreaterThan(String value) {
            addCriterion("f_old_productname >", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_productname >=", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameLessThan(String value) {
            addCriterion("f_old_productname <", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameLessThanOrEqualTo(String value) {
            addCriterion("f_old_productname <=", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameLike(String value) {
            addCriterion("f_old_productname like", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameNotLike(String value) {
            addCriterion("f_old_productname not like", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameIn(List<String> values) {
            addCriterion("f_old_productname in", values, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameNotIn(List<String> values) {
            addCriterion("f_old_productname not in", values, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameBetween(String value1, String value2) {
            addCriterion("f_old_productname between", value1, value2, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameNotBetween(String value1, String value2) {
            addCriterion("f_old_productname not between", value1, value2, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldRateIsNull() {
            addCriterion("f_old_rate is null");
            return (Criteria) this;
        }

        public Criteria andFOldRateIsNotNull() {
            addCriterion("f_old_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFOldRateEqualTo(BigDecimal value) {
            addCriterion("f_old_rate =", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotEqualTo(BigDecimal value) {
            addCriterion("f_old_rate <>", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateGreaterThan(BigDecimal value) {
            addCriterion("f_old_rate >", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("f_old_rate >=", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateLessThan(BigDecimal value) {
            addCriterion("f_old_rate <", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("f_old_rate <=", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateIn(List<BigDecimal> values) {
            addCriterion("f_old_rate in", values, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotIn(List<BigDecimal> values) {
            addCriterion("f_old_rate not in", values, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_old_rate between", value1, value2, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_old_rate not between", value1, value2, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongIsNull() {
            addCriterion("f_old_bizhong is null");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongIsNotNull() {
            addCriterion("f_old_bizhong is not null");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongEqualTo(BigDecimal value) {
            addCriterion("f_old_bizhong =", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongNotEqualTo(BigDecimal value) {
            addCriterion("f_old_bizhong <>", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongGreaterThan(BigDecimal value) {
            addCriterion("f_old_bizhong >", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("f_old_bizhong >=", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongLessThan(BigDecimal value) {
            addCriterion("f_old_bizhong <", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("f_old_bizhong <=", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongIn(List<BigDecimal> values) {
            addCriterion("f_old_bizhong in", values, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongNotIn(List<BigDecimal> values) {
            addCriterion("f_old_bizhong not in", values, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_old_bizhong between", value1, value2, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_old_bizhong not between", value1, value2, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongIsNull() {
            addCriterion("f_old_fbizhong is null");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongIsNotNull() {
            addCriterion("f_old_fbizhong is not null");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongEqualTo(BigDecimal value) {
            addCriterion("f_old_fbizhong =", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongNotEqualTo(BigDecimal value) {
            addCriterion("f_old_fbizhong <>", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongGreaterThan(BigDecimal value) {
            addCriterion("f_old_fbizhong >", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("f_old_fbizhong >=", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongLessThan(BigDecimal value) {
            addCriterion("f_old_fbizhong <", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("f_old_fbizhong <=", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongIn(List<BigDecimal> values) {
            addCriterion("f_old_fbizhong in", values, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongNotIn(List<BigDecimal> values) {
            addCriterion("f_old_fbizhong not in", values, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_old_fbizhong between", value1, value2, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("f_old_fbizhong not between", value1, value2, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFAuthorIsNull() {
            addCriterion("f_author is null");
            return (Criteria) this;
        }

        public Criteria andFAuthorIsNotNull() {
            addCriterion("f_author is not null");
            return (Criteria) this;
        }

        public Criteria andFAuthorEqualTo(String value) {
            addCriterion("f_author =", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorNotEqualTo(String value) {
            addCriterion("f_author <>", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorGreaterThan(String value) {
            addCriterion("f_author >", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("f_author >=", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorLessThan(String value) {
            addCriterion("f_author <", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorLessThanOrEqualTo(String value) {
            addCriterion("f_author <=", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorLike(String value) {
            addCriterion("f_author like", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorNotLike(String value) {
            addCriterion("f_author not like", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorIn(List<String> values) {
            addCriterion("f_author in", values, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorNotIn(List<String> values) {
            addCriterion("f_author not in", values, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorBetween(String value1, String value2) {
            addCriterion("f_author between", value1, value2, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorNotBetween(String value1, String value2) {
            addCriterion("f_author not between", value1, value2, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andWfOrunidIsNull() {
            addCriterion("WF_ORUNID is null");
            return (Criteria) this;
        }

        public Criteria andWfOrunidIsNotNull() {
            addCriterion("WF_ORUNID is not null");
            return (Criteria) this;
        }

        public Criteria andWfOrunidEqualTo(String value) {
            addCriterion("WF_ORUNID =", value, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidNotEqualTo(String value) {
            addCriterion("WF_ORUNID <>", value, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidGreaterThan(String value) {
            addCriterion("WF_ORUNID >", value, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidGreaterThanOrEqualTo(String value) {
            addCriterion("WF_ORUNID >=", value, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidLessThan(String value) {
            addCriterion("WF_ORUNID <", value, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidLessThanOrEqualTo(String value) {
            addCriterion("WF_ORUNID <=", value, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidLike(String value) {
            addCriterion("WF_ORUNID like", value, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidNotLike(String value) {
            addCriterion("WF_ORUNID not like", value, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidIn(List<String> values) {
            addCriterion("WF_ORUNID in", values, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidNotIn(List<String> values) {
            addCriterion("WF_ORUNID not in", values, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidBetween(String value1, String value2) {
            addCriterion("WF_ORUNID between", value1, value2, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andWfOrunidNotBetween(String value1, String value2) {
            addCriterion("WF_ORUNID not between", value1, value2, "wfOrunid");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andUpdataflagIsNull() {
            addCriterion("UpdataFlag is null");
            return (Criteria) this;
        }

        public Criteria andUpdataflagIsNotNull() {
            addCriterion("UpdataFlag is not null");
            return (Criteria) this;
        }

        public Criteria andUpdataflagEqualTo(String value) {
            addCriterion("UpdataFlag =", value, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagNotEqualTo(String value) {
            addCriterion("UpdataFlag <>", value, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagGreaterThan(String value) {
            addCriterion("UpdataFlag >", value, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagGreaterThanOrEqualTo(String value) {
            addCriterion("UpdataFlag >=", value, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagLessThan(String value) {
            addCriterion("UpdataFlag <", value, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagLessThanOrEqualTo(String value) {
            addCriterion("UpdataFlag <=", value, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagLike(String value) {
            addCriterion("UpdataFlag like", value, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagNotLike(String value) {
            addCriterion("UpdataFlag not like", value, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagIn(List<String> values) {
            addCriterion("UpdataFlag in", values, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagNotIn(List<String> values) {
            addCriterion("UpdataFlag not in", values, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagBetween(String value1, String value2) {
            addCriterion("UpdataFlag between", value1, value2, "updataflag");
            return (Criteria) this;
        }

        public Criteria andUpdataflagNotBetween(String value1, String value2) {
            addCriterion("UpdataFlag not between", value1, value2, "updataflag");
            return (Criteria) this;
        }

        public Criteria andReadersIsNull() {
            addCriterion("readers is null");
            return (Criteria) this;
        }

        public Criteria andReadersIsNotNull() {
            addCriterion("readers is not null");
            return (Criteria) this;
        }

        public Criteria andReadersEqualTo(String value) {
            addCriterion("readers =", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotEqualTo(String value) {
            addCriterion("readers <>", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersGreaterThan(String value) {
            addCriterion("readers >", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersGreaterThanOrEqualTo(String value) {
            addCriterion("readers >=", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLessThan(String value) {
            addCriterion("readers <", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLessThanOrEqualTo(String value) {
            addCriterion("readers <=", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLike(String value) {
            addCriterion("readers like", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotLike(String value) {
            addCriterion("readers not like", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersIn(List<String> values) {
            addCriterion("readers in", values, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotIn(List<String> values) {
            addCriterion("readers not in", values, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersBetween(String value1, String value2) {
            addCriterion("readers between", value1, value2, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotBetween(String value1, String value2) {
            addCriterion("readers not between", value1, value2, "readers");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiIsNull() {
            addCriterion("f_zhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiIsNotNull() {
            addCriterion("f_zhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiEqualTo(String value) {
            addCriterion("f_zhuangtai =", value, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiNotEqualTo(String value) {
            addCriterion("f_zhuangtai <>", value, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiGreaterThan(String value) {
            addCriterion("f_zhuangtai >", value, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("f_zhuangtai >=", value, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiLessThan(String value) {
            addCriterion("f_zhuangtai <", value, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("f_zhuangtai <=", value, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiLike(String value) {
            addCriterion("f_zhuangtai like", value, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiNotLike(String value) {
            addCriterion("f_zhuangtai not like", value, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiIn(List<String> values) {
            addCriterion("f_zhuangtai in", values, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiNotIn(List<String> values) {
            addCriterion("f_zhuangtai not in", values, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiBetween(String value1, String value2) {
            addCriterion("f_zhuangtai between", value1, value2, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andFZhuangtaiNotBetween(String value1, String value2) {
            addCriterion("f_zhuangtai not between", value1, value2, "fZhuangtai");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("cause not between", value1, value2, "cause");
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