package com.wonly.kotlinsample.ui.chapter_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/23 10:02
 * @E-mail: xxx@163.com
 * @Description: 6.10 内联函数
 */
class Chapter610xActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter610x)
        test()
    }

    fun test() {
        // 函数（参数类型为函数或者Lambda表达式）调用过程：
        //  1.先转移到形参指向的Lambda表达式或者函数的内存地址
        //  2.表达式或函数执行完毕，在返回原函数执行的地方
        // 问题：如果表达式或函数代码量不大，且经常被调用，所产生的时间和控件开销就很不划算
        //  1.出现内联函数解决
        //  2.其实质就是：由编译器直接"复制、粘贴"被调用的表达式或者函数代码，粘贴到原函数执行的代码中
        //  3.内联关键字：inline
        //  4.部分禁止内联：noinline

        var arr = arrayOf(20, 4, 40, 100, 30)
//        var map = map(arr, fun(n: Int): Int { return n + 3 }) // 匿名函数写法
        var map = map(arr) { it + 3 } // Lambda表达式写法
        var map2 = map2(arr) { it + 3 } // Lambda表达式写法
        var map3 = map3(arr) { it + 3 } // Lambda表达式写法
        println(map.contentToString())
        println(map2.contentToString())
        println(map3.contentToString())
    }

    /**
     * 函数关键字fun之前 加  inline
     */
    inline fun map(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
        var result = Array<Int>(data.size, { 0 })
        for (i in data.indices) {
            result[i] = fn(data[i])
        }
        return result
    }

    /**
     * map函数在编译之后和map2一样
     * 编译器将Lambad表达式{it+3}的内容复制、粘贴到fn函数参数执行的地方
     */
    fun map2(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
        var result = Array<Int>(data.size, { 0 })
        for (i in  data.indices) {
            result[i] = data[i] + 3
        }
        return result
    }

    /**
     * 使用noinline，fn函数不会被内联化
     */
    inline fun map3(data: Array<Int>, noinline fn: (Int) -> Int): Array<Int> {
        var result = Array<Int>(data.size, { 0 })
        for (i in  data.indices) {
            result[i] = fn(data[i])
        }
        return result
    }


}