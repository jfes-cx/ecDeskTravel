package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActividadviajeCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActividadviajeCriteria() {
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

        public Criteria andIdactividadviajeIsNull() {
            addCriterion("IDACTIVIDADVIAJE is null");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeIsNotNull() {
            addCriterion("IDACTIVIDADVIAJE is not null");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADVIAJE =", value, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeNotEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADVIAJE <>", value, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeGreaterThan(BigDecimal value) {
            addCriterion("IDACTIVIDADVIAJE >", value, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADVIAJE >=", value, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeLessThan(BigDecimal value) {
            addCriterion("IDACTIVIDADVIAJE <", value, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADVIAJE <=", value, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeIn(List<BigDecimal> values) {
            addCriterion("IDACTIVIDADVIAJE in", values, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeNotIn(List<BigDecimal> values) {
            addCriterion("IDACTIVIDADVIAJE not in", values, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDACTIVIDADVIAJE between", value1, value2, "idactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdactividadviajeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDACTIVIDADVIAJE not between", value1, value2, "idactividadviaje");
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

        public Criteria andIdtipoactividadviajeIsNull() {
            addCriterion("IDTIPOACTIVIDADVIAJE is null");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeIsNotNull() {
            addCriterion("IDTIPOACTIVIDADVIAJE is not null");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeEqualTo(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDADVIAJE =", value, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeNotEqualTo(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDADVIAJE <>", value, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeGreaterThan(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDADVIAJE >", value, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDADVIAJE >=", value, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeLessThan(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDADVIAJE <", value, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOACTIVIDADVIAJE <=", value, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeIn(List<BigDecimal> values) {
            addCriterion("IDTIPOACTIVIDADVIAJE in", values, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeNotIn(List<BigDecimal> values) {
            addCriterion("IDTIPOACTIVIDADVIAJE not in", values, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOACTIVIDADVIAJE between", value1, value2, "idtipoactividadviaje");
            return (Criteria) this;
        }

        public Criteria andIdtipoactividadviajeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOACTIVIDADVIAJE not between", value1, value2, "idtipoactividadviaje");
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
