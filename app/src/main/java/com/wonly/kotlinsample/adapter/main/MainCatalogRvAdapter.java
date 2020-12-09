package com.wonly.kotlinsample.adapter.main;

import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.wonly.kotlinsample.beans.Catalog_I;
import com.wonly.kotlinsample.beans.Catalog_II;
import com.wonly.kotlinsample.beans.Catalog_III;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @Project: KotlinSample
 * @Package: com.wonly.kotlinsample.adapter
 * @Author: HSL
 * @Time: 2020/12/08 10:33
 * @E-mail: xxx@163.com
 * @Description: 这个人太懒，没留下什么踪迹~
 */
public class MainCatalogRvAdapter extends BaseNodeAdapter {

    public MainCatalogRvAdapter() {
        super();
        addNodeProvider(new Catalog_I_Provider());
        addNodeProvider(new Catalog_II_Provider());
        addNodeProvider(new Catalog_III_Provider());
    }

    @Override
    protected int getItemType(@NotNull List<? extends BaseNode> data, int position) {
        BaseNode node = data.get(position);
        if (node instanceof Catalog_I) {
            return Catalog_I_Provider.ITEM_VIEW_TYPE;
        } else if (node instanceof Catalog_II) {
            return Catalog_II_Provider.ITEM_VIEW_TYPE;
        } else if (node instanceof Catalog_III) {
            return Catalog_III_Provider.ITEM_VIEW_TYPE;
        }
        return -1;
    }
}
