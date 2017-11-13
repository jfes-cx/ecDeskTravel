package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AseguradoraCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AseguradoraCriteria() {
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

        public Criteria andIdaseguradoraIsNull() {
            addCriterion("IDASEGURADORA is null");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraIsNotNull() {
            addCriterion("IDASEGURADORA is not null");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraEqualTo(BigDecimal value) {
            addCriterion("IDASEGURADORA =", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraNotEqualTo(BigDecimal value) {
            addCriterion("IDASEGURADORA <>", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraGreaterThan(BigDecimal value) {
            addCriterion("IDASEGURADORA >", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDASEGURADORA >=", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraLessThan(BigDecimal value) {
            addCriterion("IDASEGURADORA <", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDASEGURADORA <=", value, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraIn(List<BigDecimal> values) {
            addCriterion("IDASEGURADORA in", values, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraNotIn(List<BigDecimal> values) {
            addCriterion("IDASEGURADORA not in", values, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDASEGURADORA between", value1, value2, "idaseguradora");
            return (Criteria) this;
        }

        public Criteria andIdaseguradoraNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDASEGURADORA not between", value1, value2, "idaseguradora");
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

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoIsNull() {
            addCriterion("NOMBRECONTACTO is null");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoIsNotNull() {
            addCriterion("NOMBRECONTACTO is not null");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoEqualTo(String value) {
            addCriterion("NOMBRECONTACTO =", value, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoNotEqualTo(String value) {
            addCriterion("NOMBRECONTACTO <>", value, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoGreaterThan(String value) {
            addCriterion("NOMBRECONTACTO >", value, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBRECONTACTO >=", value, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoLessThan(String value) {
            addCriterion("NOMBRECONTACTO <", value, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoLessThanOrEqualTo(String value) {
            addCriterion("NOMBRECONTACTO <=", value, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoLike(String value) {
            addCriterion("NOMBRECONTACTO like", value, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoNotLike(String value) {
            addCriterion("NOMBRECONTACTO not like", value, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoIn(List<String> values) {
            addCriterion("NOMBRECONTACTO in", values, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoNotIn(List<String> values) {
            addCriterion("NOMBRECONTACTO not in", values, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoBetween(String value1, String value2) {
            addCriterion("NOMBRECONTACTO between", value1, value2, "nombrecontacto");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoNotBetween(String value1, String value2) {
            addCriterion("NOMBRECONTACTO not between", value1, value2, "nombrecontacto");
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

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andNombrecontactoLikeInsensitive(String value) {
            addCriterion("upper(NOMBRECONTACTO) like", value.toUpperCase(), "nombrecontacto");
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
