package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/17 16:09
 * @E-mail: xxx@163.com
 * @Description: 6.5.3 使用函数类型作为返回值类型
 */
class Chapter653Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter653)
        test()
    }

    /**
     * Kotlin支持定义函数类型的返回值
     */
    fun test() {
        var mathFunc = getMathFunc("square")// 获取square函数引用
        println(mathFunc(5))// 输出25
        mathFunc = getMathFunc("cube")//
        println(mathFunc(5))// 输出125
        mathFunc = getMathFunc("factorial")
        println(mathFunc(5)) // 输出：120
    }

    private fun getMathFunc(type: String): (Int) -> Int {
        // 计算平方
        fun square(n: Int): Int {
            return n * n
        }

        // 计算立方
        fun cube(n: Int): Int {
            return n * n * n
        }

        // 计算阶乘
        fun factorial(n: Int): Int {
            var result = 1
            for (index in 2..n) {
                result *= index
            }
            return result
        }

        when (type) {
            "square" -> return ::square
            "cube" -> return ::cube
            else -> return ::factorial
        }
    }


}