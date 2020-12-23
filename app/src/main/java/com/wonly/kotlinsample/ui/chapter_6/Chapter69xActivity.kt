package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R
import kotlin.math.log

/**
 * @Author: HSL
 * @Time: 2020/12/21 19:17
 * @E-mail: xxx@163.com
 * @Description: 6.9 捕获上下文中的变量和常量
 */
class Chapter69xActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter69x)
        test()
    }

    fun test() {
        println("-----add1返回的List")
        var add1 = makeList("刘必凡")
        println(add1()) // 输出[刘必凡]
        println(add1()) // 输出[刘必凡,刘必凡]

        println("-----add2返回的list")
        var add2 = makeList("林宇杰")
        println(add2()) // 输出[林宇杰]
        println(add2()) // 输出[林宇杰,林宇杰]
    }

    fun makeList(ele: String): () -> List<String> {
        // 创建不包含任何元素的List
        var list: MutableList<String> = mutableListOf();
        // 局部函数访问了ele参数、list变量
        fun addElement(): List<String> {
            // 向list集合中添加一个元素
            list.add(ele)
            return list
        }
        return ::addElement
    }

}