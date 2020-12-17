package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/17 10:42
 * @E-mail: xxx@163.com
 * @Description: 6.4 局部函数
 */
class Chapter64xActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter64x)
        getMathFunc("square", 2)
        getMathFunc("cube", 2)
        getMathFunc("factorial", 3)
    }

    /**
     * Kotlin支持函数体内部定义函数，这就是局部函数
     */
    fun getMathFunc(type: String, nn: Int): Int {
        //定义计算平方的函数
        fun square(n: Int): Int {
            return n * n
        }

        // 定义计算立方的函数
        fun cube(n: Int): Int {
            return n * n * n
        }

        // 定义计算阶乘的函数
        fun factorial(n: Int): Int {
            var result = 1
            for (index in 2..n) {
                result *= index
            }
            return result
        }

        var result = when (type) {
            "square" -> {
                println("计算平方")
                square(nn)
            }
            "cube" -> {
                println("计算立方")
                cube(nn)
            }
            else -> {
                println("计算阶乘")
                factorial(nn)
            }
        }
        println("输入：${nn},结果：${result}")
        return result
    }

}