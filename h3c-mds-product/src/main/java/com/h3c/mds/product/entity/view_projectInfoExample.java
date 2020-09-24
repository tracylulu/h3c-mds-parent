package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.List;

public class view_projectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public view_projectInfoExample() {
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

        public Criteria andProjectnoIsNull() {
            addCriterion("PROJECTNo is null");
            return (Criteria) this;
        }

        public Criteria andProjectnoIsNotNull() {
            addCriterion("PROJECTNo is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnoEqualTo(String value) {
            addCriterion("PROJECTNo =", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotEqualTo(String value) {
            addCriterion("PROJECTNo <>", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoGreaterThan(String value) {
            addCriterion("PROJECTNo >", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTNo >=", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLessThan(String value) {
            addCriterion("PROJECTNo <", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLessThanOrEqualTo(String value) {
            addCriterion("PROJECTNo <=", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoLike(String value) {
            addCriterion("PROJECTNo like", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotLike(String value) {
            addCriterion("PROJECTNo not like", value, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoIn(List<String> values) {
            addCriterion("PROJECTNo in", values, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotIn(List<String> values) {
            addCriterion("PROJECTNo not in", values, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoBetween(String value1, String value2) {
            addCriterion("PROJECTNo between", value1, value2, "projectno");
            return (Criteria) this;
        }

        public Criteria andProjectnoNotBetween(String value1, String value2) {
            addCriterion("PROJECTNo not between", value1, value2, "projectno");
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

        public Criteria andProjectIsNull() {
            addCriterion("PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("PROJECT =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("PROJECT <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("PROJECT >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("PROJECT <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("PROJECT <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("PROJECT like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("PROJECT not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("PROJECT in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("PROJECT not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("PROJECT between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("PROJECT not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andEngprojectIsNull() {
            addCriterion("engPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andEngprojectIsNotNull() {
            addCriterion("engPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andEngprojectEqualTo(String value) {
            addCriterion("engPROJECT =", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotEqualTo(String value) {
            addCriterion("engPROJECT <>", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectGreaterThan(String value) {
            addCriterion("engPROJECT >", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectGreaterThanOrEqualTo(String value) {
            addCriterion("engPROJECT >=", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLessThan(String value) {
            addCriterion("engPROJECT <", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLessThanOrEqualTo(String value) {
            addCriterion("engPROJECT <=", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectLike(String value) {
            addCriterion("engPROJECT like", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotLike(String value) {
            addCriterion("engPROJECT not like", value, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectIn(List<String> values) {
            addCriterion("engPROJECT in", values, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotIn(List<String> values) {
            addCriterion("engPROJECT not in", values, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectBetween(String value1, String value2) {
            addCriterion("engPROJECT between", value1, value2, "engproject");
            return (Criteria) this;
        }

        public Criteria andEngprojectNotBetween(String value1, String value2) {
            addCriterion("engPROJECT not between", value1, value2, "engproject");
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