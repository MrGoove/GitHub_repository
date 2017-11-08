package com.greenlife.po;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceIsNull() {
            addCriterion("goodsPlace is null");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceIsNotNull() {
            addCriterion("goodsPlace is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceEqualTo(String value) {
            addCriterion("goodsPlace =", value, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceNotEqualTo(String value) {
            addCriterion("goodsPlace <>", value, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceGreaterThan(String value) {
            addCriterion("goodsPlace >", value, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceGreaterThanOrEqualTo(String value) {
            addCriterion("goodsPlace >=", value, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceLessThan(String value) {
            addCriterion("goodsPlace <", value, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceLessThanOrEqualTo(String value) {
            addCriterion("goodsPlace <=", value, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceLike(String value) {
            addCriterion("goodsPlace like", value, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceNotLike(String value) {
            addCriterion("goodsPlace not like", value, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceIn(List<String> values) {
            addCriterion("goodsPlace in", values, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceNotIn(List<String> values) {
            addCriterion("goodsPlace not in", values, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceBetween(String value1, String value2) {
            addCriterion("goodsPlace between", value1, value2, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsplaceNotBetween(String value1, String value2) {
            addCriterion("goodsPlace not between", value1, value2, "goodsplace");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNull() {
            addCriterion("goodsNumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNotNull() {
            addCriterion("goodsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberEqualTo(String value) {
            addCriterion("goodsNumber =", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotEqualTo(String value) {
            addCriterion("goodsNumber <>", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThan(String value) {
            addCriterion("goodsNumber >", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("goodsNumber >=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThan(String value) {
            addCriterion("goodsNumber <", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThanOrEqualTo(String value) {
            addCriterion("goodsNumber <=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLike(String value) {
            addCriterion("goodsNumber like", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotLike(String value) {
            addCriterion("goodsNumber not like", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIn(List<String> values) {
            addCriterion("goodsNumber in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotIn(List<String> values) {
            addCriterion("goodsNumber not in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberBetween(String value1, String value2) {
            addCriterion("goodsNumber between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotBetween(String value1, String value2) {
            addCriterion("goodsNumber not between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Double value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Double value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Double value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Double value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Double value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Double> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Double> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Double value1, Double value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Double value1, Double value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIsNull() {
            addCriterion("goodsUnit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIsNotNull() {
            addCriterion("goodsUnit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsunitEqualTo(String value) {
            addCriterion("goodsUnit =", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotEqualTo(String value) {
            addCriterion("goodsUnit <>", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitGreaterThan(String value) {
            addCriterion("goodsUnit >", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitGreaterThanOrEqualTo(String value) {
            addCriterion("goodsUnit >=", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLessThan(String value) {
            addCriterion("goodsUnit <", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLessThanOrEqualTo(String value) {
            addCriterion("goodsUnit <=", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLike(String value) {
            addCriterion("goodsUnit like", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotLike(String value) {
            addCriterion("goodsUnit not like", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIn(List<String> values) {
            addCriterion("goodsUnit in", values, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotIn(List<String> values) {
            addCriterion("goodsUnit not in", values, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitBetween(String value1, String value2) {
            addCriterion("goodsUnit between", value1, value2, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotBetween(String value1, String value2) {
            addCriterion("goodsUnit not between", value1, value2, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodspicIsNull() {
            addCriterion("goodsPic is null");
            return (Criteria) this;
        }

        public Criteria andGoodspicIsNotNull() {
            addCriterion("goodsPic is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspicEqualTo(String value) {
            addCriterion("goodsPic =", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicNotEqualTo(String value) {
            addCriterion("goodsPic <>", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicGreaterThan(String value) {
            addCriterion("goodsPic >", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicGreaterThanOrEqualTo(String value) {
            addCriterion("goodsPic >=", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicLessThan(String value) {
            addCriterion("goodsPic <", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicLessThanOrEqualTo(String value) {
            addCriterion("goodsPic <=", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicLike(String value) {
            addCriterion("goodsPic like", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicNotLike(String value) {
            addCriterion("goodsPic not like", value, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicIn(List<String> values) {
            addCriterion("goodsPic in", values, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicNotIn(List<String> values) {
            addCriterion("goodsPic not in", values, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicBetween(String value1, String value2) {
            addCriterion("goodsPic between", value1, value2, "goodspic");
            return (Criteria) this;
        }

        public Criteria andGoodspicNotBetween(String value1, String value2) {
            addCriterion("goodsPic not between", value1, value2, "goodspic");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oId is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oId is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oId =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oId <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oId >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oId >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oId <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oId <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oId in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oId not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oId between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oId not between", value1, value2, "oid");
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