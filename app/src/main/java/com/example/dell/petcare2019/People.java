package com.example.dell.petcare2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class People extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        initView();
    }
    public void initView(){
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<DataShop> arrayList=new ArrayList<>();
        //arrayList.add(new DataShop(R.drawable.petparkone,"1","dm"));

        ShopAdapter shopAdapter=new ShopAdapter(arrayList,getApplication());
        recyclerView.setAdapter(shopAdapter);


    }
}
