package com.getick.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 工具
 *
 * @author ikuacc
 * Created on 2017/10/17.
 */
public final class Util {

    /**
     * 根据城市获取天气信息
     *
     * @param city 城市
     * @return 天气信息
     */
    public static String getWeather(String city) {
        String url = String.format("https://www.sojson.com/open/api/weather/json.shtml?city=%s", city);
        return callExternalInterface(url);
    }

    /**
     * 根据IP地址获取真实地址
     *
     * @param ip IP地址
     * @return 真实地址
     */
    public static String getAddressForIp(String ip) {
        String url = String.format("http://freeapi.ipip.net/%s", ip);
        return callExternalInterface(url);
    }

    /**
     * 获取WorldState
     *
     * @return WorldState
     */
    public static String getWorldState() {
        String url = "http://freeapi.ipip.net/%s";
        return callExternalInterface(url);
    }

    /**
     * 调用外部接口,获取结果数据
     *
     * @param urlStr 接口地址
     * @return String 结果数据
     */
    private static String callExternalInterface(String urlStr) {
        try {
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.146 Safari/537.36");
            con.connect();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            con.getInputStream(), "utf-8"));
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            //关闭流
            reader.close();
            //关闭连接
            con.disconnect();
            return builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
