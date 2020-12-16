package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/16 17:39
 * @E-mail: xxx@163.com
 * @Description: 6.2.1 命名参数
 */
class Chapter621Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter621)
        test()
    }

    /**
     * 命名参数与位置参数
     */
    fun test() {
        // 传统调用函数方式，根据位置传入参数
        println(girth(3.5, 4.8))
        // 根据参数名来传入参数
        println(girth(width = 3.5, height = 4.8))
        // 使用命名参数时可以交换位置
        println(girth(height = 4.8, width = 3.5))
        // 部分使用命名参数，部分使用位置参数
        // 混合使用时，命名参数必须位于位置参数之后
        println(girth(3.5, height = 4.8))
//        println(girth(height = 4.8, 3.5))
    }

    /**
     * 计算矩形周长
     * @param width
     * @param height
     */
    fun girth(width: Double, height: Double): Double {
        println("width: ${width}")
        println("height:${height}")
        return 2 * (width + height)
    }
}