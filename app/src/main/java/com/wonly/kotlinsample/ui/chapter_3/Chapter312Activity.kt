package com.wonly.kotlinsample.ui.chapter_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/14 10:30
 * @E-mail: xxx@163.com
 * @Description: 3.1.2 自加自减运算符
 */
class Chapter312Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter312)
        test()
    }

    /**
     * 自加和自减
     * ++ -- 放在变量前后是不同的
     *
     * 运算符       对应方法
     *  a++           a.inc()
     *  a--           a.dec()
     */
    fun test() {
        var a = 20
        var b = a++;// 先用临时变量缓存a,然后a = a+1,再把临时变量赋给b
        println(b)// b = 20,a = 21
        var b2 = ++a;
        println(b2)// b2 = 22; a = 22
        var c = a.inc();
        println(c)// c = 23 a = 23
    }
}