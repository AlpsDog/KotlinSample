package com.wonly.kotlinsample.ui.chapter_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/14 10:47
 * @E-mail: xxx@163.com
 * @Description: 3.1.3 双目算术运算符
 */
class Chapter313Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter313)
    }

    /**
     * 运算符             对应方法
     *  a+b                a.plus(b)
     *  a-b                a.minus(b)
     *  a*b                a.times(b)
     *  a/b                a.div(b)
     *  a%b                a.rem(b)
     *  a..b               a.rangeTo(b)
     */
    fun test() {
        println(5 + 6)
        println(5.plus(6))
        println(5 - 3)
        println(5.minus(3))
        println(5 * 6)
        println(5.times(6))
        //.....
    }
}