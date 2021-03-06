package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MidActividadCtCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MidActividadCtCriteria() {
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

        public Criteria andIdactividadpaqueteIsNull() {
            addCriterion("IDACTIVIDADPAQUETE is null");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteIsNotNull() {
            addCriterion("IDACTIVIDADPAQUETE is not null");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADPAQUETE =", value, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteNotEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADPAQUETE <>", value, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteGreaterThan(BigDecimal value) {
            addCriterion("IDACTIVIDADPAQUETE >", value, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADPAQUETE >=", value, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteLessThan(BigDecimal value) {
            addCriterion("IDACTIVIDADPAQUETE <", value, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDACTIVIDADPAQUETE <=", value, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteIn(List<BigDecimal> values) {
            addCriterion("IDACTIVIDADPAQUETE in", values, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteNotIn(List<BigDecimal> values) {
            addCriterion("IDACTIVIDADPAQUETE not in", values, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDACTIVIDADPAQUETE between", value1, value2, "idactividadpaquete");
            return (Criteria) this;
        }

        public Criteria andIdactividadpaqueteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDACTIVIDADPAQUETE not between", value1, value2, "idactividadpaquete");
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

        public Criteria andIdpaqueteIsNull() {
            addCriterion("IDPAQUETE is null");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteIsNotNull() {
            addCriterion("IDPAQUETE is not null");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteEqualTo(BigDecimal value) {
            addCriterion("IDPAQUETE =", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteNotEqualTo(BigDecimal value) {
            addCriterion("IDPAQUETE <>", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteGreaterThan(BigDecimal value) {
            addCriterion("IDPAQUETE >", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPAQUETE >=", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteLessThan(BigDecimal value) {
            addCriterion("IDPAQUETE <", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPAQUETE <=", value, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteIn(List<BigDecimal> values) {
            addCriterion("IDPAQUETE in", values, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteNotIn(List<BigDecimal> values) {
            addCriterion("IDPAQUETE not in", values, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPAQUETE between", value1, value2, "idpaquete");
            return (Criteria) this;
        }

        public Criteria andIdpaqueteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPAQUETE not between", value1, value2, "idpaquete");
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