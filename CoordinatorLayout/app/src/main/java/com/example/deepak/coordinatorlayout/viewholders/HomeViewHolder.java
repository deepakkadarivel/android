package com.example.deepak.coordinatorlayout.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.deepak.coordinatorlayout.R;

/**
 * Created by deepak on 27/04/16.
 */
public class HomeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView itemName;
    public ImageView itemPhoto;

    public HomeViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        itemName = (TextView)itemView.findViewById(R.id.item_text);
        itemPhoto = (ImageView)itemView.findViewById(R.id.item_avatar);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
