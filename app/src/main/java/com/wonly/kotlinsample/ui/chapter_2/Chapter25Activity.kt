package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/10 17:55
 * @E-mail: xxx@163.com
 * @Description: 2.5 字符型
 */
class Chapter25Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter25)
        test()
    }

    /**
     * kotlin Char型不行赋值整型变量
     * 必须使用单引号''
     */
    fun test() {
        // 指定单个字符作为字符值
        var aChar: Char = 'a'
        // 使用转义字符来作为字符值
        var enterChar: Char = '\n'
        // 使用Unicode编码值来作为字符值
        var ch: Char = '\u9999'
        println(ch)// 输出"香"字
        // 定义"疯"字符型
        var zhong: Char = '疯';
    }
}