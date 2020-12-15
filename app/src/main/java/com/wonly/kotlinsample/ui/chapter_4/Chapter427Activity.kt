package com.wonly.kotlinsample.ui.chapter_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/15 13:58
 * @E-mail: xxx@163.com
 * @Description: 4.2.7 when条件分支
 */
class Chapter427Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter427)
        test()
    }

    /**
     * when分支可以取代if...else
     * 此时不需要提供任何条件表达式
     * 每一个分支条件都是一个布尔表达式
     */
    fun test() {
        var score = 'A'
        var result = when {
            score in "A" -> "优秀"
            score in "B" -> "良好"
            score in "C" -> "一般"
            score in "D" -> "及格"
            else -> "不及格"
        }
        println(result)
    }
}