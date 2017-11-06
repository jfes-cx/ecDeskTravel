package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrigenCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrigenCriteria() {
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

        public Criteria andNombreorigenIsNull() {
            addCriterion("NOMBREORIGEN is null");
            return (Criteria) this;
        }

        public Criteria andNombreorigenIsNotNull() {
            addCriterion("NOMBREORIGEN is not null");
            return (Criteria) this;
        }

        public Criteria andNombreorigenEqualTo(String value) {
            addCriterion("NOMBREORIGEN =", value, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenNotEqualTo(String value) {
            addCriterion("NOMBREORIGEN <>", value, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenGreaterThan(String value) {
            addCriterion("NOMBREORIGEN >", value, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBREORIGEN >=", value, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenLessThan(String value) {
            addCriterion("NOMBREORIGEN <", value, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenLessThanOrEqualTo(String value) {
            addCriterion("NOMBREORIGEN <=", value, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenLike(String value) {
            addCriterion("NOMBREORIGEN like", value, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenNotLike(String value) {
            addCriterion("NOMBREORIGEN not like", value, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenIn(List<String> values) {
            addCriterion("NOMBREORIGEN in", values, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenNotIn(List<String> values) {
            addCriterion("NOMBREORIGEN not in", values, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenBetween(String value1, String value2) {
            addCriterion("NOMBREORIGEN between", value1, value2, "nombreorigen");
            return (Criteria) this;
        }

        public Criteria andNombreorigenNotBetween(String value1, String value2) {
            addCriterion("NOMBREORIGEN not between", value1, value2, "nombreorigen");
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

        public Criteria andNombreorigenLikeInsensitive(String value) {
            addCriterion("upper(NOMBREORIGEN) like", value.toUpperCase(), "nombreorigen");
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