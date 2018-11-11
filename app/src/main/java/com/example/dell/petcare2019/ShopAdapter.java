package com.example.dell.petcare2019;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/*public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {
    ArrayList<DataShop> dataShops;
    Context context;

    public ShopAdapter(ArrayList<DataShop> dataShops, Context context) {
        this.dataShops = dataShops;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemview=layoutInflater.inflate(R.layout.itemrow,parent,false);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtName.setText(dataShops.get(position).getTen());
        holder.imgHinh.setImageResource(dataShops.get(position).getHinhAnh());
        holder.txtcontent.setText(dataShops.get(position).getContent());

        }


    @Override
    public int getItemCount() {
        return dataShops.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtcontent;
        ImageView imgHinh;


        public ViewHolder(View itemView) {
            super(itemView);
           txtName =(TextView) itemView.findViewById(R.id.txtNameUser);
            imgHinh =(ImageView) itemView.findViewById(R.id.imgHinh);
            txtcontent = (TextView) itemView.findViewById(R.id.txtContent);
        }
    }

}
*/
public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {
    List<DataShop> dataShops;
    Context context;

    public ShopAdapter(List<DataShop> dataShops, Context context) {
        this.dataShops = dataShops;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v;
      v = LayoutInflater.from(context).inflate(R.layout.itemrow,parent,false);
      ViewHolder vHooler=new ViewHolder(v);
        return  vHooler;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtName.setText(dataShops.get(position).getTen());
        holder.imgHinh.setImageResource(dataShops.get(position).getHinhAnh());
        holder.txtcontent.setText(dataShops.get(position).getContent());

    }


    @Override
    public int getItemCount() {
        return dataShops.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtcontent;
        ImageView imgHinh;


        public ViewHolder(View itemView) {
            super(itemView);
            txtName =(TextView) itemView.findViewById(R.id.txtNameUser);
            imgHinh =(ImageView) itemView.findViewById(R.id.imgHinh);
            txtcontent = (TextView) itemView.findViewById(R.id.txtContent);
        }
    }

}