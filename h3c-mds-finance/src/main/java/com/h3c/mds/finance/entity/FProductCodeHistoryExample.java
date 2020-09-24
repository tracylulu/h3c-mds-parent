package com.h3c.mds.finance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FProductCodeHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FProductCodeHistoryExample() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andPdtNameIsNull() {
            addCriterion("PDT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPdtNameIsNotNull() {
            addCriterion("PDT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPdtNameEqualTo(String value) {
            addCriterion("PDT_NAME =", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotEqualTo(String value) {
            addCriterion("PDT_NAME <>", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameGreaterThan(String value) {
            addCriterion("PDT_NAME >", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_NAME >=", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLessThan(String value) {
            addCriterion("PDT_NAME <", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLessThanOrEqualTo(String value) {
            addCriterion("PDT_NAME <=", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLike(String value) {
            addCriterion("PDT_NAME like", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotLike(String value) {
            addCriterion("PDT_NAME not like", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameIn(List<String> values) {
            addCriterion("PDT_NAME in", values, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotIn(List<String> values) {
            addCriterion("PDT_NAME not in", values, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameBetween(String value1, String value2) {
            addCriterion("PDT_NAME between", value1, value2, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotBetween(String value1, String value2) {
            addCriterion("PDT_NAME not between", value1, value2, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNoIsNull() {
            addCriterion("PDT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPdtNoIsNotNull() {
            addCriterion("PDT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPdtNoEqualTo(String value) {
            addCriterion("PDT_NO =", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotEqualTo(String value) {
            addCriterion("PDT_NO <>", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoGreaterThan(String value) {
            addCriterion("PDT_NO >", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_NO >=", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLessThan(String value) {
            addCriterion("PDT_NO <", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLessThanOrEqualTo(String value) {
            addCriterion("PDT_NO <=", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLike(String value) {
            addCriterion("PDT_NO like", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotLike(String value) {
            addCriterion("PDT_NO not like", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoIn(List<String> values) {
            addCriterion("PDT_NO in", values, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotIn(List<String> values) {
            addCriterion("PDT_NO not in", values, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoBetween(String value1, String value2) {
            addCriterion("PDT_NO between", value1, value2, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotBetween(String value1, String value2) {
            addCriterion("PDT_NO not between", value1, value2, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtMngIsNull() {
            addCriterion("PDT_MNG is null");
            return (Criteria) this;
        }

        public Criteria andPdtMngIsNotNull() {
            addCriterion("PDT_MNG is not null");
            return (Criteria) this;
        }

        public Criteria andPdtMngEqualTo(String value) {
            addCriterion("PDT_MNG =", value, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngNotEqualTo(String value) {
            addCriterion("PDT_MNG <>", value, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngGreaterThan(String value) {
            addCriterion("PDT_MNG >", value, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_MNG >=", value, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngLessThan(String value) {
            addCriterion("PDT_MNG <", value, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngLessThanOrEqualTo(String value) {
            addCriterion("PDT_MNG <=", value, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngLike(String value) {
            addCriterion("PDT_MNG like", value, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngNotLike(String value) {
            addCriterion("PDT_MNG not like", value, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngIn(List<String> values) {
            addCriterion("PDT_MNG in", values, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngNotIn(List<String> values) {
            addCriterion("PDT_MNG not in", values, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngBetween(String value1, String value2) {
            addCriterion("PDT_MNG between", value1, value2, "pdtMng");
            return (Criteria) this;
        }

        public Criteria andPdtMngNotBetween(String value1, String value2) {
            addCriterion("PDT_MNG not between", value1, value2, "pdtMng");
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

        public Criteria andProductNoIsNull() {
            addCriterion("PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("PRODUCT_NO =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("PRODUCT_NO <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("PRODUCT_NO >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("PRODUCT_NO <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("PRODUCT_NO like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("PRODUCT_NO not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("PRODUCT_NO in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("PRODUCT_NO not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO not between", value1, value2, "productNo");
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

        public Criteria andProductNameEnIsNull() {
            addCriterion("PRODUCT_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andProductNameEnIsNotNull() {
            addCriterion("PRODUCT_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEnEqualTo(String value) {
            addCriterion("PRODUCT_NAME_EN =", value, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME_EN <>", value, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnGreaterThan(String value) {
            addCriterion("PRODUCT_NAME_EN >", value, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME_EN >=", value, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnLessThan(String value) {
            addCriterion("PRODUCT_NAME_EN <", value, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME_EN <=", value, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnLike(String value) {
            addCriterion("PRODUCT_NAME_EN like", value, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnNotLike(String value) {
            addCriterion("PRODUCT_NAME_EN not like", value, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnIn(List<String> values) {
            addCriterion("PRODUCT_NAME_EN in", values, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME_EN not in", values, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME_EN between", value1, value2, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andProductNameEnNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME_EN not between", value1, value2, "productNameEn");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIsNull() {
            addCriterion("BASIS_MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIsNotNull() {
            addCriterion("BASIS_MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialEqualTo(String value) {
            addCriterion("BASIS_MATERIAL =", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialNotEqualTo(String value) {
            addCriterion("BASIS_MATERIAL <>", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialGreaterThan(String value) {
            addCriterion("BASIS_MATERIAL >", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("BASIS_MATERIAL >=", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialLessThan(String value) {
            addCriterion("BASIS_MATERIAL <", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialLessThanOrEqualTo(String value) {
            addCriterion("BASIS_MATERIAL <=", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialLike(String value) {
            addCriterion("BASIS_MATERIAL like", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialNotLike(String value) {
            addCriterion("BASIS_MATERIAL not like", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIn(List<String> values) {
            addCriterion("BASIS_MATERIAL in", values, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialNotIn(List<String> values) {
            addCriterion("BASIS_MATERIAL not in", values, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialBetween(String value1, String value2) {
            addCriterion("BASIS_MATERIAL between", value1, value2, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialNotBetween(String value1, String value2) {
            addCriterion("BASIS_MATERIAL not between", value1, value2, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBomCodeIsNull() {
            addCriterion("BOM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBomCodeIsNotNull() {
            addCriterion("BOM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBomCodeEqualTo(String value) {
            addCriterion("BOM_CODE =", value, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeNotEqualTo(String value) {
            addCriterion("BOM_CODE <>", value, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeGreaterThan(String value) {
            addCriterion("BOM_CODE >", value, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BOM_CODE >=", value, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeLessThan(String value) {
            addCriterion("BOM_CODE <", value, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeLessThanOrEqualTo(String value) {
            addCriterion("BOM_CODE <=", value, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeLike(String value) {
            addCriterion("BOM_CODE like", value, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeNotLike(String value) {
            addCriterion("BOM_CODE not like", value, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeIn(List<String> values) {
            addCriterion("BOM_CODE in", values, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeNotIn(List<String> values) {
            addCriterion("BOM_CODE not in", values, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeBetween(String value1, String value2) {
            addCriterion("BOM_CODE between", value1, value2, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomCodeNotBetween(String value1, String value2) {
            addCriterion("BOM_CODE not between", value1, value2, "bomCode");
            return (Criteria) this;
        }

        public Criteria andBomDescIsNull() {
            addCriterion("BOM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBomDescIsNotNull() {
            addCriterion("BOM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBomDescEqualTo(String value) {
            addCriterion("BOM_DESC =", value, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescNotEqualTo(String value) {
            addCriterion("BOM_DESC <>", value, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescGreaterThan(String value) {
            addCriterion("BOM_DESC >", value, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescGreaterThanOrEqualTo(String value) {
            addCriterion("BOM_DESC >=", value, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescLessThan(String value) {
            addCriterion("BOM_DESC <", value, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescLessThanOrEqualTo(String value) {
            addCriterion("BOM_DESC <=", value, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescLike(String value) {
            addCriterion("BOM_DESC like", value, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescNotLike(String value) {
            addCriterion("BOM_DESC not like", value, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescIn(List<String> values) {
            addCriterion("BOM_DESC in", values, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescNotIn(List<String> values) {
            addCriterion("BOM_DESC not in", values, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescBetween(String value1, String value2) {
            addCriterion("BOM_DESC between", value1, value2, "bomDesc");
            return (Criteria) this;
        }

        public Criteria andBomDescNotBetween(String value1, String value2) {
            addCriterion("BOM_DESC not between", value1, value2, "bomDesc");
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

        public Criteria andOrderByIsNull() {
            addCriterion("ORDER_BY is null");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNotNull() {
            addCriterion("ORDER_BY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByEqualTo(Integer value) {
            addCriterion("ORDER_BY =", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotEqualTo(Integer value) {
            addCriterion("ORDER_BY <>", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThan(Integer value) {
            addCriterion("ORDER_BY >", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_BY >=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThan(Integer value) {
            addCriterion("ORDER_BY <", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_BY <=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByIn(List<Integer> values) {
            addCriterion("ORDER_BY in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotIn(List<Integer> values) {
            addCriterion("ORDER_BY not in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_BY between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_BY not between", value1, value2, "orderBy");
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

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeIsNull() {
            addCriterion("OLD_PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeIsNotNull() {
            addCriterion("OLD_PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeEqualTo(String value) {
            addCriterion("OLD_PRODUCT_CODE =", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeNotEqualTo(String value) {
            addCriterion("OLD_PRODUCT_CODE <>", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeGreaterThan(String value) {
            addCriterion("OLD_PRODUCT_CODE >", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_CODE >=", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeLessThan(String value) {
            addCriterion("OLD_PRODUCT_CODE <", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeLessThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_CODE <=", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeLike(String value) {
            addCriterion("OLD_PRODUCT_CODE like", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeNotLike(String value) {
            addCriterion("OLD_PRODUCT_CODE not like", value, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeIn(List<String> values) {
            addCriterion("OLD_PRODUCT_CODE in", values, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeNotIn(List<String> values) {
            addCriterion("OLD_PRODUCT_CODE not in", values, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_CODE between", value1, value2, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProductCodeNotBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_CODE not between", value1, value2, "oldProductCode");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameIsNull() {
            addCriterion("OLD_PRODLINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameIsNotNull() {
            addCriterion("OLD_PRODLINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameEqualTo(String value) {
            addCriterion("OLD_PRODLINE_NAME =", value, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameNotEqualTo(String value) {
            addCriterion("OLD_PRODLINE_NAME <>", value, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameGreaterThan(String value) {
            addCriterion("OLD_PRODLINE_NAME >", value, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PRODLINE_NAME >=", value, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameLessThan(String value) {
            addCriterion("OLD_PRODLINE_NAME <", value, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameLessThanOrEqualTo(String value) {
            addCriterion("OLD_PRODLINE_NAME <=", value, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameLike(String value) {
            addCriterion("OLD_PRODLINE_NAME like", value, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameNotLike(String value) {
            addCriterion("OLD_PRODLINE_NAME not like", value, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameIn(List<String> values) {
            addCriterion("OLD_PRODLINE_NAME in", values, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameNotIn(List<String> values) {
            addCriterion("OLD_PRODLINE_NAME not in", values, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameBetween(String value1, String value2) {
            addCriterion("OLD_PRODLINE_NAME between", value1, value2, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNameNotBetween(String value1, String value2) {
            addCriterion("OLD_PRODLINE_NAME not between", value1, value2, "oldProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameIsNull() {
            addCriterion("OLD_PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOldProductNameIsNotNull() {
            addCriterion("OLD_PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME =", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameNotEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME <>", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameGreaterThan(String value) {
            addCriterion("OLD_PRODUCT_NAME >", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME >=", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameLessThan(String value) {
            addCriterion("OLD_PRODUCT_NAME <", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameLessThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME <=", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameLike(String value) {
            addCriterion("OLD_PRODUCT_NAME like", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameNotLike(String value) {
            addCriterion("OLD_PRODUCT_NAME not like", value, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameIn(List<String> values) {
            addCriterion("OLD_PRODUCT_NAME in", values, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameNotIn(List<String> values) {
            addCriterion("OLD_PRODUCT_NAME not in", values, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_NAME between", value1, value2, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldProductNameNotBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_NAME not between", value1, value2, "oldProductName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameIsNull() {
            addCriterion("OLD_PDT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameIsNotNull() {
            addCriterion("OLD_PDT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameEqualTo(String value) {
            addCriterion("OLD_PDT_NAME =", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameNotEqualTo(String value) {
            addCriterion("OLD_PDT_NAME <>", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameGreaterThan(String value) {
            addCriterion("OLD_PDT_NAME >", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PDT_NAME >=", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameLessThan(String value) {
            addCriterion("OLD_PDT_NAME <", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameLessThanOrEqualTo(String value) {
            addCriterion("OLD_PDT_NAME <=", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameLike(String value) {
            addCriterion("OLD_PDT_NAME like", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameNotLike(String value) {
            addCriterion("OLD_PDT_NAME not like", value, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameIn(List<String> values) {
            addCriterion("OLD_PDT_NAME in", values, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameNotIn(List<String> values) {
            addCriterion("OLD_PDT_NAME not in", values, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameBetween(String value1, String value2) {
            addCriterion("OLD_PDT_NAME between", value1, value2, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNameNotBetween(String value1, String value2) {
            addCriterion("OLD_PDT_NAME not between", value1, value2, "oldPdtName");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoIsNull() {
            addCriterion("OLD_PDT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoIsNotNull() {
            addCriterion("OLD_PDT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoEqualTo(String value) {
            addCriterion("OLD_PDT_NO =", value, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoNotEqualTo(String value) {
            addCriterion("OLD_PDT_NO <>", value, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoGreaterThan(String value) {
            addCriterion("OLD_PDT_NO >", value, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PDT_NO >=", value, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoLessThan(String value) {
            addCriterion("OLD_PDT_NO <", value, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoLessThanOrEqualTo(String value) {
            addCriterion("OLD_PDT_NO <=", value, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoLike(String value) {
            addCriterion("OLD_PDT_NO like", value, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoNotLike(String value) {
            addCriterion("OLD_PDT_NO not like", value, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoIn(List<String> values) {
            addCriterion("OLD_PDT_NO in", values, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoNotIn(List<String> values) {
            addCriterion("OLD_PDT_NO not in", values, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoBetween(String value1, String value2) {
            addCriterion("OLD_PDT_NO between", value1, value2, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtNoNotBetween(String value1, String value2) {
            addCriterion("OLD_PDT_NO not between", value1, value2, "oldPdtNo");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngIsNull() {
            addCriterion("OLD_PDT_MNG is null");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngIsNotNull() {
            addCriterion("OLD_PDT_MNG is not null");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngEqualTo(String value) {
            addCriterion("OLD_PDT_MNG =", value, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngNotEqualTo(String value) {
            addCriterion("OLD_PDT_MNG <>", value, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngGreaterThan(String value) {
            addCriterion("OLD_PDT_MNG >", value, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PDT_MNG >=", value, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngLessThan(String value) {
            addCriterion("OLD_PDT_MNG <", value, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngLessThanOrEqualTo(String value) {
            addCriterion("OLD_PDT_MNG <=", value, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngLike(String value) {
            addCriterion("OLD_PDT_MNG like", value, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngNotLike(String value) {
            addCriterion("OLD_PDT_MNG not like", value, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngIn(List<String> values) {
            addCriterion("OLD_PDT_MNG in", values, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngNotIn(List<String> values) {
            addCriterion("OLD_PDT_MNG not in", values, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngBetween(String value1, String value2) {
            addCriterion("OLD_PDT_MNG between", value1, value2, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldPdtMngNotBetween(String value1, String value2) {
            addCriterion("OLD_PDT_MNG not between", value1, value2, "oldPdtMng");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoIsNull() {
            addCriterion("OLD_PRODLINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoIsNotNull() {
            addCriterion("OLD_PRODLINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoEqualTo(String value) {
            addCriterion("OLD_PRODLINE_NO =", value, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoNotEqualTo(String value) {
            addCriterion("OLD_PRODLINE_NO <>", value, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoGreaterThan(String value) {
            addCriterion("OLD_PRODLINE_NO >", value, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PRODLINE_NO >=", value, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoLessThan(String value) {
            addCriterion("OLD_PRODLINE_NO <", value, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoLessThanOrEqualTo(String value) {
            addCriterion("OLD_PRODLINE_NO <=", value, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoLike(String value) {
            addCriterion("OLD_PRODLINE_NO like", value, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoNotLike(String value) {
            addCriterion("OLD_PRODLINE_NO not like", value, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoIn(List<String> values) {
            addCriterion("OLD_PRODLINE_NO in", values, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoNotIn(List<String> values) {
            addCriterion("OLD_PRODLINE_NO not in", values, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoBetween(String value1, String value2) {
            addCriterion("OLD_PRODLINE_NO between", value1, value2, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProdlineNoNotBetween(String value1, String value2) {
            addCriterion("OLD_PRODLINE_NO not between", value1, value2, "oldProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoIsNull() {
            addCriterion("OLD_PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOldProductNoIsNotNull() {
            addCriterion("OLD_PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOldProductNoEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NO =", value, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoNotEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NO <>", value, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoGreaterThan(String value) {
            addCriterion("OLD_PRODUCT_NO >", value, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NO >=", value, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoLessThan(String value) {
            addCriterion("OLD_PRODUCT_NO <", value, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoLessThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NO <=", value, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoLike(String value) {
            addCriterion("OLD_PRODUCT_NO like", value, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoNotLike(String value) {
            addCriterion("OLD_PRODUCT_NO not like", value, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoIn(List<String> values) {
            addCriterion("OLD_PRODUCT_NO in", values, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoNotIn(List<String> values) {
            addCriterion("OLD_PRODUCT_NO not in", values, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_NO between", value1, value2, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNoNotBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_NO not between", value1, value2, "oldProductNo");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnIsNull() {
            addCriterion("OLD_PRODUCT_NAME_CN is null");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnIsNotNull() {
            addCriterion("OLD_PRODUCT_NAME_CN is not null");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME_CN =", value, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnNotEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME_CN <>", value, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnGreaterThan(String value) {
            addCriterion("OLD_PRODUCT_NAME_CN >", value, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME_CN >=", value, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnLessThan(String value) {
            addCriterion("OLD_PRODUCT_NAME_CN <", value, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnLessThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME_CN <=", value, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnLike(String value) {
            addCriterion("OLD_PRODUCT_NAME_CN like", value, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnNotLike(String value) {
            addCriterion("OLD_PRODUCT_NAME_CN not like", value, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnIn(List<String> values) {
            addCriterion("OLD_PRODUCT_NAME_CN in", values, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnNotIn(List<String> values) {
            addCriterion("OLD_PRODUCT_NAME_CN not in", values, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_NAME_CN between", value1, value2, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameCnNotBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_NAME_CN not between", value1, value2, "oldProductNameCn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnIsNull() {
            addCriterion("OLD_PRODUCT_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnIsNotNull() {
            addCriterion("OLD_PRODUCT_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME_EN =", value, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnNotEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME_EN <>", value, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnGreaterThan(String value) {
            addCriterion("OLD_PRODUCT_NAME_EN >", value, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME_EN >=", value, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnLessThan(String value) {
            addCriterion("OLD_PRODUCT_NAME_EN <", value, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnLessThanOrEqualTo(String value) {
            addCriterion("OLD_PRODUCT_NAME_EN <=", value, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnLike(String value) {
            addCriterion("OLD_PRODUCT_NAME_EN like", value, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnNotLike(String value) {
            addCriterion("OLD_PRODUCT_NAME_EN not like", value, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnIn(List<String> values) {
            addCriterion("OLD_PRODUCT_NAME_EN in", values, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnNotIn(List<String> values) {
            addCriterion("OLD_PRODUCT_NAME_EN not in", values, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_NAME_EN between", value1, value2, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldProductNameEnNotBetween(String value1, String value2) {
            addCriterion("OLD_PRODUCT_NAME_EN not between", value1, value2, "oldProductNameEn");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeIsNull() {
            addCriterion("OLD_BOM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeIsNotNull() {
            addCriterion("OLD_BOM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeEqualTo(String value) {
            addCriterion("OLD_BOM_CODE =", value, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeNotEqualTo(String value) {
            addCriterion("OLD_BOM_CODE <>", value, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeGreaterThan(String value) {
            addCriterion("OLD_BOM_CODE >", value, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_BOM_CODE >=", value, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeLessThan(String value) {
            addCriterion("OLD_BOM_CODE <", value, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeLessThanOrEqualTo(String value) {
            addCriterion("OLD_BOM_CODE <=", value, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeLike(String value) {
            addCriterion("OLD_BOM_CODE like", value, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeNotLike(String value) {
            addCriterion("OLD_BOM_CODE not like", value, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeIn(List<String> values) {
            addCriterion("OLD_BOM_CODE in", values, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeNotIn(List<String> values) {
            addCriterion("OLD_BOM_CODE not in", values, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeBetween(String value1, String value2) {
            addCriterion("OLD_BOM_CODE between", value1, value2, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomCodeNotBetween(String value1, String value2) {
            addCriterion("OLD_BOM_CODE not between", value1, value2, "oldBomCode");
            return (Criteria) this;
        }

        public Criteria andOldBomDescIsNull() {
            addCriterion("OLD_BOM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andOldBomDescIsNotNull() {
            addCriterion("OLD_BOM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andOldBomDescEqualTo(String value) {
            addCriterion("OLD_BOM_DESC =", value, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescNotEqualTo(String value) {
            addCriterion("OLD_BOM_DESC <>", value, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescGreaterThan(String value) {
            addCriterion("OLD_BOM_DESC >", value, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_BOM_DESC >=", value, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescLessThan(String value) {
            addCriterion("OLD_BOM_DESC <", value, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescLessThanOrEqualTo(String value) {
            addCriterion("OLD_BOM_DESC <=", value, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescLike(String value) {
            addCriterion("OLD_BOM_DESC like", value, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescNotLike(String value) {
            addCriterion("OLD_BOM_DESC not like", value, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescIn(List<String> values) {
            addCriterion("OLD_BOM_DESC in", values, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescNotIn(List<String> values) {
            addCriterion("OLD_BOM_DESC not in", values, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescBetween(String value1, String value2) {
            addCriterion("OLD_BOM_DESC between", value1, value2, "oldBomDesc");
            return (Criteria) this;
        }

        public Criteria andOldBomDescNotBetween(String value1, String value2) {
            addCriterion("OLD_BOM_DESC not between", value1, value2, "oldBomDesc");
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

        public Criteria andEffectDateIsNull() {
            addCriterion("EFFECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNotNull() {
            addCriterion("EFFECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectDateEqualTo(Date value) {
            addCriterion("EFFECT_DATE =", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotEqualTo(Date value) {
            addCriterion("EFFECT_DATE <>", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThan(Date value) {
            addCriterion("EFFECT_DATE >", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECT_DATE >=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThan(Date value) {
            addCriterion("EFFECT_DATE <", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThanOrEqualTo(Date value) {
            addCriterion("EFFECT_DATE <=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateIn(List<Date> values) {
            addCriterion("EFFECT_DATE in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotIn(List<Date> values) {
            addCriterion("EFFECT_DATE not in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateBetween(Date value1, Date value2) {
            addCriterion("EFFECT_DATE between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotBetween(Date value1, Date value2) {
            addCriterion("EFFECT_DATE not between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdIsNull() {
            addCriterion("BASIS_MATERIAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdIsNotNull() {
            addCriterion("BASIS_MATERIAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdEqualTo(String value) {
            addCriterion("BASIS_MATERIAL_ID =", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdNotEqualTo(String value) {
            addCriterion("BASIS_MATERIAL_ID <>", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdGreaterThan(String value) {
            addCriterion("BASIS_MATERIAL_ID >", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdGreaterThanOrEqualTo(String value) {
            addCriterion("BASIS_MATERIAL_ID >=", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdLessThan(String value) {
            addCriterion("BASIS_MATERIAL_ID <", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdLessThanOrEqualTo(String value) {
            addCriterion("BASIS_MATERIAL_ID <=", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdLike(String value) {
            addCriterion("BASIS_MATERIAL_ID like", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdNotLike(String value) {
            addCriterion("BASIS_MATERIAL_ID not like", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdIn(List<String> values) {
            addCriterion("BASIS_MATERIAL_ID in", values, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdNotIn(List<String> values) {
            addCriterion("BASIS_MATERIAL_ID not in", values, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdBetween(String value1, String value2) {
            addCriterion("BASIS_MATERIAL_ID between", value1, value2, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdNotBetween(String value1, String value2) {
            addCriterion("BASIS_MATERIAL_ID not between", value1, value2, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andFprodNoIsNull() {
            addCriterion("FPROD_NO is null");
            return (Criteria) this;
        }

        public Criteria andFprodNoIsNotNull() {
            addCriterion("FPROD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFprodNoEqualTo(String value) {
            addCriterion("FPROD_NO =", value, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoNotEqualTo(String value) {
            addCriterion("FPROD_NO <>", value, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoGreaterThan(String value) {
            addCriterion("FPROD_NO >", value, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoGreaterThanOrEqualTo(String value) {
            addCriterion("FPROD_NO >=", value, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoLessThan(String value) {
            addCriterion("FPROD_NO <", value, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoLessThanOrEqualTo(String value) {
            addCriterion("FPROD_NO <=", value, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoLike(String value) {
            addCriterion("FPROD_NO like", value, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoNotLike(String value) {
            addCriterion("FPROD_NO not like", value, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoIn(List<String> values) {
            addCriterion("FPROD_NO in", values, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoNotIn(List<String> values) {
            addCriterion("FPROD_NO not in", values, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoBetween(String value1, String value2) {
            addCriterion("FPROD_NO between", value1, value2, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andFprodNoNotBetween(String value1, String value2) {
            addCriterion("FPROD_NO not between", value1, value2, "fprodNo");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIsNull() {
            addCriterion("APPLY_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIsNotNull() {
            addCriterion("APPLY_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptEqualTo(String value) {
            addCriterion("APPLY_DEPT =", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotEqualTo(String value) {
            addCriterion("APPLY_DEPT <>", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptGreaterThan(String value) {
            addCriterion("APPLY_DEPT >", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT >=", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLessThan(String value) {
            addCriterion("APPLY_DEPT <", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT <=", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLike(String value) {
            addCriterion("APPLY_DEPT like", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotLike(String value) {
            addCriterion("APPLY_DEPT not like", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIn(List<String> values) {
            addCriterion("APPLY_DEPT in", values, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotIn(List<String> values) {
            addCriterion("APPLY_DEPT not in", values, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT between", value1, value2, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT not between", value1, value2, "applyDept");
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
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

        public Criteria andOldProdlineIdIsNull() {
            addCriterion("OLD_PRODLINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdIsNotNull() {
            addCriterion("OLD_PRODLINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdEqualTo(Integer value) {
            addCriterion("OLD_PRODLINE_ID =", value, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdNotEqualTo(Integer value) {
            addCriterion("OLD_PRODLINE_ID <>", value, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdGreaterThan(Integer value) {
            addCriterion("OLD_PRODLINE_ID >", value, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLD_PRODLINE_ID >=", value, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdLessThan(Integer value) {
            addCriterion("OLD_PRODLINE_ID <", value, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("OLD_PRODLINE_ID <=", value, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdIn(List<Integer> values) {
            addCriterion("OLD_PRODLINE_ID in", values, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdNotIn(List<Integer> values) {
            addCriterion("OLD_PRODLINE_ID not in", values, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdBetween(Integer value1, Integer value2) {
            addCriterion("OLD_PRODLINE_ID between", value1, value2, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProdlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OLD_PRODLINE_ID not between", value1, value2, "oldProdlineId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdIsNull() {
            addCriterion("OLD_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldProductIdIsNotNull() {
            addCriterion("OLD_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldProductIdEqualTo(Integer value) {
            addCriterion("OLD_PRODUCT_ID =", value, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdNotEqualTo(Integer value) {
            addCriterion("OLD_PRODUCT_ID <>", value, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdGreaterThan(Integer value) {
            addCriterion("OLD_PRODUCT_ID >", value, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLD_PRODUCT_ID >=", value, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdLessThan(Integer value) {
            addCriterion("OLD_PRODUCT_ID <", value, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("OLD_PRODUCT_ID <=", value, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdIn(List<Integer> values) {
            addCriterion("OLD_PRODUCT_ID in", values, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdNotIn(List<Integer> values) {
            addCriterion("OLD_PRODUCT_ID not in", values, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdBetween(Integer value1, Integer value2) {
            addCriterion("OLD_PRODUCT_ID between", value1, value2, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OLD_PRODUCT_ID not between", value1, value2, "oldProductId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdIsNull() {
            addCriterion("OLD_PDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdIsNotNull() {
            addCriterion("OLD_PDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdEqualTo(Integer value) {
            addCriterion("OLD_PDT_ID =", value, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdNotEqualTo(Integer value) {
            addCriterion("OLD_PDT_ID <>", value, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdGreaterThan(Integer value) {
            addCriterion("OLD_PDT_ID >", value, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLD_PDT_ID >=", value, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdLessThan(Integer value) {
            addCriterion("OLD_PDT_ID <", value, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdLessThanOrEqualTo(Integer value) {
            addCriterion("OLD_PDT_ID <=", value, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdIn(List<Integer> values) {
            addCriterion("OLD_PDT_ID in", values, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdNotIn(List<Integer> values) {
            addCriterion("OLD_PDT_ID not in", values, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdBetween(Integer value1, Integer value2) {
            addCriterion("OLD_PDT_ID between", value1, value2, "oldPdtId");
            return (Criteria) this;
        }

        public Criteria andOldPdtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OLD_PDT_ID not between", value1, value2, "oldPdtId");
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