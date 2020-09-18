package com.tyc.update.mapper.service;

import com.tyc.update.utils.MysqlConnUtils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yuanshiyang
 * @CompanyName: 中汽智投
 * @Description:
 * @Date: 2020/9/17 16:13
 */
public class IncreDataUpdate {

    /**
     * 判断数据库是否支持批处理
     */

    public static boolean supportBatch(Connection con) {
        try {
            // 得到数据库的元数据
            DatabaseMetaData md = con.getMetaData();
            return md.supportsBatchUpdates();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 执行一批SQL语句
     */

    public static int[] goBatch(Connection con, String[] sqls) throws Exception {
        if (sqls == null) {
            return null;
        }
        Statement sm = null;
        try {
            sm = con.createStatement();
            for (String sql : sqls) {
                // 将所有的SQL语句添加到Statement中
                sm.addBatch(sql);
            }
            // 一次执行多条SQL语句
            return sm.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sm.close();
        }
        return null;
    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        System.out.println("没有执行批处理时的数据为：");
        String[] sqls = new String[2];
        sqls[0] = "update company_test a set a.name=replace(replace(a.name,'（','('),'）',')')";
        sqls[1] = "update company_test set company_yuan_copy1.emails = replace(company_yuan_copy1.emails, '\t', '')";

        try (Connection con = MysqlConnUtils.get22TycConnection("172.20.2.22", "ysy")) {
            // 获得数据库连接
            // 判断是否支持批处理
            boolean supportBatch = supportBatch(con);
            System.out.println("支持批处理？ " + supportBatch);
            if (supportBatch) {
                // 执行一批SQL语句
                int[] results = goBatch(con, sqls);
                // 分析执行的结果
                for (int i = 0; i < sqls.length; i++) {
                    if (results[i] >= 0) {
                        System.out.println("语句: " + sqls[i] + " 执行成功，影响了"
                                + results[i] + "行数据");
                    } else if (results[i] == Statement.SUCCESS_NO_INFO) {
                        System.out.println("语句: " + sqls[i] + " 执行成功，影响的行数未知");
                    } else if (results[i] == Statement.EXECUTE_FAILED) {
                        System.out.println("语句: " + sqls[i] + " 执行失败");
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        // 关闭数据库连接
        System.out.println("执行批处理后的数据为：");
    }

    public void incrementUpdate() {
        List<String> lists = new ArrayList<>();
        lists.add("ipi_company_update");
        lists.add("ipi_company_part1_update");
        lists.add("ipi_company_part2_update");
        lists.add("ipi_company_part3_update");
        lists.add("ipi_company_part4_update");
        lists.add("ipi_company_part5_update");
        lists.add("ipi_company_part6_update");
        lists.add("ipi_company_part7_update");
        lists.add("ipi_company_part8_update");

        //企业增量数据所在表明
        String increTable = "company_tyc";

        for (String tableName : lists) {
            String[] sqls = new String[28];
            //更新成立日期字段
            sqls[0] = "update " + tableName + " a\n" +
                    "set a.startdate=(select b.estiblish_time\n" +
                    "                 from " + increTable + " b\n" +
                    "                 where b.name = a.name\n" +
                    "                   and b.estiblish_time is not null\n" +
                    "                 group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";


            //更新统一社会信用代码
            sqls[1] = "update " + tableName + " a\n" +
                    "set a.creditcode=(select b.credit_code\n" +
                    "                  from " + increTable + " b\n" +
                    "                  where b.name = a.name\n" +
                    "                    and b.credit_code is not null\n" +
                    "                  group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新企业状态
            sqls[2] = "update " + tableName + " a\n" +
                    "set a.status = (select b.reg_status_std\n" +
                    "                from " + increTable + " b\n" +
                    "                where b.name = a.name\n" +
                    "                  and b.reg_status_std is not null\n" +
                    "                group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新注册号
            sqls[3] = "update " + tableName + " a\n" +
                    "set a.no = (select b.reg_number\n" +
                    "            from " + increTable + " b\n" +
                    "            where b.name = a.name\n" +
                    "              and b.reg_number is not null\n" +
                    "            group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新登记机关
            sqls[4] = "update " + tableName + " a\n" +
                    "set a.belongorg =(select b.reg_institute\n" +
                    "                  from " + increTable + " b\n" +
                    "                  where b.name = a.name\n" +
                    "                    and b.reg_institute is not null\n" +
                    "                  group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新吊销日期
            sqls[5] = "update " + tableName + " a\n" +
                    "set a.enddate =(select b.cancel_date\n" +
                    "                from " + increTable + " b\n" +
                    "                where b.name = a.name\n" +
                    "                  and b.cancel_date is not null\n" +
                    "                group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新省级代码字段
            sqls[6] = "update " + tableName + " a\n" +
                    "set a.province_code =(select concat(left(b.area_code, 2), 0000)\n" +
                    "                      from " + increTable + " b\n" +
                    "                      where b.name = a.name\n" +
                    "                        and b.area_code is not null\n" +
                    "                      group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新城市代码字段
            sqls[7] = "update " + tableName + " a\n" +
                    "set a.cicy_code=(select concat(left(b.area_code, 4), 00)\n" +
                    "                 from " + increTable + " b\n" +
                    "                 where b.name = a.name\n" +
                    "                   and b.area_code is not null\n" +
                    "                 group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新区县代码字段
            sqls[8] = "update " + tableName + " a\n" +
                    "set a.county_code=(select b.area_code\n" +
                    "                   from " + increTable + " b\n" +
                    "                   where b.name = a.name\n" +
                    "                     and b.area_code is not null\n" +
                    "                   group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新注册资本
            sqls[9] = "update " + tableName + " a\n" +
                    "set a.registcapi=(select b.reg_capital_amount\n" +
                    "                  from " + increTable + " b\n" +
                    "                  where b.name = a.name\n" +
                    "                    and b.reg_capital_amount is not null\n" +
                    "                  group by b.name) / 1000000\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新注册资本单位
            sqls[10] = "update " + tableName + " a\n" +
                    "set a.monetary_unit=(select concat('万', b.reg_capital_currency)\n" +
                    "                     from " + increTable + " b\n" +
                    "                     where b.name = a.name\n" +
                    "                       and b.reg_capital_currency is not null\n" +
                    "                     group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新公司类型
            sqls[11] = "update " + tableName + " a\n" +
                    "set a.econkind=(select b.company_org_type\n" +
                    "                from " + increTable + " b\n" +
                    "                where b.name = a.name\n" +
                    "                  and b.company_org_type is not null\n" +
                    "                group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新注册地址
            sqls[11] = "update " + tableName + " a\n" +
                    "set a.address=(select b.reg_location\n" +
                    "               from " + increTable + " b\n" +
                    "               where b.name = a.name\n" +
                    "                 and b.reg_location is not null\n" +
                    "               group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新营业开始日期
            sqls[12] = "update " + tableName + " a\n" +
                    "set a.termstart=(select b.from_time\n" +
                    "                 from " + increTable + " b\n" +
                    "                 where b.name = a.name\n" +
                    "                   and b.from_time is not null\n" +
                    "                 group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新营业结束日期
            sqls[13] = "update " + tableName + " a\n" +
                    "set a.teamend=(select b.to_time\n" +
                    "               from " + increTable + " b\n" +
                    "               where b.name = a.name\n" +
                    "                 and b.to_time is not null\n" +
                    "               group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新组织机构代码
            sqls[14] = "update " + tableName + " a\n" +
                    "set a.orgno=(select concat(left(b.org_number, 8), '-', right(b.org_number, 1))\n" +
                    "             from " + increTable + " b\n" +
                    "             where b.name = a.name\n" +
                    "               and b.org_number is not null\n" +
                    "               and length(trim(b.org_number)) > 0\n" +
                    "             group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新实缴资本
            sqls[15] = "update " + tableName + " a\n" +
                    "set a.registcapi_real=(select concat(b.actual_capital_amount / 1000000, '万', b.actual_capital_currency)\n" +
                    "                       from " + increTable + " b\n" +
                    "                       where b.name = a.name\n" +
                    "                         and b.actual_capital_amount is not null\n" +
                    "                         and b.actual_capital_currency is not null\n" +
                    "                         and length(trim(b.actual_capital_amount)) > 0\n" +
                    "                         and length(trim(b.actual_capital_currency)) > 0\n" +
                    "                       group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新经纬度(保留小数掉后6位)
            sqls[16] = "update " + tableName + " a\n" +
                    "set a.area_xy=(select concat(convert(b.lat, decimal(10, 6)), ',', convert(b.lng, decimal(10, 6)))\n" +
                    "               from " + increTable + " b\n" +
                    "               where b.name = a.name\n" +
                    "                 and b.lat is not null\n" +
                    "                 and b.lng is not null\n" +
                    "                 and length(trim(b.lat)) > 0\n" +
                    "                 and length(trim(b.lng)) > 0\n" +
                    "               group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新area_xy_short(保留小数点后2位)
            sqls[17] = "update " + tableName + " a\n" +
                    "set a.area_xy_short=(select concat(convert(b.lat, decimal(10, 2)), ',', convert(b.lng, decimal(10, 2)))\n" +
                    "                     from " + increTable + " b\n" +
                    "                     where b.name = a.name\n" +
                    "                       and b.lat is not null\n" +
                    "                       and b.lng is not null\n" +
                    "                       and length(trim(b.lat)) > 0\n" +
                    "                       and length(trim(b.lng)) > 0\n" +
                    "                     group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新参保人数
            sqls[18] = "update " + tableName + " a\n" +
                    "set a.insured_people =(select b.social_security_staff_num\n" +
                    "                       from " + increTable + " b\n" +
                    "                       where b.name = a.name\n" +
                    "                         and b.social_security_staff_num is not null\n" +
                    "                       group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新省份字段(从另一个表中查询)
            sqls[19] = "update " + tableName + " b\n" +
                    "set b.province=(select a.province\n" +
                    "                from area_code_true a\n" +
                    "                         left join " + increTable + " c\n" +
                    "                                   on c.area_code = a.area_code\n" +
                    "                                       and c.area_code is not null\n" +
                    "                limit 1)\n" +
                    "where exists(select 1 from " + increTable + " c where c.name = b.name)";

            //更新城市字段(另一个表查询)
            sqls[20] = "update " + tableName + " b\n" +
                    "set b.city=(select a.city\n" +
                    "            from area_code_true a\n" +
                    "                     left join " + increTable + " c\n" +
                    "                               on c.area_code = a.area_code\n" +
                    "                                   and c.area_code is not null\n" +
                    "            limit 1)\n" +
                    "where exists(select 1 from " + increTable + " c where c.name = b.name)";

            //更新区县字段(另一个表查询)
            sqls[21] = "update " + tableName + " b\n" +
                    "set b.county=(select a.district\n" +
                    "              from area_code_true a\n" +
                    "                       left join " + increTable + " c\n" +
                    "                                 on c.area_code = a.area_code\n" +
                    "                                     and c.area_code is not null\n" +
                    "              limit 1)\n" +
                    "where exists(select 1 from " + increTable + " c where c.name = b.name)";

            //更新电话
            sqls[22] = "update " + tableName + " a\n" +
                    "set a.tel=(select b.phones\n" +
                    "           from " + increTable + " b\n" +
                    "           where b.name = a.name\n" +
                    "             and b.phones is not null\n" +
                    "           group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新邮箱
            sqls[23] = "update " + tableName + " a\n" +
                    "set a.email=(select b.emails\n" +
                    "             from " + increTable + " b\n" +
                    "             where b.name = a.name\n" +
                    "               and b.emails is not null\n" +
                    "             group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //更新经营范围
            sqls[24] = "update " + tableName + " a\n" +
                    "set a.scope=(select b.business_scope\n" +
                    "             from " + increTable + " b\n" +
                    "             where b.name = a.name\n" +
                    "               and b.business_scope is not null\n" +
                    "             group by b.name)\n" +
                    "where exists(SELECT 1 FROM " + increTable + " b WHERE a.`name` = b.`name`)";

            //#更新法人名称(需要从其他表获得名称)---------------------------------------------
            //#legal_entity_type为1或3,legal_entity_id关联human_name的hid
            sqls[25] = "update " + tableName + " b\n" +
                    "set b.opername=(select a.name\n" +
                    "                from human_name a\n" +
                    "                         left join " + increTable + " c\n" +
                    "                                   on c.legal_entity_id = a.hid and\n" +
                    "                                      (c.legal_entity_type = 1 OR c.legal_entity_type = 3)\n" +
                    "                limit 1)\n" +
                    "where exists(select 1 from " + increTable + " c where c.`name` = b.`name`)";

            //company_tyc的legal_entity_type为2,legal_entity_id关联company_tyc的cid-------------------------
            sqls[24] = "update " + tableName + " b\n" +
                    "set b.opername=(select a.name\n" +
                    "                from " + increTable + " a\n" +
                    "                         left join " + increTable + " c\n" +
                    "                                   on c.legal_entity_id = a.cid\n" +
                    "                                       and c.legal_entity_type = 2\n" +
                    "                limit 1)\n" +
                    "where exists(select 1 from " + increTable + " c where c.`name` = b.`name`)";

        }


    }


}
