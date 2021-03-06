package com.wonly.kotlinsample.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: HSL
 * @Time: 2019/8/29 16:21
 * @E-mail: xxx@163.com
 * @Description: fastJson工具类
 */
public class JsonUtils {

    public static String toStr(Object object) {
        if (object == null) {
            return "";
        }
        return JSON.toJSONString(object);
    }

    public static String toStr(String key, Object object) {
        JSONObject j = new JSONObject();
        j.put(key, object);
        return j.toJSONString();
    }

    public static <T> T parse(String json, Class<T> clazz) {
        try {
            return JSON.parseObject(json, clazz);
        } catch (JSONException e) {
            return newNull(clazz);
        }
    }

    public static <T> T parseT(String json, Class<T> clazz) {
        try {
            return JSON.parseObject(json, clazz);
        } catch (JSONException e) {
            return newNull(clazz);
        }
    }

    public static <T> List<T> parseArray(String json, Class<T> clazz) {
        try {
            return JSON.parseArray(json.trim(), clazz);
        } catch (JSONException e) {
            return new ArrayList<T>(0);
        }
    }

    /**
     * json字符串转map集合
     *
     * @param json
     * @return
     */
    public static HashMap parseMap(String json) {
        return JSON.parseObject(json, new HashMap().getClass());
    }


    public static <T> T newNull(Class<T> clazz) {
        try {
            T t = clazz.newInstance();
            return t;
        } catch (InstantiationException e) {
            // json parase error
        } catch (IllegalAccessException e) {
            // json parase error
        }
        return null;
    }
}
