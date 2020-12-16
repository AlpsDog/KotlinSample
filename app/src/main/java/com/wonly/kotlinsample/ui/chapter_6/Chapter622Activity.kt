package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/16 19:19
 * @E-mail: xxx@163.com
 * @Description: 6.2.2 形参默认值
 */
class Chapter622Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter622)
        test()
    }

    /**
     * 1.使用形参默认值，在调用函数时，可以省略该形参
     * 2.语法格式： 形参名：形参类型 = 默认值
     * 3.Kotlin规定：命名参数必须位于位置参数的后面
     */
    fun test() {
        // 全部使用默认参数
        sayHi()
        // 只有message参数使用默认值
        sayHi("钢铁侠")
        // 两个参数都不实用默认值
        sayHi("绿巨人", "欢迎来到Kotlin")
        // 只有name参数使用默认值
        sayHi(message = "欢迎来到Kotlin")
        // 命名参数必须位于位置参数的后面
//        sayHi(name = "黑寡妇", "欢迎加入复仇者联盟")// 报错
//        sayHi("欢迎加入复仇者联盟", name = "黑寡妇")// 报错
        drawTriangle(6, '@')
        drawTriangle(7, char = '#')
        drawTriangle(char = '*')
    }

    private fun sayHi(name: String = "孙悟空", message: String = "欢迎学习Java") {
        println("$name,您好!")
        println("消息是：${message}")
    }

    /**
     * 画三角形
     * @param height
     * @param char
     */
    private fun drawTriangle(height: Int = 5, char: Char) {
        for (i in 1..height) {
            // 先打印一排空格
            for (j in 0 until height - 1) {
                print(" ")
            }
            // 再打印一排特殊字符
            for (j in 0 until 2 * i - 1) {
                print(char)
            }

            println()
        }
    }
}