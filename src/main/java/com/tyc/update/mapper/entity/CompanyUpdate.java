package com.tyc.update.mapper.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * company_update
 * @author 
 */
public class CompanyUpdate implements Serializable {
    private Long id;

    /**
     * 公司标识
     */
    private Long cid;

    /**
     * 归属省份的首字母小写
     */
    private String base;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 英文名
     */
    private String nameEn;

    /**
     * 公司别名
     */
    private String nameAlias;

    /**
     * 公司历史名称
     */
    private String historyNames;

    /**
     * 法人ID：人标识或公司标识
     */
    private Long legalEntityId;

    /**
     * 法人类型，1 人 2 公司
     */
    private Integer legalEntityType;

    /**
     * 注册号
     */
    private String regNumber;

    /**
     * 公司类型
     */
    private String companyOrgType;

    /**
     * 注册地址
     */
    private String regLocation;

    /**
     * 成立日期
     */
    private Date estiblishTime;

    /**
     * 营业期限开始日期
     */
    private Date fromTime;

    /**
     * 营业期限终止日期
     */
    private Date toTime;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 登记机关
     */
    private String regInstitute;

    /**
     * 核准日期
     */
    private Date approvedTime;

    /**
     * 企业状态
     */
    private String regStatus;

    /**
     * 注册资本
     */
    private String regCapital;

    /**
     * 组织机构代码
     */
    private String orgNumber;

    /**
     * 组织机构批准单位
     */
    private String orgApprovedInstitute;

    /**
     * 如果该条记录为历史名称，则该字段值对应最新名称那条记录的id
     */
    private Long currentCid;

    /**
     * 上级机构ID
     */
    private Long parentCid;

    /**
     * 机构类型-1:公司,2:香港企业,3:社会组织,4:律所,5:事业单位,6:基金会,8:台湾企业
     */
    private Integer companyType;

    /**
     * 统一社会信用代码
     */
    private String creditCode;

    /**
     * 公司评分
     */
    private String score;

    /**
     * 行业分类
     */
    private String categoryCode;

    /**
     * 公司纬度
     */
    private BigDecimal lat;

    /**
     * 公司经度
     */
    private BigDecimal lng;

    /**
     * 行政区划码
     */
    private Integer areaCode;

    /**
     * 注册资本金额，数值类型
     */
    private Long regCapitalAmount;

    /**
     * 注册资本币种  人民币 美元 欧元 等
     */
    private String regCapitalCurrency;

    /**
     * 实收资本金额（单位：分）
     */
    private Long actualCapitalAmount;

    /**
     * 实收资本币种 人民币 美元 欧元等
     */
    private String actualCapitalCurrency;

    /**
     * 公司注册状态标准化
     */
    private String regStatusStd;

    /**
     * 职工参保人数
     */
    private Integer socialSecurityStaffNum;

    /**
     * 注销日期
     */
    private Date cancelDate;

    /**
     * 注销原因
     */
    private String cancelReason;

    /**
     * 吊销日期
     */
    private Date revokeDate;

    /**
     * 吊销原因/吊销凭证
     */
    private String revokeReason;

    /**
     * 邮箱列表
     */
    private String emails;

    /**
     * 电话
     */
    private String phones;

    /**
     * 微信公众号
     */
    private String wechatPublicNum;

    /**
     * 公司logo
     */
    private String logo;

    /**
     * 解析完成时间
     */
    private Date crawledTime;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private String operationType;

    private String updatefields;

    private Date batch;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public String getHistoryNames() {
        return historyNames;
    }

    public void setHistoryNames(String historyNames) {
        this.historyNames = historyNames;
    }

    public Long getLegalEntityId() {
        return legalEntityId;
    }

    public void setLegalEntityId(Long legalEntityId) {
        this.legalEntityId = legalEntityId;
    }

    public Integer getLegalEntityType() {
        return legalEntityType;
    }

    public void setLegalEntityType(Integer legalEntityType) {
        this.legalEntityType = legalEntityType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getCompanyOrgType() {
        return companyOrgType;
    }

    public void setCompanyOrgType(String companyOrgType) {
        this.companyOrgType = companyOrgType;
    }

    public String getRegLocation() {
        return regLocation;
    }

    public void setRegLocation(String regLocation) {
        this.regLocation = regLocation;
    }

    public Date getEstiblishTime() {
        return estiblishTime;
    }

    public void setEstiblishTime(Date estiblishTime) {
        this.estiblishTime = estiblishTime;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getRegInstitute() {
        return regInstitute;
    }

    public void setRegInstitute(String regInstitute) {
        this.regInstitute = regInstitute;
    }

    public Date getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(Date approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getOrgApprovedInstitute() {
        return orgApprovedInstitute;
    }

    public void setOrgApprovedInstitute(String orgApprovedInstitute) {
        this.orgApprovedInstitute = orgApprovedInstitute;
    }

    public Long getCurrentCid() {
        return currentCid;
    }

    public void setCurrentCid(Long currentCid) {
        this.currentCid = currentCid;
    }

    public Long getParentCid() {
        return parentCid;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public Long getRegCapitalAmount() {
        return regCapitalAmount;
    }

    public void setRegCapitalAmount(Long regCapitalAmount) {
        this.regCapitalAmount = regCapitalAmount;
    }

    public String getRegCapitalCurrency() {
        return regCapitalCurrency;
    }

    public void setRegCapitalCurrency(String regCapitalCurrency) {
        this.regCapitalCurrency = regCapitalCurrency;
    }

    public Long getActualCapitalAmount() {
        return actualCapitalAmount;
    }

    public void setActualCapitalAmount(Long actualCapitalAmount) {
        this.actualCapitalAmount = actualCapitalAmount;
    }

    public String getActualCapitalCurrency() {
        return actualCapitalCurrency;
    }

    public void setActualCapitalCurrency(String actualCapitalCurrency) {
        this.actualCapitalCurrency = actualCapitalCurrency;
    }

    public String getRegStatusStd() {
        return regStatusStd;
    }

    public void setRegStatusStd(String regStatusStd) {
        this.regStatusStd = regStatusStd;
    }

    public Integer getSocialSecurityStaffNum() {
        return socialSecurityStaffNum;
    }

    public void setSocialSecurityStaffNum(Integer socialSecurityStaffNum) {
        this.socialSecurityStaffNum = socialSecurityStaffNum;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Date getRevokeDate() {
        return revokeDate;
    }

    public void setRevokeDate(Date revokeDate) {
        this.revokeDate = revokeDate;
    }

    public String getRevokeReason() {
        return revokeReason;
    }

    public void setRevokeReason(String revokeReason) {
        this.revokeReason = revokeReason;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getWechatPublicNum() {
        return wechatPublicNum;
    }

    public void setWechatPublicNum(String wechatPublicNum) {
        this.wechatPublicNum = wechatPublicNum;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getCrawledTime() {
        return crawledTime;
    }

    public void setCrawledTime(Date crawledTime) {
        this.crawledTime = crawledTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getUpdatefields() {
        return updatefields;
    }

    public void setUpdatefields(String updatefields) {
        this.updatefields = updatefields;
    }

    public Date getBatch() {
        return batch;
    }

    public void setBatch(Date batch) {
        this.batch = batch;
    }
}