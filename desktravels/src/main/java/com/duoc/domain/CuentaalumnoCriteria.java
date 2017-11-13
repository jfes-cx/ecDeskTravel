package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CuentaalumnoCriteria {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CuentaalumnoCriteria() {
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

        public Criteria andIdcuentaalumnosIsNull() {
            addCriterion("IDCUENTAALUMNOS is null");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosIsNotNull() {
            addCriterion("IDCUENTAALUMNOS is not null");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS =", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosNotEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS <>", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosGreaterThan(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS >", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS >=", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosLessThan(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS <", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAALUMNOS <=", value, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAALUMNOS in", values, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosNotIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAALUMNOS not in", values, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAALUMNOS between", value1, value2, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdcuentaalumnosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAALUMNOS not between", value1, value2, "idcuentaalumnos");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaIsNull() {
            addCriterion("IDTIPOCUENTA is null");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaIsNotNull() {
            addCriterion("IDTIPOCUENTA is not null");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCUENTA =", value, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaNotEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCUENTA <>", value, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaGreaterThan(BigDecimal value) {
            addCriterion("IDTIPOCUENTA >", value, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCUENTA >=", value, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaLessThan(BigDecimal value) {
            addCriterion("IDTIPOCUENTA <", value, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDTIPOCUENTA <=", value, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaIn(List<BigDecimal> values) {
            addCriterion("IDTIPOCUENTA in", values, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaNotIn(List<BigDecimal> values) {
            addCriterion("IDTIPOCUENTA not in", values, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOCUENTA between", value1, value2, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdtipocuentaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDTIPOCUENTA not between", value1, value2, "idtipocuenta");
            return (Criteria) this;
        }

        public Criteria andIdalumnoIsNull() {
            addCriterion("IDALUMNO is null");
            return (Criteria) this;
        }

        public Criteria andIdalumnoIsNotNull() {
            addCriterion("IDALUMNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdalumnoEqualTo(BigDecimal value) {
            addCriterion("IDALUMNO =", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoNotEqualTo(BigDecimal value) {
            addCriterion("IDALUMNO <>", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoGreaterThan(BigDecimal value) {
            addCriterion("IDALUMNO >", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDALUMNO >=", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoLessThan(BigDecimal value) {
            addCriterion("IDALUMNO <", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDALUMNO <=", value, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoIn(List<BigDecimal> values) {
            addCriterion("IDALUMNO in", values, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoNotIn(List<BigDecimal> values) {
            addCriterion("IDALUMNO not in", values, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDALUMNO between", value1, value2, "idalumno");
            return (Criteria) this;
        }

        public Criteria andIdalumnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDALUMNO not between", value1, value2, "idalumno");
            return (Criteria) this;
        }

        public Criteria andCupototalIsNull() {
            addCriterion("CUPOTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andCupototalIsNotNull() {
            addCriterion("CUPOTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andCupototalEqualTo(BigDecimal value) {
            addCriterion("CUPOTOTAL =", value, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalNotEqualTo(BigDecimal value) {
            addCriterion("CUPOTOTAL <>", value, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalGreaterThan(BigDecimal value) {
            addCriterion("CUPOTOTAL >", value, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUPOTOTAL >=", value, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalLessThan(BigDecimal value) {
            addCriterion("CUPOTOTAL <", value, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUPOTOTAL <=", value, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalIn(List<BigDecimal> values) {
            addCriterion("CUPOTOTAL in", values, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalNotIn(List<BigDecimal> values) {
            addCriterion("CUPOTOTAL not in", values, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUPOTOTAL between", value1, value2, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupototalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUPOTOTAL not between", value1, value2, "cupototal");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoIsNull() {
            addCriterion("CUPOUTILIZADO is null");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoIsNotNull() {
            addCriterion("CUPOUTILIZADO is not null");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoEqualTo(BigDecimal value) {
            addCriterion("CUPOUTILIZADO =", value, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoNotEqualTo(BigDecimal value) {
            addCriterion("CUPOUTILIZADO <>", value, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoGreaterThan(BigDecimal value) {
            addCriterion("CUPOUTILIZADO >", value, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUPOUTILIZADO >=", value, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoLessThan(BigDecimal value) {
            addCriterion("CUPOUTILIZADO <", value, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUPOUTILIZADO <=", value, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoIn(List<BigDecimal> values) {
            addCriterion("CUPOUTILIZADO in", values, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoNotIn(List<BigDecimal> values) {
            addCriterion("CUPOUTILIZADO not in", values, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUPOUTILIZADO between", value1, value2, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andCupoutilizadoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUPOUTILIZADO not between", value1, value2, "cupoutilizado");
            return (Criteria) this;
        }

        public Criteria andAporteIsNull() {
            addCriterion("APORTE is null");
            return (Criteria) this;
        }

        public Criteria andAporteIsNotNull() {
            addCriterion("APORTE is not null");
            return (Criteria) this;
        }

        public Criteria andAporteEqualTo(BigDecimal value) {
            addCriterion("APORTE =", value, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteNotEqualTo(BigDecimal value) {
            addCriterion("APORTE <>", value, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteGreaterThan(BigDecimal value) {
            addCriterion("APORTE >", value, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APORTE >=", value, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteLessThan(BigDecimal value) {
            addCriterion("APORTE <", value, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APORTE <=", value, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteIn(List<BigDecimal> values) {
            addCriterion("APORTE in", values, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteNotIn(List<BigDecimal> values) {
            addCriterion("APORTE not in", values, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APORTE between", value1, value2, "aporte");
            return (Criteria) this;
        }

        public Criteria andAporteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APORTE not between", value1, value2, "aporte");
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
