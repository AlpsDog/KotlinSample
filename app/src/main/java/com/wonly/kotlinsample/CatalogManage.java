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
import com.wonly.kotlinsample.ui.chapter_2.Chapter291Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter292Activity;
import com.wonly.kotlinsample.ui.chapter_2.Chapter293Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter311Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter312Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter313Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter314Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter315Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter316Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter317Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter318Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter319Activity;
import com.wonly.kotlinsample.ui.chapter_3.Chapter33XActivity;
import com.wonly.kotlinsample.ui.chapter_4.Chapter422Activity;
import com.wonly.kotlinsample.ui.chapter_4.Chapter423Activity;
import com.wonly.kotlinsample.ui.chapter_4.Chapter424Activity;

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
        catalogMap.put("2.9.1", Chapter291Activity.class);
        catalogMap.put("2.9.2", Chapter292Activity.class);
        catalogMap.put("2.9.3", Chapter293Activity.class);
        catalogMap.put("3.1.1", Chapter311Activity.class);
        catalogMap.put("3.1.2", Chapter312Activity.class);
        catalogMap.put("3.1.3", Chapter313Activity.class);
        catalogMap.put("3.1.4", Chapter314Activity.class);
        catalogMap.put("3.1.5", Chapter315Activity.class);
        catalogMap.put("3.1.6", Chapter316Activity.class);
        catalogMap.put("3.1.7", Chapter317Activity.class);
        catalogMap.put("3.1.8", Chapter318Activity.class);
        catalogMap.put("3.1.9", Chapter319Activity.class);
        catalogMap.put("3.3", Chapter33XActivity.class);
        catalogMap.put("4.2.2", Chapter422Activity.class);
        catalogMap.put("4.2.3", Chapter423Activity.class);
        catalogMap.put("4.2.4", Chapter424Activity.class);
    }

    public static Class<?> getChapterCls(String catalogNum) {
        return catalogMap.get(catalogNum);
    }

}
