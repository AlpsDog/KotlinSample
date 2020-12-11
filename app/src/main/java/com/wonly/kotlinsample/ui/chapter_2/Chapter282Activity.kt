package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 14:24
 * @E-mail: xxx@163.com
 * @Description: 2.8.2 先判断后使用
 */
class Chapter282Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter282)
        test()
        test2()
    }

    /**
     * 可空类型不允许直接调用属性、方法。
     * 但是可以先判断后调用
     */
    fun test() {
        var b: String? = "houshengli"
        var len = if (b != null) b.length else -1
        println("b的长度${len}")

//        println("b的长度${b.length}")// 报错，可空类型不允许直接调用

    }

    /**
     * 对于可空Boolean,接收三个值：true、false、null
     * 对Boolean?进行判断时，需要显式比较
     */
    fun test2() {
        var b: Boolean? = null;

//        // 报错，只能显式判断
//        if (b){
//            println("为真")
//        }

        if (b == true) {
            println("true")
        }
    }
}