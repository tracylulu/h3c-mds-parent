package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartCodeProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartCodeProcessExample() {
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

        public Criteria andHandlerIsNull() {
            addCriterion("HANDLER is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("HANDLER is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("HANDLER =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("HANDLER <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("HANDLER >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLER >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("HANDLER <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("HANDLER <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("HANDLER like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("HANDLER not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("HANDLER in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("HANDLER not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("HANDLER between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("HANDLER not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIsNull() {
            addCriterion("APPLY_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIsNotNull() {
            addCriterion("APPLY_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptEqualTo(String value) {
            addCriterion("APPLY_DEPT =", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotEqualTo(String value) {
            addCriterion("APPLY_DEPT <>", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptGreaterThan(String value) {
            addCriterion("APPLY_DEPT >", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT >=", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLessThan(String value) {
            addCriterion("APPLY_DEPT <", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT <=", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLike(String value) {
            addCriterion("APPLY_DEPT like", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotLike(String value) {
            addCriterion("APPLY_DEPT not like", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIn(List<String> values) {
            addCriterion("APPLY_DEPT in", values, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotIn(List<String> values) {
            addCriterion("APPLY_DEPT not in", values, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT between", value1, value2, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT not between", value1, value2, "applyDept");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNull() {
            addCriterion("DEPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNotNull() {
            addCriterion("DEPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeEqualTo(String value) {
            addCriterion("DEPT_TYPE =", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotEqualTo(String value) {
            addCriterion("DEPT_TYPE <>", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThan(String value) {
            addCriterion("DEPT_TYPE >", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE >=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThan(String value) {
            addCriterion("DEPT_TYPE <", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE <=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLike(String value) {
            addCriterion("DEPT_TYPE like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotLike(String value) {
            addCriterion("DEPT_TYPE not like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIn(List<String> values) {
            addCriterion("DEPT_TYPE in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotIn(List<String> values) {
            addCriterion("DEPT_TYPE not in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIsNull() {
            addCriterion("APPLY_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIsNotNull() {
            addCriterion("APPLY_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonEqualTo(String value) {
            addCriterion("APPLY_PERSON =", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotEqualTo(String value) {
            addCriterion("APPLY_PERSON <>", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonGreaterThan(String value) {
            addCriterion("APPLY_PERSON >", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_PERSON >=", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLessThan(String value) {
            addCriterion("APPLY_PERSON <", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLessThanOrEqualTo(String value) {
            addCriterion("APPLY_PERSON <=", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLike(String value) {
            addCriterion("APPLY_PERSON like", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotLike(String value) {
            addCriterion("APPLY_PERSON not like", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIn(List<String> values) {
            addCriterion("APPLY_PERSON in", values, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotIn(List<String> values) {
            addCriterion("APPLY_PERSON not in", values, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonBetween(String value1, String value2) {
            addCriterion("APPLY_PERSON between", value1, value2, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotBetween(String value1, String value2) {
            addCriterion("APPLY_PERSON not between", value1, value2, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andSubSignIsNull() {
            addCriterion("SUB_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andSubSignIsNotNull() {
            addCriterion("SUB_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSubSignEqualTo(String value) {
            addCriterion("SUB_SIGN =", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignNotEqualTo(String value) {
            addCriterion("SUB_SIGN <>", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignGreaterThan(String value) {
            addCriterion("SUB_SIGN >", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_SIGN >=", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignLessThan(String value) {
            addCriterion("SUB_SIGN <", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignLessThanOrEqualTo(String value) {
            addCriterion("SUB_SIGN <=", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignLike(String value) {
            addCriterion("SUB_SIGN like", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignNotLike(String value) {
            addCriterion("SUB_SIGN not like", value, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignIn(List<String> values) {
            addCriterion("SUB_SIGN in", values, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignNotIn(List<String> values) {
            addCriterion("SUB_SIGN not in", values, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignBetween(String value1, String value2) {
            addCriterion("SUB_SIGN between", value1, value2, "subSign");
            return (Criteria) this;
        }

        public Criteria andSubSignNotBetween(String value1, String value2) {
            addCriterion("SUB_SIGN not between", value1, value2, "subSign");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionIsNull() {
            addCriterion("CHECK_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionIsNotNull() {
            addCriterion("CHECK_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionEqualTo(String value) {
            addCriterion("CHECK_OPINION =", value, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionNotEqualTo(String value) {
            addCriterion("CHECK_OPINION <>", value, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionGreaterThan(String value) {
            addCriterion("CHECK_OPINION >", value, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_OPINION >=", value, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionLessThan(String value) {
            addCriterion("CHECK_OPINION <", value, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionLessThanOrEqualTo(String value) {
            addCriterion("CHECK_OPINION <=", value, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionLike(String value) {
            addCriterion("CHECK_OPINION like", value, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionNotLike(String value) {
            addCriterion("CHECK_OPINION not like", value, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionIn(List<String> values) {
            addCriterion("CHECK_OPINION in", values, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionNotIn(List<String> values) {
            addCriterion("CHECK_OPINION not in", values, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionBetween(String value1, String value2) {
            addCriterion("CHECK_OPINION between", value1, value2, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckOpinionNotBetween(String value1, String value2) {
            addCriterion("CHECK_OPINION not between", value1, value2, "checkOpinion");
            return (Criteria) this;
        }

        public Criteria andCheckSignIsNull() {
            addCriterion("CHECK_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andCheckSignIsNotNull() {
            addCriterion("CHECK_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSignEqualTo(String value) {
            addCriterion("CHECK_SIGN =", value, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignNotEqualTo(String value) {
            addCriterion("CHECK_SIGN <>", value, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignGreaterThan(String value) {
            addCriterion("CHECK_SIGN >", value, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_SIGN >=", value, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignLessThan(String value) {
            addCriterion("CHECK_SIGN <", value, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignLessThanOrEqualTo(String value) {
            addCriterion("CHECK_SIGN <=", value, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignLike(String value) {
            addCriterion("CHECK_SIGN like", value, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignNotLike(String value) {
            addCriterion("CHECK_SIGN not like", value, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignIn(List<String> values) {
            addCriterion("CHECK_SIGN in", values, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignNotIn(List<String> values) {
            addCriterion("CHECK_SIGN not in", values, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignBetween(String value1, String value2) {
            addCriterion("CHECK_SIGN between", value1, value2, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckSignNotBetween(String value1, String value2) {
            addCriterion("CHECK_SIGN not between", value1, value2, "checkSign");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNull() {
            addCriterion("CHECK_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNotNull() {
            addCriterion("CHECK_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultEqualTo(String value) {
            addCriterion("CHECK_RESULT =", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotEqualTo(String value) {
            addCriterion("CHECK_RESULT <>", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThan(String value) {
            addCriterion("CHECK_RESULT >", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_RESULT >=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThan(String value) {
            addCriterion("CHECK_RESULT <", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThanOrEqualTo(String value) {
            addCriterion("CHECK_RESULT <=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLike(String value) {
            addCriterion("CHECK_RESULT like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotLike(String value) {
            addCriterion("CHECK_RESULT not like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultIn(List<String> values) {
            addCriterion("CHECK_RESULT in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotIn(List<String> values) {
            addCriterion("CHECK_RESULT not in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultBetween(String value1, String value2) {
            addCriterion("CHECK_RESULT between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotBetween(String value1, String value2) {
            addCriterion("CHECK_RESULT not between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andPdtSignIsNull() {
            addCriterion("PDT_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andPdtSignIsNotNull() {
            addCriterion("PDT_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andPdtSignEqualTo(String value) {
            addCriterion("PDT_SIGN =", value, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignNotEqualTo(String value) {
            addCriterion("PDT_SIGN <>", value, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignGreaterThan(String value) {
            addCriterion("PDT_SIGN >", value, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_SIGN >=", value, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignLessThan(String value) {
            addCriterion("PDT_SIGN <", value, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignLessThanOrEqualTo(String value) {
            addCriterion("PDT_SIGN <=", value, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignLike(String value) {
            addCriterion("PDT_SIGN like", value, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignNotLike(String value) {
            addCriterion("PDT_SIGN not like", value, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignIn(List<String> values) {
            addCriterion("PDT_SIGN in", values, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignNotIn(List<String> values) {
            addCriterion("PDT_SIGN not in", values, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignBetween(String value1, String value2) {
            addCriterion("PDT_SIGN between", value1, value2, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtSignNotBetween(String value1, String value2) {
            addCriterion("PDT_SIGN not between", value1, value2, "pdtSign");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionIsNull() {
            addCriterion("PDT_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionIsNotNull() {
            addCriterion("PDT_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionEqualTo(String value) {
            addCriterion("PDT_OPINION =", value, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionNotEqualTo(String value) {
            addCriterion("PDT_OPINION <>", value, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionGreaterThan(String value) {
            addCriterion("PDT_OPINION >", value, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_OPINION >=", value, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionLessThan(String value) {
            addCriterion("PDT_OPINION <", value, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionLessThanOrEqualTo(String value) {
            addCriterion("PDT_OPINION <=", value, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionLike(String value) {
            addCriterion("PDT_OPINION like", value, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionNotLike(String value) {
            addCriterion("PDT_OPINION not like", value, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionIn(List<String> values) {
            addCriterion("PDT_OPINION in", values, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionNotIn(List<String> values) {
            addCriterion("PDT_OPINION not in", values, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionBetween(String value1, String value2) {
            addCriterion("PDT_OPINION between", value1, value2, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtOpinionNotBetween(String value1, String value2) {
            addCriterion("PDT_OPINION not between", value1, value2, "pdtOpinion");
            return (Criteria) this;
        }

        public Criteria andPdtResultIsNull() {
            addCriterion("PDT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPdtResultIsNotNull() {
            addCriterion("PDT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPdtResultEqualTo(String value) {
            addCriterion("PDT_RESULT =", value, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultNotEqualTo(String value) {
            addCriterion("PDT_RESULT <>", value, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultGreaterThan(String value) {
            addCriterion("PDT_RESULT >", value, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_RESULT >=", value, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultLessThan(String value) {
            addCriterion("PDT_RESULT <", value, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultLessThanOrEqualTo(String value) {
            addCriterion("PDT_RESULT <=", value, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultLike(String value) {
            addCriterion("PDT_RESULT like", value, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultNotLike(String value) {
            addCriterion("PDT_RESULT not like", value, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultIn(List<String> values) {
            addCriterion("PDT_RESULT in", values, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultNotIn(List<String> values) {
            addCriterion("PDT_RESULT not in", values, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultBetween(String value1, String value2) {
            addCriterion("PDT_RESULT between", value1, value2, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andPdtResultNotBetween(String value1, String value2) {
            addCriterion("PDT_RESULT not between", value1, value2, "pdtResult");
            return (Criteria) this;
        }

        public Criteria andFprodSignIsNull() {
            addCriterion("FPROD_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andFprodSignIsNotNull() {
            addCriterion("FPROD_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andFprodSignEqualTo(String value) {
            addCriterion("FPROD_SIGN =", value, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignNotEqualTo(String value) {
            addCriterion("FPROD_SIGN <>", value, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignGreaterThan(String value) {
            addCriterion("FPROD_SIGN >", value, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignGreaterThanOrEqualTo(String value) {
            addCriterion("FPROD_SIGN >=", value, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignLessThan(String value) {
            addCriterion("FPROD_SIGN <", value, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignLessThanOrEqualTo(String value) {
            addCriterion("FPROD_SIGN <=", value, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignLike(String value) {
            addCriterion("FPROD_SIGN like", value, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignNotLike(String value) {
            addCriterion("FPROD_SIGN not like", value, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignIn(List<String> values) {
            addCriterion("FPROD_SIGN in", values, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignNotIn(List<String> values) {
            addCriterion("FPROD_SIGN not in", values, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignBetween(String value1, String value2) {
            addCriterion("FPROD_SIGN between", value1, value2, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodSignNotBetween(String value1, String value2) {
            addCriterion("FPROD_SIGN not between", value1, value2, "fprodSign");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionIsNull() {
            addCriterion("FPROD_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionIsNotNull() {
            addCriterion("FPROD_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionEqualTo(String value) {
            addCriterion("FPROD_OPINION =", value, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionNotEqualTo(String value) {
            addCriterion("FPROD_OPINION <>", value, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionGreaterThan(String value) {
            addCriterion("FPROD_OPINION >", value, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("FPROD_OPINION >=", value, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionLessThan(String value) {
            addCriterion("FPROD_OPINION <", value, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionLessThanOrEqualTo(String value) {
            addCriterion("FPROD_OPINION <=", value, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionLike(String value) {
            addCriterion("FPROD_OPINION like", value, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionNotLike(String value) {
            addCriterion("FPROD_OPINION not like", value, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionIn(List<String> values) {
            addCriterion("FPROD_OPINION in", values, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionNotIn(List<String> values) {
            addCriterion("FPROD_OPINION not in", values, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionBetween(String value1, String value2) {
            addCriterion("FPROD_OPINION between", value1, value2, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodOpinionNotBetween(String value1, String value2) {
            addCriterion("FPROD_OPINION not between", value1, value2, "fprodOpinion");
            return (Criteria) this;
        }

        public Criteria andFprodResultIsNull() {
            addCriterion("FPROD_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andFprodResultIsNotNull() {
            addCriterion("FPROD_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andFprodResultEqualTo(String value) {
            addCriterion("FPROD_RESULT =", value, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultNotEqualTo(String value) {
            addCriterion("FPROD_RESULT <>", value, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultGreaterThan(String value) {
            addCriterion("FPROD_RESULT >", value, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultGreaterThanOrEqualTo(String value) {
            addCriterion("FPROD_RESULT >=", value, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultLessThan(String value) {
            addCriterion("FPROD_RESULT <", value, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultLessThanOrEqualTo(String value) {
            addCriterion("FPROD_RESULT <=", value, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultLike(String value) {
            addCriterion("FPROD_RESULT like", value, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultNotLike(String value) {
            addCriterion("FPROD_RESULT not like", value, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultIn(List<String> values) {
            addCriterion("FPROD_RESULT in", values, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultNotIn(List<String> values) {
            addCriterion("FPROD_RESULT not in", values, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultBetween(String value1, String value2) {
            addCriterion("FPROD_RESULT between", value1, value2, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andFprodResultNotBetween(String value1, String value2) {
            addCriterion("FPROD_RESULT not between", value1, value2, "fprodResult");
            return (Criteria) this;
        }

        public Criteria andCwSignIsNull() {
            addCriterion("CW_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andCwSignIsNotNull() {
            addCriterion("CW_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCwSignEqualTo(String value) {
            addCriterion("CW_SIGN =", value, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignNotEqualTo(String value) {
            addCriterion("CW_SIGN <>", value, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignGreaterThan(String value) {
            addCriterion("CW_SIGN >", value, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignGreaterThanOrEqualTo(String value) {
            addCriterion("CW_SIGN >=", value, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignLessThan(String value) {
            addCriterion("CW_SIGN <", value, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignLessThanOrEqualTo(String value) {
            addCriterion("CW_SIGN <=", value, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignLike(String value) {
            addCriterion("CW_SIGN like", value, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignNotLike(String value) {
            addCriterion("CW_SIGN not like", value, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignIn(List<String> values) {
            addCriterion("CW_SIGN in", values, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignNotIn(List<String> values) {
            addCriterion("CW_SIGN not in", values, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignBetween(String value1, String value2) {
            addCriterion("CW_SIGN between", value1, value2, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwSignNotBetween(String value1, String value2) {
            addCriterion("CW_SIGN not between", value1, value2, "cwSign");
            return (Criteria) this;
        }

        public Criteria andCwOpinionIsNull() {
            addCriterion("CW_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andCwOpinionIsNotNull() {
            addCriterion("CW_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andCwOpinionEqualTo(String value) {
            addCriterion("CW_OPINION =", value, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionNotEqualTo(String value) {
            addCriterion("CW_OPINION <>", value, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionGreaterThan(String value) {
            addCriterion("CW_OPINION >", value, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("CW_OPINION >=", value, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionLessThan(String value) {
            addCriterion("CW_OPINION <", value, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionLessThanOrEqualTo(String value) {
            addCriterion("CW_OPINION <=", value, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionLike(String value) {
            addCriterion("CW_OPINION like", value, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionNotLike(String value) {
            addCriterion("CW_OPINION not like", value, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionIn(List<String> values) {
            addCriterion("CW_OPINION in", values, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionNotIn(List<String> values) {
            addCriterion("CW_OPINION not in", values, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionBetween(String value1, String value2) {
            addCriterion("CW_OPINION between", value1, value2, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwOpinionNotBetween(String value1, String value2) {
            addCriterion("CW_OPINION not between", value1, value2, "cwOpinion");
            return (Criteria) this;
        }

        public Criteria andCwResultIsNull() {
            addCriterion("CW_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andCwResultIsNotNull() {
            addCriterion("CW_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCwResultEqualTo(String value) {
            addCriterion("CW_RESULT =", value, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultNotEqualTo(String value) {
            addCriterion("CW_RESULT <>", value, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultGreaterThan(String value) {
            addCriterion("CW_RESULT >", value, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultGreaterThanOrEqualTo(String value) {
            addCriterion("CW_RESULT >=", value, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultLessThan(String value) {
            addCriterion("CW_RESULT <", value, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultLessThanOrEqualTo(String value) {
            addCriterion("CW_RESULT <=", value, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultLike(String value) {
            addCriterion("CW_RESULT like", value, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultNotLike(String value) {
            addCriterion("CW_RESULT not like", value, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultIn(List<String> values) {
            addCriterion("CW_RESULT in", values, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultNotIn(List<String> values) {
            addCriterion("CW_RESULT not in", values, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultBetween(String value1, String value2) {
            addCriterion("CW_RESULT between", value1, value2, "cwResult");
            return (Criteria) this;
        }

        public Criteria andCwResultNotBetween(String value1, String value2) {
            addCriterion("CW_RESULT not between", value1, value2, "cwResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignIsNull() {
            addCriterion("PROCESSMGN_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignIsNotNull() {
            addCriterion("PROCESSMGN_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignEqualTo(String value) {
            addCriterion("PROCESSMGN_SIGN =", value, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignNotEqualTo(String value) {
            addCriterion("PROCESSMGN_SIGN <>", value, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignGreaterThan(String value) {
            addCriterion("PROCESSMGN_SIGN >", value, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSMGN_SIGN >=", value, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignLessThan(String value) {
            addCriterion("PROCESSMGN_SIGN <", value, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignLessThanOrEqualTo(String value) {
            addCriterion("PROCESSMGN_SIGN <=", value, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignLike(String value) {
            addCriterion("PROCESSMGN_SIGN like", value, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignNotLike(String value) {
            addCriterion("PROCESSMGN_SIGN not like", value, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignIn(List<String> values) {
            addCriterion("PROCESSMGN_SIGN in", values, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignNotIn(List<String> values) {
            addCriterion("PROCESSMGN_SIGN not in", values, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignBetween(String value1, String value2) {
            addCriterion("PROCESSMGN_SIGN between", value1, value2, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnSignNotBetween(String value1, String value2) {
            addCriterion("PROCESSMGN_SIGN not between", value1, value2, "processmgnSign");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultIsNull() {
            addCriterion("PROCESSMGN_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultIsNotNull() {
            addCriterion("PROCESSMGN_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultEqualTo(String value) {
            addCriterion("PROCESSMGN_RESULT =", value, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultNotEqualTo(String value) {
            addCriterion("PROCESSMGN_RESULT <>", value, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultGreaterThan(String value) {
            addCriterion("PROCESSMGN_RESULT >", value, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSMGN_RESULT >=", value, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultLessThan(String value) {
            addCriterion("PROCESSMGN_RESULT <", value, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultLessThanOrEqualTo(String value) {
            addCriterion("PROCESSMGN_RESULT <=", value, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultLike(String value) {
            addCriterion("PROCESSMGN_RESULT like", value, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultNotLike(String value) {
            addCriterion("PROCESSMGN_RESULT not like", value, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultIn(List<String> values) {
            addCriterion("PROCESSMGN_RESULT in", values, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultNotIn(List<String> values) {
            addCriterion("PROCESSMGN_RESULT not in", values, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultBetween(String value1, String value2) {
            addCriterion("PROCESSMGN_RESULT between", value1, value2, "processmgnResult");
            return (Criteria) this;
        }

        public Criteria andProcessmgnResultNotBetween(String value1, String value2) {
            addCriterion("PROCESSMGN_RESULT not between", value1, value2, "processmgnResult");
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

        public Criteria andSubmitDateIsNull() {
            addCriterion("SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterion("SUBMIT_DATE =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterion("SUBMIT_DATE <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterion("SUBMIT_DATE >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMIT_DATE >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterion("SUBMIT_DATE <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("SUBMIT_DATE <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterion("SUBMIT_DATE in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterion("SUBMIT_DATE not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterion("SUBMIT_DATE between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("SUBMIT_DATE not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterion("CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterion("CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterion("CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterion("CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterion("CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterion("CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterion("CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateIsNull() {
            addCriterion("PDT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPdtDateIsNotNull() {
            addCriterion("PDT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPdtDateEqualTo(Date value) {
            addCriterion("PDT_DATE =", value, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateNotEqualTo(Date value) {
            addCriterion("PDT_DATE <>", value, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateGreaterThan(Date value) {
            addCriterion("PDT_DATE >", value, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PDT_DATE >=", value, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateLessThan(Date value) {
            addCriterion("PDT_DATE <", value, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateLessThanOrEqualTo(Date value) {
            addCriterion("PDT_DATE <=", value, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateIn(List<Date> values) {
            addCriterion("PDT_DATE in", values, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateNotIn(List<Date> values) {
            addCriterion("PDT_DATE not in", values, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateBetween(Date value1, Date value2) {
            addCriterion("PDT_DATE between", value1, value2, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andPdtDateNotBetween(Date value1, Date value2) {
            addCriterion("PDT_DATE not between", value1, value2, "pdtDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateIsNull() {
            addCriterion("FPROD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFprodDateIsNotNull() {
            addCriterion("FPROD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFprodDateEqualTo(Date value) {
            addCriterion("FPROD_DATE =", value, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateNotEqualTo(Date value) {
            addCriterion("FPROD_DATE <>", value, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateGreaterThan(Date value) {
            addCriterion("FPROD_DATE >", value, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FPROD_DATE >=", value, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateLessThan(Date value) {
            addCriterion("FPROD_DATE <", value, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateLessThanOrEqualTo(Date value) {
            addCriterion("FPROD_DATE <=", value, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateIn(List<Date> values) {
            addCriterion("FPROD_DATE in", values, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateNotIn(List<Date> values) {
            addCriterion("FPROD_DATE not in", values, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateBetween(Date value1, Date value2) {
            addCriterion("FPROD_DATE between", value1, value2, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andFprodDateNotBetween(Date value1, Date value2) {
            addCriterion("FPROD_DATE not between", value1, value2, "fprodDate");
            return (Criteria) this;
        }

        public Criteria andCwDateIsNull() {
            addCriterion("CW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCwDateIsNotNull() {
            addCriterion("CW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCwDateEqualTo(Date value) {
            addCriterion("CW_DATE =", value, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateNotEqualTo(Date value) {
            addCriterion("CW_DATE <>", value, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateGreaterThan(Date value) {
            addCriterion("CW_DATE >", value, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CW_DATE >=", value, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateLessThan(Date value) {
            addCriterion("CW_DATE <", value, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateLessThanOrEqualTo(Date value) {
            addCriterion("CW_DATE <=", value, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateIn(List<Date> values) {
            addCriterion("CW_DATE in", values, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateNotIn(List<Date> values) {
            addCriterion("CW_DATE not in", values, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateBetween(Date value1, Date value2) {
            addCriterion("CW_DATE between", value1, value2, "cwDate");
            return (Criteria) this;
        }

        public Criteria andCwDateNotBetween(Date value1, Date value2) {
            addCriterion("CW_DATE not between", value1, value2, "cwDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateIsNull() {
            addCriterion("PROCESSMGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateIsNotNull() {
            addCriterion("PROCESSMGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateEqualTo(Date value) {
            addCriterion("PROCESSMGN_DATE =", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateNotEqualTo(Date value) {
            addCriterion("PROCESSMGN_DATE <>", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateGreaterThan(Date value) {
            addCriterion("PROCESSMGN_DATE >", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PROCESSMGN_DATE >=", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateLessThan(Date value) {
            addCriterion("PROCESSMGN_DATE <", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateLessThanOrEqualTo(Date value) {
            addCriterion("PROCESSMGN_DATE <=", value, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateIn(List<Date> values) {
            addCriterion("PROCESSMGN_DATE in", values, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateNotIn(List<Date> values) {
            addCriterion("PROCESSMGN_DATE not in", values, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateBetween(Date value1, Date value2) {
            addCriterion("PROCESSMGN_DATE between", value1, value2, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andProcessmgnDateNotBetween(Date value1, Date value2) {
            addCriterion("PROCESSMGN_DATE not between", value1, value2, "processmgnDate");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIsNull() {
            addCriterion("INSTANSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIsNotNull() {
            addCriterion("INSTANSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanseIdEqualTo(String value) {
            addCriterion("INSTANSE_ID =", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotEqualTo(String value) {
            addCriterion("INSTANSE_ID <>", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdGreaterThan(String value) {
            addCriterion("INSTANSE_ID >", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANSE_ID >=", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLessThan(String value) {
            addCriterion("INSTANSE_ID <", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLessThanOrEqualTo(String value) {
            addCriterion("INSTANSE_ID <=", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLike(String value) {
            addCriterion("INSTANSE_ID like", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotLike(String value) {
            addCriterion("INSTANSE_ID not like", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIn(List<String> values) {
            addCriterion("INSTANSE_ID in", values, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotIn(List<String> values) {
            addCriterion("INSTANSE_ID not in", values, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdBetween(String value1, String value2) {
            addCriterion("INSTANSE_ID between", value1, value2, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotBetween(String value1, String value2) {
            addCriterion("INSTANSE_ID not between", value1, value2, "instanseId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIsNull() {
            addCriterion("CURRENT_NODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIsNotNull() {
            addCriterion("CURRENT_NODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeEqualTo(String value) {
            addCriterion("CURRENT_NODE =", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNotEqualTo(String value) {
            addCriterion("CURRENT_NODE <>", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeGreaterThan(String value) {
            addCriterion("CURRENT_NODE >", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_NODE >=", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeLessThan(String value) {
            addCriterion("CURRENT_NODE <", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_NODE <=", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeLike(String value) {
            addCriterion("CURRENT_NODE like", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNotLike(String value) {
            addCriterion("CURRENT_NODE not like", value, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIn(List<String> values) {
            addCriterion("CURRENT_NODE in", values, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNotIn(List<String> values) {
            addCriterion("CURRENT_NODE not in", values, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeBetween(String value1, String value2) {
            addCriterion("CURRENT_NODE between", value1, value2, "currentNode");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeNotBetween(String value1, String value2) {
            addCriterion("CURRENT_NODE not between", value1, value2, "currentNode");
            return (Criteria) this;
        }

        public Criteria andAssignSignIsNull() {
            addCriterion("ASSIGN_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andAssignSignIsNotNull() {
            addCriterion("ASSIGN_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andAssignSignEqualTo(String value) {
            addCriterion("ASSIGN_SIGN =", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignNotEqualTo(String value) {
            addCriterion("ASSIGN_SIGN <>", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignGreaterThan(String value) {
            addCriterion("ASSIGN_SIGN >", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGN_SIGN >=", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignLessThan(String value) {
            addCriterion("ASSIGN_SIGN <", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignLessThanOrEqualTo(String value) {
            addCriterion("ASSIGN_SIGN <=", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignLike(String value) {
            addCriterion("ASSIGN_SIGN like", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignNotLike(String value) {
            addCriterion("ASSIGN_SIGN not like", value, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignIn(List<String> values) {
            addCriterion("ASSIGN_SIGN in", values, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignNotIn(List<String> values) {
            addCriterion("ASSIGN_SIGN not in", values, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignBetween(String value1, String value2) {
            addCriterion("ASSIGN_SIGN between", value1, value2, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignSignNotBetween(String value1, String value2) {
            addCriterion("ASSIGN_SIGN not between", value1, value2, "assignSign");
            return (Criteria) this;
        }

        public Criteria andAssignDateIsNull() {
            addCriterion("ASSIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAssignDateIsNotNull() {
            addCriterion("ASSIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignDateEqualTo(Date value) {
            addCriterion("ASSIGN_DATE =", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotEqualTo(Date value) {
            addCriterion("ASSIGN_DATE <>", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateGreaterThan(Date value) {
            addCriterion("ASSIGN_DATE >", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ASSIGN_DATE >=", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateLessThan(Date value) {
            addCriterion("ASSIGN_DATE <", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateLessThanOrEqualTo(Date value) {
            addCriterion("ASSIGN_DATE <=", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateIn(List<Date> values) {
            addCriterion("ASSIGN_DATE in", values, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotIn(List<Date> values) {
            addCriterion("ASSIGN_DATE not in", values, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateBetween(Date value1, Date value2) {
            addCriterion("ASSIGN_DATE between", value1, value2, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotBetween(Date value1, Date value2) {
            addCriterion("ASSIGN_DATE not between", value1, value2, "assignDate");
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

        public Criteria andPdtMgnIsNull() {
            addCriterion("PDT_MGN is null");
            return (Criteria) this;
        }

        public Criteria andPdtMgnIsNotNull() {
            addCriterion("PDT_MGN is not null");
            return (Criteria) this;
        }

        public Criteria andPdtMgnEqualTo(String value) {
            addCriterion("PDT_MGN =", value, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnNotEqualTo(String value) {
            addCriterion("PDT_MGN <>", value, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnGreaterThan(String value) {
            addCriterion("PDT_MGN >", value, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_MGN >=", value, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnLessThan(String value) {
            addCriterion("PDT_MGN <", value, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnLessThanOrEqualTo(String value) {
            addCriterion("PDT_MGN <=", value, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnLike(String value) {
            addCriterion("PDT_MGN like", value, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnNotLike(String value) {
            addCriterion("PDT_MGN not like", value, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnIn(List<String> values) {
            addCriterion("PDT_MGN in", values, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnNotIn(List<String> values) {
            addCriterion("PDT_MGN not in", values, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnBetween(String value1, String value2) {
            addCriterion("PDT_MGN between", value1, value2, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andPdtMgnNotBetween(String value1, String value2) {
            addCriterion("PDT_MGN not between", value1, value2, "pdtMgn");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andPdtNoIsNull() {
            addCriterion("PDT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPdtNoIsNotNull() {
            addCriterion("PDT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPdtNoEqualTo(String value) {
            addCriterion("PDT_NO =", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotEqualTo(String value) {
            addCriterion("PDT_NO <>", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoGreaterThan(String value) {
            addCriterion("PDT_NO >", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_NO >=", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLessThan(String value) {
            addCriterion("PDT_NO <", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLessThanOrEqualTo(String value) {
            addCriterion("PDT_NO <=", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLike(String value) {
            addCriterion("PDT_NO like", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotLike(String value) {
            addCriterion("PDT_NO not like", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoIn(List<String> values) {
            addCriterion("PDT_NO in", values, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotIn(List<String> values) {
            addCriterion("PDT_NO not in", values, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoBetween(String value1, String value2) {
            addCriterion("PDT_NO between", value1, value2, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotBetween(String value1, String value2) {
            addCriterion("PDT_NO not between", value1, value2, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeIsNull() {
            addCriterion("PDM_APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeIsNotNull() {
            addCriterion("PDM_APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeEqualTo(String value) {
            addCriterion("PDM_APPLY_CODE =", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeNotEqualTo(String value) {
            addCriterion("PDM_APPLY_CODE <>", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeGreaterThan(String value) {
            addCriterion("PDM_APPLY_CODE >", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PDM_APPLY_CODE >=", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeLessThan(String value) {
            addCriterion("PDM_APPLY_CODE <", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("PDM_APPLY_CODE <=", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeLike(String value) {
            addCriterion("PDM_APPLY_CODE like", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeNotLike(String value) {
            addCriterion("PDM_APPLY_CODE not like", value, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeIn(List<String> values) {
            addCriterion("PDM_APPLY_CODE in", values, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeNotIn(List<String> values) {
            addCriterion("PDM_APPLY_CODE not in", values, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeBetween(String value1, String value2) {
            addCriterion("PDM_APPLY_CODE between", value1, value2, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdmApplyCodeNotBetween(String value1, String value2) {
            addCriterion("PDM_APPLY_CODE not between", value1, value2, "pdmApplyCode");
            return (Criteria) this;
        }

        public Criteria andPdtIdIsNull() {
            addCriterion("PDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPdtIdIsNotNull() {
            addCriterion("PDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPdtIdEqualTo(Integer value) {
            addCriterion("PDT_ID =", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdNotEqualTo(Integer value) {
            addCriterion("PDT_ID <>", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdGreaterThan(Integer value) {
            addCriterion("PDT_ID >", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PDT_ID >=", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdLessThan(Integer value) {
            addCriterion("PDT_ID <", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdLessThanOrEqualTo(Integer value) {
            addCriterion("PDT_ID <=", value, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdIn(List<Integer> values) {
            addCriterion("PDT_ID in", values, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdNotIn(List<Integer> values) {
            addCriterion("PDT_ID not in", values, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdBetween(Integer value1, Integer value2) {
            addCriterion("PDT_ID between", value1, value2, "pdtId");
            return (Criteria) this;
        }

        public Criteria andPdtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PDT_ID not between", value1, value2, "pdtId");
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