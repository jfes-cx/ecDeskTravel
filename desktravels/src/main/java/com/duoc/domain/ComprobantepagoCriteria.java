package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComprobantepagoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComprobantepagoCriteria() {
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

        public Criteria andIdComprobantePagoIsNull() {
            addCriterion("ID_COMPROBANTE_PAGO is null");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoIsNotNull() {
            addCriterion("ID_COMPROBANTE_PAGO is not null");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoEqualTo(BigDecimal value) {
            addCriterion("ID_COMPROBANTE_PAGO =", value, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoNotEqualTo(BigDecimal value) {
            addCriterion("ID_COMPROBANTE_PAGO <>", value, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoGreaterThan(BigDecimal value) {
            addCriterion("ID_COMPROBANTE_PAGO >", value, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_COMPROBANTE_PAGO >=", value, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoLessThan(BigDecimal value) {
            addCriterion("ID_COMPROBANTE_PAGO <", value, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_COMPROBANTE_PAGO <=", value, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoIn(List<BigDecimal> values) {
            addCriterion("ID_COMPROBANTE_PAGO in", values, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoNotIn(List<BigDecimal> values) {
            addCriterion("ID_COMPROBANTE_PAGO not in", values, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_COMPROBANTE_PAGO between", value1, value2, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andIdComprobantePagoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_COMPROBANTE_PAGO not between", value1, value2, "idComprobantePago");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoIsNull() {
            addCriterion("RUTA_ARCHIVO is null");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoIsNotNull() {
            addCriterion("RUTA_ARCHIVO is not null");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoEqualTo(String value) {
            addCriterion("RUTA_ARCHIVO =", value, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoNotEqualTo(String value) {
            addCriterion("RUTA_ARCHIVO <>", value, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoGreaterThan(String value) {
            addCriterion("RUTA_ARCHIVO >", value, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoGreaterThanOrEqualTo(String value) {
            addCriterion("RUTA_ARCHIVO >=", value, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoLessThan(String value) {
            addCriterion("RUTA_ARCHIVO <", value, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoLessThanOrEqualTo(String value) {
            addCriterion("RUTA_ARCHIVO <=", value, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoLike(String value) {
            addCriterion("RUTA_ARCHIVO like", value, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoNotLike(String value) {
            addCriterion("RUTA_ARCHIVO not like", value, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoIn(List<String> values) {
            addCriterion("RUTA_ARCHIVO in", values, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoNotIn(List<String> values) {
            addCriterion("RUTA_ARCHIVO not in", values, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoBetween(String value1, String value2) {
            addCriterion("RUTA_ARCHIVO between", value1, value2, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andRutaArchivoNotBetween(String value1, String value2) {
            addCriterion("RUTA_ARCHIVO not between", value1, value2, "rutaArchivo");
            return (Criteria) this;
        }

        public Criteria andIdPagoIsNull() {
            addCriterion("ID_PAGO is null");
            return (Criteria) this;
        }

        public Criteria andIdPagoIsNotNull() {
            addCriterion("ID_PAGO is not null");
            return (Criteria) this;
        }

        public Criteria andIdPagoEqualTo(BigDecimal value) {
            addCriterion("ID_PAGO =", value, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoNotEqualTo(BigDecimal value) {
            addCriterion("ID_PAGO <>", value, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoGreaterThan(BigDecimal value) {
            addCriterion("ID_PAGO >", value, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_PAGO >=", value, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoLessThan(BigDecimal value) {
            addCriterion("ID_PAGO <", value, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_PAGO <=", value, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoIn(List<BigDecimal> values) {
            addCriterion("ID_PAGO in", values, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoNotIn(List<BigDecimal> values) {
            addCriterion("ID_PAGO not in", values, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_PAGO between", value1, value2, "idPago");
            return (Criteria) this;
        }

        public Criteria andIdPagoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_PAGO not between", value1, value2, "idPago");
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

        public Criteria andRutaArchivoLikeInsensitive(String value) {
            addCriterion("upper(RUTA_ARCHIVO) like", value.toUpperCase(), "rutaArchivo");
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