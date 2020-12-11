package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 14:23
 * @E-mail: xxx@163.com
 * @Description: 2.8.1 非空类型与可空类型
 */
class Chapter281Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter281)
        test()
    }

    /**
     * 只有可空类型的变量或者常量才能接受null
     */
    fun test() {
        // who's sunguanyin?

        var str = "houshengli";
        // 报错，Int类型只能接受Int值，不能接受null
//        var num: Int = str.toIntOrNull()

        // 使用可空Int类型：Int?
        var num: Int? = str.toIntOrNull()
        println(num); // 输入结果为null
    }

    /**
     * 如果不加任何处理，可空类型不允许直接调用方法，访问属性
     */
    fun test2() {
        var aStr: String = "a";
        var bStr: String? = "b";

//        aStr = null;// 报错，非空类型不能接受null
        bStr = null; // 可空类型，编译通过

        println(aStr.length);
//        println(bStr.length);// 编译不通过，可空类型不能直接调用属性

    }
}