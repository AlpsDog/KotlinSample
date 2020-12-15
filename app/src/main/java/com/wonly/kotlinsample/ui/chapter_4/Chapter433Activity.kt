package com.wonly.kotlinsample.ui.chapter_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/15 14:10
 * @E-mail: xxx@163.com
 * @Description: 4.3.3 for-in循环
 */
class Chapter433Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter433)
        test()
    }

    /**
     * for-in:遍历范围、序列和集合
     * 格式：
     * for(常量名 in 字符串|范围|集合){
     *          statements
     * }
     *
     * 1.for-in中常量无需声明
     * 2.可用于遍历任何可迭代对象
     */
    fun test() {
        var max = 7
        for (num in 1..max) {
            println("num = ${num}")
        }
    }
}