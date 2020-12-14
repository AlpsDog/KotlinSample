package com.wonly.kotlinsample.ui.chapter_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/14 9:53
 * @E-mail: xxx@163.com
 * @Description: 3.1.1 单目前缀运算符
 */
class Chapter311Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter311)
        test()
    }

    /**
     *  Kotlin运算符都是以方法形式来实现的
     *  单目前缀运算符有：+、-、！
     *  运算符               对应方法
     *    +a                   a.unaryPlus()
     *    -a                   a.unaryMinus()
     *    !a                   a.not()
     */
    fun test() {
        var a = 20;
        var b = -a;
        var c = a.unaryMinus();
        println("b:${b},c:${c}") // 都是-20

        val flag = true
        val notFlag = !flag
        val notFlag2 = flag.not();
        println("notFlag:${notFlag},notFlag2:${notFlag2}") // 都是false
    }
}