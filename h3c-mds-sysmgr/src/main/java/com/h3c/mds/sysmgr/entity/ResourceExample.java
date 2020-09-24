package com.h3c.mds.sysmgr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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

        public Criteria andHresIdIsNull() {
            addCriterion("HRES_ID is null");
            return (Criteria) this;
        }

        public Criteria andHresIdIsNotNull() {
            addCriterion("HRES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHresIdEqualTo(Integer value) {
            addCriterion("HRES_ID =", value, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdNotEqualTo(Integer value) {
            addCriterion("HRES_ID <>", value, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdGreaterThan(Integer value) {
            addCriterion("HRES_ID >", value, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HRES_ID >=", value, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdLessThan(Integer value) {
            addCriterion("HRES_ID <", value, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdLessThanOrEqualTo(Integer value) {
            addCriterion("HRES_ID <=", value, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdIn(List<Integer> values) {
            addCriterion("HRES_ID in", values, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdNotIn(List<Integer> values) {
            addCriterion("HRES_ID not in", values, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdBetween(Integer value1, Integer value2) {
            addCriterion("HRES_ID between", value1, value2, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HRES_ID not between", value1, value2, "hresId");
            return (Criteria) this;
        }

        public Criteria andHresPcodeIsNull() {
            addCriterion("HRES_PCODE is null");
            return (Criteria) this;
        }

        public Criteria andHresPcodeIsNotNull() {
            addCriterion("HRES_PCODE is not null");
            return (Criteria) this;
        }

        public Criteria andHresPcodeEqualTo(String value) {
            addCriterion("HRES_PCODE =", value, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeNotEqualTo(String value) {
            addCriterion("HRES_PCODE <>", value, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeGreaterThan(String value) {
            addCriterion("HRES_PCODE >", value, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeGreaterThanOrEqualTo(String value) {
            addCriterion("HRES_PCODE >=", value, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeLessThan(String value) {
            addCriterion("HRES_PCODE <", value, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeLessThanOrEqualTo(String value) {
            addCriterion("HRES_PCODE <=", value, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeLike(String value) {
            addCriterion("HRES_PCODE like", value, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeNotLike(String value) {
            addCriterion("HRES_PCODE not like", value, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeIn(List<String> values) {
            addCriterion("HRES_PCODE in", values, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeNotIn(List<String> values) {
            addCriterion("HRES_PCODE not in", values, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeBetween(String value1, String value2) {
            addCriterion("HRES_PCODE between", value1, value2, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresPcodeNotBetween(String value1, String value2) {
            addCriterion("HRES_PCODE not between", value1, value2, "hresPcode");
            return (Criteria) this;
        }

        public Criteria andHresNameIsNull() {
            addCriterion("HRES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHresNameIsNotNull() {
            addCriterion("HRES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHresNameEqualTo(String value) {
            addCriterion("HRES_NAME =", value, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameNotEqualTo(String value) {
            addCriterion("HRES_NAME <>", value, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameGreaterThan(String value) {
            addCriterion("HRES_NAME >", value, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameGreaterThanOrEqualTo(String value) {
            addCriterion("HRES_NAME >=", value, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameLessThan(String value) {
            addCriterion("HRES_NAME <", value, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameLessThanOrEqualTo(String value) {
            addCriterion("HRES_NAME <=", value, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameLike(String value) {
            addCriterion("HRES_NAME like", value, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameNotLike(String value) {
            addCriterion("HRES_NAME not like", value, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameIn(List<String> values) {
            addCriterion("HRES_NAME in", values, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameNotIn(List<String> values) {
            addCriterion("HRES_NAME not in", values, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameBetween(String value1, String value2) {
            addCriterion("HRES_NAME between", value1, value2, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresNameNotBetween(String value1, String value2) {
            addCriterion("HRES_NAME not between", value1, value2, "hresName");
            return (Criteria) this;
        }

        public Criteria andHresCodeIsNull() {
            addCriterion("HRES_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHresCodeIsNotNull() {
            addCriterion("HRES_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHresCodeEqualTo(String value) {
            addCriterion("HRES_CODE =", value, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeNotEqualTo(String value) {
            addCriterion("HRES_CODE <>", value, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeGreaterThan(String value) {
            addCriterion("HRES_CODE >", value, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HRES_CODE >=", value, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeLessThan(String value) {
            addCriterion("HRES_CODE <", value, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeLessThanOrEqualTo(String value) {
            addCriterion("HRES_CODE <=", value, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeLike(String value) {
            addCriterion("HRES_CODE like", value, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeNotLike(String value) {
            addCriterion("HRES_CODE not like", value, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeIn(List<String> values) {
            addCriterion("HRES_CODE in", values, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeNotIn(List<String> values) {
            addCriterion("HRES_CODE not in", values, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeBetween(String value1, String value2) {
            addCriterion("HRES_CODE between", value1, value2, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresCodeNotBetween(String value1, String value2) {
            addCriterion("HRES_CODE not between", value1, value2, "hresCode");
            return (Criteria) this;
        }

        public Criteria andHresContentIsNull() {
            addCriterion("HRES_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andHresContentIsNotNull() {
            addCriterion("HRES_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andHresContentEqualTo(String value) {
            addCriterion("HRES_CONTENT =", value, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentNotEqualTo(String value) {
            addCriterion("HRES_CONTENT <>", value, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentGreaterThan(String value) {
            addCriterion("HRES_CONTENT >", value, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentGreaterThanOrEqualTo(String value) {
            addCriterion("HRES_CONTENT >=", value, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentLessThan(String value) {
            addCriterion("HRES_CONTENT <", value, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentLessThanOrEqualTo(String value) {
            addCriterion("HRES_CONTENT <=", value, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentLike(String value) {
            addCriterion("HRES_CONTENT like", value, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentNotLike(String value) {
            addCriterion("HRES_CONTENT not like", value, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentIn(List<String> values) {
            addCriterion("HRES_CONTENT in", values, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentNotIn(List<String> values) {
            addCriterion("HRES_CONTENT not in", values, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentBetween(String value1, String value2) {
            addCriterion("HRES_CONTENT between", value1, value2, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresContentNotBetween(String value1, String value2) {
            addCriterion("HRES_CONTENT not between", value1, value2, "hresContent");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserIsNull() {
            addCriterion("HRES_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserIsNotNull() {
            addCriterion("HRES_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserEqualTo(String value) {
            addCriterion("HRES_CREATE_USER =", value, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserNotEqualTo(String value) {
            addCriterion("HRES_CREATE_USER <>", value, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserGreaterThan(String value) {
            addCriterion("HRES_CREATE_USER >", value, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("HRES_CREATE_USER >=", value, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserLessThan(String value) {
            addCriterion("HRES_CREATE_USER <", value, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserLessThanOrEqualTo(String value) {
            addCriterion("HRES_CREATE_USER <=", value, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserLike(String value) {
            addCriterion("HRES_CREATE_USER like", value, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserNotLike(String value) {
            addCriterion("HRES_CREATE_USER not like", value, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserIn(List<String> values) {
            addCriterion("HRES_CREATE_USER in", values, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserNotIn(List<String> values) {
            addCriterion("HRES_CREATE_USER not in", values, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserBetween(String value1, String value2) {
            addCriterion("HRES_CREATE_USER between", value1, value2, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateUserNotBetween(String value1, String value2) {
            addCriterion("HRES_CREATE_USER not between", value1, value2, "hresCreateUser");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateIsNull() {
            addCriterion("HRES_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateIsNotNull() {
            addCriterion("HRES_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateEqualTo(Date value) {
            addCriterion("HRES_CREATE_DATE =", value, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateNotEqualTo(Date value) {
            addCriterion("HRES_CREATE_DATE <>", value, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateGreaterThan(Date value) {
            addCriterion("HRES_CREATE_DATE >", value, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("HRES_CREATE_DATE >=", value, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateLessThan(Date value) {
            addCriterion("HRES_CREATE_DATE <", value, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("HRES_CREATE_DATE <=", value, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateIn(List<Date> values) {
            addCriterion("HRES_CREATE_DATE in", values, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateNotIn(List<Date> values) {
            addCriterion("HRES_CREATE_DATE not in", values, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateBetween(Date value1, Date value2) {
            addCriterion("HRES_CREATE_DATE between", value1, value2, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("HRES_CREATE_DATE not between", value1, value2, "hresCreateDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserIsNull() {
            addCriterion("HRES_MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserIsNotNull() {
            addCriterion("HRES_MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserEqualTo(String value) {
            addCriterion("HRES_MODIFY_USER =", value, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserNotEqualTo(String value) {
            addCriterion("HRES_MODIFY_USER <>", value, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserGreaterThan(String value) {
            addCriterion("HRES_MODIFY_USER >", value, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("HRES_MODIFY_USER >=", value, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserLessThan(String value) {
            addCriterion("HRES_MODIFY_USER <", value, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserLessThanOrEqualTo(String value) {
            addCriterion("HRES_MODIFY_USER <=", value, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserLike(String value) {
            addCriterion("HRES_MODIFY_USER like", value, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserNotLike(String value) {
            addCriterion("HRES_MODIFY_USER not like", value, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserIn(List<String> values) {
            addCriterion("HRES_MODIFY_USER in", values, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserNotIn(List<String> values) {
            addCriterion("HRES_MODIFY_USER not in", values, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserBetween(String value1, String value2) {
            addCriterion("HRES_MODIFY_USER between", value1, value2, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyUserNotBetween(String value1, String value2) {
            addCriterion("HRES_MODIFY_USER not between", value1, value2, "hresModifyUser");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateIsNull() {
            addCriterion("HRES_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateIsNotNull() {
            addCriterion("HRES_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateEqualTo(Date value) {
            addCriterion("HRES_MODIFY_DATE =", value, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateNotEqualTo(Date value) {
            addCriterion("HRES_MODIFY_DATE <>", value, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateGreaterThan(Date value) {
            addCriterion("HRES_MODIFY_DATE >", value, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("HRES_MODIFY_DATE >=", value, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateLessThan(Date value) {
            addCriterion("HRES_MODIFY_DATE <", value, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("HRES_MODIFY_DATE <=", value, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateIn(List<Date> values) {
            addCriterion("HRES_MODIFY_DATE in", values, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateNotIn(List<Date> values) {
            addCriterion("HRES_MODIFY_DATE not in", values, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateBetween(Date value1, Date value2) {
            addCriterion("HRES_MODIFY_DATE between", value1, value2, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("HRES_MODIFY_DATE not between", value1, value2, "hresModifyDate");
            return (Criteria) this;
        }

        public Criteria andHresSortIsNull() {
            addCriterion("HRES_SORT is null");
            return (Criteria) this;
        }

        public Criteria andHresSortIsNotNull() {
            addCriterion("HRES_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andHresSortEqualTo(Integer value) {
            addCriterion("HRES_SORT =", value, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortNotEqualTo(Integer value) {
            addCriterion("HRES_SORT <>", value, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortGreaterThan(Integer value) {
            addCriterion("HRES_SORT >", value, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("HRES_SORT >=", value, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortLessThan(Integer value) {
            addCriterion("HRES_SORT <", value, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortLessThanOrEqualTo(Integer value) {
            addCriterion("HRES_SORT <=", value, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortIn(List<Integer> values) {
            addCriterion("HRES_SORT in", values, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortNotIn(List<Integer> values) {
            addCriterion("HRES_SORT not in", values, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortBetween(Integer value1, Integer value2) {
            addCriterion("HRES_SORT between", value1, value2, "hresSort");
            return (Criteria) this;
        }

        public Criteria andHresSortNotBetween(Integer value1, Integer value2) {
            addCriterion("HRES_SORT not between", value1, value2, "hresSort");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("RESOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("RESOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("RESOURCE_TYPE =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("RESOURCE_TYPE >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("RESOURCE_TYPE <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("RESOURCE_TYPE like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("RESOURCE_TYPE not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("RESOURCE_TYPE in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("RESOURCE_TYPE not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("IsShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("IsShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(String value) {
            addCriterion("IsShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(String value) {
            addCriterion("IsShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(String value) {
            addCriterion("IsShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(String value) {
            addCriterion("IsShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(String value) {
            addCriterion("IsShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(String value) {
            addCriterion("IsShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLike(String value) {
            addCriterion("IsShow like", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotLike(String value) {
            addCriterion("IsShow not like", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<String> values) {
            addCriterion("IsShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<String> values) {
            addCriterion("IsShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(String value1, String value2) {
            addCriterion("IsShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(String value1, String value2) {
            addCriterion("IsShow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andHresTypeIsNull() {
            addCriterion("HRES_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHresTypeIsNotNull() {
            addCriterion("HRES_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHresTypeEqualTo(String value) {
            addCriterion("HRES_TYPE =", value, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeNotEqualTo(String value) {
            addCriterion("HRES_TYPE <>", value, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeGreaterThan(String value) {
            addCriterion("HRES_TYPE >", value, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HRES_TYPE >=", value, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeLessThan(String value) {
            addCriterion("HRES_TYPE <", value, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeLessThanOrEqualTo(String value) {
            addCriterion("HRES_TYPE <=", value, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeLike(String value) {
            addCriterion("HRES_TYPE like", value, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeNotLike(String value) {
            addCriterion("HRES_TYPE not like", value, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeIn(List<String> values) {
            addCriterion("HRES_TYPE in", values, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeNotIn(List<String> values) {
            addCriterion("HRES_TYPE not in", values, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeBetween(String value1, String value2) {
            addCriterion("HRES_TYPE between", value1, value2, "hresType");
            return (Criteria) this;
        }

        public Criteria andHresTypeNotBetween(String value1, String value2) {
            addCriterion("HRES_TYPE not between", value1, value2, "hresType");
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