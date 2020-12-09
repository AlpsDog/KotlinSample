package com.wonly.kotlinsample.beans;

import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @Project: KotlinSample
 * @Package: com.wonly.kotlinsample.beans
 * @Author: HSL
 * @Time: 2020/12/09 09:32
 * @E-mail: xxx@163.com
 * @Description: 这个人太懒，没留下什么踪迹~
 */
public class Catalog_II extends BaseExpandNode {

    private String catalogNum;
    private String catalogName;
    private List<BaseNode> catalogIIiList;

    @Nullable
    @Override
    public List<BaseNode> getChildNode() {
        return catalogIIiList;
    }

    public String getCatalogNum() {
        return catalogNum;
    }

    public void setCatalogNum(String catalogNum) {
        this.catalogNum = catalogNum;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public List<BaseNode> getCatalogIIiList() {
        return catalogIIiList;
    }

    public void setCatalogIIiList(List<BaseNode> catalogIIiList) {
        this.catalogIIiList = catalogIIiList;
    }
}
