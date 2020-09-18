package com.tyc.update.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Author: yuanshiyang
 * @CompanyName: 中汽智投
 * @Description: mysql数据库连接
 * @Date: 2020/9/17 16:04
 */
public class MysqlConnUtils {

    public static Connection get22TycConnection(String ip, String databaseName) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + ip + ":3306/" + databaseName + "?rewriteBatchedStatements=true&serverTimezone=GMT%2B8&useSSL=false", "hadoop", "Hadoop@1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


}
