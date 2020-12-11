package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 10:02
 * @E-mail: xxx@163.com
 * @Description: 整型之间的转换
 */
class Chapter261Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter261)
        test()
    }

    /**
     * 1.kotlin不支持小范围数据隐式转为取值范围大的类型，必须显式转换
     * 2.Char型加、减整型：Char对应的字符编码加、减该整数，然后将计算结果转为Char型
     * 3.两个Char可以相减（结果为Int）,但是不能相加
     */
    fun test() {
        // kotlin提供的类型转换方法
        var a: Byte = 2;
        var b: Short = a.toShort();
        var c: Int = a.toInt();
        var d: Long = a.toLong();
        var e: Float = a.toFloat();
        var f: Double = a.toDouble();

        var c1 = 'i'
        var c2 = 'k'
        println(c1 + 4)// 输出m
        println(c1 - 4)// 输出e
        println(c1 - c2)// 输出-2
        // 编译出错
//        println(c1+c2);
    }

}