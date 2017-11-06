package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PagoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PagoCriteria() {
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

        public Criteria andIdpagoIsNull() {
            addCriterion("IDPAGO is null");
            return (Criteria) this;
        }

        public Criteria andIdpagoIsNotNull() {
            addCriterion("IDPAGO is not null");
            return (Criteria) this;
        }

        public Criteria andIdpagoEqualTo(BigDecimal value) {
            addCriterion("IDPAGO =", value, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoNotEqualTo(BigDecimal value) {
            addCriterion("IDPAGO <>", value, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoGreaterThan(BigDecimal value) {
            addCriterion("IDPAGO >", value, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPAGO >=", value, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoLessThan(BigDecimal value) {
            addCriterion("IDPAGO <", value, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPAGO <=", value, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoIn(List<BigDecimal> values) {
            addCriterion("IDPAGO in", values, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoNotIn(List<BigDecimal> values) {
            addCriterion("IDPAGO not in", values, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPAGO between", value1, value2, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdpagoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPAGO not between", value1, value2, "idpago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoIsNull() {
            addCriterion("IDTIPOPAGO is null");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoIsNotNull() {
            addCriterion("IDTIPOPAGO is not null");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoEqualTo(BigDecimal value) {
            addCriterion("IDTIPOPAGO =", value, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoNotEqualTo(BigDecimal value) {
            addCriterion("IDTIPOPAGO <>", value, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoGreaterThan(BigDecimal value) {
            addCriterion("IDTIPOPAGO >", value, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOPAGO >=", value, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoLessThan(BigDecimal value) {
            addCriterion("IDTIPOPAGO <", value, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOPAGO <=", value, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoIn(List<BigDecimal> values) {
            addCriterion("IDTIPOPAGO in", values, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoNotIn(List<BigDecimal> values) {
            addCriterion("IDTIPOPAGO not in", values, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOPAGO between", value1, value2, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdtipopagoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOPAGO not between", value1, value2, "idtipopago");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoIsNull() {
            addCriterion("IDCUENTACURSO is null");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoIsNotNull() {
            addCriterion("IDCUENTACURSO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoEqualTo(BigDecimal value) {
            addCriterion("IDCUENTACURSO =", value, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoNotEqualTo(BigDecimal value) {
            addCriterion("IDCUENTACURSO <>", value, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoGreaterThan(BigDecimal value) {
            addCriterion("IDCUENTACURSO >", value, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTACURSO >=", value, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoLessThan(BigDecimal value) {
            addCriterion("IDCUENTACURSO <", value, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTACURSO <=", value, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoIn(List<BigDecimal> values) {
            addCriterion("IDCUENTACURSO in", values, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoNotIn(List<BigDecimal> values) {
            addCriterion("IDCUENTACURSO not in", values, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTACURSO between", value1, value2, "idcuentacurso");
            return (Criteria) this;
        }

        public Criteria andIdcuentacursoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTACURSO not between", value1, value2, "idcuentacurso");
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

        public Criteria andFechapagoIsNull() {
            addCriterion("FECHAPAGO is null");
            return (Criteria) this;
        }

        public Criteria andFechapagoIsNotNull() {
            addCriterion("FECHAPAGO is not null");
            return (Criteria) this;
        }

        public Criteria andFechapagoEqualTo(Date value) {
            addCriterion("FECHAPAGO =", value, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoNotEqualTo(Date value) {
            addCriterion("FECHAPAGO <>", value, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoGreaterThan(Date value) {
            addCriterion("FECHAPAGO >", value, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoGreaterThanOrEqualTo(Date value) {
            addCriterion("FECHAPAGO >=", value, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoLessThan(Date value) {
            addCriterion("FECHAPAGO <", value, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoLessThanOrEqualTo(Date value) {
            addCriterion("FECHAPAGO <=", value, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoIn(List<Date> values) {
            addCriterion("FECHAPAGO in", values, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoNotIn(List<Date> values) {
            addCriterion("FECHAPAGO not in", values, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoBetween(Date value1, Date value2) {
            addCriterion("FECHAPAGO between", value1, value2, "fechapago");
            return (Criteria) this;
        }

        public Criteria andFechapagoNotBetween(Date value1, Date value2) {
            addCriterion("FECHAPAGO not between", value1, value2, "fechapago");
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

        public Criteria andMontocanceladoIsNull() {
            addCriterion("MONTOCANCELADO is null");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoIsNotNull() {
            addCriterion("MONTOCANCELADO is not null");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoEqualTo(BigDecimal value) {
            addCriterion("MONTOCANCELADO =", value, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoNotEqualTo(BigDecimal value) {
            addCriterion("MONTOCANCELADO <>", value, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoGreaterThan(BigDecimal value) {
            addCriterion("MONTOCANCELADO >", value, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTOCANCELADO >=", value, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoLessThan(BigDecimal value) {
            addCriterion("MONTOCANCELADO <", value, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTOCANCELADO <=", value, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoIn(List<BigDecimal> values) {
            addCriterion("MONTOCANCELADO in", values, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoNotIn(List<BigDecimal> values) {
            addCriterion("MONTOCANCELADO not in", values, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTOCANCELADO between", value1, value2, "montocancelado");
            return (Criteria) this;
        }

        public Criteria andMontocanceladoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTOCANCELADO not between", value1, value2, "montocancelado");
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