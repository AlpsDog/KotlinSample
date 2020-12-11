package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R
import java.util.*

/**
 * @Author: HSL
 * @Time: 2020/12/11 16:39
 * @E-mail: xxx@163.com
 * @Description: 2.9.2 字符串模板
 */
class Chapter292Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter292)
        test()
    }

    /**
     * 字符串模板
     * 1.Kotlin允许在字符串中嵌入变量或者表达式
     * 2.放在：${}中即可
     */
    fun test() {
        // 嵌入变量
        val bookPrice = 79;
        var s = "图书的价格是：${bookPrice}"
        println(s)

        // 嵌入方法
        val rand = Random();
        var s2 = "图书的编号为：${rand.nextInt(100)}"
        println(s2)

        val bookName = "刘总的恋爱史"
        println(bookName)

        val result = """
            | 书名：${bookName}
            | 编号：${rand.nextInt(100)}
            | 价格：${bookPrice}
        """.trimMargin()
        println(result)


    }
}