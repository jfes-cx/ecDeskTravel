package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaqueteCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaqueteCriteria() {
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

        public Criteria andIdpaqueteIsNull() {
            addCriterion("IDPAQUETE is null");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteIsNotNull() {
            addCriterion("IDPAQUETE is not null");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteEqualTo(Short value) {
            addCriterion("IDPAQUETE =", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteNotEqualTo(Short value) {
            addCriterion("IDPAQUETE <>", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteGreaterThan(Short value) {
            addCriterion("IDPAQUETE >", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteGreaterThanOrEqualTo(Short value) {
            addCriterion("IDPAQUETE >=", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteLessThan(Short value) {
            addCriterion("IDPAQUETE <", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteLessThanOrEqualTo(Short value) {
            addCriterion("IDPAQUETE <=", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteIn(List<Short> values) {
            addCriterion("IDPAQUETE in", values, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteNotIn(List<Short> values) {
            addCriterion("IDPAQUETE not in", values, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteBetween(Short value1, Short value2) {
            addCriterion("IDPAQUETE between", value1, value2, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteNotBetween(Short value1, Short value2) {
            addCriterion("IDPAQUETE not between", value1, value2, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andFechaIsNull() {
            addCriterion("FECHA is null");
            return (Criteria) this;
        }

        public Criteria andFechaIsNotNull() {
            addCriterion("FECHA is not null");
            return (Criteria) this;
        }

        public Criteria andFechaEqualTo(Date value) {
            addCriterion("FECHA =", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotEqualTo(Date value) {
            addCriterion("FECHA <>", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThan(Date value) {
            addCriterion("FECHA >", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHA >=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThan(Date value) {
            addCriterion("FECHA <", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThanOrEqualTo(Date value) {
            addCriterion("FECHA <=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaIn(List<Date> values) {
            addCriterion("FECHA in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotIn(List<Date> values) {
            addCriterion("FECHA not in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaBetween(Date value1, Date value2) {
            addCriterion("FECHA between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotBetween(Date value1, Date value2) {
            addCriterion("FECHA not between", value1, value2, "fecha");
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

        public Criteria andPrecioIsNull() {
            addCriterion("PRECIO is null");
            return (Criteria) this;
        }

        public Criteria andPrecioIsNotNull() {
            addCriterion("PRECIO is not null");
            return (Criteria) this;
        }

        public Criteria andPrecioEqualTo(BigDecimal value) {
            addCriterion("PRECIO =", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotEqualTo(BigDecimal value) {
            addCriterion("PRECIO <>", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioGreaterThan(BigDecimal value) {
            addCriterion("PRECIO >", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRECIO >=", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioLessThan(BigDecimal value) {
            addCriterion("PRECIO <", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRECIO <=", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioIn(List<BigDecimal> values) {
            addCriterion("PRECIO in", values, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotIn(List<BigDecimal> values) {
            addCriterion("PRECIO not in", values, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRECIO between", value1, value2, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRECIO not between", value1, value2, "precio");
            return (Criteria) this;
        }

        public Criteria andIddestinoIsNull() {
            addCriterion("IDDESTINO is null");
            return (Criteria) this;
        }

        public Criteria andIddestinoIsNotNull() {
            addCriterion("IDDESTINO is not null");
            return (Criteria) this;
        }

        public Criteria andIddestinoEqualTo(BigDecimal value) {
            addCriterion("IDDESTINO =", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoNotEqualTo(BigDecimal value) {
            addCriterion("IDDESTINO <>", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoGreaterThan(BigDecimal value) {
            addCriterion("IDDESTINO >", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDDESTINO >=", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoLessThan(BigDecimal value) {
            addCriterion("IDDESTINO <", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDDESTINO <=", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoIn(List<BigDecimal> values) {
            addCriterion("IDDESTINO in", values, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoNotIn(List<BigDecimal> values) {
            addCriterion("IDDESTINO not in", values, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDDESTINO between", value1, value2, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDDESTINO not between", value1, value2, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIdorigenIsNull() {
            addCriterion("IDORIGEN is null");
            return (Criteria) this;
        }

        public Criteria andIdorigenIsNotNull() {
            addCriterion("IDORIGEN is not null");
            return (Criteria) this;
        }

        public Criteria andIdorigenEqualTo(Short value) {
            addCriterion("IDORIGEN =", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenNotEqualTo(Short value) {
            addCriterion("IDORIGEN <>", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenGreaterThan(Short value) {
            addCriterion("IDORIGEN >", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenGreaterThanOrEqualTo(Short value) {
            addCriterion("IDORIGEN >=", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenLessThan(Short value) {
            addCriterion("IDORIGEN <", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenLessThanOrEqualTo(Short value) {
            addCriterion("IDORIGEN <=", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenIn(List<Short> values) {
            addCriterion("IDORIGEN in", values, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenNotIn(List<Short> values) {
            addCriterion("IDORIGEN not in", values, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenBetween(Short value1, Short value2) {
            addCriterion("IDORIGEN between", value1, value2, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenNotBetween(Short value1, Short value2) {
            addCriterion("IDORIGEN not between", value1, value2, "idorigen");
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