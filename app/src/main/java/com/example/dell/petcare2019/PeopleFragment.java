package com.example.dell.petcare2019;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class PeopleFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
     private List<DataShop> arrayListHinhAnh;
    ShopAdapter  adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v =inflater.inflate(R.layout.frament_people,container,false);
        recyclerView = (RecyclerView)v.findViewById(R.id.recycler_view);
        adapter=new ShopAdapter(arrayListHinhAnh,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return  v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrayListHinhAnh=new ArrayList<>();
        //arrayListHinhAnh.add(new DataShop(R.drawable.petparkone,"1","2"));
        arrayListHinhAnh.add(new DataShop(R.drawable.petpark02,"Phan Văn Duẩn","Các bệnh thường gặp ở chó cách phòng chống và điều trị"));
        arrayListHinhAnh.add(new DataShop(R.drawable.petpark03, "Phan Văn Đào","Các bệnh thường gặp ở chó cách phòng chống và điều trị"));
        arrayListHinhAnh.add(new DataShop(R.drawable.petpark04, "Lê Hiếu","Các bệnh thường gặp ở chó cách phòng chống và điều trị"));
        arrayListHinhAnh.add(new DataShop(R.drawable.petpark05, "Nguyễn Cửu Thuận","Các bệnh thường gặp ở chó cách phòng chống và điều trị"));
        arrayListHinhAnh.add(new DataShop(R.drawable.petpark06, "Phan Công Nam","Các bệnh thường gặp ở chó cách phòng chống và điều trị"));
        arrayListHinhAnh.add(new DataShop(R.drawable.petpark07, "Anh Đại","Các bệnh thường gặp ở chó cách phòng chống và điều trị"));
    }


}
