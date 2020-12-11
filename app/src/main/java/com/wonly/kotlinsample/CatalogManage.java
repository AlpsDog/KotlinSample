package com.wonly.kotlinsample;

import com.wonly.kotlinsample.ui.chapter_2.Chapter224Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter23Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter24Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter25Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter261Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter262Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter263Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter27Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter281Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter282Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter283Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter284Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter285Activity;

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
        catalogMap.put("2.3", Chapter23Activity.class);
        catalogMap.put("2.4", Chapter24Activity.class);
        catalogMap.put("2.5", Chapter25Activity.class);
        catalogMap.put("2.6.1", Chapter261Activity.class);
        catalogMap.put("2.6.2", Chapter262Activity.class);
        catalogMap.put("2.6.3", Chapter263Activity.class);
        catalogMap.put("2.7", Chapter27Activity.class);
        catalogMap.put("2.8.1", Chapter281Activity.class);
        catalogMap.put("2.8.2", Chapter282Activity.class);
        catalogMap.put("2.8.3", Chapter283Activity.class);
        catalogMap.put("2.8.4", Chapter284Activity.class);
        catalogMap.put("2.8.5", Chapter285Activity.class);
    }

    public static Class<?> getChapterCls(String catalogNum) {
        return catalogMap.get(catalogNum);
    }

}
