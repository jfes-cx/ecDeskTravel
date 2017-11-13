package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AlumnoCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlumnoCriteria() {
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

        public Criteria andIdapoderadoIsNull() {
            addCriterion("IDAPODERADO is null");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoIsNotNull() {
            addCriterion("IDAPODERADO is not null");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoEqualTo(BigDecimal value) {
            addCriterion("IDAPODERADO =", value, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoNotEqualTo(BigDecimal value) {
            addCriterion("IDAPODERADO <>", value, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoGreaterThan(BigDecimal value) {
            addCriterion("IDAPODERADO >", value, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDAPODERADO >=", value, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoLessThan(BigDecimal value) {
            addCriterion("IDAPODERADO <", value, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDAPODERADO <=", value, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoIn(List<BigDecimal> values) {
            addCriterion("IDAPODERADO in", values, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoNotIn(List<BigDecimal> values) {
            addCriterion("IDAPODERADO not in", values, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDAPODERADO between", value1, value2, "idapoderado");
            return (Criteria) this;
        }

        public Criteria andIdapoderadoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDAPODERADO not between", value1, value2, "idapoderado");
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

        public Criteria andDireccionIsNull() {
            addCriterion("DIRECCION is null");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNotNull() {
            addCriterion("DIRECCION is not null");
            return (Criteria) this;
        }

        public Criteria andDireccionEqualTo(String value) {
            addCriterion("DIRECCION =", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotEqualTo(String value) {
            addCriterion("DIRECCION <>", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThan(String value) {
            addCriterion("DIRECCION >", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECCION >=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThan(String value) {
            addCriterion("DIRECCION <", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThanOrEqualTo(String value) {
            addCriterion("DIRECCION <=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLike(String value) {
            addCriterion("DIRECCION like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotLike(String value) {
            addCriterion("DIRECCION not like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionIn(List<String> values) {
            addCriterion("DIRECCION in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotIn(List<String> values) {
            addCriterion("DIRECCION not in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionBetween(String value1, String value2) {
            addCriterion("DIRECCION between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotBetween(String value1, String value2) {
            addCriterion("DIRECCION not between", value1, value2, "direccion");
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

        public Criteria andCorreoelectronicoIsNull() {
            addCriterion("CORREOELECTRONICO is null");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoIsNotNull() {
            addCriterion("CORREOELECTRONICO is not null");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoEqualTo(String value) {
            addCriterion("CORREOELECTRONICO =", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoNotEqualTo(String value) {
            addCriterion("CORREOELECTRONICO <>", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoGreaterThan(String value) {
            addCriterion("CORREOELECTRONICO >", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoGreaterThanOrEqualTo(String value) {
            addCriterion("CORREOELECTRONICO >=", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoLessThan(String value) {
            addCriterion("CORREOELECTRONICO <", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoLessThanOrEqualTo(String value) {
            addCriterion("CORREOELECTRONICO <=", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoLike(String value) {
            addCriterion("CORREOELECTRONICO like", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoNotLike(String value) {
            addCriterion("CORREOELECTRONICO not like", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoIn(List<String> values) {
            addCriterion("CORREOELECTRONICO in", values, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoNotIn(List<String> values) {
            addCriterion("CORREOELECTRONICO not in", values, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoBetween(String value1, String value2) {
            addCriterion("CORREOELECTRONICO between", value1, value2, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoNotBetween(String value1, String value2) {
            addCriterion("CORREOELECTRONICO not between", value1, value2, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andRutIsNull() {
            addCriterion("RUT is null");
            return (Criteria) this;
        }

        public Criteria andRutIsNotNull() {
            addCriterion("RUT is not null");
            return (Criteria) this;
        }

        public Criteria andRutEqualTo(String value) {
            addCriterion("RUT =", value, "rut");
            return (Criteria) this;
        }

        public Criteria andRutNotEqualTo(String value) {
            addCriterion("RUT <>", value, "rut");
            return (Criteria) this;
        }

        public Criteria andRutGreaterThan(String value) {
            addCriterion("RUT >", value, "rut");
            return (Criteria) this;
        }

        public Criteria andRutGreaterThanOrEqualTo(String value) {
            addCriterion("RUT >=", value, "rut");
            return (Criteria) this;
        }

        public Criteria andRutLessThan(String value) {
            addCriterion("RUT <", value, "rut");
            return (Criteria) this;
        }

        public Criteria andRutLessThanOrEqualTo(String value) {
            addCriterion("RUT <=", value, "rut");
            return (Criteria) this;
        }

        public Criteria andRutLike(String value) {
            addCriterion("RUT like", value, "rut");
            return (Criteria) this;
        }

        public Criteria andRutNotLike(String value) {
            addCriterion("RUT not like", value, "rut");
            return (Criteria) this;
        }

        public Criteria andRutIn(List<String> values) {
            addCriterion("RUT in", values, "rut");
            return (Criteria) this;
        }

        public Criteria andRutNotIn(List<String> values) {
            addCriterion("RUT not in", values, "rut");
            return (Criteria) this;
        }

        public Criteria andRutBetween(String value1, String value2) {
            addCriterion("RUT between", value1, value2, "rut");
            return (Criteria) this;
        }

        public Criteria andRutNotBetween(String value1, String value2) {
            addCriterion("RUT not between", value1, value2, "rut");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNull() {
            addCriterion("APELLIDOS is null");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNotNull() {
            addCriterion("APELLIDOS is not null");
            return (Criteria) this;
        }

        public Criteria andApellidosEqualTo(String value) {
            addCriterion("APELLIDOS =", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotEqualTo(String value) {
            addCriterion("APELLIDOS <>", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThan(String value) {
            addCriterion("APELLIDOS >", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThanOrEqualTo(String value) {
            addCriterion("APELLIDOS >=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThan(String value) {
            addCriterion("APELLIDOS <", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThanOrEqualTo(String value) {
            addCriterion("APELLIDOS <=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLike(String value) {
            addCriterion("APELLIDOS like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotLike(String value) {
            addCriterion("APELLIDOS not like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosIn(List<String> values) {
            addCriterion("APELLIDOS in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotIn(List<String> values) {
            addCriterion("APELLIDOS not in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosBetween(String value1, String value2) {
            addCriterion("APELLIDOS between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotBetween(String value1, String value2) {
            addCriterion("APELLIDOS not between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andNombreLikeInsensitive(String value) {
            addCriterion("upper(NOMBRE) like", value.toUpperCase(), "nombre");
            return (Criteria) this;
        }

        public Criteria andDireccionLikeInsensitive(String value) {
            addCriterion("upper(DIRECCION) like", value.toUpperCase(), "direccion");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoLikeInsensitive(String value) {
            addCriterion("upper(CORREOELECTRONICO) like", value.toUpperCase(), "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andRutLikeInsensitive(String value) {
            addCriterion("upper(RUT) like", value.toUpperCase(), "rut");
            return (Criteria) this;
        }

        public Criteria andApellidosLikeInsensitive(String value) {
            addCriterion("upper(APELLIDOS) like", value.toUpperCase(), "apellidos");
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
