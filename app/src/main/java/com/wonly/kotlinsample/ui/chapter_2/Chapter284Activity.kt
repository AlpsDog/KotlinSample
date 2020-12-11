package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 14:26
 * @E-mail: xxx@163.com
 * @Description: 2.8.4 Elvis运算
 */
class Chapter284Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter284)
        test()
    }

    /**
     * Elvis运算其实就是 if else的简化写法
     * 运算符： "?:"
     * 含义： 左边表达式不为null,则返回左边表达式的值，否则返回右边表达式的值
     */
    fun test() {
        var s: String? = "houshengli"

        // 普通写法
        var len = if (s != null) s.length else -1
        println(len)

        // Elvis运算符
        var len2 = s?.length ?: -1;
        println(len2)

    }
}