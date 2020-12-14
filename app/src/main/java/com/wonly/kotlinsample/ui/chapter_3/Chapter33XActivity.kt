package com.wonly.kotlinsample.ui.chapter_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/14 13:43
 * @E-mail: xxx@163.com
 * @Description: 3.3 区间运算符
 */
class Chapter33XActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter33x)
        test()
        test2()
        test3()
        test4()
    }

    /**
     * 闭区间运算符
     * 1.运算符: a..b
     * 2.定义了从a到b(包括a、b)的所有值
     * 3.a不能大于b
     * 4.a=b时，区间只有一个值
     */
    fun test() {
        // 定义2-6
        var range = 2..6
        for (num in range) {
            println("${num}*5 = ${num * 5}")
        }

        // a==b时
        var range2 = 3..3;
        for (num in range2) {
            println("num=${num}")// 输入3
        }

    }

    /**
     * 半开区间运算符
     * 1.运算符 a until b
     * 2.左闭右开
     * 3.a==b时，为空区间
     */
    fun test2() {
        // 定义[2,6)
        var range = 2 until 6
        for (num in range) {
            println("${num}*5 = ${num * 5}")
        }

        // a==b时,空区间
        var range2 = 3 until 3;
        for (num in range2) {
            println("num=${num}")
        }

    }

    /**
     * 反向区间
     * 1.运算符 a downTo b
     * 2.b不能大于a
     * 3.左闭右闭
     */
    fun test3() {
        var a: Int = 6
        var b: Int = 2
        var range = a downTo b
        for (i in range) {
            println("i=${i}") // 输出：6 5 4 3 2
        }
    }

    /**
     * 区间步长
     * 1.运算符 step
     */
    fun test4() {
        var range = 2..9 step 2
        for (num in range) {
            println("num=${num}") // 输出：2 4 6 8
        }
    }
}