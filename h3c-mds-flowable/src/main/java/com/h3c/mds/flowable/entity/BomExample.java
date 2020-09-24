package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BomExample() {
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

        public Criteria andObidIsNull() {
            addCriterion("OBID is null");
            return (Criteria) this;
        }

        public Criteria andObidIsNotNull() {
            addCriterion("OBID is not null");
            return (Criteria) this;
        }

        public Criteria andObidEqualTo(String value) {
            addCriterion("OBID =", value, "obid");
            return (Criteria) this;
        }

        public Criteria andObidNotEqualTo(String value) {
            addCriterion("OBID <>", value, "obid");
            return (Criteria) this;
        }

        public Criteria andObidGreaterThan(String value) {
            addCriterion("OBID >", value, "obid");
            return (Criteria) this;
        }

        public Criteria andObidGreaterThanOrEqualTo(String value) {
            addCriterion("OBID >=", value, "obid");
            return (Criteria) this;
        }

        public Criteria andObidLessThan(String value) {
            addCriterion("OBID <", value, "obid");
            return (Criteria) this;
        }

        public Criteria andObidLessThanOrEqualTo(String value) {
            addCriterion("OBID <=", value, "obid");
            return (Criteria) this;
        }

        public Criteria andObidLike(String value) {
            addCriterion("OBID like", value, "obid");
            return (Criteria) this;
        }

        public Criteria andObidNotLike(String value) {
            addCriterion("OBID not like", value, "obid");
            return (Criteria) this;
        }

        public Criteria andObidIn(List<String> values) {
            addCriterion("OBID in", values, "obid");
            return (Criteria) this;
        }

        public Criteria andObidNotIn(List<String> values) {
            addCriterion("OBID not in", values, "obid");
            return (Criteria) this;
        }

        public Criteria andObidBetween(String value1, String value2) {
            addCriterion("OBID between", value1, value2, "obid");
            return (Criteria) this;
        }

        public Criteria andObidNotBetween(String value1, String value2) {
            addCriterion("OBID not between", value1, value2, "obid");
            return (Criteria) this;
        }

        public Criteria andS1partnumberIsNull() {
            addCriterion("S1PARTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andS1partnumberIsNotNull() {
            addCriterion("S1PARTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andS1partnumberEqualTo(String value) {
            addCriterion("S1PARTNUMBER =", value, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberNotEqualTo(String value) {
            addCriterion("S1PARTNUMBER <>", value, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberGreaterThan(String value) {
            addCriterion("S1PARTNUMBER >", value, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberGreaterThanOrEqualTo(String value) {
            addCriterion("S1PARTNUMBER >=", value, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberLessThan(String value) {
            addCriterion("S1PARTNUMBER <", value, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberLessThanOrEqualTo(String value) {
            addCriterion("S1PARTNUMBER <=", value, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberLike(String value) {
            addCriterion("S1PARTNUMBER like", value, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberNotLike(String value) {
            addCriterion("S1PARTNUMBER not like", value, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberIn(List<String> values) {
            addCriterion("S1PARTNUMBER in", values, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberNotIn(List<String> values) {
            addCriterion("S1PARTNUMBER not in", values, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberBetween(String value1, String value2) {
            addCriterion("S1PARTNUMBER between", value1, value2, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partnumberNotBetween(String value1, String value2) {
            addCriterion("S1PARTNUMBER not between", value1, value2, "s1partnumber");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionIsNull() {
            addCriterion("S1PARTREVISION is null");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionIsNotNull() {
            addCriterion("S1PARTREVISION is not null");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionEqualTo(String value) {
            addCriterion("S1PARTREVISION =", value, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionNotEqualTo(String value) {
            addCriterion("S1PARTREVISION <>", value, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionGreaterThan(String value) {
            addCriterion("S1PARTREVISION >", value, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionGreaterThanOrEqualTo(String value) {
            addCriterion("S1PARTREVISION >=", value, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionLessThan(String value) {
            addCriterion("S1PARTREVISION <", value, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionLessThanOrEqualTo(String value) {
            addCriterion("S1PARTREVISION <=", value, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionLike(String value) {
            addCriterion("S1PARTREVISION like", value, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionNotLike(String value) {
            addCriterion("S1PARTREVISION not like", value, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionIn(List<String> values) {
            addCriterion("S1PARTREVISION in", values, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionNotIn(List<String> values) {
            addCriterion("S1PARTREVISION not in", values, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionBetween(String value1, String value2) {
            addCriterion("S1PARTREVISION between", value1, value2, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1partrevisionNotBetween(String value1, String value2) {
            addCriterion("S1PARTREVISION not between", value1, value2, "s1partrevision");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateIsNull() {
            addCriterion("S1PARTTEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateIsNotNull() {
            addCriterion("S1PARTTEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateEqualTo(String value) {
            addCriterion("S1PARTTEMPLATE =", value, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateNotEqualTo(String value) {
            addCriterion("S1PARTTEMPLATE <>", value, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateGreaterThan(String value) {
            addCriterion("S1PARTTEMPLATE >", value, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateGreaterThanOrEqualTo(String value) {
            addCriterion("S1PARTTEMPLATE >=", value, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateLessThan(String value) {
            addCriterion("S1PARTTEMPLATE <", value, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateLessThanOrEqualTo(String value) {
            addCriterion("S1PARTTEMPLATE <=", value, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateLike(String value) {
            addCriterion("S1PARTTEMPLATE like", value, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateNotLike(String value) {
            addCriterion("S1PARTTEMPLATE not like", value, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateIn(List<String> values) {
            addCriterion("S1PARTTEMPLATE in", values, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateNotIn(List<String> values) {
            addCriterion("S1PARTTEMPLATE not in", values, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateBetween(String value1, String value2) {
            addCriterion("S1PARTTEMPLATE between", value1, value2, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andS1parttemplateNotBetween(String value1, String value2) {
            addCriterion("S1PARTTEMPLATE not between", value1, value2, "s1parttemplate");
            return (Criteria) this;
        }

        public Criteria andThhxhIsNull() {
            addCriterion("THHXH is null");
            return (Criteria) this;
        }

        public Criteria andThhxhIsNotNull() {
            addCriterion("THHXH is not null");
            return (Criteria) this;
        }

        public Criteria andThhxhEqualTo(String value) {
            addCriterion("THHXH =", value, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhNotEqualTo(String value) {
            addCriterion("THHXH <>", value, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhGreaterThan(String value) {
            addCriterion("THHXH >", value, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhGreaterThanOrEqualTo(String value) {
            addCriterion("THHXH >=", value, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhLessThan(String value) {
            addCriterion("THHXH <", value, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhLessThanOrEqualTo(String value) {
            addCriterion("THHXH <=", value, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhLike(String value) {
            addCriterion("THHXH like", value, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhNotLike(String value) {
            addCriterion("THHXH not like", value, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhIn(List<String> values) {
            addCriterion("THHXH in", values, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhNotIn(List<String> values) {
            addCriterion("THHXH not in", values, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhBetween(String value1, String value2) {
            addCriterion("THHXH between", value1, value2, "thhxh");
            return (Criteria) this;
        }

        public Criteria andThhxhNotBetween(String value1, String value2) {
            addCriterion("THHXH not between", value1, value2, "thhxh");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsIsNull() {
            addCriterion("S1PARTDESCELEMENTS is null");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsIsNotNull() {
            addCriterion("S1PARTDESCELEMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsEqualTo(String value) {
            addCriterion("S1PARTDESCELEMENTS =", value, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsNotEqualTo(String value) {
            addCriterion("S1PARTDESCELEMENTS <>", value, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsGreaterThan(String value) {
            addCriterion("S1PARTDESCELEMENTS >", value, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsGreaterThanOrEqualTo(String value) {
            addCriterion("S1PARTDESCELEMENTS >=", value, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsLessThan(String value) {
            addCriterion("S1PARTDESCELEMENTS <", value, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsLessThanOrEqualTo(String value) {
            addCriterion("S1PARTDESCELEMENTS <=", value, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsLike(String value) {
            addCriterion("S1PARTDESCELEMENTS like", value, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsNotLike(String value) {
            addCriterion("S1PARTDESCELEMENTS not like", value, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsIn(List<String> values) {
            addCriterion("S1PARTDESCELEMENTS in", values, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsNotIn(List<String> values) {
            addCriterion("S1PARTDESCELEMENTS not in", values, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsBetween(String value1, String value2) {
            addCriterion("S1PARTDESCELEMENTS between", value1, value2, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1partdescelementsNotBetween(String value1, String value2) {
            addCriterion("S1PARTDESCELEMENTS not between", value1, value2, "s1partdescelements");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescIsNull() {
            addCriterion("S1EXTCHINESEDESC is null");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescIsNotNull() {
            addCriterion("S1EXTCHINESEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescEqualTo(String value) {
            addCriterion("S1EXTCHINESEDESC =", value, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescNotEqualTo(String value) {
            addCriterion("S1EXTCHINESEDESC <>", value, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescGreaterThan(String value) {
            addCriterion("S1EXTCHINESEDESC >", value, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescGreaterThanOrEqualTo(String value) {
            addCriterion("S1EXTCHINESEDESC >=", value, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescLessThan(String value) {
            addCriterion("S1EXTCHINESEDESC <", value, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescLessThanOrEqualTo(String value) {
            addCriterion("S1EXTCHINESEDESC <=", value, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescLike(String value) {
            addCriterion("S1EXTCHINESEDESC like", value, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescNotLike(String value) {
            addCriterion("S1EXTCHINESEDESC not like", value, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescIn(List<String> values) {
            addCriterion("S1EXTCHINESEDESC in", values, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescNotIn(List<String> values) {
            addCriterion("S1EXTCHINESEDESC not in", values, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescBetween(String value1, String value2) {
            addCriterion("S1EXTCHINESEDESC between", value1, value2, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1extchinesedescNotBetween(String value1, String value2) {
            addCriterion("S1EXTCHINESEDESC not between", value1, value2, "s1extchinesedesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescIsNull() {
            addCriterion("S1INTENGLISHDESC is null");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescIsNotNull() {
            addCriterion("S1INTENGLISHDESC is not null");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescEqualTo(String value) {
            addCriterion("S1INTENGLISHDESC =", value, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescNotEqualTo(String value) {
            addCriterion("S1INTENGLISHDESC <>", value, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescGreaterThan(String value) {
            addCriterion("S1INTENGLISHDESC >", value, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescGreaterThanOrEqualTo(String value) {
            addCriterion("S1INTENGLISHDESC >=", value, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescLessThan(String value) {
            addCriterion("S1INTENGLISHDESC <", value, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescLessThanOrEqualTo(String value) {
            addCriterion("S1INTENGLISHDESC <=", value, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescLike(String value) {
            addCriterion("S1INTENGLISHDESC like", value, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescNotLike(String value) {
            addCriterion("S1INTENGLISHDESC not like", value, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescIn(List<String> values) {
            addCriterion("S1INTENGLISHDESC in", values, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescNotIn(List<String> values) {
            addCriterion("S1INTENGLISHDESC not in", values, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescBetween(String value1, String value2) {
            addCriterion("S1INTENGLISHDESC between", value1, value2, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1intenglishdescNotBetween(String value1, String value2) {
            addCriterion("S1INTENGLISHDESC not between", value1, value2, "s1intenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescIsNull() {
            addCriterion("S1EXTENGLISHDESC is null");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescIsNotNull() {
            addCriterion("S1EXTENGLISHDESC is not null");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescEqualTo(String value) {
            addCriterion("S1EXTENGLISHDESC =", value, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescNotEqualTo(String value) {
            addCriterion("S1EXTENGLISHDESC <>", value, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescGreaterThan(String value) {
            addCriterion("S1EXTENGLISHDESC >", value, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescGreaterThanOrEqualTo(String value) {
            addCriterion("S1EXTENGLISHDESC >=", value, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescLessThan(String value) {
            addCriterion("S1EXTENGLISHDESC <", value, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescLessThanOrEqualTo(String value) {
            addCriterion("S1EXTENGLISHDESC <=", value, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescLike(String value) {
            addCriterion("S1EXTENGLISHDESC like", value, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescNotLike(String value) {
            addCriterion("S1EXTENGLISHDESC not like", value, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescIn(List<String> values) {
            addCriterion("S1EXTENGLISHDESC in", values, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescNotIn(List<String> values) {
            addCriterion("S1EXTENGLISHDESC not in", values, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescBetween(String value1, String value2) {
            addCriterion("S1EXTENGLISHDESC between", value1, value2, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1extenglishdescNotBetween(String value1, String value2) {
            addCriterion("S1EXTENGLISHDESC not between", value1, value2, "s1extenglishdesc");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelIsNull() {
            addCriterion("S1INTERNALMODEL is null");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelIsNotNull() {
            addCriterion("S1INTERNALMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelEqualTo(String value) {
            addCriterion("S1INTERNALMODEL =", value, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelNotEqualTo(String value) {
            addCriterion("S1INTERNALMODEL <>", value, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelGreaterThan(String value) {
            addCriterion("S1INTERNALMODEL >", value, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelGreaterThanOrEqualTo(String value) {
            addCriterion("S1INTERNALMODEL >=", value, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelLessThan(String value) {
            addCriterion("S1INTERNALMODEL <", value, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelLessThanOrEqualTo(String value) {
            addCriterion("S1INTERNALMODEL <=", value, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelLike(String value) {
            addCriterion("S1INTERNALMODEL like", value, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelNotLike(String value) {
            addCriterion("S1INTERNALMODEL not like", value, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelIn(List<String> values) {
            addCriterion("S1INTERNALMODEL in", values, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelNotIn(List<String> values) {
            addCriterion("S1INTERNALMODEL not in", values, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelBetween(String value1, String value2) {
            addCriterion("S1INTERNALMODEL between", value1, value2, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1internalmodelNotBetween(String value1, String value2) {
            addCriterion("S1INTERNALMODEL not between", value1, value2, "s1internalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelIsNull() {
            addCriterion("S1EXTERNALMODEL is null");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelIsNotNull() {
            addCriterion("S1EXTERNALMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelEqualTo(String value) {
            addCriterion("S1EXTERNALMODEL =", value, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelNotEqualTo(String value) {
            addCriterion("S1EXTERNALMODEL <>", value, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelGreaterThan(String value) {
            addCriterion("S1EXTERNALMODEL >", value, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelGreaterThanOrEqualTo(String value) {
            addCriterion("S1EXTERNALMODEL >=", value, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelLessThan(String value) {
            addCriterion("S1EXTERNALMODEL <", value, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelLessThanOrEqualTo(String value) {
            addCriterion("S1EXTERNALMODEL <=", value, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelLike(String value) {
            addCriterion("S1EXTERNALMODEL like", value, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelNotLike(String value) {
            addCriterion("S1EXTERNALMODEL not like", value, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelIn(List<String> values) {
            addCriterion("S1EXTERNALMODEL in", values, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelNotIn(List<String> values) {
            addCriterion("S1EXTERNALMODEL not in", values, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelBetween(String value1, String value2) {
            addCriterion("S1EXTERNALMODEL between", value1, value2, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andS1externalmodelNotBetween(String value1, String value2) {
            addCriterion("S1EXTERNALMODEL not between", value1, value2, "s1externalmodel");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureIsNull() {
            addCriterion("DEFAULTUNITOFMEASURE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureIsNotNull() {
            addCriterion("DEFAULTUNITOFMEASURE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureEqualTo(String value) {
            addCriterion("DEFAULTUNITOFMEASURE =", value, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureNotEqualTo(String value) {
            addCriterion("DEFAULTUNITOFMEASURE <>", value, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureGreaterThan(String value) {
            addCriterion("DEFAULTUNITOFMEASURE >", value, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULTUNITOFMEASURE >=", value, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureLessThan(String value) {
            addCriterion("DEFAULTUNITOFMEASURE <", value, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureLessThanOrEqualTo(String value) {
            addCriterion("DEFAULTUNITOFMEASURE <=", value, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureLike(String value) {
            addCriterion("DEFAULTUNITOFMEASURE like", value, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureNotLike(String value) {
            addCriterion("DEFAULTUNITOFMEASURE not like", value, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureIn(List<String> values) {
            addCriterion("DEFAULTUNITOFMEASURE in", values, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureNotIn(List<String> values) {
            addCriterion("DEFAULTUNITOFMEASURE not in", values, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureBetween(String value1, String value2) {
            addCriterion("DEFAULTUNITOFMEASURE between", value1, value2, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andDefaultunitofmeasureNotBetween(String value1, String value2) {
            addCriterion("DEFAULTUNITOFMEASURE not between", value1, value2, "defaultunitofmeasure");
            return (Criteria) this;
        }

        public Criteria andS1partstatusIsNull() {
            addCriterion("S1PARTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andS1partstatusIsNotNull() {
            addCriterion("S1PARTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andS1partstatusEqualTo(String value) {
            addCriterion("S1PARTSTATUS =", value, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusNotEqualTo(String value) {
            addCriterion("S1PARTSTATUS <>", value, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusGreaterThan(String value) {
            addCriterion("S1PARTSTATUS >", value, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusGreaterThanOrEqualTo(String value) {
            addCriterion("S1PARTSTATUS >=", value, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusLessThan(String value) {
            addCriterion("S1PARTSTATUS <", value, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusLessThanOrEqualTo(String value) {
            addCriterion("S1PARTSTATUS <=", value, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusLike(String value) {
            addCriterion("S1PARTSTATUS like", value, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusNotLike(String value) {
            addCriterion("S1PARTSTATUS not like", value, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusIn(List<String> values) {
            addCriterion("S1PARTSTATUS in", values, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusNotIn(List<String> values) {
            addCriterion("S1PARTSTATUS not in", values, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusBetween(String value1, String value2) {
            addCriterion("S1PARTSTATUS between", value1, value2, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andS1partstatusNotBetween(String value1, String value2) {
            addCriterion("S1PARTSTATUS not between", value1, value2, "s1partstatus");
            return (Criteria) this;
        }

        public Criteria andH3productlineIsNull() {
            addCriterion("H3PRODUCTLINE is null");
            return (Criteria) this;
        }

        public Criteria andH3productlineIsNotNull() {
            addCriterion("H3PRODUCTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andH3productlineEqualTo(String value) {
            addCriterion("H3PRODUCTLINE =", value, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineNotEqualTo(String value) {
            addCriterion("H3PRODUCTLINE <>", value, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineGreaterThan(String value) {
            addCriterion("H3PRODUCTLINE >", value, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineGreaterThanOrEqualTo(String value) {
            addCriterion("H3PRODUCTLINE >=", value, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineLessThan(String value) {
            addCriterion("H3PRODUCTLINE <", value, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineLessThanOrEqualTo(String value) {
            addCriterion("H3PRODUCTLINE <=", value, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineLike(String value) {
            addCriterion("H3PRODUCTLINE like", value, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineNotLike(String value) {
            addCriterion("H3PRODUCTLINE not like", value, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineIn(List<String> values) {
            addCriterion("H3PRODUCTLINE in", values, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineNotIn(List<String> values) {
            addCriterion("H3PRODUCTLINE not in", values, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineBetween(String value1, String value2) {
            addCriterion("H3PRODUCTLINE between", value1, value2, "h3productline");
            return (Criteria) this;
        }

        public Criteria andH3productlineNotBetween(String value1, String value2) {
            addCriterion("H3PRODUCTLINE not between", value1, value2, "h3productline");
            return (Criteria) this;
        }

        public Criteria andS2productpdtIsNull() {
            addCriterion("S2PRODUCTPDT is null");
            return (Criteria) this;
        }

        public Criteria andS2productpdtIsNotNull() {
            addCriterion("S2PRODUCTPDT is not null");
            return (Criteria) this;
        }

        public Criteria andS2productpdtEqualTo(String value) {
            addCriterion("S2PRODUCTPDT =", value, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtNotEqualTo(String value) {
            addCriterion("S2PRODUCTPDT <>", value, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtGreaterThan(String value) {
            addCriterion("S2PRODUCTPDT >", value, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtGreaterThanOrEqualTo(String value) {
            addCriterion("S2PRODUCTPDT >=", value, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtLessThan(String value) {
            addCriterion("S2PRODUCTPDT <", value, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtLessThanOrEqualTo(String value) {
            addCriterion("S2PRODUCTPDT <=", value, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtLike(String value) {
            addCriterion("S2PRODUCTPDT like", value, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtNotLike(String value) {
            addCriterion("S2PRODUCTPDT not like", value, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtIn(List<String> values) {
            addCriterion("S2PRODUCTPDT in", values, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtNotIn(List<String> values) {
            addCriterion("S2PRODUCTPDT not in", values, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtBetween(String value1, String value2) {
            addCriterion("S2PRODUCTPDT between", value1, value2, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andS2productpdtNotBetween(String value1, String value2) {
            addCriterion("S2PRODUCTPDT not between", value1, value2, "s2productpdt");
            return (Criteria) this;
        }

        public Criteria andH3productIsNull() {
            addCriterion("H3PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andH3productIsNotNull() {
            addCriterion("H3PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andH3productEqualTo(String value) {
            addCriterion("H3PRODUCT =", value, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productNotEqualTo(String value) {
            addCriterion("H3PRODUCT <>", value, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productGreaterThan(String value) {
            addCriterion("H3PRODUCT >", value, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productGreaterThanOrEqualTo(String value) {
            addCriterion("H3PRODUCT >=", value, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productLessThan(String value) {
            addCriterion("H3PRODUCT <", value, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productLessThanOrEqualTo(String value) {
            addCriterion("H3PRODUCT <=", value, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productLike(String value) {
            addCriterion("H3PRODUCT like", value, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productNotLike(String value) {
            addCriterion("H3PRODUCT not like", value, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productIn(List<String> values) {
            addCriterion("H3PRODUCT in", values, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productNotIn(List<String> values) {
            addCriterion("H3PRODUCT not in", values, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productBetween(String value1, String value2) {
            addCriterion("H3PRODUCT between", value1, value2, "h3product");
            return (Criteria) this;
        }

        public Criteria andH3productNotBetween(String value1, String value2) {
            addCriterion("H3PRODUCT not between", value1, value2, "h3product");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("PROJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("PROJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("PROJECTNAME =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("PROJECTNAME <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("PROJECTNAME >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTNAME >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("PROJECTNAME <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("PROJECTNAME <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("PROJECTNAME like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("PROJECTNAME not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("PROJECTNAME in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("PROJECTNAME not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("PROJECTNAME between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("PROJECTNAME not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionIsNull() {
            addCriterion("H3PRODUCTRREVISION is null");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionIsNotNull() {
            addCriterion("H3PRODUCTRREVISION is not null");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionEqualTo(String value) {
            addCriterion("H3PRODUCTRREVISION =", value, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionNotEqualTo(String value) {
            addCriterion("H3PRODUCTRREVISION <>", value, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionGreaterThan(String value) {
            addCriterion("H3PRODUCTRREVISION >", value, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionGreaterThanOrEqualTo(String value) {
            addCriterion("H3PRODUCTRREVISION >=", value, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionLessThan(String value) {
            addCriterion("H3PRODUCTRREVISION <", value, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionLessThanOrEqualTo(String value) {
            addCriterion("H3PRODUCTRREVISION <=", value, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionLike(String value) {
            addCriterion("H3PRODUCTRREVISION like", value, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionNotLike(String value) {
            addCriterion("H3PRODUCTRREVISION not like", value, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionIn(List<String> values) {
            addCriterion("H3PRODUCTRREVISION in", values, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionNotIn(List<String> values) {
            addCriterion("H3PRODUCTRREVISION not in", values, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionBetween(String value1, String value2) {
            addCriterion("H3PRODUCTRREVISION between", value1, value2, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productrrevisionNotBetween(String value1, String value2) {
            addCriterion("H3PRODUCTRREVISION not between", value1, value2, "h3productrrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionIsNull() {
            addCriterion("H3PRODUCTBREVISION is null");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionIsNotNull() {
            addCriterion("H3PRODUCTBREVISION is not null");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionEqualTo(String value) {
            addCriterion("H3PRODUCTBREVISION =", value, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionNotEqualTo(String value) {
            addCriterion("H3PRODUCTBREVISION <>", value, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionGreaterThan(String value) {
            addCriterion("H3PRODUCTBREVISION >", value, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionGreaterThanOrEqualTo(String value) {
            addCriterion("H3PRODUCTBREVISION >=", value, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionLessThan(String value) {
            addCriterion("H3PRODUCTBREVISION <", value, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionLessThanOrEqualTo(String value) {
            addCriterion("H3PRODUCTBREVISION <=", value, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionLike(String value) {
            addCriterion("H3PRODUCTBREVISION like", value, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionNotLike(String value) {
            addCriterion("H3PRODUCTBREVISION not like", value, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionIn(List<String> values) {
            addCriterion("H3PRODUCTBREVISION in", values, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionNotIn(List<String> values) {
            addCriterion("H3PRODUCTBREVISION not in", values, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionBetween(String value1, String value2) {
            addCriterion("H3PRODUCTBREVISION between", value1, value2, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andH3productbrevisionNotBetween(String value1, String value2) {
            addCriterion("H3PRODUCTBREVISION not between", value1, value2, "h3productbrevision");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendIsNull() {
            addCriterion("S2ISALLOWSEND is null");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendIsNotNull() {
            addCriterion("S2ISALLOWSEND is not null");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendEqualTo(String value) {
            addCriterion("S2ISALLOWSEND =", value, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendNotEqualTo(String value) {
            addCriterion("S2ISALLOWSEND <>", value, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendGreaterThan(String value) {
            addCriterion("S2ISALLOWSEND >", value, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendGreaterThanOrEqualTo(String value) {
            addCriterion("S2ISALLOWSEND >=", value, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendLessThan(String value) {
            addCriterion("S2ISALLOWSEND <", value, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendLessThanOrEqualTo(String value) {
            addCriterion("S2ISALLOWSEND <=", value, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendLike(String value) {
            addCriterion("S2ISALLOWSEND like", value, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendNotLike(String value) {
            addCriterion("S2ISALLOWSEND not like", value, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendIn(List<String> values) {
            addCriterion("S2ISALLOWSEND in", values, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendNotIn(List<String> values) {
            addCriterion("S2ISALLOWSEND not in", values, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendBetween(String value1, String value2) {
            addCriterion("S2ISALLOWSEND between", value1, value2, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andS2isallowsendNotBetween(String value1, String value2) {
            addCriterion("S2ISALLOWSEND not between", value1, value2, "s2isallowsend");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateIsNull() {
            addCriterion("TZ_ACTUALRELDATE is null");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateIsNotNull() {
            addCriterion("TZ_ACTUALRELDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateEqualTo(Date value) {
            addCriterion("TZ_ACTUALRELDATE =", value, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateNotEqualTo(Date value) {
            addCriterion("TZ_ACTUALRELDATE <>", value, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateGreaterThan(Date value) {
            addCriterion("TZ_ACTUALRELDATE >", value, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateGreaterThanOrEqualTo(Date value) {
            addCriterion("TZ_ACTUALRELDATE >=", value, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateLessThan(Date value) {
            addCriterion("TZ_ACTUALRELDATE <", value, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateLessThanOrEqualTo(Date value) {
            addCriterion("TZ_ACTUALRELDATE <=", value, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateIn(List<Date> values) {
            addCriterion("TZ_ACTUALRELDATE in", values, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateNotIn(List<Date> values) {
            addCriterion("TZ_ACTUALRELDATE not in", values, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateBetween(Date value1, Date value2) {
            addCriterion("TZ_ACTUALRELDATE between", value1, value2, "tzActualreldate");
            return (Criteria) this;
        }

        public Criteria andTzActualreldateNotBetween(Date value1, Date value2) {
            addCriterion("TZ_ACTUALRELDATE not between", value1, value2, "tzActualreldate");
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