package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/16 17:16
 * @E-mail: xxx@163.com
 * @Description: 6.1.2 函数返回值和Unit
 */
class Chapter612Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter612)

        // TODO: 2020/12/16 希望函数没有返回值 
        // TODO: 2020/12/16 省略 ": 返回值类型" 部分
        // TODO: 2020/12/16 使用 ": Unit" 声明代表没有返回值

        foo()
        sayHi("钢铁侠")
    }

    /**
     * 定义无形参、无返回值函数
     */
    fun foo() {
        println("程序执行foo()函数")
    }

    /**
     * 有一个参数，无返回值
     */
    fun sayHi(name: String): Unit {
        println("${name}，你好!")
    }

}