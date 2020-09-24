package com.h3c.mds.sysmgr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotesGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotesGroupExample() {
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

        public Criteria andVersionIdIsNull() {
            addCriterion("Version_ID is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("Version_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Integer value) {
            addCriterion("Version_ID =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Integer value) {
            addCriterion("Version_ID <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Integer value) {
            addCriterion("Version_ID >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Version_ID >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Integer value) {
            addCriterion("Version_ID <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("Version_ID <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Integer> values) {
            addCriterion("Version_ID in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Integer> values) {
            addCriterion("Version_ID not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("Version_ID between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Version_ID not between", value1, value2, "versionId");
            return (Criteria) this;
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

        public Criteria andStatusIdIsNull() {
            addCriterion("Status_ID is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("Status_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Byte value) {
            addCriterion("Status_ID =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Byte value) {
            addCriterion("Status_ID <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Byte value) {
            addCriterion("Status_ID >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("Status_ID >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Byte value) {
            addCriterion("Status_ID <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Byte value) {
            addCriterion("Status_ID <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Byte> values) {
            addCriterion("Status_ID in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Byte> values) {
            addCriterion("Status_ID not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Byte value1, Byte value2) {
            addCriterion("Status_ID between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Byte value1, Byte value2) {
            addCriterion("Status_ID not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdIsNull() {
            addCriterion("ValidationStatus_ID is null");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdIsNotNull() {
            addCriterion("ValidationStatus_ID is not null");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdEqualTo(Byte value) {
            addCriterion("ValidationStatus_ID =", value, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdNotEqualTo(Byte value) {
            addCriterion("ValidationStatus_ID <>", value, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdGreaterThan(Byte value) {
            addCriterion("ValidationStatus_ID >", value, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("ValidationStatus_ID >=", value, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdLessThan(Byte value) {
            addCriterion("ValidationStatus_ID <", value, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdLessThanOrEqualTo(Byte value) {
            addCriterion("ValidationStatus_ID <=", value, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdIn(List<Byte> values) {
            addCriterion("ValidationStatus_ID in", values, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdNotIn(List<Byte> values) {
            addCriterion("ValidationStatus_ID not in", values, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdBetween(Byte value1, Byte value2) {
            addCriterion("ValidationStatus_ID between", value1, value2, "validationstatusId");
            return (Criteria) this;
        }

        public Criteria andValidationstatusIdNotBetween(Byte value1, Byte value2) {
            addCriterion("ValidationStatus_ID not between", value1, value2, "validationstatusId");
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

        public Criteria andChangetrackingmaskIsNull() {
            addCriterion("ChangeTrackingMask is null");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskIsNotNull() {
            addCriterion("ChangeTrackingMask is not null");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskEqualTo(Integer value) {
            addCriterion("ChangeTrackingMask =", value, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskNotEqualTo(Integer value) {
            addCriterion("ChangeTrackingMask <>", value, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskGreaterThan(Integer value) {
            addCriterion("ChangeTrackingMask >", value, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChangeTrackingMask >=", value, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskLessThan(Integer value) {
            addCriterion("ChangeTrackingMask <", value, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskLessThanOrEqualTo(Integer value) {
            addCriterion("ChangeTrackingMask <=", value, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskIn(List<Integer> values) {
            addCriterion("ChangeTrackingMask in", values, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskNotIn(List<Integer> values) {
            addCriterion("ChangeTrackingMask not in", values, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskBetween(Integer value1, Integer value2) {
            addCriterion("ChangeTrackingMask between", value1, value2, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andChangetrackingmaskNotBetween(Integer value1, Integer value2) {
            addCriterion("ChangeTrackingMask not between", value1, value2, "changetrackingmask");
            return (Criteria) this;
        }

        public Criteria andEnterdtmIsNull() {
            addCriterion("EnterDTM is null");
            return (Criteria) this;
        }

        public Criteria andEnterdtmIsNotNull() {
            addCriterion("EnterDTM is not null");
            return (Criteria) this;
        }

        public Criteria andEnterdtmEqualTo(Date value) {
            addCriterion("EnterDTM =", value, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmNotEqualTo(Date value) {
            addCriterion("EnterDTM <>", value, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmGreaterThan(Date value) {
            addCriterion("EnterDTM >", value, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmGreaterThanOrEqualTo(Date value) {
            addCriterion("EnterDTM >=", value, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmLessThan(Date value) {
            addCriterion("EnterDTM <", value, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmLessThanOrEqualTo(Date value) {
            addCriterion("EnterDTM <=", value, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmIn(List<Date> values) {
            addCriterion("EnterDTM in", values, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmNotIn(List<Date> values) {
            addCriterion("EnterDTM not in", values, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmBetween(Date value1, Date value2) {
            addCriterion("EnterDTM between", value1, value2, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnterdtmNotBetween(Date value1, Date value2) {
            addCriterion("EnterDTM not between", value1, value2, "enterdtm");
            return (Criteria) this;
        }

        public Criteria andEnteruseridIsNull() {
            addCriterion("EnterUserID is null");
            return (Criteria) this;
        }

        public Criteria andEnteruseridIsNotNull() {
            addCriterion("EnterUserID is not null");
            return (Criteria) this;
        }

        public Criteria andEnteruseridEqualTo(Integer value) {
            addCriterion("EnterUserID =", value, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridNotEqualTo(Integer value) {
            addCriterion("EnterUserID <>", value, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridGreaterThan(Integer value) {
            addCriterion("EnterUserID >", value, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("EnterUserID >=", value, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridLessThan(Integer value) {
            addCriterion("EnterUserID <", value, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridLessThanOrEqualTo(Integer value) {
            addCriterion("EnterUserID <=", value, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridIn(List<Integer> values) {
            addCriterion("EnterUserID in", values, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridNotIn(List<Integer> values) {
            addCriterion("EnterUserID not in", values, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridBetween(Integer value1, Integer value2) {
            addCriterion("EnterUserID between", value1, value2, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnteruseridNotBetween(Integer value1, Integer value2) {
            addCriterion("EnterUserID not between", value1, value2, "enteruserid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidIsNull() {
            addCriterion("EnterVersionID is null");
            return (Criteria) this;
        }

        public Criteria andEnterversionidIsNotNull() {
            addCriterion("EnterVersionID is not null");
            return (Criteria) this;
        }

        public Criteria andEnterversionidEqualTo(Integer value) {
            addCriterion("EnterVersionID =", value, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidNotEqualTo(Integer value) {
            addCriterion("EnterVersionID <>", value, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidGreaterThan(Integer value) {
            addCriterion("EnterVersionID >", value, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EnterVersionID >=", value, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidLessThan(Integer value) {
            addCriterion("EnterVersionID <", value, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidLessThanOrEqualTo(Integer value) {
            addCriterion("EnterVersionID <=", value, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidIn(List<Integer> values) {
            addCriterion("EnterVersionID in", values, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidNotIn(List<Integer> values) {
            addCriterion("EnterVersionID not in", values, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidBetween(Integer value1, Integer value2) {
            addCriterion("EnterVersionID between", value1, value2, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andEnterversionidNotBetween(Integer value1, Integer value2) {
            addCriterion("EnterVersionID not between", value1, value2, "enterversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmIsNull() {
            addCriterion("LastChgDTM is null");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmIsNotNull() {
            addCriterion("LastChgDTM is not null");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmEqualTo(Date value) {
            addCriterion("LastChgDTM =", value, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmNotEqualTo(Date value) {
            addCriterion("LastChgDTM <>", value, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmGreaterThan(Date value) {
            addCriterion("LastChgDTM >", value, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmGreaterThanOrEqualTo(Date value) {
            addCriterion("LastChgDTM >=", value, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmLessThan(Date value) {
            addCriterion("LastChgDTM <", value, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmLessThanOrEqualTo(Date value) {
            addCriterion("LastChgDTM <=", value, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmIn(List<Date> values) {
            addCriterion("LastChgDTM in", values, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmNotIn(List<Date> values) {
            addCriterion("LastChgDTM not in", values, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmBetween(Date value1, Date value2) {
            addCriterion("LastChgDTM between", value1, value2, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchgdtmNotBetween(Date value1, Date value2) {
            addCriterion("LastChgDTM not between", value1, value2, "lastchgdtm");
            return (Criteria) this;
        }

        public Criteria andLastchguseridIsNull() {
            addCriterion("LastChgUserID is null");
            return (Criteria) this;
        }

        public Criteria andLastchguseridIsNotNull() {
            addCriterion("LastChgUserID is not null");
            return (Criteria) this;
        }

        public Criteria andLastchguseridEqualTo(Integer value) {
            addCriterion("LastChgUserID =", value, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridNotEqualTo(Integer value) {
            addCriterion("LastChgUserID <>", value, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridGreaterThan(Integer value) {
            addCriterion("LastChgUserID >", value, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("LastChgUserID >=", value, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridLessThan(Integer value) {
            addCriterion("LastChgUserID <", value, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridLessThanOrEqualTo(Integer value) {
            addCriterion("LastChgUserID <=", value, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridIn(List<Integer> values) {
            addCriterion("LastChgUserID in", values, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridNotIn(List<Integer> values) {
            addCriterion("LastChgUserID not in", values, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridBetween(Integer value1, Integer value2) {
            addCriterion("LastChgUserID between", value1, value2, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchguseridNotBetween(Integer value1, Integer value2) {
            addCriterion("LastChgUserID not between", value1, value2, "lastchguserid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidIsNull() {
            addCriterion("LastChgVersionID is null");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidIsNotNull() {
            addCriterion("LastChgVersionID is not null");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidEqualTo(Integer value) {
            addCriterion("LastChgVersionID =", value, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidNotEqualTo(Integer value) {
            addCriterion("LastChgVersionID <>", value, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidGreaterThan(Integer value) {
            addCriterion("LastChgVersionID >", value, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LastChgVersionID >=", value, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidLessThan(Integer value) {
            addCriterion("LastChgVersionID <", value, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidLessThanOrEqualTo(Integer value) {
            addCriterion("LastChgVersionID <=", value, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidIn(List<Integer> values) {
            addCriterion("LastChgVersionID in", values, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidNotIn(List<Integer> values) {
            addCriterion("LastChgVersionID not in", values, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidBetween(Integer value1, Integer value2) {
            addCriterion("LastChgVersionID between", value1, value2, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andLastchgversionidNotBetween(Integer value1, Integer value2) {
            addCriterion("LastChgVersionID not between", value1, value2, "lastchgversionid");
            return (Criteria) this;
        }

        public Criteria andAsofIdIsNull() {
            addCriterion("AsOf_ID is null");
            return (Criteria) this;
        }

        public Criteria andAsofIdIsNotNull() {
            addCriterion("AsOf_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAsofIdEqualTo(Integer value) {
            addCriterion("AsOf_ID =", value, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdNotEqualTo(Integer value) {
            addCriterion("AsOf_ID <>", value, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdGreaterThan(Integer value) {
            addCriterion("AsOf_ID >", value, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AsOf_ID >=", value, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdLessThan(Integer value) {
            addCriterion("AsOf_ID <", value, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdLessThanOrEqualTo(Integer value) {
            addCriterion("AsOf_ID <=", value, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdIn(List<Integer> values) {
            addCriterion("AsOf_ID in", values, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdNotIn(List<Integer> values) {
            addCriterion("AsOf_ID not in", values, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdBetween(Integer value1, Integer value2) {
            addCriterion("AsOf_ID between", value1, value2, "asofId");
            return (Criteria) this;
        }

        public Criteria andAsofIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AsOf_ID not between", value1, value2, "asofId");
            return (Criteria) this;
        }

        public Criteria andMuidIsNull() {
            addCriterion("MUID is null");
            return (Criteria) this;
        }

        public Criteria andMuidIsNotNull() {
            addCriterion("MUID is not null");
            return (Criteria) this;
        }

        public Criteria andMuidEqualTo(String value) {
            addCriterion("MUID =", value, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidNotEqualTo(String value) {
            addCriterion("MUID <>", value, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidGreaterThan(String value) {
            addCriterion("MUID >", value, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidGreaterThanOrEqualTo(String value) {
            addCriterion("MUID >=", value, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidLessThan(String value) {
            addCriterion("MUID <", value, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidLessThanOrEqualTo(String value) {
            addCriterion("MUID <=", value, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidLike(String value) {
            addCriterion("MUID like", value, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidNotLike(String value) {
            addCriterion("MUID not like", value, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidIn(List<String> values) {
            addCriterion("MUID in", values, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidNotIn(List<String> values) {
            addCriterion("MUID not in", values, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidBetween(String value1, String value2) {
            addCriterion("MUID between", value1, value2, "muid");
            return (Criteria) this;
        }

        public Criteria andMuidNotBetween(String value1, String value2) {
            addCriterion("MUID not between", value1, value2, "muid");
            return (Criteria) this;
        }

        public Criteria andUda11516IsNull() {
            addCriterion("uda_11_516 is null");
            return (Criteria) this;
        }

        public Criteria andUda11516IsNotNull() {
            addCriterion("uda_11_516 is not null");
            return (Criteria) this;
        }

        public Criteria andUda11516EqualTo(String value) {
            addCriterion("uda_11_516 =", value, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516NotEqualTo(String value) {
            addCriterion("uda_11_516 <>", value, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516GreaterThan(String value) {
            addCriterion("uda_11_516 >", value, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516GreaterThanOrEqualTo(String value) {
            addCriterion("uda_11_516 >=", value, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516LessThan(String value) {
            addCriterion("uda_11_516 <", value, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516LessThanOrEqualTo(String value) {
            addCriterion("uda_11_516 <=", value, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516Like(String value) {
            addCriterion("uda_11_516 like", value, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516NotLike(String value) {
            addCriterion("uda_11_516 not like", value, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516In(List<String> values) {
            addCriterion("uda_11_516 in", values, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516NotIn(List<String> values) {
            addCriterion("uda_11_516 not in", values, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516Between(String value1, String value2) {
            addCriterion("uda_11_516 between", value1, value2, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11516NotBetween(String value1, String value2) {
            addCriterion("uda_11_516 not between", value1, value2, "uda11516");
            return (Criteria) this;
        }

        public Criteria andUda11517IsNull() {
            addCriterion("uda_11_517 is null");
            return (Criteria) this;
        }

        public Criteria andUda11517IsNotNull() {
            addCriterion("uda_11_517 is not null");
            return (Criteria) this;
        }

        public Criteria andUda11517EqualTo(String value) {
            addCriterion("uda_11_517 =", value, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517NotEqualTo(String value) {
            addCriterion("uda_11_517 <>", value, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517GreaterThan(String value) {
            addCriterion("uda_11_517 >", value, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517GreaterThanOrEqualTo(String value) {
            addCriterion("uda_11_517 >=", value, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517LessThan(String value) {
            addCriterion("uda_11_517 <", value, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517LessThanOrEqualTo(String value) {
            addCriterion("uda_11_517 <=", value, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517Like(String value) {
            addCriterion("uda_11_517 like", value, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517NotLike(String value) {
            addCriterion("uda_11_517 not like", value, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517In(List<String> values) {
            addCriterion("uda_11_517 in", values, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517NotIn(List<String> values) {
            addCriterion("uda_11_517 not in", values, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517Between(String value1, String value2) {
            addCriterion("uda_11_517 between", value1, value2, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11517NotBetween(String value1, String value2) {
            addCriterion("uda_11_517 not between", value1, value2, "uda11517");
            return (Criteria) this;
        }

        public Criteria andUda11518IsNull() {
            addCriterion("uda_11_518 is null");
            return (Criteria) this;
        }

        public Criteria andUda11518IsNotNull() {
            addCriterion("uda_11_518 is not null");
            return (Criteria) this;
        }

        public Criteria andUda11518EqualTo(Date value) {
            addCriterion("uda_11_518 =", value, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518NotEqualTo(Date value) {
            addCriterion("uda_11_518 <>", value, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518GreaterThan(Date value) {
            addCriterion("uda_11_518 >", value, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518GreaterThanOrEqualTo(Date value) {
            addCriterion("uda_11_518 >=", value, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518LessThan(Date value) {
            addCriterion("uda_11_518 <", value, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518LessThanOrEqualTo(Date value) {
            addCriterion("uda_11_518 <=", value, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518In(List<Date> values) {
            addCriterion("uda_11_518 in", values, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518NotIn(List<Date> values) {
            addCriterion("uda_11_518 not in", values, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518Between(Date value1, Date value2) {
            addCriterion("uda_11_518 between", value1, value2, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11518NotBetween(Date value1, Date value2) {
            addCriterion("uda_11_518 not between", value1, value2, "uda11518");
            return (Criteria) this;
        }

        public Criteria andUda11519IsNull() {
            addCriterion("uda_11_519 is null");
            return (Criteria) this;
        }

        public Criteria andUda11519IsNotNull() {
            addCriterion("uda_11_519 is not null");
            return (Criteria) this;
        }

        public Criteria andUda11519EqualTo(String value) {
            addCriterion("uda_11_519 =", value, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519NotEqualTo(String value) {
            addCriterion("uda_11_519 <>", value, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519GreaterThan(String value) {
            addCriterion("uda_11_519 >", value, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519GreaterThanOrEqualTo(String value) {
            addCriterion("uda_11_519 >=", value, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519LessThan(String value) {
            addCriterion("uda_11_519 <", value, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519LessThanOrEqualTo(String value) {
            addCriterion("uda_11_519 <=", value, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519Like(String value) {
            addCriterion("uda_11_519 like", value, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519NotLike(String value) {
            addCriterion("uda_11_519 not like", value, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519In(List<String> values) {
            addCriterion("uda_11_519 in", values, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519NotIn(List<String> values) {
            addCriterion("uda_11_519 not in", values, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519Between(String value1, String value2) {
            addCriterion("uda_11_519 between", value1, value2, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11519NotBetween(String value1, String value2) {
            addCriterion("uda_11_519 not between", value1, value2, "uda11519");
            return (Criteria) this;
        }

        public Criteria andUda11520IsNull() {
            addCriterion("uda_11_520 is null");
            return (Criteria) this;
        }

        public Criteria andUda11520IsNotNull() {
            addCriterion("uda_11_520 is not null");
            return (Criteria) this;
        }

        public Criteria andUda11520EqualTo(Date value) {
            addCriterion("uda_11_520 =", value, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520NotEqualTo(Date value) {
            addCriterion("uda_11_520 <>", value, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520GreaterThan(Date value) {
            addCriterion("uda_11_520 >", value, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520GreaterThanOrEqualTo(Date value) {
            addCriterion("uda_11_520 >=", value, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520LessThan(Date value) {
            addCriterion("uda_11_520 <", value, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520LessThanOrEqualTo(Date value) {
            addCriterion("uda_11_520 <=", value, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520In(List<Date> values) {
            addCriterion("uda_11_520 in", values, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520NotIn(List<Date> values) {
            addCriterion("uda_11_520 not in", values, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520Between(Date value1, Date value2) {
            addCriterion("uda_11_520 between", value1, value2, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11520NotBetween(Date value1, Date value2) {
            addCriterion("uda_11_520 not between", value1, value2, "uda11520");
            return (Criteria) this;
        }

        public Criteria andUda11521IsNull() {
            addCriterion("uda_11_521 is null");
            return (Criteria) this;
        }

        public Criteria andUda11521IsNotNull() {
            addCriterion("uda_11_521 is not null");
            return (Criteria) this;
        }

        public Criteria andUda11521EqualTo(BigDecimal value) {
            addCriterion("uda_11_521 =", value, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521NotEqualTo(BigDecimal value) {
            addCriterion("uda_11_521 <>", value, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521GreaterThan(BigDecimal value) {
            addCriterion("uda_11_521 >", value, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("uda_11_521 >=", value, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521LessThan(BigDecimal value) {
            addCriterion("uda_11_521 <", value, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521LessThanOrEqualTo(BigDecimal value) {
            addCriterion("uda_11_521 <=", value, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521In(List<BigDecimal> values) {
            addCriterion("uda_11_521 in", values, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521NotIn(List<BigDecimal> values) {
            addCriterion("uda_11_521 not in", values, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("uda_11_521 between", value1, value2, "uda11521");
            return (Criteria) this;
        }

        public Criteria andUda11521NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("uda_11_521 not between", value1, value2, "uda11521");
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