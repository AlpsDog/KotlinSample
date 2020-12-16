package com.wonly.kotlinsample.ui.chapter_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/15 10:34
 * @E-mail: xxx@163.com
 * @Description: 4.2.2 if表达式
 */
class Chapter422Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter422)
        test()
    }

    /**
     * Kotlin的if分支可以作为 表达式 使用
     * 也就是说：整个if表达式（包括else）最终会返回一个值
     * if可以代替Java的三目运算符
     *
     */
    fun test() {
        var age = 20
        var str = if (age > 20) "大于20岁" else "小于等于20岁"
        println(str)

        var desc = if (age < 30) {
            "年轻人"
        } else if (age < 50) {
            "中年人"
        } else if (age < 70) {
            "中老年人"
        } else {
            "行将就木之人"
        }
        println(desc)
    }

}