package com.h3c.mds.product.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductViewExample() {
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

        public Criteria andPlipmtIsNull() {
            addCriterion("PLIPMT is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtIsNotNull() {
            addCriterion("PLIPMT is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtEqualTo(String value) {
            addCriterion("PLIPMT =", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotEqualTo(String value) {
            addCriterion("PLIPMT <>", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtGreaterThan(String value) {
            addCriterion("PLIPMT >", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtGreaterThanOrEqualTo(String value) {
            addCriterion("PLIPMT >=", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLessThan(String value) {
            addCriterion("PLIPMT <", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLessThanOrEqualTo(String value) {
            addCriterion("PLIPMT <=", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtLike(String value) {
            addCriterion("PLIPMT like", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotLike(String value) {
            addCriterion("PLIPMT not like", value, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtIn(List<String> values) {
            addCriterion("PLIPMT in", values, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotIn(List<String> values) {
            addCriterion("PLIPMT not in", values, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtBetween(String value1, String value2) {
            addCriterion("PLIPMT between", value1, value2, "plipmt");
            return (Criteria) this;
        }

        public Criteria andPlipmtNotBetween(String value1, String value2) {
            addCriterion("PLIPMT not between", value1, value2, "plipmt");
            return (Criteria) this;
        }

        public Criteria andProdlineIsNull() {
            addCriterion("PRODLINE is null");
            return (Criteria) this;
        }

        public Criteria andProdlineIsNotNull() {
            addCriterion("PRODLINE is not null");
            return (Criteria) this;
        }

        public Criteria andProdlineEqualTo(String value) {
            addCriterion("PRODLINE =", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineNotEqualTo(String value) {
            addCriterion("PRODLINE <>", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineGreaterThan(String value) {
            addCriterion("PRODLINE >", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINE >=", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineLessThan(String value) {
            addCriterion("PRODLINE <", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineLessThanOrEqualTo(String value) {
            addCriterion("PRODLINE <=", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineLike(String value) {
            addCriterion("PRODLINE like", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineNotLike(String value) {
            addCriterion("PRODLINE not like", value, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineIn(List<String> values) {
            addCriterion("PRODLINE in", values, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineNotIn(List<String> values) {
            addCriterion("PRODLINE not in", values, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineBetween(String value1, String value2) {
            addCriterion("PRODLINE between", value1, value2, "prodline");
            return (Criteria) this;
        }

        public Criteria andProdlineNotBetween(String value1, String value2) {
            addCriterion("PRODLINE not between", value1, value2, "prodline");
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

        public Criteria andProductIsNull() {
            addCriterion("Product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("Product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("Product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("Product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("Product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("Product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("Product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("Product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("Product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("Product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("Product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("Product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("Product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("Product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andPIsNull() {
            addCriterion("P is null");
            return (Criteria) this;
        }

        public Criteria andPIsNotNull() {
            addCriterion("P is not null");
            return (Criteria) this;
        }

        public Criteria andPEqualTo(String value) {
            addCriterion("P =", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotEqualTo(String value) {
            addCriterion("P <>", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThan(String value) {
            addCriterion("P >", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThanOrEqualTo(String value) {
            addCriterion("P >=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThan(String value) {
            addCriterion("P <", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThanOrEqualTo(String value) {
            addCriterion("P <=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLike(String value) {
            addCriterion("P like", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotLike(String value) {
            addCriterion("P not like", value, "p");
            return (Criteria) this;
        }

        public Criteria andPIn(List<String> values) {
            addCriterion("P in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPNotIn(List<String> values) {
            addCriterion("P not in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPBetween(String value1, String value2) {
            addCriterion("P between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andPNotBetween(String value1, String value2) {
            addCriterion("P not between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andProductoldIsNull() {
            addCriterion("ProductOld is null");
            return (Criteria) this;
        }

        public Criteria andProductoldIsNotNull() {
            addCriterion("ProductOld is not null");
            return (Criteria) this;
        }

        public Criteria andProductoldEqualTo(String value) {
            addCriterion("ProductOld =", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldNotEqualTo(String value) {
            addCriterion("ProductOld <>", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldGreaterThan(String value) {
            addCriterion("ProductOld >", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldGreaterThanOrEqualTo(String value) {
            addCriterion("ProductOld >=", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldLessThan(String value) {
            addCriterion("ProductOld <", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldLessThanOrEqualTo(String value) {
            addCriterion("ProductOld <=", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldLike(String value) {
            addCriterion("ProductOld like", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldNotLike(String value) {
            addCriterion("ProductOld not like", value, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldIn(List<String> values) {
            addCriterion("ProductOld in", values, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldNotIn(List<String> values) {
            addCriterion("ProductOld not in", values, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldBetween(String value1, String value2) {
            addCriterion("ProductOld between", value1, value2, "productold");
            return (Criteria) this;
        }

        public Criteria andProductoldNotBetween(String value1, String value2) {
            addCriterion("ProductOld not between", value1, value2, "productold");
            return (Criteria) this;
        }

        public Criteria andEngproductIsNull() {
            addCriterion("engProduct is null");
            return (Criteria) this;
        }

        public Criteria andEngproductIsNotNull() {
            addCriterion("engProduct is not null");
            return (Criteria) this;
        }

        public Criteria andEngproductEqualTo(String value) {
            addCriterion("engProduct =", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductNotEqualTo(String value) {
            addCriterion("engProduct <>", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductGreaterThan(String value) {
            addCriterion("engProduct >", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductGreaterThanOrEqualTo(String value) {
            addCriterion("engProduct >=", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductLessThan(String value) {
            addCriterion("engProduct <", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductLessThanOrEqualTo(String value) {
            addCriterion("engProduct <=", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductLike(String value) {
            addCriterion("engProduct like", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductNotLike(String value) {
            addCriterion("engProduct not like", value, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductIn(List<String> values) {
            addCriterion("engProduct in", values, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductNotIn(List<String> values) {
            addCriterion("engProduct not in", values, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductBetween(String value1, String value2) {
            addCriterion("engProduct between", value1, value2, "engproduct");
            return (Criteria) this;
        }

        public Criteria andEngproductNotBetween(String value1, String value2) {
            addCriterion("engProduct not between", value1, value2, "engproduct");
            return (Criteria) this;
        }

        public Criteria andIfplanIsNull() {
            addCriterion("IfPlan is null");
            return (Criteria) this;
        }

        public Criteria andIfplanIsNotNull() {
            addCriterion("IfPlan is not null");
            return (Criteria) this;
        }

        public Criteria andIfplanEqualTo(String value) {
            addCriterion("IfPlan =", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotEqualTo(String value) {
            addCriterion("IfPlan <>", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanGreaterThan(String value) {
            addCriterion("IfPlan >", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanGreaterThanOrEqualTo(String value) {
            addCriterion("IfPlan >=", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLessThan(String value) {
            addCriterion("IfPlan <", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLessThanOrEqualTo(String value) {
            addCriterion("IfPlan <=", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanLike(String value) {
            addCriterion("IfPlan like", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotLike(String value) {
            addCriterion("IfPlan not like", value, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanIn(List<String> values) {
            addCriterion("IfPlan in", values, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotIn(List<String> values) {
            addCriterion("IfPlan not in", values, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanBetween(String value1, String value2) {
            addCriterion("IfPlan between", value1, value2, "ifplan");
            return (Criteria) this;
        }

        public Criteria andIfplanNotBetween(String value1, String value2) {
            addCriterion("IfPlan not between", value1, value2, "ifplan");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("ProductType is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("ProductType is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("ProductType =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("ProductType <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("ProductType >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ProductType >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("ProductType <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("ProductType <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("ProductType like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("ProductType not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("ProductType in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("ProductType not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("ProductType between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("ProductType not between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingIsNull() {
            addCriterion("IfOfficialNaming is null");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingIsNotNull() {
            addCriterion("IfOfficialNaming is not null");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingEqualTo(String value) {
            addCriterion("IfOfficialNaming =", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingNotEqualTo(String value) {
            addCriterion("IfOfficialNaming <>", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingGreaterThan(String value) {
            addCriterion("IfOfficialNaming >", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingGreaterThanOrEqualTo(String value) {
            addCriterion("IfOfficialNaming >=", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingLessThan(String value) {
            addCriterion("IfOfficialNaming <", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingLessThanOrEqualTo(String value) {
            addCriterion("IfOfficialNaming <=", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingLike(String value) {
            addCriterion("IfOfficialNaming like", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingNotLike(String value) {
            addCriterion("IfOfficialNaming not like", value, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingIn(List<String> values) {
            addCriterion("IfOfficialNaming in", values, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingNotIn(List<String> values) {
            addCriterion("IfOfficialNaming not in", values, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingBetween(String value1, String value2) {
            addCriterion("IfOfficialNaming between", value1, value2, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andIfofficialnamingNotBetween(String value1, String value2) {
            addCriterion("IfOfficialNaming not between", value1, value2, "ifofficialnaming");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeIsNull() {
            addCriterion("PRODUCTCOACode is null");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeIsNotNull() {
            addCriterion("PRODUCTCOACode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeEqualTo(String value) {
            addCriterion("PRODUCTCOACode =", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeNotEqualTo(String value) {
            addCriterion("PRODUCTCOACode <>", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeGreaterThan(String value) {
            addCriterion("PRODUCTCOACode >", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTCOACode >=", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeLessThan(String value) {
            addCriterion("PRODUCTCOACode <", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTCOACode <=", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeLike(String value) {
            addCriterion("PRODUCTCOACode like", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeNotLike(String value) {
            addCriterion("PRODUCTCOACode not like", value, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeIn(List<String> values) {
            addCriterion("PRODUCTCOACode in", values, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeNotIn(List<String> values) {
            addCriterion("PRODUCTCOACode not in", values, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeBetween(String value1, String value2) {
            addCriterion("PRODUCTCOACode between", value1, value2, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andProductcoacodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCTCOACode not between", value1, value2, "productcoacode");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNull() {
            addCriterion("PM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("PM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(String value) {
            addCriterion("PM_ID =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(String value) {
            addCriterion("PM_ID <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(String value) {
            addCriterion("PM_ID >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(String value) {
            addCriterion("PM_ID >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(String value) {
            addCriterion("PM_ID <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(String value) {
            addCriterion("PM_ID <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLike(String value) {
            addCriterion("PM_ID like", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotLike(String value) {
            addCriterion("PM_ID not like", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<String> values) {
            addCriterion("PM_ID in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<String> values) {
            addCriterion("PM_ID not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(String value1, String value2) {
            addCriterion("PM_ID between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(String value1, String value2) {
            addCriterion("PM_ID not between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPopIdIsNull() {
            addCriterion("POP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPopIdIsNotNull() {
            addCriterion("POP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPopIdEqualTo(String value) {
            addCriterion("POP_ID =", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotEqualTo(String value) {
            addCriterion("POP_ID <>", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdGreaterThan(String value) {
            addCriterion("POP_ID >", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdGreaterThanOrEqualTo(String value) {
            addCriterion("POP_ID >=", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdLessThan(String value) {
            addCriterion("POP_ID <", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdLessThanOrEqualTo(String value) {
            addCriterion("POP_ID <=", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdLike(String value) {
            addCriterion("POP_ID like", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotLike(String value) {
            addCriterion("POP_ID not like", value, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdIn(List<String> values) {
            addCriterion("POP_ID in", values, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotIn(List<String> values) {
            addCriterion("POP_ID not in", values, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdBetween(String value1, String value2) {
            addCriterion("POP_ID between", value1, value2, "popId");
            return (Criteria) this;
        }

        public Criteria andPopIdNotBetween(String value1, String value2) {
            addCriterion("POP_ID not between", value1, value2, "popId");
            return (Criteria) this;
        }

        public Criteria andCmeIdIsNull() {
            addCriterion("CME_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmeIdIsNotNull() {
            addCriterion("CME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmeIdEqualTo(String value) {
            addCriterion("CME_ID =", value, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdNotEqualTo(String value) {
            addCriterion("CME_ID <>", value, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdGreaterThan(String value) {
            addCriterion("CME_ID >", value, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CME_ID >=", value, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdLessThan(String value) {
            addCriterion("CME_ID <", value, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdLessThanOrEqualTo(String value) {
            addCriterion("CME_ID <=", value, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdLike(String value) {
            addCriterion("CME_ID like", value, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdNotLike(String value) {
            addCriterion("CME_ID not like", value, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdIn(List<String> values) {
            addCriterion("CME_ID in", values, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdNotIn(List<String> values) {
            addCriterion("CME_ID not in", values, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdBetween(String value1, String value2) {
            addCriterion("CME_ID between", value1, value2, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmeIdNotBetween(String value1, String value2) {
            addCriterion("CME_ID not between", value1, value2, "cmeId");
            return (Criteria) this;
        }

        public Criteria andCmoIdIsNull() {
            addCriterion("CMO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmoIdIsNotNull() {
            addCriterion("CMO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmoIdEqualTo(String value) {
            addCriterion("CMO_ID =", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdNotEqualTo(String value) {
            addCriterion("CMO_ID <>", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdGreaterThan(String value) {
            addCriterion("CMO_ID >", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdGreaterThanOrEqualTo(String value) {
            addCriterion("CMO_ID >=", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdLessThan(String value) {
            addCriterion("CMO_ID <", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdLessThanOrEqualTo(String value) {
            addCriterion("CMO_ID <=", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdLike(String value) {
            addCriterion("CMO_ID like", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdNotLike(String value) {
            addCriterion("CMO_ID not like", value, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdIn(List<String> values) {
            addCriterion("CMO_ID in", values, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdNotIn(List<String> values) {
            addCriterion("CMO_ID not in", values, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdBetween(String value1, String value2) {
            addCriterion("CMO_ID between", value1, value2, "cmoId");
            return (Criteria) this;
        }

        public Criteria andCmoIdNotBetween(String value1, String value2) {
            addCriterion("CMO_ID not between", value1, value2, "cmoId");
            return (Criteria) this;
        }

        public Criteria andPdeIdIsNull() {
            addCriterion("PDE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPdeIdIsNotNull() {
            addCriterion("PDE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPdeIdEqualTo(String value) {
            addCriterion("PDE_ID =", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdNotEqualTo(String value) {
            addCriterion("PDE_ID <>", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdGreaterThan(String value) {
            addCriterion("PDE_ID >", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PDE_ID >=", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdLessThan(String value) {
            addCriterion("PDE_ID <", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdLessThanOrEqualTo(String value) {
            addCriterion("PDE_ID <=", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdLike(String value) {
            addCriterion("PDE_ID like", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdNotLike(String value) {
            addCriterion("PDE_ID not like", value, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdIn(List<String> values) {
            addCriterion("PDE_ID in", values, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdNotIn(List<String> values) {
            addCriterion("PDE_ID not in", values, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdBetween(String value1, String value2) {
            addCriterion("PDE_ID between", value1, value2, "pdeId");
            return (Criteria) this;
        }

        public Criteria andPdeIdNotBetween(String value1, String value2) {
            addCriterion("PDE_ID not between", value1, value2, "pdeId");
            return (Criteria) this;
        }

        public Criteria andFproductIsNull() {
            addCriterion("FPRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andFproductIsNotNull() {
            addCriterion("FPRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andFproductEqualTo(String value) {
            addCriterion("FPRODUCT =", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductNotEqualTo(String value) {
            addCriterion("FPRODUCT <>", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductGreaterThan(String value) {
            addCriterion("FPRODUCT >", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductGreaterThanOrEqualTo(String value) {
            addCriterion("FPRODUCT >=", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductLessThan(String value) {
            addCriterion("FPRODUCT <", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductLessThanOrEqualTo(String value) {
            addCriterion("FPRODUCT <=", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductLike(String value) {
            addCriterion("FPRODUCT like", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductNotLike(String value) {
            addCriterion("FPRODUCT not like", value, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductIn(List<String> values) {
            addCriterion("FPRODUCT in", values, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductNotIn(List<String> values) {
            addCriterion("FPRODUCT not in", values, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductBetween(String value1, String value2) {
            addCriterion("FPRODUCT between", value1, value2, "fproduct");
            return (Criteria) this;
        }

        public Criteria andFproductNotBetween(String value1, String value2) {
            addCriterion("FPRODUCT not between", value1, value2, "fproduct");
            return (Criteria) this;
        }

        public Criteria andBomIsNull() {
            addCriterion("BOM is null");
            return (Criteria) this;
        }

        public Criteria andBomIsNotNull() {
            addCriterion("BOM is not null");
            return (Criteria) this;
        }

        public Criteria andBomEqualTo(String value) {
            addCriterion("BOM =", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotEqualTo(String value) {
            addCriterion("BOM <>", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomGreaterThan(String value) {
            addCriterion("BOM >", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomGreaterThanOrEqualTo(String value) {
            addCriterion("BOM >=", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLessThan(String value) {
            addCriterion("BOM <", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLessThanOrEqualTo(String value) {
            addCriterion("BOM <=", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomLike(String value) {
            addCriterion("BOM like", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotLike(String value) {
            addCriterion("BOM not like", value, "bom");
            return (Criteria) this;
        }

        public Criteria andBomIn(List<String> values) {
            addCriterion("BOM in", values, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotIn(List<String> values) {
            addCriterion("BOM not in", values, "bom");
            return (Criteria) this;
        }

        public Criteria andBomBetween(String value1, String value2) {
            addCriterion("BOM between", value1, value2, "bom");
            return (Criteria) this;
        }

        public Criteria andBomNotBetween(String value1, String value2) {
            addCriterion("BOM not between", value1, value2, "bom");
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

        public Criteria andMatchIsNull() {
            addCriterion("Match is null");
            return (Criteria) this;
        }

        public Criteria andMatchIsNotNull() {
            addCriterion("Match is not null");
            return (Criteria) this;
        }

        public Criteria andMatchEqualTo(String value) {
            addCriterion("Match =", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotEqualTo(String value) {
            addCriterion("Match <>", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchGreaterThan(String value) {
            addCriterion("Match >", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchGreaterThanOrEqualTo(String value) {
            addCriterion("Match >=", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLessThan(String value) {
            addCriterion("Match <", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLessThanOrEqualTo(String value) {
            addCriterion("Match <=", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLike(String value) {
            addCriterion("Match like", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotLike(String value) {
            addCriterion("Match not like", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchIn(List<String> values) {
            addCriterion("Match in", values, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotIn(List<String> values) {
            addCriterion("Match not in", values, "match");
            return (Criteria) this;
        }

        public Criteria andMatchBetween(String value1, String value2) {
            addCriterion("Match between", value1, value2, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotBetween(String value1, String value2) {
            addCriterion("Match not between", value1, value2, "match");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIsNull() {
            addCriterion("PRODLINENo is null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIsNotNull() {
            addCriterion("PRODLINENo is not null");
            return (Criteria) this;
        }

        public Criteria andProdlinenoEqualTo(String value) {
            addCriterion("PRODLINENo =", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotEqualTo(String value) {
            addCriterion("PRODLINENo <>", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThan(String value) {
            addCriterion("PRODLINENo >", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODLINENo >=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThan(String value) {
            addCriterion("PRODLINENo <", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLessThanOrEqualTo(String value) {
            addCriterion("PRODLINENo <=", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoLike(String value) {
            addCriterion("PRODLINENo like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotLike(String value) {
            addCriterion("PRODLINENo not like", value, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoIn(List<String> values) {
            addCriterion("PRODLINENo in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotIn(List<String> values) {
            addCriterion("PRODLINENo not in", values, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoBetween(String value1, String value2) {
            addCriterion("PRODLINENo between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andProdlinenoNotBetween(String value1, String value2) {
            addCriterion("PRODLINENo not between", value1, value2, "prodlineno");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("MODIFY_USER =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("MODIFY_USER <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("MODIFY_USER >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("MODIFY_USER <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("MODIFY_USER like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("MODIFY_USER not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("MODIFY_USER in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("MODIFY_USER not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("MODIFY_USER between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("MODIFY_USER not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("MODIFY_DATE =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("MODIFY_DATE <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("MODIFY_DATE >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("MODIFY_DATE <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("MODIFY_DATE in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("MODIFY_DATE not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE not between", value1, value2, "modifyDate");
            return (Criteria) this;
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

        public Criteria andReadersIsNull() {
            addCriterion("Readers is null");
            return (Criteria) this;
        }

        public Criteria andReadersIsNotNull() {
            addCriterion("Readers is not null");
            return (Criteria) this;
        }

        public Criteria andReadersEqualTo(String value) {
            addCriterion("Readers =", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotEqualTo(String value) {
            addCriterion("Readers <>", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersGreaterThan(String value) {
            addCriterion("Readers >", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersGreaterThanOrEqualTo(String value) {
            addCriterion("Readers >=", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLessThan(String value) {
            addCriterion("Readers <", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLessThanOrEqualTo(String value) {
            addCriterion("Readers <=", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLike(String value) {
            addCriterion("Readers like", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotLike(String value) {
            addCriterion("Readers not like", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersIn(List<String> values) {
            addCriterion("Readers in", values, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotIn(List<String> values) {
            addCriterion("Readers not in", values, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersBetween(String value1, String value2) {
            addCriterion("Readers between", value1, value2, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotBetween(String value1, String value2) {
            addCriterion("Readers not between", value1, value2, "readers");
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

        public Criteria andColumn01IsNull() {
            addCriterion("Column01 is null");
            return (Criteria) this;
        }

        public Criteria andColumn01IsNotNull() {
            addCriterion("Column01 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn01EqualTo(String value) {
            addCriterion("Column01 =", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01NotEqualTo(String value) {
            addCriterion("Column01 <>", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01GreaterThan(String value) {
            addCriterion("Column01 >", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01GreaterThanOrEqualTo(String value) {
            addCriterion("Column01 >=", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01LessThan(String value) {
            addCriterion("Column01 <", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01LessThanOrEqualTo(String value) {
            addCriterion("Column01 <=", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01Like(String value) {
            addCriterion("Column01 like", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01NotLike(String value) {
            addCriterion("Column01 not like", value, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01In(List<String> values) {
            addCriterion("Column01 in", values, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01NotIn(List<String> values) {
            addCriterion("Column01 not in", values, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01Between(String value1, String value2) {
            addCriterion("Column01 between", value1, value2, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn01NotBetween(String value1, String value2) {
            addCriterion("Column01 not between", value1, value2, "column01");
            return (Criteria) this;
        }

        public Criteria andColumn02IsNull() {
            addCriterion("Column02 is null");
            return (Criteria) this;
        }

        public Criteria andColumn02IsNotNull() {
            addCriterion("Column02 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn02EqualTo(String value) {
            addCriterion("Column02 =", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02NotEqualTo(String value) {
            addCriterion("Column02 <>", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02GreaterThan(String value) {
            addCriterion("Column02 >", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02GreaterThanOrEqualTo(String value) {
            addCriterion("Column02 >=", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02LessThan(String value) {
            addCriterion("Column02 <", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02LessThanOrEqualTo(String value) {
            addCriterion("Column02 <=", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02Like(String value) {
            addCriterion("Column02 like", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02NotLike(String value) {
            addCriterion("Column02 not like", value, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02In(List<String> values) {
            addCriterion("Column02 in", values, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02NotIn(List<String> values) {
            addCriterion("Column02 not in", values, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02Between(String value1, String value2) {
            addCriterion("Column02 between", value1, value2, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn02NotBetween(String value1, String value2) {
            addCriterion("Column02 not between", value1, value2, "column02");
            return (Criteria) this;
        }

        public Criteria andColumn03IsNull() {
            addCriterion("Column03 is null");
            return (Criteria) this;
        }

        public Criteria andColumn03IsNotNull() {
            addCriterion("Column03 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn03EqualTo(String value) {
            addCriterion("Column03 =", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03NotEqualTo(String value) {
            addCriterion("Column03 <>", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03GreaterThan(String value) {
            addCriterion("Column03 >", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03GreaterThanOrEqualTo(String value) {
            addCriterion("Column03 >=", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03LessThan(String value) {
            addCriterion("Column03 <", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03LessThanOrEqualTo(String value) {
            addCriterion("Column03 <=", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03Like(String value) {
            addCriterion("Column03 like", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03NotLike(String value) {
            addCriterion("Column03 not like", value, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03In(List<String> values) {
            addCriterion("Column03 in", values, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03NotIn(List<String> values) {
            addCriterion("Column03 not in", values, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03Between(String value1, String value2) {
            addCriterion("Column03 between", value1, value2, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn03NotBetween(String value1, String value2) {
            addCriterion("Column03 not between", value1, value2, "column03");
            return (Criteria) this;
        }

        public Criteria andColumn04IsNull() {
            addCriterion("Column04 is null");
            return (Criteria) this;
        }

        public Criteria andColumn04IsNotNull() {
            addCriterion("Column04 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn04EqualTo(String value) {
            addCriterion("Column04 =", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04NotEqualTo(String value) {
            addCriterion("Column04 <>", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04GreaterThan(String value) {
            addCriterion("Column04 >", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04GreaterThanOrEqualTo(String value) {
            addCriterion("Column04 >=", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04LessThan(String value) {
            addCriterion("Column04 <", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04LessThanOrEqualTo(String value) {
            addCriterion("Column04 <=", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04Like(String value) {
            addCriterion("Column04 like", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04NotLike(String value) {
            addCriterion("Column04 not like", value, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04In(List<String> values) {
            addCriterion("Column04 in", values, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04NotIn(List<String> values) {
            addCriterion("Column04 not in", values, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04Between(String value1, String value2) {
            addCriterion("Column04 between", value1, value2, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn04NotBetween(String value1, String value2) {
            addCriterion("Column04 not between", value1, value2, "column04");
            return (Criteria) this;
        }

        public Criteria andColumn05IsNull() {
            addCriterion("Column05 is null");
            return (Criteria) this;
        }

        public Criteria andColumn05IsNotNull() {
            addCriterion("Column05 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn05EqualTo(String value) {
            addCriterion("Column05 =", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05NotEqualTo(String value) {
            addCriterion("Column05 <>", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05GreaterThan(String value) {
            addCriterion("Column05 >", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05GreaterThanOrEqualTo(String value) {
            addCriterion("Column05 >=", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05LessThan(String value) {
            addCriterion("Column05 <", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05LessThanOrEqualTo(String value) {
            addCriterion("Column05 <=", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05Like(String value) {
            addCriterion("Column05 like", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05NotLike(String value) {
            addCriterion("Column05 not like", value, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05In(List<String> values) {
            addCriterion("Column05 in", values, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05NotIn(List<String> values) {
            addCriterion("Column05 not in", values, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05Between(String value1, String value2) {
            addCriterion("Column05 between", value1, value2, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn05NotBetween(String value1, String value2) {
            addCriterion("Column05 not between", value1, value2, "column05");
            return (Criteria) this;
        }

        public Criteria andColumn06IsNull() {
            addCriterion("Column06 is null");
            return (Criteria) this;
        }

        public Criteria andColumn06IsNotNull() {
            addCriterion("Column06 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn06EqualTo(String value) {
            addCriterion("Column06 =", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06NotEqualTo(String value) {
            addCriterion("Column06 <>", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06GreaterThan(String value) {
            addCriterion("Column06 >", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06GreaterThanOrEqualTo(String value) {
            addCriterion("Column06 >=", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06LessThan(String value) {
            addCriterion("Column06 <", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06LessThanOrEqualTo(String value) {
            addCriterion("Column06 <=", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06Like(String value) {
            addCriterion("Column06 like", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06NotLike(String value) {
            addCriterion("Column06 not like", value, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06In(List<String> values) {
            addCriterion("Column06 in", values, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06NotIn(List<String> values) {
            addCriterion("Column06 not in", values, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06Between(String value1, String value2) {
            addCriterion("Column06 between", value1, value2, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn06NotBetween(String value1, String value2) {
            addCriterion("Column06 not between", value1, value2, "column06");
            return (Criteria) this;
        }

        public Criteria andColumn07IsNull() {
            addCriterion("Column07 is null");
            return (Criteria) this;
        }

        public Criteria andColumn07IsNotNull() {
            addCriterion("Column07 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn07EqualTo(String value) {
            addCriterion("Column07 =", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07NotEqualTo(String value) {
            addCriterion("Column07 <>", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07GreaterThan(String value) {
            addCriterion("Column07 >", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07GreaterThanOrEqualTo(String value) {
            addCriterion("Column07 >=", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07LessThan(String value) {
            addCriterion("Column07 <", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07LessThanOrEqualTo(String value) {
            addCriterion("Column07 <=", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07Like(String value) {
            addCriterion("Column07 like", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07NotLike(String value) {
            addCriterion("Column07 not like", value, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07In(List<String> values) {
            addCriterion("Column07 in", values, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07NotIn(List<String> values) {
            addCriterion("Column07 not in", values, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07Between(String value1, String value2) {
            addCriterion("Column07 between", value1, value2, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn07NotBetween(String value1, String value2) {
            addCriterion("Column07 not between", value1, value2, "column07");
            return (Criteria) this;
        }

        public Criteria andColumn08IsNull() {
            addCriterion("Column08 is null");
            return (Criteria) this;
        }

        public Criteria andColumn08IsNotNull() {
            addCriterion("Column08 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn08EqualTo(String value) {
            addCriterion("Column08 =", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08NotEqualTo(String value) {
            addCriterion("Column08 <>", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08GreaterThan(String value) {
            addCriterion("Column08 >", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08GreaterThanOrEqualTo(String value) {
            addCriterion("Column08 >=", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08LessThan(String value) {
            addCriterion("Column08 <", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08LessThanOrEqualTo(String value) {
            addCriterion("Column08 <=", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08Like(String value) {
            addCriterion("Column08 like", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08NotLike(String value) {
            addCriterion("Column08 not like", value, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08In(List<String> values) {
            addCriterion("Column08 in", values, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08NotIn(List<String> values) {
            addCriterion("Column08 not in", values, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08Between(String value1, String value2) {
            addCriterion("Column08 between", value1, value2, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn08NotBetween(String value1, String value2) {
            addCriterion("Column08 not between", value1, value2, "column08");
            return (Criteria) this;
        }

        public Criteria andColumn09IsNull() {
            addCriterion("Column09 is null");
            return (Criteria) this;
        }

        public Criteria andColumn09IsNotNull() {
            addCriterion("Column09 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn09EqualTo(String value) {
            addCriterion("Column09 =", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09NotEqualTo(String value) {
            addCriterion("Column09 <>", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09GreaterThan(String value) {
            addCriterion("Column09 >", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09GreaterThanOrEqualTo(String value) {
            addCriterion("Column09 >=", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09LessThan(String value) {
            addCriterion("Column09 <", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09LessThanOrEqualTo(String value) {
            addCriterion("Column09 <=", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09Like(String value) {
            addCriterion("Column09 like", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09NotLike(String value) {
            addCriterion("Column09 not like", value, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09In(List<String> values) {
            addCriterion("Column09 in", values, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09NotIn(List<String> values) {
            addCriterion("Column09 not in", values, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09Between(String value1, String value2) {
            addCriterion("Column09 between", value1, value2, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn09NotBetween(String value1, String value2) {
            addCriterion("Column09 not between", value1, value2, "column09");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNull() {
            addCriterion("Column10 is null");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNotNull() {
            addCriterion("Column10 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn10EqualTo(String value) {
            addCriterion("Column10 =", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotEqualTo(String value) {
            addCriterion("Column10 <>", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThan(String value) {
            addCriterion("Column10 >", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThanOrEqualTo(String value) {
            addCriterion("Column10 >=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThan(String value) {
            addCriterion("Column10 <", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThanOrEqualTo(String value) {
            addCriterion("Column10 <=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Like(String value) {
            addCriterion("Column10 like", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotLike(String value) {
            addCriterion("Column10 not like", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10In(List<String> values) {
            addCriterion("Column10 in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotIn(List<String> values) {
            addCriterion("Column10 not in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Between(String value1, String value2) {
            addCriterion("Column10 between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotBetween(String value1, String value2) {
            addCriterion("Column10 not between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andProducttypenameIsNull() {
            addCriterion("producttypeName is null");
            return (Criteria) this;
        }

        public Criteria andProducttypenameIsNotNull() {
            addCriterion("producttypeName is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypenameEqualTo(String value) {
            addCriterion("producttypeName =", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameNotEqualTo(String value) {
            addCriterion("producttypeName <>", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameGreaterThan(String value) {
            addCriterion("producttypeName >", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameGreaterThanOrEqualTo(String value) {
            addCriterion("producttypeName >=", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameLessThan(String value) {
            addCriterion("producttypeName <", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameLessThanOrEqualTo(String value) {
            addCriterion("producttypeName <=", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameLike(String value) {
            addCriterion("producttypeName like", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameNotLike(String value) {
            addCriterion("producttypeName not like", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameIn(List<String> values) {
            addCriterion("producttypeName in", values, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameNotIn(List<String> values) {
            addCriterion("producttypeName not in", values, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameBetween(String value1, String value2) {
            addCriterion("producttypeName between", value1, value2, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameNotBetween(String value1, String value2) {
            addCriterion("producttypeName not between", value1, value2, "producttypename");
            return (Criteria) this;
        }

        public Criteria andIfplannameIsNull() {
            addCriterion("ifplanName is null");
            return (Criteria) this;
        }

        public Criteria andIfplannameIsNotNull() {
            addCriterion("ifplanName is not null");
            return (Criteria) this;
        }

        public Criteria andIfplannameEqualTo(String value) {
            addCriterion("ifplanName =", value, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameNotEqualTo(String value) {
            addCriterion("ifplanName <>", value, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameGreaterThan(String value) {
            addCriterion("ifplanName >", value, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameGreaterThanOrEqualTo(String value) {
            addCriterion("ifplanName >=", value, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameLessThan(String value) {
            addCriterion("ifplanName <", value, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameLessThanOrEqualTo(String value) {
            addCriterion("ifplanName <=", value, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameLike(String value) {
            addCriterion("ifplanName like", value, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameNotLike(String value) {
            addCriterion("ifplanName not like", value, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameIn(List<String> values) {
            addCriterion("ifplanName in", values, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameNotIn(List<String> values) {
            addCriterion("ifplanName not in", values, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameBetween(String value1, String value2) {
            addCriterion("ifplanName between", value1, value2, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andIfplannameNotBetween(String value1, String value2) {
            addCriterion("ifplanName not between", value1, value2, "ifplanname");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIsNull() {
            addCriterion("plipmt_order is null");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIsNotNull() {
            addCriterion("plipmt_order is not null");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderEqualTo(Integer value) {
            addCriterion("plipmt_order =", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotEqualTo(Integer value) {
            addCriterion("plipmt_order <>", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderGreaterThan(Integer value) {
            addCriterion("plipmt_order >", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("plipmt_order >=", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLessThan(Integer value) {
            addCriterion("plipmt_order <", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderLessThanOrEqualTo(Integer value) {
            addCriterion("plipmt_order <=", value, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderIn(List<Integer> values) {
            addCriterion("plipmt_order in", values, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotIn(List<Integer> values) {
            addCriterion("plipmt_order not in", values, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderBetween(Integer value1, Integer value2) {
            addCriterion("plipmt_order between", value1, value2, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlipmtOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("plipmt_order not between", value1, value2, "plipmtOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderIsNull() {
            addCriterion("pl_order is null");
            return (Criteria) this;
        }

        public Criteria andPlOrderIsNotNull() {
            addCriterion("pl_order is not null");
            return (Criteria) this;
        }

        public Criteria andPlOrderEqualTo(Integer value) {
            addCriterion("pl_order =", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotEqualTo(Integer value) {
            addCriterion("pl_order <>", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderGreaterThan(Integer value) {
            addCriterion("pl_order >", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_order >=", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderLessThan(Integer value) {
            addCriterion("pl_order <", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pl_order <=", value, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderIn(List<Integer> values) {
            addCriterion("pl_order in", values, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotIn(List<Integer> values) {
            addCriterion("pl_order not in", values, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderBetween(Integer value1, Integer value2) {
            addCriterion("pl_order between", value1, value2, "plOrder");
            return (Criteria) this;
        }

        public Criteria andPlOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_order not between", value1, value2, "plOrder");
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