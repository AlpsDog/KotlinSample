package com.wonly.kotlinsample;

import android.app.Application;

/**
 * @Project: KotlinSample
 * @Package: com.wonly.kotlinsample
 * @Author: HSL
 * @Time: 2020/12/09 14:33
 * @E-mail: xxx@163.com
 * @Description: 这个人太懒，没留下什么踪迹~
 */
public class AppApplication extends Application {

    private static AppApplication instance;

    /**
     * 获取全局上下文
     *
     * @return
     */
    public static AppApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
