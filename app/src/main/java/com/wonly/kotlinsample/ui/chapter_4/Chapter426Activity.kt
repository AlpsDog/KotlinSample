package com.wonly.kotlinsample.ui.chapter_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/15 13:47
 * @E-mail: xxx@163.com
 * @Description: 4.2.6 when分支处理类型
 */
class Chapter426Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter426)
        test()
    }

    /**
     * 使用 is、!is 运算符判断类型
     */
    fun test() {
        var price = "5.67"
        println(realPrice(price))
    }

    private fun realPrice(inputPrice: Any) = when (inputPrice) {
        is String -> inputPrice.toDouble()
        is Int -> inputPrice.toDouble()
        is Double -> inputPrice
        else -> 0.0
    }
}