package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActividadaportesCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActividadaportesCriteria() {
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

        public Criteria andIdactividadaportesIsNull() {
            addCriterion("IDACTIVIDADAPORTES is null");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesIsNotNull() {
            addCriterion("IDACTIVIDADAPORTES is not null");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADAPORTES =", value, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesNotEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADAPORTES <>", value, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesGreaterThan(BigDecimal value) {
            addCriterion("IDACTIVIDADAPORTES >", value, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADAPORTES >=", value, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesLessThan(BigDecimal value) {
            addCriterion("IDACTIVIDADAPORTES <", value, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADAPORTES <=", value, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesIn(List<BigDecimal> values) {
            addCriterion("IDACTIVIDADAPORTES in", values, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesNotIn(List<BigDecimal> values) {
            addCriterion("IDACTIVIDADAPORTES not in", values, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDACTIVIDADAPORTES between", value1, value2, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdactividadaportesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDACTIVIDADAPORTES not between", value1, value2, "idactividadaportes");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosIsNull() {
            addCriterion("IDCUENTAALUMNOS is null");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosIsNotNull() {
            addCriterion("IDCUENTAALUMNOS is not null");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS =", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosNotEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS <>", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosGreaterThan(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS >", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS >=", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosLessThan(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS <", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS <=", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAALUMNOS in", values, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosNotIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAALUMNOS not in", values, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAALUMNOS between", value1, value2, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAALUMNOS not between", value1, value2, "idcuentaalumnos");
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

        public Criteria andMontoIsNull() {
            addCriterion("MONTO is null");
            return (Criteria) this;
        }

        public Criteria andMontoIsNotNull() {
            addCriterion("MONTO is not null");
            return (Criteria) this;
        }

        public Criteria andMontoEqualTo(BigDecimal value) {
            addCriterion("MONTO =", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotEqualTo(BigDecimal value) {
            addCriterion("MONTO <>", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoGreaterThan(BigDecimal value) {
            addCriterion("MONTO >", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTO >=", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoLessThan(BigDecimal value) {
            addCriterion("MONTO <", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTO <=", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoIn(List<BigDecimal> values) {
            addCriterion("MONTO in", values, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotIn(List<BigDecimal> values) {
            addCriterion("MONTO not in", values, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTO between", value1, value2, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTO not between", value1, value2, "monto");
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
