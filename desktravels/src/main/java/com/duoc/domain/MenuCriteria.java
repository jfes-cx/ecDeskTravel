package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MenuCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuCriteria() {
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

        public Criteria andIdmenuIsNull() {
            addCriterion("IDMENU is null");
            return (Criteria) this;
        }

        public Criteria andIdmenuIsNotNull() {
            addCriterion("IDMENU is not null");
            return (Criteria) this;
        }

        public Criteria andIdmenuEqualTo(BigDecimal value) {
            addCriterion("IDMENU =", value, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuNotEqualTo(BigDecimal value) {
            addCriterion("IDMENU <>", value, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuGreaterThan(BigDecimal value) {
            addCriterion("IDMENU >", value, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDMENU >=", value, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuLessThan(BigDecimal value) {
            addCriterion("IDMENU <", value, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDMENU <=", value, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuIn(List<BigDecimal> values) {
            addCriterion("IDMENU in", values, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuNotIn(List<BigDecimal> values) {
            addCriterion("IDMENU not in", values, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDMENU between", value1, value2, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdmenuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDMENU not between", value1, value2, "idmenu");
            return (Criteria) this;
        }

        public Criteria andIdperfilIsNull() {
            addCriterion("IDPERFIL is null");
            return (Criteria) this;
        }

        public Criteria andIdperfilIsNotNull() {
            addCriterion("IDPERFIL is not null");
            return (Criteria) this;
        }

        public Criteria andIdperfilEqualTo(BigDecimal value) {
            addCriterion("IDPERFIL =", value, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilNotEqualTo(BigDecimal value) {
            addCriterion("IDPERFIL <>", value, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilGreaterThan(BigDecimal value) {
            addCriterion("IDPERFIL >", value, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPERFIL >=", value, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilLessThan(BigDecimal value) {
            addCriterion("IDPERFIL <", value, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDPERFIL <=", value, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilIn(List<BigDecimal> values) {
            addCriterion("IDPERFIL in", values, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilNotIn(List<BigDecimal> values) {
            addCriterion("IDPERFIL not in", values, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPERFIL between", value1, value2, "idperfil");
            return (Criteria) this;
        }

        public Criteria andIdperfilNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDPERFIL not between", value1, value2, "idperfil");
            return (Criteria) this;
        }

        public Criteria andNombremenuIsNull() {
            addCriterion("NOMBREMENU is null");
            return (Criteria) this;
        }

        public Criteria andNombremenuIsNotNull() {
            addCriterion("NOMBREMENU is not null");
            return (Criteria) this;
        }

        public Criteria andNombremenuEqualTo(String value) {
            addCriterion("NOMBREMENU =", value, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuNotEqualTo(String value) {
            addCriterion("NOMBREMENU <>", value, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuGreaterThan(String value) {
            addCriterion("NOMBREMENU >", value, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBREMENU >=", value, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuLessThan(String value) {
            addCriterion("NOMBREMENU <", value, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuLessThanOrEqualTo(String value) {
            addCriterion("NOMBREMENU <=", value, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuLike(String value) {
            addCriterion("NOMBREMENU like", value, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuNotLike(String value) {
            addCriterion("NOMBREMENU not like", value, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuIn(List<String> values) {
            addCriterion("NOMBREMENU in", values, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuNotIn(List<String> values) {
            addCriterion("NOMBREMENU not in", values, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuBetween(String value1, String value2) {
            addCriterion("NOMBREMENU between", value1, value2, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuNotBetween(String value1, String value2) {
            addCriterion("NOMBREMENU not between", value1, value2, "nombremenu");
            return (Criteria) this;
        }

        public Criteria andNombremenuLikeInsensitive(String value) {
            addCriterion("upper(NOMBREMENU) like", value.toUpperCase(), "nombremenu");
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
