package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectCodeProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectCodeProcessExample() {
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

        public Criteria andApplyNoIsNull() {
            addCriterion("apply_no is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(String value) {
            addCriterion("apply_no =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(String value) {
            addCriterion("apply_no <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(String value) {
            addCriterion("apply_no >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("apply_no >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(String value) {
            addCriterion("apply_no <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(String value) {
            addCriterion("apply_no <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLike(String value) {
            addCriterion("apply_no like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotLike(String value) {
            addCriterion("apply_no not like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<String> values) {
            addCriterion("apply_no in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<String> values) {
            addCriterion("apply_no not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(String value1, String value2) {
            addCriterion("apply_no between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(String value1, String value2) {
            addCriterion("apply_no not between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andCurStatusIsNull() {
            addCriterion("cur_status is null");
            return (Criteria) this;
        }

        public Criteria andCurStatusIsNotNull() {
            addCriterion("cur_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurStatusEqualTo(String value) {
            addCriterion("cur_status =", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusNotEqualTo(String value) {
            addCriterion("cur_status <>", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusGreaterThan(String value) {
            addCriterion("cur_status >", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cur_status >=", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusLessThan(String value) {
            addCriterion("cur_status <", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusLessThanOrEqualTo(String value) {
            addCriterion("cur_status <=", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusLike(String value) {
            addCriterion("cur_status like", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusNotLike(String value) {
            addCriterion("cur_status not like", value, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusIn(List<String> values) {
            addCriterion("cur_status in", values, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusNotIn(List<String> values) {
            addCriterion("cur_status not in", values, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusBetween(String value1, String value2) {
            addCriterion("cur_status between", value1, value2, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurStatusNotBetween(String value1, String value2) {
            addCriterion("cur_status not between", value1, value2, "curStatus");
            return (Criteria) this;
        }

        public Criteria andCurDealIsNull() {
            addCriterion("cur_deal is null");
            return (Criteria) this;
        }

        public Criteria andCurDealIsNotNull() {
            addCriterion("cur_deal is not null");
            return (Criteria) this;
        }

        public Criteria andCurDealEqualTo(String value) {
            addCriterion("cur_deal =", value, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealNotEqualTo(String value) {
            addCriterion("cur_deal <>", value, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealGreaterThan(String value) {
            addCriterion("cur_deal >", value, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealGreaterThanOrEqualTo(String value) {
            addCriterion("cur_deal >=", value, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealLessThan(String value) {
            addCriterion("cur_deal <", value, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealLessThanOrEqualTo(String value) {
            addCriterion("cur_deal <=", value, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealLike(String value) {
            addCriterion("cur_deal like", value, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealNotLike(String value) {
            addCriterion("cur_deal not like", value, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealIn(List<String> values) {
            addCriterion("cur_deal in", values, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealNotIn(List<String> values) {
            addCriterion("cur_deal not in", values, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealBetween(String value1, String value2) {
            addCriterion("cur_deal between", value1, value2, "curDeal");
            return (Criteria) this;
        }

        public Criteria andCurDealNotBetween(String value1, String value2) {
            addCriterion("cur_deal not between", value1, value2, "curDeal");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceIsNull() {
            addCriterion("finance_interface is null");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceIsNotNull() {
            addCriterion("finance_interface is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceEqualTo(String value) {
            addCriterion("finance_interface =", value, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceNotEqualTo(String value) {
            addCriterion("finance_interface <>", value, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceGreaterThan(String value) {
            addCriterion("finance_interface >", value, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("finance_interface >=", value, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceLessThan(String value) {
            addCriterion("finance_interface <", value, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceLessThanOrEqualTo(String value) {
            addCriterion("finance_interface <=", value, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceLike(String value) {
            addCriterion("finance_interface like", value, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceNotLike(String value) {
            addCriterion("finance_interface not like", value, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceIn(List<String> values) {
            addCriterion("finance_interface in", values, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceNotIn(List<String> values) {
            addCriterion("finance_interface not in", values, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceBetween(String value1, String value2) {
            addCriterion("finance_interface between", value1, value2, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceNotBetween(String value1, String value2) {
            addCriterion("finance_interface not between", value1, value2, "financeInterface");
            return (Criteria) this;
        }

        public Criteria andFinancerIsNull() {
            addCriterion("financer is null");
            return (Criteria) this;
        }

        public Criteria andFinancerIsNotNull() {
            addCriterion("financer is not null");
            return (Criteria) this;
        }

        public Criteria andFinancerEqualTo(String value) {
            addCriterion("financer =", value, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerNotEqualTo(String value) {
            addCriterion("financer <>", value, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerGreaterThan(String value) {
            addCriterion("financer >", value, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerGreaterThanOrEqualTo(String value) {
            addCriterion("financer >=", value, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerLessThan(String value) {
            addCriterion("financer <", value, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerLessThanOrEqualTo(String value) {
            addCriterion("financer <=", value, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerLike(String value) {
            addCriterion("financer like", value, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerNotLike(String value) {
            addCriterion("financer not like", value, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerIn(List<String> values) {
            addCriterion("financer in", values, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerNotIn(List<String> values) {
            addCriterion("financer not in", values, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerBetween(String value1, String value2) {
            addCriterion("financer between", value1, value2, "financer");
            return (Criteria) this;
        }

        public Criteria andFinancerNotBetween(String value1, String value2) {
            addCriterion("financer not between", value1, value2, "financer");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeIsNull() {
            addCriterion("project_office is null");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeIsNotNull() {
            addCriterion("project_office is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeEqualTo(String value) {
            addCriterion("project_office =", value, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeNotEqualTo(String value) {
            addCriterion("project_office <>", value, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeGreaterThan(String value) {
            addCriterion("project_office >", value, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("project_office >=", value, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeLessThan(String value) {
            addCriterion("project_office <", value, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeLessThanOrEqualTo(String value) {
            addCriterion("project_office <=", value, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeLike(String value) {
            addCriterion("project_office like", value, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeNotLike(String value) {
            addCriterion("project_office not like", value, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeIn(List<String> values) {
            addCriterion("project_office in", values, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeNotIn(List<String> values) {
            addCriterion("project_office not in", values, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeBetween(String value1, String value2) {
            addCriterion("project_office between", value1, value2, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeNotBetween(String value1, String value2) {
            addCriterion("project_office not between", value1, value2, "projectOffice");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestIsNull() {
            addCriterion("approver_suggest is null");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestIsNotNull() {
            addCriterion("approver_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestEqualTo(String value) {
            addCriterion("approver_suggest =", value, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestNotEqualTo(String value) {
            addCriterion("approver_suggest <>", value, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestGreaterThan(String value) {
            addCriterion("approver_suggest >", value, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("approver_suggest >=", value, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestLessThan(String value) {
            addCriterion("approver_suggest <", value, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestLessThanOrEqualTo(String value) {
            addCriterion("approver_suggest <=", value, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestLike(String value) {
            addCriterion("approver_suggest like", value, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestNotLike(String value) {
            addCriterion("approver_suggest not like", value, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestIn(List<String> values) {
            addCriterion("approver_suggest in", values, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestNotIn(List<String> values) {
            addCriterion("approver_suggest not in", values, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestBetween(String value1, String value2) {
            addCriterion("approver_suggest between", value1, value2, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andApproverSuggestNotBetween(String value1, String value2) {
            addCriterion("approver_suggest not between", value1, value2, "approverSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestIsNull() {
            addCriterion("finance_interface_suggest is null");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestIsNotNull() {
            addCriterion("finance_interface_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestEqualTo(String value) {
            addCriterion("finance_interface_suggest =", value, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestNotEqualTo(String value) {
            addCriterion("finance_interface_suggest <>", value, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestGreaterThan(String value) {
            addCriterion("finance_interface_suggest >", value, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("finance_interface_suggest >=", value, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestLessThan(String value) {
            addCriterion("finance_interface_suggest <", value, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestLessThanOrEqualTo(String value) {
            addCriterion("finance_interface_suggest <=", value, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestLike(String value) {
            addCriterion("finance_interface_suggest like", value, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestNotLike(String value) {
            addCriterion("finance_interface_suggest not like", value, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestIn(List<String> values) {
            addCriterion("finance_interface_suggest in", values, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestNotIn(List<String> values) {
            addCriterion("finance_interface_suggest not in", values, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestBetween(String value1, String value2) {
            addCriterion("finance_interface_suggest between", value1, value2, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinanceInterfaceSuggestNotBetween(String value1, String value2) {
            addCriterion("finance_interface_suggest not between", value1, value2, "financeInterfaceSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestIsNull() {
            addCriterion("financer_suggest is null");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestIsNotNull() {
            addCriterion("financer_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestEqualTo(String value) {
            addCriterion("financer_suggest =", value, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestNotEqualTo(String value) {
            addCriterion("financer_suggest <>", value, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestGreaterThan(String value) {
            addCriterion("financer_suggest >", value, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("financer_suggest >=", value, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestLessThan(String value) {
            addCriterion("financer_suggest <", value, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestLessThanOrEqualTo(String value) {
            addCriterion("financer_suggest <=", value, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestLike(String value) {
            addCriterion("financer_suggest like", value, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestNotLike(String value) {
            addCriterion("financer_suggest not like", value, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestIn(List<String> values) {
            addCriterion("financer_suggest in", values, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestNotIn(List<String> values) {
            addCriterion("financer_suggest not in", values, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestBetween(String value1, String value2) {
            addCriterion("financer_suggest between", value1, value2, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andFinancerSuggestNotBetween(String value1, String value2) {
            addCriterion("financer_suggest not between", value1, value2, "financerSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestIsNull() {
            addCriterion("project_office_suggest is null");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestIsNotNull() {
            addCriterion("project_office_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestEqualTo(String value) {
            addCriterion("project_office_suggest =", value, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestNotEqualTo(String value) {
            addCriterion("project_office_suggest <>", value, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestGreaterThan(String value) {
            addCriterion("project_office_suggest >", value, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("project_office_suggest >=", value, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestLessThan(String value) {
            addCriterion("project_office_suggest <", value, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestLessThanOrEqualTo(String value) {
            addCriterion("project_office_suggest <=", value, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestLike(String value) {
            addCriterion("project_office_suggest like", value, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestNotLike(String value) {
            addCriterion("project_office_suggest not like", value, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestIn(List<String> values) {
            addCriterion("project_office_suggest in", values, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestNotIn(List<String> values) {
            addCriterion("project_office_suggest not in", values, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestBetween(String value1, String value2) {
            addCriterion("project_office_suggest between", value1, value2, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProjectOfficeSuggestNotBetween(String value1, String value2) {
            addCriterion("project_office_suggest not between", value1, value2, "projectOfficeSuggest");
            return (Criteria) this;
        }

        public Criteria andProcessMngIsNull() {
            addCriterion("process_mng is null");
            return (Criteria) this;
        }

        public Criteria andProcessMngIsNotNull() {
            addCriterion("process_mng is not null");
            return (Criteria) this;
        }

        public Criteria andProcessMngEqualTo(String value) {
            addCriterion("process_mng =", value, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngNotEqualTo(String value) {
            addCriterion("process_mng <>", value, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngGreaterThan(String value) {
            addCriterion("process_mng >", value, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngGreaterThanOrEqualTo(String value) {
            addCriterion("process_mng >=", value, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngLessThan(String value) {
            addCriterion("process_mng <", value, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngLessThanOrEqualTo(String value) {
            addCriterion("process_mng <=", value, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngLike(String value) {
            addCriterion("process_mng like", value, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngNotLike(String value) {
            addCriterion("process_mng not like", value, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngIn(List<String> values) {
            addCriterion("process_mng in", values, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngNotIn(List<String> values) {
            addCriterion("process_mng not in", values, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngBetween(String value1, String value2) {
            addCriterion("process_mng between", value1, value2, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessMngNotBetween(String value1, String value2) {
            addCriterion("process_mng not between", value1, value2, "processMng");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdIsNull() {
            addCriterion("process_ins_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdIsNotNull() {
            addCriterion("process_ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdEqualTo(String value) {
            addCriterion("process_ins_id =", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdNotEqualTo(String value) {
            addCriterion("process_ins_id <>", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdGreaterThan(String value) {
            addCriterion("process_ins_id >", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_ins_id >=", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdLessThan(String value) {
            addCriterion("process_ins_id <", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdLessThanOrEqualTo(String value) {
            addCriterion("process_ins_id <=", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdLike(String value) {
            addCriterion("process_ins_id like", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdNotLike(String value) {
            addCriterion("process_ins_id not like", value, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdIn(List<String> values) {
            addCriterion("process_ins_id in", values, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdNotIn(List<String> values) {
            addCriterion("process_ins_id not in", values, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdBetween(String value1, String value2) {
            addCriterion("process_ins_id between", value1, value2, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProcessInsIdNotBetween(String value1, String value2) {
            addCriterion("process_ins_id not between", value1, value2, "processInsId");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestIsNull() {
            addCriterion("projMng_suggest is null");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestIsNotNull() {
            addCriterion("projMng_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestEqualTo(String value) {
            addCriterion("projMng_suggest =", value, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestNotEqualTo(String value) {
            addCriterion("projMng_suggest <>", value, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestGreaterThan(String value) {
            addCriterion("projMng_suggest >", value, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("projMng_suggest >=", value, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestLessThan(String value) {
            addCriterion("projMng_suggest <", value, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestLessThanOrEqualTo(String value) {
            addCriterion("projMng_suggest <=", value, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestLike(String value) {
            addCriterion("projMng_suggest like", value, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestNotLike(String value) {
            addCriterion("projMng_suggest not like", value, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestIn(List<String> values) {
            addCriterion("projMng_suggest in", values, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestNotIn(List<String> values) {
            addCriterion("projMng_suggest not in", values, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestBetween(String value1, String value2) {
            addCriterion("projMng_suggest between", value1, value2, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjmngSuggestNotBetween(String value1, String value2) {
            addCriterion("projMng_suggest not between", value1, value2, "projmngSuggest");
            return (Criteria) this;
        }

        public Criteria andProjMngIsNull() {
            addCriterion("proj_mng is null");
            return (Criteria) this;
        }

        public Criteria andProjMngIsNotNull() {
            addCriterion("proj_mng is not null");
            return (Criteria) this;
        }

        public Criteria andProjMngEqualTo(String value) {
            addCriterion("proj_mng =", value, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngNotEqualTo(String value) {
            addCriterion("proj_mng <>", value, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngGreaterThan(String value) {
            addCriterion("proj_mng >", value, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngGreaterThanOrEqualTo(String value) {
            addCriterion("proj_mng >=", value, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngLessThan(String value) {
            addCriterion("proj_mng <", value, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngLessThanOrEqualTo(String value) {
            addCriterion("proj_mng <=", value, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngLike(String value) {
            addCriterion("proj_mng like", value, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngNotLike(String value) {
            addCriterion("proj_mng not like", value, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngIn(List<String> values) {
            addCriterion("proj_mng in", values, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngNotIn(List<String> values) {
            addCriterion("proj_mng not in", values, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngBetween(String value1, String value2) {
            addCriterion("proj_mng between", value1, value2, "projMng");
            return (Criteria) this;
        }

        public Criteria andProjMngNotBetween(String value1, String value2) {
            addCriterion("proj_mng not between", value1, value2, "projMng");
            return (Criteria) this;
        }

        public Criteria andApplyerIsNull() {
            addCriterion("applyer is null");
            return (Criteria) this;
        }

        public Criteria andApplyerIsNotNull() {
            addCriterion("applyer is not null");
            return (Criteria) this;
        }

        public Criteria andApplyerEqualTo(String value) {
            addCriterion("applyer =", value, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerNotEqualTo(String value) {
            addCriterion("applyer <>", value, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerGreaterThan(String value) {
            addCriterion("applyer >", value, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerGreaterThanOrEqualTo(String value) {
            addCriterion("applyer >=", value, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerLessThan(String value) {
            addCriterion("applyer <", value, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerLessThanOrEqualTo(String value) {
            addCriterion("applyer <=", value, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerLike(String value) {
            addCriterion("applyer like", value, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerNotLike(String value) {
            addCriterion("applyer not like", value, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerIn(List<String> values) {
            addCriterion("applyer in", values, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerNotIn(List<String> values) {
            addCriterion("applyer not in", values, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerBetween(String value1, String value2) {
            addCriterion("applyer between", value1, value2, "applyer");
            return (Criteria) this;
        }

        public Criteria andApplyerNotBetween(String value1, String value2) {
            addCriterion("applyer not between", value1, value2, "applyer");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNull() {
            addCriterion("opt_type is null");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNotNull() {
            addCriterion("opt_type is not null");
            return (Criteria) this;
        }

        public Criteria andOptTypeEqualTo(String value) {
            addCriterion("opt_type =", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotEqualTo(String value) {
            addCriterion("opt_type <>", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThan(String value) {
            addCriterion("opt_type >", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("opt_type >=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThan(String value) {
            addCriterion("opt_type <", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThanOrEqualTo(String value) {
            addCriterion("opt_type <=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLike(String value) {
            addCriterion("opt_type like", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotLike(String value) {
            addCriterion("opt_type not like", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeIn(List<String> values) {
            addCriterion("opt_type in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotIn(List<String> values) {
            addCriterion("opt_type not in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeBetween(String value1, String value2) {
            addCriterion("opt_type between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotBetween(String value1, String value2) {
            addCriterion("opt_type not between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andApplyCountIsNull() {
            addCriterion("apply_count is null");
            return (Criteria) this;
        }

        public Criteria andApplyCountIsNotNull() {
            addCriterion("apply_count is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCountEqualTo(Integer value) {
            addCriterion("apply_count =", value, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountNotEqualTo(Integer value) {
            addCriterion("apply_count <>", value, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountGreaterThan(Integer value) {
            addCriterion("apply_count >", value, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_count >=", value, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountLessThan(Integer value) {
            addCriterion("apply_count <", value, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("apply_count <=", value, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountIn(List<Integer> values) {
            addCriterion("apply_count in", values, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountNotIn(List<Integer> values) {
            addCriterion("apply_count not in", values, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountBetween(Integer value1, Integer value2) {
            addCriterion("apply_count between", value1, value2, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_count not between", value1, value2, "applyCount");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeIsNull() {
            addCriterion("proj_mng_time is null");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeIsNotNull() {
            addCriterion("proj_mng_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeEqualTo(Date value) {
            addCriterion("proj_mng_time =", value, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeNotEqualTo(Date value) {
            addCriterion("proj_mng_time <>", value, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeGreaterThan(Date value) {
            addCriterion("proj_mng_time >", value, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proj_mng_time >=", value, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeLessThan(Date value) {
            addCriterion("proj_mng_time <", value, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeLessThanOrEqualTo(Date value) {
            addCriterion("proj_mng_time <=", value, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeIn(List<Date> values) {
            addCriterion("proj_mng_time in", values, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeNotIn(List<Date> values) {
            addCriterion("proj_mng_time not in", values, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeBetween(Date value1, Date value2) {
            addCriterion("proj_mng_time between", value1, value2, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjMngTimeNotBetween(Date value1, Date value2) {
            addCriterion("proj_mng_time not between", value1, value2, "projMngTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeIsNull() {
            addCriterion("proj_fin_interface_time is null");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeIsNotNull() {
            addCriterion("proj_fin_interface_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeEqualTo(Date value) {
            addCriterion("proj_fin_interface_time =", value, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeNotEqualTo(Date value) {
            addCriterion("proj_fin_interface_time <>", value, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeGreaterThan(Date value) {
            addCriterion("proj_fin_interface_time >", value, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proj_fin_interface_time >=", value, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeLessThan(Date value) {
            addCriterion("proj_fin_interface_time <", value, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeLessThanOrEqualTo(Date value) {
            addCriterion("proj_fin_interface_time <=", value, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeIn(List<Date> values) {
            addCriterion("proj_fin_interface_time in", values, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeNotIn(List<Date> values) {
            addCriterion("proj_fin_interface_time not in", values, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeBetween(Date value1, Date value2) {
            addCriterion("proj_fin_interface_time between", value1, value2, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinInterfaceTimeNotBetween(Date value1, Date value2) {
            addCriterion("proj_fin_interface_time not between", value1, value2, "projFinInterfaceTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeIsNull() {
            addCriterion("proj_fin_time is null");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeIsNotNull() {
            addCriterion("proj_fin_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeEqualTo(Date value) {
            addCriterion("proj_fin_time =", value, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeNotEqualTo(Date value) {
            addCriterion("proj_fin_time <>", value, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeGreaterThan(Date value) {
            addCriterion("proj_fin_time >", value, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proj_fin_time >=", value, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeLessThan(Date value) {
            addCriterion("proj_fin_time <", value, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeLessThanOrEqualTo(Date value) {
            addCriterion("proj_fin_time <=", value, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeIn(List<Date> values) {
            addCriterion("proj_fin_time in", values, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeNotIn(List<Date> values) {
            addCriterion("proj_fin_time not in", values, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeBetween(Date value1, Date value2) {
            addCriterion("proj_fin_time between", value1, value2, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjFinTimeNotBetween(Date value1, Date value2) {
            addCriterion("proj_fin_time not between", value1, value2, "projFinTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeIsNull() {
            addCriterion("proj_office_time is null");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeIsNotNull() {
            addCriterion("proj_office_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeEqualTo(Date value) {
            addCriterion("proj_office_time =", value, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeNotEqualTo(Date value) {
            addCriterion("proj_office_time <>", value, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeGreaterThan(Date value) {
            addCriterion("proj_office_time >", value, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proj_office_time >=", value, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeLessThan(Date value) {
            addCriterion("proj_office_time <", value, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeLessThanOrEqualTo(Date value) {
            addCriterion("proj_office_time <=", value, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeIn(List<Date> values) {
            addCriterion("proj_office_time in", values, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeNotIn(List<Date> values) {
            addCriterion("proj_office_time not in", values, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeBetween(Date value1, Date value2) {
            addCriterion("proj_office_time between", value1, value2, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjOfficeTimeNotBetween(Date value1, Date value2) {
            addCriterion("proj_office_time not between", value1, value2, "projOfficeTime");
            return (Criteria) this;
        }

        public Criteria andProjMngShowIsNull() {
            addCriterion("proj_mng_show is null");
            return (Criteria) this;
        }

        public Criteria andProjMngShowIsNotNull() {
            addCriterion("proj_mng_show is not null");
            return (Criteria) this;
        }

        public Criteria andProjMngShowEqualTo(String value) {
            addCriterion("proj_mng_show =", value, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowNotEqualTo(String value) {
            addCriterion("proj_mng_show <>", value, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowGreaterThan(String value) {
            addCriterion("proj_mng_show >", value, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowGreaterThanOrEqualTo(String value) {
            addCriterion("proj_mng_show >=", value, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowLessThan(String value) {
            addCriterion("proj_mng_show <", value, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowLessThanOrEqualTo(String value) {
            addCriterion("proj_mng_show <=", value, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowLike(String value) {
            addCriterion("proj_mng_show like", value, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowNotLike(String value) {
            addCriterion("proj_mng_show not like", value, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowIn(List<String> values) {
            addCriterion("proj_mng_show in", values, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowNotIn(List<String> values) {
            addCriterion("proj_mng_show not in", values, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowBetween(String value1, String value2) {
            addCriterion("proj_mng_show between", value1, value2, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andProjMngShowNotBetween(String value1, String value2) {
            addCriterion("proj_mng_show not between", value1, value2, "projMngShow");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAssignSignIsNull() {
            addCriterion("assign_Sign is null");
            return (Criteria) this;
        }

        public Criteria andAssignSignIsNotNull() {
            addCriterion("assign_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andAssignSignEqualTo(String value) {
            addCriterion("assign_Sign =", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignNotEqualTo(String value) {
            addCriterion("assign_Sign <>", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignGreaterThan(String value) {
            addCriterion("assign_Sign >", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignGreaterThanOrEqualTo(String value) {
            addCriterion("assign_Sign >=", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignLessThan(String value) {
            addCriterion("assign_Sign <", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignLessThanOrEqualTo(String value) {
            addCriterion("assign_Sign <=", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignLike(String value) {
            addCriterion("assign_Sign like", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignNotLike(String value) {
            addCriterion("assign_Sign not like", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignIn(List<String> values) {
            addCriterion("assign_Sign in", values, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignNotIn(List<String> values) {
            addCriterion("assign_Sign not in", values, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignBetween(String value1, String value2) {
            addCriterion("assign_Sign between", value1, value2, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignNotBetween(String value1, String value2) {
            addCriterion("assign_Sign not between", value1, value2, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignDateIsNull() {
            addCriterion("assign_Date is null");
            return (Criteria) this;
        }

        public Criteria andAssignDateIsNotNull() {
            addCriterion("assign_Date is not null");
            return (Criteria) this;
        }

        public Criteria andAssignDateEqualTo(Date value) {
            addCriterion("assign_Date =", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotEqualTo(Date value) {
            addCriterion("assign_Date <>", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateGreaterThan(Date value) {
            addCriterion("assign_Date >", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("assign_Date >=", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateLessThan(Date value) {
            addCriterion("assign_Date <", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateLessThanOrEqualTo(Date value) {
            addCriterion("assign_Date <=", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateIn(List<Date> values) {
            addCriterion("assign_Date in", values, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotIn(List<Date> values) {
            addCriterion("assign_Date not in", values, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateBetween(Date value1, Date value2) {
            addCriterion("assign_Date between", value1, value2, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotBetween(Date value1, Date value2) {
            addCriterion("assign_Date not between", value1, value2, "assignDate");
            return (Criteria) this;
        }

        public Criteria andIsEditIsNull() {
            addCriterion("is_edit is null");
            return (Criteria) this;
        }

        public Criteria andIsEditIsNotNull() {
            addCriterion("is_edit is not null");
            return (Criteria) this;
        }

        public Criteria andIsEditEqualTo(String value) {
            addCriterion("is_edit =", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotEqualTo(String value) {
            addCriterion("is_edit <>", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditGreaterThan(String value) {
            addCriterion("is_edit >", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditGreaterThanOrEqualTo(String value) {
            addCriterion("is_edit >=", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLessThan(String value) {
            addCriterion("is_edit <", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLessThanOrEqualTo(String value) {
            addCriterion("is_edit <=", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLike(String value) {
            addCriterion("is_edit like", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotLike(String value) {
            addCriterion("is_edit not like", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditIn(List<String> values) {
            addCriterion("is_edit in", values, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotIn(List<String> values) {
            addCriterion("is_edit not in", values, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditBetween(String value1, String value2) {
            addCriterion("is_edit between", value1, value2, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotBetween(String value1, String value2) {
            addCriterion("is_edit not between", value1, value2, "isEdit");
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