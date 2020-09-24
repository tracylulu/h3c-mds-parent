package com.h3c.mds.dept.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IbdsDeptMgnRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IbdsDeptMgnRoleExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class AbstractGeneratedCriteria {
        protected List<Criterion> criteria;

        protected AbstractGeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameengIsNull() {
            addCriterion("NameEng is null");
            return (Criteria) this;
        }

        public Criteria andNameengIsNotNull() {
            addCriterion("NameEng is not null");
            return (Criteria) this;
        }

        public Criteria andNameengEqualTo(String value) {
            addCriterion("NameEng =", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengNotEqualTo(String value) {
            addCriterion("NameEng <>", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengGreaterThan(String value) {
            addCriterion("NameEng >", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengGreaterThanOrEqualTo(String value) {
            addCriterion("NameEng >=", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengLessThan(String value) {
            addCriterion("NameEng <", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengLessThanOrEqualTo(String value) {
            addCriterion("NameEng <=", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengLike(String value) {
            addCriterion("NameEng like", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengNotLike(String value) {
            addCriterion("NameEng not like", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengIn(List<String> values) {
            addCriterion("NameEng in", values, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengNotIn(List<String> values) {
            addCriterion("NameEng not in", values, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengBetween(String value1, String value2) {
            addCriterion("NameEng between", value1, value2, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengNotBetween(String value1, String value2) {
            addCriterion("NameEng not between", value1, value2, "nameeng");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("Manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("Manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("Manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("Manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("Manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("Manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("Manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("Manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("Manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("Manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("Manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("Manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("Manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("Manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andSecretaryIsNull() {
            addCriterion("Secretary is null");
            return (Criteria) this;
        }

        public Criteria andSecretaryIsNotNull() {
            addCriterion("Secretary is not null");
            return (Criteria) this;
        }

        public Criteria andSecretaryEqualTo(String value) {
            addCriterion("Secretary =", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryNotEqualTo(String value) {
            addCriterion("Secretary <>", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryGreaterThan(String value) {
            addCriterion("Secretary >", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryGreaterThanOrEqualTo(String value) {
            addCriterion("Secretary >=", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryLessThan(String value) {
            addCriterion("Secretary <", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryLessThanOrEqualTo(String value) {
            addCriterion("Secretary <=", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryLike(String value) {
            addCriterion("Secretary like", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryNotLike(String value) {
            addCriterion("Secretary not like", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryIn(List<String> values) {
            addCriterion("Secretary in", values, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryNotIn(List<String> values) {
            addCriterion("Secretary not in", values, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryBetween(String value1, String value2) {
            addCriterion("Secretary between", value1, value2, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryNotBetween(String value1, String value2) {
            addCriterion("Secretary not between", value1, value2, "secretary");
            return (Criteria) this;
        }

        public Criteria andDeptplannerIsNull() {
            addCriterion("DeptPlanner is null");
            return (Criteria) this;
        }

        public Criteria andDeptplannerIsNotNull() {
            addCriterion("DeptPlanner is not null");
            return (Criteria) this;
        }

        public Criteria andDeptplannerEqualTo(String value) {
            addCriterion("DeptPlanner =", value, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerNotEqualTo(String value) {
            addCriterion("DeptPlanner <>", value, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerGreaterThan(String value) {
            addCriterion("DeptPlanner >", value, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerGreaterThanOrEqualTo(String value) {
            addCriterion("DeptPlanner >=", value, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerLessThan(String value) {
            addCriterion("DeptPlanner <", value, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerLessThanOrEqualTo(String value) {
            addCriterion("DeptPlanner <=", value, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerLike(String value) {
            addCriterion("DeptPlanner like", value, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerNotLike(String value) {
            addCriterion("DeptPlanner not like", value, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerIn(List<String> values) {
            addCriterion("DeptPlanner in", values, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerNotIn(List<String> values) {
            addCriterion("DeptPlanner not in", values, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerBetween(String value1, String value2) {
            addCriterion("DeptPlanner between", value1, value2, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andDeptplannerNotBetween(String value1, String value2) {
            addCriterion("DeptPlanner not between", value1, value2, "deptplanner");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("Approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("Approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("Approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("Approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("Approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("Approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("Approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("Approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("Approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("Approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("Approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("Approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("Approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("Approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("Abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("Abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("Abbreviation =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("Abbreviation <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("Abbreviation >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("Abbreviation >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("Abbreviation <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("Abbreviation <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("Abbreviation like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("Abbreviation not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("Abbreviation in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("Abbreviation not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("Abbreviation between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("Abbreviation not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andPlanapproverIsNull() {
            addCriterion("PlanApprover is null");
            return (Criteria) this;
        }

        public Criteria andPlanapproverIsNotNull() {
            addCriterion("PlanApprover is not null");
            return (Criteria) this;
        }

        public Criteria andPlanapproverEqualTo(String value) {
            addCriterion("PlanApprover =", value, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverNotEqualTo(String value) {
            addCriterion("PlanApprover <>", value, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverGreaterThan(String value) {
            addCriterion("PlanApprover >", value, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverGreaterThanOrEqualTo(String value) {
            addCriterion("PlanApprover >=", value, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverLessThan(String value) {
            addCriterion("PlanApprover <", value, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverLessThanOrEqualTo(String value) {
            addCriterion("PlanApprover <=", value, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverLike(String value) {
            addCriterion("PlanApprover like", value, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverNotLike(String value) {
            addCriterion("PlanApprover not like", value, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverIn(List<String> values) {
            addCriterion("PlanApprover in", values, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverNotIn(List<String> values) {
            addCriterion("PlanApprover not in", values, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverBetween(String value1, String value2) {
            addCriterion("PlanApprover between", value1, value2, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPlanapproverNotBetween(String value1, String value2) {
            addCriterion("PlanApprover not between", value1, value2, "planapprover");
            return (Criteria) this;
        }

        public Criteria andPrIsNull() {
            addCriterion("PR is null");
            return (Criteria) this;
        }

        public Criteria andPrIsNotNull() {
            addCriterion("PR is not null");
            return (Criteria) this;
        }

        public Criteria andPrEqualTo(String value) {
            addCriterion("PR =", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotEqualTo(String value) {
            addCriterion("PR <>", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrGreaterThan(String value) {
            addCriterion("PR >", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrGreaterThanOrEqualTo(String value) {
            addCriterion("PR >=", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrLessThan(String value) {
            addCriterion("PR <", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrLessThanOrEqualTo(String value) {
            addCriterion("PR <=", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrLike(String value) {
            addCriterion("PR like", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotLike(String value) {
            addCriterion("PR not like", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrIn(List<String> values) {
            addCriterion("PR in", values, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotIn(List<String> values) {
            addCriterion("PR not in", values, "pr");
            return (Criteria) this;
        }

        public Criteria andPrBetween(String value1, String value2) {
            addCriterion("PR between", value1, value2, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotBetween(String value1, String value2) {
            addCriterion("PR not between", value1, value2, "pr");
            return (Criteria) this;
        }

        public Criteria andConsignorIsNull() {
            addCriterion("Consignor is null");
            return (Criteria) this;
        }

        public Criteria andConsignorIsNotNull() {
            addCriterion("Consignor is not null");
            return (Criteria) this;
        }

        public Criteria andConsignorEqualTo(String value) {
            addCriterion("Consignor =", value, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorNotEqualTo(String value) {
            addCriterion("Consignor <>", value, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorGreaterThan(String value) {
            addCriterion("Consignor >", value, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorGreaterThanOrEqualTo(String value) {
            addCriterion("Consignor >=", value, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorLessThan(String value) {
            addCriterion("Consignor <", value, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorLessThanOrEqualTo(String value) {
            addCriterion("Consignor <=", value, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorLike(String value) {
            addCriterion("Consignor like", value, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorNotLike(String value) {
            addCriterion("Consignor not like", value, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorIn(List<String> values) {
            addCriterion("Consignor in", values, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorNotIn(List<String> values) {
            addCriterion("Consignor not in", values, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorBetween(String value1, String value2) {
            addCriterion("Consignor between", value1, value2, "consignor");
            return (Criteria) this;
        }

        public Criteria andConsignorNotBetween(String value1, String value2) {
            addCriterion("Consignor not between", value1, value2, "consignor");
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

        public Criteria andDeleteflagIsNull() {
            addCriterion("DeleteFlag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("DeleteFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("DeleteFlag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("DeleteFlag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("DeleteFlag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("DeleteFlag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("DeleteFlag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("DeleteFlag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLike(String value) {
            addCriterion("DeleteFlag like", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("DeleteFlag not like", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("DeleteFlag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("DeleteFlag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("DeleteFlag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("DeleteFlag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends AbstractGeneratedCriteria {

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