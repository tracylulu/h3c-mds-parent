package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_PLIPMTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_PLIPMTExample() {
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

        public Criteria andPlipmtIsNull() {
            addCriterion("PLIPMT is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtIsNotNull() {
            addCriterion("PLIPMT is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtEqualTo(String value) {
            addCriterion("PLIPMT =", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotEqualTo(String value) {
            addCriterion("PLIPMT <>", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtGreaterThan(String value) {
            addCriterion("PLIPMT >", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMT >=", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLessThan(String value) {
            addCriterion("PLIPMT <", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLessThanOrEqualTo(String value) {
            addCriterion("PLIPMT <=", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLike(String value) {
            addCriterion("PLIPMT like", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotLike(String value) {
            addCriterion("PLIPMT not like", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtIn(List<String> values) {
            addCriterion("PLIPMT in", values, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotIn(List<String> values) {
            addCriterion("PLIPMT not in", values, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtBetween(String value1, String value2) {
            addCriterion("PLIPMT between", value1, value2, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotBetween(String value1, String value2) {
            addCriterion("PLIPMT not between", value1, value2, "plipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtIsNull() {
            addCriterion("engPLIPMT is null");
            return (Criteria) this;
        }

        public Criteria andEngplipmtIsNotNull() {
            addCriterion("engPLIPMT is not null");
            return (Criteria) this;
        }

        public Criteria andEngplipmtEqualTo(String value) {
            addCriterion("engPLIPMT =", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtNotEqualTo(String value) {
            addCriterion("engPLIPMT <>", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtGreaterThan(String value) {
            addCriterion("engPLIPMT >", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtGreaterThanOrEqualTo(String value) {
            addCriterion("engPLIPMT >=", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtLessThan(String value) {
            addCriterion("engPLIPMT <", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtLessThanOrEqualTo(String value) {
            addCriterion("engPLIPMT <=", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtLike(String value) {
            addCriterion("engPLIPMT like", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtNotLike(String value) {
            addCriterion("engPLIPMT not like", value, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtIn(List<String> values) {
            addCriterion("engPLIPMT in", values, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtNotIn(List<String> values) {
            addCriterion("engPLIPMT not in", values, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtBetween(String value1, String value2) {
            addCriterion("engPLIPMT between", value1, value2, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andEngplipmtNotBetween(String value1, String value2) {
            addCriterion("engPLIPMT not between", value1, value2, "engplipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldIsNull() {
            addCriterion("PLIPMTOld is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldIsNotNull() {
            addCriterion("PLIPMTOld is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldEqualTo(String value) {
            addCriterion("PLIPMTOld =", value, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldNotEqualTo(String value) {
            addCriterion("PLIPMTOld <>", value, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldGreaterThan(String value) {
            addCriterion("PLIPMTOld >", value, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMTOld >=", value, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldLessThan(String value) {
            addCriterion("PLIPMTOld <", value, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldLessThanOrEqualTo(String value) {
            addCriterion("PLIPMTOld <=", value, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldLike(String value) {
            addCriterion("PLIPMTOld like", value, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldNotLike(String value) {
            addCriterion("PLIPMTOld not like", value, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldIn(List<String> values) {
            addCriterion("PLIPMTOld in", values, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldNotIn(List<String> values) {
            addCriterion("PLIPMTOld not in", values, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldBetween(String value1, String value2) {
            addCriterion("PLIPMTOld between", value1, value2, "plipmtold");
            return (Criteria) this;
        }

        public Criteria andPlipmtoldNotBetween(String value1, String value2) {
            addCriterion("PLIPMTOld not between", value1, value2, "plipmtold");
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

        public Criteria andPlipmtUmpireIsNull() {
            addCriterion("PLIPMT_Umpire is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireIsNotNull() {
            addCriterion("PLIPMT_Umpire is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireEqualTo(String value) {
            addCriterion("PLIPMT_Umpire =", value, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireNotEqualTo(String value) {
            addCriterion("PLIPMT_Umpire <>", value, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireGreaterThan(String value) {
            addCriterion("PLIPMT_Umpire >", value, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMT_Umpire >=", value, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireLessThan(String value) {
            addCriterion("PLIPMT_Umpire <", value, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireLessThanOrEqualTo(String value) {
            addCriterion("PLIPMT_Umpire <=", value, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireLike(String value) {
            addCriterion("PLIPMT_Umpire like", value, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireNotLike(String value) {
            addCriterion("PLIPMT_Umpire not like", value, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireIn(List<String> values) {
            addCriterion("PLIPMT_Umpire in", values, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireNotIn(List<String> values) {
            addCriterion("PLIPMT_Umpire not in", values, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireBetween(String value1, String value2) {
            addCriterion("PLIPMT_Umpire between", value1, value2, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtUmpireNotBetween(String value1, String value2) {
            addCriterion("PLIPMT_Umpire not between", value1, value2, "plipmtUmpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireIsNull() {
            addCriterion("PLIPMT_ViceUmpire is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireIsNotNull() {
            addCriterion("PLIPMT_ViceUmpire is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireEqualTo(String value) {
            addCriterion("PLIPMT_ViceUmpire =", value, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireNotEqualTo(String value) {
            addCriterion("PLIPMT_ViceUmpire <>", value, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireGreaterThan(String value) {
            addCriterion("PLIPMT_ViceUmpire >", value, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMT_ViceUmpire >=", value, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireLessThan(String value) {
            addCriterion("PLIPMT_ViceUmpire <", value, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireLessThanOrEqualTo(String value) {
            addCriterion("PLIPMT_ViceUmpire <=", value, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireLike(String value) {
            addCriterion("PLIPMT_ViceUmpire like", value, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireNotLike(String value) {
            addCriterion("PLIPMT_ViceUmpire not like", value, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireIn(List<String> values) {
            addCriterion("PLIPMT_ViceUmpire in", values, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireNotIn(List<String> values) {
            addCriterion("PLIPMT_ViceUmpire not in", values, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireBetween(String value1, String value2) {
            addCriterion("PLIPMT_ViceUmpire between", value1, value2, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlipmtViceumpireNotBetween(String value1, String value2) {
            addCriterion("PLIPMT_ViceUmpire not between", value1, value2, "plipmtViceumpire");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryIsNull() {
            addCriterion("PLIMPT_Secretary is null");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryIsNotNull() {
            addCriterion("PLIMPT_Secretary is not null");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryEqualTo(String value) {
            addCriterion("PLIMPT_Secretary =", value, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryNotEqualTo(String value) {
            addCriterion("PLIMPT_Secretary <>", value, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryGreaterThan(String value) {
            addCriterion("PLIMPT_Secretary >", value, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryGreaterThanOrEqualTo(String value) {
            addCriterion("PLIMPT_Secretary >=", value, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryLessThan(String value) {
            addCriterion("PLIMPT_Secretary <", value, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryLessThanOrEqualTo(String value) {
            addCriterion("PLIMPT_Secretary <=", value, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryLike(String value) {
            addCriterion("PLIMPT_Secretary like", value, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryNotLike(String value) {
            addCriterion("PLIMPT_Secretary not like", value, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryIn(List<String> values) {
            addCriterion("PLIMPT_Secretary in", values, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryNotIn(List<String> values) {
            addCriterion("PLIMPT_Secretary not in", values, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryBetween(String value1, String value2) {
            addCriterion("PLIMPT_Secretary between", value1, value2, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlimptSecretaryNotBetween(String value1, String value2) {
            addCriterion("PLIMPT_Secretary not between", value1, value2, "plimptSecretary");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersIsNull() {
            addCriterion("PLIPMT_Members is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersIsNotNull() {
            addCriterion("PLIPMT_Members is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersEqualTo(String value) {
            addCriterion("PLIPMT_Members =", value, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersNotEqualTo(String value) {
            addCriterion("PLIPMT_Members <>", value, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersGreaterThan(String value) {
            addCriterion("PLIPMT_Members >", value, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMT_Members >=", value, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersLessThan(String value) {
            addCriterion("PLIPMT_Members <", value, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersLessThanOrEqualTo(String value) {
            addCriterion("PLIPMT_Members <=", value, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersLike(String value) {
            addCriterion("PLIPMT_Members like", value, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersNotLike(String value) {
            addCriterion("PLIPMT_Members not like", value, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersIn(List<String> values) {
            addCriterion("PLIPMT_Members in", values, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersNotIn(List<String> values) {
            addCriterion("PLIPMT_Members not in", values, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersBetween(String value1, String value2) {
            addCriterion("PLIPMT_Members between", value1, value2, "plipmtMembers");
            return (Criteria) this;
        }

        public Criteria andPlipmtMembersNotBetween(String value1, String value2) {
            addCriterion("PLIPMT_Members not between", value1, value2, "plipmtMembers");
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

        public Criteria andPlipmtPdmMngerIsNull() {
            addCriterion("PLIPMT_PDM_Mnger is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerIsNotNull() {
            addCriterion("PLIPMT_PDM_Mnger is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerEqualTo(String value) {
            addCriterion("PLIPMT_PDM_Mnger =", value, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerNotEqualTo(String value) {
            addCriterion("PLIPMT_PDM_Mnger <>", value, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerGreaterThan(String value) {
            addCriterion("PLIPMT_PDM_Mnger >", value, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMT_PDM_Mnger >=", value, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerLessThan(String value) {
            addCriterion("PLIPMT_PDM_Mnger <", value, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerLessThanOrEqualTo(String value) {
            addCriterion("PLIPMT_PDM_Mnger <=", value, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerLike(String value) {
            addCriterion("PLIPMT_PDM_Mnger like", value, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerNotLike(String value) {
            addCriterion("PLIPMT_PDM_Mnger not like", value, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerIn(List<String> values) {
            addCriterion("PLIPMT_PDM_Mnger in", values, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerNotIn(List<String> values) {
            addCriterion("PLIPMT_PDM_Mnger not in", values, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerBetween(String value1, String value2) {
            addCriterion("PLIPMT_PDM_Mnger between", value1, value2, "plipmtPdmMnger");
            return (Criteria) this;
        }

        public Criteria andPlipmtPdmMngerNotBetween(String value1, String value2) {
            addCriterion("PLIPMT_PDM_Mnger not between", value1, value2, "plipmtPdmMnger");
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

        public Criteria andPlipmtOrderIsNull() {
            addCriterion("PLIPMT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIsNotNull() {
            addCriterion("PLIPMT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderEqualTo(Integer value) {
            addCriterion("PLIPMT_ORDER =", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotEqualTo(Integer value) {
            addCriterion("PLIPMT_ORDER <>", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderGreaterThan(Integer value) {
            addCriterion("PLIPMT_ORDER >", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLIPMT_ORDER >=", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLessThan(Integer value) {
            addCriterion("PLIPMT_ORDER <", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLessThanOrEqualTo(Integer value) {
            addCriterion("PLIPMT_ORDER <=", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIn(List<Integer> values) {
            addCriterion("PLIPMT_ORDER in", values, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotIn(List<Integer> values) {
            addCriterion("PLIPMT_ORDER not in", values, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderBetween(Integer value1, Integer value2) {
            addCriterion("PLIPMT_ORDER between", value1, value2, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("PLIPMT_ORDER not between", value1, value2, "plipmtOrder");
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