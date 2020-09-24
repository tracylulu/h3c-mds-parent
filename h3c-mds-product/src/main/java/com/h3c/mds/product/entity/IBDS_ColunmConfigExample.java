package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IBDS_ColunmConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IBDS_ColunmConfigExample() {
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

        public Criteria andColumncodeIsNull() {
            addCriterion("ColumnCode is null");
            return (Criteria) this;
        }

        public Criteria andColumncodeIsNotNull() {
            addCriterion("ColumnCode is not null");
            return (Criteria) this;
        }

        public Criteria andColumncodeEqualTo(String value) {
            addCriterion("ColumnCode =", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotEqualTo(String value) {
            addCriterion("ColumnCode <>", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeGreaterThan(String value) {
            addCriterion("ColumnCode >", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeGreaterThanOrEqualTo(String value) {
            addCriterion("ColumnCode >=", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLessThan(String value) {
            addCriterion("ColumnCode <", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLessThanOrEqualTo(String value) {
            addCriterion("ColumnCode <=", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLike(String value) {
            addCriterion("ColumnCode like", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotLike(String value) {
            addCriterion("ColumnCode not like", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeIn(List<String> values) {
            addCriterion("ColumnCode in", values, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotIn(List<String> values) {
            addCriterion("ColumnCode not in", values, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeBetween(String value1, String value2) {
            addCriterion("ColumnCode between", value1, value2, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotBetween(String value1, String value2) {
            addCriterion("ColumnCode not between", value1, value2, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumnnameIsNull() {
            addCriterion("ColumnName is null");
            return (Criteria) this;
        }

        public Criteria andColumnnameIsNotNull() {
            addCriterion("ColumnName is not null");
            return (Criteria) this;
        }

        public Criteria andColumnnameEqualTo(String value) {
            addCriterion("ColumnName =", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotEqualTo(String value) {
            addCriterion("ColumnName <>", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameGreaterThan(String value) {
            addCriterion("ColumnName >", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameGreaterThanOrEqualTo(String value) {
            addCriterion("ColumnName >=", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLessThan(String value) {
            addCriterion("ColumnName <", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLessThanOrEqualTo(String value) {
            addCriterion("ColumnName <=", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLike(String value) {
            addCriterion("ColumnName like", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotLike(String value) {
            addCriterion("ColumnName not like", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameIn(List<String> values) {
            addCriterion("ColumnName in", values, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotIn(List<String> values) {
            addCriterion("ColumnName not in", values, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameBetween(String value1, String value2) {
            addCriterion("ColumnName between", value1, value2, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotBetween(String value1, String value2) {
            addCriterion("ColumnName not between", value1, value2, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumngroupIsNull() {
            addCriterion("ColumnGroup is null");
            return (Criteria) this;
        }

        public Criteria andColumngroupIsNotNull() {
            addCriterion("ColumnGroup is not null");
            return (Criteria) this;
        }

        public Criteria andColumngroupEqualTo(String value) {
            addCriterion("ColumnGroup =", value, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupNotEqualTo(String value) {
            addCriterion("ColumnGroup <>", value, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupGreaterThan(String value) {
            addCriterion("ColumnGroup >", value, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupGreaterThanOrEqualTo(String value) {
            addCriterion("ColumnGroup >=", value, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupLessThan(String value) {
            addCriterion("ColumnGroup <", value, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupLessThanOrEqualTo(String value) {
            addCriterion("ColumnGroup <=", value, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupLike(String value) {
            addCriterion("ColumnGroup like", value, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupNotLike(String value) {
            addCriterion("ColumnGroup not like", value, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupIn(List<String> values) {
            addCriterion("ColumnGroup in", values, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupNotIn(List<String> values) {
            addCriterion("ColumnGroup not in", values, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupBetween(String value1, String value2) {
            addCriterion("ColumnGroup between", value1, value2, "columngroup");
            return (Criteria) this;
        }

        public Criteria andColumngroupNotBetween(String value1, String value2) {
            addCriterion("ColumnGroup not between", value1, value2, "columngroup");
            return (Criteria) this;
        }

        public Criteria andGrouporderIsNull() {
            addCriterion("GroupOrder is null");
            return (Criteria) this;
        }

        public Criteria andGrouporderIsNotNull() {
            addCriterion("GroupOrder is not null");
            return (Criteria) this;
        }

        public Criteria andGrouporderEqualTo(Integer value) {
            addCriterion("GroupOrder =", value, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderNotEqualTo(Integer value) {
            addCriterion("GroupOrder <>", value, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderGreaterThan(Integer value) {
            addCriterion("GroupOrder >", value, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderGreaterThanOrEqualTo(Integer value) {
            addCriterion("GroupOrder >=", value, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderLessThan(Integer value) {
            addCriterion("GroupOrder <", value, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderLessThanOrEqualTo(Integer value) {
            addCriterion("GroupOrder <=", value, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderIn(List<Integer> values) {
            addCriterion("GroupOrder in", values, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderNotIn(List<Integer> values) {
            addCriterion("GroupOrder not in", values, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderBetween(Integer value1, Integer value2) {
            addCriterion("GroupOrder between", value1, value2, "grouporder");
            return (Criteria) this;
        }

        public Criteria andGrouporderNotBetween(Integer value1, Integer value2) {
            addCriterion("GroupOrder not between", value1, value2, "grouporder");
            return (Criteria) this;
        }

        public Criteria andQueryorderIsNull() {
            addCriterion("QueryOrder is null");
            return (Criteria) this;
        }

        public Criteria andQueryorderIsNotNull() {
            addCriterion("QueryOrder is not null");
            return (Criteria) this;
        }

        public Criteria andQueryorderEqualTo(Integer value) {
            addCriterion("QueryOrder =", value, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderNotEqualTo(Integer value) {
            addCriterion("QueryOrder <>", value, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderGreaterThan(Integer value) {
            addCriterion("QueryOrder >", value, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("QueryOrder >=", value, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderLessThan(Integer value) {
            addCriterion("QueryOrder <", value, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderLessThanOrEqualTo(Integer value) {
            addCriterion("QueryOrder <=", value, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderIn(List<Integer> values) {
            addCriterion("QueryOrder in", values, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderNotIn(List<Integer> values) {
            addCriterion("QueryOrder not in", values, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderBetween(Integer value1, Integer value2) {
            addCriterion("QueryOrder between", value1, value2, "queryorder");
            return (Criteria) this;
        }

        public Criteria andQueryorderNotBetween(Integer value1, Integer value2) {
            addCriterion("QueryOrder not between", value1, value2, "queryorder");
            return (Criteria) this;
        }

        public Criteria andAddorderIsNull() {
            addCriterion("AddOrder is null");
            return (Criteria) this;
        }

        public Criteria andAddorderIsNotNull() {
            addCriterion("AddOrder is not null");
            return (Criteria) this;
        }

        public Criteria andAddorderEqualTo(Integer value) {
            addCriterion("AddOrder =", value, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderNotEqualTo(Integer value) {
            addCriterion("AddOrder <>", value, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderGreaterThan(Integer value) {
            addCriterion("AddOrder >", value, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("AddOrder >=", value, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderLessThan(Integer value) {
            addCriterion("AddOrder <", value, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderLessThanOrEqualTo(Integer value) {
            addCriterion("AddOrder <=", value, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderIn(List<Integer> values) {
            addCriterion("AddOrder in", values, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderNotIn(List<Integer> values) {
            addCriterion("AddOrder not in", values, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderBetween(Integer value1, Integer value2) {
            addCriterion("AddOrder between", value1, value2, "addorder");
            return (Criteria) this;
        }

        public Criteria andAddorderNotBetween(Integer value1, Integer value2) {
            addCriterion("AddOrder not between", value1, value2, "addorder");
            return (Criteria) this;
        }

        public Criteria andEditorderIsNull() {
            addCriterion("EditOrder is null");
            return (Criteria) this;
        }

        public Criteria andEditorderIsNotNull() {
            addCriterion("EditOrder is not null");
            return (Criteria) this;
        }

        public Criteria andEditorderEqualTo(Integer value) {
            addCriterion("EditOrder =", value, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderNotEqualTo(Integer value) {
            addCriterion("EditOrder <>", value, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderGreaterThan(Integer value) {
            addCriterion("EditOrder >", value, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("EditOrder >=", value, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderLessThan(Integer value) {
            addCriterion("EditOrder <", value, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderLessThanOrEqualTo(Integer value) {
            addCriterion("EditOrder <=", value, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderIn(List<Integer> values) {
            addCriterion("EditOrder in", values, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderNotIn(List<Integer> values) {
            addCriterion("EditOrder not in", values, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderBetween(Integer value1, Integer value2) {
            addCriterion("EditOrder between", value1, value2, "editorder");
            return (Criteria) this;
        }

        public Criteria andEditorderNotBetween(Integer value1, Integer value2) {
            addCriterion("EditOrder not between", value1, value2, "editorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderIsNull() {
            addCriterion("ColumnOrder is null");
            return (Criteria) this;
        }

        public Criteria andColumnorderIsNotNull() {
            addCriterion("ColumnOrder is not null");
            return (Criteria) this;
        }

        public Criteria andColumnorderEqualTo(Integer value) {
            addCriterion("ColumnOrder =", value, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderNotEqualTo(Integer value) {
            addCriterion("ColumnOrder <>", value, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderGreaterThan(Integer value) {
            addCriterion("ColumnOrder >", value, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ColumnOrder >=", value, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderLessThan(Integer value) {
            addCriterion("ColumnOrder <", value, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderLessThanOrEqualTo(Integer value) {
            addCriterion("ColumnOrder <=", value, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderIn(List<Integer> values) {
            addCriterion("ColumnOrder in", values, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderNotIn(List<Integer> values) {
            addCriterion("ColumnOrder not in", values, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderBetween(Integer value1, Integer value2) {
            addCriterion("ColumnOrder between", value1, value2, "columnorder");
            return (Criteria) this;
        }

        public Criteria andColumnorderNotBetween(Integer value1, Integer value2) {
            addCriterion("ColumnOrder not between", value1, value2, "columnorder");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAddflagIsNull() {
            addCriterion("AddFlag is null");
            return (Criteria) this;
        }

        public Criteria andAddflagIsNotNull() {
            addCriterion("AddFlag is not null");
            return (Criteria) this;
        }

        public Criteria andAddflagEqualTo(Integer value) {
            addCriterion("AddFlag =", value, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagNotEqualTo(Integer value) {
            addCriterion("AddFlag <>", value, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagGreaterThan(Integer value) {
            addCriterion("AddFlag >", value, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("AddFlag >=", value, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagLessThan(Integer value) {
            addCriterion("AddFlag <", value, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagLessThanOrEqualTo(Integer value) {
            addCriterion("AddFlag <=", value, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagIn(List<Integer> values) {
            addCriterion("AddFlag in", values, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagNotIn(List<Integer> values) {
            addCriterion("AddFlag not in", values, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagBetween(Integer value1, Integer value2) {
            addCriterion("AddFlag between", value1, value2, "addflag");
            return (Criteria) this;
        }

        public Criteria andAddflagNotBetween(Integer value1, Integer value2) {
            addCriterion("AddFlag not between", value1, value2, "addflag");
            return (Criteria) this;
        }

        public Criteria andEditflagIsNull() {
            addCriterion("EditFlag is null");
            return (Criteria) this;
        }

        public Criteria andEditflagIsNotNull() {
            addCriterion("EditFlag is not null");
            return (Criteria) this;
        }

        public Criteria andEditflagEqualTo(Integer value) {
            addCriterion("EditFlag =", value, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagNotEqualTo(Integer value) {
            addCriterion("EditFlag <>", value, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagGreaterThan(Integer value) {
            addCriterion("EditFlag >", value, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("EditFlag >=", value, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagLessThan(Integer value) {
            addCriterion("EditFlag <", value, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagLessThanOrEqualTo(Integer value) {
            addCriterion("EditFlag <=", value, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagIn(List<Integer> values) {
            addCriterion("EditFlag in", values, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagNotIn(List<Integer> values) {
            addCriterion("EditFlag not in", values, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagBetween(Integer value1, Integer value2) {
            addCriterion("EditFlag between", value1, value2, "editflag");
            return (Criteria) this;
        }

        public Criteria andEditflagNotBetween(Integer value1, Integer value2) {
            addCriterion("EditFlag not between", value1, value2, "editflag");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("Flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andQueryflagIsNull() {
            addCriterion("QueryFlag is null");
            return (Criteria) this;
        }

        public Criteria andQueryflagIsNotNull() {
            addCriterion("QueryFlag is not null");
            return (Criteria) this;
        }

        public Criteria andQueryflagEqualTo(Integer value) {
            addCriterion("QueryFlag =", value, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagNotEqualTo(Integer value) {
            addCriterion("QueryFlag <>", value, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagGreaterThan(Integer value) {
            addCriterion("QueryFlag >", value, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("QueryFlag >=", value, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagLessThan(Integer value) {
            addCriterion("QueryFlag <", value, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagLessThanOrEqualTo(Integer value) {
            addCriterion("QueryFlag <=", value, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagIn(List<Integer> values) {
            addCriterion("QueryFlag in", values, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagNotIn(List<Integer> values) {
            addCriterion("QueryFlag not in", values, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagBetween(Integer value1, Integer value2) {
            addCriterion("QueryFlag between", value1, value2, "queryflag");
            return (Criteria) this;
        }

        public Criteria andQueryflagNotBetween(Integer value1, Integer value2) {
            addCriterion("QueryFlag not between", value1, value2, "queryflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagIsNull() {
            addCriterion("ColumnFlag is null");
            return (Criteria) this;
        }

        public Criteria andColumnflagIsNotNull() {
            addCriterion("ColumnFlag is not null");
            return (Criteria) this;
        }

        public Criteria andColumnflagEqualTo(Integer value) {
            addCriterion("ColumnFlag =", value, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagNotEqualTo(Integer value) {
            addCriterion("ColumnFlag <>", value, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagGreaterThan(Integer value) {
            addCriterion("ColumnFlag >", value, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ColumnFlag >=", value, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagLessThan(Integer value) {
            addCriterion("ColumnFlag <", value, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagLessThanOrEqualTo(Integer value) {
            addCriterion("ColumnFlag <=", value, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagIn(List<Integer> values) {
            addCriterion("ColumnFlag in", values, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagNotIn(List<Integer> values) {
            addCriterion("ColumnFlag not in", values, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagBetween(Integer value1, Integer value2) {
            addCriterion("ColumnFlag between", value1, value2, "columnflag");
            return (Criteria) this;
        }

        public Criteria andColumnflagNotBetween(Integer value1, Integer value2) {
            addCriterion("ColumnFlag not between", value1, value2, "columnflag");
            return (Criteria) this;
        }

        public Criteria andEditstatusIsNull() {
            addCriterion("EditStatus is null");
            return (Criteria) this;
        }

        public Criteria andEditstatusIsNotNull() {
            addCriterion("EditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEditstatusEqualTo(Integer value) {
            addCriterion("EditStatus =", value, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusNotEqualTo(Integer value) {
            addCriterion("EditStatus <>", value, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusGreaterThan(Integer value) {
            addCriterion("EditStatus >", value, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("EditStatus >=", value, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusLessThan(Integer value) {
            addCriterion("EditStatus <", value, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("EditStatus <=", value, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusIn(List<Integer> values) {
            addCriterion("EditStatus in", values, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusNotIn(List<Integer> values) {
            addCriterion("EditStatus not in", values, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusBetween(Integer value1, Integer value2) {
            addCriterion("EditStatus between", value1, value2, "editstatus");
            return (Criteria) this;
        }

        public Criteria andEditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("EditStatus not between", value1, value2, "editstatus");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckIsNull() {
            addCriterion("IPMTCheck is null");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckIsNotNull() {
            addCriterion("IPMTCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckEqualTo(Integer value) {
            addCriterion("IPMTCheck =", value, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckNotEqualTo(Integer value) {
            addCriterion("IPMTCheck <>", value, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckGreaterThan(Integer value) {
            addCriterion("IPMTCheck >", value, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("IPMTCheck >=", value, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckLessThan(Integer value) {
            addCriterion("IPMTCheck <", value, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckLessThanOrEqualTo(Integer value) {
            addCriterion("IPMTCheck <=", value, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckIn(List<Integer> values) {
            addCriterion("IPMTCheck in", values, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckNotIn(List<Integer> values) {
            addCriterion("IPMTCheck not in", values, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckBetween(Integer value1, Integer value2) {
            addCriterion("IPMTCheck between", value1, value2, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andIpmtcheckNotBetween(Integer value1, Integer value2) {
            addCriterion("IPMTCheck not between", value1, value2, "ipmtcheck");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CreateUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CreateUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CreateUser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CreateUser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CreateUser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CreateUser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CreateUser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CreateUser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CreateUser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CreateUser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CreateUser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CreateUser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CreateUser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CreateUser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNull() {
            addCriterion("ModifyUser is null");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNotNull() {
            addCriterion("ModifyUser is not null");
            return (Criteria) this;
        }

        public Criteria andModifyuserEqualTo(String value) {
            addCriterion("ModifyUser =", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotEqualTo(String value) {
            addCriterion("ModifyUser <>", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThan(String value) {
            addCriterion("ModifyUser >", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyUser >=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThan(String value) {
            addCriterion("ModifyUser <", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThanOrEqualTo(String value) {
            addCriterion("ModifyUser <=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLike(String value) {
            addCriterion("ModifyUser like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotLike(String value) {
            addCriterion("ModifyUser not like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserIn(List<String> values) {
            addCriterion("ModifyUser in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotIn(List<String> values) {
            addCriterion("ModifyUser not in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserBetween(String value1, String value2) {
            addCriterion("ModifyUser between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotBetween(String value1, String value2) {
            addCriterion("ModifyUser not between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("ModifyDate not between", value1, value2, "modifydate");
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

        public Criteria andColumnclassIsNull() {
            addCriterion("ColumnClass is null");
            return (Criteria) this;
        }

        public Criteria andColumnclassIsNotNull() {
            addCriterion("ColumnClass is not null");
            return (Criteria) this;
        }

        public Criteria andColumnclassEqualTo(String value) {
            addCriterion("ColumnClass =", value, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassNotEqualTo(String value) {
            addCriterion("ColumnClass <>", value, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassGreaterThan(String value) {
            addCriterion("ColumnClass >", value, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassGreaterThanOrEqualTo(String value) {
            addCriterion("ColumnClass >=", value, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassLessThan(String value) {
            addCriterion("ColumnClass <", value, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassLessThanOrEqualTo(String value) {
            addCriterion("ColumnClass <=", value, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassLike(String value) {
            addCriterion("ColumnClass like", value, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassNotLike(String value) {
            addCriterion("ColumnClass not like", value, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassIn(List<String> values) {
            addCriterion("ColumnClass in", values, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassNotIn(List<String> values) {
            addCriterion("ColumnClass not in", values, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassBetween(String value1, String value2) {
            addCriterion("ColumnClass between", value1, value2, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumnclassNotBetween(String value1, String value2) {
            addCriterion("ColumnClass not between", value1, value2, "columnclass");
            return (Criteria) this;
        }

        public Criteria andColumntypeIsNull() {
            addCriterion("ColumnType is null");
            return (Criteria) this;
        }

        public Criteria andColumntypeIsNotNull() {
            addCriterion("ColumnType is not null");
            return (Criteria) this;
        }

        public Criteria andColumntypeEqualTo(String value) {
            addCriterion("ColumnType =", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeNotEqualTo(String value) {
            addCriterion("ColumnType <>", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeGreaterThan(String value) {
            addCriterion("ColumnType >", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeGreaterThanOrEqualTo(String value) {
            addCriterion("ColumnType >=", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeLessThan(String value) {
            addCriterion("ColumnType <", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeLessThanOrEqualTo(String value) {
            addCriterion("ColumnType <=", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeLike(String value) {
            addCriterion("ColumnType like", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeNotLike(String value) {
            addCriterion("ColumnType not like", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeIn(List<String> values) {
            addCriterion("ColumnType in", values, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeNotIn(List<String> values) {
            addCriterion("ColumnType not in", values, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeBetween(String value1, String value2) {
            addCriterion("ColumnType between", value1, value2, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeNotBetween(String value1, String value2) {
            addCriterion("ColumnType not between", value1, value2, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateIsNull() {
            addCriterion("ColumnValidate is null");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateIsNotNull() {
            addCriterion("ColumnValidate is not null");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateEqualTo(String value) {
            addCriterion("ColumnValidate =", value, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateNotEqualTo(String value) {
            addCriterion("ColumnValidate <>", value, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateGreaterThan(String value) {
            addCriterion("ColumnValidate >", value, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateGreaterThanOrEqualTo(String value) {
            addCriterion("ColumnValidate >=", value, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateLessThan(String value) {
            addCriterion("ColumnValidate <", value, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateLessThanOrEqualTo(String value) {
            addCriterion("ColumnValidate <=", value, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateLike(String value) {
            addCriterion("ColumnValidate like", value, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateNotLike(String value) {
            addCriterion("ColumnValidate not like", value, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateIn(List<String> values) {
            addCriterion("ColumnValidate in", values, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateNotIn(List<String> values) {
            addCriterion("ColumnValidate not in", values, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateBetween(String value1, String value2) {
            addCriterion("ColumnValidate between", value1, value2, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnvalidateNotBetween(String value1, String value2) {
            addCriterion("ColumnValidate not between", value1, value2, "columnvalidate");
            return (Criteria) this;
        }

        public Criteria andColumnmessageIsNull() {
            addCriterion("ColumnMessage is null");
            return (Criteria) this;
        }

        public Criteria andColumnmessageIsNotNull() {
            addCriterion("ColumnMessage is not null");
            return (Criteria) this;
        }

        public Criteria andColumnmessageEqualTo(String value) {
            addCriterion("ColumnMessage =", value, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageNotEqualTo(String value) {
            addCriterion("ColumnMessage <>", value, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageGreaterThan(String value) {
            addCriterion("ColumnMessage >", value, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageGreaterThanOrEqualTo(String value) {
            addCriterion("ColumnMessage >=", value, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageLessThan(String value) {
            addCriterion("ColumnMessage <", value, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageLessThanOrEqualTo(String value) {
            addCriterion("ColumnMessage <=", value, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageLike(String value) {
            addCriterion("ColumnMessage like", value, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageNotLike(String value) {
            addCriterion("ColumnMessage not like", value, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageIn(List<String> values) {
            addCriterion("ColumnMessage in", values, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageNotIn(List<String> values) {
            addCriterion("ColumnMessage not in", values, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageBetween(String value1, String value2) {
            addCriterion("ColumnMessage between", value1, value2, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andColumnmessageNotBetween(String value1, String value2) {
            addCriterion("ColumnMessage not between", value1, value2, "columnmessage");
            return (Criteria) this;
        }

        public Criteria andValidatelengthIsNull() {
            addCriterion("ValidateLength is null");
            return (Criteria) this;
        }

        public Criteria andValidatelengthIsNotNull() {
            addCriterion("ValidateLength is not null");
            return (Criteria) this;
        }

        public Criteria andValidatelengthEqualTo(String value) {
            addCriterion("ValidateLength =", value, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthNotEqualTo(String value) {
            addCriterion("ValidateLength <>", value, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthGreaterThan(String value) {
            addCriterion("ValidateLength >", value, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthGreaterThanOrEqualTo(String value) {
            addCriterion("ValidateLength >=", value, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthLessThan(String value) {
            addCriterion("ValidateLength <", value, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthLessThanOrEqualTo(String value) {
            addCriterion("ValidateLength <=", value, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthLike(String value) {
            addCriterion("ValidateLength like", value, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthNotLike(String value) {
            addCriterion("ValidateLength not like", value, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthIn(List<String> values) {
            addCriterion("ValidateLength in", values, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthNotIn(List<String> values) {
            addCriterion("ValidateLength not in", values, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthBetween(String value1, String value2) {
            addCriterion("ValidateLength between", value1, value2, "validatelength");
            return (Criteria) this;
        }

        public Criteria andValidatelengthNotBetween(String value1, String value2) {
            addCriterion("ValidateLength not between", value1, value2, "validatelength");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowIsNull() {
            addCriterion("IsReferenceShow is null");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowIsNotNull() {
            addCriterion("IsReferenceShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowEqualTo(Integer value) {
            addCriterion("IsReferenceShow =", value, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowNotEqualTo(Integer value) {
            addCriterion("IsReferenceShow <>", value, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowGreaterThan(Integer value) {
            addCriterion("IsReferenceShow >", value, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsReferenceShow >=", value, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowLessThan(Integer value) {
            addCriterion("IsReferenceShow <", value, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowLessThanOrEqualTo(Integer value) {
            addCriterion("IsReferenceShow <=", value, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowIn(List<Integer> values) {
            addCriterion("IsReferenceShow in", values, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowNotIn(List<Integer> values) {
            addCriterion("IsReferenceShow not in", values, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowBetween(Integer value1, Integer value2) {
            addCriterion("IsReferenceShow between", value1, value2, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andIsreferenceshowNotBetween(Integer value1, Integer value2) {
            addCriterion("IsReferenceShow not between", value1, value2, "isreferenceshow");
            return (Criteria) this;
        }

        public Criteria andExportflagIsNull() {
            addCriterion("ExportFlag is null");
            return (Criteria) this;
        }

        public Criteria andExportflagIsNotNull() {
            addCriterion("ExportFlag is not null");
            return (Criteria) this;
        }

        public Criteria andExportflagEqualTo(Integer value) {
            addCriterion("ExportFlag =", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotEqualTo(Integer value) {
            addCriterion("ExportFlag <>", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagGreaterThan(Integer value) {
            addCriterion("ExportFlag >", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExportFlag >=", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagLessThan(Integer value) {
            addCriterion("ExportFlag <", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagLessThanOrEqualTo(Integer value) {
            addCriterion("ExportFlag <=", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagIn(List<Integer> values) {
            addCriterion("ExportFlag in", values, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotIn(List<Integer> values) {
            addCriterion("ExportFlag not in", values, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagBetween(Integer value1, Integer value2) {
            addCriterion("ExportFlag between", value1, value2, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotBetween(Integer value1, Integer value2) {
            addCriterion("ExportFlag not between", value1, value2, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportorderIsNull() {
            addCriterion("ExportOrder is null");
            return (Criteria) this;
        }

        public Criteria andExportorderIsNotNull() {
            addCriterion("ExportOrder is not null");
            return (Criteria) this;
        }

        public Criteria andExportorderEqualTo(Integer value) {
            addCriterion("ExportOrder =", value, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderNotEqualTo(Integer value) {
            addCriterion("ExportOrder <>", value, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderGreaterThan(Integer value) {
            addCriterion("ExportOrder >", value, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExportOrder >=", value, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderLessThan(Integer value) {
            addCriterion("ExportOrder <", value, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderLessThanOrEqualTo(Integer value) {
            addCriterion("ExportOrder <=", value, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderIn(List<Integer> values) {
            addCriterion("ExportOrder in", values, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderNotIn(List<Integer> values) {
            addCriterion("ExportOrder not in", values, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderBetween(Integer value1, Integer value2) {
            addCriterion("ExportOrder between", value1, value2, "exportorder");
            return (Criteria) this;
        }

        public Criteria andExportorderNotBetween(Integer value1, Integer value2) {
            addCriterion("ExportOrder not between", value1, value2, "exportorder");
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