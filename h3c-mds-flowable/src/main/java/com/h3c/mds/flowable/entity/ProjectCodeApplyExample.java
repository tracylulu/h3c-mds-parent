package com.h3c.mds.flowable.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectCodeApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectCodeApplyExample() {
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

        public Criteria andProCaIsNull() {
            addCriterion("pro_ca is null");
            return (Criteria) this;
        }

        public Criteria andProCaIsNotNull() {
            addCriterion("pro_ca is not null");
            return (Criteria) this;
        }

        public Criteria andProCaEqualTo(String value) {
            addCriterion("pro_ca =", value, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaNotEqualTo(String value) {
            addCriterion("pro_ca <>", value, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaGreaterThan(String value) {
            addCriterion("pro_ca >", value, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaGreaterThanOrEqualTo(String value) {
            addCriterion("pro_ca >=", value, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaLessThan(String value) {
            addCriterion("pro_ca <", value, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaLessThanOrEqualTo(String value) {
            addCriterion("pro_ca <=", value, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaLike(String value) {
            addCriterion("pro_ca like", value, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaNotLike(String value) {
            addCriterion("pro_ca not like", value, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaIn(List<String> values) {
            addCriterion("pro_ca in", values, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaNotIn(List<String> values) {
            addCriterion("pro_ca not in", values, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaBetween(String value1, String value2) {
            addCriterion("pro_ca between", value1, value2, "proCa");
            return (Criteria) this;
        }

        public Criteria andProCaNotBetween(String value1, String value2) {
            addCriterion("pro_ca not between", value1, value2, "proCa");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoIsNull() {
            addCriterion("pro_prodline_no is null");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoIsNotNull() {
            addCriterion("pro_prodline_no is not null");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoEqualTo(String value) {
            addCriterion("pro_prodline_no =", value, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoNotEqualTo(String value) {
            addCriterion("pro_prodline_no <>", value, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoGreaterThan(String value) {
            addCriterion("pro_prodline_no >", value, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_prodline_no >=", value, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoLessThan(String value) {
            addCriterion("pro_prodline_no <", value, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoLessThanOrEqualTo(String value) {
            addCriterion("pro_prodline_no <=", value, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoLike(String value) {
            addCriterion("pro_prodline_no like", value, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoNotLike(String value) {
            addCriterion("pro_prodline_no not like", value, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoIn(List<String> values) {
            addCriterion("pro_prodline_no in", values, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoNotIn(List<String> values) {
            addCriterion("pro_prodline_no not in", values, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoBetween(String value1, String value2) {
            addCriterion("pro_prodline_no between", value1, value2, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProProdlineNoNotBetween(String value1, String value2) {
            addCriterion("pro_prodline_no not between", value1, value2, "proProdlineNo");
            return (Criteria) this;
        }

        public Criteria andProNoIsNull() {
            addCriterion("pro_no is null");
            return (Criteria) this;
        }

        public Criteria andProNoIsNotNull() {
            addCriterion("pro_no is not null");
            return (Criteria) this;
        }

        public Criteria andProNoEqualTo(String value) {
            addCriterion("pro_no =", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotEqualTo(String value) {
            addCriterion("pro_no <>", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThan(String value) {
            addCriterion("pro_no >", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_no >=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThan(String value) {
            addCriterion("pro_no <", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThanOrEqualTo(String value) {
            addCriterion("pro_no <=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLike(String value) {
            addCriterion("pro_no like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotLike(String value) {
            addCriterion("pro_no not like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoIn(List<String> values) {
            addCriterion("pro_no in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotIn(List<String> values) {
            addCriterion("pro_no not in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoBetween(String value1, String value2) {
            addCriterion("pro_no between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotBetween(String value1, String value2) {
            addCriterion("pro_no not between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andProManagerIsNull() {
            addCriterion("pro_manager is null");
            return (Criteria) this;
        }

        public Criteria andProManagerIsNotNull() {
            addCriterion("pro_manager is not null");
            return (Criteria) this;
        }

        public Criteria andProManagerEqualTo(String value) {
            addCriterion("pro_manager =", value, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerNotEqualTo(String value) {
            addCriterion("pro_manager <>", value, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerGreaterThan(String value) {
            addCriterion("pro_manager >", value, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerGreaterThanOrEqualTo(String value) {
            addCriterion("pro_manager >=", value, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerLessThan(String value) {
            addCriterion("pro_manager <", value, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerLessThanOrEqualTo(String value) {
            addCriterion("pro_manager <=", value, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerLike(String value) {
            addCriterion("pro_manager like", value, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerNotLike(String value) {
            addCriterion("pro_manager not like", value, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerIn(List<String> values) {
            addCriterion("pro_manager in", values, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerNotIn(List<String> values) {
            addCriterion("pro_manager not in", values, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerBetween(String value1, String value2) {
            addCriterion("pro_manager between", value1, value2, "proManager");
            return (Criteria) this;
        }

        public Criteria andProManagerNotBetween(String value1, String value2) {
            addCriterion("pro_manager not between", value1, value2, "proManager");
            return (Criteria) this;
        }

        public Criteria andProTimeIsNull() {
            addCriterion("pro_time is null");
            return (Criteria) this;
        }

        public Criteria andProTimeIsNotNull() {
            addCriterion("pro_time is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeEqualTo(Date value) {
            addCriterion("pro_time =", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotEqualTo(Date value) {
            addCriterion("pro_time <>", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeGreaterThan(Date value) {
            addCriterion("pro_time >", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_time >=", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeLessThan(Date value) {
            addCriterion("pro_time <", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeLessThanOrEqualTo(Date value) {
            addCriterion("pro_time <=", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeIn(List<Date> values) {
            addCriterion("pro_time in", values, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotIn(List<Date> values) {
            addCriterion("pro_time not in", values, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeBetween(Date value1, Date value2) {
            addCriterion("pro_time between", value1, value2, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotBetween(Date value1, Date value2) {
            addCriterion("pro_time not between", value1, value2, "proTime");
            return (Criteria) this;
        }

        public Criteria andProPointIsNull() {
            addCriterion("pro_point is null");
            return (Criteria) this;
        }

        public Criteria andProPointIsNotNull() {
            addCriterion("pro_point is not null");
            return (Criteria) this;
        }

        public Criteria andProPointEqualTo(String value) {
            addCriterion("pro_point =", value, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointNotEqualTo(String value) {
            addCriterion("pro_point <>", value, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointGreaterThan(String value) {
            addCriterion("pro_point >", value, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointGreaterThanOrEqualTo(String value) {
            addCriterion("pro_point >=", value, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointLessThan(String value) {
            addCriterion("pro_point <", value, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointLessThanOrEqualTo(String value) {
            addCriterion("pro_point <=", value, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointLike(String value) {
            addCriterion("pro_point like", value, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointNotLike(String value) {
            addCriterion("pro_point not like", value, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointIn(List<String> values) {
            addCriterion("pro_point in", values, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointNotIn(List<String> values) {
            addCriterion("pro_point not in", values, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointBetween(String value1, String value2) {
            addCriterion("pro_point between", value1, value2, "proPoint");
            return (Criteria) this;
        }

        public Criteria andProPointNotBetween(String value1, String value2) {
            addCriterion("pro_point not between", value1, value2, "proPoint");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andProbizhongIsNull() {
            addCriterion("Probizhong is null");
            return (Criteria) this;
        }

        public Criteria andProbizhongIsNotNull() {
            addCriterion("Probizhong is not null");
            return (Criteria) this;
        }

        public Criteria andProbizhongEqualTo(String value) {
            addCriterion("Probizhong =", value, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongNotEqualTo(String value) {
            addCriterion("Probizhong <>", value, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongGreaterThan(String value) {
            addCriterion("Probizhong >", value, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongGreaterThanOrEqualTo(String value) {
            addCriterion("Probizhong >=", value, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongLessThan(String value) {
            addCriterion("Probizhong <", value, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongLessThanOrEqualTo(String value) {
            addCriterion("Probizhong <=", value, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongLike(String value) {
            addCriterion("Probizhong like", value, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongNotLike(String value) {
            addCriterion("Probizhong not like", value, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongIn(List<String> values) {
            addCriterion("Probizhong in", values, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongNotIn(List<String> values) {
            addCriterion("Probizhong not in", values, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongBetween(String value1, String value2) {
            addCriterion("Probizhong between", value1, value2, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProbizhongNotBetween(String value1, String value2) {
            addCriterion("Probizhong not between", value1, value2, "probizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongIsNull() {
            addCriterion("Profbizhong is null");
            return (Criteria) this;
        }

        public Criteria andProfbizhongIsNotNull() {
            addCriterion("Profbizhong is not null");
            return (Criteria) this;
        }

        public Criteria andProfbizhongEqualTo(String value) {
            addCriterion("Profbizhong =", value, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongNotEqualTo(String value) {
            addCriterion("Profbizhong <>", value, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongGreaterThan(String value) {
            addCriterion("Profbizhong >", value, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongGreaterThanOrEqualTo(String value) {
            addCriterion("Profbizhong >=", value, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongLessThan(String value) {
            addCriterion("Profbizhong <", value, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongLessThanOrEqualTo(String value) {
            addCriterion("Profbizhong <=", value, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongLike(String value) {
            addCriterion("Profbizhong like", value, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongNotLike(String value) {
            addCriterion("Profbizhong not like", value, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongIn(List<String> values) {
            addCriterion("Profbizhong in", values, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongNotIn(List<String> values) {
            addCriterion("Profbizhong not in", values, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongBetween(String value1, String value2) {
            addCriterion("Profbizhong between", value1, value2, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andProfbizhongNotBetween(String value1, String value2) {
            addCriterion("Profbizhong not between", value1, value2, "profbizhong");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("modify_user is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("modify_user =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("modify_user <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("modify_user >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("modify_user <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("modify_user <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("modify_user like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("modify_user not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("modify_user in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("modify_user not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("modify_user between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("modify_user not between", value1, value2, "modifyUser");
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

        public Criteria andProductnumIsNull() {
            addCriterion("productNum is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("productNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(Integer value) {
            addCriterion("productNum =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(Integer value) {
            addCriterion("productNum <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(Integer value) {
            addCriterion("productNum >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("productNum >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(Integer value) {
            addCriterion("productNum <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(Integer value) {
            addCriterion("productNum <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<Integer> values) {
            addCriterion("productNum in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<Integer> values) {
            addCriterion("productNum not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(Integer value1, Integer value2) {
            addCriterion("productNum between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(Integer value1, Integer value2) {
            addCriterion("productNum not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNull() {
            addCriterion("apply_no is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(String value) {
            addCriterion("apply_no =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(String value) {
            addCriterion("apply_no <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(String value) {
            addCriterion("apply_no >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("apply_no >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(String value) {
            addCriterion("apply_no <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(String value) {
            addCriterion("apply_no <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLike(String value) {
            addCriterion("apply_no like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotLike(String value) {
            addCriterion("apply_no not like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<String> values) {
            addCriterion("apply_no in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<String> values) {
            addCriterion("apply_no not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(String value1, String value2) {
            addCriterion("apply_no between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(String value1, String value2) {
            addCriterion("apply_no not between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andOldProNameIsNull() {
            addCriterion("old_pro_name is null");
            return (Criteria) this;
        }

        public Criteria andOldProNameIsNotNull() {
            addCriterion("old_pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldProNameEqualTo(String value) {
            addCriterion("old_pro_name =", value, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameNotEqualTo(String value) {
            addCriterion("old_pro_name <>", value, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameGreaterThan(String value) {
            addCriterion("old_pro_name >", value, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_pro_name >=", value, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameLessThan(String value) {
            addCriterion("old_pro_name <", value, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameLessThanOrEqualTo(String value) {
            addCriterion("old_pro_name <=", value, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameLike(String value) {
            addCriterion("old_pro_name like", value, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameNotLike(String value) {
            addCriterion("old_pro_name not like", value, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameIn(List<String> values) {
            addCriterion("old_pro_name in", values, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameNotIn(List<String> values) {
            addCriterion("old_pro_name not in", values, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameBetween(String value1, String value2) {
            addCriterion("old_pro_name between", value1, value2, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNameNotBetween(String value1, String value2) {
            addCriterion("old_pro_name not between", value1, value2, "oldProName");
            return (Criteria) this;
        }

        public Criteria andOldProNumberIsNull() {
            addCriterion("old_pro_number is null");
            return (Criteria) this;
        }

        public Criteria andOldProNumberIsNotNull() {
            addCriterion("old_pro_number is not null");
            return (Criteria) this;
        }

        public Criteria andOldProNumberEqualTo(String value) {
            addCriterion("old_pro_number =", value, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberNotEqualTo(String value) {
            addCriterion("old_pro_number <>", value, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberGreaterThan(String value) {
            addCriterion("old_pro_number >", value, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberGreaterThanOrEqualTo(String value) {
            addCriterion("old_pro_number >=", value, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberLessThan(String value) {
            addCriterion("old_pro_number <", value, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberLessThanOrEqualTo(String value) {
            addCriterion("old_pro_number <=", value, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberLike(String value) {
            addCriterion("old_pro_number like", value, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberNotLike(String value) {
            addCriterion("old_pro_number not like", value, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberIn(List<String> values) {
            addCriterion("old_pro_number in", values, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberNotIn(List<String> values) {
            addCriterion("old_pro_number not in", values, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberBetween(String value1, String value2) {
            addCriterion("old_pro_number between", value1, value2, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProNumberNotBetween(String value1, String value2) {
            addCriterion("old_pro_number not between", value1, value2, "oldProNumber");
            return (Criteria) this;
        }

        public Criteria andOldProCaIsNull() {
            addCriterion("old_pro_ca is null");
            return (Criteria) this;
        }

        public Criteria andOldProCaIsNotNull() {
            addCriterion("old_pro_ca is not null");
            return (Criteria) this;
        }

        public Criteria andOldProCaEqualTo(String value) {
            addCriterion("old_pro_ca =", value, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaNotEqualTo(String value) {
            addCriterion("old_pro_ca <>", value, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaGreaterThan(String value) {
            addCriterion("old_pro_ca >", value, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaGreaterThanOrEqualTo(String value) {
            addCriterion("old_pro_ca >=", value, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaLessThan(String value) {
            addCriterion("old_pro_ca <", value, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaLessThanOrEqualTo(String value) {
            addCriterion("old_pro_ca <=", value, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaLike(String value) {
            addCriterion("old_pro_ca like", value, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaNotLike(String value) {
            addCriterion("old_pro_ca not like", value, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaIn(List<String> values) {
            addCriterion("old_pro_ca in", values, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaNotIn(List<String> values) {
            addCriterion("old_pro_ca not in", values, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaBetween(String value1, String value2) {
            addCriterion("old_pro_ca between", value1, value2, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProCaNotBetween(String value1, String value2) {
            addCriterion("old_pro_ca not between", value1, value2, "oldProCa");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoIsNull() {
            addCriterion("old_pro_prodline_no is null");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoIsNotNull() {
            addCriterion("old_pro_prodline_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoEqualTo(String value) {
            addCriterion("old_pro_prodline_no =", value, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoNotEqualTo(String value) {
            addCriterion("old_pro_prodline_no <>", value, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoGreaterThan(String value) {
            addCriterion("old_pro_prodline_no >", value, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoGreaterThanOrEqualTo(String value) {
            addCriterion("old_pro_prodline_no >=", value, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoLessThan(String value) {
            addCriterion("old_pro_prodline_no <", value, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoLessThanOrEqualTo(String value) {
            addCriterion("old_pro_prodline_no <=", value, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoLike(String value) {
            addCriterion("old_pro_prodline_no like", value, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoNotLike(String value) {
            addCriterion("old_pro_prodline_no not like", value, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoIn(List<String> values) {
            addCriterion("old_pro_prodline_no in", values, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoNotIn(List<String> values) {
            addCriterion("old_pro_prodline_no not in", values, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoBetween(String value1, String value2) {
            addCriterion("old_pro_prodline_no between", value1, value2, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNoNotBetween(String value1, String value2) {
            addCriterion("old_pro_prodline_no not between", value1, value2, "oldProProdlineNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoIsNull() {
            addCriterion("old_pro_no is null");
            return (Criteria) this;
        }

        public Criteria andOldProNoIsNotNull() {
            addCriterion("old_pro_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldProNoEqualTo(String value) {
            addCriterion("old_pro_no =", value, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoNotEqualTo(String value) {
            addCriterion("old_pro_no <>", value, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoGreaterThan(String value) {
            addCriterion("old_pro_no >", value, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoGreaterThanOrEqualTo(String value) {
            addCriterion("old_pro_no >=", value, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoLessThan(String value) {
            addCriterion("old_pro_no <", value, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoLessThanOrEqualTo(String value) {
            addCriterion("old_pro_no <=", value, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoLike(String value) {
            addCriterion("old_pro_no like", value, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoNotLike(String value) {
            addCriterion("old_pro_no not like", value, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoIn(List<String> values) {
            addCriterion("old_pro_no in", values, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoNotIn(List<String> values) {
            addCriterion("old_pro_no not in", values, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoBetween(String value1, String value2) {
            addCriterion("old_pro_no between", value1, value2, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProNoNotBetween(String value1, String value2) {
            addCriterion("old_pro_no not between", value1, value2, "oldProNo");
            return (Criteria) this;
        }

        public Criteria andOldProManagerIsNull() {
            addCriterion("old_pro_manager is null");
            return (Criteria) this;
        }

        public Criteria andOldProManagerIsNotNull() {
            addCriterion("old_pro_manager is not null");
            return (Criteria) this;
        }

        public Criteria andOldProManagerEqualTo(String value) {
            addCriterion("old_pro_manager =", value, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerNotEqualTo(String value) {
            addCriterion("old_pro_manager <>", value, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerGreaterThan(String value) {
            addCriterion("old_pro_manager >", value, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerGreaterThanOrEqualTo(String value) {
            addCriterion("old_pro_manager >=", value, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerLessThan(String value) {
            addCriterion("old_pro_manager <", value, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerLessThanOrEqualTo(String value) {
            addCriterion("old_pro_manager <=", value, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerLike(String value) {
            addCriterion("old_pro_manager like", value, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerNotLike(String value) {
            addCriterion("old_pro_manager not like", value, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerIn(List<String> values) {
            addCriterion("old_pro_manager in", values, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerNotIn(List<String> values) {
            addCriterion("old_pro_manager not in", values, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerBetween(String value1, String value2) {
            addCriterion("old_pro_manager between", value1, value2, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldProManagerNotBetween(String value1, String value2) {
            addCriterion("old_pro_manager not between", value1, value2, "oldProManager");
            return (Criteria) this;
        }

        public Criteria andOldVersionIsNull() {
            addCriterion("old_version is null");
            return (Criteria) this;
        }

        public Criteria andOldVersionIsNotNull() {
            addCriterion("old_version is not null");
            return (Criteria) this;
        }

        public Criteria andOldVersionEqualTo(String value) {
            addCriterion("old_version =", value, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionNotEqualTo(String value) {
            addCriterion("old_version <>", value, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionGreaterThan(String value) {
            addCriterion("old_version >", value, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionGreaterThanOrEqualTo(String value) {
            addCriterion("old_version >=", value, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionLessThan(String value) {
            addCriterion("old_version <", value, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionLessThanOrEqualTo(String value) {
            addCriterion("old_version <=", value, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionLike(String value) {
            addCriterion("old_version like", value, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionNotLike(String value) {
            addCriterion("old_version not like", value, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionIn(List<String> values) {
            addCriterion("old_version in", values, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionNotIn(List<String> values) {
            addCriterion("old_version not in", values, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionBetween(String value1, String value2) {
            addCriterion("old_version between", value1, value2, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldVersionNotBetween(String value1, String value2) {
            addCriterion("old_version not between", value1, value2, "oldVersion");
            return (Criteria) this;
        }

        public Criteria andOldProfileIsNull() {
            addCriterion("old_ProFile is null");
            return (Criteria) this;
        }

        public Criteria andOldProfileIsNotNull() {
            addCriterion("old_ProFile is not null");
            return (Criteria) this;
        }

        public Criteria andOldProfileEqualTo(String value) {
            addCriterion("old_ProFile =", value, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileNotEqualTo(String value) {
            addCriterion("old_ProFile <>", value, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileGreaterThan(String value) {
            addCriterion("old_ProFile >", value, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileGreaterThanOrEqualTo(String value) {
            addCriterion("old_ProFile >=", value, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileLessThan(String value) {
            addCriterion("old_ProFile <", value, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileLessThanOrEqualTo(String value) {
            addCriterion("old_ProFile <=", value, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileLike(String value) {
            addCriterion("old_ProFile like", value, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileNotLike(String value) {
            addCriterion("old_ProFile not like", value, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileIn(List<String> values) {
            addCriterion("old_ProFile in", values, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileNotIn(List<String> values) {
            addCriterion("old_ProFile not in", values, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileBetween(String value1, String value2) {
            addCriterion("old_ProFile between", value1, value2, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andOldProfileNotBetween(String value1, String value2) {
            addCriterion("old_ProFile not between", value1, value2, "oldProfile");
            return (Criteria) this;
        }

        public Criteria andProCaNameIsNull() {
            addCriterion("pro_ca_name is null");
            return (Criteria) this;
        }

        public Criteria andProCaNameIsNotNull() {
            addCriterion("pro_ca_name is not null");
            return (Criteria) this;
        }

        public Criteria andProCaNameEqualTo(String value) {
            addCriterion("pro_ca_name =", value, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameNotEqualTo(String value) {
            addCriterion("pro_ca_name <>", value, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameGreaterThan(String value) {
            addCriterion("pro_ca_name >", value, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_ca_name >=", value, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameLessThan(String value) {
            addCriterion("pro_ca_name <", value, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameLessThanOrEqualTo(String value) {
            addCriterion("pro_ca_name <=", value, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameLike(String value) {
            addCriterion("pro_ca_name like", value, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameNotLike(String value) {
            addCriterion("pro_ca_name not like", value, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameIn(List<String> values) {
            addCriterion("pro_ca_name in", values, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameNotIn(List<String> values) {
            addCriterion("pro_ca_name not in", values, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameBetween(String value1, String value2) {
            addCriterion("pro_ca_name between", value1, value2, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProCaNameNotBetween(String value1, String value2) {
            addCriterion("pro_ca_name not between", value1, value2, "proCaName");
            return (Criteria) this;
        }

        public Criteria andProPointNameIsNull() {
            addCriterion("pro_point_name is null");
            return (Criteria) this;
        }

        public Criteria andProPointNameIsNotNull() {
            addCriterion("pro_point_name is not null");
            return (Criteria) this;
        }

        public Criteria andProPointNameEqualTo(String value) {
            addCriterion("pro_point_name =", value, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameNotEqualTo(String value) {
            addCriterion("pro_point_name <>", value, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameGreaterThan(String value) {
            addCriterion("pro_point_name >", value, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_point_name >=", value, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameLessThan(String value) {
            addCriterion("pro_point_name <", value, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameLessThanOrEqualTo(String value) {
            addCriterion("pro_point_name <=", value, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameLike(String value) {
            addCriterion("pro_point_name like", value, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameNotLike(String value) {
            addCriterion("pro_point_name not like", value, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameIn(List<String> values) {
            addCriterion("pro_point_name in", values, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameNotIn(List<String> values) {
            addCriterion("pro_point_name not in", values, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameBetween(String value1, String value2) {
            addCriterion("pro_point_name between", value1, value2, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProPointNameNotBetween(String value1, String value2) {
            addCriterion("pro_point_name not between", value1, value2, "proPointName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameIsNull() {
            addCriterion("pro_prodline_name is null");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameIsNotNull() {
            addCriterion("pro_prodline_name is not null");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameEqualTo(String value) {
            addCriterion("pro_prodline_name =", value, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameNotEqualTo(String value) {
            addCriterion("pro_prodline_name <>", value, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameGreaterThan(String value) {
            addCriterion("pro_prodline_name >", value, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_prodline_name >=", value, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameLessThan(String value) {
            addCriterion("pro_prodline_name <", value, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameLessThanOrEqualTo(String value) {
            addCriterion("pro_prodline_name <=", value, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameLike(String value) {
            addCriterion("pro_prodline_name like", value, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameNotLike(String value) {
            addCriterion("pro_prodline_name not like", value, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameIn(List<String> values) {
            addCriterion("pro_prodline_name in", values, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameNotIn(List<String> values) {
            addCriterion("pro_prodline_name not in", values, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameBetween(String value1, String value2) {
            addCriterion("pro_prodline_name between", value1, value2, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andProProdlineNameNotBetween(String value1, String value2) {
            addCriterion("pro_prodline_name not between", value1, value2, "proProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongIsNull() {
            addCriterion("old_probizhong is null");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongIsNotNull() {
            addCriterion("old_probizhong is not null");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongEqualTo(String value) {
            addCriterion("old_probizhong =", value, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongNotEqualTo(String value) {
            addCriterion("old_probizhong <>", value, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongGreaterThan(String value) {
            addCriterion("old_probizhong >", value, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongGreaterThanOrEqualTo(String value) {
            addCriterion("old_probizhong >=", value, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongLessThan(String value) {
            addCriterion("old_probizhong <", value, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongLessThanOrEqualTo(String value) {
            addCriterion("old_probizhong <=", value, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongLike(String value) {
            addCriterion("old_probizhong like", value, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongNotLike(String value) {
            addCriterion("old_probizhong not like", value, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongIn(List<String> values) {
            addCriterion("old_probizhong in", values, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongNotIn(List<String> values) {
            addCriterion("old_probizhong not in", values, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongBetween(String value1, String value2) {
            addCriterion("old_probizhong between", value1, value2, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProbizhongNotBetween(String value1, String value2) {
            addCriterion("old_probizhong not between", value1, value2, "oldProbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongIsNull() {
            addCriterion("old_profbizhong is null");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongIsNotNull() {
            addCriterion("old_profbizhong is not null");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongEqualTo(String value) {
            addCriterion("old_profbizhong =", value, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongNotEqualTo(String value) {
            addCriterion("old_profbizhong <>", value, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongGreaterThan(String value) {
            addCriterion("old_profbizhong >", value, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongGreaterThanOrEqualTo(String value) {
            addCriterion("old_profbizhong >=", value, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongLessThan(String value) {
            addCriterion("old_profbizhong <", value, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongLessThanOrEqualTo(String value) {
            addCriterion("old_profbizhong <=", value, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongLike(String value) {
            addCriterion("old_profbizhong like", value, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongNotLike(String value) {
            addCriterion("old_profbizhong not like", value, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongIn(List<String> values) {
            addCriterion("old_profbizhong in", values, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongNotIn(List<String> values) {
            addCriterion("old_profbizhong not in", values, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongBetween(String value1, String value2) {
            addCriterion("old_profbizhong between", value1, value2, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProfbizhongNotBetween(String value1, String value2) {
            addCriterion("old_profbizhong not between", value1, value2, "oldProfbizhong");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameIsNull() {
            addCriterion("old_pro_prodline_name is null");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameIsNotNull() {
            addCriterion("old_pro_prodline_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameEqualTo(String value) {
            addCriterion("old_pro_prodline_name =", value, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameNotEqualTo(String value) {
            addCriterion("old_pro_prodline_name <>", value, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameGreaterThan(String value) {
            addCriterion("old_pro_prodline_name >", value, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_pro_prodline_name >=", value, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameLessThan(String value) {
            addCriterion("old_pro_prodline_name <", value, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameLessThanOrEqualTo(String value) {
            addCriterion("old_pro_prodline_name <=", value, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameLike(String value) {
            addCriterion("old_pro_prodline_name like", value, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameNotLike(String value) {
            addCriterion("old_pro_prodline_name not like", value, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameIn(List<String> values) {
            addCriterion("old_pro_prodline_name in", values, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameNotIn(List<String> values) {
            addCriterion("old_pro_prodline_name not in", values, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameBetween(String value1, String value2) {
            addCriterion("old_pro_prodline_name between", value1, value2, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProProdlineNameNotBetween(String value1, String value2) {
            addCriterion("old_pro_prodline_name not between", value1, value2, "oldProProdlineName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameIsNull() {
            addCriterion("old_pro_ca_name is null");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameIsNotNull() {
            addCriterion("old_pro_ca_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameEqualTo(String value) {
            addCriterion("old_pro_ca_name =", value, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameNotEqualTo(String value) {
            addCriterion("old_pro_ca_name <>", value, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameGreaterThan(String value) {
            addCriterion("old_pro_ca_name >", value, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_pro_ca_name >=", value, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameLessThan(String value) {
            addCriterion("old_pro_ca_name <", value, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameLessThanOrEqualTo(String value) {
            addCriterion("old_pro_ca_name <=", value, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameLike(String value) {
            addCriterion("old_pro_ca_name like", value, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameNotLike(String value) {
            addCriterion("old_pro_ca_name not like", value, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameIn(List<String> values) {
            addCriterion("old_pro_ca_name in", values, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameNotIn(List<String> values) {
            addCriterion("old_pro_ca_name not in", values, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameBetween(String value1, String value2) {
            addCriterion("old_pro_ca_name between", value1, value2, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProCaNameNotBetween(String value1, String value2) {
            addCriterion("old_pro_ca_name not between", value1, value2, "oldProCaName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdIsNull() {
            addCriterion("old_projcode_id is null");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdIsNotNull() {
            addCriterion("old_projcode_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdEqualTo(Integer value) {
            addCriterion("old_projcode_id =", value, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdNotEqualTo(Integer value) {
            addCriterion("old_projcode_id <>", value, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdGreaterThan(Integer value) {
            addCriterion("old_projcode_id >", value, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_projcode_id >=", value, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdLessThan(Integer value) {
            addCriterion("old_projcode_id <", value, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("old_projcode_id <=", value, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdIn(List<Integer> values) {
            addCriterion("old_projcode_id in", values, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdNotIn(List<Integer> values) {
            addCriterion("old_projcode_id not in", values, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdBetween(Integer value1, Integer value2) {
            addCriterion("old_projcode_id between", value1, value2, "oldProjcodeId");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("old_projcode_id not between", value1, value2, "oldProjcodeId");
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

        public Criteria andBversionNoIsNull() {
            addCriterion("bversion_no is null");
            return (Criteria) this;
        }

        public Criteria andBversionNoIsNotNull() {
            addCriterion("bversion_no is not null");
            return (Criteria) this;
        }

        public Criteria andBversionNoEqualTo(String value) {
            addCriterion("bversion_no =", value, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoNotEqualTo(String value) {
            addCriterion("bversion_no <>", value, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoGreaterThan(String value) {
            addCriterion("bversion_no >", value, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoGreaterThanOrEqualTo(String value) {
            addCriterion("bversion_no >=", value, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoLessThan(String value) {
            addCriterion("bversion_no <", value, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoLessThanOrEqualTo(String value) {
            addCriterion("bversion_no <=", value, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoLike(String value) {
            addCriterion("bversion_no like", value, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoNotLike(String value) {
            addCriterion("bversion_no not like", value, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoIn(List<String> values) {
            addCriterion("bversion_no in", values, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoNotIn(List<String> values) {
            addCriterion("bversion_no not in", values, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoBetween(String value1, String value2) {
            addCriterion("bversion_no between", value1, value2, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andBversionNoNotBetween(String value1, String value2) {
            addCriterion("bversion_no not between", value1, value2, "bversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoIsNull() {
            addCriterion("old_bversion_no is null");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoIsNotNull() {
            addCriterion("old_bversion_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoEqualTo(String value) {
            addCriterion("old_bversion_no =", value, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoNotEqualTo(String value) {
            addCriterion("old_bversion_no <>", value, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoGreaterThan(String value) {
            addCriterion("old_bversion_no >", value, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoGreaterThanOrEqualTo(String value) {
            addCriterion("old_bversion_no >=", value, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoLessThan(String value) {
            addCriterion("old_bversion_no <", value, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoLessThanOrEqualTo(String value) {
            addCriterion("old_bversion_no <=", value, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoLike(String value) {
            addCriterion("old_bversion_no like", value, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoNotLike(String value) {
            addCriterion("old_bversion_no not like", value, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoIn(List<String> values) {
            addCriterion("old_bversion_no in", values, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoNotIn(List<String> values) {
            addCriterion("old_bversion_no not in", values, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoBetween(String value1, String value2) {
            addCriterion("old_bversion_no between", value1, value2, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionNoNotBetween(String value1, String value2) {
            addCriterion("old_bversion_no not between", value1, value2, "oldBversionNo");
            return (Criteria) this;
        }

        public Criteria andOldBversionIsNull() {
            addCriterion("old_bversion is null");
            return (Criteria) this;
        }

        public Criteria andOldBversionIsNotNull() {
            addCriterion("old_bversion is not null");
            return (Criteria) this;
        }

        public Criteria andOldBversionEqualTo(String value) {
            addCriterion("old_bversion =", value, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionNotEqualTo(String value) {
            addCriterion("old_bversion <>", value, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionGreaterThan(String value) {
            addCriterion("old_bversion >", value, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionGreaterThanOrEqualTo(String value) {
            addCriterion("old_bversion >=", value, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionLessThan(String value) {
            addCriterion("old_bversion <", value, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionLessThanOrEqualTo(String value) {
            addCriterion("old_bversion <=", value, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionLike(String value) {
            addCriterion("old_bversion like", value, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionNotLike(String value) {
            addCriterion("old_bversion not like", value, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionIn(List<String> values) {
            addCriterion("old_bversion in", values, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionNotIn(List<String> values) {
            addCriterion("old_bversion not in", values, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionBetween(String value1, String value2) {
            addCriterion("old_bversion between", value1, value2, "oldBversion");
            return (Criteria) this;
        }

        public Criteria andOldBversionNotBetween(String value1, String value2) {
            addCriterion("old_bversion not between", value1, value2, "oldBversion");
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

        public Criteria andReleaseNoIsNull() {
            addCriterion("release_no is null");
            return (Criteria) this;
        }

        public Criteria andReleaseNoIsNotNull() {
            addCriterion("release_no is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseNoEqualTo(String value) {
            addCriterion("release_no =", value, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoNotEqualTo(String value) {
            addCriterion("release_no <>", value, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoGreaterThan(String value) {
            addCriterion("release_no >", value, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("release_no >=", value, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoLessThan(String value) {
            addCriterion("release_no <", value, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoLessThanOrEqualTo(String value) {
            addCriterion("release_no <=", value, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoLike(String value) {
            addCriterion("release_no like", value, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoNotLike(String value) {
            addCriterion("release_no not like", value, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoIn(List<String> values) {
            addCriterion("release_no in", values, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoNotIn(List<String> values) {
            addCriterion("release_no not in", values, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoBetween(String value1, String value2) {
            addCriterion("release_no between", value1, value2, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andReleaseNoNotBetween(String value1, String value2) {
            addCriterion("release_no not between", value1, value2, "releaseNo");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIsNull() {
            addCriterion("old_projcode is null");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIsNotNull() {
            addCriterion("old_projcode is not null");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeEqualTo(String value) {
            addCriterion("old_projcode =", value, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNotEqualTo(String value) {
            addCriterion("old_projcode <>", value, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeGreaterThan(String value) {
            addCriterion("old_projcode >", value, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeGreaterThanOrEqualTo(String value) {
            addCriterion("old_projcode >=", value, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeLessThan(String value) {
            addCriterion("old_projcode <", value, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeLessThanOrEqualTo(String value) {
            addCriterion("old_projcode <=", value, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeLike(String value) {
            addCriterion("old_projcode like", value, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNotLike(String value) {
            addCriterion("old_projcode not like", value, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeIn(List<String> values) {
            addCriterion("old_projcode in", values, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNotIn(List<String> values) {
            addCriterion("old_projcode not in", values, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeBetween(String value1, String value2) {
            addCriterion("old_projcode between", value1, value2, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNotBetween(String value1, String value2) {
            addCriterion("old_projcode not between", value1, value2, "oldProjcode");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameIsNull() {
            addCriterion("old_projcode_name is null");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameIsNotNull() {
            addCriterion("old_projcode_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameEqualTo(String value) {
            addCriterion("old_projcode_name =", value, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameNotEqualTo(String value) {
            addCriterion("old_projcode_name <>", value, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameGreaterThan(String value) {
            addCriterion("old_projcode_name >", value, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_projcode_name >=", value, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameLessThan(String value) {
            addCriterion("old_projcode_name <", value, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameLessThanOrEqualTo(String value) {
            addCriterion("old_projcode_name <=", value, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameLike(String value) {
            addCriterion("old_projcode_name like", value, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameNotLike(String value) {
            addCriterion("old_projcode_name not like", value, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameIn(List<String> values) {
            addCriterion("old_projcode_name in", values, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameNotIn(List<String> values) {
            addCriterion("old_projcode_name not in", values, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameBetween(String value1, String value2) {
            addCriterion("old_projcode_name between", value1, value2, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldProjcodeNameNotBetween(String value1, String value2) {
            addCriterion("old_projcode_name not between", value1, value2, "oldProjcodeName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoIsNull() {
            addCriterion("old_release_no is null");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoIsNotNull() {
            addCriterion("old_release_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoEqualTo(String value) {
            addCriterion("old_release_no =", value, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoNotEqualTo(String value) {
            addCriterion("old_release_no <>", value, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoGreaterThan(String value) {
            addCriterion("old_release_no >", value, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("old_release_no >=", value, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoLessThan(String value) {
            addCriterion("old_release_no <", value, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoLessThanOrEqualTo(String value) {
            addCriterion("old_release_no <=", value, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoLike(String value) {
            addCriterion("old_release_no like", value, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoNotLike(String value) {
            addCriterion("old_release_no not like", value, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoIn(List<String> values) {
            addCriterion("old_release_no in", values, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoNotIn(List<String> values) {
            addCriterion("old_release_no not in", values, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoBetween(String value1, String value2) {
            addCriterion("old_release_no between", value1, value2, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNoNotBetween(String value1, String value2) {
            addCriterion("old_release_no not between", value1, value2, "oldReleaseNo");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameIsNull() {
            addCriterion("old_release_name is null");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameIsNotNull() {
            addCriterion("old_release_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameEqualTo(String value) {
            addCriterion("old_release_name =", value, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameNotEqualTo(String value) {
            addCriterion("old_release_name <>", value, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameGreaterThan(String value) {
            addCriterion("old_release_name >", value, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_release_name >=", value, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameLessThan(String value) {
            addCriterion("old_release_name <", value, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameLessThanOrEqualTo(String value) {
            addCriterion("old_release_name <=", value, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameLike(String value) {
            addCriterion("old_release_name like", value, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameNotLike(String value) {
            addCriterion("old_release_name not like", value, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameIn(List<String> values) {
            addCriterion("old_release_name in", values, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameNotIn(List<String> values) {
            addCriterion("old_release_name not in", values, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameBetween(String value1, String value2) {
            addCriterion("old_release_name between", value1, value2, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andOldReleaseNameNotBetween(String value1, String value2) {
            addCriterion("old_release_name not between", value1, value2, "oldReleaseName");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIsNull() {
            addCriterion("BASIS_MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIsNotNull() {
            addCriterion("BASIS_MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialEqualTo(String value) {
            addCriterion("BASIS_MATERIAL =", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialNotEqualTo(String value) {
            addCriterion("BASIS_MATERIAL <>", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialGreaterThan(String value) {
            addCriterion("BASIS_MATERIAL >", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("BASIS_MATERIAL >=", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialLessThan(String value) {
            addCriterion("BASIS_MATERIAL <", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialLessThanOrEqualTo(String value) {
            addCriterion("BASIS_MATERIAL <=", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialLike(String value) {
            addCriterion("BASIS_MATERIAL like", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialNotLike(String value) {
            addCriterion("BASIS_MATERIAL not like", value, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIn(List<String> values) {
            addCriterion("BASIS_MATERIAL in", values, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialNotIn(List<String> values) {
            addCriterion("BASIS_MATERIAL not in", values, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialBetween(String value1, String value2) {
            addCriterion("BASIS_MATERIAL between", value1, value2, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialNotBetween(String value1, String value2) {
            addCriterion("BASIS_MATERIAL not between", value1, value2, "basisMaterial");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdIsNull() {
            addCriterion("BASIS_MATERIAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdIsNotNull() {
            addCriterion("BASIS_MATERIAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdEqualTo(String value) {
            addCriterion("BASIS_MATERIAL_ID =", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdNotEqualTo(String value) {
            addCriterion("BASIS_MATERIAL_ID <>", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdGreaterThan(String value) {
            addCriterion("BASIS_MATERIAL_ID >", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdGreaterThanOrEqualTo(String value) {
            addCriterion("BASIS_MATERIAL_ID >=", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdLessThan(String value) {
            addCriterion("BASIS_MATERIAL_ID <", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdLessThanOrEqualTo(String value) {
            addCriterion("BASIS_MATERIAL_ID <=", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdLike(String value) {
            addCriterion("BASIS_MATERIAL_ID like", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdNotLike(String value) {
            addCriterion("BASIS_MATERIAL_ID not like", value, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdIn(List<String> values) {
            addCriterion("BASIS_MATERIAL_ID in", values, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdNotIn(List<String> values) {
            addCriterion("BASIS_MATERIAL_ID not in", values, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdBetween(String value1, String value2) {
            addCriterion("BASIS_MATERIAL_ID between", value1, value2, "basisMaterialId");
            return (Criteria) this;
        }

        public Criteria andBasisMaterialIdNotBetween(String value1, String value2) {
            addCriterion("BASIS_MATERIAL_ID not between", value1, value2, "basisMaterialId");
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