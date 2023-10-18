package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {

    private ArrayList<ViewPagerItem> viewPagerItemList;

    public ViewAdapter(ArrayList<ViewPagerItem> viewPagerItemList) {
        this.viewPagerItemList = viewPagerItemList;
    }

    @NonNull
    @Override
    public ViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.viewpager_item,
                parent,
                false
        );

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter.ViewHolder holder, int position) {
        ViewPagerItem viewPagerItem = viewPagerItemList.get(position);

        holder.imgID.setImageResource(viewPagerItem.img);
        holder.opis.setText(viewPagerItem.descripiston);
    }

    @Override
    public int getItemCount() {
        return viewPagerItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgID;
        TextView opis;


       public ViewHolder(@NonNull View itemView) {
           super(itemView);

           imgID = itemView.findViewById(R.id.imageView);
           opis = itemView.findViewById(R.id.opis);
       }

   };
}
