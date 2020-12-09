package com.wonly.kotlinsample.beans.main;

import java.util.List;

/**
 * @Project: KotlinSample
 * @Package: com.wonly.kotlinsample.beans.main
 * @Author: HSL
 * @Time: 2020/12/09 14:56
 * @E-mail: xxx@163.com
 * @Description: 这个人太懒，没留下什么踪迹~
 */
public class MainCatalogItem {

    private String chapter_number;
    private String chapter_title;
    private List<MainCatalogItem> chapter_sub_title;

    public String getChapter_number() {
        return chapter_number;
    }

    public void setChapter_number(String chapter_number) {
        this.chapter_number = chapter_number;
    }

    public String getChapter_title() {
        return chapter_title;
    }

    public void setChapter_title(String chapter_title) {
        this.chapter_title = chapter_title;
    }

    public List<MainCatalogItem> getChapter_sub_title() {
        return chapter_sub_title;
    }

    public void setChapter_sub_title(List<MainCatalogItem> chapter_sub_title) {
        this.chapter_sub_title = chapter_sub_title;
    }
}
