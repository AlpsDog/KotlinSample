package com.wonly.kotlinsample.adapter.main;

import android.view.View;

import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.wonly.kotlinsample.R;
import com.wonly.kotlinsample.beans.Catalog_I;

import org.jetbrains.annotations.NotNull;

/**
 * @Project: KotlinSample
 * @Package: com.wonly.kotlinsample.adapter.main
 * @Author: HSL
 * @Time: 2020/12/09 11:28
 * @E-mail: xxx@163.com
 * @Description: 这个人太懒，没留下什么踪迹~
 */
public class Catalog_I_Provider extends BaseNodeProvider {

    public static final int ITEM_VIEW_TYPE = 1;

    @Override
    public int getItemViewType() {
        return ITEM_VIEW_TYPE;
    }

    @Override
    public int getLayoutId() {
        return R.layout.recycle_item_main_catelog_1;
    }

    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, BaseNode baseNode) {
        Catalog_I catalogI = (Catalog_I) baseNode;
        baseViewHolder.setText(R.id.chapter_number, String.format("第  %s  章", catalogI.getCatalogNum()));
        baseViewHolder.setText(R.id.chapter_name, catalogI.getCatalogName());
    }

    @Override
    public void onClick(@NotNull BaseViewHolder helper, @NotNull View view, BaseNode data, int position) {
        getAdapter().expandOrCollapse(position, true, true, null);
    }
}
