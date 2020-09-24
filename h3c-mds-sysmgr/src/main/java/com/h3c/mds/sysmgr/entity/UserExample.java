package com.h3c.mds.sysmgr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUda10507IsNull() {
            addCriterion("uda_10_507 is null");
            return (Criteria) this;
        }

        public Criteria andUda10507IsNotNull() {
            addCriterion("uda_10_507 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10507EqualTo(Integer value) {
            addCriterion("uda_10_507 =", value, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507NotEqualTo(Integer value) {
            addCriterion("uda_10_507 <>", value, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507GreaterThan(Integer value) {
            addCriterion("uda_10_507 >", value, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507GreaterThanOrEqualTo(Integer value) {
            addCriterion("uda_10_507 >=", value, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507LessThan(Integer value) {
            addCriterion("uda_10_507 <", value, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507LessThanOrEqualTo(Integer value) {
            addCriterion("uda_10_507 <=", value, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507In(List<Integer> values) {
            addCriterion("uda_10_507 in", values, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507NotIn(List<Integer> values) {
            addCriterion("uda_10_507 not in", values, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507Between(Integer value1, Integer value2) {
            addCriterion("uda_10_507 between", value1, value2, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10507NotBetween(Integer value1, Integer value2) {
            addCriterion("uda_10_507 not between", value1, value2, "uda10507");
            return (Criteria) this;
        }

        public Criteria andUda10508IsNull() {
            addCriterion("uda_10_508 is null");
            return (Criteria) this;
        }

        public Criteria andUda10508IsNotNull() {
            addCriterion("uda_10_508 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10508EqualTo(BigDecimal value) {
            addCriterion("uda_10_508 =", value, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508NotEqualTo(BigDecimal value) {
            addCriterion("uda_10_508 <>", value, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508GreaterThan(BigDecimal value) {
            addCriterion("uda_10_508 >", value, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("uda_10_508 >=", value, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508LessThan(BigDecimal value) {
            addCriterion("uda_10_508 <", value, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508LessThanOrEqualTo(BigDecimal value) {
            addCriterion("uda_10_508 <=", value, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508In(List<BigDecimal> values) {
            addCriterion("uda_10_508 in", values, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508NotIn(List<BigDecimal> values) {
            addCriterion("uda_10_508 not in", values, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("uda_10_508 between", value1, value2, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10508NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("uda_10_508 not between", value1, value2, "uda10508");
            return (Criteria) this;
        }

        public Criteria andUda10509IsNull() {
            addCriterion("uda_10_509 is null");
            return (Criteria) this;
        }

        public Criteria andUda10509IsNotNull() {
            addCriterion("uda_10_509 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10509EqualTo(String value) {
            addCriterion("uda_10_509 =", value, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509NotEqualTo(String value) {
            addCriterion("uda_10_509 <>", value, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509GreaterThan(String value) {
            addCriterion("uda_10_509 >", value, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509GreaterThanOrEqualTo(String value) {
            addCriterion("uda_10_509 >=", value, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509LessThan(String value) {
            addCriterion("uda_10_509 <", value, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509LessThanOrEqualTo(String value) {
            addCriterion("uda_10_509 <=", value, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509Like(String value) {
            addCriterion("uda_10_509 like", value, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509NotLike(String value) {
            addCriterion("uda_10_509 not like", value, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509In(List<String> values) {
            addCriterion("uda_10_509 in", values, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509NotIn(List<String> values) {
            addCriterion("uda_10_509 not in", values, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509Between(String value1, String value2) {
            addCriterion("uda_10_509 between", value1, value2, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10509NotBetween(String value1, String value2) {
            addCriterion("uda_10_509 not between", value1, value2, "uda10509");
            return (Criteria) this;
        }

        public Criteria andUda10510IsNull() {
            addCriterion("uda_10_510 is null");
            return (Criteria) this;
        }

        public Criteria andUda10510IsNotNull() {
            addCriterion("uda_10_510 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10510EqualTo(String value) {
            addCriterion("uda_10_510 =", value, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510NotEqualTo(String value) {
            addCriterion("uda_10_510 <>", value, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510GreaterThan(String value) {
            addCriterion("uda_10_510 >", value, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510GreaterThanOrEqualTo(String value) {
            addCriterion("uda_10_510 >=", value, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510LessThan(String value) {
            addCriterion("uda_10_510 <", value, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510LessThanOrEqualTo(String value) {
            addCriterion("uda_10_510 <=", value, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510Like(String value) {
            addCriterion("uda_10_510 like", value, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510NotLike(String value) {
            addCriterion("uda_10_510 not like", value, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510In(List<String> values) {
            addCriterion("uda_10_510 in", values, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510NotIn(List<String> values) {
            addCriterion("uda_10_510 not in", values, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510Between(String value1, String value2) {
            addCriterion("uda_10_510 between", value1, value2, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10510NotBetween(String value1, String value2) {
            addCriterion("uda_10_510 not between", value1, value2, "uda10510");
            return (Criteria) this;
        }

        public Criteria andUda10511IsNull() {
            addCriterion("uda_10_511 is null");
            return (Criteria) this;
        }

        public Criteria andUda10511IsNotNull() {
            addCriterion("uda_10_511 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10511EqualTo(String value) {
            addCriterion("uda_10_511 =", value, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511NotEqualTo(String value) {
            addCriterion("uda_10_511 <>", value, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511GreaterThan(String value) {
            addCriterion("uda_10_511 >", value, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511GreaterThanOrEqualTo(String value) {
            addCriterion("uda_10_511 >=", value, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511LessThan(String value) {
            addCriterion("uda_10_511 <", value, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511LessThanOrEqualTo(String value) {
            addCriterion("uda_10_511 <=", value, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511Like(String value) {
            addCriterion("uda_10_511 like", value, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511NotLike(String value) {
            addCriterion("uda_10_511 not like", value, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511In(List<String> values) {
            addCriterion("uda_10_511 in", values, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511NotIn(List<String> values) {
            addCriterion("uda_10_511 not in", values, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511Between(String value1, String value2) {
            addCriterion("uda_10_511 between", value1, value2, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10511NotBetween(String value1, String value2) {
            addCriterion("uda_10_511 not between", value1, value2, "uda10511");
            return (Criteria) this;
        }

        public Criteria andUda10512IsNull() {
            addCriterion("uda_10_512 is null");
            return (Criteria) this;
        }

        public Criteria andUda10512IsNotNull() {
            addCriterion("uda_10_512 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10512EqualTo(String value) {
            addCriterion("uda_10_512 =", value, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512NotEqualTo(String value) {
            addCriterion("uda_10_512 <>", value, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512GreaterThan(String value) {
            addCriterion("uda_10_512 >", value, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512GreaterThanOrEqualTo(String value) {
            addCriterion("uda_10_512 >=", value, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512LessThan(String value) {
            addCriterion("uda_10_512 <", value, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512LessThanOrEqualTo(String value) {
            addCriterion("uda_10_512 <=", value, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512Like(String value) {
            addCriterion("uda_10_512 like", value, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512NotLike(String value) {
            addCriterion("uda_10_512 not like", value, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512In(List<String> values) {
            addCriterion("uda_10_512 in", values, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512NotIn(List<String> values) {
            addCriterion("uda_10_512 not in", values, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512Between(String value1, String value2) {
            addCriterion("uda_10_512 between", value1, value2, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10512NotBetween(String value1, String value2) {
            addCriterion("uda_10_512 not between", value1, value2, "uda10512");
            return (Criteria) this;
        }

        public Criteria andUda10513IsNull() {
            addCriterion("uda_10_513 is null");
            return (Criteria) this;
        }

        public Criteria andUda10513IsNotNull() {
            addCriterion("uda_10_513 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10513EqualTo(String value) {
            addCriterion("uda_10_513 =", value, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513NotEqualTo(String value) {
            addCriterion("uda_10_513 <>", value, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513GreaterThan(String value) {
            addCriterion("uda_10_513 >", value, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513GreaterThanOrEqualTo(String value) {
            addCriterion("uda_10_513 >=", value, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513LessThan(String value) {
            addCriterion("uda_10_513 <", value, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513LessThanOrEqualTo(String value) {
            addCriterion("uda_10_513 <=", value, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513Like(String value) {
            addCriterion("uda_10_513 like", value, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513NotLike(String value) {
            addCriterion("uda_10_513 not like", value, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513In(List<String> values) {
            addCriterion("uda_10_513 in", values, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513NotIn(List<String> values) {
            addCriterion("uda_10_513 not in", values, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513Between(String value1, String value2) {
            addCriterion("uda_10_513 between", value1, value2, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10513NotBetween(String value1, String value2) {
            addCriterion("uda_10_513 not between", value1, value2, "uda10513");
            return (Criteria) this;
        }

        public Criteria andUda10514IsNull() {
            addCriterion("uda_10_514 is null");
            return (Criteria) this;
        }

        public Criteria andUda10514IsNotNull() {
            addCriterion("uda_10_514 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10514EqualTo(String value) {
            addCriterion("uda_10_514 =", value, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514NotEqualTo(String value) {
            addCriterion("uda_10_514 <>", value, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514GreaterThan(String value) {
            addCriterion("uda_10_514 >", value, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514GreaterThanOrEqualTo(String value) {
            addCriterion("uda_10_514 >=", value, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514LessThan(String value) {
            addCriterion("uda_10_514 <", value, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514LessThanOrEqualTo(String value) {
            addCriterion("uda_10_514 <=", value, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514Like(String value) {
            addCriterion("uda_10_514 like", value, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514NotLike(String value) {
            addCriterion("uda_10_514 not like", value, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514In(List<String> values) {
            addCriterion("uda_10_514 in", values, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514NotIn(List<String> values) {
            addCriterion("uda_10_514 not in", values, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514Between(String value1, String value2) {
            addCriterion("uda_10_514 between", value1, value2, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10514NotBetween(String value1, String value2) {
            addCriterion("uda_10_514 not between", value1, value2, "uda10514");
            return (Criteria) this;
        }

        public Criteria andUda10515IsNull() {
            addCriterion("uda_10_515 is null");
            return (Criteria) this;
        }

        public Criteria andUda10515IsNotNull() {
            addCriterion("uda_10_515 is not null");
            return (Criteria) this;
        }

        public Criteria andUda10515EqualTo(String value) {
            addCriterion("uda_10_515 =", value, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515NotEqualTo(String value) {
            addCriterion("uda_10_515 <>", value, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515GreaterThan(String value) {
            addCriterion("uda_10_515 >", value, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515GreaterThanOrEqualTo(String value) {
            addCriterion("uda_10_515 >=", value, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515LessThan(String value) {
            addCriterion("uda_10_515 <", value, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515LessThanOrEqualTo(String value) {
            addCriterion("uda_10_515 <=", value, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515Like(String value) {
            addCriterion("uda_10_515 like", value, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515NotLike(String value) {
            addCriterion("uda_10_515 not like", value, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515In(List<String> values) {
            addCriterion("uda_10_515 in", values, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515NotIn(List<String> values) {
            addCriterion("uda_10_515 not in", values, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515Between(String value1, String value2) {
            addCriterion("uda_10_515 between", value1, value2, "uda10515");
            return (Criteria) this;
        }

        public Criteria andUda10515NotBetween(String value1, String value2) {
            addCriterion("uda_10_515 not between", value1, value2, "uda10515");
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