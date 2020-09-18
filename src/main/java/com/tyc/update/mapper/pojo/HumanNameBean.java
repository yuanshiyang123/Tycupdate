package com.tyc.update.mapper.pojo;

import java.util.List;

public class HumanNameBean {

    /**
     * data : {"items":[{"cids":"","createTime":1600099262000,"data":{"create_time":"2020-09-14 23:57:02","deleted":"0","hid":"3474727542","id":"34037315","name":"恽代娣","type":"101","update_time":"2020-09-14 23:57:02"},"id":28,"table":"human_name","type":"INSERT","updateFields":"[]"}],"pageNum":1,"realTotal":28,"reqCounter":1,"scrollId":"f372157a-15e6-4383-ba6b-1bce2f6f9e85","total":28}
     * isLogin : 0
     * special :
     * state : ok
     * vipMessage :
     */

    private DataDTO data;
    private Integer isLogin;
    private String special;
    private String state;
    private String vipMessage;

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public Integer getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVipMessage() {
        return vipMessage;
    }

    public void setVipMessage(String vipMessage) {
        this.vipMessage = vipMessage;
    }

    public static class DataDTO {
        /**
         * items : [{"cids":"","createTime":1600099262000,"data":{"create_time":"2020-09-14 23:57:02","deleted":"0","hid":"3474727542","id":"34037315","name":"恽代娣","type":"101","update_time":"2020-09-14 23:57:02"},"id":28,"table":"human_name","type":"INSERT","updateFields":"[]"}]
         * pageNum : 1
         * realTotal : 28
         * reqCounter : 1
         * scrollId : f372157a-15e6-4383-ba6b-1bce2f6f9e85
         * total : 28
         */

        private Integer pageNum;
        private Integer realTotal;
        private Integer reqCounter;
        private String scrollId;
        private Integer total;
        private List<ItemsDTO> items;

        public Integer getPageNum() {
            return pageNum;
        }

        public void setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
        }

        public Integer getRealTotal() {
            return realTotal;
        }

        public void setRealTotal(Integer realTotal) {
            this.realTotal = realTotal;
        }

        public Integer getReqCounter() {
            return reqCounter;
        }

        public void setReqCounter(Integer reqCounter) {
            this.reqCounter = reqCounter;
        }

        public String getScrollId() {
            return scrollId;
        }

        public void setScrollId(String scrollId) {
            this.scrollId = scrollId;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<ItemsDTO> getItems() {
            return items;
        }

        public void setItems(List<ItemsDTO> items) {
            this.items = items;
        }

        public static class ItemsDTO {
            /**
             * cids :
             * createTime : 1600099262000
             * data : {"create_time":"2020-09-14 23:57:02","deleted":"0","hid":"3474727542","id":"34037315","name":"恽代娣","type":"101","update_time":"2020-09-14 23:57:02"}
             * id : 28
             * table : human_name
             * type : INSERT
             * updateFields : []
             */

            private String cids;
            private Long createTime;
            private DataDTOItem data;
            private Integer id;
            private String table;
            private String type;
            private String updateFields;

            public String getCids() {
                return cids;
            }

            public void setCids(String cids) {
                this.cids = cids;
            }

            public Long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Long createTime) {
                this.createTime = createTime;
            }

            public DataDTOItem getData() {
                return data;
            }

            public void setData(DataDTOItem data) {
                this.data = data;
            }

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

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUpdateFields() {
                return updateFields;
            }

            public void setUpdateFields(String updateFields) {
                this.updateFields = updateFields;
            }

            public static class DataDTOItem {
                /**
                 * create_time : 2020-09-14 23:57:02
                 * deleted : 0
                 * hid : 3474727542
                 * id : 34037315
                 * name : 恽代娣
                 * type : 101
                 * update_time : 2020-09-14 23:57:02
                 */

                private String create_time;
                private String deleted;
                private String hid;
                private String id;
                private String name;
                private String type;
                private String update_time;

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public String getDeleted() {
                    return deleted;
                }

                public void setDeleted(String deleted) {
                    this.deleted = deleted;
                }

                public String getHid() {
                    return hid;
                }

                public void setHid(String hid) {
                    this.hid = hid;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
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
