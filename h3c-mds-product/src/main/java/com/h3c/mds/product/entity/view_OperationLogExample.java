package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class view_OperationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public view_OperationLogExample() {
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

        public Criteria andOpttypeIsNull() {
            addCriterion("OptType is null");
            return (Criteria) this;
        }

        public Criteria andOpttypeIsNotNull() {
            addCriterion("OptType is not null");
            return (Criteria) this;
        }

        public Criteria andOpttypeEqualTo(String value) {
            addCriterion("OptType =", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotEqualTo(String value) {
            addCriterion("OptType <>", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeGreaterThan(String value) {
            addCriterion("OptType >", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeGreaterThanOrEqualTo(String value) {
            addCriterion("OptType >=", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLessThan(String value) {
            addCriterion("OptType <", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLessThanOrEqualTo(String value) {
            addCriterion("OptType <=", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeLike(String value) {
            addCriterion("OptType like", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotLike(String value) {
            addCriterion("OptType not like", value, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeIn(List<String> values) {
            addCriterion("OptType in", values, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotIn(List<String> values) {
            addCriterion("OptType not in", values, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeBetween(String value1, String value2) {
            addCriterion("OptType between", value1, value2, "opttype");
            return (Criteria) this;
        }

        public Criteria andOpttypeNotBetween(String value1, String value2) {
            addCriterion("OptType not between", value1, value2, "opttype");
            return (Criteria) this;
        }

        public Criteria andOldvalueIsNull() {
            addCriterion("OldValue is null");
            return (Criteria) this;
        }

        public Criteria andOldvalueIsNotNull() {
            addCriterion("OldValue is not null");
            return (Criteria) this;
        }

        public Criteria andOldvalueEqualTo(String value) {
            addCriterion("OldValue =", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotEqualTo(String value) {
            addCriterion("OldValue <>", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueGreaterThan(String value) {
            addCriterion("OldValue >", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueGreaterThanOrEqualTo(String value) {
            addCriterion("OldValue >=", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLessThan(String value) {
            addCriterion("OldValue <", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLessThanOrEqualTo(String value) {
            addCriterion("OldValue <=", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLike(String value) {
            addCriterion("OldValue like", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotLike(String value) {
            addCriterion("OldValue not like", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueIn(List<String> values) {
            addCriterion("OldValue in", values, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotIn(List<String> values) {
            addCriterion("OldValue not in", values, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueBetween(String value1, String value2) {
            addCriterion("OldValue between", value1, value2, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotBetween(String value1, String value2) {
            addCriterion("OldValue not between", value1, value2, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueIsNull() {
            addCriterion("NewValue is null");
            return (Criteria) this;
        }

        public Criteria andNewvalueIsNotNull() {
            addCriterion("NewValue is not null");
            return (Criteria) this;
        }

        public Criteria andNewvalueEqualTo(String value) {
            addCriterion("NewValue =", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotEqualTo(String value) {
            addCriterion("NewValue <>", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueGreaterThan(String value) {
            addCriterion("NewValue >", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueGreaterThanOrEqualTo(String value) {
            addCriterion("NewValue >=", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLessThan(String value) {
            addCriterion("NewValue <", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLessThanOrEqualTo(String value) {
            addCriterion("NewValue <=", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLike(String value) {
            addCriterion("NewValue like", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotLike(String value) {
            addCriterion("NewValue not like", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueIn(List<String> values) {
            addCriterion("NewValue in", values, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotIn(List<String> values) {
            addCriterion("NewValue not in", values, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueBetween(String value1, String value2) {
            addCriterion("NewValue between", value1, value2, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotBetween(String value1, String value2) {
            addCriterion("NewValue not between", value1, value2, "newvalue");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("Operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("Operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("Operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("Operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("Operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("Operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("Operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("Operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("Operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("Operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("Operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("Operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("Operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("Operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOpttimeIsNull() {
            addCriterion("OptTime is null");
            return (Criteria) this;
        }

        public Criteria andOpttimeIsNotNull() {
            addCriterion("OptTime is not null");
            return (Criteria) this;
        }

        public Criteria andOpttimeEqualTo(Date value) {
            addCriterion("OptTime =", value, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeNotEqualTo(Date value) {
            addCriterion("OptTime <>", value, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeGreaterThan(Date value) {
            addCriterion("OptTime >", value, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OptTime >=", value, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeLessThan(Date value) {
            addCriterion("OptTime <", value, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeLessThanOrEqualTo(Date value) {
            addCriterion("OptTime <=", value, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeIn(List<Date> values) {
            addCriterion("OptTime in", values, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeNotIn(List<Date> values) {
            addCriterion("OptTime not in", values, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeBetween(Date value1, Date value2) {
            addCriterion("OptTime between", value1, value2, "opttime");
            return (Criteria) this;
        }

        public Criteria andOpttimeNotBetween(Date value1, Date value2) {
            addCriterion("OptTime not between", value1, value2, "opttime");
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

        public Criteria andOpttypenameIsNull() {
            addCriterion("OptTypeName is null");
            return (Criteria) this;
        }

        public Criteria andOpttypenameIsNotNull() {
            addCriterion("OptTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andOpttypenameEqualTo(String value) {
            addCriterion("OptTypeName =", value, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameNotEqualTo(String value) {
            addCriterion("OptTypeName <>", value, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameGreaterThan(String value) {
            addCriterion("OptTypeName >", value, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameGreaterThanOrEqualTo(String value) {
            addCriterion("OptTypeName >=", value, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameLessThan(String value) {
            addCriterion("OptTypeName <", value, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameLessThanOrEqualTo(String value) {
            addCriterion("OptTypeName <=", value, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameLike(String value) {
            addCriterion("OptTypeName like", value, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameNotLike(String value) {
            addCriterion("OptTypeName not like", value, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameIn(List<String> values) {
            addCriterion("OptTypeName in", values, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameNotIn(List<String> values) {
            addCriterion("OptTypeName not in", values, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameBetween(String value1, String value2) {
            addCriterion("OptTypeName between", value1, value2, "opttypename");
            return (Criteria) this;
        }

        public Criteria andOpttypenameNotBetween(String value1, String value2) {
            addCriterion("OptTypeName not between", value1, value2, "opttypename");
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