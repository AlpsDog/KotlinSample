package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

class Chapter63xActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter63x)
        test()
        test("第二")
        test(3)
        test("第四", 4)
        test(5, "第五")
    }

    /**
     * 1.函数名相同，形参列表不同，即为：函数重载
     * 2.形参列表不同：形参个数、类型不同
     * 3.不推荐重载形参个数可变的参数
     */
    fun test() {
        println("无参数test函数")
    }

    fun test(msg: String) {
        println("重载的test函数${msg}")
    }

    fun test(msg: Int) {
        println("重载的test函数${msg}")
    }

    fun test(msg: String, serial: Int) {
        println("重载的test函数${msg}-${serial}")
    }

    fun test(serial: Int, msg: String) {
        println("重载的test函数${serial}-${msg}")
    }

}