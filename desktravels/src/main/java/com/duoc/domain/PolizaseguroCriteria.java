package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PolizaseguroCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PolizaseguroCriteria() {
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

        public Criteria andIdpolizasegurosIsNull() {
            addCriterion("IDPOLIZASEGUROS is null");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosIsNotNull() {
            addCriterion("IDPOLIZASEGUROS is not null");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosEqualTo(BigDecimal value) {
            addCriterion("IDPOLIZASEGUROS =", value, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosNotEqualTo(BigDecimal value) {
            addCriterion("IDPOLIZASEGUROS <>", value, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosGreaterThan(BigDecimal value) {
            addCriterion("IDPOLIZASEGUROS >", value, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPOLIZASEGUROS >=", value, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosLessThan(BigDecimal value) {
            addCriterion("IDPOLIZASEGUROS <", value, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPOLIZASEGUROS <=", value, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosIn(List<BigDecimal> values) {
            addCriterion("IDPOLIZASEGUROS in", values, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosNotIn(List<BigDecimal> values) {
            addCriterion("IDPOLIZASEGUROS not in", values, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPOLIZASEGUROS between", value1, value2, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdpolizasegurosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPOLIZASEGUROS not between", value1, value2, "idpolizaseguros");
            return (Criteria) this;
        }

        public Criteria andIdalumnoIsNull() {
            addCriterion("IDALUMNO is null");
            return (Criteria) this;
        }

        public Criteria andIdalumnoIsNotNull() {
            addCriterion("IDALUMNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdalumnoEqualTo(BigDecimal value) {
            addCriterion("IDALUMNO =", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoNotEqualTo(BigDecimal value) {
            addCriterion("IDALUMNO <>", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoGreaterThan(BigDecimal value) {
            addCriterion("IDALUMNO >", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDALUMNO >=", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoLessThan(BigDecimal value) {
            addCriterion("IDALUMNO <", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDALUMNO <=", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoIn(List<BigDecimal> values) {
            addCriterion("IDALUMNO in", values, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoNotIn(List<BigDecimal> values) {
            addCriterion("IDALUMNO not in", values, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDALUMNO between", value1, value2, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDALUMNO not between", value1, value2, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroIsNull() {
            addCriterion("IDTIPOSEGURO is null");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroIsNotNull() {
            addCriterion("IDTIPOSEGURO is not null");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroEqualTo(BigDecimal value) {
            addCriterion("IDTIPOSEGURO =", value, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroNotEqualTo(BigDecimal value) {
            addCriterion("IDTIPOSEGURO <>", value, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroGreaterThan(BigDecimal value) {
            addCriterion("IDTIPOSEGURO >", value, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOSEGURO >=", value, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroLessThan(BigDecimal value) {
            addCriterion("IDTIPOSEGURO <", value, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOSEGURO <=", value, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroIn(List<BigDecimal> values) {
            addCriterion("IDTIPOSEGURO in", values, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroNotIn(List<BigDecimal> values) {
            addCriterion("IDTIPOSEGURO not in", values, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOSEGURO between", value1, value2, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdtiposeguroNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOSEGURO not between", value1, value2, "idtiposeguro");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraIsNull() {
            addCriterion("IDASEGURADORA is null");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraIsNotNull() {
            addCriterion("IDASEGURADORA is not null");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraEqualTo(Short value) {
            addCriterion("IDASEGURADORA =", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraNotEqualTo(Short value) {
            addCriterion("IDASEGURADORA <>", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraGreaterThan(Short value) {
            addCriterion("IDASEGURADORA >", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraGreaterThanOrEqualTo(Short value) {
            addCriterion("IDASEGURADORA >=", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraLessThan(Short value) {
            addCriterion("IDASEGURADORA <", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraLessThanOrEqualTo(Short value) {
            addCriterion("IDASEGURADORA <=", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraIn(List<Short> values) {
            addCriterion("IDASEGURADORA in", values, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraNotIn(List<Short> values) {
            addCriterion("IDASEGURADORA not in", values, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraBetween(Short value1, Short value2) {
            addCriterion("IDASEGURADORA between", value1, value2, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraNotBetween(Short value1, Short value2) {
            addCriterion("IDASEGURADORA not between", value1, value2, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("DESCRIPCION is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("DESCRIPCION is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("DESCRIPCION =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("DESCRIPCION <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("DESCRIPCION >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("DESCRIPCION <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("DESCRIPCION like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("DESCRIPCION not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("DESCRIPCION in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("DESCRIPCION not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("DESCRIPCION between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andFechainicioIsNull() {
            addCriterion("FECHAINICIO is null");
            return (Criteria) this;
        }

        public Criteria andFechainicioIsNotNull() {
            addCriterion("FECHAINICIO is not null");
            return (Criteria) this;
        }

        public Criteria andFechainicioEqualTo(Date value) {
            addCriterion("FECHAINICIO =", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotEqualTo(Date value) {
            addCriterion("FECHAINICIO <>", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioGreaterThan(Date value) {
            addCriterion("FECHAINICIO >", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHAINICIO >=", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioLessThan(Date value) {
            addCriterion("FECHAINICIO <", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioLessThanOrEqualTo(Date value) {
            addCriterion("FECHAINICIO <=", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioIn(List<Date> values) {
            addCriterion("FECHAINICIO in", values, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotIn(List<Date> values) {
            addCriterion("FECHAINICIO not in", values, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioBetween(Date value1, Date value2) {
            addCriterion("FECHAINICIO between", value1, value2, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotBetween(Date value1, Date value2) {
            addCriterion("FECHAINICIO not between", value1, value2, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechaterminoIsNull() {
            addCriterion("FECHATERMINO is null");
            return (Criteria) this;
        }

        public Criteria andFechaterminoIsNotNull() {
            addCriterion("FECHATERMINO is not null");
            return (Criteria) this;
        }

        public Criteria andFechaterminoEqualTo(Date value) {
            addCriterion("FECHATERMINO =", value, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoNotEqualTo(Date value) {
            addCriterion("FECHATERMINO <>", value, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoGreaterThan(Date value) {
            addCriterion("FECHATERMINO >", value, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHATERMINO >=", value, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoLessThan(Date value) {
            addCriterion("FECHATERMINO <", value, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoLessThanOrEqualTo(Date value) {
            addCriterion("FECHATERMINO <=", value, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoIn(List<Date> values) {
            addCriterion("FECHATERMINO in", values, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoNotIn(List<Date> values) {
            addCriterion("FECHATERMINO not in", values, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoBetween(Date value1, Date value2) {
            addCriterion("FECHATERMINO between", value1, value2, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andFechaterminoNotBetween(Date value1, Date value2) {
            addCriterion("FECHATERMINO not between", value1, value2, "fechatermino");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoIsNull() {
            addCriterion("MONTOASEGURADO is null");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoIsNotNull() {
            addCriterion("MONTOASEGURADO is not null");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoEqualTo(BigDecimal value) {
            addCriterion("MONTOASEGURADO =", value, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoNotEqualTo(BigDecimal value) {
            addCriterion("MONTOASEGURADO <>", value, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoGreaterThan(BigDecimal value) {
            addCriterion("MONTOASEGURADO >", value, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTOASEGURADO >=", value, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoLessThan(BigDecimal value) {
            addCriterion("MONTOASEGURADO <", value, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTOASEGURADO <=", value, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoIn(List<BigDecimal> values) {
            addCriterion("MONTOASEGURADO in", values, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoNotIn(List<BigDecimal> values) {
            addCriterion("MONTOASEGURADO not in", values, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTOASEGURADO between", value1, value2, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andMontoaseguradoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTOASEGURADO not between", value1, value2, "montoasegurado");
            return (Criteria) this;
        }

        public Criteria andDescripcionLikeInsensitive(String value) {
            addCriterion("upper(DESCRIPCION) like", value.toUpperCase(), "descripcion");
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
