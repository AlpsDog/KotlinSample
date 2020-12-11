package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/10 14:39
 * @E-mail: xxx@163.com
 * @Description: 声明变量
 */
class Chapter224Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter224)
    }

    /**
     * kotlin不强制每条语句必须以分号（;）结尾
     * 用（:类型）指定变量类型
     * 声明变量使用：var、val
     * 格式：var|val 变量名 [:类型] [=初始值]
     */
    fun test() {
        // 声明变量时，必须显式或者隐式指定变量类型
        // 显式指定类型
        var b: Int

        // 隐式指定类型
        // 声明变量直接指定初始值，编译器会根据初始值确定该变量类型
        var name = "hsl.com"

        // 显式声明变量，同时指定类型和初始值
        var age: Int = 20;

        // val声明的变量=常量，不能重复赋值
        val book = "王力研究院";
//        book = "再次赋值报错";

        val car: String = "宝马x5";
    }


}
