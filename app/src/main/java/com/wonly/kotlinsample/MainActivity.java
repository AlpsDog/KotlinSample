package com.wonly.kotlinsample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.entity.node.BaseNode;
import com.wonly.kotlinsample.adapter.main.MainCatalogRvAdapter;
import com.wonly.kotlinsample.beans.Catalog_I;
import com.wonly.kotlinsample.beans.Catalog_II;
import com.wonly.kotlinsample.beans.Catalog_III;
import com.wonly.kotlinsample.beans.main.MainCatalogItem;
import com.wonly.kotlinsample.utils.JsonUtils;
import com.wonly.kotlinsample.utils.ResourceUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HSL
 * @Time: 2020/12/8 10:09
 * @E-mail: xxx@163.com
 * @Description: 主页
 */
public class MainActivity extends AppCompatActivity {

    private MainCatalogRvAdapter mainCatalogRvAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRv();
        kotlinCatalogData();
    }

    private void initRv() {
        RecyclerView recyclerView = findViewById(R.id.catalog_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainCatalogRvAdapter = new MainCatalogRvAdapter();
        mainCatalogRvAdapter.setAnimationEnable(true);
        recyclerView.setAdapter(mainCatalogRvAdapter);
    }

    private void kotlinCatalogData() {
        String kotlin_catalog_json = ResourceUtils.readAssets2String("kotlin_catalog_json");
        List<MainCatalogItem> itemList = JsonUtils.parseArray(kotlin_catalog_json, MainCatalogItem.class);
        List<BaseNode> catalog_iList = new ArrayList<>();
        for (MainCatalogItem catalogItem : itemList) {
            Catalog_I catalog_i = new Catalog_I();
            catalog_i.setCatalogNum(catalogItem.getChapter_number());
            catalog_i.setCatalogName(catalogItem.getChapter_title());
            catalog_i.setExpanded(false);
            List<MainCatalogItem> itemList2 = catalogItem.getChapter_sub_title();
            if (itemList2 != null) { // 目录II处理
                List<BaseNode> catalog_iiList = new ArrayList<>();
                for (MainCatalogItem catalogItem2 : itemList2) {
                    Catalog_II catalog_ii = new Catalog_II();
                    catalog_ii.setCatalogNum(catalogItem2.getChapter_number());
                    catalog_ii.setCatalogName(catalogItem2.getChapter_title());
                    catalog_ii.setExpanded(false);
                    List<MainCatalogItem> itemList3 = catalogItem2.getChapter_sub_title();
                    if (itemList3 != null) { // 目录III处理
                        List<BaseNode> catalog_iiiList = new ArrayList<>();
                        for (MainCatalogItem catalogItem3 : itemList3) {
                            Catalog_III catalog_iii = new Catalog_III();
                            catalog_iii.setCatalogNum(catalogItem3.getChapter_number());
                            catalog_iii.setCatalogName(catalogItem3.getChapter_title());
                            catalog_iii.setExpanded(false);
                            catalog_iiiList.add(catalog_iii);
                        }
                        catalog_ii.setCatalogIIiList(catalog_iiiList);
                    }
                    catalog_iiList.add(catalog_ii);
                }
                catalog_i.setCatalogIiList(catalog_iiList);
            }
            catalog_iList.add(catalog_i);
        }
        mainCatalogRvAdapter.setNewInstance(catalog_iList);
    }
}