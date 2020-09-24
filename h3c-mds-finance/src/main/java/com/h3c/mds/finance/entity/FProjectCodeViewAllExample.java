package com.h3c.mds.finance.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FProjectCodeViewAllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FProjectCodeViewAllExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andFProductlineNameProductcodeIsNull() {
            addCriterion("f_productline_name_productCode is null");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeIsNotNull() {
            addCriterion("f_productline_name_productCode is not null");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeEqualTo(String value) {
            addCriterion("f_productline_name_productCode =", value, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeNotEqualTo(String value) {
            addCriterion("f_productline_name_productCode <>", value, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeGreaterThan(String value) {
            addCriterion("f_productline_name_productCode >", value, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_productline_name_productCode >=", value, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeLessThan(String value) {
            addCriterion("f_productline_name_productCode <", value, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeLessThanOrEqualTo(String value) {
            addCriterion("f_productline_name_productCode <=", value, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeLike(String value) {
            addCriterion("f_productline_name_productCode like", value, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeNotLike(String value) {
            addCriterion("f_productline_name_productCode not like", value, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeIn(List<String> values) {
            addCriterion("f_productline_name_productCode in", values, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeNotIn(List<String> values) {
            addCriterion("f_productline_name_productCode not in", values, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeBetween(String value1, String value2) {
            addCriterion("f_productline_name_productCode between", value1, value2, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductlineNameProductcodeNotBetween(String value1, String value2) {
            addCriterion("f_productline_name_productCode not between", value1, value2, "fProductlineNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIsNull() {
            addCriterion("f_product_code is null");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIsNotNull() {
            addCriterion("f_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andFProductCodeEqualTo(String value) {
            addCriterion("f_product_code =", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotEqualTo(String value) {
            addCriterion("f_product_code <>", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeGreaterThan(String value) {
            addCriterion("f_product_code >", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_product_code >=", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLessThan(String value) {
            addCriterion("f_product_code <", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLessThanOrEqualTo(String value) {
            addCriterion("f_product_code <=", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeLike(String value) {
            addCriterion("f_product_code like", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotLike(String value) {
            addCriterion("f_product_code not like", value, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeIn(List<String> values) {
            addCriterion("f_product_code in", values, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotIn(List<String> values) {
            addCriterion("f_product_code not in", values, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeBetween(String value1, String value2) {
            addCriterion("f_product_code between", value1, value2, "fProductCode");
            return (Criteria) this;
        }

        public Criteria andFProductCodeNotBetween(String value1, String value2) {
            addCriterion("f_product_code not between", value1, value2, "fProductCode");
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

        public Criteria andFPdtNameProductcodeIsNull() {
            addCriterion("f_pdt_name_productCode is null");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeIsNotNull() {
            addCriterion("f_pdt_name_productCode is not null");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeEqualTo(String value) {
            addCriterion("f_pdt_name_productCode =", value, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeNotEqualTo(String value) {
            addCriterion("f_pdt_name_productCode <>", value, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeGreaterThan(String value) {
            addCriterion("f_pdt_name_productCode >", value, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_pdt_name_productCode >=", value, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeLessThan(String value) {
            addCriterion("f_pdt_name_productCode <", value, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeLessThanOrEqualTo(String value) {
            addCriterion("f_pdt_name_productCode <=", value, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeLike(String value) {
            addCriterion("f_pdt_name_productCode like", value, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeNotLike(String value) {
            addCriterion("f_pdt_name_productCode not like", value, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeIn(List<String> values) {
            addCriterion("f_pdt_name_productCode in", values, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeNotIn(List<String> values) {
            addCriterion("f_pdt_name_productCode not in", values, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeBetween(String value1, String value2) {
            addCriterion("f_pdt_name_productCode between", value1, value2, "fPdtNameProductcode");
            return (Criteria) this;
        }

        public Criteria andFPdtNameProductcodeNotBetween(String value1, String value2) {
            addCriterion("f_pdt_name_productCode not between", value1, value2, "fPdtNameProductcode");
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

        public Criteria andFOldObjcaIsNull() {
            addCriterion("f_old_objca is null");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaIsNotNull() {
            addCriterion("f_old_objca is not null");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaEqualTo(String value) {
            addCriterion("f_old_objca =", value, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNotEqualTo(String value) {
            addCriterion("f_old_objca <>", value, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaGreaterThan(String value) {
            addCriterion("f_old_objca >", value, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_objca >=", value, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaLessThan(String value) {
            addCriterion("f_old_objca <", value, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaLessThanOrEqualTo(String value) {
            addCriterion("f_old_objca <=", value, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaLike(String value) {
            addCriterion("f_old_objca like", value, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNotLike(String value) {
            addCriterion("f_old_objca not like", value, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaIn(List<String> values) {
            addCriterion("f_old_objca in", values, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNotIn(List<String> values) {
            addCriterion("f_old_objca not in", values, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaBetween(String value1, String value2) {
            addCriterion("f_old_objca between", value1, value2, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNotBetween(String value1, String value2) {
            addCriterion("f_old_objca not between", value1, value2, "fOldObjca");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameIsNull() {
            addCriterion("f_old_objca_name is null");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameIsNotNull() {
            addCriterion("f_old_objca_name is not null");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameEqualTo(String value) {
            addCriterion("f_old_objca_name =", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameNotEqualTo(String value) {
            addCriterion("f_old_objca_name <>", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameGreaterThan(String value) {
            addCriterion("f_old_objca_name >", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_objca_name >=", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameLessThan(String value) {
            addCriterion("f_old_objca_name <", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameLessThanOrEqualTo(String value) {
            addCriterion("f_old_objca_name <=", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameLike(String value) {
            addCriterion("f_old_objca_name like", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameNotLike(String value) {
            addCriterion("f_old_objca_name not like", value, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameIn(List<String> values) {
            addCriterion("f_old_objca_name in", values, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameNotIn(List<String> values) {
            addCriterion("f_old_objca_name not in", values, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameBetween(String value1, String value2) {
            addCriterion("f_old_objca_name between", value1, value2, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldObjcaNameNotBetween(String value1, String value2) {
            addCriterion("f_old_objca_name not between", value1, value2, "fOldObjcaName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoIsNull() {
            addCriterion("f_old_pdtno is null");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoIsNotNull() {
            addCriterion("f_old_pdtno is not null");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoEqualTo(String value) {
            addCriterion("f_old_pdtno =", value, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoNotEqualTo(String value) {
            addCriterion("f_old_pdtno <>", value, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoGreaterThan(String value) {
            addCriterion("f_old_pdtno >", value, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_pdtno >=", value, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoLessThan(String value) {
            addCriterion("f_old_pdtno <", value, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoLessThanOrEqualTo(String value) {
            addCriterion("f_old_pdtno <=", value, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoLike(String value) {
            addCriterion("f_old_pdtno like", value, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoNotLike(String value) {
            addCriterion("f_old_pdtno not like", value, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoIn(List<String> values) {
            addCriterion("f_old_pdtno in", values, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoNotIn(List<String> values) {
            addCriterion("f_old_pdtno not in", values, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoBetween(String value1, String value2) {
            addCriterion("f_old_pdtno between", value1, value2, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtnoNotBetween(String value1, String value2) {
            addCriterion("f_old_pdtno not between", value1, value2, "fOldPdtno");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameIsNull() {
            addCriterion("f_old_pdt_name is null");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameIsNotNull() {
            addCriterion("f_old_pdt_name is not null");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameEqualTo(String value) {
            addCriterion("f_old_pdt_name =", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameNotEqualTo(String value) {
            addCriterion("f_old_pdt_name <>", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameGreaterThan(String value) {
            addCriterion("f_old_pdt_name >", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_pdt_name >=", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameLessThan(String value) {
            addCriterion("f_old_pdt_name <", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameLessThanOrEqualTo(String value) {
            addCriterion("f_old_pdt_name <=", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameLike(String value) {
            addCriterion("f_old_pdt_name like", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameNotLike(String value) {
            addCriterion("f_old_pdt_name not like", value, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameIn(List<String> values) {
            addCriterion("f_old_pdt_name in", values, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameNotIn(List<String> values) {
            addCriterion("f_old_pdt_name not in", values, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameBetween(String value1, String value2) {
            addCriterion("f_old_pdt_name between", value1, value2, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldPdtNameNotBetween(String value1, String value2) {
            addCriterion("f_old_pdt_name not between", value1, value2, "fOldPdtName");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoIsNull() {
            addCriterion("f_old_projno is null");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoIsNotNull() {
            addCriterion("f_old_projno is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoEqualTo(String value) {
            addCriterion("f_old_projno =", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoNotEqualTo(String value) {
            addCriterion("f_old_projno <>", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoGreaterThan(String value) {
            addCriterion("f_old_projno >", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_projno >=", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoLessThan(String value) {
            addCriterion("f_old_projno <", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoLessThanOrEqualTo(String value) {
            addCriterion("f_old_projno <=", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoLike(String value) {
            addCriterion("f_old_projno like", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoNotLike(String value) {
            addCriterion("f_old_projno not like", value, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoIn(List<String> values) {
            addCriterion("f_old_projno in", values, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoNotIn(List<String> values) {
            addCriterion("f_old_projno not in", values, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoBetween(String value1, String value2) {
            addCriterion("f_old_projno between", value1, value2, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnoNotBetween(String value1, String value2) {
            addCriterion("f_old_projno not between", value1, value2, "fOldProjno");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameIsNull() {
            addCriterion("f_old_projname is null");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameIsNotNull() {
            addCriterion("f_old_projname is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameEqualTo(String value) {
            addCriterion("f_old_projname =", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameNotEqualTo(String value) {
            addCriterion("f_old_projname <>", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameGreaterThan(String value) {
            addCriterion("f_old_projname >", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_projname >=", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameLessThan(String value) {
            addCriterion("f_old_projname <", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameLessThanOrEqualTo(String value) {
            addCriterion("f_old_projname <=", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameLike(String value) {
            addCriterion("f_old_projname like", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameNotLike(String value) {
            addCriterion("f_old_projname not like", value, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameIn(List<String> values) {
            addCriterion("f_old_projname in", values, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameNotIn(List<String> values) {
            addCriterion("f_old_projname not in", values, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameBetween(String value1, String value2) {
            addCriterion("f_old_projname between", value1, value2, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjnameNotBetween(String value1, String value2) {
            addCriterion("f_old_projname not between", value1, value2, "fOldProjname");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeIsNull() {
            addCriterion("f_old_projcode is null");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeIsNotNull() {
            addCriterion("f_old_projcode is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeEqualTo(String value) {
            addCriterion("f_old_projcode =", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeNotEqualTo(String value) {
            addCriterion("f_old_projcode <>", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeGreaterThan(String value) {
            addCriterion("f_old_projcode >", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_projcode >=", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeLessThan(String value) {
            addCriterion("f_old_projcode <", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeLessThanOrEqualTo(String value) {
            addCriterion("f_old_projcode <=", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeLike(String value) {
            addCriterion("f_old_projcode like", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeNotLike(String value) {
            addCriterion("f_old_projcode not like", value, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeIn(List<String> values) {
            addCriterion("f_old_projcode in", values, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeNotIn(List<String> values) {
            addCriterion("f_old_projcode not in", values, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeBetween(String value1, String value2) {
            addCriterion("f_old_projcode between", value1, value2, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProjcodeNotBetween(String value1, String value2) {
            addCriterion("f_old_projcode not between", value1, value2, "fOldProjcode");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoIsNull() {
            addCriterion("f_old_productlineno is null");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoIsNotNull() {
            addCriterion("f_old_productlineno is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoEqualTo(String value) {
            addCriterion("f_old_productlineno =", value, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoNotEqualTo(String value) {
            addCriterion("f_old_productlineno <>", value, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoGreaterThan(String value) {
            addCriterion("f_old_productlineno >", value, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_productlineno >=", value, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoLessThan(String value) {
            addCriterion("f_old_productlineno <", value, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoLessThanOrEqualTo(String value) {
            addCriterion("f_old_productlineno <=", value, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoLike(String value) {
            addCriterion("f_old_productlineno like", value, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoNotLike(String value) {
            addCriterion("f_old_productlineno not like", value, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoIn(List<String> values) {
            addCriterion("f_old_productlineno in", values, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoNotIn(List<String> values) {
            addCriterion("f_old_productlineno not in", values, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoBetween(String value1, String value2) {
            addCriterion("f_old_productlineno between", value1, value2, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlinenoNotBetween(String value1, String value2) {
            addCriterion("f_old_productlineno not between", value1, value2, "fOldProductlineno");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameIsNull() {
            addCriterion("f_old_productline_name is null");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameIsNotNull() {
            addCriterion("f_old_productline_name is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameEqualTo(String value) {
            addCriterion("f_old_productline_name =", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameNotEqualTo(String value) {
            addCriterion("f_old_productline_name <>", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameGreaterThan(String value) {
            addCriterion("f_old_productline_name >", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_productline_name >=", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameLessThan(String value) {
            addCriterion("f_old_productline_name <", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameLessThanOrEqualTo(String value) {
            addCriterion("f_old_productline_name <=", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameLike(String value) {
            addCriterion("f_old_productline_name like", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameNotLike(String value) {
            addCriterion("f_old_productline_name not like", value, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameIn(List<String> values) {
            addCriterion("f_old_productline_name in", values, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameNotIn(List<String> values) {
            addCriterion("f_old_productline_name not in", values, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameBetween(String value1, String value2) {
            addCriterion("f_old_productline_name between", value1, value2, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldProductlineNameNotBetween(String value1, String value2) {
            addCriterion("f_old_productline_name not between", value1, value2, "fOldProductlineName");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoIsNull() {
            addCriterion("f_old_releaseno is null");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoIsNotNull() {
            addCriterion("f_old_releaseno is not null");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoEqualTo(String value) {
            addCriterion("f_old_releaseno =", value, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoNotEqualTo(String value) {
            addCriterion("f_old_releaseno <>", value, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoGreaterThan(String value) {
            addCriterion("f_old_releaseno >", value, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_releaseno >=", value, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoLessThan(String value) {
            addCriterion("f_old_releaseno <", value, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoLessThanOrEqualTo(String value) {
            addCriterion("f_old_releaseno <=", value, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoLike(String value) {
            addCriterion("f_old_releaseno like", value, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoNotLike(String value) {
            addCriterion("f_old_releaseno not like", value, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoIn(List<String> values) {
            addCriterion("f_old_releaseno in", values, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoNotIn(List<String> values) {
            addCriterion("f_old_releaseno not in", values, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoBetween(String value1, String value2) {
            addCriterion("f_old_releaseno between", value1, value2, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldReleasenoNotBetween(String value1, String value2) {
            addCriterion("f_old_releaseno not between", value1, value2, "fOldReleaseno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoIsNull() {
            addCriterion("f_old_productno is null");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoIsNotNull() {
            addCriterion("f_old_productno is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoEqualTo(String value) {
            addCriterion("f_old_productno =", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoNotEqualTo(String value) {
            addCriterion("f_old_productno <>", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoGreaterThan(String value) {
            addCriterion("f_old_productno >", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_productno >=", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoLessThan(String value) {
            addCriterion("f_old_productno <", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoLessThanOrEqualTo(String value) {
            addCriterion("f_old_productno <=", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoLike(String value) {
            addCriterion("f_old_productno like", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoNotLike(String value) {
            addCriterion("f_old_productno not like", value, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoIn(List<String> values) {
            addCriterion("f_old_productno in", values, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoNotIn(List<String> values) {
            addCriterion("f_old_productno not in", values, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoBetween(String value1, String value2) {
            addCriterion("f_old_productno between", value1, value2, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnoNotBetween(String value1, String value2) {
            addCriterion("f_old_productno not between", value1, value2, "fOldProductno");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameIsNull() {
            addCriterion("f_old_productname is null");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameIsNotNull() {
            addCriterion("f_old_productname is not null");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameEqualTo(String value) {
            addCriterion("f_old_productname =", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameNotEqualTo(String value) {
            addCriterion("f_old_productname <>", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameGreaterThan(String value) {
            addCriterion("f_old_productname >", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_productname >=", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameLessThan(String value) {
            addCriterion("f_old_productname <", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameLessThanOrEqualTo(String value) {
            addCriterion("f_old_productname <=", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameLike(String value) {
            addCriterion("f_old_productname like", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameNotLike(String value) {
            addCriterion("f_old_productname not like", value, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameIn(List<String> values) {
            addCriterion("f_old_productname in", values, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameNotIn(List<String> values) {
            addCriterion("f_old_productname not in", values, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameBetween(String value1, String value2) {
            addCriterion("f_old_productname between", value1, value2, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldProductnameNotBetween(String value1, String value2) {
            addCriterion("f_old_productname not between", value1, value2, "fOldProductname");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongIsNull() {
            addCriterion("f_old_bizhong is null");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongIsNotNull() {
            addCriterion("f_old_bizhong is not null");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongEqualTo(String value) {
            addCriterion("f_old_bizhong =", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongNotEqualTo(String value) {
            addCriterion("f_old_bizhong <>", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongGreaterThan(String value) {
            addCriterion("f_old_bizhong >", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_bizhong >=", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongLessThan(String value) {
            addCriterion("f_old_bizhong <", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongLessThanOrEqualTo(String value) {
            addCriterion("f_old_bizhong <=", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongLike(String value) {
            addCriterion("f_old_bizhong like", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongNotLike(String value) {
            addCriterion("f_old_bizhong not like", value, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongIn(List<String> values) {
            addCriterion("f_old_bizhong in", values, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongNotIn(List<String> values) {
            addCriterion("f_old_bizhong not in", values, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongBetween(String value1, String value2) {
            addCriterion("f_old_bizhong between", value1, value2, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldBizhongNotBetween(String value1, String value2) {
            addCriterion("f_old_bizhong not between", value1, value2, "fOldBizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongIsNull() {
            addCriterion("f_old_fbizhong is null");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongIsNotNull() {
            addCriterion("f_old_fbizhong is not null");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongEqualTo(String value) {
            addCriterion("f_old_fbizhong =", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongNotEqualTo(String value) {
            addCriterion("f_old_fbizhong <>", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongGreaterThan(String value) {
            addCriterion("f_old_fbizhong >", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_fbizhong >=", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongLessThan(String value) {
            addCriterion("f_old_fbizhong <", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongLessThanOrEqualTo(String value) {
            addCriterion("f_old_fbizhong <=", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongLike(String value) {
            addCriterion("f_old_fbizhong like", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongNotLike(String value) {
            addCriterion("f_old_fbizhong not like", value, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongIn(List<String> values) {
            addCriterion("f_old_fbizhong in", values, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongNotIn(List<String> values) {
            addCriterion("f_old_fbizhong not in", values, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongBetween(String value1, String value2) {
            addCriterion("f_old_fbizhong between", value1, value2, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldFbizhongNotBetween(String value1, String value2) {
            addCriterion("f_old_fbizhong not between", value1, value2, "fOldFbizhong");
            return (Criteria) this;
        }

        public Criteria andFOldRateIsNull() {
            addCriterion("f_old_rate is null");
            return (Criteria) this;
        }

        public Criteria andFOldRateIsNotNull() {
            addCriterion("f_old_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFOldRateEqualTo(String value) {
            addCriterion("f_old_rate =", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotEqualTo(String value) {
            addCriterion("f_old_rate <>", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateGreaterThan(String value) {
            addCriterion("f_old_rate >", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_rate >=", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateLessThan(String value) {
            addCriterion("f_old_rate <", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateLessThanOrEqualTo(String value) {
            addCriterion("f_old_rate <=", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateLike(String value) {
            addCriterion("f_old_rate like", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotLike(String value) {
            addCriterion("f_old_rate not like", value, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateIn(List<String> values) {
            addCriterion("f_old_rate in", values, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotIn(List<String> values) {
            addCriterion("f_old_rate not in", values, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateBetween(String value1, String value2) {
            addCriterion("f_old_rate between", value1, value2, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldRateNotBetween(String value1, String value2) {
            addCriterion("f_old_rate not between", value1, value2, "fOldRate");
            return (Criteria) this;
        }

        public Criteria andFOldVersionIsNull() {
            addCriterion("f_old_version is null");
            return (Criteria) this;
        }

        public Criteria andFOldVersionIsNotNull() {
            addCriterion("f_old_version is not null");
            return (Criteria) this;
        }

        public Criteria andFOldVersionEqualTo(String value) {
            addCriterion("f_old_version =", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionNotEqualTo(String value) {
            addCriterion("f_old_version <>", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionGreaterThan(String value) {
            addCriterion("f_old_version >", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionGreaterThanOrEqualTo(String value) {
            addCriterion("f_old_version >=", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionLessThan(String value) {
            addCriterion("f_old_version <", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionLessThanOrEqualTo(String value) {
            addCriterion("f_old_version <=", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionLike(String value) {
            addCriterion("f_old_version like", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionNotLike(String value) {
            addCriterion("f_old_version not like", value, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionIn(List<String> values) {
            addCriterion("f_old_version in", values, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionNotIn(List<String> values) {
            addCriterion("f_old_version not in", values, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionBetween(String value1, String value2) {
            addCriterion("f_old_version between", value1, value2, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andFOldVersionNotBetween(String value1, String value2) {
            addCriterion("f_old_version not between", value1, value2, "fOldVersion");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
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

        public Criteria andUpdatestatusIsNull() {
            addCriterion("updateStatus is null");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusIsNotNull() {
            addCriterion("updateStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusEqualTo(String value) {
            addCriterion("updateStatus =", value, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusNotEqualTo(String value) {
            addCriterion("updateStatus <>", value, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusGreaterThan(String value) {
            addCriterion("updateStatus >", value, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusGreaterThanOrEqualTo(String value) {
            addCriterion("updateStatus >=", value, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusLessThan(String value) {
            addCriterion("updateStatus <", value, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusLessThanOrEqualTo(String value) {
            addCriterion("updateStatus <=", value, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusLike(String value) {
            addCriterion("updateStatus like", value, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusNotLike(String value) {
            addCriterion("updateStatus not like", value, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusIn(List<String> values) {
            addCriterion("updateStatus in", values, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusNotIn(List<String> values) {
            addCriterion("updateStatus not in", values, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusBetween(String value1, String value2) {
            addCriterion("updateStatus between", value1, value2, "updatestatus");
            return (Criteria) this;
        }

        public Criteria andUpdatestatusNotBetween(String value1, String value2) {
            addCriterion("updateStatus not between", value1, value2, "updatestatus");
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