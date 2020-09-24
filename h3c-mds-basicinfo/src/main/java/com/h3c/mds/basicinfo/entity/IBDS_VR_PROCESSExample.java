package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_VR_PROCESSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_VR_PROCESSExample() {
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

        public Criteria andHandlerIsNull() {
            addCriterion("Handler is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("Handler is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("Handler =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("Handler <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("Handler >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("Handler >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("Handler <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("Handler <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("Handler like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("Handler not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("Handler in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("Handler not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("Handler between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("Handler not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIsNull() {
            addCriterion("Instanse_ID is null");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIsNotNull() {
            addCriterion("Instanse_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanseIdEqualTo(String value) {
            addCriterion("Instanse_ID =", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotEqualTo(String value) {
            addCriterion("Instanse_ID <>", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdGreaterThan(String value) {
            addCriterion("Instanse_ID >", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdGreaterThanOrEqualTo(String value) {
            addCriterion("Instanse_ID >=", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLessThan(String value) {
            addCriterion("Instanse_ID <", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLessThanOrEqualTo(String value) {
            addCriterion("Instanse_ID <=", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLike(String value) {
            addCriterion("Instanse_ID like", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotLike(String value) {
            addCriterion("Instanse_ID not like", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIn(List<String> values) {
            addCriterion("Instanse_ID in", values, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotIn(List<String> values) {
            addCriterion("Instanse_ID not in", values, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdBetween(String value1, String value2) {
            addCriterion("Instanse_ID between", value1, value2, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotBetween(String value1, String value2) {
            addCriterion("Instanse_ID not between", value1, value2, "instanseId");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeIsNull() {
            addCriterion("CurrentNode is null");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeIsNotNull() {
            addCriterion("CurrentNode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeEqualTo(String value) {
            addCriterion("CurrentNode =", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeNotEqualTo(String value) {
            addCriterion("CurrentNode <>", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeGreaterThan(String value) {
            addCriterion("CurrentNode >", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeGreaterThanOrEqualTo(String value) {
            addCriterion("CurrentNode >=", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeLessThan(String value) {
            addCriterion("CurrentNode <", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeLessThanOrEqualTo(String value) {
            addCriterion("CurrentNode <=", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeLike(String value) {
            addCriterion("CurrentNode like", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeNotLike(String value) {
            addCriterion("CurrentNode not like", value, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeIn(List<String> values) {
            addCriterion("CurrentNode in", values, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeNotIn(List<String> values) {
            addCriterion("CurrentNode not in", values, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeBetween(String value1, String value2) {
            addCriterion("CurrentNode between", value1, value2, "currentnode");
            return (Criteria) this;
        }

        public Criteria andCurrentnodeNotBetween(String value1, String value2) {
            addCriterion("CurrentNode not between", value1, value2, "currentnode");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNull() {
            addCriterion("STATUS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNotNull() {
            addCriterion("STATUS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDescEqualTo(String value) {
            addCriterion("STATUS_DESC =", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotEqualTo(String value) {
            addCriterion("STATUS_DESC <>", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThan(String value) {
            addCriterion("STATUS_DESC >", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_DESC >=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThan(String value) {
            addCriterion("STATUS_DESC <", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThanOrEqualTo(String value) {
            addCriterion("STATUS_DESC <=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLike(String value) {
            addCriterion("STATUS_DESC like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotLike(String value) {
            addCriterion("STATUS_DESC not like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescIn(List<String> values) {
            addCriterion("STATUS_DESC in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotIn(List<String> values) {
            addCriterion("STATUS_DESC not in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescBetween(String value1, String value2) {
            addCriterion("STATUS_DESC between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotBetween(String value1, String value2) {
            addCriterion("STATUS_DESC not between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andFirstSignIsNull() {
            addCriterion("First_Sign is null");
            return (Criteria) this;
        }

        public Criteria andFirstSignIsNotNull() {
            addCriterion("First_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSignEqualTo(String value) {
            addCriterion("First_Sign =", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotEqualTo(String value) {
            addCriterion("First_Sign <>", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignGreaterThan(String value) {
            addCriterion("First_Sign >", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignGreaterThanOrEqualTo(String value) {
            addCriterion("First_Sign >=", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLessThan(String value) {
            addCriterion("First_Sign <", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLessThanOrEqualTo(String value) {
            addCriterion("First_Sign <=", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLike(String value) {
            addCriterion("First_Sign like", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotLike(String value) {
            addCriterion("First_Sign not like", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignIn(List<String> values) {
            addCriterion("First_Sign in", values, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotIn(List<String> values) {
            addCriterion("First_Sign not in", values, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignBetween(String value1, String value2) {
            addCriterion("First_Sign between", value1, value2, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotBetween(String value1, String value2) {
            addCriterion("First_Sign not between", value1, value2, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNull() {
            addCriterion("First_Date is null");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNotNull() {
            addCriterion("First_Date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDateEqualTo(Date value) {
            addCriterion("First_Date =", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotEqualTo(Date value) {
            addCriterion("First_Date <>", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThan(Date value) {
            addCriterion("First_Date >", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThanOrEqualTo(Date value) {
            addCriterion("First_Date >=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThan(Date value) {
            addCriterion("First_Date <", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThanOrEqualTo(Date value) {
            addCriterion("First_Date <=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateIn(List<Date> values) {
            addCriterion("First_Date in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotIn(List<Date> values) {
            addCriterion("First_Date not in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateBetween(Date value1, Date value2) {
            addCriterion("First_Date between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotBetween(Date value1, Date value2) {
            addCriterion("First_Date not between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIsNull() {
            addCriterion("IPMT_Sign is null");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIsNotNull() {
            addCriterion("IPMT_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtSignEqualTo(String value) {
            addCriterion("IPMT_Sign =", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotEqualTo(String value) {
            addCriterion("IPMT_Sign <>", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignGreaterThan(String value) {
            addCriterion("IPMT_Sign >", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Sign >=", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLessThan(String value) {
            addCriterion("IPMT_Sign <", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Sign <=", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLike(String value) {
            addCriterion("IPMT_Sign like", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotLike(String value) {
            addCriterion("IPMT_Sign not like", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIn(List<String> values) {
            addCriterion("IPMT_Sign in", values, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotIn(List<String> values) {
            addCriterion("IPMT_Sign not in", values, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignBetween(String value1, String value2) {
            addCriterion("IPMT_Sign between", value1, value2, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotBetween(String value1, String value2) {
            addCriterion("IPMT_Sign not between", value1, value2, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIsNull() {
            addCriterion("IPMT_Date is null");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIsNotNull() {
            addCriterion("IPMT_Date is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtDateEqualTo(Date value) {
            addCriterion("IPMT_Date =", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotEqualTo(Date value) {
            addCriterion("IPMT_Date <>", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateGreaterThan(Date value) {
            addCriterion("IPMT_Date >", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("IPMT_Date >=", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateLessThan(Date value) {
            addCriterion("IPMT_Date <", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateLessThanOrEqualTo(Date value) {
            addCriterion("IPMT_Date <=", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIn(List<Date> values) {
            addCriterion("IPMT_Date in", values, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotIn(List<Date> values) {
            addCriterion("IPMT_Date not in", values, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateBetween(Date value1, Date value2) {
            addCriterion("IPMT_Date between", value1, value2, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotBetween(Date value1, Date value2) {
            addCriterion("IPMT_Date not between", value1, value2, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIsNull() {
            addCriterion("IPMT_Opinion is null");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIsNotNull() {
            addCriterion("IPMT_Opinion is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionEqualTo(String value) {
            addCriterion("IPMT_Opinion =", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotEqualTo(String value) {
            addCriterion("IPMT_Opinion <>", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionGreaterThan(String value) {
            addCriterion("IPMT_Opinion >", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Opinion >=", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLessThan(String value) {
            addCriterion("IPMT_Opinion <", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Opinion <=", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLike(String value) {
            addCriterion("IPMT_Opinion like", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotLike(String value) {
            addCriterion("IPMT_Opinion not like", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIn(List<String> values) {
            addCriterion("IPMT_Opinion in", values, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotIn(List<String> values) {
            addCriterion("IPMT_Opinion not in", values, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionBetween(String value1, String value2) {
            addCriterion("IPMT_Opinion between", value1, value2, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotBetween(String value1, String value2) {
            addCriterion("IPMT_Opinion not between", value1, value2, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIsNull() {
            addCriterion("IPMT_Result is null");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIsNotNull() {
            addCriterion("IPMT_Result is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtResultEqualTo(String value) {
            addCriterion("IPMT_Result =", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotEqualTo(String value) {
            addCriterion("IPMT_Result <>", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultGreaterThan(String value) {
            addCriterion("IPMT_Result >", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Result >=", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLessThan(String value) {
            addCriterion("IPMT_Result <", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Result <=", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLike(String value) {
            addCriterion("IPMT_Result like", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotLike(String value) {
            addCriterion("IPMT_Result not like", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIn(List<String> values) {
            addCriterion("IPMT_Result in", values, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotIn(List<String> values) {
            addCriterion("IPMT_Result not in", values, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultBetween(String value1, String value2) {
            addCriterion("IPMT_Result between", value1, value2, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotBetween(String value1, String value2) {
            addCriterion("IPMT_Result not between", value1, value2, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("Creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("Creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("Creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("Creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("Creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("Creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("Creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("Creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("Creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("Creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("Creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("Creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("Creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("Creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("Modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("Modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("Modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("Modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("Modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("Modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("Modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("Modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("Modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("Modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("Modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("Modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("Modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("Modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("FILE_ID like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("FILE_ID not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
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