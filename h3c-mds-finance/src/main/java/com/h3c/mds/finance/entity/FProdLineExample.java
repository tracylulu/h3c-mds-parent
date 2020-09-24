package com.h3c.mds.finance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FProdLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FProdLineExample() {
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

        public Criteria andProdlineDescIsNull() {
            addCriterion("PRODLINE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProdlineDescIsNotNull() {
            addCriterion("PRODLINE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEqualTo(String value) {
            addCriterion("PRODLINE_DESC =", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescNotEqualTo(String value) {
            addCriterion("PRODLINE_DESC <>", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescGreaterThan(String value) {
            addCriterion("PRODLINE_DESC >", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE_DESC >=", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescLessThan(String value) {
            addCriterion("PRODLINE_DESC <", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE_DESC <=", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescLike(String value) {
            addCriterion("PRODLINE_DESC like", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescNotLike(String value) {
            addCriterion("PRODLINE_DESC not like", value, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescIn(List<String> values) {
            addCriterion("PRODLINE_DESC in", values, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescNotIn(List<String> values) {
            addCriterion("PRODLINE_DESC not in", values, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescBetween(String value1, String value2) {
            addCriterion("PRODLINE_DESC between", value1, value2, "prodlineDesc");
            return (Criteria) this;
        }

        public Criteria andProdlineDescNotBetween(String value1, String value2) {
            addCriterion("PRODLINE_DESC not between", value1, value2, "prodlineDesc");
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

        public Criteria andProdlineCodeIsNull() {
            addCriterion("PRODLINE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeIsNotNull() {
            addCriterion("PRODLINE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeEqualTo(String value) {
            addCriterion("PRODLINE_CODE =", value, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeNotEqualTo(String value) {
            addCriterion("PRODLINE_CODE <>", value, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeGreaterThan(String value) {
            addCriterion("PRODLINE_CODE >", value, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE_CODE >=", value, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeLessThan(String value) {
            addCriterion("PRODLINE_CODE <", value, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE_CODE <=", value, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeLike(String value) {
            addCriterion("PRODLINE_CODE like", value, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeNotLike(String value) {
            addCriterion("PRODLINE_CODE not like", value, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeIn(List<String> values) {
            addCriterion("PRODLINE_CODE in", values, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeNotIn(List<String> values) {
            addCriterion("PRODLINE_CODE not in", values, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeBetween(String value1, String value2) {
            addCriterion("PRODLINE_CODE between", value1, value2, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andProdlineCodeNotBetween(String value1, String value2) {
            addCriterion("PRODLINE_CODE not between", value1, value2, "prodlineCode");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNull() {
            addCriterion("SYNC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNotNull() {
            addCriterion("SYNC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusEqualTo(String value) {
            addCriterion("SYNC_STATUS =", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotEqualTo(String value) {
            addCriterion("SYNC_STATUS <>", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThan(String value) {
            addCriterion("SYNC_STATUS >", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_STATUS >=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThan(String value) {
            addCriterion("SYNC_STATUS <", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThanOrEqualTo(String value) {
            addCriterion("SYNC_STATUS <=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLike(String value) {
            addCriterion("SYNC_STATUS like", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotLike(String value) {
            addCriterion("SYNC_STATUS not like", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIn(List<String> values) {
            addCriterion("SYNC_STATUS in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotIn(List<String> values) {
            addCriterion("SYNC_STATUS not in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusBetween(String value1, String value2) {
            addCriterion("SYNC_STATUS between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotBetween(String value1, String value2) {
            addCriterion("SYNC_STATUS not between", value1, value2, "syncStatus");
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

        public Criteria andProdlineDescEnIsNull() {
            addCriterion("PRODLINE_DESC_EN is null");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnIsNotNull() {
            addCriterion("PRODLINE_DESC_EN is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnEqualTo(String value) {
            addCriterion("PRODLINE_DESC_EN =", value, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnNotEqualTo(String value) {
            addCriterion("PRODLINE_DESC_EN <>", value, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnGreaterThan(String value) {
            addCriterion("PRODLINE_DESC_EN >", value, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE_DESC_EN >=", value, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnLessThan(String value) {
            addCriterion("PRODLINE_DESC_EN <", value, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE_DESC_EN <=", value, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnLike(String value) {
            addCriterion("PRODLINE_DESC_EN like", value, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnNotLike(String value) {
            addCriterion("PRODLINE_DESC_EN not like", value, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnIn(List<String> values) {
            addCriterion("PRODLINE_DESC_EN in", values, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnNotIn(List<String> values) {
            addCriterion("PRODLINE_DESC_EN not in", values, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnBetween(String value1, String value2) {
            addCriterion("PRODLINE_DESC_EN between", value1, value2, "prodlineDescEn");
            return (Criteria) this;
        }

        public Criteria andProdlineDescEnNotBetween(String value1, String value2) {
            addCriterion("PRODLINE_DESC_EN not between", value1, value2, "prodlineDescEn");
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