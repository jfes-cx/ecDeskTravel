package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComunaCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComunaCriteria() {
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

        public Criteria andIdcomunaIsNull() {
            addCriterion("IDCOMUNA is null");
            return (Criteria) this;
        }

        public Criteria andIdcomunaIsNotNull() {
            addCriterion("IDCOMUNA is not null");
            return (Criteria) this;
        }

        public Criteria andIdcomunaEqualTo(BigDecimal value) {
            addCriterion("IDCOMUNA =", value, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaNotEqualTo(BigDecimal value) {
            addCriterion("IDCOMUNA <>", value, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaGreaterThan(BigDecimal value) {
            addCriterion("IDCOMUNA >", value, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCOMUNA >=", value, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaLessThan(BigDecimal value) {
            addCriterion("IDCOMUNA <", value, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCOMUNA <=", value, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaIn(List<BigDecimal> values) {
            addCriterion("IDCOMUNA in", values, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaNotIn(List<BigDecimal> values) {
            addCriterion("IDCOMUNA not in", values, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCOMUNA between", value1, value2, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andIdcomunaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCOMUNA not between", value1, value2, "idcomuna");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("NOMBRE is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("NOMBRE is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("NOMBRE =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("NOMBRE <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("NOMBRE >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBRE >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("NOMBRE <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("NOMBRE <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("NOMBRE like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("NOMBRE not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("NOMBRE in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("NOMBRE not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("NOMBRE between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("NOMBRE not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andIdregionIsNull() {
            addCriterion("IDREGION is null");
            return (Criteria) this;
        }

        public Criteria andIdregionIsNotNull() {
            addCriterion("IDREGION is not null");
            return (Criteria) this;
        }

        public Criteria andIdregionEqualTo(BigDecimal value) {
            addCriterion("IDREGION =", value, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionNotEqualTo(BigDecimal value) {
            addCriterion("IDREGION <>", value, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionGreaterThan(BigDecimal value) {
            addCriterion("IDREGION >", value, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDREGION >=", value, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionLessThan(BigDecimal value) {
            addCriterion("IDREGION <", value, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDREGION <=", value, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionIn(List<BigDecimal> values) {
            addCriterion("IDREGION in", values, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionNotIn(List<BigDecimal> values) {
            addCriterion("IDREGION not in", values, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDREGION between", value1, value2, "idregion");
            return (Criteria) this;
        }

        public Criteria andIdregionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDREGION not between", value1, value2, "idregion");
            return (Criteria) this;
        }

        public Criteria andNombreLikeInsensitive(String value) {
            addCriterion("upper(NOMBRE) like", value.toUpperCase(), "nombre");
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
