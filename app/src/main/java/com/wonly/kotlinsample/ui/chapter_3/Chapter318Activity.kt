package com.wonly.kotlinsample.ui.chapter_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/14 15:11
 * @E-mail: xxx@163.com
 * @Description: 3.1.8 相等与不相等运算符
 */
class Chapter318Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter318)
        test()
    }

    /**
     * Kotlin的"=="不再比较两个变量是否引用同一个对象，与equals()基本等义
     * Java提供的"=="与"!="在kotlin中则由"==="与"!=="代替
     */
    fun test() {
        var s1 = java.lang.String("kkk")
        var s2 = java.lang.String("kkk")
        println(s1 == s2) // 输出true
        println(s1.equals(s2))// 输入true
        // 与Java"=="一致，判断是否引用同一个对象
        println(s1 === s2)// 输出false
    }
}