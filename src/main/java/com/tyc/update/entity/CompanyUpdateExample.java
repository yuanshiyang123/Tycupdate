package com.tyc.update.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyUpdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyUpdateExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andBaseIsNull() {
            addCriterion("base is null");
            return (Criteria) this;
        }

        public Criteria andBaseIsNotNull() {
            addCriterion("base is not null");
            return (Criteria) this;
        }

        public Criteria andBaseEqualTo(String value) {
            addCriterion("base =", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotEqualTo(String value) {
            addCriterion("base <>", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseGreaterThan(String value) {
            addCriterion("base >", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseGreaterThanOrEqualTo(String value) {
            addCriterion("base >=", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLessThan(String value) {
            addCriterion("base <", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLessThanOrEqualTo(String value) {
            addCriterion("base <=", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLike(String value) {
            addCriterion("base like", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotLike(String value) {
            addCriterion("base not like", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseIn(List<String> values) {
            addCriterion("base in", values, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotIn(List<String> values) {
            addCriterion("base not in", values, "base");
            return (Criteria) this;
        }

        public Criteria andBaseBetween(String value1, String value2) {
            addCriterion("base between", value1, value2, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotBetween(String value1, String value2) {
            addCriterion("base not between", value1, value2, "base");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameAliasIsNull() {
            addCriterion("name_alias is null");
            return (Criteria) this;
        }

        public Criteria andNameAliasIsNotNull() {
            addCriterion("name_alias is not null");
            return (Criteria) this;
        }

        public Criteria andNameAliasEqualTo(String value) {
            addCriterion("name_alias =", value, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasNotEqualTo(String value) {
            addCriterion("name_alias <>", value, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasGreaterThan(String value) {
            addCriterion("name_alias >", value, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasGreaterThanOrEqualTo(String value) {
            addCriterion("name_alias >=", value, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasLessThan(String value) {
            addCriterion("name_alias <", value, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasLessThanOrEqualTo(String value) {
            addCriterion("name_alias <=", value, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasLike(String value) {
            addCriterion("name_alias like", value, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasNotLike(String value) {
            addCriterion("name_alias not like", value, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasIn(List<String> values) {
            addCriterion("name_alias in", values, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasNotIn(List<String> values) {
            addCriterion("name_alias not in", values, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasBetween(String value1, String value2) {
            addCriterion("name_alias between", value1, value2, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andNameAliasNotBetween(String value1, String value2) {
            addCriterion("name_alias not between", value1, value2, "nameAlias");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesIsNull() {
            addCriterion("history_names is null");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesIsNotNull() {
            addCriterion("history_names is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesEqualTo(String value) {
            addCriterion("history_names =", value, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesNotEqualTo(String value) {
            addCriterion("history_names <>", value, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesGreaterThan(String value) {
            addCriterion("history_names >", value, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesGreaterThanOrEqualTo(String value) {
            addCriterion("history_names >=", value, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesLessThan(String value) {
            addCriterion("history_names <", value, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesLessThanOrEqualTo(String value) {
            addCriterion("history_names <=", value, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesLike(String value) {
            addCriterion("history_names like", value, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesNotLike(String value) {
            addCriterion("history_names not like", value, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesIn(List<String> values) {
            addCriterion("history_names in", values, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesNotIn(List<String> values) {
            addCriterion("history_names not in", values, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesBetween(String value1, String value2) {
            addCriterion("history_names between", value1, value2, "historyNames");
            return (Criteria) this;
        }

        public Criteria andHistoryNamesNotBetween(String value1, String value2) {
            addCriterion("history_names not between", value1, value2, "historyNames");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdIsNull() {
            addCriterion("legal_entity_id is null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdIsNotNull() {
            addCriterion("legal_entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdEqualTo(Long value) {
            addCriterion("legal_entity_id =", value, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdNotEqualTo(Long value) {
            addCriterion("legal_entity_id <>", value, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdGreaterThan(Long value) {
            addCriterion("legal_entity_id >", value, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("legal_entity_id >=", value, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdLessThan(Long value) {
            addCriterion("legal_entity_id <", value, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("legal_entity_id <=", value, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdIn(List<Long> values) {
            addCriterion("legal_entity_id in", values, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdNotIn(List<Long> values) {
            addCriterion("legal_entity_id not in", values, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdBetween(Long value1, Long value2) {
            addCriterion("legal_entity_id between", value1, value2, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("legal_entity_id not between", value1, value2, "legalEntityId");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeIsNull() {
            addCriterion("legal_entity_type is null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeIsNotNull() {
            addCriterion("legal_entity_type is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeEqualTo(Integer value) {
            addCriterion("legal_entity_type =", value, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeNotEqualTo(Integer value) {
            addCriterion("legal_entity_type <>", value, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeGreaterThan(Integer value) {
            addCriterion("legal_entity_type >", value, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("legal_entity_type >=", value, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeLessThan(Integer value) {
            addCriterion("legal_entity_type <", value, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("legal_entity_type <=", value, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeIn(List<Integer> values) {
            addCriterion("legal_entity_type in", values, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeNotIn(List<Integer> values) {
            addCriterion("legal_entity_type not in", values, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeBetween(Integer value1, Integer value2) {
            addCriterion("legal_entity_type between", value1, value2, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andLegalEntityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("legal_entity_type not between", value1, value2, "legalEntityType");
            return (Criteria) this;
        }

        public Criteria andRegNumberIsNull() {
            addCriterion("reg_number is null");
            return (Criteria) this;
        }

        public Criteria andRegNumberIsNotNull() {
            addCriterion("reg_number is not null");
            return (Criteria) this;
        }

        public Criteria andRegNumberEqualTo(String value) {
            addCriterion("reg_number =", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberNotEqualTo(String value) {
            addCriterion("reg_number <>", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberGreaterThan(String value) {
            addCriterion("reg_number >", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberGreaterThanOrEqualTo(String value) {
            addCriterion("reg_number >=", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberLessThan(String value) {
            addCriterion("reg_number <", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberLessThanOrEqualTo(String value) {
            addCriterion("reg_number <=", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberLike(String value) {
            addCriterion("reg_number like", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberNotLike(String value) {
            addCriterion("reg_number not like", value, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberIn(List<String> values) {
            addCriterion("reg_number in", values, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberNotIn(List<String> values) {
            addCriterion("reg_number not in", values, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberBetween(String value1, String value2) {
            addCriterion("reg_number between", value1, value2, "regNumber");
            return (Criteria) this;
        }

        public Criteria andRegNumberNotBetween(String value1, String value2) {
            addCriterion("reg_number not between", value1, value2, "regNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeIsNull() {
            addCriterion("company_org_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeIsNotNull() {
            addCriterion("company_org_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeEqualTo(String value) {
            addCriterion("company_org_type =", value, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeNotEqualTo(String value) {
            addCriterion("company_org_type <>", value, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeGreaterThan(String value) {
            addCriterion("company_org_type >", value, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_org_type >=", value, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeLessThan(String value) {
            addCriterion("company_org_type <", value, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeLessThanOrEqualTo(String value) {
            addCriterion("company_org_type <=", value, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeLike(String value) {
            addCriterion("company_org_type like", value, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeNotLike(String value) {
            addCriterion("company_org_type not like", value, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeIn(List<String> values) {
            addCriterion("company_org_type in", values, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeNotIn(List<String> values) {
            addCriterion("company_org_type not in", values, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeBetween(String value1, String value2) {
            addCriterion("company_org_type between", value1, value2, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andCompanyOrgTypeNotBetween(String value1, String value2) {
            addCriterion("company_org_type not between", value1, value2, "companyOrgType");
            return (Criteria) this;
        }

        public Criteria andRegLocationIsNull() {
            addCriterion("reg_location is null");
            return (Criteria) this;
        }

        public Criteria andRegLocationIsNotNull() {
            addCriterion("reg_location is not null");
            return (Criteria) this;
        }

        public Criteria andRegLocationEqualTo(String value) {
            addCriterion("reg_location =", value, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationNotEqualTo(String value) {
            addCriterion("reg_location <>", value, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationGreaterThan(String value) {
            addCriterion("reg_location >", value, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationGreaterThanOrEqualTo(String value) {
            addCriterion("reg_location >=", value, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationLessThan(String value) {
            addCriterion("reg_location <", value, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationLessThanOrEqualTo(String value) {
            addCriterion("reg_location <=", value, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationLike(String value) {
            addCriterion("reg_location like", value, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationNotLike(String value) {
            addCriterion("reg_location not like", value, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationIn(List<String> values) {
            addCriterion("reg_location in", values, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationNotIn(List<String> values) {
            addCriterion("reg_location not in", values, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationBetween(String value1, String value2) {
            addCriterion("reg_location between", value1, value2, "regLocation");
            return (Criteria) this;
        }

        public Criteria andRegLocationNotBetween(String value1, String value2) {
            addCriterion("reg_location not between", value1, value2, "regLocation");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeIsNull() {
            addCriterion("estiblish_time is null");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeIsNotNull() {
            addCriterion("estiblish_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeEqualTo(Date value) {
            addCriterion("estiblish_time =", value, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeNotEqualTo(Date value) {
            addCriterion("estiblish_time <>", value, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeGreaterThan(Date value) {
            addCriterion("estiblish_time >", value, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("estiblish_time >=", value, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeLessThan(Date value) {
            addCriterion("estiblish_time <", value, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeLessThanOrEqualTo(Date value) {
            addCriterion("estiblish_time <=", value, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeIn(List<Date> values) {
            addCriterion("estiblish_time in", values, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeNotIn(List<Date> values) {
            addCriterion("estiblish_time not in", values, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeBetween(Date value1, Date value2) {
            addCriterion("estiblish_time between", value1, value2, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andEstiblishTimeNotBetween(Date value1, Date value2) {
            addCriterion("estiblish_time not between", value1, value2, "estiblishTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeIsNull() {
            addCriterion("from_time is null");
            return (Criteria) this;
        }

        public Criteria andFromTimeIsNotNull() {
            addCriterion("from_time is not null");
            return (Criteria) this;
        }

        public Criteria andFromTimeEqualTo(Date value) {
            addCriterion("from_time =", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeNotEqualTo(Date value) {
            addCriterion("from_time <>", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeGreaterThan(Date value) {
            addCriterion("from_time >", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("from_time >=", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeLessThan(Date value) {
            addCriterion("from_time <", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeLessThanOrEqualTo(Date value) {
            addCriterion("from_time <=", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeIn(List<Date> values) {
            addCriterion("from_time in", values, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeNotIn(List<Date> values) {
            addCriterion("from_time not in", values, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeBetween(Date value1, Date value2) {
            addCriterion("from_time between", value1, value2, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeNotBetween(Date value1, Date value2) {
            addCriterion("from_time not between", value1, value2, "fromTime");
            return (Criteria) this;
        }

        public Criteria andToTimeIsNull() {
            addCriterion("to_time is null");
            return (Criteria) this;
        }

        public Criteria andToTimeIsNotNull() {
            addCriterion("to_time is not null");
            return (Criteria) this;
        }

        public Criteria andToTimeEqualTo(Date value) {
            addCriterion("to_time =", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeNotEqualTo(Date value) {
            addCriterion("to_time <>", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeGreaterThan(Date value) {
            addCriterion("to_time >", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("to_time >=", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeLessThan(Date value) {
            addCriterion("to_time <", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeLessThanOrEqualTo(Date value) {
            addCriterion("to_time <=", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeIn(List<Date> values) {
            addCriterion("to_time in", values, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeNotIn(List<Date> values) {
            addCriterion("to_time not in", values, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeBetween(Date value1, Date value2) {
            addCriterion("to_time between", value1, value2, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeNotBetween(Date value1, Date value2) {
            addCriterion("to_time not between", value1, value2, "toTime");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andRegInstituteIsNull() {
            addCriterion("reg_institute is null");
            return (Criteria) this;
        }

        public Criteria andRegInstituteIsNotNull() {
            addCriterion("reg_institute is not null");
            return (Criteria) this;
        }

        public Criteria andRegInstituteEqualTo(String value) {
            addCriterion("reg_institute =", value, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteNotEqualTo(String value) {
            addCriterion("reg_institute <>", value, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteGreaterThan(String value) {
            addCriterion("reg_institute >", value, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteGreaterThanOrEqualTo(String value) {
            addCriterion("reg_institute >=", value, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteLessThan(String value) {
            addCriterion("reg_institute <", value, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteLessThanOrEqualTo(String value) {
            addCriterion("reg_institute <=", value, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteLike(String value) {
            addCriterion("reg_institute like", value, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteNotLike(String value) {
            addCriterion("reg_institute not like", value, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteIn(List<String> values) {
            addCriterion("reg_institute in", values, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteNotIn(List<String> values) {
            addCriterion("reg_institute not in", values, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteBetween(String value1, String value2) {
            addCriterion("reg_institute between", value1, value2, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andRegInstituteNotBetween(String value1, String value2) {
            addCriterion("reg_institute not between", value1, value2, "regInstitute");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeIsNull() {
            addCriterion("approved_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeIsNotNull() {
            addCriterion("approved_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeEqualTo(Date value) {
            addCriterion("approved_time =", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeNotEqualTo(Date value) {
            addCriterion("approved_time <>", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeGreaterThan(Date value) {
            addCriterion("approved_time >", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approved_time >=", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeLessThan(Date value) {
            addCriterion("approved_time <", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeLessThanOrEqualTo(Date value) {
            addCriterion("approved_time <=", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeIn(List<Date> values) {
            addCriterion("approved_time in", values, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeNotIn(List<Date> values) {
            addCriterion("approved_time not in", values, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeBetween(Date value1, Date value2) {
            addCriterion("approved_time between", value1, value2, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeNotBetween(Date value1, Date value2) {
            addCriterion("approved_time not between", value1, value2, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andRegStatusIsNull() {
            addCriterion("reg_status is null");
            return (Criteria) this;
        }

        public Criteria andRegStatusIsNotNull() {
            addCriterion("reg_status is not null");
            return (Criteria) this;
        }

        public Criteria andRegStatusEqualTo(String value) {
            addCriterion("reg_status =", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusNotEqualTo(String value) {
            addCriterion("reg_status <>", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusGreaterThan(String value) {
            addCriterion("reg_status >", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusGreaterThanOrEqualTo(String value) {
            addCriterion("reg_status >=", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusLessThan(String value) {
            addCriterion("reg_status <", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusLessThanOrEqualTo(String value) {
            addCriterion("reg_status <=", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusLike(String value) {
            addCriterion("reg_status like", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusNotLike(String value) {
            addCriterion("reg_status not like", value, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusIn(List<String> values) {
            addCriterion("reg_status in", values, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusNotIn(List<String> values) {
            addCriterion("reg_status not in", values, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusBetween(String value1, String value2) {
            addCriterion("reg_status between", value1, value2, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegStatusNotBetween(String value1, String value2) {
            addCriterion("reg_status not between", value1, value2, "regStatus");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNull() {
            addCriterion("reg_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNotNull() {
            addCriterion("reg_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalEqualTo(String value) {
            addCriterion("reg_capital =", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotEqualTo(String value) {
            addCriterion("reg_capital <>", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThan(String value) {
            addCriterion("reg_capital >", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("reg_capital >=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThan(String value) {
            addCriterion("reg_capital <", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThanOrEqualTo(String value) {
            addCriterion("reg_capital <=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLike(String value) {
            addCriterion("reg_capital like", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotLike(String value) {
            addCriterion("reg_capital not like", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIn(List<String> values) {
            addCriterion("reg_capital in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotIn(List<String> values) {
            addCriterion("reg_capital not in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalBetween(String value1, String value2) {
            addCriterion("reg_capital between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotBetween(String value1, String value2) {
            addCriterion("reg_capital not between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andOrgNumberIsNull() {
            addCriterion("org_number is null");
            return (Criteria) this;
        }

        public Criteria andOrgNumberIsNotNull() {
            addCriterion("org_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNumberEqualTo(String value) {
            addCriterion("org_number =", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberNotEqualTo(String value) {
            addCriterion("org_number <>", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberGreaterThan(String value) {
            addCriterion("org_number >", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberGreaterThanOrEqualTo(String value) {
            addCriterion("org_number >=", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberLessThan(String value) {
            addCriterion("org_number <", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberLessThanOrEqualTo(String value) {
            addCriterion("org_number <=", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberLike(String value) {
            addCriterion("org_number like", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberNotLike(String value) {
            addCriterion("org_number not like", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberIn(List<String> values) {
            addCriterion("org_number in", values, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberNotIn(List<String> values) {
            addCriterion("org_number not in", values, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberBetween(String value1, String value2) {
            addCriterion("org_number between", value1, value2, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberNotBetween(String value1, String value2) {
            addCriterion("org_number not between", value1, value2, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteIsNull() {
            addCriterion("org_approved_institute is null");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteIsNotNull() {
            addCriterion("org_approved_institute is not null");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteEqualTo(String value) {
            addCriterion("org_approved_institute =", value, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteNotEqualTo(String value) {
            addCriterion("org_approved_institute <>", value, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteGreaterThan(String value) {
            addCriterion("org_approved_institute >", value, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteGreaterThanOrEqualTo(String value) {
            addCriterion("org_approved_institute >=", value, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteLessThan(String value) {
            addCriterion("org_approved_institute <", value, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteLessThanOrEqualTo(String value) {
            addCriterion("org_approved_institute <=", value, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteLike(String value) {
            addCriterion("org_approved_institute like", value, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteNotLike(String value) {
            addCriterion("org_approved_institute not like", value, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteIn(List<String> values) {
            addCriterion("org_approved_institute in", values, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteNotIn(List<String> values) {
            addCriterion("org_approved_institute not in", values, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteBetween(String value1, String value2) {
            addCriterion("org_approved_institute between", value1, value2, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andOrgApprovedInstituteNotBetween(String value1, String value2) {
            addCriterion("org_approved_institute not between", value1, value2, "orgApprovedInstitute");
            return (Criteria) this;
        }

        public Criteria andCurrentCidIsNull() {
            addCriterion("current_cid is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCidIsNotNull() {
            addCriterion("current_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCidEqualTo(Long value) {
            addCriterion("current_cid =", value, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidNotEqualTo(Long value) {
            addCriterion("current_cid <>", value, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidGreaterThan(Long value) {
            addCriterion("current_cid >", value, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidGreaterThanOrEqualTo(Long value) {
            addCriterion("current_cid >=", value, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidLessThan(Long value) {
            addCriterion("current_cid <", value, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidLessThanOrEqualTo(Long value) {
            addCriterion("current_cid <=", value, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidIn(List<Long> values) {
            addCriterion("current_cid in", values, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidNotIn(List<Long> values) {
            addCriterion("current_cid not in", values, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidBetween(Long value1, Long value2) {
            addCriterion("current_cid between", value1, value2, "currentCid");
            return (Criteria) this;
        }

        public Criteria andCurrentCidNotBetween(Long value1, Long value2) {
            addCriterion("current_cid not between", value1, value2, "currentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidIsNull() {
            addCriterion("parent_cid is null");
            return (Criteria) this;
        }

        public Criteria andParentCidIsNotNull() {
            addCriterion("parent_cid is not null");
            return (Criteria) this;
        }

        public Criteria andParentCidEqualTo(Long value) {
            addCriterion("parent_cid =", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidNotEqualTo(Long value) {
            addCriterion("parent_cid <>", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidGreaterThan(Long value) {
            addCriterion("parent_cid >", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_cid >=", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidLessThan(Long value) {
            addCriterion("parent_cid <", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidLessThanOrEqualTo(Long value) {
            addCriterion("parent_cid <=", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidIn(List<Long> values) {
            addCriterion("parent_cid in", values, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidNotIn(List<Long> values) {
            addCriterion("parent_cid not in", values, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidBetween(Long value1, Long value2) {
            addCriterion("parent_cid between", value1, value2, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidNotBetween(Long value1, Long value2) {
            addCriterion("parent_cid not between", value1, value2, "parentCid");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(Integer value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(Integer value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(Integer value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(Integer value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<Integer> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<Integer> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(Integer value1, Integer value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNull() {
            addCriterion("credit_code is null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNotNull() {
            addCriterion("credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeEqualTo(String value) {
            addCriterion("credit_code =", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotEqualTo(String value) {
            addCriterion("credit_code <>", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThan(String value) {
            addCriterion("credit_code >", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_code >=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThan(String value) {
            addCriterion("credit_code <", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("credit_code <=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLike(String value) {
            addCriterion("credit_code like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotLike(String value) {
            addCriterion("credit_code not like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIn(List<String> values) {
            addCriterion("credit_code in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotIn(List<String> values) {
            addCriterion("credit_code not in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeBetween(String value1, String value2) {
            addCriterion("credit_code between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotBetween(String value1, String value2) {
            addCriterion("credit_code not between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(Integer value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(Integer value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(Integer value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(Integer value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(Integer value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<Integer> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<Integer> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(Integer value1, Integer value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountIsNull() {
            addCriterion("reg_capital_amount is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountIsNotNull() {
            addCriterion("reg_capital_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountEqualTo(Long value) {
            addCriterion("reg_capital_amount =", value, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountNotEqualTo(Long value) {
            addCriterion("reg_capital_amount <>", value, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountGreaterThan(Long value) {
            addCriterion("reg_capital_amount >", value, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_capital_amount >=", value, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountLessThan(Long value) {
            addCriterion("reg_capital_amount <", value, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountLessThanOrEqualTo(Long value) {
            addCriterion("reg_capital_amount <=", value, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountIn(List<Long> values) {
            addCriterion("reg_capital_amount in", values, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountNotIn(List<Long> values) {
            addCriterion("reg_capital_amount not in", values, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountBetween(Long value1, Long value2) {
            addCriterion("reg_capital_amount between", value1, value2, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalAmountNotBetween(Long value1, Long value2) {
            addCriterion("reg_capital_amount not between", value1, value2, "regCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyIsNull() {
            addCriterion("reg_capital_currency is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyIsNotNull() {
            addCriterion("reg_capital_currency is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyEqualTo(String value) {
            addCriterion("reg_capital_currency =", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyNotEqualTo(String value) {
            addCriterion("reg_capital_currency <>", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyGreaterThan(String value) {
            addCriterion("reg_capital_currency >", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("reg_capital_currency >=", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyLessThan(String value) {
            addCriterion("reg_capital_currency <", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyLessThanOrEqualTo(String value) {
            addCriterion("reg_capital_currency <=", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyLike(String value) {
            addCriterion("reg_capital_currency like", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyNotLike(String value) {
            addCriterion("reg_capital_currency not like", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyIn(List<String> values) {
            addCriterion("reg_capital_currency in", values, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyNotIn(List<String> values) {
            addCriterion("reg_capital_currency not in", values, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyBetween(String value1, String value2) {
            addCriterion("reg_capital_currency between", value1, value2, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyNotBetween(String value1, String value2) {
            addCriterion("reg_capital_currency not between", value1, value2, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountIsNull() {
            addCriterion("actual_capital_amount is null");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountIsNotNull() {
            addCriterion("actual_capital_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountEqualTo(Long value) {
            addCriterion("actual_capital_amount =", value, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountNotEqualTo(Long value) {
            addCriterion("actual_capital_amount <>", value, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountGreaterThan(Long value) {
            addCriterion("actual_capital_amount >", value, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("actual_capital_amount >=", value, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountLessThan(Long value) {
            addCriterion("actual_capital_amount <", value, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountLessThanOrEqualTo(Long value) {
            addCriterion("actual_capital_amount <=", value, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountIn(List<Long> values) {
            addCriterion("actual_capital_amount in", values, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountNotIn(List<Long> values) {
            addCriterion("actual_capital_amount not in", values, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountBetween(Long value1, Long value2) {
            addCriterion("actual_capital_amount between", value1, value2, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalAmountNotBetween(Long value1, Long value2) {
            addCriterion("actual_capital_amount not between", value1, value2, "actualCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyIsNull() {
            addCriterion("actual_capital_currency is null");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyIsNotNull() {
            addCriterion("actual_capital_currency is not null");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyEqualTo(String value) {
            addCriterion("actual_capital_currency =", value, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyNotEqualTo(String value) {
            addCriterion("actual_capital_currency <>", value, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyGreaterThan(String value) {
            addCriterion("actual_capital_currency >", value, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("actual_capital_currency >=", value, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyLessThan(String value) {
            addCriterion("actual_capital_currency <", value, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyLessThanOrEqualTo(String value) {
            addCriterion("actual_capital_currency <=", value, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyLike(String value) {
            addCriterion("actual_capital_currency like", value, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyNotLike(String value) {
            addCriterion("actual_capital_currency not like", value, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyIn(List<String> values) {
            addCriterion("actual_capital_currency in", values, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyNotIn(List<String> values) {
            addCriterion("actual_capital_currency not in", values, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyBetween(String value1, String value2) {
            addCriterion("actual_capital_currency between", value1, value2, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andActualCapitalCurrencyNotBetween(String value1, String value2) {
            addCriterion("actual_capital_currency not between", value1, value2, "actualCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdIsNull() {
            addCriterion("reg_status_std is null");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdIsNotNull() {
            addCriterion("reg_status_std is not null");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdEqualTo(String value) {
            addCriterion("reg_status_std =", value, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdNotEqualTo(String value) {
            addCriterion("reg_status_std <>", value, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdGreaterThan(String value) {
            addCriterion("reg_status_std >", value, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_status_std >=", value, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdLessThan(String value) {
            addCriterion("reg_status_std <", value, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdLessThanOrEqualTo(String value) {
            addCriterion("reg_status_std <=", value, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdLike(String value) {
            addCriterion("reg_status_std like", value, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdNotLike(String value) {
            addCriterion("reg_status_std not like", value, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdIn(List<String> values) {
            addCriterion("reg_status_std in", values, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdNotIn(List<String> values) {
            addCriterion("reg_status_std not in", values, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdBetween(String value1, String value2) {
            addCriterion("reg_status_std between", value1, value2, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andRegStatusStdNotBetween(String value1, String value2) {
            addCriterion("reg_status_std not between", value1, value2, "regStatusStd");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumIsNull() {
            addCriterion("social_security_staff_num is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumIsNotNull() {
            addCriterion("social_security_staff_num is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumEqualTo(Integer value) {
            addCriterion("social_security_staff_num =", value, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumNotEqualTo(Integer value) {
            addCriterion("social_security_staff_num <>", value, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumGreaterThan(Integer value) {
            addCriterion("social_security_staff_num >", value, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("social_security_staff_num >=", value, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumLessThan(Integer value) {
            addCriterion("social_security_staff_num <", value, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumLessThanOrEqualTo(Integer value) {
            addCriterion("social_security_staff_num <=", value, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumIn(List<Integer> values) {
            addCriterion("social_security_staff_num in", values, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumNotIn(List<Integer> values) {
            addCriterion("social_security_staff_num not in", values, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumBetween(Integer value1, Integer value2) {
            addCriterion("social_security_staff_num between", value1, value2, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStaffNumNotBetween(Integer value1, Integer value2) {
            addCriterion("social_security_staff_num not between", value1, value2, "socialSecurityStaffNum");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andRevokeDateIsNull() {
            addCriterion("revoke_date is null");
            return (Criteria) this;
        }

        public Criteria andRevokeDateIsNotNull() {
            addCriterion("revoke_date is not null");
            return (Criteria) this;
        }

        public Criteria andRevokeDateEqualTo(Date value) {
            addCriterion("revoke_date =", value, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateNotEqualTo(Date value) {
            addCriterion("revoke_date <>", value, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateGreaterThan(Date value) {
            addCriterion("revoke_date >", value, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("revoke_date >=", value, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateLessThan(Date value) {
            addCriterion("revoke_date <", value, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateLessThanOrEqualTo(Date value) {
            addCriterion("revoke_date <=", value, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateIn(List<Date> values) {
            addCriterion("revoke_date in", values, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateNotIn(List<Date> values) {
            addCriterion("revoke_date not in", values, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateBetween(Date value1, Date value2) {
            addCriterion("revoke_date between", value1, value2, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeDateNotBetween(Date value1, Date value2) {
            addCriterion("revoke_date not between", value1, value2, "revokeDate");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonIsNull() {
            addCriterion("revoke_reason is null");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonIsNotNull() {
            addCriterion("revoke_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonEqualTo(String value) {
            addCriterion("revoke_reason =", value, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonNotEqualTo(String value) {
            addCriterion("revoke_reason <>", value, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonGreaterThan(String value) {
            addCriterion("revoke_reason >", value, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("revoke_reason >=", value, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonLessThan(String value) {
            addCriterion("revoke_reason <", value, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonLessThanOrEqualTo(String value) {
            addCriterion("revoke_reason <=", value, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonLike(String value) {
            addCriterion("revoke_reason like", value, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonNotLike(String value) {
            addCriterion("revoke_reason not like", value, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonIn(List<String> values) {
            addCriterion("revoke_reason in", values, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonNotIn(List<String> values) {
            addCriterion("revoke_reason not in", values, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonBetween(String value1, String value2) {
            addCriterion("revoke_reason between", value1, value2, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andRevokeReasonNotBetween(String value1, String value2) {
            addCriterion("revoke_reason not between", value1, value2, "revokeReason");
            return (Criteria) this;
        }

        public Criteria andEmailsIsNull() {
            addCriterion("emails is null");
            return (Criteria) this;
        }

        public Criteria andEmailsIsNotNull() {
            addCriterion("emails is not null");
            return (Criteria) this;
        }

        public Criteria andEmailsEqualTo(String value) {
            addCriterion("emails =", value, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsNotEqualTo(String value) {
            addCriterion("emails <>", value, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsGreaterThan(String value) {
            addCriterion("emails >", value, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsGreaterThanOrEqualTo(String value) {
            addCriterion("emails >=", value, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsLessThan(String value) {
            addCriterion("emails <", value, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsLessThanOrEqualTo(String value) {
            addCriterion("emails <=", value, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsLike(String value) {
            addCriterion("emails like", value, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsNotLike(String value) {
            addCriterion("emails not like", value, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsIn(List<String> values) {
            addCriterion("emails in", values, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsNotIn(List<String> values) {
            addCriterion("emails not in", values, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsBetween(String value1, String value2) {
            addCriterion("emails between", value1, value2, "emails");
            return (Criteria) this;
        }

        public Criteria andEmailsNotBetween(String value1, String value2) {
            addCriterion("emails not between", value1, value2, "emails");
            return (Criteria) this;
        }

        public Criteria andPhonesIsNull() {
            addCriterion("phones is null");
            return (Criteria) this;
        }

        public Criteria andPhonesIsNotNull() {
            addCriterion("phones is not null");
            return (Criteria) this;
        }

        public Criteria andPhonesEqualTo(String value) {
            addCriterion("phones =", value, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesNotEqualTo(String value) {
            addCriterion("phones <>", value, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesGreaterThan(String value) {
            addCriterion("phones >", value, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesGreaterThanOrEqualTo(String value) {
            addCriterion("phones >=", value, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesLessThan(String value) {
            addCriterion("phones <", value, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesLessThanOrEqualTo(String value) {
            addCriterion("phones <=", value, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesLike(String value) {
            addCriterion("phones like", value, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesNotLike(String value) {
            addCriterion("phones not like", value, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesIn(List<String> values) {
            addCriterion("phones in", values, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesNotIn(List<String> values) {
            addCriterion("phones not in", values, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesBetween(String value1, String value2) {
            addCriterion("phones between", value1, value2, "phones");
            return (Criteria) this;
        }

        public Criteria andPhonesNotBetween(String value1, String value2) {
            addCriterion("phones not between", value1, value2, "phones");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumIsNull() {
            addCriterion("wechat_public_num is null");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumIsNotNull() {
            addCriterion("wechat_public_num is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumEqualTo(String value) {
            addCriterion("wechat_public_num =", value, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumNotEqualTo(String value) {
            addCriterion("wechat_public_num <>", value, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumGreaterThan(String value) {
            addCriterion("wechat_public_num >", value, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_public_num >=", value, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumLessThan(String value) {
            addCriterion("wechat_public_num <", value, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumLessThanOrEqualTo(String value) {
            addCriterion("wechat_public_num <=", value, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumLike(String value) {
            addCriterion("wechat_public_num like", value, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumNotLike(String value) {
            addCriterion("wechat_public_num not like", value, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumIn(List<String> values) {
            addCriterion("wechat_public_num in", values, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumNotIn(List<String> values) {
            addCriterion("wechat_public_num not in", values, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumBetween(String value1, String value2) {
            addCriterion("wechat_public_num between", value1, value2, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andWechatPublicNumNotBetween(String value1, String value2) {
            addCriterion("wechat_public_num not between", value1, value2, "wechatPublicNum");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeIsNull() {
            addCriterion("crawled_time is null");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeIsNotNull() {
            addCriterion("crawled_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeEqualTo(Date value) {
            addCriterion("crawled_time =", value, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeNotEqualTo(Date value) {
            addCriterion("crawled_time <>", value, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeGreaterThan(Date value) {
            addCriterion("crawled_time >", value, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crawled_time >=", value, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeLessThan(Date value) {
            addCriterion("crawled_time <", value, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeLessThanOrEqualTo(Date value) {
            addCriterion("crawled_time <=", value, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeIn(List<Date> values) {
            addCriterion("crawled_time in", values, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeNotIn(List<Date> values) {
            addCriterion("crawled_time not in", values, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeBetween(Date value1, Date value2) {
            addCriterion("crawled_time between", value1, value2, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCrawledTimeNotBetween(Date value1, Date value2) {
            addCriterion("crawled_time not between", value1, value2, "crawledTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsIsNull() {
            addCriterion("updateFields is null");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsIsNotNull() {
            addCriterion("updateFields is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsEqualTo(String value) {
            addCriterion("updateFields =", value, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsNotEqualTo(String value) {
            addCriterion("updateFields <>", value, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsGreaterThan(String value) {
            addCriterion("updateFields >", value, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsGreaterThanOrEqualTo(String value) {
            addCriterion("updateFields >=", value, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsLessThan(String value) {
            addCriterion("updateFields <", value, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsLessThanOrEqualTo(String value) {
            addCriterion("updateFields <=", value, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsLike(String value) {
            addCriterion("updateFields like", value, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsNotLike(String value) {
            addCriterion("updateFields not like", value, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsIn(List<String> values) {
            addCriterion("updateFields in", values, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsNotIn(List<String> values) {
            addCriterion("updateFields not in", values, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsBetween(String value1, String value2) {
            addCriterion("updateFields between", value1, value2, "updatefields");
            return (Criteria) this;
        }

        public Criteria andUpdatefieldsNotBetween(String value1, String value2) {
            addCriterion("updateFields not between", value1, value2, "updatefields");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(Date value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(Date value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(Date value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(Date value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(Date value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(Date value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<Date> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<Date> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(Date value1, Date value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(Date value1, Date value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }
    }

    /**
     */
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