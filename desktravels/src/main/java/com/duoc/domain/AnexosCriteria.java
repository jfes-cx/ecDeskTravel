package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnexosCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnexosCriteria() {
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

        public Criteria andIdanexoIsNull() {
            addCriterion("IDANEXO is null");
            return (Criteria) this;
        }

        public Criteria andIdanexoIsNotNull() {
            addCriterion("IDANEXO is not null");
            return (Criteria) this;
        }

        public Criteria andIdanexoEqualTo(BigDecimal value) {
            addCriterion("IDANEXO =", value, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoNotEqualTo(BigDecimal value) {
            addCriterion("IDANEXO <>", value, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoGreaterThan(BigDecimal value) {
            addCriterion("IDANEXO >", value, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDANEXO >=", value, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoLessThan(BigDecimal value) {
            addCriterion("IDANEXO <", value, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDANEXO <=", value, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoIn(List<BigDecimal> values) {
            addCriterion("IDANEXO in", values, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoNotIn(List<BigDecimal> values) {
            addCriterion("IDANEXO not in", values, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDANEXO between", value1, value2, "idanexo");
            return (Criteria) this;
        }

        public Criteria andIdanexoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDANEXO not between", value1, value2, "idanexo");
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

        public Criteria andArchivoIsNull() {
            addCriterion("ARCHIVO is null");
            return (Criteria) this;
        }

        public Criteria andArchivoIsNotNull() {
            addCriterion("ARCHIVO is not null");
            return (Criteria) this;
        }

        public Criteria andArchivoEqualTo(String value) {
            addCriterion("ARCHIVO =", value, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoNotEqualTo(String value) {
            addCriterion("ARCHIVO <>", value, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoGreaterThan(String value) {
            addCriterion("ARCHIVO >", value, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoGreaterThanOrEqualTo(String value) {
            addCriterion("ARCHIVO >=", value, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoLessThan(String value) {
            addCriterion("ARCHIVO <", value, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoLessThanOrEqualTo(String value) {
            addCriterion("ARCHIVO <=", value, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoLike(String value) {
            addCriterion("ARCHIVO like", value, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoNotLike(String value) {
            addCriterion("ARCHIVO not like", value, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoIn(List<String> values) {
            addCriterion("ARCHIVO in", values, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoNotIn(List<String> values) {
            addCriterion("ARCHIVO not in", values, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoBetween(String value1, String value2) {
            addCriterion("ARCHIVO between", value1, value2, "archivo");
            return (Criteria) this;
        }

        public Criteria andArchivoNotBetween(String value1, String value2) {
            addCriterion("ARCHIVO not between", value1, value2, "archivo");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
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

        public Criteria andArchivoLikeInsensitive(String value) {
            addCriterion("upper(ARCHIVO) like", value.toUpperCase(), "archivo");
            return (Criteria) this;
        }

        public Criteria andTokenLikeInsensitive(String value) {
            addCriterion("upper(TOKEN) like", value.toUpperCase(), "token");
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