package com.wonly.kotlinsample.adapter.main;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.wonly.kotlinsample.CatalogManage;
import com.wonly.kotlinsample.R;
import com.wonly.kotlinsample.beans.Catalog_II;
import com.wonly.kotlinsample.beans.Catalog_III;

import org.jetbrains.annotations.NotNull;

/**
 * @Project: KotlinSample
 * @Package: com.wonly.kotlinsample.adapter.main
 * @Author: HSL
 * @Time: 2020/12/09 11:28
 * @E-mail: xxx@163.com
 * @Description: 这个人太懒，没留下什么踪迹~
 */
public class Catalog_II_Provider extends BaseNodeProvider {

    public static final int ITEM_VIEW_TYPE = 2;

    @Override
    public int getItemViewType() {
        return ITEM_VIEW_TYPE;
    }

    @Override
    public int getLayoutId() {
        return R.layout.recycle_item_main_catelog_2;
    }

    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, BaseNode baseNode) {
        Catalog_II catalogIi = (Catalog_II) baseNode;
        baseViewHolder.setText(R.id.chapter_number, String.valueOf(catalogIi.getCatalogNum()));
        baseViewHolder.setText(R.id.chapter_name, catalogIi.getCatalogName());
    }

    @Override
    public void onClick(@NotNull BaseViewHolder helper, @NotNull View view, BaseNode data, int position) {
        if (data.getChildNode() != null && !data.getChildNode().isEmpty()) {
            getAdapter().expandOrCollapse(position, true, true, null);
        } else {
            Catalog_II catalogIi = (Catalog_II) data;
            String catalogNum = catalogIi.getCatalogNum();
            Class<?> chapterCls = CatalogManage.getChapterCls(catalogNum);
            if (chapterCls != null){
                startActivity(chapterCls);
            } else {
                Toast.makeText(context, "学习中，敬请期待", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void startActivity(Class<?> cls) {
        Intent starter = new Intent(getContext(), cls);
        getContext().startActivity(starter);
    }
}
