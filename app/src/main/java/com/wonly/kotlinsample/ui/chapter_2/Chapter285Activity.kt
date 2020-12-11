package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 14:26
 * @E-mail: xxx@163.com
 * @Description: 2.8.5 强制调用
 */
class Chapter285Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter285)
        test()
    }

    /**
     * 强制调用
     * 不管变量是否为null,都可以直接调用该变量的属性或者方法
     * 使用 "!!."
     */
    fun test() {
        var s: String? = "houshengli";
//        println(s.length);// 报错，不能直接调用
        println(s!!.length);

//        s = null;
//        println(s!!.length);// 引发异常
    }
}