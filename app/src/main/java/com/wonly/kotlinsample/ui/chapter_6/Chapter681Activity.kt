package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/21 17:12
 * @E-mail: xxx@163.com
 * @Description: 匿名函数用法
 */
class Chapter681Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter681)
        test()
    }

    /**
     * 1.Lambda表达式不能指定返回值
     * 2.需要指定返回值，匿名函数即可代替Lambda表达式
     *
     * 3.方法名去掉即为匿名函数
     * 4.匿名函数参数类型在可以推断出的情况下，可以省略
     */
    fun test() {
        // 定义匿名函数 赋值给test
        var test = fun(x: Int, y: Int): Int {
            return x + y
        }
        // 通过test调用匿名函数
        println(test(2, 4))
    }
}