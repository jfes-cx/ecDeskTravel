package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ServicioCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicioCriteria() {
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

        public Criteria andIdtiposervicioIsNull() {
            addCriterion("IDTIPOSERVICIO is null");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioIsNotNull() {
            addCriterion("IDTIPOSERVICIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioEqualTo(BigDecimal value) {
            addCriterion("IDTIPOSERVICIO =", value, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioNotEqualTo(BigDecimal value) {
            addCriterion("IDTIPOSERVICIO <>", value, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioGreaterThan(BigDecimal value) {
            addCriterion("IDTIPOSERVICIO >", value, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOSERVICIO >=", value, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioLessThan(BigDecimal value) {
            addCriterion("IDTIPOSERVICIO <", value, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOSERVICIO <=", value, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioIn(List<BigDecimal> values) {
            addCriterion("IDTIPOSERVICIO in", values, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioNotIn(List<BigDecimal> values) {
            addCriterion("IDTIPOSERVICIO not in", values, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOSERVICIO between", value1, value2, "idtiposervicio");
            return (Criteria) this;
        }

        public Criteria andIdtiposervicioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOSERVICIO not between", value1, value2, "idtiposervicio");
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

        public Criteria andTelefonoIsNull() {
            addCriterion("TELEFONO is null");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNotNull() {
            addCriterion("TELEFONO is not null");
            return (Criteria) this;
        }

        public Criteria andTelefonoEqualTo(BigDecimal value) {
            addCriterion("TELEFONO =", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotEqualTo(BigDecimal value) {
            addCriterion("TELEFONO <>", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThan(BigDecimal value) {
            addCriterion("TELEFONO >", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TELEFONO >=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThan(BigDecimal value) {
            addCriterion("TELEFONO <", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TELEFONO <=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoIn(List<BigDecimal> values) {
            addCriterion("TELEFONO in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotIn(List<BigDecimal> values) {
            addCriterion("TELEFONO not in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TELEFONO between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TELEFONO not between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andEncargadoIsNull() {
            addCriterion("ENCARGADO is null");
            return (Criteria) this;
        }

        public Criteria andEncargadoIsNotNull() {
            addCriterion("ENCARGADO is not null");
            return (Criteria) this;
        }

        public Criteria andEncargadoEqualTo(String value) {
            addCriterion("ENCARGADO =", value, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoNotEqualTo(String value) {
            addCriterion("ENCARGADO <>", value, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoGreaterThan(String value) {
            addCriterion("ENCARGADO >", value, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoGreaterThanOrEqualTo(String value) {
            addCriterion("ENCARGADO >=", value, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoLessThan(String value) {
            addCriterion("ENCARGADO <", value, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoLessThanOrEqualTo(String value) {
            addCriterion("ENCARGADO <=", value, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoLike(String value) {
            addCriterion("ENCARGADO like", value, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoNotLike(String value) {
            addCriterion("ENCARGADO not like", value, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoIn(List<String> values) {
            addCriterion("ENCARGADO in", values, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoNotIn(List<String> values) {
            addCriterion("ENCARGADO not in", values, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoBetween(String value1, String value2) {
            addCriterion("ENCARGADO between", value1, value2, "encargado");
            return (Criteria) this;
        }

        public Criteria andEncargadoNotBetween(String value1, String value2) {
            addCriterion("ENCARGADO not between", value1, value2, "encargado");
            return (Criteria) this;
        }

        public Criteria andNombreLikeInsensitive(String value) {
            addCriterion("upper(NOMBRE) like", value.toUpperCase(), "nombre");
            return (Criteria) this;
        }

        public Criteria andDescripcionLikeInsensitive(String value) {
            addCriterion("upper(DESCRIPCION) like", value.toUpperCase(), "descripcion");
            return (Criteria) this;
        }

        public Criteria andEncargadoLikeInsensitive(String value) {
            addCriterion("upper(ENCARGADO) like", value.toUpperCase(), "encargado");
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
