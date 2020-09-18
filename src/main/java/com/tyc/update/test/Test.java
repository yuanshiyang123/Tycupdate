package com.tyc.update.test;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.tyc.update.utils.AccessSecretUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: yuanshiyang
 * @CompanyName: 中汽智投
 * @Description:
 * @Date: 2020/9/16 10:29
 */
public class Test {


    static String accessSecret = "bmiqPsB0V4QPNpcW";
    static String _accessKey = "ZsB1Z8Rvxc2NvB5g";
    //    static String table = "company_staff";
    static Boolean enableScroll = true;
    //     scrollID生存的时间
    static Integer scrollTimeout = 3600;
    static int ps = 1500;
    static int pn = 1;
//    static int total = 0;
//    static int reqCounter = 0;

    //    生成时间

    //    封装URL
    public static String URLMethod(String startTime, String endTime, String tableName) {

        long firstTimestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();

//       时间
        String urlHead = "https://data.tianyancha.com/dblog.json?";
        //生成签名
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("table", tableName);
        hashMap.put("startTime", startTime);
        hashMap.put("endTime", endTime);
        hashMap.put("enableScroll", enableScroll);
        hashMap.put("scrollTimeout", scrollTimeout);
        hashMap.put("ps", ps);

        StrUtil.isNotBlank(urlHead);
        String sign = AccessSecretUtils.sign(accessSecret, firstTimestamp, hashMap);

        urlHead += "_accessKey=" + _accessKey
                + "&_sign=" + sign
                + "&_timestamp=" + firstTimestamp
                + "&table=" + tableName
                + "&startTime=" + startTime
                + "&endTime=" + endTime
                + "&enableScroll=" + enableScroll
                + "&ps=" + ps
                + "&scrollTimeout=" + scrollTimeout;

        return urlHead;
    }


    //    封装请求
    public static String doGet(String httpurl) {
        return HttpUtil.get(httpurl);
    }

    //时间范围内总的数据量


    //    循环存入数据库
    public static String secondUrl(String startTime, String endTime, String scrollid, String tableName) throws Exception {


        long secondTimestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        String uu = "https://data.tianyancha.com/dblog.json?";

        //生成签名
        HashMap<Object, Object> map = new HashMap<>(16);
        map.put("table", tableName);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        map.put("scrollId", scrollid);
        map.put("enableScroll", enableScroll);
        map.put("scrollTimeout", scrollTimeout);
        map.put("ps", ps);
        map.put("pn", pn);


        String _sign = AccessSecretUtils.sign(accessSecret, secondTimestamp, map);

        uu += "_accessKey=" + _accessKey
                + "&_sign=" + _sign
                + "&_timestamp=" + secondTimestamp
                + "&table=" + tableName
                + "&startTime=" + startTime
                + "&endTime=" + endTime
                + "&scrollId=" + scrollid
                + "&enableScroll=" + enableScroll
                + "&scrollTimeout=" + scrollTimeout
                + "&ps=" + ps
                + "&pn=" + pn;
        return uu;
    }

    public static void main(String[] args) {

        ArrayList<Object> listTime = new ArrayList<>();
        LocalDate onePre = LocalDate.now().plusDays(-1);
        LocalDate now = LocalDate.now();
        // 每隔十分钟做一次请求
        int day = 24;
        int min = 60;
        for (int i1 = 0; i1 < day; i1++) {
            for (int i2 = 0; i2 <= min; i2 += 10) {
                if (i2 != 60) {
                    LocalDateTime localDateTime = onePre.atTime(i1, i2, 0, 0);
                    long l = localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
                    listTime.add(l);
                } else {
                    if (i1 == 23) {
                        LocalDateTime localDateTimeNow = now.atTime(0, 0, 0, 0);
                        long l = localDateTimeNow.toInstant(ZoneOffset.of("+8")).toEpochMilli();
                        listTime.add(l);
                    }
                }
            }
        }

        ArrayList<Object> tableList = new ArrayList<>();
        tableList.add("human_name");
        tableList.add("company_staff");
        tableList.add("company_holder");
        tableList.add("company");
        for (Object tableName : tableList) {
            FileWriter fwriter = null;
            System.out.println("tableName = " + tableName.toString());
            for (int i = 1; i < listTime.size(); i++) {
                if (i == 1) {
                    String alltimeStart = listTime.get(i - 1).toString();
                    String alltimeEnd = listTime.get(listTime.size() - 1).toString();
                    String allUrl = URLMethod("1600099830000", "1600099840000", tableName.toString());
                    String sumResponse = doGet(allUrl);
                    System.out.println("sumResponse = " + sumResponse);

                    String filePath = "E:\\test.txt";
                    try {
                        // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
                        fwriter = new FileWriter(filePath);
                        fwriter.write(sumResponse);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } finally {
                        try {
                            fwriter.flush();
                            fwriter.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }

        }

    }
}
