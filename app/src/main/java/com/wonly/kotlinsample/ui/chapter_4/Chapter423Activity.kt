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
     * 4.包含多条语句时，用代码块{}
     * 5.三个小改进
     *   5.1 when分支可以匹配多个值
     *   5.2 when分支后的值不要求常量，可以是任意表达式
     *   5.3 when分支对条件表达式的类型没有任何要求
     */
    fun test() {

        var levels = "DE";
        var score: Char = 'D'
        when (score) {
            'S', 'A' -> println("优秀") // 5.1
            'B' -> {
                println("良好")
                println("还是有进步空间哦!")
            }
            in levels -> println("中") // 5.2
            'F' -> println("及格")
            else -> {
                print("不及格")
                println("得叫家长了!!MD")
            }
        }
    }
}