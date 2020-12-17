package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/16 19:56
 * @E-mail: xxx@163.com
 * @Description: 6.2.4 个数可变的参数
 */
class Chapter624Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter624)
        test()
    }

    /**
     * 1.Kotlin允许可变参数，在形参前加 "vararg" 修饰即可
     * 2.可变参数可以在形参列表任意位置，但一个函数最多只能有一个可变参数
     */
    fun test() {
        testVararg(5, "疯狂Android讲义", "疯狂Kotlin讲义", "疯狂Java讲义")
        // 可变参数在前时，后面参数必须使用命名参数
        testVararg2("疯狂Android讲义", "疯狂Kotlin讲义", "疯狂Java讲义", num = 5)
        // 可变参数接收数组时，在传入的数组参数前添加"*"运算符
        var arr = arrayOf("001", "002", "003")
        testVararg(arr.size, *arr)
    }

    fun testVararg(a: Int, vararg books: String) {
        for (book in books) {
            println(book)
        }
        println(a)
    }

    fun testVararg2(vararg books: String, num: Int) {
        for (book in books) {
            println(book)
        }
        println(num)
    }

}