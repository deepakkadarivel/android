package com.example.deepak.coordinatorlayout.adapters;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.deepak.coordinatorlayout.Model.ItemObjects;
import com.example.deepak.coordinatorlayout.R;
import com.example.deepak.coordinatorlayout.viewholders.HomeViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by deepak on 26/04/16.
 */
public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeViewHolder> {

    private List<ItemObjects> itemList;
    private Context context;

    public HomeRecyclerViewAdapter(Context context, List<ItemObjects> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        HomeViewHolder homeViewHolder = new HomeViewHolder(layoutView);
        return homeViewHolder;
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        holder.itemName.setText(itemList.get(position).getName());
//        holder.itemPhoto.setImageResource(itemList.get(position).getPhoto());

//            Glide
//                .with(context)
//                .load(itemList.get(position).getPhoto())
//                .into(holder.itemPhoto);

        Picasso.with(context)
                .load(itemList.get(position).getPhoto())
                .resize(0, 600)
                .into(holder.itemPhoto);

//        Picasso.with(context)
//                .load(itemList.get(position).getPhoto())
//                .fit()
//                .centerCrop()
//                .into(holder.itemPhoto);


    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
