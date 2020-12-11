package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 16:38
 * @E-mail: xxx@163.com
 * @Description: 2.9.1 字符串类型
 */
class Chapter291Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter291)
        test()
        test2()
    }

    /**
     * 1. Kotlin字符串String不同于 Java String
     * 2. 允许s[i]访问索引处字符，也可以for循环遍历
     */
    fun test() {
        var s: String = "houshengli"

        // 下标访问
        println(s[1]) // 输入o
        println(s[2]) // 输入u
        println(s[3]) // 输入s

        // for循环遍历
        for (c in s) {
            println(c)
        }

    }

    /**
     * Kotlin字符串有两种字面值：
     * 1. 转义字符串：转义字符串可以有转义字符。 他和Java字符串很像
     * 2. 原始字符串：
     *    2.1 可以包含换行和任意文本，
     *    2.2 需要用三个引号  """原始字符串"""
     *    2.3 使用（|）竖线作为边界符：竖线之前的内容会被去掉
     *    2.4 使用trimMargin去掉原始字符串前面的缩进
     */
    fun test2() {
        // 普通字符串
        var str = "alpsDog.com"
        println(str)

        // 原始字符串
        val txt = """
          | 侯也诗无敌，
          | 李杜何能及。
          | 一日诗一篇，
          | 一年出诗集。
        """.trimMargin()
        println(txt)

        // 去掉 |
        val txt2 = """
          侯也诗无敌，
          李杜何能及。
          一日诗一篇，
          一年出诗集。
        """.trimMargin()
        println(txt2)

        // 使用其他字符作为边界符
        val txt3 = """
          * 侯也诗无敌，
          * 李杜何能及。
          * 一日诗一篇，
          * 一年出诗集。
        """.trimMargin("*")
        println(txt3)

        // 原始字符串
        val txt4 = """
          | 侯也诗无敌，
          | 李杜何能及。
          | 一日诗一篇，
          | 一年出诗集。
        """
        println(txt4)

        // 原始字符串
        val txt5 = """
          | 侯也诗无敌，O(∩_∩)O哈哈~
          | 李杜何能及。\n
          | 一日诗一篇，                    
          一年出诗集。
        """.trimMargin()
        println(txt5)


    }
}