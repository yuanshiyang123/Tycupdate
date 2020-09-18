package com.tyc.update.pojo;

import java.util.List;

public class CompanyBean {

    /**
     * state : ok
     * message : null
     * special :
     * vipMessage :
     * isLogin : 0
     * data : {}
     */

    private String state;
    private Object message;
    private String special;
    private String vipMessage;
    private Integer isLogin;
    private DataDTO data;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getVipMessage() {
        return vipMessage;
    }

    public void setVipMessage(String vipMessage) {
        this.vipMessage = vipMessage;
    }

    public Integer getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        /**
         * pageNum : 1
         * total : 18560
         * realTotal : 18560
         * Item : [{},{}]
         * scrollId : de3b159b-a93d-4e65-9ba4-bcc24cb3a9c4
         * reqCounter : 1
         */

        private Integer pageNum;
        private Integer total;
        private Integer realTotal;
        private String scrollId;
        private Integer reqCounter;
        private List<ItemsDTO> items;

        public Integer getPageNum() {
            return pageNum;
        }

        public void setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getRealTotal() {
            return realTotal;
        }

        public void setRealTotal(Integer realTotal) {
            this.realTotal = realTotal;
        }

        public String getScrollId() {
            return scrollId;
        }

        public void setScrollId(String scrollId) {
            this.scrollId = scrollId;
        }

        public Integer getReqCounter() {
            return reqCounter;
        }

        public void setReqCounter(Integer reqCounter) {
            this.reqCounter = reqCounter;
        }

        public List<ItemsDTO> getItems() {
            return items;
        }

        public void setItems(List<ItemsDTO> items) {
            this.items = items;
        }

        public static class ItemsDTO {
            /**
             * id : 225738
             * table : company
             * cids : 3222933667
             * updateFields : ["crawled_time", "update_time"]
             * type : UPDATE
             * data : {"company_type":"1","legal_entity_id":"2042820658","reg_number":"330782001389705","name_alias":"纳品箱包","actual_capital_currency":"人民币","phones":"","reg_institute":"义乌市市场监督管理局","from_time":"2018-08-22 00:00:00","estiblish_time":"2018-08-22 00:00:00","legal_entity_type":"1","emails":"","score":"5335","update_time":"2020-09-15 00:08:22.781523","credit_code":"91330782MA2DEGFD41","reg_location":"浙江省义乌市北苑街道茂后B区五幢六号楼四楼（自主申报）","approved_time":"2020-04-15 00:00:00","logo":"/logo/lll/567e2b8eb5a2875a72bcc1302fdbd6b2.png@!f_200x200","id":"166323085","lat":"119.996266044227210","lng":"29.320808010186840","create_time":"2020-06-03 06:16:33","category_code":"518","area_code":"330782","reg_capital":"50.000000万人民币","company_org_type":"有限责任公司(自然人独资)","actual_capital_amount":"0","business_scope":"实物现场批发、网上销售：箱包、服饰、办公用品、喜庆日用品、包装盒、工艺品、家居日用品、日用百货；国内贸易、国际贸易。（依法须经批准的项目，经相关部门批准后方可开展经营活动）","crawled_time":"2020-09-14 23:48:32","deleted":"0","social_security_staff_num":"1","reg_status":"存续","org_number":"MA2DEGFD4","name":"义乌市纳品箱包有限公司","reg_capital_currency":"人民币","reg_status_std":"存续","to_time":"9999-09-09 00:00:00","reg_capital_amount":"50000000","cid":"3222933667","base":"zj"}
             * old : {"crawled_time":"2020-09-05 11:52:51","update_time":"2020-09-05 12:07:47.341580"}
             * createTime : 1600099830000
             */

            private Integer id;
            private String table;
            private String cids;
            private String updateFields;
            private String type;
            private DataDTOItem data;
            private OldDTO old;
            private Long createTime;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getTable() {
                return table;
            }

            public void setTable(String table) {
                this.table = table;
            }

            public String getCids() {
                return cids;
            }

            public void setCids(String cids) {
                this.cids = cids;
            }

            public String getUpdateFields() {
                return updateFields;
            }

            public void setUpdateFields(String updateFields) {
                this.updateFields = updateFields;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public DataDTOItem getData() {
                return data;
            }

            public void setData(DataDTOItem data) {
                this.data = data;
            }

            public OldDTO getOld() {
                return old;
            }

            public void setOld(OldDTO old) {
                this.old = old;
            }

            public Long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Long createTime) {
                this.createTime = createTime;
            }

            public static class DataDTOItem {
                /**
                 * company_type : 1
                 * legal_entity_id : 2042820658
                 * reg_number : 330782001389705
                 * name_alias : 纳品箱包
                 * actual_capital_currency : 人民币
                 * phones :
                 * reg_institute : 义乌市市场监督管理局
                 * from_time : 2018-08-22 00:00:00
                 * estiblish_time : 2018-08-22 00:00:00
                 * legal_entity_type : 1
                 * emails :
                 * score : 5335
                 * update_time : 2020-09-15 00:08:22.781523
                 * credit_code : 91330782MA2DEGFD41
                 * reg_location : 浙江省义乌市北苑街道茂后B区五幢六号楼四楼（自主申报）
                 * approved_time : 2020-04-15 00:00:00
                 * logo : /logo/lll/567e2b8eb5a2875a72bcc1302fdbd6b2.png@!f_200x200
                 * id : 166323085
                 * lat : 119.996266044227210
                 * lng : 29.320808010186840
                 * create_time : 2020-06-03 06:16:33
                 * category_code : 518
                 * area_code : 330782
                 * reg_capital : 50.000000万人民币
                 * company_org_type : 有限责任公司(自然人独资)
                 * actual_capital_amount : 0
                 * business_scope : 实物现场批发、网上销售：箱包、服饰、办公用品、喜庆日用品、包装盒、工艺品、家居日用品、日用百货；国内贸易、国际贸易。（依法须经批准的项目，经相关部门批准后方可开展经营活动）
                 * crawled_time : 2020-09-14 23:48:32
                 * deleted : 0
                 * social_security_staff_num : 1
                 * reg_status : 存续
                 * org_number : MA2DEGFD4
                 * name : 义乌市纳品箱包有限公司
                 * reg_capital_currency : 人民币
                 * reg_status_std : 存续
                 * to_time : 9999-09-09 00:00:00
                 * reg_capital_amount : 50000000
                 * cid : 3222933667
                 * base : zj
                 */

                private String company_type;
                private String legal_entity_id;
                private String reg_number;
                private String name_alias;
                private String actual_capital_currency;
                private String phones;
                private String reg_institute;
                private String from_time;
                private String estiblish_time;
                private String legal_entity_type;
                private String emails;
                private String score;
                private String update_time;
                private String credit_code;
                private String reg_location;
                private String approved_time;
                private String logo;
                private String id;
                private String lat;
                private String lng;
                private String create_time;
                private String category_code;
                private String area_code;
                private String reg_capital;
                private String company_org_type;
                private String actual_capital_amount;
                private String business_scope;
                private String crawled_time;
                private String deleted;
                private String social_security_staff_num;
                private String reg_status;
                private String org_number;
                private String name;
                private String reg_capital_currency;
                private String reg_status_std;
                private String to_time;
                private String reg_capital_amount;
                private String cid;
                private String base;

                public String getCompany_type() {
                    return company_type;
                }

                public void setCompany_type(String company_type) {
                    this.company_type = company_type;
                }

                public String getLegal_entity_id() {
                    return legal_entity_id;
                }

                public void setLegal_entity_id(String legal_entity_id) {
                    this.legal_entity_id = legal_entity_id;
                }

                public String getReg_number() {
                    return reg_number;
                }

                public void setReg_number(String reg_number) {
                    this.reg_number = reg_number;
                }

                public String getName_alias() {
                    return name_alias;
                }

                public void setName_alias(String name_alias) {
                    this.name_alias = name_alias;
                }

                public String getActual_capital_currency() {
                    return actual_capital_currency;
                }

                public void setActual_capital_currency(String actual_capital_currency) {
                    this.actual_capital_currency = actual_capital_currency;
                }

                public String getPhones() {
                    return phones;
                }

                public void setPhones(String phones) {
                    this.phones = phones;
                }

                public String getReg_institute() {
                    return reg_institute;
                }

                public void setReg_institute(String reg_institute) {
                    this.reg_institute = reg_institute;
                }

                public String getFrom_time() {
                    return from_time;
                }

                public void setFrom_time(String from_time) {
                    this.from_time = from_time;
                }

                public String getEstiblish_time() {
                    return estiblish_time;
                }

                public void setEstiblish_time(String estiblish_time) {
                    this.estiblish_time = estiblish_time;
                }

                public String getLegal_entity_type() {
                    return legal_entity_type;
                }

                public void setLegal_entity_type(String legal_entity_type) {
                    this.legal_entity_type = legal_entity_type;
                }

                public String getEmails() {
                    return emails;
                }

                public void setEmails(String emails) {
                    this.emails = emails;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getCredit_code() {
                    return credit_code;
                }

                public void setCredit_code(String credit_code) {
                    this.credit_code = credit_code;
                }

                public String getReg_location() {
                    return reg_location;
                }

                public void setReg_location(String reg_location) {
                    this.reg_location = reg_location;
                }

                public String getApproved_time() {
                    return approved_time;
                }

                public void setApproved_time(String approved_time) {
                    this.approved_time = approved_time;
                }

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLng() {
                    return lng;
                }

                public void setLng(String lng) {
                    this.lng = lng;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public String getCategory_code() {
                    return category_code;
                }

                public void setCategory_code(String category_code) {
                    this.category_code = category_code;
                }

                public String getArea_code() {
                    return area_code;
                }

                public void setArea_code(String area_code) {
                    this.area_code = area_code;
                }

                public String getReg_capital() {
                    return reg_capital;
                }

                public void setReg_capital(String reg_capital) {
                    this.reg_capital = reg_capital;
                }

                public String getCompany_org_type() {
                    return company_org_type;
                }

                public void setCompany_org_type(String company_org_type) {
                    this.company_org_type = company_org_type;
                }

                public String getActual_capital_amount() {
                    return actual_capital_amount;
                }

                public void setActual_capital_amount(String actual_capital_amount) {
                    this.actual_capital_amount = actual_capital_amount;
                }

                public String getBusiness_scope() {
                    return business_scope;
                }

                public void setBusiness_scope(String business_scope) {
                    this.business_scope = business_scope;
                }

                public String getCrawled_time() {
                    return crawled_time;
                }

                public void setCrawled_time(String crawled_time) {
                    this.crawled_time = crawled_time;
                }

                public String getDeleted() {
                    return deleted;
                }

                public void setDeleted(String deleted) {
                    this.deleted = deleted;
                }

                public String getSocial_security_staff_num() {
                    return social_security_staff_num;
                }

                public void setSocial_security_staff_num(String social_security_staff_num) {
                    this.social_security_staff_num = social_security_staff_num;
                }

                public String getReg_status() {
                    return reg_status;
                }

                public void setReg_status(String reg_status) {
                    this.reg_status = reg_status;
                }

                public String getOrg_number() {
                    return org_number;
                }

                public void setOrg_number(String org_number) {
                    this.org_number = org_number;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getReg_capital_currency() {
                    return reg_capital_currency;
                }

                public void setReg_capital_currency(String reg_capital_currency) {
                    this.reg_capital_currency = reg_capital_currency;
                }

                public String getReg_status_std() {
                    return reg_status_std;
                }

                public void setReg_status_std(String reg_status_std) {
                    this.reg_status_std = reg_status_std;
                }

                public String getTo_time() {
                    return to_time;
                }

                public void setTo_time(String to_time) {
                    this.to_time = to_time;
                }

                public String getReg_capital_amount() {
                    return reg_capital_amount;
                }

                public void setReg_capital_amount(String reg_capital_amount) {
                    this.reg_capital_amount = reg_capital_amount;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getBase() {
                    return base;
                }

                public void setBase(String base) {
                    this.base = base;
                }
            }

            public static class OldDTO {
                /**
                 * crawled_time : 2020-09-05 11:52:51
                 * update_time : 2020-09-05 12:07:47.341580
                 */

                private String crawled_time;
                private String update_time;

                public String getCrawled_time() {
                    return crawled_time;
                }

                public void setCrawled_time(String crawled_time) {
                    this.crawled_time = crawled_time;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }
            }
        }
    }
}
