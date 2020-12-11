package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 10:03
 * @E-mail: xxx@163.com
 * @Description: 浮点型与整型之间的转换
 */
class Chapter262Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter262)
    }

    fun test() {
        // toDouble、toFloat
        // 没什么可说的
        var d: Double = 66.0;
    }
}