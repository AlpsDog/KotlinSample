package com.wonly.kotlinsample.ui.chapter_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wonly.kotlinsample.R

/**
 * @Author: HSL
 * @Time: 2020/12/11 14:25
 * @E-mail: xxx@163.com
 * @Description: 2.8.3 安全调用
 */
class Chapter283Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter283)
        test()
    }

    /**
     * 安全调用使用："?."
     */
    fun test() {
        // 使用 .? 进行安全访问，当vStr空null时，也不会出现空指针
        var vStr: String? = "houshengli"
        println(vStr?.length)// 返回10
        vStr = null
        println(vStr?.length)// 返回null
    }
}