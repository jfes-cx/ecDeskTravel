package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EstadocuentaCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EstadocuentaCriteria() {
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

        public Criteria andIdestadocuentaIsNull() {
            addCriterion("IDESTADOCUENTA is null");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaIsNotNull() {
            addCriterion("IDESTADOCUENTA is not null");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaEqualTo(BigDecimal value) {
            addCriterion("IDESTADOCUENTA =", value, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaNotEqualTo(BigDecimal value) {
            addCriterion("IDESTADOCUENTA <>", value, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaGreaterThan(BigDecimal value) {
            addCriterion("IDESTADOCUENTA >", value, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDESTADOCUENTA >=", value, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaLessThan(BigDecimal value) {
            addCriterion("IDESTADOCUENTA <", value, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDESTADOCUENTA <=", value, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaIn(List<BigDecimal> values) {
            addCriterion("IDESTADOCUENTA in", values, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaNotIn(List<BigDecimal> values) {
            addCriterion("IDESTADOCUENTA not in", values, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDESTADOCUENTA between", value1, value2, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdestadocuentaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDESTADOCUENTA not between", value1, value2, "idestadocuenta");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoIsNull() {
            addCriterion("IDCUENTAALUMNO is null");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoIsNotNull() {
            addCriterion("IDCUENTAALUMNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNO =", value, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoNotEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNO <>", value, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoGreaterThan(BigDecimal value) {
            addCriterion("IDCUENTAALUMNO >", value, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNO >=", value, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoLessThan(BigDecimal value) {
            addCriterion("IDCUENTAALUMNO <", value, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNO <=", value, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAALUMNO in", values, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoNotIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAALUMNO not in", values, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAALUMNO between", value1, value2, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAALUMNO not between", value1, value2, "idcuentaalumno");
            return (Criteria) this;
        }

        public Criteria andDetalleIsNull() {
            addCriterion("DETALLE is null");
            return (Criteria) this;
        }

        public Criteria andDetalleIsNotNull() {
            addCriterion("DETALLE is not null");
            return (Criteria) this;
        }

        public Criteria andDetalleEqualTo(String value) {
            addCriterion("DETALLE =", value, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleNotEqualTo(String value) {
            addCriterion("DETALLE <>", value, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleGreaterThan(String value) {
            addCriterion("DETALLE >", value, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleGreaterThanOrEqualTo(String value) {
            addCriterion("DETALLE >=", value, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleLessThan(String value) {
            addCriterion("DETALLE <", value, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleLessThanOrEqualTo(String value) {
            addCriterion("DETALLE <=", value, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleLike(String value) {
            addCriterion("DETALLE like", value, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleNotLike(String value) {
            addCriterion("DETALLE not like", value, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleIn(List<String> values) {
            addCriterion("DETALLE in", values, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleNotIn(List<String> values) {
            addCriterion("DETALLE not in", values, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleBetween(String value1, String value2) {
            addCriterion("DETALLE between", value1, value2, "detalle");
            return (Criteria) this;
        }

        public Criteria andDetalleNotBetween(String value1, String value2) {
            addCriterion("DETALLE not between", value1, value2, "detalle");
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

        public Criteria andDetalleLikeInsensitive(String value) {
            addCriterion("upper(DETALLE) like", value.toUpperCase(), "detalle");
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