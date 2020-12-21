package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/21 16:05
 * @E-mail: xxx@163.com
 * @Description: 个数可变的参数和Lambda参数
 */
class Chapter675Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter675)
        test()
    }

    /**
     * 1.个数可变的参数，放在参数列表最后，可以避免使用命名参数
     * 2.既有可变参数，也有函数参数，则将函数参数放在最后。
     *   调用时，函数参数使用Lambda表达式放在圆括号外面，
     *   这样就无需使用命名参数
     */
    fun test() {
        // 使用命名参数
        var testLambda = testLambda("Java", "Kotlin", "go", transform = { it.length })
        // 将Lambda表达式放在圆括号后面，无需使用命名参数
        var testLambda2 = testLambda<Int>("Java", "Kotlin", "go") { it.length }
        println(testLambda)
        println(testLambda2)

        var testLambda3 = testLambda("Java", "Kotlin", "go") { "疯狂${it}讲义" }
        println(testLambda3)
    }

    fun <T> testLambda(vararg names: String, transform: (String) -> T): List<T> {
        var mutableListOf = mutableListOf<T>()
        for (name in names) {
            mutableListOf.add(transform(name))
        }
        return mutableListOf.toList()
    }
}