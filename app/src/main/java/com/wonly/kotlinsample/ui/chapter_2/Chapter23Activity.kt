package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/10 16:12
 * @E-mail: xxx@163.com
 * @Description: 2.3 整型
 */
class Chapter23Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter23)
    }

    fun test() {
        // 1. kotlin提供四种整型：Byte Short Int Long,都继承与Number
        var a: Byte = 1
        var b: Short = 1
        var c: Int = 1
        var d: Long = 1

        // 2.kotlin是null安全语言，四种整型不能赋值null，
        //   如果需要存储null值，只能Byte? Short? Int? Long?
        //   相当于java的Byte、Short、Integer、Long
//        var e: Int = null;// 错误
        var e: Int? = null;

        // 3.kotlin整数数值可以为：十进制、二进制（0b或0B开头）、十六进制（0x或0X开头）
        //   不支持八进制
        var f = 0b01;
        var g = 0x01;

        // 4.kotlin为了提升数值可读性，允许增加下划线，
        var h = 123_555_000 // 123555000
//        // TODO: 2020/12/10   数值前补0????不行啊，待考究
//        var k = 000544;

    }
}