package com.duoc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CuentausuarioCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CuentausuarioCriteria() {
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

        public Criteria andIdcuentausuarioIsNull() {
            addCriterion("IDCUENTAUSUARIO is null");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioIsNotNull() {
            addCriterion("IDCUENTAUSUARIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO =", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioNotEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO <>", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioGreaterThan(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO >", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO >=", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioLessThan(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO <", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCUENTAUSUARIO <=", value, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAUSUARIO in", values, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioNotIn(List<BigDecimal> values) {
            addCriterion("IDCUENTAUSUARIO not in", values, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAUSUARIO between", value1, value2, "idcuentausuario");
            return (Criteria) this;
        }

        public Criteria andIdcuentausuarioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCUENTAUSUARIO not between", value1, value2, "idcuentausuario");
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

        public Criteria andNombreusuarioIsNull() {
            addCriterion("NOMBREUSUARIO is null");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioIsNotNull() {
            addCriterion("NOMBREUSUARIO is not null");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioEqualTo(String value) {
            addCriterion("NOMBREUSUARIO =", value, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioNotEqualTo(String value) {
            addCriterion("NOMBREUSUARIO <>", value, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioGreaterThan(String value) {
            addCriterion("NOMBREUSUARIO >", value, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBREUSUARIO >=", value, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioLessThan(String value) {
            addCriterion("NOMBREUSUARIO <", value, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioLessThanOrEqualTo(String value) {
            addCriterion("NOMBREUSUARIO <=", value, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioLike(String value) {
            addCriterion("NOMBREUSUARIO like", value, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioNotLike(String value) {
            addCriterion("NOMBREUSUARIO not like", value, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioIn(List<String> values) {
            addCriterion("NOMBREUSUARIO in", values, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioNotIn(List<String> values) {
            addCriterion("NOMBREUSUARIO not in", values, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioBetween(String value1, String value2) {
            addCriterion("NOMBREUSUARIO between", value1, value2, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioNotBetween(String value1, String value2) {
            addCriterion("NOMBREUSUARIO not between", value1, value2, "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andApellidoIsNull() {
            addCriterion("APELLIDO is null");
            return (Criteria) this;
        }

        public Criteria andApellidoIsNotNull() {
            addCriterion("APELLIDO is not null");
            return (Criteria) this;
        }

        public Criteria andApellidoEqualTo(String value) {
            addCriterion("APELLIDO =", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotEqualTo(String value) {
            addCriterion("APELLIDO <>", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoGreaterThan(String value) {
            addCriterion("APELLIDO >", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoGreaterThanOrEqualTo(String value) {
            addCriterion("APELLIDO >=", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLessThan(String value) {
            addCriterion("APELLIDO <", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLessThanOrEqualTo(String value) {
            addCriterion("APELLIDO <=", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLike(String value) {
            addCriterion("APELLIDO like", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotLike(String value) {
            addCriterion("APELLIDO not like", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoIn(List<String> values) {
            addCriterion("APELLIDO in", values, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotIn(List<String> values) {
            addCriterion("APELLIDO not in", values, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoBetween(String value1, String value2) {
            addCriterion("APELLIDO between", value1, value2, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotBetween(String value1, String value2) {
            addCriterion("APELLIDO not between", value1, value2, "apellido");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoIsNull() {
            addCriterion("CORREOELECTRONICO is null");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoIsNotNull() {
            addCriterion("CORREOELECTRONICO is not null");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoEqualTo(String value) {
            addCriterion("CORREOELECTRONICO =", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoNotEqualTo(String value) {
            addCriterion("CORREOELECTRONICO <>", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoGreaterThan(String value) {
            addCriterion("CORREOELECTRONICO >", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoGreaterThanOrEqualTo(String value) {
            addCriterion("CORREOELECTRONICO >=", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoLessThan(String value) {
            addCriterion("CORREOELECTRONICO <", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoLessThanOrEqualTo(String value) {
            addCriterion("CORREOELECTRONICO <=", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoLike(String value) {
            addCriterion("CORREOELECTRONICO like", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoNotLike(String value) {
            addCriterion("CORREOELECTRONICO not like", value, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoIn(List<String> values) {
            addCriterion("CORREOELECTRONICO in", values, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoNotIn(List<String> values) {
            addCriterion("CORREOELECTRONICO not in", values, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoBetween(String value1, String value2) {
            addCriterion("CORREOELECTRONICO between", value1, value2, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoNotBetween(String value1, String value2) {
            addCriterion("CORREOELECTRONICO not between", value1, value2, "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andContrasenaIsNull() {
            addCriterion("CONTRASENA is null");
            return (Criteria) this;
        }

        public Criteria andContrasenaIsNotNull() {
            addCriterion("CONTRASENA is not null");
            return (Criteria) this;
        }

        public Criteria andContrasenaEqualTo(String value) {
            addCriterion("CONTRASENA =", value, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaNotEqualTo(String value) {
            addCriterion("CONTRASENA <>", value, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaGreaterThan(String value) {
            addCriterion("CONTRASENA >", value, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRASENA >=", value, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaLessThan(String value) {
            addCriterion("CONTRASENA <", value, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaLessThanOrEqualTo(String value) {
            addCriterion("CONTRASENA <=", value, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaLike(String value) {
            addCriterion("CONTRASENA like", value, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaNotLike(String value) {
            addCriterion("CONTRASENA not like", value, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaIn(List<String> values) {
            addCriterion("CONTRASENA in", values, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaNotIn(List<String> values) {
            addCriterion("CONTRASENA not in", values, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaBetween(String value1, String value2) {
            addCriterion("CONTRASENA between", value1, value2, "contrasena");
            return (Criteria) this;
        }

        public Criteria andContrasenaNotBetween(String value1, String value2) {
            addCriterion("CONTRASENA not between", value1, value2, "contrasena");
            return (Criteria) this;
        }

        public Criteria andNombreusuarioLikeInsensitive(String value) {
            addCriterion("upper(NOMBREUSUARIO) like", value.toUpperCase(), "nombreusuario");
            return (Criteria) this;
        }

        public Criteria andApellidoLikeInsensitive(String value) {
            addCriterion("upper(APELLIDO) like", value.toUpperCase(), "apellido");
            return (Criteria) this;
        }

        public Criteria andCorreoelectronicoLikeInsensitive(String value) {
            addCriterion("upper(CORREOELECTRONICO) like", value.toUpperCase(), "correoelectronico");
            return (Criteria) this;
        }

        public Criteria andContrasenaLikeInsensitive(String value) {
            addCriterion("upper(CONTRASENA) like", value.toUpperCase(), "contrasena");
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