package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ServicioviajeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicioviajeCriteria() {
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

        public Criteria andIdservicioviajeIsNull() {
            addCriterion("IDSERVICIOVIAJE is null");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeIsNotNull() {
            addCriterion("IDSERVICIOVIAJE is not null");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeEqualTo(BigDecimal value) {
            addCriterion("IDSERVICIOVIAJE =", value, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeNotEqualTo(BigDecimal value) {
            addCriterion("IDSERVICIOVIAJE <>", value, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeGreaterThan(BigDecimal value) {
            addCriterion("IDSERVICIOVIAJE >", value, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDSERVICIOVIAJE >=", value, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeLessThan(BigDecimal value) {
            addCriterion("IDSERVICIOVIAJE <", value, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDSERVICIOVIAJE <=", value, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeIn(List<BigDecimal> values) {
            addCriterion("IDSERVICIOVIAJE in", values, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeNotIn(List<BigDecimal> values) {
            addCriterion("IDSERVICIOVIAJE not in", values, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDSERVICIOVIAJE between", value1, value2, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andIdservicioviajeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDSERVICIOVIAJE not between", value1, value2, "idservicioviaje");
            return (Criteria) this;
        }

        public Criteria andTiposervicioIsNull() {
            addCriterion("TIPOSERVICIO is null");
            return (Criteria) this;
        }

        public Criteria andTiposervicioIsNotNull() {
            addCriterion("TIPOSERVICIO is not null");
            return (Criteria) this;
        }

        public Criteria andTiposervicioEqualTo(String value) {
            addCriterion("TIPOSERVICIO =", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioNotEqualTo(String value) {
            addCriterion("TIPOSERVICIO <>", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioGreaterThan(String value) {
            addCriterion("TIPOSERVICIO >", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioGreaterThanOrEqualTo(String value) {
            addCriterion("TIPOSERVICIO >=", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioLessThan(String value) {
            addCriterion("TIPOSERVICIO <", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioLessThanOrEqualTo(String value) {
            addCriterion("TIPOSERVICIO <=", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioLike(String value) {
            addCriterion("TIPOSERVICIO like", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioNotLike(String value) {
            addCriterion("TIPOSERVICIO not like", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioIn(List<String> values) {
            addCriterion("TIPOSERVICIO in", values, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioNotIn(List<String> values) {
            addCriterion("TIPOSERVICIO not in", values, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioBetween(String value1, String value2) {
            addCriterion("TIPOSERVICIO between", value1, value2, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioNotBetween(String value1, String value2) {
            addCriterion("TIPOSERVICIO not between", value1, value2, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioLikeInsensitive(String value) {
            addCriterion("upper(TIPOSERVICIO) like", value.toUpperCase(), "tiposervicio");
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