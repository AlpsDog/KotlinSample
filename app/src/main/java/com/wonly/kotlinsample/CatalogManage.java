package com.wonly.kotlinsample;

import com.wonly.kotlinsample.ui.chapter_2.Chapter224Activity;

import java.util.HashMap;

/**
 * @Project: KotlinSample
 * @Package: com.wonly.kotlinsample
 * @Author: HSL
 * @Time: 2020/12/10 14:45
 * @E-mail: xxx@163.com
 * @Description: 这个人太懒，没留下什么踪迹~
 */
public class CatalogManage {

    private static HashMap<String, Class<?>> catalogMap = new HashMap<>();

    static {
        catalogMap.put("2.2.4", Chapter224Activity.class);
    }

    public static Class<?> getChapterCls(String catalogNum) {
        return catalogMap.get(catalogNum);
    }

}
