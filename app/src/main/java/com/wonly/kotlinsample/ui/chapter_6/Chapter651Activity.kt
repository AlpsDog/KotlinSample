package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/17 11:17
 * @E-mail: xxx@163.com
 * @Description: 6.5.1 使用函数类型
 */
class Chapter651Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter651)
        test()
    }

    /**
     *  1.函数本身也具有自己的类型，即：函数类型
     *  2.构成：形参列表 -> 返回值类型
     *  3.可用于定义变量、形参、返回值
     */
    fun test() {
        /**
         * 计算乘方
         */
        fun pow(base: Int, exponent: Int): Int {
            var result = 1;
            for (i in 1..exponent) {
                result *= base
            }
            return result
        }

        /**
         * 矩形面积
         */
        fun area(width: Int, height: Int): Int {
            return width * height
        }

        // 定义一个变量，类型为函数：(Int, Int) -> Int
        var testPow: (Int, Int) -> Int
        // 将pow函数赋值给testPow，testPow可以当成pow使用
        testPow = ::pow
        println(testPow(2, 3))
        // 将area函数赋值给testPow，testPow可以当area使用
        testPow = ::area
        println(testPow(5, 4))

    }

}