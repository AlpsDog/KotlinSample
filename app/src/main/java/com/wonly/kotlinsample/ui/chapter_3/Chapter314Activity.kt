package com.wonly.kotlinsample.ui.chapter_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/14 10:55
 * @E-mail: xxx@163.com
 * @Description: 3.1.4 in和!in
 */
class Chapter314Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter314)
        test()
    }

    /**
     * 运算符            对应方法
     * a in b            b.contains(a)
     * a !in b           !b.minus(a)
     */
    fun test() {
        var str: String = "java.com";
        // 用String的contains方法判断
        println(str.contains("java")) // true
        // str 是否包含 java
        println("java" in str) // true
        println("java" !in str)// false
    }
}