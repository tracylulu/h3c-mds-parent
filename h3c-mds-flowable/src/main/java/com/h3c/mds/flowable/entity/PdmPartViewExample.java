package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.List;

public class PdmPartViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdmPartViewExample() {
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

        public Criteria andResppartyIsNull() {
            addCriterion("RESPPARTY is null");
            return (Criteria) this;
        }

        public Criteria andResppartyIsNotNull() {
            addCriterion("RESPPARTY is not null");
            return (Criteria) this;
        }

        public Criteria andResppartyEqualTo(String value) {
            addCriterion("RESPPARTY =", value, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyNotEqualTo(String value) {
            addCriterion("RESPPARTY <>", value, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyGreaterThan(String value) {
            addCriterion("RESPPARTY >", value, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyGreaterThanOrEqualTo(String value) {
            addCriterion("RESPPARTY >=", value, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyLessThan(String value) {
            addCriterion("RESPPARTY <", value, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyLessThanOrEqualTo(String value) {
            addCriterion("RESPPARTY <=", value, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyLike(String value) {
            addCriterion("RESPPARTY like", value, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyNotLike(String value) {
            addCriterion("RESPPARTY not like", value, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyIn(List<String> values) {
            addCriterion("RESPPARTY in", values, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyNotIn(List<String> values) {
            addCriterion("RESPPARTY not in", values, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyBetween(String value1, String value2) {
            addCriterion("RESPPARTY between", value1, value2, "respparty");
            return (Criteria) this;
        }

        public Criteria andResppartyNotBetween(String value1, String value2) {
            addCriterion("RESPPARTY not between", value1, value2, "respparty");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptIsNull() {
            addCriterion("H3SECONDLEVELDEPT is null");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptIsNotNull() {
            addCriterion("H3SECONDLEVELDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptEqualTo(String value) {
            addCriterion("H3SECONDLEVELDEPT =", value, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptNotEqualTo(String value) {
            addCriterion("H3SECONDLEVELDEPT <>", value, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptGreaterThan(String value) {
            addCriterion("H3SECONDLEVELDEPT >", value, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptGreaterThanOrEqualTo(String value) {
            addCriterion("H3SECONDLEVELDEPT >=", value, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptLessThan(String value) {
            addCriterion("H3SECONDLEVELDEPT <", value, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptLessThanOrEqualTo(String value) {
            addCriterion("H3SECONDLEVELDEPT <=", value, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptLike(String value) {
            addCriterion("H3SECONDLEVELDEPT like", value, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptNotLike(String value) {
            addCriterion("H3SECONDLEVELDEPT not like", value, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptIn(List<String> values) {
            addCriterion("H3SECONDLEVELDEPT in", values, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptNotIn(List<String> values) {
            addCriterion("H3SECONDLEVELDEPT not in", values, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptBetween(String value1, String value2) {
            addCriterion("H3SECONDLEVELDEPT between", value1, value2, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andH3secondleveldeptNotBetween(String value1, String value2) {
            addCriterion("H3SECONDLEVELDEPT not between", value1, value2, "h3secondleveldept");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumIsNull() {
            addCriterion("S1CONTACTPHONENUM is null");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumIsNotNull() {
            addCriterion("S1CONTACTPHONENUM is not null");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumEqualTo(String value) {
            addCriterion("S1CONTACTPHONENUM =", value, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumNotEqualTo(String value) {
            addCriterion("S1CONTACTPHONENUM <>", value, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumGreaterThan(String value) {
            addCriterion("S1CONTACTPHONENUM >", value, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumGreaterThanOrEqualTo(String value) {
            addCriterion("S1CONTACTPHONENUM >=", value, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumLessThan(String value) {
            addCriterion("S1CONTACTPHONENUM <", value, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumLessThanOrEqualTo(String value) {
            addCriterion("S1CONTACTPHONENUM <=", value, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumLike(String value) {
            addCriterion("S1CONTACTPHONENUM like", value, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumNotLike(String value) {
            addCriterion("S1CONTACTPHONENUM not like", value, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumIn(List<String> values) {
            addCriterion("S1CONTACTPHONENUM in", values, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumNotIn(List<String> values) {
            addCriterion("S1CONTACTPHONENUM not in", values, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumBetween(String value1, String value2) {
            addCriterion("S1CONTACTPHONENUM between", value1, value2, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andS1contactphonenumNotBetween(String value1, String value2) {
            addCriterion("S1CONTACTPHONENUM not between", value1, value2, "s1contactphonenum");
            return (Criteria) this;
        }

        public Criteria andDocumentnameIsNull() {
            addCriterion("DOCUMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDocumentnameIsNotNull() {
            addCriterion("DOCUMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentnameEqualTo(String value) {
            addCriterion("DOCUMENTNAME =", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameNotEqualTo(String value) {
            addCriterion("DOCUMENTNAME <>", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameGreaterThan(String value) {
            addCriterion("DOCUMENTNAME >", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTNAME >=", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameLessThan(String value) {
            addCriterion("DOCUMENTNAME <", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTNAME <=", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameLike(String value) {
            addCriterion("DOCUMENTNAME like", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameNotLike(String value) {
            addCriterion("DOCUMENTNAME not like", value, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameIn(List<String> values) {
            addCriterion("DOCUMENTNAME in", values, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameNotIn(List<String> values) {
            addCriterion("DOCUMENTNAME not in", values, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameBetween(String value1, String value2) {
            addCriterion("DOCUMENTNAME between", value1, value2, "documentname");
            return (Criteria) this;
        }

        public Criteria andDocumentnameNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTNAME not between", value1, value2, "documentname");
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