package com.h3c.mds.basicinfo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_DifficultyCoefficient_Item_APPLYExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_DifficultyCoefficient_Item_APPLYExample() {
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

        public Criteria andDiffIdIsNull() {
            addCriterion("Diff_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiffIdIsNotNull() {
            addCriterion("Diff_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiffIdEqualTo(Integer value) {
            addCriterion("Diff_ID =", value, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdNotEqualTo(Integer value) {
            addCriterion("Diff_ID <>", value, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdGreaterThan(Integer value) {
            addCriterion("Diff_ID >", value, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Diff_ID >=", value, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdLessThan(Integer value) {
            addCriterion("Diff_ID <", value, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdLessThanOrEqualTo(Integer value) {
            addCriterion("Diff_ID <=", value, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdIn(List<Integer> values) {
            addCriterion("Diff_ID in", values, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdNotIn(List<Integer> values) {
            addCriterion("Diff_ID not in", values, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdBetween(Integer value1, Integer value2) {
            addCriterion("Diff_ID between", value1, value2, "diffId");
            return (Criteria) this;
        }

        public Criteria andDiffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Diff_ID not between", value1, value2, "diffId");
            return (Criteria) this;
        }

        public Criteria andBversionnoIsNull() {
            addCriterion("BVersionno is null");
            return (Criteria) this;
        }

        public Criteria andBversionnoIsNotNull() {
            addCriterion("BVersionno is not null");
            return (Criteria) this;
        }

        public Criteria andBversionnoEqualTo(String value) {
            addCriterion("BVersionno =", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotEqualTo(String value) {
            addCriterion("BVersionno <>", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThan(String value) {
            addCriterion("BVersionno >", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoGreaterThanOrEqualTo(String value) {
            addCriterion("BVersionno >=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThan(String value) {
            addCriterion("BVersionno <", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLessThanOrEqualTo(String value) {
            addCriterion("BVersionno <=", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoLike(String value) {
            addCriterion("BVersionno like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotLike(String value) {
            addCriterion("BVersionno not like", value, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoIn(List<String> values) {
            addCriterion("BVersionno in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotIn(List<String> values) {
            addCriterion("BVersionno not in", values, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoBetween(String value1, String value2) {
            addCriterion("BVersionno between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionnoNotBetween(String value1, String value2) {
            addCriterion("BVersionno not between", value1, value2, "bversionno");
            return (Criteria) this;
        }

        public Criteria andBversionIsNull() {
            addCriterion("BVersion is null");
            return (Criteria) this;
        }

        public Criteria andBversionIsNotNull() {
            addCriterion("BVersion is not null");
            return (Criteria) this;
        }

        public Criteria andBversionEqualTo(String value) {
            addCriterion("BVersion =", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotEqualTo(String value) {
            addCriterion("BVersion <>", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionGreaterThan(String value) {
            addCriterion("BVersion >", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionGreaterThanOrEqualTo(String value) {
            addCriterion("BVersion >=", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLessThan(String value) {
            addCriterion("BVersion <", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLessThanOrEqualTo(String value) {
            addCriterion("BVersion <=", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionLike(String value) {
            addCriterion("BVersion like", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotLike(String value) {
            addCriterion("BVersion not like", value, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionIn(List<String> values) {
            addCriterion("BVersion in", values, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotIn(List<String> values) {
            addCriterion("BVersion not in", values, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionBetween(String value1, String value2) {
            addCriterion("BVersion between", value1, value2, "bversion");
            return (Criteria) this;
        }

        public Criteria andBversionNotBetween(String value1, String value2) {
            addCriterion("BVersion not between", value1, value2, "bversion");
            return (Criteria) this;
        }

        public Criteria andProdifficultIsNull() {
            addCriterion("ProDifficult is null");
            return (Criteria) this;
        }

        public Criteria andProdifficultIsNotNull() {
            addCriterion("ProDifficult is not null");
            return (Criteria) this;
        }

        public Criteria andProdifficultEqualTo(BigDecimal value) {
            addCriterion("ProDifficult =", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultNotEqualTo(BigDecimal value) {
            addCriterion("ProDifficult <>", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultGreaterThan(BigDecimal value) {
            addCriterion("ProDifficult >", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ProDifficult >=", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultLessThan(BigDecimal value) {
            addCriterion("ProDifficult <", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ProDifficult <=", value, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultIn(List<BigDecimal> values) {
            addCriterion("ProDifficult in", values, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultNotIn(List<BigDecimal> values) {
            addCriterion("ProDifficult not in", values, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProDifficult between", value1, value2, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andProdifficultNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProDifficult not between", value1, value2, "prodifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultIsNull() {
            addCriterion("HardDifficult is null");
            return (Criteria) this;
        }

        public Criteria andHarddifficultIsNotNull() {
            addCriterion("HardDifficult is not null");
            return (Criteria) this;
        }

        public Criteria andHarddifficultEqualTo(BigDecimal value) {
            addCriterion("HardDifficult =", value, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultNotEqualTo(BigDecimal value) {
            addCriterion("HardDifficult <>", value, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultGreaterThan(BigDecimal value) {
            addCriterion("HardDifficult >", value, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HardDifficult >=", value, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultLessThan(BigDecimal value) {
            addCriterion("HardDifficult <", value, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HardDifficult <=", value, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultIn(List<BigDecimal> values) {
            addCriterion("HardDifficult in", values, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultNotIn(List<BigDecimal> values) {
            addCriterion("HardDifficult not in", values, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HardDifficult between", value1, value2, "harddifficult");
            return (Criteria) this;
        }

        public Criteria andHarddifficultNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HardDifficult not between", value1, value2, "harddifficult");
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