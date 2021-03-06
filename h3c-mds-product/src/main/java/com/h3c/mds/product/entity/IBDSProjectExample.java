package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDSProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDSProjectExample() {
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

        public Criteria andProjectnoIsNull() {
            addCriterion("PROJECTNo is null");
            return (Criteria) this;
        }

        public Criteria andProjectnoIsNotNull() {
            addCriterion("PROJECTNo is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnoEqualTo(String value) {
            addCriterion("PROJECTNo =", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotEqualTo(String value) {
            addCriterion("PROJECTNo <>", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoGreaterThan(String value) {
            addCriterion("PROJECTNo >", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTNo >=", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLessThan(String value) {
            addCriterion("PROJECTNo <", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLessThanOrEqualTo(String value) {
            addCriterion("PROJECTNo <=", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLike(String value) {
            addCriterion("PROJECTNo like", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotLike(String value) {
            addCriterion("PROJECTNo not like", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoIn(List<String> values) {
            addCriterion("PROJECTNo in", values, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotIn(List<String> values) {
            addCriterion("PROJECTNo not in", values, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoBetween(String value1, String value2) {
            addCriterion("PROJECTNo between", value1, value2, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotBetween(String value1, String value2) {
            addCriterion("PROJECTNo not between", value1, value2, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("PROJECT =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("PROJECT <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("PROJECT >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("PROJECT <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("PROJECT <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("PROJECT like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("PROJECT not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("PROJECT in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("PROJECT not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("PROJECT between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("PROJECT not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectoldIsNull() {
            addCriterion("PROJECTOld is null");
            return (Criteria) this;
        }

        public Criteria andProjectoldIsNotNull() {
            addCriterion("PROJECTOld is not null");
            return (Criteria) this;
        }

        public Criteria andProjectoldEqualTo(String value) {
            addCriterion("PROJECTOld =", value, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldNotEqualTo(String value) {
            addCriterion("PROJECTOld <>", value, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldGreaterThan(String value) {
            addCriterion("PROJECTOld >", value, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTOld >=", value, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldLessThan(String value) {
            addCriterion("PROJECTOld <", value, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldLessThanOrEqualTo(String value) {
            addCriterion("PROJECTOld <=", value, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldLike(String value) {
            addCriterion("PROJECTOld like", value, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldNotLike(String value) {
            addCriterion("PROJECTOld not like", value, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldIn(List<String> values) {
            addCriterion("PROJECTOld in", values, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldNotIn(List<String> values) {
            addCriterion("PROJECTOld not in", values, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldBetween(String value1, String value2) {
            addCriterion("PROJECTOld between", value1, value2, "projectold");
            return (Criteria) this;
        }

        public Criteria andProjectoldNotBetween(String value1, String value2) {
            addCriterion("PROJECTOld not between", value1, value2, "projectold");
            return (Criteria) this;
        }

        public Criteria andEngprojectIsNull() {
            addCriterion("engPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andEngprojectIsNotNull() {
            addCriterion("engPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andEngprojectEqualTo(String value) {
            addCriterion("engPROJECT =", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotEqualTo(String value) {
            addCriterion("engPROJECT <>", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectGreaterThan(String value) {
            addCriterion("engPROJECT >", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectGreaterThanOrEqualTo(String value) {
            addCriterion("engPROJECT >=", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLessThan(String value) {
            addCriterion("engPROJECT <", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLessThanOrEqualTo(String value) {
            addCriterion("engPROJECT <=", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLike(String value) {
            addCriterion("engPROJECT like", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotLike(String value) {
            addCriterion("engPROJECT not like", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectIn(List<String> values) {
            addCriterion("engPROJECT in", values, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotIn(List<String> values) {
            addCriterion("engPROJECT not in", values, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectBetween(String value1, String value2) {
            addCriterion("engPROJECT between", value1, value2, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotBetween(String value1, String value2) {
            addCriterion("engPROJECT not between", value1, value2, "engproject");
            return (Criteria) this;
        }

        public Criteria andProjectaliasIsNull() {
            addCriterion("PROJECTAlias is null");
            return (Criteria) this;
        }

        public Criteria andProjectaliasIsNotNull() {
            addCriterion("PROJECTAlias is not null");
            return (Criteria) this;
        }

        public Criteria andProjectaliasEqualTo(String value) {
            addCriterion("PROJECTAlias =", value, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasNotEqualTo(String value) {
            addCriterion("PROJECTAlias <>", value, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasGreaterThan(String value) {
            addCriterion("PROJECTAlias >", value, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTAlias >=", value, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasLessThan(String value) {
            addCriterion("PROJECTAlias <", value, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasLessThanOrEqualTo(String value) {
            addCriterion("PROJECTAlias <=", value, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasLike(String value) {
            addCriterion("PROJECTAlias like", value, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasNotLike(String value) {
            addCriterion("PROJECTAlias not like", value, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasIn(List<String> values) {
            addCriterion("PROJECTAlias in", values, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasNotIn(List<String> values) {
            addCriterion("PROJECTAlias not in", values, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasBetween(String value1, String value2) {
            addCriterion("PROJECTAlias between", value1, value2, "projectalias");
            return (Criteria) this;
        }

        public Criteria andProjectaliasNotBetween(String value1, String value2) {
            addCriterion("PROJECTAlias not between", value1, value2, "projectalias");
            return (Criteria) this;
        }

        public Criteria andIfplanIsNull() {
            addCriterion("IfPlan is null");
            return (Criteria) this;
        }

        public Criteria andIfplanIsNotNull() {
            addCriterion("IfPlan is not null");
            return (Criteria) this;
        }

        public Criteria andIfplanEqualTo(String value) {
            addCriterion("IfPlan =", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotEqualTo(String value) {
            addCriterion("IfPlan <>", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanGreaterThan(String value) {
            addCriterion("IfPlan >", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanGreaterThanOrEqualTo(String value) {
            addCriterion("IfPlan >=", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLessThan(String value) {
            addCriterion("IfPlan <", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLessThanOrEqualTo(String value) {
            addCriterion("IfPlan <=", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLike(String value) {
            addCriterion("IfPlan like", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotLike(String value) {
            addCriterion("IfPlan not like", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanIn(List<String> values) {
            addCriterion("IfPlan in", values, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotIn(List<String> values) {
            addCriterion("IfPlan not in", values, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanBetween(String value1, String value2) {
            addCriterion("IfPlan between", value1, value2, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotBetween(String value1, String value2) {
            addCriterion("IfPlan not between", value1, value2, "ifplan");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeIsNull() {
            addCriterion("PROJECTCOACode is null");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeIsNotNull() {
            addCriterion("PROJECTCOACode is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeEqualTo(String value) {
            addCriterion("PROJECTCOACode =", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeNotEqualTo(String value) {
            addCriterion("PROJECTCOACode <>", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeGreaterThan(String value) {
            addCriterion("PROJECTCOACode >", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTCOACode >=", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeLessThan(String value) {
            addCriterion("PROJECTCOACode <", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECTCOACode <=", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeLike(String value) {
            addCriterion("PROJECTCOACode like", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeNotLike(String value) {
            addCriterion("PROJECTCOACode not like", value, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeIn(List<String> values) {
            addCriterion("PROJECTCOACode in", values, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeNotIn(List<String> values) {
            addCriterion("PROJECTCOACode not in", values, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeBetween(String value1, String value2) {
            addCriterion("PROJECTCOACode between", value1, value2, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjectcoacodeNotBetween(String value1, String value2) {
            addCriterion("PROJECTCOACode not between", value1, value2, "projectcoacode");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoIsNull() {
            addCriterion("PROJECTTypeNo is null");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoIsNotNull() {
            addCriterion("PROJECTTypeNo is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoEqualTo(String value) {
            addCriterion("PROJECTTypeNo =", value, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoNotEqualTo(String value) {
            addCriterion("PROJECTTypeNo <>", value, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoGreaterThan(String value) {
            addCriterion("PROJECTTypeNo >", value, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTTypeNo >=", value, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoLessThan(String value) {
            addCriterion("PROJECTTypeNo <", value, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoLessThanOrEqualTo(String value) {
            addCriterion("PROJECTTypeNo <=", value, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoLike(String value) {
            addCriterion("PROJECTTypeNo like", value, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoNotLike(String value) {
            addCriterion("PROJECTTypeNo not like", value, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoIn(List<String> values) {
            addCriterion("PROJECTTypeNo in", values, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoNotIn(List<String> values) {
            addCriterion("PROJECTTypeNo not in", values, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoBetween(String value1, String value2) {
            addCriterion("PROJECTTypeNo between", value1, value2, "projecttypeno");
            return (Criteria) this;
        }

        public Criteria andProjecttypenoNotBetween(String value1, String value2) {
            addCriterion("PROJECTTypeNo not between", value1, value2, "projecttypeno");
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

        public Criteria andProdlinenoIsNull() {
            addCriterion("PRODLINENo is null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIsNotNull() {
            addCriterion("PRODLINENo is not null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoEqualTo(String value) {
            addCriterion("PRODLINENo =", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotEqualTo(String value) {
            addCriterion("PRODLINENo <>", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThan(String value) {
            addCriterion("PRODLINENo >", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINENo >=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThan(String value) {
            addCriterion("PRODLINENo <", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThanOrEqualTo(String value) {
            addCriterion("PRODLINENo <=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLike(String value) {
            addCriterion("PRODLINENo like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotLike(String value) {
            addCriterion("PRODLINENo not like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIn(List<String> values) {
            addCriterion("PRODLINENo in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotIn(List<String> values) {
            addCriterion("PRODLINENo not in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoBetween(String value1, String value2) {
            addCriterion("PRODLINENo between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotBetween(String value1, String value2) {
            addCriterion("PRODLINENo not between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andPdtnoIsNull() {
            addCriterion("PDTNo is null");
            return (Criteria) this;
        }

        public Criteria andPdtnoIsNotNull() {
            addCriterion("PDTNo is not null");
            return (Criteria) this;
        }

        public Criteria andPdtnoEqualTo(String value) {
            addCriterion("PDTNo =", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotEqualTo(String value) {
            addCriterion("PDTNo <>", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoGreaterThan(String value) {
            addCriterion("PDTNo >", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoGreaterThanOrEqualTo(String value) {
            addCriterion("PDTNo >=", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLessThan(String value) {
            addCriterion("PDTNo <", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLessThanOrEqualTo(String value) {
            addCriterion("PDTNo <=", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLike(String value) {
            addCriterion("PDTNo like", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotLike(String value) {
            addCriterion("PDTNo not like", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoIn(List<String> values) {
            addCriterion("PDTNo in", values, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotIn(List<String> values) {
            addCriterion("PDTNo not in", values, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoBetween(String value1, String value2) {
            addCriterion("PDTNo between", value1, value2, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotBetween(String value1, String value2) {
            addCriterion("PDTNo not between", value1, value2, "pdtno");
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

        public Criteria andMatchIsNull() {
            addCriterion("Match is null");
            return (Criteria) this;
        }

        public Criteria andMatchIsNotNull() {
            addCriterion("Match is not null");
            return (Criteria) this;
        }

        public Criteria andMatchEqualTo(String value) {
            addCriterion("Match =", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotEqualTo(String value) {
            addCriterion("Match <>", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchGreaterThan(String value) {
            addCriterion("Match >", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchGreaterThanOrEqualTo(String value) {
            addCriterion("Match >=", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLessThan(String value) {
            addCriterion("Match <", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLessThanOrEqualTo(String value) {
            addCriterion("Match <=", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLike(String value) {
            addCriterion("Match like", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotLike(String value) {
            addCriterion("Match not like", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchIn(List<String> values) {
            addCriterion("Match in", values, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotIn(List<String> values) {
            addCriterion("Match not in", values, "match");
            return (Criteria) this;
        }

        public Criteria andMatchBetween(String value1, String value2) {
            addCriterion("Match between", value1, value2, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotBetween(String value1, String value2) {
            addCriterion("Match not between", value1, value2, "match");
            return (Criteria) this;
        }

        public Criteria andProjectmatchIsNull() {
            addCriterion("PROJECTMatch is null");
            return (Criteria) this;
        }

        public Criteria andProjectmatchIsNotNull() {
            addCriterion("PROJECTMatch is not null");
            return (Criteria) this;
        }

        public Criteria andProjectmatchEqualTo(String value) {
            addCriterion("PROJECTMatch =", value, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchNotEqualTo(String value) {
            addCriterion("PROJECTMatch <>", value, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchGreaterThan(String value) {
            addCriterion("PROJECTMatch >", value, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTMatch >=", value, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchLessThan(String value) {
            addCriterion("PROJECTMatch <", value, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchLessThanOrEqualTo(String value) {
            addCriterion("PROJECTMatch <=", value, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchLike(String value) {
            addCriterion("PROJECTMatch like", value, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchNotLike(String value) {
            addCriterion("PROJECTMatch not like", value, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchIn(List<String> values) {
            addCriterion("PROJECTMatch in", values, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchNotIn(List<String> values) {
            addCriterion("PROJECTMatch not in", values, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchBetween(String value1, String value2) {
            addCriterion("PROJECTMatch between", value1, value2, "projectmatch");
            return (Criteria) this;
        }

        public Criteria andProjectmatchNotBetween(String value1, String value2) {
            addCriterion("PROJECTMatch not between", value1, value2, "projectmatch");
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

        public Criteria andCreatedUserIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(String value) {
            addCriterion("CREATED_USER =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(String value) {
            addCriterion("CREATED_USER <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(String value) {
            addCriterion("CREATED_USER >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(String value) {
            addCriterion("CREATED_USER <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLike(String value) {
            addCriterion("CREATED_USER like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotLike(String value) {
            addCriterion("CREATED_USER not like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<String> values) {
            addCriterion("CREATED_USER in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<String> values) {
            addCriterion("CREATED_USER not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(String value1, String value2) {
            addCriterion("CREATED_USER between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
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

        public Criteria andModifyDataIsNull() {
            addCriterion("MODIFY_DATA is null");
            return (Criteria) this;
        }

        public Criteria andModifyDataIsNotNull() {
            addCriterion("MODIFY_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDataEqualTo(Date value) {
            addCriterion("MODIFY_DATA =", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataNotEqualTo(Date value) {
            addCriterion("MODIFY_DATA <>", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataGreaterThan(Date value) {
            addCriterion("MODIFY_DATA >", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATA >=", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataLessThan(Date value) {
            addCriterion("MODIFY_DATA <", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATA <=", value, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataIn(List<Date> values) {
            addCriterion("MODIFY_DATA in", values, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataNotIn(List<Date> values) {
            addCriterion("MODIFY_DATA not in", values, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATA between", value1, value2, "modifyData");
            return (Criteria) this;
        }

        public Criteria andModifyDataNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATA not between", value1, value2, "modifyData");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNull() {
            addCriterion("STANDBY1 is null");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNotNull() {
            addCriterion("STANDBY1 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby1EqualTo(String value) {
            addCriterion("STANDBY1 =", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotEqualTo(String value) {
            addCriterion("STANDBY1 <>", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThan(String value) {
            addCriterion("STANDBY1 >", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY1 >=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThan(String value) {
            addCriterion("STANDBY1 <", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThanOrEqualTo(String value) {
            addCriterion("STANDBY1 <=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Like(String value) {
            addCriterion("STANDBY1 like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotLike(String value) {
            addCriterion("STANDBY1 not like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1In(List<String> values) {
            addCriterion("STANDBY1 in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotIn(List<String> values) {
            addCriterion("STANDBY1 not in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Between(String value1, String value2) {
            addCriterion("STANDBY1 between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotBetween(String value1, String value2) {
            addCriterion("STANDBY1 not between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNull() {
            addCriterion("STANDBY2 is null");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNotNull() {
            addCriterion("STANDBY2 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby2EqualTo(String value) {
            addCriterion("STANDBY2 =", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotEqualTo(String value) {
            addCriterion("STANDBY2 <>", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThan(String value) {
            addCriterion("STANDBY2 >", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY2 >=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThan(String value) {
            addCriterion("STANDBY2 <", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThanOrEqualTo(String value) {
            addCriterion("STANDBY2 <=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Like(String value) {
            addCriterion("STANDBY2 like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotLike(String value) {
            addCriterion("STANDBY2 not like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2In(List<String> values) {
            addCriterion("STANDBY2 in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotIn(List<String> values) {
            addCriterion("STANDBY2 not in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Between(String value1, String value2) {
            addCriterion("STANDBY2 between", value1, value2, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotBetween(String value1, String value2) {
            addCriterion("STANDBY2 not between", value1, value2, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby3IsNull() {
            addCriterion("STANDBY3 is null");
            return (Criteria) this;
        }

        public Criteria andStandby3IsNotNull() {
            addCriterion("STANDBY3 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby3EqualTo(String value) {
            addCriterion("STANDBY3 =", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotEqualTo(String value) {
            addCriterion("STANDBY3 <>", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3GreaterThan(String value) {
            addCriterion("STANDBY3 >", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY3 >=", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3LessThan(String value) {
            addCriterion("STANDBY3 <", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3LessThanOrEqualTo(String value) {
            addCriterion("STANDBY3 <=", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3Like(String value) {
            addCriterion("STANDBY3 like", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotLike(String value) {
            addCriterion("STANDBY3 not like", value, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3In(List<String> values) {
            addCriterion("STANDBY3 in", values, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotIn(List<String> values) {
            addCriterion("STANDBY3 not in", values, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3Between(String value1, String value2) {
            addCriterion("STANDBY3 between", value1, value2, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby3NotBetween(String value1, String value2) {
            addCriterion("STANDBY3 not between", value1, value2, "standby3");
            return (Criteria) this;
        }

        public Criteria andStandby4IsNull() {
            addCriterion("STANDBY4 is null");
            return (Criteria) this;
        }

        public Criteria andStandby4IsNotNull() {
            addCriterion("STANDBY4 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby4EqualTo(String value) {
            addCriterion("STANDBY4 =", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotEqualTo(String value) {
            addCriterion("STANDBY4 <>", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4GreaterThan(String value) {
            addCriterion("STANDBY4 >", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY4 >=", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4LessThan(String value) {
            addCriterion("STANDBY4 <", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4LessThanOrEqualTo(String value) {
            addCriterion("STANDBY4 <=", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4Like(String value) {
            addCriterion("STANDBY4 like", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotLike(String value) {
            addCriterion("STANDBY4 not like", value, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4In(List<String> values) {
            addCriterion("STANDBY4 in", values, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotIn(List<String> values) {
            addCriterion("STANDBY4 not in", values, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4Between(String value1, String value2) {
            addCriterion("STANDBY4 between", value1, value2, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby4NotBetween(String value1, String value2) {
            addCriterion("STANDBY4 not between", value1, value2, "standby4");
            return (Criteria) this;
        }

        public Criteria andStandby5IsNull() {
            addCriterion("STANDBY5 is null");
            return (Criteria) this;
        }

        public Criteria andStandby5IsNotNull() {
            addCriterion("STANDBY5 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby5EqualTo(String value) {
            addCriterion("STANDBY5 =", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotEqualTo(String value) {
            addCriterion("STANDBY5 <>", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5GreaterThan(String value) {
            addCriterion("STANDBY5 >", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY5 >=", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5LessThan(String value) {
            addCriterion("STANDBY5 <", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5LessThanOrEqualTo(String value) {
            addCriterion("STANDBY5 <=", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5Like(String value) {
            addCriterion("STANDBY5 like", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotLike(String value) {
            addCriterion("STANDBY5 not like", value, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5In(List<String> values) {
            addCriterion("STANDBY5 in", values, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotIn(List<String> values) {
            addCriterion("STANDBY5 not in", values, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5Between(String value1, String value2) {
            addCriterion("STANDBY5 between", value1, value2, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby5NotBetween(String value1, String value2) {
            addCriterion("STANDBY5 not between", value1, value2, "standby5");
            return (Criteria) this;
        }

        public Criteria andStandby6IsNull() {
            addCriterion("STANDBY6 is null");
            return (Criteria) this;
        }

        public Criteria andStandby6IsNotNull() {
            addCriterion("STANDBY6 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby6EqualTo(String value) {
            addCriterion("STANDBY6 =", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6NotEqualTo(String value) {
            addCriterion("STANDBY6 <>", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6GreaterThan(String value) {
            addCriterion("STANDBY6 >", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY6 >=", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6LessThan(String value) {
            addCriterion("STANDBY6 <", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6LessThanOrEqualTo(String value) {
            addCriterion("STANDBY6 <=", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6Like(String value) {
            addCriterion("STANDBY6 like", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6NotLike(String value) {
            addCriterion("STANDBY6 not like", value, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6In(List<String> values) {
            addCriterion("STANDBY6 in", values, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6NotIn(List<String> values) {
            addCriterion("STANDBY6 not in", values, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6Between(String value1, String value2) {
            addCriterion("STANDBY6 between", value1, value2, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby6NotBetween(String value1, String value2) {
            addCriterion("STANDBY6 not between", value1, value2, "standby6");
            return (Criteria) this;
        }

        public Criteria andStandby7IsNull() {
            addCriterion("STANDBY7 is null");
            return (Criteria) this;
        }

        public Criteria andStandby7IsNotNull() {
            addCriterion("STANDBY7 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby7EqualTo(String value) {
            addCriterion("STANDBY7 =", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7NotEqualTo(String value) {
            addCriterion("STANDBY7 <>", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7GreaterThan(String value) {
            addCriterion("STANDBY7 >", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY7 >=", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7LessThan(String value) {
            addCriterion("STANDBY7 <", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7LessThanOrEqualTo(String value) {
            addCriterion("STANDBY7 <=", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7Like(String value) {
            addCriterion("STANDBY7 like", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7NotLike(String value) {
            addCriterion("STANDBY7 not like", value, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7In(List<String> values) {
            addCriterion("STANDBY7 in", values, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7NotIn(List<String> values) {
            addCriterion("STANDBY7 not in", values, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7Between(String value1, String value2) {
            addCriterion("STANDBY7 between", value1, value2, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby7NotBetween(String value1, String value2) {
            addCriterion("STANDBY7 not between", value1, value2, "standby7");
            return (Criteria) this;
        }

        public Criteria andStandby8IsNull() {
            addCriterion("STANDBY8 is null");
            return (Criteria) this;
        }

        public Criteria andStandby8IsNotNull() {
            addCriterion("STANDBY8 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby8EqualTo(String value) {
            addCriterion("STANDBY8 =", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8NotEqualTo(String value) {
            addCriterion("STANDBY8 <>", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8GreaterThan(String value) {
            addCriterion("STANDBY8 >", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY8 >=", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8LessThan(String value) {
            addCriterion("STANDBY8 <", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8LessThanOrEqualTo(String value) {
            addCriterion("STANDBY8 <=", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8Like(String value) {
            addCriterion("STANDBY8 like", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8NotLike(String value) {
            addCriterion("STANDBY8 not like", value, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8In(List<String> values) {
            addCriterion("STANDBY8 in", values, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8NotIn(List<String> values) {
            addCriterion("STANDBY8 not in", values, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8Between(String value1, String value2) {
            addCriterion("STANDBY8 between", value1, value2, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby8NotBetween(String value1, String value2) {
            addCriterion("STANDBY8 not between", value1, value2, "standby8");
            return (Criteria) this;
        }

        public Criteria andStandby9IsNull() {
            addCriterion("STANDBY9 is null");
            return (Criteria) this;
        }

        public Criteria andStandby9IsNotNull() {
            addCriterion("STANDBY9 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby9EqualTo(String value) {
            addCriterion("STANDBY9 =", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9NotEqualTo(String value) {
            addCriterion("STANDBY9 <>", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9GreaterThan(String value) {
            addCriterion("STANDBY9 >", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY9 >=", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9LessThan(String value) {
            addCriterion("STANDBY9 <", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9LessThanOrEqualTo(String value) {
            addCriterion("STANDBY9 <=", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9Like(String value) {
            addCriterion("STANDBY9 like", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9NotLike(String value) {
            addCriterion("STANDBY9 not like", value, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9In(List<String> values) {
            addCriterion("STANDBY9 in", values, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9NotIn(List<String> values) {
            addCriterion("STANDBY9 not in", values, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9Between(String value1, String value2) {
            addCriterion("STANDBY9 between", value1, value2, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby9NotBetween(String value1, String value2) {
            addCriterion("STANDBY9 not between", value1, value2, "standby9");
            return (Criteria) this;
        }

        public Criteria andStandby10IsNull() {
            addCriterion("STANDBY10 is null");
            return (Criteria) this;
        }

        public Criteria andStandby10IsNotNull() {
            addCriterion("STANDBY10 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby10EqualTo(String value) {
            addCriterion("STANDBY10 =", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10NotEqualTo(String value) {
            addCriterion("STANDBY10 <>", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10GreaterThan(String value) {
            addCriterion("STANDBY10 >", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10GreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY10 >=", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10LessThan(String value) {
            addCriterion("STANDBY10 <", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10LessThanOrEqualTo(String value) {
            addCriterion("STANDBY10 <=", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10Like(String value) {
            addCriterion("STANDBY10 like", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10NotLike(String value) {
            addCriterion("STANDBY10 not like", value, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10In(List<String> values) {
            addCriterion("STANDBY10 in", values, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10NotIn(List<String> values) {
            addCriterion("STANDBY10 not in", values, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10Between(String value1, String value2) {
            addCriterion("STANDBY10 between", value1, value2, "standby10");
            return (Criteria) this;
        }

        public Criteria andStandby10NotBetween(String value1, String value2) {
            addCriterion("STANDBY10 not between", value1, value2, "standby10");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNull() {
            addCriterion("dept_no is null");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNotNull() {
            addCriterion("dept_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNoEqualTo(String value) {
            addCriterion("dept_no =", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotEqualTo(String value) {
            addCriterion("dept_no <>", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThan(String value) {
            addCriterion("dept_no >", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThanOrEqualTo(String value) {
            addCriterion("dept_no >=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThan(String value) {
            addCriterion("dept_no <", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThanOrEqualTo(String value) {
            addCriterion("dept_no <=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLike(String value) {
            addCriterion("dept_no like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotLike(String value) {
            addCriterion("dept_no not like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoIn(List<String> values) {
            addCriterion("dept_no in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotIn(List<String> values) {
            addCriterion("dept_no not in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoBetween(String value1, String value2) {
            addCriterion("dept_no between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotBetween(String value1, String value2) {
            addCriterion("dept_no not between", value1, value2, "deptNo");
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