package com.wonly.kotlinsample.ui.chapter_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/15 11:38
 * @E-mail: xxx@163.com
 * @Description: 4.2.4 when表达式
 */
class Chapter424Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter424)
        test()
    }

    /**
     * when表达式
     * 1.有返回值
     * 2.通常必须有else分支
     */
    fun test() {
        var score = 'B'
        val result = when (score) {
            'A' -> {
                println("这才是祖国的栋梁")
                "优秀"
            }
            'B' -> {
                println("望百尺竿头更进一步")
                "良好"
            }
            'C' -> "中"
            'D' -> "及格"
            else -> {
                "不及格"
            }
        }
        println("结果：${result}")
    }
}