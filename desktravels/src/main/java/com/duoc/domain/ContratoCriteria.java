package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContratoCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContratoCriteria() {
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

        public Criteria andIdcontratoIsNull() {
            addCriterion("IDCONTRATO is null");
            return (Criteria) this;
        }

        public Criteria andIdcontratoIsNotNull() {
            addCriterion("IDCONTRATO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcontratoEqualTo(BigDecimal value) {
            addCriterion("IDCONTRATO =", value, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoNotEqualTo(BigDecimal value) {
            addCriterion("IDCONTRATO <>", value, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoGreaterThan(BigDecimal value) {
            addCriterion("IDCONTRATO >", value, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCONTRATO >=", value, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoLessThan(BigDecimal value) {
            addCriterion("IDCONTRATO <", value, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCONTRATO <=", value, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoIn(List<BigDecimal> values) {
            addCriterion("IDCONTRATO in", values, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoNotIn(List<BigDecimal> values) {
            addCriterion("IDCONTRATO not in", values, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCONTRATO between", value1, value2, "idcontrato");
            return (Criteria) this;
        }

        public Criteria andIdcontratoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCONTRATO not between", value1, value2, "idcontrato");
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

        public Criteria andIdcolaboradorIsNull() {
            addCriterion("IDCOLABORADOR is null");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorIsNotNull() {
            addCriterion("IDCOLABORADOR is not null");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorEqualTo(BigDecimal value) {
            addCriterion("IDCOLABORADOR =", value, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorNotEqualTo(BigDecimal value) {
            addCriterion("IDCOLABORADOR <>", value, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorGreaterThan(BigDecimal value) {
            addCriterion("IDCOLABORADOR >", value, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCOLABORADOR >=", value, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorLessThan(BigDecimal value) {
            addCriterion("IDCOLABORADOR <", value, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCOLABORADOR <=", value, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorIn(List<BigDecimal> values) {
            addCriterion("IDCOLABORADOR in", values, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorNotIn(List<BigDecimal> values) {
            addCriterion("IDCOLABORADOR not in", values, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCOLABORADOR between", value1, value2, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdcolaboradorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCOLABORADOR not between", value1, value2, "idcolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoIsNull() {
            addCriterion("IDTIPOCONTRATO is null");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoIsNotNull() {
            addCriterion("IDTIPOCONTRATO is not null");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCONTRATO =", value, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoNotEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCONTRATO <>", value, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoGreaterThan(BigDecimal value) {
            addCriterion("IDTIPOCONTRATO >", value, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCONTRATO >=", value, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoLessThan(BigDecimal value) {
            addCriterion("IDTIPOCONTRATO <", value, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCONTRATO <=", value, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoIn(List<BigDecimal> values) {
            addCriterion("IDTIPOCONTRATO in", values, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoNotIn(List<BigDecimal> values) {
            addCriterion("IDTIPOCONTRATO not in", values, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOCONTRATO between", value1, value2, "idtipocontrato");
            return (Criteria) this;
        }

        public Criteria andIdtipocontratoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOCONTRATO not between", value1, value2, "idtipocontrato");
            return (Criteria) this;
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

        public Criteria andIdservicioIsNull() {
            addCriterion("IDSERVICIO is null");
            return (Criteria) this;
        }

        public Criteria andIdservicioIsNotNull() {
            addCriterion("IDSERVICIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdservicioEqualTo(BigDecimal value) {
            addCriterion("IDSERVICIO =", value, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioNotEqualTo(BigDecimal value) {
            addCriterion("IDSERVICIO <>", value, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioGreaterThan(BigDecimal value) {
            addCriterion("IDSERVICIO >", value, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDSERVICIO >=", value, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioLessThan(BigDecimal value) {
            addCriterion("IDSERVICIO <", value, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDSERVICIO <=", value, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioIn(List<BigDecimal> values) {
            addCriterion("IDSERVICIO in", values, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioNotIn(List<BigDecimal> values) {
            addCriterion("IDSERVICIO not in", values, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDSERVICIO between", value1, value2, "idservicio");
            return (Criteria) this;
        }

        public Criteria andIdservicioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDSERVICIO not between", value1, value2, "idservicio");
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
