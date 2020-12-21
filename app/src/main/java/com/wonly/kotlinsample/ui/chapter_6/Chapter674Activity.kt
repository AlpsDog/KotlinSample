package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/21 15:24
 * @E-mail: xxx@163.com
 * @Description: 调用Lambda表达式的约定
 */
class Chapter674Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter674)
    }

    /**
     * 如果函数的最后一个参数是函数类型
     * 而且你打算传入一个Lambda表达式作为相应的参数
     * Kotlin允许在圆括号之外指定Lambda表达式
     *
     */
    fun test() {
        var list = listOf("Java", "Kotlin", "Go")
        var rt = list.dropLastWhile { it.length > 3 }// 编辑时，编译器自动生成在圆括号之外
        println(rt)
    }
}