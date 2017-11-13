package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CursoCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CursoCriteria() {
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

        public Criteria andIdcolegioIsNull() {
            addCriterion("IDCOLEGIO is null");
            return (Criteria) this;
        }

        public Criteria andIdcolegioIsNotNull() {
            addCriterion("IDCOLEGIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcolegioEqualTo(BigDecimal value) {
            addCriterion("IDCOLEGIO =", value, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioNotEqualTo(BigDecimal value) {
            addCriterion("IDCOLEGIO <>", value, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioGreaterThan(BigDecimal value) {
            addCriterion("IDCOLEGIO >", value, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCOLEGIO >=", value, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioLessThan(BigDecimal value) {
            addCriterion("IDCOLEGIO <", value, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCOLEGIO <=", value, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioIn(List<BigDecimal> values) {
            addCriterion("IDCOLEGIO in", values, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioNotIn(List<BigDecimal> values) {
            addCriterion("IDCOLEGIO not in", values, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCOLEGIO between", value1, value2, "idcolegio");
            return (Criteria) this;
        }

        public Criteria andIdcolegioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCOLEGIO not between", value1, value2, "idcolegio");
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

        public Criteria andProfesorjefeIsNull() {
            addCriterion("PROFESORJEFE is null");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeIsNotNull() {
            addCriterion("PROFESORJEFE is not null");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeEqualTo(String value) {
            addCriterion("PROFESORJEFE =", value, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeNotEqualTo(String value) {
            addCriterion("PROFESORJEFE <>", value, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeGreaterThan(String value) {
            addCriterion("PROFESORJEFE >", value, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESORJEFE >=", value, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeLessThan(String value) {
            addCriterion("PROFESORJEFE <", value, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeLessThanOrEqualTo(String value) {
            addCriterion("PROFESORJEFE <=", value, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeLike(String value) {
            addCriterion("PROFESORJEFE like", value, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeNotLike(String value) {
            addCriterion("PROFESORJEFE not like", value, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeIn(List<String> values) {
            addCriterion("PROFESORJEFE in", values, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeNotIn(List<String> values) {
            addCriterion("PROFESORJEFE not in", values, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeBetween(String value1, String value2) {
            addCriterion("PROFESORJEFE between", value1, value2, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeNotBetween(String value1, String value2) {
            addCriterion("PROFESORJEFE not between", value1, value2, "profesorjefe");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosIsNull() {
            addCriterion("CANTIDADALUMNOS is null");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosIsNotNull() {
            addCriterion("CANTIDADALUMNOS is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosEqualTo(BigDecimal value) {
            addCriterion("CANTIDADALUMNOS =", value, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosNotEqualTo(BigDecimal value) {
            addCriterion("CANTIDADALUMNOS <>", value, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosGreaterThan(BigDecimal value) {
            addCriterion("CANTIDADALUMNOS >", value, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CANTIDADALUMNOS >=", value, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosLessThan(BigDecimal value) {
            addCriterion("CANTIDADALUMNOS <", value, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CANTIDADALUMNOS <=", value, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosIn(List<BigDecimal> values) {
            addCriterion("CANTIDADALUMNOS in", values, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosNotIn(List<BigDecimal> values) {
            addCriterion("CANTIDADALUMNOS not in", values, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CANTIDADALUMNOS between", value1, value2, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andCantidadalumnosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CANTIDADALUMNOS not between", value1, value2, "cantidadalumnos");
            return (Criteria) this;
        }

        public Criteria andNombreLikeInsensitive(String value) {
            addCriterion("upper(NOMBRE) like", value.toUpperCase(), "nombre");
            return (Criteria) this;
        }

        public Criteria andProfesorjefeLikeInsensitive(String value) {
            addCriterion("upper(PROFESORJEFE) like", value.toUpperCase(), "profesorjefe");
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
