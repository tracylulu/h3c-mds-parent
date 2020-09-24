package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_BaseObject_PROCESSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_BaseObject_PROCESSExample() {
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

        public Criteria andApplycodeIsNull() {
            addCriterion("ApplyCode is null");
            return (Criteria) this;
        }

        public Criteria andApplycodeIsNotNull() {
            addCriterion("ApplyCode is not null");
            return (Criteria) this;
        }

        public Criteria andApplycodeEqualTo(String value) {
            addCriterion("ApplyCode =", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotEqualTo(String value) {
            addCriterion("ApplyCode <>", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeGreaterThan(String value) {
            addCriterion("ApplyCode >", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyCode >=", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLessThan(String value) {
            addCriterion("ApplyCode <", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLessThanOrEqualTo(String value) {
            addCriterion("ApplyCode <=", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLike(String value) {
            addCriterion("ApplyCode like", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotLike(String value) {
            addCriterion("ApplyCode not like", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeIn(List<String> values) {
            addCriterion("ApplyCode in", values, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotIn(List<String> values) {
            addCriterion("ApplyCode not in", values, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeBetween(String value1, String value2) {
            addCriterion("ApplyCode between", value1, value2, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotBetween(String value1, String value2) {
            addCriterion("ApplyCode not between", value1, value2, "applycode");
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

        public Criteria andResponsibleIsNull() {
            addCriterion("Responsible is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleIsNotNull() {
            addCriterion("Responsible is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleEqualTo(String value) {
            addCriterion("Responsible =", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotEqualTo(String value) {
            addCriterion("Responsible <>", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleGreaterThan(String value) {
            addCriterion("Responsible >", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("Responsible >=", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLessThan(String value) {
            addCriterion("Responsible <", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLessThanOrEqualTo(String value) {
            addCriterion("Responsible <=", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLike(String value) {
            addCriterion("Responsible like", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotLike(String value) {
            addCriterion("Responsible not like", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleIn(List<String> values) {
            addCriterion("Responsible in", values, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotIn(List<String> values) {
            addCriterion("Responsible not in", values, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleBetween(String value1, String value2) {
            addCriterion("Responsible between", value1, value2, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotBetween(String value1, String value2) {
            addCriterion("Responsible not between", value1, value2, "responsible");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNull() {
            addCriterion("StatusName is null");
            return (Criteria) this;
        }

        public Criteria andStatusnameIsNotNull() {
            addCriterion("StatusName is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnameEqualTo(String value) {
            addCriterion("StatusName =", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotEqualTo(String value) {
            addCriterion("StatusName <>", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThan(String value) {
            addCriterion("StatusName >", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("StatusName >=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThan(String value) {
            addCriterion("StatusName <", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLessThanOrEqualTo(String value) {
            addCriterion("StatusName <=", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameLike(String value) {
            addCriterion("StatusName like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotLike(String value) {
            addCriterion("StatusName not like", value, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameIn(List<String> values) {
            addCriterion("StatusName in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotIn(List<String> values) {
            addCriterion("StatusName not in", values, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameBetween(String value1, String value2) {
            addCriterion("StatusName between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andStatusnameNotBetween(String value1, String value2) {
            addCriterion("StatusName not between", value1, value2, "statusname");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("APPLY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("APPLY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("APPLY_TYPE =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("APPLY_TYPE <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("APPLY_TYPE >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("APPLY_TYPE <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("APPLY_TYPE like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("APPLY_TYPE not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("APPLY_TYPE in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("APPLY_TYPE not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE not between", value1, value2, "applyType");
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

        public Criteria andCopytoIsNull() {
            addCriterion("copyto is null");
            return (Criteria) this;
        }

        public Criteria andCopytoIsNotNull() {
            addCriterion("copyto is not null");
            return (Criteria) this;
        }

        public Criteria andCopytoEqualTo(String value) {
            addCriterion("copyto =", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoNotEqualTo(String value) {
            addCriterion("copyto <>", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoGreaterThan(String value) {
            addCriterion("copyto >", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoGreaterThanOrEqualTo(String value) {
            addCriterion("copyto >=", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoLessThan(String value) {
            addCriterion("copyto <", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoLessThanOrEqualTo(String value) {
            addCriterion("copyto <=", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoLike(String value) {
            addCriterion("copyto like", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoNotLike(String value) {
            addCriterion("copyto not like", value, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoIn(List<String> values) {
            addCriterion("copyto in", values, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoNotIn(List<String> values) {
            addCriterion("copyto not in", values, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoBetween(String value1, String value2) {
            addCriterion("copyto between", value1, value2, "copyto");
            return (Criteria) this;
        }

        public Criteria andCopytoNotBetween(String value1, String value2) {
            addCriterion("copyto not between", value1, value2, "copyto");
            return (Criteria) this;
        }

        public Criteria andSendto1IsNull() {
            addCriterion("sendto_1 is null");
            return (Criteria) this;
        }

        public Criteria andSendto1IsNotNull() {
            addCriterion("sendto_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSendto1EqualTo(String value) {
            addCriterion("sendto_1 =", value, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1NotEqualTo(String value) {
            addCriterion("sendto_1 <>", value, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1GreaterThan(String value) {
            addCriterion("sendto_1 >", value, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1GreaterThanOrEqualTo(String value) {
            addCriterion("sendto_1 >=", value, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1LessThan(String value) {
            addCriterion("sendto_1 <", value, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1LessThanOrEqualTo(String value) {
            addCriterion("sendto_1 <=", value, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1Like(String value) {
            addCriterion("sendto_1 like", value, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1NotLike(String value) {
            addCriterion("sendto_1 not like", value, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1In(List<String> values) {
            addCriterion("sendto_1 in", values, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1NotIn(List<String> values) {
            addCriterion("sendto_1 not in", values, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1Between(String value1, String value2) {
            addCriterion("sendto_1 between", value1, value2, "sendto1");
            return (Criteria) this;
        }

        public Criteria andSendto1NotBetween(String value1, String value2) {
            addCriterion("sendto_1 not between", value1, value2, "sendto1");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameIsNull() {
            addCriterion("CMO_FillName is null");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameIsNotNull() {
            addCriterion("CMO_FillName is not null");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameEqualTo(String value) {
            addCriterion("CMO_FillName =", value, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameNotEqualTo(String value) {
            addCriterion("CMO_FillName <>", value, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameGreaterThan(String value) {
            addCriterion("CMO_FillName >", value, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameGreaterThanOrEqualTo(String value) {
            addCriterion("CMO_FillName >=", value, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameLessThan(String value) {
            addCriterion("CMO_FillName <", value, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameLessThanOrEqualTo(String value) {
            addCriterion("CMO_FillName <=", value, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameLike(String value) {
            addCriterion("CMO_FillName like", value, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameNotLike(String value) {
            addCriterion("CMO_FillName not like", value, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameIn(List<String> values) {
            addCriterion("CMO_FillName in", values, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameNotIn(List<String> values) {
            addCriterion("CMO_FillName not in", values, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameBetween(String value1, String value2) {
            addCriterion("CMO_FillName between", value1, value2, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFillnameNotBetween(String value1, String value2) {
            addCriterion("CMO_FillName not between", value1, value2, "cmoFillname");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeIsNull() {
            addCriterion("CMO_FillTime is null");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeIsNotNull() {
            addCriterion("CMO_FillTime is not null");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeEqualTo(Date value) {
            addCriterion("CMO_FillTime =", value, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeNotEqualTo(Date value) {
            addCriterion("CMO_FillTime <>", value, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeGreaterThan(Date value) {
            addCriterion("CMO_FillTime >", value, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CMO_FillTime >=", value, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeLessThan(Date value) {
            addCriterion("CMO_FillTime <", value, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeLessThanOrEqualTo(Date value) {
            addCriterion("CMO_FillTime <=", value, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeIn(List<Date> values) {
            addCriterion("CMO_FillTime in", values, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeNotIn(List<Date> values) {
            addCriterion("CMO_FillTime not in", values, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeBetween(Date value1, Date value2) {
            addCriterion("CMO_FillTime between", value1, value2, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoFilltimeNotBetween(Date value1, Date value2) {
            addCriterion("CMO_FillTime not between", value1, value2, "cmoFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionIsNull() {
            addCriterion("PDT_Suggestion is null");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionIsNotNull() {
            addCriterion("PDT_Suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionEqualTo(String value) {
            addCriterion("PDT_Suggestion =", value, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionNotEqualTo(String value) {
            addCriterion("PDT_Suggestion <>", value, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionGreaterThan(String value) {
            addCriterion("PDT_Suggestion >", value, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_Suggestion >=", value, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionLessThan(String value) {
            addCriterion("PDT_Suggestion <", value, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionLessThanOrEqualTo(String value) {
            addCriterion("PDT_Suggestion <=", value, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionLike(String value) {
            addCriterion("PDT_Suggestion like", value, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionNotLike(String value) {
            addCriterion("PDT_Suggestion not like", value, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionIn(List<String> values) {
            addCriterion("PDT_Suggestion in", values, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionNotIn(List<String> values) {
            addCriterion("PDT_Suggestion not in", values, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionBetween(String value1, String value2) {
            addCriterion("PDT_Suggestion between", value1, value2, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtSuggestionNotBetween(String value1, String value2) {
            addCriterion("PDT_Suggestion not between", value1, value2, "pdtSuggestion");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameIsNull() {
            addCriterion("PDT_FillName is null");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameIsNotNull() {
            addCriterion("PDT_FillName is not null");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameEqualTo(String value) {
            addCriterion("PDT_FillName =", value, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameNotEqualTo(String value) {
            addCriterion("PDT_FillName <>", value, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameGreaterThan(String value) {
            addCriterion("PDT_FillName >", value, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameGreaterThanOrEqualTo(String value) {
            addCriterion("PDT_FillName >=", value, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameLessThan(String value) {
            addCriterion("PDT_FillName <", value, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameLessThanOrEqualTo(String value) {
            addCriterion("PDT_FillName <=", value, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameLike(String value) {
            addCriterion("PDT_FillName like", value, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameNotLike(String value) {
            addCriterion("PDT_FillName not like", value, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameIn(List<String> values) {
            addCriterion("PDT_FillName in", values, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameNotIn(List<String> values) {
            addCriterion("PDT_FillName not in", values, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameBetween(String value1, String value2) {
            addCriterion("PDT_FillName between", value1, value2, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFillnameNotBetween(String value1, String value2) {
            addCriterion("PDT_FillName not between", value1, value2, "pdtFillname");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeIsNull() {
            addCriterion("PDT_FillTime is null");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeIsNotNull() {
            addCriterion("PDT_FillTime is not null");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeEqualTo(Date value) {
            addCriterion("PDT_FillTime =", value, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeNotEqualTo(Date value) {
            addCriterion("PDT_FillTime <>", value, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeGreaterThan(Date value) {
            addCriterion("PDT_FillTime >", value, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PDT_FillTime >=", value, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeLessThan(Date value) {
            addCriterion("PDT_FillTime <", value, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeLessThanOrEqualTo(Date value) {
            addCriterion("PDT_FillTime <=", value, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeIn(List<Date> values) {
            addCriterion("PDT_FillTime in", values, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeNotIn(List<Date> values) {
            addCriterion("PDT_FillTime not in", values, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeBetween(Date value1, Date value2) {
            addCriterion("PDT_FillTime between", value1, value2, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andPdtFilltimeNotBetween(Date value1, Date value2) {
            addCriterion("PDT_FillTime not between", value1, value2, "pdtFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionIsNull() {
            addCriterion("CMOLeader_Suggestion is null");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionIsNotNull() {
            addCriterion("CMOLeader_Suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionEqualTo(String value) {
            addCriterion("CMOLeader_Suggestion =", value, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionNotEqualTo(String value) {
            addCriterion("CMOLeader_Suggestion <>", value, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionGreaterThan(String value) {
            addCriterion("CMOLeader_Suggestion >", value, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("CMOLeader_Suggestion >=", value, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionLessThan(String value) {
            addCriterion("CMOLeader_Suggestion <", value, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionLessThanOrEqualTo(String value) {
            addCriterion("CMOLeader_Suggestion <=", value, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionLike(String value) {
            addCriterion("CMOLeader_Suggestion like", value, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionNotLike(String value) {
            addCriterion("CMOLeader_Suggestion not like", value, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionIn(List<String> values) {
            addCriterion("CMOLeader_Suggestion in", values, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionNotIn(List<String> values) {
            addCriterion("CMOLeader_Suggestion not in", values, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionBetween(String value1, String value2) {
            addCriterion("CMOLeader_Suggestion between", value1, value2, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderSuggestionNotBetween(String value1, String value2) {
            addCriterion("CMOLeader_Suggestion not between", value1, value2, "cmoleaderSuggestion");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameIsNull() {
            addCriterion("CMOLeader_FillName is null");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameIsNotNull() {
            addCriterion("CMOLeader_FillName is not null");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameEqualTo(String value) {
            addCriterion("CMOLeader_FillName =", value, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameNotEqualTo(String value) {
            addCriterion("CMOLeader_FillName <>", value, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameGreaterThan(String value) {
            addCriterion("CMOLeader_FillName >", value, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameGreaterThanOrEqualTo(String value) {
            addCriterion("CMOLeader_FillName >=", value, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameLessThan(String value) {
            addCriterion("CMOLeader_FillName <", value, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameLessThanOrEqualTo(String value) {
            addCriterion("CMOLeader_FillName <=", value, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameLike(String value) {
            addCriterion("CMOLeader_FillName like", value, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameNotLike(String value) {
            addCriterion("CMOLeader_FillName not like", value, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameIn(List<String> values) {
            addCriterion("CMOLeader_FillName in", values, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameNotIn(List<String> values) {
            addCriterion("CMOLeader_FillName not in", values, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameBetween(String value1, String value2) {
            addCriterion("CMOLeader_FillName between", value1, value2, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFillnameNotBetween(String value1, String value2) {
            addCriterion("CMOLeader_FillName not between", value1, value2, "cmoleaderFillname");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeIsNull() {
            addCriterion("CMOLeader_FillTime is null");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeIsNotNull() {
            addCriterion("CMOLeader_FillTime is not null");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeEqualTo(Date value) {
            addCriterion("CMOLeader_FillTime =", value, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeNotEqualTo(Date value) {
            addCriterion("CMOLeader_FillTime <>", value, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeGreaterThan(Date value) {
            addCriterion("CMOLeader_FillTime >", value, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CMOLeader_FillTime >=", value, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeLessThan(Date value) {
            addCriterion("CMOLeader_FillTime <", value, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeLessThanOrEqualTo(Date value) {
            addCriterion("CMOLeader_FillTime <=", value, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeIn(List<Date> values) {
            addCriterion("CMOLeader_FillTime in", values, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeNotIn(List<Date> values) {
            addCriterion("CMOLeader_FillTime not in", values, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeBetween(Date value1, Date value2) {
            addCriterion("CMOLeader_FillTime between", value1, value2, "cmoleaderFilltime");
            return (Criteria) this;
        }

        public Criteria andCmoleaderFilltimeNotBetween(Date value1, Date value2) {
            addCriterion("CMOLeader_FillTime not between", value1, value2, "cmoleaderFilltime");
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

        public Criteria andCheckresultIsNull() {
            addCriterion("CheckResult is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("CheckResult is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(String value) {
            addCriterion("CheckResult =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(String value) {
            addCriterion("CheckResult <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(String value) {
            addCriterion("CheckResult >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("CheckResult >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(String value) {
            addCriterion("CheckResult <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(String value) {
            addCriterion("CheckResult <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLike(String value) {
            addCriterion("CheckResult like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotLike(String value) {
            addCriterion("CheckResult not like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<String> values) {
            addCriterion("CheckResult in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<String> values) {
            addCriterion("CheckResult not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(String value1, String value2) {
            addCriterion("CheckResult between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(String value1, String value2) {
            addCriterion("CheckResult not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserIsNull() {
            addCriterion("EditCurrentUser is null");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserIsNotNull() {
            addCriterion("EditCurrentUser is not null");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserEqualTo(String value) {
            addCriterion("EditCurrentUser =", value, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserNotEqualTo(String value) {
            addCriterion("EditCurrentUser <>", value, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserGreaterThan(String value) {
            addCriterion("EditCurrentUser >", value, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserGreaterThanOrEqualTo(String value) {
            addCriterion("EditCurrentUser >=", value, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserLessThan(String value) {
            addCriterion("EditCurrentUser <", value, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserLessThanOrEqualTo(String value) {
            addCriterion("EditCurrentUser <=", value, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserLike(String value) {
            addCriterion("EditCurrentUser like", value, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserNotLike(String value) {
            addCriterion("EditCurrentUser not like", value, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserIn(List<String> values) {
            addCriterion("EditCurrentUser in", values, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserNotIn(List<String> values) {
            addCriterion("EditCurrentUser not in", values, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserBetween(String value1, String value2) {
            addCriterion("EditCurrentUser between", value1, value2, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andEditcurrentuserNotBetween(String value1, String value2) {
            addCriterion("EditCurrentUser not between", value1, value2, "editcurrentuser");
            return (Criteria) this;
        }

        public Criteria andAssignsignIsNull() {
            addCriterion("AssignSign is null");
            return (Criteria) this;
        }

        public Criteria andAssignsignIsNotNull() {
            addCriterion("AssignSign is not null");
            return (Criteria) this;
        }

        public Criteria andAssignsignEqualTo(String value) {
            addCriterion("AssignSign =", value, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignNotEqualTo(String value) {
            addCriterion("AssignSign <>", value, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignGreaterThan(String value) {
            addCriterion("AssignSign >", value, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignGreaterThanOrEqualTo(String value) {
            addCriterion("AssignSign >=", value, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignLessThan(String value) {
            addCriterion("AssignSign <", value, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignLessThanOrEqualTo(String value) {
            addCriterion("AssignSign <=", value, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignLike(String value) {
            addCriterion("AssignSign like", value, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignNotLike(String value) {
            addCriterion("AssignSign not like", value, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignIn(List<String> values) {
            addCriterion("AssignSign in", values, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignNotIn(List<String> values) {
            addCriterion("AssignSign not in", values, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignBetween(String value1, String value2) {
            addCriterion("AssignSign between", value1, value2, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssignsignNotBetween(String value1, String value2) {
            addCriterion("AssignSign not between", value1, value2, "assignsign");
            return (Criteria) this;
        }

        public Criteria andAssigndateIsNull() {
            addCriterion("AssignDate is null");
            return (Criteria) this;
        }

        public Criteria andAssigndateIsNotNull() {
            addCriterion("AssignDate is not null");
            return (Criteria) this;
        }

        public Criteria andAssigndateEqualTo(Date value) {
            addCriterion("AssignDate =", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateNotEqualTo(Date value) {
            addCriterion("AssignDate <>", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateGreaterThan(Date value) {
            addCriterion("AssignDate >", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("AssignDate >=", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateLessThan(Date value) {
            addCriterion("AssignDate <", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateLessThanOrEqualTo(Date value) {
            addCriterion("AssignDate <=", value, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateIn(List<Date> values) {
            addCriterion("AssignDate in", values, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateNotIn(List<Date> values) {
            addCriterion("AssignDate not in", values, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateBetween(Date value1, Date value2) {
            addCriterion("AssignDate between", value1, value2, "assigndate");
            return (Criteria) this;
        }

        public Criteria andAssigndateNotBetween(Date value1, Date value2) {
            addCriterion("AssignDate not between", value1, value2, "assigndate");
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