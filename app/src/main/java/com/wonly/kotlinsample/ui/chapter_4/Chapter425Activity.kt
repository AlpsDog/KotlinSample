package com.wonly.kotlinsample.ui.chapter_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/15 13:29
 * @E-mail: xxx@163.com
 * @Description: when分支处理范围
 */
class Chapter425Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter425)
        test()
    }

    /**
     * 通过使用in、!in运算符
     * 判断表达式是否位于指定区间
     */
    fun test() {
        val age = java.util.Random().nextInt(130)
        println("年龄：${age}")
        var str = when (age) {
            in 10..25 -> "当时年少青衫薄"
            in 26..50 -> "风景依旧似去年"
            in 51..80 -> "醉听清吟胜管弦"
            in 81..100 -> "年过八十古来稀"
            else -> "盖棺定论已入土"
        }
        println("评价：${str}")
    }
}