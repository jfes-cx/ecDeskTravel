package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItinerarioCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItinerarioCriteria() {
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

        public Criteria andIddestinoIsNull() {
            addCriterion("IDDESTINO is null");
            return (Criteria) this;
        }

        public Criteria andIddestinoIsNotNull() {
            addCriterion("IDDESTINO is not null");
            return (Criteria) this;
        }

        public Criteria andIddestinoEqualTo(BigDecimal value) {
            addCriterion("IDDESTINO =", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoNotEqualTo(BigDecimal value) {
            addCriterion("IDDESTINO <>", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoGreaterThan(BigDecimal value) {
            addCriterion("IDDESTINO >", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDDESTINO >=", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoLessThan(BigDecimal value) {
            addCriterion("IDDESTINO <", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDDESTINO <=", value, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoIn(List<BigDecimal> values) {
            addCriterion("IDDESTINO in", values, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoNotIn(List<BigDecimal> values) {
            addCriterion("IDDESTINO not in", values, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDDESTINO between", value1, value2, "iddestino");
            return (Criteria) this;
        }

        public Criteria andIddestinoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDDESTINO not between", value1, value2, "iddestino");
            return (Criteria) this;
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

        public Criteria andIdorigenIsNull() {
            addCriterion("IDORIGEN is null");
            return (Criteria) this;
        }

        public Criteria andIdorigenIsNotNull() {
            addCriterion("IDORIGEN is not null");
            return (Criteria) this;
        }

        public Criteria andIdorigenEqualTo(BigDecimal value) {
            addCriterion("IDORIGEN =", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenNotEqualTo(BigDecimal value) {
            addCriterion("IDORIGEN <>", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenGreaterThan(BigDecimal value) {
            addCriterion("IDORIGEN >", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDORIGEN >=", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenLessThan(BigDecimal value) {
            addCriterion("IDORIGEN <", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDORIGEN <=", value, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenIn(List<BigDecimal> values) {
            addCriterion("IDORIGEN in", values, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenNotIn(List<BigDecimal> values) {
            addCriterion("IDORIGEN not in", values, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDORIGEN between", value1, value2, "idorigen");
            return (Criteria) this;
        }

        public Criteria andIdorigenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDORIGEN not between", value1, value2, "idorigen");
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