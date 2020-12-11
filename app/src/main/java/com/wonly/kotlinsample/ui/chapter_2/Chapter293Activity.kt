package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 16:41
 * @E-mail: xxx@163.com
 * @Description: 2.9.3 Kotlin字符串的方法
 */
class Chapter293Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter293)
    }

    /**
     * 学习Kotlin String的方法
     * 更多方法请百度
     */
    fun test() {
        // 字符串转为Double
        val s1 = "2.14"
        val d: Double = s1.toDouble();
        println(d)

        // 转为Int
        val s2 = "45"
        val d2: Int = s2.toInt()
        println(d2)

        val s3 = "houshengli"
        println(s3.capitalize()) // 首字母大写
        println(s3.decapitalize()) // 首字母小写

        // contains支持正则
        var s4 = "java886"
        println(s4.contains(Regex("\\d{3}")))
    }
}