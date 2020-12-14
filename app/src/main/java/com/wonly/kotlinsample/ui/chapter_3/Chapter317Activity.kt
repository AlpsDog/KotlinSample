package com.wonly.kotlinsample.ui.chapter_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/14 11:29
 * @E-mail: xxx@163.com
 * @Description: 3.1.7 广义赋值运算符
 */
class Chapter317Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter317)
    }

    /**
     * 运算符            对应的方法
     * a += b             a.plusAssign(b)
     * a -= b             a.minusAssign(b)
     * a *= b             a.timesAssign(b)
     * a /= b             a.divAssign(b)
     * a %= b             a.remAssign(b)
     * a += b 编译器先判断plusAssign（） 方法是否存在，如果存在：
     *  1. 如果plus（）方法也存在，则报错
     * 不存在，则转为 a = a+b
     */
    fun test() {
        var a: Int = 2
        a += 2;
    }
}