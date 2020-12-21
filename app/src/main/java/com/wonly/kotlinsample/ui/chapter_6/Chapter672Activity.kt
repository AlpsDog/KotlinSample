package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/21 14:25
 * @E-mail: xxx@163.com
 * @Description: 利用上下文推断类型
 */
class Chapter672Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter672)
    }

    /**
     * 1.完整的Lambda表达式需要定义参数类型
     * 但是Kotlin根据上下文可以推断出形参类型时，
     * 可以省略形参类型
     *
     * 2.如果仅有一个形参，甚至可以省略形参名，"->"也不需要了，变量此时仅能用"it"代替
     */
    fun test() {
        // 省略形参类型
        var square: (Int) -> Int = { n ->
            n * n
        }

        var square2: (Int) -> Int = {
            it * it
        }

        // 调用表达式
        println(square(5))// 输出25
        println(square2(5))// 输出25

//        // 下面报错，无法推断n的类型，必须指定参数类型
//        var square2 = { n ->
//            n * n
//        }
    }
}