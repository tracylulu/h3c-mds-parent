package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartCodeApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartCodeApplyExample() {
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

        public Criteria andDatasourceIsNull() {
            addCriterion("datasource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("datasource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("datasource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("datasource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("datasource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("datasource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("datasource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("datasource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("datasource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("datasource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("datasource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("datasource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("datasource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("datasource not between", value1, value2, "datasource");
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

        public Criteria andProdIdIsNull() {
            addCriterion("PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(Integer value) {
            addCriterion("PROD_ID =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Integer value) {
            addCriterion("PROD_ID <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Integer value) {
            addCriterion("PROD_ID >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROD_ID >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Integer value) {
            addCriterion("PROD_ID <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROD_ID <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Integer> values) {
            addCriterion("PROD_ID in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Integer> values) {
            addCriterion("PROD_ID not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Integer value1, Integer value2) {
            addCriterion("PROD_ID between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROD_ID not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdIsNull() {
            addCriterion("FPROD_CODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdIsNotNull() {
            addCriterion("FPROD_CODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdEqualTo(Integer value) {
            addCriterion("FPROD_CODE_ID =", value, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdNotEqualTo(Integer value) {
            addCriterion("FPROD_CODE_ID <>", value, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdGreaterThan(Integer value) {
            addCriterion("FPROD_CODE_ID >", value, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPROD_CODE_ID >=", value, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdLessThan(Integer value) {
            addCriterion("FPROD_CODE_ID <", value, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("FPROD_CODE_ID <=", value, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdIn(List<Integer> values) {
            addCriterion("FPROD_CODE_ID in", values, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdNotIn(List<Integer> values) {
            addCriterion("FPROD_CODE_ID not in", values, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("FPROD_CODE_ID between", value1, value2, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andFprodCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FPROD_CODE_ID not between", value1, value2, "fprodCodeId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdIsNull() {
            addCriterion("BUSINESS_MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdIsNotNull() {
            addCriterion("BUSINESS_MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdEqualTo(String value) {
            addCriterion("BUSINESS_MODEL_ID =", value, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdNotEqualTo(String value) {
            addCriterion("BUSINESS_MODEL_ID <>", value, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdGreaterThan(String value) {
            addCriterion("BUSINESS_MODEL_ID >", value, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_MODEL_ID >=", value, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdLessThan(String value) {
            addCriterion("BUSINESS_MODEL_ID <", value, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_MODEL_ID <=", value, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdLike(String value) {
            addCriterion("BUSINESS_MODEL_ID like", value, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdNotLike(String value) {
            addCriterion("BUSINESS_MODEL_ID not like", value, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdIn(List<String> values) {
            addCriterion("BUSINESS_MODEL_ID in", values, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdNotIn(List<String> values) {
            addCriterion("BUSINESS_MODEL_ID not in", values, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdBetween(String value1, String value2) {
            addCriterion("BUSINESS_MODEL_ID between", value1, value2, "businessModelId");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIdNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_MODEL_ID not between", value1, value2, "businessModelId");
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