package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/21 11:20
 * @E-mail: xxx@163.com
 * @Description: 使用Lambda表达式代替局部函数
 */
class Chapter662Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter662)
    }

    fun test() {
        var mathFunc = getMathFunc("square")// 获取square函数引用
        println(mathFunc(5))// 输出25
        mathFunc = getMathFunc("cube")//
        println(mathFunc(5))// 输出125
        mathFunc = getMathFunc("factorial")
        println(mathFunc(5)) // 输出：120
    }

    /**
     * 正常写法
     */
    private fun getMathFunc0(type: String): (Int) -> Int {
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

    /**
     *  Lambda表达式代替局部函数（与局部函数区别）
     *  1.Lambda表达式总是被大括号括着
     *  2.不需要fun关键字，无需指定函数名
     *  3.形参列表（如果有的话），在"->"之前声明，参数类型可以省略
     *  4.函数体放在"->"之后
     *  5.函数体最后一个表达式自动被作为Lambda表达式返回值，无需使用return
     *
     */
    private fun getMathFunc(type: String): (Int) -> Int {
        when (type) {
            "square" -> return { n: Int ->
                n * n
            }
            "cube" -> return { n: Int ->
                n * n * n
            }
            else -> return { n: Int ->
                var result = 1
                for (index in 2..n) {
                    result *= index
                }
                result
            }
        }
    }
}