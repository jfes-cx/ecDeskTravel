package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DestinoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DestinoCriteria() {
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

        public Criteria andNombredestinoIsNull() {
            addCriterion("NOMBREDESTINO is null");
            return (Criteria) this;
        }

        public Criteria andNombredestinoIsNotNull() {
            addCriterion("NOMBREDESTINO is not null");
            return (Criteria) this;
        }

        public Criteria andNombredestinoEqualTo(String value) {
            addCriterion("NOMBREDESTINO =", value, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoNotEqualTo(String value) {
            addCriterion("NOMBREDESTINO <>", value, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoGreaterThan(String value) {
            addCriterion("NOMBREDESTINO >", value, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBREDESTINO >=", value, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoLessThan(String value) {
            addCriterion("NOMBREDESTINO <", value, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoLessThanOrEqualTo(String value) {
            addCriterion("NOMBREDESTINO <=", value, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoLike(String value) {
            addCriterion("NOMBREDESTINO like", value, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoNotLike(String value) {
            addCriterion("NOMBREDESTINO not like", value, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoIn(List<String> values) {
            addCriterion("NOMBREDESTINO in", values, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoNotIn(List<String> values) {
            addCriterion("NOMBREDESTINO not in", values, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoBetween(String value1, String value2) {
            addCriterion("NOMBREDESTINO between", value1, value2, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andNombredestinoNotBetween(String value1, String value2) {
            addCriterion("NOMBREDESTINO not between", value1, value2, "nombredestino");
            return (Criteria) this;
        }

        public Criteria andIdpaisIsNull() {
            addCriterion("IDPAIS is null");
            return (Criteria) this;
        }

        public Criteria andIdpaisIsNotNull() {
            addCriterion("IDPAIS is not null");
            return (Criteria) this;
        }

        public Criteria andIdpaisEqualTo(BigDecimal value) {
            addCriterion("IDPAIS =", value, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisNotEqualTo(BigDecimal value) {
            addCriterion("IDPAIS <>", value, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisGreaterThan(BigDecimal value) {
            addCriterion("IDPAIS >", value, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPAIS >=", value, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisLessThan(BigDecimal value) {
            addCriterion("IDPAIS <", value, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPAIS <=", value, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisIn(List<BigDecimal> values) {
            addCriterion("IDPAIS in", values, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisNotIn(List<BigDecimal> values) {
            addCriterion("IDPAIS not in", values, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPAIS between", value1, value2, "idpais");
            return (Criteria) this;
        }

        public Criteria andIdpaisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPAIS not between", value1, value2, "idpais");
            return (Criteria) this;
        }

        public Criteria andNombredestinoLikeInsensitive(String value) {
            addCriterion("upper(NOMBREDESTINO) like", value.toUpperCase(), "nombredestino");
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