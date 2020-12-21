package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/21 14:06
 * @E-mail: xxx@163.com
 * @Description: 调用Lambda表达式
 */
class Chapter671Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter671)
        test()
    }

    /**
     * Lambda表达式
     * 1.格式
     *   { 形参列表  ->
     *       // 0条或者多条可执行语句
     *   }
     */
    fun test() {
        // 定义Lambda表达式
        var square = { n: Int ->
            n * n
        }
        // 调用
        println(square(5))// 输出25

        // 定义Lambda表达式，并在它后面添加圆括号，直接调用
        // 函数体最后一行可以作为函数返回值
        var result = { base: Int, exponent: Int ->
            var result = 1
            for (i in 1..exponent) {
                result *= base
            }
            result
        }(4, 3)
        println(result)// 输出64
    }

}