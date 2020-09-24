package com.h3c.mds.basicinfo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class view_VRProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public view_VRProcessExample() {
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

        public Criteria andProcessCodeIsNull() {
            addCriterion("Process_Code is null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNotNull() {
            addCriterion("Process_Code is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeEqualTo(String value) {
            addCriterion("Process_Code =", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotEqualTo(String value) {
            addCriterion("Process_Code <>", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThan(String value) {
            addCriterion("Process_Code >", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Process_Code >=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThan(String value) {
            addCriterion("Process_Code <", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThanOrEqualTo(String value) {
            addCriterion("Process_Code <=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLike(String value) {
            addCriterion("Process_Code like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotLike(String value) {
            addCriterion("Process_Code not like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIn(List<String> values) {
            addCriterion("Process_Code in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotIn(List<String> values) {
            addCriterion("Process_Code not in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeBetween(String value1, String value2) {
            addCriterion("Process_Code between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotBetween(String value1, String value2) {
            addCriterion("Process_Code not between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoIsNull() {
            addCriterion("PLIPMTNo is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoIsNotNull() {
            addCriterion("PLIPMTNo is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoEqualTo(String value) {
            addCriterion("PLIPMTNo =", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoNotEqualTo(String value) {
            addCriterion("PLIPMTNo <>", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoGreaterThan(String value) {
            addCriterion("PLIPMTNo >", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMTNo >=", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoLessThan(String value) {
            addCriterion("PLIPMTNo <", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoLessThanOrEqualTo(String value) {
            addCriterion("PLIPMTNo <=", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoLike(String value) {
            addCriterion("PLIPMTNo like", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoNotLike(String value) {
            addCriterion("PLIPMTNo not like", value, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoIn(List<String> values) {
            addCriterion("PLIPMTNo in", values, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoNotIn(List<String> values) {
            addCriterion("PLIPMTNo not in", values, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoBetween(String value1, String value2) {
            addCriterion("PLIPMTNo between", value1, value2, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andPlipmtnoNotBetween(String value1, String value2) {
            addCriterion("PLIPMTNo not between", value1, value2, "plipmtno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIsNull() {
            addCriterion("ProdLineNo is null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIsNotNull() {
            addCriterion("ProdLineNo is not null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoEqualTo(String value) {
            addCriterion("ProdLineNo =", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotEqualTo(String value) {
            addCriterion("ProdLineNo <>", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThan(String value) {
            addCriterion("ProdLineNo >", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("ProdLineNo >=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThan(String value) {
            addCriterion("ProdLineNo <", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThanOrEqualTo(String value) {
            addCriterion("ProdLineNo <=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLike(String value) {
            addCriterion("ProdLineNo like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotLike(String value) {
            addCriterion("ProdLineNo not like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIn(List<String> values) {
            addCriterion("ProdLineNo in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotIn(List<String> values) {
            addCriterion("ProdLineNo not in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoBetween(String value1, String value2) {
            addCriterion("ProdLineNo between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotBetween(String value1, String value2) {
            addCriterion("ProdLineNo not between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("ProductNo is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("ProductNo is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("ProductNo =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("ProductNo <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("ProductNo >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("ProductNo >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("ProductNo <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("ProductNo <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("ProductNo like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("ProductNo not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("ProductNo in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("ProductNo not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("ProductNo between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("ProductNo not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryIsNull() {
            addCriterion("IPMTSecretary is null");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryIsNotNull() {
            addCriterion("IPMTSecretary is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryEqualTo(String value) {
            addCriterion("IPMTSecretary =", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryNotEqualTo(String value) {
            addCriterion("IPMTSecretary <>", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryGreaterThan(String value) {
            addCriterion("IPMTSecretary >", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryGreaterThanOrEqualTo(String value) {
            addCriterion("IPMTSecretary >=", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryLessThan(String value) {
            addCriterion("IPMTSecretary <", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryLessThanOrEqualTo(String value) {
            addCriterion("IPMTSecretary <=", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryLike(String value) {
            addCriterion("IPMTSecretary like", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryNotLike(String value) {
            addCriterion("IPMTSecretary not like", value, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryIn(List<String> values) {
            addCriterion("IPMTSecretary in", values, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryNotIn(List<String> values) {
            addCriterion("IPMTSecretary not in", values, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryBetween(String value1, String value2) {
            addCriterion("IPMTSecretary between", value1, value2, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andIpmtsecretaryNotBetween(String value1, String value2) {
            addCriterion("IPMTSecretary not between", value1, value2, "ipmtsecretary");
            return (Criteria) this;
        }

        public Criteria andNewpvIsNull() {
            addCriterion("NewPV is null");
            return (Criteria) this;
        }

        public Criteria andNewpvIsNotNull() {
            addCriterion("NewPV is not null");
            return (Criteria) this;
        }

        public Criteria andNewpvEqualTo(String value) {
            addCriterion("NewPV =", value, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvNotEqualTo(String value) {
            addCriterion("NewPV <>", value, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvGreaterThan(String value) {
            addCriterion("NewPV >", value, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvGreaterThanOrEqualTo(String value) {
            addCriterion("NewPV >=", value, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvLessThan(String value) {
            addCriterion("NewPV <", value, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvLessThanOrEqualTo(String value) {
            addCriterion("NewPV <=", value, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvLike(String value) {
            addCriterion("NewPV like", value, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvNotLike(String value) {
            addCriterion("NewPV not like", value, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvIn(List<String> values) {
            addCriterion("NewPV in", values, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvNotIn(List<String> values) {
            addCriterion("NewPV not in", values, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvBetween(String value1, String value2) {
            addCriterion("NewPV between", value1, value2, "newpv");
            return (Criteria) this;
        }

        public Criteria andNewpvNotBetween(String value1, String value2) {
            addCriterion("NewPV not between", value1, value2, "newpv");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoIsNull() {
            addCriterion("VersionNewNo is null");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoIsNotNull() {
            addCriterion("VersionNewNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoEqualTo(String value) {
            addCriterion("VersionNewNo =", value, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoNotEqualTo(String value) {
            addCriterion("VersionNewNo <>", value, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoGreaterThan(String value) {
            addCriterion("VersionNewNo >", value, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoGreaterThanOrEqualTo(String value) {
            addCriterion("VersionNewNo >=", value, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoLessThan(String value) {
            addCriterion("VersionNewNo <", value, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoLessThanOrEqualTo(String value) {
            addCriterion("VersionNewNo <=", value, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoLike(String value) {
            addCriterion("VersionNewNo like", value, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoNotLike(String value) {
            addCriterion("VersionNewNo not like", value, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoIn(List<String> values) {
            addCriterion("VersionNewNo in", values, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoNotIn(List<String> values) {
            addCriterion("VersionNewNo not in", values, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoBetween(String value1, String value2) {
            addCriterion("VersionNewNo between", value1, value2, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewnoNotBetween(String value1, String value2) {
            addCriterion("VersionNewNo not between", value1, value2, "versionnewno");
            return (Criteria) this;
        }

        public Criteria andVersionnewIsNull() {
            addCriterion("VersionNew is null");
            return (Criteria) this;
        }

        public Criteria andVersionnewIsNotNull() {
            addCriterion("VersionNew is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnewEqualTo(String value) {
            addCriterion("VersionNew =", value, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewNotEqualTo(String value) {
            addCriterion("VersionNew <>", value, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewGreaterThan(String value) {
            addCriterion("VersionNew >", value, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewGreaterThanOrEqualTo(String value) {
            addCriterion("VersionNew >=", value, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewLessThan(String value) {
            addCriterion("VersionNew <", value, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewLessThanOrEqualTo(String value) {
            addCriterion("VersionNew <=", value, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewLike(String value) {
            addCriterion("VersionNew like", value, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewNotLike(String value) {
            addCriterion("VersionNew not like", value, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewIn(List<String> values) {
            addCriterion("VersionNew in", values, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewNotIn(List<String> values) {
            addCriterion("VersionNew not in", values, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewBetween(String value1, String value2) {
            addCriterion("VersionNew between", value1, value2, "versionnew");
            return (Criteria) this;
        }

        public Criteria andVersionnewNotBetween(String value1, String value2) {
            addCriterion("VersionNew not between", value1, value2, "versionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewIsNull() {
            addCriterion("engVersionNew is null");
            return (Criteria) this;
        }

        public Criteria andEngversionnewIsNotNull() {
            addCriterion("engVersionNew is not null");
            return (Criteria) this;
        }

        public Criteria andEngversionnewEqualTo(String value) {
            addCriterion("engVersionNew =", value, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewNotEqualTo(String value) {
            addCriterion("engVersionNew <>", value, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewGreaterThan(String value) {
            addCriterion("engVersionNew >", value, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewGreaterThanOrEqualTo(String value) {
            addCriterion("engVersionNew >=", value, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewLessThan(String value) {
            addCriterion("engVersionNew <", value, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewLessThanOrEqualTo(String value) {
            addCriterion("engVersionNew <=", value, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewLike(String value) {
            addCriterion("engVersionNew like", value, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewNotLike(String value) {
            addCriterion("engVersionNew not like", value, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewIn(List<String> values) {
            addCriterion("engVersionNew in", values, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewNotIn(List<String> values) {
            addCriterion("engVersionNew not in", values, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewBetween(String value1, String value2) {
            addCriterion("engVersionNew between", value1, value2, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andEngversionnewNotBetween(String value1, String value2) {
            addCriterion("engVersionNew not between", value1, value2, "engversionnew");
            return (Criteria) this;
        }

        public Criteria andModpvIsNull() {
            addCriterion("ModPV is null");
            return (Criteria) this;
        }

        public Criteria andModpvIsNotNull() {
            addCriterion("ModPV is not null");
            return (Criteria) this;
        }

        public Criteria andModpvEqualTo(String value) {
            addCriterion("ModPV =", value, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvNotEqualTo(String value) {
            addCriterion("ModPV <>", value, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvGreaterThan(String value) {
            addCriterion("ModPV >", value, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvGreaterThanOrEqualTo(String value) {
            addCriterion("ModPV >=", value, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvLessThan(String value) {
            addCriterion("ModPV <", value, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvLessThanOrEqualTo(String value) {
            addCriterion("ModPV <=", value, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvLike(String value) {
            addCriterion("ModPV like", value, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvNotLike(String value) {
            addCriterion("ModPV not like", value, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvIn(List<String> values) {
            addCriterion("ModPV in", values, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvNotIn(List<String> values) {
            addCriterion("ModPV not in", values, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvBetween(String value1, String value2) {
            addCriterion("ModPV between", value1, value2, "modpv");
            return (Criteria) this;
        }

        public Criteria andModpvNotBetween(String value1, String value2) {
            addCriterion("ModPV not between", value1, value2, "modpv");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoIsNull() {
            addCriterion("VersionOldNo is null");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoIsNotNull() {
            addCriterion("VersionOldNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoEqualTo(String value) {
            addCriterion("VersionOldNo =", value, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoNotEqualTo(String value) {
            addCriterion("VersionOldNo <>", value, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoGreaterThan(String value) {
            addCriterion("VersionOldNo >", value, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoGreaterThanOrEqualTo(String value) {
            addCriterion("VersionOldNo >=", value, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoLessThan(String value) {
            addCriterion("VersionOldNo <", value, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoLessThanOrEqualTo(String value) {
            addCriterion("VersionOldNo <=", value, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoLike(String value) {
            addCriterion("VersionOldNo like", value, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoNotLike(String value) {
            addCriterion("VersionOldNo not like", value, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoIn(List<String> values) {
            addCriterion("VersionOldNo in", values, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoNotIn(List<String> values) {
            addCriterion("VersionOldNo not in", values, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoBetween(String value1, String value2) {
            addCriterion("VersionOldNo between", value1, value2, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldnoNotBetween(String value1, String value2) {
            addCriterion("VersionOldNo not between", value1, value2, "versionoldno");
            return (Criteria) this;
        }

        public Criteria andVersionoldIsNull() {
            addCriterion("VersionOld is null");
            return (Criteria) this;
        }

        public Criteria andVersionoldIsNotNull() {
            addCriterion("VersionOld is not null");
            return (Criteria) this;
        }

        public Criteria andVersionoldEqualTo(String value) {
            addCriterion("VersionOld =", value, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldNotEqualTo(String value) {
            addCriterion("VersionOld <>", value, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldGreaterThan(String value) {
            addCriterion("VersionOld >", value, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldGreaterThanOrEqualTo(String value) {
            addCriterion("VersionOld >=", value, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldLessThan(String value) {
            addCriterion("VersionOld <", value, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldLessThanOrEqualTo(String value) {
            addCriterion("VersionOld <=", value, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldLike(String value) {
            addCriterion("VersionOld like", value, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldNotLike(String value) {
            addCriterion("VersionOld not like", value, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldIn(List<String> values) {
            addCriterion("VersionOld in", values, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldNotIn(List<String> values) {
            addCriterion("VersionOld not in", values, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldBetween(String value1, String value2) {
            addCriterion("VersionOld between", value1, value2, "versionold");
            return (Criteria) this;
        }

        public Criteria andVersionoldNotBetween(String value1, String value2) {
            addCriterion("VersionOld not between", value1, value2, "versionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldIsNull() {
            addCriterion("engVersionOld is null");
            return (Criteria) this;
        }

        public Criteria andEngversionoldIsNotNull() {
            addCriterion("engVersionOld is not null");
            return (Criteria) this;
        }

        public Criteria andEngversionoldEqualTo(String value) {
            addCriterion("engVersionOld =", value, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldNotEqualTo(String value) {
            addCriterion("engVersionOld <>", value, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldGreaterThan(String value) {
            addCriterion("engVersionOld >", value, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldGreaterThanOrEqualTo(String value) {
            addCriterion("engVersionOld >=", value, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldLessThan(String value) {
            addCriterion("engVersionOld <", value, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldLessThanOrEqualTo(String value) {
            addCriterion("engVersionOld <=", value, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldLike(String value) {
            addCriterion("engVersionOld like", value, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldNotLike(String value) {
            addCriterion("engVersionOld not like", value, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldIn(List<String> values) {
            addCriterion("engVersionOld in", values, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldNotIn(List<String> values) {
            addCriterion("engVersionOld not in", values, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldBetween(String value1, String value2) {
            addCriterion("engVersionOld between", value1, value2, "engversionold");
            return (Criteria) this;
        }

        public Criteria andEngversionoldNotBetween(String value1, String value2) {
            addCriterion("engVersionOld not between", value1, value2, "engversionold");
            return (Criteria) this;
        }

        public Criteria andVersionnowIsNull() {
            addCriterion("VersionNow is null");
            return (Criteria) this;
        }

        public Criteria andVersionnowIsNotNull() {
            addCriterion("VersionNow is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnowEqualTo(String value) {
            addCriterion("VersionNow =", value, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowNotEqualTo(String value) {
            addCriterion("VersionNow <>", value, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowGreaterThan(String value) {
            addCriterion("VersionNow >", value, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowGreaterThanOrEqualTo(String value) {
            addCriterion("VersionNow >=", value, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowLessThan(String value) {
            addCriterion("VersionNow <", value, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowLessThanOrEqualTo(String value) {
            addCriterion("VersionNow <=", value, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowLike(String value) {
            addCriterion("VersionNow like", value, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowNotLike(String value) {
            addCriterion("VersionNow not like", value, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowIn(List<String> values) {
            addCriterion("VersionNow in", values, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowNotIn(List<String> values) {
            addCriterion("VersionNow not in", values, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowBetween(String value1, String value2) {
            addCriterion("VersionNow between", value1, value2, "versionnow");
            return (Criteria) this;
        }

        public Criteria andVersionnowNotBetween(String value1, String value2) {
            addCriterion("VersionNow not between", value1, value2, "versionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowIsNull() {
            addCriterion("engVersionNow is null");
            return (Criteria) this;
        }

        public Criteria andEngversionnowIsNotNull() {
            addCriterion("engVersionNow is not null");
            return (Criteria) this;
        }

        public Criteria andEngversionnowEqualTo(String value) {
            addCriterion("engVersionNow =", value, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowNotEqualTo(String value) {
            addCriterion("engVersionNow <>", value, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowGreaterThan(String value) {
            addCriterion("engVersionNow >", value, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowGreaterThanOrEqualTo(String value) {
            addCriterion("engVersionNow >=", value, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowLessThan(String value) {
            addCriterion("engVersionNow <", value, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowLessThanOrEqualTo(String value) {
            addCriterion("engVersionNow <=", value, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowLike(String value) {
            addCriterion("engVersionNow like", value, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowNotLike(String value) {
            addCriterion("engVersionNow not like", value, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowIn(List<String> values) {
            addCriterion("engVersionNow in", values, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowNotIn(List<String> values) {
            addCriterion("engVersionNow not in", values, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowBetween(String value1, String value2) {
            addCriterion("engVersionNow between", value1, value2, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andEngversionnowNotBetween(String value1, String value2) {
            addCriterion("engVersionNow not between", value1, value2, "engversionnow");
            return (Criteria) this;
        }

        public Criteria andDelpvIsNull() {
            addCriterion("DelPV is null");
            return (Criteria) this;
        }

        public Criteria andDelpvIsNotNull() {
            addCriterion("DelPV is not null");
            return (Criteria) this;
        }

        public Criteria andDelpvEqualTo(String value) {
            addCriterion("DelPV =", value, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvNotEqualTo(String value) {
            addCriterion("DelPV <>", value, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvGreaterThan(String value) {
            addCriterion("DelPV >", value, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvGreaterThanOrEqualTo(String value) {
            addCriterion("DelPV >=", value, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvLessThan(String value) {
            addCriterion("DelPV <", value, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvLessThanOrEqualTo(String value) {
            addCriterion("DelPV <=", value, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvLike(String value) {
            addCriterion("DelPV like", value, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvNotLike(String value) {
            addCriterion("DelPV not like", value, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvIn(List<String> values) {
            addCriterion("DelPV in", values, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvNotIn(List<String> values) {
            addCriterion("DelPV not in", values, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvBetween(String value1, String value2) {
            addCriterion("DelPV between", value1, value2, "delpv");
            return (Criteria) this;
        }

        public Criteria andDelpvNotBetween(String value1, String value2) {
            addCriterion("DelPV not between", value1, value2, "delpv");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoIsNull() {
            addCriterion("VersionDelNo is null");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoIsNotNull() {
            addCriterion("VersionDelNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoEqualTo(String value) {
            addCriterion("VersionDelNo =", value, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoNotEqualTo(String value) {
            addCriterion("VersionDelNo <>", value, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoGreaterThan(String value) {
            addCriterion("VersionDelNo >", value, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoGreaterThanOrEqualTo(String value) {
            addCriterion("VersionDelNo >=", value, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoLessThan(String value) {
            addCriterion("VersionDelNo <", value, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoLessThanOrEqualTo(String value) {
            addCriterion("VersionDelNo <=", value, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoLike(String value) {
            addCriterion("VersionDelNo like", value, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoNotLike(String value) {
            addCriterion("VersionDelNo not like", value, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoIn(List<String> values) {
            addCriterion("VersionDelNo in", values, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoNotIn(List<String> values) {
            addCriterion("VersionDelNo not in", values, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoBetween(String value1, String value2) {
            addCriterion("VersionDelNo between", value1, value2, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelnoNotBetween(String value1, String value2) {
            addCriterion("VersionDelNo not between", value1, value2, "versiondelno");
            return (Criteria) this;
        }

        public Criteria andVersiondelIsNull() {
            addCriterion("Versiondel is null");
            return (Criteria) this;
        }

        public Criteria andVersiondelIsNotNull() {
            addCriterion("Versiondel is not null");
            return (Criteria) this;
        }

        public Criteria andVersiondelEqualTo(String value) {
            addCriterion("Versiondel =", value, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelNotEqualTo(String value) {
            addCriterion("Versiondel <>", value, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelGreaterThan(String value) {
            addCriterion("Versiondel >", value, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelGreaterThanOrEqualTo(String value) {
            addCriterion("Versiondel >=", value, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelLessThan(String value) {
            addCriterion("Versiondel <", value, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelLessThanOrEqualTo(String value) {
            addCriterion("Versiondel <=", value, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelLike(String value) {
            addCriterion("Versiondel like", value, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelNotLike(String value) {
            addCriterion("Versiondel not like", value, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelIn(List<String> values) {
            addCriterion("Versiondel in", values, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelNotIn(List<String> values) {
            addCriterion("Versiondel not in", values, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelBetween(String value1, String value2) {
            addCriterion("Versiondel between", value1, value2, "versiondel");
            return (Criteria) this;
        }

        public Criteria andVersiondelNotBetween(String value1, String value2) {
            addCriterion("Versiondel not between", value1, value2, "versiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelIsNull() {
            addCriterion("engVersionDel is null");
            return (Criteria) this;
        }

        public Criteria andEngversiondelIsNotNull() {
            addCriterion("engVersionDel is not null");
            return (Criteria) this;
        }

        public Criteria andEngversiondelEqualTo(String value) {
            addCriterion("engVersionDel =", value, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelNotEqualTo(String value) {
            addCriterion("engVersionDel <>", value, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelGreaterThan(String value) {
            addCriterion("engVersionDel >", value, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelGreaterThanOrEqualTo(String value) {
            addCriterion("engVersionDel >=", value, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelLessThan(String value) {
            addCriterion("engVersionDel <", value, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelLessThanOrEqualTo(String value) {
            addCriterion("engVersionDel <=", value, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelLike(String value) {
            addCriterion("engVersionDel like", value, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelNotLike(String value) {
            addCriterion("engVersionDel not like", value, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelIn(List<String> values) {
            addCriterion("engVersionDel in", values, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelNotIn(List<String> values) {
            addCriterion("engVersionDel not in", values, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelBetween(String value1, String value2) {
            addCriterion("engVersionDel between", value1, value2, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andEngversiondelNotBetween(String value1, String value2) {
            addCriterion("engVersionDel not between", value1, value2, "engversiondel");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowIsNull() {
            addCriterion("PVIfDelBelow is null");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowIsNotNull() {
            addCriterion("PVIfDelBelow is not null");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowEqualTo(String value) {
            addCriterion("PVIfDelBelow =", value, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowNotEqualTo(String value) {
            addCriterion("PVIfDelBelow <>", value, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowGreaterThan(String value) {
            addCriterion("PVIfDelBelow >", value, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowGreaterThanOrEqualTo(String value) {
            addCriterion("PVIfDelBelow >=", value, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowLessThan(String value) {
            addCriterion("PVIfDelBelow <", value, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowLessThanOrEqualTo(String value) {
            addCriterion("PVIfDelBelow <=", value, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowLike(String value) {
            addCriterion("PVIfDelBelow like", value, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowNotLike(String value) {
            addCriterion("PVIfDelBelow not like", value, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowIn(List<String> values) {
            addCriterion("PVIfDelBelow in", values, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowNotIn(List<String> values) {
            addCriterion("PVIfDelBelow not in", values, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowBetween(String value1, String value2) {
            addCriterion("PVIfDelBelow between", value1, value2, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPvifdelbelowNotBetween(String value1, String value2) {
            addCriterion("PVIfDelBelow not between", value1, value2, "pvifdelbelow");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNull() {
            addCriterion("VersionNo is null");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNotNull() {
            addCriterion("VersionNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnoEqualTo(String value) {
            addCriterion("VersionNo =", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotEqualTo(String value) {
            addCriterion("VersionNo <>", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThan(String value) {
            addCriterion("VersionNo >", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThanOrEqualTo(String value) {
            addCriterion("VersionNo >=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThan(String value) {
            addCriterion("VersionNo <", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThanOrEqualTo(String value) {
            addCriterion("VersionNo <=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLike(String value) {
            addCriterion("VersionNo like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotLike(String value) {
            addCriterion("VersionNo not like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoIn(List<String> values) {
            addCriterion("VersionNo in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotIn(List<String> values) {
            addCriterion("VersionNo not in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoBetween(String value1, String value2) {
            addCriterion("VersionNo between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotBetween(String value1, String value2) {
            addCriterion("VersionNo not between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andNewprIsNull() {
            addCriterion("NewPR is null");
            return (Criteria) this;
        }

        public Criteria andNewprIsNotNull() {
            addCriterion("NewPR is not null");
            return (Criteria) this;
        }

        public Criteria andNewprEqualTo(String value) {
            addCriterion("NewPR =", value, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprNotEqualTo(String value) {
            addCriterion("NewPR <>", value, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprGreaterThan(String value) {
            addCriterion("NewPR >", value, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprGreaterThanOrEqualTo(String value) {
            addCriterion("NewPR >=", value, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprLessThan(String value) {
            addCriterion("NewPR <", value, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprLessThanOrEqualTo(String value) {
            addCriterion("NewPR <=", value, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprLike(String value) {
            addCriterion("NewPR like", value, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprNotLike(String value) {
            addCriterion("NewPR not like", value, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprIn(List<String> values) {
            addCriterion("NewPR in", values, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprNotIn(List<String> values) {
            addCriterion("NewPR not in", values, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprBetween(String value1, String value2) {
            addCriterion("NewPR between", value1, value2, "newpr");
            return (Criteria) this;
        }

        public Criteria andNewprNotBetween(String value1, String value2) {
            addCriterion("NewPR not between", value1, value2, "newpr");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoIsNull() {
            addCriterion("ReleaseNewNo is null");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoIsNotNull() {
            addCriterion("ReleaseNewNo is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoEqualTo(String value) {
            addCriterion("ReleaseNewNo =", value, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoNotEqualTo(String value) {
            addCriterion("ReleaseNewNo <>", value, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoGreaterThan(String value) {
            addCriterion("ReleaseNewNo >", value, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseNewNo >=", value, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoLessThan(String value) {
            addCriterion("ReleaseNewNo <", value, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoLessThanOrEqualTo(String value) {
            addCriterion("ReleaseNewNo <=", value, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoLike(String value) {
            addCriterion("ReleaseNewNo like", value, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoNotLike(String value) {
            addCriterion("ReleaseNewNo not like", value, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoIn(List<String> values) {
            addCriterion("ReleaseNewNo in", values, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoNotIn(List<String> values) {
            addCriterion("ReleaseNewNo not in", values, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoBetween(String value1, String value2) {
            addCriterion("ReleaseNewNo between", value1, value2, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewnoNotBetween(String value1, String value2) {
            addCriterion("ReleaseNewNo not between", value1, value2, "releasenewno");
            return (Criteria) this;
        }

        public Criteria andReleasenewIsNull() {
            addCriterion("ReleaseNew is null");
            return (Criteria) this;
        }

        public Criteria andReleasenewIsNotNull() {
            addCriterion("ReleaseNew is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenewEqualTo(String value) {
            addCriterion("ReleaseNew =", value, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewNotEqualTo(String value) {
            addCriterion("ReleaseNew <>", value, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewGreaterThan(String value) {
            addCriterion("ReleaseNew >", value, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseNew >=", value, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewLessThan(String value) {
            addCriterion("ReleaseNew <", value, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewLessThanOrEqualTo(String value) {
            addCriterion("ReleaseNew <=", value, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewLike(String value) {
            addCriterion("ReleaseNew like", value, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewNotLike(String value) {
            addCriterion("ReleaseNew not like", value, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewIn(List<String> values) {
            addCriterion("ReleaseNew in", values, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewNotIn(List<String> values) {
            addCriterion("ReleaseNew not in", values, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewBetween(String value1, String value2) {
            addCriterion("ReleaseNew between", value1, value2, "releasenew");
            return (Criteria) this;
        }

        public Criteria andReleasenewNotBetween(String value1, String value2) {
            addCriterion("ReleaseNew not between", value1, value2, "releasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewIsNull() {
            addCriterion("engReleaseNew is null");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewIsNotNull() {
            addCriterion("engReleaseNew is not null");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewEqualTo(String value) {
            addCriterion("engReleaseNew =", value, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewNotEqualTo(String value) {
            addCriterion("engReleaseNew <>", value, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewGreaterThan(String value) {
            addCriterion("engReleaseNew >", value, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewGreaterThanOrEqualTo(String value) {
            addCriterion("engReleaseNew >=", value, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewLessThan(String value) {
            addCriterion("engReleaseNew <", value, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewLessThanOrEqualTo(String value) {
            addCriterion("engReleaseNew <=", value, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewLike(String value) {
            addCriterion("engReleaseNew like", value, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewNotLike(String value) {
            addCriterion("engReleaseNew not like", value, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewIn(List<String> values) {
            addCriterion("engReleaseNew in", values, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewNotIn(List<String> values) {
            addCriterion("engReleaseNew not in", values, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewBetween(String value1, String value2) {
            addCriterion("engReleaseNew between", value1, value2, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andEngreleasenewNotBetween(String value1, String value2) {
            addCriterion("engReleaseNew not between", value1, value2, "engreleasenew");
            return (Criteria) this;
        }

        public Criteria andPdtnoIsNull() {
            addCriterion("PDTNo is null");
            return (Criteria) this;
        }

        public Criteria andPdtnoIsNotNull() {
            addCriterion("PDTNo is not null");
            return (Criteria) this;
        }

        public Criteria andPdtnoEqualTo(String value) {
            addCriterion("PDTNo =", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotEqualTo(String value) {
            addCriterion("PDTNo <>", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoGreaterThan(String value) {
            addCriterion("PDTNo >", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoGreaterThanOrEqualTo(String value) {
            addCriterion("PDTNo >=", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLessThan(String value) {
            addCriterion("PDTNo <", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLessThanOrEqualTo(String value) {
            addCriterion("PDTNo <=", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoLike(String value) {
            addCriterion("PDTNo like", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotLike(String value) {
            addCriterion("PDTNo not like", value, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoIn(List<String> values) {
            addCriterion("PDTNo in", values, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotIn(List<String> values) {
            addCriterion("PDTNo not in", values, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoBetween(String value1, String value2) {
            addCriterion("PDTNo between", value1, value2, "pdtno");
            return (Criteria) this;
        }

        public Criteria andPdtnoNotBetween(String value1, String value2) {
            addCriterion("PDTNo not between", value1, value2, "pdtno");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareIsNull() {
            addCriterion("ReleaseNo_Software is null");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareIsNotNull() {
            addCriterion("ReleaseNo_Software is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareEqualTo(String value) {
            addCriterion("ReleaseNo_Software =", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareNotEqualTo(String value) {
            addCriterion("ReleaseNo_Software <>", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareGreaterThan(String value) {
            addCriterion("ReleaseNo_Software >", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseNo_Software >=", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareLessThan(String value) {
            addCriterion("ReleaseNo_Software <", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareLessThanOrEqualTo(String value) {
            addCriterion("ReleaseNo_Software <=", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareLike(String value) {
            addCriterion("ReleaseNo_Software like", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareNotLike(String value) {
            addCriterion("ReleaseNo_Software not like", value, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareIn(List<String> values) {
            addCriterion("ReleaseNo_Software in", values, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareNotIn(List<String> values) {
            addCriterion("ReleaseNo_Software not in", values, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareBetween(String value1, String value2) {
            addCriterion("ReleaseNo_Software between", value1, value2, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareNotBetween(String value1, String value2) {
            addCriterion("ReleaseNo_Software not between", value1, value2, "releasenoSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareIsNull() {
            addCriterion("Release_Software is null");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareIsNotNull() {
            addCriterion("Release_Software is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareEqualTo(String value) {
            addCriterion("Release_Software =", value, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareNotEqualTo(String value) {
            addCriterion("Release_Software <>", value, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareGreaterThan(String value) {
            addCriterion("Release_Software >", value, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareGreaterThanOrEqualTo(String value) {
            addCriterion("Release_Software >=", value, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareLessThan(String value) {
            addCriterion("Release_Software <", value, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareLessThanOrEqualTo(String value) {
            addCriterion("Release_Software <=", value, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareLike(String value) {
            addCriterion("Release_Software like", value, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareNotLike(String value) {
            addCriterion("Release_Software not like", value, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareIn(List<String> values) {
            addCriterion("Release_Software in", values, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareNotIn(List<String> values) {
            addCriterion("Release_Software not in", values, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareBetween(String value1, String value2) {
            addCriterion("Release_Software between", value1, value2, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareNotBetween(String value1, String value2) {
            addCriterion("Release_Software not between", value1, value2, "releaseSoftware");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseIsNull() {
            addCriterion("InheritRelease is null");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseIsNotNull() {
            addCriterion("InheritRelease is not null");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseEqualTo(String value) {
            addCriterion("InheritRelease =", value, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseNotEqualTo(String value) {
            addCriterion("InheritRelease <>", value, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseGreaterThan(String value) {
            addCriterion("InheritRelease >", value, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseGreaterThanOrEqualTo(String value) {
            addCriterion("InheritRelease >=", value, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseLessThan(String value) {
            addCriterion("InheritRelease <", value, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseLessThanOrEqualTo(String value) {
            addCriterion("InheritRelease <=", value, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseLike(String value) {
            addCriterion("InheritRelease like", value, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseNotLike(String value) {
            addCriterion("InheritRelease not like", value, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseIn(List<String> values) {
            addCriterion("InheritRelease in", values, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseNotIn(List<String> values) {
            addCriterion("InheritRelease not in", values, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseBetween(String value1, String value2) {
            addCriterion("InheritRelease between", value1, value2, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andInheritreleaseNotBetween(String value1, String value2) {
            addCriterion("InheritRelease not between", value1, value2, "inheritrelease");
            return (Criteria) this;
        }

        public Criteria andModprIsNull() {
            addCriterion("ModPR is null");
            return (Criteria) this;
        }

        public Criteria andModprIsNotNull() {
            addCriterion("ModPR is not null");
            return (Criteria) this;
        }

        public Criteria andModprEqualTo(String value) {
            addCriterion("ModPR =", value, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprNotEqualTo(String value) {
            addCriterion("ModPR <>", value, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprGreaterThan(String value) {
            addCriterion("ModPR >", value, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprGreaterThanOrEqualTo(String value) {
            addCriterion("ModPR >=", value, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprLessThan(String value) {
            addCriterion("ModPR <", value, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprLessThanOrEqualTo(String value) {
            addCriterion("ModPR <=", value, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprLike(String value) {
            addCriterion("ModPR like", value, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprNotLike(String value) {
            addCriterion("ModPR not like", value, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprIn(List<String> values) {
            addCriterion("ModPR in", values, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprNotIn(List<String> values) {
            addCriterion("ModPR not in", values, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprBetween(String value1, String value2) {
            addCriterion("ModPR between", value1, value2, "modpr");
            return (Criteria) this;
        }

        public Criteria andModprNotBetween(String value1, String value2) {
            addCriterion("ModPR not between", value1, value2, "modpr");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoIsNull() {
            addCriterion("ReleaseOldNo is null");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoIsNotNull() {
            addCriterion("ReleaseOldNo is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoEqualTo(String value) {
            addCriterion("ReleaseOldNo =", value, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoNotEqualTo(String value) {
            addCriterion("ReleaseOldNo <>", value, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoGreaterThan(String value) {
            addCriterion("ReleaseOldNo >", value, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseOldNo >=", value, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoLessThan(String value) {
            addCriterion("ReleaseOldNo <", value, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoLessThanOrEqualTo(String value) {
            addCriterion("ReleaseOldNo <=", value, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoLike(String value) {
            addCriterion("ReleaseOldNo like", value, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoNotLike(String value) {
            addCriterion("ReleaseOldNo not like", value, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoIn(List<String> values) {
            addCriterion("ReleaseOldNo in", values, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoNotIn(List<String> values) {
            addCriterion("ReleaseOldNo not in", values, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoBetween(String value1, String value2) {
            addCriterion("ReleaseOldNo between", value1, value2, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldnoNotBetween(String value1, String value2) {
            addCriterion("ReleaseOldNo not between", value1, value2, "releaseoldno");
            return (Criteria) this;
        }

        public Criteria andReleaseoldIsNull() {
            addCriterion("ReleaseOld is null");
            return (Criteria) this;
        }

        public Criteria andReleaseoldIsNotNull() {
            addCriterion("ReleaseOld is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseoldEqualTo(String value) {
            addCriterion("ReleaseOld =", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldNotEqualTo(String value) {
            addCriterion("ReleaseOld <>", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldGreaterThan(String value) {
            addCriterion("ReleaseOld >", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseOld >=", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldLessThan(String value) {
            addCriterion("ReleaseOld <", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldLessThanOrEqualTo(String value) {
            addCriterion("ReleaseOld <=", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldLike(String value) {
            addCriterion("ReleaseOld like", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldNotLike(String value) {
            addCriterion("ReleaseOld not like", value, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldIn(List<String> values) {
            addCriterion("ReleaseOld in", values, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldNotIn(List<String> values) {
            addCriterion("ReleaseOld not in", values, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldBetween(String value1, String value2) {
            addCriterion("ReleaseOld between", value1, value2, "releaseold");
            return (Criteria) this;
        }

        public Criteria andReleaseoldNotBetween(String value1, String value2) {
            addCriterion("ReleaseOld not between", value1, value2, "releaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldIsNull() {
            addCriterion("engReleaseOld is null");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldIsNotNull() {
            addCriterion("engReleaseOld is not null");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldEqualTo(String value) {
            addCriterion("engReleaseOld =", value, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldNotEqualTo(String value) {
            addCriterion("engReleaseOld <>", value, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldGreaterThan(String value) {
            addCriterion("engReleaseOld >", value, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldGreaterThanOrEqualTo(String value) {
            addCriterion("engReleaseOld >=", value, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldLessThan(String value) {
            addCriterion("engReleaseOld <", value, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldLessThanOrEqualTo(String value) {
            addCriterion("engReleaseOld <=", value, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldLike(String value) {
            addCriterion("engReleaseOld like", value, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldNotLike(String value) {
            addCriterion("engReleaseOld not like", value, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldIn(List<String> values) {
            addCriterion("engReleaseOld in", values, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldNotIn(List<String> values) {
            addCriterion("engReleaseOld not in", values, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldBetween(String value1, String value2) {
            addCriterion("engReleaseOld between", value1, value2, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andEngreleaseoldNotBetween(String value1, String value2) {
            addCriterion("engReleaseOld not between", value1, value2, "engreleaseold");
            return (Criteria) this;
        }

        public Criteria andReleasenowIsNull() {
            addCriterion("ReleaseNow is null");
            return (Criteria) this;
        }

        public Criteria andReleasenowIsNotNull() {
            addCriterion("ReleaseNow is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenowEqualTo(String value) {
            addCriterion("ReleaseNow =", value, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowNotEqualTo(String value) {
            addCriterion("ReleaseNow <>", value, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowGreaterThan(String value) {
            addCriterion("ReleaseNow >", value, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseNow >=", value, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowLessThan(String value) {
            addCriterion("ReleaseNow <", value, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowLessThanOrEqualTo(String value) {
            addCriterion("ReleaseNow <=", value, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowLike(String value) {
            addCriterion("ReleaseNow like", value, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowNotLike(String value) {
            addCriterion("ReleaseNow not like", value, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowIn(List<String> values) {
            addCriterion("ReleaseNow in", values, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowNotIn(List<String> values) {
            addCriterion("ReleaseNow not in", values, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowBetween(String value1, String value2) {
            addCriterion("ReleaseNow between", value1, value2, "releasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenowNotBetween(String value1, String value2) {
            addCriterion("ReleaseNow not between", value1, value2, "releasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowIsNull() {
            addCriterion("engReleaseNow is null");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowIsNotNull() {
            addCriterion("engReleaseNow is not null");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowEqualTo(String value) {
            addCriterion("engReleaseNow =", value, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowNotEqualTo(String value) {
            addCriterion("engReleaseNow <>", value, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowGreaterThan(String value) {
            addCriterion("engReleaseNow >", value, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowGreaterThanOrEqualTo(String value) {
            addCriterion("engReleaseNow >=", value, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowLessThan(String value) {
            addCriterion("engReleaseNow <", value, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowLessThanOrEqualTo(String value) {
            addCriterion("engReleaseNow <=", value, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowLike(String value) {
            addCriterion("engReleaseNow like", value, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowNotLike(String value) {
            addCriterion("engReleaseNow not like", value, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowIn(List<String> values) {
            addCriterion("engReleaseNow in", values, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowNotIn(List<String> values) {
            addCriterion("engReleaseNow not in", values, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowBetween(String value1, String value2) {
            addCriterion("engReleaseNow between", value1, value2, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andEngreleasenowNotBetween(String value1, String value2) {
            addCriterion("engReleaseNow not between", value1, value2, "engreleasenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowIsNull() {
            addCriterion("ReleaseNo_SoftwareNow is null");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowIsNotNull() {
            addCriterion("ReleaseNo_SoftwareNow is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowEqualTo(String value) {
            addCriterion("ReleaseNo_SoftwareNow =", value, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowNotEqualTo(String value) {
            addCriterion("ReleaseNo_SoftwareNow <>", value, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowGreaterThan(String value) {
            addCriterion("ReleaseNo_SoftwareNow >", value, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseNo_SoftwareNow >=", value, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowLessThan(String value) {
            addCriterion("ReleaseNo_SoftwareNow <", value, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowLessThanOrEqualTo(String value) {
            addCriterion("ReleaseNo_SoftwareNow <=", value, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowLike(String value) {
            addCriterion("ReleaseNo_SoftwareNow like", value, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowNotLike(String value) {
            addCriterion("ReleaseNo_SoftwareNow not like", value, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowIn(List<String> values) {
            addCriterion("ReleaseNo_SoftwareNow in", values, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowNotIn(List<String> values) {
            addCriterion("ReleaseNo_SoftwareNow not in", values, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowBetween(String value1, String value2) {
            addCriterion("ReleaseNo_SoftwareNow between", value1, value2, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwarenowNotBetween(String value1, String value2) {
            addCriterion("ReleaseNo_SoftwareNow not between", value1, value2, "releasenoSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowIsNull() {
            addCriterion("Release_SoftwareNow is null");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowIsNotNull() {
            addCriterion("Release_SoftwareNow is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowEqualTo(String value) {
            addCriterion("Release_SoftwareNow =", value, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowNotEqualTo(String value) {
            addCriterion("Release_SoftwareNow <>", value, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowGreaterThan(String value) {
            addCriterion("Release_SoftwareNow >", value, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowGreaterThanOrEqualTo(String value) {
            addCriterion("Release_SoftwareNow >=", value, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowLessThan(String value) {
            addCriterion("Release_SoftwareNow <", value, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowLessThanOrEqualTo(String value) {
            addCriterion("Release_SoftwareNow <=", value, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowLike(String value) {
            addCriterion("Release_SoftwareNow like", value, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowNotLike(String value) {
            addCriterion("Release_SoftwareNow not like", value, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowIn(List<String> values) {
            addCriterion("Release_SoftwareNow in", values, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowNotIn(List<String> values) {
            addCriterion("Release_SoftwareNow not in", values, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowBetween(String value1, String value2) {
            addCriterion("Release_SoftwareNow between", value1, value2, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwarenowNotBetween(String value1, String value2) {
            addCriterion("Release_SoftwareNow not between", value1, value2, "releaseSoftwarenow");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoIsNull() {
            addCriterion("PDTOldNo is null");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoIsNotNull() {
            addCriterion("PDTOldNo is not null");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoEqualTo(String value) {
            addCriterion("PDTOldNo =", value, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoNotEqualTo(String value) {
            addCriterion("PDTOldNo <>", value, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoGreaterThan(String value) {
            addCriterion("PDTOldNo >", value, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoGreaterThanOrEqualTo(String value) {
            addCriterion("PDTOldNo >=", value, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoLessThan(String value) {
            addCriterion("PDTOldNo <", value, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoLessThanOrEqualTo(String value) {
            addCriterion("PDTOldNo <=", value, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoLike(String value) {
            addCriterion("PDTOldNo like", value, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoNotLike(String value) {
            addCriterion("PDTOldNo not like", value, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoIn(List<String> values) {
            addCriterion("PDTOldNo in", values, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoNotIn(List<String> values) {
            addCriterion("PDTOldNo not in", values, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoBetween(String value1, String value2) {
            addCriterion("PDTOldNo between", value1, value2, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldnoNotBetween(String value1, String value2) {
            addCriterion("PDTOldNo not between", value1, value2, "pdtoldno");
            return (Criteria) this;
        }

        public Criteria andPdtoldIsNull() {
            addCriterion("PDTOld is null");
            return (Criteria) this;
        }

        public Criteria andPdtoldIsNotNull() {
            addCriterion("PDTOld is not null");
            return (Criteria) this;
        }

        public Criteria andPdtoldEqualTo(String value) {
            addCriterion("PDTOld =", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldNotEqualTo(String value) {
            addCriterion("PDTOld <>", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldGreaterThan(String value) {
            addCriterion("PDTOld >", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldGreaterThanOrEqualTo(String value) {
            addCriterion("PDTOld >=", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldLessThan(String value) {
            addCriterion("PDTOld <", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldLessThanOrEqualTo(String value) {
            addCriterion("PDTOld <=", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldLike(String value) {
            addCriterion("PDTOld like", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldNotLike(String value) {
            addCriterion("PDTOld not like", value, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldIn(List<String> values) {
            addCriterion("PDTOld in", values, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldNotIn(List<String> values) {
            addCriterion("PDTOld not in", values, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldBetween(String value1, String value2) {
            addCriterion("PDTOld between", value1, value2, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtoldNotBetween(String value1, String value2) {
            addCriterion("PDTOld not between", value1, value2, "pdtold");
            return (Criteria) this;
        }

        public Criteria andPdtnownoIsNull() {
            addCriterion("PDTNowNo is null");
            return (Criteria) this;
        }

        public Criteria andPdtnownoIsNotNull() {
            addCriterion("PDTNowNo is not null");
            return (Criteria) this;
        }

        public Criteria andPdtnownoEqualTo(String value) {
            addCriterion("PDTNowNo =", value, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoNotEqualTo(String value) {
            addCriterion("PDTNowNo <>", value, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoGreaterThan(String value) {
            addCriterion("PDTNowNo >", value, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoGreaterThanOrEqualTo(String value) {
            addCriterion("PDTNowNo >=", value, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoLessThan(String value) {
            addCriterion("PDTNowNo <", value, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoLessThanOrEqualTo(String value) {
            addCriterion("PDTNowNo <=", value, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoLike(String value) {
            addCriterion("PDTNowNo like", value, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoNotLike(String value) {
            addCriterion("PDTNowNo not like", value, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoIn(List<String> values) {
            addCriterion("PDTNowNo in", values, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoNotIn(List<String> values) {
            addCriterion("PDTNowNo not in", values, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoBetween(String value1, String value2) {
            addCriterion("PDTNowNo between", value1, value2, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andPdtnownoNotBetween(String value1, String value2) {
            addCriterion("PDTNowNo not between", value1, value2, "pdtnowno");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldIsNull() {
            addCriterion("Release_SoftwareOld is null");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldIsNotNull() {
            addCriterion("Release_SoftwareOld is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldEqualTo(String value) {
            addCriterion("Release_SoftwareOld =", value, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldNotEqualTo(String value) {
            addCriterion("Release_SoftwareOld <>", value, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldGreaterThan(String value) {
            addCriterion("Release_SoftwareOld >", value, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldGreaterThanOrEqualTo(String value) {
            addCriterion("Release_SoftwareOld >=", value, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldLessThan(String value) {
            addCriterion("Release_SoftwareOld <", value, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldLessThanOrEqualTo(String value) {
            addCriterion("Release_SoftwareOld <=", value, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldLike(String value) {
            addCriterion("Release_SoftwareOld like", value, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldNotLike(String value) {
            addCriterion("Release_SoftwareOld not like", value, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldIn(List<String> values) {
            addCriterion("Release_SoftwareOld in", values, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldNotIn(List<String> values) {
            addCriterion("Release_SoftwareOld not in", values, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldBetween(String value1, String value2) {
            addCriterion("Release_SoftwareOld between", value1, value2, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleaseSoftwareoldNotBetween(String value1, String value2) {
            addCriterion("Release_SoftwareOld not between", value1, value2, "releaseSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldIsNull() {
            addCriterion("ReleaseNo_SoftwareOld is null");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldIsNotNull() {
            addCriterion("ReleaseNo_SoftwareOld is not null");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldEqualTo(String value) {
            addCriterion("ReleaseNo_SoftwareOld =", value, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldNotEqualTo(String value) {
            addCriterion("ReleaseNo_SoftwareOld <>", value, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldGreaterThan(String value) {
            addCriterion("ReleaseNo_SoftwareOld >", value, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseNo_SoftwareOld >=", value, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldLessThan(String value) {
            addCriterion("ReleaseNo_SoftwareOld <", value, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldLessThanOrEqualTo(String value) {
            addCriterion("ReleaseNo_SoftwareOld <=", value, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldLike(String value) {
            addCriterion("ReleaseNo_SoftwareOld like", value, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldNotLike(String value) {
            addCriterion("ReleaseNo_SoftwareOld not like", value, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldIn(List<String> values) {
            addCriterion("ReleaseNo_SoftwareOld in", values, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldNotIn(List<String> values) {
            addCriterion("ReleaseNo_SoftwareOld not in", values, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldBetween(String value1, String value2) {
            addCriterion("ReleaseNo_SoftwareOld between", value1, value2, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andReleasenoSoftwareoldNotBetween(String value1, String value2) {
            addCriterion("ReleaseNo_SoftwareOld not between", value1, value2, "releasenoSoftwareold");
            return (Criteria) this;
        }

        public Criteria andDelprIsNull() {
            addCriterion("DelPR is null");
            return (Criteria) this;
        }

        public Criteria andDelprIsNotNull() {
            addCriterion("DelPR is not null");
            return (Criteria) this;
        }

        public Criteria andDelprEqualTo(String value) {
            addCriterion("DelPR =", value, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprNotEqualTo(String value) {
            addCriterion("DelPR <>", value, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprGreaterThan(String value) {
            addCriterion("DelPR >", value, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprGreaterThanOrEqualTo(String value) {
            addCriterion("DelPR >=", value, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprLessThan(String value) {
            addCriterion("DelPR <", value, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprLessThanOrEqualTo(String value) {
            addCriterion("DelPR <=", value, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprLike(String value) {
            addCriterion("DelPR like", value, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprNotLike(String value) {
            addCriterion("DelPR not like", value, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprIn(List<String> values) {
            addCriterion("DelPR in", values, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprNotIn(List<String> values) {
            addCriterion("DelPR not in", values, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprBetween(String value1, String value2) {
            addCriterion("DelPR between", value1, value2, "delpr");
            return (Criteria) this;
        }

        public Criteria andDelprNotBetween(String value1, String value2) {
            addCriterion("DelPR not between", value1, value2, "delpr");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoIsNull() {
            addCriterion("ReleaseDelNo is null");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoIsNotNull() {
            addCriterion("ReleaseDelNo is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoEqualTo(String value) {
            addCriterion("ReleaseDelNo =", value, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoNotEqualTo(String value) {
            addCriterion("ReleaseDelNo <>", value, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoGreaterThan(String value) {
            addCriterion("ReleaseDelNo >", value, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseDelNo >=", value, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoLessThan(String value) {
            addCriterion("ReleaseDelNo <", value, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoLessThanOrEqualTo(String value) {
            addCriterion("ReleaseDelNo <=", value, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoLike(String value) {
            addCriterion("ReleaseDelNo like", value, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoNotLike(String value) {
            addCriterion("ReleaseDelNo not like", value, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoIn(List<String> values) {
            addCriterion("ReleaseDelNo in", values, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoNotIn(List<String> values) {
            addCriterion("ReleaseDelNo not in", values, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoBetween(String value1, String value2) {
            addCriterion("ReleaseDelNo between", value1, value2, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelnoNotBetween(String value1, String value2) {
            addCriterion("ReleaseDelNo not between", value1, value2, "releasedelno");
            return (Criteria) this;
        }

        public Criteria andReleasedelIsNull() {
            addCriterion("ReleaseDel is null");
            return (Criteria) this;
        }

        public Criteria andReleasedelIsNotNull() {
            addCriterion("ReleaseDel is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedelEqualTo(String value) {
            addCriterion("ReleaseDel =", value, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelNotEqualTo(String value) {
            addCriterion("ReleaseDel <>", value, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelGreaterThan(String value) {
            addCriterion("ReleaseDel >", value, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelGreaterThanOrEqualTo(String value) {
            addCriterion("ReleaseDel >=", value, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelLessThan(String value) {
            addCriterion("ReleaseDel <", value, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelLessThanOrEqualTo(String value) {
            addCriterion("ReleaseDel <=", value, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelLike(String value) {
            addCriterion("ReleaseDel like", value, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelNotLike(String value) {
            addCriterion("ReleaseDel not like", value, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelIn(List<String> values) {
            addCriterion("ReleaseDel in", values, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelNotIn(List<String> values) {
            addCriterion("ReleaseDel not in", values, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelBetween(String value1, String value2) {
            addCriterion("ReleaseDel between", value1, value2, "releasedel");
            return (Criteria) this;
        }

        public Criteria andReleasedelNotBetween(String value1, String value2) {
            addCriterion("ReleaseDel not between", value1, value2, "releasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelIsNull() {
            addCriterion("engReleaseDel is null");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelIsNotNull() {
            addCriterion("engReleaseDel is not null");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelEqualTo(String value) {
            addCriterion("engReleaseDel =", value, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelNotEqualTo(String value) {
            addCriterion("engReleaseDel <>", value, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelGreaterThan(String value) {
            addCriterion("engReleaseDel >", value, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelGreaterThanOrEqualTo(String value) {
            addCriterion("engReleaseDel >=", value, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelLessThan(String value) {
            addCriterion("engReleaseDel <", value, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelLessThanOrEqualTo(String value) {
            addCriterion("engReleaseDel <=", value, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelLike(String value) {
            addCriterion("engReleaseDel like", value, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelNotLike(String value) {
            addCriterion("engReleaseDel not like", value, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelIn(List<String> values) {
            addCriterion("engReleaseDel in", values, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelNotIn(List<String> values) {
            addCriterion("engReleaseDel not in", values, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelBetween(String value1, String value2) {
            addCriterion("engReleaseDel between", value1, value2, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andEngreleasedelNotBetween(String value1, String value2) {
            addCriterion("engReleaseDel not between", value1, value2, "engreleasedel");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowIsNull() {
            addCriterion("PRIfDelBelow is null");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowIsNotNull() {
            addCriterion("PRIfDelBelow is not null");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowEqualTo(String value) {
            addCriterion("PRIfDelBelow =", value, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowNotEqualTo(String value) {
            addCriterion("PRIfDelBelow <>", value, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowGreaterThan(String value) {
            addCriterion("PRIfDelBelow >", value, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowGreaterThanOrEqualTo(String value) {
            addCriterion("PRIfDelBelow >=", value, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowLessThan(String value) {
            addCriterion("PRIfDelBelow <", value, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowLessThanOrEqualTo(String value) {
            addCriterion("PRIfDelBelow <=", value, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowLike(String value) {
            addCriterion("PRIfDelBelow like", value, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowNotLike(String value) {
            addCriterion("PRIfDelBelow not like", value, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowIn(List<String> values) {
            addCriterion("PRIfDelBelow in", values, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowNotIn(List<String> values) {
            addCriterion("PRIfDelBelow not in", values, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowBetween(String value1, String value2) {
            addCriterion("PRIfDelBelow between", value1, value2, "prifdelbelow");
            return (Criteria) this;
        }

        public Criteria andPrifdelbelowNotBetween(String value1, String value2) {
            addCriterion("PRIfDelBelow not between", value1, value2, "prifdelbelow");
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

        public Criteria andCreatorIsNull() {
            addCriterion("Creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("Creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("Creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("Creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("Creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("Creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("Creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("Creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("Creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("Creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("Creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("Creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("Creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("Creator not between", value1, value2, "creator");
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

        public Criteria andModifierIsNull() {
            addCriterion("Modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("Modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("Modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("Modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("Modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("Modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("Modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("Modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("Modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("Modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("Modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("Modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("Modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("Modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNull() {
            addCriterion("processID is null");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNotNull() {
            addCriterion("processID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessidEqualTo(Integer value) {
            addCriterion("processID =", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotEqualTo(Integer value) {
            addCriterion("processID <>", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThan(Integer value) {
            addCriterion("processID >", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("processID >=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThan(Integer value) {
            addCriterion("processID <", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThanOrEqualTo(Integer value) {
            addCriterion("processID <=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidIn(List<Integer> values) {
            addCriterion("processID in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotIn(List<Integer> values) {
            addCriterion("processID not in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidBetween(Integer value1, Integer value2) {
            addCriterion("processID between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotBetween(Integer value1, Integer value2) {
            addCriterion("processID not between", value1, value2, "processid");
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

        public Criteria andHandlerIsNull() {
            addCriterion("Handler is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("Handler is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("Handler =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("Handler <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("Handler >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("Handler >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("Handler <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("Handler <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("Handler like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("Handler not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("Handler in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("Handler not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("Handler between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("Handler not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIsNull() {
            addCriterion("Instanse_ID is null");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIsNotNull() {
            addCriterion("Instanse_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanseIdEqualTo(String value) {
            addCriterion("Instanse_ID =", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotEqualTo(String value) {
            addCriterion("Instanse_ID <>", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdGreaterThan(String value) {
            addCriterion("Instanse_ID >", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdGreaterThanOrEqualTo(String value) {
            addCriterion("Instanse_ID >=", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLessThan(String value) {
            addCriterion("Instanse_ID <", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLessThanOrEqualTo(String value) {
            addCriterion("Instanse_ID <=", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdLike(String value) {
            addCriterion("Instanse_ID like", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotLike(String value) {
            addCriterion("Instanse_ID not like", value, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdIn(List<String> values) {
            addCriterion("Instanse_ID in", values, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotIn(List<String> values) {
            addCriterion("Instanse_ID not in", values, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdBetween(String value1, String value2) {
            addCriterion("Instanse_ID between", value1, value2, "instanseId");
            return (Criteria) this;
        }

        public Criteria andInstanseIdNotBetween(String value1, String value2) {
            addCriterion("Instanse_ID not between", value1, value2, "instanseId");
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

        public Criteria andFirstSignIsNull() {
            addCriterion("First_Sign is null");
            return (Criteria) this;
        }

        public Criteria andFirstSignIsNotNull() {
            addCriterion("First_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSignEqualTo(String value) {
            addCriterion("First_Sign =", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotEqualTo(String value) {
            addCriterion("First_Sign <>", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignGreaterThan(String value) {
            addCriterion("First_Sign >", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignGreaterThanOrEqualTo(String value) {
            addCriterion("First_Sign >=", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLessThan(String value) {
            addCriterion("First_Sign <", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLessThanOrEqualTo(String value) {
            addCriterion("First_Sign <=", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignLike(String value) {
            addCriterion("First_Sign like", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotLike(String value) {
            addCriterion("First_Sign not like", value, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignIn(List<String> values) {
            addCriterion("First_Sign in", values, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotIn(List<String> values) {
            addCriterion("First_Sign not in", values, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignBetween(String value1, String value2) {
            addCriterion("First_Sign between", value1, value2, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstSignNotBetween(String value1, String value2) {
            addCriterion("First_Sign not between", value1, value2, "firstSign");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNull() {
            addCriterion("First_Date is null");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNotNull() {
            addCriterion("First_Date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDateEqualTo(Date value) {
            addCriterion("First_Date =", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotEqualTo(Date value) {
            addCriterion("First_Date <>", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThan(Date value) {
            addCriterion("First_Date >", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThanOrEqualTo(Date value) {
            addCriterion("First_Date >=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThan(Date value) {
            addCriterion("First_Date <", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThanOrEqualTo(Date value) {
            addCriterion("First_Date <=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateIn(List<Date> values) {
            addCriterion("First_Date in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotIn(List<Date> values) {
            addCriterion("First_Date not in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateBetween(Date value1, Date value2) {
            addCriterion("First_Date between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotBetween(Date value1, Date value2) {
            addCriterion("First_Date not between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIsNull() {
            addCriterion("IPMT_Sign is null");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIsNotNull() {
            addCriterion("IPMT_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtSignEqualTo(String value) {
            addCriterion("IPMT_Sign =", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotEqualTo(String value) {
            addCriterion("IPMT_Sign <>", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignGreaterThan(String value) {
            addCriterion("IPMT_Sign >", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Sign >=", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLessThan(String value) {
            addCriterion("IPMT_Sign <", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Sign <=", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignLike(String value) {
            addCriterion("IPMT_Sign like", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotLike(String value) {
            addCriterion("IPMT_Sign not like", value, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignIn(List<String> values) {
            addCriterion("IPMT_Sign in", values, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotIn(List<String> values) {
            addCriterion("IPMT_Sign not in", values, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignBetween(String value1, String value2) {
            addCriterion("IPMT_Sign between", value1, value2, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtSignNotBetween(String value1, String value2) {
            addCriterion("IPMT_Sign not between", value1, value2, "ipmtSign");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIsNull() {
            addCriterion("IPMT_Date is null");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIsNotNull() {
            addCriterion("IPMT_Date is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtDateEqualTo(Date value) {
            addCriterion("IPMT_Date =", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotEqualTo(Date value) {
            addCriterion("IPMT_Date <>", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateGreaterThan(Date value) {
            addCriterion("IPMT_Date >", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("IPMT_Date >=", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateLessThan(Date value) {
            addCriterion("IPMT_Date <", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateLessThanOrEqualTo(Date value) {
            addCriterion("IPMT_Date <=", value, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateIn(List<Date> values) {
            addCriterion("IPMT_Date in", values, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotIn(List<Date> values) {
            addCriterion("IPMT_Date not in", values, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateBetween(Date value1, Date value2) {
            addCriterion("IPMT_Date between", value1, value2, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtDateNotBetween(Date value1, Date value2) {
            addCriterion("IPMT_Date not between", value1, value2, "ipmtDate");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIsNull() {
            addCriterion("IPMT_Opinion is null");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIsNotNull() {
            addCriterion("IPMT_Opinion is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionEqualTo(String value) {
            addCriterion("IPMT_Opinion =", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotEqualTo(String value) {
            addCriterion("IPMT_Opinion <>", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionGreaterThan(String value) {
            addCriterion("IPMT_Opinion >", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Opinion >=", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLessThan(String value) {
            addCriterion("IPMT_Opinion <", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Opinion <=", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionLike(String value) {
            addCriterion("IPMT_Opinion like", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotLike(String value) {
            addCriterion("IPMT_Opinion not like", value, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionIn(List<String> values) {
            addCriterion("IPMT_Opinion in", values, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotIn(List<String> values) {
            addCriterion("IPMT_Opinion not in", values, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionBetween(String value1, String value2) {
            addCriterion("IPMT_Opinion between", value1, value2, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtOpinionNotBetween(String value1, String value2) {
            addCriterion("IPMT_Opinion not between", value1, value2, "ipmtOpinion");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIsNull() {
            addCriterion("IPMT_Result is null");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIsNotNull() {
            addCriterion("IPMT_Result is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtResultEqualTo(String value) {
            addCriterion("IPMT_Result =", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotEqualTo(String value) {
            addCriterion("IPMT_Result <>", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultGreaterThan(String value) {
            addCriterion("IPMT_Result >", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultGreaterThanOrEqualTo(String value) {
            addCriterion("IPMT_Result >=", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLessThan(String value) {
            addCriterion("IPMT_Result <", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLessThanOrEqualTo(String value) {
            addCriterion("IPMT_Result <=", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultLike(String value) {
            addCriterion("IPMT_Result like", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotLike(String value) {
            addCriterion("IPMT_Result not like", value, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultIn(List<String> values) {
            addCriterion("IPMT_Result in", values, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotIn(List<String> values) {
            addCriterion("IPMT_Result not in", values, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultBetween(String value1, String value2) {
            addCriterion("IPMT_Result between", value1, value2, "ipmtResult");
            return (Criteria) this;
        }

        public Criteria andIpmtResultNotBetween(String value1, String value2) {
            addCriterion("IPMT_Result not between", value1, value2, "ipmtResult");
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

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("FILE_ID like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("FILE_ID not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
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