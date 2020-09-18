package com.tyc.update.mapper.service;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.tyc.update.dao.ZhuanLiDaoImpl;
import com.tyc.update.pojo.GetCompany;
import com.tyc.update.pojo.GetCompanyHolder;
import com.tyc.update.pojo.GetCompanyStaff;
import com.tyc.update.pojo.GetHumanName;
import com.tyc.update.utils.AccessSecretUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

@Component
public class TianJieMain {
    //     全局参数
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
    public static String URLMethod(String startTime, String endTime,String tableName) {

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
    public static int sumTotal(String response) {
        //将response 转化为 json
        JSONObject json = JSONObject.parseObject(response);
        //判断请求参数是否有问题
        String state = json.getString("state");
        if (!"ok".equals(state)) {
            System.out.println(state);
            System.out.println(json.getString("message"));
            return 0;
        }
        int total = json.getJSONObject("data").getInteger("total");
        System.out.println("总的数据量 = " + total);
        return total;
    }

    //当前请求次数
    public static int countReqCounter(String response){
        //将response 转化为 json
        JSONObject json = JSONObject.parseObject(response);
        Integer integer = json.getJSONObject("data").getInteger("reqCounter");
        return integer;
    }

    //    封装数据处理
    public static List<Object> parseJson(String response, String endTime,String tableName){

        long l = Long.parseLong(endTime);
        String processTime = new Date(l).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime().toString();

        //将response 转化为 json
        JSONObject json = JSONObject.parseObject(response);
        //判断请求参数是否有问题
        String state = json.getString("state");
        if (!"ok".equals(state)) {
            System.out.println(state);
            System.out.println(json.getString("message"));
            return new ArrayList();
        }

        //第一层中的data 的 items 变为数组
        JSONArray ja_companys = json.getJSONObject("data").getJSONArray("items");

        String scrollId = json.getJSONObject("data").getString("scrollId");
        int total = json.getJSONObject("data").getInteger("total");
        if (total == 0) {
            System.out.println("这个时间段没有数据！！！");
            return new ArrayList();
        }


        //存放最终对象数据
        List list = new ArrayList();

        switch (tableName) {
            case "company":
                for (int i = 0; i < ja_companys.size(); i++) {

                    //获取到data 让他变为对象
                    String data = ja_companys.getJSONObject(i).getString("data");

                    //获取data中的字段
                    GetCompany getCompany = new Gson().fromJson(data, GetCompany.class);

                    //将type updateFields batch 放入对象中
                    getCompany.setOperation_type(ja_companys.getJSONObject(i).getString("type"));
                    getCompany.setUpdateFields(ja_companys.getJSONObject(i).getString("updateFields"));
                    getCompany.setBatch(processTime);

                    list.add(getCompany);
                }
                break;
            case "company_holder":
                for (int i = 0; i < ja_companys.size(); i++) {

                    //获取到data 让他变为对象
                    String data = ja_companys.getJSONObject(i).getString("data");

                    //获取data中的字段
                    GetCompanyHolder getCompanyHolder = new Gson().fromJson(data, GetCompanyHolder.class);

                    //将type updateFields batch 放入对象中
                    getCompanyHolder.setOperation_type(ja_companys.getJSONObject(i).getString("type"));
                    getCompanyHolder.setUpdateFields(ja_companys.getJSONObject(i).getString("updateFields"));
                    getCompanyHolder.setBatch(processTime);

                    list.add(getCompanyHolder);
                }
                break;
            case "company_staff":
                for (int i = 0; i < ja_companys.size(); i++) {

                    //获取到data 让他变为对象
                    String data = ja_companys.getJSONObject(i).getString("data");

                    //获取data中的字段
                    GetCompanyStaff getCompanyStaff = new Gson().fromJson(data, GetCompanyStaff.class);

                    //将type updateFields batch 放入对象中
                    getCompanyStaff.setOperation_type(ja_companys.getJSONObject(i).getString("type"));
                    getCompanyStaff.setUpdateFields(ja_companys.getJSONObject(i).getString("updateFields"));
                    getCompanyStaff.setBatch(processTime);

                    list.add(getCompanyStaff);
                }
                break;
            case "human_name":
                for (int i = 0; i < ja_companys.size(); i++) {

                    //获取到data 让他变为对象
                    String data = ja_companys.getJSONObject(i).getString("data");

                    //获取data中的字段
                    GetHumanName getHumanName = new Gson().fromJson(data, GetHumanName.class);

                    //将type updateFields batch 放入对象中
                    getHumanName.setOperation_type(ja_companys.getJSONObject(i).getString("type"));
                    getHumanName.setUpdateFields(ja_companys.getJSONObject(i).getString("updateFields"));
                    getHumanName.setBatch(processTime);

                    list.add(getHumanName);
                }
                break;
            default:
                System.err.println("输入有误");
                return null;
        }
        list.add(scrollId);
        return list;
    }

    //    存入数据库
    public static void storeDatabase(List list,String tableName) throws Exception {

        String DBUser = null;
        String DBHost = null;
        String DBPwd = null;
        String DBName = null;
        Integer Port = null;
        //加载配置文件读取数据库配置
        Properties pro = new Properties();
        InputStream is = ZhuanLiDaoImpl.class.getClassLoader().getResourceAsStream("database.properties");
        Connection con = null;
        pro.load(is);
        DBUser = pro.getProperty("DBUser");
        DBHost = pro.getProperty("DBHost");
        DBPwd = pro.getProperty("DBPwd");
        DBName = pro.getProperty("DBName");
        Port = Integer.parseInt(pro.getProperty("Port"));
        //建立数据库链接
        Class.forName("com.mysql.cj.jdbc.Driver");
        //数据库链接参数
        con = DriverManager.getConnection("jdbc:mysql://" + DBHost + ":" + Port + "/" + DBName + "?rewriteBatchedStatements=true&serverTimezone=GMT%2B8&useSSL=false", DBUser, DBPwd);

        //将数据写入数据库
        ZhuanLiDaoImpl zhuanLiDao = new ZhuanLiDaoImpl();

        list.remove(list.size() - 1);

        switch (tableName) {
            case "company":
                zhuanLiDao.addCompany(list, con);
                break;
            case "company_holder":
                zhuanLiDao.addCompanyHolder(list, con);
                break;
            case "company_staff":
                zhuanLiDao.addCompanyStaff(list, con);
                break;
            case "human_name":
                zhuanLiDao.addHumanName(list, con);
                break;
            default:
                System.err.println("输入有误");
                break;
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

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



    @Scheduled(cron = "0 0 3 * * ?")
    public void updata() throws Exception {
        String startTime;
        String endTime;
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
        //四个表循环遍历更新
        for (Object tableName : tableList) {
            System.out.println("tableName = " + tableName.toString());
            int sumTotal;
            int countReq;
            for (int i = 1; i < listTime.size(); i++) {
                if (i == 1) {
                    String alltimeStart = listTime.get(i - 1).toString();
                    String alltimeEnd = listTime.get(listTime.size() - 1).toString();
                    String allUrl = URLMethod(alltimeStart, alltimeEnd, tableName.toString());
                    String sumResponse = doGet(allUrl);
                    sumTotal(sumResponse);
                }
                startTime = listTime.get(i - 1).toString();
                endTime = listTime.get(i).toString();
                //第一次url
                String URL = URLMethod(startTime, endTime, tableName.toString());
                //response
                String s = doGet(URL);
                //封装数据
                List list = parseJson(s, endTime, tableName.toString());
                String scrollid = null;
                assert list != null;
                if (list.size() != 0) {
                    scrollid = list.get(list.size() - 1).toString();
                }
                if (list.size() != 0) {
                    //得出当前有数据的时间范围内的数据总数和请求计数器次数
                    sumTotal = sumTotal(s);
                    countReq = countReqCounter(s);
                    //存入数据库human_name表
                    storeDatabase(list, tableName.toString());
                    // 求出应该循环多少次
                    int flag = (int) Math.ceil(sumTotal / ps);
                    // 请求次数<=应该循环次数时循环
                    while (countReq <= flag) {


                        String secondUrl = secondUrl(startTime, endTime, scrollid, tableName.toString());
                        String response = doGet(secondUrl);
                        List listC = parseJson(response, endTime, tableName.toString());
                        assert listC != null;
                        storeDatabase(listC, tableName.toString());
                        countReq = countReqCounter(response);
                    }

                }
            }

        }
    }

}
