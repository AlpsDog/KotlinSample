package com.wonly.kotlinsample.ui.chapter_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/15 10:49
 * @E-mail: xxx@163.com
 * @Description: 4.2.3 when分支语句
 */
class Chapter423Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter423)
        test()
    }

    /**
     * when分支取代了Java原有的switch语句，是对Java switch分支的简化
     *
     * 1.不在需要case关键字
     * 2.case后面的":"改为"->"
     * 3.default改为else,更加明确
     */
    fun test() {

        var score: Char = 'B'
        when (score) {
            'A' -> println("优秀")
            'A' -> println("良好")
            'A' -> println("中")
            'A' -> println("及格")
            else -> print("不及格")
        }
    }
}