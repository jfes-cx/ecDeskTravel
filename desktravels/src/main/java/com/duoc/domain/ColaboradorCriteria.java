package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ColaboradorCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColaboradorCriteria() {
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

        public Criteria andIdcuentausuarioIsNull() {
            addCriterion("IDCUENTAUSUARIO is null");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioIsNotNull() {
            addCriterion("IDCUENTAUSUARIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO =", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioNotEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO <>", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioGreaterThan(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO >", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO >=", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioLessThan(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO <", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO <=", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAUSUARIO in", values, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioNotIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAUSUARIO not in", values, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAUSUARIO between", value1, value2, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAUSUARIO not between", value1, value2, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorIsNull() {
            addCriterion("IDTIPOCOLABORADOR is null");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorIsNotNull() {
            addCriterion("IDTIPOCOLABORADOR is not null");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCOLABORADOR =", value, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorNotEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCOLABORADOR <>", value, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorGreaterThan(BigDecimal value) {
            addCriterion("IDTIPOCOLABORADOR >", value, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCOLABORADOR >=", value, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorLessThan(BigDecimal value) {
            addCriterion("IDTIPOCOLABORADOR <", value, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCOLABORADOR <=", value, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorIn(List<BigDecimal> values) {
            addCriterion("IDTIPOCOLABORADOR in", values, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorNotIn(List<BigDecimal> values) {
            addCriterion("IDTIPOCOLABORADOR not in", values, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOCOLABORADOR between", value1, value2, "idtipocolaborador");
            return (Criteria) this;
        }

        public Criteria andIdtipocolaboradorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOCOLABORADOR not between", value1, value2, "idtipocolaborador");
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

        public Criteria andNombreLikeInsensitive(String value) {
            addCriterion("upper(NOMBRE) like", value.toUpperCase(), "nombre");
            return (Criteria) this;
        }

        public Criteria andDireccionLikeInsensitive(String value) {
            addCriterion("upper(DIRECCION) like", value.toUpperCase(), "direccion");
            return (Criteria) this;
        }

        public Criteria andRutLikeInsensitive(String value) {
            addCriterion("upper(RUT) like", value.toUpperCase(), "rut");
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
