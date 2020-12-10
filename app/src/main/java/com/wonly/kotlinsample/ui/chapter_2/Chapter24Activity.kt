package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/10 17:05
 * @E-mail: xxx@163.com
 * @Description: 2.4 浮点型
 */
class Chapter24Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter24)
        test()
    }

    fun test() {
        // 1.Float与Double
        // 2.只有浮点型才可以使用科学计数法：51200是整型，但是512E2则是浮点型
        // 3.var a = 5.62,系统默认为Double类型

        var a = 5.2345556f;
        println("a的值为：${a}")// 5.2345557

        // 25.2345默认Double，下面编译报错，需加f;
//        var b: Float = 25.2345;

        // c的类型被确认为Double
        var c = 5.12e2;
        println("c的值为：${c}")// 512.0

        // 5.0除以0将出现正无穷大数值
        var d = 0.0;
        println("5除以d的值为：${5.0 / d}")// Infinity

        // -5.0除以0将出现负无穷大数值
        println("-5除以d的值为：${-5.0 / d}")// -Infinity

        // 所有负无穷大数值都相等
        println("负无穷大数值都相等：${-5.0 / d == -500.0 / d}")// true

        // 0/0将出现非数
        var nan: Double = d / d;
        println("d/d值为：${nan}}") // NaN
        // 非数与自己都不相等
        println("nan与nan比较：${nan == nan}}")// false

    }
}