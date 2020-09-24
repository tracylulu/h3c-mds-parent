package com.h3c.mds.dept.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ViewDeptWithLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewDeptWithLevelExample() {
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

        public Criteria andFirstcodeIsNull() {
            addCriterion("firstCode is null");
            return (Criteria) this;
        }

        public Criteria andFirstcodeIsNotNull() {
            addCriterion("firstCode is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcodeEqualTo(String value) {
            addCriterion("firstCode =", value, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeNotEqualTo(String value) {
            addCriterion("firstCode <>", value, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeGreaterThan(String value) {
            addCriterion("firstCode >", value, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeGreaterThanOrEqualTo(String value) {
            addCriterion("firstCode >=", value, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeLessThan(String value) {
            addCriterion("firstCode <", value, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeLessThanOrEqualTo(String value) {
            addCriterion("firstCode <=", value, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeLike(String value) {
            addCriterion("firstCode like", value, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeNotLike(String value) {
            addCriterion("firstCode not like", value, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeIn(List<String> values) {
            addCriterion("firstCode in", values, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeNotIn(List<String> values) {
            addCriterion("firstCode not in", values, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeBetween(String value1, String value2) {
            addCriterion("firstCode between", value1, value2, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstcodeNotBetween(String value1, String value2) {
            addCriterion("firstCode not between", value1, value2, "firstcode");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("firstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("firstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("firstName =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("firstName <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("firstName >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("firstName >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("firstName <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("firstName <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("firstName like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("firstName not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("firstName in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("firstName not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("firstName between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("firstName not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andSecondcodeIsNull() {
            addCriterion("secondCode is null");
            return (Criteria) this;
        }

        public Criteria andSecondcodeIsNotNull() {
            addCriterion("secondCode is not null");
            return (Criteria) this;
        }

        public Criteria andSecondcodeEqualTo(String value) {
            addCriterion("secondCode =", value, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeNotEqualTo(String value) {
            addCriterion("secondCode <>", value, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeGreaterThan(String value) {
            addCriterion("secondCode >", value, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeGreaterThanOrEqualTo(String value) {
            addCriterion("secondCode >=", value, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeLessThan(String value) {
            addCriterion("secondCode <", value, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeLessThanOrEqualTo(String value) {
            addCriterion("secondCode <=", value, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeLike(String value) {
            addCriterion("secondCode like", value, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeNotLike(String value) {
            addCriterion("secondCode not like", value, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeIn(List<String> values) {
            addCriterion("secondCode in", values, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeNotIn(List<String> values) {
            addCriterion("secondCode not in", values, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeBetween(String value1, String value2) {
            addCriterion("secondCode between", value1, value2, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondcodeNotBetween(String value1, String value2) {
            addCriterion("secondCode not between", value1, value2, "secondcode");
            return (Criteria) this;
        }

        public Criteria andSecondnameIsNull() {
            addCriterion("secondName is null");
            return (Criteria) this;
        }

        public Criteria andSecondnameIsNotNull() {
            addCriterion("secondName is not null");
            return (Criteria) this;
        }

        public Criteria andSecondnameEqualTo(String value) {
            addCriterion("secondName =", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotEqualTo(String value) {
            addCriterion("secondName <>", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameGreaterThan(String value) {
            addCriterion("secondName >", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameGreaterThanOrEqualTo(String value) {
            addCriterion("secondName >=", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLessThan(String value) {
            addCriterion("secondName <", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLessThanOrEqualTo(String value) {
            addCriterion("secondName <=", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLike(String value) {
            addCriterion("secondName like", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotLike(String value) {
            addCriterion("secondName not like", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameIn(List<String> values) {
            addCriterion("secondName in", values, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotIn(List<String> values) {
            addCriterion("secondName not in", values, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameBetween(String value1, String value2) {
            addCriterion("secondName between", value1, value2, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotBetween(String value1, String value2) {
            addCriterion("secondName not between", value1, value2, "secondname");
            return (Criteria) this;
        }

        public Criteria andThirdcodeIsNull() {
            addCriterion("thirdCode is null");
            return (Criteria) this;
        }

        public Criteria andThirdcodeIsNotNull() {
            addCriterion("thirdCode is not null");
            return (Criteria) this;
        }

        public Criteria andThirdcodeEqualTo(String value) {
            addCriterion("thirdCode =", value, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeNotEqualTo(String value) {
            addCriterion("thirdCode <>", value, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeGreaterThan(String value) {
            addCriterion("thirdCode >", value, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("thirdCode >=", value, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeLessThan(String value) {
            addCriterion("thirdCode <", value, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeLessThanOrEqualTo(String value) {
            addCriterion("thirdCode <=", value, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeLike(String value) {
            addCriterion("thirdCode like", value, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeNotLike(String value) {
            addCriterion("thirdCode not like", value, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeIn(List<String> values) {
            addCriterion("thirdCode in", values, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeNotIn(List<String> values) {
            addCriterion("thirdCode not in", values, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeBetween(String value1, String value2) {
            addCriterion("thirdCode between", value1, value2, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdcodeNotBetween(String value1, String value2) {
            addCriterion("thirdCode not between", value1, value2, "thirdcode");
            return (Criteria) this;
        }

        public Criteria andThirdnameIsNull() {
            addCriterion("thirdName is null");
            return (Criteria) this;
        }

        public Criteria andThirdnameIsNotNull() {
            addCriterion("thirdName is not null");
            return (Criteria) this;
        }

        public Criteria andThirdnameEqualTo(String value) {
            addCriterion("thirdName =", value, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameNotEqualTo(String value) {
            addCriterion("thirdName <>", value, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameGreaterThan(String value) {
            addCriterion("thirdName >", value, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameGreaterThanOrEqualTo(String value) {
            addCriterion("thirdName >=", value, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameLessThan(String value) {
            addCriterion("thirdName <", value, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameLessThanOrEqualTo(String value) {
            addCriterion("thirdName <=", value, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameLike(String value) {
            addCriterion("thirdName like", value, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameNotLike(String value) {
            addCriterion("thirdName not like", value, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameIn(List<String> values) {
            addCriterion("thirdName in", values, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameNotIn(List<String> values) {
            addCriterion("thirdName not in", values, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameBetween(String value1, String value2) {
            addCriterion("thirdName between", value1, value2, "thirdname");
            return (Criteria) this;
        }

        public Criteria andThirdnameNotBetween(String value1, String value2) {
            addCriterion("thirdName not between", value1, value2, "thirdname");
            return (Criteria) this;
        }

        public Criteria andFourthcodeIsNull() {
            addCriterion("fourthCode is null");
            return (Criteria) this;
        }

        public Criteria andFourthcodeIsNotNull() {
            addCriterion("fourthCode is not null");
            return (Criteria) this;
        }

        public Criteria andFourthcodeEqualTo(String value) {
            addCriterion("fourthCode =", value, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeNotEqualTo(String value) {
            addCriterion("fourthCode <>", value, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeGreaterThan(String value) {
            addCriterion("fourthCode >", value, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fourthCode >=", value, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeLessThan(String value) {
            addCriterion("fourthCode <", value, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeLessThanOrEqualTo(String value) {
            addCriterion("fourthCode <=", value, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeLike(String value) {
            addCriterion("fourthCode like", value, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeNotLike(String value) {
            addCriterion("fourthCode not like", value, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeIn(List<String> values) {
            addCriterion("fourthCode in", values, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeNotIn(List<String> values) {
            addCriterion("fourthCode not in", values, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeBetween(String value1, String value2) {
            addCriterion("fourthCode between", value1, value2, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthcodeNotBetween(String value1, String value2) {
            addCriterion("fourthCode not between", value1, value2, "fourthcode");
            return (Criteria) this;
        }

        public Criteria andFourthnameIsNull() {
            addCriterion("fourthName is null");
            return (Criteria) this;
        }

        public Criteria andFourthnameIsNotNull() {
            addCriterion("fourthName is not null");
            return (Criteria) this;
        }

        public Criteria andFourthnameEqualTo(String value) {
            addCriterion("fourthName =", value, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameNotEqualTo(String value) {
            addCriterion("fourthName <>", value, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameGreaterThan(String value) {
            addCriterion("fourthName >", value, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameGreaterThanOrEqualTo(String value) {
            addCriterion("fourthName >=", value, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameLessThan(String value) {
            addCriterion("fourthName <", value, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameLessThanOrEqualTo(String value) {
            addCriterion("fourthName <=", value, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameLike(String value) {
            addCriterion("fourthName like", value, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameNotLike(String value) {
            addCriterion("fourthName not like", value, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameIn(List<String> values) {
            addCriterion("fourthName in", values, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameNotIn(List<String> values) {
            addCriterion("fourthName not in", values, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameBetween(String value1, String value2) {
            addCriterion("fourthName between", value1, value2, "fourthname");
            return (Criteria) this;
        }

        public Criteria andFourthnameNotBetween(String value1, String value2) {
            addCriterion("fourthName not between", value1, value2, "fourthname");
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCoacodeIsNull() {
            addCriterion("COACode is null");
            return (Criteria) this;
        }

        public Criteria andCoacodeIsNotNull() {
            addCriterion("COACode is not null");
            return (Criteria) this;
        }

        public Criteria andCoacodeEqualTo(String value) {
            addCriterion("COACode =", value, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeNotEqualTo(String value) {
            addCriterion("COACode <>", value, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeGreaterThan(String value) {
            addCriterion("COACode >", value, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeGreaterThanOrEqualTo(String value) {
            addCriterion("COACode >=", value, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeLessThan(String value) {
            addCriterion("COACode <", value, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeLessThanOrEqualTo(String value) {
            addCriterion("COACode <=", value, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeLike(String value) {
            addCriterion("COACode like", value, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeNotLike(String value) {
            addCriterion("COACode not like", value, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeIn(List<String> values) {
            addCriterion("COACode in", values, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeNotIn(List<String> values) {
            addCriterion("COACode not in", values, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeBetween(String value1, String value2) {
            addCriterion("COACode between", value1, value2, "coacode");
            return (Criteria) this;
        }

        public Criteria andCoacodeNotBetween(String value1, String value2) {
            addCriterion("COACode not between", value1, value2, "coacode");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("Nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("Nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("Nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("Nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("Nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("Nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("Nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("Nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("Nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("Nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("Nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("Nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("Nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("Nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNull() {
            addCriterion("parentCode is null");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNotNull() {
            addCriterion("parentCode is not null");
            return (Criteria) this;
        }

        public Criteria andParentcodeEqualTo(String value) {
            addCriterion("parentCode =", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotEqualTo(String value) {
            addCriterion("parentCode <>", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThan(String value) {
            addCriterion("parentCode >", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("parentCode >=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThan(String value) {
            addCriterion("parentCode <", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThanOrEqualTo(String value) {
            addCriterion("parentCode <=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLike(String value) {
            addCriterion("parentCode like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotLike(String value) {
            addCriterion("parentCode not like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeIn(List<String> values) {
            addCriterion("parentCode in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotIn(List<String> values) {
            addCriterion("parentCode not in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeBetween(String value1, String value2) {
            addCriterion("parentCode between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotBetween(String value1, String value2) {
            addCriterion("parentCode not between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(BigDecimal value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(BigDecimal value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(BigDecimal value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(BigDecimal value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<BigDecimal> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<BigDecimal> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andManagernameIsNull() {
            addCriterion("ManagerName is null");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNotNull() {
            addCriterion("ManagerName is not null");
            return (Criteria) this;
        }

        public Criteria andManagernameEqualTo(String value) {
            addCriterion("ManagerName =", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotEqualTo(String value) {
            addCriterion("ManagerName <>", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThan(String value) {
            addCriterion("ManagerName >", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerName >=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThan(String value) {
            addCriterion("ManagerName <", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThanOrEqualTo(String value) {
            addCriterion("ManagerName <=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLike(String value) {
            addCriterion("ManagerName like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotLike(String value) {
            addCriterion("ManagerName not like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameIn(List<String> values) {
            addCriterion("ManagerName in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotIn(List<String> values) {
            addCriterion("ManagerName not in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameBetween(String value1, String value2) {
            addCriterion("ManagerName between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotBetween(String value1, String value2) {
            addCriterion("ManagerName not between", value1, value2, "managername");
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

        public Criteria andSecretarynameIsNull() {
            addCriterion("SecretaryName is null");
            return (Criteria) this;
        }

        public Criteria andSecretarynameIsNotNull() {
            addCriterion("SecretaryName is not null");
            return (Criteria) this;
        }

        public Criteria andSecretarynameEqualTo(String value) {
            addCriterion("SecretaryName =", value, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameNotEqualTo(String value) {
            addCriterion("SecretaryName <>", value, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameGreaterThan(String value) {
            addCriterion("SecretaryName >", value, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameGreaterThanOrEqualTo(String value) {
            addCriterion("SecretaryName >=", value, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameLessThan(String value) {
            addCriterion("SecretaryName <", value, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameLessThanOrEqualTo(String value) {
            addCriterion("SecretaryName <=", value, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameLike(String value) {
            addCriterion("SecretaryName like", value, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameNotLike(String value) {
            addCriterion("SecretaryName not like", value, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameIn(List<String> values) {
            addCriterion("SecretaryName in", values, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameNotIn(List<String> values) {
            addCriterion("SecretaryName not in", values, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameBetween(String value1, String value2) {
            addCriterion("SecretaryName between", value1, value2, "secretaryname");
            return (Criteria) this;
        }

        public Criteria andSecretarynameNotBetween(String value1, String value2) {
            addCriterion("SecretaryName not between", value1, value2, "secretaryname");
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

        public Criteria andDeptplannernameIsNull() {
            addCriterion("DeptPlannerName is null");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameIsNotNull() {
            addCriterion("DeptPlannerName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameEqualTo(String value) {
            addCriterion("DeptPlannerName =", value, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameNotEqualTo(String value) {
            addCriterion("DeptPlannerName <>", value, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameGreaterThan(String value) {
            addCriterion("DeptPlannerName >", value, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameGreaterThanOrEqualTo(String value) {
            addCriterion("DeptPlannerName >=", value, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameLessThan(String value) {
            addCriterion("DeptPlannerName <", value, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameLessThanOrEqualTo(String value) {
            addCriterion("DeptPlannerName <=", value, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameLike(String value) {
            addCriterion("DeptPlannerName like", value, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameNotLike(String value) {
            addCriterion("DeptPlannerName not like", value, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameIn(List<String> values) {
            addCriterion("DeptPlannerName in", values, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameNotIn(List<String> values) {
            addCriterion("DeptPlannerName not in", values, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameBetween(String value1, String value2) {
            addCriterion("DeptPlannerName between", value1, value2, "deptplannername");
            return (Criteria) this;
        }

        public Criteria andDeptplannernameNotBetween(String value1, String value2) {
            addCriterion("DeptPlannerName not between", value1, value2, "deptplannername");
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

        public Criteria andApprovernameIsNull() {
            addCriterion("ApproverName is null");
            return (Criteria) this;
        }

        public Criteria andApprovernameIsNotNull() {
            addCriterion("ApproverName is not null");
            return (Criteria) this;
        }

        public Criteria andApprovernameEqualTo(String value) {
            addCriterion("ApproverName =", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameNotEqualTo(String value) {
            addCriterion("ApproverName <>", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameGreaterThan(String value) {
            addCriterion("ApproverName >", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameGreaterThanOrEqualTo(String value) {
            addCriterion("ApproverName >=", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameLessThan(String value) {
            addCriterion("ApproverName <", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameLessThanOrEqualTo(String value) {
            addCriterion("ApproverName <=", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameLike(String value) {
            addCriterion("ApproverName like", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameNotLike(String value) {
            addCriterion("ApproverName not like", value, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameIn(List<String> values) {
            addCriterion("ApproverName in", values, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameNotIn(List<String> values) {
            addCriterion("ApproverName not in", values, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameBetween(String value1, String value2) {
            addCriterion("ApproverName between", value1, value2, "approvername");
            return (Criteria) this;
        }

        public Criteria andApprovernameNotBetween(String value1, String value2) {
            addCriterion("ApproverName not between", value1, value2, "approvername");
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

        public Criteria andAbbreviationnameIsNull() {
            addCriterion("AbbreviationName is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameIsNotNull() {
            addCriterion("AbbreviationName is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameEqualTo(String value) {
            addCriterion("AbbreviationName =", value, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameNotEqualTo(String value) {
            addCriterion("AbbreviationName <>", value, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameGreaterThan(String value) {
            addCriterion("AbbreviationName >", value, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameGreaterThanOrEqualTo(String value) {
            addCriterion("AbbreviationName >=", value, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameLessThan(String value) {
            addCriterion("AbbreviationName <", value, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameLessThanOrEqualTo(String value) {
            addCriterion("AbbreviationName <=", value, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameLike(String value) {
            addCriterion("AbbreviationName like", value, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameNotLike(String value) {
            addCriterion("AbbreviationName not like", value, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameIn(List<String> values) {
            addCriterion("AbbreviationName in", values, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameNotIn(List<String> values) {
            addCriterion("AbbreviationName not in", values, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameBetween(String value1, String value2) {
            addCriterion("AbbreviationName between", value1, value2, "abbreviationname");
            return (Criteria) this;
        }

        public Criteria andAbbreviationnameNotBetween(String value1, String value2) {
            addCriterion("AbbreviationName not between", value1, value2, "abbreviationname");
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

        public Criteria andPlanapprovernameIsNull() {
            addCriterion("PlanApproverName is null");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameIsNotNull() {
            addCriterion("PlanApproverName is not null");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameEqualTo(String value) {
            addCriterion("PlanApproverName =", value, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameNotEqualTo(String value) {
            addCriterion("PlanApproverName <>", value, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameGreaterThan(String value) {
            addCriterion("PlanApproverName >", value, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameGreaterThanOrEqualTo(String value) {
            addCriterion("PlanApproverName >=", value, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameLessThan(String value) {
            addCriterion("PlanApproverName <", value, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameLessThanOrEqualTo(String value) {
            addCriterion("PlanApproverName <=", value, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameLike(String value) {
            addCriterion("PlanApproverName like", value, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameNotLike(String value) {
            addCriterion("PlanApproverName not like", value, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameIn(List<String> values) {
            addCriterion("PlanApproverName in", values, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameNotIn(List<String> values) {
            addCriterion("PlanApproverName not in", values, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameBetween(String value1, String value2) {
            addCriterion("PlanApproverName between", value1, value2, "planapprovername");
            return (Criteria) this;
        }

        public Criteria andPlanapprovernameNotBetween(String value1, String value2) {
            addCriterion("PlanApproverName not between", value1, value2, "planapprovername");
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

        public Criteria andPrnameIsNull() {
            addCriterion("PRName is null");
            return (Criteria) this;
        }

        public Criteria andPrnameIsNotNull() {
            addCriterion("PRName is not null");
            return (Criteria) this;
        }

        public Criteria andPrnameEqualTo(String value) {
            addCriterion("PRName =", value, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameNotEqualTo(String value) {
            addCriterion("PRName <>", value, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameGreaterThan(String value) {
            addCriterion("PRName >", value, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRName >=", value, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameLessThan(String value) {
            addCriterion("PRName <", value, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameLessThanOrEqualTo(String value) {
            addCriterion("PRName <=", value, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameLike(String value) {
            addCriterion("PRName like", value, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameNotLike(String value) {
            addCriterion("PRName not like", value, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameIn(List<String> values) {
            addCriterion("PRName in", values, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameNotIn(List<String> values) {
            addCriterion("PRName not in", values, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameBetween(String value1, String value2) {
            addCriterion("PRName between", value1, value2, "prname");
            return (Criteria) this;
        }

        public Criteria andPrnameNotBetween(String value1, String value2) {
            addCriterion("PRName not between", value1, value2, "prname");
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

        public Criteria andConsignornameIsNull() {
            addCriterion("ConsignorName is null");
            return (Criteria) this;
        }

        public Criteria andConsignornameIsNotNull() {
            addCriterion("ConsignorName is not null");
            return (Criteria) this;
        }

        public Criteria andConsignornameEqualTo(String value) {
            addCriterion("ConsignorName =", value, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameNotEqualTo(String value) {
            addCriterion("ConsignorName <>", value, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameGreaterThan(String value) {
            addCriterion("ConsignorName >", value, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameGreaterThanOrEqualTo(String value) {
            addCriterion("ConsignorName >=", value, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameLessThan(String value) {
            addCriterion("ConsignorName <", value, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameLessThanOrEqualTo(String value) {
            addCriterion("ConsignorName <=", value, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameLike(String value) {
            addCriterion("ConsignorName like", value, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameNotLike(String value) {
            addCriterion("ConsignorName not like", value, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameIn(List<String> values) {
            addCriterion("ConsignorName in", values, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameNotIn(List<String> values) {
            addCriterion("ConsignorName not in", values, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameBetween(String value1, String value2) {
            addCriterion("ConsignorName between", value1, value2, "consignorname");
            return (Criteria) this;
        }

        public Criteria andConsignornameNotBetween(String value1, String value2) {
            addCriterion("ConsignorName not between", value1, value2, "consignorname");
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