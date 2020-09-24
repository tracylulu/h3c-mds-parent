package com.h3c.mds.dept.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IbdsDeptSysPersonRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IbdsDeptSysPersonRoleExample() {
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

        public Criteria andSapcodeIsNull() {
            addCriterion("SAPcode is null");
            return (Criteria) this;
        }

        public Criteria andSapcodeIsNotNull() {
            addCriterion("SAPcode is not null");
            return (Criteria) this;
        }

        public Criteria andSapcodeEqualTo(String value) {
            addCriterion("SAPcode =", value, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeNotEqualTo(String value) {
            addCriterion("SAPcode <>", value, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeGreaterThan(String value) {
            addCriterion("SAPcode >", value, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SAPcode >=", value, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeLessThan(String value) {
            addCriterion("SAPcode <", value, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeLessThanOrEqualTo(String value) {
            addCriterion("SAPcode <=", value, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeLike(String value) {
            addCriterion("SAPcode like", value, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeNotLike(String value) {
            addCriterion("SAPcode not like", value, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeIn(List<String> values) {
            addCriterion("SAPcode in", values, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeNotIn(List<String> values) {
            addCriterion("SAPcode not in", values, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeBetween(String value1, String value2) {
            addCriterion("SAPcode between", value1, value2, "sapcode");
            return (Criteria) this;
        }

        public Criteria andSapcodeNotBetween(String value1, String value2) {
            addCriterion("SAPcode not between", value1, value2, "sapcode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeIsNull() {
            addCriterion("RoleTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeIsNotNull() {
            addCriterion("RoleTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeEqualTo(String value) {
            addCriterion("RoleTypeCode =", value, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeNotEqualTo(String value) {
            addCriterion("RoleTypeCode <>", value, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeGreaterThan(String value) {
            addCriterion("RoleTypeCode >", value, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("RoleTypeCode >=", value, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeLessThan(String value) {
            addCriterion("RoleTypeCode <", value, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeLessThanOrEqualTo(String value) {
            addCriterion("RoleTypeCode <=", value, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeLike(String value) {
            addCriterion("RoleTypeCode like", value, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeNotLike(String value) {
            addCriterion("RoleTypeCode not like", value, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeIn(List<String> values) {
            addCriterion("RoleTypeCode in", values, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeNotIn(List<String> values) {
            addCriterion("RoleTypeCode not in", values, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeBetween(String value1, String value2) {
            addCriterion("RoleTypeCode between", value1, value2, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andRoletypecodeNotBetween(String value1, String value2) {
            addCriterion("RoleTypeCode not between", value1, value2, "roletypecode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeIsNull() {
            addCriterion("PersonCode is null");
            return (Criteria) this;
        }

        public Criteria andPersoncodeIsNotNull() {
            addCriterion("PersonCode is not null");
            return (Criteria) this;
        }

        public Criteria andPersoncodeEqualTo(String value) {
            addCriterion("PersonCode =", value, "personcode");
            return (Criteria) this;
        }
        
        public Criteria andPersonnameEqualTo(String value) {
            addCriterion("PersonName =", value, "personname");
            return (Criteria) this;
        }
        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("CreatorName =", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andPersoncodeNotEqualTo(String value) {
            addCriterion("PersonCode <>", value, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeGreaterThan(String value) {
            addCriterion("PersonCode >", value, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeGreaterThanOrEqualTo(String value) {
            addCriterion("PersonCode >=", value, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeLessThan(String value) {
            addCriterion("PersonCode <", value, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeLessThanOrEqualTo(String value) {
            addCriterion("PersonCode <=", value, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeLike(String value) {
            addCriterion("PersonCode like", value, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeNotLike(String value) {
            addCriterion("PersonCode not like", value, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeIn(List<String> values) {
            addCriterion("PersonCode in", values, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeNotIn(List<String> values) {
            addCriterion("PersonCode not in", values, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeBetween(String value1, String value2) {
            addCriterion("PersonCode between", value1, value2, "personcode");
            return (Criteria) this;
        }

        public Criteria andPersoncodeNotBetween(String value1, String value2) {
            addCriterion("PersonCode not between", value1, value2, "personcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeIsNull() {
            addCriterion("CreatorCode is null");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeIsNotNull() {
            addCriterion("CreatorCode is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeEqualTo(String value) {
            addCriterion("CreatorCode =", value, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeNotEqualTo(String value) {
            addCriterion("CreatorCode <>", value, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeGreaterThan(String value) {
            addCriterion("CreatorCode >", value, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CreatorCode >=", value, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeLessThan(String value) {
            addCriterion("CreatorCode <", value, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeLessThanOrEqualTo(String value) {
            addCriterion("CreatorCode <=", value, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeLike(String value) {
            addCriterion("CreatorCode like", value, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeNotLike(String value) {
            addCriterion("CreatorCode not like", value, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeIn(List<String> values) {
            addCriterion("CreatorCode in", values, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeNotIn(List<String> values) {
            addCriterion("CreatorCode not in", values, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeBetween(String value1, String value2) {
            addCriterion("CreatorCode between", value1, value2, "creatorcode");
            return (Criteria) this;
        }

        public Criteria andCreatorcodeNotBetween(String value1, String value2) {
            addCriterion("CreatorCode not between", value1, value2, "creatorcode");
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