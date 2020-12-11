package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 10:07
 * @E-mail: xxx@163.com
 * @Description: 表达式类型的自动提升
 */
class Chapter263Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter263)
        test()
    }

    /**
     * 1.当一个算术表达式包含多个数值型的值时，整个算术表达式的数据类型将发生自动提升：
     *   1.1 所有的Byte、Short类型自动提升到Int类型
     *   1.2 整个算术表达式自动提升到最大表数的类型
     *   1.3 Byte->Short->Int->Long->Float->Double
     */
    fun test() {
        var sValue: Short = 5;
        // 报错，sValue-5已经提升到Int,无法赋值给Short!
//        sValue = sValue - 5;

        var a: Double = 3.0;
        var b: Int = 4;
        var c: Byte = 2;
        // result被推断为Double
        var reslut = a * b * c;

        var iVal: Int = 3;
        // 输出7
        // 除数、被除数都是Int，结果只能是Int
        var iResult = 23 / iVal;
        println(iResult);
    }
}