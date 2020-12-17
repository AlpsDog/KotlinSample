package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/17 13:33
 * @E-mail: xxx@163.com
 * @Description: 6.5.2 使用函数类型作为形参类型
 */
class Chapter652Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter652)
        test()
    }

    /**
     * 目的：调用函数时，我们可以动态传入一些代码
     *      就需要在函数中定义函数类型的参数
     * 使用函数变量  ::函数名
     */
    fun test() {
        var data = arrayOf(3, 4, 9, 5, 8)
        println("原始数据：${data.contentToString()}")
        println("计算数组元素的平方")
        // 传入函数变量 ::square
        println(map(data, ::square).contentToString())
        println("计算数组元素的立方")
        println(map(data, ::cube).contentToString())
    }

    /**
     * @param fn 函数类型参数
     *
     */
    fun map(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
        var result = Array<Int>(data.size) { 0 }
        for (i in data.indices) {
            result[i] = fn(data[i])
        }
        return result
    }

    fun square(n: Int): Int {
        return n * n
    }

    fun cube(n: Int): Int {
        return n * n * n
    }

}