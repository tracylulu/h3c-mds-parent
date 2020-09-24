package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartExportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartExportExample() {
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

        public Criteria andPdmApplyCodeIsNull() {
            addCriterion("PDM_APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeIsNotNull() {
            addCriterion("PDM_APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeEqualTo(String value) {
            addCriterion("PDM_APPLY_CODE =", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeNotEqualTo(String value) {
            addCriterion("PDM_APPLY_CODE <>", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeGreaterThan(String value) {
            addCriterion("PDM_APPLY_CODE >", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PDM_APPLY_CODE >=", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeLessThan(String value) {
            addCriterion("PDM_APPLY_CODE <", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("PDM_APPLY_CODE <=", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeLike(String value) {
            addCriterion("PDM_APPLY_CODE like", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeNotLike(String value) {
            addCriterion("PDM_APPLY_CODE not like", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeIn(List<String> values) {
            addCriterion("PDM_APPLY_CODE in", values, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeNotIn(List<String> values) {
            addCriterion("PDM_APPLY_CODE not in", values, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeBetween(String value1, String value2) {
            addCriterion("PDM_APPLY_CODE between", value1, value2, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeNotBetween(String value1, String value2) {
            addCriterion("PDM_APPLY_CODE not between", value1, value2, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNull() {
            addCriterion("PROJECT_NO is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNotNull() {
            addCriterion("PROJECT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoEqualTo(String value) {
            addCriterion("PROJECT_NO =", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotEqualTo(String value) {
            addCriterion("PROJECT_NO <>", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThan(String value) {
            addCriterion("PROJECT_NO >", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_NO >=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThan(String value) {
            addCriterion("PROJECT_NO <", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_NO <=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLike(String value) {
            addCriterion("PROJECT_NO like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotLike(String value) {
            addCriterion("PROJECT_NO not like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoIn(List<String> values) {
            addCriterion("PROJECT_NO in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotIn(List<String> values) {
            addCriterion("PROJECT_NO not in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoBetween(String value1, String value2) {
            addCriterion("PROJECT_NO between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotBetween(String value1, String value2) {
            addCriterion("PROJECT_NO not between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("PROJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("PROJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("PROJECT_NAME =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("PROJECT_NAME <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("PROJECT_NAME >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("PROJECT_NAME <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("PROJECT_NAME like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("PROJECT_NAME not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("PROJECT_NAME in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("PROJECT_NAME not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("PRODUCT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("PRODUCT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(String value) {
            addCriterion("PRODUCT_NUM =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(String value) {
            addCriterion("PRODUCT_NUM <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(String value) {
            addCriterion("PRODUCT_NUM >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NUM >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(String value) {
            addCriterion("PRODUCT_NUM <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NUM <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLike(String value) {
            addCriterion("PRODUCT_NUM like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotLike(String value) {
            addCriterion("PRODUCT_NUM not like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<String> values) {
            addCriterion("PRODUCT_NUM in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<String> values) {
            addCriterion("PRODUCT_NUM not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(String value1, String value2) {
            addCriterion("PRODUCT_NUM between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NUM not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnIsNull() {
            addCriterion("INSIDE_DESC_EN is null");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnIsNotNull() {
            addCriterion("INSIDE_DESC_EN is not null");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnEqualTo(String value) {
            addCriterion("INSIDE_DESC_EN =", value, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnNotEqualTo(String value) {
            addCriterion("INSIDE_DESC_EN <>", value, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnGreaterThan(String value) {
            addCriterion("INSIDE_DESC_EN >", value, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnGreaterThanOrEqualTo(String value) {
            addCriterion("INSIDE_DESC_EN >=", value, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnLessThan(String value) {
            addCriterion("INSIDE_DESC_EN <", value, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnLessThanOrEqualTo(String value) {
            addCriterion("INSIDE_DESC_EN <=", value, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnLike(String value) {
            addCriterion("INSIDE_DESC_EN like", value, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnNotLike(String value) {
            addCriterion("INSIDE_DESC_EN not like", value, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnIn(List<String> values) {
            addCriterion("INSIDE_DESC_EN in", values, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnNotIn(List<String> values) {
            addCriterion("INSIDE_DESC_EN not in", values, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnBetween(String value1, String value2) {
            addCriterion("INSIDE_DESC_EN between", value1, value2, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andInsideDescEnNotBetween(String value1, String value2) {
            addCriterion("INSIDE_DESC_EN not between", value1, value2, "insideDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnIsNull() {
            addCriterion("ABROAD_DESC_CN is null");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnIsNotNull() {
            addCriterion("ABROAD_DESC_CN is not null");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnEqualTo(String value) {
            addCriterion("ABROAD_DESC_CN =", value, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnNotEqualTo(String value) {
            addCriterion("ABROAD_DESC_CN <>", value, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnGreaterThan(String value) {
            addCriterion("ABROAD_DESC_CN >", value, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnGreaterThanOrEqualTo(String value) {
            addCriterion("ABROAD_DESC_CN >=", value, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnLessThan(String value) {
            addCriterion("ABROAD_DESC_CN <", value, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnLessThanOrEqualTo(String value) {
            addCriterion("ABROAD_DESC_CN <=", value, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnLike(String value) {
            addCriterion("ABROAD_DESC_CN like", value, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnNotLike(String value) {
            addCriterion("ABROAD_DESC_CN not like", value, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnIn(List<String> values) {
            addCriterion("ABROAD_DESC_CN in", values, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnNotIn(List<String> values) {
            addCriterion("ABROAD_DESC_CN not in", values, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnBetween(String value1, String value2) {
            addCriterion("ABROAD_DESC_CN between", value1, value2, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescCnNotBetween(String value1, String value2) {
            addCriterion("ABROAD_DESC_CN not between", value1, value2, "abroadDescCn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnIsNull() {
            addCriterion("ABROAD_DESC_EN is null");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnIsNotNull() {
            addCriterion("ABROAD_DESC_EN is not null");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnEqualTo(String value) {
            addCriterion("ABROAD_DESC_EN =", value, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnNotEqualTo(String value) {
            addCriterion("ABROAD_DESC_EN <>", value, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnGreaterThan(String value) {
            addCriterion("ABROAD_DESC_EN >", value, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnGreaterThanOrEqualTo(String value) {
            addCriterion("ABROAD_DESC_EN >=", value, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnLessThan(String value) {
            addCriterion("ABROAD_DESC_EN <", value, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnLessThanOrEqualTo(String value) {
            addCriterion("ABROAD_DESC_EN <=", value, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnLike(String value) {
            addCriterion("ABROAD_DESC_EN like", value, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnNotLike(String value) {
            addCriterion("ABROAD_DESC_EN not like", value, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnIn(List<String> values) {
            addCriterion("ABROAD_DESC_EN in", values, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnNotIn(List<String> values) {
            addCriterion("ABROAD_DESC_EN not in", values, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnBetween(String value1, String value2) {
            addCriterion("ABROAD_DESC_EN between", value1, value2, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andAbroadDescEnNotBetween(String value1, String value2) {
            addCriterion("ABROAD_DESC_EN not between", value1, value2, "abroadDescEn");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIsNull() {
            addCriterion("BUSINESS_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIsNotNull() {
            addCriterion("BUSINESS_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessModelEqualTo(String value) {
            addCriterion("BUSINESS_MODEL =", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotEqualTo(String value) {
            addCriterion("BUSINESS_MODEL <>", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelGreaterThan(String value) {
            addCriterion("BUSINESS_MODEL >", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_MODEL >=", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLessThan(String value) {
            addCriterion("BUSINESS_MODEL <", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_MODEL <=", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLike(String value) {
            addCriterion("BUSINESS_MODEL like", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotLike(String value) {
            addCriterion("BUSINESS_MODEL not like", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIn(List<String> values) {
            addCriterion("BUSINESS_MODEL in", values, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotIn(List<String> values) {
            addCriterion("BUSINESS_MODEL not in", values, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelBetween(String value1, String value2) {
            addCriterion("BUSINESS_MODEL between", value1, value2, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_MODEL not between", value1, value2, "businessModel");
            return (Criteria) this;
        }

        public Criteria andProdlineIdIsNull() {
            addCriterion("PRODLINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdlineIdIsNotNull() {
            addCriterion("PRODLINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineIdEqualTo(Integer value) {
            addCriterion("PRODLINE_ID =", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdNotEqualTo(Integer value) {
            addCriterion("PRODLINE_ID <>", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdGreaterThan(Integer value) {
            addCriterion("PRODLINE_ID >", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODLINE_ID >=", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdLessThan(Integer value) {
            addCriterion("PRODLINE_ID <", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODLINE_ID <=", value, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdIn(List<Integer> values) {
            addCriterion("PRODLINE_ID in", values, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdNotIn(List<Integer> values) {
            addCriterion("PRODLINE_ID not in", values, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODLINE_ID between", value1, value2, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODLINE_ID not between", value1, value2, "prodlineId");
            return (Criteria) this;
        }

        public Criteria andProdlineNoIsNull() {
            addCriterion("PRODLINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andProdlineNoIsNotNull() {
            addCriterion("PRODLINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineNoEqualTo(String value) {
            addCriterion("PRODLINE_NO =", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoNotEqualTo(String value) {
            addCriterion("PRODLINE_NO <>", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoGreaterThan(String value) {
            addCriterion("PRODLINE_NO >", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE_NO >=", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoLessThan(String value) {
            addCriterion("PRODLINE_NO <", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE_NO <=", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoLike(String value) {
            addCriterion("PRODLINE_NO like", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoNotLike(String value) {
            addCriterion("PRODLINE_NO not like", value, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoIn(List<String> values) {
            addCriterion("PRODLINE_NO in", values, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoNotIn(List<String> values) {
            addCriterion("PRODLINE_NO not in", values, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoBetween(String value1, String value2) {
            addCriterion("PRODLINE_NO between", value1, value2, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNoNotBetween(String value1, String value2) {
            addCriterion("PRODLINE_NO not between", value1, value2, "prodlineNo");
            return (Criteria) this;
        }

        public Criteria andProdlineNameIsNull() {
            addCriterion("PRODLINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProdlineNameIsNotNull() {
            addCriterion("PRODLINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineNameEqualTo(String value) {
            addCriterion("PRODLINE_NAME =", value, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameNotEqualTo(String value) {
            addCriterion("PRODLINE_NAME <>", value, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameGreaterThan(String value) {
            addCriterion("PRODLINE_NAME >", value, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE_NAME >=", value, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameLessThan(String value) {
            addCriterion("PRODLINE_NAME <", value, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE_NAME <=", value, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameLike(String value) {
            addCriterion("PRODLINE_NAME like", value, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameNotLike(String value) {
            addCriterion("PRODLINE_NAME not like", value, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameIn(List<String> values) {
            addCriterion("PRODLINE_NAME in", values, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameNotIn(List<String> values) {
            addCriterion("PRODLINE_NAME not in", values, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameBetween(String value1, String value2) {
            addCriterion("PRODLINE_NAME between", value1, value2, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdlineNameNotBetween(String value1, String value2) {
            addCriterion("PRODLINE_NAME not between", value1, value2, "prodlineName");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("PROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("PROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("PROD_NAME =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("PROD_NAME <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("PROD_NAME >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_NAME >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("PROD_NAME <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("PROD_NAME <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("PROD_NAME like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("PROD_NAME not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("PROD_NAME in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("PROD_NAME not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("PROD_NAME between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("PROD_NAME not between", value1, value2, "prodName");
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

        public Criteria andDatasourceIsNull() {
            addCriterion("DataSource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("DataSource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("DataSource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("DataSource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("DataSource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("DataSource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("DataSource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("DataSource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("DataSource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("DataSource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("DataSource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("DataSource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("DataSource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("DataSource not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andPdtIdIsNull() {
            addCriterion("PDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPdtIdIsNotNull() {
            addCriterion("PDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPdtIdEqualTo(Integer value) {
            addCriterion("PDT_ID =", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdNotEqualTo(Integer value) {
            addCriterion("PDT_ID <>", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdGreaterThan(Integer value) {
            addCriterion("PDT_ID >", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PDT_ID >=", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdLessThan(Integer value) {
            addCriterion("PDT_ID <", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdLessThanOrEqualTo(Integer value) {
            addCriterion("PDT_ID <=", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdIn(List<Integer> values) {
            addCriterion("PDT_ID in", values, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdNotIn(List<Integer> values) {
            addCriterion("PDT_ID not in", values, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdBetween(Integer value1, Integer value2) {
            addCriterion("PDT_ID between", value1, value2, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PDT_ID not between", value1, value2, "pdtId");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateIsNull() {
            addCriterion("PROCESSMGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateIsNotNull() {
            addCriterion("PROCESSMGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateEqualTo(Date value) {
            addCriterion("PROCESSMGN_DATE =", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateNotEqualTo(Date value) {
            addCriterion("PROCESSMGN_DATE <>", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateGreaterThan(Date value) {
            addCriterion("PROCESSMGN_DATE >", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PROCESSMGN_DATE >=", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateLessThan(Date value) {
            addCriterion("PROCESSMGN_DATE <", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateLessThanOrEqualTo(Date value) {
            addCriterion("PROCESSMGN_DATE <=", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateIn(List<Date> values) {
            addCriterion("PROCESSMGN_DATE in", values, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateNotIn(List<Date> values) {
            addCriterion("PROCESSMGN_DATE not in", values, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateBetween(Date value1, Date value2) {
            addCriterion("PROCESSMGN_DATE between", value1, value2, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateNotBetween(Date value1, Date value2) {
            addCriterion("PROCESSMGN_DATE not between", value1, value2, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNull() {
            addCriterion("APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNotNull() {
            addCriterion("APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeEqualTo(String value) {
            addCriterion("APPLY_CODE =", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotEqualTo(String value) {
            addCriterion("APPLY_CODE <>", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThan(String value) {
            addCriterion("APPLY_CODE >", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE >=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThan(String value) {
            addCriterion("APPLY_CODE <", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE <=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLike(String value) {
            addCriterion("APPLY_CODE like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotLike(String value) {
            addCriterion("APPLY_CODE not like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIn(List<String> values) {
            addCriterion("APPLY_CODE in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotIn(List<String> values) {
            addCriterion("APPLY_CODE not in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeBetween(String value1, String value2) {
            addCriterion("APPLY_CODE between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_CODE not between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNull() {
            addCriterion("HANDLER is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("HANDLER is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("HANDLER =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("HANDLER <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("HANDLER >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLER >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("HANDLER <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("HANDLER <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("HANDLER like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("HANDLER not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("HANDLER in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("HANDLER not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("HANDLER between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("HANDLER not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andSubSignIsNull() {
            addCriterion("SUB_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andSubSignIsNotNull() {
            addCriterion("SUB_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSubSignEqualTo(String value) {
            addCriterion("SUB_SIGN =", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignNotEqualTo(String value) {
            addCriterion("SUB_SIGN <>", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignGreaterThan(String value) {
            addCriterion("SUB_SIGN >", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_SIGN >=", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignLessThan(String value) {
            addCriterion("SUB_SIGN <", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignLessThanOrEqualTo(String value) {
            addCriterion("SUB_SIGN <=", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignLike(String value) {
            addCriterion("SUB_SIGN like", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignNotLike(String value) {
            addCriterion("SUB_SIGN not like", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignIn(List<String> values) {
            addCriterion("SUB_SIGN in", values, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignNotIn(List<String> values) {
            addCriterion("SUB_SIGN not in", values, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignBetween(String value1, String value2) {
            addCriterion("SUB_SIGN between", value1, value2, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignNotBetween(String value1, String value2) {
            addCriterion("SUB_SIGN not between", value1, value2, "subSign");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIsNull() {
            addCriterion("APPLY_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIsNotNull() {
            addCriterion("APPLY_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonEqualTo(String value) {
            addCriterion("APPLY_PERSON =", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotEqualTo(String value) {
            addCriterion("APPLY_PERSON <>", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonGreaterThan(String value) {
            addCriterion("APPLY_PERSON >", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_PERSON >=", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLessThan(String value) {
            addCriterion("APPLY_PERSON <", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLessThanOrEqualTo(String value) {
            addCriterion("APPLY_PERSON <=", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLike(String value) {
            addCriterion("APPLY_PERSON like", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotLike(String value) {
            addCriterion("APPLY_PERSON not like", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIn(List<String> values) {
            addCriterion("APPLY_PERSON in", values, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotIn(List<String> values) {
            addCriterion("APPLY_PERSON not in", values, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonBetween(String value1, String value2) {
            addCriterion("APPLY_PERSON between", value1, value2, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotBetween(String value1, String value2) {
            addCriterion("APPLY_PERSON not between", value1, value2, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNull() {
            addCriterion("DEPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNotNull() {
            addCriterion("DEPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeEqualTo(String value) {
            addCriterion("DEPT_TYPE =", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotEqualTo(String value) {
            addCriterion("DEPT_TYPE <>", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThan(String value) {
            addCriterion("DEPT_TYPE >", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE >=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThan(String value) {
            addCriterion("DEPT_TYPE <", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE <=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLike(String value) {
            addCriterion("DEPT_TYPE like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotLike(String value) {
            addCriterion("DEPT_TYPE not like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIn(List<String> values) {
            addCriterion("DEPT_TYPE in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotIn(List<String> values) {
            addCriterion("DEPT_TYPE not in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
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