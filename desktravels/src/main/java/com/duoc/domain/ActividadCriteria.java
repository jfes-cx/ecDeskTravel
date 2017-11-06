package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActividadCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActividadCriteria() {
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

        public Criteria andIdactividadIsNull() {
            addCriterion("IDACTIVIDAD is null");
            return (Criteria) this;
        }

        public Criteria andIdactividadIsNotNull() {
            addCriterion("IDACTIVIDAD is not null");
            return (Criteria) this;
        }

        public Criteria andIdactividadEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDAD =", value, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadNotEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDAD <>", value, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadGreaterThan(BigDecimal value) {
            addCriterion("IDACTIVIDAD >", value, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDAD >=", value, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadLessThan(BigDecimal value) {
            addCriterion("IDACTIVIDAD <", value, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDAD <=", value, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadIn(List<BigDecimal> values) {
            addCriterion("IDACTIVIDAD in", values, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadNotIn(List<BigDecimal> values) {
            addCriterion("IDACTIVIDAD not in", values, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDACTIVIDAD between", value1, value2, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdactividadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDACTIVIDAD not between", value1, value2, "idactividad");
            return (Criteria) this;
        }

        public Criteria andIdcursoIsNull() {
            addCriterion("IDCURSO is null");
            return (Criteria) this;
        }

        public Criteria andIdcursoIsNotNull() {
            addCriterion("IDCURSO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcursoEqualTo(BigDecimal value) {
            addCriterion("IDCURSO =", value, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoNotEqualTo(BigDecimal value) {
            addCriterion("IDCURSO <>", value, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoGreaterThan(BigDecimal value) {
            addCriterion("IDCURSO >", value, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCURSO >=", value, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoLessThan(BigDecimal value) {
            addCriterion("IDCURSO <", value, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCURSO <=", value, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoIn(List<BigDecimal> values) {
            addCriterion("IDCURSO in", values, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoNotIn(List<BigDecimal> values) {
            addCriterion("IDCURSO not in", values, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCURSO between", value1, value2, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdcursoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCURSO not between", value1, value2, "idcurso");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadIsNull() {
            addCriterion("IDTIPOACTIVIDAD is null");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadIsNotNull() {
            addCriterion("IDTIPOACTIVIDAD is not null");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadEqualTo(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDAD =", value, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadNotEqualTo(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDAD <>", value, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadGreaterThan(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDAD >", value, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDAD >=", value, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadLessThan(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDAD <", value, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDAD <=", value, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadIn(List<BigDecimal> values) {
            addCriterion("IDTIPOACTIVIDAD in", values, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadNotIn(List<BigDecimal> values) {
            addCriterion("IDTIPOACTIVIDAD not in", values, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOACTIVIDAD between", value1, value2, "idtipoactividad");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOACTIVIDAD not between", value1, value2, "idtipoactividad");
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

        public Criteria andCantidadpersonaIsNull() {
            addCriterion("CANTIDADPERSONA is null");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaIsNotNull() {
            addCriterion("CANTIDADPERSONA is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaEqualTo(BigDecimal value) {
            addCriterion("CANTIDADPERSONA =", value, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaNotEqualTo(BigDecimal value) {
            addCriterion("CANTIDADPERSONA <>", value, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaGreaterThan(BigDecimal value) {
            addCriterion("CANTIDADPERSONA >", value, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CANTIDADPERSONA >=", value, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaLessThan(BigDecimal value) {
            addCriterion("CANTIDADPERSONA <", value, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CANTIDADPERSONA <=", value, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaIn(List<BigDecimal> values) {
            addCriterion("CANTIDADPERSONA in", values, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaNotIn(List<BigDecimal> values) {
            addCriterion("CANTIDADPERSONA not in", values, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CANTIDADPERSONA between", value1, value2, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andCantidadpersonaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CANTIDADPERSONA not between", value1, value2, "cantidadpersona");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoIsNull() {
            addCriterion("MONTORECAUDADO is null");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoIsNotNull() {
            addCriterion("MONTORECAUDADO is not null");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoEqualTo(BigDecimal value) {
            addCriterion("MONTORECAUDADO =", value, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoNotEqualTo(BigDecimal value) {
            addCriterion("MONTORECAUDADO <>", value, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoGreaterThan(BigDecimal value) {
            addCriterion("MONTORECAUDADO >", value, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTORECAUDADO >=", value, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoLessThan(BigDecimal value) {
            addCriterion("MONTORECAUDADO <", value, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTORECAUDADO <=", value, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoIn(List<BigDecimal> values) {
            addCriterion("MONTORECAUDADO in", values, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoNotIn(List<BigDecimal> values) {
            addCriterion("MONTORECAUDADO not in", values, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTORECAUDADO between", value1, value2, "montorecaudado");
            return (Criteria) this;
        }

        public Criteria andMontorecaudadoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTORECAUDADO not between", value1, value2, "montorecaudado");
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