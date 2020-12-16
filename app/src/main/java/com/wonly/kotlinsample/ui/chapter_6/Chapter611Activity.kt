package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R
import java.util.*

/**
 * @Author: HSL
 * @Time: 2020/12/16 16:41
 * @E-mail: xxx@163.com
 * @Description: 定义和调用函数
 */
class Chapter611Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter611)
        forMax()
    }

    /**
     * Kotlin函数：
     * 1.关键字：fun
     * 2.语法格式
     *   fun 函数名（形参列表）[ : 返回值类型]{
     *        // 函数体...
     *   }
     * 3.函数名：标识符即可
     * 4.形参列表："形参名：参数类型"，多个参数逗号隔开
     * 5.声明没有返回值的函数
     *   5.1 省略 ": 返回值类型" 部分
     *   5.2 使用 ": Unit"，代表没有返回值，Unit相当于Java的Void
     *
     * 如下：方法名test，参数param、param2，返回值Int，return可以返回一个显式的值或者表达式
     */
    fun test(param: Int, param2: Int): Int {
        return if (param > param2) param else param2
    }

    private fun forMax() {
        var a = Random().nextInt(100)
        var b = Random().nextInt(100)
        var result = """
            ! a的值为：${a}
            ! b的值为：${b}
            ! 最大值为：${test(a, b)}
        """.trimIndent()
        println(result)
    }




}