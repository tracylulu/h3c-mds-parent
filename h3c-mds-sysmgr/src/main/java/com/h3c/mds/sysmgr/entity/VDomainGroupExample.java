package com.h3c.mds.sysmgr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VDomainGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VDomainGroupExample() {
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

        public Criteria andDgidIsNull() {
            addCriterion("DGID is null");
            return (Criteria) this;
        }

        public Criteria andDgidIsNotNull() {
            addCriterion("DGID is not null");
            return (Criteria) this;
        }

        public Criteria andDgidEqualTo(Integer value) {
            addCriterion("DGID =", value, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidNotEqualTo(Integer value) {
            addCriterion("DGID <>", value, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidGreaterThan(Integer value) {
            addCriterion("DGID >", value, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DGID >=", value, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidLessThan(Integer value) {
            addCriterion("DGID <", value, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidLessThanOrEqualTo(Integer value) {
            addCriterion("DGID <=", value, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidIn(List<Integer> values) {
            addCriterion("DGID in", values, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidNotIn(List<Integer> values) {
            addCriterion("DGID not in", values, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidBetween(Integer value1, Integer value2) {
            addCriterion("DGID between", value1, value2, "dgid");
            return (Criteria) this;
        }

        public Criteria andDgidNotBetween(Integer value1, Integer value2) {
            addCriterion("DGID not between", value1, value2, "dgid");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("GroupName is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("GroupName is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("GroupName =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("GroupName <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("GroupName >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("GroupName >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("GroupName <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("GroupName <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("GroupName like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("GroupName not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("GroupName in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("GroupName not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("GroupName between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("GroupName not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("AdminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("AdminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("AdminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("AdminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("AdminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("AdminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("AdminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("AdminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("AdminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("AdminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("AdminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("AdminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("AdminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andGroupdescIsNull() {
            addCriterion("GroupDesc is null");
            return (Criteria) this;
        }

        public Criteria andGroupdescIsNotNull() {
            addCriterion("GroupDesc is not null");
            return (Criteria) this;
        }

        public Criteria andGroupdescEqualTo(String value) {
            addCriterion("GroupDesc =", value, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescNotEqualTo(String value) {
            addCriterion("GroupDesc <>", value, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescGreaterThan(String value) {
            addCriterion("GroupDesc >", value, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescGreaterThanOrEqualTo(String value) {
            addCriterion("GroupDesc >=", value, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescLessThan(String value) {
            addCriterion("GroupDesc <", value, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescLessThanOrEqualTo(String value) {
            addCriterion("GroupDesc <=", value, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescLike(String value) {
            addCriterion("GroupDesc like", value, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescNotLike(String value) {
            addCriterion("GroupDesc not like", value, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescIn(List<String> values) {
            addCriterion("GroupDesc in", values, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescNotIn(List<String> values) {
            addCriterion("GroupDesc not in", values, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescBetween(String value1, String value2) {
            addCriterion("GroupDesc between", value1, value2, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andGroupdescNotBetween(String value1, String value2) {
            addCriterion("GroupDesc not between", value1, value2, "groupdesc");
            return (Criteria) this;
        }

        public Criteria andSynctimeIsNull() {
            addCriterion("SyncTime is null");
            return (Criteria) this;
        }

        public Criteria andSynctimeIsNotNull() {
            addCriterion("SyncTime is not null");
            return (Criteria) this;
        }

        public Criteria andSynctimeEqualTo(Date value) {
            addCriterion("SyncTime =", value, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeNotEqualTo(Date value) {
            addCriterion("SyncTime <>", value, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeGreaterThan(Date value) {
            addCriterion("SyncTime >", value, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SyncTime >=", value, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeLessThan(Date value) {
            addCriterion("SyncTime <", value, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeLessThanOrEqualTo(Date value) {
            addCriterion("SyncTime <=", value, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeIn(List<Date> values) {
            addCriterion("SyncTime in", values, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeNotIn(List<Date> values) {
            addCriterion("SyncTime not in", values, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeBetween(Date value1, Date value2) {
            addCriterion("SyncTime between", value1, value2, "synctime");
            return (Criteria) this;
        }

        public Criteria andSynctimeNotBetween(Date value1, Date value2) {
            addCriterion("SyncTime not between", value1, value2, "synctime");
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