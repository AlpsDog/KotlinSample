package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/16 17:27
 * @E-mail: xxx@163.com
 * @Description: 6.1.4 单表达式函数
 */
class Chapter614Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter614)
        test()
    }

    fun test() {
        println(area(5.0, 6.0))
        println(area2(5.0, 6.0))
    }

    /**
     * 单表达式函数：
     * 函数只是返回单个表达式，可以省略花括号，在等号后面指定函数体即可
     */
    fun area(x: Double, y: Double): Double = x + y;

    /**
     * 单表达式函数，编译器可以推断返回值类型，
     * 因此Kotlin允许省略函声明数返回值类型
     */
    fun area2(x: Double, y: Double) = x + y;
}