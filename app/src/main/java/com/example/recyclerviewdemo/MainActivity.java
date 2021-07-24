package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.Animation;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<DataBean> dataBeans = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToolClass.hide(this);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter itemAdapter = new ItemAdapter(dataBeans);
        recyclerView.setAdapter(itemAdapter);

        initData();
    }

    private void initData() {
        for (int i=0;i<5;i++){
            DataBean dataBean = new DataBean(0,R.drawable.img1,"橙子味冰块","正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文"
            ,R.drawable.a,"星星","描述商品描述描述",
                    "￥231",R.drawable.star,R.drawable.img,"宇航小屋","1212","3221");
            dataBeans.add(dataBean);

        }
    }
}