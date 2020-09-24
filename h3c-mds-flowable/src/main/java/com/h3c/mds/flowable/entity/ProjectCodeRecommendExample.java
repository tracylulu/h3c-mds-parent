package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.List;

public class ProjectCodeRecommendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectCodeRecommendExample() {
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

        public Criteria andProNumberIsNull() {
            addCriterion("pro_number is null");
            return (Criteria) this;
        }

        public Criteria andProNumberIsNotNull() {
            addCriterion("pro_number is not null");
            return (Criteria) this;
        }

        public Criteria andProNumberEqualTo(String value) {
            addCriterion("pro_number =", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotEqualTo(String value) {
            addCriterion("pro_number <>", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberGreaterThan(String value) {
            addCriterion("pro_number >", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pro_number >=", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLessThan(String value) {
            addCriterion("pro_number <", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLessThanOrEqualTo(String value) {
            addCriterion("pro_number <=", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLike(String value) {
            addCriterion("pro_number like", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotLike(String value) {
            addCriterion("pro_number not like", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberIn(List<String> values) {
            addCriterion("pro_number in", values, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotIn(List<String> values) {
            addCriterion("pro_number not in", values, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberBetween(String value1, String value2) {
            addCriterion("pro_number between", value1, value2, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotBetween(String value1, String value2) {
            addCriterion("pro_number not between", value1, value2, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andPdtNoIsNull() {
            addCriterion("pdt_no is null");
            return (Criteria) this;
        }

        public Criteria andPdtNoIsNotNull() {
            addCriterion("pdt_no is not null");
            return (Criteria) this;
        }

        public Criteria andPdtNoEqualTo(String value) {
            addCriterion("pdt_no =", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotEqualTo(String value) {
            addCriterion("pdt_no <>", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoGreaterThan(String value) {
            addCriterion("pdt_no >", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoGreaterThanOrEqualTo(String value) {
            addCriterion("pdt_no >=", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLessThan(String value) {
            addCriterion("pdt_no <", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLessThanOrEqualTo(String value) {
            addCriterion("pdt_no <=", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoLike(String value) {
            addCriterion("pdt_no like", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotLike(String value) {
            addCriterion("pdt_no not like", value, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoIn(List<String> values) {
            addCriterion("pdt_no in", values, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotIn(List<String> values) {
            addCriterion("pdt_no not in", values, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoBetween(String value1, String value2) {
            addCriterion("pdt_no between", value1, value2, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andPdtNoNotBetween(String value1, String value2) {
            addCriterion("pdt_no not between", value1, value2, "pdtNo");
            return (Criteria) this;
        }

        public Criteria andBversionNameIsNull() {
            addCriterion("bversion_name is null");
            return (Criteria) this;
        }

        public Criteria andBversionNameIsNotNull() {
            addCriterion("bversion_name is not null");
            return (Criteria) this;
        }

        public Criteria andBversionNameEqualTo(String value) {
            addCriterion("bversion_name =", value, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameNotEqualTo(String value) {
            addCriterion("bversion_name <>", value, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameGreaterThan(String value) {
            addCriterion("bversion_name >", value, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameGreaterThanOrEqualTo(String value) {
            addCriterion("bversion_name >=", value, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameLessThan(String value) {
            addCriterion("bversion_name <", value, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameLessThanOrEqualTo(String value) {
            addCriterion("bversion_name <=", value, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameLike(String value) {
            addCriterion("bversion_name like", value, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameNotLike(String value) {
            addCriterion("bversion_name not like", value, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameIn(List<String> values) {
            addCriterion("bversion_name in", values, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameNotIn(List<String> values) {
            addCriterion("bversion_name not in", values, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameBetween(String value1, String value2) {
            addCriterion("bversion_name between", value1, value2, "bversionName");
            return (Criteria) this;
        }

        public Criteria andBversionNameNotBetween(String value1, String value2) {
            addCriterion("bversion_name not between", value1, value2, "bversionName");
            return (Criteria) this;
        }

        public Criteria andPdtNameIsNull() {
            addCriterion("pdt_name is null");
            return (Criteria) this;
        }

        public Criteria andPdtNameIsNotNull() {
            addCriterion("pdt_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdtNameEqualTo(String value) {
            addCriterion("pdt_name =", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotEqualTo(String value) {
            addCriterion("pdt_name <>", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameGreaterThan(String value) {
            addCriterion("pdt_name >", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdt_name >=", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLessThan(String value) {
            addCriterion("pdt_name <", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLessThanOrEqualTo(String value) {
            addCriterion("pdt_name <=", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameLike(String value) {
            addCriterion("pdt_name like", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotLike(String value) {
            addCriterion("pdt_name not like", value, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameIn(List<String> values) {
            addCriterion("pdt_name in", values, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotIn(List<String> values) {
            addCriterion("pdt_name not in", values, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameBetween(String value1, String value2) {
            addCriterion("pdt_name between", value1, value2, "pdtName");
            return (Criteria) this;
        }

        public Criteria andPdtNameNotBetween(String value1, String value2) {
            addCriterion("pdt_name not between", value1, value2, "pdtName");
            return (Criteria) this;
        }

        public Criteria andProlineNameIsNull() {
            addCriterion("proline_name is null");
            return (Criteria) this;
        }

        public Criteria andProlineNameIsNotNull() {
            addCriterion("proline_name is not null");
            return (Criteria) this;
        }

        public Criteria andProlineNameEqualTo(String value) {
            addCriterion("proline_name =", value, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameNotEqualTo(String value) {
            addCriterion("proline_name <>", value, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameGreaterThan(String value) {
            addCriterion("proline_name >", value, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("proline_name >=", value, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameLessThan(String value) {
            addCriterion("proline_name <", value, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameLessThanOrEqualTo(String value) {
            addCriterion("proline_name <=", value, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameLike(String value) {
            addCriterion("proline_name like", value, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameNotLike(String value) {
            addCriterion("proline_name not like", value, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameIn(List<String> values) {
            addCriterion("proline_name in", values, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameNotIn(List<String> values) {
            addCriterion("proline_name not in", values, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameBetween(String value1, String value2) {
            addCriterion("proline_name between", value1, value2, "prolineName");
            return (Criteria) this;
        }

        public Criteria andProlineNameNotBetween(String value1, String value2) {
            addCriterion("proline_name not between", value1, value2, "prolineName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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