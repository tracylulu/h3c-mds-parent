package com.h3c.mds.finance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectCodeProductCodeViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectCodeProductCodeViewExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFObjcaIsNull() {
            addCriterion("f_objca is null");
            return (Criteria) this;
        }

        public Criteria andFObjcaIsNotNull() {
            addCriterion("f_objca is not null");
            return (Criteria) this;
        }

        public Criteria andFObjcaEqualTo(String value) {
            addCriterion("f_objca =", value, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaNotEqualTo(String value) {
            addCriterion("f_objca <>", value, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaGreaterThan(String value) {
            addCriterion("f_objca >", value, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaGreaterThanOrEqualTo(String value) {
            addCriterion("f_objca >=", value, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaLessThan(String value) {
            addCriterion("f_objca <", value, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaLessThanOrEqualTo(String value) {
            addCriterion("f_objca <=", value, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaLike(String value) {
            addCriterion("f_objca like", value, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaNotLike(String value) {
            addCriterion("f_objca not like", value, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaIn(List<String> values) {
            addCriterion("f_objca in", values, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaNotIn(List<String> values) {
            addCriterion("f_objca not in", values, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaBetween(String value1, String value2) {
            addCriterion("f_objca between", value1, value2, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFObjcaNotBetween(String value1, String value2) {
            addCriterion("f_objca not between", value1, value2, "fObjca");
            return (Criteria) this;
        }

        public Criteria andFPdtnoIsNull() {
            addCriterion("f_pdtno is null");
            return (Criteria) this;
        }

        public Criteria andFPdtnoIsNotNull() {
            addCriterion("f_pdtno is not null");
            return (Criteria) this;
        }

        public Criteria andFPdtnoEqualTo(String value) {
            addCriterion("f_pdtno =", value, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoNotEqualTo(String value) {
            addCriterion("f_pdtno <>", value, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoGreaterThan(String value) {
            addCriterion("f_pdtno >", value, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_pdtno >=", value, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoLessThan(String value) {
            addCriterion("f_pdtno <", value, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoLessThanOrEqualTo(String value) {
            addCriterion("f_pdtno <=", value, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoLike(String value) {
            addCriterion("f_pdtno like", value, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoNotLike(String value) {
            addCriterion("f_pdtno not like", value, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoIn(List<String> values) {
            addCriterion("f_pdtno in", values, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoNotIn(List<String> values) {
            addCriterion("f_pdtno not in", values, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoBetween(String value1, String value2) {
            addCriterion("f_pdtno between", value1, value2, "fPdtno");
            return (Criteria) this;
        }

        public Criteria andFPdtnoNotBetween(String value1, String value2) {
            addCriterion("f_pdtno not between", value1, value2, "fPdtno");
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

        public Criteria andFProductlinenoIsNull() {
            addCriterion("f_productlineno is null");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoIsNotNull() {
            addCriterion("f_productlineno is not null");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoEqualTo(String value) {
            addCriterion("f_productlineno =", value, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoNotEqualTo(String value) {
            addCriterion("f_productlineno <>", value, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoGreaterThan(String value) {
            addCriterion("f_productlineno >", value, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("f_productlineno >=", value, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoLessThan(String value) {
            addCriterion("f_productlineno <", value, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoLessThanOrEqualTo(String value) {
            addCriterion("f_productlineno <=", value, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoLike(String value) {
            addCriterion("f_productlineno like", value, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoNotLike(String value) {
            addCriterion("f_productlineno not like", value, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoIn(List<String> values) {
            addCriterion("f_productlineno in", values, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoNotIn(List<String> values) {
            addCriterion("f_productlineno not in", values, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoBetween(String value1, String value2) {
            addCriterion("f_productlineno between", value1, value2, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFProductlinenoNotBetween(String value1, String value2) {
            addCriterion("f_productlineno not between", value1, value2, "fProductlineno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoIsNull() {
            addCriterion("f_releaseno is null");
            return (Criteria) this;
        }

        public Criteria andFReleasenoIsNotNull() {
            addCriterion("f_releaseno is not null");
            return (Criteria) this;
        }

        public Criteria andFReleasenoEqualTo(String value) {
            addCriterion("f_releaseno =", value, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoNotEqualTo(String value) {
            addCriterion("f_releaseno <>", value, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoGreaterThan(String value) {
            addCriterion("f_releaseno >", value, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoGreaterThanOrEqualTo(String value) {
            addCriterion("f_releaseno >=", value, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoLessThan(String value) {
            addCriterion("f_releaseno <", value, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoLessThanOrEqualTo(String value) {
            addCriterion("f_releaseno <=", value, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoLike(String value) {
            addCriterion("f_releaseno like", value, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoNotLike(String value) {
            addCriterion("f_releaseno not like", value, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoIn(List<String> values) {
            addCriterion("f_releaseno in", values, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoNotIn(List<String> values) {
            addCriterion("f_releaseno not in", values, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoBetween(String value1, String value2) {
            addCriterion("f_releaseno between", value1, value2, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenoNotBetween(String value1, String value2) {
            addCriterion("f_releaseno not between", value1, value2, "fReleaseno");
            return (Criteria) this;
        }

        public Criteria andFReleasenameIsNull() {
            addCriterion("f_releasename is null");
            return (Criteria) this;
        }

        public Criteria andFReleasenameIsNotNull() {
            addCriterion("f_releasename is not null");
            return (Criteria) this;
        }

        public Criteria andFReleasenameEqualTo(String value) {
            addCriterion("f_releasename =", value, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameNotEqualTo(String value) {
            addCriterion("f_releasename <>", value, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameGreaterThan(String value) {
            addCriterion("f_releasename >", value, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameGreaterThanOrEqualTo(String value) {
            addCriterion("f_releasename >=", value, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameLessThan(String value) {
            addCriterion("f_releasename <", value, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameLessThanOrEqualTo(String value) {
            addCriterion("f_releasename <=", value, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameLike(String value) {
            addCriterion("f_releasename like", value, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameNotLike(String value) {
            addCriterion("f_releasename not like", value, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameIn(List<String> values) {
            addCriterion("f_releasename in", values, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameNotIn(List<String> values) {
            addCriterion("f_releasename not in", values, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameBetween(String value1, String value2) {
            addCriterion("f_releasename between", value1, value2, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFReleasenameNotBetween(String value1, String value2) {
            addCriterion("f_releasename not between", value1, value2, "fReleasename");
            return (Criteria) this;
        }

        public Criteria andFProductnoIsNull() {
            addCriterion("f_productno is null");
            return (Criteria) this;
        }

        public Criteria andFProductnoIsNotNull() {
            addCriterion("f_productno is not null");
            return (Criteria) this;
        }

        public Criteria andFProductnoEqualTo(String value) {
            addCriterion("f_productno =", value, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoNotEqualTo(String value) {
            addCriterion("f_productno <>", value, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoGreaterThan(String value) {
            addCriterion("f_productno >", value, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_productno >=", value, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoLessThan(String value) {
            addCriterion("f_productno <", value, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoLessThanOrEqualTo(String value) {
            addCriterion("f_productno <=", value, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoLike(String value) {
            addCriterion("f_productno like", value, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoNotLike(String value) {
            addCriterion("f_productno not like", value, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoIn(List<String> values) {
            addCriterion("f_productno in", values, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoNotIn(List<String> values) {
            addCriterion("f_productno not in", values, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoBetween(String value1, String value2) {
            addCriterion("f_productno between", value1, value2, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnoNotBetween(String value1, String value2) {
            addCriterion("f_productno not between", value1, value2, "fProductno");
            return (Criteria) this;
        }

        public Criteria andFProductnameIsNull() {
            addCriterion("f_productname is null");
            return (Criteria) this;
        }

        public Criteria andFProductnameIsNotNull() {
            addCriterion("f_productname is not null");
            return (Criteria) this;
        }

        public Criteria andFProductnameEqualTo(String value) {
            addCriterion("f_productname =", value, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameNotEqualTo(String value) {
            addCriterion("f_productname <>", value, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameGreaterThan(String value) {
            addCriterion("f_productname >", value, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_productname >=", value, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameLessThan(String value) {
            addCriterion("f_productname <", value, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameLessThanOrEqualTo(String value) {
            addCriterion("f_productname <=", value, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameLike(String value) {
            addCriterion("f_productname like", value, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameNotLike(String value) {
            addCriterion("f_productname not like", value, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameIn(List<String> values) {
            addCriterion("f_productname in", values, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameNotIn(List<String> values) {
            addCriterion("f_productname not in", values, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameBetween(String value1, String value2) {
            addCriterion("f_productname between", value1, value2, "fProductname");
            return (Criteria) this;
        }

        public Criteria andFProductnameNotBetween(String value1, String value2) {
            addCriterion("f_productname not between", value1, value2, "fProductname");
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

        public Criteria andFBizhongEqualTo(String value) {
            addCriterion("f_bizhong =", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongNotEqualTo(String value) {
            addCriterion("f_bizhong <>", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongGreaterThan(String value) {
            addCriterion("f_bizhong >", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongGreaterThanOrEqualTo(String value) {
            addCriterion("f_bizhong >=", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongLessThan(String value) {
            addCriterion("f_bizhong <", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongLessThanOrEqualTo(String value) {
            addCriterion("f_bizhong <=", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongLike(String value) {
            addCriterion("f_bizhong like", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongNotLike(String value) {
            addCriterion("f_bizhong not like", value, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongIn(List<String> values) {
            addCriterion("f_bizhong in", values, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongNotIn(List<String> values) {
            addCriterion("f_bizhong not in", values, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongBetween(String value1, String value2) {
            addCriterion("f_bizhong between", value1, value2, "fBizhong");
            return (Criteria) this;
        }

        public Criteria andFBizhongNotBetween(String value1, String value2) {
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

        public Criteria andFFbizhongEqualTo(String value) {
            addCriterion("f_fbizhong =", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongNotEqualTo(String value) {
            addCriterion("f_fbizhong <>", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongGreaterThan(String value) {
            addCriterion("f_fbizhong >", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongGreaterThanOrEqualTo(String value) {
            addCriterion("f_fbizhong >=", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongLessThan(String value) {
            addCriterion("f_fbizhong <", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongLessThanOrEqualTo(String value) {
            addCriterion("f_fbizhong <=", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongLike(String value) {
            addCriterion("f_fbizhong like", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongNotLike(String value) {
            addCriterion("f_fbizhong not like", value, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongIn(List<String> values) {
            addCriterion("f_fbizhong in", values, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongNotIn(List<String> values) {
            addCriterion("f_fbizhong not in", values, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongBetween(String value1, String value2) {
            addCriterion("f_fbizhong between", value1, value2, "fFbizhong");
            return (Criteria) this;
        }

        public Criteria andFFbizhongNotBetween(String value1, String value2) {
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

        public Criteria andFAssignPointIsNull() {
            addCriterion("f_assign_point is null");
            return (Criteria) this;
        }

        public Criteria andFAssignPointIsNotNull() {
            addCriterion("f_assign_point is not null");
            return (Criteria) this;
        }

        public Criteria andFAssignPointEqualTo(String value) {
            addCriterion("f_assign_point =", value, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNotEqualTo(String value) {
            addCriterion("f_assign_point <>", value, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointGreaterThan(String value) {
            addCriterion("f_assign_point >", value, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointGreaterThanOrEqualTo(String value) {
            addCriterion("f_assign_point >=", value, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointLessThan(String value) {
            addCriterion("f_assign_point <", value, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointLessThanOrEqualTo(String value) {
            addCriterion("f_assign_point <=", value, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointLike(String value) {
            addCriterion("f_assign_point like", value, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNotLike(String value) {
            addCriterion("f_assign_point not like", value, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointIn(List<String> values) {
            addCriterion("f_assign_point in", values, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNotIn(List<String> values) {
            addCriterion("f_assign_point not in", values, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointBetween(String value1, String value2) {
            addCriterion("f_assign_point between", value1, value2, "fAssignPoint");
            return (Criteria) this;
        }

        public Criteria andFAssignPointNotBetween(String value1, String value2) {
            addCriterion("f_assign_point not between", value1, value2, "fAssignPoint");
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

        public Criteria andFProfileIsNull() {
            addCriterion("f_profile is null");
            return (Criteria) this;
        }

        public Criteria andFProfileIsNotNull() {
            addCriterion("f_profile is not null");
            return (Criteria) this;
        }

        public Criteria andFProfileEqualTo(String value) {
            addCriterion("f_profile =", value, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileNotEqualTo(String value) {
            addCriterion("f_profile <>", value, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileGreaterThan(String value) {
            addCriterion("f_profile >", value, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileGreaterThanOrEqualTo(String value) {
            addCriterion("f_profile >=", value, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileLessThan(String value) {
            addCriterion("f_profile <", value, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileLessThanOrEqualTo(String value) {
            addCriterion("f_profile <=", value, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileLike(String value) {
            addCriterion("f_profile like", value, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileNotLike(String value) {
            addCriterion("f_profile not like", value, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileIn(List<String> values) {
            addCriterion("f_profile in", values, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileNotIn(List<String> values) {
            addCriterion("f_profile not in", values, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileBetween(String value1, String value2) {
            addCriterion("f_profile between", value1, value2, "fProfile");
            return (Criteria) this;
        }

        public Criteria andFProfileNotBetween(String value1, String value2) {
            addCriterion("f_profile not between", value1, value2, "fProfile");
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

        public Criteria andFBversionnoIsNull() {
            addCriterion("f_bversionno is null");
            return (Criteria) this;
        }

        public Criteria andFBversionnoIsNotNull() {
            addCriterion("f_bversionno is not null");
            return (Criteria) this;
        }

        public Criteria andFBversionnoEqualTo(String value) {
            addCriterion("f_bversionno =", value, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoNotEqualTo(String value) {
            addCriterion("f_bversionno <>", value, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoGreaterThan(String value) {
            addCriterion("f_bversionno >", value, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_bversionno >=", value, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoLessThan(String value) {
            addCriterion("f_bversionno <", value, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoLessThanOrEqualTo(String value) {
            addCriterion("f_bversionno <=", value, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoLike(String value) {
            addCriterion("f_bversionno like", value, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoNotLike(String value) {
            addCriterion("f_bversionno not like", value, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoIn(List<String> values) {
            addCriterion("f_bversionno in", values, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoNotIn(List<String> values) {
            addCriterion("f_bversionno not in", values, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoBetween(String value1, String value2) {
            addCriterion("f_bversionno between", value1, value2, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnoNotBetween(String value1, String value2) {
            addCriterion("f_bversionno not between", value1, value2, "fBversionno");
            return (Criteria) this;
        }

        public Criteria andFBversionnameIsNull() {
            addCriterion("f_bversionname is null");
            return (Criteria) this;
        }

        public Criteria andFBversionnameIsNotNull() {
            addCriterion("f_bversionname is not null");
            return (Criteria) this;
        }

        public Criteria andFBversionnameEqualTo(String value) {
            addCriterion("f_bversionname =", value, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameNotEqualTo(String value) {
            addCriterion("f_bversionname <>", value, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameGreaterThan(String value) {
            addCriterion("f_bversionname >", value, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_bversionname >=", value, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameLessThan(String value) {
            addCriterion("f_bversionname <", value, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameLessThanOrEqualTo(String value) {
            addCriterion("f_bversionname <=", value, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameLike(String value) {
            addCriterion("f_bversionname like", value, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameNotLike(String value) {
            addCriterion("f_bversionname not like", value, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameIn(List<String> values) {
            addCriterion("f_bversionname in", values, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameNotIn(List<String> values) {
            addCriterion("f_bversionname not in", values, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameBetween(String value1, String value2) {
            addCriterion("f_bversionname between", value1, value2, "fBversionname");
            return (Criteria) this;
        }

        public Criteria andFBversionnameNotBetween(String value1, String value2) {
            addCriterion("f_bversionname not between", value1, value2, "fBversionname");
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

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
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